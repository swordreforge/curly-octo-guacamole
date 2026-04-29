package com.xiaomi.push;

import com.xiaomi.push.imd;
import com.xiaomi.push.lh;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class wt implements exv8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static boolean f73713f7l8 = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private imd f73714toq;

    /* JADX INFO: renamed from: k */
    private SimpleDateFormat f34079k = new SimpleDateFormat("hh:mm:ss aaa");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C5957k f73715zy = null;

    /* JADX INFO: renamed from: q */
    private C5957k f34081q = null;

    /* JADX INFO: renamed from: n */
    private tww7 f34080n = null;

    /* JADX INFO: renamed from: g */
    private final String f34078g = "[Slim] ";

    /* JADX INFO: renamed from: com.xiaomi.push.wt$k */
    class C5957k implements kbj, qh4d {

        /* JADX INFO: renamed from: k */
        String f34082k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f73716toq;

        C5957k(boolean z2) {
            this.f73716toq = z2;
            this.f34082k = z2 ? " RCV " : " Sent ";
        }

        @Override // com.xiaomi.push.kbj
        /* JADX INFO: renamed from: k */
        public void mo20972k(xtb7 xtb7Var) {
            if (wt.f73713f7l8) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] " + wt.this.f34079k.format(new Date()) + this.f34082k + " PKT " + xtb7Var.mo21382g());
                return;
            }
            com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] " + wt.this.f34079k.format(new Date()) + this.f34082k + " PKT [" + xtb7Var.qrj() + "," + xtb7Var.x2() + "]");
        }

        @Override // com.xiaomi.push.qh4d
        /* JADX INFO: renamed from: k */
        public boolean mo20973k(xtb7 xtb7Var) {
            return true;
        }

        @Override // com.xiaomi.push.kbj
        public void toq(o5 o5Var) {
            if (wt.f73713f7l8) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] " + wt.this.f34079k.format(new Date()) + this.f34082k + o5Var.toString());
            } else {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] " + wt.this.f34079k.format(new Date()) + this.f34082k + " Blob [" + o5Var.m21349n() + "," + o5Var.m21348k() + "," + com.xiaomi.push.service.gvn7.toq(o5Var.jk()) + "]");
            }
            if (o5Var == null || o5Var.m21348k() != 99999) {
                return;
            }
            String strM21349n = o5Var.m21349n();
            o5 o5Var2 = null;
            if (!this.f73716toq) {
                if ("BIND".equals(strM21349n)) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("build binded result for loopback.");
                    lh.C5879q c5879q = new lh.C5879q();
                    c5879q.x2(true);
                    c5879q.t8r("login success.");
                    c5879q.m21187h("success");
                    c5879q.ld6("success");
                    o5 o5Var3 = new o5();
                    o5Var3.n7h(c5879q.m20674y(), null);
                    o5Var3.qrj((short) 2);
                    o5Var3.m21353y(99999);
                    o5Var3.x2("BIND", null);
                    o5Var3.ld6(o5Var.jk());
                    o5Var3.zurt(null);
                    o5Var3.m21352t(o5Var.fti());
                    o5Var2 = o5Var3;
                } else if (!"UBND".equals(strM21349n) && "SECMSG".equals(strM21349n)) {
                    o5 o5Var4 = new o5();
                    o5Var4.m21353y(99999);
                    o5Var4.x2("SECMSG", null);
                    o5Var4.m21352t(o5Var.fti());
                    o5Var4.ld6(o5Var.jk());
                    o5Var4.qrj(o5Var.f7l8());
                    o5Var4.zurt(o5Var.a9());
                    o5Var4.n7h(o5Var.cdj(com.xiaomi.push.service.eqxt.zy().toq(String.valueOf(99999), o5Var.fti()).f33765s), null);
                    o5Var2 = o5Var4;
                }
            }
            if (o5Var2 != null) {
                for (Map.Entry<kbj, imd.C5870k> entry : wt.this.f73714toq.m20981g().entrySet()) {
                    if (wt.this.f73715zy != entry.getKey()) {
                        entry.getValue().m20989k(o5Var2);
                    }
                }
            }
        }
    }

    public wt(imd imdVar) {
        this.f73714toq = imdVar;
        m21965q();
    }

    /* JADX INFO: renamed from: q */
    private void m21965q() {
        this.f73715zy = new C5957k(true);
        this.f34081q = new C5957k(false);
        imd imdVar = this.f73714toq;
        C5957k c5957k = this.f73715zy;
        imdVar.ld6(c5957k, c5957k);
        imd imdVar2 = this.f73714toq;
        C5957k c5957k2 = this.f34081q;
        imdVar2.o1t(c5957k2, c5957k2);
        this.f34080n = new g0ad(this);
    }
}
