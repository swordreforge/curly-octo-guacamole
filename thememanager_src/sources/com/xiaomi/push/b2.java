package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class b2 implements oaex<b2, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public String f32705a;

    /* JADX INFO: renamed from: d */
    public String f32710d;

    /* JADX INFO: renamed from: k */
    private static final s31 f32698k = new s31("Target");

    /* JADX INFO: renamed from: q */
    private static final vc f32701q = new vc("", (byte) 10, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32699n = new vc("", com.google.common.base.zy.f68132qrj, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f32697g = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f32703y = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f32702s = new vc("", (byte) 2, 5);

    /* JADX INFO: renamed from: p */
    private static final vc f32700p = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: a */
    private BitSet f32706a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public long f32704a = 5;

    /* JADX INFO: renamed from: b */
    public String f32708b = "xiaomi.com";

    /* JADX INFO: renamed from: c */
    public String f32709c = "";

    /* JADX INFO: renamed from: a */
    public boolean f32707a = false;

    /* JADX INFO: renamed from: a */
    public boolean m20626a() {
        return this.f32706a.get(0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m20629b() {
        return this.f32705a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20630c() {
        return this.f32708b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20631d() {
        return this.f32709c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20632e() {
        return this.f32706a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b2)) {
            return m20627a((b2) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20633f() {
        return this.f32710d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.f32704a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f32705a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m20630c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f32708b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m20631d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f32709c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m20632e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f32707a);
        }
        if (m20633f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f32710d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m20625a(boolean z2) {
        this.f32706a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public void m20628b(boolean z2) {
        this.f32706a.set(1, z2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m20627a(b2 b2Var) {
        if (b2Var == null || this.f32704a != b2Var.f32704a) {
            return false;
        }
        boolean zM20629b = m20629b();
        boolean zM20629b2 = b2Var.m20629b();
        if ((zM20629b || zM20629b2) && !(zM20629b && zM20629b2 && this.f32705a.equals(b2Var.f32705a))) {
            return false;
        }
        boolean zM20630c = m20630c();
        boolean zM20630c2 = b2Var.m20630c();
        if ((zM20630c || zM20630c2) && !(zM20630c && zM20630c2 && this.f32708b.equals(b2Var.f32708b))) {
            return false;
        }
        boolean zM20631d = m20631d();
        boolean zM20631d2 = b2Var.m20631d();
        if ((zM20631d || zM20631d2) && !(zM20631d && zM20631d2 && this.f32709c.equals(b2Var.f32709c))) {
            return false;
        }
        boolean zM20632e = m20632e();
        boolean zM20632e2 = b2Var.m20632e();
        if ((zM20632e || zM20632e2) && !(zM20632e && zM20632e2 && this.f32707a == b2Var.f32707a)) {
            return false;
        }
        boolean zM20633f = m20633f();
        boolean zM20633f2 = b2Var.m20633f();
        if (zM20633f || zM20633f2) {
            return zM20633f && zM20633f2 && this.f32710d.equals(b2Var.f32710d);
        }
        return true;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) {
        m20624a();
        ipVar.mo20992i(f32698k);
        ipVar.cdj(f32701q);
        ipVar.mo20991h(this.f32704a);
        ipVar.o1t();
        if (this.f32705a != null) {
            ipVar.cdj(f32699n);
            ipVar.fn3e(this.f32705a);
            ipVar.o1t();
        }
        if (this.f32708b != null && m20630c()) {
            ipVar.cdj(f32697g);
            ipVar.fn3e(this.f32708b);
            ipVar.o1t();
        }
        if (this.f32709c != null && m20631d()) {
            ipVar.cdj(f32703y);
            ipVar.fn3e(this.f32709c);
            ipVar.o1t();
        }
        if (m20632e()) {
            ipVar.cdj(f32702s);
            ipVar.fu4(this.f32707a);
            ipVar.o1t();
        }
        if (this.f32710d != null && m20633f()) {
            ipVar.cdj(f32700p);
            ipVar.fn3e(this.f32710d);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b2 b2Var) {
        int iM21911n;
        int iLd6;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iZy;
        if (!getClass().equals(b2Var.getClass())) {
            return getClass().getName().compareTo(b2Var.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20626a()).compareTo(Boolean.valueOf(b2Var.m20626a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20626a() && (iZy = vh.zy(this.f32704a, b2Var.f32704a)) != 0) {
            return iZy;
        }
        int iCompareTo2 = Boolean.valueOf(m20629b()).compareTo(Boolean.valueOf(b2Var.m20629b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20629b() && (iM21911n4 = vh.m21911n(this.f32705a, b2Var.f32705a)) != 0) {
            return iM21911n4;
        }
        int iCompareTo3 = Boolean.valueOf(m20630c()).compareTo(Boolean.valueOf(b2Var.m20630c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m20630c() && (iM21911n3 = vh.m21911n(this.f32708b, b2Var.f32708b)) != 0) {
            return iM21911n3;
        }
        int iCompareTo4 = Boolean.valueOf(m20631d()).compareTo(Boolean.valueOf(b2Var.m20631d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m20631d() && (iM21911n2 = vh.m21911n(this.f32709c, b2Var.f32709c)) != 0) {
            return iM21911n2;
        }
        int iCompareTo5 = Boolean.valueOf(m20632e()).compareTo(Boolean.valueOf(b2Var.m20632e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m20632e() && (iLd6 = vh.ld6(this.f32707a, b2Var.f32707a)) != 0) {
            return iLd6;
        }
        int iCompareTo6 = Boolean.valueOf(m20633f()).compareTo(Boolean.valueOf(b2Var.m20633f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (!m20633f() || (iM21911n = vh.m21911n(this.f32710d, b2Var.f32710d)) == 0) {
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
                break;
            }
            short s2 = vcVarMo20994n.f73704zy;
            if (s2 != 1) {
                if (s2 != 2) {
                    if (s2 != 3) {
                        if (s2 != 4) {
                            if (s2 != 5) {
                                if (s2 != 7) {
                                    koj.m21140k(ipVar, b2);
                                } else if (b2 == 11) {
                                    this.f32710d = ipVar.mo20995p();
                                } else {
                                    koj.m21140k(ipVar, b2);
                                }
                            } else if (b2 == 2) {
                                this.f32707a = ipVar.mo21000z();
                                m20628b(true);
                            } else {
                                koj.m21140k(ipVar, b2);
                            }
                        } else if (b2 == 11) {
                            this.f32709c = ipVar.mo20995p();
                        } else {
                            koj.m21140k(ipVar, b2);
                        }
                    } else if (b2 == 11) {
                        this.f32708b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                } else if (b2 == 11) {
                    this.f32705a = ipVar.mo20995p();
                } else {
                    koj.m21140k(ipVar, b2);
                }
            } else if (b2 == 10) {
                this.f32704a = ipVar.mo20996q();
                m20625a(true);
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
        ipVar.jk();
        if (m20626a()) {
            m20624a();
            return;
        }
        throw new dbf("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a */
    public void m20624a() throws dbf {
        if (this.f32705a != null) {
            return;
        }
        throw new dbf("Required field 'userId' was not present! Struct: " + toString());
    }
}
