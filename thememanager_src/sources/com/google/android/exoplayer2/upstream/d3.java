package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes2.dex */
public interface d3 {

    /* JADX INFO: renamed from: k */
    public static final int f23000k = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f66835toq = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.d3$k */
    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class C3790k {

        /* JADX INFO: renamed from: k */
        public final int f23001k;

        /* JADX INFO: renamed from: q */
        public final int f23002q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f66836toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f66837zy;

        public C3790k(int i2, int i3, int i4, int i5) {
            this.f23001k = i2;
            this.f66836toq = i3;
            this.f66837zy = i4;
            this.f23002q = i5;
        }

        /* JADX INFO: renamed from: k */
        public boolean m13459k(int i2) {
            if (i2 == 1) {
                if (this.f23001k - this.f66836toq <= 1) {
                    return false;
                }
            } else if (this.f66837zy - this.f23002q <= 1) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.d3$q */
    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class C3791q {

        /* JADX INFO: renamed from: k */
        public final com.google.android.exoplayer2.source.ni7 f23003k;

        /* JADX INFO: renamed from: q */
        public final int f23004q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.wvg f66838toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final IOException f66839zy;

        public C3791q(com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar, IOException iOException, int i2) {
            this.f23003k = ni7Var;
            this.f66838toq = wvgVar;
            this.f66839zy = iOException;
            this.f23004q = i2;
        }
    }

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        public final int f23005k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f66840toq;

        public toq(int i2, long j2) {
            C3844k.m13629k(j2 >= 0);
            this.f23005k = i2;
            this.f66840toq = j2;
        }
    }

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    /* JADX INFO: renamed from: k */
    long mo13457k(C3791q c3791q);

    /* JADX INFO: renamed from: q */
    default void m13458q(long j2) {
    }

    int toq(int i2);

    @zy.dd
    toq zy(C3790k c3790k, C3791q c3791q);
}
