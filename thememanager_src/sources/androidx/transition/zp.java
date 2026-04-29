package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi22.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(22)
class zp extends a98o {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static boolean f53542x2 = true;

    zp() {
    }

    @Override // androidx.transition.lv5
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public void mo5377g(@zy.lvui View view, int i2, int i3, int i4, int i5) {
        if (f53542x2) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f53542x2 = false;
            }
        }
    }
}
