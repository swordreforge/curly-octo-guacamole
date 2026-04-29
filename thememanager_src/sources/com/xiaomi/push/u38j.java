package com.xiaomi.push;

import com.xiaomi.push.ra;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.eqxt;

/* JADX INFO: loaded from: classes3.dex */
class u38j implements eqxt.toq.InterfaceC5912k {

    /* JADX INFO: renamed from: k */
    private XMPushService f33974k;

    /* JADX INFO: renamed from: n */
    private int f33975n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private eqxt.toq f73689toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private imd f73690zy;

    /* JADX INFO: renamed from: g */
    private boolean f33973g = false;

    /* JADX INFO: renamed from: q */
    private eqxt.zy f33976q = eqxt.zy.binding;

    u38j(XMPushService xMPushService, eqxt.toq toqVar) {
        this.f33974k = xMPushService;
        this.f73689toq = toqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m21856n() {
        m21857q();
        if (this.f33973g && this.f33975n != 11) {
            C5955w c5955wM21081k = kiv.m21078g().m21081k();
            int i2 = v5yj.f34013k[this.f33976q.ordinal()];
            if (i2 == 1) {
                int i3 = this.f33975n;
                if (i3 == 17) {
                    c5955wM21081k.f34067a = kx3.BIND_TCP_READ_TIMEOUT.m21148a();
                } else if (i3 == 21) {
                    c5955wM21081k.f34067a = kx3.BIND_TIMEOUT.m21148a();
                } else {
                    try {
                        ra.C5893k c5893kM21429q = ra.m21429q(kiv.m21079n().m21325k());
                        c5955wM21081k.f34067a = c5893kM21429q.f33587k.m21148a();
                        c5955wM21081k.m21941c(c5893kM21429q.f73548toq);
                    } catch (NullPointerException unused) {
                        c5955wM21081k = null;
                    }
                }
            } else if (i2 == 3) {
                c5955wM21081k.f34067a = kx3.BIND_SUCCESS.m21148a();
            }
            if (c5955wM21081k != null) {
                c5955wM21081k.m21937b(this.f73690zy.mo20666q());
                c5955wM21081k.m21945d(this.f73689toq.f73603toq);
                c5955wM21081k.f34070b = 1;
                try {
                    c5955wM21081k.m21929a((byte) Integer.parseInt(this.f73689toq.f33766y));
                } catch (NumberFormatException unused2) {
                }
                kiv.m21078g().m21083s(c5955wM21081k);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m21857q() {
        this.f73689toq.n7h(this);
    }

    @Override // com.xiaomi.push.service.eqxt.toq.InterfaceC5912k
    /* JADX INFO: renamed from: k */
    public void mo21564k(eqxt.zy zyVar, eqxt.zy zyVar2, int i2) {
        if (!this.f33973g && zyVar == eqxt.zy.binding) {
            this.f33976q = zyVar2;
            this.f33975n = i2;
            this.f33973g = true;
        }
        this.f33974k.m21530a(new ps(this, 4));
    }

    void toq() {
        this.f73689toq.m21594s(this);
        this.f73690zy = this.f33974k.m21523a();
    }
}
