package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class kl7m implements oaex<kl7m, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f33162a;

    /* JADX INFO: renamed from: a */
    public String f33163a;

    /* JADX INFO: renamed from: a */
    private BitSet f33164a = new BitSet(3);

    /* JADX INFO: renamed from: a */
    public Map<String, String> f33165a;

    /* JADX INFO: renamed from: a */
    public boolean f33166a;

    /* JADX INFO: renamed from: b */
    public long f33167b;

    /* JADX INFO: renamed from: b */
    public String f33168b;

    /* JADX INFO: renamed from: c */
    public String f33169c;

    /* JADX INFO: renamed from: d */
    public String f33170d;

    /* JADX INFO: renamed from: e */
    public String f33171e;

    /* JADX INFO: renamed from: f */
    public String f33172f;

    /* JADX INFO: renamed from: g */
    public String f33173g;

    /* JADX INFO: renamed from: k */
    private static final s31 f33152k = new s31("ClientUploadDataItem");

    /* JADX INFO: renamed from: q */
    private static final vc f33156q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33154n = new vc("", com.google.common.base.zy.f68132qrj, 2);

    /* JADX INFO: renamed from: y */
    private static final vc f33160y = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: s */
    private static final vc f33158s = new vc("", (byte) 10, 4);

    /* JADX INFO: renamed from: p */
    private static final vc f33155p = new vc("", (byte) 10, 5);

    /* JADX INFO: renamed from: h */
    private static final vc f33150h = new vc("", (byte) 2, 6);

    /* JADX INFO: renamed from: i */
    private static final vc f33151i = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: z */
    private static final vc f33161z = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: t */
    private static final vc f33159t = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: r */
    private static final vc f33157r = new vc("", com.google.common.base.zy.f68124kja0, 10);

    /* JADX INFO: renamed from: l */
    private static final vc f33153l = new vc("", com.google.common.base.zy.f68132qrj, 11);

    /* JADX INFO: renamed from: a */
    public String m21110a() {
        return this.f33163a;
    }

    /* JADX INFO: renamed from: a */
    public void m21112a() {
    }

    /* JADX INFO: renamed from: b */
    public kl7m m21118b(String str) {
        this.f33168b = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public kl7m m21122c(String str) {
        this.f33169c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21128d() {
        return this.f33164a.get(0);
    }

    /* JADX INFO: renamed from: e */
    public boolean m21131e() {
        return this.f33164a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof kl7m)) {
            return m21116a((kl7m) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21133f() {
        return this.f33164a.get(2);
    }

    /* JADX INFO: renamed from: g */
    public boolean m21135g() {
        return this.f33170d != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21136h() {
        return this.f33171e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21137i() {
        return this.f33172f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m21138j() {
        return this.f33165a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m21139k() {
        return this.f33173g != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z3 = false;
        if (m21115a()) {
            sb.append("channel:");
            String str = this.f33163a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m21121b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f33168b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z2 = false;
        }
        if (m21125c()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f33169c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z2 = false;
        }
        if (m21128d()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f33162a);
            z2 = false;
        }
        if (m21131e()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f33167b);
            z2 = false;
        }
        if (m21133f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f33166a);
            z2 = false;
        }
        if (m21135g()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f33170d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z2 = false;
        }
        if (m21136h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f33171e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z2 = false;
        }
        if (m21137i()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f33172f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z2 = false;
        }
        if (m21138j()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f33165a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        } else {
            z3 = z2;
        }
        if (m21139k()) {
            if (!z3) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f33173g;
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
    public kl7m m21107a(String str) {
        this.f33163a = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21121b() {
        return this.f33168b != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21125c() {
        return this.f33169c != null;
    }

    /* JADX INFO: renamed from: d */
    public kl7m m21126d(String str) {
        this.f33170d = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public kl7m m21129e(String str) {
        this.f33171e = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public kl7m m21132f(String str) {
        this.f33172f = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public kl7m m21134g(String str) {
        this.f33173g = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21115a() {
        return this.f33163a != null;
    }

    /* JADX INFO: renamed from: b */
    public String m21119b() {
        return this.f33169c;
    }

    /* JADX INFO: renamed from: c */
    public void m21124c(boolean z2) {
        this.f33164a.set(2, z2);
    }

    /* JADX INFO: renamed from: d */
    public String m21127d() {
        return this.f33172f;
    }

    /* JADX INFO: renamed from: e */
    public String m21130e() {
        return this.f33173g;
    }

    /* JADX INFO: renamed from: a */
    public kl7m m21106a(long j2) {
        this.f33162a = j2;
        m21114a(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public kl7m m21117b(long j2) {
        this.f33167b = j2;
        m21120b(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m21123c() {
        return this.f33171e;
    }

    /* JADX INFO: renamed from: a */
    public void m21114a(boolean z2) {
        this.f33164a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public void m21120b(boolean z2) {
        this.f33164a.set(1, z2);
    }

    /* JADX INFO: renamed from: a */
    public long m21105a() {
        return this.f33167b;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) {
        m21112a();
        ipVar.mo20992i(f33152k);
        if (this.f33163a != null && m21115a()) {
            ipVar.cdj(f33156q);
            ipVar.fn3e(this.f33163a);
            ipVar.o1t();
        }
        if (this.f33168b != null && m21121b()) {
            ipVar.cdj(f33154n);
            ipVar.fn3e(this.f33168b);
            ipVar.o1t();
        }
        if (this.f33169c != null && m21125c()) {
            ipVar.cdj(f33160y);
            ipVar.fn3e(this.f33169c);
            ipVar.o1t();
        }
        if (m21128d()) {
            ipVar.cdj(f33158s);
            ipVar.mo20991h(this.f33162a);
            ipVar.o1t();
        }
        if (m21131e()) {
            ipVar.cdj(f33155p);
            ipVar.mo20991h(this.f33167b);
            ipVar.o1t();
        }
        if (m21133f()) {
            ipVar.cdj(f33150h);
            ipVar.fu4(this.f33166a);
            ipVar.o1t();
        }
        if (this.f33170d != null && m21135g()) {
            ipVar.cdj(f33151i);
            ipVar.fn3e(this.f33170d);
            ipVar.o1t();
        }
        if (this.f33171e != null && m21136h()) {
            ipVar.cdj(f33161z);
            ipVar.fn3e(this.f33171e);
            ipVar.o1t();
        }
        if (this.f33172f != null && m21137i()) {
            ipVar.cdj(f33159t);
            ipVar.fn3e(this.f33172f);
            ipVar.o1t();
        }
        if (this.f33165a != null && m21138j()) {
            ipVar.cdj(f33157r);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f33165a.size()));
            for (Map.Entry<String, String> entry : this.f33165a.entrySet()) {
                ipVar.fn3e(entry.getKey());
                ipVar.fn3e(entry.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        if (this.f33173g != null && m21139k()) {
            ipVar.cdj(f33153l);
            ipVar.fn3e(this.f33173g);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public kl7m m21109a(boolean z2) {
        this.f33166a = z2;
        m21124c(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m21113a(String str, String str2) {
        if (this.f33165a == null) {
            this.f33165a = new HashMap();
        }
        this.f33165a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m21111a() {
        return this.f33165a;
    }

    /* JADX INFO: renamed from: a */
    public kl7m m21108a(Map<String, String> map) {
        this.f33165a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21116a(kl7m kl7mVar) {
        if (kl7mVar == null) {
            return false;
        }
        boolean zM21115a = m21115a();
        boolean zM21115a2 = kl7mVar.m21115a();
        if ((zM21115a || zM21115a2) && !(zM21115a && zM21115a2 && this.f33163a.equals(kl7mVar.f33163a))) {
            return false;
        }
        boolean zM21121b = m21121b();
        boolean zM21121b2 = kl7mVar.m21121b();
        if ((zM21121b || zM21121b2) && !(zM21121b && zM21121b2 && this.f33168b.equals(kl7mVar.f33168b))) {
            return false;
        }
        boolean zM21125c = m21125c();
        boolean zM21125c2 = kl7mVar.m21125c();
        if ((zM21125c || zM21125c2) && !(zM21125c && zM21125c2 && this.f33169c.equals(kl7mVar.f33169c))) {
            return false;
        }
        boolean zM21128d = m21128d();
        boolean zM21128d2 = kl7mVar.m21128d();
        if ((zM21128d || zM21128d2) && !(zM21128d && zM21128d2 && this.f33162a == kl7mVar.f33162a)) {
            return false;
        }
        boolean zM21131e = m21131e();
        boolean zM21131e2 = kl7mVar.m21131e();
        if ((zM21131e || zM21131e2) && !(zM21131e && zM21131e2 && this.f33167b == kl7mVar.f33167b)) {
            return false;
        }
        boolean zM21133f = m21133f();
        boolean zM21133f2 = kl7mVar.m21133f();
        if ((zM21133f || zM21133f2) && !(zM21133f && zM21133f2 && this.f33166a == kl7mVar.f33166a)) {
            return false;
        }
        boolean zM21135g = m21135g();
        boolean zM21135g2 = kl7mVar.m21135g();
        if ((zM21135g || zM21135g2) && !(zM21135g && zM21135g2 && this.f33170d.equals(kl7mVar.f33170d))) {
            return false;
        }
        boolean zM21136h = m21136h();
        boolean zM21136h2 = kl7mVar.m21136h();
        if ((zM21136h || zM21136h2) && !(zM21136h && zM21136h2 && this.f33171e.equals(kl7mVar.f33171e))) {
            return false;
        }
        boolean zM21137i = m21137i();
        boolean zM21137i2 = kl7mVar.m21137i();
        if ((zM21137i || zM21137i2) && !(zM21137i && zM21137i2 && this.f33172f.equals(kl7mVar.f33172f))) {
            return false;
        }
        boolean zM21138j = m21138j();
        boolean zM21138j2 = kl7mVar.m21138j();
        if ((zM21138j || zM21138j2) && !(zM21138j && zM21138j2 && this.f33165a.equals(kl7mVar.f33165a))) {
            return false;
        }
        boolean zM21139k = m21139k();
        boolean zM21139k2 = kl7mVar.m21139k();
        if (zM21139k || zM21139k2) {
            return zM21139k && zM21139k2 && this.f33173g.equals(kl7mVar.f33173g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(kl7m kl7mVar) {
        int iM21911n;
        int iM21915y;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iLd6;
        int iZy;
        int iZy2;
        int iM21911n5;
        int iM21911n6;
        int iM21911n7;
        if (!getClass().equals(kl7mVar.getClass())) {
            return getClass().getName().compareTo(kl7mVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21115a()).compareTo(Boolean.valueOf(kl7mVar.m21115a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21115a() && (iM21911n7 = vh.m21911n(this.f33163a, kl7mVar.f33163a)) != 0) {
            return iM21911n7;
        }
        int iCompareTo2 = Boolean.valueOf(m21121b()).compareTo(Boolean.valueOf(kl7mVar.m21121b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21121b() && (iM21911n6 = vh.m21911n(this.f33168b, kl7mVar.f33168b)) != 0) {
            return iM21911n6;
        }
        int iCompareTo3 = Boolean.valueOf(m21125c()).compareTo(Boolean.valueOf(kl7mVar.m21125c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21125c() && (iM21911n5 = vh.m21911n(this.f33169c, kl7mVar.f33169c)) != 0) {
            return iM21911n5;
        }
        int iCompareTo4 = Boolean.valueOf(m21128d()).compareTo(Boolean.valueOf(kl7mVar.m21128d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21128d() && (iZy2 = vh.zy(this.f33162a, kl7mVar.f33162a)) != 0) {
            return iZy2;
        }
        int iCompareTo5 = Boolean.valueOf(m21131e()).compareTo(Boolean.valueOf(kl7mVar.m21131e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21131e() && (iZy = vh.zy(this.f33167b, kl7mVar.f33167b)) != 0) {
            return iZy;
        }
        int iCompareTo6 = Boolean.valueOf(m21133f()).compareTo(Boolean.valueOf(kl7mVar.m21133f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21133f() && (iLd6 = vh.ld6(this.f33166a, kl7mVar.f33166a)) != 0) {
            return iLd6;
        }
        int iCompareTo7 = Boolean.valueOf(m21135g()).compareTo(Boolean.valueOf(kl7mVar.m21135g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21135g() && (iM21911n4 = vh.m21911n(this.f33170d, kl7mVar.f33170d)) != 0) {
            return iM21911n4;
        }
        int iCompareTo8 = Boolean.valueOf(m21136h()).compareTo(Boolean.valueOf(kl7mVar.m21136h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m21136h() && (iM21911n3 = vh.m21911n(this.f33171e, kl7mVar.f33171e)) != 0) {
            return iM21911n3;
        }
        int iCompareTo9 = Boolean.valueOf(m21137i()).compareTo(Boolean.valueOf(kl7mVar.m21137i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m21137i() && (iM21911n2 = vh.m21911n(this.f33172f, kl7mVar.f33172f)) != 0) {
            return iM21911n2;
        }
        int iCompareTo10 = Boolean.valueOf(m21138j()).compareTo(Boolean.valueOf(kl7mVar.m21138j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m21138j() && (iM21915y = vh.m21915y(this.f33165a, kl7mVar.f33165a)) != 0) {
            return iM21915y;
        }
        int iCompareTo11 = Boolean.valueOf(m21139k()).compareTo(Boolean.valueOf(kl7mVar.m21139k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (!m21139k() || (iM21911n = vh.m21911n(this.f33173g, kl7mVar.f33173g)) == 0) {
            return 0;
        }
        return iM21911n;
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
                m21112a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f33163a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 11) {
                        this.f33168b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f33169c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 10) {
                        this.f33162a = ipVar.mo20996q();
                        m21114a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 10) {
                        this.f33167b = ipVar.mo20996q();
                        m21120b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 2) {
                        this.f33166a = ipVar.mo21000z();
                        m21124c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f33170d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f33171e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f33172f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 13) {
                        ap23 ap23VarF7l8 = ipVar.f7l8();
                        this.f33165a = new HashMap(ap23VarF7l8.f73265zy * 2);
                        for (int i2 = 0; i2 < ap23VarF7l8.f73265zy; i2++) {
                            this.f33165a.put(ipVar.mo20995p(), ipVar.mo20995p());
                        }
                        ipVar.fti();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 11) {
                        this.f33173g = ipVar.mo20995p();
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
