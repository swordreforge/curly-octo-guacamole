package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.C5650g;
import com.xiaomi.push.ovdh;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.XMPushService.toq;
import com.xiaomi.push.service.eqxt;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class cfr extends XMPushService.AbstractC5901p {

    /* JADX INFO: renamed from: g */
    private String f33727g;

    /* JADX INFO: renamed from: n */
    private byte[] f33728n;

    /* JADX INFO: renamed from: q */
    private XMPushService f33729q;

    /* JADX INFO: renamed from: s */
    private String f33730s;

    /* JADX INFO: renamed from: y */
    private String f33731y;

    public cfr(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f33729q = xMPushService;
        this.f33727g = str;
        this.f33728n = bArr;
        this.f33731y = str2;
        this.f33730s = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    /* JADX INFO: renamed from: k */
    public String mo21141k() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC5901p
    public void toq() {
        eqxt.toq next;
        v0af qVar = etdu.toq(this.f33729q);
        if (qVar == null) {
            try {
                qVar = etdu.zy(this.f33729q, this.f33727g, this.f33731y, this.f33730s);
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk("fail to register push account. " + e2);
            }
        }
        if (qVar == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("no account for registration.");
            w831.m21775k(this.f33729q, C5650g.f31361q, "no account.");
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("do registration now.");
        Collection<eqxt.toq> collectionM21582g = eqxt.zy().m21582g("5");
        if (collectionM21582g.isEmpty()) {
            next = qVar.m21772k(this.f33729q);
            x2.m21794p(this.f33729q, next);
            eqxt.zy().x2(next);
        } else {
            next = collectionM21582g.iterator().next();
        }
        if (!this.f33729q.m21544c()) {
            w831.m21776n(this.f33727g, this.f33728n);
            this.f33729q.m21535a(true);
            return;
        }
        try {
            eqxt.zy zyVar = next.f73601qrj;
            if (zyVar == eqxt.zy.binded) {
                x2.x2(this.f33729q, this.f33727g, this.f33728n);
            } else if (zyVar == eqxt.zy.unbind) {
                w831.m21776n(this.f33727g, this.f33728n);
                XMPushService xMPushService = this.f33729q;
                Objects.requireNonNull(xMPushService);
                xMPushService.m21530a(xMPushService.new toq(next));
            }
        } catch (ovdh e3) {
            com.xiaomi.channel.commonutils.logger.zy.jk("meet error, disconnect connection. " + e3);
            this.f33729q.m21527a(10, e3);
        }
    }
}
