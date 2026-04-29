package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: compiled from: CompactLinkedHashSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
class jp0y<E> extends a9<E> {

    /* JADX INFO: renamed from: f */
    private static final int f26254f = -2;

    /* JADX INFO: renamed from: l */
    private transient int f26255l;

    /* JADX INFO: renamed from: r */
    private transient int f26256r;

    /* JADX INFO: renamed from: t */
    @MonotonicNonNullDecl
    private transient int[] f26257t;

    /* JADX INFO: renamed from: z */
    @MonotonicNonNullDecl
    private transient int[] f26258z;

    jp0y() {
    }

    public static <E> jp0y<E> create() {
        return new jp0y<>();
    }

    public static <E> jp0y<E> createWithExpectedSize(int i2) {
        return new jp0y<>(i2);
    }

    private void ld6(int i2, int i3) {
        if (i2 == -2) {
            this.f26256r = i3;
        } else {
            this.f26257t[i2] = i3;
        }
        if (i3 == -2) {
            this.f26255l = i2;
        } else {
            this.f26258z[i3] = i2;
        }
    }

    @Override // com.google.common.collect.a9
    int adjustAfterRemove(int i2, int i3) {
        return i2 == size() ? i3 : i2;
    }

    @Override // com.google.common.collect.a9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        super.clear();
        this.f26256r = -2;
        this.f26255l = -2;
        Arrays.fill(this.f26258z, -1);
        Arrays.fill(this.f26257t, -1);
    }

    @Override // com.google.common.collect.a9
    int firstEntryIndex() {
        return this.f26256r;
    }

    @Override // com.google.common.collect.a9
    int getSuccessor(int i2) {
        return this.f26257t[i2];
    }

    @Override // com.google.common.collect.a9
    void init(int i2, float f2) {
        super.init(i2, f2);
        int[] iArr = new int[i2];
        this.f26258z = iArr;
        this.f26257t = new int[i2];
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f26257t, -1);
        this.f26256r = -2;
        this.f26255l = -2;
    }

    @Override // com.google.common.collect.a9
    void insertEntry(int i2, E e2, int i3) {
        super.insertEntry(i2, e2, i3);
        ld6(this.f26255l, i2);
        ld6(i2, -2);
    }

    @Override // com.google.common.collect.a9
    void moveEntry(int i2) {
        int size = size() - 1;
        super.moveEntry(i2);
        ld6(this.f26258z[i2], this.f26257t[i2]);
        if (size != i2) {
            ld6(this.f26258z[size], i2);
            ld6(i2, this.f26257t[size]);
        }
        this.f26258z[size] = -1;
        this.f26257t[size] = -1;
    }

    @Override // com.google.common.collect.a9
    void resizeEntries(int i2) {
        super.resizeEntries(i2);
        int[] iArr = this.f26258z;
        int length = iArr.length;
        this.f26258z = Arrays.copyOf(iArr, i2);
        this.f26257t = Arrays.copyOf(this.f26257t, i2);
        if (length < i2) {
            Arrays.fill(this.f26258z, length, i2, -1);
            Arrays.fill(this.f26257t, length, i2, -1);
        }
    }

    @Override // com.google.common.collect.a9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return r25n.x2(this);
    }

    jp0y(int i2) {
        super(i2);
    }

    public static <E> jp0y<E> create(Collection<? extends E> collection) {
        jp0y<E> jp0yVarCreateWithExpectedSize = createWithExpectedSize(collection.size());
        jp0yVarCreateWithExpectedSize.addAll(collection);
        return jp0yVarCreateWithExpectedSize;
    }

    @Override // com.google.common.collect.a9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) r25n.qrj(this, tArr);
    }

    public static <E> jp0y<E> create(E... eArr) {
        jp0y<E> jp0yVarCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(jp0yVarCreateWithExpectedSize, eArr);
        return jp0yVarCreateWithExpectedSize;
    }
}
