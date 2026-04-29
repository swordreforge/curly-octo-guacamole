package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class f7z0 implements oaex<f7z0, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f32898a;

    /* JADX INFO: renamed from: a */
    public sc f32899a;

    /* JADX INFO: renamed from: a */
    public String f32900a;

    /* JADX INFO: renamed from: a */
    private BitSet f32901a = new BitSet(1);

    /* JADX INFO: renamed from: k */
    private static final s31 f32895k = new s31("DataCollectionItem");

    /* JADX INFO: renamed from: q */
    private static final vc f32897q = new vc("", (byte) 10, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32896n = new vc("", (byte) 8, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f32894g = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: a */
    public f7z0 m20837a(long j2) {
        this.f32898a = j2;
        m20842a(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20845b() {
        return this.f32899a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20846c() {
        return this.f32900a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof f7z0)) {
            return m20844a((f7z0) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(");
        sb.append("collectedAt:");
        sb.append(this.f32898a);
        sb.append(", ");
        sb.append("collectionType:");
        sc scVar = this.f32899a;
        if (scVar == null) {
            sb.append("null");
        } else {
            sb.append(scVar);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f32900a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20841a();
        ipVar.mo20992i(f32895k);
        ipVar.cdj(f32897q);
        ipVar.mo20991h(this.f32898a);
        ipVar.o1t();
        if (this.f32899a != null) {
            ipVar.cdj(f32896n);
            ipVar.kja0(this.f32899a.m21468a());
            ipVar.o1t();
        }
        if (this.f32900a != null) {
            ipVar.cdj(f32894g);
            ipVar.fn3e(this.f32900a);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m20843a() {
        return this.f32901a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m20842a(boolean z2) {
        this.f32901a.set(0, z2);
    }

    /* JADX INFO: renamed from: a */
    public f7z0 m20838a(sc scVar) {
        this.f32899a = scVar;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m20840a() {
        return this.f32900a;
    }

    /* JADX INFO: renamed from: a */
    public f7z0 m20839a(String str) {
        this.f32900a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20844a(f7z0 f7z0Var) {
        if (f7z0Var == null || this.f32898a != f7z0Var.f32898a) {
            return false;
        }
        boolean zM20845b = m20845b();
        boolean zM20845b2 = f7z0Var.m20845b();
        if ((zM20845b || zM20845b2) && !(zM20845b && zM20845b2 && this.f32899a.equals(f7z0Var.f32899a))) {
            return false;
        }
        boolean zM20846c = m20846c();
        boolean zM20846c2 = f7z0Var.m20846c();
        if (zM20846c || zM20846c2) {
            return zM20846c && zM20846c2 && this.f32900a.equals(f7z0Var.f32900a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f7z0 f7z0Var) {
        int iM21911n;
        int iM21913q;
        int iZy;
        if (!getClass().equals(f7z0Var.getClass())) {
            return getClass().getName().compareTo(f7z0Var.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20843a()).compareTo(Boolean.valueOf(f7z0Var.m20843a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20843a() && (iZy = vh.zy(this.f32898a, f7z0Var.f32898a)) != 0) {
            return iZy;
        }
        int iCompareTo2 = Boolean.valueOf(m20845b()).compareTo(Boolean.valueOf(f7z0Var.m20845b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20845b() && (iM21913q = vh.m21913q(this.f32899a, f7z0Var.f32899a)) != 0) {
            return iM21913q;
        }
        int iCompareTo3 = Boolean.valueOf(m20846c()).compareTo(Boolean.valueOf(f7z0Var.m20846c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m20846c() || (iM21911n = vh.m21911n(this.f32900a, f7z0Var.f32900a)) == 0) {
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
                break;
            }
            short s2 = vcVarMo20994n.f73704zy;
            if (s2 != 1) {
                if (s2 != 2) {
                    if (s2 != 3) {
                        koj.m21140k(ipVar, b2);
                    } else if (b2 == 11) {
                        this.f32900a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                } else if (b2 == 8) {
                    this.f32899a = sc.m21467a(ipVar.zy());
                } else {
                    koj.m21140k(ipVar, b2);
                }
            } else if (b2 == 10) {
                this.f32898a = ipVar.mo20996q();
                m20842a(true);
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
        ipVar.jk();
        if (m20843a()) {
            m20841a();
            return;
        }
        throw new dbf("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a */
    public void m20841a() throws dbf {
        if (this.f32899a != null) {
            if (this.f32900a != null) {
                return;
            }
            throw new dbf("Required field 'content' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'collectionType' was not present! Struct: " + toString());
    }
}
