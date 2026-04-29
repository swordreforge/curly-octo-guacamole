package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: AppCompatProgressBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
class fn3e {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int[] f46860zy = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: k */
    private final ProgressBar f1014k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Bitmap f46861toq;

    /* JADX INFO: renamed from: androidx.appcompat.widget.fn3e$k */
    /* JADX INFO: compiled from: AppCompatProgressBarHelper.java */
    @zy.hyr(23)
    private static class C0190k {
        private C0190k() {
        }

        /* JADX INFO: renamed from: k */
        public static void m590k(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i2) {
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
    }

    fn3e(ProgressBar progressBar) {
        this.f1014k = progressBar;
    }

    /* JADX INFO: renamed from: k */
    private Shape m587k() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: renamed from: n */
    private Drawable m588n(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            Drawable drawableM589q = m589q(animationDrawable.getFrame(i2), true);
            drawableM589q.setLevel(10000);
            animationDrawable2.addFrame(drawableM589q, animationDrawable.getDuration(i2));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zy.yz
    /* JADX INFO: renamed from: q */
    Drawable m589q(Drawable drawable, boolean z2) {
        if (drawable instanceof androidx.core.graphics.drawable.kja0) {
            androidx.core.graphics.drawable.kja0 kja0Var = (androidx.core.graphics.drawable.kja0) drawable;
            Drawable drawableMo2420k = kja0Var.mo2420k();
            if (drawableMo2420k != null) {
                kja0Var.toq(m589q(drawableMo2420k, z2));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = m589q(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    C0190k.m590k(layerDrawable, layerDrawable2, i3);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f46861toq == null) {
                    this.f46861toq = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m587k());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    Bitmap toq() {
        return this.f46861toq;
    }

    void zy(AttributeSet attributeSet, int i2) {
        C0184b c0184bJp0y = C0184b.jp0y(this.f1014k.getContext(), attributeSet, f46860zy, i2, 0);
        Drawable drawableM551s = c0184bJp0y.m551s(0);
        if (drawableM551s != null) {
            this.f1014k.setIndeterminateDrawable(m588n(drawableM551s));
        }
        Drawable drawableM551s2 = c0184bJp0y.m551s(1);
        if (drawableM551s2 != null) {
            this.f1014k.setProgressDrawable(m589q(drawableM551s2, false));
        }
        c0184bJp0y.d3();
    }
}
