package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class z8 implements oaex<z8, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public b2 f34262a;

    /* JADX INFO: renamed from: a */
    public String f34263a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f34265a;

    /* JADX INFO: renamed from: b */
    public String f34266b;

    /* JADX INFO: renamed from: c */
    public String f34267c;

    /* JADX INFO: renamed from: d */
    public String f34268d;

    /* JADX INFO: renamed from: e */
    public String f34269e;

    /* JADX INFO: renamed from: f */
    public String f34270f;

    /* JADX INFO: renamed from: g */
    public String f34271g;

    /* JADX INFO: renamed from: k */
    private static final s31 f34252k = new s31("XmPushActionAckNotification");

    /* JADX INFO: renamed from: q */
    private static final vc f34255q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f34253n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: y */
    private static final vc f34259y = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: s */
    private static final vc f34257s = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: p */
    private static final vc f34254p = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: h */
    private static final vc f34250h = new vc("", (byte) 10, 7);

    /* JADX INFO: renamed from: i */
    private static final vc f34251i = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: z */
    private static final vc f34260z = new vc("", com.google.common.base.zy.f68124kja0, 9);

    /* JADX INFO: renamed from: t */
    private static final vc f34258t = new vc("", com.google.common.base.zy.f68132qrj, 10);

    /* JADX INFO: renamed from: r */
    private static final vc f34256r = new vc("", com.google.common.base.zy.f68132qrj, 11);

    /* JADX INFO: renamed from: a */
    private BitSet f34264a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public long f34261a = 0;

    /* JADX INFO: renamed from: a */
    public boolean m22086a() {
        return this.f34263a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m22090b() {
        return this.f34262a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m22092c() {
        return this.f34266b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m22094d() {
        return this.f34267c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m22096e() {
        return this.f34268d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof z8)) {
            return m22087a((z8) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m22097f() {
        return this.f34264a.get(0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m22098g() {
        return this.f34269e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m22099h() {
        return this.f34265a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m22100i() {
        return this.f34270f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m22101j() {
        return this.f34271g != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z3 = false;
        if (m22086a()) {
            sb.append("debug:");
            String str = this.f34263a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m22090b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f34262a;
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
        String str2 = this.f34266b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m22094d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f34267c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m22096e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f34268d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m22097f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f34261a);
        }
        if (m22098g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f34269e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m22099h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f34265a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m22100i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f34270f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m22101j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f34271g;
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
    public z8 m22080a(b2 b2Var) {
        this.f34262a = b2Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public z8 m22088b(String str) {
        this.f34267c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public z8 m22091c(String str) {
        this.f34268d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public z8 m22093d(String str) {
        this.f34269e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public z8 m22095e(String str) {
        this.f34270f = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m22082a() {
        return this.f34266b;
    }

    /* JADX INFO: renamed from: b */
    public String m22089b() {
        return this.f34268d;
    }

    /* JADX INFO: renamed from: a */
    public z8 m22081a(String str) {
        this.f34266b = str;
        return this;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m22084a();
        ipVar.mo20992i(f34252k);
        if (this.f34263a != null && m22086a()) {
            ipVar.cdj(f34255q);
            ipVar.fn3e(this.f34263a);
            ipVar.o1t();
        }
        if (this.f34262a != null && m22090b()) {
            ipVar.cdj(f34253n);
            this.f34262a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f34266b != null) {
            ipVar.cdj(f34259y);
            ipVar.fn3e(this.f34266b);
            ipVar.o1t();
        }
        if (this.f34267c != null && m22094d()) {
            ipVar.cdj(f34257s);
            ipVar.fn3e(this.f34267c);
            ipVar.o1t();
        }
        if (this.f34268d != null && m22096e()) {
            ipVar.cdj(f34254p);
            ipVar.fn3e(this.f34268d);
            ipVar.o1t();
        }
        if (m22097f()) {
            ipVar.cdj(f34250h);
            ipVar.mo20991h(this.f34261a);
            ipVar.o1t();
        }
        if (this.f34269e != null && m22098g()) {
            ipVar.cdj(f34251i);
            ipVar.fn3e(this.f34269e);
            ipVar.o1t();
        }
        if (this.f34265a != null && m22099h()) {
            ipVar.cdj(f34260z);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f34265a.size()));
            for (Map.Entry<String, String> entry : this.f34265a.entrySet()) {
                ipVar.fn3e(entry.getKey());
                ipVar.fn3e(entry.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        if (this.f34270f != null && m22100i()) {
            ipVar.cdj(f34258t);
            ipVar.fn3e(this.f34270f);
            ipVar.o1t();
        }
        if (this.f34271g != null && m22101j()) {
            ipVar.cdj(f34256r);
            ipVar.fn3e(this.f34271g);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public z8 m22079a(long j2) {
        this.f34261a = j2;
        m22085a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m22085a(boolean z2) {
        this.f34264a.set(0, z2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m22083a() {
        return this.f34265a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22087a(z8 z8Var) {
        if (z8Var == null) {
            return false;
        }
        boolean zM22086a = m22086a();
        boolean zM22086a2 = z8Var.m22086a();
        if ((zM22086a || zM22086a2) && !(zM22086a && zM22086a2 && this.f34263a.equals(z8Var.f34263a))) {
            return false;
        }
        boolean zM22090b = m22090b();
        boolean zM22090b2 = z8Var.m22090b();
        if ((zM22090b || zM22090b2) && !(zM22090b && zM22090b2 && this.f34262a.m20627a(z8Var.f34262a))) {
            return false;
        }
        boolean zM22092c = m22092c();
        boolean zM22092c2 = z8Var.m22092c();
        if ((zM22092c || zM22092c2) && !(zM22092c && zM22092c2 && this.f34266b.equals(z8Var.f34266b))) {
            return false;
        }
        boolean zM22094d = m22094d();
        boolean zM22094d2 = z8Var.m22094d();
        if ((zM22094d || zM22094d2) && !(zM22094d && zM22094d2 && this.f34267c.equals(z8Var.f34267c))) {
            return false;
        }
        boolean zM22096e = m22096e();
        boolean zM22096e2 = z8Var.m22096e();
        if ((zM22096e || zM22096e2) && !(zM22096e && zM22096e2 && this.f34268d.equals(z8Var.f34268d))) {
            return false;
        }
        boolean zM22097f = m22097f();
        boolean zM22097f2 = z8Var.m22097f();
        if ((zM22097f || zM22097f2) && !(zM22097f && zM22097f2 && this.f34261a == z8Var.f34261a)) {
            return false;
        }
        boolean zM22098g = m22098g();
        boolean zM22098g2 = z8Var.m22098g();
        if ((zM22098g || zM22098g2) && !(zM22098g && zM22098g2 && this.f34269e.equals(z8Var.f34269e))) {
            return false;
        }
        boolean zM22099h = m22099h();
        boolean zM22099h2 = z8Var.m22099h();
        if ((zM22099h || zM22099h2) && !(zM22099h && zM22099h2 && this.f34265a.equals(z8Var.f34265a))) {
            return false;
        }
        boolean zM22100i = m22100i();
        boolean zM22100i2 = z8Var.m22100i();
        if ((zM22100i || zM22100i2) && !(zM22100i && zM22100i2 && this.f34270f.equals(z8Var.f34270f))) {
            return false;
        }
        boolean zM22101j = m22101j();
        boolean zM22101j2 = z8Var.m22101j();
        if (zM22101j || zM22101j2) {
            return zM22101j && zM22101j2 && this.f34271g.equals(z8Var.f34271g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(z8 z8Var) {
        int iM21911n;
        int iM21911n2;
        int iM21915y;
        int iM21911n3;
        int iZy;
        int iM21911n4;
        int iM21911n5;
        int iM21911n6;
        int iM21913q;
        int iM21911n7;
        if (!getClass().equals(z8Var.getClass())) {
            return getClass().getName().compareTo(z8Var.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m22086a()).compareTo(Boolean.valueOf(z8Var.m22086a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m22086a() && (iM21911n7 = vh.m21911n(this.f34263a, z8Var.f34263a)) != 0) {
            return iM21911n7;
        }
        int iCompareTo2 = Boolean.valueOf(m22090b()).compareTo(Boolean.valueOf(z8Var.m22090b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m22090b() && (iM21913q = vh.m21913q(this.f34262a, z8Var.f34262a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m22092c()).compareTo(Boolean.valueOf(z8Var.m22092c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m22092c() && (iM21911n6 = vh.m21911n(this.f34266b, z8Var.f34266b)) != 0) {
            return iM21911n6;
        }
        int iCompareTo4 = Boolean.valueOf(m22094d()).compareTo(Boolean.valueOf(z8Var.m22094d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m22094d() && (iM21911n5 = vh.m21911n(this.f34267c, z8Var.f34267c)) != 0) {
            return iM21911n5;
        }
        int iCompareTo5 = Boolean.valueOf(m22096e()).compareTo(Boolean.valueOf(z8Var.m22096e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m22096e() && (iM21911n4 = vh.m21911n(this.f34268d, z8Var.f34268d)) != 0) {
            return iM21911n4;
        }
        int iCompareTo6 = Boolean.valueOf(m22097f()).compareTo(Boolean.valueOf(z8Var.m22097f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m22097f() && (iZy = vh.zy(this.f34261a, z8Var.f34261a)) != 0) {
            return iZy;
        }
        int iCompareTo7 = Boolean.valueOf(m22098g()).compareTo(Boolean.valueOf(z8Var.m22098g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m22098g() && (iM21911n3 = vh.m21911n(this.f34269e, z8Var.f34269e)) != 0) {
            return iM21911n3;
        }
        int iCompareTo8 = Boolean.valueOf(m22099h()).compareTo(Boolean.valueOf(z8Var.m22099h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m22099h() && (iM21915y = vh.m21915y(this.f34265a, z8Var.f34265a)) != 0) {
            return iM21915y;
        }
        int iCompareTo9 = Boolean.valueOf(m22100i()).compareTo(Boolean.valueOf(z8Var.m22100i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m22100i() && (iM21911n2 = vh.m21911n(this.f34270f, z8Var.f34270f)) != 0) {
            return iM21911n2;
        }
        int iCompareTo10 = Boolean.valueOf(m22101j()).compareTo(Boolean.valueOf(z8Var.m22101j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m22101j() || (iM21911n = vh.m21911n(this.f34271g, z8Var.f34271g)) == 0) {
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
                m22084a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f34263a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f34262a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f34266b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f34267c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f34268d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                default:
                    koj.m21140k(ipVar, b2);
                    break;
                case 7:
                    if (b2 == 10) {
                        this.f34261a = ipVar.mo20996q();
                        m22085a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f34269e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 13) {
                        ap23 ap23VarF7l8 = ipVar.f7l8();
                        this.f34265a = new HashMap(ap23VarF7l8.f73265zy * 2);
                        for (int i2 = 0; i2 < ap23VarF7l8.f73265zy; i2++) {
                            this.f34265a.put(ipVar.mo20995p(), ipVar.mo20995p());
                        }
                        ipVar.fti();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f34270f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f34271g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m22084a() throws dbf {
        if (this.f34266b != null) {
            return;
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
