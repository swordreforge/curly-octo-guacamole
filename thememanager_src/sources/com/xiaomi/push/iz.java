package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class iz implements oaex<iz, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f33047a;

    /* JADX INFO: renamed from: a */
    public b2 f33048a;

    /* JADX INFO: renamed from: a */
    public String f33049a;

    /* JADX INFO: renamed from: a */
    private BitSet f33050a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public boolean f33051a = true;

    /* JADX INFO: renamed from: b */
    public String f33052b;

    /* JADX INFO: renamed from: c */
    public String f33053c;

    /* JADX INFO: renamed from: d */
    public String f33054d;

    /* JADX INFO: renamed from: e */
    public String f33055e;

    /* JADX INFO: renamed from: f */
    public String f33056f;

    /* JADX INFO: renamed from: g */
    public String f33057g;

    /* JADX INFO: renamed from: h */
    public String f33058h;

    /* JADX INFO: renamed from: i */
    public String f33059i;

    /* JADX INFO: renamed from: k */
    private static final s31 f33035k = new s31("XmPushActionUnRegistration");

    /* JADX INFO: renamed from: q */
    private static final vc f33041q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33038n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: y */
    private static final vc f33045y = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: s */
    private static final vc f33043s = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: p */
    private static final vc f33040p = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: z */
    private static final vc f33046z = new vc("", com.google.common.base.zy.f68132qrj, 6);

    /* JADX INFO: renamed from: t */
    private static final vc f33044t = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: r */
    private static final vc f33042r = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: l */
    private static final vc f33036l = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: j */
    private static final vc f33034j = new vc("", com.google.common.base.zy.f68132qrj, 10);

    /* JADX INFO: renamed from: o */
    private static final vc f33039o = new vc("", (byte) 2, 11);

    /* JADX INFO: renamed from: m */
    private static final vc f33037m = new vc("", (byte) 10, 12);

    /* JADX INFO: renamed from: a */
    public boolean m21005a() {
        return this.f33049a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21009b() {
        return this.f33048a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21011c() {
        return this.f33052b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21013d() {
        return this.f33053c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m21015e() {
        return this.f33054d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iz)) {
            return m21006a((iz) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21016f() {
        return this.f33055e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m21017g() {
        return this.f33056f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21018h() {
        return this.f33057g != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21019i() {
        return this.f33058h != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m21020j() {
        return this.f33059i != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m21021k() {
        return this.f33050a.get(0);
    }

    /* JADX INFO: renamed from: l */
    public boolean m21022l() {
        return this.f33050a.get(1);
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        boolean z3 = false;
        if (m21005a()) {
            sb.append("debug:");
            String str = this.f33049a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m21009b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f33048a;
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
        String str2 = this.f33052b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f33053c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m21015e()) {
            sb.append(", ");
            sb.append("regId:");
            String str4 = this.f33054d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m21016f()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str5 = this.f33055e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m21017g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f33056f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m21018h()) {
            sb.append(", ");
            sb.append("token:");
            String str7 = this.f33057g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m21019i()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str8 = this.f33058h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m21020j()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f33059i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m21021k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f33051a);
        }
        if (m21022l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f33047a);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public iz m21002a(String str) {
        this.f33052b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public iz m21007b(String str) {
        this.f33053c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public iz m21010c(String str) {
        this.f33054d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public iz m21012d(String str) {
        this.f33056f = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public iz m21014e(String str) {
        this.f33057g = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m21004a(boolean z2) {
        this.f33050a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public void m21008b(boolean z2) {
        this.f33050a.set(1, z2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m21006a(iz izVar) {
        if (izVar == null) {
            return false;
        }
        boolean zM21005a = m21005a();
        boolean zM21005a2 = izVar.m21005a();
        if ((zM21005a || zM21005a2) && !(zM21005a && zM21005a2 && this.f33049a.equals(izVar.f33049a))) {
            return false;
        }
        boolean zM21009b = m21009b();
        boolean zM21009b2 = izVar.m21009b();
        if ((zM21009b || zM21009b2) && !(zM21009b && zM21009b2 && this.f33048a.m20627a(izVar.f33048a))) {
            return false;
        }
        boolean zM21011c = m21011c();
        boolean zM21011c2 = izVar.m21011c();
        if ((zM21011c || zM21011c2) && !(zM21011c && zM21011c2 && this.f33052b.equals(izVar.f33052b))) {
            return false;
        }
        boolean zM21013d = m21013d();
        boolean zM21013d2 = izVar.m21013d();
        if ((zM21013d || zM21013d2) && !(zM21013d && zM21013d2 && this.f33053c.equals(izVar.f33053c))) {
            return false;
        }
        boolean zM21015e = m21015e();
        boolean zM21015e2 = izVar.m21015e();
        if ((zM21015e || zM21015e2) && !(zM21015e && zM21015e2 && this.f33054d.equals(izVar.f33054d))) {
            return false;
        }
        boolean zM21016f = m21016f();
        boolean zM21016f2 = izVar.m21016f();
        if ((zM21016f || zM21016f2) && !(zM21016f && zM21016f2 && this.f33055e.equals(izVar.f33055e))) {
            return false;
        }
        boolean zM21017g = m21017g();
        boolean zM21017g2 = izVar.m21017g();
        if ((zM21017g || zM21017g2) && !(zM21017g && zM21017g2 && this.f33056f.equals(izVar.f33056f))) {
            return false;
        }
        boolean zM21018h = m21018h();
        boolean zM21018h2 = izVar.m21018h();
        if ((zM21018h || zM21018h2) && !(zM21018h && zM21018h2 && this.f33057g.equals(izVar.f33057g))) {
            return false;
        }
        boolean zM21019i = m21019i();
        boolean zM21019i2 = izVar.m21019i();
        if ((zM21019i || zM21019i2) && !(zM21019i && zM21019i2 && this.f33058h.equals(izVar.f33058h))) {
            return false;
        }
        boolean zM21020j = m21020j();
        boolean zM21020j2 = izVar.m21020j();
        if ((zM21020j || zM21020j2) && !(zM21020j && zM21020j2 && this.f33059i.equals(izVar.f33059i))) {
            return false;
        }
        boolean zM21021k = m21021k();
        boolean zM21021k2 = izVar.m21021k();
        if ((zM21021k || zM21021k2) && !(zM21021k && zM21021k2 && this.f33051a == izVar.f33051a)) {
            return false;
        }
        boolean zM21022l = m21022l();
        boolean zM21022l2 = izVar.m21022l();
        if (zM21022l || zM21022l2) {
            return zM21022l && zM21022l2 && this.f33047a == izVar.f33047a;
        }
        return true;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21003a();
        ipVar.mo20992i(f33035k);
        if (this.f33049a != null && m21005a()) {
            ipVar.cdj(f33041q);
            ipVar.fn3e(this.f33049a);
            ipVar.o1t();
        }
        if (this.f33048a != null && m21009b()) {
            ipVar.cdj(f33038n);
            this.f33048a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f33052b != null) {
            ipVar.cdj(f33045y);
            ipVar.fn3e(this.f33052b);
            ipVar.o1t();
        }
        if (this.f33053c != null) {
            ipVar.cdj(f33043s);
            ipVar.fn3e(this.f33053c);
            ipVar.o1t();
        }
        if (this.f33054d != null && m21015e()) {
            ipVar.cdj(f33040p);
            ipVar.fn3e(this.f33054d);
            ipVar.o1t();
        }
        if (this.f33055e != null && m21016f()) {
            ipVar.cdj(f33046z);
            ipVar.fn3e(this.f33055e);
            ipVar.o1t();
        }
        if (this.f33056f != null && m21017g()) {
            ipVar.cdj(f33044t);
            ipVar.fn3e(this.f33056f);
            ipVar.o1t();
        }
        if (this.f33057g != null && m21018h()) {
            ipVar.cdj(f33042r);
            ipVar.fn3e(this.f33057g);
            ipVar.o1t();
        }
        if (this.f33058h != null && m21019i()) {
            ipVar.cdj(f33036l);
            ipVar.fn3e(this.f33058h);
            ipVar.o1t();
        }
        if (this.f33059i != null && m21020j()) {
            ipVar.cdj(f33034j);
            ipVar.fn3e(this.f33059i);
            ipVar.o1t();
        }
        if (m21021k()) {
            ipVar.cdj(f33039o);
            ipVar.fu4(this.f33051a);
            ipVar.o1t();
        }
        if (m21022l()) {
            ipVar.cdj(f33037m);
            ipVar.mo20991h(this.f33047a);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iz izVar) {
        int iZy;
        int iLd6;
        int iM21911n;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iM21911n5;
        int iM21911n6;
        int iM21911n7;
        int iM21911n8;
        int iM21913q;
        int iM21911n9;
        if (!getClass().equals(izVar.getClass())) {
            return getClass().getName().compareTo(izVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21005a()).compareTo(Boolean.valueOf(izVar.m21005a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21005a() && (iM21911n9 = vh.m21911n(this.f33049a, izVar.f33049a)) != 0) {
            return iM21911n9;
        }
        int iCompareTo2 = Boolean.valueOf(m21009b()).compareTo(Boolean.valueOf(izVar.m21009b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21009b() && (iM21913q = vh.m21913q(this.f33048a, izVar.f33048a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m21011c()).compareTo(Boolean.valueOf(izVar.m21011c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21011c() && (iM21911n8 = vh.m21911n(this.f33052b, izVar.f33052b)) != 0) {
            return iM21911n8;
        }
        int iCompareTo4 = Boolean.valueOf(m21013d()).compareTo(Boolean.valueOf(izVar.m21013d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21013d() && (iM21911n7 = vh.m21911n(this.f33053c, izVar.f33053c)) != 0) {
            return iM21911n7;
        }
        int iCompareTo5 = Boolean.valueOf(m21015e()).compareTo(Boolean.valueOf(izVar.m21015e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21015e() && (iM21911n6 = vh.m21911n(this.f33054d, izVar.f33054d)) != 0) {
            return iM21911n6;
        }
        int iCompareTo6 = Boolean.valueOf(m21016f()).compareTo(Boolean.valueOf(izVar.m21016f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21016f() && (iM21911n5 = vh.m21911n(this.f33055e, izVar.f33055e)) != 0) {
            return iM21911n5;
        }
        int iCompareTo7 = Boolean.valueOf(m21017g()).compareTo(Boolean.valueOf(izVar.m21017g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21017g() && (iM21911n4 = vh.m21911n(this.f33056f, izVar.f33056f)) != 0) {
            return iM21911n4;
        }
        int iCompareTo8 = Boolean.valueOf(m21018h()).compareTo(Boolean.valueOf(izVar.m21018h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m21018h() && (iM21911n3 = vh.m21911n(this.f33057g, izVar.f33057g)) != 0) {
            return iM21911n3;
        }
        int iCompareTo9 = Boolean.valueOf(m21019i()).compareTo(Boolean.valueOf(izVar.m21019i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m21019i() && (iM21911n2 = vh.m21911n(this.f33058h, izVar.f33058h)) != 0) {
            return iM21911n2;
        }
        int iCompareTo10 = Boolean.valueOf(m21020j()).compareTo(Boolean.valueOf(izVar.m21020j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m21020j() && (iM21911n = vh.m21911n(this.f33059i, izVar.f33059i)) != 0) {
            return iM21911n;
        }
        int iCompareTo11 = Boolean.valueOf(m21021k()).compareTo(Boolean.valueOf(izVar.m21021k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m21021k() && (iLd6 = vh.ld6(this.f33051a, izVar.f33051a)) != 0) {
            return iLd6;
        }
        int iCompareTo12 = Boolean.valueOf(m21022l()).compareTo(Boolean.valueOf(izVar.m21022l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!m21022l() || (iZy = vh.zy(this.f33047a, izVar.f33047a)) == 0) {
            return 0;
        }
        return iZy;
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
                m21003a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f33049a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f33048a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f33052b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f33053c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f33054d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f33055e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f33056f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f33057g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f33058h = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f33059i = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f33051a = ipVar.mo21000z();
                        m21004a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 10) {
                        this.f33047a = ipVar.mo20996q();
                        m21008b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                default:
                    koj.m21140k(ipVar, b2);
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21003a() throws dbf {
        if (this.f33052b != null) {
            if (this.f33053c != null) {
                return;
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
