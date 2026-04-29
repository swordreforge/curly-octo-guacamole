package androidx.core.view;

/* JADX INFO: compiled from: NestedScrollingChild.java */
/* JADX INFO: loaded from: classes.dex */
public interface a9 {
    boolean dispatchNestedFling(float f2, float f3, boolean z2);

    boolean dispatchNestedPreFling(float f2, float f3);

    boolean dispatchNestedPreScroll(int i2, int i3, @zy.dd int[] iArr, @zy.dd int[] iArr2);

    boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @zy.dd int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z2);

    boolean startNestedScroll(int i2);

    void stopNestedScroll();
}
