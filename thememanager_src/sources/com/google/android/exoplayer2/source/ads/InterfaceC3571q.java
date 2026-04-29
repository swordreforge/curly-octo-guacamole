package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.source.ads.f7l8;
import com.google.android.exoplayer2.upstream.t8r;
import java.io.IOException;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.q */
/* JADX INFO: compiled from: AdsLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3571q {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.q$k */
    /* JADX INFO: compiled from: AdsLoader.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        default void mo12571k(zy zyVar) {
        }

        /* JADX INFO: renamed from: q */
        default void mo12572q(f7l8.C3565k c3565k, t8r t8rVar) {
        }

        default void toq() {
        }

        default void zy() {
        }
    }

    /* JADX INFO: renamed from: g */
    void m12582g(int... iArr);

    /* JADX INFO: renamed from: k */
    void m12583k(f7l8 f7l8Var, int i2, int i3);

    /* JADX INFO: renamed from: n */
    void m12584n(f7l8 f7l8Var, k kVar);

    /* JADX INFO: renamed from: q */
    void m12585q(f7l8 f7l8Var, int i2, int i3, IOException iOException);

    void release();

    void toq(@dd gc3c gc3cVar);

    void zy(f7l8 f7l8Var, t8r t8rVar, Object obj, com.google.android.exoplayer2.ui.toq toqVar, k kVar);
}
