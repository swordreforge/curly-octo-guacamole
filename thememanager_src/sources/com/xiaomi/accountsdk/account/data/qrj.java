package com.xiaomi.accountsdk.account.data;

/* JADX INFO: compiled from: PassTokenLoginParams.java */
/* JADX INFO: loaded from: classes3.dex */
public class qrj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final boolean f72692f7l8;

    /* JADX INFO: renamed from: g */
    public final boolean f30675g;

    /* JADX INFO: renamed from: k */
    public final String f30676k;

    /* JADX INFO: renamed from: n */
    public final String f30677n;

    /* JADX INFO: renamed from: q */
    public final String f30678q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f72693toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f72694zy;

    /* JADX INFO: compiled from: PassTokenLoginParams.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        private final String f30680k;

        /* JADX INFO: renamed from: n */
        private String f30681n;

        /* JADX INFO: renamed from: q */
        private String f30682q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f72696toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f72697zy;

        /* JADX INFO: renamed from: g */
        private boolean f30679g = false;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f72695f7l8 = false;

        public toq(String str, String str2, String str3) {
            this.f30680k = str;
            this.f72696toq = str2;
            this.f72697zy = str3;
        }

        public toq ld6(boolean z2) {
            this.f30679g = z2;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public toq m18723p(boolean z2) {
            this.f72695f7l8 = z2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public toq m18724s(String str) {
            this.f30681n = str;
            return this;
        }

        public toq x2(String str) {
            this.f30682q = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public qrj m18725y() {
            return new qrj(this);
        }
    }

    private qrj(toq toqVar) {
        this.f30676k = toqVar.f30680k;
        this.f72693toq = toqVar.f72696toq;
        this.f72694zy = toqVar.f72697zy;
        this.f30678q = toqVar.f30682q;
        this.f30677n = toqVar.f30681n;
        this.f30675g = toqVar.f30679g;
        this.f72692f7l8 = toqVar.f72695f7l8;
    }
}
