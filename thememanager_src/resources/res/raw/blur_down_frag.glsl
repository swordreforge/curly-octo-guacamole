#version 300 es
#extension GL_OES_EGL_image_external_essl3: require

precision lowp float;

uniform samplerExternalOES uTexture;
uniform sampler2D uSimpleTexture;
uniform int uUseExtTexture;
uniform int uDisableShader;

in vec2 uv;
in vec4 uv01 ;
in vec4 uv23;
in mat4 vTexMatrix;

out vec4 fragColor;

void main(){
    if(uDisableShader == 1)
    {
        fragColor = texture(uTexture,(vTexMatrix * vec4(uv.xy,0,1)).xy);
        return;
    }
    if (uUseExtTexture == 1) {
//        fragColor +=  texture(uTexture, uv)* 4.0;
//        fragColor +=  texture(uTexture, uv01.xy);
//        fragColor +=  texture(uTexture, uv01.zw);
//        fragColor +=  texture(uTexture, uv23.xy);
//        fragColor +=  texture(uTexture, uv23.zw);
//        fragColor *=0.125;
        fragColor +=  texture(uTexture, (vTexMatrix * vec4(uv.xy, 0, 1)).xy)* 4.0;
        fragColor +=  texture(uTexture, (vTexMatrix * vec4(uv01.xy, 0, 1)).xy);
        fragColor +=  texture(uTexture, (vTexMatrix * vec4(uv01.zw, 0, 1)).xy);
        fragColor +=  texture(uTexture, (vTexMatrix * vec4(uv23.xy, 0, 1)).xy);
        fragColor +=  texture(uTexture, (vTexMatrix * vec4(uv23.zw, 0, 1)).xy);
        fragColor *=0.125;
//        vec2 uv = vec2(uv.x,1.0 - uv.y);
//        fragColor = texture(uTexture, uv);
    } else {
        fragColor +=  texture(uSimpleTexture, uv)* 4.0;
        fragColor +=  texture(uSimpleTexture, uv01.xy);
        fragColor +=  texture(uSimpleTexture, uv01.zw);
        fragColor +=  texture(uSimpleTexture, uv23.xy);
        fragColor +=  texture(uSimpleTexture, uv23.zw);
        fragColor *=0.125;
//        fragColor = texture(uSimpleTexture, uv);
    }
}