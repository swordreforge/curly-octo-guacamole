package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class sj implements oaex<sj, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public b2 f33953a;

    /* JADX INFO: renamed from: a */
    public String f33954a;

    /* JADX INFO: renamed from: a */
    public List<String> f33955a;

    /* JADX INFO: renamed from: b */
    public String f33956b;

    /* JADX INFO: renamed from: c */
    public String f33957c;

    /* JADX INFO: renamed from: d */
    public String f33958d;

    /* JADX INFO: renamed from: e */
    public String f33959e;

    /* JADX INFO: renamed from: f */
    public String f33960f;

    /* JADX INFO: renamed from: k */
    private static final s31 f33947k = new s31("XmPushActionSubscription");

    /* JADX INFO: renamed from: q */
    private static final vc f33950q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33948n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f33944g = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f33952y = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f33951s = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: p */
    private static final vc f33949p = new vc("", com.google.common.base.zy.f68132qrj, 6);

    /* JADX INFO: renamed from: h */
    private static final vc f33945h = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: i */
    private static final vc f33946i = new vc("", com.google.common.base.zy.f68111cdj, 8);

    /* JADX INFO: renamed from: a */
    public boolean m21832a() {
        return this.f33954a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21835b() {
        return this.f33953a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21837c() {
        return this.f33956b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21839d() {
        return this.f33957c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m21841e() {
        return this.f33958d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof sj)) {
            return m21833a((sj) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21842f() {
        return this.f33959e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m21843g() {
        return this.f33960f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21844h() {
        return this.f33955a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z3 = false;
        if (m21832a()) {
            sb.append("debug:");
            String str = this.f33954a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m21835b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f33953a;
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
        String str2 = this.f33956b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f33957c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f33958d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (m21842f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f33959e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m21843g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f33960f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m21844h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f33955a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public sj m21830a(String str) {
        this.f33956b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public sj m21834b(String str) {
        this.f33957c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public sj m21836c(String str) {
        this.f33958d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public sj m21838d(String str) {
        this.f33959e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public sj m21840e(String str) {
        this.f33960f = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21833a(sj sjVar) {
        if (sjVar == null) {
            return false;
        }
        boolean zM21832a = m21832a();
        boolean zM21832a2 = sjVar.m21832a();
        if ((zM21832a || zM21832a2) && !(zM21832a && zM21832a2 && this.f33954a.equals(sjVar.f33954a))) {
            return false;
        }
        boolean zM21835b = m21835b();
        boolean zM21835b2 = sjVar.m21835b();
        if ((zM21835b || zM21835b2) && !(zM21835b && zM21835b2 && this.f33953a.m20627a(sjVar.f33953a))) {
            return false;
        }
        boolean zM21837c = m21837c();
        boolean zM21837c2 = sjVar.m21837c();
        if ((zM21837c || zM21837c2) && !(zM21837c && zM21837c2 && this.f33956b.equals(sjVar.f33956b))) {
            return false;
        }
        boolean zM21839d = m21839d();
        boolean zM21839d2 = sjVar.m21839d();
        if ((zM21839d || zM21839d2) && !(zM21839d && zM21839d2 && this.f33957c.equals(sjVar.f33957c))) {
            return false;
        }
        boolean zM21841e = m21841e();
        boolean zM21841e2 = sjVar.m21841e();
        if ((zM21841e || zM21841e2) && !(zM21841e && zM21841e2 && this.f33958d.equals(sjVar.f33958d))) {
            return false;
        }
        boolean zM21842f = m21842f();
        boolean zM21842f2 = sjVar.m21842f();
        if ((zM21842f || zM21842f2) && !(zM21842f && zM21842f2 && this.f33959e.equals(sjVar.f33959e))) {
            return false;
        }
        boolean zM21843g = m21843g();
        boolean zM21843g2 = sjVar.m21843g();
        if ((zM21843g || zM21843g2) && !(zM21843g && zM21843g2 && this.f33960f.equals(sjVar.f33960f))) {
            return false;
        }
        boolean zM21844h = m21844h();
        boolean zM21844h2 = sjVar.m21844h();
        if (zM21844h || zM21844h2) {
            return zM21844h && zM21844h2 && this.f33955a.equals(sjVar.f33955a);
        }
        return true;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21831a();
        ipVar.mo20992i(f33947k);
        if (this.f33954a != null && m21832a()) {
            ipVar.cdj(f33950q);
            ipVar.fn3e(this.f33954a);
            ipVar.o1t();
        }
        if (this.f33953a != null && m21835b()) {
            ipVar.cdj(f33948n);
            this.f33953a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f33956b != null) {
            ipVar.cdj(f33944g);
            ipVar.fn3e(this.f33956b);
            ipVar.o1t();
        }
        if (this.f33957c != null) {
            ipVar.cdj(f33952y);
            ipVar.fn3e(this.f33957c);
            ipVar.o1t();
        }
        if (this.f33958d != null) {
            ipVar.cdj(f33951s);
            ipVar.fn3e(this.f33958d);
            ipVar.o1t();
        }
        if (this.f33959e != null && m21842f()) {
            ipVar.cdj(f33949p);
            ipVar.fn3e(this.f33959e);
            ipVar.o1t();
        }
        if (this.f33960f != null && m21843g()) {
            ipVar.cdj(f33945h);
            ipVar.fn3e(this.f33960f);
            ipVar.o1t();
        }
        if (this.f33955a != null && m21844h()) {
            ipVar.cdj(f33946i);
            ipVar.ki(new izu(com.google.common.base.zy.f68132qrj, this.f33955a.size()));
            Iterator<String> it = this.f33955a.iterator();
            while (it.hasNext()) {
                ipVar.fn3e(it.next());
            }
            ipVar.mcp();
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(sj sjVar) {
        int iF7l8;
        int iM21911n;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iM21911n5;
        int iM21913q;
        int iM21911n6;
        if (!getClass().equals(sjVar.getClass())) {
            return getClass().getName().compareTo(sjVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21832a()).compareTo(Boolean.valueOf(sjVar.m21832a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21832a() && (iM21911n6 = vh.m21911n(this.f33954a, sjVar.f33954a)) != 0) {
            return iM21911n6;
        }
        int iCompareTo2 = Boolean.valueOf(m21835b()).compareTo(Boolean.valueOf(sjVar.m21835b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21835b() && (iM21913q = vh.m21913q(this.f33953a, sjVar.f33953a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m21837c()).compareTo(Boolean.valueOf(sjVar.m21837c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21837c() && (iM21911n5 = vh.m21911n(this.f33956b, sjVar.f33956b)) != 0) {
            return iM21911n5;
        }
        int iCompareTo4 = Boolean.valueOf(m21839d()).compareTo(Boolean.valueOf(sjVar.m21839d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21839d() && (iM21911n4 = vh.m21911n(this.f33957c, sjVar.f33957c)) != 0) {
            return iM21911n4;
        }
        int iCompareTo5 = Boolean.valueOf(m21841e()).compareTo(Boolean.valueOf(sjVar.m21841e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21841e() && (iM21911n3 = vh.m21911n(this.f33958d, sjVar.f33958d)) != 0) {
            return iM21911n3;
        }
        int iCompareTo6 = Boolean.valueOf(m21842f()).compareTo(Boolean.valueOf(sjVar.m21842f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21842f() && (iM21911n2 = vh.m21911n(this.f33959e, sjVar.f33959e)) != 0) {
            return iM21911n2;
        }
        int iCompareTo7 = Boolean.valueOf(m21843g()).compareTo(Boolean.valueOf(sjVar.m21843g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21843g() && (iM21911n = vh.m21911n(this.f33960f, sjVar.f33960f)) != 0) {
            return iM21911n;
        }
        int iCompareTo8 = Boolean.valueOf(m21844h()).compareTo(Boolean.valueOf(sjVar.m21844h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m21844h() || (iF7l8 = vh.f7l8(this.f33955a, sjVar.f33955a)) == 0) {
            return 0;
        }
        return iF7l8;
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
                m21831a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f33954a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f33953a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f33956b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f33957c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f33958d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f33959e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f33960f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 15) {
                        izu izuVarMo20990g = ipVar.mo20990g();
                        this.f33955a = new ArrayList(izuVarMo20990g.f73378toq);
                        for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                            this.f33955a.add(ipVar.mo20995p());
                        }
                        ipVar.jp0y();
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
    public void m21831a() throws dbf {
        if (this.f33956b != null) {
            if (this.f33957c != null) {
                if (this.f33958d != null) {
                    return;
                }
                throw new dbf("Required field 'topic' was not present! Struct: " + toString());
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
