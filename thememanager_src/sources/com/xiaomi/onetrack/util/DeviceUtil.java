package com.xiaomi.onetrack.util;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.onetrack.p015d.C5750d;
import com.xiaomi.onetrack.util.oaid.C5783a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceUtil {

    /* JADX INFO: renamed from: a */
    static final int f32199a = 15;

    /* JADX INFO: renamed from: b */
    static final int f32200b = 6;

    /* JADX INFO: renamed from: c */
    private static final String f32201c = "DeviceUtil";

    /* JADX INFO: renamed from: d */
    private static final String f32202d = "";

    /* JADX INFO: renamed from: e */
    private static final int f32203e = 15;

    /* JADX INFO: renamed from: f */
    private static Method f32204f = null;

    /* JADX INFO: renamed from: g */
    private static Method f32205g = null;

    /* JADX INFO: renamed from: h */
    private static Object f32206h = null;

    /* JADX INFO: renamed from: i */
    private static Method f32207i = null;

    /* JADX INFO: renamed from: j */
    private static Method f32208j = null;

    /* JADX INFO: renamed from: k */
    private static volatile String f32209k = null;

    /* JADX INFO: renamed from: l */
    private static volatile String f32210l = null;

    /* JADX INFO: renamed from: m */
    private static String f32211m = null;

    /* JADX INFO: renamed from: n */
    private static String f32212n = null;

    /* JADX INFO: renamed from: o */
    private static String f32213o = null;

    /* JADX INFO: renamed from: p */
    private static String f32214p = null;

    /* JADX INFO: renamed from: q */
    private static volatile boolean f32215q = false;

    /* JADX INFO: renamed from: r */
    private static final String f32216r = "0000000000000000";

    static {
        try {
            f32204f = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Throwable th) {
            C5804p.m20347b(f32201c, "sGetProp init failed ex: " + th.getMessage());
        }
        try {
            Class<?> cls = Class.forName("miui.telephony.TelephonyManagerEx");
            f32206h = cls.getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
            f32205g = cls.getMethod("getImeiList", new Class[0]);
            f32208j = cls.getMethod("getSubscriberIdForSlot", Integer.TYPE);
        } catch (Throwable th2) {
            C5804p.m20347b(f32201c, "TelephonyManagerEx init failed ex: " + th2.getMessage());
        }
        try {
            f32207i = Class.forName("android.telephony.TelephonyManager").getMethod("getImei", Integer.TYPE);
        } catch (Throwable th3) {
            C5804p.m20347b(f32201c, "sGetImeiForSlot init failed ex: " + th3.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m20112a(Context context) {
        if (!TextUtils.isEmpty(f32209k)) {
            return f32209k;
        }
        m20131g(context);
        return !TextUtils.isEmpty(f32209k) ? f32209k : "";
    }

    /* JADX INFO: renamed from: b */
    public static String m20118b(Context context) {
        if (!TextUtils.isEmpty(f32212n)) {
            return f32212n;
        }
        String strM20112a = m20112a(context);
        if (TextUtils.isEmpty(strM20112a)) {
            return "";
        }
        String strM20025c = C5750d.m20025c(strM20112a);
        f32212n = strM20025c;
        return strM20025c;
    }

    /* JADX INFO: renamed from: c */
    public static String m20122c(Context context) {
        if (!TextUtils.isEmpty(f32210l)) {
            return f32210l;
        }
        m20131g(context);
        return !TextUtils.isEmpty(f32210l) ? f32210l : "";
    }

    /* JADX INFO: renamed from: d */
    public static String m20125d(Context context) {
        if (!TextUtils.isEmpty(f32213o)) {
            return f32213o;
        }
        String strM20122c = m20122c(context);
        if (TextUtils.isEmpty(strM20122c)) {
            return "";
        }
        String strM20025c = C5750d.m20025c(strM20122c);
        f32213o = strM20025c;
        return strM20025c;
    }

    /* JADX INFO: renamed from: e */
    public static String m20126e(Context context) {
        if (!TextUtils.isEmpty(f32211m)) {
            return f32211m;
        }
        if (GAIDClient.m20141b(context)) {
            return "";
        }
        String strM20140a = GAIDClient.m20140a(context);
        if (TextUtils.isEmpty(strM20140a)) {
            return "";
        }
        f32211m = strM20140a;
        return strM20140a;
    }

    /* JADX INFO: renamed from: f */
    public static List<String> m20128f(Context context) {
        List<String> listM20131g = m20131g(context);
        ArrayList arrayList = new ArrayList();
        if (listM20131g != null && !listM20131g.isEmpty()) {
            for (int i2 = 0; i2 < listM20131g.size(); i2++) {
                if (!TextUtils.isEmpty(listM20131g.get(i2))) {
                    arrayList.add(i2, C5750d.m20025c(listM20131g.get(i2)));
                }
            }
        }
        return arrayList;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g */
    public static List<String> m20131g(Context context) {
        List<String> listM20138l = null;
        if (C5809u.m20390a(context)) {
            if (f32215q) {
                return null;
            }
            List<String> listM20130g = m20130g();
            listM20138l = (listM20130g == null || listM20130g.isEmpty()) ? m20138l(context) : listM20130g;
            f32215q = true;
        }
        if (listM20138l != null && !listM20138l.isEmpty()) {
            Collections.sort(listM20138l);
            f32209k = listM20138l.get(0);
            if (listM20138l.size() >= 2) {
                f32210l = listM20138l.get(1);
            }
        }
        return listM20138l;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public static List<String> m20132h(Context context) {
        String str;
        String str2;
        if (!C5809u.m20393b(context)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (!m20133h()) {
                String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
                if (m20123c(subscriberId)) {
                    arrayList.add(subscriberId);
                }
                return arrayList;
            }
            Class<?> cls = Class.forName("android.telephony.TelephonyManager");
            int i2 = Build.VERSION.SDK_INT;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
            Class<?> cls2 = Class.forName("android.telephony.SubscriptionManager");
            if (i2 < 29) {
                str = m20116a(cls, cls2, telephonyManager, subscriptionManager)[0];
                str2 = m20116a(cls, cls2, telephonyManager, subscriptionManager)[1];
            } else {
                str = m20120b(cls, cls2, telephonyManager, subscriptionManager)[0];
                str2 = m20120b(cls, cls2, telephonyManager, subscriptionManager)[1];
            }
            if (!m20123c(str)) {
                str = "";
            }
            arrayList.add(str);
            if (!m20123c(str2)) {
                str2 = "";
            }
            arrayList.add(str2);
            return arrayList;
        } catch (SecurityException unused) {
            C5804p.m20342a(f32201c, "getImsiList failed with on permission");
            return null;
        } catch (Throwable th) {
            C5804p.m20347b(f32201c, "getImsiList failed: " + th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m20134i(Context context) {
        try {
            List<String> listM20132h = m20132h(context);
            if (listM20132h == null) {
                return "";
            }
            for (int i2 = 0; i2 < listM20132h.size(); i2++) {
                listM20132h.set(i2, C5750d.m20034h(listM20132h.get(i2)));
            }
            return listM20132h.toString();
        } catch (Throwable th) {
            C5804p.m20348b(C5804p.m20340a(f32201c), "getImeiListMd5 failed!", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    private static boolean m20135i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static String m20136j(Context context) {
        return C5783a.m20293a().m20295a(context);
    }

    /* JADX INFO: renamed from: k */
    public static String m20137k(Context context) {
        try {
            if (C5814z.m20421b(f32214p)) {
                return f32214p;
            }
            String string = Settings.System.getString(context.getContentResolver(), "android_id");
            if (!C5814z.m20421b(string) || f32216r.equals(string)) {
                return "";
            }
            f32214p = string;
            return string;
        } catch (Throwable th) {
            C5804p.m20342a(C5804p.m20340a(f32201c), "getandroid d throwable:" + th.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    private static List<String> m20138l(Context context) {
        if (f32207i == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String str = (String) f32207i.invoke(telephonyManager, 0);
            if (m20119b(str)) {
                arrayList.add(str);
            }
            if (m20133h()) {
                String str2 = (String) f32207i.invoke(telephonyManager, 1);
                if (m20119b(str2)) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            C5804p.m20342a(f32201c, "getImeiListAboveLollipop failed ex: " + e2.getMessage());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: m */
    private static List<String> m20139m(Context context) {
        try {
            ArrayList arrayList = new ArrayList();
            Class<?> cls = Class.forName("android.telephony.TelephonyManager");
            if (!m20133h()) {
                String deviceId = ((TelephonyManager) cls.getMethod("getDefault", new Class[0]).invoke(null, new Object[0])).getDeviceId();
                if (m20119b(deviceId)) {
                    arrayList.add(deviceId);
                }
                return arrayList;
            }
            Class<?> cls2 = Integer.TYPE;
            String deviceId2 = ((TelephonyManager) cls.getMethod("getDefault", cls2).invoke(null, 0)).getDeviceId();
            String deviceId3 = ((TelephonyManager) cls.getMethod("getDefault", cls2).invoke(null, 1)).getDeviceId();
            if (m20119b(deviceId2)) {
                arrayList.add(deviceId2);
            }
            if (m20119b(deviceId3)) {
                arrayList.add(deviceId3);
            }
            return arrayList;
        } catch (Throwable th) {
            C5804p.m20342a(f32201c, "getImeiListBelowLollipop failed ex: " + th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20114a() {
        f32211m = null;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m20119b(String str) {
        return (str == null || str.length() != 15 || str.matches("^0*$")) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m20123c(String str) {
        return str != null && str.length() >= 6 && str.length() <= 15 && !str.matches("^0*$");
    }

    /* JADX INFO: renamed from: d */
    public static String m20124d() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: a */
    private static String m20113a(String str) {
        try {
            Method method = f32204f;
            if (method != null) {
                return String.valueOf(method.invoke(null, str));
            }
        } catch (Exception e2) {
            C5804p.m20342a(f32201c, "getProp failed ex: " + e2.getMessage());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static String[] m20120b(Class<?> cls, Class<?> cls2, TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        String[] strArr = new String[2];
        try {
            Class<?> cls3 = Integer.TYPE;
            int[] iArr = (int[]) cls2.getMethod("getSubscriptionIds", cls3).invoke(subscriptionManager, 0);
            if (iArr != null) {
                strArr[0] = (String) cls.getMethod("getSubscriberId", cls3).invoke(telephonyManager, Integer.valueOf(iArr[0]));
            }
        } catch (Exception e2) {
            C5804p.m20347b(f32201c, "get imsi1 above Android Q exception:" + e2);
        }
        try {
            Class<?> cls4 = Integer.TYPE;
            int[] iArr2 = (int[]) cls2.getMethod("getSubscriptionIds", cls4).invoke(subscriptionManager, 1);
            if (iArr2 != null) {
                strArr[1] = (String) cls.getMethod("getSubscriberId", cls4).invoke(telephonyManager, Integer.valueOf(iArr2[0]));
            }
        } catch (Exception e3) {
            C5804p.m20347b(f32201c, "get imsi2 above Android Q exception:" + e3);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: c */
    public static String m20121c() {
        return m20113a("ro.product.marketname");
    }

    /* JADX INFO: renamed from: e */
    public static void m20127e() {
        C5783a.m20293a().m20297b();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20129f() {
        return C5783a.m20293a().m20298c();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m20115a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!m20119b(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static class GAIDClient {

        /* JADX INFO: renamed from: a */
        private static final String f32217a = "GAIDClient";

        private static final class AdvertisingConnection implements ServiceConnection {

            /* JADX INFO: renamed from: a */
            private static final int f32218a = 30000;

            /* JADX INFO: renamed from: b */
            private boolean f32219b;

            /* JADX INFO: renamed from: c */
            private IBinder f32220c;

            private AdvertisingConnection() {
                this.f32219b = false;
            }

            /* JADX INFO: renamed from: a */
            public IBinder m20143a() throws InterruptedException {
                IBinder iBinder = this.f32220c;
                if (iBinder != null) {
                    return iBinder;
                }
                if (iBinder == null && !this.f32219b) {
                    synchronized (this) {
                        wait(30000L);
                        if (this.f32220c == null) {
                            throw new InterruptedException("Not connect or connect timeout to google play service");
                        }
                    }
                }
                return this.f32220c;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (this) {
                    this.f32220c = iBinder;
                    notifyAll();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                this.f32219b = true;
                this.f32220c = null;
            }
        }

        private GAIDClient() {
        }

        /* JADX INFO: renamed from: a */
        static String m20140a(Context context) {
            if (!m20142c(context)) {
                C5804p.m20342a(f32217a, "Google play service is not available");
                return "";
            }
            AdvertisingConnection advertisingConnection = new AdvertisingConnection();
            try {
                try {
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, advertisingConnection, 1)) {
                        return new C5767a(advertisingConnection.m20143a()).m20144a();
                    }
                } catch (Exception e2) {
                    C5804p.m20344a(f32217a, "Query Google ADID failed ", e2);
                }
                return "";
            } finally {
                context.unbindService(advertisingConnection);
            }
        }

        /* JADX INFO: renamed from: b */
        static boolean m20141b(Context context) {
            if (!m20142c(context)) {
                C5804p.m20342a(f32217a, "Google play service is not available");
                return false;
            }
            AdvertisingConnection advertisingConnection = new AdvertisingConnection();
            try {
                try {
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, advertisingConnection, 1)) {
                        return new C5767a(advertisingConnection.m20143a()).m20145a(true);
                    }
                } catch (Exception e2) {
                    C5804p.m20344a(f32217a, "Query Google isLimitAdTrackingEnabled failed ", e2);
                }
                return false;
            } finally {
                context.unbindService(advertisingConnection);
            }
        }

        /* JADX INFO: renamed from: c */
        private static boolean m20142c(Context context) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 16384);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.onetrack.util.DeviceUtil$GAIDClient$a */
        private static final class C5767a implements IInterface {

            /* JADX INFO: renamed from: a */
            private IBinder f32221a;

            public C5767a(IBinder iBinder) {
                this.f32221a = iBinder;
            }

            /* JADX INFO: renamed from: a */
            public String m20144a() throws RemoteException {
                if (this.f32221a == null) {
                    return "";
                }
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f32221a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32221a;
            }

            /* JADX INFO: renamed from: a */
            public boolean m20145a(boolean z2) throws RemoteException {
                if (this.f32221a == null) {
                    return false;
                }
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    this.f32221a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String[] m20116a(Class<?> cls, Class<?> cls2, TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        Method method;
        Object obj;
        String[] strArr = new String[2];
        try {
            Class<?> cls3 = Integer.TYPE;
            String str = (String) cls.getMethod("getSubscriberId", cls3).invoke(telephonyManager, Integer.valueOf(((int[]) cls2.getMethod("getSubId", cls3).invoke(subscriptionManager, 0))[0]));
            strArr[0] = str;
            if (m20123c(str) || (method = f32208j) == null || (obj = f32206h) == null) {
                strArr[1] = (String) cls.getMethod("getSubscriberId", cls3).invoke(telephonyManager, Integer.valueOf(((int[]) cls2.getMethod("getSubId", cls3).invoke(subscriptionManager, 1))[0]));
            } else {
                strArr[0] = (String) method.invoke(obj, 0);
                strArr[1] = (String) f32208j.invoke(f32206h, 1);
            }
        } catch (Exception e2) {
            C5804p.m20342a(f32201c, "getImsiFromLToP: " + e2);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: g */
    private static List<String> m20130g() {
        if (f32205g == null || m20135i()) {
            return null;
        }
        try {
            List<String> list = (List) f32205g.invoke(f32206h, new Object[0]);
            if (list == null || list.size() <= 0) {
                return null;
            }
            if (m20115a(list)) {
                return null;
            }
            return list;
        } catch (Exception e2) {
            C5804p.m20342a(f32201c, "getImeiListFromMiui failed ex: " + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m20117b() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m20133h() {
        if ("dsds".equals(m20113a("persist.radio.multisim.config"))) {
            return true;
        }
        String str = Build.DEVICE;
        return "lcsh92_wet_jb9".equals(str) || "lcsh92_wet_tdd".equals(str) || "HM2013022".equals(str) || "HM2013023".equals(str) || "armani".equals(str) || "HM2014011".equals(str) || "HM2014012".equals(str);
    }
}
