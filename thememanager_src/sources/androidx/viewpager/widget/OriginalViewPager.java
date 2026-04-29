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
import miuix.androidbasewidget.widget.C6835q;
import zy.InterfaceC7833l;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class OriginalViewPager extends ViewGroup {
    private static final int d1cy = 0;
    private static final boolean dy = false;
    private static final int hp = 400;
    private static final int k6e = 2;
    private static final int mjvl = 16;
    private static final int ndjo = 2;
    private static final int q7k9 = -1;
    private static final int s8y = 25;
    private static final String sk1t = "ViewPager";
    private static final boolean vb6 = false;
    public static final int wra = 0;
    public static final int xhv = 2;
    private static final int xk5 = 600;
    private static final int xqx = 1;
    private static final int zr5t = 2;
    public static final int zsl = 1;

    /* JADX INFO: renamed from: a */
    private int f6933a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f53676ab;
    private long ac;
    private EdgeEffect ad;
    private boolean aj;
    private EdgeEffect am;
    private float an;
    private InterfaceC1274p ar;
    private VelocityTracker as;
    private int ax;
    private boolean ay;
    private int az;

    /* JADX INFO: renamed from: b */
    private int f6934b;
    private int ba;
    private int bb;
    private InterfaceC1274p bc;
    private ld6 bd;
    private boolean be;
    private int bg;
    private int bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f53677bo;
    private int bp;
    private boolean bq;
    private int bs;
    private List<InterfaceC1276s> bu;
    private float bv;

    /* JADX INFO: renamed from: c */
    private Drawable f6935c;

    /* JADX INFO: renamed from: d */
    private boolean f6936d;

    /* JADX INFO: renamed from: e */
    private int f6937e;

    /* JADX INFO: renamed from: f */
    private int f6938f;

    /* JADX INFO: renamed from: g */
    private final Rect f6939g;

    /* JADX INFO: renamed from: h */
    private boolean f6940h;

    /* JADX INFO: renamed from: i */
    private Parcelable f6941i;
    private float id;
    private float in;

    /* JADX INFO: renamed from: j */
    private int f6942j;

    /* JADX INFO: renamed from: k */
    private int f6943k;
    private List<InterfaceC1274p> k0;

    /* JADX INFO: renamed from: l */
    private x2 f6944l;

    /* JADX INFO: renamed from: m */
    private float f6945m;

    /* JADX INFO: renamed from: n */
    private final C1271g f6946n;

    /* JADX INFO: renamed from: o */
    private float f6947o;

    /* JADX INFO: renamed from: p */
    private int f6948p;

    /* JADX INFO: renamed from: q */
    private final ArrayList<C1271g> f6949q;

    /* JADX INFO: renamed from: r */
    private boolean f6950r;

    /* JADX INFO: renamed from: s */
    int f6951s;

    /* JADX INFO: renamed from: t */
    private C6835q f6952t;
    private ArrayList<View> tgs;
    private int tlhn;

    /* JADX INFO: renamed from: u */
    private boolean f6953u;

    /* JADX INFO: renamed from: v */
    private int f6954v;

    /* JADX INFO: renamed from: w */
    private boolean f6955w;
    private int w97r;

    /* JADX INFO: renamed from: x */
    private boolean f6956x;

    /* JADX INFO: renamed from: y */
    AbstractC1288k f6957y;
    private final Runnable yl25;

    /* JADX INFO: renamed from: z */
    private ClassLoader f6958z;
    private int zmmu;
    static final int[] cw14 = {R.attr.layout_gravity};
    private static final Comparator<C1271g> xy8 = new C1272k();
    private static final Interpolator th6 = new toq();
    private static final n7h ei = new n7h();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.OriginalViewPager.SavedState.1
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
        Parcelable f6959g;

        /* JADX INFO: renamed from: n */
        int f6960n;

        /* JADX INFO: renamed from: q */
        int f6961q;

        /* JADX INFO: renamed from: y */
        ClassLoader f6962y;

        public SavedState(@lvui Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f6961q + " isRTL=" + this.f6960n + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f6961q);
            parcel.writeInt(this.f6960n);
            parcel.writeParcelable(this.f6959g, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f6961q = parcel.readInt();
            this.f6960n = parcel.readInt();
            this.f6959g = parcel.readParcelable(classLoader);
            this.f6962y = classLoader;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.OriginalViewPager$g */
    static class C1271g {

        /* JADX INFO: renamed from: k */
        Object f6967k;

        /* JADX INFO: renamed from: n */
        float f6968n;

        /* JADX INFO: renamed from: q */
        float f6969q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f53680toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f53681zy;

        C1271g() {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.OriginalViewPager$k */
    class C1272k implements Comparator<C1271g> {
        C1272k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(C1271g c1271g, C1271g c1271g2) {
            return c1271g.f53680toq - c1271g2.f53680toq;
        }
    }

    public interface ld6 {
        void transformPage(@lvui View view, float f2);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.OriginalViewPager$n */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1273n {
    }

    static class n7h implements Comparator<View> {
        n7h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            f7l8 f7l8Var = (f7l8) view.getLayoutParams();
            f7l8 f7l8Var2 = (f7l8) view2.getLayoutParams();
            boolean z2 = f7l8Var.f6964k;
            return z2 != f7l8Var2.f6964k ? z2 ? 1 : -1 : f7l8Var.f6965n - f7l8Var2.f6965n;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.OriginalViewPager$p */
    public interface InterfaceC1274p {
        /* JADX INFO: renamed from: k */
        void mo5546k(int i2);

        void toq(int i2);

        void zy(int i2, float f2, @InterfaceC7833l int i3);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.OriginalViewPager$q */
    class C1275q implements eqxt {

        /* JADX INFO: renamed from: k */
        private final Rect f6970k = new Rect();

        C1275q() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, tfm tfmVar) {
            tfm tfmVarBz2 = C0683f.bz2(view, tfmVar);
            if (tfmVarBz2.wvg()) {
                return tfmVarBz2;
            }
            Rect rect = this.f6970k;
            rect.left = tfmVarBz2.m3467h();
            rect.top = tfmVarBz2.ki();
            rect.right = tfmVarBz2.cdj();
            rect.bottom = tfmVarBz2.kja0();
            int childCount = OriginalViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                tfm tfmVarM3162h = C0683f.m3162h(OriginalViewPager.this.getChildAt(i2), tfmVarBz2);
                rect.left = Math.min(tfmVarM3162h.m3467h(), rect.left);
                rect.top = Math.min(tfmVarM3162h.ki(), rect.top);
                rect.right = Math.min(tfmVarM3162h.cdj(), rect.right);
                rect.bottom = Math.min(tfmVarM3162h.kja0(), rect.bottom);
            }
            return tfmVarBz2.jk(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static class qrj implements InterfaceC1274p {
        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        /* JADX INFO: renamed from: k */
        public void mo5546k(int i2) {
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        public void toq(int i2) {
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        public void zy(int i2, float f2, int i3) {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.OriginalViewPager$s */
    public interface InterfaceC1276s {
        /* JADX INFO: renamed from: k */
        void m5547k(@lvui miuix.viewpager.widget.ViewPager viewPager, @dd AbstractC1288k abstractC1288k, @dd AbstractC1288k abstractC1288k2);
    }

    class toq implements Interpolator {
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
            OriginalViewPager.this.ld6();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            OriginalViewPager.this.ld6();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.OriginalViewPager$y */
    class C1277y extends C0701k {
        C1277y() {
        }

        /* JADX INFO: renamed from: k */
        private boolean m5548k() {
            AbstractC1288k abstractC1288k = OriginalViewPager.this.f6957y;
            return abstractC1288k != null && abstractC1288k.mo5575n() > 1;
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC1288k abstractC1288k;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(OriginalViewPager.class.getName());
            accessibilityEvent.setScrollable(m5548k());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC1288k = OriginalViewPager.this.f6957y) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC1288k.mo5575n());
            accessibilityEvent.setFromIndex(OriginalViewPager.this.f6951s);
            accessibilityEvent.setToIndex(OriginalViewPager.this.f6951s);
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.sok(OriginalViewPager.class.getName());
            kiVar.lh(m5548k());
            if (OriginalViewPager.this.canScrollHorizontally(1)) {
                kiVar.m3052k(4096);
            }
            if (OriginalViewPager.this.canScrollHorizontally(-1)) {
                kiVar.m3052k(8192);
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (super.performAccessibilityAction(view, i2, bundle)) {
                return true;
            }
            if (i2 == 4096) {
                if (!OriginalViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                OriginalViewPager originalViewPager = OriginalViewPager.this;
                originalViewPager.setCurrentItem(originalViewPager.f6951s + 1);
                return true;
            }
            if (i2 != 8192 || !OriginalViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            OriginalViewPager originalViewPager2 = OriginalViewPager.this;
            originalViewPager2.setCurrentItem(originalViewPager2.f6951s - 1);
            return true;
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OriginalViewPager.this.setScrollState(0);
            OriginalViewPager.this.d2ok();
        }
    }

    public OriginalViewPager(@lvui Context context) {
        super(context);
        this.f6949q = new ArrayList<>();
        this.f6946n = new C1271g();
        this.f6939g = new Rect();
        this.f6948p = -1;
        this.f6940h = false;
        this.f6941i = null;
        this.f6958z = null;
        this.f6947o = -3.4028235E38f;
        this.f6945m = Float.MAX_VALUE;
        this.f6954v = 2;
        this.bl = -1;
        this.ay = true;
        this.be = false;
        this.yl25 = new zy();
        this.zmmu = 0;
        wvg();
    }

    private void cdj(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.tlhn : 0, null);
        }
    }

    private void dd() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((f7l8) getChildAt(i2).getLayoutParams()).f6964k) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m5527e() {
        if (this.w97r != 0) {
            ArrayList<View> arrayList = this.tgs;
            if (arrayList == null) {
                this.tgs = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.tgs.add(getChildAt(i2));
            }
            Collections.sort(this.tgs, ei);
        }
    }

    private boolean eqxt(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.bv - f2;
        this.bv = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.f6947o * clientWidth;
        float f5 = this.f6945m * clientWidth;
        boolean z5 = false;
        C1271g c1271g = this.f6949q.get(0);
        ArrayList<C1271g> arrayList = this.f6949q;
        C1271g c1271g2 = arrayList.get(arrayList.size() - 1);
        if (c1271g.f53680toq != 0) {
            f4 = c1271g.f6968n * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (c1271g2.f53680toq != this.f6957y.mo5575n() - 1) {
            f5 = c1271g2.f6968n * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.ad.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z5 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.am.onPull(Math.abs(scrollX - f5) / clientWidth);
                z5 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.bv += scrollX - i2;
        scrollTo(i2, getScrollY());
        oc(i2);
        return z5;
    }

    /* JADX INFO: renamed from: g */
    private void m5528g(C1271g c1271g, int i2, C1271g c1271g2) {
        int i3;
        int i4;
        C1271g c1271g3;
        C1271g c1271g4;
        int iMo5575n = this.f6957y.mo5575n();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.f6938f / clientWidth : 0.0f;
        if (c1271g2 != null) {
            int i5 = c1271g2.f53680toq;
            int i6 = c1271g.f53680toq;
            if (i5 < i6) {
                float fM5577y = c1271g2.f6968n + c1271g2.f6969q + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= c1271g.f53680toq && i8 < this.f6949q.size()) {
                    C1271g c1271g5 = this.f6949q.get(i8);
                    while (true) {
                        c1271g4 = c1271g5;
                        if (i7 <= c1271g4.f53680toq || i8 >= this.f6949q.size() - 1) {
                            break;
                        }
                        i8++;
                        c1271g5 = this.f6949q.get(i8);
                    }
                    while (i7 < c1271g4.f53680toq) {
                        fM5577y += this.f6957y.m5577y(i7) + f2;
                        i7++;
                    }
                    c1271g4.f6968n = fM5577y;
                    fM5577y += c1271g4.f6969q + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f6949q.size() - 1;
                float fM5577y2 = c1271g2.f6968n;
                while (true) {
                    i5--;
                    if (i5 < c1271g.f53680toq || size < 0) {
                        break;
                    }
                    C1271g c1271g6 = this.f6949q.get(size);
                    while (true) {
                        c1271g3 = c1271g6;
                        if (i5 >= c1271g3.f53680toq || size <= 0) {
                            break;
                        }
                        size--;
                        c1271g6 = this.f6949q.get(size);
                    }
                    while (i5 > c1271g3.f53680toq) {
                        fM5577y2 -= this.f6957y.m5577y(i5) + f2;
                        i5--;
                    }
                    fM5577y2 -= c1271g3.f6969q + f2;
                    c1271g3.f6968n = fM5577y2;
                }
            }
        }
        int size2 = this.f6949q.size();
        float fM5577y3 = c1271g.f6968n;
        int i9 = c1271g.f53680toq;
        int i10 = i9 - 1;
        this.f6947o = i9 == 0 ? fM5577y3 : -3.4028235E38f;
        int i11 = iMo5575n - 1;
        this.f6945m = i9 == i11 ? (c1271g.f6969q + fM5577y3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            C1271g c1271g7 = this.f6949q.get(i12);
            while (true) {
                i4 = c1271g7.f53680toq;
                if (i10 <= i4) {
                    break;
                }
                fM5577y3 -= this.f6957y.m5577y(i10) + f2;
                i10--;
            }
            fM5577y3 -= c1271g7.f6969q + f2;
            c1271g7.f6968n = fM5577y3;
            if (i4 == 0) {
                this.f6947o = fM5577y3;
            }
            i12--;
            i10--;
        }
        float fM5577y4 = c1271g.f6968n + c1271g.f6969q + f2;
        int i13 = c1271g.f53680toq + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            C1271g c1271g8 = this.f6949q.get(i14);
            while (true) {
                i3 = c1271g8.f53680toq;
                if (i13 >= i3) {
                    break;
                }
                fM5577y4 += this.f6957y.m5577y(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.f6945m = (c1271g8.f6969q + fM5577y4) - 1.0f;
            }
            c1271g8.f6968n = fM5577y4;
            fM5577y4 += c1271g8.f6969q + f2;
            i14++;
            i13++;
        }
        this.be = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void hyr(int i2, boolean z2, int i3, boolean z3) {
        C1271g c1271gO1t = o1t(i2);
        int clientWidth = c1271gO1t != null ? (int) (getClientWidth() * Math.max(this.f6947o, Math.min(c1271gO1t.f6968n, this.f6945m))) : 0;
        if (z2) {
            vyq(clientWidth, 0, i3);
            if (z3) {
                n7h(i2);
                return;
            }
            return;
        }
        if (z3) {
            n7h(i2);
        }
        m5531s(false);
        scrollTo(clientWidth, 0);
        oc(clientWidth);
    }

    private boolean jk(float f2, float f3) {
        return (f2 < ((float) this.bb) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.bb)) && f3 < 0.0f);
    }

    private void jp0y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.bl) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.bv = motionEvent.getX(i2);
            this.bl = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.as;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void ki() {
        this.f6936d = false;
        this.f6955w = false;
        VelocityTracker velocityTracker = this.as;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.as = null;
        }
    }

    private void kja0(int i2) {
        InterfaceC1274p interfaceC1274p = this.ar;
        if (interfaceC1274p != null) {
            interfaceC1274p.mo5546k(i2);
        }
        List<InterfaceC1274p> list = this.k0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC1274p interfaceC1274p2 = this.k0.get(i3);
                if (interfaceC1274p2 != null) {
                    interfaceC1274p2.mo5546k(i2);
                }
            }
        }
        InterfaceC1274p interfaceC1274p3 = this.bc;
        if (interfaceC1274p3 != null) {
            interfaceC1274p3.mo5546k(i2);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m5529l(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean n5r1() {
        this.bl = -1;
        ki();
        this.ad.onRelease();
        this.am.onRelease();
        return this.ad.isFinished() || this.am.isFinished();
    }

    private void n7h(int i2) {
        InterfaceC1274p interfaceC1274p = this.ar;
        if (interfaceC1274p != null) {
            interfaceC1274p.toq(i2);
        }
        List<InterfaceC1274p> list = this.k0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC1274p interfaceC1274p2 = this.k0.get(i3);
                if (interfaceC1274p2 != null) {
                    interfaceC1274p2.toq(i2);
                }
            }
        }
        InterfaceC1274p interfaceC1274p3 = this.bc;
        if (interfaceC1274p3 != null) {
            interfaceC1274p3.toq(i2);
        }
    }

    private boolean oc(int i2) {
        if (this.f6949q.size() == 0) {
            if (this.ay) {
                return false;
            }
            this.aj = false;
            fti(0, 0.0f, 0);
            if (this.aj) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1271g c1271gM5533z = m5533z();
        int clientWidth = getClientWidth();
        int i3 = this.f6938f;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = c1271gM5533z.f53680toq;
        float f3 = ((i2 / f2) - c1271gM5533z.f6968n) / (c1271gM5533z.f6969q + (i3 / f2));
        this.aj = false;
        fti(i5, f3, (int) (i4 * f3));
        if (this.aj) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void qrj(int i2, float f2, int i3) {
        InterfaceC1274p interfaceC1274p = this.ar;
        if (interfaceC1274p != null) {
            interfaceC1274p.zy(i2, f2, i3);
        }
        List<InterfaceC1274p> list = this.k0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                InterfaceC1274p interfaceC1274p2 = this.k0.get(i4);
                if (interfaceC1274p2 != null) {
                    interfaceC1274p2.zy(i2, f2, i3);
                }
            }
        }
        InterfaceC1274p interfaceC1274p3 = this.bc;
        if (interfaceC1274p3 != null) {
            interfaceC1274p3.zy(i2, f2, i3);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m5530r(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.f6949q.isEmpty()) {
            if (!this.f6952t.m24806y()) {
                this.f6952t.m24805s(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        C1271g c1271gO1t = o1t(this.f6951s);
        int iMin = (int) ((c1271gO1t != null ? Math.min(c1271gO1t.f6968n, this.f6945m) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m5531s(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m5531s(boolean z2) {
        boolean z3 = this.zmmu == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.f6952t.m24806y()) {
                this.f6952t.m24801k();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int iZy = this.f6952t.zy();
                int iM24804q = this.f6952t.m24804q();
                if (scrollX != iZy || scrollY != iM24804q) {
                    scrollTo(iZy, iM24804q);
                    if (iZy != scrollX) {
                        oc(iZy);
                    }
                }
            }
        }
        this.f53677bo = false;
        for (int i2 = 0; i2 < this.f6949q.size(); i2++) {
            C1271g c1271g = this.f6949q.get(i2);
            if (c1271g.f53681zy) {
                c1271g.f53681zy = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z2) {
                C0683f.mbx(this, this.yl25);
            } else {
                this.yl25.run();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.f6953u != z2) {
            this.f6953u = z2;
        }
    }

    /* JADX INFO: renamed from: t */
    private static boolean m5532t(@lvui View view) {
        return view.getClass().getAnnotation(InterfaceC1273n.class) != null;
    }

    private int x2(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.ba || Math.abs(i3) <= this.bg) {
            i2 += (int) (f2 + (i2 >= this.f6951s ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f6949q.size() <= 0) {
            return i2;
        }
        return Math.max(this.f6949q.get(0).f53680toq, Math.min(i2, this.f6949q.get(r4.size() - 1).f53680toq));
    }

    /* JADX INFO: renamed from: z */
    private C1271g m5533z() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.f6938f / clientWidth : 0.0f;
        C1271g c1271g = null;
        int i3 = 0;
        int i4 = -1;
        boolean z2 = true;
        float f4 = 0.0f;
        while (i3 < this.f6949q.size()) {
            C1271g c1271g2 = this.f6949q.get(i3);
            if (!z2 && c1271g2.f53680toq != (i2 = i4 + 1)) {
                c1271g2 = this.f6946n;
                c1271g2.f6968n = f2 + f4 + f3;
                c1271g2.f53680toq = i2;
                c1271g2.f6969q = this.f6957y.m5577y(i2);
                i3--;
            }
            f2 = c1271g2.f6968n;
            float f5 = c1271g2.f6969q + f2 + f3;
            if (!z2 && scrollX < f2) {
                return c1271g;
            }
            if (scrollX < f5 || i3 == this.f6949q.size() - 1) {
                return c1271g2;
            }
            i4 = c1271g2.f53680toq;
            f4 = c1271g2.f6969q;
            i3++;
            z2 = false;
            c1271g = c1271g2;
        }
        return c1271g;
    }

    private Rect zurt(Rect rect, View view) {
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

    boolean a9() {
        return getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        C1271g c1271gFu4;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (c1271gFu4 = fu4(childAt)) != null && c1271gFu4.f53680toq == this.f6951s) {
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
        C1271g c1271gFu4;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c1271gFu4 = fu4(childAt)) != null && c1271gFu4.f53680toq == this.f6951s) {
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
        boolean zM5532t = f7l8Var.f6964k | m5532t(view);
        f7l8Var.f6964k = zM5532t;
        if (!this.f6956x) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zM5532t) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            f7l8Var.f6966q = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    void m5534c(int i2, boolean z2, boolean z3, int i3) {
        AbstractC1288k abstractC1288k = this.f6957y;
        if (abstractC1288k == null || abstractC1288k.mo5575n() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z3 && this.f6951s == i2 && this.f6949q.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f6957y.mo5575n()) {
            i2 = this.f6957y.mo5575n() - 1;
        }
        int i4 = this.f6954v;
        int i5 = this.f6951s;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f6949q.size(); i6++) {
                this.f6949q.get(i6).f53681zy = true;
            }
        }
        boolean z5 = this.f6951s != i2;
        if (!this.ay) {
            lvui(i2);
            hyr(i2, z2, i3, z5);
        } else {
            this.f6951s = i2;
            if (z5) {
                n7h(i2);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f6957y == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f6947o)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.f6945m));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f7l8) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f6950r = true;
        if (this.f6952t.m24806y() || !this.f6952t.toq()) {
            m5531s(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int iZy = this.f6952t.zy();
        int iM24804q = this.f6952t.m24804q();
        if (scrollX != iZy || scrollY != iM24804q) {
            scrollTo(iZy, iM24804q);
            if (!oc(iZy)) {
                this.f6952t.m24801k();
                scrollTo(0, iM24804q);
            }
        }
        C0683f.h7am(this);
    }

    void d2ok() {
        lvui(this.f6951s);
    }

    boolean d3() {
        AbstractC1288k abstractC1288k = this.f6957y;
        if (abstractC1288k == null || this.f6951s >= abstractC1288k.mo5575n() - 1) {
            return false;
        }
        setCurrentItem(this.f6951s + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m5537i(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1271g c1271gFu4;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c1271gFu4 = fu4(childAt)) != null && c1271gFu4.f53680toq == this.f6951s && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC1288k = this.f6957y) != null && abstractC1288k.mo5575n() > 1)) {
            if (!this.ad.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f6947o * width);
                this.ad.setSize(height, width);
                zDraw = false | this.ad.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.am.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f6945m + 1.0f)) * width2);
                this.am.setSize(height2, width2);
                zDraw |= this.am.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.ad.finish();
            this.am.finish();
        }
        if (zDraw) {
            C0683f.h7am(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6935c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: f */
    void m5535f(int i2, boolean z2, boolean z3) {
        m5534c(i2, z2, z3, 0);
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

    public void fn3e(float f2) {
        if (!this.bq) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f6957y == null) {
            return;
        }
        this.bv += f2;
        float scrollX = getScrollX() - f2;
        float clientWidth = getClientWidth();
        float f3 = this.f6947o * clientWidth;
        float f4 = this.f6945m * clientWidth;
        C1271g c1271g = this.f6949q.get(0);
        C1271g c1271g2 = this.f6949q.get(r4.size() - 1);
        if (c1271g.f53680toq != 0) {
            f3 = c1271g.f6968n * clientWidth;
        }
        if (c1271g2.f53680toq != this.f6957y.mo5575n() - 1) {
            f4 = c1271g2.f6968n * clientWidth;
        }
        if (scrollX < f3) {
            scrollX = f3;
        } else if (scrollX > f4) {
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.bv += scrollX - i2;
        scrollTo(i2, getScrollY());
        oc(i2);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.ac, SystemClock.uptimeMillis(), 2, this.bv, 0.0f, 0);
        this.as.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @zy.InterfaceC7842s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void fti(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.bs
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
            androidx.viewpager.widget.OriginalViewPager$f7l8 r9 = (androidx.viewpager.widget.OriginalViewPager.f7l8) r9
            boolean r10 = r9.f6964k
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f53678toq
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
            r12.qrj(r13, r14, r15)
            androidx.viewpager.widget.OriginalViewPager$ld6 r13 = r12.bd
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.OriginalViewPager$f7l8 r0 = (androidx.viewpager.widget.OriginalViewPager.f7l8) r0
            boolean r0 = r0.f6964k
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.OriginalViewPager$ld6 r3 = r12.bd
            r3.transformPage(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.aj = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.OriginalViewPager.fti(int, float, int):void");
    }

    C1271g fu4(View view) {
        for (int i2 = 0; i2 < this.f6949q.size(); i2++) {
            C1271g c1271g = this.f6949q.get(i2);
            if (this.f6957y.ld6(view, c1271g.f6967k)) {
                return c1271g;
            }
        }
        return null;
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
        return this.f6957y;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.w97r == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((f7l8) this.tgs.get(i3).getLayoutParams()).f6963g;
    }

    public int getCurrentItem() {
        return this.f6951s;
    }

    public int getOffscreenPageLimit() {
        return this.f6954v;
    }

    public int getPageMargin() {
        return this.f6938f;
    }

    boolean gvn7() {
        int i2 = this.f6951s;
        if (i2 <= 0) {
            return false;
        }
        setCurrentItem(i2 - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: h */
    float m5536h(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: i */
    public boolean m5537i(@lvui KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? gvn7() : m5541q(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? d3() : m5541q(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m5541q(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m5541q(1);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    C1271g m5538k(int i2, int i3) {
        C1271g c1271g = new C1271g();
        c1271g.f53680toq = i2;
        c1271g.f6967k = this.f6957y.mo4276p(this, i2);
        c1271g.f6969q = this.f6957y.m5577y(i2);
        if (i3 < 0 || i3 >= this.f6949q.size()) {
            this.f6949q.add(c1271g);
        } else {
            this.f6949q.add(i3, c1271g);
        }
        return c1271g;
    }

    void ld6() {
        int iMo5575n = this.f6957y.mo5575n();
        this.f6943k = iMo5575n;
        boolean z2 = this.f6949q.size() < (this.f6954v * 2) + 1 && this.f6949q.size() < iMo5575n;
        int iMax = this.f6951s;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f6949q.size()) {
            C1271g c1271g = this.f6949q.get(i2);
            int iMo5572g = this.f6957y.mo5572g(c1271g.f6967k);
            if (iMo5572g != -1) {
                if (iMo5572g == -2) {
                    this.f6949q.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f6957y.mo4275i(this);
                        z3 = true;
                    }
                    this.f6957y.toq(this, c1271g.f53680toq, c1271g.f6967k);
                    int i3 = this.f6951s;
                    if (i3 == c1271g.f53680toq) {
                        iMax = Math.max(0, Math.min(i3, iMo5575n - 1));
                    }
                } else {
                    int i4 = c1271g.f53680toq;
                    if (i4 != iMo5572g) {
                        if (i4 == this.f6951s) {
                            iMax = iMo5572g;
                        }
                        c1271g.f53680toq = iMo5572g;
                    }
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f6957y.mo4277q(this);
        }
        Collections.sort(this.f6949q, xy8);
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                f7l8 f7l8Var = (f7l8) getChildAt(i5).getLayoutParams();
                if (!f7l8Var.f6964k) {
                    f7l8Var.f53679zy = 0.0f;
                }
            }
            m5535f(iMax, false, true);
            requestLayout();
        }
    }

    InterfaceC1274p lrht(InterfaceC1274p interfaceC1274p) {
        InterfaceC1274p interfaceC1274p2 = this.bc;
        this.bc = interfaceC1274p;
        return interfaceC1274p2;
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
    void lvui(int r18) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.OriginalViewPager.lvui(int):void");
    }

    public boolean mcp() {
        return this.bq;
    }

    /* JADX INFO: renamed from: n */
    public boolean m5539n() {
        if (this.f6936d) {
            return false;
        }
        this.bq = true;
        setScrollState(1);
        this.bv = 0.0f;
        this.id = 0.0f;
        VelocityTracker velocityTracker = this.as;
        if (velocityTracker == null) {
            this.as = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.as.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.ac = jUptimeMillis;
        return true;
    }

    public void ncyb(@lvui InterfaceC1274p interfaceC1274p) {
        List<InterfaceC1274p> list = this.k0;
        if (list != null) {
            list.remove(interfaceC1274p);
        }
    }

    C1271g ni7(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return fu4(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    C1271g o1t(int i2) {
        for (int i3 = 0; i3 < this.f6949q.size(); i3++) {
            C1271g c1271g = this.f6949q.get(i3);
            if (c1271g.f53680toq == i2) {
                return c1271g;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ay = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.yl25);
        C6835q c6835q = this.f6952t;
        if (c6835q != null && !c6835q.m24806y()) {
            this.f6952t.m24801k();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f6938f <= 0 || this.f6935c == null || this.f6949q.size() <= 0 || this.f6957y == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f6938f / width;
        int i3 = 0;
        C1271g c1271g = this.f6949q.get(0);
        float f5 = c1271g.f6968n;
        int size = this.f6949q.size();
        int i4 = c1271g.f53680toq;
        int i5 = this.f6949q.get(size - 1).f53680toq;
        while (i4 < i5) {
            while (true) {
                i2 = c1271g.f53680toq;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                c1271g = this.f6949q.get(i3);
            }
            if (i4 == i2) {
                float f6 = c1271g.f6968n;
                float f7 = c1271g.f6969q;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float fM5577y = this.f6957y.m5577y(i4);
                f2 = (f5 + fM5577y) * width;
                f5 += fM5577y + f4;
            }
            if (this.f6938f + f2 > scrollX) {
                f3 = f4;
                this.f6935c.setBounds(Math.round(f2), this.f6937e, Math.round(this.f6938f + f2), this.f6942j);
                this.f6935c.draw(canvas);
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
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            n5r1();
            return false;
        }
        if (action != 0) {
            if (this.f6936d) {
                return true;
            }
            if (this.f6955w) {
                return false;
            }
        }
        if (action == 0) {
            float x3 = motionEvent.getX();
            this.id = x3;
            this.bv = x3;
            float y3 = motionEvent.getY();
            this.in = y3;
            this.an = y3;
            this.bl = motionEvent.getPointerId(0);
            this.f6955w = false;
            this.f6950r = true;
            this.f6952t.toq();
            if (this.zmmu != 2 || Math.abs(this.f6952t.m24802n() - this.f6952t.zy()) <= this.ax) {
                m5531s(false);
                this.f6936d = false;
            } else {
                this.f6952t.m24801k();
                this.f53677bo = false;
                d2ok();
                this.f6936d = true;
                m5529l(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.bl;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) >= 0 && iFindPointerIndex < motionEvent.getPointerCount()) {
                float x4 = motionEvent.getX(iFindPointerIndex);
                float f2 = x4 - this.bv;
                float fAbs = Math.abs(f2);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y4 - this.in);
                if (f2 != 0.0f && !jk(this.bv, f2) && f7l8(this, false, (int) f2, (int) x4, (int) y4)) {
                    this.bv = x4;
                    this.an = y4;
                    this.f6955w = true;
                    return false;
                }
                int i3 = this.bp;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.f6936d = true;
                    m5529l(true);
                    setScrollState(1);
                    this.bv = f2 > 0.0f ? this.id + this.bp : this.id - this.bp;
                    this.an = y4;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.f6955w = true;
                }
                if (this.f6936d && eqxt(x4)) {
                    C0683f.h7am(this);
                }
            }
        } else if (action == 6) {
            jp0y(motionEvent);
        }
        if (this.as == null) {
            this.as = VelocityTracker.obtain();
        }
        this.as.addMovement(motionEvent);
        return this.f6936d;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.OriginalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        f7l8 f7l8Var;
        f7l8 f7l8Var2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.bb = Math.min(measuredWidth / 10, this.f53676ab);
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
            if (childAt.getVisibility() != 8 && (f7l8Var2 = (f7l8) childAt.getLayoutParams()) != null && f7l8Var2.f6964k) {
                int i7 = f7l8Var2.f53678toq;
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
        this.f6934b = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f6933a = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f6956x = true;
        d2ok();
        this.f6956x = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((f7l8Var = (f7l8) childAt2.getLayoutParams()) == null || !f7l8Var.f6964k)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * f7l8Var.f53679zy), 1073741824), this.f6933a);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        C1271g c1271gFu4;
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
            if (childAt.getVisibility() == 0 && (c1271gFu4 = fu4(childAt)) != null && c1271gFu4.f53680toq == this.f6951s && childAt.requestFocus(i2, rect)) {
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
        AbstractC1288k abstractC1288k = this.f6957y;
        if (abstractC1288k != null) {
            abstractC1288k.n7h(savedState.f6959g, savedState.f6962y);
            m5535f(m5540p(this.f6957y.mo5575n(), savedState.f6961q, savedState.f6960n > 0, a9()), false, true);
        } else {
            this.f6948p = savedState.f6961q;
            this.f6940h = savedState.f6960n > 0;
            this.f6941i = savedState.f6959g;
            this.f6958z = savedState.f6962y;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6961q = this.f6951s;
        savedState.f6960n = a9() ? 1 : 0;
        AbstractC1288k abstractC1288k = this.f6957y;
        if (abstractC1288k != null) {
            savedState.f6959g = abstractC1288k.kja0();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f6938f;
            m5530r(i2, i4, i6, i6);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.OriginalViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    int m5540p(int i2, int i3, boolean z2, boolean z3) {
        return z2 == z3 ? i3 : (i2 - i3) - 1;
    }

    /* JADX INFO: renamed from: q */
    public boolean m5541q(int i2) {
        boolean z2;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zGvn7 = false;
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
                Log.e(sk1t, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i2 == 17) {
                zRequestFocus = (viewFindFocus == null || zurt(this.f6939g, viewFindNextFocus).left < zurt(this.f6939g, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : gvn7();
            } else if (i2 == 66) {
                zRequestFocus = (viewFindFocus == null || zurt(this.f6939g, viewFindNextFocus).left > zurt(this.f6939g, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : d3();
            }
            zGvn7 = zRequestFocus;
        } else if (i2 == 17 || i2 == 1) {
            zGvn7 = gvn7();
        } else if (i2 == 66 || i2 == 2) {
            zGvn7 = d3();
        }
        if (zGvn7) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zGvn7;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f6956x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@dd AbstractC1288k abstractC1288k) {
        AbstractC1288k abstractC1288k2 = this.f6957y;
        if (abstractC1288k2 != null) {
            abstractC1288k2.ki(null);
            this.f6957y.mo4275i(this);
            for (int i2 = 0; i2 < this.f6949q.size(); i2++) {
                C1271g c1271g = this.f6949q.get(i2);
                this.f6957y.toq(this, c1271g.f53680toq, c1271g.f6967k);
            }
            this.f6957y.mo4277q(this);
            this.f6949q.clear();
            dd();
            this.f6951s = 0;
            scrollTo(0, 0);
        }
        AbstractC1288k abstractC1288k3 = this.f6957y;
        this.f6957y = abstractC1288k;
        this.f6943k = 0;
        if (abstractC1288k != null) {
            if (this.f6944l == null) {
                this.f6944l = new x2();
            }
            this.f6957y.ki(this.f6944l);
            this.f53677bo = false;
            boolean z2 = this.ay;
            this.ay = true;
            this.f6943k = this.f6957y.mo5575n();
            if (this.f6948p >= 0) {
                this.f6957y.n7h(this.f6941i, this.f6958z);
                m5535f(m5540p(this.f6957y.mo5575n(), this.f6948p, this.f6940h, a9()), false, true);
                this.f6948p = -1;
                this.f6941i = null;
                this.f6958z = null;
            } else if (z2) {
                requestLayout();
            } else {
                d2ok();
            }
        }
        List<InterfaceC1276s> list = this.bu;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.bu.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.bu.get(i3).m5547k((miuix.viewpager.widget.ViewPager) this, abstractC1288k3, abstractC1288k);
        }
    }

    public void setCurrentItem(int i2) {
        this.f53677bo = false;
        m5535f(i2, !this.ay, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 2) {
            Log.w(sk1t, "Requested offscreen page limit " + i2 + " too small; defaulting to 2");
            i2 = 2;
        }
        if (i2 != this.f6954v) {
            this.f6954v = i2;
            d2ok();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1274p interfaceC1274p) {
        this.ar = interfaceC1274p;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f6938f;
        this.f6938f = i2;
        int width = getWidth();
        m5530r(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(@dd Drawable drawable) {
        this.f6935c = drawable;
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
        if (this.zmmu == i2) {
            return;
        }
        this.zmmu = i2;
        if (this.bd != null) {
            cdj(i2 != 0);
        }
        kja0(i2);
    }

    public void t8r() {
        if (!this.bq) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f6957y != null) {
            VelocityTracker velocityTracker = this.as;
            velocityTracker.computeCurrentVelocity(1000, this.az);
            int xVelocity = (int) velocityTracker.getXVelocity(this.bl);
            this.f53677bo = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1271g c1271gM5533z = m5533z();
            m5534c(x2(c1271gM5533z.f53680toq, ((scrollX / clientWidth) - c1271gM5533z.f6968n) / c1271gM5533z.f6969q, xVelocity, (int) (this.bv - this.id)), true, true, xVelocity);
        }
        ki();
        this.bq = false;
    }

    public void toq(@lvui InterfaceC1276s interfaceC1276s) {
        if (this.bu == null) {
            this.bu = new ArrayList();
        }
        this.bu.add(interfaceC1276s);
    }

    void uv6(int i2, int i3) {
        vyq(i2, i3, 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6935c;
    }

    void vyq(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        C6835q c6835q = this.f6952t;
        if ((c6835q == null || c6835q.m24806y()) ? false : true) {
            scrollX = this.f6950r ? this.f6952t.zy() : this.f6952t.m24800g();
            this.f6952t.m24801k();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i5 = i3 - scrollY;
        if (i2 - scrollX == 0 && i5 == 0) {
            m5531s(false);
            d2ok();
            setScrollState(0);
        } else {
            setScrollingCacheEnabled(true);
            setScrollState(2);
            this.f6950r = false;
            this.f6952t.m24803p(scrollX, i2, scrollY, i3, -i4);
            C0683f.h7am(this);
        }
    }

    void wvg() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f6952t = new C6835q();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.bp = viewConfiguration.getScaledPagingTouchSlop();
        this.bg = (int) (400.0f * f2);
        this.az = viewConfiguration.getScaledMaximumFlingVelocity();
        this.ad = new EdgeEffect(context);
        this.am = new EdgeEffect(context);
        this.ba = (int) (25.0f * f2);
        this.ax = (int) (2.0f * f2);
        this.f53676ab = (int) (f2 * 16.0f);
        C0683f.zwy(this, new C1277y());
        if (C0683f.m3157c(this) == 0) {
            C0683f.o05(this, 1);
        }
        C0683f.kx3(this, new C1275q());
    }

    public void x9kr(@lvui InterfaceC1276s interfaceC1276s) {
        List<InterfaceC1276s> list = this.bu;
        if (list != null) {
            list.remove(interfaceC1276s);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m5542y() {
        List<InterfaceC1274p> list = this.k0;
        if (list != null) {
            list.clear();
        }
    }

    public void zy(@lvui InterfaceC1274p interfaceC1274p) {
        if (this.k0 == null) {
            this.k0 = new ArrayList();
        }
        this.k0.add(interfaceC1274p);
    }

    public static class f7l8 extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: g */
        int f6963g;

        /* JADX INFO: renamed from: k */
        public boolean f6964k;

        /* JADX INFO: renamed from: n */
        int f6965n;

        /* JADX INFO: renamed from: q */
        boolean f6966q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f53678toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f53679zy;

        public f7l8() {
            super(-1, -1);
            this.f53679zy = 0.0f;
        }

        public f7l8(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53679zy = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OriginalViewPager.cw14);
            this.f53678toq = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f7l8(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z2, @dd ld6 ld6Var, int i2) {
        boolean z3 = ld6Var != null;
        boolean z5 = z3 != (this.bd != null);
        this.bd = ld6Var;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            this.w97r = z2 ? 2 : 1;
            this.tlhn = i2;
        } else {
            this.w97r = 0;
        }
        if (z5) {
            d2ok();
        }
    }

    public void setCurrentItem(int i2, boolean z2) {
        this.f53677bo = false;
        m5535f(i2, z2, false);
    }

    public void setPageMarginDrawable(@fn3e int i2) {
        setPageMarginDrawable(C0498q.m2259s(getContext(), i2));
    }

    public OriginalViewPager(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6949q = new ArrayList<>();
        this.f6946n = new C1271g();
        this.f6939g = new Rect();
        this.f6948p = -1;
        this.f6940h = false;
        this.f6941i = null;
        this.f6958z = null;
        this.f6947o = -3.4028235E38f;
        this.f6945m = Float.MAX_VALUE;
        this.f6954v = 2;
        this.bl = -1;
        this.ay = true;
        this.be = false;
        this.yl25 = new zy();
        this.zmmu = 0;
        wvg();
    }
}
