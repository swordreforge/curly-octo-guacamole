package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.InterfaceC0373n;
import androidx.constraintlayout.motion.widget.zy;
import androidx.constraintlayout.widget.C0394g;
import androidx.core.view.qrj;
import p030n.C7397k;
import zy.dd;
import zy.hyr;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements InterfaceC0373n {
    private static final int ar = 1;
    private static final int bc = 2;
    private static final int bu = 3;
    static String k0 = "MotionLabel";

    /* JADX INFO: renamed from: a */
    private int f2553a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private float f48446ab;
    Rect ac;
    Paint ad;
    float aj;
    float am;
    Matrix an;
    private float as;
    Paint ax;
    float ay;
    private float az;

    /* JADX INFO: renamed from: b */
    private int f2554b;
    private float ba;
    private float bb;
    float be;
    private float bg;
    private Matrix bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private Layout f48447bo;
    private float bp;
    private int bq;
    float bs;
    private Drawable bv;

    /* JADX INFO: renamed from: c */
    private String f2555c;

    /* JADX INFO: renamed from: d */
    private int f2556d;

    /* JADX INFO: renamed from: e */
    boolean f2557e;

    /* JADX INFO: renamed from: f */
    private float f2558f;

    /* JADX INFO: renamed from: g */
    private int f2559g;

    /* JADX INFO: renamed from: h */
    ViewOutlineProvider f2560h;

    /* JADX INFO: renamed from: i */
    RectF f2561i;
    private Bitmap id;
    private BitmapShader in;

    /* JADX INFO: renamed from: j */
    private Rect f2562j;

    /* JADX INFO: renamed from: k */
    TextPaint f2563k;

    /* JADX INFO: renamed from: l */
    private int f2564l;

    /* JADX INFO: renamed from: m */
    private int f2565m;

    /* JADX INFO: renamed from: n */
    private int f2566n;

    /* JADX INFO: renamed from: o */
    private CharSequence f2567o;

    /* JADX INFO: renamed from: p */
    private float f2568p;

    /* JADX INFO: renamed from: q */
    Path f2569q;

    /* JADX INFO: renamed from: r */
    private int f2570r;

    /* JADX INFO: renamed from: s */
    private float f2571s;

    /* JADX INFO: renamed from: t */
    private float f2572t;

    /* JADX INFO: renamed from: u */
    private String f2573u;

    /* JADX INFO: renamed from: v */
    private int f2574v;

    /* JADX INFO: renamed from: w */
    private boolean f2575w;

    /* JADX INFO: renamed from: x */
    private int f2576x;

    /* JADX INFO: renamed from: y */
    private boolean f2577y;

    /* JADX INFO: renamed from: z */
    private float f2578z;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionLabel$k */
    class C0389k extends ViewOutlineProvider {
        C0389k() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.f2571s) / 2.0f);
        }
    }

    class toq extends ViewOutlineProvider {
        toq() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f2568p);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f2563k = new TextPaint();
        this.f2569q = new Path();
        this.f2566n = 65535;
        this.f2559g = 65535;
        this.f2577y = false;
        this.f2571s = 0.0f;
        this.f2568p = Float.NaN;
        this.f2578z = 48.0f;
        this.f2572t = Float.NaN;
        this.f2558f = 0.0f;
        this.f2555c = "Hello World";
        this.f2557e = true;
        this.f2562j = new Rect();
        this.f2565m = 1;
        this.f2554b = 1;
        this.f2553a = 1;
        this.f2576x = 1;
        this.f2574v = 8388659;
        this.f2556d = 0;
        this.f2575w = false;
        this.as = Float.NaN;
        this.bg = Float.NaN;
        this.az = 0.0f;
        this.ba = 0.0f;
        this.ax = new Paint();
        this.bq = 0;
        this.ay = Float.NaN;
        this.be = Float.NaN;
        this.aj = Float.NaN;
        this.bs = Float.NaN;
        f7l8(context, null);
    }

    private void f7l8(Context context, AttributeSet attrs) {
        m1612s(context, attrs);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.jej);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.wz) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == C0394g.qrj.b5) {
                    this.f2573u = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == C0394g.qrj.l8y) {
                    this.f2572t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2572t);
                } else if (index == C0394g.qrj.ch1s) {
                    this.f2578z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2578z);
                } else if (index == C0394g.qrj.hop) {
                    this.f2570r = typedArrayObtainStyledAttributes.getInt(index, this.f2570r);
                } else if (index == C0394g.qrj.rxcq) {
                    this.f2564l = typedArrayObtainStyledAttributes.getInt(index, this.f2564l);
                } else if (index == C0394g.qrj.jci) {
                    this.f2566n = typedArrayObtainStyledAttributes.getColor(index, this.f2566n);
                } else if (index == C0394g.qrj.cph) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f2568p);
                    this.f2568p = dimension;
                    setRound(dimension);
                } else if (index == C0394g.qrj.yy) {
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.f2571s);
                    this.f2571s = f2;
                    setRoundPercent(f2);
                } else if (index == C0394g.qrj.no) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == C0394g.qrj.yi) {
                    this.f2556d = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C0394g.qrj.q28) {
                    this.f2559g = typedArrayObtainStyledAttributes.getInt(index, this.f2559g);
                    this.f2577y = true;
                } else if (index == C0394g.qrj.c1f) {
                    this.f2558f = typedArrayObtainStyledAttributes.getDimension(index, this.f2558f);
                    this.f2577y = true;
                } else if (index == C0394g.qrj.ow0) {
                    this.bv = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f2577y = true;
                } else if (index == C0394g.qrj.gu) {
                    this.ay = typedArrayObtainStyledAttributes.getFloat(index, this.ay);
                } else if (index == C0394g.qrj.mnxh) {
                    this.be = typedArrayObtainStyledAttributes.getFloat(index, this.be);
                } else if (index == C0394g.qrj.ygct) {
                    this.az = typedArrayObtainStyledAttributes.getFloat(index, this.az);
                } else if (index == C0394g.qrj.bzx) {
                    this.ba = typedArrayObtainStyledAttributes.getFloat(index, this.ba);
                } else if (index == C0394g.qrj.iq) {
                    this.bs = typedArrayObtainStyledAttributes.getFloat(index, this.bs);
                } else if (index == C0394g.qrj.l7p) {
                    this.aj = typedArrayObtainStyledAttributes.getFloat(index, this.aj);
                } else if (index == C0394g.qrj.j2) {
                    this.as = typedArrayObtainStyledAttributes.getDimension(index, this.as);
                } else if (index == C0394g.qrj.zjr) {
                    this.bg = typedArrayObtainStyledAttributes.getDimension(index, this.bg);
                } else if (index == C0394g.qrj.q68) {
                    this.bq = typedArrayObtainStyledAttributes.getInt(index, this.bq);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        ld6();
        m1616p();
    }

    private float getHorizontalOffset() {
        float f2 = Float.isNaN(this.f2572t) ? 1.0f : this.f2578z / this.f2572t;
        TextPaint textPaint = this.f2563k;
        String str = this.f2555c;
        return (((((Float.isNaN(this.bb) ? getMeasuredWidth() : this.bb) - getPaddingLeft()) - getPaddingRight()) - (f2 * textPaint.measureText(str, 0, str.length()))) * (this.az + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f2 = Float.isNaN(this.f2572t) ? 1.0f : this.f2578z / this.f2572t;
        Paint.FontMetrics fontMetrics = this.f2563k.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.bp) ? getMeasuredHeight() : this.bp) - getPaddingTop()) - getPaddingBottom();
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((measuredHeight - ((f3 - f4) * f2)) * (1.0f - this.ba)) / 2.0f) - (f2 * f4);
    }

    private void ld6() {
        if (this.bv != null) {
            this.bl = new Matrix();
            int intrinsicWidth = this.bv.getIntrinsicWidth();
            int intrinsicHeight = this.bv.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.bg) ? 128 : (int) this.bg;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.as) ? 128 : (int) this.as;
            }
            if (this.bq != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.id = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.id);
            this.bv.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.bv.setFilterBitmap(true);
            this.bv.draw(canvas);
            if (this.bq != 0) {
                this.id = m1615n(this.id, 4);
            }
            Bitmap bitmap = this.id;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.in = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m1611q(float l2, float t2, float r2, float b2) {
        if (this.bl == null) {
            return;
        }
        this.bb = r2 - l2;
        this.bp = b2 - t2;
        x2();
    }

    /* JADX INFO: renamed from: s */
    private void m1612s(Context context, @dd AttributeSet attrs) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7397k.toq.f92982wo, typedValue, true);
        TextPaint textPaint = this.f2563k;
        int i2 = typedValue.data;
        this.f2566n = i2;
        textPaint.setColor(i2);
    }

    private void x2() {
        float f2 = Float.isNaN(this.ay) ? 0.0f : this.ay;
        float f3 = Float.isNaN(this.be) ? 0.0f : this.be;
        float f4 = Float.isNaN(this.aj) ? 1.0f : this.aj;
        float f5 = Float.isNaN(this.bs) ? 0.0f : this.bs;
        this.bl.reset();
        float width = this.id.getWidth();
        float height = this.id.getHeight();
        float f6 = Float.isNaN(this.bg) ? this.bb : this.bg;
        float f7 = Float.isNaN(this.as) ? this.bp : this.as;
        float f8 = f4 * (width * f7 < height * f6 ? f6 / width : f7 / height);
        this.bl.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f6 - f9;
        float f11 = f8 * height;
        float f12 = f7 - f11;
        if (!Float.isNaN(this.as)) {
            f12 = this.as / 2.0f;
        }
        if (!Float.isNaN(this.bg)) {
            f10 = this.bg / 2.0f;
        }
        this.bl.postTranslate((((f2 * f10) + f6) - f9) * 0.5f, (((f3 * f12) + f7) - f11) * 0.5f);
        this.bl.postRotate(f5, f6 / 2.0f, f7 / 2.0f);
        this.in.setLocalMatrix(this.bl);
    }

    /* JADX INFO: renamed from: y */
    private void m1613y(String familyName, int typefaceIndex, int styleIndex) {
        Typeface typefaceCreate;
        if (familyName != null) {
            typefaceCreate = Typeface.create(familyName, styleIndex);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (typefaceIndex == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (typefaceIndex == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (typefaceIndex == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (styleIndex <= 0) {
            this.f2563k.setFakeBoldText(false);
            this.f2563k.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(styleIndex) : Typeface.create(typefaceCreate, styleIndex);
            setTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & styleIndex;
            this.f2563k.setFakeBoldText((i2 & 1) != 0);
            this.f2563k.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    /* JADX INFO: renamed from: g */
    void m1614g(float scale) {
        if (this.f2577y || scale != 1.0f) {
            this.f2569q.reset();
            String str = this.f2555c;
            int length = str.length();
            this.f2563k.getTextBounds(str, 0, length, this.f2562j);
            this.f2563k.getTextPath(str, 0, length, 0.0f, 0.0f, this.f2569q);
            if (scale != 1.0f) {
                Log.v(k0, zy.m1596g() + " scale " + scale);
                Matrix matrix = new Matrix();
                matrix.postScale(scale, scale);
                this.f2569q.transform(matrix);
            }
            Rect rect = this.f2562j;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f2557e = false;
        }
    }

    public float getRound() {
        return this.f2568p;
    }

    public float getRoundPercent() {
        return this.f2571s;
    }

    public float getScaleFromTextSize() {
        return this.f2572t;
    }

    public float getTextBackgroundPanX() {
        return this.ay;
    }

    public float getTextBackgroundPanY() {
        return this.be;
    }

    public float getTextBackgroundRotate() {
        return this.bs;
    }

    public float getTextBackgroundZoom() {
        return this.aj;
    }

    public int getTextOutlineColor() {
        return this.f2559g;
    }

    public float getTextPanX() {
        return this.az;
    }

    public float getTextPanY() {
        return this.ba;
    }

    public float getTextureHeight() {
        return this.as;
    }

    public float getTextureWidth() {
        return this.bg;
    }

    public Typeface getTypeface() {
        return this.f2563k.getTypeface();
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0373n
    /* JADX INFO: renamed from: k */
    public void mo1482k(float l2, float t2, float r2, float b2) {
        int i2 = (int) (l2 + 0.5f);
        this.f48446ab = l2 - i2;
        int i3 = (int) (r2 + 0.5f);
        int i4 = i3 - i2;
        int i5 = (int) (b2 + 0.5f);
        int i6 = (int) (0.5f + t2);
        int i7 = i5 - i6;
        float f2 = r2 - l2;
        this.bb = f2;
        float f3 = b2 - t2;
        this.bp = f3;
        m1611q(l2, t2, r2, b2);
        if (getMeasuredHeight() == i7 && getMeasuredWidth() == i4) {
            super.layout(i2, i6, i3, i5);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            super.layout(i2, i6, i3, i5);
        }
        if (this.f2575w) {
            if (this.ac == null) {
                this.ad = new Paint();
                this.ac = new Rect();
                this.ad.set(this.f2563k);
                this.am = this.ad.getTextSize();
            }
            this.bb = f2;
            this.bp = f3;
            Paint paint = this.ad;
            String str = this.f2555c;
            paint.getTextBounds(str, 0, str.length(), this.ac);
            float fHeight = this.ac.height() * 1.3f;
            float f4 = (f2 - this.f2554b) - this.f2565m;
            float f5 = (f3 - this.f2576x) - this.f2553a;
            float fWidth = this.ac.width();
            if (fWidth * f5 > fHeight * f4) {
                this.f2563k.setTextSize((this.am * f4) / fWidth);
            } else {
                this.f2563k.setTextSize((this.am * f5) / fHeight);
            }
            if (this.f2577y || !Float.isNaN(this.f2572t)) {
                m1614g(Float.isNaN(this.f2572t) ? 1.0f : this.f2578z / this.f2572t);
            }
        }
    }

    @Override // android.view.View
    public void layout(int l2, int t2, int r2, int b2) {
        super.layout(l2, t2, r2, b2);
        boolean zIsNaN = Float.isNaN(this.f2572t);
        float f2 = zIsNaN ? 1.0f : this.f2578z / this.f2572t;
        this.bb = r2 - l2;
        this.bp = b2 - t2;
        if (this.f2575w) {
            if (this.ac == null) {
                this.ad = new Paint();
                this.ac = new Rect();
                this.ad.set(this.f2563k);
                this.am = this.ad.getTextSize();
            }
            Paint paint = this.ad;
            String str = this.f2555c;
            paint.getTextBounds(str, 0, str.length(), this.ac);
            int iWidth = this.ac.width();
            int iHeight = (int) (this.ac.height() * 1.3f);
            float f3 = (this.bb - this.f2554b) - this.f2565m;
            float f4 = (this.bp - this.f2576x) - this.f2553a;
            if (zIsNaN) {
                float f5 = iWidth;
                float f6 = iHeight;
                if (f5 * f4 > f6 * f3) {
                    this.f2563k.setTextSize((this.am * f3) / f5);
                } else {
                    this.f2563k.setTextSize((this.am * f4) / f6);
                }
            } else {
                float f7 = iWidth;
                float f8 = iHeight;
                f2 = f7 * f4 > f8 * f3 ? f3 / f7 : f4 / f8;
            }
        }
        if (this.f2577y || !zIsNaN) {
            m1611q(l2, t2, r2, b2);
            m1614g(f2);
        }
    }

    /* JADX INFO: renamed from: n */
    Bitmap m1615n(Bitmap bitmapOriginal, int factor) {
        System.nanoTime();
        int width = bitmapOriginal.getWidth() / 2;
        int height = bitmapOriginal.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapOriginal, width, height, true);
        for (int i2 = 0; i2 < factor && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2 = Float.isNaN(this.f2572t) ? 1.0f : this.f2578z / this.f2572t;
        super.onDraw(canvas);
        if (!this.f2577y && f2 == 1.0f) {
            canvas.drawText(this.f2555c, this.f48446ab + this.f2565m + getHorizontalOffset(), this.f2553a + getVerticalOffset(), this.f2563k);
            return;
        }
        if (this.f2557e) {
            m1614g(f2);
        }
        if (this.an == null) {
            this.an = new Matrix();
        }
        if (!this.f2577y) {
            float horizontalOffset = this.f2565m + getHorizontalOffset();
            float verticalOffset = this.f2553a + getVerticalOffset();
            this.an.reset();
            this.an.preTranslate(horizontalOffset, verticalOffset);
            this.f2569q.transform(this.an);
            this.f2563k.setColor(this.f2566n);
            this.f2563k.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f2563k.setStrokeWidth(this.f2558f);
            canvas.drawPath(this.f2569q, this.f2563k);
            this.an.reset();
            this.an.preTranslate(-horizontalOffset, -verticalOffset);
            this.f2569q.transform(this.an);
            return;
        }
        this.ax.set(this.f2563k);
        this.an.reset();
        float horizontalOffset2 = this.f2565m + getHorizontalOffset();
        float verticalOffset2 = this.f2553a + getVerticalOffset();
        this.an.postTranslate(horizontalOffset2, verticalOffset2);
        this.an.preScale(f2, f2);
        this.f2569q.transform(this.an);
        if (this.in != null) {
            this.f2563k.setFilterBitmap(true);
            this.f2563k.setShader(this.in);
        } else {
            this.f2563k.setColor(this.f2566n);
        }
        this.f2563k.setStyle(Paint.Style.FILL);
        this.f2563k.setStrokeWidth(this.f2558f);
        canvas.drawPath(this.f2569q, this.f2563k);
        if (this.in != null) {
            this.f2563k.setShader(null);
        }
        this.f2563k.setColor(this.f2559g);
        this.f2563k.setStyle(Paint.Style.STROKE);
        this.f2563k.setStrokeWidth(this.f2558f);
        canvas.drawPath(this.f2569q, this.f2563k);
        this.an.reset();
        this.an.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f2569q.transform(this.an);
        this.f2563k.set(this.ax);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        this.f2575w = false;
        this.f2565m = getPaddingLeft();
        this.f2554b = getPaddingRight();
        this.f2553a = getPaddingTop();
        this.f2576x = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f2563k;
            String str = this.f2555c;
            textPaint.getTextBounds(str, 0, str.length(), this.f2562j);
            if (mode != 1073741824) {
                size = (int) (this.f2562j.width() + 0.99999f);
            }
            size += this.f2565m + this.f2554b;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f2563k.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f2553a + this.f2576x + fontMetricsInt;
            }
        } else if (this.f2556d != 0) {
            this.f2575w = true;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: renamed from: p */
    void m1616p() {
        this.f2565m = getPaddingLeft();
        this.f2554b = getPaddingRight();
        this.f2553a = getPaddingTop();
        this.f2576x = getPaddingBottom();
        m1613y(this.f2573u, this.f2564l, this.f2570r);
        this.f2563k.setColor(this.f2566n);
        this.f2563k.setStrokeWidth(this.f2558f);
        this.f2563k.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f2563k.setFlags(128);
        setTextSize(this.f2578z);
        this.f2563k.setAntiAlias(true);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int gravity) {
        if ((gravity & qrj.f4101q) == 0) {
            gravity |= qrj.f50865toq;
        }
        if ((gravity & 112) == 0) {
            gravity |= 48;
        }
        if (gravity != this.f2574v) {
            invalidate();
        }
        this.f2574v = gravity;
        int i2 = gravity & 112;
        if (i2 == 48) {
            this.ba = -1.0f;
        } else if (i2 != 80) {
            this.ba = 0.0f;
        } else {
            this.ba = 1.0f;
        }
        int i3 = gravity & qrj.f4101q;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.az = 0.0f;
                        return;
                    }
                }
            }
            this.az = 1.0f;
            return;
        }
        this.az = -1.0f;
    }

    @hyr(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f2568p = round;
            float f2 = this.f2571s;
            this.f2571s = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.f2568p != round;
        this.f2568p = round;
        if (round != 0.0f) {
            if (this.f2569q == null) {
                this.f2569q = new Path();
            }
            if (this.f2561i == null) {
                this.f2561i = new RectF();
            }
            if (this.f2560h == null) {
                toq toqVar = new toq();
                this.f2560h = toqVar;
                setOutlineProvider(toqVar);
            }
            setClipToOutline(true);
            this.f2561i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2569q.reset();
            Path path = this.f2569q;
            RectF rectF = this.f2561i;
            float f3 = this.f2568p;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    @hyr(21)
    public void setRoundPercent(float round) {
        boolean z2 = this.f2571s != round;
        this.f2571s = round;
        if (round != 0.0f) {
            if (this.f2569q == null) {
                this.f2569q = new Path();
            }
            if (this.f2561i == null) {
                this.f2561i = new RectF();
            }
            if (this.f2560h == null) {
                C0389k c0389k = new C0389k();
                this.f2560h = c0389k;
                setOutlineProvider(c0389k);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2571s) / 2.0f;
            this.f2561i.set(0.0f, 0.0f, width, height);
            this.f2569q.reset();
            this.f2569q.addRoundRect(this.f2561i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float size) {
        this.f2572t = size;
    }

    public void setText(CharSequence text) {
        this.f2555c = text.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float pan) {
        this.ay = pan;
        x2();
        invalidate();
    }

    public void setTextBackgroundPanY(float pan) {
        this.be = pan;
        x2();
        invalidate();
    }

    public void setTextBackgroundRotate(float rotation) {
        this.bs = rotation;
        x2();
        invalidate();
    }

    public void setTextBackgroundZoom(float zoom) {
        this.aj = zoom;
        x2();
        invalidate();
    }

    public void setTextFillColor(int color) {
        this.f2566n = color;
        invalidate();
    }

    public void setTextOutlineColor(int color) {
        this.f2559g = color;
        this.f2577y = true;
        invalidate();
    }

    public void setTextOutlineThickness(float width) {
        this.f2558f = width;
        this.f2577y = true;
        if (Float.isNaN(width)) {
            this.f2558f = 1.0f;
            this.f2577y = false;
        }
        invalidate();
    }

    public void setTextPanX(float textPanX) {
        this.az = textPanX;
        invalidate();
    }

    public void setTextPanY(float textPanY) {
        this.ba = textPanY;
        invalidate();
    }

    public void setTextSize(float size) {
        this.f2578z = size;
        Log.v(k0, zy.m1596g() + "  " + size + " / " + this.f2572t);
        TextPaint textPaint = this.f2563k;
        if (!Float.isNaN(this.f2572t)) {
            size = this.f2572t;
        }
        textPaint.setTextSize(size);
        m1614g(Float.isNaN(this.f2572t) ? 1.0f : this.f2578z / this.f2572t);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float mTextureHeight) {
        this.as = mTextureHeight;
        x2();
        invalidate();
    }

    public void setTextureWidth(float mTextureWidth) {
        this.bg = mTextureWidth;
        x2();
        invalidate();
    }

    public void setTypeface(Typeface tf) {
        if (this.f2563k.getTypeface() != tf) {
            this.f2563k.setTypeface(tf);
            if (this.f48447bo != null) {
                this.f48447bo = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public MotionLabel(Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f2563k = new TextPaint();
        this.f2569q = new Path();
        this.f2566n = 65535;
        this.f2559g = 65535;
        this.f2577y = false;
        this.f2571s = 0.0f;
        this.f2568p = Float.NaN;
        this.f2578z = 48.0f;
        this.f2572t = Float.NaN;
        this.f2558f = 0.0f;
        this.f2555c = "Hello World";
        this.f2557e = true;
        this.f2562j = new Rect();
        this.f2565m = 1;
        this.f2554b = 1;
        this.f2553a = 1;
        this.f2576x = 1;
        this.f2574v = 8388659;
        this.f2556d = 0;
        this.f2575w = false;
        this.as = Float.NaN;
        this.bg = Float.NaN;
        this.az = 0.0f;
        this.ba = 0.0f;
        this.ax = new Paint();
        this.bq = 0;
        this.ay = Float.NaN;
        this.be = Float.NaN;
        this.aj = Float.NaN;
        this.bs = Float.NaN;
        f7l8(context, attrs);
    }

    public MotionLabel(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2563k = new TextPaint();
        this.f2569q = new Path();
        this.f2566n = 65535;
        this.f2559g = 65535;
        this.f2577y = false;
        this.f2571s = 0.0f;
        this.f2568p = Float.NaN;
        this.f2578z = 48.0f;
        this.f2572t = Float.NaN;
        this.f2558f = 0.0f;
        this.f2555c = "Hello World";
        this.f2557e = true;
        this.f2562j = new Rect();
        this.f2565m = 1;
        this.f2554b = 1;
        this.f2553a = 1;
        this.f2576x = 1;
        this.f2574v = 8388659;
        this.f2556d = 0;
        this.f2575w = false;
        this.as = Float.NaN;
        this.bg = Float.NaN;
        this.az = 0.0f;
        this.ba = 0.0f;
        this.ax = new Paint();
        this.bq = 0;
        this.ay = Float.NaN;
        this.be = Float.NaN;
        this.aj = Float.NaN;
        this.bs = Float.NaN;
        f7l8(context, attrs);
    }
}
