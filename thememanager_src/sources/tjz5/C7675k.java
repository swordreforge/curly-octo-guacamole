package tjz5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import miuix.internal.graphics.drawable.C7157g;
import zy.lvui;

/* JADX INFO: renamed from: tjz5.k */
/* JADX INFO: compiled from: MaskTaggingDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7675k extends C7157g {

    /* JADX INFO: renamed from: c */
    private boolean f44344c;

    /* JADX INFO: renamed from: f */
    private boolean f44345f;

    /* JADX INFO: renamed from: g */
    private Paint f44346g;

    /* JADX INFO: renamed from: h */
    private int f44347h;

    /* JADX INFO: renamed from: i */
    private int f44348i;

    /* JADX INFO: renamed from: l */
    private boolean f44349l;

    /* JADX INFO: renamed from: p */
    private int f44350p;

    /* JADX INFO: renamed from: r */
    private boolean f44351r;

    /* JADX INFO: renamed from: s */
    private int f44352s;

    /* JADX INFO: renamed from: t */
    private int f44353t;

    /* JADX INFO: renamed from: y */
    private int f44354y;

    /* JADX INFO: renamed from: z */
    private int f44355z;

    public C7675k(Drawable drawable) {
        super(drawable);
        this.f44349l = false;
        this.f44345f = false;
        this.f44344c = false;
    }

    private void f7l8(@lvui Canvas canvas, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z5, boolean z6) {
        float f2 = i3;
        float f3 = i5;
        RectF rectF = new RectF(i2, f2, i4, f3);
        RectF rectF2 = new RectF(i2 + (z6 ? this.f44347h : this.f44350p), f2, i4 - (z6 ? this.f44350p : this.f44347h), f3);
        Path path = new Path();
        float f4 = z2 ? this.f44348i : 0.0f;
        float f5 = z3 ? this.f44348i : 0.0f;
        path.addRoundRect(rectF2, new float[]{f4, f4, f4, f4, f5, f5, f5, f5}, Path.Direction.CW);
        int iSaveLayer = canvas.saveLayer(rectF, this.f44346g, 31);
        canvas.drawRect(rectF, this.f44346g);
        if (z5) {
            this.f44346g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        } else {
            this.f44346g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        }
        canvas.drawPath(path, this.f44346g);
        this.f44346g.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // miuix.internal.graphics.drawable.C7158k, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (!this.f44344c || this.f44346g == null) {
            return;
        }
        if (this.f44355z == 0 && this.f44353t == 0) {
            return;
        }
        Rect bounds = getBounds();
        int i2 = this.f44355z;
        int i3 = bounds.top;
        f7l8(canvas, i2, i3 - this.f44354y, this.f44353t, i3, false, false, true, this.f44351r);
        int i4 = this.f44355z;
        int i5 = bounds.bottom;
        f7l8(canvas, i4, i5, this.f44353t, i5 + this.f44352s, false, false, true, this.f44351r);
        f7l8(canvas, this.f44355z, bounds.top, this.f44353t, bounds.bottom, this.f44349l, this.f44345f, false, this.f44351r);
    }

    public void ld6(boolean z2) {
        this.f44344c = z2;
    }

    /* JADX INFO: renamed from: p */
    public void m28031p(int i2, int i3, boolean z2) {
        this.f44351r = z2;
        this.f44355z = i2;
        this.f44353t = i3;
    }

    /* JADX INFO: renamed from: s */
    public void m28032s(Paint paint, int i2, int i3, int i4, int i5, int i6) {
        this.f44346g = paint;
        this.f44354y = i2;
        this.f44352s = i3;
        this.f44350p = i4;
        this.f44347h = i5;
        this.f44348i = i6;
    }

    public void x2(boolean z2, boolean z3) {
        this.f44349l = z2;
        this.f44345f = z3;
    }

    /* JADX INFO: renamed from: y */
    public boolean m28033y() {
        return this.f44344c;
    }

    public C7675k(Drawable drawable, int[] iArr) {
        super(drawable, iArr);
        this.f44349l = false;
        this.f44345f = false;
        this.f44344c = false;
    }
}
