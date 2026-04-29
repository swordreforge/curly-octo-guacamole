package uo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import miuix.smooth.C7336s;

/* JADX INFO: renamed from: uo.k */
/* JADX INFO: compiled from: SmoothDrawHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7699k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final float f95463ld6 = 0.5f;

    /* JADX INFO: renamed from: g */
    private Paint f44595g;

    /* JADX INFO: renamed from: n */
    private RectF f44597n;

    /* JADX INFO: renamed from: p */
    private C7336s f44598p;

    /* JADX INFO: renamed from: q */
    private float f44599q;

    /* JADX INFO: renamed from: s */
    private Path f44600s;

    /* JADX INFO: renamed from: y */
    private Path f44601y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float[] f95466zy;

    /* JADX INFO: renamed from: k */
    private int f44596k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f95465toq = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Paint f95464f7l8 = new Paint(1);

    public C7699k() {
        Paint paint = new Paint(1);
        this.f44595g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f44601y = new Path();
        this.f44600s = new Path();
        this.f44598p = new C7336s();
        this.f44597n = new RectF();
    }

    private Path f7l8(Path path, RectF rectF, float[] fArr, float f2, float f3, float f4) {
        return this.f44598p.o1t(path, fArr == null ? this.f44598p.t8r(rectF, f2, f3, f4) : this.f44598p.fn3e(rectF, fArr, f3, f4));
    }

    /* JADX INFO: renamed from: g */
    public Path m28090g(Rect rect) {
        float f2 = this.f44596k != 0 && this.f44595g.getAlpha() != 0 && Color.alpha(this.f95465toq) != 0 ? 0.5f + (this.f44596k / 2.0f) : 0.5f;
        return f7l8(new Path(), new RectF(rect), this.f95466zy, this.f44599q, f2, f2);
    }

    /* JADX INFO: renamed from: k */
    public void m28091k(Canvas canvas, Xfermode xfermode) {
        this.f95464f7l8.setXfermode(xfermode);
        canvas.drawPath(this.f44600s, this.f95464f7l8);
        this.f95464f7l8.setXfermode(null);
    }

    public void kja0(int i2) {
        this.f44596k = i2;
    }

    public void ld6(int i2) {
        this.f44595g.setAlpha(i2);
    }

    /* JADX INFO: renamed from: n */
    public float m28092n() {
        return this.f44599q;
    }

    public void n7h(int i2) {
        this.f95465toq = i2;
    }

    /* JADX INFO: renamed from: p */
    public void m28093p(Rect rect) {
        this.f44597n.set(rect.left - 0.5f, rect.top - 0.5f, rect.right + 0.5f, rect.bottom + 0.5f);
        float f2 = this.f44596k != 0 && this.f44595g.getAlpha() != 0 && Color.alpha(this.f95465toq) != 0 ? 0.5f + (this.f44596k / 2.0f) : 0.5f;
        this.f44601y = f7l8(this.f44601y, this.f44597n, this.f95466zy, this.f44599q, f2, f2);
        Path path = this.f44600s;
        if (path != null) {
            path.reset();
        } else {
            this.f44600s = new Path();
        }
        this.f44600s.addRect(this.f44597n, Path.Direction.CW);
        this.f44600s.op(this.f44601y, Path.Op.DIFFERENCE);
    }

    /* JADX INFO: renamed from: q */
    public float[] m28094q() {
        return this.f95466zy;
    }

    public void qrj(float f2) {
        this.f44599q = f2;
    }

    /* JADX INFO: renamed from: s */
    public int m28095s() {
        return this.f44596k;
    }

    public void toq(Canvas canvas) {
        if ((this.f44596k == 0 || this.f44595g.getAlpha() == 0 || Color.alpha(this.f95465toq) == 0) ? false : true) {
            canvas.save();
            this.f44595g.setStrokeWidth(this.f44596k);
            this.f44595g.setColor(this.f95465toq);
            canvas.drawPath(this.f44601y, this.f44595g);
            canvas.restore();
        }
    }

    public void x2(float[] fArr) {
        this.f95466zy = fArr;
    }

    /* JADX INFO: renamed from: y */
    public int m28096y() {
        return this.f95465toq;
    }

    public int zy() {
        return this.f44595g.getAlpha();
    }
}
