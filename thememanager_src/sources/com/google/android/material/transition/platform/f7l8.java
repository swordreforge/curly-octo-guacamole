package com.google.android.material.transition.platform;

import android.graphics.RectF;
import zy.hyr;

/* JADX INFO: compiled from: FitModeEvaluators.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final InterfaceC4201g f25468k = new C4200k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final InterfaceC4201g f67989toq = new toq();

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.f7l8$k */
    /* JADX INFO: compiled from: FitModeEvaluators.java */
    class C4200k implements InterfaceC4201g {
        C4200k() {
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4201g
        /* JADX INFO: renamed from: k */
        public C4220y mo15191k(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float fQrj = zurt.qrj(f5, f7, f3, f4, f2, true);
            float f9 = fQrj / f5;
            float f10 = fQrj / f7;
            return new C4220y(f9, f10, fQrj, f6 * f9, fQrj, f8 * f10);
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4201g
        public boolean toq(C4220y c4220y) {
            return c4220y.f25573q > c4220y.f25570g;
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4201g
        public void zy(RectF rectF, float f2, C4220y c4220y) {
            rectF.bottom -= Math.abs(c4220y.f25570g - c4220y.f25573q) * f2;
        }
    }

    /* JADX INFO: compiled from: FitModeEvaluators.java */
    class toq implements InterfaceC4201g {
        toq() {
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4201g
        /* JADX INFO: renamed from: k */
        public C4220y mo15191k(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float fQrj = zurt.qrj(f6, f8, f3, f4, f2, true);
            float f9 = fQrj / f6;
            float f10 = fQrj / f8;
            return new C4220y(f9, f10, f5 * f9, fQrj, f7 * f10, fQrj);
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4201g
        public boolean toq(C4220y c4220y) {
            return c4220y.f68042zy > c4220y.f25572n;
        }

        @Override // com.google.android.material.transition.platform.InterfaceC4201g
        public void zy(RectF rectF, float f2, C4220y c4220y) {
            float fAbs = (Math.abs(c4220y.f25572n - c4220y.f68042zy) / 2.0f) * f2;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    }

    private f7l8() {
    }

    /* JADX INFO: renamed from: k */
    static InterfaceC4201g m15190k(int i2, boolean z2, RectF rectF, RectF rectF2) {
        if (i2 == 0) {
            return toq(z2, rectF, rectF2) ? f25468k : f67989toq;
        }
        if (i2 == 1) {
            return f25468k;
        }
        if (i2 == 2) {
            return f67989toq;
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
