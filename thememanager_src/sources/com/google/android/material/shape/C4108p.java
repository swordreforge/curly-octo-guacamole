package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.util.C0642s;
import com.google.android.material.shape.C4103h;
import com.google.android.material.shape.cdj;
import com.google.android.material.shape.kja0;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import pjz9.C7607k;
import zy.InterfaceC7828g;
import zy.a9;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.shape.p */
/* JADX INFO: compiled from: MaterialShapeDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class C4108p extends Drawable implements androidx.core.graphics.drawable.n7h, t8r {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f67843ab = 1;
    public static final int bb = 2;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f67844bo = C4108p.class.getSimpleName();
    private static final Paint bp;

    /* JADX INFO: renamed from: d */
    private static final float f24967d = 0.25f;

    /* JADX INFO: renamed from: v */
    private static final float f24968v = 0.75f;

    /* JADX INFO: renamed from: w */
    public static final int f24969w = 0;

    /* JADX INFO: renamed from: a */
    private int f24970a;

    /* JADX INFO: renamed from: b */
    @dd
    private PorterDuffColorFilter f24971b;

    /* JADX INFO: renamed from: c */
    private final Paint f24972c;

    /* JADX INFO: renamed from: e */
    private final com.google.android.material.shadow.toq f24973e;

    /* JADX INFO: renamed from: f */
    private final Paint f24974f;

    /* JADX INFO: renamed from: g */
    private final BitSet f24975g;

    /* JADX INFO: renamed from: h */
    private final Path f24976h;

    /* JADX INFO: renamed from: i */
    private final RectF f24977i;

    /* JADX INFO: renamed from: j */
    @lvui
    private final C4103h.toq f24978j;

    /* JADX INFO: renamed from: k */
    private q f24979k;

    /* JADX INFO: renamed from: l */
    private kja0 f24980l;

    /* JADX INFO: renamed from: m */
    @dd
    private PorterDuffColorFilter f24981m;

    /* JADX INFO: renamed from: n */
    private final cdj.AbstractC4100s[] f24982n;

    /* JADX INFO: renamed from: o */
    private final C4103h f24983o;

    /* JADX INFO: renamed from: p */
    private final Path f24984p;

    /* JADX INFO: renamed from: q */
    private final cdj.AbstractC4100s[] f24985q;

    /* JADX INFO: renamed from: r */
    private final Region f24986r;

    /* JADX INFO: renamed from: s */
    private final Matrix f24987s;

    /* JADX INFO: renamed from: t */
    private final Region f24988t;

    /* JADX INFO: renamed from: u */
    private boolean f24989u;

    /* JADX INFO: renamed from: x */
    @lvui
    private final RectF f24990x;

    /* JADX INFO: renamed from: y */
    private boolean f24991y;

    /* JADX INFO: renamed from: z */
    private final RectF f24992z;

    /* JADX INFO: renamed from: com.google.android.material.shape.p$k */
    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    class k implements C4103h.toq {
        k() {
        }

        @Override // com.google.android.material.shape.C4103h.toq
        /* JADX INFO: renamed from: k */
        public void mo14815k(@lvui cdj cdjVar, Matrix matrix, int i2) {
            C4108p.this.f24975g.set(i2, cdjVar.m14779n());
            C4108p.this.f24985q[i2] = cdjVar.m14776g(matrix);
        }

        @Override // com.google.android.material.shape.C4103h.toq
        public void toq(@lvui cdj cdjVar, Matrix matrix, int i2) {
            C4108p.this.f24975g.set(i2 + 4, cdjVar.m14779n());
            C4108p.this.f24982n[i2] = cdjVar.m14776g(matrix);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.p$toq */
    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    class toq implements kja0.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ float f25003k;

        toq(float f2) {
            this.f25003k = f2;
        }

        @Override // com.google.android.material.shape.kja0.zy
        @lvui
        /* JADX INFO: renamed from: k */
        public InterfaceC4109q mo14840k(@lvui InterfaceC4109q interfaceC4109q) {
            return interfaceC4109q instanceof qrj ? interfaceC4109q : new com.google.android.material.shape.toq(this.f25003k, interfaceC4109q);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.p$zy */
    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    static {
        Paint paint = new Paint(1);
        bp = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ C4108p(q qVar, k kVar) {
        this(qVar);
    }

    /* JADX INFO: renamed from: b */
    private void m14846b(@lvui Canvas canvas) {
        canvas.translate(d3(), oc());
    }

    private float dd() {
        if (vyq()) {
            return this.f24972c.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void f7l8(@lvui RectF rectF, @lvui Path path) {
        m14868y(rectF, path);
        if (this.f24979k.f24999p != 1.0f) {
            this.f24987s.reset();
            Matrix matrix = this.f24987s;
            float f2 = this.f24979k.f24999p;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f24987s);
        }
        path.computeBounds(this.f24990x, true);
    }

    @dd
    /* JADX INFO: renamed from: g */
    private PorterDuffColorFilter m14847g(@lvui Paint paint, boolean z2) {
        if (!z2) {
            return null;
        }
        int color = paint.getColor();
        int iX2 = x2(color);
        this.f24970a = iX2;
        if (iX2 != color) {
            return new PorterDuffColorFilter(iX2, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private boolean gbni() {
        PorterDuffColorFilter porterDuffColorFilter = this.f24981m;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24971b;
        q qVar = this.f24979k;
        this.f24981m = ld6(qVar.f67846f7l8, qVar.f25002y, this.f24974f, true);
        q qVar2 = this.f24979k;
        this.f24971b = ld6(qVar2.f24994g, qVar2.f25002y, this.f24972c, false);
        q qVar3 = this.f24979k;
        if (qVar3.f67847fn3e) {
            this.f24973e.m14772q(qVar3.f67846f7l8.getColorForState(getState(), 0));
        }
        return (C0642s.m2985k(porterDuffColorFilter, this.f24981m) && C0642s.m2985k(porterDuffColorFilter2, this.f24971b)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    private void m14848h(@lvui Canvas canvas) {
        ki(canvas, this.f24974f, this.f24984p, this.f24979k.f24997k, zurt());
    }

    private void ki(@lvui Canvas canvas, @lvui Paint paint, @lvui Path path, @lvui kja0 kja0Var, @lvui RectF rectF) {
        if (!kja0Var.fn3e(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo14816k = kja0Var.m14823i().mo14816k(rectF) * this.f24979k.f67850ld6;
            canvas.drawRoundRect(rectF, fMo14816k, fMo14816k, paint);
        }
    }

    private void kja0(@lvui Canvas canvas) {
        if (this.f24975g.cardinality() > 0) {
            Log.w(f67844bo, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f24979k.f67853t8r != 0) {
            canvas.drawPath(this.f24984p, this.f24973e.zy());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f24985q[i2].toq(this.f24973e, this.f24979k.f67848ki, canvas);
            this.f24982n[i2].toq(this.f24973e, this.f24979k.f67848ki, canvas);
        }
        if (this.f24989u) {
            int iD3 = d3();
            int iOc = oc();
            canvas.translate(-iD3, -iOc);
            canvas.drawPath(this.f24984p, bp);
            canvas.translate(iD3, iOc);
        }
    }

    @lvui
    private PorterDuffColorFilter ld6(@dd ColorStateList colorStateList, @dd PorterDuff.Mode mode, @lvui Paint paint, boolean z2) {
        return (colorStateList == null || mode == null) ? m14847g(paint, z2) : m14850p(colorStateList, mode, z2);
    }

    private boolean lrht() {
        q qVar = this.f24979k;
        int i2 = qVar.f67845cdj;
        return i2 != 1 && qVar.f67848ki > 0 && (i2 == 2 || bf2());
    }

    @lvui
    public static C4108p n7h(Context context, float f2) {
        int iZy = com.google.android.material.color.kja0.zy(context, C6095k.zy.f80274sc, C4108p.class.getSimpleName());
        C4108p c4108p = new C4108p();
        c4108p.m14856e(context);
        c4108p.m14867x(ColorStateList.valueOf(iZy));
        c4108p.zp(f2);
        return c4108p;
    }

    @lvui
    private RectF ni7() {
        this.f24992z.set(zurt());
        float fDd = dd();
        this.f24992z.inset(fDd, fDd);
        return this.f24992z;
    }

    private void nn86() {
        super.invalidateSelf();
    }

    @lvui
    /* JADX INFO: renamed from: p */
    private PorterDuffColorFilter m14850p(@lvui ColorStateList colorStateList, @lvui PorterDuff.Mode mode, boolean z2) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = x2(colorForState);
        }
        this.f24970a = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @lvui
    public static C4108p qrj(Context context) {
        return n7h(context, 0.0f);
    }

    /* JADX INFO: renamed from: s */
    private void m14852s() {
        kja0 kja0VarM14827z = getShapeAppearanceModel().m14827z(new toq(-dd()));
        this.f24980l = kja0VarM14827z;
        this.f24983o.m14814q(kja0VarM14827z, this.f24979k.f67850ld6, ni7(), this.f24976h);
    }

    private boolean uv6() {
        Paint.Style style = this.f24979k.f67856zurt;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean vyq() {
        Paint.Style style = this.f24979k.f67856zurt;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f24972c.getStrokeWidth() > 0.0f;
    }

    private boolean was(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f24979k.f25000q == null || color2 == (colorForState2 = this.f24979k.f25000q.getColorForState(iArr, (color2 = this.f24974f.getColor())))) {
            z2 = false;
        } else {
            this.f24974f.setColor(colorForState2);
            z2 = true;
        }
        if (this.f24979k.f24998n == null || color == (colorForState = this.f24979k.f24998n.getColorForState(iArr, (color = this.f24972c.getColor())))) {
            return z2;
        }
        this.f24972c.setColor(colorForState);
        return true;
    }

    private static int y9n(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void yz(@lvui Canvas canvas) {
        if (lrht()) {
            canvas.save();
            m14846b(canvas);
            if (!this.f24989u) {
                kja0(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f24990x.width() - getBounds().width());
            int iHeight = (int) (this.f24990x.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f24990x.width()) + (this.f24979k.f67848ki * 2) + iWidth, ((int) this.f24990x.height()) + (this.f24979k.f67848ki * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f2 = (getBounds().left - this.f24979k.f67848ki) - iWidth;
            float f3 = (getBounds().top - this.f24979k.f67848ki) - iHeight;
            canvas2.translate(-f2, -f3);
            kja0(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private void zsr0() {
        float fM14854c = m14854c();
        this.f24979k.f67848ki = (int) Math.ceil(0.75f * fM14854c);
        this.f24979k.f67853t8r = (int) Math.ceil(fM14854c * f24967d);
        gbni();
        nn86();
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public void m14853a(boolean z2) {
        this.f24983o.n7h(z2);
    }

    public float a9() {
        return this.f24979k.f24999p;
    }

    public void a98o(@lvui InterfaceC4109q interfaceC4109q) {
        setShapeAppearanceModel(this.f24979k.f24997k.fu4(interfaceC4109q));
    }

    public boolean bf2() {
        return (m14861m() || this.f24984p.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void bo(boolean z2) {
        this.f24989u = z2;
    }

    /* JADX INFO: renamed from: c */
    public float m14854c() {
        return fu4() + m14857f();
    }

    public void c8jq(int i2) {
        q qVar = this.f24979k;
        if (qVar.f24996i != i2) {
            qVar.f24996i = i2;
            nn86();
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected void cdj(@lvui Canvas canvas, @lvui Paint paint, @lvui Path path, @lvui RectF rectF) {
        ki(canvas, paint, path, this.f24979k.f24997k, rectF);
    }

    public void ch(float f2) {
        q qVar = this.f24979k;
        if (qVar.f67850ld6 != f2) {
            qVar.f67850ld6 = f2;
            this.f24991y = true;
            invalidateSelf();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public void m14855d(@lvui ki kiVar) {
        setShapeAppearanceModel(kiVar);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public int d2ok() {
        return this.f24979k.f67853t8r;
    }

    public int d3() {
        return (int) (((double) this.f24979k.f67853t8r) * Math.sin(Math.toRadians(r0.f24996i)));
    }

    public void d8wk(boolean z2) {
        q qVar = this.f24979k;
        if (qVar.f67847fn3e != z2) {
            qVar.f67847fn3e = z2;
            invalidateSelf();
        }
    }

    @Deprecated
    public void dr(int i2) {
        zp(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        this.f24974f.setColorFilter(this.f24981m);
        int alpha = this.f24974f.getAlpha();
        this.f24974f.setAlpha(y9n(alpha, this.f24979k.f67852qrj));
        this.f24972c.setColorFilter(this.f24971b);
        this.f24972c.setStrokeWidth(this.f24979k.f67855x2);
        int alpha2 = this.f24972c.getAlpha();
        this.f24972c.setAlpha(y9n(alpha2, this.f24979k.f67852qrj));
        if (this.f24991y) {
            m14852s();
            f7l8(zurt(), this.f24984p);
            this.f24991y = false;
        }
        yz(canvas);
        if (uv6()) {
            m14848h(canvas);
        }
        if (vyq()) {
            t8r(canvas);
        }
        this.f24974f.setAlpha(alpha);
        this.f24972c.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public void m14856e(Context context) {
        this.f24979k.f67854toq = new C7607k(context);
        zsr0();
    }

    @Deprecated
    public boolean ek5k() {
        int i2 = this.f24979k.f67845cdj;
        return i2 == 0 || i2 == 2;
    }

    public int eqxt() {
        return this.f24979k.f67848ki;
    }

    /* JADX INFO: renamed from: f */
    public float m14857f() {
        return this.f24979k.f24995h;
    }

    public float fn3e() {
        return this.f24979k.f24997k.x2().mo14816k(zurt());
    }

    public void fnq8(@zy.x2 int i2) {
        qo(ColorStateList.valueOf(i2));
    }

    public int fti() {
        return this.f24979k.f24996i;
    }

    public float fu4() {
        return this.f24979k.f67849kja0;
    }

    public void g1(float f2) {
        wo(f2 - fu4());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24979k.f67852qrj;
    }

    @Override // android.graphics.drawable.Drawable
    @dd
    public Drawable.ConstantState getConstantState() {
        return this.f24979k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@lvui Outline outline) {
        if (this.f24979k.f67845cdj == 2) {
            return;
        }
        if (m14861m()) {
            outline.setRoundRect(getBounds(), n5r1() * this.f24979k.f67850ld6);
            return;
        }
        f7l8(zurt(), this.f24984p);
        if (this.f24984p.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f24984p);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@lvui Rect rect) {
        Rect rect2 = this.f24979k.f25001s;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.google.android.material.shape.t8r
    @lvui
    public kja0 getShapeAppearanceModel() {
        return this.f24979k.f24997k;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f24988t.set(getBounds());
        f7l8(zurt(), this.f24984p);
        this.f24986r.setPath(this.f24984p, this.f24988t);
        this.f24988t.op(this.f24986r, Region.Op.DIFFERENCE);
        return this.f24988t;
    }

    @Deprecated
    public int gvn7() {
        return (int) fu4();
    }

    public void gyi(int i2) {
        q qVar = this.f24979k;
        if (qVar.f67845cdj != i2) {
            qVar.f67845cdj = i2;
            nn86();
        }
    }

    public boolean hb() {
        C7607k c7607k = this.f24979k.f67854toq;
        return c7607k != null && c7607k.x2();
    }

    public float hyr() {
        return this.f24979k.f24997k.m14823i().mo14816k(zurt());
    }

    /* JADX INFO: renamed from: i */
    public float m14858i() {
        return this.f24979k.f24997k.m14824p().mo14816k(zurt());
    }

    public void i1(float f2) {
        setShapeAppearanceModel(this.f24979k.f24997k.ni7(f2));
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void ikck(int i2) {
        q qVar = this.f24979k;
        if (qVar.f67853t8r != i2) {
            qVar.f67853t8r = i2;
            nn86();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f24991y = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f24979k.f67846f7l8) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f24979k.f24994g) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f24979k.f24998n) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f24979k.f25000q) != null && colorStateList4.isStateful())));
    }

    /* JADX INFO: renamed from: j */
    public boolean m14859j() {
        return this.f24979k.f67854toq != null;
    }

    @zy.x2
    public int jk() {
        return this.f24970a;
    }

    public int jp0y() {
        return this.f24979k.f67845cdj;
    }

    @dd
    /* JADX INFO: renamed from: l */
    public ColorStateList m14860l() {
        return this.f24979k.f67846f7l8;
    }

    public void lv5(Paint.Style style) {
        this.f24979k.f67856zurt = style;
        nn86();
    }

    @Deprecated
    @dd
    public ki lvui() {
        kja0 shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof ki) {
            return (ki) shapeAppearanceModel;
        }
        return null;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: m */
    public boolean m14861m() {
        return this.f24979k.f24997k.fn3e(zurt());
    }

    @Deprecated
    public void mcp(int i2, int i3, @lvui Path path) {
        m14868y(new RectF(0.0f, 0.0f, i2, i3), path);
    }

    public void mu(float f2, @zy.x2 int i2) {
        tfm(f2);
        qkj8(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Drawable mutate() {
        this.f24979k = new q(this.f24979k);
        return this;
    }

    public float n5r1() {
        return this.f24979k.f24997k.ki().mo14816k(zurt());
    }

    public float ncyb() {
        return this.f24979k.f67855x2;
    }

    public void nmn5(int i2, int i3, int i4, int i5) {
        q qVar = this.f24979k;
        if (qVar.f25001s == null) {
            qVar.f25001s = new Rect();
        }
        this.f24979k.f25001s.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public boolean m14862o(int i2, int i3) {
        return getTransparentRegion().contains(i2, i3);
    }

    public float o1t() {
        return this.f24979k.f67850ld6;
    }

    public int oc() {
        return (int) (((double) this.f24979k.f67853t8r) * Math.cos(Math.toRadians(r0.f24996i)));
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f24991y = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.n7h.toq
    protected boolean onStateChange(int[] iArr) {
        boolean z2 = was(iArr) || gbni();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public void qkj8(@dd ColorStateList colorStateList) {
        q qVar = this.f24979k;
        if (qVar.f24998n != colorStateList) {
            qVar.f24998n = colorStateList;
            onStateChange(getState());
        }
    }

    public void qo(ColorStateList colorStateList) {
        this.f24979k.f24994g = colorStateList;
        gbni();
        nn86();
    }

    @dd
    /* JADX INFO: renamed from: r */
    public ColorStateList m14863r() {
        return this.f24979k.f24998n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@a9(from = 0, to = 255) int i2) {
        q qVar = this.f24979k;
        if (qVar.f67852qrj != i2) {
            qVar.f67852qrj = i2;
            nn86();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
        this.f24979k.f67857zy = colorFilter;
        nn86();
    }

    @Override // com.google.android.material.shape.t8r
    public void setShapeAppearanceModel(@lvui kja0 kja0Var) {
        this.f24979k.f24997k = kja0Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTint(@zy.x2 int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintList(@dd ColorStateList colorStateList) {
        this.f24979k.f67846f7l8 = colorStateList;
        gbni();
        nn86();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintMode(@dd PorterDuff.Mode mode) {
        q qVar = this.f24979k;
        if (qVar.f25002y != mode) {
            qVar.f25002y = mode;
            gbni();
            nn86();
        }
    }

    /* JADX INFO: renamed from: t */
    public float m14864t() {
        return this.f24979k.f67851n7h;
    }

    public void t8iq(float f2) {
        q qVar = this.f24979k;
        if (qVar.f67851n7h != f2) {
            qVar.f67851n7h = f2;
            zsr0();
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected void t8r(@lvui Canvas canvas) {
        ki(canvas, this.f24972c, this.f24976h, this.f24980l, ni7());
    }

    public void tfm(float f2) {
        this.f24979k.f67855x2 = f2;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: u */
    public void m14865u(float f2) {
        q qVar = this.f24979k;
        if (qVar.f24999p != f2) {
            qVar.f24999p = f2;
            invalidateSelf();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public void m14866v(int i2) {
        this.f24979k.f67848ki = i2;
    }

    public void vq(float f2, @dd ColorStateList colorStateList) {
        tfm(f2);
        qkj8(colorStateList);
    }

    public void wo(float f2) {
        q qVar = this.f24979k;
        if (qVar.f24995h != f2) {
            qVar.f24995h = f2;
            zsr0();
        }
    }

    public Paint.Style wvg() {
        return this.f24979k.f67856zurt;
    }

    /* JADX INFO: renamed from: x */
    public void m14867x(@dd ColorStateList colorStateList) {
        q qVar = this.f24979k;
        if (qVar.f25000q != colorStateList) {
            qVar.f25000q = colorStateList;
            onStateChange(getState());
        }
    }

    @zy.x2
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected int x2(@zy.x2 int i2) {
        float fM14854c = m14854c() + m14864t();
        C7607k c7607k = this.f24979k.f67854toq;
        return c7607k != null ? c7607k.m27909n(i2, fM14854c) : i2;
    }

    @dd
    public ColorStateList x9kr() {
        return this.f24979k.f24994g;
    }

    @Deprecated
    public void xwq3(boolean z2) {
        gyi(!z2 ? 1 : 0);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: y */
    protected final void m14868y(@lvui RectF rectF, @lvui Path path) {
        C4103h c4103h = this.f24983o;
        q qVar = this.f24979k;
        c4103h.m14813n(qVar.f24997k, qVar.f67850ld6, rectF, this.f24978j, path);
    }

    public void y2(int i2) {
        this.f24973e.m14772q(i2);
        this.f24979k.f67847fn3e = false;
        nn86();
    }

    @dd
    /* JADX INFO: renamed from: z */
    public ColorStateList m14869z() {
        return this.f24979k.f25000q;
    }

    public void zp(float f2) {
        q qVar = this.f24979k;
        if (qVar.f67849kja0 != f2) {
            qVar.f67849kja0 = f2;
            zsr0();
        }
    }

    @lvui
    protected RectF zurt() {
        this.f24977i.set(getBounds());
        return this.f24977i;
    }

    public C4108p() {
        this(new kja0());
    }

    public C4108p(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        this(kja0.m14820n(context, attributeSet, i2, i3).qrj());
    }

    @Deprecated
    public C4108p(@lvui ki kiVar) {
        this((kja0) kiVar);
    }

    public C4108p(@lvui kja0 kja0Var) {
        this(new q(kja0Var, null));
    }

    private C4108p(@lvui q qVar) {
        C4103h c4103h;
        this.f24985q = new cdj.AbstractC4100s[4];
        this.f24982n = new cdj.AbstractC4100s[4];
        this.f24975g = new BitSet(8);
        this.f24987s = new Matrix();
        this.f24984p = new Path();
        this.f24976h = new Path();
        this.f24977i = new RectF();
        this.f24992z = new RectF();
        this.f24988t = new Region();
        this.f24986r = new Region();
        Paint paint = new Paint(1);
        this.f24974f = paint;
        Paint paint2 = new Paint(1);
        this.f24972c = paint2;
        this.f24973e = new com.google.android.material.shadow.toq();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c4103h = C4103h.ld6();
        } else {
            c4103h = new C4103h();
        }
        this.f24983o = c4103h;
        this.f24990x = new RectF();
        this.f24989u = true;
        this.f24979k = qVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        gbni();
        was(getState());
        this.f24978j = new k();
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.p$q */
    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    static final class q extends Drawable.ConstantState {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public int f67845cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @dd
        public ColorStateList f67846f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public boolean f67847fn3e;

        /* JADX INFO: renamed from: g */
        @dd
        public ColorStateList f24994g;

        /* JADX INFO: renamed from: h */
        public float f24995h;

        /* JADX INFO: renamed from: i */
        public int f24996i;

        /* JADX INFO: renamed from: k */
        @lvui
        public kja0 f24997k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public int f67848ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public float f67849kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public float f67850ld6;

        /* JADX INFO: renamed from: n */
        @dd
        public ColorStateList f24998n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public float f67851n7h;

        /* JADX INFO: renamed from: p */
        public float f24999p;

        /* JADX INFO: renamed from: q */
        @dd
        public ColorStateList f25000q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public int f67852qrj;

        /* JADX INFO: renamed from: s */
        @dd
        public Rect f25001s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public int f67853t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        public C7607k f67854toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public float f67855x2;

        /* JADX INFO: renamed from: y */
        @dd
        public PorterDuff.Mode f25002y;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public Paint.Style f67856zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        public ColorFilter f67857zy;

        public q(kja0 kja0Var, C7607k c7607k) {
            this.f25000q = null;
            this.f24998n = null;
            this.f24994g = null;
            this.f67846f7l8 = null;
            this.f25002y = PorterDuff.Mode.SRC_IN;
            this.f25001s = null;
            this.f24999p = 1.0f;
            this.f67850ld6 = 1.0f;
            this.f67852qrj = 255;
            this.f67851n7h = 0.0f;
            this.f67849kja0 = 0.0f;
            this.f24995h = 0.0f;
            this.f67845cdj = 0;
            this.f67848ki = 0;
            this.f67853t8r = 0;
            this.f24996i = 0;
            this.f67847fn3e = false;
            this.f67856zurt = Paint.Style.FILL_AND_STROKE;
            this.f24997k = kja0Var;
            this.f67854toq = c7607k;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            C4108p c4108p = new C4108p(this, null);
            c4108p.f24991y = true;
            return c4108p;
        }

        public q(@lvui q qVar) {
            this.f25000q = null;
            this.f24998n = null;
            this.f24994g = null;
            this.f67846f7l8 = null;
            this.f25002y = PorterDuff.Mode.SRC_IN;
            this.f25001s = null;
            this.f24999p = 1.0f;
            this.f67850ld6 = 1.0f;
            this.f67852qrj = 255;
            this.f67851n7h = 0.0f;
            this.f67849kja0 = 0.0f;
            this.f24995h = 0.0f;
            this.f67845cdj = 0;
            this.f67848ki = 0;
            this.f67853t8r = 0;
            this.f24996i = 0;
            this.f67847fn3e = false;
            this.f67856zurt = Paint.Style.FILL_AND_STROKE;
            this.f24997k = qVar.f24997k;
            this.f67854toq = qVar.f67854toq;
            this.f67855x2 = qVar.f67855x2;
            this.f67857zy = qVar.f67857zy;
            this.f25000q = qVar.f25000q;
            this.f24998n = qVar.f24998n;
            this.f25002y = qVar.f25002y;
            this.f67846f7l8 = qVar.f67846f7l8;
            this.f67852qrj = qVar.f67852qrj;
            this.f24999p = qVar.f24999p;
            this.f67853t8r = qVar.f67853t8r;
            this.f67845cdj = qVar.f67845cdj;
            this.f67847fn3e = qVar.f67847fn3e;
            this.f67850ld6 = qVar.f67850ld6;
            this.f67851n7h = qVar.f67851n7h;
            this.f67849kja0 = qVar.f67849kja0;
            this.f24995h = qVar.f24995h;
            this.f67848ki = qVar.f67848ki;
            this.f24996i = qVar.f24996i;
            this.f24994g = qVar.f24994g;
            this.f67856zurt = qVar.f67856zurt;
            if (qVar.f25001s != null) {
                this.f25001s = new Rect(qVar.f25001s);
            }
        }
    }
}
