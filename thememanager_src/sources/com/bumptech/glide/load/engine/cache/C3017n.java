package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.C2968k;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.n */
/* JADX INFO: compiled from: DiskLruCacheWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3017n implements InterfaceC3016k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f62733f7l8 = 1;

    /* JADX INFO: renamed from: g */
    private static final String f18296g = "DiskLruCacheWrapper";

    /* JADX INFO: renamed from: s */
    private static C3017n f18297s = null;

    /* JADX INFO: renamed from: y */
    private static final int f18298y = 1;

    /* JADX INFO: renamed from: n */
    private C2968k f18300n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final File f62734toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f62735zy;

    /* JADX INFO: renamed from: q */
    private final zy f18301q = new zy();

    /* JADX INFO: renamed from: k */
    private final qrj f18299k = new qrj();

    @Deprecated
    protected C3017n(File file, long j2) {
        this.f62734toq = file;
        this.f62735zy = j2;
    }

    private synchronized void f7l8() {
        this.f18300n = null;
    }

    /* JADX INFO: renamed from: g */
    private synchronized C2968k m10718g() throws IOException {
        if (this.f18300n == null) {
            this.f18300n = C2968k.was(this.f62734toq, 1, 1, this.f62735zy);
        }
        return this.f18300n;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public static synchronized InterfaceC3016k m10719n(File file, long j2) {
        if (f18297s == null) {
            f18297s = new C3017n(file, j2);
        }
        return f18297s;
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC3016k m10720q(File file, long j2) {
        return new C3017n(file, j2);
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3016k
    public synchronized void clear() {
        try {
            try {
                m10718g().hyr();
            } catch (IOException e2) {
                if (Log.isLoggable(f18296g, 5)) {
                    Log.w(f18296g, "Unable to clear disk cache or disk cache cleared externally", e2);
                }
            }
        } finally {
            f7l8();
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3016k
    /* JADX INFO: renamed from: k */
    public void mo10711k(com.bumptech.glide.load.f7l8 f7l8Var, InterfaceC3016k.toq toqVar) {
        C2968k c2968kM10718g;
        String qVar = this.f18299k.toq(f7l8Var);
        this.f18301q.m10735k(qVar);
        try {
            if (Log.isLoggable(f18296g, 2)) {
                Log.v(f18296g, "Put: Obtained: " + qVar + " for for Key: " + f7l8Var);
            }
            try {
                c2968kM10718g = m10718g();
            } catch (IOException e2) {
                if (Log.isLoggable(f18296g, 5)) {
                    Log.w(f18296g, "Unable to put to disk cache", e2);
                }
            }
            if (c2968kM10718g.a98o(qVar) != null) {
                return;
            }
            C2968k.zy zyVarYz = c2968kM10718g.yz(qVar);
            if (zyVarYz == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + qVar);
            }
            try {
                if (toqVar.mo10712k(zyVarYz.m10566g(0))) {
                    zyVarYz.m10568n();
                }
                zyVarYz.toq();
            } catch (Throwable th) {
                zyVarYz.toq();
                throw th;
            }
        } finally {
            this.f18301q.toq(qVar);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3016k
    public File toq(com.bumptech.glide.load.f7l8 f7l8Var) {
        String qVar = this.f18299k.toq(f7l8Var);
        if (Log.isLoggable(f18296g, 2)) {
            Log.v(f18296g, "Get: Obtained: " + qVar + " for for Key: " + f7l8Var);
        }
        try {
            C2968k.n nVarA98o = m10718g().a98o(qVar);
            if (nVarA98o != null) {
                return nVarA98o.toq(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable(f18296g, 5)) {
                return null;
            }
            Log.w(f18296g, "Unable to get from disk cache", e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3016k
    public void zy(com.bumptech.glide.load.f7l8 f7l8Var) {
        try {
            m10718g().ij(this.f18299k.toq(f7l8Var));
        } catch (IOException e2) {
            if (Log.isLoggable(f18296g, 5)) {
                Log.w(f18296g, "Unable to delete from disk cache", e2);
            }
        }
    }
}
