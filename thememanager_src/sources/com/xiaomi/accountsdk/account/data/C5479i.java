package com.xiaomi.accountsdk.account.data;

import android.app.Application;
import com.xiaomi.accountsdk.account.C5500p;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.i */
/* JADX INFO: compiled from: SendPhoneTicketParams.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5479i {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final String f72633f7l8;

    /* JADX INFO: renamed from: g */
    public final String f30608g;

    /* JADX INFO: renamed from: k */
    public final String f30609k;

    /* JADX INFO: renamed from: n */
    public final String f30610n;

    /* JADX INFO: renamed from: q */
    public final ActivatorPhoneInfo f30611q;

    /* JADX INFO: renamed from: s */
    public final String f30612s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f72634toq;

    /* JADX INFO: renamed from: y */
    public final String f30613y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f72635zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.i$toq */
    /* JADX INFO: compiled from: SendPhoneTicketParams.java */
    public static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72636f7l8;

        /* JADX INFO: renamed from: g */
        private String f30614g;

        /* JADX INFO: renamed from: k */
        private String f30615k;

        /* JADX INFO: renamed from: n */
        private String f30616n;

        /* JADX INFO: renamed from: q */
        private String f30617q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ActivatorPhoneInfo f72637toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72638zy;

        public toq kja0(String str) {
            this.f30617q = str;
            return this;
        }

        public toq ld6(String str) {
            this.f72638zy = str;
            return this;
        }

        public toq n7h(String str) {
            this.f72636f7l8 = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public toq m18684p(String str, String str2) {
            this.f30616n = str;
            this.f30614g = str2;
            return this;
        }

        public toq qrj(ActivatorPhoneInfo activatorPhoneInfo) {
            this.f72637toq = activatorPhoneInfo;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C5479i m18685s() {
            return new C5479i(this);
        }

        public toq x2(String str) {
            this.f30615k = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m18686y(Application application) {
            C5500p.m18784p(application);
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static toq m18679k(C5479i c5479i) {
        if (c5479i == null) {
            return null;
        }
        return new toq().x2(c5479i.f30609k).qrj(c5479i.f30611q).kja0(c5479i.f30608g).ld6(c5479i.f30610n).m18684p(c5479i.f72633f7l8, c5479i.f30613y).n7h(c5479i.f30612s);
    }

    private C5479i(toq toqVar) {
        this.f30609k = toqVar.f30615k;
        ActivatorPhoneInfo activatorPhoneInfo = toqVar.f72637toq;
        this.f30611q = activatorPhoneInfo;
        this.f72634toq = activatorPhoneInfo != null ? activatorPhoneInfo.f30436q : null;
        this.f72635zy = activatorPhoneInfo != null ? activatorPhoneInfo.f30435n : null;
        this.f30610n = toqVar.f72638zy;
        this.f30608g = toqVar.f30617q;
        this.f72633f7l8 = toqVar.f30616n;
        this.f30613y = toqVar.f30614g;
        this.f30612s = toqVar.f72636f7l8;
    }
}
