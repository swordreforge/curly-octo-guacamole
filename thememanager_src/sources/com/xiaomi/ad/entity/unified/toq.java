package com.xiaomi.ad.entity.unified;

import com.xiaomi.ad.entity.common.C5585n;
import com.xiaomi.ad.entity.common.C5586q;
import com.xiaomi.ad.entity.contract.AbstractC5589k;
import e5.InterfaceC5997k;
import java.util.List;
import u38j.C7681k;

/* JADX INFO: compiled from: UnifiedAdInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends AbstractC5589k {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final double f73018qrj = 1.0d;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f73019x2 = "UnifiedAdInfo";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC5997k
    private long f73020f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC5997k
    private long f31131g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC5997k
    private boolean f73021ld6;

    /* JADX INFO: renamed from: n */
    @InterfaceC5997k
    private String f31132n;

    /* JADX INFO: renamed from: p */
    @InterfaceC5997k
    private String f31133p;

    /* JADX INFO: renamed from: s */
    @InterfaceC5997k
    private List<C5586q> f31134s;

    /* JADX INFO: renamed from: y */
    @InterfaceC5997k
    private C5585n f31135y;

    private toq() {
    }

    /* JADX INFO: renamed from: p */
    public static final toq m19205p(String str) {
        return (toq) com.xiaomi.ad.entity.util.zy.zy(toq.class, str, f73019x2);
    }

    public C5586q.k cdj(C5586q c5586q, long j2) {
        List<C5586q.k> listN7h;
        if (c5586q != null && (listN7h = c5586q.n7h()) != null && !listN7h.isEmpty()) {
            for (C5586q.k kVar : listN7h) {
                if (kVar.m19189n() == j2) {
                    return kVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public C5586q.k m19206h(long j2, long j3) {
        if (n7h(j2) == null) {
            return null;
        }
        return m19206h(j2, j3);
    }

    /* JADX INFO: renamed from: i */
    public boolean m19207i() {
        long jKi = ki();
        long jX2 = x2();
        if (jKi > jX2) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f73021ld6 && jCurrentTimeMillis < jKi) {
            return false;
        }
        return jKi > jCurrentTimeMillis || jCurrentTimeMillis > jX2;
    }

    public long ki() {
        return this.f31131g;
    }

    public List<C5586q> kja0() {
        return C7681k.m28045k(this.f31134s);
    }

    public String ld6() {
        return this.f31133p;
    }

    public C5586q n7h(long j2) {
        List<C5586q> list = this.f31134s;
        if (list != null && !list.isEmpty()) {
            for (C5586q c5586q : this.f31134s) {
                if (c5586q != null && c5586q.getId() == j2) {
                    return c5586q;
                }
            }
        }
        return null;
    }

    public String qrj() {
        C5585n c5585n = this.f31135y;
        if (c5585n != null) {
            return c5585n.f31105k;
        }
        return null;
    }

    public String t8r() {
        return this.f31132n;
    }

    public long x2() {
        return this.f73020f7l8;
    }

    @Override // com.xiaomi.ad.entity.contract.zy
    /* JADX INFO: renamed from: y */
    protected String mo18161y() {
        return f73019x2;
    }
}
