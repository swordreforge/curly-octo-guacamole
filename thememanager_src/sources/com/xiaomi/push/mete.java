package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mete implements oaex<mete, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: k */
    private static final s31 f33419k = new s31("XmPushActionCollectData");

    /* JADX INFO: renamed from: q */
    private static final vc f33420q = new vc("", com.google.common.base.zy.f68111cdj, 1);

    /* JADX INFO: renamed from: a */
    public List<f7z0> f33421a;

    /* JADX INFO: renamed from: a */
    public mete m21285a(List<f7z0> list) {
        this.f33421a = list;
        return this;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21286a();
        ipVar.mo20992i(f33419k);
        if (this.f33421a != null) {
            ipVar.cdj(f33420q);
            ipVar.ki(new izu(com.google.common.base.zy.f68128n7h, this.f33421a.size()));
            Iterator<f7z0> it = this.f33421a.iterator();
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
        if (obj != null && (obj instanceof mete)) {
            return m21288a((mete) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(");
        sb.append("dataCollectionItems:");
        List<f7z0> list = this.f33421a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21287a() {
        return this.f33421a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21288a(mete meteVar) {
        if (meteVar == null) {
            return false;
        }
        boolean zM21287a = m21287a();
        boolean zM21287a2 = meteVar.m21287a();
        if (zM21287a || zM21287a2) {
            return zM21287a && zM21287a2 && this.f33421a.equals(meteVar.f33421a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(mete meteVar) {
        int iF7l8;
        if (!getClass().equals(meteVar.getClass())) {
            return getClass().getName().compareTo(meteVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21287a()).compareTo(Boolean.valueOf(meteVar.m21287a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m21287a() || (iF7l8 = vh.f7l8(this.f33421a, meteVar.f33421a)) == 0) {
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
                m21286a();
                return;
            }
            if (vcVarMo20994n.f73704zy != 1) {
                koj.m21140k(ipVar, b2);
            } else if (b2 == 15) {
                izu izuVarMo20990g = ipVar.mo20990g();
                this.f33421a = new ArrayList(izuVarMo20990g.f73378toq);
                for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                    f7z0 f7z0Var = new f7z0();
                    f7z0Var.mo20557a(ipVar);
                    this.f33421a.add(f7z0Var);
                }
                ipVar.jp0y();
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21286a() throws dbf {
        if (this.f33421a != null) {
            return;
        }
        throw new dbf("Required field 'dataCollectionItems' was not present! Struct: " + toString());
    }
}
