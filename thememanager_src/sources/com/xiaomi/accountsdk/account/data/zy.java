package com.xiaomi.accountsdk.account.data;

import android.app.Application;
import com.xiaomi.accountsdk.account.C5500p;

/* JADX INFO: compiled from: CheckRegPhoneParams.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final String f72722f7l8;

    /* JADX INFO: renamed from: g */
    public final String f30720g;

    /* JADX INFO: renamed from: k */
    public final String f30721k;

    /* JADX INFO: renamed from: n */
    public final String f30722n;

    /* JADX INFO: renamed from: q */
    public final String f30723q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f72723toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f72724zy;

    /* JADX INFO: compiled from: CheckRegPhoneParams.java */
    public static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72725f7l8;

        /* JADX INFO: renamed from: g */
        private String f30724g;

        /* JADX INFO: renamed from: k */
        private String f30725k;

        /* JADX INFO: renamed from: n */
        private String f30726n;

        /* JADX INFO: renamed from: q */
        private String f30727q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72726toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72727zy;

        public toq ld6(String str) {
            this.f30724g = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public zy m18760p() {
            return new zy(this);
        }

        public toq qrj(String str) {
            this.f72725f7l8 = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public toq m18761s(Application application) {
            C5500p.m18784p(application);
            return this;
        }

        public toq x2(String str, String str2) {
            this.f30725k = str;
            this.f72726toq = str2;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m18762y(String str, String str2, String str3) {
            this.f72727zy = str;
            this.f30727q = str2;
            this.f30726n = str3;
            return this;
        }
    }

    private zy(toq toqVar) {
        this.f30721k = toqVar.f30725k;
        this.f72723toq = toqVar.f72726toq;
        this.f72724zy = toqVar.f72727zy;
        this.f30723q = toqVar.f30727q;
        this.f30722n = toqVar.f30726n;
        this.f30720g = toqVar.f30724g;
        this.f72722f7l8 = toqVar.f72725f7l8;
    }
}
