package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.vectordrawable.graphics.drawable.toq;
import com.google.android.material.progressindicator.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.p */
/* JADX INFO: compiled from: IndeterminateDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4083p<S extends toq> extends f7l8 {

    /* JADX INFO: renamed from: m */
    private AbstractC4086s<ObjectAnimator> f24824m;

    /* JADX INFO: renamed from: o */
    private AbstractC4088y<S> f24825o;

    C4083p(@lvui Context context, @lvui toq toqVar, @lvui AbstractC4088y<S> abstractC4088y, @lvui AbstractC4086s<ObjectAnimator> abstractC4086s) {
        super(context, toqVar);
        m14708t(abstractC4088y);
        wvg(abstractC4086s);
    }

    @lvui
    public static C4083p<n7h> fu4(@lvui Context context, @lvui n7h n7hVar) {
        return new C4083p<>(context, n7hVar, new ld6(n7hVar), n7hVar.f67744f7l8 == 0 ? new x2(n7hVar) : new qrj(context, n7hVar));
    }

    @lvui
    public static C4083p<C4082n> ni7(@lvui Context context, @lvui C4082n c4082n) {
        return new C4083p<>(context, c4082n, new zy(c4082n), new C4084q(c4082n));
    }

    @Override // com.google.android.material.progressindicator.f7l8, androidx.vectordrawable.graphics.drawable.toq
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f24825o.f7l8(canvas, m14697s());
        this.f24825o.zy(canvas, this.f24799l);
        int i2 = 0;
        while (true) {
            AbstractC4086s<ObjectAnimator> abstractC4086s = this.f24824m;
            int[] iArr = abstractC4086s.f67765zy;
            if (i2 >= iArr.length) {
                canvas.restore();
                return;
            }
            AbstractC4088y<S> abstractC4088y = this.f24825o;
            Paint paint = this.f24799l;
            float[] fArr = abstractC4086s.f67764toq;
            int i3 = i2 * 2;
            abstractC4088y.toq(canvas, paint, fArr[i3], fArr[i3 + 1], iArr[i2]);
            i2++;
        }
    }

    @Override // com.google.android.material.progressindicator.f7l8
    public /* bridge */ /* synthetic */ boolean fn3e(boolean z2, boolean z3, boolean z5) {
        return super.fn3e(z2, z3, z5);
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f24825o.mo14706q();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24825o.mo14705n();
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.f7l8
    public /* bridge */ /* synthetic */ boolean ld6() {
        return super.ld6();
    }

    @lvui
    AbstractC4088y<S> o1t() {
        return this.f24825o;
    }

    @Override // com.google.android.material.progressindicator.f7l8
    public /* bridge */ /* synthetic */ boolean qrj() {
        return super.qrj();
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@dd ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3);
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* JADX INFO: renamed from: t */
    void m14708t(@lvui AbstractC4088y<S> abstractC4088y) {
        this.f24825o = abstractC4088y;
        abstractC4088y.m14731g(this);
    }

    @Override // com.google.android.material.progressindicator.f7l8, androidx.vectordrawable.graphics.drawable.toq
    public /* bridge */ /* synthetic */ void toq(@lvui toq.AbstractC1258k abstractC1258k) {
        super.toq(abstractC1258k);
    }

    void wvg(@lvui AbstractC4086s<ObjectAnimator> abstractC4086s) {
        this.f24824m = abstractC4086s;
        abstractC4086s.m14724n(this);
    }

    @Override // com.google.android.material.progressindicator.f7l8
    public /* bridge */ /* synthetic */ boolean x2() {
        return super.x2();
    }

    @lvui
    /* JADX INFO: renamed from: z */
    AbstractC4086s<ObjectAnimator> m14709z() {
        return this.f24824m;
    }

    @Override // com.google.android.material.progressindicator.f7l8
    boolean zurt(boolean z2, boolean z3, boolean z5) {
        boolean zZurt = super.zurt(z2, z3, z5);
        if (!isRunning()) {
            this.f24824m.mo14715k();
        }
        this.f24800n.m14703k(this.f24798k.getContentResolver());
        if (z2 && z5) {
            this.f24824m.f7l8();
        }
        return zZurt;
    }

    @Override // com.google.android.material.progressindicator.f7l8, androidx.vectordrawable.graphics.drawable.toq
    public /* bridge */ /* synthetic */ boolean zy(@lvui toq.AbstractC1258k abstractC1258k) {
        return super.zy(abstractC1258k);
    }
}
