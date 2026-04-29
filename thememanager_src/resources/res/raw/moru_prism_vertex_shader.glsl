#version 300 es
precision mediump float;
in vec4 aPosition;
in vec2 aTextureCoordinates;

out highp mat4x4 uvmatrix;
out vec2 now_uv;
uniform mat4 uMVPMatrix;

uniform lowp vec4 uScaleOffset;
uniform lowp vec2 uScaleCenter;
uniform lowp vec4 uNormalScaleXYThickDis;
uniform lowp vec2 uNormalOffsetXY;
uniform lowp vec4 uAspIORLightShadow;

vec4 getLocalcoord(highp vec2 U) {
    // corresponding coordinate on normal map and depth map
    highp vec4 localCoord;
    highp  vec2 st = U;
    st.y = st.y * uAspIORLightShadow.x;
    localCoord.xy = (st - 0.5) * uNormalScaleXYThickDis.xy + 0.5 + uNormalOffsetXY;
    localCoord.y += 0.5 * uAspIORLightShadow.x;

    localCoord.zw = (U - uScaleCenter) * uScaleOffset.xy + uScaleCenter;
    localCoord.zw += uScaleOffset.zw;

    return localCoord;
}

void main() {
    vec2 uv = aTextureCoordinates;
    uvmatrix[0] = getLocalcoord(uv);
    now_uv = vec2(uvmatrix[0].z, uvmatrix[0].w);

    uv = aTextureCoordinates + vec2(1.736e-4,1.736e-4);
    uvmatrix[1] = getLocalcoord(uv);

   // uv = aTextureCoordinates + vec2(2 % 4 + 1, 2 /4 + 1) / 5760.0;
    uv = aTextureCoordinates + vec2(5.20833e-4, 2.604167e-4);
    uvmatrix[2] = getLocalcoord(uv);

    gl_Position = uMVPMatrix * aPosition;
}