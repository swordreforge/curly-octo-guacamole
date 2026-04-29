package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public enum mub {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);


    /* JADX INFO: renamed from: a */
    private final int f33436a;

    mub(int i2) {
        this.f33436a = i2;
    }

    /* JADX INFO: renamed from: a */
    public static mub m21298a(int i2) {
        if (i2 == 1) {
            return INT;
        }
        if (i2 == 2) {
            return LONG;
        }
        if (i2 == 3) {
            return STRING;
        }
        if (i2 != 4) {
            return null;
        }
        return BOOLEAN;
    }
}
