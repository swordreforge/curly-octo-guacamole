package miuix.miuixbasewidget.widget;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;

/* JADX INFO: renamed from: miuix.miuixbasewidget.widget.k */
/* JADX INFO: compiled from: DropShadowConfig.java */
/* JADX INFO: loaded from: classes3.dex */
class C7196k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    float f87839f7l8;

    /* JADX INFO: renamed from: g */
    float f40636g;

    /* JADX INFO: renamed from: k */
    int f40637k;

    /* JADX INFO: renamed from: n */
    float f40638n;

    /* JADX INFO: renamed from: q */
    float f40639q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f87840toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    BlurMaskFilter.Blur f87841zy;

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.k$k */
    /* JADX INFO: compiled from: DropShadowConfig.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        private C7196k f40640k;

        public k(float f2) {
            this.f40640k = new C7196k(f2);
        }

        /* JADX INFO: renamed from: g */
        public k m26105g(BlurMaskFilter.Blur blur) {
            this.f40640k.f87841zy = blur;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C7196k m26106k() {
            return this.f40640k;
        }

        /* JADX INFO: renamed from: n */
        public k m26107n(int i2) {
            this.f40640k.f40636g = i2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public k m26108q(int i2) {
            this.f40640k.f40638n = i2;
            return this;
        }

        public k toq(float f2) {
            this.f40640k.f40639q = f2;
            return this;
        }

        public k zy(int i2, int i3) {
            C7196k c7196k = this.f40640k;
            c7196k.f40637k = i2;
            c7196k.f87840toq = i3;
            return this;
        }
    }

    C7196k(float f2) {
        this(f2, BlurMaskFilter.Blur.NORMAL);
    }

    C7196k(float f2, BlurMaskFilter.Blur blur) {
        this(Color.parseColor("#0D000000"), Color.parseColor("#0DFFFFFF"), 0.0f, 0.0f, f2, blur);
    }

    C7196k(int i2, int i3, float f2, float f3, float f4, BlurMaskFilter.Blur blur) {
        this.f87839f7l8 = 0.0f;
        this.f40637k = i2;
        this.f87840toq = i3;
        this.f40638n = f2;
        this.f40636g = f3;
        this.f40639q = f4;
        this.f87841zy = blur;
    }
}
