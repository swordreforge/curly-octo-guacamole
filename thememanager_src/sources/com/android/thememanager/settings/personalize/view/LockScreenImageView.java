package com.android.thememanager.settings.personalize.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.thememanager.basemodule.utils.y9n;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LockScreenImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: g */
    private Bitmap f15329g;

    /* JADX INFO: renamed from: h */
    private Rect f15330h;

    /* JADX INFO: renamed from: i */
    private int f15331i;

    /* JADX INFO: renamed from: l */
    private int f15332l;

    /* JADX INFO: renamed from: p */
    private Rect f15333p;

    /* JADX INFO: renamed from: r */
    private Configuration f15334r;

    /* JADX INFO: renamed from: s */
    private Paint f15335s;

    /* JADX INFO: renamed from: t */
    private int f15336t;

    /* JADX INFO: renamed from: y */
    private float f15337y;

    /* JADX INFO: renamed from: z */
    private int f15338z;

    public LockScreenImageView(@lvui Context context) {
        super(context);
        this.f15335s = new Paint();
        this.f15333p = new Rect();
        this.f15330h = new Rect();
        cdj(context);
    }

    private void cdj(Context context) {
        Point pointFn3e = y9n.fn3e();
        this.f15331i = pointFn3e.x;
        this.f15338z = pointFn3e.y;
        this.f15334r = getResources().getConfiguration();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            android.graphics.Bitmap r0 = r6.f15329g
            if (r0 == 0) goto L73
            float r1 = r6.f15337y
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L73
            r1 = 1065353216(0x3f800000, float:1.0)
            android.content.res.Configuration r2 = r6.f15334r
            int r2 = r2.orientation
            r3 = 2
            r4 = 1
            if (r2 != r4) goto L22
            int r0 = r0.getWidth()
            float r1 = r6.f15337y
            int r2 = r6.f15331i
        L1d:
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L2d
        L22:
            if (r2 != r3) goto L2d
            int r0 = r0.getWidth()
            float r1 = r6.f15337y
            int r2 = r6.f15338z
            goto L1d
        L2d:
            int r0 = r6.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r1
            int r0 = (int) r0
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r1
            int r1 = (int) r2
            boolean r2 = com.android.thememanager.basemodule.utils.C1807g.zurt()
            if (r2 == 0) goto L4a
            android.graphics.Bitmap r2 = r6.f15329g
            int r2 = r2.getHeight()
            if (r2 >= r1) goto L4a
            r1 = r2
        L4a:
            int r2 = r6.f15336t
            r5 = 0
            if (r2 == r4) goto L59
            r4 = 3
            if (r2 != r4) goto L53
            goto L59
        L53:
            android.graphics.Rect r2 = r6.f15333p
            r2.set(r5, r5, r0, r1)
            goto L67
        L59:
            android.graphics.Bitmap r2 = r6.f15329g
            int r2 = r2.getWidth()
            int r2 = r2 - r0
            int r2 = r2 / r3
            android.graphics.Rect r3 = r6.f15333p
            int r0 = r0 + r2
            r3.set(r2, r5, r0, r1)
        L67:
            android.graphics.Bitmap r0 = r6.f15329g
            android.graphics.Rect r1 = r6.f15333p
            android.graphics.Rect r2 = r6.f15330h
            android.graphics.Paint r3 = r6.f15335s
            r7.drawBitmap(r0, r1, r2, r3)
            goto L76
        L73:
            super.onDraw(r7)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.view.LockScreenImageView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        this.f15330h.set(0, 0, w2, h2);
    }

    public void setBitmap(Bitmap bitmap) {
        this.f15329g = bitmap;
        invalidate();
    }

    public void setClockPosition(int clockPosition) {
        this.f15336t = clockPosition;
    }

    public void setScaleRatio(float scaleRatio) {
        this.f15337y = scaleRatio;
    }

    public LockScreenImageView(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f15335s = new Paint();
        this.f15333p = new Rect();
        this.f15330h = new Rect();
        cdj(context);
    }

    public LockScreenImageView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15335s = new Paint();
        this.f15333p = new Rect();
        this.f15330h = new Rect();
        cdj(context);
    }
}
