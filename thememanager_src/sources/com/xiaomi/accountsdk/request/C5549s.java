package com.xiaomi.accountsdk.request;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.request.s */
/* JADX INFO: compiled from: IPInfos.java */
/* JADX INFO: loaded from: classes3.dex */
class C5549s {

    /* JADX INFO: renamed from: k */
    private Map<k, List<String>> f30975k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Map<k, Long> f72943toq = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.s$k */
    /* JADX INFO: compiled from: IPInfos.java */
    static class k {

        /* JADX INFO: renamed from: k */
        final String f30976k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final String f72944toq;

        k(String str, String str2) {
            this.f30976k = str;
            this.f72944toq = str2;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return TextUtils.equals(this.f30976k, kVar.f30976k) && TextUtils.equals(this.f72944toq, kVar.f72944toq);
        }

        public int hashCode() {
            String str = this.f30976k;
            if (str == null && this.f72944toq == null) {
                return 987665155;
            }
            return (str == null || this.f72944toq == null) ? str != null ? str.hashCode() : this.f72944toq.hashCode() : str.hashCode() + this.f72944toq.hashCode();
        }
    }

    C5549s() {
    }

    /* JADX INFO: renamed from: g */
    void m18992g(k kVar, long j2) {
        if (kVar == null) {
            return;
        }
        this.f72943toq.put(kVar, Long.valueOf(j2));
    }

    /* JADX INFO: renamed from: k */
    String m18993k(k kVar) {
        List<String> qVar;
        if (kVar == null || (qVar = toq(kVar)) == null || qVar.size() <= 0) {
            return null;
        }
        return qVar.get(0);
    }

    /* JADX INFO: renamed from: n */
    void m18994n(k kVar, List<String> list) {
        if (kVar == null) {
            return;
        }
        if (list == null) {
            this.f30975k.remove(kVar);
        } else {
            this.f30975k.put(kVar, list);
        }
    }

    /* JADX INFO: renamed from: q */
    void m18995q(k kVar, String str) {
        if (kVar == null) {
            return;
        }
        if (str == null) {
            this.f30975k.remove(kVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.f30975k.put(kVar, arrayList);
    }

    List<String> toq(k kVar) {
        if (kVar == null) {
            return null;
        }
        return this.f30975k.get(kVar);
    }

    Long zy(k kVar) {
        if (kVar == null) {
            return null;
        }
        return this.f72943toq.get(kVar);
    }
}
