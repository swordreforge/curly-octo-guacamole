package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi21.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(21)
class a98o extends y9n {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static boolean f52471ld6 = true;

    /* JADX INFO: renamed from: p */
    private static boolean f6371p = true;

    /* JADX INFO: renamed from: s */
    private static boolean f6372s = true;

    a98o() {
    }

    @Override // androidx.transition.lv5
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: n */
    public void mo5300n(@zy.lvui View view, @zy.dd Matrix matrix) {
        if (f6372s) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f6372s = false;
            }
        }
    }

    @Override // androidx.transition.lv5
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: p */
    public void mo5301p(@zy.lvui View view, @zy.lvui Matrix matrix) {
        if (f52471ld6) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f52471ld6 = false;
            }
        }
    }

    @Override // androidx.transition.lv5
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: s */
    public void mo5302s(@zy.lvui View view, @zy.lvui Matrix matrix) {
        if (f6371p) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6371p = false;
            }
        }
    }
}
