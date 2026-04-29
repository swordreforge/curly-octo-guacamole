package com.android.thememanager.recommend.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.android.thememanager.R;
import com.android.thememanager.fn3e;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class DanceBar extends View {

    /* JADX INFO: renamed from: a */
    private static final int f14519a = 1;

    /* JADX INFO: renamed from: b */
    private float[] f14520b;

    /* JADX INFO: renamed from: c */
    private Paint f14521c;

    /* JADX INFO: renamed from: e */
    private Rect f14522e;

    /* JADX INFO: renamed from: f */
    private int f14523f;

    /* JADX INFO: renamed from: g */
    private final int f14524g;

    /* JADX INFO: renamed from: h */
    private int f14525h;

    /* JADX INFO: renamed from: i */
    private boolean f14526i;

    /* JADX INFO: renamed from: j */
    private Handler f14527j;

    /* JADX INFO: renamed from: k */
    private final int f14528k;

    /* JADX INFO: renamed from: l */
    private int f14529l;

    /* JADX INFO: renamed from: m */
    private boolean f14530m;

    /* JADX INFO: renamed from: n */
    private int f14531n;

    /* JADX INFO: renamed from: o */
    private long f14532o;

    /* JADX INFO: renamed from: p */
    private final int f14533p;

    /* JADX INFO: renamed from: q */
    private int f14534q;

    /* JADX INFO: renamed from: r */
    private int f14535r;

    /* JADX INFO: renamed from: s */
    private final int f14536s;

    /* JADX INFO: renamed from: t */
    private int f14537t;

    /* JADX INFO: renamed from: y */
    private final toq[] f14538y;

    /* JADX INFO: renamed from: z */
    private Random f14539z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.DanceBar$k */
    class HandlerC2458k extends Handler {
        HandlerC2458k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            DanceBar.this.m8830n();
            DanceBar.this.invalidate();
            DanceBar.this.f14532o = SystemClock.uptimeMillis();
        }
    }

    static class toq {

        /* JADX INFO: renamed from: k */
        int f14541k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f60739toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f60740zy;

        toq() {
        }
    }

    public DanceBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        int i2 = 0;
        this.f14526i = false;
        this.f14539z = new Random();
        this.f14530m = false;
        this.f14520b = new float[]{0.5f, 1.0f, 0.67f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.tlw5);
        int integer = typedArrayObtainStyledAttributes.getInteger(1, 4);
        this.f14528k = integer;
        this.f14524g = typedArrayObtainStyledAttributes.getInteger(2, 40);
        this.f14536s = typedArrayObtainStyledAttributes.getInteger(3, 15);
        this.f14533p = typedArrayObtainStyledAttributes.getInteger(4, 5);
        int color = typedArrayObtainStyledAttributes.getColor(0, context.getResources().getColor(R.color.dance_bar_color));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f14521c = paint;
        paint.setColor(color);
        this.f14521c.setStyle(Paint.Style.FILL);
        this.f14538y = new toq[integer];
        while (true) {
            toq[] toqVarArr = this.f14538y;
            if (i2 >= toqVarArr.length) {
                this.f14522e = new Rect();
                this.f14527j = new HandlerC2458k(Looper.myLooper());
                return;
            } else {
                toqVarArr[i2] = new toq();
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m8830n() {
        for (toq toqVar : this.f14538y) {
            int i2 = toqVar.f14541k + toqVar.f60740zy;
            toqVar.f14541k = i2;
            int i3 = toqVar.f60739toq;
            if (i2 <= i3) {
                toqVar.f14541k = i3;
                toqVar.f60740zy = this.f14539z.nextInt(this.f14536s - this.f14533p) + 1 + this.f14533p;
                toqVar.f60739toq = this.f14539z.nextInt(Math.max(this.f14525h - this.f14531n, 1)) + this.f14531n + 1;
            } else {
                int i4 = this.f14534q;
                if (i2 >= i4) {
                    toqVar.f14541k = i4;
                    toqVar.f60740zy = -(this.f14539z.nextInt(this.f14536s - this.f14533p) + 1 + this.f14533p);
                }
            }
        }
    }

    private void zy() {
        if (this.f14527j.hasMessages(1)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f14532o;
        int i2 = this.f14524g;
        if (jUptimeMillis >= i2 || jUptimeMillis < 0) {
            this.f14527j.sendEmptyMessage(1);
        } else {
            this.f14527j.sendEmptyMessageDelayed(1, ((long) i2) - jUptimeMillis);
        }
    }

    public void f7l8() {
        for (toq toqVar : this.f14538y) {
            int i2 = this.f14531n;
            toqVar.f60739toq = i2;
            toqVar.f60740zy = 0;
            toqVar.f14541k = i2;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m8831g() {
        this.f14530m = true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i2 = 0;
        while (i2 < this.f14538y.length) {
            this.f14521c.setAlpha(200);
            Rect rect = this.f14522e;
            int i3 = this.f14529l;
            int i4 = this.f14523f;
            int i5 = this.f14535r;
            int i6 = i2 + 1;
            rect.set((i2 * i3) + (i2 * i4), (i5 - this.f14538y[i2].f14541k) + this.f14531n, (i3 * i6) + (i4 * i2), i5);
            canvas.drawRect(this.f14522e, this.f14521c);
            this.f14521c.setAlpha(100);
            Rect rect2 = this.f14522e;
            int i7 = this.f14529l;
            int i8 = this.f14523f;
            int i9 = this.f14535r;
            int i10 = this.f14538y[i2].f14541k;
            int i11 = this.f14531n;
            rect2.set((i2 * i7) + (i2 * i8), (i9 - i10) + (i11 / 2), (i7 * i6) + (i8 * i2), (i9 - i10) + i11);
            canvas.drawRect(this.f14522e, this.f14521c);
            this.f14521c.setAlpha(25);
            Rect rect3 = this.f14522e;
            int i12 = this.f14529l;
            int i13 = this.f14523f;
            int i14 = this.f14535r;
            int i15 = this.f14538y[i2].f14541k;
            rect3.set((i2 * i12) + (i2 * i13), i14 - i15, (i12 * i6) + (i2 * i13), i15 + (this.f14531n / 2));
            canvas.drawRect(this.f14522e, this.f14521c);
            i2 = i6;
        }
        if (this.f14526i) {
            zy();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.f14535r = getHeight();
        int width = getWidth();
        this.f14537t = width;
        int i2 = this.f14528k;
        int i3 = width / (i2 + ((i2 - 1) * 2));
        this.f14529l = i3;
        this.f14523f = i3 * 2;
        int i4 = this.f14535r;
        this.f14525h = i4 / 2;
        this.f14534q = i4;
        this.f14531n = i3;
        if (this.f14530m) {
            m8832q();
            this.f14530m = false;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m8832q() {
        int length = this.f14520b.length;
        int i2 = 0;
        while (true) {
            toq[] toqVarArr = this.f14538y;
            if (i2 >= toqVarArr.length) {
                m8830n();
                invalidate();
                return;
            }
            toq toqVar = toqVarArr[i2];
            int i3 = (int) (this.f14534q * this.f14520b[i2 % length]);
            toqVar.f60739toq = i3;
            toqVar.f60740zy = 0;
            toqVar.f14541k = i3;
            i2++;
        }
    }

    public void setDanceState(boolean isDancing) {
        boolean z2 = this.f14526i;
        if (z2 && !isDancing) {
            this.f14526i = false;
        } else {
            if (z2 || !isDancing) {
                return;
            }
            this.f14526i = true;
            zy();
        }
    }
}
