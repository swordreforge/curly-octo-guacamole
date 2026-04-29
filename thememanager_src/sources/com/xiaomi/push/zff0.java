package com.xiaomi.push;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.imd;
import com.xiaomi.push.lh;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.eqxt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class zff0 extends btvn {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private rp f73771a9;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private l05 f73772fti;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private Thread f73773jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private byte[] f73774jp0y;

    public zff0(XMPushService xMPushService, bqie bqieVar) {
        super(xMPushService, bqieVar);
    }

    /* JADX INFO: renamed from: e */
    private void m22105e() throws ovdh {
        try {
            this.f73771a9 = new rp(this.f73274fn3e.getInputStream(), this);
            this.f73772fti = new l05(this.f73274fn3e.getOutputStream(), this);
            el elVar = new el(this, "Blob Reader (" + this.f73373qrj + ")");
            this.f73773jk = elVar;
            elVar.start();
        } catch (Exception e2) {
            throw new ovdh("Error to init reader and writer", e2);
        }
    }

    /* JADX INFO: renamed from: f */
    private o5 m22106f(boolean z2) {
        yp31 yp31Var = new yp31();
        if (z2) {
            yp31Var.ld6("1");
        }
        byte[] bArrM20655s = bih.m20655s();
        if (bArrM20655s != null) {
            lh.C5878p c5878p = new lh.C5878p();
            c5878p.x2(zy.toq(bArrM20655s));
            yp31Var.n7h(c5878p.m20674y(), null);
        }
        return yp31Var;
    }

    @Override // com.xiaomi.push.imd
    public boolean cdj() {
        return true;
    }

    @Override // com.xiaomi.push.btvn
    protected synchronized void d3() {
        m22105e();
        this.f73772fti.toq();
    }

    @Override // com.xiaomi.push.btvn
    protected void dd(boolean z2) throws ovdh {
        if (this.f73772fti == null) {
            throw new ovdh("The BlobWriter is null.");
        }
        o5 o5VarM22106f = m22106f(z2);
        com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim] SND ping id=" + o5VarM22106f.jk());
        ni7(o5VarM22106f);
        n5r1();
    }

    @Override // com.xiaomi.push.btvn, com.xiaomi.push.imd
    /* JADX INFO: renamed from: h */
    public void mo20664h(o5[] o5VarArr) throws ovdh {
        for (o5 o5Var : o5VarArr) {
            ni7(o5Var);
        }
    }

    @Override // com.xiaomi.push.imd
    public synchronized void kja0(String str, String str2) {
        ec.toq(str, str2, this);
    }

    void lrht(o5 o5Var) {
        if (o5Var == null) {
            return;
        }
        if (com.xiaomi.push.service.vq.m21773k(o5Var)) {
            o5 o5Var2 = new o5();
            o5Var2.m21353y(o5Var.m21348k());
            o5Var2.x2("SYNC", "ACK_RTT");
            o5Var2.ld6(o5Var.jk());
            o5Var2.fn3e(o5Var.t8r());
            o5Var2.m21351s(o5Var.m21354z());
            XMPushService xMPushService = this.f73370kja0;
            xMPushService.m21530a(new com.xiaomi.push.service.vyq(xMPushService, o5Var2));
        }
        if (o5Var.kja0()) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim] RCV blob chid=" + o5Var.m21348k() + "; id=" + o5Var.jk() + "; errCode=" + o5Var.ki() + "; err=" + o5Var.o1t());
        }
        if (o5Var.m21348k() == 0) {
            if ("PING".equals(o5Var.m21349n())) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim] RCV ping id=" + o5Var.jk());
                hyr();
            } else if ("CLOSE".equals(o5Var.m21349n())) {
                ncyb(13, null);
            }
        }
        Iterator<imd.C5870k> it = this.f73369f7l8.values().iterator();
        while (it.hasNext()) {
            it.next().m20989k(o5Var);
        }
    }

    @Override // com.xiaomi.push.imd
    public void ni7(o5 o5Var) throws ovdh {
        l05 l05Var = this.f73772fti;
        if (l05Var == null) {
            throw new ovdh("the writer is null.");
        }
        try {
            int iM21151k = l05Var.m21151k(o5Var);
            this.f73368cdj = SystemClock.elapsedRealtime();
            String strA9 = o5Var.a9();
            if (!TextUtils.isEmpty(strA9)) {
                z4j7.m22068p(this.f73370kja0, strA9, iM21151k, false, true, System.currentTimeMillis());
            }
            Iterator<imd.C5870k> it = this.f33031y.values().iterator();
            while (it.hasNext()) {
                it.next().m20989k(o5Var);
            }
        } catch (Exception e2) {
            throw new ovdh(e2);
        }
    }

    @Override // com.xiaomi.push.btvn
    protected synchronized void oc(int i2, Exception exc) {
        rp rpVar = this.f73771a9;
        if (rpVar != null) {
            rpVar.m21456n();
            this.f73771a9 = null;
        }
        l05 l05Var = this.f73772fti;
        if (l05Var != null) {
            try {
                l05Var.zy();
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk("SlimConnection shutdown cause exception: " + e2);
            }
            this.f73772fti = null;
            this.f73774jp0y = null;
            super.oc(i2, exc);
        } else {
            this.f73774jp0y = null;
            super.oc(i2, exc);
        }
    }

    @Override // com.xiaomi.push.imd
    public synchronized void qrj(eqxt.toq toqVar) {
        ec.m20772k(toqVar, x9kr(), this);
    }

    synchronized byte[] uv6() {
        if (this.f73774jp0y == null && !TextUtils.isEmpty(this.f33028p)) {
            String strF7l8 = com.xiaomi.push.service.nn86.f7l8();
            StringBuilder sb = new StringBuilder();
            String str = this.f33028p;
            sb.append(str.substring(str.length() / 2));
            sb.append(strF7l8.substring(strF7l8.length() / 2));
            this.f73774jp0y = com.xiaomi.push.service.n5r1.m21697s(this.f33028p.getBytes(), sb.toString().getBytes());
        }
        return this.f73774jp0y;
    }

    void vyq(xtb7 xtb7Var) {
        if (xtb7Var == null) {
            return;
        }
        Iterator<imd.C5870k> it = this.f73369f7l8.values().iterator();
        while (it.hasNext()) {
            it.next().toq(xtb7Var);
        }
    }

    @Override // com.xiaomi.push.imd
    @Deprecated
    public void x2(xtb7 xtb7Var) throws ovdh {
        ni7(o5.zy(xtb7Var, null));
    }
}
