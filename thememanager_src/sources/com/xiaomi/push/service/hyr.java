package com.xiaomi.push.service;

import com.xiaomi.push.kiv;
import com.xiaomi.push.service.XMPushService.C5900n;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class hyr {

    /* JADX INFO: renamed from: g */
    private static int f33793g = 300000;

    /* JADX INFO: renamed from: k */
    private XMPushService f33794k;

    /* JADX INFO: renamed from: q */
    private int f33796q = 0;

    /* JADX INFO: renamed from: n */
    private int f33795n = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f73614toq = 500;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f73615zy = 0;

    public hyr(XMPushService xMPushService) {
        this.f33794k = xMPushService;
    }

    /* JADX INFO: renamed from: k */
    private int m21618k() {
        double d2;
        if (this.f33796q > 8) {
            return 300000;
        }
        double dRandom = (Math.random() * 2.0d) + 1.0d;
        int i2 = this.f33796q;
        if (i2 > 4) {
            d2 = 60000.0d;
        } else {
            if (i2 <= 1) {
                if (this.f73615zy == 0) {
                    return 0;
                }
                if (System.currentTimeMillis() - this.f73615zy >= 310000) {
                    this.f73614toq = 1000;
                    this.f33795n = 0;
                    return 0;
                }
                int i3 = this.f73614toq;
                int i4 = f33793g;
                if (i3 >= i4) {
                    return i3;
                }
                int i5 = this.f33795n + 1;
                this.f33795n = i5;
                if (i5 >= 4) {
                    return i4;
                }
                this.f73614toq = (int) (((double) i3) * 1.5d);
                return i3;
            }
            d2 = 10000.0d;
        }
        return (int) (dRandom * d2);
    }

    public void toq() {
        this.f73615zy = System.currentTimeMillis();
        this.f33794k.m21526a(1);
        this.f33796q = 0;
    }

    public void zy(boolean z2) {
        if (!this.f33794k.m21538a()) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("should not reconnect as no client or network.");
            return;
        }
        if (z2) {
            if (!this.f33794k.m21539a(1)) {
                this.f33796q++;
            }
            this.f33794k.m21526a(1);
            com.xiaomi.channel.commonutils.logger.zy.m19293h("ReconnectionManager", "-->tryReconnect(): exec ConnectJob");
            XMPushService xMPushService = this.f33794k;
            Objects.requireNonNull(xMPushService);
            xMPushService.m21530a(xMPushService.new C5900n());
            return;
        }
        if (this.f33794k.m21539a(1)) {
            return;
        }
        int iM21618k = m21618k();
        this.f33796q++;
        com.xiaomi.channel.commonutils.logger.zy.kja0("schedule reconnect in " + iM21618k + "ms");
        XMPushService xMPushService2 = this.f33794k;
        Objects.requireNonNull(xMPushService2);
        xMPushService2.m21531a(xMPushService2.new C5900n(), (long) iM21618k);
        if (this.f33796q == 2 && kiv.m21078g().ld6()) {
            ki.m21659n();
        }
        if (this.f33796q == 3) {
            ki.toq();
        }
    }
}
