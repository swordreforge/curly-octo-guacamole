package miuix.nestedheader.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.fti;
import androidx.core.view.gvn7;
import androidx.core.view.jk;
import androidx.core.view.oc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qh4d.C7616q;
import qh4d.InterfaceC7613g;
import qh4d.InterfaceC7614k;
import qh4d.InterfaceC7615n;
import xzl.toq;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class NestedScrollingLayout extends FrameLayout implements gvn7, jk, qh4d.toq, InterfaceC7614k {
    private static final String bg = "NestedScrollingLayout";

    /* JADX INFO: renamed from: a */
    private final oc f40668a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private long f87857ab;
    private boolean an;
    private List<toq> as;

    /* JADX INFO: renamed from: b */
    protected int f40669b;
    private boolean bb;
    private InterfaceC7613g bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f87858bo;
    private boolean bp;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    protected boolean f40670c;

    /* JADX INFO: renamed from: d */
    private boolean f40671d;

    /* JADX INFO: renamed from: e */
    protected float f40672e;

    /* JADX INFO: renamed from: f */
    protected boolean f40673f;

    /* JADX INFO: renamed from: g */
    protected Boolean f40674g;

    /* JADX INFO: renamed from: h */
    protected int f40675h;

    /* JADX INFO: renamed from: i */
    protected int f40676i;
    protected boolean id;
    private int in;

    /* JADX INFO: renamed from: j */
    private int f40677j;

    /* JADX INFO: renamed from: k */
    private final int[] f40678k;

    /* JADX INFO: renamed from: l */
    private int f40679l;

    /* JADX INFO: renamed from: m */
    protected int f40680m;

    /* JADX INFO: renamed from: n */
    protected boolean f40681n;

    /* JADX INFO: renamed from: o */
    protected int f40682o;

    /* JADX INFO: renamed from: p */
    protected View f40683p;

    /* JADX INFO: renamed from: q */
    protected final int[] f40684q;

    /* JADX INFO: renamed from: r */
    private int f40685r;

    /* JADX INFO: renamed from: s */
    private int f40686s;

    /* JADX INFO: renamed from: t */
    private int f40687t;

    /* JADX INFO: renamed from: u */
    private boolean f40688u;

    /* JADX INFO: renamed from: v */
    private boolean f40689v;

    /* JADX INFO: renamed from: w */
    private long f40690w;

    /* JADX INFO: renamed from: x */
    private final fti f40691x;

    /* JADX INFO: renamed from: y */
    protected boolean f40692y;

    /* JADX INFO: renamed from: z */
    private final int[] f40693z;

    /* JADX INFO: renamed from: miuix.nestedheader.widget.NestedScrollingLayout$k */
    class C7207k implements InterfaceC7613g {
        C7207k() {
        }

        @Override // qh4d.InterfaceC7613g
        /* JADX INFO: renamed from: k */
        public void mo26156k(int i2, int i3, boolean z2) {
        }

        @Override // qh4d.InterfaceC7613g
        public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
            NestedScrollingLayout nestedScrollingLayout = NestedScrollingLayout.this;
            if (nestedScrollingLayout.f40670c) {
                NestedScrollingLayout.f7l8(nestedScrollingLayout, i3 - i5);
                if (NestedScrollingLayout.this.f40687t < NestedScrollingLayout.this.f40679l || NestedScrollingLayout.this.f40677j < 0) {
                    return;
                }
                NestedScrollingLayout nestedScrollingLayout2 = NestedScrollingLayout.this;
                nestedScrollingLayout2.f40682o = nestedScrollingLayout2.mcp(nestedScrollingLayout2.f40677j);
                NestedScrollingLayout.this.n7h();
            }
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo26128k(int i2);

        void toq(int i2);

        void zy(int i2);
    }

    public NestedScrollingLayout(Context context) {
        this(context, null);
    }

    private void cdj(int i2, int i3, @lvui int[] iArr) {
        if (this.f40687t >= getHeaderCloseProgress() && i3 > iArr[1]) {
            int iMax = Math.max(getHeaderCloseProgress(), this.f40687t - i3);
            int i4 = this.f40687t - iMax;
            this.f40687t = iMax;
            n7h();
            iArr[1] = iArr[1] + i4;
        }
    }

    static /* synthetic */ int f7l8(NestedScrollingLayout nestedScrollingLayout, int i2) {
        int i3 = nestedScrollingLayout.f40677j - i2;
        nestedScrollingLayout.f40677j = i3;
        return i3;
    }

    private void fn3e(int i2, int i3, int i4, int i5, @lvui int[] iArr, int i6) {
        boolean z2;
        int i7;
        if (i3 >= 0 || i5 == 0) {
            return;
        }
        int i8 = this.f40687t;
        int i9 = i8 - i5;
        boolean z3 = i6 == 0;
        int i10 = this.f40685r;
        boolean z5 = i9 > i10;
        boolean z6 = this.an;
        int i11 = z3 || !z6 || (z6 && !this.bp && !z3 && i8 >= (i7 = this.f40679l) && i9 >= i7) || (z6 && !z3 && this.bp && ((!(z2 = this.bb) && i9 < 0) || (z2 && (this.f40690w > this.f87857ab ? 1 : (this.f40690w == this.f87857ab ? 0 : -1)) <= 0))) ? this.f40679l : z6 && !this.bp && !z3 && z5 && i8 == i10 ? i10 : 0;
        if (this.f40692y) {
            i11 = this.f40679l;
        }
        int iMax = Math.max(i10, Math.min(i11, i9));
        int i12 = this.f40687t - iMax;
        this.f40687t = iMax;
        n7h();
        iArr[0] = iArr[0] + 0;
        iArr[1] = iArr[1] + i12;
    }

    private void gvn7(int i2) {
        Iterator<toq> it = this.as.iterator();
        while (it.hasNext()) {
            it.next().mo26128k(i2);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m26151i(int i2, int i3, @lvui int[] iArr) {
        if (i3 > iArr[1]) {
            int iMax = Math.max(0, Math.min(this.f40679l, this.f40687t - i3));
            int i4 = this.f40687t;
            int i5 = i4 - iMax;
            if (i4 == iMax || i4 < 0) {
                return;
            }
            this.f40687t = iMax;
            n7h();
            iArr[1] = iArr[1] + i5;
        }
    }

    private void jp0y(int i2) {
        Iterator<toq> it = this.as.iterator();
        while (it.hasNext()) {
            it.next().zy(i2);
        }
    }

    private void ki(int i2, int i3, @lvui int[] iArr, int[] iArr2, int i4) {
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null, i4)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int mcp(int i2) {
        int measuredHeight = getMeasuredHeight();
        return (int) (m26154t(Math.min((Math.abs(i2) * 1.0f) / measuredHeight, 1.0f), measuredHeight) * this.f40672e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n7h() {
        jk(this.f40687t);
    }

    private void o1t(int i2, int i3, @lvui int[] iArr, int i4) {
        if (i3 >= 0 || this.f40687t >= getStickyScrollToOnNested() || !this.f40681n) {
            return;
        }
        int iMax = Math.max(this.f40685r, Math.min(getStickyScrollToOnNested(), this.f40687t - i3));
        int i5 = this.f40687t - iMax;
        this.f40687t = iMax;
        n7h();
        iArr[1] = iArr[1] + i5;
    }

    /* JADX INFO: renamed from: t */
    private float m26154t(float f2, int i2) {
        double dMin = Math.min(f2, 1.0f);
        return ((float) (((Math.pow(dMin, 3.0d) / 3.0d) - Math.pow(dMin, 2.0d)) + dMin)) * i2;
    }

    private void t8r(int i2, int i3, @lvui int[] iArr) {
        if (i3 > iArr[1]) {
            int iMax = Math.max(getScrollingFrom(), Math.min(this.f40679l, this.f40687t - i3));
            int i4 = this.f40687t - iMax;
            this.f40687t = iMax;
            n7h();
            iArr[1] = iArr[1] + i4;
        }
    }

    private void wvg(int i2) {
        Iterator<toq> it = this.as.iterator();
        while (it.hasNext()) {
            it.next().toq(i2);
        }
    }

    private void zurt(int i2, int i3, @lvui int[] iArr, int i4) {
        if (i3 >= 0 || this.f40687t >= getHeaderProgressTo()) {
            return;
        }
        int iMax = Math.max(this.f40685r, Math.min(getHeaderProgressTo(), this.f40687t - i3));
        int i5 = this.f40687t - iMax;
        this.f40687t = iMax;
        n7h();
        iArr[1] = iArr[1] + i5;
    }

    public void a9(boolean z2, int i2, int i3, int i4, int i5) {
        n7h();
    }

    public void d3(boolean z2) {
        if (!this.bb && z2) {
            this.f40690w = SystemClock.elapsedRealtime();
        }
        this.bb = z2;
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedPreScroll(int i2, int i3, @dd int[] iArr, @dd int[] iArr2, int i4) {
        return this.f40691x.mo3268q(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6) {
        return this.f40691x.f7l8(i2, i3, i4, i5, iArr, i6);
    }

    public void fti(toq toqVar) {
        this.as.remove(toqVar);
    }

    @Override // androidx.core.view.jp0y
    public void fu4(@lvui View view, int i2, int i3, int i4, int i5, int i6) {
        ni7(view, i2, i3, i4, i5, 0, this.f40678k);
    }

    public boolean getAcceptedNestedFlingInConsumedProgress() {
        return this.f40688u;
    }

    protected int getHeaderCloseProgress() {
        return this.f40681n ? this.f40685r + this.f40675h : this.f40685r;
    }

    protected int getHeaderProgressFrom() {
        return this.f40681n ? this.f40685r + this.f40675h : this.f40685r;
    }

    protected int getHeaderProgressTo() {
        return this.f40681n ? this.f40685r + this.f40675h : this.f40685r;
    }

    public int getNestedScrollableValue() {
        return getScrollingFrom();
    }

    public int getScrollType() {
        return this.in;
    }

    protected int getScrollableViewMaxHeightWithoutOverlay() {
        return getMeasuredHeight() - this.f40675h;
    }

    public int getScrollingFrom() {
        return this.f40685r;
    }

    public int getScrollingProgress() {
        return this.f40687t;
    }

    public int getScrollingTo() {
        return this.f40679l;
    }

    protected int getStickyScrollToOnNested() {
        return this.f40685r + this.f40675h;
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: h */
    public void mo419h(@lvui View view, int i2, int i3, @lvui int[] iArr, int i4) {
        if (i4 != 0) {
            if (!this.f40688u) {
                this.f87857ab = SystemClock.elapsedRealtime();
            }
            this.f40688u = true;
        } else {
            this.f87858bo = true;
        }
        m26151i(i2, i3, iArr);
        if (this.id) {
            cdj(i2, i3, iArr);
        }
        ki(i2, i3, iArr, this.f40693z, i4);
        t8r(i2, i3, iArr);
    }

    @Override // androidx.core.view.mcp
    public boolean hasNestedScrollingParent(int i2) {
        return this.f40691x.x2(i2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean isNestedScrollingEnabled() {
        return this.f40691x.qrj();
    }

    protected void jk(int i2) {
    }

    /* JADX INFO: renamed from: k */
    public void mo26141k(int i2, int i3) {
        this.f40680m = i2;
        this.f40669b = i3;
    }

    @Override // androidx.core.view.jp0y
    public void kja0(@lvui View view, int i2) {
        this.f40668a.m3398n(view, i2);
        gvn7(i2);
        stopNestedScroll(i2);
        boolean z2 = true;
        if (this.f87858bo) {
            this.f87858bo = false;
            if (this.f40688u || this.f40689v) {
                z2 = false;
            }
        } else if (this.f40688u) {
            this.f40688u = false;
        }
        if (z2) {
            wvg(i2);
        }
    }

    @Override // androidx.core.view.jp0y
    public void ld6(@lvui View view, @lvui View view2, int i2, int i3) {
        onNestedScrollAccepted(view, view2, i2);
        if (i3 != 0) {
            this.f40689v = true;
        } else {
            this.f40689v = false;
        }
    }

    @Override // androidx.core.view.gvn7
    public void ni7(@lvui View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
        if (!this.id && !this.f40692y) {
            zurt(i4, i5, iArr, i6);
        }
        if (this.bv) {
            o1t(i4, i5, iArr, i6);
        }
        int i7 = iArr[0];
        int i8 = iArr[1];
        dispatchNestedScroll(i7, i8, i4 - i7, i5 - i8, this.f40684q, i6, iArr);
        fn3e(i4, i5, i4, i5 - iArr[1], iArr, i6);
    }

    public void oc(int i2) {
        this.f40687t = i2;
    }

    @Override // qh4d.InterfaceC7614k
    public void onContentInsetChanged(Rect rect) {
        int i2 = this.f40675h;
        int i3 = rect.top;
        if (i2 == i3 && this.f40676i == rect.bottom) {
            return;
        }
        this.f40675h = i3;
        this.f40676i = rect.bottom;
        requestLayout();
    }

    @Override // android.view.View
    @hyr(api = 21)
    protected void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(this.f40686s);
        this.f40683p = viewFindViewById;
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("The scrollableView attribute is required and must refer to a valid child.");
        }
        if (viewFindViewById instanceof InterfaceC7615n) {
            C7207k c7207k = new C7207k();
            this.bl = c7207k;
            ((InterfaceC7615n) this.f40683p).mo26728k(c7207k);
        } else {
            this.f40670c = false;
        }
        this.f40683p.setNestedScrollingEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        a9(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f40683p.getLayoutParams().height == -1) {
            if (this.f40681n) {
                if (getClipToPadding()) {
                    return;
                }
                this.f40683p.measure(View.MeasureSpec.makeMeasureSpec(this.f40683p.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            }
            this.f40683p.measure(View.MeasureSpec.makeMeasureSpec(this.f40683p.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getScrollableViewMaxHeightWithoutOverlay(), 1073741824));
            Log.d(bg, "onMeasure in NoOverlayMode mScrollableView " + this.f40683p.getMeasuredHeight() + " viewHeight " + getMeasuredHeight());
        }
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
        this.f40668a.toq(view, view2, i2);
        startNestedScroll(i2 & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        boolean z2 = (i2 & 2) != 0;
        if (this.f40691x.ki(i2)) {
            return true;
        }
        return isEnabled() && z2;
    }

    public void qrj(toq toqVar) {
        this.as.add(toqVar);
    }

    public void setEnableOverScrollTo(boolean z2) {
        if (this.f40683p instanceof InterfaceC7615n) {
            this.f40670c = z2;
        }
    }

    public void setHeaderCloseOnInit(boolean z2) {
        this.f40673f = z2;
    }

    @Override // android.view.View, androidx.core.view.a9
    public void setNestedScrollingEnabled(boolean z2) {
        this.f40691x.mo3264h(z2);
    }

    public void setOverScrollToRatio(float f2) {
        this.f40672e = f2;
    }

    public void setScrollType(@InterfaceC7208k int i2) {
        this.in = i2;
    }

    public void setScrollingRange(int i2, int i3, boolean z2, boolean z3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        if (i2 > i3) {
            Log.w(bg, "wrong scrolling range: [%d, %d], making from=to");
            i2 = i3;
        }
        this.f40685r = i2;
        this.f40679l = i3;
        this.bp = z2;
        this.an = z3;
        this.bv = z5;
        if (this.f40687t < i2) {
            this.f40687t = i2;
        }
        if (this.f40687t > i3 && i3 >= 0) {
            this.f40687t = i3;
        }
        boolean z10 = z6 && this.f40671d;
        if ((z10 || z7 || z9) && z2) {
            if (this.f40671d && this.f40673f) {
                this.f40687t = getHeaderCloseProgress();
            } else {
                this.f40687t = 0;
            }
            this.f40671d = false;
        } else if (z10 || z7) {
            this.f40687t = 0;
            this.f40671d = false;
        }
        n7h();
    }

    public void setSelfScrollFirst(boolean z2) {
        this.id = z2;
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean startNestedScroll(int i2) {
        return this.f40691x.ki(i2);
    }

    @Override // androidx.core.view.mcp
    public void stopNestedScroll(int i2) {
        this.f40691x.fn3e(i2);
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(@lvui View view, @lvui View view2, int i2, int i3) {
        jp0y(i3);
        return this.f40691x.t8r(i2, i3) || onStartNestedScroll(view, view, i2);
    }

    public NestedScrollingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.core.view.mcp
    public boolean startNestedScroll(int i2, int i3) {
        return this.f40691x.t8r(i2, i3);
    }

    @Override // android.view.View, androidx.core.view.a9
    public void stopNestedScroll() {
        this.f40691x.mo3265i();
    }

    public NestedScrollingLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40678k = new int[2];
        this.f40684q = new int[2];
        this.f40674g = null;
        this.f40693z = new int[2];
        this.f40677j = 0;
        this.f40682o = 0;
        this.f40680m = 0;
        this.f40669b = 0;
        this.f40671d = true;
        this.f40690w = 0L;
        this.f87857ab = 0L;
        this.bb = false;
        this.bp = false;
        this.bv = false;
        this.an = false;
        this.bl = null;
        this.as = new ArrayList();
        this.f40668a = new oc(this);
        this.f40691x = C7616q.zurt(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.C7770p.f100247d8wk);
        this.f40686s = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f100286py, R.id.list);
        this.id = typedArrayObtainStyledAttributes.getBoolean(toq.C7770p.f100264i9jn, true);
        this.f40673f = typedArrayObtainStyledAttributes.getBoolean(toq.C7770p.f100257g1, false);
        this.f40670c = typedArrayObtainStyledAttributes.getBoolean(toq.C7770p.f100299was, false);
        this.f40672e = typedArrayObtainStyledAttributes.getFloat(toq.C7770p.f100258gbni, 0.5f);
        this.in = typedArrayObtainStyledAttributes.getInt(toq.C7770p.f100309zsr0, 0);
        typedArrayObtainStyledAttributes.recycle();
        setNestedScrollingEnabled(true);
    }

    @Override // androidx.core.view.jk
    public void dispatchNestedScroll(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6, @lvui int[] iArr2) {
        this.f40691x.mo3267n(i2, i3, i4, i5, iArr, i6, iArr2);
    }
}
