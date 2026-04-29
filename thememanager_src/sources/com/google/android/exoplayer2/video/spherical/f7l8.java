package com.google.android.exoplayer2.video.spherical;

import android.opengl.GLES20;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.cdj;
import com.google.android.exoplayer2.video.spherical.C3886n;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import zy.dd;

/* JADX INFO: compiled from: ProjectionRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
final class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67207f7l8;

    /* JADX INFO: renamed from: g */
    private int f23502g;

    /* JADX INFO: renamed from: k */
    private int f23503k;

    /* JADX INFO: renamed from: n */
    private int f23504n;

    /* JADX INFO: renamed from: q */
    private cdj.C3834q f23505q;

    /* JADX INFO: renamed from: s */
    private int f23506s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private C3883k f67208toq;

    /* JADX INFO: renamed from: y */
    private int f23507y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private C3883k f67209zy;

    /* JADX INFO: renamed from: p */
    private static final String[] f23501p = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String[] f67203ld6 = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final float[] f67206x2 = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final float[] f67205qrj = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final float[] f67204n7h = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final float[] f67202kja0 = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: h */
    private static final float[] f23500h = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.f7l8$k */
    /* JADX INFO: compiled from: ProjectionRenderer.java */
    private static class C3883k {

        /* JADX INFO: renamed from: k */
        private final int f23508k;

        /* JADX INFO: renamed from: q */
        private final int f23509q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final FloatBuffer f67210toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final FloatBuffer f67211zy;

        public C3883k(C3886n.zy zyVar) {
            this.f23508k = zyVar.m13850k();
            this.f67210toq = cdj.f7l8(zyVar.f67219zy);
            this.f67211zy = cdj.f7l8(zyVar.f23526q);
            int i2 = zyVar.f67218toq;
            if (i2 == 1) {
                this.f23509q = 5;
            } else if (i2 != 2) {
                this.f23509q = 4;
            } else {
                this.f23509q = 6;
            }
        }
    }

    f7l8() {
    }

    public static boolean zy(C3886n c3886n) {
        C3886n.toq toqVar = c3886n.f23521k;
        C3886n.toq toqVar2 = c3886n.f67216toq;
        return toqVar.toq() == 1 && toqVar.m13849k(0).f23525k == 0 && toqVar2.toq() == 1 && toqVar2.m13849k(0).f23525k == 0;
    }

    /* JADX INFO: renamed from: k */
    void m13839k(int i2, float[] fArr, boolean z2) {
        C3883k c3883k = z2 ? this.f67209zy : this.f67208toq;
        if (c3883k == null) {
            return;
        }
        ((cdj.C3834q) C3844k.f7l8(this.f23505q)).m13561s();
        cdj.m13546n();
        GLES20.glEnableVertexAttribArray(this.f67207f7l8);
        GLES20.glEnableVertexAttribArray(this.f23507y);
        cdj.m13546n();
        int i3 = this.f23503k;
        GLES20.glUniformMatrix3fv(this.f23502g, 1, false, i3 == 1 ? z2 ? f67204n7h : f67205qrj : i3 == 2 ? z2 ? f23500h : f67202kja0 : f67206x2, 0);
        GLES20.glUniformMatrix4fv(this.f23504n, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(this.f23506s, 0);
        cdj.m13546n();
        GLES20.glVertexAttribPointer(this.f67207f7l8, 3, 5126, false, 12, (Buffer) c3883k.f67210toq);
        cdj.m13546n();
        GLES20.glVertexAttribPointer(this.f23507y, 2, 5126, false, 8, (Buffer) c3883k.f67211zy);
        cdj.m13546n();
        GLES20.glDrawArrays(c3883k.f23509q, 0, c3883k.f23508k);
        cdj.m13546n();
        GLES20.glDisableVertexAttribArray(this.f67207f7l8);
        GLES20.glDisableVertexAttribArray(this.f23507y);
    }

    /* JADX INFO: renamed from: n */
    void m13840n() {
        cdj.C3834q c3834q = this.f23505q;
        if (c3834q != null) {
            c3834q.m13560q();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m13841q(C3886n c3886n) {
        if (zy(c3886n)) {
            this.f23503k = c3886n.f67217zy;
            C3883k c3883k = new C3883k(c3886n.f23521k.m13849k(0));
            this.f67208toq = c3883k;
            if (!c3886n.f23522q) {
                c3883k = new C3883k(c3886n.f67216toq.m13849k(0));
            }
            this.f67209zy = c3883k;
        }
    }

    void toq() {
        cdj.C3834q c3834q = new cdj.C3834q(f23501p, f67203ld6);
        this.f23505q = c3834q;
        this.f23504n = c3834q.f7l8("uMvpMatrix");
        this.f23502g = this.f23505q.f7l8("uTexMatrix");
        this.f67207f7l8 = this.f23505q.m13559n("aPosition");
        this.f23507y = this.f23505q.m13559n("aTexCoords");
        this.f23506s = this.f23505q.f7l8("uTexture");
    }
}
