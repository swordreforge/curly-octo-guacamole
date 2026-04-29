#version 300 es
precision lowp float;

in vec4 aPosition;
in vec2 aTexCoord;
uniform vec4 rad_texelSize;
uniform mat4 uMVPMatrix;
uniform mat4 uUseMatrix;

out vec2 uv;
out vec4 uv01 ;
out vec4 uv23;
out mat4 vTexMatrix;

const float  offsetfrag = 1.0;
void main() {
    uv = aTexCoord;
    vTexMatrix = uMVPMatrix;

    vec4 positionVec4 = vec4(aPosition.xyz, 1.0);
    gl_Position = positionVec4 * uUseMatrix;
    float _Offset = rad_texelSize.z;
    vec2 TexelSize =  rad_texelSize.xy * 0.5;

    uv01.xy =  (uv - TexelSize * vec2(1.0 + _Offset, 1.0 + _Offset)); //top right
    uv01.zw =  (uv + TexelSize * vec2(1.0 + _Offset, 1.0 + _Offset)); //bottom left
    uv23.xy =  (uv - vec2(TexelSize.x, -TexelSize.y) * vec2(1.0 + _Offset, 1.0 + _Offset)); //top left
    uv23.zw =  (uv + vec2(TexelSize.x, -TexelSize.y) * vec2(1.0 + _Offset, 1.0 + _Offset)); //bottom right
}