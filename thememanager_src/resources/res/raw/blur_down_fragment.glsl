#version 300 es

precision lowp float;
uniform sampler2D uUITex;

in vec2 uv;
in vec4 uv01 ;
in vec4 uv23;

out vec4 fragColor;

void main(){

    fragColor +=  texture(uUITex,uv)* 4.0;
    fragColor +=  texture(uUITex,uv01.xy);
    fragColor +=  texture(uUITex,uv01.zw);
    fragColor +=  texture(uUITex,uv23.xy);
    fragColor +=  texture(uUITex,uv23.zw);
    fragColor *=0.125;
}