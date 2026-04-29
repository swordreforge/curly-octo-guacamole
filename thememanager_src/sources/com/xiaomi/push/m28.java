package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class m28 implements oaex<m28, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public b2 f33386a;

    /* JADX INFO: renamed from: a */
    public ge f33387a;

    /* JADX INFO: renamed from: a */
    public wwp f33388a;

    /* JADX INFO: renamed from: a */
    public String f33389a;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f33390a;

    /* JADX INFO: renamed from: b */
    public String f33393b;

    /* JADX INFO: renamed from: k */
    private static final s31 f33380k = new s31("XmPushActionContainer");

    /* JADX INFO: renamed from: q */
    private static final vc f33383q = new vc("", (byte) 8, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33381n = new vc("", (byte) 2, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f33377g = new vc("", (byte) 2, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f33385y = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f33384s = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: p */
    private static final vc f33382p = new vc("", com.google.common.base.zy.f68132qrj, 6);

    /* JADX INFO: renamed from: h */
    private static final vc f33378h = new vc("", com.google.common.base.zy.f68128n7h, 7);

    /* JADX INFO: renamed from: i */
    private static final vc f33379i = new vc("", com.google.common.base.zy.f68128n7h, 8);

    /* JADX INFO: renamed from: a */
    private BitSet f33391a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public boolean f33392a = true;

    /* JADX INFO: renamed from: b */
    public boolean f33394b = true;

    /* JADX INFO: renamed from: a */
    public wwp m21242a() {
        return this.f33388a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21253b() {
        return this.f33392a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21254c() {
        return this.f33391a.get(0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m21255d() {
        return this.f33391a.get(1);
    }

    /* JADX INFO: renamed from: e */
    public boolean m21256e() {
        return this.f33390a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof m28)) {
            return m21247a((m28) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21257f() {
        return this.f33389a != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m21258g() {
        return this.f33393b != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21259h() {
        return this.f33386a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21260i() {
        return this.f33387a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        wwp wwpVar = this.f33388a;
        if (wwpVar == null) {
            sb.append("null");
        } else {
            sb.append(wwpVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f33392a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f33394b);
        if (m21257f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f33389a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (m21258g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f33393b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        b2 b2Var = this.f33386a;
        if (b2Var == null) {
            sb.append("null");
        } else {
            sb.append(b2Var);
        }
        if (m21260i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            ge geVar = this.f33387a;
            if (geVar == null) {
                sb.append("null");
            } else {
                sb.append(geVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public m28 m21238a(wwp wwpVar) {
        this.f33388a = wwpVar;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public m28 m21250b(boolean z2) {
        this.f33394b = z2;
        m21252b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21246a() {
        return this.f33388a != null;
    }

    /* JADX INFO: renamed from: a */
    public m28 m21241a(boolean z2) {
        this.f33392a = z2;
        m21245a(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m21252b(boolean z2) {
        this.f33391a.set(1, z2);
    }

    /* JADX INFO: renamed from: b */
    public String m21251b() {
        return this.f33393b;
    }

    /* JADX INFO: renamed from: a */
    public void m21245a(boolean z2) {
        this.f33391a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public m28 m21249b(String str) {
        this.f33393b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m21248a() {
        m21240a(vh.n7h(this.f33390a));
        return this.f33390a.array();
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21244a();
        ipVar.mo20992i(f33380k);
        if (this.f33388a != null) {
            ipVar.cdj(f33383q);
            ipVar.kja0(this.f33388a.m21982a());
            ipVar.o1t();
        }
        ipVar.cdj(f33381n);
        ipVar.fu4(this.f33392a);
        ipVar.o1t();
        ipVar.cdj(f33377g);
        ipVar.fu4(this.f33394b);
        ipVar.o1t();
        if (this.f33390a != null) {
            ipVar.cdj(f33385y);
            ipVar.zurt(this.f33390a);
            ipVar.o1t();
        }
        if (this.f33389a != null && m21257f()) {
            ipVar.cdj(f33384s);
            ipVar.fn3e(this.f33389a);
            ipVar.o1t();
        }
        if (this.f33393b != null && m21258g()) {
            ipVar.cdj(f33382p);
            ipVar.fn3e(this.f33393b);
            ipVar.o1t();
        }
        if (this.f33386a != null) {
            ipVar.cdj(f33378h);
            this.f33386a.mo20561b(ipVar);
            ipVar.o1t();
        }
        if (this.f33387a != null && m21260i()) {
            ipVar.cdj(f33379i);
            this.f33387a.mo20561b(ipVar);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public m28 m21240a(ByteBuffer byteBuffer) {
        this.f33390a = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m21243a() {
        return this.f33389a;
    }

    /* JADX INFO: renamed from: a */
    public m28 m21239a(String str) {
        this.f33389a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public m28 m21236a(b2 b2Var) {
        this.f33386a = b2Var;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public ge m21235a() {
        return this.f33387a;
    }

    /* JADX INFO: renamed from: a */
    public m28 m21237a(ge geVar) {
        this.f33387a = geVar;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21247a(m28 m28Var) {
        if (m28Var == null) {
            return false;
        }
        boolean zM21246a = m21246a();
        boolean zM21246a2 = m28Var.m21246a();
        if (((zM21246a || zM21246a2) && (!zM21246a || !zM21246a2 || !this.f33388a.equals(m28Var.f33388a))) || this.f33392a != m28Var.f33392a || this.f33394b != m28Var.f33394b) {
            return false;
        }
        boolean zM21256e = m21256e();
        boolean zM21256e2 = m28Var.m21256e();
        if ((zM21256e || zM21256e2) && !(zM21256e && zM21256e2 && this.f33390a.equals(m28Var.f33390a))) {
            return false;
        }
        boolean zM21257f = m21257f();
        boolean zM21257f2 = m28Var.m21257f();
        if ((zM21257f || zM21257f2) && !(zM21257f && zM21257f2 && this.f33389a.equals(m28Var.f33389a))) {
            return false;
        }
        boolean zM21258g = m21258g();
        boolean zM21258g2 = m28Var.m21258g();
        if ((zM21258g || zM21258g2) && !(zM21258g && zM21258g2 && this.f33393b.equals(m28Var.f33393b))) {
            return false;
        }
        boolean zM21259h = m21259h();
        boolean zM21259h2 = m28Var.m21259h();
        if ((zM21259h || zM21259h2) && !(zM21259h && zM21259h2 && this.f33386a.m20627a(m28Var.f33386a))) {
            return false;
        }
        boolean zM21260i = m21260i();
        boolean zM21260i2 = m28Var.m21260i();
        if (zM21260i || zM21260i2) {
            return zM21260i && zM21260i2 && this.f33387a.m20912a(m28Var.f33387a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m28 m28Var) {
        int iM21913q;
        int iM21913q2;
        int iM21911n;
        int iM21911n2;
        int iM21913q3;
        int iLd6;
        int iLd62;
        int iM21913q4;
        if (!getClass().equals(m28Var.getClass())) {
            return getClass().getName().compareTo(m28Var.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21246a()).compareTo(Boolean.valueOf(m28Var.m21246a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21246a() && (iM21913q4 = vh.m21913q(this.f33388a, m28Var.f33388a)) != 0) {
            return iM21913q4;
        }
        int iCompareTo2 = Boolean.valueOf(m21254c()).compareTo(Boolean.valueOf(m28Var.m21254c()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21254c() && (iLd62 = vh.ld6(this.f33392a, m28Var.f33392a)) != 0) {
            return iLd62;
        }
        int iCompareTo3 = Boolean.valueOf(m21255d()).compareTo(Boolean.valueOf(m28Var.m21255d()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21255d() && (iLd6 = vh.ld6(this.f33394b, m28Var.f33394b)) != 0) {
            return iLd6;
        }
        int iCompareTo4 = Boolean.valueOf(m21256e()).compareTo(Boolean.valueOf(m28Var.m21256e()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21256e() && (iM21913q3 = vh.m21913q(this.f33390a, m28Var.f33390a)) != 0) {
            return iM21913q3;
        }
        int iCompareTo5 = Boolean.valueOf(m21257f()).compareTo(Boolean.valueOf(m28Var.m21257f()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21257f() && (iM21911n2 = vh.m21911n(this.f33389a, m28Var.f33389a)) != 0) {
            return iM21911n2;
        }
        int iCompareTo6 = Boolean.valueOf(m21258g()).compareTo(Boolean.valueOf(m28Var.m21258g()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21258g() && (iM21911n = vh.m21911n(this.f33393b, m28Var.f33393b)) != 0) {
            return iM21911n;
        }
        int iCompareTo7 = Boolean.valueOf(m21259h()).compareTo(Boolean.valueOf(m28Var.m21259h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21259h() && (iM21913q2 = vh.m21913q(this.f33386a, m28Var.f33386a)) != 0) {
            return iM21913q2;
        }
        int iCompareTo8 = Boolean.valueOf(m21260i()).compareTo(Boolean.valueOf(m28Var.m21260i()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m21260i() || (iM21913q = vh.m21913q(this.f33387a, m28Var.f33387a)) == 0) {
            return 0;
        }
        return iM21913q;
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
                if (m21254c()) {
                    if (m21255d()) {
                        m21244a();
                        return;
                    }
                    throw new dbf("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
                }
                throw new dbf("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 8) {
                        this.f33388a = wwp.m21981a(ipVar.zy());
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 2) {
                        this.f33392a = ipVar.mo21000z();
                        m21245a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 2) {
                        this.f33394b = ipVar.mo21000z();
                        m21252b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f33390a = ipVar.ld6();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f33389a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 11) {
                        this.f33393b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 12) {
                        b2 b2Var = new b2();
                        this.f33386a = b2Var;
                        b2Var.mo20557a(ipVar);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 12) {
                        ge geVar = new ge();
                        this.f33387a = geVar;
                        geVar.mo20557a(ipVar);
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
    public void m21244a() throws dbf {
        if (this.f33388a != null) {
            if (this.f33390a != null) {
                if (this.f33386a != null) {
                    return;
                }
                throw new dbf("Required field 'target' was not present! Struct: " + toString());
            }
            throw new dbf("Required field 'pushAction' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'action' was not present! Struct: " + toString());
    }
}
