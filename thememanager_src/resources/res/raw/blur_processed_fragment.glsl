#version 300 es

precision lowp float;
uniform vec4 uSaturnContrast;

in vec2 uv;
out vec4 fragColor;
in  mat4x4 uvMat;
in vec2 now_uv;

// The actual wallpaper texture.
uniform sampler2D uUITex;

// Reveal is the animation value that goes from 1 (the image is hidden) to 0 (the image is visible).
uniform float uReveal;

// Darken is the flag whether wallpaper need to darken (1 is true).
uniform int uDarken;

// DarkMode is the flag whether DarkMode wallpaper enable (1 is true).
uniform int uDarkMode;

const vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);
const vec3 AvgLumin  = vec3(0.5, 0.5, 0.5);

const vec4 K0 = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);
const vec4 K1 = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);

/*
 * Calculates the relative luminance of the pixel.
 */
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

void main() {
    if (now_uv.x <= 0.0 || now_uv.x >= 1.0 || now_uv.y <= 0.0 || now_uv.y >= 1.0) {
        fragColor = vec4(vec3(0.0), 1.0);
        return;
    }
    vec4 uv01 = uvMat[0];
    vec4 uv23 = uvMat[1];;
    vec4 uv45 = uvMat[2];;
    vec4 uv67 = uvMat[3];;

    fragColor +=  texture(uUITex,uv01.xy);
    fragColor +=  texture(uUITex,uv01.zw)*2.0;
    fragColor +=  texture(uUITex,uv23.xy);
    fragColor +=  texture(uUITex,uv23.zw)*2.0;
    fragColor +=  texture(uUITex,uv45.xy);
    fragColor +=  texture(uUITex,uv45.zw)*2.0;
    fragColor +=  texture(uUITex,uv67.xy);
    fragColor +=  texture(uUITex,uv67.zw) *2.0;
    fragColor *= 0.0833;

    float lumi = dot(vec3(0.2125,0.7154,0.0721),fragColor.rgb);
    vec3  lumiColor = vec3(lumi,lumi,lumi);
    vec3 temp = mix(lumiColor,fragColor.rgb,uSaturnContrast.x);
    vec3  avgColor = vec3(0.5,0.5,0.5);
    vec3 color = mix(avgColor,temp.rgb,uSaturnContrast.y);
    vec4 rgba = transform(color.rgb);
    fragColor = rgba;
}