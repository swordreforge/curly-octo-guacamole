package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e4e implements oaex<e4e, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f32822a;

    /* JADX INFO: renamed from: a */
    public long f32823a;

    /* JADX INFO: renamed from: a */
    public b2 f32824a;

    /* JADX INFO: renamed from: a */
    public String f32825a;

    /* JADX INFO: renamed from: a */
    public List<String> f32827a;

    /* JADX INFO: renamed from: b */
    public int f32829b;

    /* JADX INFO: renamed from: b */
    public long f32830b;

    /* JADX INFO: renamed from: b */
    public String f32831b;

    /* JADX INFO: renamed from: c */
    public long f32832c;

    /* JADX INFO: renamed from: c */
    public String f32833c;

    /* JADX INFO: renamed from: d */
    public String f32834d;

    /* JADX INFO: renamed from: e */
    public String f32835e;

    /* JADX INFO: renamed from: f */
    public String f32836f;

    /* JADX INFO: renamed from: g */
    public String f32837g;

    /* JADX INFO: renamed from: h */
    public String f32838h;

    /* JADX INFO: renamed from: i */
    public String f32839i;

    /* JADX INFO: renamed from: j */
    public String f32840j;

    /* JADX INFO: renamed from: k */
    public String f32841k;

    /* JADX INFO: renamed from: l */
    public String f32842l;

    /* JADX INFO: renamed from: q */
    private static final s31 f32812q = new s31("XmPushActionRegistrationResult");

    /* JADX INFO: renamed from: n */
    private static final vc f32809n = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: y */
    private static final vc f32820y = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: s */
    private static final vc f32814s = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: p */
    private static final vc f32811p = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: z */
    private static final vc f32821z = new vc("", (byte) 10, 6);

    /* JADX INFO: renamed from: t */
    private static final vc f32815t = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: r */
    private static final vc f32813r = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: o */
    private static final vc f32810o = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: m */
    private static final vc f32808m = new vc("", com.google.common.base.zy.f68132qrj, 10);

    /* JADX INFO: renamed from: x */
    private static final vc f32819x = new vc("", (byte) 10, 11);

    /* JADX INFO: renamed from: u */
    private static final vc f32816u = new vc("", com.google.common.base.zy.f68132qrj, 12);

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final vc f73315bo = new vc("", com.google.common.base.zy.f68132qrj, 13);

    /* JADX INFO: renamed from: v */
    private static final vc f32817v = new vc("", (byte) 10, 14);

    /* JADX INFO: renamed from: w */
    private static final vc f32818w = new vc("", com.google.common.base.zy.f68132qrj, 15);

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final vc f73314ab = new vc("", (byte) 8, 16);
    private static final vc bb = new vc("", com.google.common.base.zy.f68132qrj, 17);
    private static final vc bp = new vc("", (byte) 8, 18);
    private static final vc bv = new vc("", com.google.common.base.zy.f68132qrj, 19);
    private static final vc an = new vc("", (byte) 2, 20);
    private static final vc id = new vc("", com.google.common.base.zy.f68111cdj, 21);

    /* JADX INFO: renamed from: a */
    private BitSet f32826a = new BitSet(6);

    /* JADX INFO: renamed from: a */
    public boolean f32828a = false;

    /* JADX INFO: renamed from: a */
    public boolean m20735a() {
        return this.f32825a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20739b() {
        return this.f32824a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20742c() {
        return this.f32831b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20744d() {
        return this.f32833c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20746e() {
        return this.f32826a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof e4e)) {
            return m20736a((e4e) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20748f() {
        return this.f32834d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m20749g() {
        return this.f32835e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m20750h() {
        return this.f32836f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m20751i() {
        return this.f32837g != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m20752j() {
        return this.f32826a.get(1);
    }

    /* JADX INFO: renamed from: k */
    public boolean m20753k() {
        return this.f32838h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m20754l() {
        return this.f32839i != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m20755m() {
        return this.f32826a.get(2);
    }

    /* JADX INFO: renamed from: n */
    public boolean m20756n() {
        return this.f32840j != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m20757o() {
        return this.f32826a.get(3);
    }

    /* JADX INFO: renamed from: p */
    public boolean m20758p() {
        return this.f32841k != null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m20759q() {
        return this.f32826a.get(4);
    }

    /* JADX INFO: renamed from: r */
    public boolean m20760r() {
        return this.f32842l != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m20761s() {
        return this.f32826a.get(5);
    }

    /* JADX INFO: renamed from: t */
    public boolean m20762t() {
        return this.f32827a != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z3 = false;
        if (m20735a()) {
            sb.append("debug:");
            String str = this.f32825a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m20739b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f32824a;
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
        String str2 = this.f32831b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.gvn7.toq(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f32833c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f32823a);
        if (m20748f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f32834d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m20749g()) {
            sb.append(", ");
            sb.append("regId:");
            String str5 = this.f32835e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m20751i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f32837g;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m20752j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f32830b);
        }
        if (m20753k()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str7 = this.f32838h;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m20754l()) {
            sb.append(", ");
            sb.append("clientId:");
            String str8 = this.f32839i;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m20755m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f32832c);
        }
        if (m20756n()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str9 = this.f32840j;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m20757o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f32822a);
        }
        if (m20758p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            String str10 = this.f32841k;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m20759q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f32829b);
        }
        if (m20760r()) {
            sb.append(", ");
            sb.append("region:");
            String str11 = this.f32842l;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m20761s()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f32828a);
        }
        if (m20762t()) {
            sb.append(", ");
            sb.append("autoMarkPkgs:");
            List<String> list = this.f32827a;
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
    public String m20731a() {
        return this.f32831b;
    }

    /* JADX INFO: renamed from: b */
    public String m20737b() {
        return this.f32836f;
    }

    /* JADX INFO: renamed from: c */
    public String m20740c() {
        return this.f32837g;
    }

    /* JADX INFO: renamed from: d */
    public void m20743d(boolean z2) {
        this.f32826a.set(3, z2);
    }

    /* JADX INFO: renamed from: e */
    public void m20745e(boolean z2) {
        this.f32826a.set(4, z2);
    }

    /* JADX INFO: renamed from: f */
    public void m20747f(boolean z2) {
        this.f32826a.set(5, z2);
    }

    /* JADX INFO: renamed from: a */
    public long m20730a() {
        return this.f32823a;
    }

    /* JADX INFO: renamed from: b */
    public void m20738b(boolean z2) {
        this.f32826a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m20741c(boolean z2) {
        this.f32826a.set(2, z2);
    }

    /* JADX INFO: renamed from: a */
    public void m20734a(boolean z2) {
        this.f32826a.set(0, z2);
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20733a();
        ipVar.mo20992i(f32812q);
        if (this.f32825a != null && m20735a()) {
            ipVar.cdj(f32809n);
            ipVar.fn3e(this.f32825a);
            ipVar.o1t();
        }
        if (this.f32824a != null && m20739b()) {
            ipVar.cdj(f32820y);
            this.f32824a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f32831b != null) {
            ipVar.cdj(f32814s);
            ipVar.fn3e(this.f32831b);
            ipVar.o1t();
        }
        if (this.f32833c != null) {
            ipVar.cdj(f32811p);
            ipVar.fn3e(this.f32833c);
            ipVar.o1t();
        }
        ipVar.cdj(f32821z);
        ipVar.mo20991h(this.f32823a);
        ipVar.o1t();
        if (this.f32834d != null && m20748f()) {
            ipVar.cdj(f32815t);
            ipVar.fn3e(this.f32834d);
            ipVar.o1t();
        }
        if (this.f32835e != null && m20749g()) {
            ipVar.cdj(f32813r);
            ipVar.fn3e(this.f32835e);
            ipVar.o1t();
        }
        if (this.f32836f != null && m20750h()) {
            ipVar.cdj(f32810o);
            ipVar.fn3e(this.f32836f);
            ipVar.o1t();
        }
        if (this.f32837g != null && m20751i()) {
            ipVar.cdj(f32808m);
            ipVar.fn3e(this.f32837g);
            ipVar.o1t();
        }
        if (m20752j()) {
            ipVar.cdj(f32819x);
            ipVar.mo20991h(this.f32830b);
            ipVar.o1t();
        }
        if (this.f32838h != null && m20753k()) {
            ipVar.cdj(f32816u);
            ipVar.fn3e(this.f32838h);
            ipVar.o1t();
        }
        if (this.f32839i != null && m20754l()) {
            ipVar.cdj(f73315bo);
            ipVar.fn3e(this.f32839i);
            ipVar.o1t();
        }
        if (m20755m()) {
            ipVar.cdj(f32817v);
            ipVar.mo20991h(this.f32832c);
            ipVar.o1t();
        }
        if (this.f32840j != null && m20756n()) {
            ipVar.cdj(f32818w);
            ipVar.fn3e(this.f32840j);
            ipVar.o1t();
        }
        if (m20757o()) {
            ipVar.cdj(f73314ab);
            ipVar.kja0(this.f32822a);
            ipVar.o1t();
        }
        if (this.f32841k != null && m20758p()) {
            ipVar.cdj(bb);
            ipVar.fn3e(this.f32841k);
            ipVar.o1t();
        }
        if (m20759q()) {
            ipVar.cdj(bp);
            ipVar.kja0(this.f32829b);
            ipVar.o1t();
        }
        if (this.f32842l != null && m20760r()) {
            ipVar.cdj(bv);
            ipVar.fn3e(this.f32842l);
            ipVar.o1t();
        }
        if (m20761s()) {
            ipVar.cdj(an);
            ipVar.fu4(this.f32828a);
            ipVar.o1t();
        }
        if (this.f32827a != null && m20762t()) {
            ipVar.cdj(id);
            ipVar.ki(new izu(com.google.common.base.zy.f68132qrj, this.f32827a.size()));
            Iterator<String> it = this.f32827a.iterator();
            while (it.hasNext()) {
                ipVar.fn3e(it.next());
            }
            ipVar.mcp();
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public List<String> m20732a() {
        return this.f32827a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20736a(e4e e4eVar) {
        if (e4eVar == null) {
            return false;
        }
        boolean zM20735a = m20735a();
        boolean zM20735a2 = e4eVar.m20735a();
        if ((zM20735a || zM20735a2) && !(zM20735a && zM20735a2 && this.f32825a.equals(e4eVar.f32825a))) {
            return false;
        }
        boolean zM20739b = m20739b();
        boolean zM20739b2 = e4eVar.m20739b();
        if ((zM20739b || zM20739b2) && !(zM20739b && zM20739b2 && this.f32824a.m20627a(e4eVar.f32824a))) {
            return false;
        }
        boolean zM20742c = m20742c();
        boolean zM20742c2 = e4eVar.m20742c();
        if ((zM20742c || zM20742c2) && !(zM20742c && zM20742c2 && this.f32831b.equals(e4eVar.f32831b))) {
            return false;
        }
        boolean zM20744d = m20744d();
        boolean zM20744d2 = e4eVar.m20744d();
        if (((zM20744d || zM20744d2) && !(zM20744d && zM20744d2 && this.f32833c.equals(e4eVar.f32833c))) || this.f32823a != e4eVar.f32823a) {
            return false;
        }
        boolean zM20748f = m20748f();
        boolean zM20748f2 = e4eVar.m20748f();
        if ((zM20748f || zM20748f2) && !(zM20748f && zM20748f2 && this.f32834d.equals(e4eVar.f32834d))) {
            return false;
        }
        boolean zM20749g = m20749g();
        boolean zM20749g2 = e4eVar.m20749g();
        if ((zM20749g || zM20749g2) && !(zM20749g && zM20749g2 && this.f32835e.equals(e4eVar.f32835e))) {
            return false;
        }
        boolean zM20750h = m20750h();
        boolean zM20750h2 = e4eVar.m20750h();
        if ((zM20750h || zM20750h2) && !(zM20750h && zM20750h2 && this.f32836f.equals(e4eVar.f32836f))) {
            return false;
        }
        boolean zM20751i = m20751i();
        boolean zM20751i2 = e4eVar.m20751i();
        if ((zM20751i || zM20751i2) && !(zM20751i && zM20751i2 && this.f32837g.equals(e4eVar.f32837g))) {
            return false;
        }
        boolean zM20752j = m20752j();
        boolean zM20752j2 = e4eVar.m20752j();
        if ((zM20752j || zM20752j2) && !(zM20752j && zM20752j2 && this.f32830b == e4eVar.f32830b)) {
            return false;
        }
        boolean zM20753k = m20753k();
        boolean zM20753k2 = e4eVar.m20753k();
        if ((zM20753k || zM20753k2) && !(zM20753k && zM20753k2 && this.f32838h.equals(e4eVar.f32838h))) {
            return false;
        }
        boolean zM20754l = m20754l();
        boolean zM20754l2 = e4eVar.m20754l();
        if ((zM20754l || zM20754l2) && !(zM20754l && zM20754l2 && this.f32839i.equals(e4eVar.f32839i))) {
            return false;
        }
        boolean zM20755m = m20755m();
        boolean zM20755m2 = e4eVar.m20755m();
        if ((zM20755m || zM20755m2) && !(zM20755m && zM20755m2 && this.f32832c == e4eVar.f32832c)) {
            return false;
        }
        boolean zM20756n = m20756n();
        boolean zM20756n2 = e4eVar.m20756n();
        if ((zM20756n || zM20756n2) && !(zM20756n && zM20756n2 && this.f32840j.equals(e4eVar.f32840j))) {
            return false;
        }
        boolean zM20757o = m20757o();
        boolean zM20757o2 = e4eVar.m20757o();
        if ((zM20757o || zM20757o2) && !(zM20757o && zM20757o2 && this.f32822a == e4eVar.f32822a)) {
            return false;
        }
        boolean zM20758p = m20758p();
        boolean zM20758p2 = e4eVar.m20758p();
        if ((zM20758p || zM20758p2) && !(zM20758p && zM20758p2 && this.f32841k.equals(e4eVar.f32841k))) {
            return false;
        }
        boolean zM20759q = m20759q();
        boolean zM20759q2 = e4eVar.m20759q();
        if ((zM20759q || zM20759q2) && !(zM20759q && zM20759q2 && this.f32829b == e4eVar.f32829b)) {
            return false;
        }
        boolean zM20760r = m20760r();
        boolean zM20760r2 = e4eVar.m20760r();
        if ((zM20760r || zM20760r2) && !(zM20760r && zM20760r2 && this.f32842l.equals(e4eVar.f32842l))) {
            return false;
        }
        boolean zM20761s = m20761s();
        boolean zM20761s2 = e4eVar.m20761s();
        if ((zM20761s || zM20761s2) && !(zM20761s && zM20761s2 && this.f32828a == e4eVar.f32828a)) {
            return false;
        }
        boolean zM20762t = m20762t();
        boolean zM20762t2 = e4eVar.m20762t();
        if (zM20762t || zM20762t2) {
            return zM20762t && zM20762t2 && this.f32827a.equals(e4eVar.f32827a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e4e e4eVar) {
        int iF7l8;
        int iLd6;
        int iM21911n;
        int qVar;
        int iM21911n2;
        int qVar2;
        int iM21911n3;
        int iZy;
        int iM21911n4;
        int iM21911n5;
        int iZy2;
        int iM21911n6;
        int iM21911n7;
        int iM21911n8;
        int iM21911n9;
        int iZy3;
        int iM21911n10;
        int iM21911n11;
        int iM21913q;
        int iM21911n12;
        if (!getClass().equals(e4eVar.getClass())) {
            return getClass().getName().compareTo(e4eVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20735a()).compareTo(Boolean.valueOf(e4eVar.m20735a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20735a() && (iM21911n12 = vh.m21911n(this.f32825a, e4eVar.f32825a)) != 0) {
            return iM21911n12;
        }
        int iCompareTo2 = Boolean.valueOf(m20739b()).compareTo(Boolean.valueOf(e4eVar.m20739b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20739b() && (iM21913q = vh.m21913q(this.f32824a, e4eVar.f32824a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m20742c()).compareTo(Boolean.valueOf(e4eVar.m20742c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m20742c() && (iM21911n11 = vh.m21911n(this.f32831b, e4eVar.f32831b)) != 0) {
            return iM21911n11;
        }
        int iCompareTo4 = Boolean.valueOf(m20744d()).compareTo(Boolean.valueOf(e4eVar.m20744d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m20744d() && (iM21911n10 = vh.m21911n(this.f32833c, e4eVar.f32833c)) != 0) {
            return iM21911n10;
        }
        int iCompareTo5 = Boolean.valueOf(m20746e()).compareTo(Boolean.valueOf(e4eVar.m20746e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m20746e() && (iZy3 = vh.zy(this.f32823a, e4eVar.f32823a)) != 0) {
            return iZy3;
        }
        int iCompareTo6 = Boolean.valueOf(m20748f()).compareTo(Boolean.valueOf(e4eVar.m20748f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m20748f() && (iM21911n9 = vh.m21911n(this.f32834d, e4eVar.f32834d)) != 0) {
            return iM21911n9;
        }
        int iCompareTo7 = Boolean.valueOf(m20749g()).compareTo(Boolean.valueOf(e4eVar.m20749g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m20749g() && (iM21911n8 = vh.m21911n(this.f32835e, e4eVar.f32835e)) != 0) {
            return iM21911n8;
        }
        int iCompareTo8 = Boolean.valueOf(m20750h()).compareTo(Boolean.valueOf(e4eVar.m20750h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m20750h() && (iM21911n7 = vh.m21911n(this.f32836f, e4eVar.f32836f)) != 0) {
            return iM21911n7;
        }
        int iCompareTo9 = Boolean.valueOf(m20751i()).compareTo(Boolean.valueOf(e4eVar.m20751i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m20751i() && (iM21911n6 = vh.m21911n(this.f32837g, e4eVar.f32837g)) != 0) {
            return iM21911n6;
        }
        int iCompareTo10 = Boolean.valueOf(m20752j()).compareTo(Boolean.valueOf(e4eVar.m20752j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m20752j() && (iZy2 = vh.zy(this.f32830b, e4eVar.f32830b)) != 0) {
            return iZy2;
        }
        int iCompareTo11 = Boolean.valueOf(m20753k()).compareTo(Boolean.valueOf(e4eVar.m20753k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m20753k() && (iM21911n5 = vh.m21911n(this.f32838h, e4eVar.f32838h)) != 0) {
            return iM21911n5;
        }
        int iCompareTo12 = Boolean.valueOf(m20754l()).compareTo(Boolean.valueOf(e4eVar.m20754l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m20754l() && (iM21911n4 = vh.m21911n(this.f32839i, e4eVar.f32839i)) != 0) {
            return iM21911n4;
        }
        int iCompareTo13 = Boolean.valueOf(m20755m()).compareTo(Boolean.valueOf(e4eVar.m20755m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m20755m() && (iZy = vh.zy(this.f32832c, e4eVar.f32832c)) != 0) {
            return iZy;
        }
        int iCompareTo14 = Boolean.valueOf(m20756n()).compareTo(Boolean.valueOf(e4eVar.m20756n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m20756n() && (iM21911n3 = vh.m21911n(this.f32840j, e4eVar.f32840j)) != 0) {
            return iM21911n3;
        }
        int iCompareTo15 = Boolean.valueOf(m20757o()).compareTo(Boolean.valueOf(e4eVar.m20757o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m20757o() && (qVar2 = vh.toq(this.f32822a, e4eVar.f32822a)) != 0) {
            return qVar2;
        }
        int iCompareTo16 = Boolean.valueOf(m20758p()).compareTo(Boolean.valueOf(e4eVar.m20758p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m20758p() && (iM21911n2 = vh.m21911n(this.f32841k, e4eVar.f32841k)) != 0) {
            return iM21911n2;
        }
        int iCompareTo17 = Boolean.valueOf(m20759q()).compareTo(Boolean.valueOf(e4eVar.m20759q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m20759q() && (qVar = vh.toq(this.f32829b, e4eVar.f32829b)) != 0) {
            return qVar;
        }
        int iCompareTo18 = Boolean.valueOf(m20760r()).compareTo(Boolean.valueOf(e4eVar.m20760r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m20760r() && (iM21911n = vh.m21911n(this.f32842l, e4eVar.f32842l)) != 0) {
            return iM21911n;
        }
        int iCompareTo19 = Boolean.valueOf(m20761s()).compareTo(Boolean.valueOf(e4eVar.m20761s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m20761s() && (iLd6 = vh.ld6(this.f32828a, e4eVar.f32828a)) != 0) {
            return iLd6;
        }
        int iCompareTo20 = Boolean.valueOf(m20762t()).compareTo(Boolean.valueOf(e4eVar.m20762t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!m20762t() || (iF7l8 = vh.f7l8(this.f32827a, e4eVar.f32827a)) == 0) {
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
                if (m20746e()) {
                    m20733a();
                    return;
                }
                throw new dbf("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f32825a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f32824a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f32831b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f32833c = ipVar.mo20995p();
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
                        this.f32823a = ipVar.mo20996q();
                        m20734a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f32834d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f32835e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f32836f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f32837g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 10) {
                        this.f32830b = ipVar.mo20996q();
                        m20738b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f32838h = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f32839i = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 14:
                    if (b2 == 10) {
                        this.f32832c = ipVar.mo20996q();
                        m20741c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 15:
                    if (b2 == 11) {
                        this.f32840j = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 16:
                    if (b2 == 8) {
                        this.f32822a = ipVar.zy();
                        m20743d(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 17:
                    if (b2 == 11) {
                        this.f32841k = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 18:
                    if (b2 == 8) {
                        this.f32829b = ipVar.zy();
                        m20745e(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 19:
                    if (b2 == 11) {
                        this.f32842l = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 20:
                    if (b2 == 2) {
                        this.f32828a = ipVar.mo21000z();
                        m20747f(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 21:
                    if (b2 == 15) {
                        izu izuVarMo20990g = ipVar.mo20990g();
                        this.f32827a = new ArrayList(izuVarMo20990g.f73378toq);
                        for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                            this.f32827a.add(ipVar.mo20995p());
                        }
                        ipVar.jp0y();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20733a() throws dbf {
        if (this.f32831b != null) {
            if (this.f32833c != null) {
                return;
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
