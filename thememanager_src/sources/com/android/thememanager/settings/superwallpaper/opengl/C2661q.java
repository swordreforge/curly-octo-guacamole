package com.android.thememanager.settings.superwallpaper.opengl;

import android.content.Context;
import android.opengl.GLES20;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.opengl.q */
/* JADX INFO: compiled from: ShaderUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2661q {

    /* JADX INFO: renamed from: k */
    private static final String f15750k = "ShaderUtil";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int f60947toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f60948zy;

    private C2661q() {
    }

    /* JADX INFO: renamed from: k */
    public static int m9253k(String vertexSource, String fragmentSource) {
        int i2 = f60947toq;
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
        }
        int qVar = toq(35633, vertexSource);
        if (qVar == 0) {
            return 0;
        }
        f60947toq = qVar;
        int i3 = f60948zy;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
        }
        int qVar2 = toq(35632, fragmentSource);
        if (qVar2 == 0) {
            return 0;
        }
        f60948zy = qVar2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, qVar);
            GLES20.glAttachShader(iGlCreateProgram, qVar2);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.w(f15750k, "link program error");
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    public static int toq(int shaderType, String source) {
        int iGlCreateShader = GLES20.glCreateShader(shaderType);
        if (iGlCreateShader == 0) {
            return iGlCreateShader;
        }
        GLES20.glShaderSource(iGlCreateShader, source);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        Log.w(f15750k, "shader compile error");
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static String zy(Context context, int rawId) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(rawId)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return sb.toString();
        }
        bufferedReader.close();
        return sb.toString();
    }
}
