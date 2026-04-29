package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k4jz implements oaex<k4jz, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: k */
    private static final s31 f33111k = new s31("XmPushActionCustomConfig");

    /* JADX INFO: renamed from: q */
    private static final vc f33112q = new vc("", com.google.common.base.zy.f68111cdj, 1);

    /* JADX INFO: renamed from: a */
    public List<anhx> f33113a;

    /* JADX INFO: renamed from: a */
    public List<anhx> m21063a() {
        return this.f33113a;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21064a();
        ipVar.mo20992i(f33111k);
        if (this.f33113a != null) {
            ipVar.cdj(f33112q);
            ipVar.ki(new izu(com.google.common.base.zy.f68128n7h, this.f33113a.size()));
            Iterator<anhx> it = this.f33113a.iterator();
            while (it.hasNext()) {
                it.next().mo20561b(ipVar);
            }
            ipVar.mcp();
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof k4jz)) {
            return m21066a((k4jz) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        List<anhx> list = this.f33113a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21065a() {
        return this.f33113a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21066a(k4jz k4jzVar) {
        if (k4jzVar == null) {
            return false;
        }
        boolean zM21065a = m21065a();
        boolean zM21065a2 = k4jzVar.m21065a();
        if (zM21065a || zM21065a2) {
            return zM21065a && zM21065a2 && this.f33113a.equals(k4jzVar.f33113a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k4jz k4jzVar) {
        int iF7l8;
        if (!getClass().equals(k4jzVar.getClass())) {
            return getClass().getName().compareTo(k4jzVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21065a()).compareTo(Boolean.valueOf(k4jzVar.m21065a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m21065a() || (iF7l8 = vh.f7l8(this.f33113a, k4jzVar.f33113a)) == 0) {
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
                m21064a();
                return;
            }
            if (vcVarMo20994n.f73704zy != 1) {
                koj.m21140k(ipVar, b2);
            } else if (b2 == 15) {
                izu izuVarMo20990g = ipVar.mo20990g();
                this.f33113a = new ArrayList(izuVarMo20990g.f73378toq);
                for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                    anhx anhxVar = new anhx();
                    anhxVar.mo20557a(ipVar);
                    this.f33113a.add(anhxVar);
                }
                ipVar.jp0y();
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21064a() throws dbf {
        if (this.f33113a != null) {
            return;
        }
        throw new dbf("Required field 'customConfigs' was not present! Struct: " + toString());
    }
}
