package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class anw implements oaex<anw, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f32685a;

    /* JADX INFO: renamed from: a */
    public b2 f32686a;

    /* JADX INFO: renamed from: a */
    public String f32687a;

    /* JADX INFO: renamed from: a */
    private BitSet f32688a = new BitSet(3);

    /* JADX INFO: renamed from: b */
    public long f32689b;

    /* JADX INFO: renamed from: b */
    public String f32690b;

    /* JADX INFO: renamed from: c */
    public long f32691c;

    /* JADX INFO: renamed from: c */
    public String f32692c;

    /* JADX INFO: renamed from: d */
    public String f32693d;

    /* JADX INFO: renamed from: e */
    public String f32694e;

    /* JADX INFO: renamed from: k */
    private static final s31 f32678k = new s31("XmPushActionUnRegistrationResult");

    /* JADX INFO: renamed from: q */
    private static final vc f32681q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32679n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f32675g = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f32683y = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f32682s = new vc("", (byte) 10, 6);

    /* JADX INFO: renamed from: p */
    private static final vc f32680p = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: h */
    private static final vc f32676h = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: i */
    private static final vc f32677i = new vc("", (byte) 10, 9);

    /* JADX INFO: renamed from: z */
    private static final vc f32684z = new vc("", (byte) 10, 10);

    /* JADX INFO: renamed from: a */
    public boolean m20608a() {
        return this.f32687a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20611b() {
        return this.f32686a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20613c() {
        return this.f32690b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20614d() {
        return this.f32692c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20615e() {
        return this.f32688a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof anw)) {
            return m20609a((anw) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20616f() {
        return this.f32693d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m20617g() {
        return this.f32694e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m20618h() {
        return this.f32688a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m20619i() {
        return this.f32688a.get(2);
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z3 = false;
        if (m20608a()) {
            sb.append("debug:");
            String str = this.f32687a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m20611b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f32686a;
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
        String str2 = this.f32690b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f32692c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f32685a);
        if (m20616f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f32693d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m20617g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f32694e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m20618h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f32689b);
        }
        if (m20619i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f32691c);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m20607a(boolean z2) {
        this.f32688a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public void m20610b(boolean z2) {
        this.f32688a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m20612c(boolean z2) {
        this.f32688a.set(2, z2);
    }

    /* JADX INFO: renamed from: a */
    public String m20605a() {
        return this.f32694e;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20606a();
        ipVar.mo20992i(f32678k);
        if (this.f32687a != null && m20608a()) {
            ipVar.cdj(f32681q);
            ipVar.fn3e(this.f32687a);
            ipVar.o1t();
        }
        if (this.f32686a != null && m20611b()) {
            ipVar.cdj(f32679n);
            this.f32686a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f32690b != null) {
            ipVar.cdj(f32675g);
            ipVar.fn3e(this.f32690b);
            ipVar.o1t();
        }
        if (this.f32692c != null) {
            ipVar.cdj(f32683y);
            ipVar.fn3e(this.f32692c);
            ipVar.o1t();
        }
        ipVar.cdj(f32682s);
        ipVar.mo20991h(this.f32685a);
        ipVar.o1t();
        if (this.f32693d != null && m20616f()) {
            ipVar.cdj(f32680p);
            ipVar.fn3e(this.f32693d);
            ipVar.o1t();
        }
        if (this.f32694e != null && m20617g()) {
            ipVar.cdj(f32676h);
            ipVar.fn3e(this.f32694e);
            ipVar.o1t();
        }
        if (m20618h()) {
            ipVar.cdj(f32677i);
            ipVar.mo20991h(this.f32689b);
            ipVar.o1t();
        }
        if (m20619i()) {
            ipVar.cdj(f32684z);
            ipVar.mo20991h(this.f32691c);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m20609a(anw anwVar) {
        if (anwVar == null) {
            return false;
        }
        boolean zM20608a = m20608a();
        boolean zM20608a2 = anwVar.m20608a();
        if ((zM20608a || zM20608a2) && !(zM20608a && zM20608a2 && this.f32687a.equals(anwVar.f32687a))) {
            return false;
        }
        boolean zM20611b = m20611b();
        boolean zM20611b2 = anwVar.m20611b();
        if ((zM20611b || zM20611b2) && !(zM20611b && zM20611b2 && this.f32686a.m20627a(anwVar.f32686a))) {
            return false;
        }
        boolean zM20613c = m20613c();
        boolean zM20613c2 = anwVar.m20613c();
        if ((zM20613c || zM20613c2) && !(zM20613c && zM20613c2 && this.f32690b.equals(anwVar.f32690b))) {
            return false;
        }
        boolean zM20614d = m20614d();
        boolean zM20614d2 = anwVar.m20614d();
        if (((zM20614d || zM20614d2) && !(zM20614d && zM20614d2 && this.f32692c.equals(anwVar.f32692c))) || this.f32685a != anwVar.f32685a) {
            return false;
        }
        boolean zM20616f = m20616f();
        boolean zM20616f2 = anwVar.m20616f();
        if ((zM20616f || zM20616f2) && !(zM20616f && zM20616f2 && this.f32693d.equals(anwVar.f32693d))) {
            return false;
        }
        boolean zM20617g = m20617g();
        boolean zM20617g2 = anwVar.m20617g();
        if ((zM20617g || zM20617g2) && !(zM20617g && zM20617g2 && this.f32694e.equals(anwVar.f32694e))) {
            return false;
        }
        boolean zM20618h = m20618h();
        boolean zM20618h2 = anwVar.m20618h();
        if ((zM20618h || zM20618h2) && !(zM20618h && zM20618h2 && this.f32689b == anwVar.f32689b)) {
            return false;
        }
        boolean zM20619i = m20619i();
        boolean zM20619i2 = anwVar.m20619i();
        if (zM20619i || zM20619i2) {
            return zM20619i && zM20619i2 && this.f32691c == anwVar.f32691c;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(anw anwVar) {
        int iZy;
        int iZy2;
        int iM21911n;
        int iM21911n2;
        int iZy3;
        int iM21911n3;
        int iM21911n4;
        int iM21913q;
        int iM21911n5;
        if (!getClass().equals(anwVar.getClass())) {
            return getClass().getName().compareTo(anwVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20608a()).compareTo(Boolean.valueOf(anwVar.m20608a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20608a() && (iM21911n5 = vh.m21911n(this.f32687a, anwVar.f32687a)) != 0) {
            return iM21911n5;
        }
        int iCompareTo2 = Boolean.valueOf(m20611b()).compareTo(Boolean.valueOf(anwVar.m20611b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20611b() && (iM21913q = vh.m21913q(this.f32686a, anwVar.f32686a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m20613c()).compareTo(Boolean.valueOf(anwVar.m20613c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m20613c() && (iM21911n4 = vh.m21911n(this.f32690b, anwVar.f32690b)) != 0) {
            return iM21911n4;
        }
        int iCompareTo4 = Boolean.valueOf(m20614d()).compareTo(Boolean.valueOf(anwVar.m20614d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m20614d() && (iM21911n3 = vh.m21911n(this.f32692c, anwVar.f32692c)) != 0) {
            return iM21911n3;
        }
        int iCompareTo5 = Boolean.valueOf(m20615e()).compareTo(Boolean.valueOf(anwVar.m20615e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m20615e() && (iZy3 = vh.zy(this.f32685a, anwVar.f32685a)) != 0) {
            return iZy3;
        }
        int iCompareTo6 = Boolean.valueOf(m20616f()).compareTo(Boolean.valueOf(anwVar.m20616f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m20616f() && (iM21911n2 = vh.m21911n(this.f32693d, anwVar.f32693d)) != 0) {
            return iM21911n2;
        }
        int iCompareTo7 = Boolean.valueOf(m20617g()).compareTo(Boolean.valueOf(anwVar.m20617g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m20617g() && (iM21911n = vh.m21911n(this.f32694e, anwVar.f32694e)) != 0) {
            return iM21911n;
        }
        int iCompareTo8 = Boolean.valueOf(m20618h()).compareTo(Boolean.valueOf(anwVar.m20618h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m20618h() && (iZy2 = vh.zy(this.f32689b, anwVar.f32689b)) != 0) {
            return iZy2;
        }
        int iCompareTo9 = Boolean.valueOf(m20619i()).compareTo(Boolean.valueOf(anwVar.m20619i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!m20619i() || (iZy = vh.zy(this.f32691c, anwVar.f32691c)) == 0) {
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
                if (m20615e()) {
                    m20606a();
                    return;
                }
                throw new dbf("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f32687a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f32686a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f32690b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f32692c = ipVar.mo20995p();
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
                        this.f32685a = ipVar.mo20996q();
                        m20607a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f32693d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f32694e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 10) {
                        this.f32689b = ipVar.mo20996q();
                        m20610b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 10) {
                        this.f32691c = ipVar.mo20996q();
                        m20612c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20606a() throws dbf {
        if (this.f32690b != null) {
            if (this.f32692c != null) {
                return;
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
