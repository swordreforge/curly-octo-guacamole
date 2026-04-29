#version 300 es
#extension GL_OES_EGL_image_external_essl3: require
precision mediump float;

uniform samplerExternalOES uTexture;
uniform sampler2D normalTex;
uniform sampler2D uLight;

uniform vec4 uScaleOffset;
uniform vec2 uScaleCenter;

uniform vec4 uNormalScaleXYThickDis;

uniform vec4 uAspIORLightShadow;

uniform float uDisplacement;
uniform vec2 uNormalOffsetXY;

uniform float uDarkness;
uniform float uReveal;

uniform int uDarken;
uniform int uDarkMode;

uniform int uDisableShader;

uniform int uBrightnessSwitch;
in  highp vec2 vTexCoord;
in mat4 vTexMatrix;
out vec4 fragColor;

const vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);
const vec3 AvgLumin  = vec3(0.5, 0.5, 0.5);

const vec4 K0 = vec4(0.0, -0.333, 0.667, -1.0);
const vec4 K1 = vec4(1.0, 0.667,  0.333, 3.0);

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

// darkMode_per : darkMode=1. lightMode=0.  (0～1可实现动画过渡)
vec3 darkModeTransformColor(vec3 color, float darkMode_per){

    float darkPer = darkMode_per * 0.15;
    color = blendColorBurn(color, vec3(0.5), darkPer);

    color = rgb2hsv(color);
    color.y *= (1. - darkMode_per*0.05);
    color.z *= (1.-darkPer*1.7);
    color = hsv2rgb(color);

    return color;
}

vec3 doubleRefract(  vec3 inLight,  vec3 upperNormal, vec3 lowerNormal,  float depth,  float distance, float ior) {
    vec3 upperOutDir = normalize(refract(inLight, upperNormal, ior));

    // path of which the light travels after the first refraction
    vec3 upperPath = upperOutDir * depth;

    vec3 lowerOutDir = normalize(refract(upperOutDir, lowerNormal, ior));

    //path of which the light travels after the second refraction
    vec3 lowerPath = lowerOutDir * distance;

    vec3 path = upperPath + lowerPath;

    // TODO: rush to deliver. keep x only for now
    // for now keep only the x component
    return vec3(path.x, 0.0, 0.0);
}

float map(float value, float min1, float max1, float min2, float max2) {
    return min2 + (value - min1) * (max2 - min2) / (max1 - min1);
}

vec3 blendMultiply(vec3 dst, vec3 src) {
    return dst*src;
}

vec3 blendMultiply(vec3 dst, vec3 src, float opacity) {
    return (blendMultiply(dst, src) * opacity + dst * (1.0 - opacity));
}

float blendScreen(float dst, float src) {
    return 1.0-((1.0-dst)*(1.0-src));
}

vec3 blendScreen(vec3 dst, vec3 src) {
    return vec3(blendScreen(dst.r,src.r),blendScreen(dst.g,src.g),blendScreen(dst.b,src.b));
}

vec3 blendScreen(vec3 dst, vec3 src, float opacity) {
    return (blendScreen(dst, src) * opacity + dst * (1.0 - opacity));
}

vec2 getLocalcoord( highp vec2 U) {

    // corresponding coordinate on normal map and depth map
    highp vec2 st = U;
    st.y = st.y * uAspIORLightShadow.x;
    vec2 localCoord = (st - 0.5) / uNormalScaleXYThickDis.xy + 0.5 + uNormalOffsetXY;
    // vec2 localCoord = (st - 0.5) / uNormalScaleXYThickDis.xy + 0.5;
    localCoord.y += 0.5 * uAspIORLightShadow.x;

    return localCoord;
}


vec4 drawEffect(highp vec2 U) {

    vec2 texCoord = (U - uScaleCenter) * uScaleOffset.xy + uScaleCenter;
    texCoord += uScaleOffset.zw;

    // corresponding coordinate on normal map and depth map
    vec2 localCoord = getLocalcoord(U);

    // normal of the upper surface, normalized
    vec3 upperNormal = textureLod(normalTex, localCoord,-99.0).xyz;
    upperNormal = normalize(2.0 * upperNormal - 1.0);

    // normal of the lowersurface, normalized
    vec3 lowerNormal = vec3(0.0, 1.0, 0.0);

    // distance between the upper surface and the lower surface
    // in blender coordinate, offset out from screen
    vec4 depthColor = textureLod(uLight, localCoord,-99.0);
    float depth = -depthColor.r * uDisplacement - uNormalScaleXYThickDis.z;

    vec3 refractOffset = doubleRefract(vec3(0.0, 1.0, 0.0), upperNormal, lowerNormal, depth, uNormalScaleXYThickDis.w, uAspIORLightShadow.y);
    vec3 refractCoord = refractOffset * vec3(uScaleOffset.xy, 1.0) + vec3(texCoord, 0.0);
    refractCoord = clamp(refractCoord,0.0,1.0);
    vec4 color = texture(uTexture, (vTexMatrix * vec4(refractCoord.xy, 0, 1)).xy, -99.0);
    return color;
}

void main() {
    if(uDisableShader == 1)
    {
        fragColor = texture(uTexture,(vTexMatrix * vec4(vTexCoord.xy,0,1)).xy);
        return;
    }
    highp vec2  uv = vTexCoord;

    vec4 color = drawEffect( uv );
    color += drawEffect(uv + vec2( -1.736e-4, -1.736e-4));
    color += drawEffect(uv + vec2( 1.736e-4, 1.736e-4));
    color*=0.333;


    vec2 localCoord = getLocalcoord( uv );
    vec4 depth_light_shadow = texture(uLight, localCoord);

    vec4 light = vec4(depth_light_shadow.ggg, uAspIORLightShadow.z);
    vec4 shadow = vec4(depth_light_shadow.bbb, uAspIORLightShadow.w);

    // 0. darken the color
    color.rgb = color.rgb * (1.0 - uDarkness);
    // 1. multiply blend shadow
    color.rgb = blendMultiply(color.rgb, shadow.bbb, shadow.b);
    // 2. screen blend light
    color.rgb = blendScreen(color.rgb, light.ggg, light.g);

    fragColor = color;
    if(uBrightnessSwitch == 1) {
        //  vec4 rgba = transform(color.rgb);
        vec4 rgba = transform(color.rgb);
        vec3 darkenColor = transformColor(rgba.rgb);
        // vec3 darkenColor = color.rgb;

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
    }
}
