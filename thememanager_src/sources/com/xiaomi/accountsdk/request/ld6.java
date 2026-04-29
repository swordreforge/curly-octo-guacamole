package com.xiaomi.accountsdk.request;

import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.accountsdk.request.C5549s;
import com.xiaomi.accountsdk.request.ni7;
import com.xiaomi.accountsdk.request.zurt;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: IPStrategy.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private static final String f30946k = "IPStrategy";

    /* JADX INFO: renamed from: n */
    private static qrj f30947n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static C5549s f72932toq = new C5549s();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static C5549s f72933zy = new C5549s();

    /* JADX INFO: renamed from: q */
    private static Map<String, List<String>> f30948q = new HashMap();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.ld6$k */
    /* JADX INFO: compiled from: IPStrategy.java */
    class RunnableC5542k implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C5543n f30949g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f30950k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ String f30951n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f30953q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ long f30954s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f30955y;

        RunnableC5542k(String str, String str2, String str3, C5543n c5543n, String str4, long j2) {
            this.f30950k = str;
            this.f30953q = str2;
            this.f30951n = str3;
            this.f30949g = c5543n;
            this.f30955y = str4;
            this.f30954s = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Pair<String, Long> pairX2 = ld6.this.x2(this.f30950k, new String[]{this.f30953q, this.f30951n}, this.f30949g);
            String strM18955g = ld6.this.m18955g();
            if (!TextUtils.equals(this.f30955y, strM18955g)) {
                this.f30949g.f7l8(this.f30955y, strM18955g);
                AbstractC5574n.fu4(ld6.f30946k, String.format("ping: network changed from %s to %s, will NOT update anything", this.f30955y, strM18955g));
            } else {
                if (pairX2 == null) {
                    ld6.this.ni7(this.f30950k);
                    return;
                }
                this.f30949g.m18965n(x2.m19029q());
                String str = (String) pairX2.first;
                if (((Long) pairX2.second).longValue() * x2.m19029q() < this.f30954s) {
                    ld6.this.fn3e(this.f30950k, str);
                } else {
                    ld6.this.ni7(this.f30950k);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.ld6$n */
    /* JADX INFO: compiled from: IPStrategy.java */
    static class C5543n extends C5547p {

        /* JADX INFO: renamed from: g */
        private static final long f30956g = -2;

        /* JADX INFO: renamed from: n */
        private static final long f30957n = -1;

        /* JADX INFO: renamed from: k */
        private final HashMap<String, Long> f30958k = new HashMap<>();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72934toq = null;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72935zy = null;

        /* JADX INFO: renamed from: q */
        private String f30959q = null;

        C5543n() {
        }

        public void f7l8(String str, String str2) {
            m18980q(String.format("http://dummyurl/cachedipDiagonis?_ver=%s&_netOld=%s&_netNew=%s", com.xiaomi.accountsdk.account.zy.f30810k, str, str2));
        }

        /* JADX INFO: renamed from: g */
        public void m18964g(long j2, long j3) {
            m18980q(String.format("http://dummyurl/cachedipDiagonis?_ver=%s&_time=%d&_thres=%d", com.xiaomi.accountsdk.account.zy.f30810k, Long.valueOf(j2), Long.valueOf(j3)));
        }

        public void ld6(String str) {
            this.f72934toq = str;
        }

        /* JADX INFO: renamed from: n */
        public void m18965n(long j2) {
            String str = this.f72934toq;
            String str2 = this.f72935zy;
            String str3 = this.f30959q;
            m18980q(String.format("http://dummyurl/cachedipDiagonis?_ver=%s&_coef=%d&cachedip=%s&cachediptime=%d&dnsip=%s&dnsiptime=%d&backupip0=%s&backupip0time=%d", com.xiaomi.accountsdk.account.zy.f30810k, Long.valueOf(j2), str, this.f30958k.get(str), str2, this.f30958k.get(str2), str3, this.f30958k.get(str3)));
        }

        /* JADX INFO: renamed from: p */
        public void m18966p(String str) {
            this.f30959q = str;
        }

        /* JADX INFO: renamed from: s */
        public void m18967s(String str, boolean z2, long j2) {
            HashMap<String, Long> map = this.f30958k;
            if (!z2) {
                j2 = -1;
            }
            map.put(str, Long.valueOf(j2));
        }

        public void x2(String str) {
            this.f72935zy = str;
        }

        /* JADX INFO: renamed from: y */
        public void m18968y(String str) {
            this.f30958k.put(str, -2L);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.ld6$q */
    /* JADX INFO: compiled from: IPStrategy.java */
    static class C5544q extends C5547p {
        C5544q() {
        }

        /* JADX INFO: renamed from: g */
        public void m18969g(List<String> list) {
            m18980q(String.format("http://dummyurl/backupIpDiagonose?_ver=%s&_ips=%s&_nets=%s", com.xiaomi.accountsdk.account.zy.f30810k, list == null ? null : TextUtils.join(",", list), m18979k()));
        }

        /* JADX INFO: renamed from: n */
        public void m18970n() {
            zy(C5480k.f30625s, C5480k.f30623p);
        }
    }

    /* JADX INFO: compiled from: IPStrategy.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f30960k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f30962q;

        toq(String str, String str2) {
            this.f30960k = str;
            this.f30962q = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM18955g = ld6.this.m18955g();
            if (!TextUtils.equals(this.f30960k, strM18955g)) {
                AbstractC5574n.fu4(ld6.f30946k, String.format("backupList: network changed from %s to %s, will NOT update anything", this.f30960k, strM18955g));
                new C5544q().m18970n();
            } else {
                List<String> listZy = ld6.this.zy(this.f30962q);
                new C5544q().m18969g(listZy);
                ld6.this.m18956h(this.f30962q, strM18955g, listZy);
            }
        }
    }

    /* JADX INFO: compiled from: IPStrategy.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f30963k;

        zy(String str) {
            this.f30963k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM18955g = ld6.this.m18955g();
            if (TextUtils.equals(this.f30963k, strM18955g)) {
                ld6.this.fu4();
            } else {
                AbstractC5574n.fu4(ld6.f30946k, String.format("config, network changed from %s to %s, will NOT update anything", this.f30963k, strM18955g));
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("183.84.5.8");
        arrayList.add("111.13.142.141");
        f30948q.put("c.id.mi.com", arrayList);
    }

    public static void kja0(qrj qrjVar) {
        f30947n = qrjVar;
    }

    static void qrj() {
        f72932toq = new C5549s();
        f72933zy = new C5549s();
    }

    void cdj(String str, List<String> list) {
        m18956h(str, m18955g(), list);
        t8r(str);
    }

    protected boolean f7l8(String str) {
        return m18962s(f72932toq, str, x2.m19027k());
    }

    void fn3e(String str, String str2) {
        m18957i(str, m18955g(), str2);
        ni7(str);
    }

    protected void fu4() {
        long qVar = x2.toq();
        long jM19027k = x2.m19027k();
        long jZy = x2.zy();
        long jM19029q = x2.m19029q();
        C5538i c5538i = new C5538i();
        c5538i.ld6("http://c.id.mi.com/conn/getParams");
        try {
            String strM19020s = new zurt.C5558k(c5538i).mo18922k().m19020s();
            if (TextUtils.isEmpty(strM19020s)) {
                return;
            }
            if (strM19020s.startsWith(C5502s.f72789ki)) {
                strM19020s = strM19020s.substring(11);
            }
            JSONObject jSONObject = new JSONObject(strM19020s).getJSONObject("connectivity_params");
            int iOptInt = jSONObject.optInt("backup_ip_expire", -1);
            if (iOptInt != -1) {
                jM19027k = iOptInt * 1000;
            }
            int iOptInt2 = jSONObject.optInt("cached_ip_expire", -1);
            if (iOptInt2 != -1) {
                qVar = iOptInt2 * 1000;
            }
            int iOptInt3 = jSONObject.optInt("ping_threshold", -1);
            if (iOptInt3 != -1) {
                jZy = iOptInt3;
            }
            int iOptInt4 = jSONObject.optInt("ping_time_coefficient", -1);
            if (iOptInt4 != -1) {
                jM19029q = iOptInt4;
            }
            x2.f7l8(qVar);
            x2.m19026g(jM19027k);
            x2.m19031y(jZy);
            x2.m19030s(jM19029q);
            qrj qrjVar = f30947n;
            if (qrjVar != null) {
                qrjVar.m18984g(qVar);
                f30947n.m18987n(jM19027k);
                f30947n.qrj(jZy);
                f30947n.f7l8(jM19029q);
            }
        } catch (fn3e e2) {
            AbstractC5574n.m19116z(f30946k, "updateStrategyConfigOnline", e2.getCause());
        } catch (IOException e3) {
            AbstractC5574n.m19116z(f30946k, "updateStrategyConfigOnline", e3);
        } catch (JSONException e4) {
            AbstractC5574n.m19116z(f30946k, "updateStrategyConfigOnline", e4);
        }
    }

    /* JADX INFO: renamed from: g */
    protected String m18955g() {
        qrj qrjVar = f30947n;
        if (qrjVar == null) {
            return null;
        }
        return qrjVar.ld6();
    }

    /* JADX INFO: renamed from: h */
    protected void m18956h(String str, String str2, List<String> list) {
        f72932toq.m18994n(new C5549s.k(str, str2), list);
        qrj qrjVar = f30947n;
        if (qrjVar != null) {
            qrjVar.m18985h(str, str2, list);
        }
    }

    /* JADX INFO: renamed from: i */
    protected void m18957i(String str, String str2, String str3) {
        f72933zy.m18995q(new C5549s.k(str, str2), str3);
        qrj qrjVar = f30947n;
        if (qrjVar != null) {
            qrjVar.cdj(str, str2, str3);
        }
    }

    /* JADX INFO: renamed from: k */
    protected String m18958k(String str) {
        List<String> qVar = toq(str);
        if (qVar == null || qVar.size() <= 0) {
            return null;
        }
        return qVar.get(0);
    }

    void ki(String str) {
        if (f7l8(str)) {
            String strM18955g = m18955g();
            C5556y.m19032k(new toq(strM18955g, str));
            C5556y.m19032k(new zy(strM18955g));
        }
    }

    protected Boolean ld6() {
        qrj qrjVar = f30947n;
        if (qrjVar == null) {
            return null;
        }
        return Boolean.valueOf(qrjVar.kja0());
    }

    /* JADX INFO: renamed from: n */
    String m18959n(String str, String str2) {
        InetAddress[] inetAddressArrN7h;
        InetAddress inetAddress;
        try {
            inetAddressArrN7h = n7h(str);
        } catch (UnknownHostException unused) {
        }
        if (inetAddressArrN7h == null) {
            return null;
        }
        if (inetAddressArrN7h.length == 1 && (inetAddress = inetAddressArrN7h[0]) != null) {
            return inetAddress.getHostAddress();
        }
        for (InetAddress inetAddress2 : inetAddressArrN7h) {
            if (inetAddress2 != null) {
                String hostAddress = inetAddress2.getHostAddress();
                if (!TextUtils.equals(hostAddress, str2)) {
                    return hostAddress;
                }
            }
        }
        return null;
    }

    protected InetAddress[] n7h(String str) throws UnknownHostException {
        return InetAddress.getAllByName(str);
    }

    protected void ni7(String str) {
        String strM18955g = m18955g();
        C5549s.k kVar = new C5549s.k(str, strM18955g);
        long jCurrentTimeMillis = System.currentTimeMillis();
        f72933zy.m18992g(kVar, jCurrentTimeMillis);
        qrj qrjVar = f30947n;
        if (qrjVar != null) {
            qrjVar.toq(str, strM18955g, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: p */
    boolean m18960p(long j2, long j3) {
        return Math.abs(System.currentTimeMillis() - j2) > j3;
    }

    /* JADX INFO: renamed from: q */
    String m18961q(String str) {
        qrj qrjVar;
        String strM18955g = m18955g();
        C5549s.k kVar = new C5549s.k(str, strM18955g);
        String strM18993k = f72933zy.m18993k(kVar);
        if (strM18993k == null && (qrjVar = f30947n) != null && (strM18993k = qrjVar.x2(str, strM18955g, null)) != null) {
            f72933zy.m18995q(kVar, strM18993k);
        }
        return strM18993k;
    }

    /* JADX INFO: renamed from: s */
    protected boolean m18962s(C5549s c5549s, String str, long j2) {
        Long lZy = c5549s.zy(new C5549s.k(str, m18955g()));
        if (lZy == null) {
            return true;
        }
        return m18960p(lZy.longValue(), j2);
    }

    protected void t8r(String str) {
        String strM18955g = m18955g();
        C5549s.k kVar = new C5549s.k(str, strM18955g);
        long jCurrentTimeMillis = System.currentTimeMillis();
        f72932toq.m18992g(kVar, jCurrentTimeMillis);
        qrj qrjVar = f30947n;
        if (qrjVar != null) {
            qrjVar.m18991y(str, strM18955g, jCurrentTimeMillis);
        }
    }

    List<String> toq(String str) {
        qrj qrjVar;
        String strM18955g = m18955g();
        C5549s.k kVar = new C5549s.k(str, strM18955g);
        List<String> qVar = f72932toq.toq(kVar);
        if (qVar == null && (qrjVar = f30947n) != null && (qVar = qrjVar.ki(str, strM18955g, null)) != null) {
            f72932toq.m18994n(kVar, qVar);
        }
        return qVar == null ? f30948q.get(str) : qVar;
    }

    protected Pair<String, Long> x2(String str, String[] strArr, C5543n c5543n) {
        long j2 = Long.MAX_VALUE;
        String str2 = null;
        for (String str3 : strArr) {
            try {
                ni7.C5546k c5546k = new ni7.C5546k();
                C5538i c5538i = new C5538i();
                c5538i.ld6(String.format("http://%s/conn/echo", str));
                boolean zM18972n = ni7.m18972n(new zurt.C5558k(c5538i), str, str3, c5546k);
                c5543n.m18967s(str3, zM18972n, c5546k.f72938toq);
                if (zM18972n) {
                    long j3 = c5546k.f72938toq;
                    if (j3 < j2) {
                        str2 = str3;
                        j2 = j3;
                    }
                }
            } catch (fn3e unused) {
                c5543n.m18968y(str3);
            }
        }
        if (str2 == null) {
            return null;
        }
        return Pair.create(str2, Long.valueOf(j2));
    }

    /* JADX INFO: renamed from: y */
    protected boolean m18963y(String str) {
        return m18962s(f72933zy, str, x2.toq());
    }

    void zurt(String str, String str2, long j2) {
        if (m18963y(str)) {
            C5543n c5543n = new C5543n();
            c5543n.m18967s(str2, true, j2);
            c5543n.ld6(str2);
            if (j2 <= x2.zy()) {
                c5543n.m18964g(j2, x2.zy());
                ni7(str);
                return;
            }
            String strM18959n = m18959n(str, str2);
            String strM18958k = m18958k(str);
            c5543n.x2(strM18959n);
            c5543n.m18966p(strM18958k);
            C5556y.m19032k(new RunnableC5542k(str, strM18959n, strM18958k, c5543n, m18955g(), j2));
        }
    }

    protected List<String> zy(String str) {
        JSONArray jSONArray;
        Boolean boolLd6 = ld6();
        if (boolLd6 == null) {
            return null;
        }
        C5538i c5538i = new C5538i();
        c5538i.ld6(String.format("http://resolver.msg.xiaomi.net/gslb/?ver=3.0&list=%s", str));
        try {
            JSONObject jSONObject = new JSONObject(new zurt.C5558k(c5538i).mo18922k().m19020s()).getJSONObject("R");
            JSONObject jSONObject2 = boolLd6.booleanValue() ? jSONObject.getJSONObject("wifi") : jSONObject.getJSONObject("wap");
            if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray(str)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object obj = jSONArray.get(i2);
                if (obj != null) {
                    arrayList.add(obj.toString());
                }
            }
            return arrayList;
        } catch (fn3e e2) {
            AbstractC5574n.m19116z(f30946k, "getBackupIpListOnline error, cause : ", e2.getCause());
            return null;
        } catch (IOException e3) {
            AbstractC5574n.m19116z(f30946k, "getBackupIpListOnline", e3);
            return null;
        } catch (JSONException e4) {
            AbstractC5574n.m19116z(f30946k, "getBackupIpListOnline error, cause : ", e4.getCause());
            return null;
        }
    }
}
