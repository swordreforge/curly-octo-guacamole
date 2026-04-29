package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi19.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(19)
class y9n extends lv5 {

    /* JADX INFO: renamed from: y */
    private static boolean f6804y = true;

    y9n() {
    }

    @Override // androidx.transition.lv5
    @SuppressLint({"NewApi"})
    public void f7l8(@zy.lvui View view, float f2) {
        if (f6804y) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f6804y = false;
            }
        }
        view.setAlpha(f2);
    }

    @Override // androidx.transition.lv5
    /* JADX INFO: renamed from: k */
    public void mo5378k(@zy.lvui View view) {
    }

    @Override // androidx.transition.lv5
    /* JADX INFO: renamed from: q */
    public void mo5379q(@zy.lvui View view) {
    }

    @Override // androidx.transition.lv5
    @SuppressLint({"NewApi"})
    public float zy(@zy.lvui View view) {
        if (f6804y) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6804y = false;
            }
        }
        return view.getAlpha();
    }
}
