package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zxq implements oaex<zxq, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f34313a;

    /* JADX INFO: renamed from: a */
    public long f34314a;

    /* JADX INFO: renamed from: a */
    public b2 f34315a;

    /* JADX INFO: renamed from: a */
    public z5 f34316a;

    /* JADX INFO: renamed from: a */
    public String f34317a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f34319a;

    /* JADX INFO: renamed from: b */
    public int f34321b;

    /* JADX INFO: renamed from: b */
    public long f34322b;

    /* JADX INFO: renamed from: b */
    public String f34323b;

    /* JADX INFO: renamed from: c */
    public int f34325c;

    /* JADX INFO: renamed from: c */
    public String f34326c;

    /* JADX INFO: renamed from: d */
    public String f34328d;

    /* JADX INFO: renamed from: e */
    public String f34329e;

    /* JADX INFO: renamed from: f */
    public String f34330f;

    /* JADX INFO: renamed from: g */
    public String f34331g;

    /* JADX INFO: renamed from: h */
    public String f34332h;

    /* JADX INFO: renamed from: i */
    public String f34333i;

    /* JADX INFO: renamed from: j */
    public String f34334j;

    /* JADX INFO: renamed from: k */
    public String f34335k;

    /* JADX INFO: renamed from: l */
    public String f34336l;

    /* JADX INFO: renamed from: m */
    public String f34337m;

    /* JADX INFO: renamed from: n */
    public String f34338n;

    /* JADX INFO: renamed from: o */
    public String f34339o;

    /* JADX INFO: renamed from: p */
    public String f34340p;

    /* JADX INFO: renamed from: q */
    public String f34341q;

    /* JADX INFO: renamed from: r */
    public String f34342r;

    /* JADX INFO: renamed from: y */
    private static final s31 f34311y = new s31("XmPushActionRegistration");

    /* JADX INFO: renamed from: s */
    private static final vc f34305s = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: z */
    private static final vc f34312z = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: t */
    private static final vc f34306t = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: x */
    private static final vc f34310x = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: u */
    private static final vc f34307u = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final vc f73778bo = new vc("", com.google.common.base.zy.f68132qrj, 6);

    /* JADX INFO: renamed from: v */
    private static final vc f34308v = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: w */
    private static final vc f34309w = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final vc f73777ab = new vc("", com.google.common.base.zy.f68132qrj, 9);
    private static final vc bb = new vc("", com.google.common.base.zy.f68132qrj, 10);
    private static final vc bp = new vc("", com.google.common.base.zy.f68132qrj, 11);
    private static final vc bv = new vc("", com.google.common.base.zy.f68132qrj, 12);
    private static final vc an = new vc("", (byte) 8, 13);
    private static final vc id = new vc("", (byte) 8, 14);
    private static final vc in = new vc("", com.google.common.base.zy.f68132qrj, 15);
    private static final vc bl = new vc("", com.google.common.base.zy.f68132qrj, 16);
    private static final vc as = new vc("", com.google.common.base.zy.f68132qrj, 17);
    private static final vc bg = new vc("", com.google.common.base.zy.f68132qrj, 18);
    private static final vc az = new vc("", (byte) 8, 19);
    private static final vc ba = new vc("", (byte) 8, 20);
    private static final vc ax = new vc("", (byte) 2, 21);
    private static final vc bq = new vc("", (byte) 10, 22);
    private static final vc ac = new vc("", (byte) 10, 23);
    private static final vc ad = new vc("", com.google.common.base.zy.f68132qrj, 24);
    private static final vc am = new vc("", com.google.common.base.zy.f68132qrj, 25);
    private static final vc ay = new vc("", (byte) 2, 26);
    private static final vc be = new vc("", com.google.common.base.zy.f68124kja0, 100);
    private static final vc aj = new vc("", (byte) 2, 101);
    private static final vc bs = new vc("", com.google.common.base.zy.f68132qrj, 102);

    /* JADX INFO: renamed from: a */
    private BitSet f34318a = new BitSet(8);

    /* JADX INFO: renamed from: a */
    public boolean f34320a = true;

    /* JADX INFO: renamed from: c */
    public boolean f34327c = false;

    /* JADX INFO: renamed from: b */
    public boolean f34324b = false;

    /* JADX INFO: renamed from: A */
    public boolean m22137A() {
        return this.f34319a != null;
    }

    /* JADX INFO: renamed from: B */
    public boolean m22138B() {
        return this.f34318a.get(7);
    }

    /* JADX INFO: renamed from: C */
    public boolean m22139C() {
        return this.f34342r != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22147a() {
        return this.f34317a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m22153b() {
        return this.f34315a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m22158c() {
        return this.f34323b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m22161d() {
        return this.f34326c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m22164e() {
        return this.f34328d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof zxq)) {
            return m22148a((zxq) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m22167f() {
        return this.f34329e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m22170g() {
        return this.f34330f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m22173h() {
        return this.f34331g != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m22175i() {
        return this.f34332h != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m22176j() {
        return this.f34333i != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m22177k() {
        return this.f34334j != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m22178l() {
        return this.f34335k != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m22179m() {
        return this.f34318a.get(0);
    }

    /* JADX INFO: renamed from: n */
    public boolean m22180n() {
        return this.f34318a.get(1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m22181o() {
        return this.f34336l != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m22182p() {
        return this.f34337m != null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m22183q() {
        return this.f34338n != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m22184r() {
        return this.f34339o != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m22185s() {
        return this.f34318a.get(2);
    }

    /* JADX INFO: renamed from: t */
    public boolean m22186t() {
        return this.f34316a != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        boolean z3 = false;
        if (m22147a()) {
            sb.append("debug:");
            String str = this.f34317a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m22153b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f34315a;
            if (b2Var == null) {
                sb.append("null");
            } else {
                sb.append(b2Var);
            }
        } else {
            z3 = z2;
        }
        if (!z3) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f34323b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.gvn7.toq(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f34326c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m22164e()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str4 = this.f34328d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m22167f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f34329e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(", ");
        sb.append("token:");
        String str6 = this.f34330f;
        if (str6 == null) {
            sb.append("null");
        } else {
            sb.append(str6);
        }
        if (m22173h()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str7 = this.f34331g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m22175i()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str8 = this.f34332h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m22176j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            String str9 = this.f34333i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m22177k()) {
            sb.append(", ");
            sb.append("regId:");
            String str10 = this.f34334j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m22178l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            String str11 = this.f34335k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m22179m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f34313a);
        }
        if (m22180n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f34321b);
        }
        if (m22181o()) {
            sb.append(", ");
            sb.append("androidId:");
            String str12 = this.f34336l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (m22182p()) {
            sb.append(", ");
            sb.append("imei:");
            String str13 = this.f34337m;
            if (str13 == null) {
                sb.append("null");
            } else {
                sb.append(str13);
            }
        }
        if (m22183q()) {
            sb.append(", ");
            sb.append("serial:");
            String str14 = this.f34338n;
            if (str14 == null) {
                sb.append("null");
            } else {
                sb.append(str14);
            }
        }
        if (m22184r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str15 = this.f34339o;
            if (str15 == null) {
                sb.append("null");
            } else {
                sb.append(str15);
            }
        }
        if (m22185s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f34325c);
        }
        if (m22186t()) {
            sb.append(", ");
            sb.append("reason:");
            z5 z5Var = this.f34316a;
            if (z5Var == null) {
                sb.append("null");
            } else {
                sb.append(z5Var);
            }
        }
        if (m22187u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f34320a);
        }
        if (m22188v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f34314a);
        }
        if (m22189w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f34322b);
        }
        if (m22190x()) {
            sb.append(", ");
            sb.append("subImei:");
            String str16 = this.f34340p;
            if (str16 == null) {
                sb.append("null");
            } else {
                sb.append(str16);
            }
        }
        if (m22191y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            String str17 = this.f34341q;
            if (str17 == null) {
                sb.append("null");
            } else {
                sb.append(str17);
            }
        }
        if (m22192z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f34324b);
        }
        if (m22137A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            Map<String, String> map = this.f34319a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m22138B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f34327c);
        }
        if (m22139C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            String str18 = this.f34342r;
            if (str18 == null) {
                sb.append("null");
            } else {
                sb.append(str18);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean m22187u() {
        return this.f34318a.get(3);
    }

    /* JADX INFO: renamed from: v */
    public boolean m22188v() {
        return this.f34318a.get(4);
    }

    /* JADX INFO: renamed from: w */
    public boolean m22189w() {
        return this.f34318a.get(5);
    }

    /* JADX INFO: renamed from: x */
    public boolean m22190x() {
        return this.f34340p != null;
    }

    /* JADX INFO: renamed from: y */
    public boolean m22191y() {
        return this.f34341q != null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m22192z() {
        return this.f34318a.get(6);
    }

    /* JADX INFO: renamed from: a */
    public String m22144a() {
        return this.f34323b;
    }

    /* JADX INFO: renamed from: b */
    public String m22151b() {
        return this.f34326c;
    }

    /* JADX INFO: renamed from: c */
    public zxq m22155c(String str) {
        this.f34328d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public zxq m22159d(String str) {
        this.f34329e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public zxq m22162e(String str) {
        this.f34330f = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public zxq m22165f(String str) {
        this.f34331g = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public zxq m22168g(String str) {
        this.f34332h = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public zxq m22171h(String str) {
        this.f34335k = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public zxq m22174i(String str) {
        this.f34339o = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public zxq m22143a(String str) {
        this.f34323b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public zxq m22150b(String str) {
        this.f34326c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m22156c() {
        return this.f34330f;
    }

    /* JADX INFO: renamed from: d */
    public void m22160d(boolean z2) {
        this.f34318a.set(3, z2);
    }

    /* JADX INFO: renamed from: e */
    public void m22163e(boolean z2) {
        this.f34318a.set(4, z2);
    }

    /* JADX INFO: renamed from: f */
    public void m22166f(boolean z2) {
        this.f34318a.set(5, z2);
    }

    /* JADX INFO: renamed from: g */
    public void m22169g(boolean z2) {
        this.f34318a.set(6, z2);
    }

    /* JADX INFO: renamed from: h */
    public void m22172h(boolean z2) {
        this.f34318a.set(7, z2);
    }

    /* JADX INFO: renamed from: a */
    public zxq m22141a(int i2) {
        this.f34313a = i2;
        m22146a(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public zxq m22149b(int i2) {
        this.f34321b = i2;
        m22152b(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public zxq m22154c(int i2) {
        this.f34325c = i2;
        m22157c(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m22146a(boolean z2) {
        this.f34318a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public void m22152b(boolean z2) {
        this.f34318a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m22157c(boolean z2) {
        this.f34318a.set(2, z2);
    }

    /* JADX INFO: renamed from: a */
    public zxq m22142a(z5 z5Var) {
        this.f34316a = z5Var;
        return this;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m22145a();
        ipVar.mo20992i(f34311y);
        if (this.f34317a != null && m22147a()) {
            ipVar.cdj(f34305s);
            ipVar.fn3e(this.f34317a);
            ipVar.o1t();
        }
        if (this.f34315a != null && m22153b()) {
            ipVar.cdj(f34312z);
            this.f34315a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f34323b != null) {
            ipVar.cdj(f34306t);
            ipVar.fn3e(this.f34323b);
            ipVar.o1t();
        }
        if (this.f34326c != null) {
            ipVar.cdj(f34310x);
            ipVar.fn3e(this.f34326c);
            ipVar.o1t();
        }
        if (this.f34328d != null && m22164e()) {
            ipVar.cdj(f34307u);
            ipVar.fn3e(this.f34328d);
            ipVar.o1t();
        }
        if (this.f34329e != null && m22167f()) {
            ipVar.cdj(f73778bo);
            ipVar.fn3e(this.f34329e);
            ipVar.o1t();
        }
        if (this.f34330f != null) {
            ipVar.cdj(f34308v);
            ipVar.fn3e(this.f34330f);
            ipVar.o1t();
        }
        if (this.f34331g != null && m22173h()) {
            ipVar.cdj(f34309w);
            ipVar.fn3e(this.f34331g);
            ipVar.o1t();
        }
        if (this.f34332h != null && m22175i()) {
            ipVar.cdj(f73777ab);
            ipVar.fn3e(this.f34332h);
            ipVar.o1t();
        }
        if (this.f34333i != null && m22176j()) {
            ipVar.cdj(bb);
            ipVar.fn3e(this.f34333i);
            ipVar.o1t();
        }
        if (this.f34334j != null && m22177k()) {
            ipVar.cdj(bp);
            ipVar.fn3e(this.f34334j);
            ipVar.o1t();
        }
        if (this.f34335k != null && m22178l()) {
            ipVar.cdj(bv);
            ipVar.fn3e(this.f34335k);
            ipVar.o1t();
        }
        if (m22179m()) {
            ipVar.cdj(an);
            ipVar.kja0(this.f34313a);
            ipVar.o1t();
        }
        if (m22180n()) {
            ipVar.cdj(id);
            ipVar.kja0(this.f34321b);
            ipVar.o1t();
        }
        if (this.f34336l != null && m22181o()) {
            ipVar.cdj(in);
            ipVar.fn3e(this.f34336l);
            ipVar.o1t();
        }
        if (this.f34337m != null && m22182p()) {
            ipVar.cdj(bl);
            ipVar.fn3e(this.f34337m);
            ipVar.o1t();
        }
        if (this.f34338n != null && m22183q()) {
            ipVar.cdj(as);
            ipVar.fn3e(this.f34338n);
            ipVar.o1t();
        }
        if (this.f34339o != null && m22184r()) {
            ipVar.cdj(bg);
            ipVar.fn3e(this.f34339o);
            ipVar.o1t();
        }
        if (m22185s()) {
            ipVar.cdj(az);
            ipVar.kja0(this.f34325c);
            ipVar.o1t();
        }
        if (this.f34316a != null && m22186t()) {
            ipVar.cdj(ba);
            ipVar.kja0(this.f34316a.m22074a());
            ipVar.o1t();
        }
        if (m22187u()) {
            ipVar.cdj(ax);
            ipVar.fu4(this.f34320a);
            ipVar.o1t();
        }
        if (m22188v()) {
            ipVar.cdj(bq);
            ipVar.mo20991h(this.f34314a);
            ipVar.o1t();
        }
        if (m22189w()) {
            ipVar.cdj(ac);
            ipVar.mo20991h(this.f34322b);
            ipVar.o1t();
        }
        if (this.f34340p != null && m22190x()) {
            ipVar.cdj(ad);
            ipVar.fn3e(this.f34340p);
            ipVar.o1t();
        }
        if (this.f34341q != null && m22191y()) {
            ipVar.cdj(am);
            ipVar.fn3e(this.f34341q);
            ipVar.o1t();
        }
        if (m22192z()) {
            ipVar.cdj(ay);
            ipVar.fu4(this.f34324b);
            ipVar.o1t();
        }
        if (this.f34319a != null && m22137A()) {
            ipVar.cdj(be);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f34319a.size()));
            for (Map.Entry<String, String> entry : this.f34319a.entrySet()) {
                ipVar.fn3e(entry.getKey());
                ipVar.fn3e(entry.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        if (m22138B()) {
            ipVar.cdj(aj);
            ipVar.fu4(this.f34327c);
            ipVar.o1t();
        }
        if (this.f34342r != null && m22139C()) {
            ipVar.cdj(bs);
            ipVar.fn3e(this.f34342r);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m22148a(zxq zxqVar) {
        if (zxqVar == null) {
            return false;
        }
        boolean zM22147a = m22147a();
        boolean zM22147a2 = zxqVar.m22147a();
        if ((zM22147a || zM22147a2) && !(zM22147a && zM22147a2 && this.f34317a.equals(zxqVar.f34317a))) {
            return false;
        }
        boolean zM22153b = m22153b();
        boolean zM22153b2 = zxqVar.m22153b();
        if ((zM22153b || zM22153b2) && !(zM22153b && zM22153b2 && this.f34315a.m20627a(zxqVar.f34315a))) {
            return false;
        }
        boolean zM22158c = m22158c();
        boolean zM22158c2 = zxqVar.m22158c();
        if ((zM22158c || zM22158c2) && !(zM22158c && zM22158c2 && this.f34323b.equals(zxqVar.f34323b))) {
            return false;
        }
        boolean zM22161d = m22161d();
        boolean zM22161d2 = zxqVar.m22161d();
        if ((zM22161d || zM22161d2) && !(zM22161d && zM22161d2 && this.f34326c.equals(zxqVar.f34326c))) {
            return false;
        }
        boolean zM22164e = m22164e();
        boolean zM22164e2 = zxqVar.m22164e();
        if ((zM22164e || zM22164e2) && !(zM22164e && zM22164e2 && this.f34328d.equals(zxqVar.f34328d))) {
            return false;
        }
        boolean zM22167f = m22167f();
        boolean zM22167f2 = zxqVar.m22167f();
        if ((zM22167f || zM22167f2) && !(zM22167f && zM22167f2 && this.f34329e.equals(zxqVar.f34329e))) {
            return false;
        }
        boolean zM22170g = m22170g();
        boolean zM22170g2 = zxqVar.m22170g();
        if ((zM22170g || zM22170g2) && !(zM22170g && zM22170g2 && this.f34330f.equals(zxqVar.f34330f))) {
            return false;
        }
        boolean zM22173h = m22173h();
        boolean zM22173h2 = zxqVar.m22173h();
        if ((zM22173h || zM22173h2) && !(zM22173h && zM22173h2 && this.f34331g.equals(zxqVar.f34331g))) {
            return false;
        }
        boolean zM22175i = m22175i();
        boolean zM22175i2 = zxqVar.m22175i();
        if ((zM22175i || zM22175i2) && !(zM22175i && zM22175i2 && this.f34332h.equals(zxqVar.f34332h))) {
            return false;
        }
        boolean zM22176j = m22176j();
        boolean zM22176j2 = zxqVar.m22176j();
        if ((zM22176j || zM22176j2) && !(zM22176j && zM22176j2 && this.f34333i.equals(zxqVar.f34333i))) {
            return false;
        }
        boolean zM22177k = m22177k();
        boolean zM22177k2 = zxqVar.m22177k();
        if ((zM22177k || zM22177k2) && !(zM22177k && zM22177k2 && this.f34334j.equals(zxqVar.f34334j))) {
            return false;
        }
        boolean zM22178l = m22178l();
        boolean zM22178l2 = zxqVar.m22178l();
        if ((zM22178l || zM22178l2) && !(zM22178l && zM22178l2 && this.f34335k.equals(zxqVar.f34335k))) {
            return false;
        }
        boolean zM22179m = m22179m();
        boolean zM22179m2 = zxqVar.m22179m();
        if ((zM22179m || zM22179m2) && !(zM22179m && zM22179m2 && this.f34313a == zxqVar.f34313a)) {
            return false;
        }
        boolean zM22180n = m22180n();
        boolean zM22180n2 = zxqVar.m22180n();
        if ((zM22180n || zM22180n2) && !(zM22180n && zM22180n2 && this.f34321b == zxqVar.f34321b)) {
            return false;
        }
        boolean zM22181o = m22181o();
        boolean zM22181o2 = zxqVar.m22181o();
        if ((zM22181o || zM22181o2) && !(zM22181o && zM22181o2 && this.f34336l.equals(zxqVar.f34336l))) {
            return false;
        }
        boolean zM22182p = m22182p();
        boolean zM22182p2 = zxqVar.m22182p();
        if ((zM22182p || zM22182p2) && !(zM22182p && zM22182p2 && this.f34337m.equals(zxqVar.f34337m))) {
            return false;
        }
        boolean zM22183q = m22183q();
        boolean zM22183q2 = zxqVar.m22183q();
        if ((zM22183q || zM22183q2) && !(zM22183q && zM22183q2 && this.f34338n.equals(zxqVar.f34338n))) {
            return false;
        }
        boolean zM22184r = m22184r();
        boolean zM22184r2 = zxqVar.m22184r();
        if ((zM22184r || zM22184r2) && !(zM22184r && zM22184r2 && this.f34339o.equals(zxqVar.f34339o))) {
            return false;
        }
        boolean zM22185s = m22185s();
        boolean zM22185s2 = zxqVar.m22185s();
        if ((zM22185s || zM22185s2) && !(zM22185s && zM22185s2 && this.f34325c == zxqVar.f34325c)) {
            return false;
        }
        boolean zM22186t = m22186t();
        boolean zM22186t2 = zxqVar.m22186t();
        if ((zM22186t || zM22186t2) && !(zM22186t && zM22186t2 && this.f34316a.equals(zxqVar.f34316a))) {
            return false;
        }
        boolean zM22187u = m22187u();
        boolean zM22187u2 = zxqVar.m22187u();
        if ((zM22187u || zM22187u2) && !(zM22187u && zM22187u2 && this.f34320a == zxqVar.f34320a)) {
            return false;
        }
        boolean zM22188v = m22188v();
        boolean zM22188v2 = zxqVar.m22188v();
        if ((zM22188v || zM22188v2) && !(zM22188v && zM22188v2 && this.f34314a == zxqVar.f34314a)) {
            return false;
        }
        boolean zM22189w = m22189w();
        boolean zM22189w2 = zxqVar.m22189w();
        if ((zM22189w || zM22189w2) && !(zM22189w && zM22189w2 && this.f34322b == zxqVar.f34322b)) {
            return false;
        }
        boolean zM22190x = m22190x();
        boolean zM22190x2 = zxqVar.m22190x();
        if ((zM22190x || zM22190x2) && !(zM22190x && zM22190x2 && this.f34340p.equals(zxqVar.f34340p))) {
            return false;
        }
        boolean zM22191y = m22191y();
        boolean zM22191y2 = zxqVar.m22191y();
        if ((zM22191y || zM22191y2) && !(zM22191y && zM22191y2 && this.f34341q.equals(zxqVar.f34341q))) {
            return false;
        }
        boolean zM22192z = m22192z();
        boolean zM22192z2 = zxqVar.m22192z();
        if ((zM22192z || zM22192z2) && !(zM22192z && zM22192z2 && this.f34324b == zxqVar.f34324b)) {
            return false;
        }
        boolean zM22137A = m22137A();
        boolean zM22137A2 = zxqVar.m22137A();
        if ((zM22137A || zM22137A2) && !(zM22137A && zM22137A2 && this.f34319a.equals(zxqVar.f34319a))) {
            return false;
        }
        boolean zM22138B = m22138B();
        boolean zM22138B2 = zxqVar.m22138B();
        if ((zM22138B || zM22138B2) && !(zM22138B && zM22138B2 && this.f34327c == zxqVar.f34327c)) {
            return false;
        }
        boolean zM22139C = m22139C();
        boolean zM22139C2 = zxqVar.m22139C();
        if (zM22139C || zM22139C2) {
            return zM22139C && zM22139C2 && this.f34342r.equals(zxqVar.f34342r);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(zxq zxqVar) {
        int iM21911n;
        int iLd6;
        int iM21915y;
        int iLd62;
        int iM21911n2;
        int iM21911n3;
        int iZy;
        int iZy2;
        int iLd63;
        int iM21913q;
        int qVar;
        int iM21911n4;
        int iM21911n5;
        int iM21911n6;
        int iM21911n7;
        int qVar2;
        int qVar3;
        int iM21911n8;
        int iM21911n9;
        int iM21911n10;
        int iM21911n11;
        int iM21911n12;
        int iM21911n13;
        int iM21911n14;
        int iM21911n15;
        int iM21911n16;
        int iM21911n17;
        int iM21913q2;
        int iM21911n18;
        if (!getClass().equals(zxqVar.getClass())) {
            return getClass().getName().compareTo(zxqVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m22147a()).compareTo(Boolean.valueOf(zxqVar.m22147a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m22147a() && (iM21911n18 = vh.m21911n(this.f34317a, zxqVar.f34317a)) != 0) {
            return iM21911n18;
        }
        int iCompareTo2 = Boolean.valueOf(m22153b()).compareTo(Boolean.valueOf(zxqVar.m22153b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m22153b() && (iM21913q2 = vh.m21913q(this.f34315a, zxqVar.f34315a)) != 0) {
            return iM21913q2;
        }
        int iCompareTo3 = Boolean.valueOf(m22158c()).compareTo(Boolean.valueOf(zxqVar.m22158c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m22158c() && (iM21911n17 = vh.m21911n(this.f34323b, zxqVar.f34323b)) != 0) {
            return iM21911n17;
        }
        int iCompareTo4 = Boolean.valueOf(m22161d()).compareTo(Boolean.valueOf(zxqVar.m22161d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m22161d() && (iM21911n16 = vh.m21911n(this.f34326c, zxqVar.f34326c)) != 0) {
            return iM21911n16;
        }
        int iCompareTo5 = Boolean.valueOf(m22164e()).compareTo(Boolean.valueOf(zxqVar.m22164e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m22164e() && (iM21911n15 = vh.m21911n(this.f34328d, zxqVar.f34328d)) != 0) {
            return iM21911n15;
        }
        int iCompareTo6 = Boolean.valueOf(m22167f()).compareTo(Boolean.valueOf(zxqVar.m22167f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m22167f() && (iM21911n14 = vh.m21911n(this.f34329e, zxqVar.f34329e)) != 0) {
            return iM21911n14;
        }
        int iCompareTo7 = Boolean.valueOf(m22170g()).compareTo(Boolean.valueOf(zxqVar.m22170g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m22170g() && (iM21911n13 = vh.m21911n(this.f34330f, zxqVar.f34330f)) != 0) {
            return iM21911n13;
        }
        int iCompareTo8 = Boolean.valueOf(m22173h()).compareTo(Boolean.valueOf(zxqVar.m22173h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m22173h() && (iM21911n12 = vh.m21911n(this.f34331g, zxqVar.f34331g)) != 0) {
            return iM21911n12;
        }
        int iCompareTo9 = Boolean.valueOf(m22175i()).compareTo(Boolean.valueOf(zxqVar.m22175i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m22175i() && (iM21911n11 = vh.m21911n(this.f34332h, zxqVar.f34332h)) != 0) {
            return iM21911n11;
        }
        int iCompareTo10 = Boolean.valueOf(m22176j()).compareTo(Boolean.valueOf(zxqVar.m22176j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m22176j() && (iM21911n10 = vh.m21911n(this.f34333i, zxqVar.f34333i)) != 0) {
            return iM21911n10;
        }
        int iCompareTo11 = Boolean.valueOf(m22177k()).compareTo(Boolean.valueOf(zxqVar.m22177k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m22177k() && (iM21911n9 = vh.m21911n(this.f34334j, zxqVar.f34334j)) != 0) {
            return iM21911n9;
        }
        int iCompareTo12 = Boolean.valueOf(m22178l()).compareTo(Boolean.valueOf(zxqVar.m22178l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m22178l() && (iM21911n8 = vh.m21911n(this.f34335k, zxqVar.f34335k)) != 0) {
            return iM21911n8;
        }
        int iCompareTo13 = Boolean.valueOf(m22179m()).compareTo(Boolean.valueOf(zxqVar.m22179m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m22179m() && (qVar3 = vh.toq(this.f34313a, zxqVar.f34313a)) != 0) {
            return qVar3;
        }
        int iCompareTo14 = Boolean.valueOf(m22180n()).compareTo(Boolean.valueOf(zxqVar.m22180n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m22180n() && (qVar2 = vh.toq(this.f34321b, zxqVar.f34321b)) != 0) {
            return qVar2;
        }
        int iCompareTo15 = Boolean.valueOf(m22181o()).compareTo(Boolean.valueOf(zxqVar.m22181o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m22181o() && (iM21911n7 = vh.m21911n(this.f34336l, zxqVar.f34336l)) != 0) {
            return iM21911n7;
        }
        int iCompareTo16 = Boolean.valueOf(m22182p()).compareTo(Boolean.valueOf(zxqVar.m22182p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m22182p() && (iM21911n6 = vh.m21911n(this.f34337m, zxqVar.f34337m)) != 0) {
            return iM21911n6;
        }
        int iCompareTo17 = Boolean.valueOf(m22183q()).compareTo(Boolean.valueOf(zxqVar.m22183q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m22183q() && (iM21911n5 = vh.m21911n(this.f34338n, zxqVar.f34338n)) != 0) {
            return iM21911n5;
        }
        int iCompareTo18 = Boolean.valueOf(m22184r()).compareTo(Boolean.valueOf(zxqVar.m22184r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m22184r() && (iM21911n4 = vh.m21911n(this.f34339o, zxqVar.f34339o)) != 0) {
            return iM21911n4;
        }
        int iCompareTo19 = Boolean.valueOf(m22185s()).compareTo(Boolean.valueOf(zxqVar.m22185s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m22185s() && (qVar = vh.toq(this.f34325c, zxqVar.f34325c)) != 0) {
            return qVar;
        }
        int iCompareTo20 = Boolean.valueOf(m22186t()).compareTo(Boolean.valueOf(zxqVar.m22186t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (m22186t() && (iM21913q = vh.m21913q(this.f34316a, zxqVar.f34316a)) != 0) {
            return iM21913q;
        }
        int iCompareTo21 = Boolean.valueOf(m22187u()).compareTo(Boolean.valueOf(zxqVar.m22187u()));
        if (iCompareTo21 != 0) {
            return iCompareTo21;
        }
        if (m22187u() && (iLd63 = vh.ld6(this.f34320a, zxqVar.f34320a)) != 0) {
            return iLd63;
        }
        int iCompareTo22 = Boolean.valueOf(m22188v()).compareTo(Boolean.valueOf(zxqVar.m22188v()));
        if (iCompareTo22 != 0) {
            return iCompareTo22;
        }
        if (m22188v() && (iZy2 = vh.zy(this.f34314a, zxqVar.f34314a)) != 0) {
            return iZy2;
        }
        int iCompareTo23 = Boolean.valueOf(m22189w()).compareTo(Boolean.valueOf(zxqVar.m22189w()));
        if (iCompareTo23 != 0) {
            return iCompareTo23;
        }
        if (m22189w() && (iZy = vh.zy(this.f34322b, zxqVar.f34322b)) != 0) {
            return iZy;
        }
        int iCompareTo24 = Boolean.valueOf(m22190x()).compareTo(Boolean.valueOf(zxqVar.m22190x()));
        if (iCompareTo24 != 0) {
            return iCompareTo24;
        }
        if (m22190x() && (iM21911n3 = vh.m21911n(this.f34340p, zxqVar.f34340p)) != 0) {
            return iM21911n3;
        }
        int iCompareTo25 = Boolean.valueOf(m22191y()).compareTo(Boolean.valueOf(zxqVar.m22191y()));
        if (iCompareTo25 != 0) {
            return iCompareTo25;
        }
        if (m22191y() && (iM21911n2 = vh.m21911n(this.f34341q, zxqVar.f34341q)) != 0) {
            return iM21911n2;
        }
        int iCompareTo26 = Boolean.valueOf(m22192z()).compareTo(Boolean.valueOf(zxqVar.m22192z()));
        if (iCompareTo26 != 0) {
            return iCompareTo26;
        }
        if (m22192z() && (iLd62 = vh.ld6(this.f34324b, zxqVar.f34324b)) != 0) {
            return iLd62;
        }
        int iCompareTo27 = Boolean.valueOf(m22137A()).compareTo(Boolean.valueOf(zxqVar.m22137A()));
        if (iCompareTo27 != 0) {
            return iCompareTo27;
        }
        if (m22137A() && (iM21915y = vh.m21915y(this.f34319a, zxqVar.f34319a)) != 0) {
            return iM21915y;
        }
        int iCompareTo28 = Boolean.valueOf(m22138B()).compareTo(Boolean.valueOf(zxqVar.m22138B()));
        if (iCompareTo28 != 0) {
            return iCompareTo28;
        }
        if (m22138B() && (iLd6 = vh.ld6(this.f34327c, zxqVar.f34327c)) != 0) {
            return iLd6;
        }
        int iCompareTo29 = Boolean.valueOf(m22139C()).compareTo(Boolean.valueOf(zxqVar.m22139C()));
        if (iCompareTo29 != 0) {
            return iCompareTo29;
        }
        if (!m22139C() || (iM21911n = vh.m21911n(this.f34342r, zxqVar.f34342r)) == 0) {
            return 0;
        }
        return iM21911n;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: a */
    public void mo20557a(ip ipVar) throws dbf {
        ipVar.mo20997s();
        while (true) {
            vc vcVarMo20994n = ipVar.mo20994n();
            byte b2 = vcVarMo20994n.f73703toq;
            if (b2 == 0) {
                ipVar.jk();
                m22145a();
                return;
            }
            short s2 = vcVarMo20994n.f73704zy;
            switch (s2) {
                case 1:
                    if (b2 == 11) {
                        this.f34317a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f34315a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f34323b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f34326c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f34328d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f34329e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f34330f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f34331g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f34332h = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f34333i = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f34334j = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f34335k = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 8) {
                        this.f34313a = ipVar.zy();
                        m22146a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 14:
                    if (b2 == 8) {
                        this.f34321b = ipVar.zy();
                        m22152b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 15:
                    if (b2 == 11) {
                        this.f34336l = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 16:
                    if (b2 == 11) {
                        this.f34337m = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 17:
                    if (b2 == 11) {
                        this.f34338n = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 18:
                    if (b2 == 11) {
                        this.f34339o = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 19:
                    if (b2 == 8) {
                        this.f34325c = ipVar.zy();
                        m22157c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 20:
                    if (b2 == 8) {
                        this.f34316a = z5.m22073a(ipVar.zy());
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 21:
                    if (b2 == 2) {
                        this.f34320a = ipVar.mo21000z();
                        m22160d(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 22:
                    if (b2 == 10) {
                        this.f34314a = ipVar.mo20996q();
                        m22163e(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 23:
                    if (b2 == 10) {
                        this.f34322b = ipVar.mo20996q();
                        m22166f(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 24:
                    if (b2 == 11) {
                        this.f34340p = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 25:
                    if (b2 == 11) {
                        this.f34341q = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 26:
                    if (b2 == 2) {
                        this.f34324b = ipVar.mo21000z();
                        m22169g(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                default:
                    switch (s2) {
                        case 100:
                            if (b2 == 13) {
                                ap23 ap23VarF7l8 = ipVar.f7l8();
                                this.f34319a = new HashMap(ap23VarF7l8.f73265zy * 2);
                                for (int i2 = 0; i2 < ap23VarF7l8.f73265zy; i2++) {
                                    this.f34319a.put(ipVar.mo20995p(), ipVar.mo20995p());
                                }
                                ipVar.fti();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 101:
                            if (b2 == 2) {
                                this.f34327c = ipVar.mo21000z();
                                m22172h(true);
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 102:
                            if (b2 == 11) {
                                this.f34342r = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        default:
                            koj.m21140k(ipVar, b2);
                            break;
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m22145a() throws dbf {
        if (this.f34323b != null) {
            if (this.f34326c != null) {
                if (this.f34330f != null) {
                    return;
                }
                throw new dbf("Required field 'token' was not present! Struct: " + toString());
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
