package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.zy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import lh.C6775k;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: compiled from: CircularRevealHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f67475kja0 = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final boolean f67476ld6 = false;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f67477n7h = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f67478qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f67479x2 = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private Drawable f67480f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private zy.C3979n f24161g;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3977k f24162k;

    /* JADX INFO: renamed from: n */
    @lvui
    private final Paint f24163n;

    /* JADX INFO: renamed from: p */
    private boolean f24164p;

    /* JADX INFO: renamed from: q */
    @lvui
    private final Paint f24165q;

    /* JADX INFO: renamed from: s */
    private boolean f24166s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final View f67481toq;

    /* JADX INFO: renamed from: y */
    private Paint f24167y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private final Path f67482zy;

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.toq$k */
    /* JADX INFO: compiled from: CircularRevealHelper.java */
    public interface InterfaceC3977k {
        /* JADX INFO: renamed from: q */
        boolean mo14243q();

        void zy(Canvas canvas);
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularRevealHelper.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7973toq {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public toq(InterfaceC3977k interfaceC3977k) {
        this.f24162k = interfaceC3977k;
        View view = (View) interfaceC3977k;
        this.f67481toq = view;
        view.setWillNotDraw(false);
        this.f67482zy = new Path();
        this.f24165q = new Paint(7);
        Paint paint = new Paint(1);
        this.f24163n = paint;
        paint.setColor(0);
    }

    private boolean cdj() {
        return (this.f24166s || this.f67480f7l8 == null || this.f24161g == null) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    private void m14245g(@lvui Canvas canvas) {
        if (cdj()) {
            Rect bounds = this.f67480f7l8.getBounds();
            float fWidth = this.f24161g.f24169k - (bounds.width() / 2.0f);
            float fHeight = this.f24161g.f67483toq - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f67480f7l8.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m14246h() {
        zy.C3979n c3979n = this.f24161g;
        boolean z2 = c3979n == null || c3979n.m14253k();
        return f67475kja0 == 0 ? !z2 && this.f24164p : !z2;
    }

    private boolean ki() {
        return (this.f24166s || Color.alpha(this.f24163n.getColor()) == 0) ? false : true;
    }

    private void ld6() {
        if (f67475kja0 == 1) {
            this.f67482zy.rewind();
            zy.C3979n c3979n = this.f24161g;
            if (c3979n != null) {
                this.f67482zy.addCircle(c3979n.f24169k, c3979n.f67483toq, c3979n.f67484zy, Path.Direction.CW);
            }
        }
        this.f67481toq.invalidate();
    }

    /* JADX INFO: renamed from: n */
    private void m14247n(@lvui Canvas canvas) {
        this.f24162k.zy(canvas);
        if (ki()) {
            zy.C3979n c3979n = this.f24161g;
            canvas.drawCircle(c3979n.f24169k, c3979n.f67483toq, c3979n.f67484zy, this.f24163n);
        }
        if (m14246h()) {
            m14248q(canvas, -16777216, 10.0f);
            m14248q(canvas, -65536, 5.0f);
        }
        m14245g(canvas);
    }

    /* JADX INFO: renamed from: q */
    private void m14248q(@lvui Canvas canvas, int i2, float f2) {
        this.f24167y.setColor(i2);
        this.f24167y.setStrokeWidth(f2);
        zy.C3979n c3979n = this.f24161g;
        canvas.drawCircle(c3979n.f24169k, c3979n.f67483toq, c3979n.f67484zy - (f2 / 2.0f), this.f24167y);
    }

    /* JADX INFO: renamed from: s */
    private float m14249s(@lvui zy.C3979n c3979n) {
        return C6775k.toq(c3979n.f24169k, c3979n.f67483toq, 0.0f, 0.0f, this.f67481toq.getWidth(), this.f67481toq.getHeight());
    }

    @dd
    public Drawable f7l8() {
        return this.f67480f7l8;
    }

    /* JADX INFO: renamed from: k */
    public void m14250k() {
        if (f67475kja0 == 0) {
            this.f24166s = true;
            this.f24164p = false;
            this.f67481toq.buildDrawingCache();
            Bitmap drawingCache = this.f67481toq.getDrawingCache();
            if (drawingCache == null && this.f67481toq.getWidth() != 0 && this.f67481toq.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f67481toq.getWidth(), this.f67481toq.getHeight(), Bitmap.Config.ARGB_8888);
                this.f67481toq.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f24165q;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f24166s = false;
            this.f24164p = true;
        }
    }

    public void kja0(@dd zy.C3979n c3979n) {
        if (c3979n == null) {
            this.f24161g = null;
        } else {
            zy.C3979n c3979n2 = this.f24161g;
            if (c3979n2 == null) {
                this.f24161g = new zy.C3979n(c3979n);
            } else {
                c3979n2.zy(c3979n);
            }
            if (C6775k.m24717n(c3979n.f67484zy, m14249s(c3979n), 1.0E-4f)) {
                this.f24161g.f67484zy = Float.MAX_VALUE;
            }
        }
        ld6();
    }

    public void n7h(@x2 int i2) {
        this.f24163n.setColor(i2);
        this.f67481toq.invalidate();
    }

    @dd
    /* JADX INFO: renamed from: p */
    public zy.C3979n m14251p() {
        zy.C3979n c3979n = this.f24161g;
        if (c3979n == null) {
            return null;
        }
        zy.C3979n c3979n2 = new zy.C3979n(c3979n);
        if (c3979n2.m14253k()) {
            c3979n2.f67484zy = m14249s(c3979n2);
        }
        return c3979n2;
    }

    public void qrj(@dd Drawable drawable) {
        this.f67480f7l8 = drawable;
        this.f67481toq.invalidate();
    }

    public void toq() {
        if (f67475kja0 == 0) {
            this.f24164p = false;
            this.f67481toq.destroyDrawingCache();
            this.f24165q.setShader(null);
            this.f67481toq.invalidate();
        }
    }

    public boolean x2() {
        return this.f24162k.mo14243q() && !m14246h();
    }

    @x2
    /* JADX INFO: renamed from: y */
    public int m14252y() {
        return this.f24163n.getColor();
    }

    public void zy(@lvui Canvas canvas) {
        if (m14246h()) {
            int i2 = f67475kja0;
            if (i2 == 0) {
                zy.C3979n c3979n = this.f24161g;
                canvas.drawCircle(c3979n.f24169k, c3979n.f67483toq, c3979n.f67484zy, this.f24165q);
                if (ki()) {
                    zy.C3979n c3979n2 = this.f24161g;
                    canvas.drawCircle(c3979n2.f24169k, c3979n2.f67483toq, c3979n2.f67484zy, this.f24163n);
                }
            } else if (i2 == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.f67482zy);
                this.f24162k.zy(canvas);
                if (ki()) {
                    canvas.drawRect(0.0f, 0.0f, this.f67481toq.getWidth(), this.f67481toq.getHeight(), this.f24163n);
                }
                canvas.restoreToCount(iSave);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i2);
                }
                this.f24162k.zy(canvas);
                if (ki()) {
                    canvas.drawRect(0.0f, 0.0f, this.f67481toq.getWidth(), this.f67481toq.getHeight(), this.f24163n);
                }
            }
        } else {
            this.f24162k.zy(canvas);
            if (ki()) {
                canvas.drawRect(0.0f, 0.0f, this.f67481toq.getWidth(), this.f67481toq.getHeight(), this.f24163n);
            }
        }
        m14245g(canvas);
    }
}
