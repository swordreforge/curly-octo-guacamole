package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class vg implements oaex<vg, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: k */
    private static final s31 f34031k = new s31("XmPushActionNormalConfig");

    /* JADX INFO: renamed from: q */
    private static final vc f34032q = new vc("", com.google.common.base.zy.f68111cdj, 1);

    /* JADX INFO: renamed from: a */
    public List<fh> f34033a;

    /* JADX INFO: renamed from: a */
    public List<fh> m21904a() {
        return this.f34033a;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m21905a();
        ipVar.mo20992i(f34031k);
        if (this.f34033a != null) {
            ipVar.cdj(f34032q);
            ipVar.ki(new izu(com.google.common.base.zy.f68128n7h, this.f34033a.size()));
            Iterator<fh> it = this.f34033a.iterator();
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
        if (obj != null && (obj instanceof vg)) {
            return m21907a((vg) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        List<fh> list = this.f34033a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21906a() {
        return this.f34033a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21907a(vg vgVar) {
        if (vgVar == null) {
            return false;
        }
        boolean zM21906a = m21906a();
        boolean zM21906a2 = vgVar.m21906a();
        if (zM21906a || zM21906a2) {
            return zM21906a && zM21906a2 && this.f34033a.equals(vgVar.f34033a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(vg vgVar) {
        int iF7l8;
        if (!getClass().equals(vgVar.getClass())) {
            return getClass().getName().compareTo(vgVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21906a()).compareTo(Boolean.valueOf(vgVar.m21906a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m21906a() || (iF7l8 = vh.f7l8(this.f34033a, vgVar.f34033a)) == 0) {
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
                m21905a();
                return;
            }
            if (vcVarMo20994n.f73704zy != 1) {
                koj.m21140k(ipVar, b2);
            } else if (b2 == 15) {
                izu izuVarMo20990g = ipVar.mo20990g();
                this.f34033a = new ArrayList(izuVarMo20990g.f73378toq);
                for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                    fh fhVar = new fh();
                    fhVar.mo20557a(ipVar);
                    this.f34033a.add(fhVar);
                }
                ipVar.jp0y();
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21905a() throws dbf {
        if (this.f34033a != null) {
            return;
        }
        throw new dbf("Required field 'normalConfigs' was not present! Struct: " + toString());
    }
}
