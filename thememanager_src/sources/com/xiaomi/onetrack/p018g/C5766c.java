package com.xiaomi.onetrack.p018g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.p013b.C5726n;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.g.c */
/* JADX INFO: loaded from: classes3.dex */
public class C5766c {

    /* JADX INFO: renamed from: a */
    private static final String f32193a = "NetworkUtil";

    /* JADX INFO: renamed from: b */
    private static final int f32194b = 16;

    /* JADX INFO: renamed from: c */
    private static final int f32195c = 17;

    /* JADX INFO: renamed from: d */
    private static final int f32196d = 18;

    /* JADX INFO: renamed from: e */
    private static final int f32197e = 19;

    /* JADX INFO: renamed from: f */
    private static final int f32198f = 20;

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static boolean m20110a() {
        return OneTrack.isRestrictGetNetworkInfo() ? C5726n.m19936c() : m20111b();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20111b() {
        Context contextM20053b = C5756a.m20053b();
        if (contextM20053b == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) contextM20053b.getSystemService("connectivity")).getActiveNetworkInfo();
            C5804p.m20342a(f32193a, "execute getActiveNetworkInfo()");
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        } catch (Exception e2) {
            C5804p.m20347b(f32193a, "isNetworkConnected exception : " + e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static OneTrack.NetType m20109a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (OneTrack.isRestrictGetNetworkInfo()) {
            if (C5726n.m19936c()) {
                return OneTrack.NetType.CONNECTED;
            }
            return OneTrack.NetType.NOT_CONNECTED;
        }
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            C5804p.m20342a(f32193a, "execute getActiveNetworkInfo()");
        } catch (Exception e2) {
            C5804p.m20348b(f32193a, "getNetworkState error", e2);
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return OneTrack.NetType.WIFI;
            }
            if (activeNetworkInfo.getType() == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return OneTrack.NetType.MOBILE_2G;
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
                        return OneTrack.NetType.MOBILE_3G;
                    case 13:
                    case 18:
                    case 19:
                        return OneTrack.NetType.MOBILE_4G;
                    case 20:
                        return OneTrack.NetType.MOBILE_5G;
                    default:
                        return OneTrack.NetType.UNKNOWN;
                }
            }
            if (activeNetworkInfo.getType() == 9) {
                return OneTrack.NetType.ETHERNET;
            }
            return OneTrack.NetType.UNKNOWN;
        }
        return OneTrack.NetType.NOT_CONNECTED;
    }
}
