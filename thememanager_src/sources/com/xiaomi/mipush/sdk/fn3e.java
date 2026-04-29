package com.xiaomi.mipush.sdk;

import uf.EnumC7687k;

/* JADX INFO: loaded from: classes3.dex */
public class fn3e {

    /* JADX INFO: renamed from: g */
    private boolean f31348g;

    /* JADX INFO: renamed from: k */
    private EnumC7687k f31349k;

    /* JADX INFO: renamed from: n */
    private boolean f31350n;

    /* JADX INFO: renamed from: q */
    private boolean f31351q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f73138toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f73139zy;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.fn3e$k */
    public static class C5649k {

        /* JADX INFO: renamed from: g */
        private boolean f31352g;

        /* JADX INFO: renamed from: k */
        private EnumC7687k f31353k;

        /* JADX INFO: renamed from: n */
        private boolean f31354n;

        /* JADX INFO: renamed from: q */
        private boolean f31355q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f73140toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73141zy;

        public C5649k f7l8(boolean z2) {
            this.f31354n = z2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public fn3e m19461g() {
            return new fn3e(this);
        }

        public C5649k ld6(EnumC7687k enumC7687k) {
            this.f31353k = enumC7687k;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C5649k m19462p(boolean z2) {
            this.f73141zy = z2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C5649k m19463s(boolean z2) {
            this.f31352g = z2;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C5649k m19464y(boolean z2) {
            this.f31355q = z2;
            return this;
        }
    }

    public void f7l8(boolean z2) {
        this.f31351q = z2;
    }

    /* JADX INFO: renamed from: g */
    public void m19451g(boolean z2) {
        this.f31350n = z2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m19452k() {
        return this.f31350n;
    }

    /* JADX INFO: renamed from: n */
    public EnumC7687k m19453n() {
        return this.f31349k;
    }

    /* JADX INFO: renamed from: p */
    public void m19454p(EnumC7687k enumC7687k) {
        this.f31349k = enumC7687k;
    }

    /* JADX INFO: renamed from: q */
    public boolean m19455q() {
        return this.f73139zy;
    }

    /* JADX INFO: renamed from: s */
    public void m19456s(boolean z2) {
        this.f73139zy = z2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PushConfiguration{");
        stringBuffer.append("Region:");
        EnumC7687k enumC7687k = this.f31349k;
        if (enumC7687k == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(enumC7687k.name());
        }
        stringBuffer.append(",mOpenHmsPush:" + this.f73139zy);
        stringBuffer.append(",mOpenFCMPush:" + this.f31351q);
        stringBuffer.append(",mOpenCOSPush:" + this.f31350n);
        stringBuffer.append(",mOpenFTOSPush:" + this.f31348g);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public boolean toq() {
        return this.f31351q;
    }

    /* JADX INFO: renamed from: y */
    public void m19457y(boolean z2) {
        this.f31348g = z2;
    }

    public boolean zy() {
        return this.f31348g;
    }

    public fn3e() {
        this.f31349k = EnumC7687k.China;
        this.f73139zy = false;
        this.f31351q = false;
        this.f31350n = false;
        this.f31348g = false;
    }

    private fn3e(C5649k c5649k) {
        this.f31349k = c5649k.f31353k == null ? EnumC7687k.China : c5649k.f31353k;
        this.f73139zy = c5649k.f73141zy;
        this.f31351q = c5649k.f31355q;
        this.f31350n = c5649k.f31354n;
        this.f31348g = c5649k.f31352g;
    }
}
