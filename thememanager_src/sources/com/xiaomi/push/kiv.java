package com.xiaomi.push;

import com.xiaomi.push.dd;
import com.xiaomi.push.owi;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class kiv {

    /* JADX INFO: renamed from: k */
    private String f33122k;

    /* JADX INFO: renamed from: n */
    private nnh f33123n;

    /* JADX INFO: renamed from: q */
    private long f33124q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f73397zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f73396toq = false;

    /* JADX INFO: renamed from: g */
    private dd f33121g = dd.toq();

    /* JADX INFO: renamed from: com.xiaomi.push.kiv$k */
    static class C5873k {

        /* JADX INFO: renamed from: k */
        static final kiv f33125k = new kiv();
    }

    private void f7l8() {
        if (!this.f73396toq || System.currentTimeMillis() - this.f33124q <= this.f73397zy) {
            return;
        }
        this.f73396toq = false;
        this.f33124q = 0L;
    }

    /* JADX INFO: renamed from: g */
    public static kiv m21078g() {
        return C5873k.f33125k;
    }

    /* JADX INFO: renamed from: n */
    public static nnh m21079n() {
        nnh nnhVar;
        kiv kivVar = C5873k.f33125k;
        synchronized (kivVar) {
            nnhVar = kivVar.f33123n;
        }
        return nnhVar;
    }

    /* JADX INFO: renamed from: q */
    private m2t m21080q(int i2) {
        ArrayList arrayList = new ArrayList();
        m2t m2tVar = new m2t(this.f33122k, arrayList);
        if (!oc.m21365z(this.f33123n.f33456k)) {
            m2tVar.m21262a(m8.m21281t(this.f33123n.f33456k));
        }
        eu euVar = new eu(i2);
        ip ipVarMo20817a = new owi.C5888k().mo20817a(euVar);
        try {
            m2tVar.mo20561b(ipVarMo20817a);
        } catch (sb unused) {
        }
        LinkedList<dd.C5859k> linkedListZy = this.f33121g.zy();
        while (linkedListZy.size() > 0) {
            try {
                C5955w qVar = toq(linkedListZy.getLast());
                if (qVar != null) {
                    qVar.mo20561b(ipVarMo20817a);
                }
                if (euVar.m20818y() > i2) {
                    break;
                }
                if (qVar != null) {
                    arrayList.add(qVar);
                }
                linkedListZy.removeLast();
            } catch (sb | NoSuchElementException unused2) {
            }
        }
        return m2tVar;
    }

    private C5955w toq(dd.C5859k c5859k) {
        if (c5859k.f32803k == 0) {
            Object obj = c5859k.f73309zy;
            if (obj instanceof C5955w) {
                return (C5955w) obj;
            }
            return null;
        }
        C5955w c5955wM21081k = m21081k();
        c5955wM21081k.m21930a(kx3.CHANNEL_STATS_COUNTER.m21148a());
        c5955wM21081k.m21940c(c5859k.f32803k);
        c5955wM21081k.m21941c(c5859k.f73308toq);
        return c5955wM21081k;
    }

    /* JADX INFO: renamed from: k */
    synchronized C5955w m21081k() {
        C5955w c5955w;
        c5955w = new C5955w();
        c5955w.m21931a(oc.m21360p(this.f33123n.f33456k));
        c5955w.f34066a = (byte) 0;
        c5955w.f34070b = 1;
        c5955w.m21944d((int) (System.currentTimeMillis() / 1000));
        return c5955w;
    }

    public boolean ld6() {
        return this.f73396toq;
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m21082p(XMPushService xMPushService) {
        this.f33123n = new nnh(xMPushService);
        this.f33122k = "";
        com.xiaomi.push.service.nn86.m21710g().ld6(new z4t(this));
    }

    /* JADX INFO: renamed from: s */
    synchronized void m21083s(C5955w c5955w) {
        this.f33121g.m20724n(c5955w);
    }

    boolean x2() {
        f7l8();
        return this.f73396toq && this.f33121g.m20723k() > 0;
    }

    /* JADX INFO: renamed from: y */
    public void m21084y(int i2) {
        if (i2 > 0) {
            int i3 = i2 * 1000;
            if (i3 > 604800000) {
                i3 = 604800000;
            }
            if (this.f73397zy == i3 && this.f73396toq) {
                return;
            }
            this.f73396toq = true;
            this.f33124q = System.currentTimeMillis();
            this.f73397zy = i3;
            com.xiaomi.channel.commonutils.logger.zy.m19300t("enable dot duration = " + i3 + " start = " + this.f33124q);
        }
    }

    synchronized m2t zy() {
        m2t m2tVarM21080q;
        m2tVarM21080q = null;
        if (x2()) {
            m2tVarM21080q = m21080q(oc.m21365z(this.f33123n.f33456k) ? 750 : 375);
        }
        return m2tVarM21080q;
    }
}
