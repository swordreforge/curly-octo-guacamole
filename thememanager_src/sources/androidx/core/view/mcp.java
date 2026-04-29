package androidx.core.view;

/* JADX INFO: compiled from: NestedScrollingChild2.java */
/* JADX INFO: loaded from: classes.dex */
public interface mcp extends a9 {
    boolean dispatchNestedPreScroll(int i2, int i3, @zy.dd int[] iArr, @zy.dd int[] iArr2, int i4);

    boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @zy.dd int[] iArr, int i6);

    boolean hasNestedScrollingParent(int i2);

    boolean startNestedScroll(int i2, int i3);

    void stopNestedScroll(int i2);
}
