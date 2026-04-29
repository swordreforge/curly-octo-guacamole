#version 300 es

precision lowp float;
uniform sampler2D uTexture;
uniform vec4 uSaturnContrast;

in vec2 uv;
out vec4 fragColor;
in  mat4x4 uvMat;

// start for brightness
uniform int uBrightnessSwitch;
uniform float uReveal;
uniform int uDarken;
uniform int uDarkMode;

const vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);
const vec3 AvgLumin  = vec3(0.5, 0.5, 0.5);

const vec4 K0 = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);
const vec4 K1 = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);

float luminosity(vec3 color) {
    float lum = 0.2126 * color.r + 0.7152 * color.g + 0.0722 * color.b;
    return lum;
}

vec3 ContrastSaturationBrightness(vec3 color, float brt, float sat, float con){
    vec3 brtColor  = color * brt;
    vec3 intensity = vec3(dot(brtColor, LumCoeff));
    vec3 satColor  = mix(intensity, brtColor, sat);
    vec3 conColor  = mix(AvgLumin, satColor, con);

    return conColor;
}

vec4 transform(vec3 diffuse) {
    float lum = luminosity(diffuse);
    float per = 1. - uReveal;
    per = per * smoothstep(0., uReveal, lum);
    diffuse = ContrastSaturationBrightness(diffuse, per, 1., 1.);
    diffuse = mix(vec3(0.), diffuse, 1.);

    return vec4(diffuse, 1.);
}

vec3 rgb2hsv(vec3 rgb) {
    vec4 p = rgb.g < rgb.b ? vec4(rgb.b, rgb.g, K0.w, K0.z) : vec4(rgb.g, rgb.b, K0.x, K0.y);
    vec4 q = rgb.r < p.x ? vec4(p.x, p.y, p.w, rgb.r) : vec4(rgb.r, p.y, p.z, p.x);

    float d = q.x - min(q.w, q.y);
    float e = 1.0e-10;
    return vec3(abs((q.z + (q.w - q.y) / (6.0 * d + e))), d / (q.x + e), q.x);
}

vec3 hsv2rgb(vec3 hsv) {
    vec3 p = abs(fract(hsv.xxx + K1.xyz) * 6.0 - K1.www);
    return hsv.z * mix(K1.xxx, clamp(p - K1.xxx, 0.0, 1.0), hsv.y);
}

vec3 transformColor(vec3 oColor) {
    vec3 color = rgb2hsv(oColor);

    float z = color.z;// 记录原始明度
    color.z = mix(color.z, color.z * 0.9 + 0.1, z);// 根据明度不同程度的调节明度
    color.y = color.y * 0.98;// 调节饱和度

    color = hsv2rgb(color);
    color = mix(color, vec3(0.), .1 * z);// 根据明度不同程度的压黑

    return color;
}

float blendColorBurn(float base, float blend) {
    return (blend==0.0)?blend:max((1.0-((1.0-base)/blend)), 0.0);
}

vec3 blendColorBurn(vec3 base, vec3 blend) {
    return vec3(blendColorBurn(base.r, blend.r), blendColorBurn(base.g, blend.g), blendColorBurn(base.b, blend.b));
}

vec3 blendColorBurn(vec3 base, vec3 blend, float opacity) {
    return (blendColorBurn(base, blend) * opacity + base * (1.0 - opacity));
}

vec3 darkModeTransformColor(vec3 color, float darkMode_per){

    float darkPer = darkMode_per * 0.15;
    color = blendColorBurn(color, vec3(0.5), darkPer);

    color = rgb2hsv(color);
    color.y *= (1. - darkMode_per*0.05);
    color.z *= (1.-darkPer*1.7);
    color = hsv2rgb(color);

    return color;
}
// end for brightness

void main(){
    vec4 uv01 = uvMat[0];
    vec4 uv23 = uvMat[1];
    vec4 uv45 = uvMat[2];
    vec4 uv67 = uvMat[3];

    fragColor +=  texture(uTexture,uv01.xy);
    fragColor +=  texture(uTexture,uv01.zw)*2.0;
    fragColor +=  texture(uTexture,uv23.xy);
    fragColor +=  texture(uTexture,uv23.zw)*2.0;
    fragColor +=  texture(uTexture,uv45.xy);
    fragColor +=  texture(uTexture,uv45.zw)*2.0;
    fragColor +=  texture(uTexture,uv67.xy);
    fragColor +=  texture(uTexture,uv67.zw) *2.0;
    fragColor *= 0.0833;

    float lumi = dot(vec3(0.2125,0.7154,0.0721),fragColor.rgb);
    vec3  lumiColor = vec3(lumi,lumi,lumi);
    fragColor.rgb = mix(lumiColor,fragColor.rgb,uSaturnContrast.x);
//    fragColor .rgb = mix(lumiColor,fragColor.rgb,2.2f);
    vec3  avgColor = vec3(0.5,0.5,0.5);
    fragColor.rgb =  mix(avgColor,fragColor.rgb,uSaturnContrast.y);
//    fragColor.rgb =  mix(avgColor,fragColor.rgb,1.0f);

    // start do brightness
    if(uBrightnessSwitch == 1){
        vec4 rgba = transform(fragColor.rgb);
        vec3 darkenColor = transformColor(rgba.rgb);
        if (uDarkMode == 1) {
            if (uDarken == 1) {
                fragColor = vec4(darkModeTransformColor(darkenColor, 1.), rgba.a);//待实现动画过度，这里先写死
            } else {
                fragColor = vec4(darkModeTransformColor(rgba.rgb, 1.), rgba.a);
            }
        } else {
            if (uDarken == 1) {
                fragColor = vec4(darkenColor, rgba.a);
            } else {
                fragColor = rgba;
            }
        }
    } // end for brightness
}