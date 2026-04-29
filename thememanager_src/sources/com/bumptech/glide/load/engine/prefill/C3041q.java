package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import com.bumptech.glide.util.qrj;
import zy.dd;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.prefill.q */
/* JADX INFO: compiled from: PreFillType.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3041q {

    /* JADX INFO: renamed from: n */
    @yz
    static final Bitmap.Config f18453n = Bitmap.Config.RGB_565;

    /* JADX INFO: renamed from: k */
    private final int f18454k;

    /* JADX INFO: renamed from: q */
    private final int f18455q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f62800toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Bitmap.Config f62801zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.prefill.q$k */
    /* JADX INFO: compiled from: PreFillType.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        private final int f18456k;

        /* JADX INFO: renamed from: q */
        private int f18457q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f62802toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Bitmap.Config f62803zy;

        public k(int i2) {
            this(i2, i2);
        }

        /* JADX INFO: renamed from: k */
        C3041q m10805k() {
            return new C3041q(this.f18456k, this.f62802toq, this.f62803zy, this.f18457q);
        }

        /* JADX INFO: renamed from: q */
        public k m10806q(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.f18457q = i2;
            return this;
        }

        Bitmap.Config toq() {
            return this.f62803zy;
        }

        public k zy(@dd Bitmap.Config config) {
            this.f62803zy = config;
            return this;
        }

        public k(int i2, int i3) {
            this.f18457q = 1;
            if (i2 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i3 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.f18456k = i2;
            this.f62802toq = i3;
        }
    }

    C3041q(int i2, int i3, Bitmap.Config config, int i4) {
        this.f62801zy = (Bitmap.Config) qrj.m11261n(config, "Config must not be null");
        this.f18454k = i2;
        this.f62800toq = i3;
        this.f18455q = i4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3041q)) {
            return false;
        }
        C3041q c3041q = (C3041q) obj;
        return this.f62800toq == c3041q.f62800toq && this.f18454k == c3041q.f18454k && this.f18455q == c3041q.f18455q && this.f62801zy == c3041q.f62801zy;
    }

    public int hashCode() {
        return (((((this.f18454k * 31) + this.f62800toq) * 31) + this.f62801zy.hashCode()) * 31) + this.f18455q;
    }

    /* JADX INFO: renamed from: k */
    Bitmap.Config m10803k() {
        return this.f62801zy;
    }

    /* JADX INFO: renamed from: q */
    int m10804q() {
        return this.f18454k;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f18454k + ", height=" + this.f62800toq + ", config=" + this.f62801zy + ", weight=" + this.f18455q + '}';
    }

    int toq() {
        return this.f62800toq;
    }

    int zy() {
        return this.f18455q;
    }
}
