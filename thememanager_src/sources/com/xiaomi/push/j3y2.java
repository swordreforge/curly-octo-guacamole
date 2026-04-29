package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class j3y2 implements oaex<j3y2, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f33076a;

    /* JADX INFO: renamed from: a */
    public b2 f33077a;

    /* JADX INFO: renamed from: a */
    public ge f33078a;

    /* JADX INFO: renamed from: a */
    public String f33079a;

    /* JADX INFO: renamed from: a */
    private BitSet f33080a = new BitSet(4);

    /* JADX INFO: renamed from: a */
    public boolean f33081a = false;

    /* JADX INFO: renamed from: b */
    public long f33082b;

    /* JADX INFO: renamed from: b */
    public String f33083b;

    /* JADX INFO: renamed from: c */
    public long f33084c;

    /* JADX INFO: renamed from: c */
    public String f33085c;

    /* JADX INFO: renamed from: d */
    public String f33086d;

    /* JADX INFO: renamed from: e */
    public String f33087e;

    /* JADX INFO: renamed from: f */
    public String f33088f;

    /* JADX INFO: renamed from: g */
    public String f33089g;

    /* JADX INFO: renamed from: h */
    public String f33090h;

    /* JADX INFO: renamed from: i */
    public String f33091i;

    /* JADX INFO: renamed from: j */
    public String f33092j;

    /* JADX INFO: renamed from: k */
    public String f33093k;

    /* JADX INFO: renamed from: l */
    public String f33094l;

    /* JADX INFO: renamed from: q */
    private static final s31 f33066q = new s31("PushMessage");

    /* JADX INFO: renamed from: n */
    private static final vc f33063n = new vc("", com.google.common.base.zy.f68128n7h, 1);

    /* JADX INFO: renamed from: y */
    private static final vc f33074y = new vc("", com.google.common.base.zy.f68132qrj, 2);

    /* JADX INFO: renamed from: s */
    private static final vc f33068s = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: p */
    private static final vc f33065p = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: z */
    private static final vc f33075z = new vc("", (byte) 10, 5);

    /* JADX INFO: renamed from: t */
    private static final vc f33069t = new vc("", (byte) 10, 6);

    /* JADX INFO: renamed from: r */
    private static final vc f33067r = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: o */
    private static final vc f33064o = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: m */
    private static final vc f33062m = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: x */
    private static final vc f33073x = new vc("", com.google.common.base.zy.f68132qrj, 10);

    /* JADX INFO: renamed from: u */
    private static final vc f33070u = new vc("", com.google.common.base.zy.f68132qrj, 11);

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final vc f73380bo = new vc("", com.google.common.base.zy.f68128n7h, 12);

    /* JADX INFO: renamed from: v */
    private static final vc f33071v = new vc("", com.google.common.base.zy.f68132qrj, 13);

    /* JADX INFO: renamed from: w */
    private static final vc f33072w = new vc("", (byte) 2, 14);

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final vc f73379ab = new vc("", com.google.common.base.zy.f68132qrj, 15);
    private static final vc bb = new vc("", (byte) 10, 16);
    private static final vc bp = new vc("", com.google.common.base.zy.f68132qrj, 20);
    private static final vc bv = new vc("", com.google.common.base.zy.f68132qrj, 21);

    /* JADX INFO: renamed from: a */
    public boolean m21028a() {
        return this.f33077a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21032b() {
        return this.f33079a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21035c() {
        return this.f33083b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21037d() {
        return this.f33085c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m21038e() {
        return this.f33080a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof j3y2)) {
            return m21029a((j3y2) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21039f() {
        return this.f33080a.get(1);
    }

    /* JADX INFO: renamed from: g */
    public boolean m21040g() {
        return this.f33086d != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21041h() {
        return this.f33087e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21042i() {
        return this.f33088f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m21043j() {
        return this.f33089g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m21044k() {
        return this.f33090h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m21045l() {
        return this.f33078a != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m21046m() {
        return this.f33091i != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m21047n() {
        return this.f33080a.get(2);
    }

    /* JADX INFO: renamed from: o */
    public boolean m21048o() {
        return this.f33092j != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m21049p() {
        return this.f33080a.get(3);
    }

    /* JADX INFO: renamed from: q */
    public boolean m21050q() {
        return this.f33093k != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m21051r() {
        return this.f33094l != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (m21028a()) {
            sb.append("to:");
            b2 b2Var = this.f33077a;
            if (b2Var == null) {
                sb.append("null");
            } else {
                sb.append(b2Var);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f33079a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f33083b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("payload:");
        String str3 = this.f33085c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m21038e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f33076a);
        }
        if (m21039f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f33082b);
        }
        if (m21040g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.f33086d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m21041h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f33087e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m21042i()) {
            sb.append(", ");
            sb.append("regId:");
            String str6 = this.f33088f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m21043j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f33089g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m21044k()) {
            sb.append(", ");
            sb.append("topic:");
            String str8 = this.f33090h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m21045l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            ge geVar = this.f33078a;
            if (geVar == null) {
                sb.append("null");
            } else {
                sb.append(geVar);
            }
        }
        if (m21046m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f33091i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m21047n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f33081a);
        }
        if (m21048o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f33092j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m21049p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f33084c);
        }
        if (m21050q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f33093k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m21051r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f33094l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public String m21025a() {
        return this.f33079a;
    }

    /* JADX INFO: renamed from: b */
    public String m21030b() {
        return this.f33083b;
    }

    /* JADX INFO: renamed from: c */
    public String m21033c() {
        return this.f33085c;
    }

    /* JADX INFO: renamed from: d */
    public void m21036d(boolean z2) {
        this.f33080a.set(3, z2);
    }

    /* JADX INFO: renamed from: a */
    public long m21024a() {
        return this.f33076a;
    }

    /* JADX INFO: renamed from: b */
    public void m21031b(boolean z2) {
        this.f33080a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m21034c(boolean z2) {
        this.f33080a.set(2, z2);
    }

    /* JADX INFO: renamed from: a */
    public void m21027a(boolean z2) {
        this.f33080a.set(0, z2);
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21026a();
        ipVar.mo20992i(f33066q);
        if (this.f33077a != null && m21028a()) {
            ipVar.cdj(f33063n);
            this.f33077a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f33079a != null) {
            ipVar.cdj(f33074y);
            ipVar.fn3e(this.f33079a);
            ipVar.o1t();
        }
        if (this.f33083b != null) {
            ipVar.cdj(f33068s);
            ipVar.fn3e(this.f33083b);
            ipVar.o1t();
        }
        if (this.f33085c != null) {
            ipVar.cdj(f33065p);
            ipVar.fn3e(this.f33085c);
            ipVar.o1t();
        }
        if (m21038e()) {
            ipVar.cdj(f33075z);
            ipVar.mo20991h(this.f33076a);
            ipVar.o1t();
        }
        if (m21039f()) {
            ipVar.cdj(f33069t);
            ipVar.mo20991h(this.f33082b);
            ipVar.o1t();
        }
        if (this.f33086d != null && m21040g()) {
            ipVar.cdj(f33067r);
            ipVar.fn3e(this.f33086d);
            ipVar.o1t();
        }
        if (this.f33087e != null && m21041h()) {
            ipVar.cdj(f33064o);
            ipVar.fn3e(this.f33087e);
            ipVar.o1t();
        }
        if (this.f33088f != null && m21042i()) {
            ipVar.cdj(f33062m);
            ipVar.fn3e(this.f33088f);
            ipVar.o1t();
        }
        if (this.f33089g != null && m21043j()) {
            ipVar.cdj(f33073x);
            ipVar.fn3e(this.f33089g);
            ipVar.o1t();
        }
        if (this.f33090h != null && m21044k()) {
            ipVar.cdj(f33070u);
            ipVar.fn3e(this.f33090h);
            ipVar.o1t();
        }
        if (this.f33078a != null && m21045l()) {
            ipVar.cdj(f73380bo);
            this.f33078a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f33091i != null && m21046m()) {
            ipVar.cdj(f33071v);
            ipVar.fn3e(this.f33091i);
            ipVar.o1t();
        }
        if (m21047n()) {
            ipVar.cdj(f33072w);
            ipVar.fu4(this.f33081a);
            ipVar.o1t();
        }
        if (this.f33092j != null && m21048o()) {
            ipVar.cdj(f73379ab);
            ipVar.fn3e(this.f33092j);
            ipVar.o1t();
        }
        if (m21049p()) {
            ipVar.cdj(bb);
            ipVar.mo20991h(this.f33084c);
            ipVar.o1t();
        }
        if (this.f33093k != null && m21050q()) {
            ipVar.cdj(bp);
            ipVar.fn3e(this.f33093k);
            ipVar.o1t();
        }
        if (this.f33094l != null && m21051r()) {
            ipVar.cdj(bv);
            ipVar.fn3e(this.f33094l);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21029a(j3y2 j3y2Var) {
        if (j3y2Var == null) {
            return false;
        }
        boolean zM21028a = m21028a();
        boolean zM21028a2 = j3y2Var.m21028a();
        if ((zM21028a || zM21028a2) && !(zM21028a && zM21028a2 && this.f33077a.m20627a(j3y2Var.f33077a))) {
            return false;
        }
        boolean zM21032b = m21032b();
        boolean zM21032b2 = j3y2Var.m21032b();
        if ((zM21032b || zM21032b2) && !(zM21032b && zM21032b2 && this.f33079a.equals(j3y2Var.f33079a))) {
            return false;
        }
        boolean zM21035c = m21035c();
        boolean zM21035c2 = j3y2Var.m21035c();
        if ((zM21035c || zM21035c2) && !(zM21035c && zM21035c2 && this.f33083b.equals(j3y2Var.f33083b))) {
            return false;
        }
        boolean zM21037d = m21037d();
        boolean zM21037d2 = j3y2Var.m21037d();
        if ((zM21037d || zM21037d2) && !(zM21037d && zM21037d2 && this.f33085c.equals(j3y2Var.f33085c))) {
            return false;
        }
        boolean zM21038e = m21038e();
        boolean zM21038e2 = j3y2Var.m21038e();
        if ((zM21038e || zM21038e2) && !(zM21038e && zM21038e2 && this.f33076a == j3y2Var.f33076a)) {
            return false;
        }
        boolean zM21039f = m21039f();
        boolean zM21039f2 = j3y2Var.m21039f();
        if ((zM21039f || zM21039f2) && !(zM21039f && zM21039f2 && this.f33082b == j3y2Var.f33082b)) {
            return false;
        }
        boolean zM21040g = m21040g();
        boolean zM21040g2 = j3y2Var.m21040g();
        if ((zM21040g || zM21040g2) && !(zM21040g && zM21040g2 && this.f33086d.equals(j3y2Var.f33086d))) {
            return false;
        }
        boolean zM21041h = m21041h();
        boolean zM21041h2 = j3y2Var.m21041h();
        if ((zM21041h || zM21041h2) && !(zM21041h && zM21041h2 && this.f33087e.equals(j3y2Var.f33087e))) {
            return false;
        }
        boolean zM21042i = m21042i();
        boolean zM21042i2 = j3y2Var.m21042i();
        if ((zM21042i || zM21042i2) && !(zM21042i && zM21042i2 && this.f33088f.equals(j3y2Var.f33088f))) {
            return false;
        }
        boolean zM21043j = m21043j();
        boolean zM21043j2 = j3y2Var.m21043j();
        if ((zM21043j || zM21043j2) && !(zM21043j && zM21043j2 && this.f33089g.equals(j3y2Var.f33089g))) {
            return false;
        }
        boolean zM21044k = m21044k();
        boolean zM21044k2 = j3y2Var.m21044k();
        if ((zM21044k || zM21044k2) && !(zM21044k && zM21044k2 && this.f33090h.equals(j3y2Var.f33090h))) {
            return false;
        }
        boolean zM21045l = m21045l();
        boolean zM21045l2 = j3y2Var.m21045l();
        if ((zM21045l || zM21045l2) && !(zM21045l && zM21045l2 && this.f33078a.m20912a(j3y2Var.f33078a))) {
            return false;
        }
        boolean zM21046m = m21046m();
        boolean zM21046m2 = j3y2Var.m21046m();
        if ((zM21046m || zM21046m2) && !(zM21046m && zM21046m2 && this.f33091i.equals(j3y2Var.f33091i))) {
            return false;
        }
        boolean zM21047n = m21047n();
        boolean zM21047n2 = j3y2Var.m21047n();
        if ((zM21047n || zM21047n2) && !(zM21047n && zM21047n2 && this.f33081a == j3y2Var.f33081a)) {
            return false;
        }
        boolean zM21048o = m21048o();
        boolean zM21048o2 = j3y2Var.m21048o();
        if ((zM21048o || zM21048o2) && !(zM21048o && zM21048o2 && this.f33092j.equals(j3y2Var.f33092j))) {
            return false;
        }
        boolean zM21049p = m21049p();
        boolean zM21049p2 = j3y2Var.m21049p();
        if ((zM21049p || zM21049p2) && !(zM21049p && zM21049p2 && this.f33084c == j3y2Var.f33084c)) {
            return false;
        }
        boolean zM21050q = m21050q();
        boolean zM21050q2 = j3y2Var.m21050q();
        if ((zM21050q || zM21050q2) && !(zM21050q && zM21050q2 && this.f33093k.equals(j3y2Var.f33093k))) {
            return false;
        }
        boolean zM21051r = m21051r();
        boolean zM21051r2 = j3y2Var.m21051r();
        if (zM21051r || zM21051r2) {
            return zM21051r && zM21051r2 && this.f33094l.equals(j3y2Var.f33094l);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j3y2 j3y2Var) {
        int iM21911n;
        int iM21911n2;
        int iZy;
        int iM21911n3;
        int iLd6;
        int iM21911n4;
        int iM21913q;
        int iM21911n5;
        int iM21911n6;
        int iM21911n7;
        int iM21911n8;
        int iM21911n9;
        int iZy2;
        int iZy3;
        int iM21911n10;
        int iM21911n11;
        int iM21911n12;
        int iM21913q2;
        if (!getClass().equals(j3y2Var.getClass())) {
            return getClass().getName().compareTo(j3y2Var.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21028a()).compareTo(Boolean.valueOf(j3y2Var.m21028a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21028a() && (iM21913q2 = vh.m21913q(this.f33077a, j3y2Var.f33077a)) != 0) {
            return iM21913q2;
        }
        int iCompareTo2 = Boolean.valueOf(m21032b()).compareTo(Boolean.valueOf(j3y2Var.m21032b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21032b() && (iM21911n12 = vh.m21911n(this.f33079a, j3y2Var.f33079a)) != 0) {
            return iM21911n12;
        }
        int iCompareTo3 = Boolean.valueOf(m21035c()).compareTo(Boolean.valueOf(j3y2Var.m21035c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21035c() && (iM21911n11 = vh.m21911n(this.f33083b, j3y2Var.f33083b)) != 0) {
            return iM21911n11;
        }
        int iCompareTo4 = Boolean.valueOf(m21037d()).compareTo(Boolean.valueOf(j3y2Var.m21037d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21037d() && (iM21911n10 = vh.m21911n(this.f33085c, j3y2Var.f33085c)) != 0) {
            return iM21911n10;
        }
        int iCompareTo5 = Boolean.valueOf(m21038e()).compareTo(Boolean.valueOf(j3y2Var.m21038e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21038e() && (iZy3 = vh.zy(this.f33076a, j3y2Var.f33076a)) != 0) {
            return iZy3;
        }
        int iCompareTo6 = Boolean.valueOf(m21039f()).compareTo(Boolean.valueOf(j3y2Var.m21039f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21039f() && (iZy2 = vh.zy(this.f33082b, j3y2Var.f33082b)) != 0) {
            return iZy2;
        }
        int iCompareTo7 = Boolean.valueOf(m21040g()).compareTo(Boolean.valueOf(j3y2Var.m21040g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21040g() && (iM21911n9 = vh.m21911n(this.f33086d, j3y2Var.f33086d)) != 0) {
            return iM21911n9;
        }
        int iCompareTo8 = Boolean.valueOf(m21041h()).compareTo(Boolean.valueOf(j3y2Var.m21041h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m21041h() && (iM21911n8 = vh.m21911n(this.f33087e, j3y2Var.f33087e)) != 0) {
            return iM21911n8;
        }
        int iCompareTo9 = Boolean.valueOf(m21042i()).compareTo(Boolean.valueOf(j3y2Var.m21042i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m21042i() && (iM21911n7 = vh.m21911n(this.f33088f, j3y2Var.f33088f)) != 0) {
            return iM21911n7;
        }
        int iCompareTo10 = Boolean.valueOf(m21043j()).compareTo(Boolean.valueOf(j3y2Var.m21043j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m21043j() && (iM21911n6 = vh.m21911n(this.f33089g, j3y2Var.f33089g)) != 0) {
            return iM21911n6;
        }
        int iCompareTo11 = Boolean.valueOf(m21044k()).compareTo(Boolean.valueOf(j3y2Var.m21044k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m21044k() && (iM21911n5 = vh.m21911n(this.f33090h, j3y2Var.f33090h)) != 0) {
            return iM21911n5;
        }
        int iCompareTo12 = Boolean.valueOf(m21045l()).compareTo(Boolean.valueOf(j3y2Var.m21045l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m21045l() && (iM21913q = vh.m21913q(this.f33078a, j3y2Var.f33078a)) != 0) {
            return iM21913q;
        }
        int iCompareTo13 = Boolean.valueOf(m21046m()).compareTo(Boolean.valueOf(j3y2Var.m21046m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m21046m() && (iM21911n4 = vh.m21911n(this.f33091i, j3y2Var.f33091i)) != 0) {
            return iM21911n4;
        }
        int iCompareTo14 = Boolean.valueOf(m21047n()).compareTo(Boolean.valueOf(j3y2Var.m21047n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m21047n() && (iLd6 = vh.ld6(this.f33081a, j3y2Var.f33081a)) != 0) {
            return iLd6;
        }
        int iCompareTo15 = Boolean.valueOf(m21048o()).compareTo(Boolean.valueOf(j3y2Var.m21048o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m21048o() && (iM21911n3 = vh.m21911n(this.f33092j, j3y2Var.f33092j)) != 0) {
            return iM21911n3;
        }
        int iCompareTo16 = Boolean.valueOf(m21049p()).compareTo(Boolean.valueOf(j3y2Var.m21049p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m21049p() && (iZy = vh.zy(this.f33084c, j3y2Var.f33084c)) != 0) {
            return iZy;
        }
        int iCompareTo17 = Boolean.valueOf(m21050q()).compareTo(Boolean.valueOf(j3y2Var.m21050q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m21050q() && (iM21911n2 = vh.m21911n(this.f33093k, j3y2Var.f33093k)) != 0) {
            return iM21911n2;
        }
        int iCompareTo18 = Boolean.valueOf(m21051r()).compareTo(Boolean.valueOf(j3y2Var.m21051r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (!m21051r() || (iM21911n = vh.m21911n(this.f33094l, j3y2Var.f33094l)) == 0) {
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
                m21026a();
                return;
            }
            short s2 = vcVarMo20994n.f73704zy;
            if (s2 != 20) {
                if (s2 != 21) {
                    switch (s2) {
                        case 1:
                            if (b2 == 12) {
                                b2 b2Var = new b2();
                                this.f33077a = b2Var;
                                b2Var.mo20557a(ipVar);
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 2:
                            if (b2 == 11) {
                                this.f33079a = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 3:
                            if (b2 == 11) {
                                this.f33083b = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 4:
                            if (b2 == 11) {
                                this.f33085c = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 5:
                            if (b2 == 10) {
                                this.f33076a = ipVar.mo20996q();
                                m21027a(true);
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 6:
                            if (b2 == 10) {
                                this.f33082b = ipVar.mo20996q();
                                m21031b(true);
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 7:
                            if (b2 == 11) {
                                this.f33086d = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 8:
                            if (b2 == 11) {
                                this.f33087e = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 9:
                            if (b2 == 11) {
                                this.f33088f = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 10:
                            if (b2 == 11) {
                                this.f33089g = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 11:
                            if (b2 == 11) {
                                this.f33090h = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 12:
                            if (b2 == 12) {
                                ge geVar = new ge();
                                this.f33078a = geVar;
                                geVar.mo20557a(ipVar);
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 13:
                            if (b2 == 11) {
                                this.f33091i = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 14:
                            if (b2 == 2) {
                                this.f33081a = ipVar.mo21000z();
                                m21034c(true);
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 15:
                            if (b2 == 11) {
                                this.f33092j = ipVar.mo20995p();
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        case 16:
                            if (b2 == 10) {
                                this.f33084c = ipVar.mo20996q();
                                m21036d(true);
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                            break;
                        default:
                            koj.m21140k(ipVar, b2);
                            break;
                    }
                } else if (b2 == 11) {
                    this.f33094l = ipVar.mo20995p();
                } else {
                    koj.m21140k(ipVar, b2);
                }
            } else if (b2 == 11) {
                this.f33093k = ipVar.mo20995p();
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21026a() throws dbf {
        if (this.f33079a != null) {
            if (this.f33083b != null) {
                if (this.f33085c != null) {
                    return;
                }
                throw new dbf("Required field 'payload' was not present! Struct: " + toString());
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
