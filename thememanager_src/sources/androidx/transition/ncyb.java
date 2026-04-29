package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes.dex */
class ncyb {

    /* JADX INFO: renamed from: k */
    private static final int f6725k = 1048576;

    /* JADX INFO: renamed from: q */
    private static final boolean f6726q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f53518toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final boolean f53519zy;

    /* JADX INFO: renamed from: androidx.transition.ncyb$k */
    /* JADX INFO: compiled from: TransitionUtils.java */
    static class C1234k implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: k */
        final float[] f6727k = new float[9];

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final float[] f53520toq = new float[9];

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final Matrix f53521zy = new Matrix();

        C1234k() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f6727k);
            matrix2.getValues(this.f53520toq);
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f53520toq;
                float f3 = fArr[i2];
                float f4 = this.f6727k[i2];
                fArr[i2] = f4 + ((f3 - f4) * f2);
            }
            this.f53521zy.setValues(this.f53520toq);
            return this.f53521zy;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f53518toq = true;
        f53519zy = true;
        f6726q = i2 >= 28;
    }

    private ncyb() {
    }

    /* JADX INFO: renamed from: k */
    static View m5399k(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        C1231m.m5391p(view, matrix);
        C1231m.ld6(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap qVar = toq(view, matrix, rectF, viewGroup);
        if (qVar != null) {
            imageView.setImageBitmap(qVar);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    private static Bitmap toq(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z2;
        boolean zIsAttachedToWindow;
        int iIndexOfChild;
        ViewGroup viewGroup2;
        if (f53518toq) {
            z2 = !view.isAttachedToWindow();
            zIsAttachedToWindow = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z2 = false;
            zIsAttachedToWindow = false;
        }
        boolean z3 = f53519zy;
        Bitmap bitmapCreateBitmap = null;
        if (!z3 || !z2) {
            iIndexOfChild = 0;
            viewGroup2 = null;
        } else {
            if (!zIsAttachedToWindow) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f6726q) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = Bitmap.createBitmap(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z3 && z2) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    static Animator zy(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
