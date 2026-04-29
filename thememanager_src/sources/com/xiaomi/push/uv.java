package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class uv implements oaex<uv, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f34000a;

    /* JADX INFO: renamed from: a */
    public b2 f34001a;

    /* JADX INFO: renamed from: a */
    public String f34002a;

    /* JADX INFO: renamed from: a */
    private BitSet f34003a = new BitSet(1);

    /* JADX INFO: renamed from: b */
    public String f34004b;

    /* JADX INFO: renamed from: c */
    public String f34005c;

    /* JADX INFO: renamed from: d */
    public String f34006d;

    /* JADX INFO: renamed from: e */
    public String f34007e;

    /* JADX INFO: renamed from: f */
    public String f34008f;

    /* JADX INFO: renamed from: g */
    public String f34009g;

    /* JADX INFO: renamed from: k */
    private static final s31 f33992k = new s31("XmPushActionUnSubscriptionResult");

    /* JADX INFO: renamed from: q */
    private static final vc f33995q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33993n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: y */
    private static final vc f33998y = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: s */
    private static final vc f33996s = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: p */
    private static final vc f33994p = new vc("", (byte) 10, 6);

    /* JADX INFO: renamed from: h */
    private static final vc f33990h = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: i */
    private static final vc f33991i = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: z */
    private static final vc f33999z = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: t */
    private static final vc f33997t = new vc("", com.google.common.base.zy.f68132qrj, 10);

    /* JADX INFO: renamed from: a */
    public boolean m21877a() {
        return this.f34002a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21880b() {
        return this.f34001a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21882c() {
        return this.f34004b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21883d() {
        return this.f34005c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m21884e() {
        return this.f34003a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof uv)) {
            return m21878a((uv) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21885f() {
        return this.f34006d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m21886g() {
        return this.f34007e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21887h() {
        return this.f34008f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21888i() {
        return this.f34009g != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z3 = false;
        if (m21877a()) {
            sb.append("debug:");
            String str = this.f34002a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m21880b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f34001a;
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
        String str2 = this.f34004b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m21883d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f34005c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m21884e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f34000a);
        }
        if (m21885f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f34006d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m21886g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f34007e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m21887h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f34008f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m21888i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f34009g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public String m21874a() {
        return this.f34004b;
    }

    /* JADX INFO: renamed from: b */
    public String m21879b() {
        return this.f34007e;
    }

    /* JADX INFO: renamed from: c */
    public String m21881c() {
        return this.f34009g;
    }

    /* JADX INFO: renamed from: a */
    public void m21876a(boolean z2) {
        this.f34003a.set(0, z2);
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21875a();
        ipVar.mo20992i(f33992k);
        if (this.f34002a != null && m21877a()) {
            ipVar.cdj(f33995q);
            ipVar.fn3e(this.f34002a);
            ipVar.o1t();
        }
        if (this.f34001a != null && m21880b()) {
            ipVar.cdj(f33993n);
            this.f34001a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f34004b != null) {
            ipVar.cdj(f33998y);
            ipVar.fn3e(this.f34004b);
            ipVar.o1t();
        }
        if (this.f34005c != null && m21883d()) {
            ipVar.cdj(f33996s);
            ipVar.fn3e(this.f34005c);
            ipVar.o1t();
        }
        if (m21884e()) {
            ipVar.cdj(f33994p);
            ipVar.mo20991h(this.f34000a);
            ipVar.o1t();
        }
        if (this.f34006d != null && m21885f()) {
            ipVar.cdj(f33990h);
            ipVar.fn3e(this.f34006d);
            ipVar.o1t();
        }
        if (this.f34007e != null && m21886g()) {
            ipVar.cdj(f33991i);
            ipVar.fn3e(this.f34007e);
            ipVar.o1t();
        }
        if (this.f34008f != null && m21887h()) {
            ipVar.cdj(f33999z);
            ipVar.fn3e(this.f34008f);
            ipVar.o1t();
        }
        if (this.f34009g != null && m21888i()) {
            ipVar.cdj(f33997t);
            ipVar.fn3e(this.f34009g);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21878a(uv uvVar) {
        if (uvVar == null) {
            return false;
        }
        boolean zM21877a = m21877a();
        boolean zM21877a2 = uvVar.m21877a();
        if ((zM21877a || zM21877a2) && !(zM21877a && zM21877a2 && this.f34002a.equals(uvVar.f34002a))) {
            return false;
        }
        boolean zM21880b = m21880b();
        boolean zM21880b2 = uvVar.m21880b();
        if ((zM21880b || zM21880b2) && !(zM21880b && zM21880b2 && this.f34001a.m20627a(uvVar.f34001a))) {
            return false;
        }
        boolean zM21882c = m21882c();
        boolean zM21882c2 = uvVar.m21882c();
        if ((zM21882c || zM21882c2) && !(zM21882c && zM21882c2 && this.f34004b.equals(uvVar.f34004b))) {
            return false;
        }
        boolean zM21883d = m21883d();
        boolean zM21883d2 = uvVar.m21883d();
        if ((zM21883d || zM21883d2) && !(zM21883d && zM21883d2 && this.f34005c.equals(uvVar.f34005c))) {
            return false;
        }
        boolean zM21884e = m21884e();
        boolean zM21884e2 = uvVar.m21884e();
        if ((zM21884e || zM21884e2) && !(zM21884e && zM21884e2 && this.f34000a == uvVar.f34000a)) {
            return false;
        }
        boolean zM21885f = m21885f();
        boolean zM21885f2 = uvVar.m21885f();
        if ((zM21885f || zM21885f2) && !(zM21885f && zM21885f2 && this.f34006d.equals(uvVar.f34006d))) {
            return false;
        }
        boolean zM21886g = m21886g();
        boolean zM21886g2 = uvVar.m21886g();
        if ((zM21886g || zM21886g2) && !(zM21886g && zM21886g2 && this.f34007e.equals(uvVar.f34007e))) {
            return false;
        }
        boolean zM21887h = m21887h();
        boolean zM21887h2 = uvVar.m21887h();
        if ((zM21887h || zM21887h2) && !(zM21887h && zM21887h2 && this.f34008f.equals(uvVar.f34008f))) {
            return false;
        }
        boolean zM21888i = m21888i();
        boolean zM21888i2 = uvVar.m21888i();
        if (zM21888i || zM21888i2) {
            return zM21888i && zM21888i2 && this.f34009g.equals(uvVar.f34009g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(uv uvVar) {
        int iM21911n;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iZy;
        int iM21911n5;
        int iM21911n6;
        int iM21913q;
        int iM21911n7;
        if (!getClass().equals(uvVar.getClass())) {
            return getClass().getName().compareTo(uvVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21877a()).compareTo(Boolean.valueOf(uvVar.m21877a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21877a() && (iM21911n7 = vh.m21911n(this.f34002a, uvVar.f34002a)) != 0) {
            return iM21911n7;
        }
        int iCompareTo2 = Boolean.valueOf(m21880b()).compareTo(Boolean.valueOf(uvVar.m21880b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21880b() && (iM21913q = vh.m21913q(this.f34001a, uvVar.f34001a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m21882c()).compareTo(Boolean.valueOf(uvVar.m21882c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21882c() && (iM21911n6 = vh.m21911n(this.f34004b, uvVar.f34004b)) != 0) {
            return iM21911n6;
        }
        int iCompareTo4 = Boolean.valueOf(m21883d()).compareTo(Boolean.valueOf(uvVar.m21883d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21883d() && (iM21911n5 = vh.m21911n(this.f34005c, uvVar.f34005c)) != 0) {
            return iM21911n5;
        }
        int iCompareTo5 = Boolean.valueOf(m21884e()).compareTo(Boolean.valueOf(uvVar.m21884e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21884e() && (iZy = vh.zy(this.f34000a, uvVar.f34000a)) != 0) {
            return iZy;
        }
        int iCompareTo6 = Boolean.valueOf(m21885f()).compareTo(Boolean.valueOf(uvVar.m21885f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21885f() && (iM21911n4 = vh.m21911n(this.f34006d, uvVar.f34006d)) != 0) {
            return iM21911n4;
        }
        int iCompareTo7 = Boolean.valueOf(m21886g()).compareTo(Boolean.valueOf(uvVar.m21886g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21886g() && (iM21911n3 = vh.m21911n(this.f34007e, uvVar.f34007e)) != 0) {
            return iM21911n3;
        }
        int iCompareTo8 = Boolean.valueOf(m21887h()).compareTo(Boolean.valueOf(uvVar.m21887h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m21887h() && (iM21911n2 = vh.m21911n(this.f34008f, uvVar.f34008f)) != 0) {
            return iM21911n2;
        }
        int iCompareTo9 = Boolean.valueOf(m21888i()).compareTo(Boolean.valueOf(uvVar.m21888i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!m21888i() || (iM21911n = vh.m21911n(this.f34009g, uvVar.f34009g)) == 0) {
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
                m21875a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f34002a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f34001a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f34004b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f34005c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                default:
                    koj.m21140k(ipVar, b2);
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f34000a = ipVar.mo20996q();
                        m21876a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f34006d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f34007e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f34008f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f34009g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21875a() throws dbf {
        if (this.f34004b != null) {
            return;
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
