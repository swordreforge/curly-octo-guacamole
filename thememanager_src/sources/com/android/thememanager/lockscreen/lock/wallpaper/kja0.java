package com.android.thememanager.lockscreen.lock.wallpaper;

import android.util.Log;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MagicType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f60387cdj = 40000;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f60388f7l8 = 40000;

    /* JADX INFO: renamed from: g */
    private static final int f12501g = 39999;

    /* JADX INFO: renamed from: h */
    public static final int f12502h = 30000;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final kja0 f12503k = new kja0();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f60389kja0 = 20000;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f60390ld6 = 10001;

    /* JADX INFO: renamed from: n */
    private static final int f12504n = 30000;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f60391n7h = 10004;

    /* JADX INFO: renamed from: p */
    public static final int f12505p = 10000;

    /* JADX INFO: renamed from: q */
    private static final int f12506q = 19999;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f60392qrj = 10003;

    /* JADX INFO: renamed from: s */
    public static final int f12507s = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f60393toq = 10000;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f60394x2 = 10002;

    /* JADX INFO: renamed from: y */
    private static final int f12508y = 49999;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f60395zy = 10000;

    private kja0() {
    }

    public final boolean f7l8(int i2) {
        return i2 >= 10000;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8125g(int i2, boolean z2) {
        return m8127n(i2) || z2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m8126k(int i2) {
        return i2 == 30000;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m8127n(int i2) {
        if (10000 <= i2 && i2 < f12506q) {
            return true;
        }
        if (30000 <= i2 && i2 < f12501g) {
            return true;
        }
        return 40000 <= i2 && i2 < f12508y;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8128q(int i2) {
        return i2 == 0;
    }

    public final boolean toq(@InterfaceC7395n Integer num) {
        return num != null && num.intValue() == 20000;
    }

    /* JADX INFO: renamed from: y */
    public final int m8129y(int i2) {
        if (i2 >= 0 && i2 < 50000) {
            return i2;
        }
        Log.w("MagicType", "makeTypeValid: invalid type " + i2);
        return 0;
    }

    public final boolean zy(int i2) {
        return i2 == 40000;
    }
}
