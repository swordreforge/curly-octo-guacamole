package com.google.common.collect;

import java.util.Arrays;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: ObjectCountLinkedHashMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
class ix<K> extends ew<K> {

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f68216ki = -2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private transient int f68217cdj;

    /* JADX INFO: renamed from: h */
    private transient int f26223h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7732q
    transient long[] f68218kja0;

    ix() {
        this(3);
    }

    private void d2ok(int i2, int i3) {
        long[] jArr = this.f68218kja0;
        jArr[i2] = (jArr[i2] & (-4294967296L)) | (((long) i3) & 4294967295L);
    }

    private int d3(int i2) {
        return (int) this.f68218kja0[i2];
    }

    private void eqxt(int i2, int i3) {
        if (i2 == -2) {
            this.f26223h = i3;
        } else {
            d2ok(i2, i3);
        }
        if (i3 == -2) {
            this.f68217cdj = i2;
        } else {
            oc(i3, i2);
        }
    }

    public static <K> ix<K> fti() {
        return new ix<>();
    }

    private int gvn7(int i2) {
        return (int) (this.f68218kja0[i2] >>> 32);
    }

    public static <K> ix<K> jp0y(int i2) {
        return new ix<>(i2);
    }

    private void oc(int i2, int i3) {
        long[] jArr = this.f68218kja0;
        jArr[i2] = (jArr[i2] & 4294967295L) | (((long) i3) << 32);
    }

    @Override // com.google.common.collect.ew
    void cdj(int i2) {
        int iJk = jk() - 1;
        eqxt(gvn7(i2), d3(i2));
        if (i2 < iJk) {
            eqxt(gvn7(iJk), i2);
            eqxt(i2, d3(iJk));
        }
        super.cdj(i2);
    }

    @Override // com.google.common.collect.ew
    int fn3e(int i2, int i3) {
        return i2 == jk() ? i3 : i2;
    }

    @Override // com.google.common.collect.ew
    /* JADX INFO: renamed from: g */
    int mo15657g() {
        int i2 = this.f26223h;
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.common.collect.ew
    /* JADX INFO: renamed from: h */
    void mo15658h(int i2, K k2, int i3, int i4) {
        super.mo15658h(i2, k2, i3, i4);
        eqxt(this.f68217cdj, i2);
        eqxt(i2, -2);
    }

    @Override // com.google.common.collect.ew
    /* JADX INFO: renamed from: i */
    int mo15659i(int i2) {
        int iD3 = d3(i2);
        if (iD3 == -2) {
            return -1;
        }
        return iD3;
    }

    @Override // com.google.common.collect.ew
    /* JADX INFO: renamed from: k */
    public void mo15660k() {
        super.mo15660k();
        this.f26223h = -2;
        this.f68217cdj = -2;
    }

    @Override // com.google.common.collect.ew
    void kja0(int i2, float f2) {
        super.kja0(i2, f2);
        this.f26223h = -2;
        this.f68217cdj = -2;
        long[] jArr = new long[i2];
        this.f68218kja0 = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ew
    void o1t(int i2) {
        super.o1t(i2);
        long[] jArr = this.f68218kja0;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        this.f68218kja0 = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i2, -1L);
    }

    ix(int i2) {
        this(i2, 1.0f);
    }

    ix(int i2, float f2) {
        super(i2, f2);
    }

    ix(ew<K> ewVar) {
        kja0(ewVar.jk(), 1.0f);
        int iMo15657g = ewVar.mo15657g();
        while (iMo15657g != -1) {
            zurt(ewVar.m15662p(iMo15657g), ewVar.x2(iMo15657g));
            iMo15657g = ewVar.mo15659i(iMo15657g);
        }
    }
}
