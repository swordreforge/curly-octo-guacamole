package com.miui.clock;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.content.C0498q;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.module.EnumC5068g;
import com.miui.clock.module.qrj;
import gcp.C6062n;
import java.lang.reflect.Method;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiClockNumberView extends View {
    private static final String bv = "GlassNumberView";

    /* JADX INFO: renamed from: a */
    private float f28614a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private float f70904ab;

    /* JADX INFO: renamed from: b */
    private float f28615b;
    private float bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f70905bo;
    private boolean bp;

    /* JADX INFO: renamed from: c */
    private int f28616c;

    /* JADX INFO: renamed from: d */
    private float f28617d;

    /* JADX INFO: renamed from: e */
    private int f28618e;

    /* JADX INFO: renamed from: f */
    private int f28619f;

    /* JADX INFO: renamed from: g */
    private AbstractC5071k f28620g;

    /* JADX INFO: renamed from: h */
    private int f28621h;

    /* JADX INFO: renamed from: i */
    private int f28622i;

    /* JADX INFO: renamed from: j */
    private int f28623j;

    /* JADX INFO: renamed from: k */
    private Context f28624k;

    /* JADX INFO: renamed from: l */
    private int f28625l;

    /* JADX INFO: renamed from: m */
    private int f28626m;

    /* JADX INFO: renamed from: n */
    private EnumC5068g f28627n;

    /* JADX INFO: renamed from: o */
    private int f28628o;

    /* JADX INFO: renamed from: p */
    private int f28629p;

    /* JADX INFO: renamed from: q */
    private Drawable f28630q;

    /* JADX INFO: renamed from: r */
    private int f28631r;

    /* JADX INFO: renamed from: s */
    private final float[] f28632s;

    /* JADX INFO: renamed from: t */
    private int f28633t;

    /* JADX INFO: renamed from: u */
    private float f28634u;

    /* JADX INFO: renamed from: v */
    private float f28635v;

    /* JADX INFO: renamed from: w */
    private float f28636w;

    /* JADX INFO: renamed from: x */
    private float f28637x;

    /* JADX INFO: renamed from: y */
    private final Matrix f28638y;

    /* JADX INFO: renamed from: z */
    private int f28639z;

    /* JADX INFO: renamed from: com.miui.clock.MiuiClockNumberView$k */
    static /* synthetic */ class C5038k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f28640k;

        static {
            int[] iArr = new int[EnumC5068g.values().length];
            f28640k = iArr;
            try {
                iArr[EnumC5068g.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28640k[EnumC5068g.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28640k[EnumC5068g.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28640k[EnumC5068g.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MiuiClockNumberView(Context context) {
        super(context);
        this.f28627n = EnumC5068g.NONE;
        this.f28620g = new qrj();
        this.f28638y = new Matrix();
        this.f28632s = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f28637x = -1.0f;
        this.bp = false;
        m17540n(context);
    }

    private boolean f7l8() {
        return this.f28620g.mo17701p() == AbstractC5071k.k.Copperplate;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m17539g(Bitmap bitmap) {
        return bitmap == null || bitmap.isRecycled();
    }

    /* JADX INFO: renamed from: n */
    private void m17540n(Context context) {
        this.f28624k = context;
    }

    /* JADX INFO: renamed from: q */
    public static int m17541q(float f2) {
        return (int) ((f2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: y */
    private int m17542y(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        return mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? i2 : size : Math.min(i2, i3) : Math.min(Math.min(i2, size), i3);
    }

    public MiuiClockNumberView cdj(float f2) {
        this.bb = f2;
        this.bp = true;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r26) {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.clock.MiuiClockNumberView.draw(android.graphics.Canvas):void");
    }

    public int getCenterOffsetX() {
        return this.f28618e;
    }

    public int getCenterOffsetY() {
        return this.f28623j;
    }

    public int getIndex() {
        return this.f28628o;
    }

    public int getLeftPosition() {
        float f2 = this.f28637x;
        return f2 > 0.0f ? (int) ((this.f28619f / f2) - (getRealWidth() / 2)) : this.f28619f - (getRealWidth() / 2);
    }

    public int getRealHeight() {
        return this.f28639z;
    }

    public int getRealWidth() {
        return this.f28622i - this.f28618e;
    }

    public int[] getRectSize() {
        int i2;
        float f2;
        int i3;
        int i4 = C5038k.f28640k[this.f28627n.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                i2 = this.f28639z;
                i3 = this.f28622i;
            } else {
                i2 = this.f28621h;
                if (f7l8()) {
                    i3 = this.f28622i;
                } else {
                    float f3 = this.f28629p;
                    float[] fArr = this.f28632s;
                    f2 = f3 * ((1.0f - ((1.0f - fArr[0]) * 2.0f)) + ((fArr[1] + fArr[2] + fArr[3]) * 2.0f));
                }
            }
            return new int[]{i3, i2};
        }
        i2 = this.f28621h;
        float f4 = this.f28629p;
        float[] fArr2 = this.f28632s;
        f2 = (f4 * (((fArr2[0] + fArr2[1]) + fArr2[2]) + fArr2[3])) - this.f28614a;
        i3 = (int) f2;
        return new int[]{i3, i2};
    }

    public int getTargetCenterX() {
        return this.f28619f;
    }

    public int getTargetCenterY() {
        return this.f28616c;
    }

    public int getTextColor() {
        return this.f28626m;
    }

    public int getTopPosition() {
        float f2 = this.f28637x;
        return f2 > 0.0f ? (int) ((this.f28616c / f2) - (this.f28639z / 2)) : this.f28616c - (this.f28639z / 2);
    }

    public Drawable getVectorDrawable() {
        return this.f28630q;
    }

    /* JADX INFO: renamed from: h */
    public MiuiClockNumberView m17543h(int i2) {
        this.f28626m = i2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m17544k() {
        boolean z2;
        int i2;
        int[] iArrD3 = this.f28620g.d3();
        if (iArrD3 == null || iArrD3.length == 0) {
            iArrD3 = this.f28620g.jp0y();
        }
        Drawable drawableM2259s = C0498q.m2259s(this.f28624k, iArrD3[this.f28628o]);
        boolean z3 = drawableM2259s instanceof AnimatedVectorDrawable;
        if (!z3 && !(drawableM2259s instanceof VectorDrawable)) {
            Log.e(bv, "set svgRes is invalid");
            return;
        }
        if (this.f28620g.mo17701p() == AbstractC5071k.k.SKPupok && z3) {
            try {
                VectorDrawable vectorDrawable = (VectorDrawable) AnimatedVectorDrawable.class.getMethod("getVectorDrawable", new Class[0]).invoke(drawableM2259s, new Object[0]);
                if (vectorDrawable != null) {
                    Method declaredMethod = VectorDrawable.class.getDeclaredMethod("getTargetByName", String.class);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(vectorDrawable, "_R_G_L_0_G_D_1_P_0");
                    if (objInvoke != null) {
                        Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("setStrokeColor", Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(objInvoke, Integer.valueOf(this.f28626m));
                    }
                }
            } catch (Exception e2) {
                Log.e(bv, "AnimatedVectorDrawable reflect fail", e2);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        float[] fArrNi7 = this.f28620g.ni7();
        System.arraycopy(fArrNi7, 0, this.f28632s, 0, fArrNi7.length);
        if (z2 && (i2 = this.f28626m) != 0) {
            drawableM2259s.setTint(i2);
        }
        this.f28622i = drawableM2259s.getIntrinsicWidth();
        int intrinsicHeight = drawableM2259s.getIntrinsicHeight();
        this.f28639z = intrinsicHeight;
        this.f28630q = drawableM2259s;
        drawableM2259s.setBounds(0, 0, this.f28622i, intrinsicHeight);
        this.f28625l = m17541q(this.f28620g.mo17700h()[this.f28628o]);
        int iM17541q = m17541q(this.f28620g.fu4()[this.f28628o]);
        this.f28631r = this.f28622i - iM17541q;
        int iM17541q2 = m17541q(this.f28620g.gvn7());
        this.f28629p = iM17541q2;
        float[] fArr = this.f28632s;
        this.f28615b = (iM17541q2 * (fArr[1] + fArr[2] + fArr[3]) * 2.0f) + (iM17541q2 * (1.0f - ((1.0f - fArr[0]) * 2.0f)));
        this.f28621h = this.f28639z;
        this.f28633t = iM17541q - this.f28625l;
        Log.i(bv, "mZeroTextWidth = " + this.f28633t + ", density = " + Resources.getSystem().getDisplayMetrics().density);
        if (f7l8()) {
            float f2 = (this.f28615b - this.f28633t) / 2.0f;
            this.f28636w = f2 - this.f28625l;
            this.f70904ab = f2 - this.f28631r;
            Log.i(bv, "isCopperplateStyle leftExtra = " + this.f28636w + ", rightExtra = " + this.f70904ab + ", mIndex = " + this.f28628o);
        }
        this.f28614a = (this.f28629p - this.f28622i) / 2.0f;
        Log.i(bv, "setPercentages, percentages = " + Arrays.toString(this.f28632s));
        requestLayout();
    }

    public MiuiClockNumberView kja0(float f2) {
        this.f28637x = f2;
        return this;
    }

    public MiuiClockNumberView ld6(int i2, int i3) {
        this.f28619f = i2;
        this.f28616c = i3;
        return this;
    }

    public MiuiClockNumberView n7h(int i2) {
        this.f28628o = i2;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012d A[PHI: r7
      0x012d: PHI (r7v23 int) = (r7v21 int), (r7v25 int) binds: [B:36:0x0119, B:40:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.clock.MiuiClockNumberView.onMeasure(int, int):void");
    }

    /* JADX INFO: renamed from: p */
    public MiuiClockNumberView m17545p(int i2, int i3) {
        this.f28618e = i2;
        this.f28623j = i3;
        return this;
    }

    public MiuiClockNumberView qrj(AbstractC5071k abstractC5071k) {
        this.f28620g = abstractC5071k;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public MiuiClockNumberView m17546s(float f2) {
        this.f70905bo = f2;
        return this;
    }

    public void toq() {
        this.bp = false;
        this.bb = 0.0f;
    }

    public MiuiClockNumberView x2(EnumC5068g enumC5068g) {
        return this;
    }

    public void zy() {
        float fRound;
        int iRound;
        int[] rectSize = getRectSize();
        int i2 = rectSize[0];
        int i3 = rectSize[1];
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        float fM22318k = this.f28637x;
        if (fM22318k <= 0.0f) {
            fM22318k = (i2 > measuredWidth || i3 > measuredHeight) ? Math.min(measuredWidth / i2, measuredHeight / i3) : 1.0f;
        }
        if (this.f28637x > 0.0f) {
            fM22318k *= C6062n.m22318k(this.f28624k);
        }
        if (this.f28619f == 0 && this.f28616c == 0) {
            fRound = Math.round((measuredWidth - (i2 * fM22318k)) * 0.5f);
            iRound = Math.round((measuredHeight - (i3 * fM22318k)) * 0.5f);
        } else {
            fRound = Math.round((r5 + this.f28618e) - ((this.f28622i * 0.5f) * fM22318k));
            iRound = Math.round((this.f28616c + this.f28623j) - ((i3 * 0.5f) * fM22318k));
        }
        this.f28634u = fM22318k;
        this.f28635v = fRound;
        this.f28617d = iRound;
    }

    public MiuiClockNumberView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28627n = EnumC5068g.NONE;
        this.f28620g = new qrj();
        this.f28638y = new Matrix();
        this.f28632s = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f28637x = -1.0f;
        this.bp = false;
        m17540n(context);
    }

    public MiuiClockNumberView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f28627n = EnumC5068g.NONE;
        this.f28620g = new qrj();
        this.f28638y = new Matrix();
        this.f28632s = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f28637x = -1.0f;
        this.bp = false;
        m17540n(context);
    }

    public MiuiClockNumberView(Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f28627n = EnumC5068g.NONE;
        this.f28620g = new qrj();
        this.f28638y = new Matrix();
        this.f28632s = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f28637x = -1.0f;
        this.bp = false;
        m17540n(context);
    }
}
