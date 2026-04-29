package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.dynamicanimation.animation.AbstractC0793q;
import androidx.dynamicanimation.animation.C0802y;
import androidx.dynamicanimation.animation.toq;
import androidx.vectordrawable.graphics.drawable.toq;
import com.google.android.material.color.kja0;
import com.google.android.material.progressindicator.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.g */
/* JADX INFO: compiled from: DeterminateDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4080g<S extends toq> extends f7l8 {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final float f67741bo = 50.0f;

    /* JADX INFO: renamed from: u */
    private static final int f24810u = 10000;

    /* JADX INFO: renamed from: v */
    private static final AbstractC0793q<C4080g> f24811v = new k("indicatorLevel");

    /* JADX INFO: renamed from: a */
    private float f24812a;

    /* JADX INFO: renamed from: b */
    private final androidx.dynamicanimation.animation.f7l8 f24813b;

    /* JADX INFO: renamed from: m */
    private final C0802y f24814m;

    /* JADX INFO: renamed from: o */
    private AbstractC4088y<S> f24815o;

    /* JADX INFO: renamed from: x */
    private boolean f24816x;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.g$k */
    /* JADX INFO: compiled from: DeterminateDrawable.java */
    class k extends AbstractC0793q<C4080g> {
        k(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void zy(C4080g c4080g, float f2) {
            c4080g.fti(f2 / 10000.0f);
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public float toq(C4080g c4080g) {
            return c4080g.mcp() * 10000.0f;
        }
    }

    C4080g(@lvui Context context, @lvui toq toqVar, @lvui AbstractC4088y<S> abstractC4088y) {
        super(context, toqVar);
        this.f24816x = false;
        a9(abstractC4088y);
        C0802y c0802y = new C0802y();
        this.f24814m = c0802y;
        c0802y.m3853n(1.0f);
        c0802y.f7l8(50.0f);
        androidx.dynamicanimation.animation.f7l8 f7l8Var = new androidx.dynamicanimation.animation.f7l8(this, f24811v);
        this.f24813b = f7l8Var;
        f7l8Var.mcp(c0802y);
        kja0(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fti(float f2) {
        this.f24812a = f2;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float mcp() {
        return this.f24812a;
    }

    @lvui
    public static C4080g<C4082n> o1t(@lvui Context context, @lvui C4082n c4082n) {
        return new C4080g<>(context, c4082n, new zy(c4082n));
    }

    @lvui
    public static C4080g<n7h> wvg(@lvui Context context, @lvui n7h n7hVar) {
        return new C4080g<>(context, n7hVar, new ld6(n7hVar));
    }

    void a9(@lvui AbstractC4088y<S> abstractC4088y) {
        this.f24815o = abstractC4088y;
        abstractC4088y.m14731g(this);
    }

    @Override // com.google.android.material.progressindicator.f7l8, androidx.vectordrawable.graphics.drawable.toq
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f24815o.f7l8(canvas, m14697s());
            this.f24815o.zy(canvas, this.f24799l);
            this.f24815o.toq(canvas, this.f24799l, 0.0f, mcp(), kja0.m14282k(this.f24802q.f67767zy[0], getAlpha()));
            canvas.restore();
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
        return this.f24815o.mo14706q();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24815o.mo14705n();
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.f7l8, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public void jk(@lvui toq.cdj cdjVar) {
        this.f24813b.ld6(cdjVar);
    }

    void jp0y(float f2) {
        setLevel((int) (f2 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f24813b.jk();
        fti(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.f7l8
    public /* bridge */ /* synthetic */ boolean ld6() {
        return super.ld6();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        if (this.f24816x) {
            this.f24813b.jk();
            fti(i2 / 10000.0f);
            return true;
        }
        this.f24813b.t8r(mcp() * 10000.0f);
        this.f24813b.m3802z(i2);
        return true;
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

    @lvui
    /* JADX INFO: renamed from: t */
    AbstractC4088y<S> m14699t() {
        return this.f24815o;
    }

    @Override // com.google.android.material.progressindicator.f7l8, androidx.vectordrawable.graphics.drawable.toq
    public /* bridge */ /* synthetic */ void toq(@lvui toq.AbstractC1258k abstractC1258k) {
        super.toq(abstractC1258k);
    }

    @Override // com.google.android.material.progressindicator.f7l8
    public /* bridge */ /* synthetic */ boolean x2() {
        return super.x2();
    }

    /* JADX INFO: renamed from: z */
    public void m14700z(@lvui toq.cdj cdjVar) {
        this.f24813b.m3817k(cdjVar);
    }

    @Override // com.google.android.material.progressindicator.f7l8
    boolean zurt(boolean z2, boolean z3, boolean z5) {
        boolean zZurt = super.zurt(z2, z3, z5);
        float fM14703k = this.f24800n.m14703k(this.f24798k.getContentResolver());
        if (fM14703k == 0.0f) {
            this.f24816x = true;
        } else {
            this.f24816x = false;
            this.f24814m.f7l8(50.0f / fM14703k);
        }
        return zZurt;
    }

    @Override // com.google.android.material.progressindicator.f7l8, androidx.vectordrawable.graphics.drawable.toq
    public /* bridge */ /* synthetic */ boolean zy(@lvui toq.AbstractC1258k abstractC1258k) {
        return super.zy(abstractC1258k);
    }
}
