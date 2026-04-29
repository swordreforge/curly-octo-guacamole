package com.xiaomi.ad.entity.common;

import com.xiaomi.ad.entity.util.C5595k;
import e5.InterfaceC5997k;
import java.util.List;
import u38j.C7681k;

/* JADX INFO: renamed from: com.xiaomi.ad.entity.common.q */
/* JADX INFO: compiled from: Material.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5586q extends com.xiaomi.ad.entity.contract.zy {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f73004ld6 = 0;

    /* JADX INFO: renamed from: p */
    private static final double f31108p = 1.0d;

    /* JADX INFO: renamed from: s */
    private static final String f31109s = "Material";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f73005x2 = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC5997k
    private List<k> f73006f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC5997k
    private C5585n f31110g;

    /* JADX INFO: renamed from: n */
    @e5.zy("ex")
    @InterfaceC5997k
    private String f31111n;

    /* JADX INFO: renamed from: q */
    @InterfaceC5997k
    private int f31112q;

    /* JADX INFO: renamed from: y */
    @InterfaceC5997k
    private List<String> f31113y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC5997k
    private long f73007zy;

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.q$k */
    /* JADX INFO: compiled from: Material.java */
    public static class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC5997k
        private String f73008f7l8;

        /* JADX INFO: renamed from: g */
        @e5.zy("packageName")
        @InterfaceC5997k
        private String f31114g;

        /* JADX INFO: renamed from: k */
        @InterfaceC5997k
        private long f31115k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @e5.zy("urls")
        @InterfaceC5997k
        private List<toq> f73009ld6;

        /* JADX INFO: renamed from: n */
        @InterfaceC5997k
        private String f31116n;

        /* JADX INFO: renamed from: p */
        @InterfaceC5997k
        private List<String> f31117p;

        /* JADX INFO: renamed from: q */
        @InterfaceC5997k
        private String f31118q;

        /* JADX INFO: renamed from: s */
        @InterfaceC5997k
        private List<String> f31119s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC5997k
        private String f73010toq;

        /* JADX INFO: renamed from: y */
        @InterfaceC5997k
        private C5585n f31120y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @e5.zy("desc")
        @InterfaceC5997k
        private String f73011zy;

        /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.q$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Material.java */
        public static class C8032k {

            /* JADX INFO: renamed from: k */
            private final String f31121k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private final String f73012toq;

            /* JADX INFO: renamed from: k */
            public String m19194k() {
                return this.f31121k;
            }

            public String toq() {
                return this.f73012toq;
            }

            private C8032k(String str, String str2) {
                this.f31121k = str;
                this.f73012toq = str2;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.q$k$toq */
        /* JADX INFO: compiled from: Material.java */
        public static class toq {

            /* JADX INFO: renamed from: k */
            @InterfaceC5997k
            private String f31122k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            @e5.zy("digest")
            @InterfaceC5997k
            private String f73013toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            @InterfaceC5997k
            private String f73014zy;

            private toq() {
            }

            /* JADX INFO: renamed from: k */
            public String m19195k() {
                return this.f73014zy;
            }

            /* JADX INFO: renamed from: q */
            public void m19196q(String str) {
                this.f73014zy = str;
            }

            public String toq() {
                return this.f73013toq;
            }

            public String zy() {
                return this.f31122k;
            }
        }

        private k() {
        }

        public toq f7l8(int i2) {
            return (toq) C7681k.m28048q(this.f73009ld6, i2);
        }

        /* JADX INFO: renamed from: g */
        public String m19187g() {
            return this.f31118q;
        }

        /* JADX INFO: renamed from: k */
        public List<String> m19188k() {
            return C5595k.m19210q(this.f31117p);
        }

        public String ld6() {
            return this.f73010toq;
        }

        /* JADX INFO: renamed from: n */
        public long m19189n() {
            return this.f31115k;
        }

        public void n7h(List<String> list) {
            this.f31119s = list;
        }

        /* JADX INFO: renamed from: p */
        public String m19190p() {
            return this.f73008f7l8;
        }

        /* JADX INFO: renamed from: q */
        public String m19191q() {
            C5585n c5585n = this.f31120y;
            if (c5585n != null) {
                return c5585n.f31105k;
            }
            return null;
        }

        public void qrj(List<String> list) {
            this.f31117p = list;
        }

        /* JADX INFO: renamed from: s */
        public List<toq> m19192s() {
            return C7681k.m28045k(this.f73009ld6);
        }

        public C8032k toq() {
            return new C8032k(this.f31114g, this.f31116n);
        }

        public List<String> x2() {
            return C5595k.m19210q(this.f31119s);
        }

        /* JADX INFO: renamed from: y */
        public int m19193y() {
            return C7681k.f7l8(this.f73009ld6);
        }

        public String zy() {
            return this.f73011zy;
        }
    }

    private C5586q() {
    }

    /* JADX INFO: renamed from: p */
    public static final C5586q m19185p(String str) {
        return (C5586q) com.xiaomi.ad.entity.util.zy.zy(C5586q.class, str, f31109s);
    }

    public boolean cdj() {
        return this.f31112q == 1;
    }

    public long getId() {
        return this.f73007zy;
    }

    /* JADX INFO: renamed from: h */
    public boolean m19186h() {
        return this.f31112q == 0;
    }

    public void ki(String str) {
        this.f31111n = str;
    }

    public List<String> kja0() {
        return C5595k.m19210q(this.f31113y);
    }

    public String ld6() {
        C5585n c5585n = this.f31110g;
        if (c5585n != null) {
            return c5585n.f31105k;
        }
        return null;
    }

    public List<k> n7h() {
        return C7681k.m28045k(this.f73006f7l8);
    }

    public int qrj() {
        return C7681k.f7l8(this.f73006f7l8);
    }

    public void t8r(List<String> list) {
        this.f31113y = list;
    }

    public String toq() {
        return this.f31111n;
    }

    public k x2(int i2) {
        return (k) C7681k.m28048q(this.f73006f7l8, i2);
    }

    @Override // com.xiaomi.ad.entity.contract.zy
    /* JADX INFO: renamed from: y */
    protected String mo18161y() {
        return f31109s;
    }
}
