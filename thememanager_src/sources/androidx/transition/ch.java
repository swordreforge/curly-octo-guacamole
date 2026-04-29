package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi23.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(23)
class ch extends zp {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static boolean f52472qrj = true;

    ch() {
    }

    @Override // androidx.transition.lv5
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: y */
    public void mo5308y(@zy.lvui View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo5308y(view, i2);
        } else if (f52472qrj) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f52472qrj = false;
            }
        }
    }
}
