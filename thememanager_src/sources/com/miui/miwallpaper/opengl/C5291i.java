package com.miui.miwallpaper.opengl;

import android.opengl.GLES20;
import java.util.Objects;

/* JADX INFO: renamed from: com.miui.miwallpaper.opengl.i */
/* JADX INFO: compiled from: MoruGlassAnim.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5291i {

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.i$k */
    /* JADX INFO: compiled from: MoruGlassAnim.java */
    abstract class k {

        /* JADX INFO: renamed from: k */
        public wvg f29604k;

        /* JADX INFO: renamed from: q */
        public float f29606q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public EnumC5301t f72288toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public float f72289zy;

        k(wvg wvgVar, EnumC5301t enumC5301t, float f2, float f3) {
            this.f72288toq = enumC5301t;
            this.f29604k = wvgVar;
            this.f72289zy = f2;
            this.f29606q = f3;
        }

        /* JADX INFO: renamed from: k */
        public void m18001k() {
            GLES20.glUniform2f(this.f29604k.f72364gvn7, this.f72288toq.offsetX, 0.0f);
            int i2 = this.f29604k.f72360a9;
            float f2 = 1.0f / this.f72289zy;
            Objects.requireNonNull(this.f72288toq);
            GLES20.glUniform4f(i2, f2, 1.0f, this.f72288toq.thickness, this.f29606q);
        }

        public abstract void toq(float f2);
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.i$q */
    /* JADX INFO: compiled from: MoruGlassAnim.java */
    class q extends k {
        q(wvg wvgVar, EnumC5301t enumC5301t, float f2, float f3) {
            super(wvgVar, enumC5301t, f2, f3);
        }

        @Override // com.miui.miwallpaper.opengl.C5291i.k
        public void toq(float f2) {
            if (f2 == -1.0f) {
                m18001k();
            } else {
                GLES20.glUniform2f(this.f29604k.f72364gvn7, this.f72288toq.offsetX + ((f2 - 1.0f) * 0.6f), 0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.i$toq */
    /* JADX INFO: compiled from: MoruGlassAnim.java */
    class toq extends k {
        toq(wvg wvgVar, EnumC5301t enumC5301t, float f2, float f3) {
            super(wvgVar, enumC5301t, f2, f3);
        }

        @Override // com.miui.miwallpaper.opengl.C5291i.k
        public void toq(float f2) {
            if (f2 == -1.0f) {
                m18001k();
                return;
            }
            int i2 = this.f29604k.f72360a9;
            float f3 = 1.0f / ((this.f72289zy - 0.02f) + (f2 * 0.02f));
            Objects.requireNonNull(this.f72288toq);
            GLES20.glUniform4f(i2, f3, 1.0f, this.f72288toq.thickness, this.f29606q);
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.i$zy */
    /* JADX INFO: compiled from: MoruGlassAnim.java */
    class zy extends k {
        zy(wvg wvgVar, EnumC5301t enumC5301t, float f2, float f3) {
            super(wvgVar, enumC5301t, f2, f3);
        }

        @Override // com.miui.miwallpaper.opengl.C5291i.k
        public void toq(float f2) {
            if (f2 == -1.0f) {
                m18001k();
            } else {
                GLES20.glUniform2f(this.f29604k.f72364gvn7, this.f72288toq.offsetX + ((f2 - 1.0f) * 0.6f), 0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public k m18000k(int i2, wvg wvgVar, EnumC5301t enumC5301t, float f2, float f3) {
        if (i2 != 0 && i2 != 1) {
            if (i2 == 3) {
                return new q(wvgVar, enumC5301t, f2, f3);
            }
            if (i2 != 4) {
                return new toq(wvgVar, enumC5301t, f2, f3);
            }
        }
        return new zy(wvgVar, enumC5301t, f2, f3);
    }
}
