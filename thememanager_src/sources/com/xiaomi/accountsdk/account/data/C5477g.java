package com.xiaomi.accountsdk.account.data;

import android.app.Application;
import com.xiaomi.accountsdk.account.C5500p;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.g */
/* JADX INFO: compiled from: EmailRegisterParams.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5477g {

    /* JADX INFO: renamed from: g */
    public final String f30598g;

    /* JADX INFO: renamed from: k */
    public final String f30599k;

    /* JADX INFO: renamed from: n */
    public final String f30600n;

    /* JADX INFO: renamed from: q */
    public final String f30601q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f72627toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f72628zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.g$k */
    /* JADX INFO: compiled from: EmailRegisterParams.java */
    public static final class k {

        /* JADX INFO: renamed from: g */
        private String f30602g;

        /* JADX INFO: renamed from: k */
        private String f30603k;

        /* JADX INFO: renamed from: n */
        private String f30604n;

        /* JADX INFO: renamed from: q */
        private String f30605q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72629toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72630zy;

        public k f7l8(Application application) {
            C5500p.m18784p(application);
            return this;
        }

        public k ld6(String str) {
            this.f72629toq = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public k m18676p(String str) {
            this.f30603k = str;
            return this;
        }

        public k qrj(String str) {
            this.f30602g = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public k m18677s(String str, String str2) {
            this.f72630zy = str;
            this.f30605q = str2;
            return this;
        }

        public k x2(String str) {
            this.f30604n = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C5477g m18678y() {
            return new C5477g(this);
        }
    }

    public C5477g(k kVar) {
        this.f30599k = kVar.f30603k;
        this.f72627toq = kVar.f72629toq;
        this.f72628zy = kVar.f72630zy;
        this.f30601q = kVar.f30605q;
        this.f30600n = kVar.f30604n;
        this.f30598g = kVar.f30602g;
    }
}
