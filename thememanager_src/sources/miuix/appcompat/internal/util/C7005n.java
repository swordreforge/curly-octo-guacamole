package miuix.appcompat.internal.util;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import mj.C7391k;

/* JADX INFO: renamed from: miuix.appcompat.internal.util.n */
/* JADX INFO: compiled from: DrawableUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7005n {
    private C7005n() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25240k(Drawable drawable) {
        return (drawable instanceof C7391k) || ((drawable instanceof ColorDrawable) && ((ColorDrawable) drawable).getColor() == 0);
    }
}
