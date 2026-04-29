package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi29.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
class nmn5 extends ch {
    nmn5() {
    }

    @Override // androidx.transition.y9n, androidx.transition.lv5
    public void f7l8(@zy.lvui View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // androidx.transition.zp, androidx.transition.lv5
    /* JADX INFO: renamed from: g */
    public void mo5377g(@zy.lvui View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // androidx.transition.a98o, androidx.transition.lv5
    /* JADX INFO: renamed from: n */
    public void mo5300n(@zy.lvui View view, @zy.dd Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.a98o, androidx.transition.lv5
    /* JADX INFO: renamed from: p */
    public void mo5301p(@zy.lvui View view, @zy.lvui Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.a98o, androidx.transition.lv5
    /* JADX INFO: renamed from: s */
    public void mo5302s(@zy.lvui View view, @zy.lvui Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.ch, androidx.transition.lv5
    /* JADX INFO: renamed from: y */
    public void mo5308y(@zy.lvui View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // androidx.transition.y9n, androidx.transition.lv5
    public float zy(@zy.lvui View view) {
        return view.getTransitionAlpha();
    }
}
