package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.tfm;
import java.io.IOException;

/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public interface fti {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.fti$k */
    /* JADX INFO: compiled from: MediaSource.java */
    public static final class C3596k extends a9 {
        public C3596k(Object obj) {
            super(obj);
        }

        @Override // com.google.android.exoplayer2.source.a9
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C3596k toq(long j2) {
            return new C3596k(super.toq(j2));
        }

        @Override // com.google.android.exoplayer2.source.a9
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3596k mo12557k(Object obj) {
            return new C3596k(super.mo12557k(obj));
        }

        public C3596k(Object obj, long j2) {
            super(obj, j2);
        }

        public C3596k(Object obj, long j2, int i2) {
            super(obj, j2, i2);
        }

        public C3596k(Object obj, int i2, int i3, long j2) {
            super(obj, i2, i3, j2);
        }

        public C3596k(a9 a9Var) {
            super(a9Var);
        }
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public interface toq {
        /* JADX INFO: renamed from: s */
        void mo12410s(fti ftiVar, pc pcVar);
    }

    void f7l8(toq toqVar, @zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var);

    /* JADX INFO: renamed from: g */
    void mo12564g(jk jkVar);

    @zy.dd
    /* JADX INFO: renamed from: h */
    default pc mo12713h() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    jk mo12565k(C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2);

    default boolean kja0() {
        return true;
    }

    /* JADX INFO: renamed from: n */
    tfm mo12566n();

    void n7h() throws IOException;

    /* JADX INFO: renamed from: p */
    void mo12714p(toq toqVar);

    /* JADX INFO: renamed from: q */
    void mo12715q(lvui lvuiVar);

    void qrj(InterfaceC3312i interfaceC3312i);

    void toq(toq toqVar);

    void x2(Handler handler, InterfaceC3312i interfaceC3312i);

    /* JADX INFO: renamed from: y */
    void mo12716y(toq toqVar);

    void zy(Handler handler, lvui lvuiVar);
}
