package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class kjd implements oaex<kjd, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f33139a;

    /* JADX INFO: renamed from: a */
    public b2 f33140a;

    /* JADX INFO: renamed from: a */
    public String f33141a;

    /* JADX INFO: renamed from: a */
    public List<String> f33143a;

    /* JADX INFO: renamed from: b */
    public String f33145b;

    /* JADX INFO: renamed from: c */
    public String f33146c;

    /* JADX INFO: renamed from: d */
    public String f33147d;

    /* JADX INFO: renamed from: e */
    public String f33148e;

    /* JADX INFO: renamed from: f */
    public String f33149f;

    /* JADX INFO: renamed from: k */
    private static final s31 f33131k = new s31("XmPushActionCommandResult");

    /* JADX INFO: renamed from: q */
    private static final vc f33134q = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: n */
    private static final vc f33132n = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: g */
    private static final vc f33128g = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: y */
    private static final vc f33137y = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: s */
    private static final vc f33135s = new vc("", (byte) 10, 7);

    /* JADX INFO: renamed from: p */
    private static final vc f33133p = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: h */
    private static final vc f33129h = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: i */
    private static final vc f33130i = new vc("", com.google.common.base.zy.f68111cdj, 10);

    /* JADX INFO: renamed from: z */
    private static final vc f33138z = new vc("", com.google.common.base.zy.f68132qrj, 12);

    /* JADX INFO: renamed from: t */
    private static final vc f33136t = new vc("", (byte) 2, 13);

    /* JADX INFO: renamed from: a */
    private BitSet f33142a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public boolean f33144a = true;

    /* JADX INFO: renamed from: a */
    public boolean m21090a() {
        return this.f33140a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21094b() {
        return this.f33141a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21096c() {
        return this.f33145b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21097d() {
        return this.f33146c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m21098e() {
        return this.f33142a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof kjd)) {
            return m21091a((kjd) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21099f() {
        return this.f33147d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m21100g() {
        return this.f33148e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21101h() {
        return this.f33143a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21102i() {
        return this.f33149f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m21103j() {
        return this.f33142a.get(1);
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m21090a()) {
            sb.append("target:");
            b2 b2Var = this.f33140a;
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
        String str = this.f33141a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f33145b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f33146c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f33139a);
        if (m21099f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f33147d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m21100g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f33148e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m21101h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f33143a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m21102i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f33149f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m21103j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f33144a);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public String m21086a() {
        return this.f33141a;
    }

    /* JADX INFO: renamed from: b */
    public String m21092b() {
        return this.f33146c;
    }

    /* JADX INFO: renamed from: c */
    public String m21095c() {
        return this.f33149f;
    }

    /* JADX INFO: renamed from: a */
    public void m21089a(boolean z2) {
        this.f33142a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public void m21093b(boolean z2) {
        this.f33142a.set(1, z2);
    }

    /* JADX INFO: renamed from: a */
    public List<String> m21087a() {
        return this.f33143a;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21088a();
        ipVar.mo20992i(f33131k);
        if (this.f33140a != null && m21090a()) {
            ipVar.cdj(f33134q);
            this.f33140a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f33141a != null) {
            ipVar.cdj(f33132n);
            ipVar.fn3e(this.f33141a);
            ipVar.o1t();
        }
        if (this.f33145b != null) {
            ipVar.cdj(f33128g);
            ipVar.fn3e(this.f33145b);
            ipVar.o1t();
        }
        if (this.f33146c != null) {
            ipVar.cdj(f33137y);
            ipVar.fn3e(this.f33146c);
            ipVar.o1t();
        }
        ipVar.cdj(f33135s);
        ipVar.mo20991h(this.f33139a);
        ipVar.o1t();
        if (this.f33147d != null && m21099f()) {
            ipVar.cdj(f33133p);
            ipVar.fn3e(this.f33147d);
            ipVar.o1t();
        }
        if (this.f33148e != null && m21100g()) {
            ipVar.cdj(f33129h);
            ipVar.fn3e(this.f33148e);
            ipVar.o1t();
        }
        if (this.f33143a != null && m21101h()) {
            ipVar.cdj(f33130i);
            ipVar.ki(new izu(com.google.common.base.zy.f68132qrj, this.f33143a.size()));
            Iterator<String> it = this.f33143a.iterator();
            while (it.hasNext()) {
                ipVar.fn3e(it.next());
            }
            ipVar.mcp();
            ipVar.o1t();
        }
        if (this.f33149f != null && m21102i()) {
            ipVar.cdj(f33138z);
            ipVar.fn3e(this.f33149f);
            ipVar.o1t();
        }
        if (m21103j()) {
            ipVar.cdj(f33136t);
            ipVar.fu4(this.f33144a);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21091a(kjd kjdVar) {
        if (kjdVar == null) {
            return false;
        }
        boolean zM21090a = m21090a();
        boolean zM21090a2 = kjdVar.m21090a();
        if ((zM21090a || zM21090a2) && !(zM21090a && zM21090a2 && this.f33140a.m20627a(kjdVar.f33140a))) {
            return false;
        }
        boolean zM21094b = m21094b();
        boolean zM21094b2 = kjdVar.m21094b();
        if ((zM21094b || zM21094b2) && !(zM21094b && zM21094b2 && this.f33141a.equals(kjdVar.f33141a))) {
            return false;
        }
        boolean zM21096c = m21096c();
        boolean zM21096c2 = kjdVar.m21096c();
        if ((zM21096c || zM21096c2) && !(zM21096c && zM21096c2 && this.f33145b.equals(kjdVar.f33145b))) {
            return false;
        }
        boolean zM21097d = m21097d();
        boolean zM21097d2 = kjdVar.m21097d();
        if (((zM21097d || zM21097d2) && !(zM21097d && zM21097d2 && this.f33146c.equals(kjdVar.f33146c))) || this.f33139a != kjdVar.f33139a) {
            return false;
        }
        boolean zM21099f = m21099f();
        boolean zM21099f2 = kjdVar.m21099f();
        if ((zM21099f || zM21099f2) && !(zM21099f && zM21099f2 && this.f33147d.equals(kjdVar.f33147d))) {
            return false;
        }
        boolean zM21100g = m21100g();
        boolean zM21100g2 = kjdVar.m21100g();
        if ((zM21100g || zM21100g2) && !(zM21100g && zM21100g2 && this.f33148e.equals(kjdVar.f33148e))) {
            return false;
        }
        boolean zM21101h = m21101h();
        boolean zM21101h2 = kjdVar.m21101h();
        if ((zM21101h || zM21101h2) && !(zM21101h && zM21101h2 && this.f33143a.equals(kjdVar.f33143a))) {
            return false;
        }
        boolean zM21102i = m21102i();
        boolean zM21102i2 = kjdVar.m21102i();
        if ((zM21102i || zM21102i2) && !(zM21102i && zM21102i2 && this.f33149f.equals(kjdVar.f33149f))) {
            return false;
        }
        boolean zM21103j = m21103j();
        boolean zM21103j2 = kjdVar.m21103j();
        if (zM21103j || zM21103j2) {
            return zM21103j && zM21103j2 && this.f33144a == kjdVar.f33144a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(kjd kjdVar) {
        int iLd6;
        int iM21911n;
        int iF7l8;
        int iM21911n2;
        int iM21911n3;
        int iZy;
        int iM21911n4;
        int iM21911n5;
        int iM21911n6;
        int iM21913q;
        if (!getClass().equals(kjdVar.getClass())) {
            return getClass().getName().compareTo(kjdVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21090a()).compareTo(Boolean.valueOf(kjdVar.m21090a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21090a() && (iM21913q = vh.m21913q(this.f33140a, kjdVar.f33140a)) != 0) {
            return iM21913q;
        }
        int iCompareTo2 = Boolean.valueOf(m21094b()).compareTo(Boolean.valueOf(kjdVar.m21094b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21094b() && (iM21911n6 = vh.m21911n(this.f33141a, kjdVar.f33141a)) != 0) {
            return iM21911n6;
        }
        int iCompareTo3 = Boolean.valueOf(m21096c()).compareTo(Boolean.valueOf(kjdVar.m21096c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21096c() && (iM21911n5 = vh.m21911n(this.f33145b, kjdVar.f33145b)) != 0) {
            return iM21911n5;
        }
        int iCompareTo4 = Boolean.valueOf(m21097d()).compareTo(Boolean.valueOf(kjdVar.m21097d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21097d() && (iM21911n4 = vh.m21911n(this.f33146c, kjdVar.f33146c)) != 0) {
            return iM21911n4;
        }
        int iCompareTo5 = Boolean.valueOf(m21098e()).compareTo(Boolean.valueOf(kjdVar.m21098e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21098e() && (iZy = vh.zy(this.f33139a, kjdVar.f33139a)) != 0) {
            return iZy;
        }
        int iCompareTo6 = Boolean.valueOf(m21099f()).compareTo(Boolean.valueOf(kjdVar.m21099f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21099f() && (iM21911n3 = vh.m21911n(this.f33147d, kjdVar.f33147d)) != 0) {
            return iM21911n3;
        }
        int iCompareTo7 = Boolean.valueOf(m21100g()).compareTo(Boolean.valueOf(kjdVar.m21100g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21100g() && (iM21911n2 = vh.m21911n(this.f33148e, kjdVar.f33148e)) != 0) {
            return iM21911n2;
        }
        int iCompareTo8 = Boolean.valueOf(m21101h()).compareTo(Boolean.valueOf(kjdVar.m21101h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m21101h() && (iF7l8 = vh.f7l8(this.f33143a, kjdVar.f33143a)) != 0) {
            return iF7l8;
        }
        int iCompareTo9 = Boolean.valueOf(m21102i()).compareTo(Boolean.valueOf(kjdVar.m21102i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m21102i() && (iM21911n = vh.m21911n(this.f33149f, kjdVar.f33149f)) != 0) {
            return iM21911n;
        }
        int iCompareTo10 = Boolean.valueOf(m21103j()).compareTo(Boolean.valueOf(kjdVar.m21103j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m21103j() || (iLd6 = vh.ld6(this.f33144a, kjdVar.f33144a)) == 0) {
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
                if (m21098e()) {
                    m21088a();
                    return;
                }
                throw new dbf("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (vcVarMo20994n.f73704zy) {
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f33140a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f33141a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f33145b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f33146c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                case 11:
                default:
                    koj.m21140k(ipVar, b2);
                    break;
                case 7:
                    if (b2 == 10) {
                        this.f33139a = ipVar.mo20996q();
                        m21089a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f33147d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f33148e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 15) {
                        izu izuVarMo20990g = ipVar.mo20990g();
                        this.f33143a = new ArrayList(izuVarMo20990g.f73378toq);
                        for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                            this.f33143a.add(ipVar.mo20995p());
                        }
                        ipVar.jp0y();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f33149f = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 2) {
                        this.f33144a = ipVar.mo21000z();
                        m21093b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21088a() throws dbf {
        if (this.f33141a != null) {
            if (this.f33145b != null) {
                if (this.f33146c != null) {
                    return;
                }
                throw new dbf("Required field 'cmdName' was not present! Struct: " + toString());
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
