package androidx.viewpager.widget;

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
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import zy.InterfaceC7833l;
import zy.dd;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
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
    private static final String zmmu = "ViewPager";
    public static final int zsl = 2;

    /* JADX INFO: renamed from: a */
    private boolean f7005a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f53685ab;
    private EdgeEffect ac;
    private EdgeEffect ad;
    private int aj;
    private boolean am;
    private float an;
    private InterfaceC1284p ar;
    private int as;
    private boolean ax;
    private boolean ay;
    private int az;

    /* JADX INFO: renamed from: b */
    private int f7006b;
    private int ba;
    private int bb;
    private List<InterfaceC1286s> bc;
    private int bd;
    private boolean be;
    private int bg;
    private VelocityTracker bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f53686bo;
    private float bp;
    private long bq;
    private List<InterfaceC1284p> bs;
    private ld6 bu;
    private float bv;

    /* JADX INFO: renamed from: c */
    private int f7007c;

    /* JADX INFO: renamed from: d */
    private boolean f7008d;

    /* JADX INFO: renamed from: e */
    private int f7009e;

    /* JADX INFO: renamed from: f */
    private Drawable f7010f;

    /* JADX INFO: renamed from: g */
    private final Rect f7011g;

    /* JADX INFO: renamed from: h */
    private Parcelable f7012h;

    /* JADX INFO: renamed from: i */
    private ClassLoader f7013i;
    private float id;
    private int in;

    /* JADX INFO: renamed from: j */
    private float f7014j;

    /* JADX INFO: renamed from: k */
    private int f7015k;
    private InterfaceC1284p k0;

    /* JADX INFO: renamed from: l */
    private int f7016l;

    /* JADX INFO: renamed from: m */
    private int f7017m;

    /* JADX INFO: renamed from: n */
    private final C1281g f7018n;

    /* JADX INFO: renamed from: o */
    private float f7019o;

    /* JADX INFO: renamed from: p */
    private int f7020p;

    /* JADX INFO: renamed from: q */
    private final ArrayList<C1281g> f7021q;

    /* JADX INFO: renamed from: r */
    private x2 f7022r;

    /* JADX INFO: renamed from: s */
    int f7023s;

    /* JADX INFO: renamed from: t */
    private boolean f7024t;
    private final Runnable tgs;
    private int tlhn;

    /* JADX INFO: renamed from: u */
    private boolean f7025u;

    /* JADX INFO: renamed from: v */
    private boolean f7026v;

    /* JADX INFO: renamed from: w */
    private int f7027w;
    private ArrayList<View> w97r;

    /* JADX INFO: renamed from: x */
    private boolean f7028x;

    /* JADX INFO: renamed from: y */
    AbstractC1288k f7029y;
    private int yl25;

    /* JADX INFO: renamed from: z */
    private Scroller f7030z;
    static final int[] hp = {R.attr.layout_gravity};
    private static final Comparator<C1281g> cw14 = new C1282k();
    private static final Interpolator xy8 = new toq();
    private static final n7h zr5t = new n7h();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
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
        ClassLoader f7031g;

        /* JADX INFO: renamed from: n */
        Parcelable f7032n;

        /* JADX INFO: renamed from: q */
        int f7033q;

        public SavedState(@lvui Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f7033q + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f7033q);
            parcel.writeParcelable(this.f7032n, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f7033q = parcel.readInt();
            this.f7032n = parcel.readParcelable(classLoader);
            this.f7031g = classLoader;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$g */
    static class C1281g {

        /* JADX INFO: renamed from: k */
        Object f7038k;

        /* JADX INFO: renamed from: n */
        float f7039n;

        /* JADX INFO: renamed from: q */
        float f7040q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f53689toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f53690zy;

        C1281g() {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$k */
    static class C1282k implements Comparator<C1281g> {
        C1282k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(C1281g c1281g, C1281g c1281g2) {
            return c1281g.f53689toq - c1281g2.f53689toq;
        }
    }

    public interface ld6 {
        void transformPage(@lvui View view, float f2);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$n */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1283n {
    }

    static class n7h implements Comparator<View> {
        n7h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            f7l8 f7l8Var = (f7l8) view.getLayoutParams();
            f7l8 f7l8Var2 = (f7l8) view2.getLayoutParams();
            boolean z2 = f7l8Var.f7035k;
            return z2 != f7l8Var2.f7035k ? z2 ? 1 : -1 : f7l8Var.f7036n - f7l8Var2.f7036n;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$p */
    public interface InterfaceC1284p {
        /* JADX INFO: renamed from: k */
        void mo5550k(int i2);

        void toq(int i2);

        void zy(int i2, float f2, @InterfaceC7833l int i3);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$q */
    class C1285q implements eqxt {

        /* JADX INFO: renamed from: k */
        private final Rect f7041k = new Rect();

        C1285q() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, tfm tfmVar) {
            tfm tfmVarBz2 = C0683f.bz2(view, tfmVar);
            if (tfmVarBz2.wvg()) {
                return tfmVarBz2;
            }
            Rect rect = this.f7041k;
            rect.left = tfmVarBz2.m3467h();
            rect.top = tfmVarBz2.ki();
            rect.right = tfmVarBz2.cdj();
            rect.bottom = tfmVarBz2.kja0();
            int childCount = ViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                tfm tfmVarM3162h = C0683f.m3162h(ViewPager.this.getChildAt(i2), tfmVarBz2);
                rect.left = Math.min(tfmVarM3162h.m3467h(), rect.left);
                rect.top = Math.min(tfmVarM3162h.ki(), rect.top);
                rect.right = Math.min(tfmVarM3162h.cdj(), rect.right);
                rect.bottom = Math.min(tfmVarM3162h.kja0(), rect.bottom);
            }
            return tfmVarBz2.jk(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static class qrj implements InterfaceC1284p {
        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int i2, float f2, int i3) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$s */
    public interface InterfaceC1286s {
        /* JADX INFO: renamed from: q */
        void mo5551q(@lvui ViewPager viewPager, @dd AbstractC1288k abstractC1288k, @dd AbstractC1288k abstractC1288k2);
    }

    static class toq implements Interpolator {
        toq() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    private class x2 extends DataSetObserver {
        x2() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m5561p();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m5561p();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$y */
    class C1287y extends C0701k {
        C1287y() {
        }

        /* JADX INFO: renamed from: k */
        private boolean m5570k() {
            AbstractC1288k abstractC1288k = ViewPager.this.f7029y;
            return abstractC1288k != null && abstractC1288k.mo5575n() > 1;
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC1288k abstractC1288k;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m5570k());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC1288k = ViewPager.this.f7029y) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC1288k.mo5575n());
            accessibilityEvent.setFromIndex(ViewPager.this.f7023s);
            accessibilityEvent.setToIndex(ViewPager.this.f7023s);
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.sok(ViewPager.class.getName());
            kiVar.lh(m5570k());
            if (ViewPager.this.canScrollHorizontally(1)) {
                kiVar.m3052k(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                kiVar.m3052k(8192);
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (super.performAccessibilityAction(view, i2, bundle)) {
                return true;
            }
            if (i2 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f7023s + 1);
                return true;
            }
            if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f7023s - 1);
            return true;
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.oc();
        }
    }

    public ViewPager(@lvui Context context) {
        super(context);
        this.f7021q = new ArrayList<>();
        this.f7018n = new C1281g();
        this.f7011g = new Rect();
        this.f7020p = -1;
        this.f7012h = null;
        this.f7013i = null;
        this.f7014j = -3.4028235E38f;
        this.f7019o = Float.MAX_VALUE;
        this.f53686bo = 1;
        this.in = -1;
        this.am = true;
        this.ay = false;
        this.tgs = new zy();
        this.yl25 = 0;
        o1t();
    }

    private void a9(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.in) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.bp = motionEvent.getX(i2);
            this.in = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.bl;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void cdj() {
        this.f7026v = false;
        this.f7008d = false;
        VelocityTracker velocityTracker = this.bl;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.bl = null;
        }
    }

    private void d2ok(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.f7021q.isEmpty()) {
            if (!this.f7030z.isFinished()) {
                this.f7030z.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        C1281g c1281gM5566z = m5566z(this.f7023s);
        int iMin = (int) ((c1281gM5566z != null ? Math.min(c1281gM5566z.f7039n, this.f7019o) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m5555s(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private boolean d3(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.bp - f2;
        this.bp = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.f7014j * clientWidth;
        float f5 = this.f7019o * clientWidth;
        boolean z5 = false;
        C1281g c1281g = this.f7021q.get(0);
        ArrayList<C1281g> arrayList = this.f7021q;
        C1281g c1281g2 = arrayList.get(arrayList.size() - 1);
        if (c1281g.f53689toq != 0) {
            f4 = c1281g.f7039n * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (c1281g2.f53689toq != this.f7029y.mo5575n() - 1) {
            f5 = c1281g2.f7039n * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.ac.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z5 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.ad.onPull(Math.abs(scrollX - f5) / clientWidth);
                z5 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.bp += scrollX - i2;
        scrollTo(i2, getScrollY());
        gvn7(i2);
        return z5;
    }

    private Rect fn3e(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private C1281g fu4() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.f7016l / clientWidth : 0.0f;
        C1281g c1281g = null;
        int i3 = 0;
        int i4 = -1;
        boolean z2 = true;
        float f4 = 0.0f;
        while (i3 < this.f7021q.size()) {
            C1281g c1281g2 = this.f7021q.get(i3);
            if (!z2 && c1281g2.f53689toq != (i2 = i4 + 1)) {
                c1281g2 = this.f7018n;
                c1281g2.f7039n = f2 + f4 + f3;
                c1281g2.f53689toq = i2;
                c1281g2.f7040q = this.f7029y.m5577y(i2);
                i3--;
            }
            f2 = c1281g2.f7039n;
            float f5 = c1281g2.f7040q + f2 + f3;
            if (!z2 && scrollX < f2) {
                return c1281g;
            }
            if (scrollX < f5 || i3 == this.f7021q.size() - 1) {
                return c1281g2;
            }
            i4 = c1281g2.f53689toq;
            f4 = c1281g2.f7040q;
            i3++;
            z2 = false;
            c1281g = c1281g2;
        }
        return c1281g;
    }

    /* JADX INFO: renamed from: g */
    private void m5552g(C1281g c1281g, int i2, C1281g c1281g2) {
        int i3;
        int i4;
        C1281g c1281g3;
        C1281g c1281g4;
        int iMo5575n = this.f7029y.mo5575n();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.f7016l / clientWidth : 0.0f;
        if (c1281g2 != null) {
            int i5 = c1281g2.f53689toq;
            int i6 = c1281g.f53689toq;
            if (i5 < i6) {
                float fM5577y = c1281g2.f7039n + c1281g2.f7040q + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= c1281g.f53689toq && i8 < this.f7021q.size()) {
                    C1281g c1281g5 = this.f7021q.get(i8);
                    while (true) {
                        c1281g4 = c1281g5;
                        if (i7 <= c1281g4.f53689toq || i8 >= this.f7021q.size() - 1) {
                            break;
                        }
                        i8++;
                        c1281g5 = this.f7021q.get(i8);
                    }
                    while (i7 < c1281g4.f53689toq) {
                        fM5577y += this.f7029y.m5577y(i7) + f2;
                        i7++;
                    }
                    c1281g4.f7039n = fM5577y;
                    fM5577y += c1281g4.f7040q + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f7021q.size() - 1;
                float fM5577y2 = c1281g2.f7039n;
                while (true) {
                    i5--;
                    if (i5 < c1281g.f53689toq || size < 0) {
                        break;
                    }
                    C1281g c1281g6 = this.f7021q.get(size);
                    while (true) {
                        c1281g3 = c1281g6;
                        if (i5 >= c1281g3.f53689toq || size <= 0) {
                            break;
                        }
                        size--;
                        c1281g6 = this.f7021q.get(size);
                    }
                    while (i5 > c1281g3.f53689toq) {
                        fM5577y2 -= this.f7029y.m5577y(i5) + f2;
                        i5--;
                    }
                    fM5577y2 -= c1281g3.f7040q + f2;
                    c1281g3.f7039n = fM5577y2;
                }
            }
        }
        int size2 = this.f7021q.size();
        float fM5577y3 = c1281g.f7039n;
        int i9 = c1281g.f53689toq;
        int i10 = i9 - 1;
        this.f7014j = i9 == 0 ? fM5577y3 : -3.4028235E38f;
        int i11 = iMo5575n - 1;
        this.f7019o = i9 == i11 ? (c1281g.f7040q + fM5577y3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            C1281g c1281g7 = this.f7021q.get(i12);
            while (true) {
                i4 = c1281g7.f53689toq;
                if (i10 <= i4) {
                    break;
                }
                fM5577y3 -= this.f7029y.m5577y(i10) + f2;
                i10--;
            }
            fM5577y3 -= c1281g7.f7040q + f2;
            c1281g7.f7039n = fM5577y3;
            if (i4 == 0) {
                this.f7014j = fM5577y3;
            }
            i12--;
            i10--;
        }
        float fM5577y4 = c1281g.f7039n + c1281g.f7040q + f2;
        int i13 = c1281g.f53689toq + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            C1281g c1281g8 = this.f7021q.get(i14);
            while (true) {
                i3 = c1281g8.f53689toq;
                if (i13 >= i3) {
                    break;
                }
                fM5577y4 += this.f7029y.m5577y(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.f7019o = (c1281g8.f7040q + fM5577y4) - 1.0f;
            }
            c1281g8.f7039n = fM5577y4;
            fM5577y4 += c1281g8.f7040q + f2;
            i14++;
            i13++;
        }
        this.ay = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean gvn7(int i2) {
        if (this.f7021q.size() == 0) {
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
        C1281g c1281gFu4 = fu4();
        int clientWidth = getClientWidth();
        int i3 = this.f7016l;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = c1281gFu4.f53689toq;
        float f3 = ((i2 / f2) - c1281gFu4.f7039n) / (c1281gFu4.f7040q + (i3 / f2));
        this.be = false;
        jk(i5, f3, (int) (i4 * f3));
        if (this.be) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: h */
    private void m5553h(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.bd : 0, null);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m5554l(int i2, boolean z2, int i3, boolean z3) {
        C1281g c1281gM5566z = m5566z(i2);
        int clientWidth = c1281gM5566z != null ? (int) (getClientWidth() * Math.max(this.f7014j, Math.min(c1281gM5566z.f7039n, this.f7019o))) : 0;
        if (z2) {
            lrht(clientWidth, 0, i3);
            if (z3) {
                qrj(i2);
                return;
            }
            return;
        }
        if (z3) {
            qrj(i2);
        }
        m5555s(false);
        scrollTo(clientWidth, 0);
        gvn7(clientWidth);
    }

    private int ld6(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.az || Math.abs(i3) <= this.as) {
            i2 += (int) (f2 + (i2 >= this.f7023s ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f7021q.size() <= 0) {
            return i2;
        }
        return Math.max(this.f7021q.get(0).f53689toq, Math.min(i2, this.f7021q.get(r4.size() - 1).f53689toq));
    }

    private void lvui() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((f7l8) getChildAt(i2).getLayoutParams()).f7035k) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private boolean mcp(float f2, float f3) {
        return (f2 < ((float) this.f53685ab) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.f53685ab)) && f3 < 0.0f);
    }

    private void n7h(int i2) {
        InterfaceC1284p interfaceC1284p = this.k0;
        if (interfaceC1284p != null) {
            interfaceC1284p.mo5550k(i2);
        }
        List<InterfaceC1284p> list = this.bs;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC1284p interfaceC1284p2 = this.bs.get(i3);
                if (interfaceC1284p2 != null) {
                    interfaceC1284p2.mo5550k(i2);
                }
            }
        }
        InterfaceC1284p interfaceC1284p3 = this.ar;
        if (interfaceC1284p3 != null) {
            interfaceC1284p3.mo5550k(i2);
        }
    }

    private boolean ncyb() {
        this.in = -1;
        cdj();
        this.ac.onRelease();
        this.ad.onRelease();
        return this.ac.isFinished() || this.ad.isFinished();
    }

    private void qrj(int i2) {
        InterfaceC1284p interfaceC1284p = this.k0;
        if (interfaceC1284p != null) {
            interfaceC1284p.toq(i2);
        }
        List<InterfaceC1284p> list = this.bs;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC1284p interfaceC1284p2 = this.bs.get(i3);
                if (interfaceC1284p2 != null) {
                    interfaceC1284p2.toq(i2);
                }
            }
        }
        InterfaceC1284p interfaceC1284p3 = this.ar;
        if (interfaceC1284p3 != null) {
            interfaceC1284p3.toq(i2);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m5555s(boolean z2) {
        boolean z3 = this.yl25 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.f7030z.isFinished()) {
                this.f7030z.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f7030z.getCurrX();
                int currY = this.f7030z.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        gvn7(currX);
                    }
                }
            }
        }
        this.f7025u = false;
        for (int i2 = 0; i2 < this.f7021q.size(); i2++) {
            C1281g c1281g = this.f7021q.get(i2);
            if (c1281g.f53690zy) {
                c1281g.f53690zy = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z2) {
                C0683f.mbx(this, this.tgs);
            } else {
                this.tgs.run();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.f7028x != z2) {
            this.f7028x = z2;
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

    private static boolean wvg(@lvui View view) {
        return view.getClass().getAnnotation(InterfaceC1283n.class) != null;
    }

    private void x2(int i2, float f2, int i3) {
        InterfaceC1284p interfaceC1284p = this.k0;
        if (interfaceC1284p != null) {
            interfaceC1284p.zy(i2, f2, i3);
        }
        List<InterfaceC1284p> list = this.bs;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                InterfaceC1284p interfaceC1284p2 = this.bs.get(i4);
                if (interfaceC1284p2 != null) {
                    interfaceC1284p2.zy(i2, f2, i3);
                }
            }
        }
        InterfaceC1284p interfaceC1284p3 = this.ar;
        if (interfaceC1284p3 != null) {
            interfaceC1284p3.zy(i2, f2, i3);
        }
    }

    private void x9kr(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        C1281g c1281gNi7;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (c1281gNi7 = ni7(childAt)) != null && c1281gNi7.f53689toq == this.f7023s) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C1281g c1281gNi7;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c1281gNi7 = ni7(childAt)) != null && c1281gNi7.f53689toq == this.f7023s) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f7l8 f7l8Var = (f7l8) layoutParams;
        boolean zWvg = f7l8Var.f7035k | wvg(view);
        f7l8Var.f7035k = zWvg;
        if (!this.f7005a) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zWvg) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            f7l8Var.f7037q = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    void m5556c(int i2, int i3) {
        lrht(i2, i3, 0);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f7029y == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f7014j)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.f7019o));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f7l8) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f7024t = true;
        if (this.f7030z.isFinished() || !this.f7030z.computeScrollOffset()) {
            m5555s(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f7030z.getCurrX();
        int currY = this.f7030z.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!gvn7(currX)) {
                this.f7030z.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0683f.h7am(this);
    }

    public void dd(@lvui InterfaceC1284p interfaceC1284p) {
        List<InterfaceC1284p> list = this.bs;
        if (list != null) {
            list.remove(interfaceC1284p);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t8r(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1281g c1281gNi7;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c1281gNi7 = ni7(childAt)) != null && c1281gNi7.f53689toq == this.f7023s && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC1288k = this.f7029y) != null && abstractC1288k.mo5575n() > 1)) {
            if (!this.ac.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f7014j * width);
                this.ac.setSize(height, width);
                zDraw = false | this.ac.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.ad.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f7019o + 1.0f)) * width2);
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
        Drawable drawable = this.f7010f;
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
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.eqxt(int):void");
    }

    /* JADX INFO: renamed from: f */
    InterfaceC1284p m5557f(InterfaceC1284p interfaceC1284p) {
        InterfaceC1284p interfaceC1284p2 = this.ar;
        this.ar = interfaceC1284p;
        return interfaceC1284p2;
    }

    protected boolean f7l8(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && f7l8(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    boolean fti() {
        int i2 = this.f7023s;
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
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @dd
    public AbstractC1288k getAdapter() {
        return this.f7029y;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.tlhn == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((f7l8) this.w97r.get(i3).getLayoutParams()).f7034g;
    }

    public int getCurrentItem() {
        return this.f7023s;
    }

    public int getOffscreenPageLimit() {
        return this.f53686bo;
    }

    public int getPageMargin() {
        return this.f7016l;
    }

    void hyr(int i2, boolean z2, boolean z3, int i3) {
        AbstractC1288k abstractC1288k = this.f7029y;
        if (abstractC1288k == null || abstractC1288k.mo5575n() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z3 && this.f7023s == i2 && this.f7021q.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f7029y.mo5575n()) {
            i2 = this.f7029y.mo5575n() - 1;
        }
        int i4 = this.f53686bo;
        int i5 = this.f7023s;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f7021q.size(); i6++) {
                this.f7021q.get(i6).f53690zy = true;
            }
        }
        boolean z5 = this.f7023s != i2;
        if (!this.am) {
            eqxt(i2);
            m5554l(i2, z2, i3, z5);
        } else {
            this.f7023s = i2;
            if (z5) {
                qrj(i2);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m5558i(float f2) {
        if (!this.ax) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f7029y == null) {
            return;
        }
        this.bp += f2;
        float scrollX = getScrollX() - f2;
        float clientWidth = getClientWidth();
        float f3 = this.f7014j * clientWidth;
        float f4 = this.f7019o * clientWidth;
        C1281g c1281g = this.f7021q.get(0);
        C1281g c1281g2 = this.f7021q.get(r4.size() - 1);
        if (c1281g.f53689toq != 0) {
            f3 = c1281g.f7039n * clientWidth;
        }
        if (c1281g2.f53689toq != this.f7029y.mo5575n() - 1) {
            f4 = c1281g2.f7039n * clientWidth;
        }
        if (scrollX < f3) {
            scrollX = f3;
        } else if (scrollX > f4) {
            scrollX = f4;
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
            androidx.viewpager.widget.ViewPager$f7l8 r9 = (androidx.viewpager.widget.ViewPager.f7l8) r9
            boolean r10 = r9.f7035k
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f53687toq
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
            androidx.viewpager.widget.ViewPager$ld6 r13 = r12.bu
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f7l8 r0 = (androidx.viewpager.widget.ViewPager.f7l8) r0
            boolean r0 = r0.f7035k
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$ld6 r3 = r12.bu
            r3.transformPage(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.be = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.jk(int, float, int):void");
    }

    boolean jp0y() {
        AbstractC1288k abstractC1288k = this.f7029y;
        if (abstractC1288k == null || this.f7023s >= abstractC1288k.mo5575n() - 1) {
            return false;
        }
        setCurrentItem(this.f7023s + 1, true);
        return true;
    }

    /* JADX INFO: renamed from: k */
    C1281g m5559k(int i2, int i3) {
        C1281g c1281g = new C1281g();
        c1281g.f53689toq = i2;
        c1281g.f7038k = this.f7029y.mo4276p(this, i2);
        c1281g.f7040q = this.f7029y.m5577y(i2);
        if (i3 < 0 || i3 >= this.f7021q.size()) {
            this.f7021q.add(c1281g);
        } else {
            this.f7021q.add(i3, c1281g);
        }
        return c1281g;
    }

    public void ki() {
        if (!this.ax) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f7029y != null) {
            VelocityTracker velocityTracker = this.bl;
            velocityTracker.computeCurrentVelocity(1000, this.bg);
            int xVelocity = (int) velocityTracker.getXVelocity(this.in);
            this.f7025u = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1281g c1281gFu4 = fu4();
            hyr(ld6(c1281gFu4.f53689toq, ((scrollX / clientWidth) - c1281gFu4.f7039n) / c1281gFu4.f7040q, xVelocity, (int) (this.bp - this.an)), true, true, xVelocity);
        }
        cdj();
        this.ax = false;
    }

    float kja0(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    void lrht(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f7030z;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f7024t ? this.f7030z.getCurrX() : this.f7030z.getStartX();
            this.f7030z.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m5555s(false);
            oc();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fKja0 = f3 + (kja0(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(i4);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fKja0 / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.f7029y.m5577y(this.f7023s)) + this.f7016l)) + 1.0f) * 100.0f), 600);
        this.f7024t = false;
        this.f7030z.startScroll(i5, scrollY, i6, i7, iMin);
        C0683f.h7am(this);
    }

    /* JADX INFO: renamed from: n */
    public boolean m5560n() {
        if (this.f7026v) {
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

    void n5r1(int i2, boolean z2, boolean z3) {
        hyr(i2, z2, z3, 0);
    }

    C1281g ni7(View view) {
        for (int i2 = 0; i2 < this.f7021q.size(); i2++) {
            C1281g c1281g = this.f7021q.get(i2);
            if (this.f7029y.ld6(view, c1281g.f7038k)) {
                return c1281g;
            }
        }
        return null;
    }

    void o1t() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f7030z = new Scroller(context, xy8);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.bb = viewConfiguration.getScaledPagingTouchSlop();
        this.as = (int) (400.0f * f2);
        this.bg = viewConfiguration.getScaledMaximumFlingVelocity();
        this.ac = new EdgeEffect(context);
        this.ad = new EdgeEffect(context);
        this.az = (int) (25.0f * f2);
        this.ba = (int) (2.0f * f2);
        this.f7027w = (int) (f2 * 16.0f);
        C0683f.zwy(this, new C1287y());
        if (C0683f.m3157c(this) == 0) {
            C0683f.o05(this, 1);
        }
        C0683f.kx3(this, new C1285q());
    }

    void oc() {
        eqxt(this.f7023s);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.am = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.tgs);
        Scroller scroller = this.f7030z;
        if (scroller != null && !scroller.isFinished()) {
            this.f7030z.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f7016l <= 0 || this.f7010f == null || this.f7021q.size() <= 0 || this.f7029y == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f7016l / width;
        int i3 = 0;
        C1281g c1281g = this.f7021q.get(0);
        float f5 = c1281g.f7039n;
        int size = this.f7021q.size();
        int i4 = c1281g.f53689toq;
        int i5 = this.f7021q.get(size - 1).f53689toq;
        while (i4 < i5) {
            while (true) {
                i2 = c1281g.f53689toq;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                c1281g = this.f7021q.get(i3);
            }
            if (i4 == i2) {
                float f6 = c1281g.f7039n;
                float f7 = c1281g.f7040q;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float fM5577y = this.f7029y.m5577y(i4);
                f2 = (f5 + fM5577y) * width;
                f5 += fM5577y + f4;
            }
            if (this.f7016l + f2 > scrollX) {
                f3 = f4;
                this.f7010f.setBounds(Math.round(f2), this.f7007c, Math.round(this.f7016l + f2), this.f7009e);
                this.f7010f.draw(canvas);
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
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            ncyb();
            return false;
        }
        if (action != 0) {
            if (this.f7026v) {
                return true;
            }
            if (this.f7008d) {
                return false;
            }
        }
        if (action == 0) {
            float x3 = motionEvent.getX();
            this.an = x3;
            this.bp = x3;
            float y3 = motionEvent.getY();
            this.id = y3;
            this.bv = y3;
            this.in = motionEvent.getPointerId(0);
            this.f7008d = false;
            this.f7024t = true;
            this.f7030z.computeScrollOffset();
            if (this.yl25 != 2 || Math.abs(this.f7030z.getFinalX() - this.f7030z.getCurrX()) <= this.ba) {
                m5555s(false);
                this.f7026v = false;
            } else {
                this.f7030z.abortAnimation();
                this.f7025u = false;
                oc();
                this.f7026v = true;
                x9kr(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.in;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float f2 = x4 - this.bp;
                float fAbs = Math.abs(f2);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y4 - this.id);
                if (f2 != 0.0f && !mcp(this.bp, f2) && f7l8(this, false, (int) f2, (int) x4, (int) y4)) {
                    this.bp = x4;
                    this.bv = y4;
                    this.f7008d = true;
                    return false;
                }
                int i3 = this.bb;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.f7026v = true;
                    x9kr(true);
                    setScrollState(1);
                    float f3 = this.an;
                    float f4 = this.bb;
                    this.bp = f2 > 0.0f ? f3 + f4 : f3 - f4;
                    this.bv = y4;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.f7008d = true;
                }
                if (this.f7026v && d3(x4)) {
                    C0683f.h7am(this);
                }
            }
        } else if (action == 6) {
            a9(motionEvent);
        }
        if (this.bl == null) {
            this.bl = VelocityTracker.obtain();
        }
        this.bl.addMovement(motionEvent);
        return this.f7026v;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        f7l8 f7l8Var;
        f7l8 f7l8Var2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.f53685ab = Math.min(measuredWidth / 10, this.f7027w);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z2 = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (f7l8Var2 = (f7l8) childAt.getLayoutParams()) != null && f7l8Var2.f7035k) {
                int i7 = f7l8Var2.f53687toq;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z3 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z2 = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) f7l8Var2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) f7l8Var2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.f7017m = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f7006b = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f7005a = true;
        oc();
        this.f7005a = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((f7l8Var = (f7l8) childAt2.getLayoutParams()) == null || !f7l8Var.f7035k)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * f7l8Var.f53688zy), 1073741824), this.f7006b);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        C1281g c1281gNi7;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (c1281gNi7 = ni7(childAt)) != null && c1281gNi7.f53689toq == this.f7023s && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        AbstractC1288k abstractC1288k = this.f7029y;
        if (abstractC1288k != null) {
            abstractC1288k.n7h(savedState.f7032n, savedState.f7031g);
            n5r1(savedState.f7033q, false, true);
        } else {
            this.f7020p = savedState.f7033q;
            this.f7012h = savedState.f7032n;
            this.f7013i = savedState.f7031g;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7033q = this.f7023s;
        AbstractC1288k abstractC1288k = this.f7029y;
        if (abstractC1288k != null) {
            savedState.f7032n = abstractC1288k.kja0();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f7016l;
            d2ok(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    void m5561p() {
        int iMo5575n = this.f7029y.mo5575n();
        this.f7015k = iMo5575n;
        boolean z2 = this.f7021q.size() < (this.f53686bo * 2) + 1 && this.f7021q.size() < iMo5575n;
        int iMax = this.f7023s;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f7021q.size()) {
            C1281g c1281g = this.f7021q.get(i2);
            int iMo5572g = this.f7029y.mo5572g(c1281g.f7038k);
            if (iMo5572g != -1) {
                if (iMo5572g == -2) {
                    this.f7021q.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f7029y.mo4275i(this);
                        z3 = true;
                    }
                    this.f7029y.toq(this, c1281g.f53689toq, c1281g.f7038k);
                    int i3 = this.f7023s;
                    if (i3 == c1281g.f53689toq) {
                        iMax = Math.max(0, Math.min(i3, iMo5575n - 1));
                    }
                } else {
                    int i4 = c1281g.f53689toq;
                    if (i4 != iMo5572g) {
                        if (i4 == this.f7023s) {
                            iMax = iMo5572g;
                        }
                        c1281g.f53689toq = iMo5572g;
                    }
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f7029y.mo4277q(this);
        }
        Collections.sort(this.f7021q, cw14);
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                f7l8 f7l8Var = (f7l8) getChildAt(i5).getLayoutParams();
                if (!f7l8Var.f7035k) {
                    f7l8Var.f53688zy = 0.0f;
                }
            }
            n5r1(iMax, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m5562q(int i2) {
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
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i2 == 17) {
                zRequestFocus = (viewFindFocus == null || fn3e(this.f7011g, viewFindNextFocus).left < fn3e(this.f7011g, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : fti();
            } else if (i2 == 66) {
                zRequestFocus = (viewFindFocus == null || fn3e(this.f7011g, viewFindNextFocus).left > fn3e(this.f7011g, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : jp0y();
            }
            zFti = zRequestFocus;
        } else if (i2 == 17 || i2 == 1) {
            zFti = fti();
        } else if (i2 == 66 || i2 == 2) {
            zFti = jp0y();
        }
        if (zFti) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zFti;
    }

    /* JADX INFO: renamed from: r */
    public void m5563r(@lvui InterfaceC1286s interfaceC1286s) {
        List<InterfaceC1286s> list = this.bc;
        if (list != null) {
            list.remove(interfaceC1286s);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f7005a) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@dd AbstractC1288k abstractC1288k) {
        AbstractC1288k abstractC1288k2 = this.f7029y;
        if (abstractC1288k2 != null) {
            abstractC1288k2.ki(null);
            this.f7029y.mo4275i(this);
            for (int i2 = 0; i2 < this.f7021q.size(); i2++) {
                C1281g c1281g = this.f7021q.get(i2);
                this.f7029y.toq(this, c1281g.f53689toq, c1281g.f7038k);
            }
            this.f7029y.mo4277q(this);
            this.f7021q.clear();
            lvui();
            this.f7023s = 0;
            scrollTo(0, 0);
        }
        AbstractC1288k abstractC1288k3 = this.f7029y;
        this.f7029y = abstractC1288k;
        this.f7015k = 0;
        if (abstractC1288k != null) {
            if (this.f7022r == null) {
                this.f7022r = new x2();
            }
            this.f7029y.ki(this.f7022r);
            this.f7025u = false;
            boolean z2 = this.am;
            this.am = true;
            this.f7015k = this.f7029y.mo5575n();
            if (this.f7020p >= 0) {
                this.f7029y.n7h(this.f7012h, this.f7013i);
                n5r1(this.f7020p, false, true);
                this.f7020p = -1;
                this.f7012h = null;
                this.f7013i = null;
            } else if (z2) {
                requestLayout();
            } else {
                oc();
            }
        }
        List<InterfaceC1286s> list = this.bc;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.bc.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.bc.get(i3).mo5551q(this, abstractC1288k3, abstractC1288k);
        }
    }

    public void setCurrentItem(int i2) {
        this.f7025u = false;
        n5r1(i2, !this.am, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w(zmmu, "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.f53686bo) {
            this.f53686bo = i2;
            oc();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1284p interfaceC1284p) {
        this.k0 = interfaceC1284p;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f7016l;
        this.f7016l = i2;
        int width = getWidth();
        d2ok(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(@dd Drawable drawable) {
        this.f7010f = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z2, @dd ld6 ld6Var) {
        setPageTransformer(z2, ld6Var, 2);
    }

    void setScrollState(int i2) {
        if (this.yl25 == i2) {
            return;
        }
        this.yl25 = i2;
        if (this.bu != null) {
            m5553h(i2 != 0);
        }
        n7h(i2);
    }

    /* JADX INFO: renamed from: t */
    public boolean m5564t() {
        return this.ax;
    }

    public boolean t8r(@lvui KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? fti() : m5562q(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? jp0y() : m5562q(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m5562q(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m5562q(1);
                }
            }
        }
        return false;
    }

    public void toq(@lvui InterfaceC1286s interfaceC1286s) {
        if (this.bc == null) {
            this.bc = new ArrayList();
        }
        this.bc.add(interfaceC1286s);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7010f;
    }

    /* JADX INFO: renamed from: y */
    public void m5565y() {
        List<InterfaceC1284p> list = this.bs;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: z */
    C1281g m5566z(int i2) {
        for (int i3 = 0; i3 < this.f7021q.size(); i3++) {
            C1281g c1281g = this.f7021q.get(i3);
            if (c1281g.f53689toq == i2) {
                return c1281g;
            }
        }
        return null;
    }

    C1281g zurt(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return ni7(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public void zy(@lvui InterfaceC1284p interfaceC1284p) {
        if (this.bs == null) {
            this.bs = new ArrayList();
        }
        this.bs.add(interfaceC1284p);
    }

    public static class f7l8 extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: g */
        int f7034g;

        /* JADX INFO: renamed from: k */
        public boolean f7035k;

        /* JADX INFO: renamed from: n */
        int f7036n;

        /* JADX INFO: renamed from: q */
        boolean f7037q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f53687toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f53688zy;

        public f7l8() {
            super(-1, -1);
            this.f53688zy = 0.0f;
        }

        public f7l8(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53688zy = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.hp);
            this.f53687toq = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f7l8(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z2, @dd ld6 ld6Var, int i2) {
        boolean z3 = ld6Var != null;
        boolean z5 = z3 != (this.bu != null);
        this.bu = ld6Var;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            this.tlhn = z2 ? 2 : 1;
            this.bd = i2;
        } else {
            this.tlhn = 0;
        }
        if (z5) {
            oc();
        }
    }

    public void setCurrentItem(int i2, boolean z2) {
        this.f7025u = false;
        n5r1(i2, z2, false);
    }

    public void setPageMarginDrawable(@fn3e int i2) {
        setPageMarginDrawable(C0498q.m2259s(getContext(), i2));
    }

    public ViewPager(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7021q = new ArrayList<>();
        this.f7018n = new C1281g();
        this.f7011g = new Rect();
        this.f7020p = -1;
        this.f7012h = null;
        this.f7013i = null;
        this.f7014j = -3.4028235E38f;
        this.f7019o = Float.MAX_VALUE;
        this.f53686bo = 1;
        this.in = -1;
        this.am = true;
        this.ay = false;
        this.tgs = new zy();
        this.yl25 = 0;
        o1t();
    }
}
