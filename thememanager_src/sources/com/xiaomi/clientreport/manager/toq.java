package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.xiaomi.clientreport.data.C5623k;
import com.xiaomi.clientreport.data.C5625q;
import com.xiaomi.clientreport.processor.InterfaceC5634k;
import com.xiaomi.push.C5851b;
import com.xiaomi.push.C5871j;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.RunnableC5885o;
import com.xiaomi.push.ek5k;
import com.xiaomi.push.hb;
import com.xiaomi.push.n5r1;
import com.xiaomi.push.nc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: p */
    private static volatile toq f31290p;

    /* JADX INFO: renamed from: s */
    private static final int f31291s;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private InterfaceC5634k f73114f7l8;

    /* JADX INFO: renamed from: g */
    private String f31292g;

    /* JADX INFO: renamed from: n */
    private C5623k f31294n;

    /* JADX INFO: renamed from: q */
    private Context f31295q;

    /* JADX INFO: renamed from: y */
    private com.xiaomi.clientreport.processor.toq f31296y;

    /* JADX INFO: renamed from: k */
    private ExecutorService f31293k = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private HashMap<String, HashMap<String, C5625q>> f73115toq = new HashMap<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private HashMap<String, ArrayList<C5625q>> f73116zy = new HashMap<>();

    static {
        f31291s = nc.m21315s() ? 30 : 10;
    }

    private toq(Context context) {
        this.f31295q = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int cdj() {
        HashMap<String, HashMap<String, C5625q>> map = this.f73115toq;
        int i2 = 0;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, C5625q> map2 = this.f73115toq.get(it.next());
                if (map2 != null) {
                    Iterator<String> it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        C5625q c5625q = map2.get(it2.next());
                        if (c5625q instanceof com.xiaomi.clientreport.data.zy) {
                            i2 = (int) (((long) i2) + ((com.xiaomi.clientreport.data.zy) c5625q).f31279s);
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e(com.xiaomi.clientreport.data.zy zyVar) {
        com.xiaomi.clientreport.processor.toq toqVar = this.f31296y;
        if (toqVar != null) {
            toqVar.zy(zyVar);
            if (cdj() < 10) {
                n7h(new f7l8(this), f31291s);
            } else {
                m19329z();
                C5889p.toq(this.f31295q).qrj("100889");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fu4() {
        try {
            this.f73114f7l8.mo19342b();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("we: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m19326i(com.xiaomi.clientreport.data.toq toqVar) {
        InterfaceC5634k interfaceC5634k = this.f73114f7l8;
        if (interfaceC5634k != null) {
            interfaceC5634k.zy(toqVar);
            if (m19327k() < 10) {
                n7h(new C5628n(this), f31291s);
            } else {
                fu4();
                C5889p.toq(this.f31295q).qrj("100888");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public int m19327k() {
        HashMap<String, ArrayList<C5625q>> map = this.f73116zy;
        if (map == null) {
            return 0;
        }
        Iterator<String> it = map.keySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            ArrayList<C5625q> arrayList = this.f73116zy.get(it.next());
            size += arrayList != null ? arrayList.size() : 0;
        }
        return size;
    }

    /* JADX INFO: renamed from: n */
    public static toq m19328n(Context context) {
        if (f31290p == null) {
            synchronized (toq.class) {
                if (f31290p == null) {
                    f31290p = new toq(context);
                }
            }
        }
        return f31290p;
    }

    private void n7h(C5889p.k kVar, int i2) {
        C5889p.toq(this.f31295q).n7h(kVar, i2);
    }

    private void o1t() {
        if (m19328n(this.f31295q).zy().f7l8()) {
            hb hbVar = new hb(this.f31295q);
            int iZy = (int) m19328n(this.f31295q).zy().zy();
            if (iZy < 1800) {
                iZy = 1800;
            }
            if (System.currentTimeMillis() - C5851b.toq(this.f31295q).m20620k("sp_client_report_status", "event_last_upload_time", 0L) > iZy * 1000) {
                C5889p.toq(this.f31295q).m21378y(new RunnableC5631s(this, hbVar), 10);
            }
            synchronized (toq.class) {
                if (!C5889p.toq(this.f31295q).m21376p(hbVar, iZy)) {
                    C5889p.toq(this.f31295q).qrj("100886");
                    C5889p.toq(this.f31295q).m21376p(hbVar, iZy);
                }
            }
        }
    }

    private void wvg() {
        if (m19328n(this.f31295q).zy().m19307y()) {
            C5871j c5871j = new C5871j(this.f31295q);
            int iM19305n = (int) m19328n(this.f31295q).zy().m19305n();
            if (iM19305n < 1800) {
                iM19305n = 1800;
            }
            if (System.currentTimeMillis() - C5851b.toq(this.f31295q).m20620k("sp_client_report_status", "perf_last_upload_time", 0L) > iM19305n * 1000) {
                C5889p.toq(this.f31295q).m21378y(new RunnableC5629p(this, c5871j), 15);
            }
            synchronized (toq.class) {
                if (!C5889p.toq(this.f31295q).m21376p(c5871j, iM19305n)) {
                    C5889p.toq(this.f31295q).qrj("100887");
                    C5889p.toq(this.f31295q).m21376p(c5871j, iM19305n);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m19329z() {
        try {
            this.f31296y.mo19342b();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("wp: " + e2.getMessage());
        }
    }

    public void f7l8() {
        m19328n(this.f31295q).o1t();
        m19328n(this.f31295q).wvg();
    }

    /* JADX INFO: renamed from: h */
    public void m19330h(boolean z2, boolean z3, long j2, long j3) {
        C5623k c5623k = this.f31294n;
        if (c5623k != null) {
            if (z2 == c5623k.f7l8() && z3 == this.f31294n.m19307y() && j2 == this.f31294n.zy() && j3 == this.f31294n.m19305n()) {
                return;
            }
            long jZy = this.f31294n.zy();
            long jM19305n = this.f31294n.m19305n();
            C5623k c5623kM19314y = C5623k.toq().m19313s(ek5k.toq(this.f31295q)).m19312p(this.f31294n.m19304g()).x2(z2).ld6(j2).kja0(z3).n7h(j3).m19314y(this.f31295q);
            this.f31294n = c5623kM19314y;
            if (!c5623kM19314y.f7l8()) {
                C5889p.toq(this.f31295q).qrj("100886");
            } else if (jZy != c5623kM19314y.zy()) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t(this.f31295q.getPackageName() + "reset event job " + c5623kM19314y.zy());
                o1t();
            }
            if (!this.f31294n.m19307y()) {
                C5889p.toq(this.f31295q).qrj("100887");
                return;
            }
            if (jM19305n != c5623kM19314y.m19305n()) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t(this.f31295q.getPackageName() + " reset perf job " + c5623kM19314y.m19305n());
                wvg();
            }
        }
    }

    public void kja0(String str) {
        this.f31292g = str;
    }

    public void ni7() {
        if (zy().m19307y()) {
            RunnableC5885o runnableC5885o = new RunnableC5885o();
            runnableC5885o.toq(this.f31296y);
            runnableC5885o.m21338k(this.f31295q);
            this.f31293k.execute(runnableC5885o);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m19331p(com.xiaomi.clientreport.data.zy zyVar) {
        if (zy().m19307y()) {
            this.f31293k.execute(new RunnableC5630q(this, zyVar));
        }
    }

    /* JADX INFO: renamed from: q */
    public com.xiaomi.clientreport.data.toq m19332q(int i2, String str) {
        com.xiaomi.clientreport.data.toq toqVar = new com.xiaomi.clientreport.data.toq();
        toqVar.f73112ld6 = str;
        toqVar.f31275p = System.currentTimeMillis();
        toqVar.f31276s = i2;
        toqVar.f31277y = n5r1.m21302k(6);
        toqVar.f31272k = 1000;
        toqVar.f73111zy = 1001;
        toqVar.f73110toq = "E100004";
        toqVar.toq(this.f31295q.getPackageName());
        toqVar.zy(this.f31292g);
        return toqVar;
    }

    /* JADX INFO: renamed from: s */
    public void m19333s(com.xiaomi.clientreport.data.toq toqVar) {
        if (zy().f7l8()) {
            this.f31293k.execute(new zy(this, toqVar));
        }
    }

    public void t8r() {
        if (zy().f7l8()) {
            RunnableC5885o runnableC5885o = new RunnableC5885o();
            runnableC5885o.m21338k(this.f31295q);
            runnableC5885o.toq(this.f73114f7l8);
            this.f31293k.execute(runnableC5885o);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m19334y(C5623k c5623k, InterfaceC5634k interfaceC5634k, com.xiaomi.clientreport.processor.toq toqVar) {
        this.f31294n = c5623k;
        this.f73114f7l8 = interfaceC5634k;
        this.f31296y = toqVar;
        interfaceC5634k.mo19343k(this.f73116zy);
        this.f31296y.toq(this.f73115toq);
    }

    public synchronized C5623k zy() {
        if (this.f31294n == null) {
            this.f31294n = C5623k.m19303k(this.f31295q);
        }
        return this.f31294n;
    }
}
