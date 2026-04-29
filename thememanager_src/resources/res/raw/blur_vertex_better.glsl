#version 300 es
in vec4 aPosition;
in vec2 aTexCoord;

uniform mat4 uMVPMatrix;
uniform vec4 offsets;

// lets get texcoords just for fun!
out vec2 uv;
out mat4 vTexMatrix;
//out vec4 uv01 ;
//out vec4 uv23;
//out vec4 uv45;

const float  offsetfrag = 1.2;
void main() {
    // copy the texcoords
    uv = aTexCoord;
    vTexMatrix = uMVPMatrix;
    // copy the position data into a vec4, using 1.0 as the w component
    gl_Position = vec4(aPosition.xyz, 1.0);

    // send the vertex information on to the fragment shader
    //gl_Position = uMVPMatrix*positionVec4;
//    uv01 =  uv.xyxy + offsets.xyxy * vec4(offsetfrag,offsetfrag, -offsetfrag,-offsetfrag);
//    uv23 =  uv.xyxy + offsets.xyxy * vec4(offsetfrag,offsetfrag, -offsetfrag,-offsetfrag) * 2.0;
//    uv45 =  uv.xyxy + offsets.xyxy * vec4(offsetfrag,offsetfrag, -offsetfrag,-offsetfrag) * 3.0;

}