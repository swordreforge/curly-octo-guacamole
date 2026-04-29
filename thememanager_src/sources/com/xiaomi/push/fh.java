package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class fh implements oaex<fh, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f32926a;

    /* JADX INFO: renamed from: a */
    public le7 f32927a;

    /* JADX INFO: renamed from: a */
    private BitSet f32928a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public List<anhx> f32929a;

    /* JADX INFO: renamed from: k */
    private static final s31 f32923k = new s31("NormalConfig");

    /* JADX INFO: renamed from: q */
    private static final vc f32925q = new vc("", (byte) 8, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32924n = new vc("", com.google.common.base.zy.f68111cdj, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f32922g = new vc("", (byte) 8, 3);

    /* JADX INFO: renamed from: a */
    public int m20863a() {
        return this.f32926a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m20870b() {
        return this.f32929a != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m20871c() {
        return this.f32927a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fh)) {
            return m20869a((fh) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.f32926a);
        sb.append(", ");
        sb.append("configItems:");
        List<anhx> list = this.f32929a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (m20871c()) {
            sb.append(", ");
            sb.append("type:");
            le7 le7Var = this.f32927a;
            if (le7Var == null) {
                sb.append("null");
            } else {
                sb.append(le7Var);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m20868a() {
        return this.f32928a.get(0);
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20866a();
        ipVar.mo20992i(f32923k);
        ipVar.cdj(f32925q);
        ipVar.kja0(this.f32926a);
        ipVar.o1t();
        if (this.f32929a != null) {
            ipVar.cdj(f32924n);
            ipVar.ki(new izu(com.google.common.base.zy.f68128n7h, this.f32929a.size()));
            Iterator<anhx> it = this.f32929a.iterator();
            while (it.hasNext()) {
                it.next().mo20561b(ipVar);
            }
            ipVar.mcp();
            ipVar.o1t();
        }
        if (this.f32927a != null && m20871c()) {
            ipVar.cdj(f32922g);
            ipVar.kja0(this.f32927a.m21155a());
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public void m20867a(boolean z2) {
        this.f32928a.set(0, z2);
    }

    /* JADX INFO: renamed from: a */
    public le7 m20865a() {
        return this.f32927a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20869a(fh fhVar) {
        if (fhVar == null || this.f32926a != fhVar.f32926a) {
            return false;
        }
        boolean zM20870b = m20870b();
        boolean zM20870b2 = fhVar.m20870b();
        if ((zM20870b || zM20870b2) && !(zM20870b && zM20870b2 && this.f32929a.equals(fhVar.f32929a))) {
            return false;
        }
        boolean zM20871c = m20871c();
        boolean zM20871c2 = fhVar.m20871c();
        if (zM20871c || zM20871c2) {
            return zM20871c && zM20871c2 && this.f32927a.equals(fhVar.f32927a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fh fhVar) {
        int iM21913q;
        int iF7l8;
        int qVar;
        if (!getClass().equals(fhVar.getClass())) {
            return getClass().getName().compareTo(fhVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20868a()).compareTo(Boolean.valueOf(fhVar.m20868a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20868a() && (qVar = vh.toq(this.f32926a, fhVar.f32926a)) != 0) {
            return qVar;
        }
        int iCompareTo2 = Boolean.valueOf(m20870b()).compareTo(Boolean.valueOf(fhVar.m20870b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20870b() && (iF7l8 = vh.f7l8(this.f32929a, fhVar.f32929a)) != 0) {
            return iF7l8;
        }
        int iCompareTo3 = Boolean.valueOf(m20871c()).compareTo(Boolean.valueOf(fhVar.m20871c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m20871c() || (iM21913q = vh.m21913q(this.f32927a, fhVar.f32927a)) == 0) {
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
                break;
            }
            short s2 = vcVarMo20994n.f73704zy;
            if (s2 != 1) {
                if (s2 != 2) {
                    if (s2 != 3) {
                        koj.m21140k(ipVar, b2);
                    } else if (b2 == 8) {
                        this.f32927a = le7.m21154a(ipVar.zy());
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                } else if (b2 == 15) {
                    izu izuVarMo20990g = ipVar.mo20990g();
                    this.f32929a = new ArrayList(izuVarMo20990g.f73378toq);
                    for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                        anhx anhxVar = new anhx();
                        anhxVar.mo20557a(ipVar);
                        this.f32929a.add(anhxVar);
                    }
                    ipVar.jp0y();
                } else {
                    koj.m21140k(ipVar, b2);
                }
            } else if (b2 == 8) {
                this.f32926a = ipVar.zy();
                m20867a(true);
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
        ipVar.jk();
        if (m20868a()) {
            m20866a();
            return;
        }
        throw new dbf("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    /* JADX INFO: renamed from: a */
    public void m20866a() throws dbf {
        if (this.f32929a != null) {
            return;
        }
        throw new dbf("Required field 'configItems' was not present! Struct: " + toString());
    }
}
