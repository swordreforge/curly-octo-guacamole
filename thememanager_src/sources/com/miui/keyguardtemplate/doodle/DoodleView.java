package com.miui.keyguardtemplate.doodle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.miui.keyguardtemplate.C5112s;
import com.miui.keyguardtemplate.toq;
import oki.C7540k;
import zy.a9;
import zy.dd;
import zy.x2;
import zy.y9n;

/* JADX INFO: loaded from: classes3.dex */
public class DoodleView extends View {

    /* JADX INFO: renamed from: h */
    public static final int f29353h = 2;

    /* JADX INFO: renamed from: i */
    public static final float f29354i = 0.4279476f;

    /* JADX INFO: renamed from: p */
    public static final int f29355p = 1;

    /* JADX INFO: renamed from: s */
    private static final String f29356s = "DoodleView";

    /* JADX INFO: renamed from: g */
    private Paint f29357g;

    /* JADX INFO: renamed from: k */
    private int f29358k;

    /* JADX INFO: renamed from: n */
    private Rect f29359n;

    /* JADX INFO: renamed from: q */
    private Rect f29360q;

    /* JADX INFO: renamed from: y */
    public SparseArray<Bitmap> f29361y;

    public DoodleView(Context context) {
        this(context, null);
    }

    private Bitmap getCurDoodleBitmap() {
        return this.f29361y.get(this.f29358k);
    }

    /* JADX INFO: renamed from: k */
    private void m17790k(int i2, int i3, Bitmap bitmap) {
        if (C7540k.m27574p()) {
            this.f29360q = null;
            this.f29359n.set(0, 0, i2, i3);
            return;
        }
        float fZy = zy(toq.C5114k.f29390k);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Log.d(f29356s, "doodleBitmapWidth = " + width + " w =" + i2 + " doodleBitmapHeight = " + height + " h = " + i3);
        float f2 = (float) width;
        float f3 = f2 / fZy;
        float f4 = ((float) i2) * f3;
        float f5 = ((float) i3) * f3;
        Log.d(f29356s, "doodleWidth = " + fZy + " scaledViewWith = " + f4 + " scaledViewHeight = " + f5);
        Rect rect = this.f29360q;
        int i4 = (int) ((f2 - f4) / 2.0f);
        rect.left = i4;
        rect.right = (int) (((float) i4) + f4);
        rect.top = 0;
        float f6 = (float) height;
        if (f5 <= f6) {
            rect.bottom = (int) f5;
            this.f29359n.set(0, 0, i2, i3);
        } else {
            rect.bottom = height + 0;
            this.f29359n.set(0, (int) (f5 - f6), i2, i3);
        }
    }

    private Bitmap toq(Context context, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Point qVar = C7540k.toq(context.getApplicationContext());
        int i2 = (int) (width * 0.4279476f);
        int i3 = (width - i2) / 2;
        int i4 = (int) (i2 * ((qVar.y * 1.0f) / qVar.x));
        if (i4 <= height) {
            height = i4;
        }
        return Bitmap.createBitmap(bitmap, i3, 0, i2, height);
    }

    public int getDoodleType() {
        return this.f29358k;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap curDoodleBitmap = getCurDoodleBitmap();
        if (curDoodleBitmap != null) {
            canvas.drawBitmap(curDoodleBitmap, C7540k.m27574p() ? null : this.f29360q, this.f29359n, this.f29357g);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        Bitmap curDoodleBitmap = getCurDoodleBitmap();
        if (curDoodleBitmap == null) {
            return;
        }
        m17790k(i2, i3, curDoodleBitmap);
        invalidate();
    }

    @y9n
    /* JADX INFO: renamed from: q */
    public Bitmap m17791q(Context context, @a9(from = 1, to = 2) int i2) {
        this.f29358k = i2;
        Bitmap bitmap = this.f29361y.get(i2);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        int i3 = toq.C8028toq.f29394k;
        if (i2 == 2) {
            i3 = toq.C8028toq.f72103toq;
        }
        Bitmap bitmapZy = C5112s.zy(context, i3);
        return C7540k.m27574p() ? toq(context, bitmapZy) : bitmapZy;
    }

    public void setDoodleBitmap(Bitmap bitmap, @a9(from = 1, to = 2) int i2) {
        this.f29358k = i2;
        if (bitmap == null) {
            Log.e(f29356s, "setDoodleType:setDoodleType please after preLoadBitmap");
            return;
        }
        m17790k(getWidth(), getHeight(), bitmap);
        this.f29361y.put(i2, bitmap);
        invalidate();
    }

    public void setDoodleColor(@x2 int i2) {
        if (i2 == 0) {
            return;
        }
        Log.d(f29356s, "setDoodleColor");
        this.f29357g.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    protected int zy(int i2) {
        Log.d(f29356s, "scale =" + C7540k.m27572k(getContext()));
        return (int) (getResources().getDimensionPixelSize(i2) * C7540k.m27572k(getContext()));
    }

    public DoodleView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29358k = 1;
        this.f29360q = new Rect();
        this.f29359n = new Rect();
        this.f29361y = new SparseArray<>(2);
        this.f29357g = new Paint(1);
    }
}
