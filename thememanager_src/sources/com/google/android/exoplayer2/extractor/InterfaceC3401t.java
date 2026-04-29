package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.t */
/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3401t {

    /* JADX INFO: renamed from: k */
    public static final int f20166k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f64390toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f64391zy = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.t$k */
    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class k {

        /* JADX INFO: renamed from: k */
        public final int f20167k;

        /* JADX INFO: renamed from: q */
        public final int f20168q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final byte[] f64392toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f64393zy;

        public k(int i2, byte[] bArr, int i3, int i4) {
            this.f20167k = i2;
            this.f64392toq = bArr;
            this.f64393zy = i3;
            this.f20168q = i4;
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || k.class != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            return this.f20167k == kVar.f20167k && this.f64393zy == kVar.f64393zy && this.f20168q == kVar.f20168q && Arrays.equals(this.f64392toq, kVar.f64392toq);
        }

        public int hashCode() {
            return (((((this.f20167k * 31) + Arrays.hashCode(this.f64392toq)) * 31) + this.f64393zy) * 31) + this.f20168q;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.t$toq */
    /* JADX INFO: compiled from: TrackOutput.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: renamed from: g */
    void mo11928g(gvn7 gvn7Var, int i2, int i3);

    /* JADX INFO: renamed from: k */
    int mo11929k(com.google.android.exoplayer2.upstream.x2 x2Var, int i2, boolean z2, int i3) throws IOException;

    /* JADX INFO: renamed from: n */
    void mo11930n(long j2, int i2, int i3, int i4, @dd k kVar);

    /* JADX INFO: renamed from: q */
    void mo11931q(xwq3 xwq3Var);

    default int toq(com.google.android.exoplayer2.upstream.x2 x2Var, int i2, boolean z2) throws IOException {
        return mo11929k(x2Var, i2, z2, 0);
    }

    default void zy(gvn7 gvn7Var, int i2) {
        mo11928g(gvn7Var, i2, 0);
    }
}
