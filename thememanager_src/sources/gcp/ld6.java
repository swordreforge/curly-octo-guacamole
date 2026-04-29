package gcp;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: SvgUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {
    /* JADX INFO: renamed from: k */
    public static Drawable m22315k(Drawable drawable, int i2) {
        return toq(drawable, i2);
    }

    private static Drawable toq(Drawable drawable, int i2) {
        Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
        androidx.core.graphics.drawable.zy.n7h(drawableMutate, i2);
        return drawableMutate;
    }
}
