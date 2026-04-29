package miuix.internal.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: CheckWidgetCircleDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends Drawable {

    /* JADX INFO: renamed from: s */
    private static final int f40436s = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f87820f7l8;

    /* JADX INFO: renamed from: g */
    private Paint f40437g;

    /* JADX INFO: renamed from: k */
    private int f40438k;

    /* JADX INFO: renamed from: n */
    private Paint f40439n;

    /* JADX INFO: renamed from: q */
    private int f40440q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f87821toq;

    /* JADX INFO: renamed from: y */
    private boolean f40441y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f87822zy;

    public toq(int i2, int i3, int i4) {
        this(i2, i3, i4, 0, 0, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i2 = bounds.right;
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.bottom;
        int i6 = (i4 + i5) / 2;
        int iMin = Math.min(i2 - i3, i5 - i4) / 2;
        float f2 = (i2 + i3) / 2;
        float f3 = i6;
        float f4 = iMin;
        canvas.drawCircle(f2, f3, (this.f87820f7l8 * f4) - 1.0f, this.f40439n);
        if (this.f40441y) {
            canvas.drawCircle(f2, f3, ((f4 * this.f87820f7l8) - 1.0f) - 1.0f, this.f40437g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f40439n.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: k */
    public float m26018k() {
        return this.f87820f7l8;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f40439n.setAlpha(i2);
        if (this.f40441y) {
            if (i2 == this.f40438k) {
                this.f40437g.setAlpha(this.f87822zy);
            } else if (i2 == this.f87821toq) {
                this.f40437g.setAlpha(this.f40440q);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40439n.setColorFilter(colorFilter);
    }

    public void toq(float f2) {
        this.f87820f7l8 = f2;
    }

    public toq(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f40439n = new Paint();
        this.f40437g = new Paint();
        this.f87820f7l8 = 1.0f;
        this.f40439n.setAntiAlias(true);
        this.f40439n.setColor(i2);
        this.f40438k = i3;
        this.f87821toq = i4;
        boolean z2 = i5 != 0;
        this.f40441y = z2;
        if (z2) {
            this.f40437g.setAntiAlias(true);
            this.f40437g.setColor(i5);
            this.f40437g.setStyle(Paint.Style.STROKE);
            this.f40437g.setStrokeWidth(2.0f);
        }
        this.f87822zy = i6;
        this.f40440q = i7;
    }
}
