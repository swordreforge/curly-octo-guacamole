package com.xiaomi.accountsdk.utils;

import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.t */
/* JADX INFO: compiled from: ServerTimeUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5578t {

    /* JADX INFO: renamed from: k */
    private static volatile k f31054k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final CopyOnWriteArraySet<toq> f72976toq = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.t$k */
    /* JADX INFO: compiled from: ServerTimeUtil.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo19079k(Date date);

        long toq();

        void zy(String str, String str2);
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.t$toq */
    /* JADX INFO: compiled from: ServerTimeUtil.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo19065k();
    }

    /* JADX INFO: renamed from: k */
    public static void m19135k(toq toqVar) {
        if (toqVar == null) {
            throw new IllegalArgumentException("listener == null");
        }
        f72976toq.add(toqVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m19136n(k kVar) {
        f31054k = kVar;
    }

    /* JADX INFO: renamed from: q */
    public static void m19137q(toq toqVar) {
        f72976toq.remove(toqVar);
    }

    public static k toq() {
        return f31054k;
    }

    public static void zy() {
        Iterator<toq> it = f72976toq.iterator();
        while (it.hasNext()) {
            it.next().mo19065k();
        }
    }
}
