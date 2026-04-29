package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public enum z5 {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);


    /* JADX INFO: renamed from: a */
    private final int f34235a;

    z5(int i2) {
        this.f34235a = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m22074a() {
        return this.f34235a;
    }

    /* JADX INFO: renamed from: a */
    public static z5 m22073a(int i2) {
        if (i2 == 0) {
            return RegIdExpired;
        }
        if (i2 == 1) {
            return PackageUnregistered;
        }
        if (i2 != 2) {
            return null;
        }
        return Init;
    }
}
