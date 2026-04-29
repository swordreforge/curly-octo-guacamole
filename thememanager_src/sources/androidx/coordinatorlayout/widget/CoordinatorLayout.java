package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0498q;
import androidx.core.util.C0642s;
import androidx.core.util.qrj;
import androidx.core.view.C0683f;
import androidx.core.view.eqxt;
import androidx.core.view.gvn7;
import androidx.core.view.jp0y;
import androidx.core.view.oc;
import androidx.core.view.tfm;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qrj.C7620k;
import zy.InterfaceC7828g;
import zy.InterfaceC7843t;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.uv6;
import zy.x2;
import zy.yz;
import zy.zurt;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements jp0y, gvn7 {

    /* JADX INFO: renamed from: a */
    static final String f3055a = "CoordinatorLayout";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    static final int f50017ab = 1;
    static final int bb = 2;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f50018bo = 1;
    static final Comparator<View> bp;
    private static final qrj.InterfaceC0641k<Rect> bv;

    /* JADX INFO: renamed from: d */
    static final ThreadLocal<Map<String, Constructor<zy>>> f3056d;

    /* JADX INFO: renamed from: u */
    private static final int f3057u = 0;

    /* JADX INFO: renamed from: v */
    static final Class<?>[] f3058v;

    /* JADX INFO: renamed from: w */
    static final int f3059w = 0;

    /* JADX INFO: renamed from: x */
    static final String f3060x;

    /* JADX INFO: renamed from: b */
    private final oc f3061b;

    /* JADX INFO: renamed from: c */
    private tfm f3062c;

    /* JADX INFO: renamed from: e */
    private boolean f3063e;

    /* JADX INFO: renamed from: f */
    private boolean f3064f;

    /* JADX INFO: renamed from: g */
    private final List<View> f3065g;

    /* JADX INFO: renamed from: h */
    private boolean f3066h;

    /* JADX INFO: renamed from: i */
    private boolean f3067i;

    /* JADX INFO: renamed from: j */
    private Drawable f3068j;

    /* JADX INFO: renamed from: k */
    private final List<View> f3069k;

    /* JADX INFO: renamed from: l */
    private ViewTreeObserverOnPreDrawListenerC0406y f3070l;

    /* JADX INFO: renamed from: m */
    private eqxt f3071m;

    /* JADX INFO: renamed from: n */
    private final List<View> f3072n;

    /* JADX INFO: renamed from: o */
    ViewGroup.OnHierarchyChangeListener f3073o;

    /* JADX INFO: renamed from: p */
    private final int[] f3074p;

    /* JADX INFO: renamed from: q */
    private final C0407k<View> f3075q;

    /* JADX INFO: renamed from: r */
    private View f3076r;

    /* JADX INFO: renamed from: s */
    private final int[] f3077s;

    /* JADX INFO: renamed from: t */
    private View f3078t;

    /* JADX INFO: renamed from: y */
    private Paint f3079y;

    /* JADX INFO: renamed from: z */
    private int[] f3080z;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    private class ViewGroupOnHierarchyChangeListenerC0401g implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC0401g() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3073o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.lvui(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3073o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$k */
    class C0402k implements eqxt {
        C0402k() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, tfm tfmVar) {
            return CoordinatorLayout.this.hb(tfmVar);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$n */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0403n {
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$q */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC0404q {
        Class<? extends zy> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$s */
    static class C0405s implements Comparator<View> {
        C0405s() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fQkj8 = C0683f.qkj8(view);
            float fQkj82 = C0683f.qkj8(view2);
            if (fQkj8 > fQkj82) {
                return -1;
            }
            return fQkj8 < fQkj82 ? 1 : 0;
        }
    }

    public interface toq {
        @lvui
        zy getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$y */
    class ViewTreeObserverOnPreDrawListenerC0406y implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC0406y() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.lvui(0);
            return true;
        }
    }

    public static abstract class zy<V extends View> {
        public zy() {
        }

        public static void fti(@lvui View view, @dd Object obj) {
            ((f7l8) view.getLayoutParams()).f50021ki = obj;
        }

        @dd
        /* JADX INFO: renamed from: n */
        public static Object m1750n(@lvui View view) {
            return ((f7l8) view.getLayoutParams()).f50021ki;
        }

        public boolean a9(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui MotionEvent motionEvent) {
            return false;
        }

        @Deprecated
        public void cdj(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2, int i3, @lvui int[] iArr) {
        }

        @lvui
        public tfm f7l8(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui tfm tfmVar) {
            return tfmVar;
        }

        public void fn3e(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
            m1753i(coordinatorLayout, v2, view, i2, i3, i4, i5, i6);
        }

        public boolean fu4(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui Rect rect, boolean z2) {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public boolean mo1751g(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view) {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public boolean mo1752h(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: i */
        public void m1753i(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                t8r(coordinatorLayout, v2, view, i2, i3, i4, i5);
            }
        }

        public void jk(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2) {
            if (i2 == 0) {
                mcp(coordinatorLayout, v2, view);
            }
        }

        /* JADX INFO: renamed from: k */
        public boolean m1754k(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2) {
            return m1756q(coordinatorLayout, v2) > 0.0f;
        }

        public void ki(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2, int i3, @lvui int[] iArr, int i4) {
            if (i4 == 0) {
                cdj(coordinatorLayout, v2, view, i2, i3, iArr);
            }
        }

        public boolean kja0(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, float f2, float f3, boolean z2) {
            return false;
        }

        public void ld6() {
        }

        @Deprecated
        public void mcp(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view) {
        }

        public boolean n7h(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, int i2, int i3, int i4, int i5) {
            return false;
        }

        public void ni7(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, @lvui View view2, int i2, int i3) {
            if (i3 == 0) {
                zurt(coordinatorLayout, v2, view, view2, i2);
            }
        }

        @dd
        public Parcelable o1t(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* JADX INFO: renamed from: p */
        public void mo1755p(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view) {
        }

        @zurt(from = 0.0d, to = 1.0d)
        /* JADX INFO: renamed from: q */
        public float m1756q(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2) {
            return 0.0f;
        }

        public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, int i2) {
            return false;
        }

        /* JADX INFO: renamed from: s */
        public boolean mo1757s(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view) {
            return false;
        }

        /* JADX INFO: renamed from: t */
        public boolean mo1758t(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, @lvui View view2, int i2, int i3) {
            if (i3 == 0) {
                return wvg(coordinatorLayout, v2, view, view2, i2);
            }
            return false;
        }

        @Deprecated
        public void t8r(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2, int i3, int i4, int i5) {
        }

        public boolean toq(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui Rect rect) {
            return false;
        }

        @Deprecated
        public boolean wvg(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, @lvui View view2, int i2) {
            return false;
        }

        public boolean x2(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: y */
        public void mo1759y(@lvui f7l8 f7l8Var) {
        }

        /* JADX INFO: renamed from: z */
        public void mo1760z(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui Parcelable parcelable) {
        }

        @Deprecated
        public void zurt(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, @lvui View view2, int i2) {
        }

        @x2
        public int zy(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2) {
            return -16777216;
        }

        public zy(Context context, AttributeSet attributeSet) {
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f3060x = r0 != null ? r0.getName() : null;
        bp = new C0405s();
        f3058v = new Class[]{Context.class, AttributeSet.class};
        f3056d = new ThreadLocal<>();
        bv = new qrj.zy(12);
    }

    public CoordinatorLayout(@lvui Context context) {
        this(context, null);
    }

    private void a9(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = bp;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1726c(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            zy zyVarM1740g = ((f7l8) childAt.getLayoutParams()).m1740g();
            if (zyVarM1740g != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    zyVarM1740g.x2(this, childAt, motionEventObtain);
                } else {
                    zyVarM1740g.a9(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f7l8) getChildAt(i3).getLayoutParams()).n7h();
        }
        this.f3078t = null;
        this.f3066h = false;
    }

    private void d3(View view, View view2, int i2) {
        Rect rectM1730n = m1730n();
        Rect rectM1730n2 = m1730n();
        try {
            zurt(view2, rectM1730n);
            o1t(view, i2, rectM1730n, rectM1730n2);
            view.layout(rectM1730n2.left, rectM1730n2.top, rectM1730n2.right, rectM1730n2.bottom);
        } finally {
            hyr(rectM1730n);
            hyr(rectM1730n2);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1727e(View view, int i2) {
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        int i3 = f7l8Var.f3088s;
        if (i3 != i2) {
            C0683f.gc3c(view, i2 - i3);
            f7l8Var.f3088s = i2;
        }
    }

    private void eqxt(View view, Rect rect, int i2) {
        boolean z2;
        boolean z3;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (C0683f.v0af(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f7l8 f7l8Var = (f7l8) view.getLayoutParams();
            zy zyVarM1740g = f7l8Var.m1740g();
            Rect rectM1730n = m1730n();
            Rect rectM1730n2 = m1730n();
            rectM1730n2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (zyVarM1740g == null || !zyVarM1740g.toq(this, view, rectM1730n)) {
                rectM1730n.set(rectM1730n2);
            } else if (!rectM1730n2.contains(rectM1730n)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM1730n.toShortString() + " | Bounds:" + rectM1730n2.toShortString());
            }
            hyr(rectM1730n2);
            if (rectM1730n.isEmpty()) {
                hyr(rectM1730n);
                return;
            }
            int iM3432q = androidx.core.view.qrj.m3432q(f7l8Var.f3089y, i2);
            boolean z5 = true;
            if ((iM3432q & 48) != 48 || (i7 = (rectM1730n.top - ((ViewGroup.MarginLayoutParams) f7l8Var).topMargin) - f7l8Var.f3086p) >= (i8 = rect.top)) {
                z2 = false;
            } else {
                nn86(view, i8 - i7);
                z2 = true;
            }
            if ((iM3432q & 80) == 80 && (height = ((getHeight() - rectM1730n.bottom) - ((ViewGroup.MarginLayoutParams) f7l8Var).bottomMargin) + f7l8Var.f3086p) < (i6 = rect.bottom)) {
                nn86(view, height - i6);
                z2 = true;
            }
            if (!z2) {
                nn86(view, 0);
            }
            if ((iM3432q & 3) != 3 || (i4 = (rectM1730n.left - ((ViewGroup.MarginLayoutParams) f7l8Var).leftMargin) - f7l8Var.f3088s) >= (i5 = rect.left)) {
                z3 = false;
            } else {
                m1727e(view, i5 - i4);
                z3 = true;
            }
            if ((iM3432q & 5) != 5 || (width = ((getWidth() - rectM1730n.right) - ((ViewGroup.MarginLayoutParams) f7l8Var).rightMargin) + f7l8Var.f3088s) >= (i3 = rect.right)) {
                z5 = z3;
            } else {
                m1727e(view, width - i3);
            }
            if (!z5) {
                m1727e(view, 0);
            }
            hyr(rectM1730n);
        }
    }

    private static int f7l8(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private boolean fti(View view) {
        return this.f3075q.m1764p(view);
    }

    private void gvn7(View view, int i2) {
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        Rect rectM1730n = m1730n();
        rectM1730n.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) f7l8Var).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) f7l8Var).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) f7l8Var).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) f7l8Var).bottomMargin);
        if (this.f3062c != null && C0683f.m3160f(this) && !C0683f.m3160f(view)) {
            rectM1730n.left += this.f3062c.m3467h();
            rectM1730n.top += this.f3062c.ki();
            rectM1730n.right -= this.f3062c.cdj();
            rectM1730n.bottom -= this.f3062c.kja0();
        }
        Rect rectM1730n2 = m1730n();
        androidx.core.view.qrj.toq(uv6(f7l8Var.f50028zy), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM1730n, rectM1730n2, i2);
        view.layout(rectM1730n2.left, rectM1730n2.top, rectM1730n2.right, rectM1730n2.bottom);
        hyr(rectM1730n);
        hyr(rectM1730n2);
    }

    private static void hyr(@lvui Rect rect) {
        rect.setEmpty();
        bv.toq(rect);
    }

    /* JADX INFO: renamed from: j */
    private void m1728j() {
        if (!C0683f.m3160f(this)) {
            C0683f.kx3(this, null);
            return;
        }
        if (this.f3071m == null) {
            this.f3071m = new C0402k();
        }
        C0683f.kx3(this, this.f3071m);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: l */
    private void m1729l() {
        this.f3069k.clear();
        this.f3075q.zy();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f7l8 f7l8VarJk = jk(childAt);
            f7l8VarJk.m1746q(this, childAt);
            this.f3075q.toq(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (f7l8VarJk.toq(this, childAt, childAt2)) {
                        if (!this.f3075q.m1765q(childAt2)) {
                            this.f3075q.toq(childAt2);
                        }
                        this.f3075q.m1763k(childAt2, childAt);
                    }
                }
            }
        }
        this.f3069k.addAll(this.f3075q.m1766s());
        Collections.reverse(this.f3069k);
    }

    private static int lrht(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    private static Rect m1730n() {
        Rect rectMo2983k = bv.mo2983k();
        return rectMo2983k == null ? new Rect() : rectMo2983k;
    }

    private boolean ncyb(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3072n;
        a9(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zX2 = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            f7l8 f7l8Var = (f7l8) view.getLayoutParams();
            zy zyVarM1740g = f7l8Var.m1740g();
            if (!(zX2 || z2) || actionMasked == 0) {
                if (!zX2 && zyVarM1740g != null) {
                    if (i2 == 0) {
                        zX2 = zyVarM1740g.x2(this, view, motionEvent);
                    } else if (i2 == 1) {
                        zX2 = zyVarM1740g.a9(this, view, motionEvent);
                    }
                    if (zX2) {
                        this.f3078t = view;
                    }
                }
                boolean zZy = f7l8Var.zy();
                boolean zM1745p = f7l8Var.m1745p(this, view);
                z2 = zM1745p && !zZy;
                if (zM1745p && !z2) {
                    break;
                }
            } else if (zyVarM1740g != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    zyVarM1740g.x2(this, view, motionEventObtain);
                } else if (i2 == 1) {
                    zyVarM1740g.a9(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zX2;
    }

    private void nn86(View view, int i2) {
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        int i3 = f7l8Var.f3086p;
        if (i3 != i2) {
            C0683f.zkd(view, i2 - i3);
            f7l8Var.f3086p = i2;
        }
    }

    private void oc(View view, int i2, int i3) {
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        int iM3432q = androidx.core.view.qrj.m3432q(vyq(f7l8Var.f50028zy), i3);
        int i4 = iM3432q & 7;
        int i5 = iM3432q & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int iM1732t = m1732t(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            iM1732t += measuredWidth / 2;
        } else if (i4 == 5) {
            iM1732t += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) f7l8Var).leftMargin, Math.min(iM1732t, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) f7l8Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) f7l8Var).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) f7l8Var).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: s */
    private tfm m1731s(tfm tfmVar) {
        zy zyVarM1740g;
        if (tfmVar.wvg()) {
            return tfmVar;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (C0683f.m3160f(childAt) && (zyVarM1740g = ((f7l8) childAt.getLayoutParams()).m1740g()) != null) {
                tfmVar = zyVarM1740g.f7l8(this, childAt, tfmVar);
                if (tfmVar.wvg()) {
                    break;
                }
            }
        }
        return tfmVar;
    }

    /* JADX INFO: renamed from: t */
    private int m1732t(int i2) {
        int[] iArr = this.f3080z;
        if (iArr == null) {
            Log.e(f3055a, "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e(f3055a, "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private static int uv6(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= androidx.core.view.qrj.f50865toq;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int vyq(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void wvg(View view, int i2, Rect rect, Rect rect2, f7l8 f7l8Var, int i3, int i4) {
        int iM3432q = androidx.core.view.qrj.m3432q(lrht(f7l8Var.f50028zy), i2);
        int iM3432q2 = androidx.core.view.qrj.m3432q(uv6(f7l8Var.f3087q), i2);
        int i5 = iM3432q & 7;
        int i6 = iM3432q & 112;
        int i7 = iM3432q2 & 7;
        int i8 = iM3432q2 & 112;
        int iWidth = i7 != 1 ? i7 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i8 != 16 ? i8 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            iWidth -= i3 / 2;
        } else if (i5 != 5) {
            iWidth -= i3;
        }
        if (i6 == 16) {
            iHeight -= i4 / 2;
        } else if (i6 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static zy x9kr(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3060x;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<zy>>> threadLocal = f3056d;
            Map<String, Constructor<zy>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<zy> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3058v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m1733y(f7l8 f7l8Var, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) f7l8Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) f7l8Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) f7l8Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) f7l8Var).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
    public f7l8 generateLayoutParams(AttributeSet attributeSet) {
        return new f7l8(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f7l8) && super.checkLayoutParams(layoutParams);
    }

    void d2ok(View view, int i2) {
        zy zyVarM1740g;
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        if (f7l8Var.f50023ld6 != null) {
            Rect rectM1730n = m1730n();
            Rect rectM1730n2 = m1730n();
            Rect rectM1730n3 = m1730n();
            zurt(f7l8Var.f50023ld6, rectM1730n);
            t8r(view, false, rectM1730n2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            wvg(view, i2, rectM1730n, rectM1730n3, f7l8Var, measuredWidth, measuredHeight);
            boolean z2 = (rectM1730n3.left == rectM1730n2.left && rectM1730n3.top == rectM1730n2.top) ? false : true;
            m1733y(f7l8Var, rectM1730n3, measuredWidth, measuredHeight);
            int i3 = rectM1730n3.left - rectM1730n2.left;
            int i4 = rectM1730n3.top - rectM1730n2.top;
            if (i3 != 0) {
                C0683f.gc3c(view, i3);
            }
            if (i4 != 0) {
                C0683f.zkd(view, i4);
            }
            if (z2 && (zyVarM1740g = f7l8Var.m1740g()) != null) {
                zyVarM1740g.mo1757s(this, view, f7l8Var.f50023ld6);
            }
            hyr(rectM1730n);
            hyr(rectM1730n2);
            hyr(rectM1730n3);
        }
    }

    public void dd(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        zy zyVar = f7l8Var.f3084k;
        if (zyVar != null) {
            float fM1756q = zyVar.m1756q(this, view);
            if (fM1756q > 0.0f) {
                if (this.f3079y == null) {
                    this.f3079y = new Paint();
                }
                this.f3079y.setColor(f7l8Var.f3084k.zy(this, view));
                this.f3079y.setAlpha(f7l8(Math.round(fM1756q * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3079y);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3068j;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: f */
    void m1734f() {
        if (this.f3067i && this.f3070l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3070l);
        }
        this.f3064f = false;
    }

    @lvui
    public List<View> fn3e(@lvui View view) {
        List listF7l8 = this.f3075q.f7l8(view);
        this.f3065g.clear();
        if (listF7l8 != null) {
            this.f3065g.addAll(listF7l8);
        }
        return this.f3065g;
    }

    @Override // androidx.core.view.jp0y
    public void fu4(View view, int i2, int i3, int i4, int i5, int i6) {
        ni7(view, i2, i3, i4, i5, 0, this.f3074p);
    }

    /* JADX INFO: renamed from: g */
    void m1735g() {
        if (this.f3067i) {
            if (this.f3070l == null) {
                this.f3070l = new ViewTreeObserverOnPreDrawListenerC0406y();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3070l);
        }
        this.f3064f = true;
    }

    @yz
    final List<View> getDependencySortedChildren() {
        m1729l();
        return Collections.unmodifiableList(this.f3069k);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public final tfm getLastWindowInsets() {
        return this.f3062c;
    }

    @Override // android.view.ViewGroup, androidx.core.view.d3
    public int getNestedScrollAxes() {
        return this.f3061b.m3397k();
    }

    @dd
    public Drawable getStatusBarBackground() {
        return this.f3068j;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: h */
    public void mo419h(View view, int i2, int i3, int[] iArr, int i4) {
        zy zyVarM1740g;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f7l8 f7l8Var = (f7l8) childAt.getLayoutParams();
                if (f7l8Var.ld6(i4) && (zyVarM1740g = f7l8Var.m1740g()) != null) {
                    int[] iArr2 = this.f3077s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    zyVarM1740g.ki(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f3077s;
                    iMax = i2 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f3077s;
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            lvui(1);
        }
    }

    final tfm hb(tfm tfmVar) {
        if (C0642s.m2985k(this.f3062c, tfmVar)) {
            return tfmVar;
        }
        this.f3062c = tfmVar;
        boolean z2 = tfmVar != null && tfmVar.ki() > 0;
        this.f3063e = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        tfm tfmVarM1731s = m1731s(tfmVar);
        requestLayout();
        return tfmVarM1731s;
    }

    @lvui
    /* JADX INFO: renamed from: i */
    public List<View> m1736i(@lvui View view) {
        List<View> listM1767y = this.f3075q.m1767y(view);
        this.f3065g.clear();
        if (listM1767y != null) {
            this.f3065g.addAll(listM1767y);
        }
        return this.f3065g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    f7l8 jk(View view) {
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        if (!f7l8Var.f50026toq) {
            if (view instanceof toq) {
                zy behavior = ((toq) view).getBehavior();
                if (behavior == null) {
                    Log.e(f3055a, "Attached behavior class is null");
                }
                f7l8Var.cdj(behavior);
                f7l8Var.f50026toq = true;
            } else {
                InterfaceC0404q interfaceC0404q = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC0404q = (InterfaceC0404q) superclass.getAnnotation(InterfaceC0404q.class);
                    if (interfaceC0404q != null) {
                        break;
                    }
                }
                if (interfaceC0404q != null) {
                    try {
                        f7l8Var.cdj(interfaceC0404q.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e(f3055a, "Default behavior class " + interfaceC0404q.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                f7l8Var.f50026toq = true;
            }
        }
        return f7l8Var;
    }

    public boolean jp0y(@lvui View view, int i2, int i3) {
        Rect rectM1730n = m1730n();
        zurt(view, rectM1730n);
        try {
            return rectM1730n.contains(i2, i3);
        } finally {
            hyr(rectM1730n);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public f7l8 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f7l8 ? new f7l8((f7l8) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f7l8((ViewGroup.MarginLayoutParams) layoutParams) : new f7l8(layoutParams);
    }

    @Override // androidx.core.view.jp0y
    public void kja0(View view, int i2) {
        this.f3061b.m3398n(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f7l8 f7l8Var = (f7l8) childAt.getLayoutParams();
            if (f7l8Var.ld6(i2)) {
                zy zyVarM1740g = f7l8Var.m1740g();
                if (zyVarM1740g != null) {
                    zyVarM1740g.jk(this, childAt, view, i2);
                }
                f7l8Var.qrj(i2);
                f7l8Var.x2();
            }
        }
        this.f3076r = null;
    }

    @Override // androidx.core.view.jp0y
    public void ld6(View view, View view2, int i2, int i3) {
        zy zyVarM1740g;
        this.f3061b.zy(view, view2, i2, i3);
        this.f3076r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f7l8 f7l8Var = (f7l8) childAt.getLayoutParams();
            if (f7l8Var.ld6(i3) && (zyVarM1740g = f7l8Var.m1740g()) != null) {
                zyVarM1740g.ni7(this, childAt, view, view2, i2, i3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void lvui(int r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.lvui(int):void");
    }

    void mcp(View view, Rect rect) {
        rect.set(((f7l8) view.getLayoutParams()).m1748y());
    }

    void n5r1(View view, Rect rect) {
        ((f7l8) view.getLayoutParams()).t8r(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
    public f7l8 generateDefaultLayoutParams() {
        return new f7l8(-2, -2);
    }

    @Override // androidx.core.view.gvn7
    public void ni7(@lvui View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
        zy zyVarM1740g;
        boolean z2;
        int iMin;
        int childCount = getChildCount();
        boolean z3 = false;
        int iMax = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f7l8 f7l8Var = (f7l8) childAt.getLayoutParams();
                if (f7l8Var.ld6(i6) && (zyVarM1740g = f7l8Var.m1740g()) != null) {
                    int[] iArr2 = this.f3077s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    zyVarM1740g.fn3e(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f3077s;
                    iMax = i4 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i5 > 0) {
                        z2 = true;
                        iMin = Math.max(i7, this.f3077s[1]);
                    } else {
                        z2 = true;
                        iMin = Math.min(i7, this.f3077s[1]);
                    }
                    i7 = iMin;
                    z3 = z2;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i7;
        if (z3) {
            lvui(1);
        }
    }

    void o1t(View view, int i2, Rect rect, Rect rect2) {
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        wvg(view, i2, rect, rect2, f7l8Var, measuredWidth, measuredHeight);
        m1733y(f7l8Var, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1726c(false);
        if (this.f3064f) {
            if (this.f3070l == null) {
                this.f3070l = new ViewTreeObserverOnPreDrawListenerC0406y();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3070l);
        }
        if (this.f3062c == null && C0683f.m3160f(this)) {
            C0683f.m28243do(this);
        }
        this.f3067i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1726c(false);
        if (this.f3064f && this.f3070l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3070l);
        }
        View view = this.f3076r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3067i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3063e || this.f3068j == null) {
            return;
        }
        tfm tfmVar = this.f3062c;
        int iKi = tfmVar != null ? tfmVar.ki() : 0;
        if (iKi > 0) {
            this.f3068j.setBounds(0, 0, getWidth(), iKi);
            this.f3068j.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1726c(true);
        }
        boolean zNcyb = ncyb(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1726c(true);
        }
        return zNcyb;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        zy zyVarM1740g;
        int iM3159e = C0683f.m3159e(this);
        int size = this.f3069k.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f3069k.get(i6);
            if (view.getVisibility() != 8 && ((zyVarM1740g = ((f7l8) view.getLayoutParams()).m1740g()) == null || !zyVarM1740g.qrj(this, view, iM3159e))) {
                m1738r(view, iM3159e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        zy zyVarM1740g;
        int childCount = getChildCount();
        boolean zKja0 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f7l8 f7l8Var = (f7l8) childAt.getLayoutParams();
                if (f7l8Var.ld6(0) && (zyVarM1740g = f7l8Var.m1740g()) != null) {
                    zKja0 |= zyVarM1740g.kja0(this, childAt, view, f2, f3, z2);
                }
            }
        }
        if (zKja0) {
            lvui(1);
        }
        return zKja0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedPreFling(View view, float f2, float f3) {
        zy zyVarM1740g;
        int childCount = getChildCount();
        boolean zMo1752h = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f7l8 f7l8Var = (f7l8) childAt.getLayoutParams();
                if (f7l8Var.ld6(0) && (zyVarM1740g = f7l8Var.m1740g()) != null) {
                    zMo1752h |= zyVarM1740g.mo1752h(this, childAt, view, f2, f3);
                }
            }
        }
        return zMo1752h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        mo419h(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        fu4(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        ld6(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f3081q;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            zy zyVarM1740g = jk(childAt).m1740g();
            if (id != -1 && zyVarM1740g != null && (parcelable2 = sparseArray.get(id)) != null) {
                zyVarM1740g.mo1760z(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableO1t;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            zy zyVarM1740g = ((f7l8) childAt.getLayoutParams()).m1740g();
            if (id != -1 && zyVarM1740g != null && (parcelableO1t = zyVarM1740g.o1t(this, childAt)) != null) {
                sparseArray.append(id, parcelableO1t);
            }
        }
        savedState.f3081q = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo426z(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onStopNestedScroll(View view) {
        kja0(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r3
      0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3078t
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.ncyb(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f3078t
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f7l8 r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f7l8) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$zy r6 = r6.m1740g()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f3078t
            boolean r6 = r6.a9(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.f3078t
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m1726c(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    public void m1737p(@lvui View view) {
        List listF7l8 = this.f3075q.f7l8(view);
        if (listF7l8 == null || listF7l8.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < listF7l8.size(); i2++) {
            View view2 = (View) listF7l8.get(i2);
            zy zyVarM1740g = ((f7l8) view2.getLayoutParams()).m1740g();
            if (zyVarM1740g != null) {
                zyVarM1740g.mo1757s(this, view2, view);
            }
        }
    }

    void qrj() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (fti(getChildAt(i2))) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2 != this.f3064f) {
            if (z2) {
                m1735g();
            } else {
                m1734f();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m1738r(@lvui View view, int i2) {
        f7l8 f7l8Var = (f7l8) view.getLayoutParams();
        if (f7l8Var.m1743k()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = f7l8Var.f50023ld6;
        if (view2 != null) {
            d3(view, view2, i2);
            return;
        }
        int i3 = f7l8Var.f3085n;
        if (i3 >= 0) {
            oc(view, i3, i2);
        } else {
            gvn7(view, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        zy zyVarM1740g = ((f7l8) view.getLayoutParams()).m1740g();
        if (zyVarM1740g == null || !zyVarM1740g.fu4(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f3066h) {
            return;
        }
        m1726c(false);
        this.f3066h = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m1728j();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3073o = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@dd Drawable drawable) {
        Drawable drawable2 = this.f3068j;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f3068j = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f3068j.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.zy.qrj(this.f3068j, C0683f.m3159e(this));
                this.f3068j.setVisible(getVisibility() == 0, false);
                this.f3068j.setCallback(this);
            }
            C0683f.h7am(this);
        }
    }

    public void setStatusBarBackgroundColor(@x2 int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(@fn3e int i2) {
        setStatusBarBackground(i2 != 0 ? C0498q.m2259s(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f3068j;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f3068j.setVisible(z2, false);
    }

    void t8r(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            zurt(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3068j;
    }

    public boolean x2(@lvui View view, @lvui View view2) {
        boolean z2 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectM1730n = m1730n();
        t8r(view, view.getParent() != this, rectM1730n);
        Rect rectM1730n2 = m1730n();
        t8r(view2, view2.getParent() != this, rectM1730n2);
        try {
            if (rectM1730n.left <= rectM1730n2.right && rectM1730n.top <= rectM1730n2.bottom && rectM1730n.right >= rectM1730n2.left) {
                if (rectM1730n.bottom >= rectM1730n2.top) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            hyr(rectM1730n);
            hyr(rectM1730n2);
        }
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f7l8 f7l8Var = (f7l8) childAt.getLayoutParams();
                zy zyVarM1740g = f7l8Var.m1740g();
                if (zyVarM1740g != null) {
                    boolean zMo1758t = zyVarM1740g.mo1758t(this, childAt, view, view2, i2, i3);
                    z2 |= zMo1758t;
                    f7l8Var.m1742i(i3, zMo1758t);
                } else {
                    f7l8Var.m1742i(i3, false);
                }
            }
        }
        return z2;
    }

    void zurt(View view, Rect rect) {
        androidx.coordinatorlayout.widget.toq.m1768k(this, view, rect);
    }

    public CoordinatorLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C7620k.k.f94478toq);
    }

    public CoordinatorLayout(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i2);
        this.f3069k = new ArrayList();
        this.f3075q = new C0407k<>();
        this.f3072n = new ArrayList();
        this.f3065g = new ArrayList();
        this.f3077s = new int[2];
        this.f3074p = new int[2];
        this.f3061b = new oc(this);
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7620k.p.f94538f7l8, 0, C7620k.s.f44045y);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7620k.p.f94538f7l8, i2, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 == 0) {
                saveAttributeDataForStyleable(context, C7620k.p.f94538f7l8, attributeSet, typedArrayObtainStyledAttributes, 0, C7620k.s.f44045y);
            } else {
                saveAttributeDataForStyleable(context, C7620k.p.f94538f7l8, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C7620k.p.f44032y, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3080z = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.f3080z.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.f3080z[i3] = (int) (r12[i3] * f2);
            }
        }
        this.f3068j = typedArrayObtainStyledAttributes.getDrawable(C7620k.p.f44030s);
        typedArrayObtainStyledAttributes.recycle();
        m1728j();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0401g());
        if (C0683f.m3157c(this) == 0) {
            C0683f.o05(this, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.1
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

        /* JADX INFO: renamed from: q */
        SparseArray<Parcelable> f3081q;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i2 = parcel.readInt();
            int[] iArr = new int[i2];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f3081q = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.f3081q.append(iArr[i3], parcelableArray[i3]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            SparseArray<Parcelable> sparseArray = this.f3081q;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f3081q.keyAt(i3);
                parcelableArr[i3] = this.f3081q.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f7l8 extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        final Rect f50019cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f50020f7l8;

        /* JADX INFO: renamed from: g */
        int f3082g;

        /* JADX INFO: renamed from: h */
        private boolean f3083h;

        /* JADX INFO: renamed from: k */
        zy f3084k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        Object f50021ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private boolean f50022kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        View f50023ld6;

        /* JADX INFO: renamed from: n */
        public int f3085n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private boolean f50024n7h;

        /* JADX INFO: renamed from: p */
        int f3086p;

        /* JADX INFO: renamed from: q */
        public int f3087q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private boolean f50025qrj;

        /* JADX INFO: renamed from: s */
        int f3088s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f50026toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        View f50027x2;

        /* JADX INFO: renamed from: y */
        public int f3089y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f50028zy;

        public f7l8(int i2, int i3) {
            super(i2, i3);
            this.f50026toq = false;
            this.f50028zy = 0;
            this.f3087q = 0;
            this.f3085n = -1;
            this.f3082g = -1;
            this.f50020f7l8 = 0;
            this.f3089y = 0;
            this.f50019cdj = new Rect();
        }

        private boolean fn3e(View view, int i2) {
            int iM3432q = androidx.core.view.qrj.m3432q(((f7l8) view.getLayoutParams()).f50020f7l8, i2);
            return iM3432q != 0 && (androidx.core.view.qrj.m3432q(this.f3089y, i2) & iM3432q) == iM3432q;
        }

        private void kja0(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f3082g);
            this.f50023ld6 = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f50027x2 = null;
                    this.f50023ld6 = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3082g) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f50027x2 = null;
                this.f50023ld6 = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f50027x2 = null;
                    this.f50023ld6 = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f50027x2 = viewFindViewById;
        }

        private boolean zurt(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f50023ld6.getId() != this.f3082g) {
                return false;
            }
            View view2 = this.f50023ld6;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f50027x2 = null;
                    this.f50023ld6 = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f50027x2 = view2;
            return true;
        }

        public void cdj(@dd zy zyVar) {
            zy zyVar2 = this.f3084k;
            if (zyVar2 != zyVar) {
                if (zyVar2 != null) {
                    zyVar2.ld6();
                }
                this.f3084k = zyVar;
                this.f50021ki = null;
                this.f50026toq = true;
                if (zyVar != null) {
                    zyVar.mo1759y(this);
                }
            }
        }

        boolean f7l8() {
            return this.f3083h;
        }

        @dd
        /* JADX INFO: renamed from: g */
        public zy m1740g() {
            return this.f3084k;
        }

        /* JADX INFO: renamed from: h */
        public void m1741h(@InterfaceC7843t int i2) {
            m1747s();
            this.f3082g = i2;
        }

        /* JADX INFO: renamed from: i */
        void m1742i(int i2, boolean z2) {
            if (i2 == 0) {
                this.f50024n7h = z2;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f50022kja0 = z2;
            }
        }

        /* JADX INFO: renamed from: k */
        boolean m1743k() {
            return this.f50023ld6 == null && this.f3082g != -1;
        }

        void ki(boolean z2) {
            this.f3083h = z2;
        }

        boolean ld6(int i2) {
            if (i2 == 0) {
                return this.f50024n7h;
            }
            if (i2 != 1) {
                return false;
            }
            return this.f50022kja0;
        }

        @InterfaceC7843t
        /* JADX INFO: renamed from: n */
        public int m1744n() {
            return this.f3082g;
        }

        void n7h() {
            this.f50025qrj = false;
        }

        /* JADX INFO: renamed from: p */
        boolean m1745p(CoordinatorLayout coordinatorLayout, View view) {
            boolean z2 = this.f50025qrj;
            if (z2) {
                return true;
            }
            zy zyVar = this.f3084k;
            boolean zM1754k = (zyVar != null ? zyVar.m1754k(coordinatorLayout, view) : false) | z2;
            this.f50025qrj = zM1754k;
            return zM1754k;
        }

        /* JADX INFO: renamed from: q */
        View m1746q(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3082g == -1) {
                this.f50027x2 = null;
                this.f50023ld6 = null;
                return null;
            }
            if (this.f50023ld6 == null || !zurt(view, coordinatorLayout)) {
                kja0(view, coordinatorLayout);
            }
            return this.f50023ld6;
        }

        void qrj(int i2) {
            m1742i(i2, false);
        }

        /* JADX INFO: renamed from: s */
        void m1747s() {
            this.f50027x2 = null;
            this.f50023ld6 = null;
        }

        void t8r(Rect rect) {
            this.f50019cdj.set(rect);
        }

        boolean toq(CoordinatorLayout coordinatorLayout, View view, View view2) {
            zy zyVar;
            return view2 == this.f50027x2 || fn3e(view2, C0683f.m3159e(coordinatorLayout)) || ((zyVar = this.f3084k) != null && zyVar.mo1751g(coordinatorLayout, view, view2));
        }

        void x2() {
            this.f3083h = false;
        }

        /* JADX INFO: renamed from: y */
        Rect m1748y() {
            return this.f50019cdj;
        }

        boolean zy() {
            if (this.f3084k == null) {
                this.f50025qrj = false;
            }
            return this.f50025qrj;
        }

        f7l8(@lvui Context context, @dd AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f50026toq = false;
            this.f50028zy = 0;
            this.f3087q = 0;
            this.f3085n = -1;
            this.f3082g = -1;
            this.f50020f7l8 = 0;
            this.f3089y = 0;
            this.f50019cdj = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7620k.p.f44027p);
            this.f50028zy = typedArrayObtainStyledAttributes.getInteger(C7620k.p.f94548ld6, 0);
            this.f3082g = typedArrayObtainStyledAttributes.getResourceId(C7620k.p.f94564x2, -1);
            this.f3087q = typedArrayObtainStyledAttributes.getInteger(C7620k.p.f94558qrj, 0);
            this.f3085n = typedArrayObtainStyledAttributes.getInteger(C7620k.p.f94533cdj, -1);
            this.f50020f7l8 = typedArrayObtainStyledAttributes.getInt(C7620k.p.f44022h, 0);
            this.f3089y = typedArrayObtainStyledAttributes.getInt(C7620k.p.f94547kja0, 0);
            int i2 = C7620k.p.f94553n7h;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
            this.f50026toq = zHasValue;
            if (zHasValue) {
                this.f3084k = CoordinatorLayout.x9kr(context, attributeSet, typedArrayObtainStyledAttributes.getString(i2));
            }
            typedArrayObtainStyledAttributes.recycle();
            zy zyVar = this.f3084k;
            if (zyVar != null) {
                zyVar.mo1759y(this);
            }
        }

        public f7l8(f7l8 f7l8Var) {
            super((ViewGroup.MarginLayoutParams) f7l8Var);
            this.f50026toq = false;
            this.f50028zy = 0;
            this.f3087q = 0;
            this.f3085n = -1;
            this.f3082g = -1;
            this.f50020f7l8 = 0;
            this.f3089y = 0;
            this.f50019cdj = new Rect();
        }

        public f7l8(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f50026toq = false;
            this.f50028zy = 0;
            this.f3087q = 0;
            this.f3085n = -1;
            this.f3082g = -1;
            this.f50020f7l8 = 0;
            this.f3089y = 0;
            this.f50019cdj = new Rect();
        }

        public f7l8(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f50026toq = false;
            this.f50028zy = 0;
            this.f3087q = 0;
            this.f3085n = -1;
            this.f3082g = -1;
            this.f50020f7l8 = 0;
            this.f3089y = 0;
            this.f50019cdj = new Rect();
        }
    }
}
