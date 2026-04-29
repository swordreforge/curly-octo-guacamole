package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.xiaomi.push.nc;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zy {

    /* JADX INFO: renamed from: k */
    private static int f31253k = 2;

    /* JADX INFO: renamed from: q */
    private static boolean f31256q = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Context f73098toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f73099zy = false;

    /* JADX INFO: renamed from: n */
    private static String f31254n = "XMPush-" + Process.myPid();

    /* JADX INFO: renamed from: g */
    private static InterfaceC5621k f31252g = new C5622k();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final HashMap<Integer, Long> f73097f7l8 = new HashMap<>();

    /* JADX INFO: renamed from: y */
    private static final HashMap<Integer, String> f31258y = new HashMap<>();

    /* JADX INFO: renamed from: s */
    private static final Integer f31257s = -1;

    /* JADX INFO: renamed from: p */
    private static AtomicInteger f31255p = new AtomicInteger(1);

    /* JADX INFO: renamed from: com.xiaomi.channel.commonutils.logger.zy$k */
    static class C5622k implements InterfaceC5621k {

        /* JADX INFO: renamed from: k */
        private String f31259k = zy.f31254n;

        C5622k() {
        }

        @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
        /* JADX INFO: renamed from: k */
        public void mo8464k(String str) {
            Log.v(this.f31259k, str);
        }

        @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
        public void toq(String str) {
            this.f31259k = str;
        }

        @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
        public void zy(String str, Throwable th) {
            Log.v(this.f31259k, str, th);
        }
    }

    public static void a9(String str) {
        if (f73099zy) {
            kja0(str);
            return;
        }
        Log.w(f31254n, m19298q(str));
        if (f31256q) {
            return;
        }
        kja0(str);
    }

    public static void cdj(String str, Throwable th) {
        if (zurt(4)) {
            m19297p(4, m19298q(str), th);
        }
    }

    private static String f7l8(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    private static boolean fn3e() {
        return false;
    }

    private static String fu4(String str, String str2) {
        return ni7() + m19296n(str, str2);
    }

    /* JADX INFO: renamed from: g */
    private static String m19292g(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static void m19293h(String str, String str2) {
        if (zurt(2)) {
            m19299s(2, fu4(str, str2));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m19294i(Object... objArr) {
        if (zurt(4)) {
            m19299s(4, f7l8(objArr));
        }
    }

    public static void jk(String str) {
        if (zurt(4)) {
            m19299s(4, m19298q(str));
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m19295k() {
        return f31253k;
    }

    public static void ki(String str, Object... objArr) {
        if (zurt(2)) {
            m19299s(2, m19292g(str, objArr));
        }
    }

    public static void kja0(String str) {
        if (zurt(2)) {
            m19299s(2, m19298q(str));
        }
    }

    public static void ld6(int i2, Throwable th) {
        if (i2 >= f31253k) {
            f31252g.zy("", th);
            return;
        }
        if (fn3e()) {
            Log.w("MyLog", "-->log(" + i2 + "): ", th);
        }
    }

    public static void mcp(String str, String str2) {
        if (f73099zy) {
            m19293h(str, str2);
            return;
        }
        Log.w(f31254n, fu4(str, str2));
        if (f31256q) {
            return;
        }
        m19293h(str, str2);
    }

    /* JADX INFO: renamed from: n */
    public static String m19296n(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    public static void n7h(Integer num) {
        if (f31253k <= 1) {
            HashMap<Integer, Long> map = f73097f7l8;
            if (map.containsKey(num)) {
                long jLongValue = map.remove(num).longValue();
                String strRemove = f31258y.remove(num);
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                f31252g.mo8464k(strRemove + " ends in " + jCurrentTimeMillis + " ms");
            }
        }
    }

    private static String ni7() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    public static void o1t(String str, String str2) {
        if (zurt(1)) {
            m19299s(1, fu4(str, str2));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m19297p(int i2, String str, Throwable th) {
        if (i2 >= f31253k) {
            f31252g.zy(str, th);
            return;
        }
        if (fn3e()) {
            Log.w("MyLog", "-->log(" + i2 + "): " + str, th);
        }
    }

    /* JADX INFO: renamed from: q */
    private static String m19298q(String str) {
        return ni7() + str;
    }

    public static void qrj(InterfaceC5621k interfaceC5621k) {
        f31252g = interfaceC5621k;
    }

    /* JADX INFO: renamed from: s */
    public static void m19299s(int i2, String str) {
        if (i2 >= f31253k) {
            f31252g.mo8464k(str);
            return;
        }
        if (fn3e()) {
            Log.d("MyLog", "-->log(" + i2 + "): " + str);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m19300t(String str) {
        if (zurt(0)) {
            m19299s(1, m19298q(str));
        }
    }

    public static void t8r(Throwable th) {
        if (zurt(4)) {
            ld6(4, th);
        }
    }

    public static Integer toq(String str) {
        if (f31253k > 1) {
            return f31257s;
        }
        Integer numValueOf = Integer.valueOf(f31255p.incrementAndGet());
        f73097f7l8.put(numValueOf, Long.valueOf(System.currentTimeMillis()));
        f31258y.put(numValueOf, str);
        f31252g.mo8464k(str + " starts");
        return numValueOf;
    }

    public static void wvg(String str, Object... objArr) {
        if (zurt(1)) {
            m19299s(1, m19292g(str, objArr));
        }
    }

    public static void x2(Context context) {
        f73098toq = context;
        if (nc.m21313p(context)) {
            f73099zy = true;
        }
        if (nc.m21315s()) {
            f31256q = true;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m19301y(int i2) {
        if (i2 < 0 || i2 > 5) {
            m19299s(2, "set log level as " + i2);
        }
        f31253k = i2;
    }

    /* JADX INFO: renamed from: z */
    public static void m19302z(String str) {
        if (zurt(0)) {
            m19299s(0, m19298q(str));
        }
    }

    private static boolean zurt(int i2) {
        return i2 >= f31253k || fn3e();
    }
}
