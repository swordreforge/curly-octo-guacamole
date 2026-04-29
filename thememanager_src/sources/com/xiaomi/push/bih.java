package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.push.ra;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.eqxt;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class bih {

    /* JADX INFO: renamed from: k */
    private static final int f32738k = kx3.PING_RTT.m21148a();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static long f73273toq = 0;

    /* JADX INFO: renamed from: com.xiaomi.push.bih$k */
    static class C5852k {

        /* JADX INFO: renamed from: k */
        static Hashtable<Integer, Long> f32739k = new Hashtable<>();
    }

    public static void f7l8(String str, int i2, Exception exc) {
        C5955w c5955wM21081k = kiv.m21078g().m21081k();
        if (kiv.m21079n() != null && kiv.m21079n().f33456k != null) {
            c5955wM21081k.m21940c(oc.ni7(kiv.m21079n().f33456k) ? 1 : 0);
        }
        if (i2 > 0) {
            c5955wM21081k.m21930a(kx3.GSLB_REQUEST_SUCCESS.m21148a());
            c5955wM21081k.m21937b(str);
            c5955wM21081k.m21936b(i2);
            kiv.m21078g().m21083s(c5955wM21081k);
            return;
        }
        try {
            ra.C5893k c5893kM21427k = ra.m21427k(exc);
            c5955wM21081k.m21930a(c5893kM21427k.f33587k.m21148a());
            c5955wM21081k.m21941c(c5893kM21427k.f73548toq);
            c5955wM21081k.m21937b(str);
            kiv.m21078g().m21083s(c5955wM21081k);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m20650g(XMPushService xMPushService, eqxt.toq toqVar) {
        new u38j(xMPushService, toqVar).toq();
    }

    /* JADX INFO: renamed from: k */
    public static void m20651k() {
        if (f73273toq == 0 || SystemClock.elapsedRealtime() - f73273toq > 7200000) {
            f73273toq = SystemClock.elapsedRealtime();
            zy(0, f32738k);
        }
    }

    public static void ld6(String str, Exception exc) {
        try {
            ra.C5893k c5893kM21428n = ra.m21428n(exc);
            C5955w c5955wM21081k = kiv.m21078g().m21081k();
            c5955wM21081k.m21930a(c5893kM21428n.f33587k.m21148a());
            c5955wM21081k.m21941c(c5893kM21428n.f73548toq);
            c5955wM21081k.m21937b(str);
            if (kiv.m21079n() != null && kiv.m21079n().f33456k != null) {
                c5955wM21081k.m21940c(oc.ni7(kiv.m21079n().f33456k) ? 1 : 0);
            }
            kiv.m21078g().m21083s(c5955wM21081k);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static synchronized void m20652n(int i2, int i3, String str, int i4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i5 = (i2 << 24) | i3;
        if (C5852k.f32739k.containsKey(Integer.valueOf(i5))) {
            C5955w c5955wM21081k = kiv.m21078g().m21081k();
            c5955wM21081k.m21930a(i3);
            c5955wM21081k.m21936b((int) (jCurrentTimeMillis - C5852k.f32739k.get(Integer.valueOf(i5)).longValue()));
            c5955wM21081k.m21937b(str);
            if (i4 > -1) {
                c5955wM21081k.m21940c(i4);
            }
            kiv.m21078g().m21083s(c5955wM21081k);
            C5852k.f32739k.remove(Integer.valueOf(i3));
        } else {
            com.xiaomi.channel.commonutils.logger.zy.jk("stats key not found");
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m20653p() {
        m20652n(0, f32738k, null, -1);
    }

    /* JADX INFO: renamed from: q */
    public static void m20654q(int i2, int i3, int i4, String str, int i5) {
        C5955w c5955wM21081k = kiv.m21078g().m21081k();
        c5955wM21081k.m21929a((byte) i2);
        c5955wM21081k.m21930a(i3);
        c5955wM21081k.m21936b(i4);
        c5955wM21081k.m21937b(str);
        c5955wM21081k.m21940c(i5);
        kiv.m21078g().m21083s(c5955wM21081k);
    }

    /* JADX INFO: renamed from: s */
    public static byte[] m20655s() {
        m2t m2tVarZy = kiv.m21078g().zy();
        if (m2tVarZy != null) {
            return qla.m21397g(m2tVarZy);
        }
        return null;
    }

    public static void toq(int i2) {
        C5955w c5955wM21081k = kiv.m21078g().m21081k();
        c5955wM21081k.m21930a(kx3.CHANNEL_STATS_COUNTER.m21148a());
        c5955wM21081k.m21940c(i2);
        kiv.m21078g().m21083s(c5955wM21081k);
    }

    /* JADX INFO: renamed from: y */
    public static void m20656y(String str, Exception exc) {
        try {
            ra.C5893k c5893kZy = ra.zy(exc);
            C5955w c5955wM21081k = kiv.m21078g().m21081k();
            c5955wM21081k.m21930a(c5893kZy.f33587k.m21148a());
            c5955wM21081k.m21941c(c5893kZy.f73548toq);
            c5955wM21081k.m21937b(str);
            if (kiv.m21079n() != null && kiv.m21079n().f33456k != null) {
                c5955wM21081k.m21940c(oc.ni7(kiv.m21079n().f33456k) ? 1 : 0);
            }
            kiv.m21078g().m21083s(c5955wM21081k);
        } catch (NullPointerException unused) {
        }
    }

    public static synchronized void zy(int i2, int i3) {
        if (i3 < 16777215) {
            C5852k.f32739k.put(Integer.valueOf((i2 << 24) | i3), Long.valueOf(System.currentTimeMillis()));
        } else {
            com.xiaomi.channel.commonutils.logger.zy.jk("stats key should less than 16777215");
        }
    }
}
