package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a8p6 implements oaex<a8p6, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public b2 f32649a;

    /* JADX INFO: renamed from: a */
    public String f32650a;

    /* JADX INFO: renamed from: a */
    public List<String> f32651a;

    /* JADX INFO: renamed from: b */
    public String f32652b;

    /* JADX INFO: renamed from: c */
    public String f32653c;

    /* JADX INFO: renamed from: d */
    public String f32654d;

    /* JADX INFO: renamed from: e */
    public String f32655e;

    /* JADX INFO: renamed from: f */
    public String f32656f;

    /* JADX INFO: renamed from: k */
    private static final s31 f32643k = new s31("XmPushActionUnSubscription");

    /* JADX INFO: renamed from: q */
    private static final vc f32646q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32644n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f32640g = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f32648y = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f32647s = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: p */
    private static final vc f32645p = new vc("", com.google.common.base.zy.f68132qrj, 6);

    /* JADX INFO: renamed from: h */
    private static final vc f32641h = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: i */
    private static final vc f32642i = new vc("", com.google.common.base.zy.f68111cdj, 8);

    /* JADX INFO: renamed from: a */
    public boolean m20558a() {
        return this.f32650a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20562b() {
        return this.f32649a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20564c() {
        return this.f32652b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20566d() {
        return this.f32653c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20568e() {
        return this.f32654d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof a8p6)) {
            return m20559a((a8p6) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20569f() {
        return this.f32655e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m20570g() {
        return this.f32656f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m20571h() {
        return this.f32651a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z3 = false;
        if (m20558a()) {
            sb.append("debug:");
            String str = this.f32650a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m20562b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f32649a;
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
        String str2 = this.f32652b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f32653c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f32654d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (m20569f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f32655e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m20570g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f32656f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m20571h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f32651a;
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
    public a8p6 m20555a(String str) {
        this.f32652b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public a8p6 m20560b(String str) {
        this.f32653c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public a8p6 m20563c(String str) {
        this.f32654d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public a8p6 m20565d(String str) {
        this.f32655e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public a8p6 m20567e(String str) {
        this.f32656f = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20559a(a8p6 a8p6Var) {
        if (a8p6Var == null) {
            return false;
        }
        boolean zM20558a = m20558a();
        boolean zM20558a2 = a8p6Var.m20558a();
        if ((zM20558a || zM20558a2) && !(zM20558a && zM20558a2 && this.f32650a.equals(a8p6Var.f32650a))) {
            return false;
        }
        boolean zM20562b = m20562b();
        boolean zM20562b2 = a8p6Var.m20562b();
        if ((zM20562b || zM20562b2) && !(zM20562b && zM20562b2 && this.f32649a.m20627a(a8p6Var.f32649a))) {
            return false;
        }
        boolean zM20564c = m20564c();
        boolean zM20564c2 = a8p6Var.m20564c();
        if ((zM20564c || zM20564c2) && !(zM20564c && zM20564c2 && this.f32652b.equals(a8p6Var.f32652b))) {
            return false;
        }
        boolean zM20566d = m20566d();
        boolean zM20566d2 = a8p6Var.m20566d();
        if ((zM20566d || zM20566d2) && !(zM20566d && zM20566d2 && this.f32653c.equals(a8p6Var.f32653c))) {
            return false;
        }
        boolean zM20568e = m20568e();
        boolean zM20568e2 = a8p6Var.m20568e();
        if ((zM20568e || zM20568e2) && !(zM20568e && zM20568e2 && this.f32654d.equals(a8p6Var.f32654d))) {
            return false;
        }
        boolean zM20569f = m20569f();
        boolean zM20569f2 = a8p6Var.m20569f();
        if ((zM20569f || zM20569f2) && !(zM20569f && zM20569f2 && this.f32655e.equals(a8p6Var.f32655e))) {
            return false;
        }
        boolean zM20570g = m20570g();
        boolean zM20570g2 = a8p6Var.m20570g();
        if ((zM20570g || zM20570g2) && !(zM20570g && zM20570g2 && this.f32656f.equals(a8p6Var.f32656f))) {
            return false;
        }
        boolean zM20571h = m20571h();
        boolean zM20571h2 = a8p6Var.m20571h();
        if (zM20571h || zM20571h2) {
            return zM20571h && zM20571h2 && this.f32651a.equals(a8p6Var.f32651a);
        }
        return true;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20556a();
        ipVar.mo20992i(f32643k);
        if (this.f32650a != null && m20558a()) {
            ipVar.cdj(f32646q);
            ipVar.fn3e(this.f32650a);
            ipVar.o1t();
        }
        if (this.f32649a != null && m20562b()) {
            ipVar.cdj(f32644n);
            this.f32649a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f32652b != null) {
            ipVar.cdj(f32640g);
            ipVar.fn3e(this.f32652b);
            ipVar.o1t();
        }
        if (this.f32653c != null) {
            ipVar.cdj(f32648y);
            ipVar.fn3e(this.f32653c);
            ipVar.o1t();
        }
        if (this.f32654d != null) {
            ipVar.cdj(f32647s);
            ipVar.fn3e(this.f32654d);
            ipVar.o1t();
        }
        if (this.f32655e != null && m20569f()) {
            ipVar.cdj(f32645p);
            ipVar.fn3e(this.f32655e);
            ipVar.o1t();
        }
        if (this.f32656f != null && m20570g()) {
            ipVar.cdj(f32641h);
            ipVar.fn3e(this.f32656f);
            ipVar.o1t();
        }
        if (this.f32651a != null && m20571h()) {
            ipVar.cdj(f32642i);
            ipVar.ki(new izu(com.google.common.base.zy.f68132qrj, this.f32651a.size()));
            Iterator<String> it = this.f32651a.iterator();
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
    public int compareTo(a8p6 a8p6Var) {
        int iF7l8;
        int iM21911n;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iM21911n5;
        int iM21913q;
        int iM21911n6;
        if (!getClass().equals(a8p6Var.getClass())) {
            return getClass().getName().compareTo(a8p6Var.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20558a()).compareTo(Boolean.valueOf(a8p6Var.m20558a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20558a() && (iM21911n6 = vh.m21911n(this.f32650a, a8p6Var.f32650a)) != 0) {
            return iM21911n6;
        }
        int iCompareTo2 = Boolean.valueOf(m20562b()).compareTo(Boolean.valueOf(a8p6Var.m20562b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20562b() && (iM21913q = vh.m21913q(this.f32649a, a8p6Var.f32649a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m20564c()).compareTo(Boolean.valueOf(a8p6Var.m20564c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m20564c() && (iM21911n5 = vh.m21911n(this.f32652b, a8p6Var.f32652b)) != 0) {
            return iM21911n5;
        }
        int iCompareTo4 = Boolean.valueOf(m20566d()).compareTo(Boolean.valueOf(a8p6Var.m20566d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m20566d() && (iM21911n4 = vh.m21911n(this.f32653c, a8p6Var.f32653c)) != 0) {
            return iM21911n4;
        }
        int iCompareTo5 = Boolean.valueOf(m20568e()).compareTo(Boolean.valueOf(a8p6Var.m20568e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m20568e() && (iM21911n3 = vh.m21911n(this.f32654d, a8p6Var.f32654d)) != 0) {
            return iM21911n3;
        }
        int iCompareTo6 = Boolean.valueOf(m20569f()).compareTo(Boolean.valueOf(a8p6Var.m20569f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m20569f() && (iM21911n2 = vh.m21911n(this.f32655e, a8p6Var.f32655e)) != 0) {
            return iM21911n2;
        }
        int iCompareTo7 = Boolean.valueOf(m20570g()).compareTo(Boolean.valueOf(a8p6Var.m20570g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m20570g() && (iM21911n = vh.m21911n(this.f32656f, a8p6Var.f32656f)) != 0) {
            return iM21911n;
        }
        int iCompareTo8 = Boolean.valueOf(m20571h()).compareTo(Boolean.valueOf(a8p6Var.m20571h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m20571h() || (iF7l8 = vh.f7l8(this.f32651a, a8p6Var.f32651a)) == 0) {
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
                m20556a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f32650a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f32649a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f32652b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f32653c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f32654d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f32655e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f32656f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 15) {
                        izu izuVarMo20990g = ipVar.mo20990g();
                        this.f32651a = new ArrayList(izuVarMo20990g.f73378toq);
                        for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                            this.f32651a.add(ipVar.mo20995p());
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
    public void m20556a() throws dbf {
        if (this.f32652b != null) {
            if (this.f32653c != null) {
                if (this.f32654d != null) {
                    return;
                }
                throw new dbf("Required field 'topic' was not present! Struct: " + toString());
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
