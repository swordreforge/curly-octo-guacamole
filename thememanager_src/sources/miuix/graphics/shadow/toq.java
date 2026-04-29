package miuix.graphics.shadow;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import miuix.core.util.ld6;

/* JADX INFO: compiled from: DropShadowHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq {

    /* JADX INFO: renamed from: k */
    protected Context f40141k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected boolean[] f87682ld6;

    /* JADX INFO: renamed from: s */
    protected int f40145s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected C7113k f87683toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected float f87684zy = 0.0f;

    /* JADX INFO: renamed from: q */
    protected float f40144q = 0.0f;

    /* JADX INFO: renamed from: n */
    protected float f40142n = 0.0f;

    /* JADX INFO: renamed from: g */
    protected float f40140g = 0.0f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected RectF f87681f7l8 = new RectF();

    /* JADX INFO: renamed from: y */
    protected Paint f40146y = new Paint();

    /* JADX INFO: renamed from: p */
    protected boolean f40143p = false;

    public toq(Context context, C7113k c7113k, boolean z2) {
        this.f40141k = context;
        this.f87683toq = c7113k;
        f7l8(z2, context.getResources().getDisplayMetrics().density, c7113k);
    }

    protected void f7l8(boolean z2, float f2, C7113k c7113k) {
        int i2 = z2 ? this.f87683toq.f40136k : this.f87683toq.f87678toq;
        this.f40145s = i2;
        this.f40146y.setColor(i2);
        if (this.f40140g != f2) {
            this.f40140g = f2;
            mo25761n(f2, c7113k);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo25760g(int i2, int i3, int i4, int i5) {
        this.f87681f7l8.set(0.0f, 0.0f, i4 - i2, i5 - i3);
    }

    /* JADX INFO: renamed from: k */
    public void m25762k(Canvas canvas, float f2) {
        canvas.drawRoundRect(this.f87681f7l8, f2, f2, this.f40146y);
    }

    /* JADX INFO: renamed from: n */
    protected void mo25761n(float f2, C7113k c7113k) {
        this.f87684zy = ld6.zy(f2, c7113k.f40137n);
        this.f40144q = ld6.zy(f2, c7113k.f40135g);
        this.f40142n = ld6.zy(f2, c7113k.f40138q);
    }

    /* JADX INFO: renamed from: q */
    public void m25763q(Configuration configuration, boolean z2) {
        f7l8(z2, (configuration.densityDpi * 1.0f) / 160.0f, this.f87683toq);
    }

    public void toq(View view, boolean z2, int i2) {
        if (this.f40143p == z2) {
            return;
        }
        this.f40143p = z2;
        if (!z2) {
            for (int i3 = 0; i3 < i2; i3++) {
                Object parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                ((ViewGroup) parent).setClipChildren(this.f87682ld6[i3]);
                view = (View) parent;
            }
            this.f87682ld6 = null;
            return;
        }
        this.f87682ld6 = new boolean[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            Object parent2 = view.getParent();
            if (!(parent2 instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent2;
            this.f87682ld6[i4] = viewGroup.getClipChildren();
            viewGroup.setClipChildren(false);
            view = (View) parent2;
        }
    }

    public RectF zy() {
        return this.f87681f7l8;
    }
}
