package com.google.android.material.transition;

import android.graphics.RectF;

/* JADX INFO: compiled from: FitModeEvaluators.java */
/* JADX INFO: loaded from: classes2.dex */
class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final InterfaceC4192g f25435k = new C4189k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final InterfaceC4192g f67979toq = new toq();

    /* JADX INFO: renamed from: com.google.android.material.transition.f7l8$k */
    /* JADX INFO: compiled from: FitModeEvaluators.java */
    class C4189k implements InterfaceC4192g {
        C4189k() {
        }

        @Override // com.google.android.material.transition.InterfaceC4192g
        /* JADX INFO: renamed from: k */
        public C4233y mo15162k(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float fQrj = fn3e.qrj(f5, f7, f3, f4, f2, true);
            float f9 = fQrj / f5;
            float f10 = fQrj / f7;
            return new C4233y(f9, f10, fQrj, f6 * f9, fQrj, f8 * f10);
        }

        @Override // com.google.android.material.transition.InterfaceC4192g
        public boolean toq(C4233y c4233y) {
            return c4233y.f25624q > c4233y.f25621g;
        }

        @Override // com.google.android.material.transition.InterfaceC4192g
        public void zy(RectF rectF, float f2, C4233y c4233y) {
            rectF.bottom -= Math.abs(c4233y.f25621g - c4233y.f25624q) * f2;
        }
    }

    /* JADX INFO: compiled from: FitModeEvaluators.java */
    class toq implements InterfaceC4192g {
        toq() {
        }

        @Override // com.google.android.material.transition.InterfaceC4192g
        /* JADX INFO: renamed from: k */
        public C4233y mo15162k(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float fQrj = fn3e.qrj(f6, f8, f3, f4, f2, true);
            float f9 = fQrj / f6;
            float f10 = fQrj / f8;
            return new C4233y(f9, f10, f5 * f9, fQrj, f7 * f10, fQrj);
        }

        @Override // com.google.android.material.transition.InterfaceC4192g
        public boolean toq(C4233y c4233y) {
            return c4233y.f68087zy > c4233y.f25623n;
        }

        @Override // com.google.android.material.transition.InterfaceC4192g
        public void zy(RectF rectF, float f2, C4233y c4233y) {
            float fAbs = (Math.abs(c4233y.f25623n - c4233y.f68087zy) / 2.0f) * f2;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    }

    private f7l8() {
    }

    /* JADX INFO: renamed from: k */
    static InterfaceC4192g m15161k(int i2, boolean z2, RectF rectF, RectF rectF2) {
        if (i2 == 0) {
            return toq(z2, rectF, rectF2) ? f25435k : f67979toq;
        }
        if (i2 == 1) {
            return f25435k;
        }
        if (i2 == 2) {
            return f67979toq;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i2);
    }

    private static boolean toq(boolean z2, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f2 = (fHeight2 * fWidth) / fWidth2;
        float f3 = (fWidth2 * fHeight) / fWidth;
        if (z2) {
            if (f2 >= fHeight) {
                return true;
            }
        } else if (f3 >= fHeight2) {
            return true;
        }
        return false;
    }
}
