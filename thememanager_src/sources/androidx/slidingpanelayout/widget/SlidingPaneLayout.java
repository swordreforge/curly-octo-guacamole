package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.core.content.C0498q;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.ki;
import androidx.core.view.tfm;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C0779q;
import androidx.slidingpanelayout.widget.C1166k;
import androidx.window.layout.t8r;
import androidx.window.layout.x2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.InterfaceC7833l;
import zy.dd;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup implements androidx.customview.widget.zy {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f52448ab = "SlidingPaneLayout";
    public static final int an = 1;
    private static final int bb = 400;
    private static boolean bl = false;
    private static final String bp = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int bv = 0;
    public static final int id = 2;
    public static final int in = 3;

    /* JADX INFO: renamed from: a */
    private int f6293a;

    /* JADX INFO: renamed from: b */
    final ArrayList<zy> f6294b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private C1166k f52449bo;

    /* JADX INFO: renamed from: c */
    @dd
    private InterfaceC1161g f6295c;

    /* JADX INFO: renamed from: d */
    private Field f6296d;

    /* JADX INFO: renamed from: e */
    final C0779q f6297e;

    /* JADX INFO: renamed from: f */
    private final List<InterfaceC1161g> f6298f;

    /* JADX INFO: renamed from: g */
    private Drawable f6299g;

    /* JADX INFO: renamed from: h */
    private float f6300h;

    /* JADX INFO: renamed from: i */
    int f6301i;

    /* JADX INFO: renamed from: j */
    boolean f6302j;

    /* JADX INFO: renamed from: k */
    private int f6303k;

    /* JADX INFO: renamed from: l */
    private float f6304l;

    /* JADX INFO: renamed from: m */
    private final Rect f6305m;

    /* JADX INFO: renamed from: n */
    private Drawable f6306n;

    /* JADX INFO: renamed from: o */
    private boolean f6307o;

    /* JADX INFO: renamed from: p */
    float f6308p;

    /* JADX INFO: renamed from: q */
    private int f6309q;

    /* JADX INFO: renamed from: r */
    private float f6310r;

    /* JADX INFO: renamed from: s */
    View f6311s;

    /* JADX INFO: renamed from: t */
    private int f6312t;

    /* JADX INFO: renamed from: u */
    private C1166k.k f6313u;

    /* JADX INFO: renamed from: v */
    private Method f6314v;

    /* JADX INFO: renamed from: w */
    private boolean f6315w;

    /* JADX INFO: renamed from: x */
    x2 f6316x;

    /* JADX INFO: renamed from: y */
    private boolean f6317y;

    /* JADX INFO: renamed from: z */
    boolean f6318z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: n */
        int f6319n;

        /* JADX INFO: renamed from: q */
        boolean f6320q;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f6320q ? 1 : 0);
            parcel.writeInt(this.f6319n);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6320q = parcel.readInt() != 0;
            this.f6319n = parcel.readInt();
        }
    }

    public static class f7l8 implements InterfaceC1161g {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.InterfaceC1161g
        /* JADX INFO: renamed from: k */
        public void mo4685k(@lvui View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.InterfaceC1161g
        public void toq(@lvui View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.InterfaceC1161g
        public void zy(@lvui View view, float f2) {
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$g */
    public interface InterfaceC1161g {
        /* JADX INFO: renamed from: k */
        void mo4685k(@lvui View view);

        void toq(@lvui View view);

        void zy(@lvui View view, float f2);
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$k */
    class C1162k implements C1166k.k {
        C1162k() {
        }

        @Override // androidx.slidingpanelayout.widget.C1166k.k
        /* JADX INFO: renamed from: k */
        public void mo5256k(@lvui x2 x2Var) {
            SlidingPaneLayout.this.f6316x = x2Var;
            androidx.transition.f7l8 f7l8Var = new androidx.transition.f7l8();
            f7l8Var.gyi(300L);
            f7l8Var.xwq3(androidx.core.view.animation.toq.toq(0.2f, 0.0f, 0.0f, 1.0f));
            androidx.transition.lvui.toq(SlidingPaneLayout.this, f7l8Var);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$q */
    private class C1164q extends C0779q.zy {
        C1164q() {
        }

        private boolean n7h() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f6318z || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: g */
        public void mo3750g(int i2, int i3) {
            if (n7h()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f6297e.m3747q(slidingPaneLayout.f6311s, i3);
            }
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: k */
        public int mo3751k(View view, int i2, int i3) {
            C1163n c1163n = (C1163n) SlidingPaneLayout.this.f6311s.getLayoutParams();
            if (SlidingPaneLayout.this.n7h()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1163n).rightMargin) + SlidingPaneLayout.this.f6311s.getWidth());
                return Math.max(Math.min(i2, width), width - SlidingPaneLayout.this.f6301i);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1163n).leftMargin;
            return Math.min(Math.max(i2, paddingLeft), SlidingPaneLayout.this.f6301i + paddingLeft);
        }

        @Override // androidx.customview.widget.C0779q.zy
        public void ld6(View view, int i2, int i3, int i4, int i5) {
            SlidingPaneLayout.this.cdj(i2);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: p */
        public void mo3753p(int i2) {
            if (SlidingPaneLayout.this.f6297e.fti() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f6308p != 1.0f) {
                    slidingPaneLayout.f7l8(slidingPaneLayout.f6311s);
                    SlidingPaneLayout.this.f6302j = true;
                } else {
                    slidingPaneLayout.wvg(slidingPaneLayout.f6311s);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.m5250g(slidingPaneLayout2.f6311s);
                    SlidingPaneLayout.this.f6302j = false;
                }
            }
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: q */
        public int mo3754q(View view) {
            return SlidingPaneLayout.this.f6301i;
        }

        @Override // androidx.customview.widget.C0779q.zy
        public boolean qrj(View view, int i2) {
            if (n7h()) {
                return ((C1163n) view.getLayoutParams()).f52450toq;
            }
            return false;
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: s */
        public void mo3755s(View view, int i2) {
            SlidingPaneLayout.this.zurt();
        }

        @Override // androidx.customview.widget.C0779q.zy
        public int toq(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C0779q.zy
        public void x2(View view, float f2, float f3) {
            int paddingLeft;
            C1163n c1163n = (C1163n) view.getLayoutParams();
            if (SlidingPaneLayout.this.n7h()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1163n).rightMargin;
                if (f2 < 0.0f || (f2 == 0.0f && SlidingPaneLayout.this.f6308p > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f6301i;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f6311s.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) c1163n).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f2 > 0.0f || (f2 == 0.0f && SlidingPaneLayout.this.f6308p > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f6301i;
                }
            }
            SlidingPaneLayout.this.f6297e.m3742c(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: y */
        public void mo3756y(int i2, int i3) {
            if (n7h()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f6297e.m3747q(slidingPaneLayout.f6311s, i3);
            }
        }
    }

    class toq extends C0701k {

        /* JADX INFO: renamed from: k */
        private final Rect f6326k = new Rect();

        toq() {
        }

        /* JADX INFO: renamed from: k */
        private void m5257k(ki kiVar, ki kiVar2) {
            Rect rect = this.f6326k;
            kiVar2.m3050i(rect);
            kiVar.r8s8(rect);
            kiVar.b8(kiVar2.ikck());
            kiVar.ebn(kiVar2.m3057r());
            kiVar.sok(kiVar2.ni7());
            kiVar.yqrt(kiVar2.wvg());
            kiVar.bz2(kiVar2.m3061x());
            kiVar.cfr(kiVar2.bf2());
            kiVar.jz5(kiVar2.ch());
            kiVar.ktq(kiVar2.nmn5());
            kiVar.zsr0(kiVar2.yz());
            kiVar.bap7(kiVar2.dr());
            kiVar.wx16(kiVar2.m3059u());
            kiVar.m3052k(kiVar2.m3049h());
            kiVar.m28242do(kiVar2.d2ok());
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.bp);
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            ki kiVarQkj8 = ki.qkj8(kiVar);
            super.onInitializeAccessibilityNodeInfo(view, kiVarQkj8);
            m5257k(kiVar, kiVarQkj8);
            kiVarQkj8.tfm();
            kiVar.sok(SlidingPaneLayout.bp);
            kiVar.wlev(view);
            Object objA98o = C0683f.a98o(view);
            if (objA98o instanceof View) {
                kiVar.ij((View) objA98o);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i2);
                if (!toq(childAt) && childAt.getVisibility() == 0) {
                    C0683f.o05(childAt, 1);
                    kiVar.zy(childAt);
                }
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (toq(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean toq(View view) {
            return SlidingPaneLayout.this.qrj(view);
        }
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$y */
    private static class C1165y extends FrameLayout {
        C1165y(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    private class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final View f6327k;

        zy(View view) {
            this.f6327k = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6327k.getParent() == SlidingPaneLayout.this) {
                this.f6327k.setLayerType(0, null);
                SlidingPaneLayout.this.x2(this.f6327k);
            }
            SlidingPaneLayout.this.f6294b.remove(this);
        }
    }

    static {
        bl = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@lvui Context context) {
        this(context, null);
    }

    private androidx.core.graphics.x2 getSystemGestureInsets() {
        tfm tfmVarM3178x;
        if (!bl || (tfmVarM3178x = C0683f.m3178x(this)) == null) {
            return null;
        }
        return tfmVarM3178x.n7h();
    }

    /* JADX INFO: renamed from: h */
    private static int m5244h(@lvui View view, int i2, int i3) {
        C1163n c1163n = (C1163n) view.getLayoutParams();
        return ((ViewGroup.MarginLayoutParams) c1163n).width == 0 && (c1163n.f6323k > 0.0f ? 1 : (c1163n.f6323k == 0.0f ? 0 : -1)) > 0 ? ViewGroup.getChildMeasureSpec(i2, i3, ((ViewGroup.MarginLayoutParams) c1163n).height) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    /* JADX INFO: renamed from: i */
    private void m5245i(float f2) {
        boolean zN7h = n7h();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.f6311s) {
                float f3 = 1.0f - this.f6300h;
                int i3 = this.f6312t;
                this.f6300h = f2;
                int i4 = ((int) (f3 * i3)) - ((int) ((1.0f - f2) * i3));
                if (zN7h) {
                    i4 = -i4;
                }
                childAt.offsetLeftAndRight(i4);
            }
        }
    }

    private static int ld6(View view) {
        return view instanceof C1165y ? C0683f.ek5k(((C1165y) view).getChildAt(0)) : C0683f.ek5k(view);
    }

    /* JADX INFO: renamed from: n */
    private boolean m5246n(int i2) {
        if (!this.f6317y) {
            this.f6302j = false;
        }
        if (!this.f6307o && !m5254z(1.0f, i2)) {
            return false;
        }
        this.f6302j = false;
        return true;
    }

    private ArrayList<Rect> o1t() {
        Rect rectM5247p;
        x2 x2Var = this.f6316x;
        if (x2Var == null || !x2Var.mo5721k() || this.f6316x.getBounds().left == 0 || this.f6316x.getBounds().top != 0 || (rectM5247p = m5247p(this.f6316x, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rectM5247p.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, rectM5247p.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    /* JADX INFO: renamed from: p */
    private static Rect m5247p(@lvui x2 x2Var, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        Rect rect = new Rect(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(x2Var.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    @dd
    /* JADX INFO: renamed from: s */
    private static Activity m5248s(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private void setFoldingFeatureObserver(C1166k c1166k) {
        this.f52449bo = c1166k;
        c1166k.m5260g(this.f6313u);
    }

    /* JADX INFO: renamed from: t */
    private static boolean m5249t(View view) {
        return view.isOpaque();
    }

    private boolean t8r(int i2) {
        if (!this.f6317y) {
            this.f6302j = true;
        }
        if (!this.f6307o && !m5254z(0.0f, i2)) {
            return false;
        }
        this.f6302j = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(@lvui View view, int i2, @dd ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new C1165y(view), i2, layoutParams);
        } else {
            super.addView(view, i2, layoutParams);
        }
    }

    void cdj(int i2) {
        if (this.f6311s == null) {
            this.f6308p = 0.0f;
            return;
        }
        boolean zN7h = n7h();
        C1163n c1163n = (C1163n) this.f6311s.getLayoutParams();
        int width = this.f6311s.getWidth();
        if (zN7h) {
            i2 = (getWidth() - i2) - width;
        }
        float paddingRight = (i2 - ((zN7h ? getPaddingRight() : getPaddingLeft()) + (zN7h ? ((ViewGroup.MarginLayoutParams) c1163n).rightMargin : ((ViewGroup.MarginLayoutParams) c1163n).leftMargin))) / this.f6301i;
        this.f6308p = paddingRight;
        if (this.f6312t != 0) {
            m5245i(paddingRight);
        }
        m5253y(this.f6311s);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1163n) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.zy
    public void close() {
        m5252q();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f6297e.kja0(true)) {
            if (this.f6317y) {
                C0683f.h7am(this);
            } else {
                this.f6297e.m3745k();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int right;
        super.draw(canvas);
        Drawable drawable = n7h() ? this.f6299g : this.f6306n;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (n7h()) {
            right = childAt.getRight();
            i2 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i2 = left;
            right = i3;
        }
        drawable.setBounds(right, top, i2, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        if (n7h() ^ isOpen()) {
            this.f6297e.hyr(1);
            androidx.core.graphics.x2 systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                C0779q c0779q = this.f6297e;
                c0779q.n5r1(Math.max(c0779q.wvg(), systemGestureInsets.f3600k));
            }
        } else {
            this.f6297e.hyr(2);
            androidx.core.graphics.x2 systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                C0779q c0779q2 = this.f6297e;
                c0779q2.n5r1(Math.max(c0779q2.wvg(), systemGestureInsets2.f50490zy));
            }
        }
        C1163n c1163n = (C1163n) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f6317y && !c1163n.f52450toq && this.f6311s != null) {
            canvas.getClipBounds(this.f6305m);
            if (n7h()) {
                Rect rect = this.f6305m;
                rect.left = Math.max(rect.left, this.f6311s.getRight());
            } else {
                Rect rect2 = this.f6305m;
                rect2.right = Math.min(rect2.right, this.f6311s.getLeft());
            }
            canvas.clipRect(this.f6305m);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    void f7l8(@lvui View view) {
        Iterator<InterfaceC1161g> it = this.f6298f.iterator();
        while (it.hasNext()) {
            it.next().mo4685k(view);
        }
        sendAccessibilityEvent(32);
    }

    public void fn3e(@lvui InterfaceC1161g interfaceC1161g) {
        this.f6298f.remove(interfaceC1161g);
    }

    @Deprecated
    public void fu4() {
        ki();
    }

    /* JADX INFO: renamed from: g */
    void m5250g(@lvui View view) {
        Iterator<InterfaceC1161g> it = this.f6298f.iterator();
        while (it.hasNext()) {
            it.next().toq(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1163n();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1163n((ViewGroup.MarginLayoutParams) layoutParams) : new C1163n(layoutParams);
    }

    @zy.x2
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f6309q;
    }

    public final int getLockMode() {
        return this.f6293a;
    }

    @InterfaceC7833l
    public int getParallaxDistance() {
        return this.f6312t;
    }

    @zy.x2
    @Deprecated
    public int getSliderFadeColor() {
        return this.f6303k;
    }

    @Override // androidx.customview.widget.zy
    public boolean isOpen() {
        return !this.f6317y || this.f6308p == 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public void m5251k(@lvui InterfaceC1161g interfaceC1161g) {
        this.f6298f.add(interfaceC1161g);
    }

    public boolean ki() {
        return t8r(0);
    }

    public boolean kja0() {
        return this.f6317y;
    }

    boolean n7h() {
        return C0683f.m3159e(this) == 1;
    }

    @Deprecated
    public void ni7() {
        m5252q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity activityM5248s;
        super.onAttachedToWindow();
        this.f6307o = true;
        if (this.f52449bo == null || (activityM5248s = m5248s(getContext())) == null) {
            return;
        }
        this.f52449bo.m5261n(activityM5248s);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6307o = true;
        C1166k c1166k = this.f52449bo;
        if (c1166k != null) {
            c1166k.f7l8();
        }
        int size = this.f6294b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6294b.get(i2).run();
        }
        this.f6294b.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f6317y && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f6302j = this.f6297e.d2ok(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f6317y || (this.f6318z && actionMasked != 0)) {
            this.f6297e.zy();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f6297e.zy();
            return false;
        }
        if (actionMasked == 0) {
            this.f6318z = false;
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.f6310r = x3;
            this.f6304l = y3;
            if (this.f6297e.d2ok(this.f6311s, (int) x3, (int) y3) && qrj(this.f6311s)) {
                z2 = true;
            }
            return this.f6297e.lrht(motionEvent) || z2;
        }
        if (actionMasked == 2) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            float fAbs = Math.abs(x4 - this.f6310r);
            float fAbs2 = Math.abs(y4 - this.f6304l);
            if (fAbs > this.f6297e.a9() && fAbs2 > fAbs) {
                this.f6297e.zy();
                this.f6318z = true;
                return false;
            }
        }
        z2 = false;
        if (this.f6297e.lrht(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean zN7h = n7h();
        int i11 = i4 - i2;
        int paddingRight = zN7h ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zN7h ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f6307o) {
            this.f6308p = (this.f6317y && this.f6302j) ? 0.0f : 1.0f;
        }
        int i12 = paddingRight;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                i6 = i12;
            } else {
                C1163n c1163n = (C1163n) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c1163n.f52450toq) {
                    int i14 = i11 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i14) - i12) - (((ViewGroup.MarginLayoutParams) c1163n).leftMargin + ((ViewGroup.MarginLayoutParams) c1163n).rightMargin);
                    this.f6301i = iMin;
                    int i15 = zN7h ? ((ViewGroup.MarginLayoutParams) c1163n).rightMargin : ((ViewGroup.MarginLayoutParams) c1163n).leftMargin;
                    c1163n.f52451zy = ((i12 + i15) + iMin) + (measuredWidth / 2) > i14;
                    int i16 = (int) (iMin * this.f6308p);
                    this.f6308p = i16 / iMin;
                    i6 = i12 + i15 + i16;
                    i7 = 0;
                } else if (!this.f6317y || (i8 = this.f6312t) == 0) {
                    i6 = paddingRight;
                    i7 = 0;
                } else {
                    i7 = (int) ((1.0f - this.f6308p) * i8);
                    i6 = paddingRight;
                }
                if (zN7h) {
                    i10 = (i11 - i6) + i7;
                    i9 = i10 - measuredWidth;
                } else {
                    i9 = i6 - i7;
                    i10 = i9 + measuredWidth;
                }
                childAt.layout(i9, paddingTop, i10, childAt.getMeasuredHeight() + paddingTop);
                x2 x2Var = this.f6316x;
                paddingRight += childAt.getWidth() + Math.abs((x2Var != null && x2Var.toq() == x2.toq.f53764zy && this.f6316x.mo5721k()) ? this.f6316x.getBounds().width() : 0);
            }
            i13++;
            i12 = i6;
        }
        if (this.f6307o) {
            if (this.f6317y && this.f6312t != 0) {
                m5245i(this.f6308p);
            }
            wvg(this.f6311s);
        }
        this.f6307o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[PHI: r15
      0x0086: PHI (r15v5 float) = (r15v1 float), (r15v6 float) binds: [B:19:0x007d, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f6320q) {
            ki();
        } else {
            m5252q();
        }
        this.f6302j = savedState.f6320q;
        setLockMode(savedState.f6319n);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6320q = kja0() ? isOpen() : this.f6302j;
        savedState.f6319n = this.f6293a;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.f6307o = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6317y) {
            return super.onTouchEvent(motionEvent);
        }
        this.f6297e.lvui(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.f6310r = x3;
            this.f6304l = y3;
        } else if (actionMasked == 1 && qrj(this.f6311s)) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            float f2 = x4 - this.f6310r;
            float f3 = y4 - this.f6304l;
            int iA9 = this.f6297e.a9();
            if ((f2 * f2) + (f3 * f3) < iA9 * iA9 && this.f6297e.d2ok(this.f6311s, (int) x4, (int) y4)) {
                m5246n(0);
            }
        }
        return true;
    }

    @Override // androidx.customview.widget.zy
    public void open() {
        ki();
    }

    /* JADX INFO: renamed from: q */
    public boolean m5252q() {
        return m5246n(0);
    }

    boolean qrj(View view) {
        if (view == null) {
            return false;
        }
        return this.f6317y && ((C1163n) view.getLayoutParams()).f52451zy && this.f6308p > 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@lvui View view) {
        if (view.getParent() instanceof C1165y) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f6317y) {
            return;
        }
        this.f6302j = view == this.f6311s;
    }

    @Deprecated
    public void setCoveredFadeColor(@zy.x2 int i2) {
        this.f6309q = i2;
    }

    public final void setLockMode(int i2) {
        this.f6293a = i2;
    }

    @Deprecated
    public void setPanelSlideListener(@dd InterfaceC1161g interfaceC1161g) {
        InterfaceC1161g interfaceC1161g2 = this.f6295c;
        if (interfaceC1161g2 != null) {
            fn3e(interfaceC1161g2);
        }
        if (interfaceC1161g != null) {
            m5251k(interfaceC1161g);
        }
        this.f6295c = interfaceC1161g;
    }

    public void setParallaxDistance(@InterfaceC7833l int i2) {
        this.f6312t = i2;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@dd Drawable drawable) {
        this.f6306n = drawable;
    }

    public void setShadowDrawableRight(@dd Drawable drawable) {
        this.f6299g = drawable;
    }

    @Deprecated
    public void setShadowResource(@fn3e int i2) {
        setShadowDrawableLeft(getResources().getDrawable(i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(C0498q.m2259s(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(C0498q.m2259s(getContext(), i2));
    }

    @Deprecated
    public void setSliderFadeColor(@zy.x2 int i2) {
        this.f6303k = i2;
    }

    protected boolean toq(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && toq(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z2) {
            if (view.canScrollHorizontally(n7h() ? i2 : -i2)) {
                return true;
            }
        }
        return false;
    }

    void wvg(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z2;
        View view2 = view;
        boolean zN7h = n7h();
        int width = zN7h ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zN7h ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m5249t(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount && (childAt = getChildAt(i2)) != view2) {
            if (childAt.getVisibility() == 8) {
                z2 = zN7h;
            } else {
                z2 = zN7h;
                childAt.setVisibility((Math.max(zN7h ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zN7h ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i2++;
            view2 = view;
            zN7h = z2;
        }
    }

    void x2(View view) {
        C0683f.b8(view, ((C1163n) view.getLayoutParams()).f6324q);
    }

    /* JADX INFO: renamed from: y */
    void m5253y(@lvui View view) {
        Iterator<InterfaceC1161g> it = this.f6298f.iterator();
        while (it.hasNext()) {
            it.next().zy(view, this.f6308p);
        }
    }

    /* JADX INFO: renamed from: z */
    boolean m5254z(float f2, int i2) {
        int paddingLeft;
        if (!this.f6317y) {
            return false;
        }
        boolean zN7h = n7h();
        C1163n c1163n = (C1163n) this.f6311s.getLayoutParams();
        if (zN7h) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1163n).rightMargin) + (f2 * this.f6301i)) + this.f6311s.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1163n).leftMargin + (f2 * this.f6301i));
        }
        C0779q c0779q = this.f6297e;
        View view = this.f6311s;
        if (!c0779q.uv6(view, paddingLeft, view.getTop())) {
            return false;
        }
        zurt();
        C0683f.h7am(this);
        return true;
    }

    void zurt() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public boolean zy() {
        return this.f6317y;
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$n */
    public static class C1163n extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: n */
        private static final int[] f6322n = {R.attr.layout_weight};

        /* JADX INFO: renamed from: k */
        public float f6323k;

        /* JADX INFO: renamed from: q */
        Paint f6324q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f52450toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f52451zy;

        public C1163n() {
            super(-1, -1);
            this.f6323k = 0.0f;
        }

        public C1163n(int i2, int i3) {
            super(i2, i3);
            this.f6323k = 0.0f;
        }

        public C1163n(@lvui ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6323k = 0.0f;
        }

        public C1163n(@lvui ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6323k = 0.0f;
        }

        public C1163n(@lvui C1163n c1163n) {
            super((ViewGroup.MarginLayoutParams) c1163n);
            this.f6323k = 0.0f;
            this.f6323k = c1163n.f6323k;
        }

        public C1163n(@lvui Context context, @dd AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6323k = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6322n);
            this.f6323k = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6303k = 0;
        this.f6308p = 1.0f;
        this.f6298f = new CopyOnWriteArrayList();
        this.f6307o = true;
        this.f6305m = new Rect();
        this.f6294b = new ArrayList<>();
        this.f6313u = new C1162k();
        float f2 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C0683f.zwy(this, new toq());
        C0683f.o05(this, 1);
        C0779q c0779qM3735h = C0779q.m3735h(this, 0.5f, new C1164q());
        this.f6297e = c0779qM3735h;
        c0779qM3735h.m3743f(f2 * 400.0f);
        setFoldingFeatureObserver(new C1166k(t8r.toq(context), C0498q.x2(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1163n(getContext(), attributeSet);
    }
}
