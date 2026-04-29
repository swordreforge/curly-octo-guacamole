package com.xiaomi.ad.entity.common;

import e5.InterfaceC5997k;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import u38j.C7681k;
import u38j.C7683q;

/* JADX INFO: renamed from: com.xiaomi.ad.entity.common.k */
/* JADX INFO: compiled from: Condition.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5584k extends com.xiaomi.ad.entity.contract.zy {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final double f72988qrj = 1.0d;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f72989x2 = "Condition";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @e5.zy("deviceStat")
    @InterfaceC5997k
    private k f72990f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC5997k
    private boolean f31077g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC5997k
    private long f72991ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC5997k
    private zy f31078n;

    /* JADX INFO: renamed from: p */
    @InterfaceC5997k
    private long f31079p;

    /* JADX INFO: renamed from: q */
    @InterfaceC5997k
    private List<zy> f31080q;

    /* JADX INFO: renamed from: s */
    @e5.zy("packageStats")
    @InterfaceC5997k
    private List<toq> f31081s;

    /* JADX INFO: renamed from: y */
    @e5.zy("userStat")
    @InterfaceC5997k
    private n f31082y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC5997k
    private q f72992zy;

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.k$g */
    /* JADX INFO: compiled from: Condition.java */
    public class g extends com.xiaomi.ad.entity.contract.zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final double f72993f7l8 = 1.0d;

        /* JADX INFO: renamed from: g */
        private static final String f31083g = "ValueRange";

        /* JADX INFO: renamed from: q */
        @InterfaceC5997k
        int f31085q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC5997k
        int f72994zy;

        public g() {
        }

        public int ld6() {
            return this.f31085q;
        }

        /* JADX INFO: renamed from: p */
        public int m19175p() {
            return this.f72994zy;
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f31083g;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.k$k */
    /* JADX INFO: compiled from: Condition.java */
    public static class k extends com.xiaomi.ad.entity.contract.zy {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final double f72995ld6 = 1.0d;

        /* JADX INFO: renamed from: p */
        private static final String f31086p = "DeviceState";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC5997k
        private g f72996f7l8;

        /* JADX INFO: renamed from: g */
        @InterfaceC5997k
        private g f31087g;

        /* JADX INFO: renamed from: n */
        @InterfaceC5997k
        private g f31088n;

        /* JADX INFO: renamed from: q */
        @InterfaceC5997k
        private g f31089q;

        /* JADX INFO: renamed from: s */
        @e5.zy("bluetooth")
        @InterfaceC5997k
        private List<String> f31090s;

        /* JADX INFO: renamed from: y */
        @InterfaceC5997k
        private boolean f31091y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC5997k
        private g f72997zy;

        public boolean cdj() {
            return this.f31089q != null;
        }

        public boolean fn3e() {
            return this.f31088n != null;
        }

        /* JADX INFO: renamed from: h */
        public boolean m19176h() {
            return C7681k.qrj(this.f31090s);
        }

        /* JADX INFO: renamed from: i */
        public boolean m19177i() {
            return this.f72997zy != null;
        }

        public boolean ki() {
            return this.f72996f7l8 != null;
        }

        public g kja0() {
            return this.f31088n;
        }

        public g ld6() {
            return this.f31089q;
        }

        public g n7h() {
            return this.f72997zy;
        }

        /* JADX INFO: renamed from: p */
        public List<String> m19178p() {
            return this.f31090s;
        }

        public g qrj() {
            return this.f31087g;
        }

        public boolean t8r() {
            return this.f31087g != null;
        }

        public g x2() {
            return this.f72996f7l8;
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f31086p;
        }

        public boolean zurt() {
            return this.f31091y;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.k$n */
    /* JADX INFO: compiled from: Condition.java */
    public class n extends com.xiaomi.ad.entity.contract.zy {

        /* JADX INFO: renamed from: g */
        private static final double f31092g = 1.0d;

        /* JADX INFO: renamed from: n */
        private static final String f31093n = "UserState";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC5997k
        private g f72998zy;

        public n() {
        }

        /* JADX INFO: renamed from: p */
        public g m19179p() {
            return this.f72998zy;
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f31093n;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.k$q */
    /* JADX INFO: compiled from: Condition.java */
    public static class q extends com.xiaomi.ad.entity.contract.zy {

        /* JADX INFO: renamed from: g */
        private static final double f31095g = 1.0d;

        /* JADX INFO: renamed from: n */
        private static final String f31096n = "TimeRange";

        /* JADX INFO: renamed from: q */
        @InterfaceC5997k
        private long f31097q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC5997k
        private long f72999zy;

        public long ld6() {
            return this.f72999zy;
        }

        /* JADX INFO: renamed from: p */
        public long m19180p() {
            return this.f31097q;
        }

        public boolean qrj() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.f72999zy;
            long j3 = this.f31097q;
            return j2 <= j3 && jCurrentTimeMillis >= j2 && jCurrentTimeMillis <= j3;
        }

        public boolean x2() {
            long j2 = this.f72999zy;
            if (j2 > 0) {
                long j3 = this.f31097q;
                if (j3 > 0 && j2 < j3 && System.currentTimeMillis() < this.f31097q) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f31096n;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.k$toq */
    /* JADX INFO: compiled from: Condition.java */
    public static class toq extends com.xiaomi.ad.entity.contract.zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final String f73000f7l8 = "PackageState";

        /* JADX INFO: renamed from: y */
        private static final double f31098y = 1.0d;

        /* JADX INFO: renamed from: g */
        @e5.zy("musicPlaying")
        @InterfaceC5997k
        private boolean f31099g;

        /* JADX INFO: renamed from: n */
        @InterfaceC5997k
        private boolean f31100n;

        /* JADX INFO: renamed from: q */
        @InterfaceC5997k
        private List<String> f31101q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC5997k
        private String f73001zy;

        public List<String> ld6() {
            return this.f31101q;
        }

        public boolean n7h() {
            return this.f31099g;
        }

        /* JADX INFO: renamed from: p */
        public String m19181p() {
            return this.f73001zy;
        }

        public boolean qrj() {
            return this.f31100n;
        }

        public boolean x2() {
            return C7681k.qrj(this.f31101q);
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f73000f7l8;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.k$zy */
    /* JADX INFO: compiled from: Condition.java */
    public static class zy extends com.xiaomi.ad.entity.contract.zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final double f73002f7l8 = 1.0d;

        /* JADX INFO: renamed from: g */
        private static final String f31102g = "Slot";

        /* JADX INFO: renamed from: n */
        @e5.zy("r")
        @InterfaceC5997k
        private double f31103n;

        /* JADX INFO: renamed from: q */
        @e5.zy("lat")
        @InterfaceC5997k
        private double f31104q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @e5.zy("lng")
        @InterfaceC5997k
        private double f73003zy;

        public double ld6() {
            return this.f73003zy;
        }

        /* JADX INFO: renamed from: p */
        public double m19182p() {
            return this.f31104q;
        }

        public double x2() {
            return this.f31103n;
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f31102g;
        }
    }

    /* JADX INFO: renamed from: p */
    public static C5584k m19170p(String str) {
        return (C5584k) com.xiaomi.ad.entity.util.zy.zy(C5584k.class, str, f72989x2);
    }

    /* JADX INFO: renamed from: t */
    public static List<C5584k> m19171t(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject != null) {
                    arrayList.add(m19170p(jSONObject.toString()));
                }
            } catch (Exception e2) {
                C7683q.m28055n(f72989x2, "condition paser:", e2);
            }
        }
        return arrayList;
    }

    public q cdj() {
        return this.f72992zy;
    }

    public boolean fn3e() {
        return C7681k.qrj(this.f31080q);
    }

    public boolean fu4() {
        return this.f72992zy != null;
    }

    /* JADX INFO: renamed from: h */
    public long m19172h() {
        return this.f72991ld6;
    }

    /* JADX INFO: renamed from: i */
    public boolean m19173i() {
        return this.f31078n != null;
    }

    public n ki() {
        return this.f31082y;
    }

    public List<toq> kja0() {
        return this.f31081s;
    }

    public k ld6() {
        return this.f72990f7l8;
    }

    public List<zy> n7h() {
        return this.f31080q;
    }

    public boolean ni7() {
        return C7681k.qrj(this.f31081s);
    }

    public boolean o1t() {
        return this.f31077g;
    }

    public zy qrj() {
        return this.f31078n;
    }

    public boolean t8r() {
        return this.f72990f7l8 != null;
    }

    public boolean wvg() {
        return (this.f31078n == null && this.f72992zy == null) ? false : true;
    }

    public long x2() {
        return this.f31079p;
    }

    @Override // com.xiaomi.ad.entity.contract.zy
    /* JADX INFO: renamed from: y */
    protected String mo18161y() {
        return f72989x2;
    }

    /* JADX INFO: renamed from: z */
    public boolean m19174z() {
        return this.f31082y != null;
    }

    public boolean zurt() {
        return (fn3e() || ni7() || t8r() || m19174z()) ? false : true;
    }
}
