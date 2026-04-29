package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class anhx implements oaex<anhx, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f32667a;

    /* JADX INFO: renamed from: a */
    public long f32668a;

    /* JADX INFO: renamed from: a */
    public String f32669a;

    /* JADX INFO: renamed from: a */
    private BitSet f32670a = new BitSet(6);

    /* JADX INFO: renamed from: a */
    public boolean f32671a;

    /* JADX INFO: renamed from: b */
    public int f32672b;

    /* JADX INFO: renamed from: b */
    public boolean f32673b;

    /* JADX INFO: renamed from: c */
    public int f32674c;

    /* JADX INFO: renamed from: k */
    private static final s31 f32661k = new s31("OnlineConfigItem");

    /* JADX INFO: renamed from: q */
    private static final vc f32664q = new vc("", (byte) 8, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32662n = new vc("", (byte) 8, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f32659g = new vc("", (byte) 2, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f32666y = new vc("", (byte) 8, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f32665s = new vc("", (byte) 10, 5);

    /* JADX INFO: renamed from: p */
    private static final vc f32663p = new vc("", com.google.common.base.zy.f68132qrj, 6);

    /* JADX INFO: renamed from: h */
    private static final vc f32660h = new vc("", (byte) 2, 7);

    /* JADX INFO: renamed from: a */
    public int m20582a() {
        return this.f32667a;
    }

    /* JADX INFO: renamed from: a */
    public void m20586a() {
    }

    /* JADX INFO: renamed from: b */
    public int m20590b() {
        return this.f32672b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20595c() {
        return this.f32670a.get(2);
    }

    /* JADX INFO: renamed from: d */
    public boolean m20597d() {
        return this.f32670a.get(3);
    }

    /* JADX INFO: renamed from: e */
    public boolean m20599e() {
        return this.f32670a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof anhx)) {
            return m20589a((anhx) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20601f() {
        return this.f32669a != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m20602g() {
        return this.f32673b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m20603h() {
        return this.f32670a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z3 = false;
        if (m20588a()) {
            sb.append("key:");
            sb.append(this.f32667a);
            z2 = false;
        } else {
            z2 = true;
        }
        if (m20592b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f32672b);
            z2 = false;
        }
        if (m20595c()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f32671a);
            z2 = false;
        }
        if (m20597d()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f32674c);
            z2 = false;
        }
        if (m20599e()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f32668a);
            z2 = false;
        }
        if (m20601f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f32669a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        } else {
            z3 = z2;
        }
        if (m20603h()) {
            if (!z3) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f32673b);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m20588a() {
        return this.f32670a.get(0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m20592b() {
        return this.f32670a.get(1);
    }

    /* JADX INFO: renamed from: c */
    public void m20594c(boolean z2) {
        this.f32670a.set(2, z2);
    }

    /* JADX INFO: renamed from: d */
    public void m20596d(boolean z2) {
        this.f32670a.set(3, z2);
    }

    /* JADX INFO: renamed from: e */
    public void m20598e(boolean z2) {
        this.f32670a.set(4, z2);
    }

    /* JADX INFO: renamed from: f */
    public void m20600f(boolean z2) {
        this.f32670a.set(5, z2);
    }

    /* JADX INFO: renamed from: a */
    public void m20587a(boolean z2) {
        this.f32670a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public void m20591b(boolean z2) {
        this.f32670a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public int m20593c() {
        return this.f32674c;
    }

    /* JADX INFO: renamed from: a */
    public long m20584a() {
        return this.f32668a;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) {
        m20586a();
        ipVar.mo20992i(f32661k);
        if (m20588a()) {
            ipVar.cdj(f32664q);
            ipVar.kja0(this.f32667a);
            ipVar.o1t();
        }
        if (m20592b()) {
            ipVar.cdj(f32662n);
            ipVar.kja0(this.f32672b);
            ipVar.o1t();
        }
        if (m20595c()) {
            ipVar.cdj(f32659g);
            ipVar.fu4(this.f32671a);
            ipVar.o1t();
        }
        if (m20597d()) {
            ipVar.cdj(f32666y);
            ipVar.kja0(this.f32674c);
            ipVar.o1t();
        }
        if (m20599e()) {
            ipVar.cdj(f32665s);
            ipVar.mo20991h(this.f32668a);
            ipVar.o1t();
        }
        if (this.f32669a != null && m20601f()) {
            ipVar.cdj(f32663p);
            ipVar.fn3e(this.f32669a);
            ipVar.o1t();
        }
        if (m20603h()) {
            ipVar.cdj(f32660h);
            ipVar.fu4(this.f32673b);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public String m20585a() {
        return this.f32669a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20589a(anhx anhxVar) {
        if (anhxVar == null) {
            return false;
        }
        boolean zM20588a = m20588a();
        boolean zM20588a2 = anhxVar.m20588a();
        if ((zM20588a || zM20588a2) && !(zM20588a && zM20588a2 && this.f32667a == anhxVar.f32667a)) {
            return false;
        }
        boolean zM20592b = m20592b();
        boolean zM20592b2 = anhxVar.m20592b();
        if ((zM20592b || zM20592b2) && !(zM20592b && zM20592b2 && this.f32672b == anhxVar.f32672b)) {
            return false;
        }
        boolean zM20595c = m20595c();
        boolean zM20595c2 = anhxVar.m20595c();
        if ((zM20595c || zM20595c2) && !(zM20595c && zM20595c2 && this.f32671a == anhxVar.f32671a)) {
            return false;
        }
        boolean zM20597d = m20597d();
        boolean zM20597d2 = anhxVar.m20597d();
        if ((zM20597d || zM20597d2) && !(zM20597d && zM20597d2 && this.f32674c == anhxVar.f32674c)) {
            return false;
        }
        boolean zM20599e = m20599e();
        boolean zM20599e2 = anhxVar.m20599e();
        if ((zM20599e || zM20599e2) && !(zM20599e && zM20599e2 && this.f32668a == anhxVar.f32668a)) {
            return false;
        }
        boolean zM20601f = m20601f();
        boolean zM20601f2 = anhxVar.m20601f();
        if ((zM20601f || zM20601f2) && !(zM20601f && zM20601f2 && this.f32669a.equals(anhxVar.f32669a))) {
            return false;
        }
        boolean zM20603h = m20603h();
        boolean zM20603h2 = anhxVar.m20603h();
        if (zM20603h || zM20603h2) {
            return zM20603h && zM20603h2 && this.f32673b == anhxVar.f32673b;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(anhx anhxVar) {
        int iLd6;
        int iM21911n;
        int iZy;
        int qVar;
        int iLd62;
        int qVar2;
        int qVar3;
        if (!getClass().equals(anhxVar.getClass())) {
            return getClass().getName().compareTo(anhxVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20588a()).compareTo(Boolean.valueOf(anhxVar.m20588a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20588a() && (qVar3 = vh.toq(this.f32667a, anhxVar.f32667a)) != 0) {
            return qVar3;
        }
        int iCompareTo2 = Boolean.valueOf(m20592b()).compareTo(Boolean.valueOf(anhxVar.m20592b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20592b() && (qVar2 = vh.toq(this.f32672b, anhxVar.f32672b)) != 0) {
            return qVar2;
        }
        int iCompareTo3 = Boolean.valueOf(m20595c()).compareTo(Boolean.valueOf(anhxVar.m20595c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m20595c() && (iLd62 = vh.ld6(this.f32671a, anhxVar.f32671a)) != 0) {
            return iLd62;
        }
        int iCompareTo4 = Boolean.valueOf(m20597d()).compareTo(Boolean.valueOf(anhxVar.m20597d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m20597d() && (qVar = vh.toq(this.f32674c, anhxVar.f32674c)) != 0) {
            return qVar;
        }
        int iCompareTo5 = Boolean.valueOf(m20599e()).compareTo(Boolean.valueOf(anhxVar.m20599e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m20599e() && (iZy = vh.zy(this.f32668a, anhxVar.f32668a)) != 0) {
            return iZy;
        }
        int iCompareTo6 = Boolean.valueOf(m20601f()).compareTo(Boolean.valueOf(anhxVar.m20601f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m20601f() && (iM21911n = vh.m21911n(this.f32669a, anhxVar.f32669a)) != 0) {
            return iM21911n;
        }
        int iCompareTo7 = Boolean.valueOf(m20603h()).compareTo(Boolean.valueOf(anhxVar.m20603h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!m20603h() || (iLd6 = vh.ld6(this.f32673b, anhxVar.f32673b)) == 0) {
            return 0;
        }
        return iLd6;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: a */
    public void mo20557a(ip ipVar) {
        ipVar.mo20997s();
        while (true) {
            vc vcVarMo20994n = ipVar.mo20994n();
            byte b2 = vcVarMo20994n.f73703toq;
            if (b2 == 0) {
                ipVar.jk();
                m20586a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 8) {
                        this.f32667a = ipVar.zy();
                        m20587a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 8) {
                        this.f32672b = ipVar.zy();
                        m20591b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 2) {
                        this.f32671a = ipVar.mo21000z();
                        m20594c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 8) {
                        this.f32674c = ipVar.zy();
                        m20596d(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f32668a = ipVar.mo20996q();
                        m20598e(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f32669a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 2) {
                        this.f32673b = ipVar.mo21000z();
                        m20600f(true);
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
}
