package com.xiaomi.push;

import android.net.NetworkInfo;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class lvui {

    /* JADX INFO: renamed from: k */
    private final NetworkInfo f33368k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f73473toq = new ConcurrentHashMap<>();

    public lvui(NetworkInfo networkInfo) {
        this.f33368k = networkInfo;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: q */
    private <T> T m21208q(String str) {
        Object objValueOf;
        if (this.f73473toq.containsKey(str)) {
            return (T) this.f73473toq.get(str);
        }
        synchronized (str) {
            objValueOf = null;
            if (!this.f73473toq.contains(str)) {
                byte b2 = -1;
                switch (str.hashCode()) {
                    case -1776922004:
                        if (str.equals("toString")) {
                            b2 = com.google.common.base.zy.f68124kja0;
                        }
                        break;
                    case -830707388:
                        if (str.equals("getSubtype")) {
                            b2 = 2;
                        }
                        break;
                    case -263236056:
                        if (str.equals("getExtraInfo")) {
                            b2 = com.google.common.base.zy.f68128n7h;
                        }
                        break;
                    case -117507012:
                        if (str.equals("isFailover")) {
                            b2 = 7;
                        }
                        break;
                    case -75106384:
                        if (str.equals("getType")) {
                            b2 = 0;
                        }
                        break;
                    case -66906641:
                        if (str.equals("getSubtypeName")) {
                            b2 = 3;
                        }
                        break;
                    case 444517567:
                        if (str.equals("isAvailable")) {
                            b2 = 6;
                        }
                        break;
                    case 599209215:
                        if (str.equals("isConnected")) {
                            b2 = 5;
                        }
                        break;
                    case 711698955:
                        if (str.equals("getDetailedState")) {
                            b2 = 10;
                        }
                        break;
                    case 761050426:
                        if (str.equals("getReason")) {
                            b2 = com.google.common.base.zy.f68132qrj;
                        }
                        break;
                    case 787194767:
                        if (str.equals("isRoaming")) {
                            b2 = 8;
                        }
                        break;
                    case 1401392731:
                        if (str.equals("getTypeName")) {
                            b2 = 1;
                        }
                        break;
                    case 1900850074:
                        if (str.equals("isConnectedOrConnecting")) {
                            b2 = 4;
                        }
                        break;
                    case 1965583067:
                        if (str.equals("getState")) {
                            b2 = 9;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        objValueOf = Integer.valueOf(this.f33368k.getType());
                        break;
                    case 1:
                        objValueOf = this.f33368k.getTypeName();
                        break;
                    case 2:
                        objValueOf = Integer.valueOf(this.f33368k.getSubtype());
                        break;
                    case 3:
                        objValueOf = this.f33368k.getSubtypeName();
                        break;
                    case 4:
                        objValueOf = Boolean.valueOf(this.f33368k.isConnectedOrConnecting());
                        break;
                    case 5:
                        objValueOf = Boolean.valueOf(this.f33368k.isConnected());
                        break;
                    case 6:
                        objValueOf = Boolean.valueOf(this.f33368k.isAvailable());
                        break;
                    case 7:
                        objValueOf = Boolean.valueOf(this.f33368k.isFailover());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(this.f33368k.isRoaming());
                        break;
                    case 9:
                        objValueOf = this.f33368k.getState();
                        break;
                    case 10:
                        objValueOf = this.f33368k.getDetailedState();
                        break;
                    case 11:
                        objValueOf = this.f33368k.getReason();
                        break;
                    case 12:
                        objValueOf = this.f33368k.getExtraInfo();
                        break;
                    case 13:
                        objValueOf = this.f33368k.toString();
                        break;
                }
                if (objValueOf != null) {
                    this.f73473toq.put(str, objValueOf);
                }
            }
        }
        return (T) objValueOf;
    }

    public int f7l8() {
        return ((Integer) m21208q("getSubtype")).intValue();
    }

    /* JADX INFO: renamed from: g */
    public boolean m21209g() {
        return ((Boolean) m21208q("isConnected")).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public int m21210k() {
        return ((Integer) m21208q("getType")).intValue();
    }

    /* JADX INFO: renamed from: n */
    public String m21211n() {
        return (String) m21208q("getTypeName");
    }

    /* JADX INFO: renamed from: s */
    public String m21212s() {
        return (String) m21208q("getExtraInfo");
    }

    public String toString() {
        return (String) m21208q("toString");
    }

    public NetworkInfo.DetailedState toq() {
        return (NetworkInfo.DetailedState) m21208q("getDetailedState");
    }

    /* JADX INFO: renamed from: y */
    public String m21213y() {
        return (String) m21208q("getSubtypeName");
    }

    public NetworkInfo.State zy() {
        return (NetworkInfo.State) m21208q("getState");
    }
}
