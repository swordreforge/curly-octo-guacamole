package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m2t implements oaex<m2t, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public String f33399a;

    /* JADX INFO: renamed from: a */
    public List<C5955w> f33400a;

    /* JADX INFO: renamed from: b */
    public String f33401b;

    /* JADX INFO: renamed from: k */
    private static final s31 f33396k = new s31("StatsEvents");

    /* JADX INFO: renamed from: q */
    private static final vc f33398q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f33397n = new vc("", com.google.common.base.zy.f68132qrj, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f33395g = new vc("", com.google.common.base.zy.f68111cdj, 3);

    public m2t() {
    }

    /* JADX INFO: renamed from: a */
    public boolean m21264a() {
        return this.f33399a != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21266b() {
        return this.f33401b != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m21267c() {
        return this.f33400a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof m2t)) {
            return m21265a((m2t) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        String str = this.f33399a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m21266b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f33401b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<C5955w> list = this.f33400a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    public m2t(String str, List<C5955w> list) {
        this();
        this.f33399a = str;
        this.f33400a = list;
    }

    /* JADX INFO: renamed from: a */
    public m2t m21262a(String str) {
        this.f33401b = str;
        return this;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) {
        m21263a();
        ipVar.mo20992i(f33396k);
        if (this.f33399a != null) {
            ipVar.cdj(f33398q);
            ipVar.fn3e(this.f33399a);
            ipVar.o1t();
        }
        if (this.f33401b != null && m21266b()) {
            ipVar.cdj(f33397n);
            ipVar.fn3e(this.f33401b);
            ipVar.o1t();
        }
        if (this.f33400a != null) {
            ipVar.cdj(f33395g);
            ipVar.ki(new izu(com.google.common.base.zy.f68128n7h, this.f33400a.size()));
            Iterator<C5955w> it = this.f33400a.iterator();
            while (it.hasNext()) {
                it.next().mo20561b(ipVar);
            }
            ipVar.mcp();
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public boolean m21265a(m2t m2tVar) {
        if (m2tVar == null) {
            return false;
        }
        boolean zM21264a = m21264a();
        boolean zM21264a2 = m2tVar.m21264a();
        if ((zM21264a || zM21264a2) && !(zM21264a && zM21264a2 && this.f33399a.equals(m2tVar.f33399a))) {
            return false;
        }
        boolean zM21266b = m21266b();
        boolean zM21266b2 = m2tVar.m21266b();
        if ((zM21266b || zM21266b2) && !(zM21266b && zM21266b2 && this.f33401b.equals(m2tVar.f33401b))) {
            return false;
        }
        boolean zM21267c = m21267c();
        boolean zM21267c2 = m2tVar.m21267c();
        if (zM21267c || zM21267c2) {
            return zM21267c && zM21267c2 && this.f33400a.equals(m2tVar.f33400a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m2t m2tVar) {
        int iF7l8;
        int iM21911n;
        int iM21911n2;
        if (!getClass().equals(m2tVar.getClass())) {
            return getClass().getName().compareTo(m2tVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21264a()).compareTo(Boolean.valueOf(m2tVar.m21264a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21264a() && (iM21911n2 = vh.m21911n(this.f33399a, m2tVar.f33399a)) != 0) {
            return iM21911n2;
        }
        int iCompareTo2 = Boolean.valueOf(m21266b()).compareTo(Boolean.valueOf(m2tVar.m21266b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21266b() && (iM21911n = vh.m21911n(this.f33401b, m2tVar.f33401b)) != 0) {
            return iM21911n;
        }
        int iCompareTo3 = Boolean.valueOf(m21267c()).compareTo(Boolean.valueOf(m2tVar.m21267c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m21267c() || (iF7l8 = vh.f7l8(this.f33400a, m2tVar.f33400a)) == 0) {
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
                m21263a();
                return;
            }
            short s2 = vcVarMo20994n.f73704zy;
            if (s2 != 1) {
                if (s2 != 2) {
                    if (s2 != 3) {
                        koj.m21140k(ipVar, b2);
                    } else if (b2 == 15) {
                        izu izuVarMo20990g = ipVar.mo20990g();
                        this.f33400a = new ArrayList(izuVarMo20990g.f73378toq);
                        for (int i2 = 0; i2 < izuVarMo20990g.f73378toq; i2++) {
                            C5955w c5955w = new C5955w();
                            c5955w.mo20557a(ipVar);
                            this.f33400a.add(c5955w);
                        }
                        ipVar.jp0y();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                } else if (b2 == 11) {
                    this.f33401b = ipVar.mo20995p();
                } else {
                    koj.m21140k(ipVar, b2);
                }
            } else if (b2 == 11) {
                this.f33399a = ipVar.mo20995p();
            } else {
                koj.m21140k(ipVar, b2);
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21263a() throws dbf {
        if (this.f33399a != null) {
            if (this.f33400a != null) {
                return;
            }
            throw new dbf("Required field 'events' was not present! Struct: " + toString());
        }
        throw new dbf("Required field 'uuid' was not present! Struct: " + toString());
    }
}
