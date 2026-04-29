package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class nod implements oaex<nod, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f33472a;

    /* JADX INFO: renamed from: a */
    public b2 f33473a;

    /* JADX INFO: renamed from: a */
    public String f33474a;

    /* JADX INFO: renamed from: a */
    private BitSet f33475a = new BitSet(1);

    /* JADX INFO: renamed from: b */
    public String f33476b;

    /* JADX INFO: renamed from: c */
    public String f33477c;

    /* JADX INFO: renamed from: d */
    public String f33478d;

    /* JADX INFO: renamed from: e */
    public String f33479e;

    /* JADX INFO: renamed from: k */
    private static final s31 f33466k = new s31("XmPushActionSendFeedbackResult");

    /* JADX INFO: renamed from: q */
    private static final vc f33469q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33467n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f33464g = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f33471y = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f33470s = new vc("", (byte) 10, 6);

    /* JADX INFO: renamed from: p */
    private static final vc f33468p = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: h */
    private static final vc f33465h = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: a */
    public boolean m21329a() {
        return this.f33474a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21331b() {
        return this.f33473a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21332c() {
        return this.f33476b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21333d() {
        return this.f33477c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m21334e() {
        return this.f33475a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof nod)) {
            return m21330a((nod) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21335f() {
        return this.f33478d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m21336g() {
        return this.f33479e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z3 = false;
        if (m21329a()) {
            sb.append("debug:");
            String str = this.f33474a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m21331b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f33473a;
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
        String str2 = this.f33476b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f33477c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f33472a);
        if (m21335f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f33478d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m21336g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f33479e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m21328a(boolean z2) {
        this.f33475a.set(0, z2);
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21327a();
        ipVar.mo20992i(f33466k);
        if (this.f33474a != null && m21329a()) {
            ipVar.cdj(f33469q);
            ipVar.fn3e(this.f33474a);
            ipVar.o1t();
        }
        if (this.f33473a != null && m21331b()) {
            ipVar.cdj(f33467n);
            this.f33473a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f33476b != null) {
            ipVar.cdj(f33464g);
            ipVar.fn3e(this.f33476b);
            ipVar.o1t();
        }
        if (this.f33477c != null) {
            ipVar.cdj(f33471y);
            ipVar.fn3e(this.f33477c);
            ipVar.o1t();
        }
        ipVar.cdj(f33470s);
        ipVar.mo20991h(this.f33472a);
        ipVar.o1t();
        if (this.f33478d != null && m21335f()) {
            ipVar.cdj(f33468p);
            ipVar.fn3e(this.f33478d);
            ipVar.o1t();
        }
        if (this.f33479e != null && m21336g()) {
            ipVar.cdj(f33465h);
            ipVar.fn3e(this.f33479e);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21330a(nod nodVar) {
        if (nodVar == null) {
            return false;
        }
        boolean zM21329a = m21329a();
        boolean zM21329a2 = nodVar.m21329a();
        if ((zM21329a || zM21329a2) && !(zM21329a && zM21329a2 && this.f33474a.equals(nodVar.f33474a))) {
            return false;
        }
        boolean zM21331b = m21331b();
        boolean zM21331b2 = nodVar.m21331b();
        if ((zM21331b || zM21331b2) && !(zM21331b && zM21331b2 && this.f33473a.m20627a(nodVar.f33473a))) {
            return false;
        }
        boolean zM21332c = m21332c();
        boolean zM21332c2 = nodVar.m21332c();
        if ((zM21332c || zM21332c2) && !(zM21332c && zM21332c2 && this.f33476b.equals(nodVar.f33476b))) {
            return false;
        }
        boolean zM21333d = m21333d();
        boolean zM21333d2 = nodVar.m21333d();
        if (((zM21333d || zM21333d2) && !(zM21333d && zM21333d2 && this.f33477c.equals(nodVar.f33477c))) || this.f33472a != nodVar.f33472a) {
            return false;
        }
        boolean zM21335f = m21335f();
        boolean zM21335f2 = nodVar.m21335f();
        if ((zM21335f || zM21335f2) && !(zM21335f && zM21335f2 && this.f33478d.equals(nodVar.f33478d))) {
            return false;
        }
        boolean zM21336g = m21336g();
        boolean zM21336g2 = nodVar.m21336g();
        if (zM21336g || zM21336g2) {
            return zM21336g && zM21336g2 && this.f33479e.equals(nodVar.f33479e);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(nod nodVar) {
        int iM21911n;
        int iM21911n2;
        int iZy;
        int iM21911n3;
        int iM21911n4;
        int iM21913q;
        int iM21911n5;
        if (!getClass().equals(nodVar.getClass())) {
            return getClass().getName().compareTo(nodVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21329a()).compareTo(Boolean.valueOf(nodVar.m21329a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21329a() && (iM21911n5 = vh.m21911n(this.f33474a, nodVar.f33474a)) != 0) {
            return iM21911n5;
        }
        int iCompareTo2 = Boolean.valueOf(m21331b()).compareTo(Boolean.valueOf(nodVar.m21331b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21331b() && (iM21913q = vh.m21913q(this.f33473a, nodVar.f33473a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m21332c()).compareTo(Boolean.valueOf(nodVar.m21332c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21332c() && (iM21911n4 = vh.m21911n(this.f33476b, nodVar.f33476b)) != 0) {
            return iM21911n4;
        }
        int iCompareTo4 = Boolean.valueOf(m21333d()).compareTo(Boolean.valueOf(nodVar.m21333d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21333d() && (iM21911n3 = vh.m21911n(this.f33477c, nodVar.f33477c)) != 0) {
            return iM21911n3;
        }
        int iCompareTo5 = Boolean.valueOf(m21334e()).compareTo(Boolean.valueOf(nodVar.m21334e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21334e() && (iZy = vh.zy(this.f33472a, nodVar.f33472a)) != 0) {
            return iZy;
        }
        int iCompareTo6 = Boolean.valueOf(m21335f()).compareTo(Boolean.valueOf(nodVar.m21335f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21335f() && (iM21911n2 = vh.m21911n(this.f33478d, nodVar.f33478d)) != 0) {
            return iM21911n2;
        }
        int iCompareTo7 = Boolean.valueOf(m21336g()).compareTo(Boolean.valueOf(nodVar.m21336g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!m21336g() || (iM21911n = vh.m21911n(this.f33479e, nodVar.f33479e)) == 0) {
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
                if (m21334e()) {
                    m21327a();
                    return;
                }
                throw new dbf("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f33474a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f33473a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f33476b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f33477c = ipVar.mo20995p();
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
                        this.f33472a = ipVar.mo20996q();
                        m21328a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f33478d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f33479e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21327a() throws dbf {
        if (this.f33476b != null) {
            if (this.f33477c != null) {
                return;
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
