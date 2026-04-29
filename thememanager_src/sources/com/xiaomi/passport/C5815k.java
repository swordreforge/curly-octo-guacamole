package com.xiaomi.passport;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.accountsdk.account.C5500p;
import com.xiaomi.accountsdk.hasheddeviceidlib.C5530g;
import com.xiaomi.accountsdk.hasheddeviceidlib.C5532n;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.C5581y;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.xiaomi.passport.k */
/* JADX INFO: compiled from: PassportUserEnvironment.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5815k {

    /* JADX INFO: renamed from: k */
    private static final String f32498k = "PassportUserEnvironment";

    /* JADX INFO: renamed from: n */
    private static final int f32499n = -1;

    /* JADX INFO: renamed from: q */
    private static final String f32500q = "utf-8";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73208toq = "#";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f73209zy = 6;

    /* JADX INFO: renamed from: com.xiaomi.passport.k$k */
    /* JADX INFO: compiled from: PassportUserEnvironment.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f32501k;

        static {
            int[] iArr = new int[zy.values().length];
            f32501k = iArr;
            try {
                iArr[zy.OPERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32501k[zy.SERIAL_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32501k[zy.SUBSCRIBE_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32501k[zy.DEVICE_ID_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.k$toq */
    /* JADX INFO: compiled from: PassportUserEnvironment.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        private static final C5815k f32502k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static C5815k f73210toq;

        static {
            C5815k c5815k = new C5815k();
            f32502k = c5815k;
            f73210toq = c5815k;
        }

        /* JADX INFO: renamed from: k */
        public static C5815k m20433k() {
            return f32502k;
        }

        public static C5815k toq() {
            return f73210toq;
        }

        public static void zy(C5815k c5815k) {
            if (c5815k == null) {
                throw new IllegalArgumentException("PassportUserEnvironment instance cannot be null!");
            }
            f73210toq = c5815k;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.k$zy */
    /* JADX INFO: compiled from: PassportUserEnvironment.java */
    public enum zy {
        SUBSCRIBE_ID("getSubscriberIdForSlot"),
        SERIAL_NUMBER("getSimSerialNumberForSlot"),
        OPERATOR("getSimOperatorForSlot"),
        DEVICE_ID_LIST("getDeviceIdList");

        String methodToGetValue;

        zy(String str) {
            this.methodToGetValue = str;
        }
    }

    /* JADX INFO: renamed from: g */
    private String m20422g(Application application) {
        if (application == null) {
            return null;
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) application.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getBSSID();
            }
        } catch (SecurityException e2) {
            AbstractC5574n.m19115y(f32498k, "failed to get BSSID with SecurityException " + e2.getMessage());
        }
        return null;
    }

    private static String jk(List list) {
        return (list == null || list.size() == 0) ? "" : TextUtils.join(f73208toq, list);
    }

    /* JADX INFO: renamed from: k */
    private String m20423k(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Base64.encodeToString(str.getBytes("utf-8"), 10);
        } catch (UnsupportedEncodingException e2) {
            AbstractC5574n.m19113q(f32498k, "base64 failed: ", e2);
            return null;
        }
    }

    public static String mcp(ArrayList<String> arrayList) {
        return (arrayList == null || arrayList.size() == 0) ? "" : C5581y.t8r(f73208toq, arrayList, 6);
    }

    /* JADX INFO: renamed from: n */
    private String m20424n(Application application) {
        if (application == null) {
            return null;
        }
        return Settings.Secure.getString(application.getContentResolver(), "android_id");
    }

    @SuppressLint({"MissingPermission"})
    private int n7h(Application application) {
        if (application == null) {
            return -1;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) application.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return activeNetworkInfo.getType();
            }
        } catch (SecurityException e2) {
            AbstractC5574n.m19115y(f32498k, "failed to getNetWorkType with SecurityException " + e2.getMessage());
        }
        return -1;
    }

    @SuppressLint({"MissingPermission"})
    private List<String> ni7(Application application, zy zyVar) {
        if (application == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) application.getSystemService("phone");
            ArrayList arrayList = new ArrayList();
            int i2 = k.f32501k[zyVar.ordinal()];
            if (i2 == 1) {
                arrayList.add(telephonyManager.getSimOperator());
            } else if (i2 == 2) {
                arrayList.add(telephonyManager.getSimSerialNumber());
            } else if (i2 == 3) {
                arrayList.add(telephonyManager.getSubscriberId());
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("not here");
                }
                arrayList.add(telephonyManager.getDeviceId());
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        } catch (SecurityException e2) {
            AbstractC5574n.m19115y(f32498k, "failed to get SubscriberId with SecurityException " + e2.getMessage());
            return null;
        }
    }

    private String o1t(String str) {
        return wvg(str, 6);
    }

    /* JADX INFO: renamed from: q */
    private LinkedList<Object> m20425q(Application application) {
        String strO1t = o1t(ki());
        String strO1t2 = o1t(m20422g(application));
        List<String> listM20426t = m20426t(m20432s(50));
        String strM20423k = m20423k(String.valueOf(n7h(application)));
        String strM20423k2 = m20423k(Build.MODEL);
        String strM20423k3 = m20423k(Build.SERIAL);
        String strO1t3 = o1t(m20424n(application));
        List<String> listM20426t2 = m20426t(ld6(application));
        String strO1t4 = o1t(m20427y(application));
        String strO1t5 = o1t(m20428z(application));
        List<String> qVar = toq(zurt(application));
        List<String> qVar2 = toq(fn3e(application));
        List<String> qVar3 = toq(m20429h(application));
        List<String> qVar4 = toq(m20430i(application));
        List<String> listM20426t3 = m20426t(t8r());
        String strM20423k4 = m20423k(fu4(application));
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(strO1t);
        linkedList.add(strO1t2);
        linkedList.add(listM20426t);
        linkedList.add(strM20423k);
        linkedList.add(strM20423k2);
        linkedList.add(strM20423k3);
        linkedList.add(strO1t3);
        linkedList.add(listM20426t2);
        linkedList.add(strO1t4);
        linkedList.add(strO1t5);
        linkedList.add(qVar);
        linkedList.add(qVar2);
        linkedList.add(qVar3);
        linkedList.add(qVar4);
        linkedList.add(listM20426t3);
        linkedList.add(strM20423k4);
        return linkedList;
    }

    /* JADX INFO: renamed from: t */
    private List<String> m20426t(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(o1t(it.next()));
        }
        return arrayList;
    }

    private List<String> toq(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m20423k(it.next()));
        }
        return arrayList;
    }

    private String wvg(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strKi = C5581y.ki(str);
        return (i2 <= 0 || i2 > strKi.length()) ? strKi : strKi.substring(0, i2);
    }

    /* JADX INFO: renamed from: y */
    private String m20427y(Application application) {
        return com.xiaomi.accountsdk.hasheddeviceidlib.toq.m18909k(application);
    }

    /* JADX INFO: renamed from: z */
    private String m20428z(Application application) {
        return com.xiaomi.accountsdk.hasheddeviceidlib.toq.zy(application);
    }

    private static List<String> zy(double d2, double d4) {
        long jRound = Math.round(d2 * 10.0d) * 10;
        long jRound2 = Math.round(d4 * 10.0d) * 10;
        ArrayList arrayList = new ArrayList(8);
        long j2 = jRound - 10;
        arrayList.add(String.valueOf(j2));
        long j3 = jRound2 - 10;
        arrayList.add(String.valueOf(j3));
        arrayList.add(String.valueOf(j2));
        arrayList.add(String.valueOf(jRound2));
        arrayList.add(String.valueOf(jRound));
        arrayList.add(String.valueOf(jRound2));
        arrayList.add(String.valueOf(jRound));
        arrayList.add(String.valueOf(j3));
        return arrayList;
    }

    @Deprecated
    public synchronized String cdj() throws SecurityException {
        return new C5530g.zy().mo18905k(C5500p.toq());
    }

    @SuppressLint({"MissingPermission"})
    @Deprecated
    public String f7l8() {
        try {
            if (BluetoothAdapter.getDefaultAdapter() != null) {
                return BluetoothAdapter.getDefaultAdapter().getAddress();
            }
            return null;
        } catch (SecurityException e2) {
            AbstractC5574n.m19115y(f32498k, "failed to get bluetooth id with SecurityException " + e2.getMessage());
            return null;
        }
    }

    protected List<String> fn3e(Application application) {
        return ni7(application, zy.SERIAL_NUMBER);
    }

    protected String fu4(Application application) {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.getName();
            }
            return null;
        } catch (SecurityException e2) {
            AbstractC5574n.m19115y(f32498k, "failed to get bluetooth id with SecurityException " + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    protected List<String> m20429h(Application application) {
        return null;
    }

    /* JADX INFO: renamed from: i */
    protected List<String> m20430i(Application application) {
        return ni7(application, zy.OPERATOR);
    }

    public String ki() {
        Application qVar = C5500p.toq();
        if (qVar == null) {
            return null;
        }
        try {
            WifiManager wifiManager = (WifiManager) qVar.getSystemService("wifi");
            if (wifiManager.getConnectionInfo() != null) {
                return wifiManager.getConnectionInfo().getSSID();
            }
            return null;
        } catch (SecurityException e2) {
            AbstractC5574n.m19115y(f32498k, "failed to get SSID with SecurityException " + e2.getMessage());
            return null;
        }
    }

    @Deprecated
    public String kja0() {
        Application qVar = C5500p.toq();
        if (qVar == null) {
            return null;
        }
        try {
            return ((TelephonyManager) qVar.getSystemService("phone")).getNetworkOperator();
        } catch (SecurityException e2) {
            AbstractC5574n.m19115y(f32498k, "failed to get network operator with SecurityException " + e2.getMessage());
            return null;
        }
    }

    protected List<String> ld6(Application application) {
        return ni7(application, zy.DEVICE_ID_LIST);
    }

    /* JADX INFO: renamed from: p */
    public List<String> m20431p() {
        Application qVar = C5500p.toq();
        if (qVar == null) {
            return null;
        }
        try {
            List<WifiConfiguration> configuredNetworks = ((WifiManager) qVar.getSystemService("wifi")).getConfiguredNetworks();
            if (configuredNetworks == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(configuredNetworks.size());
            Iterator<WifiConfiguration> it = configuredNetworks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().SSID);
            }
            return arrayList;
        } catch (SecurityException e2) {
            AbstractC5574n.m19115y(f32498k, "failed to get configuredSSIDs with SecurityException " + e2.getMessage());
            return null;
        }
    }

    @Deprecated
    public String qrj() {
        return C5532n.m18907k(C5500p.toq());
    }

    /* JADX INFO: renamed from: s */
    public List<String> m20432s(int i2) {
        List<String> listM20431p = m20431p();
        return (listM20431p == null || listM20431p.size() <= i2) ? listM20431p : listM20431p.subList(0, i2);
    }

    public List<String> t8r() {
        return null;
    }

    public String[] x2(Application application) {
        String strJk;
        LinkedList<Object> linkedListM20425q = m20425q(application);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedListM20425q) {
            if (obj == null) {
                strJk = "";
            } else if (obj instanceof List) {
                strJk = jk((List) obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalStateException("not here");
                }
                strJk = (String) obj;
            }
            arrayList.add(strJk);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    protected List<String> zurt(Application application) {
        return ni7(application, zy.SUBSCRIBE_ID);
    }
}
