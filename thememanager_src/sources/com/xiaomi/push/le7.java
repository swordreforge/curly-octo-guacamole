package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public enum le7 {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);


    /* JADX INFO: renamed from: a */
    private final int f33299a;

    le7(int i2) {
        this.f33299a = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m21155a() {
        return this.f33299a;
    }

    /* JADX INFO: renamed from: a */
    public static le7 m21154a(int i2) {
        if (i2 == 1) {
            return MISC_CONFIG;
        }
        if (i2 != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }
}
