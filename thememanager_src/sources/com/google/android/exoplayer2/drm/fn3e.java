package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.drm.fn3e;
import com.google.android.exoplayer2.drm.qrj;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;

/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes2.dex */
public interface fn3e {

    /* JADX INFO: renamed from: k */
    public static final fn3e f19654k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Deprecated
    public static final fn3e f63614toq;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.fn3e$k */
    /* JADX INFO: compiled from: DrmSessionManager.java */
    class C3307k implements fn3e {
        C3307k() {
        }

        @Override // com.google.android.exoplayer2.drm.fn3e
        @zy.dd
        /* JADX INFO: renamed from: k */
        public qrj mo11620k(Looper looper, @zy.dd InterfaceC3312i.k kVar, xwq3 xwq3Var) {
            if (xwq3Var.f23667c == null) {
                return null;
            }
            return new o1t(new qrj.C3318k(new x9kr(1), yqrt.ERROR_CODE_DRM_SCHEME_UNSUPPORTED));
        }

        @Override // com.google.android.exoplayer2.drm.fn3e
        public int toq(xwq3 xwq3Var) {
            return xwq3Var.f23667c != null ? 1 : 0;
        }
    }

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public interface toq {

        /* JADX INFO: renamed from: k */
        public static final toq f19655k = new toq() { // from class: com.google.android.exoplayer2.drm.zurt
            @Override // com.google.android.exoplayer2.drm.fn3e.toq
            public final void release() {
                fn3e.toq.m11622k();
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        static /* synthetic */ void m11622k() {
        }

        void release();
    }

    static {
        C3307k c3307k = new C3307k();
        f19654k = c3307k;
        f63614toq = c3307k;
    }

    @Deprecated
    static fn3e zy() {
        return f19654k;
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    qrj mo11620k(Looper looper, @zy.dd InterfaceC3312i.k kVar, xwq3 xwq3Var);

    default void prepare() {
    }

    /* JADX INFO: renamed from: q */
    default toq mo11621q(Looper looper, @zy.dd InterfaceC3312i.k kVar, xwq3 xwq3Var) {
        return toq.f19655k;
    }

    default void release() {
    }

    int toq(xwq3 xwq3Var);
}
