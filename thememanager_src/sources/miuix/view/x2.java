package miuix.view;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import miuix.core.util.C7084p;
import miuix.internal.util.C7164n;
import zy.lvui;

/* JADX INFO: compiled from: MiuiBlurUiHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 implements toq {

    /* JADX INFO: renamed from: g */
    private final InterfaceC7388k f42298g;

    /* JADX INFO: renamed from: k */
    private final Context f42301k;

    /* JADX INFO: renamed from: n */
    private final boolean f42302n;

    /* JADX INFO: renamed from: q */
    private final View f42304q;

    /* JADX INFO: renamed from: y */
    private boolean f42308y = false;

    /* JADX INFO: renamed from: s */
    private boolean f42306s = false;

    /* JADX INFO: renamed from: p */
    private boolean f42303p = false;

    /* JADX INFO: renamed from: h */
    private boolean f42299h = false;

    /* JADX INFO: renamed from: i */
    private boolean f42300i = false;

    /* JADX INFO: renamed from: z */
    private int[] f42309z = null;

    /* JADX INFO: renamed from: t */
    private int[] f42307t = null;

    /* JADX INFO: renamed from: r */
    private int f42305r = 0;

    /* JADX INFO: renamed from: miuix.view.x2$k */
    /* JADX INFO: compiled from: MiuiBlurUiHelper.java */
    public interface InterfaceC7388k {
        /* JADX INFO: renamed from: k */
        void mo25107k(x2 x2Var);

        void toq(boolean z2);

        void zy(boolean z2);
    }

    public x2(@lvui Context context, @lvui View view, boolean z2, @lvui InterfaceC7388k interfaceC7388k) {
        this.f42301k = context;
        this.f42304q = view;
        this.f42302n = z2;
        this.f42298g = interfaceC7388k;
    }

    public static int[] f7l8(Context context, Drawable drawable, int[] iArr) {
        return toq(context, (drawable == null || !(drawable instanceof ColorDrawable)) ? 0 : ((ColorDrawable) drawable).getColor(), iArr);
    }

    /* JADX INFO: renamed from: k */
    private void m26786k(boolean z2) {
        float f2;
        if (!this.f42308y || !this.f42303p || this.f42300i == z2) {
            return;
        }
        this.f42300i = z2;
        int i2 = 0;
        if (!z2) {
            C7084p.zy(this.f42304q);
            C7084p.toq(this.f42304q);
            this.f42298g.zy(false);
            return;
        }
        if (this.f42309z == null) {
            this.f42298g.mo25107k(this);
        }
        this.f42298g.zy(true);
        try {
            f2 = this.f42304q.getContext().getResources().getDisplayMetrics().density;
        } catch (Exception unused) {
            f2 = 2.75f;
        }
        C7084p.m25599y(this.f42304q, (int) (this.f42305r * f2), this.f42302n);
        while (true) {
            int[] iArr = this.f42309z;
            if (i2 >= iArr.length) {
                return;
            }
            C7084p.m25594k(this.f42304q, iArr[i2], this.f42307t[i2]);
            i2++;
        }
    }

    private void qrj(boolean z2) {
        if (this.f42303p != z2) {
            if (!z2) {
                this.f42299h = zy();
                m26786k(false);
            }
            this.f42303p = z2;
            this.f42298g.toq(z2);
            if (z2 && this.f42299h) {
                m26786k(true);
            }
        }
    }

    public static int[] toq(Context context, @zy.x2 int i2, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        if (i2 == 0) {
            Drawable drawableM25952s = C7164n.m25952s(context, R.attr.windowBackground);
            if (drawableM25952s instanceof ColorDrawable) {
                i2 = ((ColorDrawable) drawableM25952s).getColor();
            }
        }
        if (i2 != 0) {
            iArr2[1] = (16777215 & i2) | ((-16777216) & iArr[1]);
        }
        return iArr2;
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: g */
    public void mo25100g(boolean z2) {
        this.f42299h = z2;
        m26786k(z2);
    }

    public void ld6() {
        this.f42309z = null;
        this.f42307t = null;
        this.f42305r = 0;
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: n */
    public boolean mo25102n() {
        return this.f42306s;
    }

    /* JADX INFO: renamed from: p */
    public void m26787p() {
        float f2;
        if (!this.f42300i) {
            return;
        }
        if (this.f42309z == null) {
            C7084p.zy(this.f42304q);
            C7084p.toq(this.f42304q);
            this.f42298g.mo25107k(this);
        }
        try {
            f2 = this.f42304q.getContext().getResources().getDisplayMetrics().density;
        } catch (Exception unused) {
            f2 = 2.75f;
        }
        this.f42298g.zy(true);
        C7084p.m25599y(this.f42304q, (int) (this.f42305r * f2), this.f42302n);
        int i2 = 0;
        while (true) {
            int[] iArr = this.f42309z;
            if (i2 >= iArr.length) {
                return;
            }
            C7084p.m25594k(this.f42304q, iArr[i2], this.f42307t[i2]);
            i2++;
        }
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: q */
    public boolean mo25103q() {
        return this.f42308y;
    }

    /* JADX INFO: renamed from: s */
    public void m26788s() {
        ld6();
        if (!C7084p.m25595n(this.f42301k)) {
            qrj(false);
        } else if (C7084p.m25593g() && C7084p.m25595n(this.f42301k) && mo25102n()) {
            qrj(true);
        }
    }

    @Override // miuix.view.toq
    public void setEnableBlur(boolean z2) {
        if (this.f42308y) {
            this.f42306s = z2;
            if (C7084p.m25595n(this.f42301k)) {
                qrj(this.f42306s);
            }
        }
    }

    @Override // miuix.view.toq
    public void setSupportBlur(boolean z2) {
        this.f42308y = z2;
    }

    public void x2(@lvui int[] iArr, @lvui int[] iArr2, int i2) {
        this.f42309z = iArr;
        this.f42307t = iArr2;
        this.f42305r = i2;
    }

    /* JADX INFO: renamed from: y */
    public View m26789y() {
        return this.f42304q;
    }

    @Override // miuix.view.toq
    public boolean zy() {
        return this.f42299h;
    }
}
