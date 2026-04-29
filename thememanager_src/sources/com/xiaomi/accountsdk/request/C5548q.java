package com.xiaomi.accountsdk.request;

import android.os.SystemClock;
import com.xiaomi.accountsdk.account.C5500p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.request.q */
/* JADX INFO: compiled from: CALoginStatHelper.java */
/* JADX INFO: loaded from: classes3.dex */
class C5548q extends fu4 {

    /* JADX INFO: renamed from: k */
    final k f30970k = new k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final k f72939toq = new k();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final Map<Integer, k> f72940zy = new LinkedHashMap();

    /* JADX INFO: renamed from: q */
    final k f30972q = new k();

    /* JADX INFO: renamed from: n */
    final k f30971n = new k();

    /* JADX INFO: renamed from: g */
    final k f30969g = new k();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.q$k */
    /* JADX INFO: compiled from: CALoginStatHelper.java */
    static class k {

        /* JADX INFO: renamed from: k */
        String f30973k = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Long f72941toq = null;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Long f72942zy = null;

        /* JADX INFO: renamed from: q */
        Boolean f30974q = null;

        k() {
        }

        /* JADX INFO: renamed from: k */
        void m18982k(boolean z2) {
            this.f30974q = Boolean.valueOf(z2);
            this.f72942zy = Long.valueOf(SystemClock.elapsedRealtime());
        }

        /* JADX INFO: renamed from: q */
        String m18983q(Long l2) {
            if (l2 == null) {
                l2 = 0L;
            }
            Long l3 = this.f72941toq;
            if (l3 != null && this.f72942zy != null) {
                return String.format("%d_%d", Long.valueOf(l3.longValue() - l2.longValue()), Long.valueOf(this.f72942zy.longValue() - l2.longValue()));
            }
            if (l3 != null) {
                return String.format("%d_", Long.valueOf(l3.longValue() - l2.longValue()));
            }
            Long l4 = this.f72942zy;
            if (l4 != null) {
                return String.format("_%d", Long.valueOf(l4.longValue() - l2.longValue()));
            }
            return null;
        }

        String toq() {
            Boolean bool = this.f30974q;
            if (bool == null) {
                return null;
            }
            return bool.booleanValue() ? "1" : "0";
        }

        void zy(String str) {
            this.f30973k = str;
            this.f72941toq = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    C5548q() {
    }

    private final k fu4(int i2) {
        k kVar = this.f72940zy.get(Integer.valueOf(i2));
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k();
        this.f72940zy.put(Integer.valueOf(i2), kVar2);
        return kVar2;
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void cdj(boolean z2) {
        this.f30972q.m18982k(z2);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void f7l8(int i2, String str) {
        fu4(i2).zy(str);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: g */
    public void mo18925g(int i2) {
        fu4(i2).m18982k(false);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: h */
    public void mo18926h(String str) {
        this.f72939toq.zy(str);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void ki() {
        this.f30972q.zy(null);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void kja0() {
        this.f30971n.zy(null);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void ld6() {
        this.f30970k.m18982k(true);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: n */
    public void mo18931n() {
        this.f30969g.m18982k(o1t());
        m18980q(m18981z());
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void n7h(String str) {
        this.f30971n.m18982k(str != null);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void ni7() {
        this.f30969g.zy(null);
    }

    final boolean o1t() {
        Boolean bool = this.f30970k.f30974q;
        boolean z2 = (bool != null && bool.booleanValue()) | false;
        Boolean bool2 = this.f72939toq.f30974q;
        boolean z3 = z2 | (bool2 != null && bool2.booleanValue());
        Boolean bool3 = this.f30972q.f30974q;
        boolean z5 = z3 | (bool3 != null && bool3.booleanValue());
        Iterator<k> it = this.f72940zy.values().iterator();
        while (it.hasNext()) {
            Boolean bool4 = it.next().f30974q;
            z5 |= bool4 != null && bool4.booleanValue();
        }
        return z5;
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: p */
    public void mo18928p(String str) {
        this.f30970k.zy(str);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void qrj() {
        this.f72939toq.m18982k(true);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: s */
    public void mo18929s() {
        this.f30970k.m18982k(false);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    public void x2() {
        this.f72939toq.m18982k(false);
    }

    @Override // com.xiaomi.accountsdk.request.fu4
    /* JADX INFO: renamed from: y */
    public void mo18930y(int i2) {
        fu4(i2).m18982k(true);
    }

    /* JADX INFO: renamed from: z */
    final String m18981z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("c_ip", this.f30970k.f30973k);
        linkedHashMap.put("c_t", this.f30970k.m18983q(this.f30969g.f72941toq));
        linkedHashMap.put("c_r", this.f30970k.toq());
        linkedHashMap.put("r_t", this.f30971n.m18983q(this.f30969g.f72941toq));
        linkedHashMap.put("d_ip", this.f72939toq.f30973k);
        linkedHashMap.put("d_t", this.f72939toq.m18983q(this.f30969g.f72941toq));
        linkedHashMap.put("d_r", this.f72939toq.toq());
        for (Integer num : this.f72940zy.keySet()) {
            k kVar = this.f72940zy.get(num);
            if (kVar == null) {
                throw new NullPointerException("should no be null here");
            }
            String str = "b" + num + "_";
            linkedHashMap.put(str + "ip", kVar.f30973k);
            linkedHashMap.put(str + "t", kVar.m18983q(this.f30969g.f72941toq));
            linkedHashMap.put(str + "r", kVar.toq());
        }
        linkedHashMap.put("h_t", this.f30972q.m18983q(this.f30969g.f72941toq));
        linkedHashMap.put("h_r", this.f30972q.toq());
        k kVar2 = this.f30969g;
        linkedHashMap.put("all_t", kVar2.m18983q(kVar2.f72941toq));
        linkedHashMap.put("all_r", this.f30969g.toq());
        linkedHashMap.put("hdid", new com.xiaomi.accountsdk.hasheddeviceidlib.zy(C5500p.toq()).zy());
        StringBuffer stringBuffer = new StringBuffer("http://dummyurl/caLoginDiagnosis?");
        stringBuffer.append("_ver");
        stringBuffer.append('=');
        stringBuffer.append(com.xiaomi.accountsdk.account.zy.f30810k);
        for (String str2 : linkedHashMap.keySet()) {
            String str3 = (String) linkedHashMap.get(str2);
            if (str2 != null && str3 != null) {
                stringBuffer.append("&");
                stringBuffer.append(str2);
                stringBuffer.append('=');
                stringBuffer.append(str3);
            }
        }
        return stringBuffer.toString();
    }
}
