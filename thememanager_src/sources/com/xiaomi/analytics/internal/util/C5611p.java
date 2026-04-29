package com.xiaomi.analytics.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: com.xiaomi.analytics.internal.util.p */
/* JADX INFO: compiled from: NetworkUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5611p {

    /* JADX INFO: renamed from: k */
    private static String f31209k = "NetworkUtils";

    /* JADX INFO: renamed from: n */
    private static final int f31210n = 19;

    /* JADX INFO: renamed from: q */
    private static final int f31211q = 18;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f73063toq = 16;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f73064zy = 17;

    /* JADX INFO: renamed from: com.xiaomi.analytics.internal.util.p$k */
    /* JADX INFO: compiled from: NetworkUtils.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f31212k;

        static {
            int[] iArr = new int[EnumC5613s.values().length];
            f31212k = iArr;
            try {
                iArr[EnumC5613s.MN2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31212k[EnumC5613s.MN3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31212k[EnumC5613s.MN4G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31212k[EnumC5613s.WIFI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31212k[EnumC5613s.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static EnumC5613s m19252k(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                return !connectivityManager.isActiveNetworkMetered() ? EnumC5613s.WIFI : toq(((TelephonyManager) context.getSystemService("phone")).getNetworkType());
            }
            return EnumC5613s.NONE;
        } catch (Exception e2) {
            C5609k.m19241n(f31209k, "getNetState", e2);
            return EnumC5613s.NONE;
        }
    }

    private static EnumC5613s toq(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return EnumC5613s.MN2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return EnumC5613s.MN3G;
            case 13:
            case 18:
            case 19:
                return EnumC5613s.MN4G;
            default:
                return EnumC5613s.NONE;
        }
    }

    public static int zy(Context context) {
        int i2 = k.f31212k[m19252k(context).ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    return i2 != 4 ? 0 : 10;
                }
            }
        }
        return i3;
    }
}
