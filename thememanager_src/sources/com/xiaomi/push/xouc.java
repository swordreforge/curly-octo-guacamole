package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public class xouc {

    /* JADX INFO: renamed from: k */
    public static final String f34180k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static boolean f73731toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f73732zy;

    static {
        String str = C5864g.f32950k ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f34180k = str;
        f73731toq = false;
        f73732zy = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            f73732zy = 2;
        } else if (str.equalsIgnoreCase("ONEBOX")) {
            f73732zy = 3;
        } else {
            f73732zy = 1;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m22024k() {
        return f73732zy;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m22025q() {
        return f73732zy == 3;
    }

    public static void toq(int i2) {
        f73732zy = i2;
    }

    public static boolean zy() {
        return f73732zy == 2;
    }
}
