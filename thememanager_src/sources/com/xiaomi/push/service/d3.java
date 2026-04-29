package com.xiaomi.push.service;

import android.text.TextUtils;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.push.bih;
import com.xiaomi.push.bqie;
import com.xiaomi.push.h7am;
import com.xiaomi.push.hyow;
import com.xiaomi.push.kx3;
import com.xiaomi.push.lh;
import com.xiaomi.push.o5;
import com.xiaomi.push.pnt2;
import com.xiaomi.push.service.eqxt;
import com.xiaomi.push.xblq;
import com.xiaomi.push.xtb7;
import com.xiaomi.push.z4j7;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class d3 {

    /* JADX INFO: renamed from: k */
    private XMPushService f33739k;

    d3(XMPushService xMPushService) {
        this.f33739k = xMPushService;
    }

    /* JADX INFO: renamed from: g */
    private void m21565g(o5 o5Var) {
        eqxt.toq qVar;
        String strFti = o5Var.fti();
        String string = Integer.toString(o5Var.m21348k());
        if (TextUtils.isEmpty(strFti) || TextUtils.isEmpty(string) || (qVar = eqxt.zy().toq(string, strFti)) == null) {
            return;
        }
        z4j7.m22068p(this.f33739k, qVar.f33761k, o5Var.fu4(), true, true, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: n */
    private void m21566n(xtb7 xtb7Var) {
        eqxt.toq qVar;
        String strKja0 = xtb7Var.kja0();
        String strQrj = xtb7Var.qrj();
        if (TextUtils.isEmpty(strKja0) || TextUtils.isEmpty(strQrj) || (qVar = eqxt.zy().toq(strQrj, strKja0)) == null) {
            return;
        }
        z4j7.m22068p(this.f33739k, qVar.f33761k, z4j7.toq(xtb7Var.mo21382g()), true, true, System.currentTimeMillis());
    }

    private void toq(hyow hyowVar) {
        String strX2 = hyowVar.x2();
        if (TextUtils.isEmpty(strX2)) {
            return;
        }
        String[] strArrSplit = strX2.split(";");
        com.xiaomi.push.mu qVar = com.xiaomi.push.tfm.zy().toq(bqie.m20660q(), false);
        if (qVar == null || strArrSplit.length <= 0) {
            return;
        }
        qVar.kja0(strArrSplit);
        this.f33739k.m21527a(20, (Exception) null);
        this.f33739k.m21535a(true);
    }

    /* JADX INFO: renamed from: k */
    public void m21567k(o5 o5Var) {
        if (5 != o5Var.m21348k()) {
            m21565g(o5Var);
        }
        try {
            m21568q(o5Var);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("handle Blob chid = " + o5Var.m21348k() + " cmd = " + o5Var.m21349n() + " packetid = " + o5Var.jk() + " failure ", e2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m21568q(o5 o5Var) {
        String strM21349n = o5Var.m21349n();
        if (o5Var.m21348k() == 0) {
            if ("PING".equals(strM21349n)) {
                byte[] bArrM21346h = o5Var.m21346h();
                if (bArrM21346h != null && bArrM21346h.length > 0) {
                    lh.C5878p c5878pKja0 = lh.C5878p.kja0(bArrM21346h);
                    if (c5878pKja0.cdj()) {
                        nn86.m21710g().m21716p(c5878pKja0.ld6());
                    }
                }
                if (!"com.xiaomi.xmsf".equals(this.f33739k.getPackageName())) {
                    this.f33739k.m21525a();
                }
                if ("1".equals(o5Var.jk())) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("received a server ping");
                } else {
                    bih.m20653p();
                }
                this.f33739k.m21541b();
                return;
            }
            if (!"SYNC".equals(strM21349n)) {
                if ("NOTIFY".equals(o5Var.m21349n())) {
                    lh.C5881y c5881yQrj = lh.C5881y.qrj(o5Var.m21346h());
                    com.xiaomi.channel.commonutils.logger.zy.kja0("notify by server err = " + c5881yQrj.cdj() + " desc = " + c5881yQrj.n7h());
                    return;
                }
                return;
            }
            if ("CONF".equals(o5Var.m21347i())) {
                nn86.m21710g().m21716p(lh.toq.qrj(o5Var.m21346h()));
                return;
            }
            if (TextUtils.equals("U", o5Var.m21347i())) {
                lh.ld6 ld6VarM21171h = lh.ld6.m21171h(o5Var.m21346h());
                h7am.toq(this.f33739k).m20953y(ld6VarM21171h.cdj(), ld6VarM21171h.zurt(), new Date(ld6VarM21171h.m21173p()), new Date(ld6VarM21171h.t8r()), ld6VarM21171h.fu4() * 1024, ld6VarM21171h.wvg());
                o5 o5Var2 = new o5();
                o5Var2.m21353y(0);
                o5Var2.x2(o5Var.m21349n(), "UCA");
                o5Var2.ld6(o5Var.jk());
                XMPushService xMPushService = this.f33739k;
                xMPushService.m21530a(new vyq(xMPushService, o5Var2));
                return;
            }
            if (TextUtils.equals("P", o5Var.m21347i())) {
                lh.C5880s c5880sQrj = lh.C5880s.qrj(o5Var.m21346h());
                o5 o5Var3 = new o5();
                o5Var3.m21353y(0);
                o5Var3.x2(o5Var.m21349n(), "PCA");
                o5Var3.ld6(o5Var.jk());
                lh.C5880s c5880s = new lh.C5880s();
                if (c5880sQrj.n7h()) {
                    c5880s.ld6(c5880sQrj.m21190p());
                }
                o5Var3.n7h(c5880s.m20674y(), null);
                XMPushService xMPushService2 = this.f33739k;
                xMPushService2.m21530a(new vyq(xMPushService2, o5Var3));
                com.xiaomi.channel.commonutils.logger.zy.kja0("ACK msgP: id = " + o5Var.jk());
                return;
            }
            return;
        }
        String string = Integer.toString(o5Var.m21348k());
        if ("SECMSG".equals(o5Var.m21349n())) {
            if (!o5Var.kja0()) {
                this.f33739k.m21540b().m21574s(this.f33739k, string, o5Var);
                return;
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("Recv SECMSG errCode = " + o5Var.ki() + " errStr = " + o5Var.o1t());
            return;
        }
        if (!"BIND".equals(strM21349n)) {
            if ("KICK".equals(strM21349n)) {
                lh.f7l8 f7l8VarX2 = lh.f7l8.x2(o5Var.m21346h());
                String strFti = o5Var.fti();
                String strQrj = f7l8VarX2.qrj();
                String strM21156h = f7l8VarX2.m21156h();
                com.xiaomi.channel.commonutils.logger.zy.kja0("kicked by server, chid=" + string + " res= " + eqxt.toq.m21589n(strFti) + " type=" + strQrj + " reason=" + strM21156h);
                if (!"wait".equals(strQrj)) {
                    this.f33739k.m21533a(string, strFti, 3, strM21156h, strQrj);
                    eqxt.zy().n7h(string, strFti);
                    return;
                }
                eqxt.toq qVar = eqxt.zy().toq(string, strFti);
                if (qVar != null) {
                    this.f33739k.m21532a(qVar);
                    qVar.ld6(eqxt.zy.unbind, 3, 0, strM21156h, strQrj);
                    return;
                }
                return;
            }
            return;
        }
        lh.C5879q c5879qQrj = lh.C5879q.qrj(o5Var.m21346h());
        String strFti2 = o5Var.fti();
        eqxt.toq qVar2 = eqxt.zy().toq(string, strFti2);
        if (qVar2 == null) {
            return;
        }
        if (c5879qQrj.kja0()) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("SMACK: channel bind succeeded, chid=" + o5Var.m21348k());
            qVar2.ld6(eqxt.zy.binded, 1, 0, null, null);
            return;
        }
        String strN7h = c5879qQrj.n7h();
        if (InterfaceC1925p.f517.equals(strN7h)) {
            if ("invalid-sig".equals(c5879qQrj.cdj())) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("SMACK: bind error invalid-sig token = " + qVar2.f73606zy + " sec = " + qVar2.f33765s);
                bih.m20654q(0, kx3.BIND_INVALID_SIG.m21148a(), 1, null, 0);
            }
            qVar2.ld6(eqxt.zy.unbind, 1, 5, c5879qQrj.cdj(), strN7h);
            eqxt.zy().n7h(string, strFti2);
        } else if ("cancel".equals(strN7h)) {
            qVar2.ld6(eqxt.zy.unbind, 1, 7, c5879qQrj.cdj(), strN7h);
            eqxt.zy().n7h(string, strFti2);
        } else if ("wait".equals(strN7h)) {
            this.f33739k.m21532a(qVar2);
            qVar2.ld6(eqxt.zy.unbind, 1, 7, c5879qQrj.cdj(), strN7h);
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("SMACK: channel bind failed, chid=" + string + " reason=" + c5879qQrj.cdj());
    }

    public void zy(xtb7 xtb7Var) {
        if (!"5".equals(xtb7Var.qrj())) {
            m21566n(xtb7Var);
        }
        String strQrj = xtb7Var.qrj();
        if (TextUtils.isEmpty(strQrj)) {
            strQrj = "1";
            xtb7Var.m22026h("1");
        }
        if (strQrj.equals("0")) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Received wrong packet with chid = 0 : " + xtb7Var.mo21382g());
        }
        if (xtb7Var instanceof xblq) {
            hyow qVar = xtb7Var.toq("kick");
            if (qVar != null) {
                String strKja0 = xtb7Var.kja0();
                String strM20960g = qVar.m20960g("type");
                String strM20960g2 = qVar.m20960g("reason");
                com.xiaomi.channel.commonutils.logger.zy.kja0("kicked by server, chid=" + strQrj + " res=" + eqxt.toq.m21589n(strKja0) + " type=" + strM20960g + " reason=" + strM20960g2);
                if (!"wait".equals(strM20960g)) {
                    this.f33739k.m21533a(strQrj, strKja0, 3, strM20960g2, strM20960g);
                    eqxt.zy().n7h(strQrj, strKja0);
                    return;
                }
                eqxt.toq qVar2 = eqxt.zy().toq(strQrj, strKja0);
                if (qVar2 != null) {
                    this.f33739k.m21532a(qVar2);
                    qVar2.ld6(eqxt.zy.unbind, 3, 0, strM20960g2, strM20960g);
                    return;
                }
                return;
            }
        } else if (xtb7Var instanceof pnt2) {
            pnt2 pnt2Var = (pnt2) xtb7Var;
            if ("redir".equals(pnt2Var.m21386t())) {
                hyow qVar3 = pnt2Var.toq("hosts");
                if (qVar3 != null) {
                    toq(qVar3);
                    return;
                }
                return;
            }
        }
        this.f33739k.m21540b().m21572p(this.f33739k, strQrj, xtb7Var);
    }
}
