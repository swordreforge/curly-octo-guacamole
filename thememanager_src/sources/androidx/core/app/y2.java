package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SharedElementCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: n */
    private static final String f3386n = "sharedElement:snapshot:imageMatrix";

    /* JADX INFO: renamed from: q */
    private static final String f3387q = "sharedElement:snapshot:imageScaleType";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f50325toq = 1048576;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f50326zy = "sharedElement:snapshot:bitmap";

    /* JADX INFO: renamed from: k */
    private Matrix f3388k;

    /* JADX INFO: renamed from: androidx.core.app.y2$k */
    /* JADX INFO: compiled from: SharedElementCallback.java */
    public interface InterfaceC0471k {
        void onSharedElementsReady();
    }

    /* JADX INFO: renamed from: k */
    private static Bitmap m2133k(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i2 = (int) (intrinsicWidth * fMin);
        int i3 = (int) (intrinsicHeight * fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect bounds = drawable.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(canvas);
        drawable.setBounds(i4, i5, i6, i7);
        return bitmapCreateBitmap;
    }

    public void f7l8(List<String> list, List<View> list2, List<View> list3) {
    }

    /* JADX INFO: renamed from: g */
    public void m2134g(List<String> list, List<View> list2, List<View> list3) {
    }

    /* JADX INFO: renamed from: n */
    public void m2135n(List<View> list) {
    }

    /* JADX INFO: renamed from: q */
    public void m2136q(List<String> list, Map<String, View> map) {
    }

    public Parcelable toq(View view, Matrix matrix, RectF rectF) {
        Bitmap bitmapM2133k;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (bitmapM2133k = m2133k(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f50326zy, bitmapM2133k);
                bundle.putString(f3387q, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(f3386n, fArr);
                }
                return bundle;
            }
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
        int i2 = (int) (iRound * fMin);
        int i3 = (int) (iRound2 * fMin);
        if (this.f3388k == null) {
            this.f3388k = new Matrix();
        }
        this.f3388k.set(matrix);
        this.f3388k.postTranslate(-rectF.left, -rectF.top);
        this.f3388k.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(this.f3388k);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: y */
    public void m2137y(List<String> list, List<View> list2, InterfaceC0471k interfaceC0471k) {
        interfaceC0471k.onSharedElementsReady();
    }

    public View zy(Context context, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f50326zy);
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(f3387q)));
        if (imageView2.getScaleType() != ImageView.ScaleType.MATRIX) {
            return imageView2;
        }
        float[] floatArray = bundle.getFloatArray(f3386n);
        Matrix matrix = new Matrix();
        matrix.setValues(floatArray);
        imageView2.setImageMatrix(matrix);
        return imageView2;
    }
}
