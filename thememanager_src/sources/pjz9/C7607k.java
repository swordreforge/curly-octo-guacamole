package pjz9;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.core.graphics.C0541p;
import com.google.android.material.color.kja0;
import com.google.android.material.internal.C4058z;
import ij.C6095k;
import zy.lvui;
import zy.x2;

/* JADX INFO: renamed from: pjz9.k */
/* JADX INFO: compiled from: ElevationOverlayProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7607k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final float f94443f7l8 = 2.0f;

    /* JADX INFO: renamed from: g */
    private static final float f43950g = 4.5f;

    /* JADX INFO: renamed from: y */
    private static final int f43951y = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: k */
    private final boolean f43952k;

    /* JADX INFO: renamed from: n */
    private final float f43953n;

    /* JADX INFO: renamed from: q */
    private final int f43954q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f94444toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f94445zy;

    public C7607k(@lvui Context context) {
        this(com.google.android.material.resources.toq.toq(context, C6095k.zy.p6, false), kja0.toq(context, C6095k.zy.zxa9, 0), kja0.toq(context, C6095k.zy.je1q, 0), kja0.toq(context, C6095k.zy.f80274sc, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean qrj(@x2 int i2) {
        return C0541p.m2542t(i2, 255) == this.f43954q;
    }

    @x2
    public int f7l8(float f2) {
        return m27909n(this.f43954q, f2);
    }

    @x2
    /* JADX INFO: renamed from: g */
    public int m27907g(@x2 int i2, float f2, @lvui View view) {
        return m27909n(i2, f2 + m27912s(view));
    }

    /* JADX INFO: renamed from: k */
    public int m27908k(float f2) {
        return Math.round(toq(f2) * 255.0f);
    }

    @x2
    public int ld6() {
        return this.f43954q;
    }

    @x2
    /* JADX INFO: renamed from: n */
    public int m27909n(@x2 int i2, float f2) {
        return (this.f43952k && qrj(i2)) ? zy(i2, f2) : i2;
    }

    @x2
    /* JADX INFO: renamed from: p */
    public int m27910p() {
        return this.f94444toq;
    }

    @x2
    /* JADX INFO: renamed from: q */
    public int m27911q(@x2 int i2, float f2, @lvui View view) {
        return zy(i2, f2 + m27912s(view));
    }

    /* JADX INFO: renamed from: s */
    public float m27912s(@lvui View view) {
        return C4058z.m14625p(view);
    }

    public float toq(float f2) {
        if (this.f43953n <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r0)) * f43950g) + 2.0f) / 100.0f, 1.0f);
    }

    public boolean x2() {
        return this.f43952k;
    }

    @x2
    /* JADX INFO: renamed from: y */
    public int m27913y(float f2, @lvui View view) {
        return f7l8(f2 + m27912s(view));
    }

    @x2
    public int zy(@x2 int i2, float f2) {
        int i3;
        float qVar = toq(f2);
        int iAlpha = Color.alpha(i2);
        int iQrj = kja0.qrj(C0541p.m2542t(i2, 255), this.f94444toq, qVar);
        if (qVar > 0.0f && (i3 = this.f94445zy) != 0) {
            iQrj = kja0.x2(iQrj, C0541p.m2542t(i3, f43951y));
        }
        return C0541p.m2542t(iQrj, iAlpha);
    }

    public C7607k(boolean z2, @x2 int i2, @x2 int i3, @x2 int i4, float f2) {
        this.f43952k = z2;
        this.f94444toq = i2;
        this.f94445zy = i3;
        this.f43954q = i4;
        this.f43953n = f2;
    }
}
