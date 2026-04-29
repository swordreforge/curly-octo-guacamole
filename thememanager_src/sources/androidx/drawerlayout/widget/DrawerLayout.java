package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0498q;
import androidx.core.graphics.x2;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.fn3e;
import androidx.core.view.accessibility.ki;
import androidx.core.view.qrj;
import androidx.core.view.tfm;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C0779q;
import java.util.ArrayList;
import java.util.List;
import zurt.C7822k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements androidx.customview.widget.zy {
    public static final int ac = 2;
    public static final int ad = 0;
    private static final int aj = 64;
    public static final int am = 1;
    private static final int ar = 400;
    public static final int ax = 0;
    public static final int ay = 2;
    private static final String az = "DrawerLayout";
    private static final boolean bc = false;
    private static final float bd = 1.0f;
    public static final int be = 3;
    public static final int bq = 1;
    private static final int bs = -1728053248;
    private static final boolean bu = true;
    private static final int k0 = 160;
    private static final boolean tgs;
    static final boolean w97r;
    private static final String yl25 = "androidx.drawerlayout.widget.DrawerLayout";
    private static boolean zmmu;

    /* JADX INFO: renamed from: a */
    private float f4353a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private Object f51025ab;
    private Drawable an;
    private Matrix as;

    /* JADX INFO: renamed from: b */
    private List<InterfaceC0787n> f4354b;
    private boolean bb;
    private final fn3e bg;
    private Rect bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private Drawable f51026bo;
    private Drawable bp;
    private Drawable bv;

    /* JADX INFO: renamed from: c */
    private int f4355c;

    /* JADX INFO: renamed from: d */
    private CharSequence f4356d;

    /* JADX INFO: renamed from: e */
    private int f4357e;

    /* JADX INFO: renamed from: f */
    private int f4358f;

    /* JADX INFO: renamed from: g */
    private int f4359g;

    /* JADX INFO: renamed from: h */
    private final C0779q f4360h;

    /* JADX INFO: renamed from: i */
    private final C0789y f4361i;
    private Drawable id;
    private final ArrayList<View> in;

    /* JADX INFO: renamed from: j */
    private int f4362j;

    /* JADX INFO: renamed from: k */
    private final C0788q f4363k;

    /* JADX INFO: renamed from: l */
    private boolean f4364l;

    /* JADX INFO: renamed from: m */
    @dd
    private InterfaceC0787n f4365m;

    /* JADX INFO: renamed from: n */
    private int f4366n;

    /* JADX INFO: renamed from: o */
    private boolean f4367o;

    /* JADX INFO: renamed from: p */
    private final C0779q f4368p;

    /* JADX INFO: renamed from: q */
    private float f4369q;

    /* JADX INFO: renamed from: r */
    private boolean f4370r;

    /* JADX INFO: renamed from: s */
    private Paint f4371s;

    /* JADX INFO: renamed from: t */
    private int f4372t;

    /* JADX INFO: renamed from: u */
    private Drawable f4373u;

    /* JADX INFO: renamed from: v */
    private Drawable f4374v;

    /* JADX INFO: renamed from: w */
    private CharSequence f4375w;

    /* JADX INFO: renamed from: x */
    private float f4376x;

    /* JADX INFO: renamed from: y */
    private float f4377y;

    /* JADX INFO: renamed from: z */
    private final C0789y f4378z;
    private static final int[] ba = {R.attr.colorPrimaryDark};
    static final int[] tlhn = {R.attr.layout_gravity};

    public static abstract class f7l8 implements InterfaceC0787n {
        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0787n
        /* JADX INFO: renamed from: k */
        public void mo246k(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0787n
        /* JADX INFO: renamed from: q */
        public void mo249q(View view, float f2) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0787n
        public void toq(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0787n
        public void zy(int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$k */
    class C0786k implements fn3e {
        C0786k() {
        }

        @Override // androidx.core.view.accessibility.fn3e
        public boolean perform(@lvui View view, @dd fn3e.AbstractC0648k abstractC0648k) {
            if (!DrawerLayout.this.jk(view) || DrawerLayout.this.ki(view) == 2) {
                return false;
            }
            DrawerLayout.this.m3785g(view);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$n */
    public interface InterfaceC0787n {
        /* JADX INFO: renamed from: k */
        void mo246k(@lvui View view);

        /* JADX INFO: renamed from: q */
        void mo249q(@lvui View view, float f2);

        void toq(@lvui View view);

        void zy(int i2);
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$q */
    static final class C0788q extends C0701k {
        C0788q() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            if (DrawerLayout.wvg(view)) {
                return;
            }
            kiVar.ij(null);
        }
    }

    class toq implements View.OnApplyWindowInsetsListener {
        toq() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$y */
    private class C0789y extends C0779q.zy {

        /* JADX INFO: renamed from: k */
        private final int f4390k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private C0779q f51030toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Runnable f51031zy = new k();

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$y$k */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0789y.this.kja0();
            }
        }

        C0789y(int i2) {
            this.f4390k = i2;
        }

        private void n7h() {
            View viewN7h = DrawerLayout.this.n7h(this.f4390k == 3 ? 5 : 3);
            if (viewN7h != null) {
                DrawerLayout.this.m3785g(viewN7h);
            }
        }

        public void cdj(C0779q c0779q) {
            this.f51030toq = c0779q;
        }

        @Override // androidx.customview.widget.C0779q.zy
        public boolean f7l8(int i2) {
            return false;
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: g */
        public void mo3750g(int i2, int i3) {
            View viewN7h = (i2 & 1) == 1 ? DrawerLayout.this.n7h(3) : DrawerLayout.this.n7h(5);
            if (viewN7h == null || DrawerLayout.this.ki(viewN7h) != 0) {
                return;
            }
            this.f51030toq.m3747q(viewN7h, i3);
        }

        /* JADX INFO: renamed from: h */
        public void m3797h() {
            DrawerLayout.this.removeCallbacks(this.f51031zy);
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: k */
        public int mo3751k(View view, int i2, int i3) {
            if (DrawerLayout.this.zy(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i2, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i2, width));
        }

        void kja0() {
            View viewN7h;
            int width;
            int iM3748t = this.f51030toq.m3748t();
            boolean z2 = this.f4390k == 3;
            if (z2) {
                viewN7h = DrawerLayout.this.n7h(3);
                width = (viewN7h != null ? -viewN7h.getWidth() : 0) + iM3748t;
            } else {
                viewN7h = DrawerLayout.this.n7h(5);
                width = DrawerLayout.this.getWidth() - iM3748t;
            }
            if (viewN7h != null) {
                if (((!z2 || viewN7h.getLeft() >= width) && (z2 || viewN7h.getLeft() <= width)) || DrawerLayout.this.ki(viewN7h) != 0) {
                    return;
                }
                C0785g c0785g = (C0785g) viewN7h.getLayoutParams();
                this.f51030toq.uv6(viewN7h, width, viewN7h.getTop());
                c0785g.f51029zy = true;
                DrawerLayout.this.invalidate();
                n7h();
                DrawerLayout.this.toq();
            }
        }

        @Override // androidx.customview.widget.C0779q.zy
        public void ld6(View view, int i2, int i3, int i4, int i5) {
            float width = (DrawerLayout.this.zy(view, 3) ? i2 + r3 : DrawerLayout.this.getWidth() - i2) / view.getWidth();
            DrawerLayout.this.n5r1(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: p */
        public void mo3753p(int i2) {
            DrawerLayout.this.m3784c(i2, this.f51030toq.o1t());
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: q */
        public int mo3754q(View view) {
            if (DrawerLayout.this.a9(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.C0779q.zy
        public boolean qrj(View view, int i2) {
            return DrawerLayout.this.a9(view) && DrawerLayout.this.zy(view, this.f4390k) && DrawerLayout.this.ki(view) == 0;
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: s */
        public void mo3755s(View view, int i2) {
            ((C0785g) view.getLayoutParams()).f51029zy = false;
            n7h();
        }

        @Override // androidx.customview.widget.C0779q.zy
        public int toq(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C0779q.zy
        public void x2(View view, float f2, float f3) {
            int i2;
            float fFn3e = DrawerLayout.this.fn3e(view);
            int width = view.getWidth();
            if (DrawerLayout.this.zy(view, 3)) {
                i2 = (f2 > 0.0f || (f2 == 0.0f && fFn3e > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && fFn3e > 0.5f)) {
                    width2 -= width;
                }
                i2 = width2;
            }
            this.f51030toq.m3742c(i2, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: y */
        public void mo3756y(int i2, int i3) {
            DrawerLayout.this.postDelayed(this.f51031zy, 160L);
        }
    }

    class zy extends C0701k {

        /* JADX INFO: renamed from: k */
        private final Rect f4393k = new Rect();

        zy() {
        }

        /* JADX INFO: renamed from: k */
        private void m3798k(ki kiVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (DrawerLayout.wvg(childAt)) {
                    kiVar.zy(childAt);
                }
            }
        }

        private void toq(ki kiVar, ki kiVar2) {
            Rect rect = this.f4393k;
            kiVar2.m3050i(rect);
            kiVar.r8s8(rect);
            kiVar.b8(kiVar2.ikck());
            kiVar.ebn(kiVar2.m3057r());
            kiVar.sok(kiVar2.ni7());
            kiVar.yqrt(kiVar2.wvg());
            kiVar.bz2(kiVar2.m3061x());
            kiVar.ktq(kiVar2.nmn5());
            kiVar.zsr0(kiVar2.yz());
            kiVar.bap7(kiVar2.dr());
            kiVar.m3052k(kiVar2.m3049h());
        }

        @Override // androidx.core.view.C0701k
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewM3786h = DrawerLayout.this.m3786h();
            if (viewM3786h == null) {
                return true;
            }
            CharSequence charSequenceT8r = DrawerLayout.this.t8r(DrawerLayout.this.m3787i(viewM3786h));
            if (charSequenceT8r == null) {
                return true;
            }
            text.add(charSequenceT8r);
            return true;
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.yl25);
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            if (DrawerLayout.w97r) {
                super.onInitializeAccessibilityNodeInfo(view, kiVar);
            } else {
                ki kiVarQkj8 = ki.qkj8(kiVar);
                super.onInitializeAccessibilityNodeInfo(view, kiVarQkj8);
                kiVar.wlev(view);
                Object objA98o = C0683f.a98o(view);
                if (objA98o instanceof View) {
                    kiVar.ij((View) objA98o);
                }
                toq(kiVar, kiVarQkj8);
                kiVarQkj8.tfm();
                m3798k(kiVar, (ViewGroup) view);
            }
            kiVar.sok(DrawerLayout.yl25);
            kiVar.jz5(false);
            kiVar.ktq(false);
            kiVar.d8wk(ki.C0656k.f3937g);
            kiVar.d8wk(ki.C0656k.f50702f7l8);
        }

        @Override // androidx.core.view.C0701k
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.w97r || DrawerLayout.wvg(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        w97r = true;
        tgs = true;
        zmmu = i2 >= 29;
    }

    public DrawerLayout(@lvui Context context) {
        this(context, null);
    }

    private void d3(Drawable drawable, int i2) {
        if (drawable == null || !androidx.core.graphics.drawable.zy.m2448y(drawable)) {
            return;
        }
        androidx.core.graphics.drawable.zy.qrj(drawable, i2);
    }

    /* JADX INFO: renamed from: f */
    private void m3781f(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z2 || a9(childAt)) && !(z2 && childAt == view)) {
                C0683f.o05(childAt, 4);
            } else {
                C0683f.o05(childAt, 1);
            }
        }
    }

    private static boolean fu4(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean gvn7(float f2, float f3, View view) {
        if (this.bl == null) {
            this.bl = new Rect();
        }
        view.getHitRect(this.bl);
        return this.bl.contains((int) f2, (int) f3);
    }

    private void hyr(View view) {
        ki.C0656k c0656k = ki.C0656k.f50717o1t;
        C0683f.yl(view, c0656k.toq());
        if (!jk(view) || ki(view) == 2) {
            return;
        }
        C0683f.ixz(view, c0656k, null, this.bg);
    }

    /* JADX INFO: renamed from: l */
    private void m3782l() {
        if (tgs) {
            return;
        }
        this.f51026bo = x9kr();
        this.f4374v = ncyb();
    }

    private Drawable ncyb() {
        int iM3159e = C0683f.m3159e(this);
        if (iM3159e == 0) {
            Drawable drawable = this.bv;
            if (drawable != null) {
                d3(drawable, iM3159e);
                return this.bv;
            }
        } else {
            Drawable drawable2 = this.bp;
            if (drawable2 != null) {
                d3(drawable2, iM3159e);
                return this.bp;
            }
        }
        return this.id;
    }

    static String ni7(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private boolean o1t() {
        return m3786h() != null;
    }

    private boolean qrj(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventZurt = zurt(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventZurt);
            motionEventZurt.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    static boolean wvg(View view) {
        return (C0683f.m3157c(view) == 4 || C0683f.m3157c(view) == 2) ? false : true;
    }

    private Drawable x9kr() {
        int iM3159e = C0683f.m3159e(this);
        if (iM3159e == 0) {
            Drawable drawable = this.bp;
            if (drawable != null) {
                d3(drawable, iM3159e);
                return this.bp;
            }
        } else {
            Drawable drawable2 = this.bv;
            if (drawable2 != null) {
                d3(drawable2, iM3159e);
                return this.bv;
            }
        }
        return this.an;
    }

    /* JADX INFO: renamed from: z */
    private boolean m3783z() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((C0785g) getChildAt(i2).getLayoutParams()).f51029zy) {
                return true;
            }
        }
        return false;
    }

    private MotionEvent zurt(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.as == null) {
                this.as = new Matrix();
            }
            matrix.invert(this.as);
            motionEventObtain.transform(this.as);
        }
        return motionEventObtain;
    }

    boolean a9(View view) {
        int iM3432q = qrj.m3432q(((C0785g) view.getLayoutParams()).f4386k, C0683f.m3159e(view));
        return ((iM3432q & 3) == 0 && (iM3432q & 5) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!a9(childAt)) {
                this.in.add(childAt);
            } else if (jk(childAt)) {
                childAt.addFocusables(arrayList, i2, i3);
                z2 = true;
            }
        }
        if (!z2) {
            int size = this.in.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.in.get(i5);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        this.in.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (kja0() != null || a9(view)) {
            C0683f.o05(view, 4);
        } else {
            C0683f.o05(view, 1);
        }
        if (w97r) {
            return;
        }
        C0683f.zwy(view, this.f4363k);
    }

    /* JADX INFO: renamed from: c */
    void m3784c(int i2, View view) {
        int iFti = this.f4368p.fti();
        int iFti2 = this.f4360h.fti();
        int i3 = 2;
        if (iFti == 1 || iFti2 == 1) {
            i3 = 1;
        } else if (iFti != 2 && iFti2 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f2 = ((C0785g) view.getLayoutParams()).f51028toq;
            if (f2 == 0.0f) {
                m3790p(view);
            } else if (f2 == 1.0f) {
                ld6(view);
            }
        }
        if (i3 != this.f4372t) {
            this.f4372t = i3;
            List<InterfaceC0787n> list = this.f4354b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4354b.get(size).zy(i3);
                }
            }
        }
    }

    public int cdj(int i2) {
        int iM3159e = C0683f.m3159e(this);
        if (i2 == 3) {
            int i3 = this.f4358f;
            if (i3 != 3) {
                return i3;
            }
            int i4 = iM3159e == 0 ? this.f4357e : this.f4362j;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i2 == 5) {
            int i5 = this.f4355c;
            if (i5 != 3) {
                return i5;
            }
            int i6 = iM3159e == 0 ? this.f4362j : this.f4357e;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i2 == 8388611) {
            int i7 = this.f4357e;
            if (i7 != 3) {
                return i7;
            }
            int i8 = iM3159e == 0 ? this.f4358f : this.f4355c;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i2 != 8388613) {
            return 0;
        }
        int i9 = this.f4362j;
        if (i9 != 3) {
            return i9;
        }
        int i10 = iM3159e == 0 ? this.f4355c : this.f4358f;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0785g) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.zy
    public void close() {
        m3791q(qrj.f50865toq);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            fMax = Math.max(fMax, ((C0785g) getChildAt(i2).getLayoutParams()).f51028toq);
        }
        this.f4377y = fMax;
        boolean zKja0 = this.f4368p.kja0(true);
        boolean zKja02 = this.f4360h.kja0(true);
        if (zKja0 || zKja02) {
            C0683f.h7am(this);
        }
    }

    public void d2ok(int i2, boolean z2) {
        View viewN7h = n7h(i2);
        if (viewN7h != null) {
            m3792r(viewN7h, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + ni7(i2));
    }

    public void dd(@lvui InterfaceC0787n interfaceC0787n) {
        List<InterfaceC0787n> list;
        if (interfaceC0787n == null || (list = this.f4354b) == null) {
            return;
        }
        list.remove(interfaceC0787n);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f4377y <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (gvn7(x3, y3, childAt) && !m3794t(childAt) && qrj(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        int height = getHeight();
        boolean zM3794t = m3794t(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i2 = 0;
        if (zM3794t) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && fu4(childAt) && a9(childAt) && childAt.getHeight() >= height) {
                    if (zy(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(iSave);
        float f2 = this.f4377y;
        if (f2 > 0.0f && zM3794t) {
            this.f4371s.setColor((this.f4359g & C0683f.f50797t8r) | (((int) ((((-16777216) & r2) >>> 24) * f2)) << 24));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.f4371s);
        } else if (this.f51026bo != null && zy(view, 3)) {
            int intrinsicWidth = this.f51026bo.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f4368p.m3748t(), 1.0f));
            this.f51026bo.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f51026bo.setAlpha((int) (fMax * 255.0f));
            this.f51026bo.draw(canvas);
        } else if (this.f4374v != null && zy(view, 5)) {
            int intrinsicWidth2 = this.f4374v.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f4360h.m3748t(), 1.0f));
            this.f4374v.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f4374v.setAlpha((int) (fMax2 * 255.0f));
            this.f4374v.draw(canvas);
        }
        return zDrawChild;
    }

    public void eqxt(int i2) {
        d2ok(i2, true);
    }

    public void f7l8(@lvui View view, boolean z2) {
        if (!a9(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0785g c0785g = (C0785g) view.getLayoutParams();
        if (this.f4364l) {
            c0785g.f51028toq = 0.0f;
            c0785g.f4387q = 0;
        } else if (z2) {
            c0785g.f4387q |= 4;
            if (zy(view, 3)) {
                this.f4368p.uv6(view, -view.getWidth(), view.getTop());
            } else {
                this.f4360h.uv6(view, getWidth(), view.getTop());
            }
        } else {
            oc(view, 0.0f);
            m3784c(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    float fn3e(View view) {
        return ((C0785g) view.getLayoutParams()).f51028toq;
    }

    public boolean fti(int i2) {
        View viewN7h = n7h(i2);
        if (viewN7h != null) {
            return jp0y(viewN7h);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m3785g(@lvui View view) {
        f7l8(view, true);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0785g(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0785g ? new C0785g((C0785g) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0785g((ViewGroup.MarginLayoutParams) layoutParams) : new C0785g(layoutParams);
    }

    public float getDrawerElevation() {
        if (tgs) {
            return this.f4369q;
        }
        return 0.0f;
    }

    @dd
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4373u;
    }

    /* JADX INFO: renamed from: h */
    View m3786h() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (a9(childAt) && jp0y(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    int m3787i(View view) {
        return qrj.m3432q(((C0785g) view.getLayoutParams()).f4386k, C0683f.m3159e(this));
    }

    @Override // androidx.customview.widget.zy
    public boolean isOpen() {
        return mcp(qrj.f50865toq);
    }

    public boolean jk(@lvui View view) {
        if (a9(view)) {
            return (((C0785g) view.getLayoutParams()).f4387q & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean jp0y(@lvui View view) {
        if (a9(view)) {
            return ((C0785g) view.getLayoutParams()).f51028toq > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: k */
    public void m3788k(@lvui InterfaceC0787n interfaceC0787n) {
        if (interfaceC0787n == null) {
            return;
        }
        if (this.f4354b == null) {
            this.f4354b = new ArrayList();
        }
        this.f4354b.add(interfaceC0787n);
    }

    public int ki(@lvui View view) {
        if (a9(view)) {
            return cdj(((C0785g) view.getLayoutParams()).f4386k);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    View kja0() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((C0785g) childAt.getLayoutParams()).f4387q & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    void ld6(View view) {
        C0785g c0785g = (C0785g) view.getLayoutParams();
        if ((c0785g.f4387q & 1) == 0) {
            c0785g.f4387q = 1;
            List<InterfaceC0787n> list = this.f4354b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4354b.get(size).mo246k(view);
                }
            }
            m3781f(view, true);
            hyr(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void lvui(@lvui View view) {
        m3792r(view, true);
    }

    public boolean mcp(int i2) {
        View viewN7h = n7h(i2);
        if (viewN7h != null) {
            return jk(viewN7h);
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m3789n(int i2, boolean z2) {
        View viewN7h = n7h(i2);
        if (viewN7h != null) {
            f7l8(viewN7h, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + ni7(i2));
    }

    void n5r1(View view, float f2) {
        C0785g c0785g = (C0785g) view.getLayoutParams();
        if (f2 == c0785g.f51028toq) {
            return;
        }
        c0785g.f51028toq = f2;
        x2(view, f2);
    }

    View n7h(int i2) {
        int iM3432q = qrj.m3432q(i2, C0683f.m3159e(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m3787i(childAt) & 7) == iM3432q) {
                return childAt;
            }
        }
        return null;
    }

    void oc(View view, float f2) {
        float fFn3e = fn3e(view);
        float width = view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (fFn3e * width));
        if (!zy(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        n5r1(view, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4364l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4364l = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.bb || this.f4373u == null) {
            return;
        }
        Object obj = this.f51025ab;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f4373u.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f4373u.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.q r1 = r6.f4368p
            boolean r1 = r1.lrht(r7)
            androidx.customview.widget.q r2 = r6.f4360h
            boolean r2 = r2.lrht(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            androidx.customview.widget.q r7 = r6.f4368p
            boolean r7 = r7.m3744g(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$y r7 = r6.f4361i
            r7.m3797h()
            androidx.drawerlayout.widget.DrawerLayout$y r7 = r6.f4378z
            r7.m3797h()
            goto L36
        L31:
            r6.m3793s(r2)
            r6.f4367o = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f4353a = r0
            r6.f4376x = r7
            float r4 = r6.f4377y
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            androidx.customview.widget.q r4 = r6.f4368p
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.zurt(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.m3794t(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f4367o = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.m3783z()
            if (r7 != 0) goto L70
            boolean r7 = r6.f4367o
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !o1t()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View viewM3786h = m3786h();
        if (viewM3786h != null && ki(viewM3786h) == 0) {
            m3795y();
        }
        return viewM3786h != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f2;
        int i6;
        boolean z3 = true;
        this.f4370r = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0785g c0785g = (C0785g) childAt.getLayoutParams();
                if (m3794t(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) c0785g).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) c0785g).topMargin, childAt.getMeasuredWidth() + i9, ((ViewGroup.MarginLayoutParams) c0785g).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zy(childAt, 3)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (c0785g.f51028toq * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i7 - r11) / f4;
                        i6 = i7 - ((int) (c0785g.f51028toq * f4));
                    }
                    boolean z5 = f2 != c0785g.f51028toq ? z3 : false;
                    int i10 = c0785g.f4386k & 112;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c0785g).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) c0785g).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c0785g).topMargin;
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight + i16);
                    } else {
                        int i17 = i5 - i3;
                        childAt.layout(i6, (i17 - ((ViewGroup.MarginLayoutParams) c0785g).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i17 - ((ViewGroup.MarginLayoutParams) c0785g).bottomMargin);
                    }
                    if (z5) {
                        n5r1(childAt, f2);
                    }
                    int i18 = c0785g.f51028toq > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        if (zmmu && (rootWindowInsets = getRootWindowInsets()) != null) {
            x2 x2VarN7h = tfm.eqxt(rootWindowInsets).n7h();
            C0779q c0779q = this.f4368p;
            c0779q.n5r1(Math.max(c0779q.wvg(), x2VarN7h.f3600k));
            C0779q c0779q2 = this.f4360h;
            c0779q2.n5r1(Math.max(c0779q2.wvg(), x2VarN7h.f50490zy));
        }
        this.f4370r = false;
        this.f4364l = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.f51025ab != null && C0683f.m3160f(this);
        int iM3159e = C0683f.m3159e(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z5 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0785g c0785g = (C0785g) childAt.getLayoutParams();
                if (z2) {
                    int iM3432q = qrj.m3432q(c0785g.f4386k, iM3159e);
                    if (C0683f.m3160f(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f51025ab;
                        if (iM3432q == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i4, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iM3432q == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i4, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f51025ab;
                        if (iM3432q == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), i4, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iM3432q == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(i4, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c0785g).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c0785g).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c0785g).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c0785g).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m3794t(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c0785g).leftMargin) - ((ViewGroup.MarginLayoutParams) c0785g).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c0785g).topMargin) - ((ViewGroup.MarginLayoutParams) c0785g).bottomMargin, 1073741824));
                } else {
                    if (!a9(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (tgs) {
                        float fM3166l = C0683f.m3166l(childAt);
                        float f2 = this.f4369q;
                        if (fM3166l != f2) {
                            C0683f.a5id(childAt, f2);
                        }
                    }
                    int iM3787i = m3787i(childAt) & 7;
                    int i6 = iM3787i == 3 ? 1 : i4;
                    if ((i6 != 0 && z3) || (i6 == 0 && z5)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + ni7(iM3787i) + " but this " + az + " already has a drawer view along that edge");
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z5 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.f4366n + ((ViewGroup.MarginLayoutParams) c0785g).leftMargin + ((ViewGroup.MarginLayoutParams) c0785g).rightMargin, ((ViewGroup.MarginLayoutParams) c0785g).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) c0785g).topMargin + ((ViewGroup.MarginLayoutParams) c0785g).bottomMargin, ((ViewGroup.MarginLayoutParams) c0785g).height));
                }
            }
            i5++;
            i4 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN7h;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.f4381q;
        if (i2 != 0 && (viewN7h = n7h(i2)) != null) {
            lvui(viewN7h);
        }
        int i3 = savedState.f4380n;
        if (i3 != 3) {
            setDrawerLockMode(i3, 3);
        }
        int i4 = savedState.f4379g;
        if (i4 != 3) {
            setDrawerLockMode(i4, 5);
        }
        int i5 = savedState.f4383y;
        if (i5 != 3) {
            setDrawerLockMode(i5, qrj.f50865toq);
        }
        int i6 = savedState.f4382s;
        if (i6 != 3) {
            setDrawerLockMode(i6, qrj.f50866zy);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        m3782l();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0785g c0785g = (C0785g) getChildAt(i2).getLayoutParams();
            int i3 = c0785g.f4387q;
            boolean z2 = i3 == 1;
            boolean z3 = i3 == 2;
            if (z2 || z3) {
                savedState.f4381q = c0785g.f4386k;
                break;
            }
        }
        savedState.f4380n = this.f4358f;
        savedState.f4379g = this.f4355c;
        savedState.f4383y = this.f4357e;
        savedState.f4382s = this.f4362j;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.q r0 = r6.f4368p
            r0.lvui(r7)
            androidx.customview.widget.q r0 = r6.f4360h
            r0.lvui(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.m3793s(r2)
            r6.f4367o = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.q r3 = r6.f4368p
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.zurt(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.m3794t(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f4353a
            float r0 = r0 - r3
            float r3 = r6.f4376x
            float r7 = r7 - r3
            androidx.customview.widget.q r3 = r6.f4368p
            int r3 = r3.a9()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.kja0()
            if (r7 == 0) goto L5a
            int r7 = r6.ki(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.m3793s(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f4353a = r0
            r6.f4376x = r7
            r6.f4367o = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.customview.widget.zy
    public void open() {
        eqxt(qrj.f50865toq);
    }

    /* JADX INFO: renamed from: p */
    void m3790p(View view) {
        View rootView;
        C0785g c0785g = (C0785g) view.getLayoutParams();
        if ((c0785g.f4387q & 1) == 1) {
            c0785g.f4387q = 0;
            List<InterfaceC0787n> list = this.f4354b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4354b.get(size).toq(view);
                }
            }
            m3781f(view, false);
            hyr(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m3791q(int i2) {
        m3789n(i2, true);
    }

    /* JADX INFO: renamed from: r */
    public void m3792r(@lvui View view, boolean z2) {
        if (!a9(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0785g c0785g = (C0785g) view.getLayoutParams();
        if (this.f4364l) {
            c0785g.f51028toq = 1.0f;
            c0785g.f4387q = 1;
            m3781f(view, true);
            hyr(view);
        } else if (z2) {
            c0785g.f4387q |= 2;
            if (zy(view, 3)) {
                this.f4368p.uv6(view, 0, view.getTop());
            } else {
                this.f4360h.uv6(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            oc(view, 1.0f);
            m3784c(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            m3793s(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4370r) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    void m3793s(boolean z2) {
        int childCount = getChildCount();
        boolean zUv6 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0785g c0785g = (C0785g) childAt.getLayoutParams();
            if (a9(childAt) && (!z2 || c0785g.f51029zy)) {
                zUv6 |= zy(childAt, 3) ? this.f4368p.uv6(childAt, -childAt.getWidth(), childAt.getTop()) : this.f4360h.uv6(childAt, getWidth(), childAt.getTop());
                c0785g.f51029zy = false;
            }
        }
        this.f4361i.m3797h();
        this.f4378z.m3797h();
        if (zUv6) {
            invalidate();
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setChildInsets(Object obj, boolean z2) {
        this.f51025ab = obj;
        this.bb = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.f4369q = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (a9(childAt)) {
                C0683f.a5id(childAt, this.f4369q);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0787n interfaceC0787n) {
        InterfaceC0787n interfaceC0787n2 = this.f4365m;
        if (interfaceC0787n2 != null) {
            dd(interfaceC0787n2);
        }
        if (interfaceC0787n != null) {
            m3788k(interfaceC0787n);
        }
        this.f4365m = interfaceC0787n;
    }

    public void setDrawerLockMode(int i2) {
        setDrawerLockMode(i2, 3);
        setDrawerLockMode(i2, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i2) {
        if (tgs) {
            return;
        }
        if ((i2 & qrj.f50865toq) == 8388611) {
            this.bp = drawable;
        } else if ((i2 & qrj.f50866zy) == 8388613) {
            this.bv = drawable;
        } else if ((i2 & 3) == 3) {
            this.an = drawable;
        } else if ((i2 & 5) != 5) {
            return;
        } else {
            this.id = drawable;
        }
        m3782l();
        invalidate();
    }

    public void setDrawerTitle(int i2, @dd CharSequence charSequence) {
        int iM3432q = qrj.m3432q(i2, C0683f.m3159e(this));
        if (iM3432q == 3) {
            this.f4356d = charSequence;
        } else if (iM3432q == 5) {
            this.f4375w = charSequence;
        }
    }

    public void setScrimColor(@zy.x2 int i2) {
        this.f4359g = i2;
        invalidate();
    }

    public void setStatusBarBackground(@dd Drawable drawable) {
        this.f4373u = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@zy.x2 int i2) {
        this.f4373u = new ColorDrawable(i2);
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    boolean m3794t(View view) {
        return ((C0785g) view.getLayoutParams()).f4386k == 0;
    }

    @dd
    public CharSequence t8r(int i2) {
        int iM3432q = qrj.m3432q(i2, C0683f.m3159e(this));
        if (iM3432q == 3) {
            return this.f4356d;
        }
        if (iM3432q == 5) {
            return this.f4375w;
        }
        return null;
    }

    void toq() {
        if (this.f4367o) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f4367o = true;
    }

    void x2(View view, float f2) {
        List<InterfaceC0787n> list = this.f4354b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4354b.get(size).mo249q(view, f2);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m3795y() {
        m3793s(false);
    }

    boolean zy(View view, int i2) {
        return (m3787i(view) & i2) == i2;
    }

    public DrawerLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C7822k.k.f100824toq);
    }

    public DrawerLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4363k = new C0788q();
        this.f4359g = bs;
        this.f4371s = new Paint();
        this.f4364l = true;
        this.f4358f = 3;
        this.f4355c = 3;
        this.f4357e = 3;
        this.f4362j = 3;
        this.bp = null;
        this.bv = null;
        this.an = null;
        this.id = null;
        this.bg = new C0786k();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f4366n = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        C0789y c0789y = new C0789y(3);
        this.f4361i = c0789y;
        C0789y c0789y2 = new C0789y(5);
        this.f4378z = c0789y2;
        C0779q c0779qM3735h = C0779q.m3735h(this, 1.0f, c0789y);
        this.f4368p = c0779qM3735h;
        c0779qM3735h.hyr(1);
        c0779qM3735h.m3743f(f3);
        c0789y.cdj(c0779qM3735h);
        C0779q c0779qM3735h2 = C0779q.m3735h(this, 1.0f, c0789y2);
        this.f4360h = c0779qM3735h2;
        c0779qM3735h2.hyr(2);
        c0779qM3735h2.m3743f(f3);
        c0789y2.cdj(c0779qM3735h2);
        setFocusableInTouchMode(true);
        C0683f.o05(this, 1);
        C0683f.zwy(this, new zy());
        setMotionEventSplittingEnabled(false);
        if (C0683f.m3160f(this)) {
            setOnApplyWindowInsetsListener(new toq());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ba);
            try {
                this.f4373u = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C7822k.p.f100878f7l8, i2, 0);
        try {
            int i3 = C7822k.p.f46124y;
            if (typedArrayObtainStyledAttributes2.hasValue(i3)) {
                this.f4369q = typedArrayObtainStyledAttributes2.getDimension(i3, 0.0f);
            } else {
                this.f4369q = getResources().getDimension(C7822k.zy.f46148y);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.in = new ArrayList<>();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerLockMode(int i2, int i3) {
        View viewN7h;
        int iM3432q = qrj.m3432q(i3, C0683f.m3159e(this));
        if (i3 == 3) {
            this.f4358f = i2;
        } else if (i3 == 5) {
            this.f4355c = i2;
        } else if (i3 == 8388611) {
            this.f4357e = i2;
        } else if (i3 == 8388613) {
            this.f4362j = i2;
        }
        if (i2 != 0) {
            (iM3432q == 3 ? this.f4368p : this.f4360h).zy();
        }
        if (i2 != 1) {
            if (i2 == 2 && (viewN7h = n7h(iM3432q)) != null) {
                lvui(viewN7h);
                return;
            }
            return;
        }
        View viewN7h2 = n7h(iM3432q);
        if (viewN7h2 != null) {
            m3785g(viewN7h2);
        }
    }

    public void setStatusBarBackground(int i2) {
        this.f4373u = i2 != 0 ? C0498q.m2259s(getContext(), i2) : null;
        invalidate();
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    public static class C0785g extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f51027f7l8 = 4;

        /* JADX INFO: renamed from: g */
        private static final int f4384g = 2;

        /* JADX INFO: renamed from: n */
        private static final int f4385n = 1;

        /* JADX INFO: renamed from: k */
        public int f4386k;

        /* JADX INFO: renamed from: q */
        int f4387q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f51028toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f51029zy;

        public C0785g(@lvui Context context, @dd AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4386k = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.tlhn);
            this.f4386k = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0785g(int i2, int i3) {
            super(i2, i3);
            this.f4386k = 0;
        }

        public C0785g(int i2, int i3, int i4) {
            this(i2, i3);
            this.f4386k = i4;
        }

        public C0785g(@lvui C0785g c0785g) {
            super((ViewGroup.MarginLayoutParams) c0785g);
            this.f4386k = 0;
            this.f4386k = c0785g.f4386k;
        }

        public C0785g(@lvui ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4386k = 0;
        }

        public C0785g(@lvui ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4386k = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0785g(getContext(), attributeSet);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.drawerlayout.widget.DrawerLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        int f4379g;

        /* JADX INFO: renamed from: n */
        int f4380n;

        /* JADX INFO: renamed from: q */
        int f4381q;

        /* JADX INFO: renamed from: s */
        int f4382s;

        /* JADX INFO: renamed from: y */
        int f4383y;

        public SavedState(@lvui Parcel parcel, @dd ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4381q = 0;
            this.f4381q = parcel.readInt();
            this.f4380n = parcel.readInt();
            this.f4379g = parcel.readInt();
            this.f4383y = parcel.readInt();
            this.f4382s = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f4381q);
            parcel.writeInt(this.f4380n);
            parcel.writeInt(this.f4379g);
            parcel.writeInt(this.f4383y);
            parcel.writeInt(this.f4382s);
        }

        public SavedState(@lvui Parcelable parcelable) {
            super(parcelable);
            this.f4381q = 0;
        }
    }

    public void setDrawerShadow(@zy.fn3e int i2, int i3) {
        setDrawerShadow(C0498q.m2259s(getContext(), i2), i3);
    }

    public void setDrawerLockMode(int i2, @lvui View view) {
        if (a9(view)) {
            setDrawerLockMode(i2, ((C0785g) view.getLayoutParams()).f4386k);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }
}
