package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class ff implements oaex<ff, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f32912a;

    /* JADX INFO: renamed from: a */
    public b2 f32913a;

    /* JADX INFO: renamed from: a */
    public String f32914a;

    /* JADX INFO: renamed from: a */
    private BitSet f32915a = new BitSet(1);

    /* JADX INFO: renamed from: b */
    public String f32916b;

    /* JADX INFO: renamed from: c */
    public String f32917c;

    /* JADX INFO: renamed from: d */
    public String f32918d;

    /* JADX INFO: renamed from: e */
    public String f32919e;

    /* JADX INFO: renamed from: f */
    public String f32920f;

    /* JADX INFO: renamed from: g */
    public String f32921g;

    /* JADX INFO: renamed from: k */
    private static final s31 f32904k = new s31("XmPushActionSubscriptionResult");

    /* JADX INFO: renamed from: q */
    private static final vc f32907q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32905n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: y */
    private static final vc f32910y = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: s */
    private static final vc f32908s = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: p */
    private static final vc f32906p = new vc("", (byte) 10, 6);

    /* JADX INFO: renamed from: h */
    private static final vc f32902h = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: i */
    private static final vc f32903i = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: z */
    private static final vc f32911z = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: t */
    private static final vc f32909t = new vc("", com.google.common.base.zy.f68132qrj, 10);

    /* JADX INFO: renamed from: a */
    public boolean m20851a() {
        return this.f32914a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20854b() {
        return this.f32913a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20856c() {
        return this.f32916b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20857d() {
        return this.f32917c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20858e() {
        return this.f32915a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ff)) {
            return m20852a((ff) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20859f() {
        return this.f32918d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m20860g() {
        return this.f32919e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m20861h() {
        return this.f32920f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m20862i() {
        return this.f32921g != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z3 = false;
        if (m20851a()) {
            sb.append("debug:");
            String str = this.f32914a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m20854b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f32913a;
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
        String str2 = this.f32916b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m20857d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f32917c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m20858e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f32912a);
        }
        if (m20859f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f32918d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m20860g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f32919e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m20861h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f32920f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m20862i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f32921g;
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
    public String m20848a() {
        return this.f32916b;
    }

    /* JADX INFO: renamed from: b */
    public String m20853b() {
        return this.f32919e;
    }

    /* JADX INFO: renamed from: c */
    public String m20855c() {
        return this.f32921g;
    }

    /* JADX INFO: renamed from: a */
    public void m20850a(boolean z2) {
        this.f32915a.set(0, z2);
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20849a();
        ipVar.mo20992i(f32904k);
        if (this.f32914a != null && m20851a()) {
            ipVar.cdj(f32907q);
            ipVar.fn3e(this.f32914a);
            ipVar.o1t();
        }
        if (this.f32913a != null && m20854b()) {
            ipVar.cdj(f32905n);
            this.f32913a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f32916b != null) {
            ipVar.cdj(f32910y);
            ipVar.fn3e(this.f32916b);
            ipVar.o1t();
        }
        if (this.f32917c != null && m20857d()) {
            ipVar.cdj(f32908s);
            ipVar.fn3e(this.f32917c);
            ipVar.o1t();
        }
        if (m20858e()) {
            ipVar.cdj(f32906p);
            ipVar.mo20991h(this.f32912a);
            ipVar.o1t();
        }
        if (this.f32918d != null && m20859f()) {
            ipVar.cdj(f32902h);
            ipVar.fn3e(this.f32918d);
            ipVar.o1t();
        }
        if (this.f32919e != null && m20860g()) {
            ipVar.cdj(f32903i);
            ipVar.fn3e(this.f32919e);
            ipVar.o1t();
        }
        if (this.f32920f != null && m20861h()) {
            ipVar.cdj(f32911z);
            ipVar.fn3e(this.f32920f);
            ipVar.o1t();
        }
        if (this.f32921g != null && m20862i()) {
            ipVar.cdj(f32909t);
            ipVar.fn3e(this.f32921g);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m20852a(ff ffVar) {
        if (ffVar == null) {
            return false;
        }
        boolean zM20851a = m20851a();
        boolean zM20851a2 = ffVar.m20851a();
        if ((zM20851a || zM20851a2) && !(zM20851a && zM20851a2 && this.f32914a.equals(ffVar.f32914a))) {
            return false;
        }
        boolean zM20854b = m20854b();
        boolean zM20854b2 = ffVar.m20854b();
        if ((zM20854b || zM20854b2) && !(zM20854b && zM20854b2 && this.f32913a.m20627a(ffVar.f32913a))) {
            return false;
        }
        boolean zM20856c = m20856c();
        boolean zM20856c2 = ffVar.m20856c();
        if ((zM20856c || zM20856c2) && !(zM20856c && zM20856c2 && this.f32916b.equals(ffVar.f32916b))) {
            return false;
        }
        boolean zM20857d = m20857d();
        boolean zM20857d2 = ffVar.m20857d();
        if ((zM20857d || zM20857d2) && !(zM20857d && zM20857d2 && this.f32917c.equals(ffVar.f32917c))) {
            return false;
        }
        boolean zM20858e = m20858e();
        boolean zM20858e2 = ffVar.m20858e();
        if ((zM20858e || zM20858e2) && !(zM20858e && zM20858e2 && this.f32912a == ffVar.f32912a)) {
            return false;
        }
        boolean zM20859f = m20859f();
        boolean zM20859f2 = ffVar.m20859f();
        if ((zM20859f || zM20859f2) && !(zM20859f && zM20859f2 && this.f32918d.equals(ffVar.f32918d))) {
            return false;
        }
        boolean zM20860g = m20860g();
        boolean zM20860g2 = ffVar.m20860g();
        if ((zM20860g || zM20860g2) && !(zM20860g && zM20860g2 && this.f32919e.equals(ffVar.f32919e))) {
            return false;
        }
        boolean zM20861h = m20861h();
        boolean zM20861h2 = ffVar.m20861h();
        if ((zM20861h || zM20861h2) && !(zM20861h && zM20861h2 && this.f32920f.equals(ffVar.f32920f))) {
            return false;
        }
        boolean zM20862i = m20862i();
        boolean zM20862i2 = ffVar.m20862i();
        if (zM20862i || zM20862i2) {
            return zM20862i && zM20862i2 && this.f32921g.equals(ffVar.f32921g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ff ffVar) {
        int iM21911n;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iZy;
        int iM21911n5;
        int iM21911n6;
        int iM21913q;
        int iM21911n7;
        if (!getClass().equals(ffVar.getClass())) {
            return getClass().getName().compareTo(ffVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20851a()).compareTo(Boolean.valueOf(ffVar.m20851a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20851a() && (iM21911n7 = vh.m21911n(this.f32914a, ffVar.f32914a)) != 0) {
            return iM21911n7;
        }
        int iCompareTo2 = Boolean.valueOf(m20854b()).compareTo(Boolean.valueOf(ffVar.m20854b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20854b() && (iM21913q = vh.m21913q(this.f32913a, ffVar.f32913a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m20856c()).compareTo(Boolean.valueOf(ffVar.m20856c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m20856c() && (iM21911n6 = vh.m21911n(this.f32916b, ffVar.f32916b)) != 0) {
            return iM21911n6;
        }
        int iCompareTo4 = Boolean.valueOf(m20857d()).compareTo(Boolean.valueOf(ffVar.m20857d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m20857d() && (iM21911n5 = vh.m21911n(this.f32917c, ffVar.f32917c)) != 0) {
            return iM21911n5;
        }
        int iCompareTo5 = Boolean.valueOf(m20858e()).compareTo(Boolean.valueOf(ffVar.m20858e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m20858e() && (iZy = vh.zy(this.f32912a, ffVar.f32912a)) != 0) {
            return iZy;
        }
        int iCompareTo6 = Boolean.valueOf(m20859f()).compareTo(Boolean.valueOf(ffVar.m20859f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m20859f() && (iM21911n4 = vh.m21911n(this.f32918d, ffVar.f32918d)) != 0) {
            return iM21911n4;
        }
        int iCompareTo7 = Boolean.valueOf(m20860g()).compareTo(Boolean.valueOf(ffVar.m20860g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m20860g() && (iM21911n3 = vh.m21911n(this.f32919e, ffVar.f32919e)) != 0) {
            return iM21911n3;
        }
        int iCompareTo8 = Boolean.valueOf(m20861h()).compareTo(Boolean.valueOf(ffVar.m20861h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m20861h() && (iM21911n2 = vh.m21911n(this.f32920f, ffVar.f32920f)) != 0) {
            return iM21911n2;
        }
        int iCompareTo9 = Boolean.valueOf(m20862i()).compareTo(Boolean.valueOf(ffVar.m20862i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!m20862i() || (iM21911n = vh.m21911n(this.f32921g, ffVar.f32921g)) == 0) {
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
                m20849a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f32914a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f32913a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f32916b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f32917c = ipVar.mo20995p();
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
                        this.f32912a = ipVar.mo20996q();
                        m20850a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f32918d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f32919e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f32920f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f32921g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20849a() throws dbf {
        if (this.f32916b != null) {
            return;
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
