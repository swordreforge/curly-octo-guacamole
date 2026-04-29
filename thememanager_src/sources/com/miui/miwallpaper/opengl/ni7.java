package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import b8.C1364q;
import com.miui.miwallpaper.opengl.C5291i;
import ew.toq;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import miui.os.Build;

/* JADX INFO: compiled from: MoruGlassAnimGLProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class ni7 extends x2 {

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int[] f72319fu4;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private float f72320jk;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private C5291i.k f72321mcp;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private EnumC5301t f72322ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private float f72323o1t;

    /* JADX INFO: renamed from: t */
    private gvn7 f29640t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private boolean f72324wvg;

    /* JADX INFO: renamed from: z */
    private float f29641z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private wvg f72325zurt;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.ni7$k */
    /* JADX INFO: compiled from: MoruGlassAnimGLProgram.java */
    public enum EnumC5296k {
        PINSTRIPE(0.1f),
        THICK_STRIPE(0.2f),
        PRISM(0.0f),
        THIN_LINE(0.2f),
        CORRUGATION(0.1f);

        final float mDistance;

        EnumC5296k(float f2) {
            this.mDistance = f2;
        }

        static EnumC5296k getBlurDistanceById(int i2) {
            return i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? PRISM : CORRUGATION : THIN_LINE : THICK_STRIPE : PINSTRIPE;
        }
    }

    public ni7(Context context) {
        super(context);
        this.f72324wvg = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d2ok(int i2) {
        return i2 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lvui(int i2) {
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
    }

    private float oc() {
        return !this.f72303t8r ? this.f72322ni7.distance : EnumC5296k.getBlurDistanceById(this.f29616h).mDistance;
    }

    public void d3(int i2, int i3) {
        if (this.f29615g) {
            if (!b8.toq.toq(this.f29603k)) {
                this.f29641z = this.f72322ni7.uNormalScaleX / this.f72299kja0[0];
            } else if (b8.toq.m5785q(this.f29603k)) {
                this.f29641z = (this.f72322ni7.uNormalScaleX / (((this.f72296cdj.width() * 1.0f) / this.f72296cdj.height()) * 2.0f)) / this.f72299kja0[0];
            } else {
                this.f29641z = (this.f72322ni7.uNormalScaleX / 2.0f) / this.f72299kja0[0];
            }
        } else if (Build.IS_TABLET) {
            float height = ((((float) this.f72298ki.getWidth()) * 1.0f) / ((float) this.f72298ki.getHeight()) >= 1.0f || b8.toq.m5785q(this.f29603k)) ? 1.0f : (this.f72298ki.getHeight() * 1.0f) / this.f72298ki.getWidth();
            if (i2 < i3) {
                i2 = i3;
            }
            this.f29641z = (this.f72322ni7.uNormalScaleX / ((i2 * 1.0f) / 1080.0f)) * 0.85f * height;
        } else {
            this.f29641z = this.f72322ni7.uNormalScaleX / this.f72299kja0[0];
        }
        C5291i.k kVar = this.f72321mcp;
        if (kVar != null) {
            kVar.f72289zy = this.f29641z;
        }
    }

    public float eqxt(float f2, float f3, float f4) {
        if (f2 != 0.0f) {
            GLES20.glUniform2f(this.f72325zurt.f72353zurt, 0.0f, 0.0f);
            return f2;
        }
        if (f4 != -1.0f) {
            GLES20.glUniform2f(this.f72325zurt.f72353zurt, 0.5f, 0.5f);
            f3 = (f3 + 0.05f) - (f4 * 0.05f);
        } else {
            GLES20.glUniform2f(this.f72325zurt.f72353zurt, 0.5f, 0.5f);
        }
        return 1.0f / f3;
    }

    @Override // com.miui.miwallpaper.opengl.C5290h
    protected int f7l8() {
        return this.f29616h == EnumC5301t.PRISM.index ? toq.n7h.f74641qrj : toq.n7h.f74640n7h;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public void fn3e(int i2, int i3) {
        super.fn3e(i2, i3);
        d3(i2, i3);
        float f2 = i2;
        float f3 = i3;
        this.f72323o1t = Math.min((f2 * 1.0f) / f3, (f3 * 1.0f) / f2);
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    /* JADX INFO: renamed from: i */
    public void mo18003i() {
        super.mo18003i();
        Rect rectM5783q = C1364q.m5783q(this.f29603k);
        this.f72296cdj = rectM5783q;
        m18005z(rectM5783q.width(), this.f72296cdj.height(), new Rect(0, 0, this.f72298ki.getWidth(), this.f72298ki.getHeight()));
        d3(this.f72296cdj.width(), this.f72296cdj.height());
    }

    @Override // com.miui.miwallpaper.opengl.x2
    protected Bitmap jk(boolean z2) {
        return this.f72298ki;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public toq ki() {
        wvg wvgVar = new wvg(this);
        this.f72325zurt = wvgVar;
        return wvgVar;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    protected void kja0() {
        super.kja0();
        Arrays.stream((int[]) Optional.ofNullable(this.f72319fu4).orElse(new int[0])).filter(new IntPredicate() { // from class: com.miui.miwallpaper.opengl.fn3e
            @Override // java.util.function.IntPredicate
            public final boolean test(int i2) {
                return ni7.d2ok(i2);
            }
        }).forEach(new IntConsumer() { // from class: com.miui.miwallpaper.opengl.zurt
            @Override // java.util.function.IntConsumer
            public final void accept(int i2) {
                ni7.lvui(i2);
            }
        });
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public void ni7(int i2) {
        super.ni7(i2);
        Rect rectM5783q = C1364q.m5783q(this.f29603k);
        this.f72296cdj = rectM5783q;
        m18005z(rectM5783q.width(), this.f72296cdj.height(), new Rect(0, 0, this.f72298ki.getWidth(), this.f72298ki.getHeight()));
        d3(this.f72296cdj.width(), this.f72296cdj.height());
    }

    @Override // com.miui.miwallpaper.opengl.x2, com.miui.miwallpaper.opengl.C5293k, com.miui.miwallpaper.opengl.C5290h
    /* JADX INFO: renamed from: s */
    public void mo17993s() {
        super.mo17993s();
        GLES20.glUniform1f(this.f72325zurt.f72365jk, this.f72322ni7.displacement);
        GLES20.glUniform4f(this.f72325zurt.f72350fn3e, eqxt(this.f72302qrj, this.f72322ni7.scaleX, this.f29665i), eqxt(this.f72301n7h, this.f72322ni7.scaleY, this.f29665i), this.f72300ld6, this.f72304x2);
        int i2 = this.f72325zurt.f72360a9;
        float f2 = 1.0f / this.f29641z;
        Objects.requireNonNull(this.f72322ni7);
        GLES20.glUniform4f(i2, f2, 1.0f, this.f72322ni7.thickness, this.f72320jk);
        GLES20.glUniform1f(this.f72325zurt.f72368oc, this.f72323o1t);
        int i3 = this.f72325zurt.f72363fti;
        EnumC5301t enumC5301t = this.f72322ni7;
        GLES20.glUniform4f(i3, enumC5301t.ASP, enumC5301t.IOR, enumC5301t.lightness, enumC5301t.shadowness);
        GLES20.glUniform1f(this.f72325zurt.f72361d3, this.f72322ni7.darkness);
        this.f72321mcp.toq(this.f29665i);
        GLES20.glUniform4f(this.f72325zurt.f72362eqxt, 1.1f, 1.1f, 0.0f, 0.0f);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f72319fu4[0]);
        GLES20.glUniform1i(this.f72325zurt.f72366jp0y, 1);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.f72319fu4[1]);
        GLES20.glUniform1i(this.f72325zurt.f72367mcp, 2);
    }

    @Override // com.miui.miwallpaper.opengl.C5290h
    protected int toq() {
        return this.f29616h == EnumC5301t.PRISM.index ? this.f72303t8r ? toq.n7h.f74639ld6 : toq.n7h.f74643x2 : this.f72303t8r ? toq.n7h.f34561s : toq.n7h.f34559p;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public void zurt(Bitmap bitmap) {
        GLES20.glEnable(32925);
        super.zurt(bitmap);
        this.f29640t = new gvn7(this.f29616h, false);
        Rect rectM5783q = C1364q.m5783q(this.f29603k);
        this.f72323o1t = Math.min((rectM5783q.width() * 1.0f) / rectM5783q.height(), (rectM5783q.height() * 1.0f) / rectM5783q.width());
        m18005z(this.f72296cdj.width(), this.f72296cdj.height(), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        this.f72298ki = bitmap;
        this.f72319fu4 = new int[2];
        EnumC5301t valueByIndex = EnumC5301t.getValueByIndex(this.f29616h);
        this.f72322ni7 = valueByIndex;
        this.f72319fu4[0] = a9(this.f29603k, valueByIndex.normalTex, this.f29640t);
        this.f72319fu4[1] = a9(this.f29603k, this.f72322ni7.depthLightShadowTex, this.f29640t);
        this.f72322ni7.ASP = (bitmap.getHeight() * 1.0f) / bitmap.getWidth();
        this.f72320jk = oc();
        this.f72321mcp = new C5291i().m18000k(this.f29616h, this.f72325zurt, this.f72322ni7, this.f29641z, this.f72320jk);
        if (this.f72324wvg) {
            this.f72324wvg = false;
            d3(this.f72296cdj.width(), this.f72296cdj.height());
        }
    }
}
