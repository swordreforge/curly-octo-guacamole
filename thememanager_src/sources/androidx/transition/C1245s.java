package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.ncyb;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.s */
/* JADX INFO: compiled from: ChangeImageTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class C1245s extends oc {
    private static final String bs = "android:changeImageTransform:matrix";
    private static final String k0 = "android:changeImageTransform:bounds";
    private static final String[] ar = {bs, k0};
    private static final TypeEvaluator<Matrix> bc = new k();
    private static final Property<ImageView, Matrix> bu = new toq(Matrix.class, "animatedTransform");

    /* JADX INFO: renamed from: androidx.transition.s$k */
    /* JADX INFO: compiled from: ChangeImageTransform.java */
    class k implements TypeEvaluator<Matrix> {
        k() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.s$toq */
    /* JADX INFO: compiled from: ChangeImageTransform.java */
    class toq extends Property<ImageView, Matrix> {
        toq(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            ni7.m5401k(imageView, matrix);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.s$zy */
    /* JADX INFO: compiled from: ChangeImageTransform.java */
    static /* synthetic */ class zy {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f6765k;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f6765k = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6765k[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C1245s() {
    }

    @zy.lvui
    private ObjectAnimator d8wk(@zy.lvui ImageView imageView) {
        Property<ImageView, Matrix> property = bu;
        TypeEvaluator<Matrix> typeEvaluator = bc;
        Matrix matrix = fu4.f6429k;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private void fnq8(C1225l c1225l) {
        View view = c1225l.f53502toq;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = c1225l.f6686k;
            map.put(k0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(bs, tfm(imageView));
        }
    }

    private static Matrix g1(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    private static Matrix qo(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f2 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f3 = intrinsicHeight;
        float fMax = Math.max(width / f2, height / f3);
        int iRound = Math.round((width - (f2 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f3 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    @zy.lvui
    private static Matrix tfm(@zy.lvui ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i2 = zy.f6765k[imageView.getScaleType().ordinal()];
        return i2 != 1 ? i2 != 2 ? new Matrix(imageView.getImageMatrix()) : qo(imageView) : g1(imageView);
    }

    private ObjectAnimator wo(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) bu, (TypeEvaluator) new ncyb.C1234k(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @Override // androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    @zy.dd
    public Animator fu4(@zy.lvui ViewGroup viewGroup, @zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        if (c1225l == null || c1225l2 == null) {
            return null;
        }
        Rect rect = (Rect) c1225l.f6686k.get(k0);
        Rect rect2 = (Rect) c1225l2.f6686k.get(k0);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) c1225l.f6686k.get(bs);
        Matrix matrix2 = (Matrix) c1225l2.f6686k.get(bs);
        boolean z2 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z2) {
            return null;
        }
        ImageView imageView = (ImageView) c1225l2.f53502toq;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return d8wk(imageView);
        }
        if (matrix == null) {
            matrix = fu4.f6429k;
        }
        if (matrix2 == null) {
            matrix2 = fu4.f6429k;
        }
        bu.set(imageView, matrix);
        return wo(imageView, matrix, matrix2);
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    public String[] nn86() {
        return ar;
    }

    public C1245s(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
