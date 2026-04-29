package miuix.appcompat.internal.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import gb.toq;
import miuix.internal.util.C7164n;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.k */
/* JADX INFO: compiled from: ActionBarPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7010k {

    /* JADX INFO: renamed from: k */
    private Context f39362k;

    private C7010k(Context context) {
        this.f39362k = context;
    }

    public static C7010k toq(Context context) {
        return new C7010k(context);
    }

    public boolean f7l8() {
        return C7164n.m25951q(this.f39362k, toq.C6055q.f34920h, false);
    }

    /* JADX INFO: renamed from: g */
    public int m25256g() {
        Context context = this.f39362k;
        int[] iArr = toq.ki.f34844k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.actionBarTabBarStyle, 0);
        int i2 = toq.ki.f76080f7l8;
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(i2, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (layoutDimension > 0) {
            return layoutDimension;
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f39362k.obtainStyledAttributes(null, iArr, R.attr.actionBarStyle, 0);
        int layoutDimension2 = typedArrayObtainStyledAttributes2.getLayoutDimension(i2, 0);
        typedArrayObtainStyledAttributes2.recycle();
        return layoutDimension2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m25257k() {
        return this.f39362k.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: n */
    public int m25258n() {
        return this.f39362k.getResources().getDimensionPixelSize(toq.f7l8.f75374b3e);
    }

    /* JADX INFO: renamed from: p */
    public boolean m25259p() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public int m25260q() {
        return this.f39362k.getResources().getInteger(toq.ld6.f76255zy);
    }

    /* JADX INFO: renamed from: s */
    public boolean m25261s() {
        return C7164n.m25951q(this.f39362k, toq.C6055q.f76589nmn5, false);
    }

    /* JADX INFO: renamed from: y */
    public boolean m25262y() {
        return C7164n.m25951q(this.f39362k, toq.C6055q.f34936x, false);
    }

    public int zy() {
        return this.f39362k.getResources().getDisplayMetrics().widthPixels / 2;
    }
}
