package com.android.thememanager.baselib.network;

import android.util.SparseArray;
import java.util.concurrent.Executor;
import okhttp3.C7529t;
import retrofit2.converter.gson.C7632k;
import retrofit2.fn3e;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.baselib.network.k */
/* JADX INFO: compiled from: AbstractNetworkManager.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1683k {

    /* JADX INFO: renamed from: k */
    private volatile C7529t f9632k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final SparseArray<fn3e> f57420toq = new SparseArray<>();

    protected C7529t f7l8() {
        if (this.f9632k == null) {
            synchronized (this) {
                if (this.f9632k == null) {
                    this.f9632k = mo6570k();
                }
            }
        }
        return this.f9632k;
    }

    /* JADX INFO: renamed from: g */
    protected abstract String mo6569g();

    /* JADX INFO: renamed from: k */
    protected abstract C7529t mo6570k();

    /* JADX INFO: renamed from: n */
    public <T> T m6571n(Class<T> cls, Executor executor) {
        return (T) m6572q(cls, mo6569g(), executor);
    }

    /* JADX INFO: renamed from: q */
    protected <T> T m6572q(Class<T> cls, String str, Executor executor) {
        int iHashCode = str.hashCode();
        if (executor != null) {
            iHashCode += executor.hashCode();
        }
        fn3e fn3eVar = this.f57420toq.get(iHashCode);
        if (fn3eVar == null) {
            synchronized (this.f57420toq) {
                fn3eVar = this.f57420toq.get(iHashCode);
                if (fn3eVar == null) {
                    fn3e.toq qVar = new fn3e.toq().zy(str).m27968p(f7l8()).toq(mo6573y());
                    if (executor != null) {
                        qVar.m27970s(executor);
                    }
                    fn3e fn3eVarM27965g = qVar.m27965g();
                    this.f57420toq.put(iHashCode, fn3eVarM27965g);
                    if (this.f57420toq.size() > 4) {
                        C7794k.f7l8("Retrofit instance too more: " + this.f57420toq.size());
                    }
                    fn3eVar = fn3eVarM27965g;
                }
            }
        }
        return (T) fn3eVar.f7l8(cls);
    }

    public <T> T toq(Class<T> cls) {
        return (T) zy(cls, mo6569g());
    }

    /* JADX INFO: renamed from: y */
    protected C7632k mo6573y() {
        return C7632k.m27949g();
    }

    protected <T> T zy(Class<T> cls, String str) {
        return (T) m6572q(cls, str, null);
    }
}
