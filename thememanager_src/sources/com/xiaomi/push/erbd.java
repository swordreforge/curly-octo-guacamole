package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class erbd implements oaex<erbd, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f32861a;

    /* JADX INFO: renamed from: a */
    public b2 f32862a;

    /* JADX INFO: renamed from: a */
    public String f32863a;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f32864a;

    /* JADX INFO: renamed from: a */
    private BitSet f32865a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f32866a;

    /* JADX INFO: renamed from: a */
    public boolean f32867a;

    /* JADX INFO: renamed from: b */
    public String f32868b;

    /* JADX INFO: renamed from: b */
    public boolean f32869b;

    /* JADX INFO: renamed from: c */
    public String f32870c;

    /* JADX INFO: renamed from: d */
    public String f32871d;

    /* JADX INFO: renamed from: e */
    public String f32872e;

    /* JADX INFO: renamed from: f */
    public String f32873f;

    /* JADX INFO: renamed from: g */
    public String f32874g;

    /* JADX INFO: renamed from: h */
    public String f32875h;

    /* JADX INFO: renamed from: i */
    public String f32876i;

    /* JADX INFO: renamed from: k */
    private static final s31 f32847k = new s31("XmPushActionNotification");

    /* JADX INFO: renamed from: q */
    private static final vc f32853q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32850n = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: y */
    private static final vc f32859y = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: s */
    private static final vc f32855s = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: p */
    private static final vc f32852p = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: z */
    private static final vc f32860z = new vc("", (byte) 2, 6);

    /* JADX INFO: renamed from: t */
    private static final vc f32856t = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: r */
    private static final vc f32854r = new vc("", com.google.common.base.zy.f68124kja0, 8);

    /* JADX INFO: renamed from: l */
    private static final vc f32848l = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: j */
    private static final vc f32846j = new vc("", com.google.common.base.zy.f68132qrj, 10);

    /* JADX INFO: renamed from: o */
    private static final vc f32851o = new vc("", com.google.common.base.zy.f68132qrj, 12);

    /* JADX INFO: renamed from: m */
    private static final vc f32849m = new vc("", com.google.common.base.zy.f68132qrj, 13);

    /* JADX INFO: renamed from: x */
    private static final vc f32858x = new vc("", com.google.common.base.zy.f68132qrj, 14);

    /* JADX INFO: renamed from: u */
    private static final vc f32857u = new vc("", (byte) 10, 15);

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final vc f73319bo = new vc("", (byte) 2, 20);

    public erbd() {
        this.f32865a = new BitSet(3);
        this.f32867a = true;
        this.f32869b = false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20792a() {
        return this.f32863a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20798b() {
        return this.f32862a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20802c() {
        return this.f32868b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20805d() {
        return this.f32870c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20806e() {
        return this.f32871d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof erbd)) {
            return m20793a((erbd) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20807f() {
        return this.f32865a.get(0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m20808g() {
        return this.f32872e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m20809h() {
        return this.f32866a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m20810i() {
        return this.f32873f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m20811j() {
        return this.f32874g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m20812k() {
        return this.f32875h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m20813l() {
        return this.f32876i != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m20814m() {
        return this.f32864a != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m20815n() {
        return this.f32865a.get(1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m20816o() {
        return this.f32865a.get(2);
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z3 = false;
        if (m20792a()) {
            sb.append("debug:");
            String str = this.f32863a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m20798b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            b2 b2Var = this.f32862a;
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
        String str2 = this.f32868b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m20805d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f32870c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m20806e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f32871d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f32867a);
        if (m20808g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f32872e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m20809h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f32866a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m20810i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f32873f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m20811j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f32874g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m20812k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f32875h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m20813l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f32876i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m20814m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f32864a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                vh.kja0(byteBuffer, sb);
            }
        }
        if (m20815n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f32861a);
        }
        if (m20816o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f32869b);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public b2 m20781a() {
        return this.f32862a;
    }

    /* JADX INFO: renamed from: b */
    public String m20796b() {
        return this.f32870c;
    }

    /* JADX INFO: renamed from: c */
    public String m20800c() {
        return this.f32871d;
    }

    /* JADX INFO: renamed from: d */
    public String m20804d() {
        return this.f32873f;
    }

    /* JADX INFO: renamed from: a */
    public String m20787a() {
        return this.f32868b;
    }

    /* JADX INFO: renamed from: b */
    public erbd m20795b(String str) {
        this.f32870c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public erbd m20799c(String str) {
        this.f32871d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public erbd m20803d(String str) {
        this.f32873f = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public erbd m20782a(String str) {
        this.f32868b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m20797b(boolean z2) {
        this.f32865a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m20801c(boolean z2) {
        this.f32865a.set(2, z2);
    }

    public erbd(String str, boolean z2) {
        this();
        this.f32868b = str;
        this.f32867a = z2;
        m20791a(true);
    }

    /* JADX INFO: renamed from: a */
    public erbd m20785a(boolean z2) {
        this.f32867a = z2;
        m20791a(true);
        return this;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20789a();
        ipVar.mo20992i(f32847k);
        if (this.f32863a != null && m20792a()) {
            ipVar.cdj(f32853q);
            ipVar.fn3e(this.f32863a);
            ipVar.o1t();
        }
        if (this.f32862a != null && m20798b()) {
            ipVar.cdj(f32850n);
            this.f32862a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f32868b != null) {
            ipVar.cdj(f32859y);
            ipVar.fn3e(this.f32868b);
            ipVar.o1t();
        }
        if (this.f32870c != null && m20805d()) {
            ipVar.cdj(f32855s);
            ipVar.fn3e(this.f32870c);
            ipVar.o1t();
        }
        if (this.f32871d != null && m20806e()) {
            ipVar.cdj(f32852p);
            ipVar.fn3e(this.f32871d);
            ipVar.o1t();
        }
        ipVar.cdj(f32860z);
        ipVar.fu4(this.f32867a);
        ipVar.o1t();
        if (this.f32872e != null && m20808g()) {
            ipVar.cdj(f32856t);
            ipVar.fn3e(this.f32872e);
            ipVar.o1t();
        }
        if (this.f32866a != null && m20809h()) {
            ipVar.cdj(f32854r);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f32866a.size()));
            for (Map.Entry<String, String> entry : this.f32866a.entrySet()) {
                ipVar.fn3e(entry.getKey());
                ipVar.fn3e(entry.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        if (this.f32873f != null && m20810i()) {
            ipVar.cdj(f32848l);
            ipVar.fn3e(this.f32873f);
            ipVar.o1t();
        }
        if (this.f32874g != null && m20811j()) {
            ipVar.cdj(f32846j);
            ipVar.fn3e(this.f32874g);
            ipVar.o1t();
        }
        if (this.f32875h != null && m20812k()) {
            ipVar.cdj(f32851o);
            ipVar.fn3e(this.f32875h);
            ipVar.o1t();
        }
        if (this.f32876i != null && m20813l()) {
            ipVar.cdj(f32849m);
            ipVar.fn3e(this.f32876i);
            ipVar.o1t();
        }
        if (this.f32864a != null && m20814m()) {
            ipVar.cdj(f32858x);
            ipVar.zurt(this.f32864a);
            ipVar.o1t();
        }
        if (m20815n()) {
            ipVar.cdj(f32857u);
            ipVar.mo20991h(this.f32861a);
            ipVar.o1t();
        }
        if (m20816o()) {
            ipVar.cdj(f73319bo);
            ipVar.fu4(this.f32869b);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public void m20791a(boolean z2) {
        this.f32865a.set(0, z2);
    }

    /* JADX INFO: renamed from: a */
    public void m20790a(String str, String str2) {
        if (this.f32866a == null) {
            this.f32866a = new HashMap();
        }
        this.f32866a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m20788a() {
        return this.f32866a;
    }

    /* JADX INFO: renamed from: a */
    public erbd m20784a(Map<String, String> map) {
        this.f32866a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m20794a() {
        m20783a(vh.n7h(this.f32864a));
        return this.f32864a.array();
    }

    /* JADX INFO: renamed from: a */
    public erbd m20786a(byte[] bArr) {
        m20783a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public erbd m20783a(ByteBuffer byteBuffer) {
        this.f32864a = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20793a(erbd erbdVar) {
        if (erbdVar == null) {
            return false;
        }
        boolean zM20792a = m20792a();
        boolean zM20792a2 = erbdVar.m20792a();
        if ((zM20792a || zM20792a2) && !(zM20792a && zM20792a2 && this.f32863a.equals(erbdVar.f32863a))) {
            return false;
        }
        boolean zM20798b = m20798b();
        boolean zM20798b2 = erbdVar.m20798b();
        if ((zM20798b || zM20798b2) && !(zM20798b && zM20798b2 && this.f32862a.m20627a(erbdVar.f32862a))) {
            return false;
        }
        boolean zM20802c = m20802c();
        boolean zM20802c2 = erbdVar.m20802c();
        if ((zM20802c || zM20802c2) && !(zM20802c && zM20802c2 && this.f32868b.equals(erbdVar.f32868b))) {
            return false;
        }
        boolean zM20805d = m20805d();
        boolean zM20805d2 = erbdVar.m20805d();
        if ((zM20805d || zM20805d2) && !(zM20805d && zM20805d2 && this.f32870c.equals(erbdVar.f32870c))) {
            return false;
        }
        boolean zM20806e = m20806e();
        boolean zM20806e2 = erbdVar.m20806e();
        if (((zM20806e || zM20806e2) && !(zM20806e && zM20806e2 && this.f32871d.equals(erbdVar.f32871d))) || this.f32867a != erbdVar.f32867a) {
            return false;
        }
        boolean zM20808g = m20808g();
        boolean zM20808g2 = erbdVar.m20808g();
        if ((zM20808g || zM20808g2) && !(zM20808g && zM20808g2 && this.f32872e.equals(erbdVar.f32872e))) {
            return false;
        }
        boolean zM20809h = m20809h();
        boolean zM20809h2 = erbdVar.m20809h();
        if ((zM20809h || zM20809h2) && !(zM20809h && zM20809h2 && this.f32866a.equals(erbdVar.f32866a))) {
            return false;
        }
        boolean zM20810i = m20810i();
        boolean zM20810i2 = erbdVar.m20810i();
        if ((zM20810i || zM20810i2) && !(zM20810i && zM20810i2 && this.f32873f.equals(erbdVar.f32873f))) {
            return false;
        }
        boolean zM20811j = m20811j();
        boolean zM20811j2 = erbdVar.m20811j();
        if ((zM20811j || zM20811j2) && !(zM20811j && zM20811j2 && this.f32874g.equals(erbdVar.f32874g))) {
            return false;
        }
        boolean zM20812k = m20812k();
        boolean zM20812k2 = erbdVar.m20812k();
        if ((zM20812k || zM20812k2) && !(zM20812k && zM20812k2 && this.f32875h.equals(erbdVar.f32875h))) {
            return false;
        }
        boolean zM20813l = m20813l();
        boolean zM20813l2 = erbdVar.m20813l();
        if ((zM20813l || zM20813l2) && !(zM20813l && zM20813l2 && this.f32876i.equals(erbdVar.f32876i))) {
            return false;
        }
        boolean zM20814m = m20814m();
        boolean zM20814m2 = erbdVar.m20814m();
        if ((zM20814m || zM20814m2) && !(zM20814m && zM20814m2 && this.f32864a.equals(erbdVar.f32864a))) {
            return false;
        }
        boolean zM20815n = m20815n();
        boolean zM20815n2 = erbdVar.m20815n();
        if ((zM20815n || zM20815n2) && !(zM20815n && zM20815n2 && this.f32861a == erbdVar.f32861a)) {
            return false;
        }
        boolean zM20816o = m20816o();
        boolean zM20816o2 = erbdVar.m20816o();
        if (zM20816o || zM20816o2) {
            return zM20816o && zM20816o2 && this.f32869b == erbdVar.f32869b;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(erbd erbdVar) {
        int iLd6;
        int iZy;
        int iM21913q;
        int iM21911n;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iM21915y;
        int iM21911n5;
        int iLd62;
        int iM21911n6;
        int iM21911n7;
        int iM21911n8;
        int iM21913q2;
        int iM21911n9;
        if (!getClass().equals(erbdVar.getClass())) {
            return getClass().getName().compareTo(erbdVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20792a()).compareTo(Boolean.valueOf(erbdVar.m20792a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20792a() && (iM21911n9 = vh.m21911n(this.f32863a, erbdVar.f32863a)) != 0) {
            return iM21911n9;
        }
        int iCompareTo2 = Boolean.valueOf(m20798b()).compareTo(Boolean.valueOf(erbdVar.m20798b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20798b() && (iM21913q2 = vh.m21913q(this.f32862a, erbdVar.f32862a)) != 0) {
            return iM21913q2;
        }
        int iCompareTo3 = Boolean.valueOf(m20802c()).compareTo(Boolean.valueOf(erbdVar.m20802c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m20802c() && (iM21911n8 = vh.m21911n(this.f32868b, erbdVar.f32868b)) != 0) {
            return iM21911n8;
        }
        int iCompareTo4 = Boolean.valueOf(m20805d()).compareTo(Boolean.valueOf(erbdVar.m20805d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m20805d() && (iM21911n7 = vh.m21911n(this.f32870c, erbdVar.f32870c)) != 0) {
            return iM21911n7;
        }
        int iCompareTo5 = Boolean.valueOf(m20806e()).compareTo(Boolean.valueOf(erbdVar.m20806e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m20806e() && (iM21911n6 = vh.m21911n(this.f32871d, erbdVar.f32871d)) != 0) {
            return iM21911n6;
        }
        int iCompareTo6 = Boolean.valueOf(m20807f()).compareTo(Boolean.valueOf(erbdVar.m20807f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m20807f() && (iLd62 = vh.ld6(this.f32867a, erbdVar.f32867a)) != 0) {
            return iLd62;
        }
        int iCompareTo7 = Boolean.valueOf(m20808g()).compareTo(Boolean.valueOf(erbdVar.m20808g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m20808g() && (iM21911n5 = vh.m21911n(this.f32872e, erbdVar.f32872e)) != 0) {
            return iM21911n5;
        }
        int iCompareTo8 = Boolean.valueOf(m20809h()).compareTo(Boolean.valueOf(erbdVar.m20809h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m20809h() && (iM21915y = vh.m21915y(this.f32866a, erbdVar.f32866a)) != 0) {
            return iM21915y;
        }
        int iCompareTo9 = Boolean.valueOf(m20810i()).compareTo(Boolean.valueOf(erbdVar.m20810i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m20810i() && (iM21911n4 = vh.m21911n(this.f32873f, erbdVar.f32873f)) != 0) {
            return iM21911n4;
        }
        int iCompareTo10 = Boolean.valueOf(m20811j()).compareTo(Boolean.valueOf(erbdVar.m20811j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m20811j() && (iM21911n3 = vh.m21911n(this.f32874g, erbdVar.f32874g)) != 0) {
            return iM21911n3;
        }
        int iCompareTo11 = Boolean.valueOf(m20812k()).compareTo(Boolean.valueOf(erbdVar.m20812k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m20812k() && (iM21911n2 = vh.m21911n(this.f32875h, erbdVar.f32875h)) != 0) {
            return iM21911n2;
        }
        int iCompareTo12 = Boolean.valueOf(m20813l()).compareTo(Boolean.valueOf(erbdVar.m20813l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m20813l() && (iM21911n = vh.m21911n(this.f32876i, erbdVar.f32876i)) != 0) {
            return iM21911n;
        }
        int iCompareTo13 = Boolean.valueOf(m20814m()).compareTo(Boolean.valueOf(erbdVar.m20814m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m20814m() && (iM21913q = vh.m21913q(this.f32864a, erbdVar.f32864a)) != 0) {
            return iM21913q;
        }
        int iCompareTo14 = Boolean.valueOf(m20815n()).compareTo(Boolean.valueOf(erbdVar.m20815n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m20815n() && (iZy = vh.zy(this.f32861a, erbdVar.f32861a)) != 0) {
            return iZy;
        }
        int iCompareTo15 = Boolean.valueOf(m20816o()).compareTo(Boolean.valueOf(erbdVar.m20816o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (!m20816o() || (iLd6 = vh.ld6(this.f32869b, erbdVar.f32869b)) == 0) {
            return 0;
        }
        return iLd6;
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
                if (m20807f()) {
                    m20789a();
                    return;
                }
                throw new dbf("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f32863a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f32862a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f32868b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f32870c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f32871d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 2) {
                        this.f32867a = ipVar.mo21000z();
                        m20791a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f32872e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 13) {
                        ap23 ap23VarF7l8 = ipVar.f7l8();
                        this.f32866a = new HashMap(ap23VarF7l8.f73265zy * 2);
                        for (int i2 = 0; i2 < ap23VarF7l8.f73265zy; i2++) {
                            this.f32866a.put(ipVar.mo20995p(), ipVar.mo20995p());
                        }
                        ipVar.fti();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f32873f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 11) {
                        this.f32874g = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                case 16:
                case 17:
                case 18:
                case 19:
                default:
                    koj.m21140k(ipVar, b2);
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f32875h = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 11) {
                        this.f32876i = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 14:
                    if (b2 == 11) {
                        this.f32864a = ipVar.ld6();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 15:
                    if (b2 == 10) {
                        this.f32861a = ipVar.mo20996q();
                        m20797b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 20:
                    if (b2 == 2) {
                        this.f32869b = ipVar.mo21000z();
                        m20801c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20789a() throws dbf {
        if (this.f32868b != null) {
            return;
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
