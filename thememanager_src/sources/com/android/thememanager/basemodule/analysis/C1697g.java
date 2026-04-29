package com.android.thememanager.basemodule.analysis;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.g */
/* JADX INFO: compiled from: NetEvent.java */
/* JADX INFO: loaded from: classes.dex */
public class C1697g {

    /* JADX INFO: renamed from: h */
    public static final int f9686h = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f57465kja0 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f57466n7h = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f57467f7l8;

    /* JADX INFO: renamed from: g */
    private int f9687g;

    /* JADX INFO: renamed from: k */
    private String f9688k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f57468ld6;

    /* JADX INFO: renamed from: n */
    private int f9689n;

    /* JADX INFO: renamed from: p */
    private long f9690p;

    /* JADX INFO: renamed from: q */
    private int f9691q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private String f57469qrj;

    /* JADX INFO: renamed from: s */
    private long f9692s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f57470toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f57471x2;

    /* JADX INFO: renamed from: y */
    private int f9693y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f57472zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.g$toq */
    /* JADX INFO: compiled from: NetEvent.java */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f57473f7l8;

        /* JADX INFO: renamed from: g */
        private int f9694g;

        /* JADX INFO: renamed from: k */
        private String f9695k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private long f57474ld6;

        /* JADX INFO: renamed from: n */
        private int f9696n;

        /* JADX INFO: renamed from: p */
        private int f9697p;

        /* JADX INFO: renamed from: q */
        private int f9698q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private String f57475qrj;

        /* JADX INFO: renamed from: s */
        private long f9699s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57476toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private String f57477x2;

        /* JADX INFO: renamed from: y */
        private int f9700y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f57478zy;

        public toq cdj(String val) {
            this.f57477x2 = val;
            return this;
        }

        public toq fn3e(int port) {
            this.f9698q = port;
            return this;
        }

        public toq fu4(int val) {
            this.f9700y = val;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public toq m6630h(String val) {
            this.f57473f7l8 = val;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public toq m6631i(String path) {
            this.f57478zy = path;
            return this;
        }

        public toq ki(String flag) {
            this.f57475qrj = flag;
            return this;
        }

        public toq kja0(long duration) {
            this.f57474ld6 = duration;
            return this;
        }

        public C1697g n7h() {
            return new C1697g(this);
        }

        public toq ni7(int val) {
            this.f9696n = val;
            return this;
        }

        public toq o1t(String val) {
            this.f9695k = val;
            return this;
        }

        public toq t8r(String host) {
            this.f57476toq = host;
            return this;
        }

        public toq wvg(int val) {
            this.f9694g = val;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public toq m6632z(int val) {
            this.f9697p = val;
            return this;
        }

        public toq zurt(long val) {
            this.f9699s = val;
            return this;
        }
    }

    public int f7l8() {
        return this.f9691q;
    }

    /* JADX INFO: renamed from: g */
    public String m6616g() {
        return this.f57472zy;
    }

    /* JADX INFO: renamed from: k */
    public long m6617k() {
        return this.f9690p;
    }

    public int ld6() {
        return this.f57468ld6;
    }

    /* JADX INFO: renamed from: n */
    public String m6618n() {
        return this.f57470toq;
    }

    public boolean n7h() {
        int i2;
        return !TextUtils.isEmpty(this.f9688k) && !TextUtils.isEmpty(this.f57470toq) && !TextUtils.isEmpty(this.f57472zy) && this.f9689n > 0 && (i2 = this.f9693y) >= 0 && i2 <= 2 && this.f9690p > 0;
    }

    /* JADX INFO: renamed from: p */
    public int m6619p() {
        return this.f9693y;
    }

    /* JADX INFO: renamed from: q */
    public String m6620q() {
        return this.f57469qrj;
    }

    public int qrj() {
        return this.f9687g;
    }

    /* JADX INFO: renamed from: s */
    public int m6621s() {
        return this.f9689n;
    }

    public String toString() {
        return "NetEvent{mScheme='" + this.f9688k + "', mHost='" + this.f57470toq + "', mPath='" + this.f57472zy + "', mPort=" + this.f9691q + ", mResponseCode=" + this.f9689n + ", mStatusCode=" + this.f9687g + ", mException='" + this.f57467f7l8 + "', mResultType=" + this.f9693y + ", mRequestStartTime=" + this.f9692s + ", mDuration=" + this.f9690p + ", mRetryCount=" + this.f57468ld6 + ", mExt='" + this.f57471x2 + "', mFlag='" + this.f57469qrj + "'}";
    }

    public String toq() {
        return this.f57467f7l8;
    }

    public String x2() {
        return this.f9688k;
    }

    /* JADX INFO: renamed from: y */
    public long m6622y() {
        return this.f9692s;
    }

    public String zy() {
        return this.f57471x2;
    }

    private C1697g(toq builder) {
        this.f9688k = builder.f9695k;
        this.f57470toq = builder.f57476toq;
        this.f9691q = builder.f9698q;
        this.f57472zy = builder.f57478zy;
        this.f9689n = builder.f9696n;
        this.f9687g = builder.f9694g;
        this.f57467f7l8 = builder.f57473f7l8;
        this.f9693y = builder.f9700y;
        this.f9692s = builder.f9699s;
        this.f57468ld6 = builder.f9697p;
        this.f9690p = builder.f57474ld6;
        this.f57471x2 = builder.f57477x2;
        this.f57469qrj = builder.f57475qrj;
    }
}
