package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.k */
/* JADX INFO: compiled from: ActionBarPolicy.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0116k {

    /* JADX INFO: renamed from: k */
    private Context f418k;

    private C0116k(Context context) {
        this.f418k = context;
    }

    public static C0116k toq(Context context) {
        return new C0116k(context);
    }

    public boolean f7l8() {
        return this.f418k.getResources().getBoolean(C7397k.zy.f42531k);
    }

    /* JADX INFO: renamed from: g */
    public int m302g() {
        TypedArray typedArrayObtainStyledAttributes = this.f418k.obtainStyledAttributes(null, C7397k.qrj.f42457k, C7397k.toq.f42483g, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C7397k.qrj.f42464r, 0);
        Resources resources = this.f418k.getResources();
        if (!f7l8()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C7397k.n.f42401p));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: k */
    public boolean m303k() {
        return this.f418k.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: n */
    public int m304n() {
        return this.f418k.getResources().getDimensionPixelSize(C7397k.n.f92485ld6);
    }

    /* JADX INFO: renamed from: q */
    public int m305q() {
        Configuration configuration = this.f418k.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: y */
    public boolean m306y() {
        return true;
    }

    public int zy() {
        return this.f418k.getResources().getDisplayMetrics().widthPixels / 2;
    }
}
