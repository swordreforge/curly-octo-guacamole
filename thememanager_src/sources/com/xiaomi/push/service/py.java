package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.C0846k;
import com.xiaomi.push.C5872k;
import com.xiaomi.push.brv;
import com.xiaomi.push.gb;
import com.xiaomi.push.kl7m;
import com.xiaomi.push.nc;
import com.xiaomi.push.oph;
import com.xiaomi.push.uf;
import com.xiaomi.push.uo;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class py {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile py f73653n7h;

    /* JADX INFO: renamed from: k */
    private final SharedPreferences f33877k;

    /* JADX INFO: renamed from: p */
    private final boolean f33879p;

    /* JADX INFO: renamed from: s */
    private final boolean f33881s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final Context f73658x2;

    /* JADX INFO: renamed from: y */
    private long f33882y;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AtomicInteger f73657toq = new AtomicInteger(0);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f73659zy = null;

    /* JADX INFO: renamed from: q */
    private volatile boolean f33880q = false;

    /* JADX INFO: renamed from: n */
    private String f33878n = null;

    /* JADX INFO: renamed from: g */
    private final AtomicInteger f33876g = new AtomicInteger(0);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final AtomicInteger f73654f7l8 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f73655ld6 = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f73656qrj = -1;

    /* JADX INFO: renamed from: com.xiaomi.push.service.py$k */
    private static class C5934k {
        public static String f7l8() {
            return "record_long_hb_count";
        }

        /* JADX INFO: renamed from: g */
        public static String m21731g() {
            return "record_short_hb_count";
        }

        /* JADX INFO: renamed from: k */
        public static String m21732k() {
            return "support_wifi_digest";
        }

        public static String ld6() {
            return "record_ptc_start";
        }

        /* JADX INFO: renamed from: n */
        public static String m21733n() {
            return "record_hb_count_start";
        }

        /* JADX INFO: renamed from: p */
        public static String m21734p() {
            return "record_wifi_ptc";
        }

        /* JADX INFO: renamed from: q */
        public static String m21735q(String str) {
            return String.format("HB_dead_time_%s", str);
        }

        /* JADX INFO: renamed from: s */
        public static String m21736s() {
            return "record_mobile_ptc";
        }

        public static String toq(String str) {
            return String.format("HB_%s", str);
        }

        public static String x2() {
            return "keep_short_hb_effective_time";
        }

        /* JADX INFO: renamed from: y */
        public static String m21737y() {
            return "record_hb_change";
        }

        public static String zy() {
            return "record_support_wifi_digest_reported_time";
        }
    }

    private py(Context context) {
        this.f73658x2 = context;
        this.f33879p = nc.m21313p(context);
        this.f33881s = a9.m21550q(context).qrj(oph.IntelligentHeartbeatSwitchBoolean.m21370a(), true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f33877k = sharedPreferences;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(C5934k.m21733n(), -1L) == -1) {
            sharedPreferences.edit().putLong(C5934k.m21733n(), jCurrentTimeMillis).apply();
        }
        long j2 = sharedPreferences.getLong(C5934k.ld6(), -1L);
        this.f33882y = j2;
        if (j2 == -1) {
            this.f33882y = jCurrentTimeMillis;
            sharedPreferences.edit().putLong(C5934k.ld6(), jCurrentTimeMillis).apply();
        }
    }

    private void fu4() {
        if (this.f33877k.getBoolean(C5934k.m21732k(), false)) {
            return;
        }
        this.f33877k.edit().putBoolean(C5934k.m21732k(), true).apply();
    }

    /* JADX INFO: renamed from: h */
    private long m21720h() {
        return this.f33877k.getLong(C5934k.x2(), -1L);
    }

    /* JADX INFO: renamed from: i */
    private long m21721i() {
        return a9.m21550q(this.f73658x2).zy(oph.ShortHeartbeatEffectivePeriodMsLong.m21370a(), 777600000L);
    }

    /* JADX INFO: renamed from: k */
    private int m21722k() {
        if (TextUtils.isEmpty(this.f73659zy)) {
            return -1;
        }
        try {
            return this.f33877k.getInt(C5934k.toq(this.f73659zy), -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private void ki(String str) {
        if (ld6(str)) {
            this.f33877k.edit().putInt(C5934k.toq(str), 235000).apply();
            this.f33877k.edit().putLong(C5934k.m21735q(this.f73659zy), System.currentTimeMillis() + m21721i()).apply();
        }
    }

    private boolean kja0() {
        return (TextUtils.isEmpty(this.f73659zy) || !this.f73659zy.startsWith("M-") || a9.m21550q(this.f73658x2).qrj(oph.IntelligentHeartbeatUseInMobileNetworkBoolean.m21370a(), false)) ? false : true;
    }

    private boolean ld6(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    private void n7h(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = this.f73659zy;
            if (str2 == null || !str2.startsWith("W-")) {
                this.f73659zy = null;
            }
        } else {
            this.f73659zy = str;
        }
        int i2 = this.f33877k.getInt(C5934k.toq(this.f73659zy), -1);
        long j2 = this.f33877k.getLong(C5934k.m21735q(this.f73659zy), -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i2 != -1) {
            if (j2 == -1) {
                this.f33877k.edit().putLong(C5934k.m21735q(this.f73659zy), jCurrentTimeMillis + m21721i()).apply();
            } else if (jCurrentTimeMillis > j2) {
                this.f33877k.edit().remove(C5934k.toq(this.f73659zy)).remove(C5934k.m21735q(this.f73659zy)).apply();
            }
        }
        this.f73657toq.getAndSet(0);
        if (TextUtils.isEmpty(this.f73659zy) || m21722k() != -1) {
            this.f33880q = false;
        } else {
            this.f33880q = true;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("[HB] network changed, netid:%s, %s", this.f73659zy, Boolean.valueOf(this.f33880q)));
    }

    private boolean ni7() {
        return this.f33879p && (this.f33881s || ((m21720h() > System.currentTimeMillis() ? 1 : (m21720h() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    private void o1t() {
        int i2 = this.f73655ld6;
        String strM21734p = i2 != 0 ? i2 != 1 ? null : C5934k.m21734p() : C5934k.m21736s();
        if (TextUtils.isEmpty(strM21734p)) {
            return;
        }
        if (this.f33877k.getLong(C5934k.ld6(), -1L) == -1) {
            this.f33882y = System.currentTimeMillis();
            this.f33877k.edit().putLong(C5934k.ld6(), this.f33882y).apply();
        }
        this.f33877k.edit().putInt(strM21734p, this.f33877k.getInt(strM21734p, 0) + 1).apply();
    }

    /* JADX INFO: renamed from: p */
    private boolean m21723p() {
        return this.f73657toq.get() >= Math.max(a9.m21550q(this.f73658x2).m21553k(oph.IntelligentHeartbeatNATCountInt.m21370a(), 5), 3);
    }

    /* JADX INFO: renamed from: s */
    private void m21724s(boolean z2) {
        if (t8r()) {
            int iIncrementAndGet = (z2 ? this.f33876g : this.f73654f7l8).incrementAndGet();
            Object[] objArr = new Object[2];
            objArr[0] = z2 ? "short" : "long";
            objArr[1] = Integer.valueOf(iIncrementAndGet);
            com.xiaomi.channel.commonutils.logger.zy.m19302z(String.format("[HB] %s ping interval count: %s", objArr));
            if (iIncrementAndGet >= 5) {
                String strM21731g = z2 ? C5934k.m21731g() : C5934k.f7l8();
                int i2 = this.f33877k.getInt(strM21731g, 0) + iIncrementAndGet;
                this.f33877k.edit().putInt(strM21731g, i2).apply();
                Object[] objArr2 = new Object[2];
                objArr2[0] = z2 ? "short" : "long";
                objArr2[1] = Integer.valueOf(i2);
                com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("[HB] accumulate %s hb count(%s) and write to file. ", objArr2));
                if (z2) {
                    this.f33876g.set(0);
                } else {
                    this.f73654f7l8.set(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private void m21725t() {
        int i2;
        String[] strArrSplit;
        String[] strArrSplit2;
        if (t8r()) {
            String string = this.f33877k.getString(C5934k.m21737y(), null);
            char c2 = 1;
            char c3 = 0;
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split("###")) != null) {
                int i3 = 0;
                while (i3 < strArrSplit.length) {
                    if (!TextUtils.isEmpty(strArrSplit[i3]) && (strArrSplit2 = strArrSplit[i3].split(":::")) != null && strArrSplit2.length >= 4) {
                        String str = strArrSplit2[c3];
                        String str2 = strArrSplit2[c2];
                        String str3 = strArrSplit2[2];
                        String str4 = strArrSplit2[3];
                        HashMap map = new HashMap();
                        map.put("event", "change");
                        map.put("model", Build.MODEL);
                        map.put("net_type", str2);
                        map.put("net_name", str);
                        map.put("interval", str3);
                        map.put("timestamp", str4);
                        m21726y("category_hb_change", null, map);
                        com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] report hb changed events.");
                    }
                    i3++;
                    c2 = 1;
                    c3 = 0;
                }
                this.f33877k.edit().remove(C5934k.m21737y()).apply();
            }
            if (this.f33877k.getBoolean(C5934k.m21732k(), false)) {
                long j2 = this.f33877k.getLong(C5934k.zy(), 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j2 > 1296000000) {
                    HashMap map2 = new HashMap();
                    map2.put("event", "support");
                    map2.put("model", Build.MODEL);
                    map2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                    m21726y("category_hb_change", null, map2);
                    com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] report support wifi digest events.");
                    this.f33877k.edit().putLong(C5934k.zy(), jCurrentTimeMillis).apply();
                }
            }
            if (m21727z()) {
                int i4 = this.f33877k.getInt(C5934k.m21731g(), 0);
                int i5 = this.f33877k.getInt(C5934k.f7l8(), 0);
                if (i4 > 0 || i5 > 0) {
                    long j3 = this.f33877k.getLong(C5934k.m21733n(), -1L);
                    String strValueOf = String.valueOf(235000);
                    String strValueOf2 = String.valueOf(j3);
                    String strValueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("interval", strValueOf);
                        jSONObject.put("c_short", String.valueOf(i4));
                        jSONObject.put("c_long", String.valueOf(i5));
                        jSONObject.put("count", String.valueOf(i4 + i5));
                        jSONObject.put("start_time", strValueOf2);
                        jSONObject.put("end_time", strValueOf3);
                        String string2 = jSONObject.toString();
                        HashMap map3 = new HashMap();
                        map3.put("event", "long_and_short_hb_count");
                        m21726y("category_hb_count", string2, map3);
                        com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f33877k.edit().putInt(C5934k.m21731g(), 0).putInt(C5934k.f7l8(), 0).putLong(C5934k.m21733n(), System.currentTimeMillis()).apply();
            }
            if (wvg()) {
                String strValueOf4 = String.valueOf(this.f33882y);
                String strValueOf5 = String.valueOf(System.currentTimeMillis());
                int i6 = this.f33877k.getInt(C5934k.m21736s(), 0);
                if (i6 > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("net_type", "M");
                        jSONObject2.put("ptc", i6);
                        jSONObject2.put("start_time", strValueOf4);
                        jSONObject2.put("end_time", strValueOf5);
                        String string3 = jSONObject2.toString();
                        HashMap map4 = new HashMap();
                        map4.put("event", "ptc_event");
                        m21726y("category_lc_ptc", string3, map4);
                        com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] report ping timeout count events of mobile network.");
                        this.f33877k.edit().putInt(C5934k.m21736s(), 0).apply();
                        i2 = 0;
                    } catch (Throwable unused2) {
                        i2 = 0;
                        this.f33877k.edit().putInt(C5934k.m21736s(), 0).apply();
                    }
                } else {
                    i2 = 0;
                }
                int i7 = this.f33877k.getInt(C5934k.m21734p(), i2);
                if (i7 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("net_type", C0846k.ae4);
                        jSONObject3.put("ptc", i7);
                        jSONObject3.put("start_time", strValueOf4);
                        jSONObject3.put("end_time", strValueOf5);
                        String string4 = jSONObject3.toString();
                        HashMap map5 = new HashMap();
                        map5.put("event", "ptc_event");
                        m21726y("category_lc_ptc", string4, map5);
                        com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f33877k.edit().putInt(C5934k.m21734p(), 0).apply();
                }
                this.f33882y = System.currentTimeMillis();
                this.f33877k.edit().putLong(C5934k.ld6(), this.f33882y).apply();
            }
        }
    }

    private boolean t8r() {
        return ni7() && a9.m21550q(this.f73658x2).qrj(oph.IntelligentHeartbeatDataCollectSwitchBoolean.m21370a(), true) && brv.China.name().equals(C5926m.m21688k(this.f73658x2).toq());
    }

    private boolean wvg() {
        if (this.f33882y == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f33882y;
        return j2 > jCurrentTimeMillis || jCurrentTimeMillis - j2 >= 259200000;
    }

    /* JADX INFO: renamed from: y */
    private void m21726y(String str, String str2, Map<String, String> map) {
        kl7m kl7mVar = new kl7m();
        kl7mVar.m21126d(str);
        kl7mVar.m21122c("hb_name");
        kl7mVar.m21107a("hb_channel");
        kl7mVar.m21106a(1L);
        kl7mVar.m21118b(str2);
        kl7mVar.m21109a(false);
        kl7mVar.m21117b(System.currentTimeMillis());
        kl7mVar.m21134g(this.f73658x2.getPackageName());
        kl7mVar.m21129e("com.xiaomi.xmsf");
        if (map == null) {
            map = new HashMap<>();
        }
        String str3 = null;
        v0af qVar = etdu.toq(this.f73658x2);
        if (qVar != null && !TextUtils.isEmpty(qVar.f33918k)) {
            String[] strArrSplit = qVar.f33918k.split("@");
            if (strArrSplit.length > 0) {
                str3 = strArrSplit[0];
            }
        }
        map.put("uuid", str3);
        map.put("model", Build.MODEL);
        Context context = this.f73658x2;
        map.put("avc", String.valueOf(uf.toq(context, context.getPackageName())));
        map.put("pvc", String.valueOf(C5872k.f33109n));
        map.put("cvc", String.valueOf(48));
        kl7mVar.m21108a(map);
        uo uoVarM21870k = uo.m21870k(this.f73658x2);
        if (uoVarM21870k != null) {
            uoVarM21870k.m21871n(kl7mVar, this.f73658x2.getPackageName());
        }
    }

    /* JADX INFO: renamed from: z */
    private boolean m21727z() {
        long j2 = this.f33877k.getLong(C5934k.m21733n(), -1L);
        if (j2 == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j2 > jCurrentTimeMillis || jCurrentTimeMillis - j2 >= 259200000;
    }

    private void zurt(String str) {
        String str2;
        String string;
        if (t8r() && !TextUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = C0846k.ae4;
            } else if (!str.startsWith("M-")) {
                return;
            } else {
                str2 = "M";
            }
            String strValueOf = String.valueOf(235000);
            String strValueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":::");
            sb.append(str2);
            sb.append(":::");
            sb.append(strValueOf);
            sb.append(":::");
            sb.append(strValueOf2);
            String string2 = this.f33877k.getString(C5934k.m21737y(), null);
            if (TextUtils.isEmpty(string2)) {
                string = sb.toString();
            } else {
                string = string2 + "###" + sb.toString();
            }
            this.f33877k.edit().putString(C5934k.m21737y(), string).apply();
        }
    }

    public static py zy(Context context) {
        if (f73653n7h == null) {
            synchronized (py.class) {
                if (f73653n7h == null) {
                    f73653n7h = new py(context);
                }
            }
        }
        return f73653n7h;
    }

    public void cdj() {
        if (ni7()) {
            this.f33878n = this.f73659zy;
        }
    }

    public synchronized void f7l8(String str) {
        if (!TextUtils.isEmpty(str)) {
            fu4();
        }
        if (ni7() && !TextUtils.isEmpty(str)) {
            n7h("W-" + str);
        }
    }

    public void fn3e() {
        if (ni7()) {
            m21725t();
            if (this.f33880q) {
                this.f73657toq.getAndSet(0);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m21728g(com.xiaomi.push.lvui lvuiVar) {
        if (ni7()) {
            String str = null;
            if (lvuiVar == null) {
                n7h(null);
                this.f73655ld6 = -1;
            } else if (lvuiVar.m21210k() == 0) {
                String strM21213y = lvuiVar.m21213y();
                if (!TextUtils.isEmpty(strM21213y) && !"UNKNOWN".equalsIgnoreCase(strM21213y)) {
                    str = "M-" + strM21213y;
                }
                n7h(str);
                this.f73655ld6 = 0;
            } else if (lvuiVar.m21210k() == 1 || lvuiVar.m21210k() == 6) {
                n7h("WIFI-ID-UNKNOWN");
                this.f73655ld6 = 1;
            } else {
                n7h(null);
                this.f73655ld6 = -1;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m21729n(int i2) {
        this.f33877k.edit().putLong(C5934k.x2(), System.currentTimeMillis() + ((long) (i2 * 1000))).apply();
    }

    /* JADX INFO: renamed from: q */
    public void m21730q() {
    }

    public void qrj() {
        if (ni7()) {
            o1t();
            if (this.f33880q && !TextUtils.isEmpty(this.f73659zy) && this.f73659zy.equals(this.f33878n)) {
                this.f73657toq.getAndIncrement();
                com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] ping timeout count:" + this.f73657toq);
                if (m21723p()) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] change hb interval for net:" + this.f73659zy);
                    ki(this.f73659zy);
                    this.f33880q = false;
                    this.f73657toq.getAndSet(0);
                    zurt(this.f73659zy);
                }
            }
        }
    }

    public long toq() {
        int iM21722k;
        long jM20892g = gb.m20892g();
        if (this.f33879p && !kja0() && ((a9.m21550q(this.f73658x2).qrj(oph.IntelligentHeartbeatSwitchBoolean.m21370a(), true) || m21720h() >= System.currentTimeMillis()) && (iM21722k = m21722k()) != -1)) {
            jM20892g = iM21722k;
        }
        if (!TextUtils.isEmpty(this.f73659zy) && !"WIFI-ID-UNKNOWN".equals(this.f73659zy) && this.f73655ld6 == 1) {
            m21724s(jM20892g < 300000);
        }
        this.f73656qrj = jM20892g;
        com.xiaomi.channel.commonutils.logger.zy.kja0("[HB] ping interval:" + jM20892g);
        return jM20892g;
    }

    public long x2() {
        return this.f73656qrj;
    }
}
