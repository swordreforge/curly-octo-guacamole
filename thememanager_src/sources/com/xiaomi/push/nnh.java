package com.xiaomi.push;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes3.dex */
public class nnh implements tww7 {

    /* JADX INFO: renamed from: g */
    private Exception f33453g;

    /* JADX INFO: renamed from: k */
    XMPushService f33456k;

    /* JADX INFO: renamed from: n */
    private int f33457n;

    /* JADX INFO: renamed from: q */
    imd f33459q;

    /* JADX INFO: renamed from: t */
    private long f33461t;

    /* JADX INFO: renamed from: z */
    private long f33463z;

    /* JADX INFO: renamed from: s */
    private long f33460s = 0;

    /* JADX INFO: renamed from: p */
    private long f33458p = 0;

    /* JADX INFO: renamed from: h */
    private long f33454h = 0;

    /* JADX INFO: renamed from: i */
    private long f33455i = 0;

    /* JADX INFO: renamed from: y */
    private String f33462y = "";

    nnh(XMPushService xMPushService) {
        this.f33463z = 0L;
        this.f33461t = 0L;
        this.f33456k = xMPushService;
        zy();
        int iMyUid = Process.myUid();
        try {
            this.f33461t = TrafficStats.getUidRxBytes(iMyUid);
            this.f33463z = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Failed to obtain traffic data during initialization: " + e2);
            this.f33461t = -1L;
            this.f33463z = -1L;
        }
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m21324q() {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("stat connpt = " + this.f33462y + " netDuration = " + this.f33458p + " ChannelDuration = " + this.f33455i + " channelConnectedTime = " + this.f33454h);
        C5955w c5955w = new C5955w();
        c5955w.f34066a = (byte) 0;
        c5955w.m21930a(kx3.CHANNEL_ONLINE_RATE.m21148a());
        c5955w.m21931a(this.f33462y);
        c5955w.m21944d((int) (System.currentTimeMillis() / 1000));
        c5955w.m21936b((int) (this.f33458p / 1000));
        c5955w.m21940c((int) (this.f33455i / 1000));
        kiv.m21078g().m21083s(c5955w);
        zy();
    }

    private void zy() {
        this.f33458p = 0L;
        this.f33455i = 0L;
        this.f33460s = 0L;
        this.f33454h = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (oc.zurt(this.f33456k)) {
            this.f33460s = jElapsedRealtime;
        }
        if (this.f33456k.m21544c()) {
            this.f33454h = jElapsedRealtime;
        }
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20689a(imd imdVar) {
        this.f33457n = 0;
        this.f33453g = null;
        this.f33459q = imdVar;
        this.f33462y = oc.m21360p(this.f33456k);
        bih.zy(0, kx3.CONN_SUCCESS.m21148a());
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: b */
    public void mo20692b(imd imdVar) {
        toq();
        this.f33454h = SystemClock.elapsedRealtime();
        bih.m20652n(0, kx3.CONN_SUCCESS.m21148a(), imdVar.mo20666q(), imdVar.m20983k());
    }

    /* JADX INFO: renamed from: k */
    Exception m21325k() {
        return this.f33453g;
    }

    public synchronized void toq() {
        XMPushService xMPushService = this.f33456k;
        if (xMPushService == null) {
            return;
        }
        String strM21360p = oc.m21360p(xMPushService);
        boolean zNi7 = oc.ni7(this.f33456k);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f33460s;
        if (j2 > 0) {
            this.f33458p += jElapsedRealtime - j2;
            this.f33460s = 0L;
        }
        long j3 = this.f33454h;
        if (j3 != 0) {
            this.f33455i += jElapsedRealtime - j3;
            this.f33454h = 0L;
        }
        if (zNi7) {
            if ((!TextUtils.equals(this.f33462y, strM21360p) && this.f33458p > 30000) || this.f33458p > 5400000) {
                m21324q();
            }
            this.f33462y = strM21360p;
            if (this.f33460s == 0) {
                this.f33460s = jElapsedRealtime;
            }
            if (this.f33456k.m21544c()) {
                this.f33454h = jElapsedRealtime;
            }
        }
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20690a(imd imdVar, int i2, Exception exc) {
        long uidTxBytes;
        if (this.f33457n == 0 && this.f33453g == null) {
            this.f33457n = i2;
            this.f33453g = exc;
            bih.ld6(imdVar.mo20666q(), exc);
        }
        if (i2 == 22 && this.f33454h != 0) {
            long qVar = imdVar.toq() - this.f33454h;
            if (qVar < 0) {
                qVar = 0;
            }
            this.f33455i += qVar + ((long) (gb.m20892g() / 2));
            this.f33454h = 0L;
        }
        toq();
        int iMyUid = Process.myUid();
        long uidRxBytes = -1;
        try {
            uidRxBytes = TrafficStats.getUidRxBytes(iMyUid);
            uidTxBytes = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Failed to obtain traffic data: " + e2);
            uidTxBytes = -1L;
        }
        com.xiaomi.channel.commonutils.logger.zy.m19300t("Stats rx=" + (uidRxBytes - this.f33461t) + ", tx=" + (uidTxBytes - this.f33463z));
        this.f33461t = uidRxBytes;
        this.f33463z = uidTxBytes;
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20691a(imd imdVar, Exception exc) {
        bih.m20654q(0, kx3.CHANNEL_CON_FAIL.m21148a(), 1, imdVar.mo20666q(), oc.ni7(this.f33456k) ? 1 : 0);
        toq();
    }
}
