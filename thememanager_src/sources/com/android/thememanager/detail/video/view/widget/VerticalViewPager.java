package com.android.thememanager.detail.video.view.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0498q;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.ki;
import androidx.core.view.eqxt;
import androidx.core.view.tfm;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.AbstractC1288k;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yz.C7794k;
import zy.dd;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class VerticalViewPager extends ViewGroup {
    private static final int d1cy = 1;
    private static final boolean dy = false;
    public static final int ei = 0;
    private static final int k6e = 600;
    private static final int mjvl = 400;
    private static final int ndjo = 0;
    private static final int q7k9 = 2;
    private static final int s8y = 16;
    private static final boolean sk1t = false;
    private static final int th6 = -1;
    private static final int vb6 = 1;
    public static final int wra = 1;
    private static final int xk5 = 25;
    private static final int xqx = 2;
    private static final String zmmu = "VerticalViewPager";
    public static final int zsl = 2;

    /* JADX INFO: renamed from: a */
    private boolean f11525a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f58053ab;
    private EdgeEffect ac;
    private EdgeEffect ad;
    private int aj;
    private boolean am;
    private float an;
    private InterfaceC2026p ar;
    private int as;
    private boolean ax;
    private boolean ay;
    private int az;

    /* JADX INFO: renamed from: b */
    private int f11526b;
    private int ba;
    private int bb;
    private List<InterfaceC2028s> bc;
    private int bd;
    private boolean be;
    private int bg;
    private VelocityTracker bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f58054bo;
    private float bp;
    private long bq;
    private List<InterfaceC2026p> bs;
    private ld6 bu;
    private float bv;

    /* JADX INFO: renamed from: c */
    private int f11527c;

    /* JADX INFO: renamed from: d */
    private boolean f11528d;

    /* JADX INFO: renamed from: e */
    private int f11529e;

    /* JADX INFO: renamed from: f */
    private Drawable f11530f;

    /* JADX INFO: renamed from: g */
    private final Rect f11531g;

    /* JADX INFO: renamed from: h */
    private Parcelable f11532h;

    /* JADX INFO: renamed from: i */
    private ClassLoader f11533i;
    private float id;
    private int in;

    /* JADX INFO: renamed from: j */
    private float f11534j;

    /* JADX INFO: renamed from: k */
    private int f11535k;
    private InterfaceC2026p k0;

    /* JADX INFO: renamed from: l */
    private int f11536l;

    /* JADX INFO: renamed from: m */
    private int f11537m;

    /* JADX INFO: renamed from: n */
    private final C2023g f11538n;

    /* JADX INFO: renamed from: o */
    private float f11539o;

    /* JADX INFO: renamed from: p */
    private int f11540p;

    /* JADX INFO: renamed from: q */
    private final ArrayList<C2023g> f11541q;

    /* JADX INFO: renamed from: r */
    private x2 f11542r;

    /* JADX INFO: renamed from: s */
    int f11543s;

    /* JADX INFO: renamed from: t */
    private boolean f11544t;
    private final Runnable tgs;
    private int tlhn;

    /* JADX INFO: renamed from: u */
    private boolean f11545u;

    /* JADX INFO: renamed from: v */
    private boolean f11546v;

    /* JADX INFO: renamed from: w */
    private int f11547w;
    private ArrayList<View> w97r;

    /* JADX INFO: renamed from: x */
    private boolean f11548x;

    /* JADX INFO: renamed from: y */
    AbstractC1288k f11549y;
    private int yl25;

    /* JADX INFO: renamed from: z */
    private Scroller f11550z;
    static final int[] hp = {R.attr.layout_gravity};
    private static final Comparator<C2023g> cw14 = new C2024k();
    private static final Interpolator xy8 = new toq();
    private static final n7h zr5t = new n7h();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.android.thememanager.detail.video.view.widget.VerticalViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel in, ClassLoader loader) {
                return new SavedState(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };

        /* JADX INFO: renamed from: g */
        ClassLoader f11551g;

        /* JADX INFO: renamed from: n */
        Parcelable f11552n;

        /* JADX INFO: renamed from: q */
        int f11553q;

        public SavedState(@lvui Parcelable superState) {
            super(superState);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f11553q + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f11553q);
            out.writeParcelable(this.f11552n, flags);
        }

        SavedState(Parcel in, ClassLoader loader) {
            super(in, loader);
            loader = loader == null ? getClass().getClassLoader() : loader;
            this.f11553q = in.readInt();
            this.f11552n = in.readParcelable(loader);
            this.f11551g = loader;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.VerticalViewPager$g */
    static class C2023g {

        /* JADX INFO: renamed from: k */
        Object f11558k;

        /* JADX INFO: renamed from: n */
        float f11559n;

        /* JADX INFO: renamed from: q */
        float f11560q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f58057toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f58058zy;

        C2023g() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.VerticalViewPager$k */
    class C2024k implements Comparator<C2023g> {
        C2024k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(C2023g lhs, C2023g rhs) {
            return lhs.f58057toq - rhs.f58057toq;
        }
    }

    public interface ld6 {
        void transformPage(@lvui View page, float position);
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.VerticalViewPager$n */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC2025n {
    }

    static class n7h implements Comparator<View> {
        n7h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(View lhs, View rhs) {
            f7l8 f7l8Var = (f7l8) lhs.getLayoutParams();
            f7l8 f7l8Var2 = (f7l8) rhs.getLayoutParams();
            boolean z2 = f7l8Var.f11555k;
            return z2 != f7l8Var2.f11555k ? z2 ? 1 : -1 : f7l8Var.f11556n - f7l8Var2.f11556n;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.VerticalViewPager$p */
    public interface InterfaceC2026p {
        /* JADX INFO: renamed from: k */
        void mo7879k(int state);

        void toq(int position);

        void zy(int position, float positionOffset, int positionOffsetPixels);
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.VerticalViewPager$q */
    class C2027q implements eqxt {

        /* JADX INFO: renamed from: k */
        private final Rect f11561k = new Rect();

        C2027q() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(final View v2, final tfm originalInsets) {
            tfm tfmVarBz2 = C0683f.bz2(v2, originalInsets);
            if (tfmVarBz2.wvg()) {
                return tfmVarBz2;
            }
            Rect rect = this.f11561k;
            rect.left = tfmVarBz2.m3467h();
            rect.top = tfmVarBz2.ki();
            rect.right = tfmVarBz2.cdj();
            rect.bottom = tfmVarBz2.kja0();
            int childCount = VerticalViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                tfm tfmVarM3162h = C0683f.m3162h(VerticalViewPager.this.getChildAt(i2), tfmVarBz2);
                rect.left = Math.min(tfmVarM3162h.m3467h(), rect.left);
                rect.top = Math.min(tfmVarM3162h.ki(), rect.top);
                rect.right = Math.min(tfmVarM3162h.cdj(), rect.right);
                rect.bottom = Math.min(tfmVarM3162h.kja0(), rect.bottom);
            }
            return tfmVarBz2.jk(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static class qrj implements InterfaceC2026p {
        @Override // com.android.thememanager.detail.video.view.widget.VerticalViewPager.InterfaceC2026p
        /* JADX INFO: renamed from: k */
        public void mo7879k(int state) {
        }

        @Override // com.android.thememanager.detail.video.view.widget.VerticalViewPager.InterfaceC2026p
        public void toq(int position) {
        }

        @Override // com.android.thememanager.detail.video.view.widget.VerticalViewPager.InterfaceC2026p
        public void zy(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.VerticalViewPager$s */
    public interface InterfaceC2028s {
        /* JADX INFO: renamed from: k */
        void m7880k(@lvui VerticalViewPager viewPager, @dd AbstractC1288k oldAdapter, @dd AbstractC1288k newAdapter);
    }

    class toq implements Interpolator {
        toq() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float t2) {
            float f2 = t2 - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    private class x2 extends DataSetObserver {
        x2() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VerticalViewPager.this.m7870p();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VerticalViewPager.this.m7870p();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.VerticalViewPager$y */
    class C2029y extends C0701k {
        C2029y() {
        }

        /* JADX INFO: renamed from: k */
        private boolean m7881k() {
            AbstractC1288k abstractC1288k = VerticalViewPager.this.f11549y;
            return abstractC1288k != null && abstractC1288k.mo5575n() > 1;
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            AbstractC1288k abstractC1288k;
            super.onInitializeAccessibilityEvent(host, event);
            event.setClassName(VerticalViewPager.class.getName());
            event.setScrollable(m7881k());
            if (event.getEventType() != 4096 || (abstractC1288k = VerticalViewPager.this.f11549y) == null) {
                return;
            }
            event.setItemCount(abstractC1288k.mo5575n());
            event.setFromIndex(VerticalViewPager.this.f11543s);
            event.setToIndex(VerticalViewPager.this.f11543s);
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View host, ki info) {
            super.onInitializeAccessibilityNodeInfo(host, info);
            info.sok(VerticalViewPager.class.getName());
            info.lh(m7881k());
            if (VerticalViewPager.this.canScrollHorizontally(1)) {
                info.m3052k(4096);
            }
            if (VerticalViewPager.this.canScrollHorizontally(-1)) {
                info.m3052k(8192);
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            if (super.performAccessibilityAction(host, action, args)) {
                return true;
            }
            if (action == 4096) {
                if (!VerticalViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                VerticalViewPager verticalViewPager = VerticalViewPager.this;
                verticalViewPager.setCurrentItem(verticalViewPager.f11543s + 1);
                return true;
            }
            if (action != 8192 || !VerticalViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
            verticalViewPager2.setCurrentItem(verticalViewPager2.f11543s - 1);
            return true;
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.oc();
        }
    }

    public VerticalViewPager(@lvui Context context) {
        super(context);
        this.f11541q = new ArrayList<>();
        this.f11538n = new C2023g();
        this.f11531g = new Rect();
        this.f11540p = -1;
        this.f11532h = null;
        this.f11533i = null;
        this.f11534j = -3.4028235E38f;
        this.f11539o = Float.MAX_VALUE;
        this.f58054bo = 1;
        this.in = -1;
        this.am = true;
        this.ay = false;
        this.tgs = new zy();
        this.yl25 = 0;
        o1t();
    }

    private void a9(MotionEvent ev) {
        int actionIndex = ev.getActionIndex();
        if (ev.getPointerId(actionIndex) == this.in) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.bp = ev.getX(i2);
            this.in = ev.getPointerId(i2);
            VelocityTracker velocityTracker = this.bl;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void cdj() {
        this.f11546v = false;
        this.f11528d = false;
        VelocityTracker velocityTracker = this.bl;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.bl = null;
        }
    }

    private void d2ok(int width, int oldWidth, int margin, int oldMargin) {
        if (oldWidth > 0 && !this.f11541q.isEmpty()) {
            if (!this.f11550z.isFinished()) {
                this.f11550z.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((oldWidth - getPaddingLeft()) - getPaddingRight()) + oldMargin)) * (((width - getPaddingLeft()) - getPaddingRight()) + margin)), getScrollY());
                return;
            }
        }
        C2023g c2023gM7875z = m7875z(this.f11543s);
        int iMin = (int) ((c2023gM7875z != null ? Math.min(c2023gM7875z.f11559n, this.f11539o) : 0.0f) * ((width - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m7864s(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private boolean d3(float x3) {
        boolean z2;
        boolean z3;
        float f2 = this.bp - x3;
        this.bp = x3;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f11534j * clientWidth;
        float f4 = this.f11539o * clientWidth;
        boolean z5 = false;
        C2023g c2023g = this.f11541q.get(0);
        ArrayList<C2023g> arrayList = this.f11541q;
        C2023g c2023g2 = arrayList.get(arrayList.size() - 1);
        if (c2023g.f58057toq != 0) {
            f3 = c2023g.f11559n * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (c2023g2.f58057toq != this.f11549y.mo5575n() - 1) {
            f4 = c2023g2.f11559n * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f3) {
            if (z2) {
                this.ac.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z5 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z3) {
                this.ad.onPull(Math.abs(scrollX - f4) / clientWidth);
                z5 = true;
            }
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.bp += scrollX - i2;
        scrollTo(i2, getScrollY());
        gvn7(i2);
        return z5;
    }

    private Rect fn3e(Rect outRect, View child) {
        if (outRect == null) {
            outRect = new Rect();
        }
        if (child == null) {
            outRect.set(0, 0, 0, 0);
            return outRect;
        }
        outRect.left = child.getLeft();
        outRect.right = child.getRight();
        outRect.top = child.getTop();
        outRect.bottom = child.getBottom();
        ViewParent parent = child.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            outRect.left += viewGroup.getLeft();
            outRect.right += viewGroup.getRight();
            outRect.top += viewGroup.getTop();
            outRect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return outRect;
    }

    private C2023g fu4() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.f11536l / clientWidth : 0.0f;
        C2023g c2023g = null;
        int i3 = 0;
        int i4 = -1;
        boolean z2 = true;
        float f4 = 0.0f;
        while (i3 < this.f11541q.size()) {
            C2023g c2023g2 = this.f11541q.get(i3);
            if (!z2 && c2023g2.f58057toq != (i2 = i4 + 1)) {
                c2023g2 = this.f11538n;
                c2023g2.f11559n = f2 + f4 + f3;
                c2023g2.f58057toq = i2;
                c2023g2.f11560q = this.f11549y.m5577y(i2);
                i3--;
            }
            f2 = c2023g2.f11559n;
            float f5 = c2023g2.f11560q + f2 + f3;
            if (!z2 && scrollX < f2) {
                return c2023g;
            }
            if (scrollX < f5 || i3 == this.f11541q.size() - 1) {
                return c2023g2;
            }
            i4 = c2023g2.f58057toq;
            f4 = c2023g2.f11560q;
            i3++;
            z2 = false;
            c2023g = c2023g2;
        }
        return c2023g;
    }

    /* JADX INFO: renamed from: g */
    private void m7861g(C2023g curItem, int curIndex, C2023g oldCurInfo) {
        int i2;
        int i3;
        C2023g c2023g;
        C2023g c2023g2;
        int iMo5575n = this.f11549y.mo5575n();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.f11536l / clientWidth : 0.0f;
        if (oldCurInfo != null) {
            int i4 = oldCurInfo.f58057toq;
            int i5 = curItem.f58057toq;
            if (i4 < i5) {
                float fM5577y = oldCurInfo.f11559n + oldCurInfo.f11560q + f2;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= curItem.f58057toq && i7 < this.f11541q.size()) {
                    C2023g c2023g3 = this.f11541q.get(i7);
                    while (true) {
                        c2023g2 = c2023g3;
                        if (i6 <= c2023g2.f58057toq || i7 >= this.f11541q.size() - 1) {
                            break;
                        }
                        i7++;
                        c2023g3 = this.f11541q.get(i7);
                    }
                    while (i6 < c2023g2.f58057toq) {
                        fM5577y += this.f11549y.m5577y(i6) + f2;
                        i6++;
                    }
                    c2023g2.f11559n = fM5577y;
                    fM5577y += c2023g2.f11560q + f2;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f11541q.size() - 1;
                float fM5577y2 = oldCurInfo.f11559n;
                while (true) {
                    i4--;
                    if (i4 < curItem.f58057toq || size < 0) {
                        break;
                    }
                    C2023g c2023g4 = this.f11541q.get(size);
                    while (true) {
                        c2023g = c2023g4;
                        if (i4 >= c2023g.f58057toq || size <= 0) {
                            break;
                        }
                        size--;
                        c2023g4 = this.f11541q.get(size);
                    }
                    while (i4 > c2023g.f58057toq) {
                        fM5577y2 -= this.f11549y.m5577y(i4) + f2;
                        i4--;
                    }
                    fM5577y2 -= c2023g.f11560q + f2;
                    c2023g.f11559n = fM5577y2;
                }
            }
        }
        int size2 = this.f11541q.size();
        float fM5577y3 = curItem.f11559n;
        int i8 = curItem.f58057toq;
        int i9 = i8 - 1;
        this.f11534j = i8 == 0 ? fM5577y3 : -3.4028235E38f;
        int i10 = iMo5575n - 1;
        this.f11539o = i8 == i10 ? (curItem.f11560q + fM5577y3) - 1.0f : Float.MAX_VALUE;
        int i11 = curIndex - 1;
        while (i11 >= 0) {
            C2023g c2023g5 = this.f11541q.get(i11);
            while (true) {
                i3 = c2023g5.f58057toq;
                if (i9 <= i3) {
                    break;
                }
                fM5577y3 -= this.f11549y.m5577y(i9) + f2;
                i9--;
            }
            fM5577y3 -= c2023g5.f11560q + f2;
            c2023g5.f11559n = fM5577y3;
            if (i3 == 0) {
                this.f11534j = fM5577y3;
            }
            i11--;
            i9--;
        }
        float fM5577y4 = curItem.f11559n + curItem.f11560q + f2;
        int i12 = curItem.f58057toq + 1;
        int i13 = curIndex + 1;
        while (i13 < size2) {
            C2023g c2023g6 = this.f11541q.get(i13);
            while (true) {
                i2 = c2023g6.f58057toq;
                if (i12 >= i2) {
                    break;
                }
                fM5577y4 += this.f11549y.m5577y(i12) + f2;
                i12++;
            }
            if (i2 == i10) {
                this.f11539o = (c2023g6.f11560q + fM5577y4) - 1.0f;
            }
            c2023g6.f11559n = fM5577y4;
            fM5577y4 += c2023g6.f11560q + f2;
            i13++;
            i12++;
        }
        this.ay = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean gvn7(int xpos) {
        if (this.f11541q.size() == 0) {
            if (this.am) {
                return false;
            }
            this.be = false;
            jk(0, 0.0f, 0);
            if (this.be) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C2023g c2023gFu4 = fu4();
        int clientWidth = getClientWidth();
        int i2 = this.f11536l;
        int i3 = clientWidth + i2;
        float f2 = clientWidth;
        int i4 = c2023gFu4.f58057toq;
        float f3 = ((xpos / f2) - c2023gFu4.f11559n) / (c2023gFu4.f11560q + (i2 / f2));
        this.be = false;
        jk(i4, f3, (int) (i3 * f3));
        if (this.be) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: h */
    private void m7862h(boolean enable) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(enable ? this.bd : 0, null);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m7863l(int item, boolean smoothScroll, int velocity, boolean dispatchSelected) {
        C2023g c2023gM7875z = m7875z(item);
        int clientWidth = c2023gM7875z != null ? (int) (getClientWidth() * Math.max(this.f11534j, Math.min(c2023gM7875z.f11559n, this.f11539o))) : 0;
        if (smoothScroll) {
            lrht(clientWidth, 0, velocity);
            if (dispatchSelected) {
                qrj(item);
                return;
            }
            return;
        }
        if (dispatchSelected) {
            qrj(item);
        }
        m7864s(false);
        scrollTo(clientWidth, 0);
        gvn7(clientWidth);
    }

    private int ld6(int currentPage, float pageOffset, int velocity, int deltaX) {
        double d2 = ((double) this.as) * 0.05d;
        int iMax = (Math.abs(deltaX) <= this.az || ((double) Math.abs(velocity)) <= d2) ? ((int) (0.6f + pageOffset)) + currentPage : deltaX > 0 ? currentPage - 1 : currentPage + 1;
        if (this.f11541q.size() > 0) {
            C2023g c2023g = this.f11541q.get(0);
            ArrayList<C2023g> arrayList = this.f11541q;
            iMax = Math.max(c2023g.f58057toq, Math.min(iMax, arrayList.get(arrayList.size() - 1).f58057toq));
        }
        if (bf2.toq.m5812n()) {
            C7794k.toq(zmmu, String.format("current page %s, page offset %s, velocity %s, deltaX %s, fling distance %s, mini velocity %s, target page %s", Integer.valueOf(currentPage), Float.valueOf(pageOffset), Integer.valueOf(velocity), Integer.valueOf(deltaX), Integer.valueOf(this.az), Double.valueOf(d2), Integer.valueOf(iMax)));
        }
        return iMax;
    }

    private void lvui() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((f7l8) getChildAt(i2).getLayoutParams()).f11555k) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private boolean mcp(float x3, float dx) {
        return (x3 < ((float) this.f58053ab) && dx > 0.0f) || (x3 > ((float) (getWidth() - this.f58053ab)) && dx < 0.0f);
    }

    private void n7h(int state) {
        InterfaceC2026p interfaceC2026p = this.k0;
        if (interfaceC2026p != null) {
            interfaceC2026p.mo7879k(state);
        }
        List<InterfaceC2026p> list = this.bs;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2026p interfaceC2026p2 = this.bs.get(i2);
                if (interfaceC2026p2 != null) {
                    interfaceC2026p2.mo7879k(state);
                }
            }
        }
        InterfaceC2026p interfaceC2026p3 = this.ar;
        if (interfaceC2026p3 != null) {
            interfaceC2026p3.mo7879k(state);
        }
    }

    private boolean ncyb() {
        this.in = -1;
        cdj();
        this.ac.onRelease();
        this.ad.onRelease();
        return this.ac.isFinished() || this.ad.isFinished();
    }

    private void qrj(int position) {
        InterfaceC2026p interfaceC2026p = this.k0;
        if (interfaceC2026p != null) {
            interfaceC2026p.toq(position);
        }
        List<InterfaceC2026p> list = this.bs;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2026p interfaceC2026p2 = this.bs.get(i2);
                if (interfaceC2026p2 != null) {
                    interfaceC2026p2.toq(position);
                }
            }
        }
        InterfaceC2026p interfaceC2026p3 = this.ar;
        if (interfaceC2026p3 != null) {
            interfaceC2026p3.toq(position);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m7864s(boolean postEvents) {
        boolean z2 = this.yl25 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f11550z.isFinished()) {
                this.f11550z.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f11550z.getCurrX();
                int currY = this.f11550z.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        gvn7(currX);
                    }
                }
            }
        }
        this.f11545u = false;
        for (int i2 = 0; i2 < this.f11541q.size(); i2++) {
            C2023g c2023g = this.f11541q.get(i2);
            if (c2023g.f58058zy) {
                c2023g.f58058zy = false;
                z2 = true;
            }
        }
        if (z2) {
            if (postEvents) {
                C0683f.mbx(this, this.tgs);
            } else {
                this.tgs.run();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean enabled) {
        if (this.f11548x != enabled) {
            this.f11548x = enabled;
        }
    }

    private void uv6() {
        if (this.tlhn != 0) {
            ArrayList<View> arrayList = this.w97r;
            if (arrayList == null) {
                this.w97r = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.w97r.add(getChildAt(i2));
            }
            Collections.sort(this.w97r, zr5t);
        }
    }

    private MotionEvent vyq(MotionEvent ev) {
        float width = getWidth();
        float height = getHeight();
        ev.setLocation((ev.getY() / height) * width, (ev.getX() / width) * height);
        return ev;
    }

    private static boolean wvg(@lvui View view) {
        return view.getClass().getAnnotation(InterfaceC2025n.class) != null;
    }

    private void x2(int position, float offset, int offsetPixels) {
        InterfaceC2026p interfaceC2026p = this.k0;
        if (interfaceC2026p != null) {
            interfaceC2026p.zy(position, offset, offsetPixels);
        }
        List<InterfaceC2026p> list = this.bs;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2026p interfaceC2026p2 = this.bs.get(i2);
                if (interfaceC2026p2 != null) {
                    interfaceC2026p2.zy(position, offset, offsetPixels);
                }
            }
        }
        InterfaceC2026p interfaceC2026p3 = this.ar;
        if (interfaceC2026p3 != null) {
            interfaceC2026p3.zy(position, offset, offsetPixels);
        }
    }

    private void x9kr(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        C2023g c2023gNi7;
        int size = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() == 0 && (c2023gNi7 = ni7(childAt)) != null && c2023gNi7.f58057toq == this.f11543s) {
                    childAt.addFocusables(views, direction, focusableMode);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == views.size()) && isFocusable()) {
            if ((focusableMode & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            views.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> views) {
        C2023g c2023gNi7;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c2023gNi7 = ni7(childAt)) != null && c2023gNi7.f58057toq == this.f11543s) {
                childAt.addTouchables(views);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (!checkLayoutParams(params)) {
            params = generateLayoutParams(params);
        }
        f7l8 f7l8Var = (f7l8) params;
        boolean zWvg = f7l8Var.f11555k | wvg(child);
        f7l8Var.f11555k = zWvg;
        if (!this.f11525a) {
            super.addView(child, index, params);
        } else {
            if (zWvg) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            f7l8Var.f11557q = true;
            addViewInLayout(child, index, params);
        }
    }

    /* JADX INFO: renamed from: c */
    void m7865c(int x3, int y3) {
        lrht(x3, y3, 0);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        if (this.f11549y == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return direction < 0 ? scrollX > ((int) (((float) clientWidth) * this.f11534j)) : direction > 0 && scrollX < ((int) (((float) clientWidth) * this.f11539o));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof f7l8) && super.checkLayoutParams(p2);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f11544t = true;
        if (this.f11550z.isFinished() || !this.f11550z.computeScrollOffset()) {
            m7864s(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f11550z.getCurrX();
        int currY = this.f11550z.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!gvn7(currX)) {
                this.f11550z.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0683f.h7am(this);
    }

    public void dd(@lvui InterfaceC2026p listener) {
        List<InterfaceC2026p> list = this.bs;
        if (list != null) {
            list.remove(listener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || t8r(event);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        C2023g c2023gNi7;
        if (event.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c2023gNi7 = ni7(childAt)) != null && c2023gNi7.f58057toq == this.f11543s && childAt.dispatchPopulateAccessibilityEvent(event)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC1288k abstractC1288k;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC1288k = this.f11549y) != null && abstractC1288k.mo5575n() > 1)) {
            if (!this.ac.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f11534j * width);
                this.ac.setSize(height, width);
                zDraw = false | this.ac.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.ad.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f11539o + 1.0f)) * width2);
                this.ad.setSize(height2, width2);
                zDraw |= this.ad.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.ac.finish();
            this.ad.finish();
        }
        if (zDraw) {
            C0683f.h7am(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11530f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[PHI: r7 r10 r15
      0x00f7: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void eqxt(int r18) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.detail.video.view.widget.VerticalViewPager.eqxt(int):void");
    }

    /* JADX INFO: renamed from: f */
    InterfaceC2026p m7866f(InterfaceC2026p listener) {
        InterfaceC2026p interfaceC2026p = this.ar;
        this.ar = listener;
        return interfaceC2026p;
    }

    protected boolean f7l8(View v2, boolean checkV, int dx, int x3, int y3) {
        int i2;
        if (v2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v2;
            int scrollX = v2.getScrollX();
            int scrollY = v2.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i3 = x3 + scrollX;
                if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && (i2 = y3 + scrollY) >= childAt.getTop() && i2 < childAt.getBottom() && f7l8(childAt, true, dx, i3 - childAt.getLeft(), i2 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return checkV && v2.canScrollHorizontally(-dx);
    }

    boolean fti() {
        int i2 = this.f11543s;
        if (i2 <= 0) {
            return false;
        }
        setCurrentItem(i2 - 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f7l8();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return generateDefaultLayoutParams();
    }

    @dd
    public AbstractC1288k getAdapter() {
        return this.f11549y;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int childCount, int i2) {
        if (this.tlhn == 2) {
            i2 = (childCount - 1) - i2;
        }
        return ((f7l8) this.w97r.get(i2).getLayoutParams()).f11554g;
    }

    public int getCurrentItem() {
        return this.f11543s;
    }

    public int getOffscreenPageLimit() {
        return this.f58054bo;
    }

    public int getPageMargin() {
        return this.f11536l;
    }

    void hyr(int item, boolean smoothScroll, boolean always, int velocity) {
        AbstractC1288k abstractC1288k = this.f11549y;
        if (abstractC1288k == null || abstractC1288k.mo5575n() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!always && this.f11543s == item && this.f11541q.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (item < 0) {
            item = 0;
        } else if (item >= this.f11549y.mo5575n()) {
            item = this.f11549y.mo5575n() - 1;
        }
        int i2 = this.f58054bo;
        int i3 = this.f11543s;
        if (item > i3 + i2 || item < i3 - i2) {
            for (int i4 = 0; i4 < this.f11541q.size(); i4++) {
                this.f11541q.get(i4).f58058zy = true;
            }
        }
        boolean z2 = this.f11543s != item;
        if (!this.am) {
            eqxt(item);
            m7863l(item, smoothScroll, velocity, z2);
        } else {
            this.f11543s = item;
            if (z2) {
                qrj(item);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7867i(float xOffset) {
        if (!this.ax) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f11549y == null) {
            return;
        }
        this.bp += xOffset;
        float scrollX = getScrollX() - xOffset;
        float clientWidth = getClientWidth();
        float f2 = this.f11534j * clientWidth;
        float f3 = this.f11539o * clientWidth;
        C2023g c2023g = this.f11541q.get(0);
        C2023g c2023g2 = this.f11541q.get(r4.size() - 1);
        if (c2023g.f58057toq != 0) {
            f2 = c2023g.f11559n * clientWidth;
        }
        if (c2023g2.f58057toq != this.f11549y.mo5575n() - 1) {
            f3 = c2023g2.f11559n * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i2 = (int) scrollX;
        this.bp += scrollX - i2;
        scrollTo(i2, getScrollY());
        gvn7(i2);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.bq, SystemClock.uptimeMillis(), 2, this.bp, 0.0f, 0);
        this.bl.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @zy.InterfaceC7842s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void jk(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.aj
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.android.thememanager.detail.video.view.widget.VerticalViewPager$f7l8 r9 = (com.android.thememanager.detail.video.view.widget.VerticalViewPager.f7l8) r9
            boolean r10 = r9.f11555k
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f58055toq
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.x2(r13, r14, r15)
            com.android.thememanager.detail.video.view.widget.VerticalViewPager$ld6 r13 = r12.bu
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.android.thememanager.detail.video.view.widget.VerticalViewPager$f7l8 r0 = (com.android.thememanager.detail.video.view.widget.VerticalViewPager.f7l8) r0
            boolean r0 = r0.f11555k
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.android.thememanager.detail.video.view.widget.VerticalViewPager$ld6 r3 = r12.bu
            r3.transformPage(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.be = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.detail.video.view.widget.VerticalViewPager.jk(int, float, int):void");
    }

    boolean jp0y() {
        AbstractC1288k abstractC1288k = this.f11549y;
        if (abstractC1288k == null || this.f11543s >= abstractC1288k.mo5575n() - 1) {
            return false;
        }
        setCurrentItem(this.f11543s + 1, true);
        return true;
    }

    /* JADX INFO: renamed from: k */
    C2023g m7868k(int position, int index) {
        C2023g c2023g = new C2023g();
        c2023g.f58057toq = position;
        c2023g.f11558k = this.f11549y.mo4276p(this, position);
        c2023g.f11560q = this.f11549y.m5577y(position);
        if (index < 0 || index >= this.f11541q.size()) {
            this.f11541q.add(c2023g);
        } else {
            this.f11541q.add(index, c2023g);
        }
        return c2023g;
    }

    public void ki() {
        if (!this.ax) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f11549y != null) {
            VelocityTracker velocityTracker = this.bl;
            velocityTracker.computeCurrentVelocity(1000, this.bg);
            int xVelocity = (int) velocityTracker.getXVelocity(this.in);
            this.f11545u = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C2023g c2023gFu4 = fu4();
            hyr(ld6(c2023gFu4.f58057toq, ((scrollX / clientWidth) - c2023gFu4.f11559n) / c2023gFu4.f11560q, xVelocity, (int) (this.bp - this.an)), true, true, xVelocity);
        }
        cdj();
        this.ax = false;
    }

    float kja0(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    void lrht(int x3, int y3, int velocity) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f11550z;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f11544t ? this.f11550z.getCurrX() : this.f11550z.getStartX();
            this.f11550z.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i2 = scrollX;
        int scrollY = getScrollY();
        int i3 = x3 - i2;
        int i4 = y3 - scrollY;
        if (i3 == 0 && i4 == 0) {
            m7864s(false);
            oc();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i5 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i5;
        float fKja0 = f3 + (kja0(Math.min(1.0f, (Math.abs(i3) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(velocity);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fKja0 / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / ((f2 * this.f11549y.m5577y(this.f11543s)) + this.f11536l)) + 1.0f) * 100.0f), 600);
        this.f11544t = false;
        this.f11550z.startScroll(i2, scrollY, i3, i4, iMin);
        C0683f.h7am(this);
    }

    /* JADX INFO: renamed from: n */
    public boolean m7869n() {
        if (this.f11546v) {
            return false;
        }
        this.ax = true;
        setScrollState(1);
        this.bp = 0.0f;
        this.an = 0.0f;
        VelocityTracker velocityTracker = this.bl;
        if (velocityTracker == null) {
            this.bl = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.bl.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.bq = jUptimeMillis;
        return true;
    }

    void n5r1(int item, boolean smoothScroll, boolean always) {
        hyr(item, smoothScroll, always, 0);
    }

    C2023g ni7(View child) {
        for (int i2 = 0; i2 < this.f11541q.size(); i2++) {
            C2023g c2023g = this.f11541q.get(i2);
            if (this.f11549y.ld6(child, c2023g.f11558k)) {
                return c2023g;
            }
        }
        return null;
    }

    void o1t() {
        setPageTransformer(false, new C2030k());
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f11550z = new Scroller(context, xy8);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.bb = viewConfiguration.getScaledPagingTouchSlop();
        this.as = (int) (400.0f * f2);
        this.bg = viewConfiguration.getScaledMaximumFlingVelocity();
        this.ac = new EdgeEffect(context);
        this.ad = new EdgeEffect(context);
        this.az = (int) (25.0f * f2);
        this.ba = (int) (2.0f * f2);
        this.f11547w = (int) (f2 * 16.0f);
        C0683f.zwy(this, new C2029y());
        if (C0683f.m3157c(this) == 0) {
            C0683f.o05(this, 1);
        }
        C0683f.kx3(this, new C2027q());
    }

    void oc() {
        eqxt(this.f11543s);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.am = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.tgs);
        Scroller scroller = this.f11550z;
        if (scroller != null && !scroller.isFinished()) {
            this.f11550z.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f11536l <= 0 || this.f11530f == null || this.f11541q.size() <= 0 || this.f11549y == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f11536l / width;
        int i3 = 0;
        C2023g c2023g = this.f11541q.get(0);
        float f5 = c2023g.f11559n;
        int size = this.f11541q.size();
        int i4 = c2023g.f58057toq;
        int i5 = this.f11541q.get(size - 1).f58057toq;
        while (i4 < i5) {
            while (true) {
                i2 = c2023g.f58057toq;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                c2023g = this.f11541q.get(i3);
            }
            if (i4 == i2) {
                float f6 = c2023g.f11559n;
                float f7 = c2023g.f11560q;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float fM5577y = this.f11549y.m5577y(i4);
                f2 = (f5 + fM5577y) * width;
                f5 += fM5577y + f4;
            }
            if (this.f11536l + f2 > scrollX) {
                f3 = f4;
                this.f11530f.setBounds(Math.round(f2), this.f11527c, Math.round(this.f11536l + f2), this.f11529e);
                this.f11530f.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        float x3 = ev.getX();
        float y3 = ev.getY();
        vyq(ev);
        int action = ev.getAction() & 255;
        if (action == 3 || action == 1) {
            ncyb();
            return false;
        }
        if (action != 0) {
            if (this.f11546v) {
                return true;
            }
            if (this.f11528d) {
                return false;
            }
        }
        if (action == 0) {
            float x4 = ev.getX();
            this.an = x4;
            this.bp = x4;
            float y4 = ev.getY();
            this.id = y4;
            this.bv = y4;
            this.in = ev.getPointerId(0);
            this.f11528d = false;
            this.f11544t = true;
            this.f11550z.computeScrollOffset();
            if (this.yl25 != 2 || Math.abs(this.f11550z.getFinalX() - this.f11550z.getCurrX()) <= this.ba) {
                m7864s(false);
                this.f11546v = false;
            } else {
                this.f11550z.abortAnimation();
                this.f11545u = false;
                oc();
                this.f11546v = true;
                x9kr(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.in;
            if (i2 != -1) {
                int iFindPointerIndex = ev.findPointerIndex(i2);
                float x5 = ev.getX(iFindPointerIndex);
                float f2 = x5 - this.bp;
                float fAbs = Math.abs(f2);
                float y5 = ev.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y5 - this.id) * 0.2f;
                if (f2 != 0.0f && mcp(this.bp, f2)) {
                    this.bp = x5;
                    this.bv = y5;
                    this.f11528d = true;
                    return false;
                }
                int i3 = this.bb;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.f11546v = true;
                    x9kr(true);
                    setScrollState(1);
                    this.bp = f2 > 0.0f ? this.an + this.bb : this.an - this.bb;
                    this.bv = y5;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.f11528d = true;
                }
                if (this.f11546v && d3(x5)) {
                    C0683f.h7am(this);
                }
            }
        } else if (action == 6) {
            a9(ev);
        }
        if (this.bl == null) {
            this.bl = VelocityTracker.obtain();
        }
        this.bl.addMovement(ev);
        ev.setLocation(x3, y3);
        return this.f11546v;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.detail.video.view.widget.VerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        f7l8 f7l8Var;
        f7l8 f7l8Var2;
        int i2;
        setMeasuredDimension(View.getDefaultSize(0, widthMeasureSpec), View.getDefaultSize(0, heightMeasureSpec));
        int measuredWidth = getMeasuredWidth();
        this.f58053ab = Math.min(measuredWidth / 10, this.f11547w);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            int i4 = 1073741824;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && (f7l8Var2 = (f7l8) childAt.getLayoutParams()) != null && f7l8Var2.f11555k) {
                int i5 = f7l8Var2.f58055toq;
                int i6 = i5 & 7;
                int i7 = i5 & 112;
                boolean z3 = i7 == 48 || i7 == 80;
                if (i6 != 3 && i6 != 5) {
                    z2 = false;
                }
                int i8 = Integer.MIN_VALUE;
                if (z3) {
                    i2 = Integer.MIN_VALUE;
                    i8 = 1073741824;
                } else {
                    i2 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i9 = ((ViewGroup.LayoutParams) f7l8Var2).width;
                if (i9 != -2) {
                    if (i9 == -1) {
                        i9 = paddingLeft;
                    }
                    i8 = 1073741824;
                } else {
                    i9 = paddingLeft;
                }
                int i10 = ((ViewGroup.LayoutParams) f7l8Var2).height;
                if (i10 == -2) {
                    i10 = measuredHeight;
                    i4 = i2;
                } else if (i10 == -1) {
                    i10 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, i8), View.MeasureSpec.makeMeasureSpec(i10, i4));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i3++;
        }
        this.f11537m = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f11526b = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f11525a = true;
        oc();
        this.f11525a = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((f7l8Var = (f7l8) childAt2.getLayoutParams()) == null || !f7l8Var.f11555k)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * f7l8Var.f58056zy), 1073741824), this.f11526b);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        int i2;
        int i3;
        C2023g c2023gNi7;
        int childCount = getChildCount();
        int i4 = -1;
        if ((direction & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c2023gNi7 = ni7(childAt)) != null && c2023gNi7.f58057toq == this.f11543s && childAt.requestFocus(direction, previouslyFocusedRect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        AbstractC1288k abstractC1288k = this.f11549y;
        if (abstractC1288k != null) {
            abstractC1288k.n7h(savedState.f11552n, savedState.f11551g);
            n5r1(savedState.f11553q, false, true);
        } else {
            this.f11540p = savedState.f11553q;
            this.f11532h = savedState.f11552n;
            this.f11533i = savedState.f11551g;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11553q = this.f11543s;
        AbstractC1288k abstractC1288k = this.f11549y;
        if (abstractC1288k != null) {
            savedState.f11552n = abstractC1288k.kja0();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        if (w2 != oldw) {
            int i2 = this.f11536l;
            d2ok(w2, oldw, i2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.detail.video.view.widget.VerticalViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    void m7870p() {
        int iMo5575n = this.f11549y.mo5575n();
        this.f11535k = iMo5575n;
        boolean z2 = this.f11541q.size() < (this.f58054bo * 2) + 1 && this.f11541q.size() < iMo5575n;
        int iMax = this.f11543s;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f11541q.size()) {
            C2023g c2023g = this.f11541q.get(i2);
            int iMo5572g = this.f11549y.mo5572g(c2023g.f11558k);
            if (iMo5572g != -1) {
                if (iMo5572g == -2) {
                    this.f11541q.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f11549y.mo4275i(this);
                        z3 = true;
                    }
                    this.f11549y.toq(this, c2023g.f58057toq, c2023g.f11558k);
                    int i3 = this.f11543s;
                    if (i3 == c2023g.f58057toq) {
                        iMax = Math.max(0, Math.min(i3, iMo5575n - 1));
                    }
                } else {
                    int i4 = c2023g.f58057toq;
                    if (i4 != iMo5572g) {
                        if (i4 == this.f11543s) {
                            iMax = iMo5572g;
                        }
                        c2023g.f58057toq = iMo5572g;
                    }
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f11549y.mo4277q(this);
        }
        Collections.sort(this.f11541q, cw14);
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                f7l8 f7l8Var = (f7l8) getChildAt(i5).getLayoutParams();
                if (!f7l8Var.f11555k) {
                    f7l8Var.f58056zy = 0.0f;
                }
            }
            n5r1(iMax, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m7871q(int direction) {
        boolean z2;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zFti = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z2 = false;
                    break;
                }
                if (parent == this) {
                    z2 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e(zmmu, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, direction);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (direction == 17) {
                zRequestFocus = (viewFindFocus == null || fn3e(this.f11531g, viewFindNextFocus).left < fn3e(this.f11531g, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : fti();
            } else if (direction == 66) {
                zRequestFocus = (viewFindFocus == null || fn3e(this.f11531g, viewFindNextFocus).left > fn3e(this.f11531g, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : jp0y();
            }
            zFti = zRequestFocus;
        } else if (direction == 17 || direction == 1) {
            zFti = fti();
        } else if (direction == 66 || direction == 2) {
            zFti = jp0y();
        }
        if (zFti) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(direction));
        }
        return zFti;
    }

    /* JADX INFO: renamed from: r */
    public void m7872r(@lvui InterfaceC2028s listener) {
        List<InterfaceC2028s> list = this.bc;
        if (list != null) {
            list.remove(listener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f11525a) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@dd AbstractC1288k adapter) {
        AbstractC1288k abstractC1288k = this.f11549y;
        if (abstractC1288k != null) {
            abstractC1288k.fn3e(this.f11542r);
            this.f11549y.mo4275i(this);
            for (int i2 = 0; i2 < this.f11541q.size(); i2++) {
                C2023g c2023g = this.f11541q.get(i2);
                this.f11549y.toq(this, c2023g.f58057toq, c2023g.f11558k);
            }
            this.f11549y.mo4277q(this);
            this.f11541q.clear();
            lvui();
            this.f11543s = 0;
            scrollTo(0, 0);
        }
        AbstractC1288k abstractC1288k2 = this.f11549y;
        this.f11549y = adapter;
        this.f11535k = 0;
        if (adapter != null) {
            if (this.f11542r == null) {
                this.f11542r = new x2();
            }
            this.f11549y.qrj(this.f11542r);
            this.f11545u = false;
            boolean z2 = this.am;
            this.am = true;
            this.f11535k = this.f11549y.mo5575n();
            if (this.f11540p >= 0) {
                this.f11549y.n7h(this.f11532h, this.f11533i);
                n5r1(this.f11540p, false, true);
                this.f11540p = -1;
                this.f11532h = null;
                this.f11533i = null;
            } else if (z2) {
                requestLayout();
            } else {
                oc();
            }
        }
        List<InterfaceC2028s> list = this.bc;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.bc.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.bc.get(i3).m7880k(this, abstractC1288k2, adapter);
        }
    }

    public void setCurrentItem(int item) {
        this.f11545u = false;
        n5r1(item, !this.am, false);
    }

    public void setOffscreenPageLimit(int limit) {
        if (limit < 1) {
            Log.w(zmmu, "Requested offscreen page limit " + limit + " too small; defaulting to 1");
            limit = 1;
        }
        if (limit != this.f58054bo) {
            this.f58054bo = limit;
            oc();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC2026p listener) {
        this.k0 = listener;
    }

    public void setPageMargin(int marginPixels) {
        int i2 = this.f11536l;
        this.f11536l = marginPixels;
        int width = getWidth();
        d2ok(width, width, marginPixels, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@dd Drawable d2) {
        this.f11530f = d2;
        if (d2 != null) {
            refreshDrawableState();
        }
        setWillNotDraw(d2 == null);
        invalidate();
    }

    public void setPageTransformer(boolean reverseDrawingOrder, @dd ld6 transformer) {
        setPageTransformer(reverseDrawingOrder, transformer, 2);
    }

    void setScrollState(int newState) {
        if (this.yl25 == newState) {
            return;
        }
        this.yl25 = newState;
        if (this.bu != null) {
            m7862h(newState != 0);
        }
        n7h(newState);
    }

    /* JADX INFO: renamed from: t */
    public boolean m7873t() {
        return this.ax;
    }

    public boolean t8r(@lvui KeyEvent event) {
        if (event.getAction() == 0) {
            int keyCode = event.getKeyCode();
            if (keyCode == 21) {
                return event.hasModifiers(2) ? fti() : m7871q(17);
            }
            if (keyCode == 22) {
                return event.hasModifiers(2) ? jp0y() : m7871q(66);
            }
            if (keyCode == 61) {
                if (event.hasNoModifiers()) {
                    return m7871q(2);
                }
                if (event.hasModifiers(1)) {
                    return m7871q(1);
                }
            }
        }
        return false;
    }

    public void toq(@lvui InterfaceC2028s listener) {
        if (this.bc == null) {
            this.bc = new ArrayList();
        }
        this.bc.add(listener);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f11530f;
    }

    /* JADX INFO: renamed from: y */
    public void m7874y() {
        List<InterfaceC2026p> list = this.bs;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: z */
    C2023g m7875z(int position) {
        for (int i2 = 0; i2 < this.f11541q.size(); i2++) {
            C2023g c2023g = this.f11541q.get(i2);
            if (c2023g.f58057toq == position) {
                return c2023g;
            }
        }
        return null;
    }

    C2023g zurt(View child) {
        while (true) {
            Object parent = child.getParent();
            if (parent == this) {
                return ni7(child);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            child = (View) parent;
        }
    }

    public void zy(@lvui InterfaceC2026p listener) {
        if (this.bs == null) {
            this.bs = new ArrayList();
        }
        this.bs.add(listener);
    }

    public static class f7l8 extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: g */
        int f11554g;

        /* JADX INFO: renamed from: k */
        public boolean f11555k;

        /* JADX INFO: renamed from: n */
        int f11556n;

        /* JADX INFO: renamed from: q */
        boolean f11557q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f58055toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f58056zy;

        public f7l8() {
            super(-1, -1);
            this.f58056zy = 0.0f;
        }

        public f7l8(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.f58056zy = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, VerticalViewPager.hp);
            this.f58055toq = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new f7l8(getContext(), attrs);
    }

    public void setPageTransformer(boolean reverseDrawingOrder, @dd ld6 transformer, int pageLayerType) {
        boolean z2 = transformer != null;
        boolean z3 = z2 != (this.bu != null);
        this.bu = transformer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.tlhn = reverseDrawingOrder ? 2 : 1;
            this.bd = pageLayerType;
        } else {
            this.tlhn = 0;
        }
        if (z3) {
            oc();
        }
    }

    public void setCurrentItem(int item, boolean smoothScroll) {
        this.f11545u = false;
        n5r1(item, smoothScroll, false);
    }

    public void setPageMarginDrawable(@fn3e int resId) {
        setPageMarginDrawable(C0498q.m2259s(getContext(), resId));
    }

    public VerticalViewPager(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f11541q = new ArrayList<>();
        this.f11538n = new C2023g();
        this.f11531g = new Rect();
        this.f11540p = -1;
        this.f11532h = null;
        this.f11533i = null;
        this.f11534j = -3.4028235E38f;
        this.f11539o = Float.MAX_VALUE;
        this.f58054bo = 1;
        this.in = -1;
        this.am = true;
        this.ay = false;
        this.tgs = new zy();
        this.yl25 = 0;
        o1t();
    }
}
