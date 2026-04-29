package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.C3548p;
import java.util.Arrays;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.g */
/* JADX INFO: compiled from: FixedFrameRateEstimator.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3870g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f67173f7l8 = 15;

    /* JADX INFO: renamed from: y */
    @yz
    static final long f23405y = 1000000;

    /* JADX INFO: renamed from: g */
    private int f23406g;

    /* JADX INFO: renamed from: q */
    private boolean f23409q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f67175zy;

    /* JADX INFO: renamed from: k */
    private k f23407k = new k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private k f67174toq = new k();

    /* JADX INFO: renamed from: n */
    private long f23408n = C3548p.f65257toq;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.g$k */
    /* JADX INFO: compiled from: FixedFrameRateEstimator.java */
    private static final class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final boolean[] f67176f7l8 = new boolean[15];

        /* JADX INFO: renamed from: g */
        private long f23410g;

        /* JADX INFO: renamed from: k */
        private long f23411k;

        /* JADX INFO: renamed from: n */
        private long f23412n;

        /* JADX INFO: renamed from: q */
        private long f23413q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f67177toq;

        /* JADX INFO: renamed from: y */
        private int f23414y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f67178zy;

        private static int zy(long j2) {
            return (int) (j2 % 15);
        }

        public void f7l8() {
            this.f23413q = 0L;
            this.f23412n = 0L;
            this.f23410g = 0L;
            this.f23414y = 0;
            Arrays.fill(this.f67176f7l8, false);
        }

        /* JADX INFO: renamed from: g */
        public void m13793g(long j2) {
            long j3 = this.f23413q;
            if (j3 == 0) {
                this.f23411k = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.f23411k;
                this.f67177toq = j4;
                this.f23410g = j4;
                this.f23412n = 1L;
            } else {
                long j5 = j2 - this.f67178zy;
                int iZy = zy(j3);
                if (Math.abs(j5 - this.f67177toq) <= 1000000) {
                    this.f23412n++;
                    this.f23410g += j5;
                    boolean[] zArr = this.f67176f7l8;
                    if (zArr[iZy]) {
                        zArr[iZy] = false;
                        this.f23414y--;
                    }
                } else {
                    boolean[] zArr2 = this.f67176f7l8;
                    if (!zArr2[iZy]) {
                        zArr2[iZy] = true;
                        this.f23414y++;
                    }
                }
            }
            this.f23413q++;
            this.f67178zy = j2;
        }

        /* JADX INFO: renamed from: k */
        public long m13794k() {
            long j2 = this.f23412n;
            if (j2 == 0) {
                return 0L;
            }
            return this.f23410g / j2;
        }

        /* JADX INFO: renamed from: n */
        public boolean m13795n() {
            return this.f23413q > 15 && this.f23414y == 0;
        }

        /* JADX INFO: renamed from: q */
        public boolean m13796q() {
            long j2 = this.f23413q;
            if (j2 == 0) {
                return false;
            }
            return this.f67176f7l8[zy(j2 - 1)];
        }

        public long toq() {
            return this.f23410g;
        }
    }

    public void f7l8() {
        this.f23407k.f7l8();
        this.f67174toq.f7l8();
        this.f67175zy = false;
        this.f23408n = C3548p.f65257toq;
        this.f23406g = 0;
    }

    /* JADX INFO: renamed from: g */
    public void m13789g(long j2) {
        this.f23407k.m13793g(j2);
        if (this.f23407k.m13795n() && !this.f23409q) {
            this.f67175zy = false;
        } else if (this.f23408n != C3548p.f65257toq) {
            if (!this.f67175zy || this.f67174toq.m13796q()) {
                this.f67174toq.f7l8();
                this.f67174toq.m13793g(this.f23408n);
            }
            this.f67175zy = true;
            this.f67174toq.m13793g(j2);
        }
        if (this.f67175zy && this.f67174toq.m13795n()) {
            k kVar = this.f23407k;
            this.f23407k = this.f67174toq;
            this.f67174toq = kVar;
            this.f67175zy = false;
            this.f23409q = false;
        }
        this.f23408n = j2;
        this.f23406g = this.f23407k.m13795n() ? 0 : this.f23406g + 1;
    }

    /* JADX INFO: renamed from: k */
    public long m13790k() {
        return m13791n() ? this.f23407k.m13794k() : C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: n */
    public boolean m13791n() {
        return this.f23407k.m13795n();
    }

    /* JADX INFO: renamed from: q */
    public long m13792q() {
        return m13791n() ? this.f23407k.toq() : C3548p.f65257toq;
    }

    public float toq() {
        if (m13791n()) {
            return (float) (1.0E9d / this.f23407k.m13794k());
        }
        return -1.0f;
    }

    public int zy() {
        return this.f23406g;
    }
}
