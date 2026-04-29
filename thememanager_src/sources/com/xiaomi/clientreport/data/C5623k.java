package com.xiaomi.clientreport.data;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ek5k;

/* JADX INFO: renamed from: com.xiaomi.clientreport.data.k */
/* JADX INFO: loaded from: classes3.dex */
public class C5623k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final long f73100ld6 = 1048576;

    /* JADX INFO: renamed from: p */
    public static final boolean f31260p = false;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final long f73101qrj = 86400;

    /* JADX INFO: renamed from: s */
    public static final boolean f31261s = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final long f73102x2 = 86400;

    /* JADX INFO: renamed from: y */
    public static final boolean f31262y = true;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f73103f7l8;

    /* JADX INFO: renamed from: g */
    private long f31263g;

    /* JADX INFO: renamed from: k */
    private String f31264k;

    /* JADX INFO: renamed from: n */
    private long f31265n;

    /* JADX INFO: renamed from: q */
    private boolean f31266q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f73104toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f73105zy;

    /* JADX INFO: renamed from: com.xiaomi.clientreport.data.k$k */
    public static class k {

        /* JADX INFO: renamed from: k */
        private int f31268k = -1;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f73107toq = -1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f73108zy = -1;

        /* JADX INFO: renamed from: q */
        private String f31270q = null;

        /* JADX INFO: renamed from: n */
        private long f31269n = -1;

        /* JADX INFO: renamed from: g */
        private long f31267g = -1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private long f73106f7l8 = -1;

        public k kja0(boolean z2) {
            this.f73108zy = z2 ? 1 : 0;
            return this;
        }

        public k ld6(long j2) {
            this.f31267g = j2;
            return this;
        }

        public k n7h(long j2) {
            this.f73106f7l8 = j2;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public k m19312p(boolean z2) {
            this.f31268k = z2 ? 1 : 0;
            return this;
        }

        public k qrj(long j2) {
            this.f31269n = j2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public k m19313s(String str) {
            this.f31270q = str;
            return this;
        }

        public k x2(boolean z2) {
            this.f73107toq = z2 ? 1 : 0;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C5623k m19314y(Context context) {
            return new C5623k(context, this);
        }
    }

    /* JADX INFO: renamed from: k */
    public static C5623k m19303k(Context context) {
        return toq().m19312p(true).m19313s(ek5k.toq(context)).qrj(1048576L).x2(false).ld6(86400L).kja0(false).n7h(86400L).m19314y(context);
    }

    public static k toq() {
        return new k();
    }

    public boolean f7l8() {
        return this.f73105zy;
    }

    /* JADX INFO: renamed from: g */
    public boolean m19304g() {
        return this.f73104toq;
    }

    /* JADX INFO: renamed from: n */
    public long m19305n() {
        return this.f73103f7l8;
    }

    /* JADX INFO: renamed from: q */
    public long m19306q() {
        return this.f31265n;
    }

    public String toString() {
        return "Config{mEventEncrypted=" + this.f73104toq + ", mAESKey='" + this.f31264k + "', mMaxFileLength=" + this.f31265n + ", mEventUploadSwitchOpen=" + this.f73105zy + ", mPerfUploadSwitchOpen=" + this.f31266q + ", mEventUploadFrequency=" + this.f31263g + ", mPerfUploadFrequency=" + this.f73103f7l8 + '}';
    }

    /* JADX INFO: renamed from: y */
    public boolean m19307y() {
        return this.f31266q;
    }

    public long zy() {
        return this.f31263g;
    }

    private C5623k() {
        this.f73104toq = true;
        this.f73105zy = false;
        this.f31266q = false;
        this.f31265n = 1048576L;
        this.f31263g = 86400L;
        this.f73103f7l8 = 86400L;
    }

    private C5623k(Context context, k kVar) {
        this.f73104toq = true;
        this.f73105zy = false;
        this.f31266q = false;
        this.f31265n = 1048576L;
        this.f31263g = 86400L;
        this.f73103f7l8 = 86400L;
        if (kVar.f31268k != 0) {
            if (kVar.f31268k == 1) {
                this.f73104toq = true;
            } else {
                this.f73104toq = true;
            }
        } else {
            this.f73104toq = false;
        }
        if (!TextUtils.isEmpty(kVar.f31270q)) {
            this.f31264k = kVar.f31270q;
        } else {
            this.f31264k = ek5k.toq(context);
        }
        if (kVar.f31269n > -1) {
            this.f31265n = kVar.f31269n;
        } else {
            this.f31265n = 1048576L;
        }
        if (kVar.f31267g > -1) {
            this.f31263g = kVar.f31267g;
        } else {
            this.f31263g = 86400L;
        }
        if (kVar.f73106f7l8 > -1) {
            this.f73103f7l8 = kVar.f73106f7l8;
        } else {
            this.f73103f7l8 = 86400L;
        }
        if (kVar.f73107toq != 0 && kVar.f73107toq == 1) {
            this.f73105zy = true;
        } else {
            this.f73105zy = false;
        }
        if (kVar.f73108zy != 0) {
            if (kVar.f73108zy == 1) {
                this.f31266q = true;
                return;
            } else {
                this.f31266q = false;
                return;
            }
        }
        this.f31266q = false;
    }
}
