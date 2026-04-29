package com.miui.miwallpaper.opengl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import b8.C1364q;
import com.miui.miwallpaper.opengl.zy;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.miui.miwallpaper.opengl.n */
/* JADX INFO: compiled from: AnimatorProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5294n implements kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected static final float f72315f7l8 = 1.0f;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected static final Interpolator f72316ld6 = new zy.toq();

    /* JADX INFO: renamed from: p */
    protected static final int f29626p = 200;

    /* JADX INFO: renamed from: s */
    protected static final int f29627s = 800;

    /* JADX INFO: renamed from: y */
    protected static final float f29628y = 0.0f;

    /* JADX INFO: renamed from: k */
    protected volatile zy.InterfaceC5305k f29630k;

    /* JADX INFO: renamed from: n */
    private final ValueAnimator f29631n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected C5293k f72317toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f72318zy = 2;

    /* JADX INFO: renamed from: q */
    private final int f29632q = 120;

    /* JADX INFO: renamed from: g */
    private int f29629g = 2;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.n$k */
    /* JADX INFO: compiled from: AnimatorProgram.java */
    class k extends AnimatorListenerAdapter {
        k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }
    }

    public C5294n(C5293k c5293k) {
        this.f72317toq = c5293k;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f29631n = valueAnimator;
        valueAnimator.setDuration(800L);
        valueAnimator.setInterpolator(f72316ld6);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.miui.miwallpaper.opengl.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f29646k.kja0(valueAnimator2);
            }
        });
        valueAnimator.addListener(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kja0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f72317toq.f29618p = fFloatValue;
        if (C1364q.toq(this.f72317toq.f29603k) != 120) {
            zurt();
            return;
        }
        int i2 = this.f29629g;
        if (i2 % 2 != 0 && fFloatValue != 0.0f) {
            this.f29629g = i2 + 1;
        } else {
            this.f29629g = 1;
            zurt();
        }
    }

    public void a9() {
    }

    public void cdj() {
        this.f72317toq.mo18003i();
    }

    public void d3() {
        this.f72317toq.ld6();
    }

    public void f7l8() {
        this.f72317toq.kja0();
    }

    @Override // com.miui.miwallpaper.opengl.kja0
    public void finish() {
        this.f72317toq.f29618p = 0.0f;
        this.f29631n.cancel();
        this.f29630k = null;
    }

    public void fn3e() {
        Bitmap bitmap = this.f72317toq.f72298ki;
        if (bitmap != null) {
            bitmap.recycle();
            this.f72317toq.f72298ki = null;
        }
    }

    public void fti(boolean z2) {
        int i2;
        float f2;
        if (this.f29631n.isRunning()) {
            this.f29631n.cancel();
        }
        if (z2) {
            i2 = 800;
            f2 = 0.0f;
        } else {
            i2 = 200;
            f2 = 1.0f;
        }
        if (this.f72317toq.f29618p == f2) {
            zurt();
            return;
        }
        this.f29631n.setDuration(i2);
        this.f29631n.setFloatValues(this.f72317toq.f29618p, f2);
        this.f29631n.start();
    }

    public void fu4() {
    }

    /* JADX INFO: renamed from: g */
    public void m18016g() {
        this.f72317toq.n7h();
    }

    public void gvn7(boolean z2, boolean z3) {
        this.f72317toq.o1t(z2, z3);
    }

    /* JADX INFO: renamed from: h */
    public void m18017h() {
        this.f72317toq.mo17993s();
    }

    /* JADX INFO: renamed from: i */
    public void m18018i(int i2) {
        this.f72317toq.ni7(i2);
    }

    public void jk(Bitmap bitmap, gvn7 gvn7Var) {
        C5293k c5293k = this.f72317toq;
        if (!(c5293k instanceof ni7)) {
            c5293k.fu4(bitmap, gvn7Var);
        } else if (c5293k.f72303t8r) {
            c5293k.t8r(bitmap, EnumC5301t.getValueByIndex(c5293k.f29616h).blurRadius);
        } else {
            c5293k.fu4(bitmap, gvn7Var);
        }
    }

    public void jp0y(int i2, int i3, Rect rect) {
        this.f72317toq.m18005z(i2, i3, rect);
    }

    @Override // com.miui.miwallpaper.opengl.kja0
    /* JADX INFO: renamed from: k */
    public void mo18006k() {
    }

    public void ki(int i2, int i3) {
        this.f72317toq.fn3e(i2, i3);
    }

    public boolean ld6() {
        return this.f72317toq.f72303t8r;
    }

    public void mcp(float f2, float f3) {
        C5293k c5293k = this.f72317toq;
        c5293k.f72300ld6 = f2;
        c5293k.f72304x2 = f3;
    }

    public float[] n7h() {
        C5293k c5293k = this.f72317toq;
        return new float[]{c5293k.f72300ld6, c5293k.f72304x2};
    }

    public void ni7() {
        this.f29629g = 2;
    }

    public void o1t(zy.InterfaceC5305k interfaceC5305k) {
        this.f29630k = interfaceC5305k;
    }

    public void oc() {
        this.f72317toq.m18004t();
    }

    /* JADX INFO: renamed from: p */
    public int m18019p() {
        return this.f72317toq.f29616h;
    }

    @Override // com.miui.miwallpaper.opengl.kja0
    /* JADX INFO: renamed from: q */
    public void mo18007q(boolean z2, int i2) {
    }

    public float[] qrj() {
        C5293k c5293k = this.f72317toq;
        return new float[]{c5293k.f72302qrj, c5293k.f72301n7h};
    }

    /* JADX INFO: renamed from: s */
    public int mo17985s() {
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public void m18020t(float f2, float f3) {
        C5293k c5293k = this.f72317toq;
        c5293k.f72302qrj = f2;
        c5293k.f72301n7h = f3;
    }

    public void t8r(Bitmap bitmap) {
        this.f72317toq.zurt(bitmap);
    }

    @Override // com.miui.miwallpaper.opengl.kja0
    public void toq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void wvg(boolean z2) {
        this.f72317toq.f72303t8r = z2;
    }

    public float[] x2(Bitmap bitmap, int i2, int i3) {
        jp0y(i2, i3, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        return this.f72317toq.f72299kja0;
    }

    /* JADX INFO: renamed from: y */
    public void m18021y() {
        this.f72317toq.m18002h();
    }

    /* JADX INFO: renamed from: z */
    public void m18022z(boolean z2) {
        if (this.f29631n.isRunning()) {
            this.f29631n.cancel();
        }
        this.f72317toq.f29618p = z2 ? 1.0f : 0.0f;
        ni7();
        zurt();
    }

    protected void zurt() {
        if (this.f29630k != null) {
            this.f29630k.m18041k();
        }
    }

    @Override // com.miui.miwallpaper.opengl.kja0
    public void zy() {
    }
}
