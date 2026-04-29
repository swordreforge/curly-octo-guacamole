#version 300 es

precision lowp float;
uniform sampler2D uUITex;

in vec2 uv;

in  mat4x4 uvMat;
out vec4 fragColor;

void main(){

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
}