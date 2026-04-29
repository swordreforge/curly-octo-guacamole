package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public class sb1e implements oaex<sb1e, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f33623a;

    /* JADX INFO: renamed from: a */
    private BitSet f33624a = new BitSet(2);

    /* JADX INFO: renamed from: b */
    public int f33625b;

    /* JADX INFO: renamed from: k */
    private static final s31 f33620k = new s31("XmPushActionCheckClientInfo");

    /* JADX INFO: renamed from: q */
    private static final vc f33622q = new vc("", (byte) 8, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33621n = new vc("", (byte) 8, 2);

    /* JADX INFO: renamed from: a */
    public sb1e m21459a(int i2) {
        this.f33623a = i2;
        m21461a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m21460a() {
    }

    /* JADX INFO: renamed from: b */
    public sb1e m21464b(int i2) {
        this.f33625b = i2;
        m21465b(true);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof sb1e)) {
            return m21463a((sb1e) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f33623a + ", pluginConfigVersion:" + this.f33625b + ")";
    }

    /* JADX INFO: renamed from: a */
    public boolean m21462a() {
        return this.f33624a.get(0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m21466b() {
        return this.f33624a.get(1);
    }

    /* JADX INFO: renamed from: a */
    public void m21461a(boolean z2) {
        this.f33624a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public void m21465b(boolean z2) {
        this.f33624a.set(1, z2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m21463a(sb1e sb1eVar) {
        return sb1eVar != null && this.f33623a == sb1eVar.f33623a && this.f33625b == sb1eVar.f33625b;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) {
        m21460a();
        ipVar.mo20992i(f33620k);
        ipVar.cdj(f33622q);
        ipVar.kja0(this.f33623a);
        ipVar.o1t();
        ipVar.cdj(f33621n);
        ipVar.kja0(this.f33625b);
        ipVar.o1t();
        ipVar.wvg();
        ipVar.qrj();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(sb1e sb1eVar) {
        int qVar;
        int qVar2;
        if (!getClass().equals(sb1eVar.getClass())) {
            return getClass().getName().compareTo(sb1eVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21462a()).compareTo(Boolean.valueOf(sb1eVar.m21462a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21462a() && (qVar2 = vh.toq(this.f33623a, sb1eVar.f33623a)) != 0) {
            return qVar2;
        }
        int iCompareTo2 = Boolean.valueOf(m21466b()).compareTo(Boolean.valueOf(sb1eVar.m21466b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (!m21466b() || (qVar = vh.toq(this.f33625b, sb1eVar.f33625b)) == 0) {
            return 0;
        }
        return qVar;
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
                    koj.m21140k(ipVar, b2);
                } else if (b2 == 8) {
                    this.f33625b = ipVar.zy();
                    m21465b(true);
                } else {
                    koj.m21140k(ipVar, b2);
                }
            } else if (b2 == 8) {
                this.f33623a = ipVar.zy();
                m21461a(true);
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
        ipVar.jk();
        if (m21462a()) {
            if (m21466b()) {
                m21460a();
                return;
            }
            throw new dbf("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        throw new dbf("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
    }
}
