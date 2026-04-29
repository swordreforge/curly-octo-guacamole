package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zma implements oaex<zma, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f34286a;

    /* JADX INFO: renamed from: a */
    public b2 f34287a;

    /* JADX INFO: renamed from: a */
    public String f34288a;

    /* JADX INFO: renamed from: a */
    public List<String> f34290a;

    /* JADX INFO: renamed from: b */
    public String f34292b;

    /* JADX INFO: renamed from: c */
    public String f34294c;

    /* JADX INFO: renamed from: d */
    public String f34295d;

    /* JADX INFO: renamed from: e */
    public String f34296e;

    /* JADX INFO: renamed from: k */
    private static final s31 f34278k = new s31("XmPushActionCommand");

    /* JADX INFO: renamed from: q */
    private static final vc f34281q = new vc("", com.google.common.base.zy.f68128n7h, 2);

    /* JADX INFO: renamed from: n */
    private static final vc f34279n = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: g */
    private static final vc f34275g = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: y */
    private static final vc f34284y = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: s */
    private static final vc f34282s = new vc("", com.google.common.base.zy.f68111cdj, 6);

    /* JADX INFO: renamed from: p */
    private static final vc f34280p = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: h */
    private static final vc f34276h = new vc("", com.google.common.base.zy.f68132qrj, 9);

    /* JADX INFO: renamed from: i */
    private static final vc f34277i = new vc("", (byte) 2, 10);

    /* JADX INFO: renamed from: z */
    private static final vc f34285z = new vc("", (byte) 2, 11);

    /* JADX INFO: renamed from: t */
    private static final vc f34283t = new vc("", (byte) 10, 12);

    /* JADX INFO: renamed from: a */
    private BitSet f34289a = new BitSet(3);

    /* JADX INFO: renamed from: a */
    public boolean f34291a = false;

    /* JADX INFO: renamed from: b */
    public boolean f34293b = true;

    /* JADX INFO: renamed from: a */
    public boolean m22113a() {
        return this.f34287a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m22117b() {
        return this.f34288a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m22120c() {
        return this.f34292b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m22122d() {
        return this.f34294c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m22124e() {
        return this.f34290a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof zma)) {
            return m22114a((zma) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m22125f() {
        return this.f34295d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m22126g() {
        return this.f34296e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m22127h() {
        return this.f34289a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m22128i() {
        return this.f34289a.get(1);
    }

    /* JADX INFO: renamed from: j */
    public boolean m22129j() {
        return this.f34289a.get(2);
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m22113a()) {
            sb.append("target:");
            b2 b2Var = this.f34287a;
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
        String str = this.f34288a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f34292b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f34294c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m22124e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f34290a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m22125f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f34295d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m22126g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f34296e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m22127h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f34291a);
        }
        if (m22128i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f34293b);
        }
        if (m22129j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f34286a);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public zma m22108a(String str) {
        this.f34288a = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public zma m22115b(String str) {
        this.f34292b = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public zma m22118c(String str) {
        this.f34294c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public zma m22121d(String str) {
        this.f34295d = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public zma m22123e(String str) {
        this.f34296e = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m22109a() {
        return this.f34294c;
    }

    /* JADX INFO: renamed from: b */
    public void m22116b(boolean z2) {
        this.f34289a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m22119c(boolean z2) {
        this.f34289a.set(2, z2);
    }

    /* JADX INFO: renamed from: a */
    public void m22111a(String str) {
        if (this.f34290a == null) {
            this.f34290a = new ArrayList();
        }
        this.f34290a.add(str);
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m22110a();
        ipVar.mo20992i(f34278k);
        if (this.f34287a != null && m22113a()) {
            ipVar.cdj(f34281q);
            this.f34287a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f34288a != null) {
            ipVar.cdj(f34279n);
            ipVar.fn3e(this.f34288a);
            ipVar.o1t();
        }
        if (this.f34292b != null) {
            ipVar.cdj(f34275g);
            ipVar.fn3e(this.f34292b);
            ipVar.o1t();
        }
        if (this.f34294c != null) {
            ipVar.cdj(f34284y);
            ipVar.fn3e(this.f34294c);
            ipVar.o1t();
        }
        if (this.f34290a != null && m22124e()) {
            ipVar.cdj(f34282s);
            ipVar.ki(new izu(com.google.common.base.zy.f68132qrj, this.f34290a.size()));
            Iterator<String> it = this.f34290a.iterator();
            while (it.hasNext()) {
                ipVar.fn3e(it.next());
            }
            ipVar.mcp();
            ipVar.o1t();
        }
        if (this.f34295d != null && m22125f()) {
            ipVar.cdj(f34280p);
            ipVar.fn3e(this.f34295d);
            ipVar.o1t();
        }
        if (this.f34296e != null && m22126g()) {
            ipVar.cdj(f34276h);
            ipVar.fn3e(this.f34296e);
            ipVar.o1t();
        }
        if (m22127h()) {
            ipVar.cdj(f34277i);
            ipVar.fu4(this.f34291a);
            ipVar.o1t();
        }
        if (m22128i()) {
            ipVar.cdj(f34285z);
            ipVar.fu4(this.f34293b);
            ipVar.o1t();
        }
        if (m22129j()) {
            ipVar.cdj(f34283t);
            ipVar.mo20991h(this.f34286a);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public void m22112a(boolean z2) {
        this.f34289a.set(0, z2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m22114a(zma zmaVar) {
        if (zmaVar == null) {
            return false;
        }
        boolean zM22113a = m22113a();
        boolean zM22113a2 = zmaVar.m22113a();
        if ((zM22113a || zM22113a2) && !(zM22113a && zM22113a2 && this.f34287a.m20627a(zmaVar.f34287a))) {
            return false;
        }
        boolean zM22117b = m22117b();
        boolean zM22117b2 = zmaVar.m22117b();
        if ((zM22117b || zM22117b2) && !(zM22117b && zM22117b2 && this.f34288a.equals(zmaVar.f34288a))) {
            return false;
        }
        boolean zM22120c = m22120c();
        boolean zM22120c2 = zmaVar.m22120c();
        if ((zM22120c || zM22120c2) && !(zM22120c && zM22120c2 && this.f34292b.equals(zmaVar.f34292b))) {
            return false;
        }
        boolean zM22122d = m22122d();
        boolean zM22122d2 = zmaVar.m22122d();
        if ((zM22122d || zM22122d2) && !(zM22122d && zM22122d2 && this.f34294c.equals(zmaVar.f34294c))) {
            return false;
        }
        boolean zM22124e = m22124e();
        boolean zM22124e2 = zmaVar.m22124e();
        if ((zM22124e || zM22124e2) && !(zM22124e && zM22124e2 && this.f34290a.equals(zmaVar.f34290a))) {
            return false;
        }
        boolean zM22125f = m22125f();
        boolean zM22125f2 = zmaVar.m22125f();
        if ((zM22125f || zM22125f2) && !(zM22125f && zM22125f2 && this.f34295d.equals(zmaVar.f34295d))) {
            return false;
        }
        boolean zM22126g = m22126g();
        boolean zM22126g2 = zmaVar.m22126g();
        if ((zM22126g || zM22126g2) && !(zM22126g && zM22126g2 && this.f34296e.equals(zmaVar.f34296e))) {
            return false;
        }
        boolean zM22127h = m22127h();
        boolean zM22127h2 = zmaVar.m22127h();
        if ((zM22127h || zM22127h2) && !(zM22127h && zM22127h2 && this.f34291a == zmaVar.f34291a)) {
            return false;
        }
        boolean zM22128i = m22128i();
        boolean zM22128i2 = zmaVar.m22128i();
        if ((zM22128i || zM22128i2) && !(zM22128i && zM22128i2 && this.f34293b == zmaVar.f34293b)) {
            return false;
        }
        boolean zM22129j = m22129j();
        boolean zM22129j2 = zmaVar.m22129j();
        if (zM22129j || zM22129j2) {
            return zM22129j && zM22129j2 && this.f34286a == zmaVar.f34286a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(zma zmaVar) {
        int iZy;
        int iLd6;
        int iLd62;
        int iM21911n;
        int iM21911n2;
        int iF7l8;
        int iM21911n3;
        int iM21911n4;
        int iM21911n5;
        int iM21913q;
        if (!getClass().equals(zmaVar.getClass())) {
            return getClass().getName().compareTo(zmaVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m22113a()).compareTo(Boolean.valueOf(zmaVar.m22113a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m22113a() && (iM21913q = vh.m21913q(this.f34287a, zmaVar.f34287a)) != 0) {
            return iM21913q;
        }
        int iCompareTo2 = Boolean.valueOf(m22117b()).compareTo(Boolean.valueOf(zmaVar.m22117b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m22117b() && (iM21911n5 = vh.m21911n(this.f34288a, zmaVar.f34288a)) != 0) {
            return iM21911n5;
        }
        int iCompareTo3 = Boolean.valueOf(m22120c()).compareTo(Boolean.valueOf(zmaVar.m22120c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m22120c() && (iM21911n4 = vh.m21911n(this.f34292b, zmaVar.f34292b)) != 0) {
            return iM21911n4;
        }
        int iCompareTo4 = Boolean.valueOf(m22122d()).compareTo(Boolean.valueOf(zmaVar.m22122d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m22122d() && (iM21911n3 = vh.m21911n(this.f34294c, zmaVar.f34294c)) != 0) {
            return iM21911n3;
        }
        int iCompareTo5 = Boolean.valueOf(m22124e()).compareTo(Boolean.valueOf(zmaVar.m22124e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m22124e() && (iF7l8 = vh.f7l8(this.f34290a, zmaVar.f34290a)) != 0) {
            return iF7l8;
        }
        int iCompareTo6 = Boolean.valueOf(m22125f()).compareTo(Boolean.valueOf(zmaVar.m22125f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m22125f() && (iM21911n2 = vh.m21911n(this.f34295d, zmaVar.f34295d)) != 0) {
            return iM21911n2;
        }
        int iCompareTo7 = Boolean.valueOf(m22126g()).compareTo(Boolean.valueOf(zmaVar.m22126g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m22126g() && (iM21911n = vh.m21911n(this.f34296e, zmaVar.f34296e)) != 0) {
            return iM21911n;
        }
        int iCompareTo8 = Boolean.valueOf(m22127h()).compareTo(Boolean.valueOf(zmaVar.m22127h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m22127h() && (iLd62 = vh.ld6(this.f34291a, zmaVar.f34291a)) != 0) {
            return iLd62;
        }
        int iCompareTo9 = Boolean.valueOf(m22128i()).compareTo(Boolean.valueOf(zmaVar.m22128i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m22128i() && (iLd6 = vh.ld6(this.f34293b, zmaVar.f34293b)) != 0) {
            return iLd6;
        }
        int iCompareTo10 = Boolean.valueOf(m22129j()).compareTo(Boolean.valueOf(zmaVar.m22129j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m22129j() || (iZy = vh.zy(this.f34286a, zmaVar.f34286a)) == 0) {
            return 0;
        }
        return iZy;
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
                m22110a();
                return;
            }
            switch (vcVarMo20994n.f73704zy) {
                case 2:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f34287a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f34288a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f34292b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f34294c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 15) {
                        izu izuVarMo20990g = ipVar.mo20990g();
                        this.f34290a = new ArrayList(izuVarMo20990g.f73378toq);
                        for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                            this.f34290a.add(ipVar.mo20995p());
                        }
                        ipVar.jp0y();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f34295d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                default:
                    koj.m21140k(ipVar, b2);
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f34296e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 2) {
                        this.f34291a = ipVar.mo21000z();
                        m22112a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 2) {
                        this.f34293b = ipVar.mo21000z();
                        m22116b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 10) {
                        this.f34286a = ipVar.mo20996q();
                        m22119c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m22110a() throws dbf {
        if (this.f34288a != null) {
            if (this.f34292b != null) {
                if (this.f34294c != null) {
                    return;
                }
                throw new dbf("Required field 'cmdName' was not present! Struct: " + toString());
            }
            throw new dbf("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
