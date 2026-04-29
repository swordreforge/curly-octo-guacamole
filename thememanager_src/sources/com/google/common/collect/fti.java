package com.google.common.collect;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: CompactLinkedHashMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
class fti<K, V> extends jk<K, V> {

    /* JADX INFO: renamed from: r */
    private static final int f26135r = -2;
    private final boolean accessOrder;

    @InterfaceC7732q
    @MonotonicNonNullDecl
    transient long[] links;

    /* JADX INFO: renamed from: t */
    private transient int f26136t;

    /* JADX INFO: renamed from: z */
    private transient int f26137z;

    fti() {
        this(3);
    }

    private void cdj(int i2, int i3) {
        if (i2 == -2) {
            this.f26137z = i3;
        } else {
            t8r(i2, i3);
        }
        if (i3 == -2) {
            this.f26136t = i2;
        } else {
            m15687h(i3, i2);
        }
    }

    public static <K, V> fti<K, V> create() {
        return new fti<>();
    }

    public static <K, V> fti<K, V> createWithExpectedSize(int i2) {
        return new fti<>(i2);
    }

    /* JADX INFO: renamed from: h */
    private void m15687h(int i2, int i3) {
        long[] jArr = this.links;
        jArr[i2] = (jArr[i2] & 4294967295L) | (((long) i3) << 32);
    }

    private int kja0(int i2) {
        return (int) (this.links[i2] >>> 32);
    }

    private void t8r(int i2, int i3) {
        long[] jArr = this.links;
        jArr[i2] = (jArr[i2] & (-4294967296L)) | (((long) i3) & 4294967295L);
    }

    @Override // com.google.common.collect.jk
    void accessEntry(int i2) {
        if (this.accessOrder) {
            cdj(kja0(i2), getSuccessor(i2));
            cdj(this.f26136t, i2);
            cdj(i2, -2);
            this.modCount++;
        }
    }

    @Override // com.google.common.collect.jk
    int adjustAfterRemove(int i2, int i3) {
        return i2 >= size() ? i3 : i2;
    }

    @Override // com.google.common.collect.jk, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.f26137z = -2;
        this.f26136t = -2;
    }

    @Override // com.google.common.collect.jk
    int firstEntryIndex() {
        return this.f26137z;
    }

    @Override // com.google.common.collect.jk
    int getSuccessor(int i2) {
        return (int) this.links[i2];
    }

    @Override // com.google.common.collect.jk
    void init(int i2, float f2) {
        super.init(i2, f2);
        this.f26137z = -2;
        this.f26136t = -2;
        long[] jArr = new long[i2];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.jk
    void insertEntry(int i2, K k2, V v2, int i3) {
        super.insertEntry(i2, k2, v2, i3);
        cdj(this.f26136t, i2);
        cdj(i2, -2);
    }

    @Override // com.google.common.collect.jk
    void moveLastEntry(int i2) {
        int size = size() - 1;
        cdj(kja0(i2), getSuccessor(i2));
        if (i2 < size) {
            cdj(kja0(size), i2);
            cdj(i2, getSuccessor(size));
        }
        super.moveLastEntry(i2);
    }

    @Override // com.google.common.collect.jk
    void resizeEntries(int i2) {
        super.resizeEntries(i2);
        this.links = Arrays.copyOf(this.links, i2);
    }

    fti(int i2) {
        this(i2, 1.0f, false);
    }

    fti(int i2, float f2, boolean z2) {
        super(i2, f2);
        this.accessOrder = z2;
    }
}
