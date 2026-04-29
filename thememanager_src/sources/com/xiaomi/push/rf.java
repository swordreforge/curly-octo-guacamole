package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class rf implements oaex<rf, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public b2 f33601a;

    /* JADX INFO: renamed from: a */
    public j3y2 f33602a;

    /* JADX INFO: renamed from: a */
    public String f33603a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f33605a;

    /* JADX INFO: renamed from: b */
    public String f33607b;

    /* JADX INFO: renamed from: c */
    public String f33608c;

    /* JADX INFO: renamed from: d */
    public String f33609d;

    /* JADX INFO: renamed from: e */
    public String f33610e;

    /* JADX INFO: renamed from: f */
    public String f33611f;

    /* JADX INFO: renamed from: g */
    public String f33612g;

    /* JADX INFO: renamed from: h */
    public String f33613h;

    /* JADX INFO: renamed from: k */
    private static final s31 f33590k = new s31("XmPushActionSendMessage");

    /* JADX INFO: renamed from: q */
    private static final vc f33595q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33592n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: y */
    private static final vc f33599y = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: s */
    private static final vc f33597s = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: p */
    private static final vc f33594p = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: i */
    private static final vc f33588i = new vc("", com.google.common.base.zy.f68132qrj, 6);

    /* JADX INFO: renamed from: z */
    private static final vc f33600z = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: t */
    private static final vc f33598t = new vc("", com.google.common.base.zy.f68128n7h, 8);

    /* JADX INFO: renamed from: r */
    private static final vc f33596r = new vc("", (byte) 2, 9);

    /* JADX INFO: renamed from: l */
    private static final vc f33591l = new vc("", com.google.common.base.zy.f68124kja0, 10);

    /* JADX INFO: renamed from: j */
    private static final vc f33589j = new vc("", com.google.common.base.zy.f68132qrj, 11);

    /* JADX INFO: renamed from: o */
    private static final vc f33593o = new vc("", com.google.common.base.zy.f68132qrj, 12);

    /* JADX INFO: renamed from: a */
    private BitSet f33604a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public boolean f33606a = true;

    /* JADX INFO: renamed from: a */
    public boolean m21435a() {
        return this.f33603a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21438b() {
        return this.f33601a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21440c() {
        return this.f33607b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21442d() {
        return this.f33608c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m21444e() {
        return this.f33609d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof rf)) {
            return m21436a((rf) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21446f() {
        return this.f33610e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m21447g() {
        return this.f33611f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21448h() {
        return this.f33602a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21449i() {
        return this.f33604a.get(0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m21450j() {
        return this.f33605a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m21451k() {
        return this.f33612g != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m21452l() {
        return this.f33613h != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z3 = false;
        if (m21435a()) {
            sb.append("debug:");
            String str = this.f33603a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m21438b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f33601a;
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
        String str2 = this.f33607b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f33608c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m21444e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f33609d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m21446f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f33610e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m21447g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f33611f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m21448h()) {
            sb.append(", ");
            sb.append("message:");
            j3y2 j3y2Var = this.f33602a;
            if (j3y2Var == null) {
                sb.append("null");
            } else {
                sb.append(j3y2Var);
            }
        }
        if (m21449i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f33606a);
        }
        if (m21450j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f33605a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m21451k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f33612g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m21452l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.f33613h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public String m21432a() {
        return this.f33607b;
    }

    /* JADX INFO: renamed from: b */
    public String m21437b() {
        return this.f33608c;
    }

    /* JADX INFO: renamed from: c */
    public String m21439c() {
        return this.f33610e;
    }

    /* JADX INFO: renamed from: d */
    public String m21441d() {
        return this.f33611f;
    }

    /* JADX INFO: renamed from: e */
    public String m21443e() {
        return this.f33612g;
    }

    /* JADX INFO: renamed from: f */
    public String m21445f() {
        return this.f33613h;
    }

    /* JADX INFO: renamed from: a */
    public j3y2 m21431a() {
        return this.f33602a;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21433a();
        ipVar.mo20992i(f33590k);
        if (this.f33603a != null && m21435a()) {
            ipVar.cdj(f33595q);
            ipVar.fn3e(this.f33603a);
            ipVar.o1t();
        }
        if (this.f33601a != null && m21438b()) {
            ipVar.cdj(f33592n);
            this.f33601a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f33607b != null) {
            ipVar.cdj(f33599y);
            ipVar.fn3e(this.f33607b);
            ipVar.o1t();
        }
        if (this.f33608c != null) {
            ipVar.cdj(f33597s);
            ipVar.fn3e(this.f33608c);
            ipVar.o1t();
        }
        if (this.f33609d != null && m21444e()) {
            ipVar.cdj(f33594p);
            ipVar.fn3e(this.f33609d);
            ipVar.o1t();
        }
        if (this.f33610e != null && m21446f()) {
            ipVar.cdj(f33588i);
            ipVar.fn3e(this.f33610e);
            ipVar.o1t();
        }
        if (this.f33611f != null && m21447g()) {
            ipVar.cdj(f33600z);
            ipVar.fn3e(this.f33611f);
            ipVar.o1t();
        }
        if (this.f33602a != null && m21448h()) {
            ipVar.cdj(f33598t);
            this.f33602a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (m21449i()) {
            ipVar.cdj(f33596r);
            ipVar.fu4(this.f33606a);
            ipVar.o1t();
        }
        if (this.f33605a != null && m21450j()) {
            ipVar.cdj(f33591l);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f33605a.size()));
            for (Map.Entry<String, String> entry : this.f33605a.entrySet()) {
                ipVar.fn3e(entry.getKey());
                ipVar.fn3e(entry.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        if (this.f33612g != null && m21451k()) {
            ipVar.cdj(f33589j);
            ipVar.fn3e(this.f33612g);
            ipVar.o1t();
        }
        if (this.f33613h != null && m21452l()) {
            ipVar.cdj(f33593o);
            ipVar.fn3e(this.f33613h);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public void m21434a(boolean z2) {
        this.f33604a.set(0, z2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m21436a(rf rfVar) {
        if (rfVar == null) {
            return false;
        }
        boolean zM21435a = m21435a();
        boolean zM21435a2 = rfVar.m21435a();
        if ((zM21435a || zM21435a2) && !(zM21435a && zM21435a2 && this.f33603a.equals(rfVar.f33603a))) {
            return false;
        }
        boolean zM21438b = m21438b();
        boolean zM21438b2 = rfVar.m21438b();
        if ((zM21438b || zM21438b2) && !(zM21438b && zM21438b2 && this.f33601a.m20627a(rfVar.f33601a))) {
            return false;
        }
        boolean zM21440c = m21440c();
        boolean zM21440c2 = rfVar.m21440c();
        if ((zM21440c || zM21440c2) && !(zM21440c && zM21440c2 && this.f33607b.equals(rfVar.f33607b))) {
            return false;
        }
        boolean zM21442d = m21442d();
        boolean zM21442d2 = rfVar.m21442d();
        if ((zM21442d || zM21442d2) && !(zM21442d && zM21442d2 && this.f33608c.equals(rfVar.f33608c))) {
            return false;
        }
        boolean zM21444e = m21444e();
        boolean zM21444e2 = rfVar.m21444e();
        if ((zM21444e || zM21444e2) && !(zM21444e && zM21444e2 && this.f33609d.equals(rfVar.f33609d))) {
            return false;
        }
        boolean zM21446f = m21446f();
        boolean zM21446f2 = rfVar.m21446f();
        if ((zM21446f || zM21446f2) && !(zM21446f && zM21446f2 && this.f33610e.equals(rfVar.f33610e))) {
            return false;
        }
        boolean zM21447g = m21447g();
        boolean zM21447g2 = rfVar.m21447g();
        if ((zM21447g || zM21447g2) && !(zM21447g && zM21447g2 && this.f33611f.equals(rfVar.f33611f))) {
            return false;
        }
        boolean zM21448h = m21448h();
        boolean zM21448h2 = rfVar.m21448h();
        if ((zM21448h || zM21448h2) && !(zM21448h && zM21448h2 && this.f33602a.m21029a(rfVar.f33602a))) {
            return false;
        }
        boolean zM21449i = m21449i();
        boolean zM21449i2 = rfVar.m21449i();
        if ((zM21449i || zM21449i2) && !(zM21449i && zM21449i2 && this.f33606a == rfVar.f33606a)) {
            return false;
        }
        boolean zM21450j = m21450j();
        boolean zM21450j2 = rfVar.m21450j();
        if ((zM21450j || zM21450j2) && !(zM21450j && zM21450j2 && this.f33605a.equals(rfVar.f33605a))) {
            return false;
        }
        boolean zM21451k = m21451k();
        boolean zM21451k2 = rfVar.m21451k();
        if ((zM21451k || zM21451k2) && !(zM21451k && zM21451k2 && this.f33612g.equals(rfVar.f33612g))) {
            return false;
        }
        boolean zM21452l = m21452l();
        boolean zM21452l2 = rfVar.m21452l();
        if (zM21452l || zM21452l2) {
            return zM21452l && zM21452l2 && this.f33613h.equals(rfVar.f33613h);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(rf rfVar) {
        int iM21911n;
        int iM21911n2;
        int iM21915y;
        int iLd6;
        int iM21913q;
        int iM21911n3;
        int iM21911n4;
        int iM21911n5;
        int iM21911n6;
        int iM21911n7;
        int iM21913q2;
        int iM21911n8;
        if (!getClass().equals(rfVar.getClass())) {
            return getClass().getName().compareTo(rfVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21435a()).compareTo(Boolean.valueOf(rfVar.m21435a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21435a() && (iM21911n8 = vh.m21911n(this.f33603a, rfVar.f33603a)) != 0) {
            return iM21911n8;
        }
        int iCompareTo2 = Boolean.valueOf(m21438b()).compareTo(Boolean.valueOf(rfVar.m21438b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21438b() && (iM21913q2 = vh.m21913q(this.f33601a, rfVar.f33601a)) != 0) {
            return iM21913q2;
        }
        int iCompareTo3 = Boolean.valueOf(m21440c()).compareTo(Boolean.valueOf(rfVar.m21440c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21440c() && (iM21911n7 = vh.m21911n(this.f33607b, rfVar.f33607b)) != 0) {
            return iM21911n7;
        }
        int iCompareTo4 = Boolean.valueOf(m21442d()).compareTo(Boolean.valueOf(rfVar.m21442d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21442d() && (iM21911n6 = vh.m21911n(this.f33608c, rfVar.f33608c)) != 0) {
            return iM21911n6;
        }
        int iCompareTo5 = Boolean.valueOf(m21444e()).compareTo(Boolean.valueOf(rfVar.m21444e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21444e() && (iM21911n5 = vh.m21911n(this.f33609d, rfVar.f33609d)) != 0) {
            return iM21911n5;
        }
        int iCompareTo6 = Boolean.valueOf(m21446f()).compareTo(Boolean.valueOf(rfVar.m21446f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21446f() && (iM21911n4 = vh.m21911n(this.f33610e, rfVar.f33610e)) != 0) {
            return iM21911n4;
        }
        int iCompareTo7 = Boolean.valueOf(m21447g()).compareTo(Boolean.valueOf(rfVar.m21447g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21447g() && (iM21911n3 = vh.m21911n(this.f33611f, rfVar.f33611f)) != 0) {
            return iM21911n3;
        }
        int iCompareTo8 = Boolean.valueOf(m21448h()).compareTo(Boolean.valueOf(rfVar.m21448h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m21448h() && (iM21913q = vh.m21913q(this.f33602a, rfVar.f33602a)) != 0) {
            return iM21913q;
        }
        int iCompareTo9 = Boolean.valueOf(m21449i()).compareTo(Boolean.valueOf(rfVar.m21449i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m21449i() && (iLd6 = vh.ld6(this.f33606a, rfVar.f33606a)) != 0) {
            return iLd6;
        }
        int iCompareTo10 = Boolean.valueOf(m21450j()).compareTo(Boolean.valueOf(rfVar.m21450j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m21450j() && (iM21915y = vh.m21915y(this.f33605a, rfVar.f33605a)) != 0) {
            return iM21915y;
        }
        int iCompareTo11 = Boolean.valueOf(m21451k()).compareTo(Boolean.valueOf(rfVar.m21451k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m21451k() && (iM21911n2 = vh.m21911n(this.f33612g, rfVar.f33612g)) != 0) {
            return iM21911n2;
        }
        int iCompareTo12 = Boolean.valueOf(m21452l()).compareTo(Boolean.valueOf(rfVar.m21452l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!m21452l() || (iM21911n = vh.m21911n(this.f33613h, rfVar.f33613h)) == 0) {
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
                m21433a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f33603a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f33601a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f33607b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f33608c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f33609d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f33610e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f33611f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 12) {
                        j3y2 j3y2Var = new j3y2();
                        this.f33602a = j3y2Var;
                        j3y2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 2) {
                        this.f33606a = ipVar.mo21000z();
                        m21434a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 13) {
                        ap23 ap23VarF7l8 = ipVar.f7l8();
                        this.f33605a = new HashMap(ap23VarF7l8.f73265zy * 2);
                        for (int i2 = 0; i2 < ap23VarF7l8.f73265zy; i2++) {
                            this.f33605a.put(ipVar.mo20995p(), ipVar.mo20995p());
                        }
                        ipVar.fti();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f33612g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f33613h = ipVar.mo20995p();
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
    public void m21433a() throws dbf {
        if (this.f33607b != null) {
            if (this.f33608c != null) {
                return;
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
