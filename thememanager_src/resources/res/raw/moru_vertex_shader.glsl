#version 300 es
precision mediump float;
in vec4 aPosition;
in vec2 aTextureCoordinates;

out mat4x4 uvmatrix;
out vec2 now_uv;
uniform mat4 uMVPMatrix;

uniform vec4 uScaleOffset;
uniform vec2 uScaleCenter;
uniform vec4 uNormalScaleXYThickDis;
uniform vec2 uNormalOffsetXY;
uniform vec4 uAspIORLightShadow;


vec4 getLocalcoord(vec2 U) {
    // corresponding coordinate on normal map and depth map
    vec4 localCoord;
    vec2 st = U;
    st.y = st.y * uAspIORLightShadow.x;
    localCoord.xy = (st - 0.5) * uNormalScaleXYThickDis.xy + 0.5 + uNormalOffsetXY;
    localCoord.y += 0.5 * uAspIORLightShadow.x;

    localCoord.zw = (U - uScaleCenter) * uScaleOffset.xy + uScaleCenter;
    localCoord.zw += uScaleOffset.zw;

    return localCoord;
}
const float factor =1.736e-4;

void main() {

    vec2 uv = aTextureCoordinates;
    uvmatrix[0] = getLocalcoord(uv);
    now_uv = vec2(uvmatrix[0].z, uvmatrix[0].w);

    uv = aTextureCoordinates - vec2( factor, factor);
    uvmatrix[1] = getLocalcoord(uv);

    uv = aTextureCoordinates + vec2( factor, factor);
    uvmatrix[2] = getLocalcoord(uv);

    gl_Position = uMVPMatrix * aPosition;
}