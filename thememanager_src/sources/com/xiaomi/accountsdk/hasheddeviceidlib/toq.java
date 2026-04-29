package com.xiaomi.accountsdk.hasheddeviceidlib;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.accountsdk.utils.AbstractC5574n;

/* JADX INFO: compiled from: HardwareInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f30924k = "UserEnvironment";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72915toq = "02:00:00:00:00:00";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72916zy = "0";

    /* JADX INFO: renamed from: k */
    public static String m18909k(Context context) {
        String qVar = toq(context);
        if (!TextUtils.isEmpty(qVar)) {
            return qVar;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return "0";
            }
            String address = defaultAdapter.getAddress();
            if (!TextUtils.isEmpty(address)) {
                if (!address.equals(f72915toq)) {
                    return address;
                }
            }
            return "0";
        } catch (SecurityException e2) {
            AbstractC5574n.m19113q(f30924k, "failed to get bluetooth id", e2);
            return "0";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r2.getHardwareAddress();
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m18910q() {
        /*
            java.lang.String r0 = "0"
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L64
            if (r1 != 0) goto L9
            return r0
        L9:
            boolean r2 = r1.hasMoreElements()     // Catch: java.net.SocketException -> L64
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.nextElement()     // Catch: java.net.SocketException -> L64
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.net.SocketException -> L64
            java.lang.String r3 = r2.getName()     // Catch: java.net.SocketException -> L64
            if (r3 == 0) goto L9
            java.lang.String r3 = r2.getName()     // Catch: java.net.SocketException -> L64
            java.lang.String r4 = "wlan0"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.net.SocketException -> L64
            if (r3 == 0) goto L9
            byte[] r1 = r2.getHardwareAddress()     // Catch: java.net.SocketException -> L64
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 != 0) goto L30
            return r0
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L38:
            r5 = 1
            if (r4 >= r2) goto L51
            r6 = r1[r4]
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            r5[r3] = r6
            java.lang.String r6 = "%02X:"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r0.append(r5)
            int r4 = r4 + 1
            goto L38
        L51:
            int r1 = r0.length()
            if (r1 <= 0) goto L5f
            int r1 = r0.length()
            int r1 = r1 - r5
            r0.deleteCharAt(r1)
        L5f:
            java.lang.String r0 = r0.toString()
            return r0
        L64:
            r1 = move-exception
            java.lang.String r2 = "UserEnvironment"
            java.lang.String r3 = "failed to get wifi Mac Address"
            com.xiaomi.accountsdk.utils.AbstractC5574n.m19113q(r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.accountsdk.hasheddeviceidlib.toq.m18910q():java.lang.String");
    }

    private static String toq(Context context) {
        if (context == null) {
            return null;
        }
        return Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
    }

    public static String zy(Context context) {
        String strM18910q = m18910q();
        if (!TextUtils.isEmpty(strM18910q) && !strM18910q.equals("0")) {
            return strM18910q;
        }
        if (context == null) {
            return "0";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager.getConnectionInfo() == null) {
                return "0";
            }
            String macAddress = wifiManager.getConnectionInfo().getMacAddress();
            if (!TextUtils.isEmpty(macAddress)) {
                if (!macAddress.equals(f72915toq)) {
                    return macAddress;
                }
            }
        } catch (SecurityException e2) {
            AbstractC5574n.m19113q(f30924k, "failed to get Mac Address", e2);
        }
        return "0";
    }
}
