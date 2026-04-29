#version 300 es
precision mediump float;

uniform vec4  uNormalScale;
uniform vec4  uScaleOffset;

uniform sampler2D uUITex;
uniform sampler2D uNormal;
uniform vec2 uScaleCenter;

// Reveal is the animation value that goes from 1 (the image is hidden) to 0 (the image is visible).
uniform float uReveal;

in vec2 vTextureCoordinates;
out vec4 fragColor;

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


void main() {

    vec2 uv = vTextureCoordinates;
    vec2 normalCoord = (uv - 0.5) / uNormalScale.xy;

    vec2 refractPos = texture(uNormal, vec2(normalCoord.x,1.0 - normalCoord.y)).xy * uNormalScale.xy + floor(normalCoord) * uNormalScale.xy;
    vec2 texCoord =  ((refractPos + 0.5) -  uScaleCenter) * uScaleOffset.xy + uScaleOffset.zw + uScaleCenter;
    vec4 rgba;
    rgba = texture(uUITex, vec2(texCoord.x,texCoord.y));
    if (texCoord.x <= 0.0 || texCoord.x >= 1.0) {rgba = vec4(0.0);}
    if (texCoord.y <= 0.0 || texCoord.y >= 1.0) {rgba = vec4(0.0);}
    rgba = transform(rgba.rgb);
    fragColor = rgba;

}