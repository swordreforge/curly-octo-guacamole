package com.android.thememanager.datacenter;

import bo.C1377k;
import bo.toq;
import com.android.thememanager.C2082k;
import p037u.InterfaceC7679q;

/* JADX INFO: renamed from: com.android.thememanager.datacenter.g */
/* JADX INFO: compiled from: LogFacade.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1967g implements InterfaceC7679q<String> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f58007toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static C1967g f58008zy;

    /* JADX INFO: renamed from: k */
    private zy f11149k;

    private C1967g() {
        zy();
    }

    /* JADX INFO: renamed from: g */
    public static synchronized boolean m7712g() {
        return toq().f11149k.m7734i();
    }

    /* JADX INFO: renamed from: n */
    public static void m7713n(String msg) {
        toq().mo7714k(msg);
    }

    private static synchronized C1967g toq() {
        if (f58008zy == null) {
            f58008zy = new C1967g();
            new f7l8(C2082k.zy().toq()).m7711k();
        }
        return f58008zy;
    }

    @Override // p037u.InterfaceC7679q
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public synchronized void mo7714k(String msg) {
        if (msg != null) {
            if (!msg.isEmpty()) {
                this.f11149k.n7h(new C1377k(System.currentTimeMillis(), msg));
            }
        }
    }

    public void zy() {
        this.f11149k = C1970q.m7725k(new toq.C1378k().toq(), 1);
    }
}
