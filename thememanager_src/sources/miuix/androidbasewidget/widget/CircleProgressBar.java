package miuix.androidbasewidget.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import kbj.toq;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.internal.util.C7164n;
import miuix.internal.util.n7h;

/* JADX INFO: loaded from: classes3.dex */
public class CircleProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: b */
    private static final int f38623b = 300;

    /* JADX INFO: renamed from: m */
    private static final int f38624m = 300;

    /* JADX INFO: renamed from: o */
    private static final int f38625o = 10;

    /* JADX INFO: renamed from: c */
    private int f38626c;

    /* JADX INFO: renamed from: e */
    private int f38627e;

    /* JADX INFO: renamed from: f */
    private int f38628f;

    /* JADX INFO: renamed from: g */
    private Animator f38629g;

    /* JADX INFO: renamed from: h */
    private Drawable[] f38630h;

    /* JADX INFO: renamed from: i */
    private InterfaceC6829k f38631i;

    /* JADX INFO: renamed from: j */
    private Drawable f38632j;

    /* JADX INFO: renamed from: l */
    private Paint f38633l;

    /* JADX INFO: renamed from: n */
    private Path f38634n;

    /* JADX INFO: renamed from: p */
    private Drawable[] f38635p;

    /* JADX INFO: renamed from: q */
    private RectF f38636q;

    /* JADX INFO: renamed from: r */
    private Canvas f38637r;

    /* JADX INFO: renamed from: s */
    private Drawable[] f38638s;

    /* JADX INFO: renamed from: t */
    private Bitmap f38639t;

    /* JADX INFO: renamed from: y */
    private int[] f38640y;

    /* JADX INFO: renamed from: z */
    private int f38641z;

    /* JADX INFO: renamed from: miuix.androidbasewidget.widget.CircleProgressBar$k */
    public interface InterfaceC6829k {
        /* JADX INFO: renamed from: k */
        void m24779k();
    }

    public CircleProgressBar(Context context) {
        this(context, null);
    }

    private Drawable f7l8(int i2) {
        Drawable[] drawableArr = this.f38635p;
        if (drawableArr == null) {
            return null;
        }
        return drawableArr[i2];
    }

    /* JADX INFO: renamed from: g */
    private Drawable m24775g(int i2) {
        Drawable[] drawableArr = this.f38630h;
        if (drawableArr == null) {
            return null;
        }
        return drawableArr[i2];
    }

    private int getIntrinsicHeight() {
        int intrinsicHeight = f7l8(0).getIntrinsicHeight();
        Drawable[] drawableArr = this.f38630h;
        if (drawableArr != null) {
            intrinsicHeight = Math.max(intrinsicHeight, drawableArr[0].getIntrinsicHeight());
        }
        Drawable[] drawableArr2 = this.f38638s;
        return drawableArr2 != null ? Math.max(intrinsicHeight, drawableArr2[0].getIntrinsicHeight()) : intrinsicHeight;
    }

    private int getIntrinsicWidth() {
        int intrinsicWidth = f7l8(0).getIntrinsicWidth();
        Drawable[] drawableArr = this.f38630h;
        if (drawableArr != null) {
            intrinsicWidth = Math.max(intrinsicWidth, drawableArr[0].getIntrinsicWidth());
        }
        Drawable[] drawableArr2 = this.f38638s;
        return drawableArr2 != null ? Math.max(intrinsicWidth, drawableArr2[0].getIntrinsicWidth()) : intrinsicWidth;
    }

    private float getRate() {
        return getProgress() / getMax();
    }

    /* JADX INFO: renamed from: n */
    private Drawable[] m24776n(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        Resources resources = getContext().getResources();
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            Drawable drawable = resources.getDrawable(iArr[i2]);
            drawableArr[i2] = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawableArr[i2].getIntrinsicHeight());
        }
        return drawableArr;
    }

    /* JADX INFO: renamed from: q */
    private Drawable m24777q(int i2) {
        Drawable[] drawableArr = this.f38638s;
        if (drawableArr == null) {
            return null;
        }
        return drawableArr[i2];
    }

    private int toq(int i2) {
        return (i2 * 1000) / this.f38627e;
    }

    private void zy(Canvas canvas, Drawable drawable, Drawable drawable2, Drawable drawable3, float f2, int i2) {
        if (drawable != null) {
            drawable.setAlpha(i2);
            drawable.draw(canvas);
        }
        if (canvas.isHardwareAccelerated()) {
            canvas.saveLayer(drawable3.getBounds().left, drawable3.getBounds().top, drawable3.getBounds().right, drawable3.getBounds().bottom, null, 31);
            this.f38633l.setStyle(Paint.Style.STROKE);
            this.f38633l.setStrokeWidth(drawable3.getBounds().width());
            this.f38634n.reset();
            this.f38634n.addArc(this.f38636q, -90.0f, f2 * 360.0f);
            canvas.drawPath(this.f38634n, this.f38633l);
            this.f38633l.setStyle(Paint.Style.FILL);
            this.f38633l.setStrokeWidth(0.0f);
            drawable3.setAlpha(i2);
            drawable3.draw(canvas);
            canvas.restore();
        } else {
            if (this.f38639t == null) {
                this.f38639t = Bitmap.createBitmap(drawable3.getBounds().width(), drawable3.getBounds().height(), Bitmap.Config.ARGB_8888);
                this.f38637r = new Canvas(this.f38639t);
            }
            this.f38639t.eraseColor(0);
            this.f38637r.save();
            this.f38637r.translate(-drawable3.getBounds().left, -drawable3.getBounds().top);
            this.f38637r.drawArc(this.f38636q, -90.0f, f2 * 360.0f, true, this.f38633l);
            drawable3.setAlpha(i2);
            drawable3.draw(this.f38637r);
            this.f38637r.restore();
            canvas.drawBitmap(this.f38639t, drawable3.getBounds().left, drawable3.getBounds().top, (Paint) null);
        }
        Drawable drawable4 = this.f38632j;
        if (drawable4 != null) {
            canvas.save();
            int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2;
            int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
            int intrinsicWidth = drawable4.getIntrinsicWidth();
            int intrinsicHeight = drawable4.getIntrinsicHeight();
            canvas.rotate((getProgress() * 360.0f) / getMax(), width, height);
            int i3 = intrinsicWidth / 2;
            int i4 = intrinsicHeight / 2;
            drawable4.setBounds(width - i3, height - i4, width + i3, height + i4);
            drawable4.draw(canvas);
            canvas.restore();
        }
        if (drawable2 != null) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int progressLevelCount = getProgressLevelCount();
        for (int i2 = 0; i2 < progressLevelCount; i2++) {
            Drawable[] drawableArr = this.f38638s;
            if (drawableArr != null) {
                drawableArr[i2].setState(getDrawableState());
            }
            Drawable[] drawableArr2 = this.f38635p;
            if (drawableArr2 != null) {
                drawableArr2[i2].setState(getDrawableState());
            }
            Drawable[] drawableArr3 = this.f38630h;
            if (drawableArr3 != null) {
                drawableArr3[i2].setState(getDrawableState());
            }
        }
        invalidate();
    }

    public int getPrevAlpha() {
        return this.f38626c;
    }

    public int getProgressLevelCount() {
        int[] iArr = this.f38640y;
        if (iArr == null) {
            return 1;
        }
        return 1 + iArr.length;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        zy(canvas, m24777q(this.f38641z), m24775g(this.f38641z), f7l8(this.f38641z), getRate(), 255 - this.f38626c);
        if (this.f38626c >= 10) {
            zy(canvas, m24777q(this.f38628f), m24775g(this.f38628f), f7l8(this.f38628f), getRate(), this.f38626c);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        setMeasuredDimension(getIntrinsicWidth(), getIntrinsicHeight());
    }

    public void setDrawablesForLevels(Drawable[] drawableArr, Drawable[] drawableArr2, Drawable[] drawableArr3) {
        this.f38638s = drawableArr;
        this.f38635p = drawableArr2;
        this.f38630h = drawableArr3;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                drawable.mutate();
            }
        }
        if (drawableArr2 != null) {
            for (Drawable drawable2 : drawableArr2) {
                drawable2.mutate();
            }
        }
        if (drawableArr3 != null) {
            for (Drawable drawable3 : drawableArr3) {
                drawable3.mutate();
            }
        }
        if (drawableArr2 != null) {
            for (Drawable drawable4 : drawableArr2) {
                if (drawable4 instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable4).getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                } else {
                    if (!(drawable4 instanceof NinePatchDrawable)) {
                        throw new IllegalArgumentException("'middles' must a bitmap or nine patch drawable.");
                    }
                    ((NinePatchDrawable) drawable4).getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
            }
            this.f38636q = new RectF(drawableArr2[0].getBounds().left - 5, drawableArr2[0].getBounds().top - 5, drawableArr2[0].getBounds().right + 5, drawableArr2[0].getBounds().bottom + 5);
        }
    }

    public void setOnProgressChangedListener(InterfaceC6829k interfaceC6829k) {
        this.f38631i = interfaceC6829k;
    }

    public void setPrevAlpha(int i2) {
        this.f38626c = i2;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
        int length;
        super.setProgress(i2);
        int[] iArr = this.f38640y;
        if (iArr == null) {
            length = 0;
        } else {
            length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                } else if (i2 < this.f38640y[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 != -1) {
                length = i3;
            }
        }
        int i4 = this.f38641z;
        if (length != i4) {
            this.f38628f = i4;
            this.f38641z = length;
            setPrevAlpha(255);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "prevAlpha", 0);
            objectAnimatorOfInt.setDuration(300L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
        }
        InterfaceC6829k interfaceC6829k = this.f38631i;
        if (interfaceC6829k != null) {
            interfaceC6829k.m24779k();
        }
    }

    public void setProgressByAnimator(int i2) {
        setProgressByAnimator(i2, null);
    }

    public void setProgressLevels(int[] iArr) {
        this.f38640y = iArr;
    }

    public void setRotateVelocity(int i2) {
        this.f38627e = i2;
    }

    public void setThumb(int i2) {
        setThumb(getResources().getDrawable(i2));
    }

    /* JADX INFO: renamed from: y */
    public void m24778y() {
        Animator animator = this.f38629g;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f38629g.cancel();
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setProgressByAnimator(int i2, Animator.AnimatorListener animatorListener) {
        m24778y();
        int iAbs = Math.abs((int) (((i2 - getProgress()) / getMax()) * 360.0f));
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "progress", i2);
        this.f38629g = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(toq(iAbs));
        this.f38629g.setInterpolator(getInterpolator());
        if (animatorListener != null) {
            this.f38629g.addListener(animatorListener);
        }
        this.f38629g.start();
    }

    public void setThumb(Drawable drawable) {
        this.f38632j = drawable;
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f38634n = new Path();
        this.f38627e = 300;
        setIndeterminate(false);
        int iM25947g = C7164n.m25947g(context, toq.zy.f81642ikck, context.getResources().getColor(n7h.qrj(context) ? toq.C6110n.f80989zsr0 : toq.C6110n.f80924py));
        Paint paint = new Paint();
        this.f38633l = paint;
        paint.setColor(iM25947g);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }

    public void setDrawablesForLevels(int[] iArr, int[] iArr2, int[] iArr3) {
        setDrawablesForLevels(m24776n(iArr), m24776n(iArr2), m24776n(iArr3));
    }
}
