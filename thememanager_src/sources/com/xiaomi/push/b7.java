package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b7 implements oaex<b7, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: k */
    private static final s31 f32711k = new s31("ClientUploadData");

    /* JADX INFO: renamed from: q */
    private static final vc f32712q = new vc("", com.google.common.base.zy.f68111cdj, 1);

    /* JADX INFO: renamed from: a */
    public List<kl7m> f32713a;

    /* JADX INFO: renamed from: a */
    public int m20635a() {
        List<kl7m> list = this.f32713a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20637a();
        ipVar.mo20992i(f32711k);
        if (this.f32713a != null) {
            ipVar.cdj(f32712q);
            ipVar.ki(new izu(com.google.common.base.zy.f68128n7h, this.f32713a.size()));
            Iterator<kl7m> it = this.f32713a.iterator();
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
        if (obj != null && (obj instanceof b7)) {
            return m20640a((b7) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        List<kl7m> list = this.f32713a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m20638a(kl7m kl7mVar) {
        if (this.f32713a == null) {
            this.f32713a = new ArrayList();
        }
        this.f32713a.add(kl7mVar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m20639a() {
        return this.f32713a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20640a(b7 b7Var) {
        if (b7Var == null) {
            return false;
        }
        boolean zM20639a = m20639a();
        boolean zM20639a2 = b7Var.m20639a();
        if (zM20639a || zM20639a2) {
            return zM20639a && zM20639a2 && this.f32713a.equals(b7Var.f32713a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b7 b7Var) {
        int iF7l8;
        if (!getClass().equals(b7Var.getClass())) {
            return getClass().getName().compareTo(b7Var.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20639a()).compareTo(Boolean.valueOf(b7Var.m20639a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m20639a() || (iF7l8 = vh.f7l8(this.f32713a, b7Var.f32713a)) == 0) {
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
                m20637a();
                return;
            }
            if (vcVarMo20994n.f73704zy != 1) {
                koj.m21140k(ipVar, b2);
            } else if (b2 == 15) {
                izu izuVarMo20990g = ipVar.mo20990g();
                this.f32713a = new ArrayList(izuVarMo20990g.f73378toq);
                for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                    kl7m kl7mVar = new kl7m();
                    kl7mVar.mo20557a(ipVar);
                    this.f32713a.add(kl7mVar);
                }
                ipVar.jp0y();
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20637a() throws dbf {
        if (this.f32713a != null) {
            return;
        }
        throw new dbf("Required field 'uploadDataItems' was not present! Struct: " + toString());
    }
}
