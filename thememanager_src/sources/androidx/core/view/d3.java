package androidx.core.view;

import android.view.View;

/* JADX INFO: compiled from: NestedScrollingParent.java */
/* JADX INFO: loaded from: classes.dex */
public interface d3 {
    int getNestedScrollAxes();

    boolean onNestedFling(@zy.lvui View view, float f2, float f3, boolean z2);

    boolean onNestedPreFling(@zy.lvui View view, float f2, float f3);

    void onNestedPreScroll(@zy.lvui View view, int i2, int i3, @zy.lvui int[] iArr);

    void onNestedScroll(@zy.lvui View view, int i2, int i3, int i4, int i5);

    void onNestedScrollAccepted(@zy.lvui View view, @zy.lvui View view2, int i2);

    boolean onStartNestedScroll(@zy.lvui View view, @zy.lvui View view2, int i2);

    void onStopNestedScroll(@zy.lvui View view);
}
