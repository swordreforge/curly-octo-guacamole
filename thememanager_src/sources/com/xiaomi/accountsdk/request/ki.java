package com.xiaomi.accountsdk.request;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.accountsdk.account.C5499n;
import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.account.data.MetaLoginData;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.request.zurt;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import java.io.IOException;
import java.util.UUID;
import kx3.C6757k;

/* JADX INFO: compiled from: PassportLoginRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ki extends t8r {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72929toq = "PassportLoginRequest";

    /* JADX INFO: renamed from: k */
    private final t8r f30942k;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.ki$k */
    /* JADX INFO: compiled from: PassportLoginRequest.java */
    class C5540k extends cdj {
        C5540k(t8r t8rVar, t8r t8rVar2) {
            super(t8rVar, t8rVar2);
        }

        /* JADX INFO: renamed from: y */
        private boolean m18949y(Throwable th) {
            return (th instanceof n7h) && ((n7h) th).isHtmlOr302;
        }

        @Override // com.xiaomi.accountsdk.request.cdj
        protected boolean f7l8(Exception exc) {
            return (exc instanceof IOException) || (exc.getCause() instanceof com.xiaomi.accountsdk.request.zy) || (exc.getCause() instanceof C6757k) || (exc.getCause() instanceof C5539k) || m18949y(exc.getCause());
        }

        @Override // com.xiaomi.accountsdk.request.cdj
        /* JADX INFO: renamed from: g */
        protected boolean mo18921g(wvg.C5555y c5555y) {
            return c5555y == null;
        }

        @Override // com.xiaomi.accountsdk.request.cdj
        /* JADX INFO: renamed from: n */
        protected void mo18923n() {
            AbstractC5574n.m19111k(ki.f72929toq, String.format("login %s with CA-Request succeeded to receive data from server", ki.this.zy()));
        }

        @Override // com.xiaomi.accountsdk.request.cdj
        /* JADX INFO: renamed from: q */
        protected void mo18924q() {
            AbstractC5574n.m19111k(ki.f72929toq, String.format("login %s with CA-Request failed to receive data from server", ki.this.zy()));
        }
    }

    /* JADX INFO: compiled from: PassportLoginRequest.java */
    public static class toq extends ki {
        public toq(C5538i c5538i) {
            super(c5538i);
        }

        @Override // com.xiaomi.accountsdk.request.ki
        protected zurt f7l8(C5538i c5538i) {
            return new zurt.C5558k(c5538i);
        }

        @Override // com.xiaomi.accountsdk.request.ki
        /* JADX INFO: renamed from: g */
        protected C5537h mo18947g(C5499n c5499n, C5538i c5538i) {
            return new C5537h(new zurt.C5558k(c5538i), c5499n);
        }

        @Override // com.xiaomi.accountsdk.request.ki
        protected String zy() {
            return "byPassToken";
        }
    }

    /* JADX INFO: compiled from: PassportLoginRequest.java */
    public static class zy extends ki {

        /* JADX INFO: renamed from: n */
        private final MetaLoginData f30944n;

        /* JADX INFO: renamed from: q */
        private final String f30945q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f72930zy;

        /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.ki$zy$k */
        /* JADX INFO: compiled from: PassportLoginRequest.java */
        class C5541k extends zurt.toq {
            C5541k(C5538i c5538i) {
                super(c5538i);
            }

            @Override // com.xiaomi.accountsdk.request.zurt.toq, com.xiaomi.accountsdk.request.t8r
            /* JADX INFO: renamed from: k */
            public wvg.C5555y mo18922k() throws fn3e, IOException {
                MetaLoginData metaLoginDataMcp = zy.this.f30944n;
                if (metaLoginDataMcp == null) {
                    try {
                        metaLoginDataMcp = C5502s.mcp(zy.this.f72930zy, zy.this.f30945q);
                        if (metaLoginDataMcp == null) {
                            throw new fn3e(new n7h("Empty meta login data"));
                        }
                    } catch (C5539k e2) {
                        throw new fn3e(e2);
                    } catch (n7h e3) {
                        throw new fn3e(e3);
                    } catch (com.xiaomi.accountsdk.request.zy e4) {
                        throw new fn3e(e4);
                    } catch (IOException e6) {
                        throw e6;
                    } catch (p039w.x2 e7) {
                        throw new fn3e(e7);
                    }
                }
                this.f30999k.f30939k.easyPut(InterfaceC1925p.nou, metaLoginDataMcp.f30443k);
                this.f30999k.f30939k.easyPut("qs", metaLoginDataMcp.f30445q);
                this.f30999k.f30939k.easyPut("callback", metaLoginDataMcp.f30444n);
                return super.mo18922k();
            }
        }

        public zy(C5538i c5538i, String str, String str2, MetaLoginData metaLoginData) {
            super(c5538i);
            this.f72930zy = str;
            this.f30945q = str2;
            this.f30944n = metaLoginData;
        }

        @Override // com.xiaomi.accountsdk.request.ki
        protected zurt f7l8(C5538i c5538i) {
            return new C5541k(c5538i);
        }

        @Override // com.xiaomi.accountsdk.request.ki
        /* JADX INFO: renamed from: g */
        protected C5537h mo18947g(C5499n c5499n, C5538i c5538i) {
            return new C5537h(new zurt.toq(c5538i), c5499n);
        }

        @Override // com.xiaomi.accountsdk.request.ki
        protected String zy() {
            return "byPassword";
        }
    }

    public ki(C5538i c5538i) {
        zurt zurtVarF7l8 = f7l8(c5538i);
        cdj cdjVarM18946q = m18946q(c5538i, zurtVarF7l8);
        if (cdjVarM18946q != null) {
            this.f30942k = cdjVarM18946q;
        } else {
            AbstractC5574n.m19111k(f72929toq, String.format("CA-Request not ready for login %s, fallback to https way", zy()));
            this.f30942k = zurtVarF7l8;
        }
    }

    /* JADX INFO: renamed from: q */
    private cdj m18946q(C5538i c5538i, zurt zurtVar) {
        String qVar;
        C5499n c5499nZy = C5499n.zy();
        if (c5499nZy == null || !c5499nZy.f7l8() || (qVar = c5499nZy.toq(c5538i.f30938g)) == null) {
            return null;
        }
        String str = com.xiaomi.accountsdk.account.zy.f30810k;
        C5538i c5538iM18940k = c5538i.m18940k();
        String str2 = c5538iM18940k.f30939k.get("sid");
        c5538iM18940k.ld6(qVar);
        c5538iM18940k.m18945y("_ver", str);
        c5538iM18940k.f30939k.remove("sid");
        c5538iM18940k.m18945y("_sid", str2);
        c5538iM18940k.f30941q.easyPutOpt("_ver", str);
        c5538iM18940k.f30941q.easyPutOpt("_sid", str2);
        c5538iM18940k.f7l8("x-mistats-header", UUID.randomUUID().toString());
        return new C5540k(mo18947g(c5499nZy, c5538iM18940k), zurtVar);
    }

    protected abstract zurt f7l8(C5538i c5538i);

    /* JADX INFO: renamed from: g */
    protected abstract C5537h mo18947g(C5499n c5499n, C5538i c5538i);

    @Override // com.xiaomi.accountsdk.request.t8r
    /* JADX INFO: renamed from: k */
    public wvg.C5555y mo18922k() throws fn3e, IOException {
        Object[] objArr = new Object[2];
        objArr[0] = zy();
        objArr[1] = this.f30942k instanceof cdj ? "withCA" : "withoutCA";
        com.xiaomi.accountsdk.account.stat.toq toqVar = new com.xiaomi.accountsdk.account.stat.toq(String.format("login/%s/%s", objArr), com.xiaomi.accountsdk.account.zy.f30810k);
        toqVar.toq();
        try {
            try {
                return this.f30942k.mo18922k();
            } catch (fn3e e2) {
                if (e2.getCause() instanceof C6757k) {
                    toqVar.zy((Exception) e2.getCause());
                }
                throw e2;
            } catch (IOException e3) {
                toqVar.zy(e3);
                throw e3;
            }
        } finally {
            toqVar.m18821k();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m18948n() {
        t8r t8rVar = this.f30942k;
        return (t8rVar instanceof cdj) && !((cdj) t8rVar).zy();
    }

    protected abstract String zy();
}
