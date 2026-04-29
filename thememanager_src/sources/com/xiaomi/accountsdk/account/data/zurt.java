package com.xiaomi.accountsdk.account.data;

/* JADX INFO: compiled from: SetPasswordParams.java */
/* JADX INFO: loaded from: classes3.dex */
public class zurt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final String f72716f7l8;

    /* JADX INFO: renamed from: g */
    public final String f30710g;

    /* JADX INFO: renamed from: k */
    public final String f30711k;

    /* JADX INFO: renamed from: n */
    public final String f30712n;

    /* JADX INFO: renamed from: q */
    public final String f30713q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final n7h f72717toq;

    /* JADX INFO: renamed from: y */
    public final ld6 f30714y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f72718zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.zurt$k */
    /* JADX INFO: compiled from: SetPasswordParams.java */
    public static final class C5494k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72719f7l8;

        /* JADX INFO: renamed from: g */
        private String f30715g;

        /* JADX INFO: renamed from: k */
        private final String f30716k;

        /* JADX INFO: renamed from: n */
        private String f30717n;

        /* JADX INFO: renamed from: q */
        private String f30718q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private n7h f72720toq;

        /* JADX INFO: renamed from: y */
        private ld6 f30719y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72721zy;

        public C5494k(String str) {
            this.f30716k = str;
        }

        /* JADX INFO: renamed from: h */
        public C5494k m18753h(String str) {
            this.f30717n = str;
            return this;
        }

        public C5494k kja0(String str) {
            this.f30715g = str;
            return this;
        }

        public C5494k ld6(ld6 ld6Var) {
            this.f30719y = ld6Var;
            return this;
        }

        public C5494k n7h(String str) {
            this.f72721zy = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C5494k m18754p(String str) {
            this.f72719f7l8 = str;
            return this;
        }

        public C5494k qrj(n7h n7hVar) {
            this.f72720toq = n7hVar;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public zurt m18755s() {
            return new zurt(this);
        }

        public C5494k x2(String str) {
            this.f30718q = str;
            return this;
        }
    }

    public zurt(C5494k c5494k) {
        this.f30711k = c5494k.f30716k;
        this.f72717toq = c5494k.f72720toq;
        this.f72718zy = c5494k.f72721zy;
        this.f30713q = c5494k.f30718q;
        this.f30712n = c5494k.f30717n;
        this.f30710g = c5494k.f30715g;
        this.f72716f7l8 = c5494k.f72719f7l8;
        this.f30714y = c5494k.f30719y;
    }

    /* JADX INFO: renamed from: k */
    public static C5494k m18747k(zurt zurtVar) {
        if (zurtVar == null) {
            return null;
        }
        return new C5494k(zurtVar.f30711k).qrj(zurtVar.f72717toq).n7h(zurtVar.f72718zy).x2(zurtVar.f30713q).m18753h(zurtVar.f30712n).kja0(zurtVar.f30710g).m18754p(zurtVar.f72716f7l8).ld6(zurtVar.f30714y);
    }
}
