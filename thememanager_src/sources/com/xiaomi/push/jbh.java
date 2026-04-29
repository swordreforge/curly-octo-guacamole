package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.InterfaceC5621k;

/* JADX INFO: loaded from: classes3.dex */
public class jbh implements InterfaceC5621k {

    /* JADX INFO: renamed from: k */
    private InterfaceC5621k f33095k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC5621k f73381toq;

    public jbh(InterfaceC5621k interfaceC5621k, InterfaceC5621k interfaceC5621k2) {
        this.f33095k = interfaceC5621k;
        this.f73381toq = interfaceC5621k2;
    }

    @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
    /* JADX INFO: renamed from: k */
    public void mo8464k(String str) {
        InterfaceC5621k interfaceC5621k = this.f33095k;
        if (interfaceC5621k != null) {
            interfaceC5621k.mo8464k(str);
        }
        InterfaceC5621k interfaceC5621k2 = this.f73381toq;
        if (interfaceC5621k2 != null) {
            interfaceC5621k2.mo8464k(str);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
    public void toq(String str) {
    }

    @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
    public void zy(String str, Throwable th) {
        InterfaceC5621k interfaceC5621k = this.f33095k;
        if (interfaceC5621k != null) {
            interfaceC5621k.zy(str, th);
        }
        InterfaceC5621k interfaceC5621k2 = this.f73381toq;
        if (interfaceC5621k2 != null) {
            interfaceC5621k2.zy(str, th);
        }
    }
}
