package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C0683f;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.cdj;
import com.google.android.material.internal.n7h;
import com.google.android.material.resources.C4092q;
import com.google.android.material.shape.C4108p;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;
import zy.InterfaceC7824b;
import zy.InterfaceC7828g;
import zy.InterfaceC7833l;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.ncyb;
import zy.nn86;
import zy.uv6;
import zy.x2;

/* JADX INFO: renamed from: com.google.android.material.badge.k */
/* JADX INFO: compiled from: BadgeDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3933k extends Drawable implements n7h.toq {

    /* JADX INFO: renamed from: a */
    static final String f23895a = "+";

    /* JADX INFO: renamed from: c */
    public static final int f23897c = 8388659;

    /* JADX INFO: renamed from: e */
    public static final int f23898e = 8388693;

    /* JADX INFO: renamed from: f */
    public static final int f23899f = 8388661;

    /* JADX INFO: renamed from: j */
    public static final int f23900j = 8388691;

    /* JADX INFO: renamed from: o */
    private static final int f23902o = 9;

    /* JADX INFO: renamed from: g */
    @lvui
    private final Rect f23903g;

    /* JADX INFO: renamed from: h */
    private int f23904h;

    /* JADX INFO: renamed from: i */
    private float f23905i;

    /* JADX INFO: renamed from: k */
    @lvui
    private final WeakReference<Context> f23906k;

    /* JADX INFO: renamed from: l */
    @dd
    private WeakReference<FrameLayout> f23907l;

    /* JADX INFO: renamed from: n */
    @lvui
    private final n7h f23908n;

    /* JADX INFO: renamed from: p */
    private float f23909p;

    /* JADX INFO: renamed from: q */
    @lvui
    private final C4108p f23910q;

    /* JADX INFO: renamed from: r */
    @dd
    private WeakReference<View> f23911r;

    /* JADX INFO: renamed from: s */
    private float f23912s;

    /* JADX INFO: renamed from: t */
    private float f23913t;

    /* JADX INFO: renamed from: y */
    @lvui
    private final BadgeState f23914y;

    /* JADX INFO: renamed from: z */
    private float f23915z;

    /* JADX INFO: renamed from: m */
    @hb
    private static final int f23901m = C6095k.n7h.d79j;

    /* JADX INFO: renamed from: b */
    @InterfaceC7828g
    private static final int f23896b = C6095k.zy.f80277t8iq;

    /* JADX INFO: renamed from: com.google.android.material.badge.k$k */
    /* JADX INFO: compiled from: BadgeDrawable.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f23916k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ FrameLayout f23918q;

        k(View view, FrameLayout frameLayout) {
            this.f23916k = view;
            this.f23918q = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3933k.this.m14086b(this.f23916k, this.f23918q);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.badge.k$toq */
    /* JADX INFO: compiled from: BadgeDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    private C3933k(@lvui Context context, @InterfaceC7824b int i2, @InterfaceC7828g int i3, @hb int i4, @dd BadgeState.State state) {
        this.f23906k = new WeakReference<>(context);
        cdj.zy(context);
        this.f23903g = new Rect();
        this.f23910q = new C4108p();
        n7h n7hVar = new n7h(this);
        this.f23908n = n7hVar;
        n7hVar.m14564n().setTextAlign(Paint.Align.CENTER);
        m14081e(C6095k.n7h.fl);
        this.f23914y = new BadgeState(context, i2, i3, i4, state);
        oc();
    }

    private void a9() {
        WeakReference<View> weakReference = this.f23911r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f23911r.get();
        WeakReference<FrameLayout> weakReference2 = this.f23907l;
        m14086b(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void bf2() {
        Context context = this.f23906k.get();
        WeakReference<View> weakReference = this.f23911r;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f23903g);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f23907l;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || com.google.android.material.badge.toq.f23919k) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        toq(context, rect2, view);
        com.google.android.material.badge.toq.kja0(this.f23903g, this.f23912s, this.f23909p, this.f23915z, this.f23913t);
        this.f23910q.i1(this.f23905i);
        if (rect.equals(this.f23903g)) {
            return;
        }
        this.f23910q.setBounds(this.f23903g);
    }

    private void d3() {
        boolean zFn3e = this.f23914y.fn3e();
        setVisible(zFn3e, false);
        if (!com.google.android.material.badge.toq.f23919k || m14089h() == null || zFn3e) {
            return;
        }
        ((ViewGroup) m14089h().getParent()).invalidate();
    }

    /* JADX INFO: renamed from: e */
    private void m14081e(@hb int i2) {
        Context context = this.f23906k.get();
        if (context == null) {
            return;
        }
        vyq(new C4092q(context, i2));
    }

    private static void ek5k(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void f7l8(Canvas canvas) {
        Rect rect = new Rect();
        String strQrj = qrj();
        this.f23908n.m14564n().getTextBounds(strQrj, 0, strQrj.length(), rect);
        canvas.drawText(strQrj, this.f23912s, this.f23909p + (rect.height() / 2), this.f23908n.m14564n());
    }

    private void fti() {
        this.f23908n.m14564n().setColor(this.f23914y.m14069y());
        invalidateSelf();
    }

    private int fu4() {
        return (m14098t() ? this.f23914y.ki() : this.f23914y.t8r()) + this.f23914y.m14066q();
    }

    @lvui
    /* JADX INFO: renamed from: g */
    static C3933k m14082g(@lvui Context context, @lvui BadgeState.State state) {
        return new C3933k(context, 0, f23896b, f23901m, state);
    }

    private void gvn7() {
        this.f23908n.m14565p(true);
        bf2();
        invalidateSelf();
    }

    private void i1() {
        this.f23904h = ((int) Math.pow(10.0d, ((double) m14090i()) - 1.0d)) - 1;
    }

    private void jk() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f23914y.m14060g());
        if (this.f23910q.m14869z() != colorStateListValueOf) {
            this.f23910q.m14867x(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void jp0y() {
        i1();
        this.f23908n.m14565p(true);
        bf2();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    private void m14083m(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C6095k.y.f80016kz28) {
            WeakReference<FrameLayout> weakReference = this.f23907l;
            if (weakReference == null || weakReference.get() != viewGroup) {
                ek5k(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C6095k.y.f80016kz28);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f23907l = new WeakReference<>(frameLayout);
                frameLayout.post(new k(view, frameLayout));
            }
        }
    }

    private void mcp() {
        this.f23908n.m14564n().setAlpha(getAlpha());
        invalidateSelf();
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static C3933k m14084n(@lvui Context context, @InterfaceC7824b int i2) {
        return new C3933k(context, i2, f23896b, f23901m, null);
    }

    private int ni7() {
        return (m14098t() ? this.f23914y.x2() : this.f23914y.qrj()) + this.f23914y.zy();
    }

    private void oc() {
        jp0y();
        gvn7();
        mcp();
        jk();
        fti();
        a9();
        bf2();
        d3();
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static C3933k m14085q(@lvui Context context) {
        return new C3933k(context, 0, f23896b, f23901m, null);
    }

    @lvui
    private String qrj() {
        if (fn3e() <= this.f23904h) {
            return NumberFormat.getInstance(this.f23914y.m14061h()).format(fn3e());
        }
        Context context = this.f23906k.get();
        return context == null ? "" : String.format(this.f23914y.m14061h(), context.getString(C6095k.qrj.f79832mu), Integer.valueOf(this.f23904h), f23895a);
    }

    private void toq(@lvui Context context, @lvui Rect rect, @lvui View view) {
        int iFu4 = fu4();
        int iF7l8 = this.f23914y.f7l8();
        if (iF7l8 == 8388691 || iF7l8 == 8388693) {
            this.f23909p = rect.bottom - iFu4;
        } else {
            this.f23909p = rect.top + iFu4;
        }
        if (fn3e() <= 9) {
            float f2 = !m14098t() ? this.f23914y.f67357zy : this.f23914y.f23886q;
            this.f23905i = f2;
            this.f23913t = f2;
            this.f23915z = f2;
        } else {
            float f3 = this.f23914y.f23886q;
            this.f23905i = f3;
            this.f23913t = f3;
            this.f23915z = (this.f23908n.m14563g(qrj()) / 2.0f) + this.f23914y.f23885n;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m14098t() ? C6095k.g.dm : C6095k.g.zidq);
        int iNi7 = ni7();
        int iF7l82 = this.f23914y.f7l8();
        if (iF7l82 == 8388659 || iF7l82 == 8388691) {
            this.f23912s = C0683f.m3159e(view) == 0 ? (rect.left - this.f23915z) + dimensionPixelSize + iNi7 : ((rect.right + this.f23915z) - dimensionPixelSize) - iNi7;
        } else {
            this.f23912s = C0683f.m3159e(view) == 0 ? ((rect.right + this.f23915z) - dimensionPixelSize) - iNi7 : (rect.left - this.f23915z) + dimensionPixelSize + iNi7;
        }
    }

    private void vyq(@dd C4092q c4092q) {
        Context context;
        if (this.f23908n.m14566q() == c4092q || (context = this.f23906k.get()) == null) {
            return;
        }
        this.f23908n.m14567s(c4092q, context);
        bf2();
    }

    /* JADX INFO: renamed from: b */
    public void m14086b(@lvui View view, @dd FrameLayout frameLayout) {
        this.f23911r = new WeakReference<>(view);
        boolean z2 = com.google.android.material.badge.toq.f23919k;
        if (z2 && frameLayout == null) {
            m14083m(view);
        } else {
            this.f23907l = new WeakReference<>(frameLayout);
        }
        if (!z2) {
            ek5k(view);
        }
        bf2();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public void m14087c(@InterfaceC7833l int i2) {
        this.f23914y.jp0y(i2);
        bf2();
    }

    public int cdj() {
        return this.f23914y.qrj();
    }

    void d2ok(@InterfaceC7833l int i2) {
        this.f23914y.fu4(i2);
        bf2();
    }

    public void dd(@lvui Locale locale) {
        if (locale.equals(this.f23914y.m14061h())) {
            return;
        }
        this.f23914y.oc(locale);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f23910q.draw(canvas);
        if (m14098t()) {
            f7l8(canvas);
        }
    }

    void eqxt(int i2) {
        this.f23914y.ni7(i2);
        bf2();
    }

    /* JADX INFO: renamed from: f */
    public void m14088f(@InterfaceC7833l int i2) {
        this.f23914y.fti(i2);
        bf2();
    }

    public int fn3e() {
        if (m14098t()) {
            return this.f23914y.kja0();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23914y.m14064n();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f23903g.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f23903g.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @dd
    /* JADX INFO: renamed from: h */
    public FrameLayout m14089h() {
        WeakReference<FrameLayout> weakReference = this.f23907l;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void hb(@InterfaceC7833l int i2) {
        this.f23914y.eqxt(i2);
        bf2();
    }

    public void hyr(int i2) {
        m14087c(i2);
        m14088f(i2);
    }

    /* JADX INFO: renamed from: i */
    public int m14090i() {
        return this.f23914y.n7h();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m14091j(@InterfaceC7833l int i2) {
        this.f23914y.d2ok(i2);
        bf2();
    }

    @Override // com.google.android.material.internal.n7h.toq
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: k */
    public void mo14092k() {
        invalidateSelf();
    }

    @InterfaceC7833l
    public int ki() {
        return this.f23914y.x2();
    }

    @dd
    public CharSequence kja0() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!m14098t()) {
            return this.f23914y.m14065p();
        }
        if (this.f23914y.ld6() == 0 || (context = this.f23906k.get()) == null) {
            return null;
        }
        return fn3e() <= this.f23904h ? context.getResources().getQuantityString(this.f23914y.ld6(), fn3e(), Integer.valueOf(fn3e())) : context.getString(this.f23914y.m14067s(), Integer.valueOf(this.f23904h));
    }

    /* JADX INFO: renamed from: l */
    public void m14093l(CharSequence charSequence) {
        this.f23914y.jk(charSequence);
    }

    public int ld6() {
        return this.f23914y.f7l8();
    }

    public void lrht(int i2) {
        if (this.f23914y.n7h() != i2) {
            this.f23914y.gvn7(i2);
            jp0y();
        }
    }

    public void lvui(@x2 int i2) {
        this.f23914y.o1t(i2);
        jk();
    }

    public void n5r1(@ncyb int i2) {
        this.f23914y.a9(i2);
    }

    @x2
    public int n7h() {
        return this.f23908n.m14564n().getColor();
    }

    public void ncyb(@nn86 int i2) {
        this.f23914y.mcp(i2);
    }

    public void nn86(int i2) {
        m14091j(i2);
        hb(i2);
    }

    /* JADX INFO: renamed from: o */
    public void m14094o(boolean z2) {
        this.f23914y.lvui(z2);
        d3();
    }

    @InterfaceC7833l
    public int o1t() {
        return this.f23914y.ki();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.n7h.toq
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @x2
    /* JADX INFO: renamed from: p */
    public int m14095p() {
        return this.f23910q.m14869z().getDefaultColor();
    }

    /* JADX INFO: renamed from: r */
    public void m14096r(int i2) {
        if (this.f23914y.f7l8() != i2) {
            this.f23914y.wvg(i2);
            a9();
        }
    }

    @InterfaceC7833l
    /* JADX INFO: renamed from: s */
    int m14097s() {
        return this.f23914y.m14066q();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f23914y.m14070z(i2);
        mcp();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: t */
    public boolean m14098t() {
        return this.f23914y.m14062i();
    }

    @InterfaceC7833l
    public int t8r() {
        return this.f23914y.qrj();
    }

    public void uv6(int i2) {
        int iMax = Math.max(0, i2);
        if (this.f23914y.kja0() != iMax) {
            this.f23914y.d3(iMax);
            gvn7();
        }
    }

    @InterfaceC7833l
    public int wvg() {
        return this.f23914y.t8r();
    }

    @lvui
    public Locale x2() {
        return this.f23914y.m14061h();
    }

    public void x9kr(@x2 int i2) {
        if (this.f23908n.m14564n().getColor() != i2) {
            this.f23914y.m14068t(i2);
            fti();
        }
    }

    /* JADX INFO: renamed from: y */
    int m14099y() {
        return this.f23914y.zy();
    }

    @Deprecated
    public void y9n(@lvui View view, @dd ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        m14086b(view, (FrameLayout) viewGroup);
    }

    public void yz(@lvui View view) {
        m14086b(view, null);
    }

    /* JADX INFO: renamed from: z */
    public int m14100z() {
        return this.f23914y.t8r();
    }

    @lvui
    BadgeState.State zurt() {
        return this.f23914y.cdj();
    }

    public void zy() {
        if (m14098t()) {
            this.f23914y.m14063k();
            gvn7();
        }
    }
}
