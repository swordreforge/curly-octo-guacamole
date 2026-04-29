#version 300 es
in vec4 aPosition;
in vec2 aTextureCoordinates;
out vec2 vTextureCoordinates;

uniform mat4 uMVPMatrix;

void main() {
    vTextureCoordinates = aTextureCoordinates;
    gl_Position = uMVPMatrix * aPosition;
}