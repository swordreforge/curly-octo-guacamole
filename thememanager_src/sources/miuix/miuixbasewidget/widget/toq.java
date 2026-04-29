package miuix.miuixbasewidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import miuix.core.util.ld6;
import miuix.internal.util.n7h;

/* JADX INFO: compiled from: FabDropShadowHelper.java */
/* JADX INFO: loaded from: classes3.dex */
class toq {

    /* JADX INFO: renamed from: k */
    protected Context f40645k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected boolean[] f87843ld6;

    /* JADX INFO: renamed from: s */
    protected int f40649s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected C7196k f87844toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected float f87845zy = 0.0f;

    /* JADX INFO: renamed from: q */
    protected float f40648q = 0.0f;

    /* JADX INFO: renamed from: n */
    protected float f40646n = 0.0f;

    /* JADX INFO: renamed from: g */
    protected float f40644g = 0.0f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected RectF f87842f7l8 = new RectF();

    /* JADX INFO: renamed from: y */
    protected Paint f40650y = new Paint();

    /* JADX INFO: renamed from: p */
    protected boolean f40647p = false;

    public toq(Context context, C7196k c7196k) {
        this.f40645k = context;
        this.f87844toq = c7196k;
        Resources resources = context.getResources();
        m26109g(resources.getConfiguration(), resources.getDisplayMetrics().density, c7196k);
    }

    /* JADX INFO: renamed from: g */
    protected void m26109g(Configuration configuration, float f2, C7196k c7196k) {
        int i2 = n7h.n7h(configuration) ? c7196k.f87840toq : c7196k.f40637k;
        this.f40649s = i2;
        this.f40650y.setColor(i2);
        if (this.f40644g != f2) {
            this.f40644g = f2;
            m26112q(f2, c7196k);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m26110k(Canvas canvas, float f2) {
        canvas.drawRoundRect(this.f87842f7l8, f2, f2, this.f40650y);
    }

    /* JADX INFO: renamed from: n */
    public void m26111n(int i2, int i3, int i4, int i5) {
        this.f87842f7l8.set(0.0f, 0.0f, i4 - i2, i5 - i3);
    }

    /* JADX INFO: renamed from: q */
    protected void m26112q(float f2, C7196k c7196k) {
        this.f87845zy = ld6.zy(f2, c7196k.f40638n);
        this.f40648q = ld6.zy(f2, c7196k.f40636g);
        float fZy = ld6.zy(f2, c7196k.f40639q);
        this.f40646n = fZy;
        this.f40650y.setShadowLayer(fZy, this.f87845zy, this.f40648q, this.f40649s);
    }

    public void toq(View view, boolean z2, int i2) {
        if (this.f40647p == z2) {
            return;
        }
        this.f40647p = z2;
        if (!z2) {
            for (int i3 = 0; i3 < i2; i3++) {
                Object parent = view.getParent();
                if (parent == null) {
                    break;
                }
                ((ViewGroup) parent).setClipChildren(this.f87843ld6[i3]);
                view = (View) parent;
            }
            this.f87843ld6 = null;
            return;
        }
        this.f87843ld6 = new boolean[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            Object parent2 = view.getParent();
            if (parent2 == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent2;
            this.f87843ld6[i4] = viewGroup.getClipChildren();
            viewGroup.setClipChildren(false);
            view = (View) parent2;
        }
    }

    public void zy(Configuration configuration) {
        m26109g(configuration, (configuration.densityDpi * 1.0f) / 160.0f, this.f87844toq);
    }
}
