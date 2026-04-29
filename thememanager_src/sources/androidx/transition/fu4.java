package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: compiled from: MatrixUtils.java */
/* JADX INFO: loaded from: classes.dex */
class fu4 {

    /* JADX INFO: renamed from: k */
    static final Matrix f6429k = new C1203k();

    /* JADX INFO: renamed from: androidx.transition.fu4$k */
    /* JADX INFO: compiled from: MatrixUtils.java */
    class C1203k extends Matrix {
        C1203k() {
        }

        /* JADX INFO: renamed from: k */
        void m5345k() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f2, float f3, float f4) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f2, float f3, float f4, float f5) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f2, float f3, float f4, float f5) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f2, float f3) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f2, float f3, float f4) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f2, float f3, float f4, float f5) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f2, float f3, float f4, float f5) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f2, float f3) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i2, float[] fArr2, int i3, int i4) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f2, float f3, float f4) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f2, float f3, float f4, float f5) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f2, float f3, float f4, float f5) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f2, float f3, float f4, float f5) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f2, float f3) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f2) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f2, float f3) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f2, float f3) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f2) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f2, float f3) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f2, float f3) {
            m5345k();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f2) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f2, float f3) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f2, float f3) {
            m5345k();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f2, float f3) {
            m5345k();
        }
    }

    private fu4() {
    }
}
