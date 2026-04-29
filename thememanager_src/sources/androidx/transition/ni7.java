package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ImageViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
class ni7 {

    /* JADX INFO: renamed from: k */
    private static boolean f6728k = true;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Field f53522toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f53523zy;

    private ni7() {
    }

    /* JADX INFO: renamed from: k */
    static void m5401k(@zy.lvui ImageView imageView, @zy.dd Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix != null) {
            zy(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    private static void toq() {
        if (f53523zy) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f53522toq = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f53523zy = true;
    }

    @zy.hyr(21)
    @SuppressLint({"NewApi"})
    private static void zy(@zy.lvui ImageView imageView, @zy.dd Matrix matrix) {
        if (f6728k) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f6728k = false;
            }
        }
    }
}
