package miuix.graphics.shadow;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;

/* JADX INFO: renamed from: miuix.graphics.shadow.k */
/* JADX INFO: compiled from: DropShadowConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7113k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    float f87677f7l8;

    /* JADX INFO: renamed from: g */
    float f40135g;

    /* JADX INFO: renamed from: k */
    int f40136k;

    /* JADX INFO: renamed from: n */
    float f40137n;

    /* JADX INFO: renamed from: q */
    float f40138q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f87678toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    BlurMaskFilter.Blur f87679zy;

    /* JADX INFO: renamed from: miuix.graphics.shadow.k$k */
    /* JADX INFO: compiled from: DropShadowConfig.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        private C7113k f40139k;

        public k(float f2) {
            this.f40139k = new C7113k(f2);
        }

        /* JADX INFO: renamed from: g */
        public k m25756g(BlurMaskFilter.Blur blur) {
            this.f40139k.f87679zy = blur;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C7113k m25757k() {
            return this.f40139k;
        }

        /* JADX INFO: renamed from: n */
        public k m25758n(int i2) {
            this.f40139k.f40135g = i2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public k m25759q(int i2) {
            this.f40139k.f40137n = i2;
            return this;
        }

        public k toq(float f2) {
            this.f40139k.f40138q = f2;
            return this;
        }

        public k zy(int i2, int i3) {
            C7113k c7113k = this.f40139k;
            c7113k.f40136k = i2;
            c7113k.f87678toq = i3;
            return this;
        }
    }

    C7113k(float f2) {
        this(f2, BlurMaskFilter.Blur.NORMAL);
    }

    C7113k(float f2, BlurMaskFilter.Blur blur) {
        this(Color.parseColor("#0D000000"), Color.parseColor("#0DFFFFFF"), 0.0f, 0.0f, f2, blur);
    }

    C7113k(int i2, int i3, float f2, float f3, float f4, BlurMaskFilter.Blur blur) {
        this.f87677f7l8 = 0.0f;
        this.f40136k = i2;
        this.f87678toq = i3;
        this.f40137n = f2;
        this.f40135g = f3;
        this.f40138q = f4;
        this.f87679zy = blur;
    }
}
