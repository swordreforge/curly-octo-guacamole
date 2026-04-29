package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: NestedScrollingParentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class oc {

    /* JADX INFO: renamed from: k */
    private int f4082k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f50857toq;

    public oc(@zy.lvui ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: k */
    public int m3397k() {
        return this.f4082k | this.f50857toq;
    }

    /* JADX INFO: renamed from: n */
    public void m3398n(@zy.lvui View view, int i2) {
        if (i2 == 1) {
            this.f50857toq = 0;
        } else {
            this.f4082k = 0;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m3399q(@zy.lvui View view) {
        m3398n(view, 0);
    }

    public void toq(@zy.lvui View view, @zy.lvui View view2, int i2) {
        zy(view, view2, i2, 0);
    }

    public void zy(@zy.lvui View view, @zy.lvui View view2, int i2, int i3) {
        if (i3 == 1) {
            this.f50857toq = i2;
        } else {
            this.f4082k = i2;
        }
    }
}
