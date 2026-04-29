#version 300 es
precision mediump float;

uniform sampler2D uUITex;
uniform sampler2D normalTex;
uniform sampler2D uLight;

uniform  lowp vec4 uScaleOffset;
uniform  lowp vec2 uScaleCenter;

uniform lowp vec4 uNormalScaleXYThickDis;
uniform lowp vec4 uAspIORLightShadow;
uniform lowp float uSurfaceRatio;
uniform lowp float uDisplacement;
uniform lowp vec2 uNormalOffsetXY;
uniform lowp float uDarkness;
uniform lowp float uReveal;

uniform vec4 uSaturnContrast;


in highp mat4x4 uvmatrix;
in vec2 now_uv;

out vec4 fragColor;

const vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);
const vec3 AvgLumin  = vec3(0.5, 0.5, 0.5);

const vec4 K0 = vec4(0.0, -0.333, 0.667, -1.0);
const vec4 K1 = vec4(1.0, 0.667, 0.333, 3.0);

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

vec3 doubleRefract(vec3 inLight, vec3 upperNormal, vec3 lowerNormal, float depth, float distance, float ior) {
    vec3 upperOutDir = normalize(refract(inLight, upperNormal, ior));

    // path of which the light travels after the first refraction
    vec3 upperPath = upperOutDir * depth;

    vec3 lowerOutDir = normalize(refract(upperOutDir, lowerNormal, ior));

    // path of which the light travels after the second refraction
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
    return mix(dst,blendMultiply(dst, src),opacity);
}

float blendScreen(float dst, float src) {
    return 1.0-((1.0-dst)*(1.0-src));
}

vec3 blendScreen(vec3 dst, vec3 src) {
    return vec3(blendScreen(dst.r, src.r), blendScreen(dst.g, src.g), blendScreen(dst.b, src.b));
}

vec3 blendScreen(vec3 dst, vec3 src, float opacity) {
    return mix(dst,blendScreen(dst,src),opacity);
}

vec4 drawEffect(highp vec4 U,float lod) {
    highp  vec2 texCoord = U.zw;
    // corresponding coordinate on normal map and depth map
    highp  vec2 localCoord = U.xy;

    // normal of the upper surface, normalized
    vec3 upperNormal = texture(normalTex, localCoord).xyz;
    upperNormal = normalize(2.0 * upperNormal - 1.0);

    // normal of the lowersurface, normalized
    vec3 lowerNormal = vec3(0.0, 1.0, 0.0);

    // distance between the upper surface and the lower surface
    // in blender coordinate, offset out from screen
    vec4 depthColor = texture(uLight, localCoord);
    float depth = -depthColor.r * uDisplacement - uNormalScaleXYThickDis.z;

    vec3 refractOffset = doubleRefract(vec3(0.0, 1.0, 0.0), upperNormal, lowerNormal, depth, uNormalScaleXYThickDis.w, uAspIORLightShadow.y);
    vec3 refractCoord = refractOffset * vec3(uAspIORLightShadow.x * uSurfaceRatio) * vec3(uScaleOffset.xy, 1.0) + vec3(texCoord, 0.0);
    //  vec3 refractCoord = refractOffset * uSurfaceRatio.xyz + vec3(texCoord, 0.0);
    vec4 color = textureLod(uUITex, refractCoord.xy,lod);
    return color;
}

void main() {
    if (now_uv.x <= 0.0 || now_uv.x >= 1.0 || now_uv.y <= 0.0 || now_uv.y >= 1.0) {
        fragColor = vec4(vec3(0.0), 1.0);
        return;
    }
    vec4 color =  drawEffect(uvmatrix[0],0.1);
    color += drawEffect(uvmatrix[1],0.5);
    color += drawEffect(uvmatrix[2],1.0);
    color*=0.33334;

    vec2 localCoord = uvmatrix[0].xy;
    vec4 depth_light_shadow = texture(uLight, localCoord);

    vec4 light = vec4(depth_light_shadow.ggg, uAspIORLightShadow.z);
    vec4 shadow = vec4(depth_light_shadow.bbb, uAspIORLightShadow.w);

    // 0. darken the color
    color.rgb = color.rgb * (1.0 - uDarkness);
    // 1. multiply blend shadow
    color.rgb = blendMultiply(color.rgb, shadow.bbb, shadow.b);
    // 2. screen blend light
    color.rgb = blendScreen(color.rgb, light.ggg, light.g);

    //  vec4 rgba = transform(color.rgb)

    vec4 rgba = transform(color.rgb);
    fragColor = rgba;
}