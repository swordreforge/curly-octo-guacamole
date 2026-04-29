package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class x7o implements oaex<x7o, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f34150a;

    /* JADX INFO: renamed from: a */
    public long f34151a;

    /* JADX INFO: renamed from: a */
    public b2 f34152a;

    /* JADX INFO: renamed from: a */
    public rf f34153a;

    /* JADX INFO: renamed from: a */
    public String f34154a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f34156a;

    /* JADX INFO: renamed from: a */
    public short f34157a;

    /* JADX INFO: renamed from: b */
    public String f34159b;

    /* JADX INFO: renamed from: b */
    public short f34160b;

    /* JADX INFO: renamed from: c */
    public String f34161c;

    /* JADX INFO: renamed from: d */
    public String f34162d;

    /* JADX INFO: renamed from: e */
    public String f34163e;

    /* JADX INFO: renamed from: f */
    public String f34164f;

    /* JADX INFO: renamed from: g */
    public String f34165g;

    /* JADX INFO: renamed from: h */
    public String f34166h;

    /* JADX INFO: renamed from: i */
    public String f34167i;

    /* JADX INFO: renamed from: j */
    public String f34168j;

    /* JADX INFO: renamed from: k */
    public String f34169k;

    /* JADX INFO: renamed from: l */
    public String f34170l;

    /* JADX INFO: renamed from: q */
    private static final s31 f34140q = new s31("XmPushActionAckMessage");

    /* JADX INFO: renamed from: n */
    private static final vc f34137n = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: y */
    private static final vc f34148y = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: s */
    private static final vc f34142s = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: p */
    private static final vc f34139p = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: z */
    private static final vc f34149z = new vc("", (byte) 10, 5);

    /* JADX INFO: renamed from: t */
    private static final vc f34143t = new vc("", com.google.common.base.zy.f68132qrj, 6);

    /* JADX INFO: renamed from: r */
    private static final vc f34141r = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: o */
    private static final vc f34138o = new vc("", com.google.common.base.zy.f68128n7h, 8);

    /* JADX INFO: renamed from: m */
    private static final vc f34136m = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: x */
    private static final vc f34147x = new vc("", com.google.common.base.zy.f68132qrj, 10);

    /* JADX INFO: renamed from: u */
    private static final vc f34144u = new vc("", (byte) 2, 11);

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final vc f73725bo = new vc("", com.google.common.base.zy.f68132qrj, 12);

    /* JADX INFO: renamed from: v */
    private static final vc f34145v = new vc("", com.google.common.base.zy.f68132qrj, 13);

    /* JADX INFO: renamed from: w */
    private static final vc f34146w = new vc("", com.google.common.base.zy.f68132qrj, 14);

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final vc f73724ab = new vc("", (byte) 6, 15);
    private static final vc bb = new vc("", (byte) 6, 16);
    private static final vc bp = new vc("", com.google.common.base.zy.f68132qrj, 20);
    private static final vc bv = new vc("", com.google.common.base.zy.f68132qrj, 21);
    private static final vc an = new vc("", (byte) 8, 22);
    private static final vc id = new vc("", com.google.common.base.zy.f68124kja0, 23);

    /* JADX INFO: renamed from: a */
    private BitSet f34155a = new BitSet(5);

    /* JADX INFO: renamed from: a */
    public boolean f34158a = false;

    /* JADX INFO: renamed from: a */
    public boolean m21990a() {
        return this.f34154a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21994b() {
        return this.f34152a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21997c() {
        return this.f34159b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m22000d() {
        return this.f34161c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m22002e() {
        return this.f34155a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof x7o)) {
            return m21991a((x7o) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m22003f() {
        return this.f34162d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m22004g() {
        return this.f34163e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m22005h() {
        return this.f34153a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m22006i() {
        return this.f34164f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m22007j() {
        return this.f34165g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m22008k() {
        return this.f34155a.get(1);
    }

    /* JADX INFO: renamed from: l */
    public boolean m22009l() {
        return this.f34166h != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m22010m() {
        return this.f34167i != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m22011n() {
        return this.f34168j != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m22012o() {
        return this.f34155a.get(2);
    }

    /* JADX INFO: renamed from: p */
    public boolean m22013p() {
        return this.f34155a.get(3);
    }

    /* JADX INFO: renamed from: q */
    public boolean m22014q() {
        return this.f34169k != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m22015r() {
        return this.f34170l != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m22016s() {
        return this.f34155a.get(4);
    }

    /* JADX INFO: renamed from: t */
    public boolean m22017t() {
        return this.f34156a != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z3 = false;
        if (m21990a()) {
            sb.append("debug:");
            String str = this.f34154a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m21994b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f34152a;
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
        String str2 = this.f34159b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f34161c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f34151a);
        if (m22003f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f34162d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m22004g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f34163e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m22005h()) {
            sb.append(", ");
            sb.append("request:");
            rf rfVar = this.f34153a;
            if (rfVar == null) {
                sb.append("null");
            } else {
                sb.append(rfVar);
            }
        }
        if (m22006i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f34164f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m22007j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f34165g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m22008k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f34158a);
        }
        if (m22009l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f34166h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m22010m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f34167i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m22011n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f34168j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m22012o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f34157a);
        }
        if (m22013p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f34160b);
        }
        if (m22014q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f34169k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m22015r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f34170l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (m22016s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f34150a);
        }
        if (m22017t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f34156a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public x7o m21986a(String str) {
        this.f34159b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public x7o m21992b(String str) {
        this.f34161c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public x7o m21995c(String str) {
        this.f34162d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public x7o m21998d(String str) {
        this.f34163e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m22001e(boolean z2) {
        this.f34155a.set(4, z2);
    }

    /* JADX INFO: renamed from: a */
    public x7o m21985a(long j2) {
        this.f34151a = j2;
        m21989a(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m21993b(boolean z2) {
        this.f34155a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m21996c(boolean z2) {
        this.f34155a.set(2, z2);
    }

    /* JADX INFO: renamed from: d */
    public void m21999d(boolean z2) {
        this.f34155a.set(3, z2);
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21988a();
        ipVar.mo20992i(f34140q);
        if (this.f34154a != null && m21990a()) {
            ipVar.cdj(f34137n);
            ipVar.fn3e(this.f34154a);
            ipVar.o1t();
        }
        if (this.f34152a != null && m21994b()) {
            ipVar.cdj(f34148y);
            this.f34152a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f34159b != null) {
            ipVar.cdj(f34142s);
            ipVar.fn3e(this.f34159b);
            ipVar.o1t();
        }
        if (this.f34161c != null) {
            ipVar.cdj(f34139p);
            ipVar.fn3e(this.f34161c);
            ipVar.o1t();
        }
        ipVar.cdj(f34149z);
        ipVar.mo20991h(this.f34151a);
        ipVar.o1t();
        if (this.f34162d != null && m22003f()) {
            ipVar.cdj(f34143t);
            ipVar.fn3e(this.f34162d);
            ipVar.o1t();
        }
        if (this.f34163e != null && m22004g()) {
            ipVar.cdj(f34141r);
            ipVar.fn3e(this.f34163e);
            ipVar.o1t();
        }
        if (this.f34153a != null && m22005h()) {
            ipVar.cdj(f34138o);
            this.f34153a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f34164f != null && m22006i()) {
            ipVar.cdj(f34136m);
            ipVar.fn3e(this.f34164f);
            ipVar.o1t();
        }
        if (this.f34165g != null && m22007j()) {
            ipVar.cdj(f34147x);
            ipVar.fn3e(this.f34165g);
            ipVar.o1t();
        }
        if (m22008k()) {
            ipVar.cdj(f34144u);
            ipVar.fu4(this.f34158a);
            ipVar.o1t();
        }
        if (this.f34166h != null && m22009l()) {
            ipVar.cdj(f73725bo);
            ipVar.fn3e(this.f34166h);
            ipVar.o1t();
        }
        if (this.f34167i != null && m22010m()) {
            ipVar.cdj(f34145v);
            ipVar.fn3e(this.f34167i);
            ipVar.o1t();
        }
        if (this.f34168j != null && m22011n()) {
            ipVar.cdj(f34146w);
            ipVar.fn3e(this.f34168j);
            ipVar.o1t();
        }
        if (m22012o()) {
            ipVar.cdj(f73724ab);
            ipVar.ni7(this.f34157a);
            ipVar.o1t();
        }
        if (m22013p()) {
            ipVar.cdj(bb);
            ipVar.ni7(this.f34160b);
            ipVar.o1t();
        }
        if (this.f34169k != null && m22014q()) {
            ipVar.cdj(bp);
            ipVar.fn3e(this.f34169k);
            ipVar.o1t();
        }
        if (this.f34170l != null && m22015r()) {
            ipVar.cdj(bv);
            ipVar.fn3e(this.f34170l);
            ipVar.o1t();
        }
        if (m22016s()) {
            ipVar.cdj(an);
            ipVar.kja0(this.f34150a);
            ipVar.o1t();
        }
        if (this.f34156a != null && m22017t()) {
            ipVar.cdj(id);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f34156a.size()));
            for (Map.Entry<String, String> entry : this.f34156a.entrySet()) {
                ipVar.fn3e(entry.getKey());
                ipVar.fn3e(entry.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public void m21989a(boolean z2) {
        this.f34155a.set(0, z2);
    }

    /* JADX INFO: renamed from: a */
    public x7o m21987a(short s2) {
        this.f34157a = s2;
        m21996c(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21991a(x7o x7oVar) {
        if (x7oVar == null) {
            return false;
        }
        boolean zM21990a = m21990a();
        boolean zM21990a2 = x7oVar.m21990a();
        if ((zM21990a || zM21990a2) && !(zM21990a && zM21990a2 && this.f34154a.equals(x7oVar.f34154a))) {
            return false;
        }
        boolean zM21994b = m21994b();
        boolean zM21994b2 = x7oVar.m21994b();
        if ((zM21994b || zM21994b2) && !(zM21994b && zM21994b2 && this.f34152a.m20627a(x7oVar.f34152a))) {
            return false;
        }
        boolean zM21997c = m21997c();
        boolean zM21997c2 = x7oVar.m21997c();
        if ((zM21997c || zM21997c2) && !(zM21997c && zM21997c2 && this.f34159b.equals(x7oVar.f34159b))) {
            return false;
        }
        boolean zM22000d = m22000d();
        boolean zM22000d2 = x7oVar.m22000d();
        if (((zM22000d || zM22000d2) && !(zM22000d && zM22000d2 && this.f34161c.equals(x7oVar.f34161c))) || this.f34151a != x7oVar.f34151a) {
            return false;
        }
        boolean zM22003f = m22003f();
        boolean zM22003f2 = x7oVar.m22003f();
        if ((zM22003f || zM22003f2) && !(zM22003f && zM22003f2 && this.f34162d.equals(x7oVar.f34162d))) {
            return false;
        }
        boolean zM22004g = m22004g();
        boolean zM22004g2 = x7oVar.m22004g();
        if ((zM22004g || zM22004g2) && !(zM22004g && zM22004g2 && this.f34163e.equals(x7oVar.f34163e))) {
            return false;
        }
        boolean zM22005h = m22005h();
        boolean zM22005h2 = x7oVar.m22005h();
        if ((zM22005h || zM22005h2) && !(zM22005h && zM22005h2 && this.f34153a.m21436a(x7oVar.f34153a))) {
            return false;
        }
        boolean zM22006i = m22006i();
        boolean zM22006i2 = x7oVar.m22006i();
        if ((zM22006i || zM22006i2) && !(zM22006i && zM22006i2 && this.f34164f.equals(x7oVar.f34164f))) {
            return false;
        }
        boolean zM22007j = m22007j();
        boolean zM22007j2 = x7oVar.m22007j();
        if ((zM22007j || zM22007j2) && !(zM22007j && zM22007j2 && this.f34165g.equals(x7oVar.f34165g))) {
            return false;
        }
        boolean zM22008k = m22008k();
        boolean zM22008k2 = x7oVar.m22008k();
        if ((zM22008k || zM22008k2) && !(zM22008k && zM22008k2 && this.f34158a == x7oVar.f34158a)) {
            return false;
        }
        boolean zM22009l = m22009l();
        boolean zM22009l2 = x7oVar.m22009l();
        if ((zM22009l || zM22009l2) && !(zM22009l && zM22009l2 && this.f34166h.equals(x7oVar.f34166h))) {
            return false;
        }
        boolean zM22010m = m22010m();
        boolean zM22010m2 = x7oVar.m22010m();
        if ((zM22010m || zM22010m2) && !(zM22010m && zM22010m2 && this.f34167i.equals(x7oVar.f34167i))) {
            return false;
        }
        boolean zM22011n = m22011n();
        boolean zM22011n2 = x7oVar.m22011n();
        if ((zM22011n || zM22011n2) && !(zM22011n && zM22011n2 && this.f34168j.equals(x7oVar.f34168j))) {
            return false;
        }
        boolean zM22012o = m22012o();
        boolean zM22012o2 = x7oVar.m22012o();
        if ((zM22012o || zM22012o2) && !(zM22012o && zM22012o2 && this.f34157a == x7oVar.f34157a)) {
            return false;
        }
        boolean zM22013p = m22013p();
        boolean zM22013p2 = x7oVar.m22013p();
        if ((zM22013p || zM22013p2) && !(zM22013p && zM22013p2 && this.f34160b == x7oVar.f34160b)) {
            return false;
        }
        boolean zM22014q = m22014q();
        boolean zM22014q2 = x7oVar.m22014q();
        if ((zM22014q || zM22014q2) && !(zM22014q && zM22014q2 && this.f34169k.equals(x7oVar.f34169k))) {
            return false;
        }
        boolean zM22015r = m22015r();
        boolean zM22015r2 = x7oVar.m22015r();
        if ((zM22015r || zM22015r2) && !(zM22015r && zM22015r2 && this.f34170l.equals(x7oVar.f34170l))) {
            return false;
        }
        boolean zM22016s = m22016s();
        boolean zM22016s2 = x7oVar.m22016s();
        if ((zM22016s || zM22016s2) && !(zM22016s && zM22016s2 && this.f34150a == x7oVar.f34150a)) {
            return false;
        }
        boolean zM22017t = m22017t();
        boolean zM22017t2 = x7oVar.m22017t();
        if (zM22017t || zM22017t2) {
            return zM22017t && zM22017t2 && this.f34156a.equals(x7oVar.f34156a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(x7o x7oVar) {
        int iM21915y;
        int qVar;
        int iM21911n;
        int iM21911n2;
        int iM21912p;
        int iM21912p2;
        int iM21911n3;
        int iM21911n4;
        int iM21911n5;
        int iLd6;
        int iM21911n6;
        int iM21911n7;
        int iM21913q;
        int iM21911n8;
        int iM21911n9;
        int iZy;
        int iM21911n10;
        int iM21911n11;
        int iM21913q2;
        int iM21911n12;
        if (!getClass().equals(x7oVar.getClass())) {
            return getClass().getName().compareTo(x7oVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21990a()).compareTo(Boolean.valueOf(x7oVar.m21990a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21990a() && (iM21911n12 = vh.m21911n(this.f34154a, x7oVar.f34154a)) != 0) {
            return iM21911n12;
        }
        int iCompareTo2 = Boolean.valueOf(m21994b()).compareTo(Boolean.valueOf(x7oVar.m21994b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21994b() && (iM21913q2 = vh.m21913q(this.f34152a, x7oVar.f34152a)) != 0) {
            return iM21913q2;
        }
        int iCompareTo3 = Boolean.valueOf(m21997c()).compareTo(Boolean.valueOf(x7oVar.m21997c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21997c() && (iM21911n11 = vh.m21911n(this.f34159b, x7oVar.f34159b)) != 0) {
            return iM21911n11;
        }
        int iCompareTo4 = Boolean.valueOf(m22000d()).compareTo(Boolean.valueOf(x7oVar.m22000d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m22000d() && (iM21911n10 = vh.m21911n(this.f34161c, x7oVar.f34161c)) != 0) {
            return iM21911n10;
        }
        int iCompareTo5 = Boolean.valueOf(m22002e()).compareTo(Boolean.valueOf(x7oVar.m22002e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m22002e() && (iZy = vh.zy(this.f34151a, x7oVar.f34151a)) != 0) {
            return iZy;
        }
        int iCompareTo6 = Boolean.valueOf(m22003f()).compareTo(Boolean.valueOf(x7oVar.m22003f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m22003f() && (iM21911n9 = vh.m21911n(this.f34162d, x7oVar.f34162d)) != 0) {
            return iM21911n9;
        }
        int iCompareTo7 = Boolean.valueOf(m22004g()).compareTo(Boolean.valueOf(x7oVar.m22004g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m22004g() && (iM21911n8 = vh.m21911n(this.f34163e, x7oVar.f34163e)) != 0) {
            return iM21911n8;
        }
        int iCompareTo8 = Boolean.valueOf(m22005h()).compareTo(Boolean.valueOf(x7oVar.m22005h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m22005h() && (iM21913q = vh.m21913q(this.f34153a, x7oVar.f34153a)) != 0) {
            return iM21913q;
        }
        int iCompareTo9 = Boolean.valueOf(m22006i()).compareTo(Boolean.valueOf(x7oVar.m22006i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m22006i() && (iM21911n7 = vh.m21911n(this.f34164f, x7oVar.f34164f)) != 0) {
            return iM21911n7;
        }
        int iCompareTo10 = Boolean.valueOf(m22007j()).compareTo(Boolean.valueOf(x7oVar.m22007j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m22007j() && (iM21911n6 = vh.m21911n(this.f34165g, x7oVar.f34165g)) != 0) {
            return iM21911n6;
        }
        int iCompareTo11 = Boolean.valueOf(m22008k()).compareTo(Boolean.valueOf(x7oVar.m22008k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m22008k() && (iLd6 = vh.ld6(this.f34158a, x7oVar.f34158a)) != 0) {
            return iLd6;
        }
        int iCompareTo12 = Boolean.valueOf(m22009l()).compareTo(Boolean.valueOf(x7oVar.m22009l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m22009l() && (iM21911n5 = vh.m21911n(this.f34166h, x7oVar.f34166h)) != 0) {
            return iM21911n5;
        }
        int iCompareTo13 = Boolean.valueOf(m22010m()).compareTo(Boolean.valueOf(x7oVar.m22010m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m22010m() && (iM21911n4 = vh.m21911n(this.f34167i, x7oVar.f34167i)) != 0) {
            return iM21911n4;
        }
        int iCompareTo14 = Boolean.valueOf(m22011n()).compareTo(Boolean.valueOf(x7oVar.m22011n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m22011n() && (iM21911n3 = vh.m21911n(this.f34168j, x7oVar.f34168j)) != 0) {
            return iM21911n3;
        }
        int iCompareTo15 = Boolean.valueOf(m22012o()).compareTo(Boolean.valueOf(x7oVar.m22012o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m22012o() && (iM21912p2 = vh.m21912p(this.f34157a, x7oVar.f34157a)) != 0) {
            return iM21912p2;
        }
        int iCompareTo16 = Boolean.valueOf(m22013p()).compareTo(Boolean.valueOf(x7oVar.m22013p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m22013p() && (iM21912p = vh.m21912p(this.f34160b, x7oVar.f34160b)) != 0) {
            return iM21912p;
        }
        int iCompareTo17 = Boolean.valueOf(m22014q()).compareTo(Boolean.valueOf(x7oVar.m22014q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m22014q() && (iM21911n2 = vh.m21911n(this.f34169k, x7oVar.f34169k)) != 0) {
            return iM21911n2;
        }
        int iCompareTo18 = Boolean.valueOf(m22015r()).compareTo(Boolean.valueOf(x7oVar.m22015r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m22015r() && (iM21911n = vh.m21911n(this.f34170l, x7oVar.f34170l)) != 0) {
            return iM21911n;
        }
        int iCompareTo19 = Boolean.valueOf(m22016s()).compareTo(Boolean.valueOf(x7oVar.m22016s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m22016s() && (qVar = vh.toq(this.f34150a, x7oVar.f34150a)) != 0) {
            return qVar;
        }
        int iCompareTo20 = Boolean.valueOf(m22017t()).compareTo(Boolean.valueOf(x7oVar.m22017t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!m22017t() || (iM21915y = vh.m21915y(this.f34156a, x7oVar.f34156a)) == 0) {
            return 0;
        }
        return iM21915y;
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
                if (m22002e()) {
                    m21988a();
                    return;
                }
                throw new dbf("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f34154a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f34152a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f34159b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f34161c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f34151a = ipVar.mo20996q();
                        m21989a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f34162d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f34163e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 12) {
                        rf rfVar = new rf();
                        this.f34153a = rfVar;
                        rfVar.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f34164f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f34165g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f34158a = ipVar.mo21000z();
                        m21993b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f34166h = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f34167i = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 14:
                    if (b2 == 11) {
                        this.f34168j = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 15:
                    if (b2 == 6) {
                        this.f34157a = ipVar.x2();
                        m21996c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 16:
                    if (b2 == 6) {
                        this.f34160b = ipVar.x2();
                        m21999d(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 17:
                case 18:
                case 19:
                default:
                    koj.m21140k(ipVar, b2);
                    break;
                case 20:
                    if (b2 == 11) {
                        this.f34169k = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 21:
                    if (b2 == 11) {
                        this.f34170l = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 22:
                    if (b2 == 8) {
                        this.f34150a = ipVar.zy();
                        m22001e(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 23:
                    if (b2 == 13) {
                        ap23 ap23VarF7l8 = ipVar.f7l8();
                        this.f34156a = new HashMap(ap23VarF7l8.f73265zy * 2);
                        for (int i2 = 0; i2 < ap23VarF7l8.f73265zy; i2++) {
                            this.f34156a.put(ipVar.mo20995p(), ipVar.mo20995p());
                        }
                        ipVar.fti();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21988a() throws dbf {
        if (this.f34159b != null) {
            if (this.f34161c != null) {
                return;
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
