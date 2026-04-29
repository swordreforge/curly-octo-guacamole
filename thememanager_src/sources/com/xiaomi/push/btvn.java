package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btvn extends imd {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    protected Socket f73274fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    protected XMPushService f73275fu4;

    /* JADX INFO: renamed from: i */
    protected Exception f32755i;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private long f73276mcp;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private String f73277ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    protected volatile long f73278o1t;

    /* JADX INFO: renamed from: t */
    private int f32756t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    protected volatile long f73279wvg;

    /* JADX INFO: renamed from: z */
    protected volatile long f32757z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    String f73280zurt;

    public btvn(XMPushService xMPushService, bqie bqieVar) {
        super(xMPushService, bqieVar);
        this.f32755i = null;
        this.f73280zurt = null;
        this.f32757z = 0L;
        this.f73278o1t = 0L;
        this.f73279wvg = 0L;
        this.f73276mcp = 0L;
        this.f73275fu4 = xMPushService;
    }

    private void eqxt(bqie bqieVar) throws Throwable {
        lvui(bqieVar.cdj(), bqieVar.m20661k());
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0351  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lvui(java.lang.String r32, int r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.btvn.lvui(java.lang.String, int):void");
    }

    protected void d2ok(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f73279wvg >= 300000) {
            this.f32756t = 0;
            return;
        }
        if (oc.zurt(this.f73275fu4)) {
            int i2 = this.f32756t + 1;
            this.f32756t = i2;
            if (i2 >= 2) {
                String strMo20666q = mo20666q();
                com.xiaomi.channel.commonutils.logger.zy.kja0("max short conn time reached, sink down current host:" + strMo20666q);
                m20667r(strMo20666q, 0L, exc);
                this.f32756t = 0;
            }
        }
    }

    protected synchronized void d3() {
    }

    protected abstract void dd(boolean z2);

    public Context fti() {
        return this.f73275fu4;
    }

    public Socket gvn7() {
        return new Socket();
    }

    @Override // com.xiaomi.push.imd
    /* JADX INFO: renamed from: h */
    public void mo20664h(o5[] o5VarArr) throws ovdh {
        throw new ovdh("Don't support send Blob");
    }

    public void hyr() {
        this.f73278o1t = SystemClock.elapsedRealtime();
    }

    mu jp0y(String str) {
        mu qVar = tfm.zy().toq(str, false);
        if (!qVar.fn3e()) {
            nyj.zy(new mj(this, str));
        }
        return qVar;
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m20665l() {
        try {
            if (!jk() && !m20986t()) {
                m20987y(0, 0, null);
                eqxt(this.f73372n7h);
                return;
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("WARNING: current xmpp has connected");
        } catch (IOException e2) {
            throw new ovdh(e2);
        }
    }

    public void n5r1() {
        this.f32757z = SystemClock.elapsedRealtime();
    }

    public void ncyb(int i2, Exception exc) {
        oc.fn3e();
        this.f73275fu4.m21530a(new xm(this, 2, i2, exc));
    }

    protected synchronized void oc(int i2, Exception exc) {
        if (t8r() == 2) {
            return;
        }
        m20987y(2, i2, exc);
        this.f33028p = "";
        try {
            this.f73274fn3e.close();
        } catch (Throwable unused) {
        }
        this.f32757z = 0L;
        this.f73278o1t = 0L;
    }

    @Override // com.xiaomi.push.imd
    /* JADX INFO: renamed from: q */
    public String mo20666q() {
        return this.f73277ni7;
    }

    /* JADX INFO: renamed from: r */
    protected void m20667r(String str, long j2, Exception exc) {
        mu qVar = tfm.zy().toq(bqie.m20660q(), false);
        if (qVar != null) {
            qVar.m21292i(str, j2, 0L, exc);
            tfm.zy().ni7();
        }
    }

    @Override // com.xiaomi.push.imd
    public void wvg(boolean z2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        dd(z2);
        com.xiaomi.push.service.py.zy(this.f73275fu4).cdj();
        if (z2) {
            return;
        }
        this.f73275fu4.m21531a(new kq2f(this, 13, jElapsedRealtime, jCurrentTimeMillis), 10000L);
    }

    public String x9kr() {
        return this.f33028p;
    }

    @Override // com.xiaomi.push.imd
    public void zurt(int i2, Exception exc) {
        oc(i2, exc);
        if ((exc != null || i2 == 18) && this.f73279wvg != 0) {
            d2ok(exc);
        }
    }
}
