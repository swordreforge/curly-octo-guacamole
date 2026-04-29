#version 300 es
precision lowp float;

in vec4 aPosition;
in vec2 aTexCoord;

uniform vec4 rad_texelSize;

out vec2 uv;
//out vec4 uv01 ;
//out vec4 uv23;
//out vec4 uv45;
//out vec4 uv67;

out mat4x4 uvMat;


const float  offsetfrag = 1.0;
void main() {
//    uv = vec2(aTexCoord.x,1.0-aTexCoord.y);
    uv = aTexCoord;
    vec4 positionVec4 = vec4(aPosition.xyz, 1.0);
    gl_Position = positionVec4;

    vec2 _MainTex_TexelSize =  rad_texelSize.xy * 0.5;
    vec2 _Offset = vec2(1.0 + rad_texelSize.z, 1.0 + rad_texelSize.z);

    uvMat[0].xy = (uv + vec2(-_MainTex_TexelSize.x * 2.0, 0.0) * _Offset           ) ;
    uvMat[0].zw = (uv + vec2(-_MainTex_TexelSize.x, _MainTex_TexelSize.y) * _Offset) ;
    uvMat[1].xy = (uv + vec2(0.0, _MainTex_TexelSize.y * 2.0) * _Offset            ) ;
    uvMat[1].zw = (uv + _MainTex_TexelSize * _Offset                               ) ;
    uvMat[2].xy = (uv + vec2(_MainTex_TexelSize.x * 2.0, 0.0) * _Offset            ) ;
    uvMat[2].zw = (uv + vec2(_MainTex_TexelSize.x, -_MainTex_TexelSize.y) * _Offset) ;
    uvMat[3].xy = (uv + vec2(0.0, -_MainTex_TexelSize.y * 2.0) * _Offset           ) ;
    uvMat[3].zw = (uv - _MainTex_TexelSize * _Offset                               ) ;

}