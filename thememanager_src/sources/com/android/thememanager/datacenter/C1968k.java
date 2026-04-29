package com.android.thememanager.datacenter;

/* JADX INFO: renamed from: com.android.thememanager.datacenter.k */
/* JADX INFO: compiled from: AsyncOperation.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1968k {

    /* JADX INFO: renamed from: k */
    private k f11150k;

    /* JADX INFO: renamed from: n */
    private p037u.toq f11151n;

    /* JADX INFO: renamed from: q */
    private volatile Object f11152q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f58009toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Object f58010zy;

    /* JADX INFO: renamed from: com.android.thememanager.datacenter.k$k */
    /* JADX INFO: compiled from: AsyncOperation.java */
    public enum k {
        Insert,
        Delete,
        Query,
        Update,
        InsertList,
        DeleteList
    }

    public C1968k(k type, Object obj, p037u.toq consumer) {
        this.f11150k = type;
        this.f58010zy = obj;
        this.f11151n = consumer;
    }

    public void f7l8(Object object) {
        this.f58010zy = object;
    }

    /* JADX INFO: renamed from: g */
    public void m7716g(p037u.toq consumer) {
        this.f11151n = consumer;
    }

    /* JADX INFO: renamed from: k */
    public p037u.toq m7717k() {
        return this.f11151n;
    }

    /* JADX INFO: renamed from: n */
    public k m7718n() {
        return this.f11150k;
    }

    /* JADX INFO: renamed from: p */
    public void m7719p(k type) {
        this.f11150k = type;
    }

    /* JADX INFO: renamed from: q */
    public int m7720q() {
        return this.f58009toq;
    }

    /* JADX INFO: renamed from: s */
    public void m7721s(int sequenceNum) {
        this.f58009toq = sequenceNum;
    }

    public Object toq() {
        return this.f58010zy;
    }

    /* JADX INFO: renamed from: y */
    public void m7722y(Object result) {
        this.f11152q = result;
    }

    public Object zy() {
        return this.f11152q;
    }
}
