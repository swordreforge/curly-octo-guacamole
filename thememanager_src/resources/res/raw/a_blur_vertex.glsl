#version 300 es
in vec4 aPosition;
in vec2 aTexCoord;

// lets get texcoords just for fun!
uniform mat4 uMVPMatrix;
uniform mat4 uUseMatrix;
out vec2 vTexCoord;
out mat4 vTexMatrix;

void main() {
    // copy the texcoords
    vTexCoord = aTexCoord;
    vTexMatrix = uMVPMatrix;

    // copy the position data into a vec4, using 1.0 as the w component
    vec4 positionVec4 = vec4(aPosition.xyz, 1.0);
    //    positionVec4.xy = positionVec4.xy * 2.0 - 1.0;

    // send the vertex information on to the fragment shader
    gl_Position = positionVec4 * uUseMatrix;
//        gl_Position = uMVPMatrix*positionVec4;
}
