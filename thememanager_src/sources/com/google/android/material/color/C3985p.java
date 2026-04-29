package com.google.android.material.color;

import ij.C6095k;
import zy.InterfaceC7828g;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.color.p */
/* JADX INFO: compiled from: HarmonizedColorAttributes.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3985p {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int[] f67534zy = {C6095k.zy.f80310xblq, C6095k.zy.f80296vwb, C6095k.zy.f80262pnt2, C6095k.zy.f80224lk};

    /* JADX INFO: renamed from: k */
    private final int[] f24237k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @hb
    private final int f67535toq;

    private C3985p(@lvui @InterfaceC7828g int[] iArr, @hb int i2) {
        if (i2 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f24237k = iArr;
        this.f67535toq = i2;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static C3985p m14317k(@lvui @InterfaceC7828g int[] iArr) {
        return new C3985p(iArr, 0);
    }

    @lvui
    public static C3985p toq(@lvui @InterfaceC7828g int[] iArr, @hb int i2) {
        return new C3985p(iArr, i2);
    }

    @lvui
    public static C3985p zy() {
        return toq(f67534zy, C6095k.n7h.f7);
    }

    @hb
    /* JADX INFO: renamed from: n */
    public int m14318n() {
        return this.f67535toq;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public int[] m14319q() {
        return this.f24237k;
    }
}
