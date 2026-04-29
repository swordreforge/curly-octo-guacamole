package com.market.sdk;

/* JADX INFO: compiled from: Singleton.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o1t<T> {

    /* JADX INFO: renamed from: k */
    private T f28110k;

    /* JADX INFO: renamed from: k */
    protected abstract T mo17339k();

    public final T toq() {
        T t2;
        synchronized (this) {
            if (this.f28110k == null) {
                this.f28110k = mo17339k();
            }
            t2 = this.f28110k;
        }
        return t2;
    }
}
