package com.xiaomi.accountsdk.account.data;

/* JADX INFO: compiled from: QueryPhoneInfoParams.java */
/* JADX INFO: loaded from: classes3.dex */
public class cdj {

    /* JADX INFO: renamed from: g */
    public final ActivatorPhoneInfo f30580g;

    /* JADX INFO: renamed from: k */
    public final String f30581k;

    /* JADX INFO: renamed from: n */
    public final String f30582n;

    /* JADX INFO: renamed from: q */
    public final String f30583q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f72616toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f72617zy;

    /* JADX INFO: compiled from: QueryPhoneInfoParams.java */
    public static class toq {

        /* JADX INFO: renamed from: g */
        private ActivatorPhoneInfo f30584g;

        /* JADX INFO: renamed from: k */
        private String f30585k;

        /* JADX INFO: renamed from: n */
        private String f30586n;

        /* JADX INFO: renamed from: q */
        private String f30587q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72618toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72619zy;

        public cdj f7l8() {
            return new cdj(this);
        }

        /* JADX INFO: renamed from: p */
        public toq m18661p(String str, String str2) {
            this.f30585k = str;
            this.f72619zy = str2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public toq m18662s(ActivatorPhoneInfo activatorPhoneInfo) {
            this.f30584g = activatorPhoneInfo;
            if (activatorPhoneInfo != null) {
                this.f30587q = activatorPhoneInfo.f30436q;
                this.f30586n = activatorPhoneInfo.f30435n;
            }
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m18663y(String str) {
            this.f72618toq = str;
            return this;
        }
    }

    private cdj(toq toqVar) {
        this.f30581k = toqVar.f30585k;
        this.f72616toq = toqVar.f72618toq;
        this.f72617zy = toqVar.f72619zy;
        this.f30582n = toqVar.f30586n;
        this.f30583q = toqVar.f30587q;
        this.f30580g = toqVar.f30584g;
    }
}
