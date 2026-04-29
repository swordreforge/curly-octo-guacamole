package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.C0263g;
import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import androidx.constraintlayout.core.widgets.C0345y;
import androidx.constraintlayout.core.widgets.analyzer.toq;
import androidx.constraintlayout.core.widgets.ld6;
import androidx.constraintlayout.core.widgets.n7h;
import androidx.constraintlayout.widget.C0394g;
import androidx.core.view.C0683f;
import java.util.ArrayList;
import java.util.HashMap;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final boolean f48448ab = true;
    private static final boolean an = false;
    private static final boolean bb = false;
    private static final boolean bp = false;
    private static final boolean bv = false;

    /* JADX INFO: renamed from: d */
    public static final String f2607d = "ConstraintLayout-2.1.4";
    public static final int id = 0;
    private static f7l8 in = null;

    /* JADX INFO: renamed from: w */
    private static final String f2608w = "ConstraintLayout";

    /* JADX INFO: renamed from: a */
    private AbstractC0396n f2609a;

    /* JADX INFO: renamed from: b */
    private SparseArray<C0341n> f2610b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f48449bo;

    /* JADX INFO: renamed from: c */
    private int f2611c;

    /* JADX INFO: renamed from: e */
    int f2612e;

    /* JADX INFO: renamed from: f */
    private int f2613f;

    /* JADX INFO: renamed from: g */
    private int f2614g;

    /* JADX INFO: renamed from: h */
    protected boolean f2615h;

    /* JADX INFO: renamed from: i */
    private int f2616i;

    /* JADX INFO: renamed from: j */
    int f2617j;

    /* JADX INFO: renamed from: k */
    SparseArray<View> f2618k;

    /* JADX INFO: renamed from: l */
    private HashMap<String, Integer> f2619l;

    /* JADX INFO: renamed from: m */
    int f2620m;

    /* JADX INFO: renamed from: n */
    protected C0339g f2621n;

    /* JADX INFO: renamed from: o */
    int f2622o;

    /* JADX INFO: renamed from: p */
    private int f2623p;

    /* JADX INFO: renamed from: q */
    private ArrayList<ConstraintHelper> f2624q;

    /* JADX INFO: renamed from: r */
    private int f2625r;

    /* JADX INFO: renamed from: s */
    private int f2626s;

    /* JADX INFO: renamed from: t */
    protected androidx.constraintlayout.widget.toq f2627t;

    /* JADX INFO: renamed from: u */
    zy f2628u;

    /* JADX INFO: renamed from: v */
    private int f2629v;

    /* JADX INFO: renamed from: x */
    private C0263g f2630x;

    /* JADX INFO: renamed from: y */
    private int f2631y;

    /* JADX INFO: renamed from: z */
    private C0397q f2632z;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$k */
    static /* synthetic */ class C0390k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f2633k;

        static {
            int[] iArr = new int[C0341n.toq.values().length];
            f2633k = iArr;
            try {
                iArr[C0341n.toq.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2633k[C0341n.toq.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2633k[C0341n.toq.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2633k[C0341n.toq.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class zy implements toq.InterfaceC7855toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        int f48565f7l8;

        /* JADX INFO: renamed from: g */
        int f2679g;

        /* JADX INFO: renamed from: k */
        ConstraintLayout f2680k;

        /* JADX INFO: renamed from: n */
        int f2681n;

        /* JADX INFO: renamed from: q */
        int f2682q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f48566toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f48567zy;

        public zy(ConstraintLayout l2) {
            this.f2680k = l2;
        }

        /* JADX INFO: renamed from: q */
        private boolean m1627q(int lastMeasureSpec, int spec, int widgetSize) {
            if (lastMeasureSpec == spec) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(lastMeasureSpec);
            View.MeasureSpec.getSize(lastMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && widgetSize == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.toq.InterfaceC7855toq
        /* JADX INFO: renamed from: k */
        public final void mo1291k() {
            int childCount = this.f2680k.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f2680k.getChildAt(i2);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).toq(this.f2680k);
                }
            }
            int size = this.f2680k.f2624q.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((ConstraintHelper) this.f2680k.f2624q.get(i3)).a9(this.f2680k);
                }
            }
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.toq.InterfaceC7855toq
        @SuppressLint({"WrongCall"})
        public final void toq(C0341n widget, toq.C0335k measure) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i2;
            int measuredHeight;
            int i3;
            if (widget == null) {
                return;
            }
            if (widget.a98o() == 8 && !widget.m1316d()) {
                measure.f2012n = 0;
                measure.f2010g = 0;
                measure.f47724f7l8 = 0;
                return;
            }
            if (widget.m1318f() == null) {
                return;
            }
            C0341n.toq toqVar = measure.f2011k;
            C0341n.toq toqVar2 = measure.f47725toq;
            int i4 = measure.f47726zy;
            int i5 = measure.f2014q;
            int i6 = this.f48566toq + this.f48567zy;
            int i7 = this.f2682q;
            View view = (View) widget.ni7();
            int[] iArr = C0390k.f2633k;
            int i8 = iArr[toqVar.ordinal()];
            if (i8 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i8 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2679g, i7, -2);
            } else if (i8 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2679g, i7 + widget.d3(), -1);
            } else if (i8 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2679g, i7, -2);
                boolean z2 = widget.f47906ni7 == 1;
                int i9 = measure.f2013p;
                if (i9 == toq.C0335k.f47723x2 || i9 == toq.C0335k.f47722qrj) {
                    if (measure.f2013p == toq.C0335k.f47722qrj || !z2 || (z2 && (view.getMeasuredHeight() == widget.jk())) || (view instanceof Placeholder) || widget.fnq8()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widget.m1313a(), 1073741824);
                    }
                }
            }
            int i10 = iArr[toqVar2.ordinal()];
            if (i10 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i10 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f48565f7l8, i6, -2);
            } else if (i10 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f48565f7l8, i6 + widget.i1(), -1);
            } else if (i10 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f48565f7l8, i6, -2);
                boolean z3 = widget.f47881fu4 == 1;
                int i11 = measure.f2013p;
                if (i11 == toq.C0335k.f47723x2 || i11 == toq.C0335k.f47722qrj) {
                    if (measure.f2013p == toq.C0335k.f47722qrj || !z3 || (z3 && (view.getMeasuredWidth() == widget.m1313a())) || (view instanceof Placeholder) || widget.qo()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(widget.jk(), 1073741824);
                    }
                }
            }
            C0339g c0339g = (C0339g) widget.m1318f();
            if (c0339g != null && ld6.toq(ConstraintLayout.this.f2616i, 256) && view.getMeasuredWidth() == widget.m1313a() && view.getMeasuredWidth() < c0339g.m1313a() && view.getMeasuredHeight() == widget.jk() && view.getMeasuredHeight() < c0339g.jk() && view.getBaseline() == widget.m1321i() && !widget.qkj8()) {
                if (m1627q(widget.oc(), iMakeMeasureSpec, widget.m1313a()) && m1627q(widget.eqxt(), iMakeMeasureSpec2, widget.jk())) {
                    measure.f2012n = widget.m1313a();
                    measure.f2010g = widget.jk();
                    measure.f47724f7l8 = widget.m1321i();
                    return;
                }
            }
            C0341n.toq toqVar3 = C0341n.toq.MATCH_CONSTRAINT;
            boolean z5 = toqVar == toqVar3;
            boolean z6 = toqVar2 == toqVar3;
            C0341n.toq toqVar4 = C0341n.toq.MATCH_PARENT;
            boolean z7 = toqVar2 == toqVar4 || toqVar2 == C0341n.toq.FIXED;
            boolean z8 = toqVar == toqVar4 || toqVar == C0341n.toq.FIXED;
            boolean z9 = z5 && widget.f47875ek5k > 0.0f;
            boolean z10 = z6 && widget.f47875ek5k > 0.0f;
            if (view == null) {
                return;
            }
            toq toqVar5 = (toq) view.getLayoutParams();
            int i12 = measure.f2013p;
            if (i12 != toq.C0335k.f47723x2 && i12 != toq.C0335k.f47722qrj && z5 && widget.f47906ni7 == 0 && z6 && widget.f47881fu4 == 0) {
                i3 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof VirtualLayout) && (widget instanceof n7h)) {
                    ((VirtualLayout) view).oc((n7h) widget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                widget.ga(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i13 = widget.f47909o1t;
                iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                int i14 = widget.f47925wvg;
                if (i14 > 0) {
                    iMax = Math.min(i14, iMax);
                }
                int i15 = widget.f47901mcp;
                if (i15 > 0) {
                    measuredHeight = Math.max(i15, measuredHeight2);
                    i2 = iMakeMeasureSpec;
                } else {
                    i2 = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i16 = widget.f47891jk;
                if (i16 > 0) {
                    measuredHeight = Math.min(i16, measuredHeight);
                }
                if (!ld6.toq(ConstraintLayout.this.f2616i, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((measuredHeight * widget.f47875ek5k) + 0.5f);
                    } else if (z10 && z8) {
                        measuredHeight = (int) ((iMax / widget.f47875ek5k) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i2;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    widget.ga(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i3 = -1;
            }
            boolean z11 = baseline != i3;
            measure.f2015s = (iMax == measure.f47726zy && measuredHeight == measure.f2014q) ? false : true;
            if (toqVar5.f48520yz) {
                z11 = true;
            }
            if (z11 && baseline != -1 && widget.m1321i() != baseline) {
                measure.f2015s = true;
            }
            measure.f2012n = iMax;
            measure.f2010g = measuredHeight;
            measure.f2016y = z11;
            measure.f47724f7l8 = baseline;
        }

        public void zy(int widthSpec, int heightSpec, int top, int bottom, int width, int height) {
            this.f48566toq = top;
            this.f48567zy = bottom;
            this.f2682q = width;
            this.f2681n = height;
            this.f2679g = widthSpec;
            this.f48565f7l8 = heightSpec;
        }
    }

    public ConstraintLayout(@lvui Context context) {
        super(context);
        this.f2618k = new SparseArray<>();
        this.f2624q = new ArrayList<>(4);
        this.f2621n = new C0339g();
        this.f2614g = 0;
        this.f2631y = 0;
        this.f2626s = Integer.MAX_VALUE;
        this.f2623p = Integer.MAX_VALUE;
        this.f2615h = true;
        this.f2616i = 257;
        this.f2632z = null;
        this.f2627t = null;
        this.f2625r = -1;
        this.f2619l = new HashMap<>();
        this.f2613f = -1;
        this.f2611c = -1;
        this.f2612e = -1;
        this.f2617j = -1;
        this.f2622o = 0;
        this.f2620m = 0;
        this.f2610b = new SparseArray<>();
        this.f2628u = new zy(this);
        this.f48449bo = 0;
        this.f2629v = 0;
        ncyb(null, 0, 0);
    }

    /* JADX INFO: renamed from: e */
    private void m1620e(C0341n widget, toq layoutParams, SparseArray<C0341n> idToWidget, int baselineTarget, C0343q.toq type) {
        View view = this.f2618k.get(baselineTarget);
        C0341n c0341n = idToWidget.get(baselineTarget);
        if (c0341n == null || view == null || !(view.getLayoutParams() instanceof toq)) {
            return;
        }
        layoutParams.f48520yz = true;
        C0343q.toq toqVar = C0343q.toq.BASELINE;
        if (type == toqVar) {
            toq toqVar2 = (toq) view.getLayoutParams();
            toqVar2.f48520yz = true;
            toqVar2.f48518y2.ebn(true);
        }
        widget.ki(toqVar).toq(c0341n.ki(type), layoutParams.f48492jk, layoutParams.f48500mcp, true);
        widget.ebn(true);
        widget.ki(C0343q.toq.TOP).fu4();
        widget.ki(C0343q.toq.BOTTOM).fu4();
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static f7l8 getSharedValues() {
        if (in == null) {
            in = new f7l8();
        }
        return in;
    }

    private void hyr() {
        this.f2615h = true;
        this.f2613f = -1;
        this.f2611c = -1;
        this.f2612e = -1;
        this.f2617j = -1;
        this.f2622o = 0;
        this.f2620m = 0;
    }

    private void ncyb(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f2621n.uj2j(this);
        this.f2621n.z617(this.f2628u);
        this.f2618k.put(getId(), this);
        this.f2632z = null;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.c4, defStyleAttr, defStyleRes);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.hfwa) {
                    this.f2614g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2614g);
                } else if (index == C0394g.qrj.dwra) {
                    this.f2631y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2631y);
                } else if (index == C0394g.qrj.g6i) {
                    this.f2626s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2626s);
                } else if (index == C0394g.qrj.u4) {
                    this.f2623p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2623p);
                } else if (index == C0394g.qrj.bz4g) {
                    this.f2616i = typedArrayObtainStyledAttributes.getInt(index, this.f2616i);
                } else if (index == C0394g.qrj.t0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1398f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2627t = null;
                        }
                    }
                } else if (index == C0394g.qrj.r8k) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0397q c0397q = new C0397q();
                        this.f2632z = c0397q;
                        c0397q.c8jq(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2632z = null;
                    }
                    this.f2625r = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2621n.xzl(this.f2616i);
    }

    private boolean nn86() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (getChildAt(i2).isLayoutRequested()) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            uv6();
        }
        return z2;
    }

    /* JADX INFO: renamed from: r */
    private final C0341n m1621r(int id2) {
        if (id2 == 0) {
            return this.f2621n;
        }
        View viewFindViewById = this.f2618k.get(id2);
        if (viewFindViewById == null && (viewFindViewById = findViewById(id2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f2621n;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((toq) viewFindViewById.getLayoutParams()).f48518y2;
    }

    private void uv6() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0341n c0341nX9kr = x9kr(getChildAt(i2));
            if (c0341nX9kr != null) {
                c0341nX9kr.ltg8();
            }
        }
        if (zIsInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m1621r(childAt.getId()).ktq(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2625r != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.f2625r && (childAt2 instanceof Constraints)) {
                    this.f2632z = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C0397q c0397q = this.f2632z;
        if (c0397q != null) {
            c0397q.m1659i(this, true);
        }
        this.f2621n.rp();
        int size = this.f2624q.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f2624q.get(i5).gvn7(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).zy(this);
            }
        }
        this.f2610b.clear();
        this.f2610b.put(0, this.f2621n);
        this.f2610b.put(getId(), this.f2621n);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.f2610b.put(childAt4.getId(), x9kr(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            C0341n c0341nX9kr2 = x9kr(childAt5);
            if (c0341nX9kr2 != null) {
                toq toqVar = (toq) childAt5.getLayoutParams();
                this.f2621n.m1307k(c0341nX9kr2);
                d3(zIsInEditMode, childAt5, c0341nX9kr2, toqVar, this.f2610b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: c */
    public void m1622c(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        zy zyVar = this.f2628u;
        int i2 = zyVar.f2681n;
        int iResolveSizeAndState = View.resolveSizeAndState(measuredWidth + zyVar.f2682q, widthMeasureSpec, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(measuredHeight + i2, heightMeasureSpec, 0);
        int i3 = iResolveSizeAndState & C0683f.f50797t8r;
        int i4 = iResolveSizeAndState2 & C0683f.f50797t8r;
        int iMin = Math.min(this.f2626s, i3);
        int iMin2 = Math.min(this.f2623p, i4);
        if (isWidthMeasuredTooSmall) {
            iMin |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f2613f = iMin;
        this.f2611c = iMin2;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof toq;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public toq generateLayoutParams(AttributeSet attrs) {
        return new toq(getContext(), attrs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d3(boolean isInEditMode, View child, C0341n widget, toq layoutParams, SparseArray<C0341n> idToWidget) {
        C0341n c0341n;
        C0341n c0341n2;
        C0341n c0341n3;
        C0341n c0341n4;
        int i2;
        layoutParams.m1625n();
        layoutParams.f48476c8jq = false;
        widget.m1330w(child.getVisibility());
        if (layoutParams.f48474bf2) {
            widget.h4b(true);
            widget.m1330w(8);
        }
        widget.uj2j(child);
        if (child instanceof ConstraintHelper) {
            ((ConstraintHelper) child).mo1375t(widget, this.f2621n.xblq());
        }
        if (layoutParams.f48519y9n) {
            C0345y c0345y = (C0345y) widget;
            int i3 = layoutParams.f48510t8iq;
            int i4 = layoutParams.f2655u;
            float f2 = layoutParams.f48475bo;
            if (f2 != -1.0f) {
                c0345y.imd(f2);
                return;
            } else if (i3 != -1) {
                c0345y.wt(i3);
                return;
            } else {
                if (i4 != -1) {
                    c0345y.g0ad(i4);
                    return;
                }
                return;
            }
        }
        int i5 = layoutParams.f48473a98o;
        int i6 = layoutParams.f2636a;
        int i7 = layoutParams.f48521zp;
        int i8 = layoutParams.f2656x;
        int i9 = layoutParams.f48478ch;
        int i10 = layoutParams.f48505nmn5;
        float f3 = layoutParams.f48498lv5;
        int i11 = layoutParams.f2642h;
        if (i11 != -1) {
            C0341n c0341n5 = idToWidget.get(i11);
            if (c0341n5 != null) {
                widget.qrj(c0341n5, layoutParams.f48494ki, layoutParams.f48477cdj);
            }
        } else {
            if (i5 != -1) {
                C0341n c0341n6 = idToWidget.get(i5);
                if (c0341n6 != null) {
                    C0343q.toq toqVar = C0343q.toq.LEFT;
                    widget.y2(toqVar, c0341n6, toqVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i9);
                }
            } else if (i6 != -1 && (c0341n = idToWidget.get(i6)) != null) {
                widget.y2(C0343q.toq.LEFT, c0341n, C0343q.toq.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i9);
            }
            if (i7 != -1) {
                C0341n c0341n7 = idToWidget.get(i7);
                if (c0341n7 != null) {
                    widget.y2(C0343q.toq.RIGHT, c0341n7, C0343q.toq.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i10);
                }
            } else if (i8 != -1 && (c0341n2 = idToWidget.get(i8)) != null) {
                C0343q.toq toqVar2 = C0343q.toq.RIGHT;
                widget.y2(toqVar2, c0341n2, toqVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i10);
            }
            int i12 = layoutParams.f2653s;
            if (i12 != -1) {
                C0341n c0341n8 = idToWidget.get(i12);
                if (c0341n8 != null) {
                    C0343q.toq toqVar3 = C0343q.toq.TOP;
                    widget.y2(toqVar3, c0341n8, toqVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f48487fu4);
                }
            } else {
                int i13 = layoutParams.f2650p;
                if (i13 != -1 && (c0341n3 = idToWidget.get(i13)) != null) {
                    widget.y2(C0343q.toq.TOP, c0341n3, C0343q.toq.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f48487fu4);
                }
            }
            int i14 = layoutParams.f48496ld6;
            if (i14 != -1) {
                C0341n c0341n9 = idToWidget.get(i14);
                if (c0341n9 != null) {
                    widget.y2(C0343q.toq.BOTTOM, c0341n9, C0343q.toq.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f48507o1t);
                }
            } else {
                int i15 = layoutParams.f48516x2;
                if (i15 != -1 && (c0341n4 = idToWidget.get(i15)) != null) {
                    C0343q.toq toqVar4 = C0343q.toq.BOTTOM;
                    widget.y2(toqVar4, c0341n4, toqVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f48507o1t);
                }
            }
            int i16 = layoutParams.f48509qrj;
            if (i16 != -1) {
                m1620e(widget, layoutParams, idToWidget, i16, C0343q.toq.BASELINE);
            } else {
                int i17 = layoutParams.f48502n7h;
                if (i17 != -1) {
                    m1620e(widget, layoutParams, idToWidget, i17, C0343q.toq.TOP);
                } else {
                    int i18 = layoutParams.f48495kja0;
                    if (i18 != -1) {
                        m1620e(widget, layoutParams, idToWidget, i18, C0343q.toq.BOTTOM);
                    }
                }
            }
            if (f3 >= 0.0f) {
                widget.nsb(f3);
            }
            float f4 = layoutParams.f48488gvn7;
            if (f4 >= 0.0f) {
                widget.b8(f4);
            }
        }
        if (isInEditMode && ((i2 = layoutParams.f48513uv6) != -1 || layoutParams.f48514vyq != -1)) {
            widget.o05(i2, layoutParams.f48514vyq);
        }
        if (layoutParams.f2647m) {
            widget.pjz9(C0341n.toq.FIXED);
            widget.m2t(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                widget.pjz9(C0341n.toq.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.f48506nn86) {
                widget.pjz9(C0341n.toq.MATCH_CONSTRAINT);
            } else {
                widget.pjz9(C0341n.toq.MATCH_PARENT);
            }
            widget.ki(C0343q.toq.LEFT).f47953f7l8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            widget.ki(C0343q.toq.RIGHT).f47953f7l8 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            widget.pjz9(C0341n.toq.MATCH_CONSTRAINT);
            widget.m2t(0);
        }
        if (layoutParams.f48482ek5k) {
            widget.ew(C0341n.toq.FIXED);
            widget.pc(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                widget.ew(C0341n.toq.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.f48489hb) {
                widget.ew(C0341n.toq.MATCH_CONSTRAINT);
            } else {
                widget.ew(C0341n.toq.MATCH_PARENT);
            }
            widget.ki(C0343q.toq.TOP).f47953f7l8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            widget.ki(C0343q.toq.BOTTOM).f47953f7l8 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            widget.ew(C0341n.toq.MATCH_CONSTRAINT);
            widget.pc(0);
        }
        widget.h7am(layoutParams.f48480d3);
        widget.lh(layoutParams.f48479d2ok);
        widget.kx3(layoutParams.f48499lvui);
        widget.zwy(layoutParams.f2652r);
        widget.nme(layoutParams.f48481dd);
        widget.ps(layoutParams.f2649o);
        widget.ngy(layoutParams.f48517x9kr, layoutParams.f2646l, layoutParams.f48490hyr, layoutParams.f2638c);
        widget.ix(layoutParams.f48503ncyb, layoutParams.f48501n5r1, layoutParams.f2640f, layoutParams.f48497lrht);
    }

    public View dd(int id2) {
        return this.f2618k.get(id2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f2624q;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f2624q.get(i2).fti(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i7;
                        float f3 = i8;
                        float f4 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: eqxt, reason: merged with bridge method [inline-methods] */
    public toq generateDefaultLayoutParams() {
        return new toq(-2, -2);
    }

    /* JADX INFO: renamed from: f */
    protected void mo1398f(int id2) {
        this.f2627t = new androidx.constraintlayout.widget.toq(getContext(), this, id2);
    }

    @Override // android.view.View
    public void forceLayout() {
        hyr();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f2623p;
    }

    public int getMaxWidth() {
        return this.f2626s;
    }

    public int getMinHeight() {
        return this.f2631y;
    }

    public int getMinWidth() {
        return this.f2614g;
    }

    public int getOptimizationLevel() {
        return this.f2621n.xm();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb = new StringBuilder();
        if (this.f2621n.f47894kja0 == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f2621n.f47894kja0 = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f2621n.f47894kja0 = "parent";
            }
        }
        if (this.f2621n.m1332z() == null) {
            C0339g c0339g = this.f2621n;
            c0339g.ktq(c0339g.f47894kja0);
            Log.v(f2608w, " setDebugName " + this.f2621n.m1332z());
        }
        for (C0341n c0341n : this.f2621n.bih()) {
            View view = (View) c0341n.ni7();
            if (view != null) {
                if (c0341n.f47894kja0 == null && (id2 = view.getId()) != -1) {
                    c0341n.f47894kja0 = getContext().getResources().getResourceEntryName(id2);
                }
                if (c0341n.m1332z() == null) {
                    c0341n.ktq(c0341n.f47894kja0);
                    Log.v(f2608w, " setDebugName " + c0341n.m1332z());
                }
            }
        }
        this.f2621n.hb(sb);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: l */
    public boolean m1623l() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lrht(C0339g layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i2 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f2628u.zy(widthMeasureSpec, heightMeasureSpec, iMax, iMax2, paddingWidth, i2);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? m1623l() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i3 = size - paddingWidth;
        int i4 = size2 - i2;
        vyq(layout, mode, i3, mode2, i4);
        layout.xtb7(optimizationLevel, mode, i3, mode2, i4, this.f2613f, this.f2611c, iMax5, iMax);
    }

    public Object lvui(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String str = (String) value;
        HashMap<String, Integer> map = this.f2619l;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f2619l.get(str);
    }

    public void n5r1(int layoutDescription) {
        if (layoutDescription == 0) {
            this.f2627t = null;
            return;
        }
        try {
            this.f2627t = new androidx.constraintlayout.widget.toq(getContext(), this, layoutDescription);
        } catch (Resources.NotFoundException unused) {
            this.f2627t = null;
        }
    }

    public void oc(C0263g metrics) {
        this.f2630x = metrics;
        this.f2621n.gb(metrics);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            toq toqVar = (toq) childAt.getLayoutParams();
            C0341n c0341n = toqVar.f48518y2;
            if ((childAt.getVisibility() != 8 || toqVar.f48519y9n || toqVar.f2637b || toqVar.f48491i1 || zIsInEditMode) && !toqVar.f48474bf2) {
                int iM1331x = c0341n.m1331x();
                int iCh = c0341n.ch();
                int iM1313a = c0341n.m1313a() + iM1331x;
                int iJk = c0341n.jk() + iCh;
                childAt.layout(iM1331x, iCh, iM1313a, iJk);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM1331x, iCh, iM1313a, iJk);
                }
            }
        }
        int size = this.f2624q.size();
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                this.f2624q.get(i3).jk(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f48449bo == widthMeasureSpec) {
            int i2 = this.f2629v;
        }
        if (!this.f2615h) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.f2615h = true;
                    break;
                }
                i3++;
            }
        }
        boolean z2 = this.f2615h;
        this.f48449bo = widthMeasureSpec;
        this.f2629v = heightMeasureSpec;
        this.f2621n.c25(m1623l());
        if (this.f2615h) {
            this.f2615h = false;
            if (nn86()) {
                this.f2621n.f3f();
            }
        }
        lrht(this.f2621n, this.f2616i, widthMeasureSpec, heightMeasureSpec);
        m1622c(widthMeasureSpec, heightMeasureSpec, this.f2621n.m1313a(), this.f2621n.jk(), this.f2621n.pnt2(), this.f2621n.hyow());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C0341n c0341nX9kr = x9kr(view);
        if ((view instanceof Guideline) && !(c0341nX9kr instanceof C0345y)) {
            toq toqVar = (toq) view.getLayoutParams();
            C0345y c0345y = new C0345y();
            toqVar.f48518y2 = c0345y;
            toqVar.f48519y9n = true;
            c0345y.tww7(toqVar.f2639e);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.d3();
            ((toq) view.getLayoutParams()).f2637b = true;
            if (!this.f2624q.contains(constraintHelper)) {
                this.f2624q.add(constraintHelper);
            }
        }
        this.f2618k.put(view.getId(), view);
        this.f2615h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2618k.remove(view.getId());
        this.f2621n.yw(x9kr(view));
        this.f2624q.remove(view);
        this.f2615h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        hyr();
        super.requestLayout();
    }

    public void setConstraintSet(C0397q set) {
        this.f2632z = set;
    }

    public void setDesignInformation(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.f2619l == null) {
                this.f2619l = new HashMap<>();
            }
            String strSubstring = (String) value1;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f2619l.put(strSubstring, Integer.valueOf(((Integer) value2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int id2) {
        this.f2618k.remove(getId());
        super.setId(id2);
        this.f2618k.put(getId(), this);
    }

    public void setMaxHeight(int value) {
        if (value == this.f2623p) {
            return;
        }
        this.f2623p = value;
        requestLayout();
    }

    public void setMaxWidth(int value) {
        if (value == this.f2626s) {
            return;
        }
        this.f2626s = value;
        requestLayout();
    }

    public void setMinHeight(int value) {
        if (value == this.f2631y) {
            return;
        }
        this.f2631y = value;
        requestLayout();
    }

    public void setMinWidth(int value) {
        if (value == this.f2614g) {
            return;
        }
        this.f2614g = value;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0396n constraintsChangedListener) {
        this.f2609a = constraintsChangedListener;
        androidx.constraintlayout.widget.toq toqVar = this.f2627t;
        if (toqVar != null) {
            toqVar.m1702q(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int level) {
        this.f2616i = level;
        this.f2621n.xzl(level);
    }

    public void setState(int id2, int screenWidth, int screenHeight) {
        androidx.constraintlayout.widget.toq toqVar = this.f2627t;
        if (toqVar != null) {
            toqVar.m1701n(id2, screenWidth, screenHeight);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.n$toq) = (r2v3 androidx.constraintlayout.core.widgets.n$toq), (r2v0 androidx.constraintlayout.core.widgets.n$toq) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void vyq(androidx.constraintlayout.core.widgets.C0339g r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$zy r0 = r7.f2628u
            int r1 = r0.f2681n
            int r0 = r0.f2682q
            androidx.constraintlayout.core.widgets.n$toq r2 = androidx.constraintlayout.core.widgets.C0341n.toq.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.f2626s
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            androidx.constraintlayout.core.widgets.n$toq r9 = androidx.constraintlayout.core.widgets.C0341n.toq.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f2614g
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            androidx.constraintlayout.core.widgets.n$toq r9 = androidx.constraintlayout.core.widgets.C0341n.toq.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f2614g
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.f2623p
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            androidx.constraintlayout.core.widgets.n$toq r2 = androidx.constraintlayout.core.widgets.C0341n.toq.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f2631y
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            androidx.constraintlayout.core.widgets.n$toq r2 = androidx.constraintlayout.core.widgets.C0341n.toq.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f2631y
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.m1313a()
            if (r10 != r11) goto L69
            int r11 = r8.jk()
            if (r12 == r11) goto L6c
        L69:
            r8.qh4d()
        L6c:
            r8.v5yj(r6)
            r8.ra(r6)
            int r11 = r7.f2626s
            int r11 = r11 - r0
            r8.vy(r11)
            int r11 = r7.f2623p
            int r11 = r11 - r1
            r8.dxef(r11)
            r8.gcp(r6)
            r8.lw(r6)
            r8.pjz9(r9)
            r8.m2t(r10)
            r8.ew(r2)
            r8.pc(r12)
            int r9 = r7.f2614g
            int r9 = r9 - r0
            r8.gcp(r9)
            int r9 = r7.f2631y
            int r9 = r9 - r1
            r8.lw(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.vyq(androidx.constraintlayout.core.widgets.g, int, int, int, int):void");
    }

    public final C0341n x9kr(View view) {
        if (view == this) {
            return this.f2621n;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof toq) {
            return ((toq) view.getLayoutParams()).f48518y2;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof toq) {
            return ((toq) view.getLayoutParams()).f48518y2;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new toq(p2);
    }

    public ConstraintLayout(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f2618k = new SparseArray<>();
        this.f2624q = new ArrayList<>(4);
        this.f2621n = new C0339g();
        this.f2614g = 0;
        this.f2631y = 0;
        this.f2626s = Integer.MAX_VALUE;
        this.f2623p = Integer.MAX_VALUE;
        this.f2615h = true;
        this.f2616i = 257;
        this.f2632z = null;
        this.f2627t = null;
        this.f2625r = -1;
        this.f2619l = new HashMap<>();
        this.f2613f = -1;
        this.f2611c = -1;
        this.f2612e = -1;
        this.f2617j = -1;
        this.f2622o = 0;
        this.f2620m = 0;
        this.f2610b = new SparseArray<>();
        this.f2628u = new zy(this);
        this.f48449bo = 0;
        this.f2629v = 0;
        ncyb(attrs, 0, 0);
    }

    public ConstraintLayout(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2618k = new SparseArray<>();
        this.f2624q = new ArrayList<>(4);
        this.f2621n = new C0339g();
        this.f2614g = 0;
        this.f2631y = 0;
        this.f2626s = Integer.MAX_VALUE;
        this.f2623p = Integer.MAX_VALUE;
        this.f2615h = true;
        this.f2616i = 257;
        this.f2632z = null;
        this.f2627t = null;
        this.f2625r = -1;
        this.f2619l = new HashMap<>();
        this.f2613f = -1;
        this.f2611c = -1;
        this.f2612e = -1;
        this.f2617j = -1;
        this.f2622o = 0;
        this.f2620m = 0;
        this.f2610b = new SparseArray<>();
        this.f2628u = new zy(this);
        this.f48449bo = 0;
        this.f2629v = 0;
        ncyb(attrs, defStyleAttr, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.f2618k = new SparseArray<>();
        this.f2624q = new ArrayList<>(4);
        this.f2621n = new C0339g();
        this.f2614g = 0;
        this.f2631y = 0;
        this.f2626s = Integer.MAX_VALUE;
        this.f2623p = Integer.MAX_VALUE;
        this.f2615h = true;
        this.f2616i = 257;
        this.f2632z = null;
        this.f2627t = null;
        this.f2625r = -1;
        this.f2619l = new HashMap<>();
        this.f2613f = -1;
        this.f2611c = -1;
        this.f2612e = -1;
        this.f2617j = -1;
        this.f2622o = 0;
        this.f2620m = 0;
        this.f2610b = new SparseArray<>();
        this.f2628u = new zy(this);
        this.f48449bo = 0;
        this.f2629v = 0;
        ncyb(attrs, defStyleAttr, defStyleRes);
    }

    public static class toq extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: d */
        public static final int f2634d = 1;

        /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
        public static final int f48450d8wk = 8;

        /* JADX INFO: renamed from: dr, reason: collision with root package name */
        public static final int f48451dr = 0;

        /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
        public static final int f48452fnq8 = 4;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public static final int f48453g1 = 1;

        /* JADX INFO: renamed from: gbni, reason: collision with root package name */
        public static final int f48454gbni = 2;

        /* JADX INFO: renamed from: gyi, reason: collision with root package name */
        public static final int f48455gyi = 0;

        /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
        public static final int f48456i9jn = 2;

        /* JADX INFO: renamed from: ikck, reason: collision with root package name */
        public static final int f48457ikck = 0;

        /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
        public static final int f48458ltg8 = 0;

        /* JADX INFO: renamed from: m4, reason: collision with root package name */
        public static final int f48459m4 = 2;

        /* JADX INFO: renamed from: mu, reason: collision with root package name */
        public static final int f48460mu = 1;

        /* JADX INFO: renamed from: py, reason: collision with root package name */
        public static final int f48461py = 1;

        /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
        public static final int f48462qkj8 = 3;

        /* JADX INFO: renamed from: qo, reason: collision with root package name */
        public static final int f48463qo = 5;

        /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
        public static final int f48464r8s8 = 1;

        /* JADX INFO: renamed from: tfm, reason: collision with root package name */
        public static final int f48465tfm = 6;

        /* JADX INFO: renamed from: v */
        public static final int f2635v = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: v0af, reason: collision with root package name */
        public static final int f48466v0af = 3;

        /* JADX INFO: renamed from: vq, reason: collision with root package name */
        public static final int f48467vq = 2;

        /* JADX INFO: renamed from: was, reason: collision with root package name */
        public static final int f48468was = 0;

        /* JADX INFO: renamed from: wo, reason: collision with root package name */
        public static final int f48469wo = 7;

        /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
        public static final int f48470xwq3 = -1;

        /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
        public static final int f48471zsr0 = 0;

        /* JADX INFO: renamed from: a */
        int f2636a;

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        boolean f48472a9;

        /* JADX INFO: renamed from: a98o, reason: collision with root package name */
        int f48473a98o;

        /* JADX INFO: renamed from: b */
        boolean f2637b;

        /* JADX INFO: renamed from: bf2, reason: collision with root package name */
        boolean f48474bf2;

        /* JADX INFO: renamed from: bo, reason: collision with root package name */
        float f48475bo;

        /* JADX INFO: renamed from: c */
        public float f2638c;

        /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
        public boolean f48476c8jq;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public int f48477cdj;

        /* JADX INFO: renamed from: ch, reason: collision with root package name */
        int f48478ch;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        public float f48479d2ok;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        public String f48480d3;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public int f48481dd;

        /* JADX INFO: renamed from: e */
        public int f2639e;

        /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
        boolean f48482ek5k;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        int f48483eqxt;

        /* JADX INFO: renamed from: f */
        public int f2640f;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f48484f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public int f48485fn3e;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        boolean f48486fti;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public int f48487fu4;

        /* JADX INFO: renamed from: g */
        public int f2641g;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        public float f48488gvn7;

        /* JADX INFO: renamed from: h */
        public int f2642h;

        /* JADX INFO: renamed from: hb, reason: collision with root package name */
        public boolean f48489hb;

        /* JADX INFO: renamed from: hyr, reason: collision with root package name */
        public int f48490hyr;

        /* JADX INFO: renamed from: i */
        public int f2643i;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        boolean f48491i1;

        /* JADX INFO: renamed from: j */
        public String f2644j;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        public int f48492jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        public float f48493jp0y;

        /* JADX INFO: renamed from: k */
        public int f2645k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public float f48494ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public int f48495kja0;

        /* JADX INFO: renamed from: l */
        public int f2646l;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public int f48496ld6;

        /* JADX INFO: renamed from: lrht, reason: collision with root package name */
        public float f48497lrht;

        /* JADX INFO: renamed from: lv5, reason: collision with root package name */
        float f48498lv5;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        public float f48499lvui;

        /* JADX INFO: renamed from: m */
        boolean f2647m;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public int f48500mcp;

        /* JADX INFO: renamed from: n */
        public int f2648n;

        /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
        public int f48501n5r1;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public int f48502n7h;

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        public int f48503ncyb;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public int f48504ni7;

        /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
        int f48505nmn5;

        /* JADX INFO: renamed from: nn86, reason: collision with root package name */
        public boolean f48506nn86;

        /* JADX INFO: renamed from: o */
        public int f2649o;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public int f48507o1t;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        float f48508oc;

        /* JADX INFO: renamed from: p */
        public int f2650p;

        /* JADX INFO: renamed from: q */
        public boolean f2651q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public int f48509qrj;

        /* JADX INFO: renamed from: r */
        public int f2652r;

        /* JADX INFO: renamed from: s */
        public int f2653s;

        /* JADX INFO: renamed from: t */
        public int f2654t;

        /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
        int f48510t8iq;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public int f48511t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f48512toq;

        /* JADX INFO: renamed from: u */
        int f2655u;

        /* JADX INFO: renamed from: uv6, reason: collision with root package name */
        public int f48513uv6;

        /* JADX INFO: renamed from: vyq, reason: collision with root package name */
        public int f48514vyq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public int f48515wvg;

        /* JADX INFO: renamed from: x */
        int f2656x;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public int f48516x2;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        public int f48517x9kr;

        /* JADX INFO: renamed from: y */
        public int f2657y;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        C0341n f48518y2;

        /* JADX INFO: renamed from: y9n, reason: collision with root package name */
        boolean f48519y9n;

        /* JADX INFO: renamed from: yz, reason: collision with root package name */
        boolean f48520yz;

        /* JADX INFO: renamed from: z */
        public int f2658z;

        /* JADX INFO: renamed from: zp, reason: collision with root package name */
        int f48521zp;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public int f48522zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public float f48523zy;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$toq$k */
        private static class C0391k {

            /* JADX INFO: renamed from: a9, reason: collision with root package name */
            public static final int f48524a9 = 30;

            /* JADX INFO: renamed from: b */
            public static final SparseIntArray f2659b;

            /* JADX INFO: renamed from: c */
            public static final int f2660c = 47;

            /* JADX INFO: renamed from: cdj, reason: collision with root package name */
            public static final int f48525cdj = 16;

            /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
            public static final int f48526d2ok = 37;

            /* JADX INFO: renamed from: d3, reason: collision with root package name */
            public static final int f48527d3 = 34;

            /* JADX INFO: renamed from: dd, reason: collision with root package name */
            public static final int f48528dd = 40;

            /* JADX INFO: renamed from: e */
            public static final int f2661e = 51;

            /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
            public static final int f48529ek5k = 65;

            /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
            public static final int f48530eqxt = 36;

            /* JADX INFO: renamed from: f */
            public static final int f2662f = 46;

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            public static final int f48531f7l8 = 6;

            /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
            public static final int f48532fn3e = 20;

            /* JADX INFO: renamed from: fti, reason: collision with root package name */
            public static final int f48533fti = 31;

            /* JADX INFO: renamed from: fu4, reason: collision with root package name */
            public static final int f48534fu4 = 23;

            /* JADX INFO: renamed from: g */
            public static final int f2663g = 5;

            /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
            public static final int f48535gvn7 = 33;

            /* JADX INFO: renamed from: h */
            public static final int f2664h = 15;

            /* JADX INFO: renamed from: hb, reason: collision with root package name */
            public static final int f48536hb = 53;

            /* JADX INFO: renamed from: hyr, reason: collision with root package name */
            public static final int f48537hyr = 45;

            /* JADX INFO: renamed from: i */
            public static final int f2665i = 19;

            /* JADX INFO: renamed from: j */
            public static final int f2666j = 54;

            /* JADX INFO: renamed from: jk, reason: collision with root package name */
            public static final int f48538jk = 29;

            /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
            public static final int f48539jp0y = 32;

            /* JADX INFO: renamed from: k */
            public static final int f2667k = 0;

            /* JADX INFO: renamed from: ki, reason: collision with root package name */
            public static final int f48540ki = 17;

            /* JADX INFO: renamed from: kja0, reason: collision with root package name */
            public static final int f48541kja0 = 14;

            /* JADX INFO: renamed from: l */
            public static final int f2668l = 43;

            /* JADX INFO: renamed from: ld6, reason: collision with root package name */
            public static final int f48542ld6 = 10;

            /* JADX INFO: renamed from: lrht, reason: collision with root package name */
            public static final int f48543lrht = 48;

            /* JADX INFO: renamed from: lvui, reason: collision with root package name */
            public static final int f48544lvui = 38;

            /* JADX INFO: renamed from: m */
            public static final int f2669m = 64;

            /* JADX INFO: renamed from: mcp, reason: collision with root package name */
            public static final int f48545mcp = 28;

            /* JADX INFO: renamed from: n */
            public static final int f2670n = 4;

            /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
            public static final int f48546n5r1 = 44;

            /* JADX INFO: renamed from: n7h, reason: collision with root package name */
            public static final int f48547n7h = 13;

            /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
            public static final int f48548ncyb = 42;

            /* JADX INFO: renamed from: ni7, reason: collision with root package name */
            public static final int f48549ni7 = 22;

            /* JADX INFO: renamed from: nn86, reason: collision with root package name */
            public static final int f48550nn86 = 52;

            /* JADX INFO: renamed from: o */
            public static final int f2671o = 55;

            /* JADX INFO: renamed from: o1t, reason: collision with root package name */
            public static final int f48551o1t = 25;

            /* JADX INFO: renamed from: oc, reason: collision with root package name */
            public static final int f48552oc = 35;

            /* JADX INFO: renamed from: p */
            public static final int f2672p = 9;

            /* JADX INFO: renamed from: q */
            public static final int f2673q = 3;

            /* JADX INFO: renamed from: qrj, reason: collision with root package name */
            public static final int f48553qrj = 12;

            /* JADX INFO: renamed from: r */
            public static final int f2674r = 39;

            /* JADX INFO: renamed from: s */
            public static final int f2675s = 8;

            /* JADX INFO: renamed from: t */
            public static final int f2676t = 27;

            /* JADX INFO: renamed from: t8r, reason: collision with root package name */
            public static final int f48554t8r = 18;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public static final int f48555toq = 1;

            /* JADX INFO: renamed from: uv6, reason: collision with root package name */
            public static final int f48556uv6 = 49;

            /* JADX INFO: renamed from: vyq, reason: collision with root package name */
            public static final int f48557vyq = 50;

            /* JADX INFO: renamed from: wvg, reason: collision with root package name */
            public static final int f48558wvg = 26;

            /* JADX INFO: renamed from: x2, reason: collision with root package name */
            public static final int f48559x2 = 11;

            /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
            public static final int f48560x9kr = 41;

            /* JADX INFO: renamed from: y */
            public static final int f2677y = 7;

            /* JADX INFO: renamed from: y9n, reason: collision with root package name */
            public static final int f48561y9n = 67;

            /* JADX INFO: renamed from: yz, reason: collision with root package name */
            public static final int f48562yz = 66;

            /* JADX INFO: renamed from: z */
            public static final int f2678z = 24;

            /* JADX INFO: renamed from: zurt, reason: collision with root package name */
            public static final int f48563zurt = 21;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            public static final int f48564zy = 2;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2659b = sparseIntArray;
                sparseIntArray.append(C0394g.qrj.vibj, 64);
                sparseIntArray.append(C0394g.qrj.hs6, 65);
                sparseIntArray.append(C0394g.qrj.z1, 8);
                sparseIntArray.append(C0394g.qrj.fu7m, 9);
                sparseIntArray.append(C0394g.qrj.yn, 10);
                sparseIntArray.append(C0394g.qrj.azf, 11);
                sparseIntArray.append(C0394g.qrj.un3l, 12);
                sparseIntArray.append(C0394g.qrj.ume, 13);
                sparseIntArray.append(C0394g.qrj.dyer, 14);
                sparseIntArray.append(C0394g.qrj.i8gn, 15);
                sparseIntArray.append(C0394g.qrj.goq, 16);
                sparseIntArray.append(C0394g.qrj.yl24, 52);
                sparseIntArray.append(C0394g.qrj.i4w, 53);
                sparseIntArray.append(C0394g.qrj.gz, 2);
                sparseIntArray.append(C0394g.qrj.d7y, 3);
                sparseIntArray.append(C0394g.qrj.rh, 4);
                sparseIntArray.append(C0394g.qrj.n2mu, 49);
                sparseIntArray.append(C0394g.qrj.hk, 50);
                sparseIntArray.append(C0394g.qrj.se2c, 5);
                sparseIntArray.append(C0394g.qrj.lflh, 6);
                sparseIntArray.append(C0394g.qrj.dgmt, 7);
                sparseIntArray.append(C0394g.qrj.x0c, 67);
                sparseIntArray.append(C0394g.qrj.mn, 1);
                sparseIntArray.append(C0394g.qrj.wd, 17);
                sparseIntArray.append(C0394g.qrj.jcwh, 18);
                sparseIntArray.append(C0394g.qrj.nd, 19);
                sparseIntArray.append(C0394g.qrj.qm8, 20);
                sparseIntArray.append(C0394g.qrj.v1, 21);
                sparseIntArray.append(C0394g.qrj.c08, 22);
                sparseIntArray.append(C0394g.qrj.lay, 23);
                sparseIntArray.append(C0394g.qrj.hw, 24);
                sparseIntArray.append(C0394g.qrj.y4wo, 25);
                sparseIntArray.append(C0394g.qrj.gir, 26);
                sparseIntArray.append(C0394g.qrj.gk, 55);
                sparseIntArray.append(C0394g.qrj.f7, 54);
                sparseIntArray.append(C0394g.qrj.l5o, 29);
                sparseIntArray.append(C0394g.qrj.n9, 30);
                sparseIntArray.append(C0394g.qrj.ar4, 44);
                sparseIntArray.append(C0394g.qrj.w0qe, 45);
                sparseIntArray.append(C0394g.qrj.o2, 46);
                sparseIntArray.append(C0394g.qrj.jl, 47);
                sparseIntArray.append(C0394g.qrj.mwo2, 48);
                sparseIntArray.append(C0394g.qrj.iby, 27);
                sparseIntArray.append(C0394g.qrj.zuh, 28);
                sparseIntArray.append(C0394g.qrj.id, 31);
                sparseIntArray.append(C0394g.qrj.qyp, 32);
                sparseIntArray.append(C0394g.qrj.c3sl, 33);
                sparseIntArray.append(C0394g.qrj.fv, 34);
                sparseIntArray.append(C0394g.qrj.s9, 35);
                sparseIntArray.append(C0394g.qrj.ox6n, 36);
                sparseIntArray.append(C0394g.qrj.lv7, 37);
                sparseIntArray.append(C0394g.qrj.pb, 38);
                sparseIntArray.append(C0394g.qrj.fjxh, 39);
                sparseIntArray.append(C0394g.qrj.mzno, 40);
                sparseIntArray.append(C0394g.qrj.xdxk, 41);
                sparseIntArray.append(C0394g.qrj.tn, 42);
                sparseIntArray.append(C0394g.qrj.qe, 43);
                sparseIntArray.append(C0394g.qrj.w8, 51);
                sparseIntArray.append(C0394g.qrj.ryij, 66);
            }

            private C0391k() {
            }
        }

        public toq(toq source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f2645k = -1;
            this.f48512toq = -1;
            this.f48523zy = -1.0f;
            this.f2651q = true;
            this.f2648n = -1;
            this.f2641g = -1;
            this.f48484f7l8 = -1;
            this.f2657y = -1;
            this.f2653s = -1;
            this.f2650p = -1;
            this.f48496ld6 = -1;
            this.f48516x2 = -1;
            this.f48509qrj = -1;
            this.f48502n7h = -1;
            this.f48495kja0 = -1;
            this.f2642h = -1;
            this.f48477cdj = 0;
            this.f48494ki = 0.0f;
            this.f48511t8r = -1;
            this.f2643i = -1;
            this.f48485fn3e = -1;
            this.f48522zurt = -1;
            this.f48504ni7 = Integer.MIN_VALUE;
            this.f48487fu4 = Integer.MIN_VALUE;
            this.f2658z = Integer.MIN_VALUE;
            this.f48507o1t = Integer.MIN_VALUE;
            this.f48515wvg = Integer.MIN_VALUE;
            this.f2654t = Integer.MIN_VALUE;
            this.f48500mcp = Integer.MIN_VALUE;
            this.f48492jk = 0;
            this.f48472a9 = true;
            this.f48486fti = true;
            this.f48493jp0y = 0.5f;
            this.f48488gvn7 = 0.5f;
            this.f48480d3 = null;
            this.f48508oc = 0.0f;
            this.f48483eqxt = 1;
            this.f48479d2ok = -1.0f;
            this.f48499lvui = -1.0f;
            this.f2652r = 0;
            this.f48481dd = 0;
            this.f48517x9kr = 0;
            this.f48503ncyb = 0;
            this.f2646l = 0;
            this.f48501n5r1 = 0;
            this.f48490hyr = 0;
            this.f2640f = 0;
            this.f2638c = 1.0f;
            this.f48497lrht = 1.0f;
            this.f48513uv6 = -1;
            this.f48514vyq = -1;
            this.f2639e = -1;
            this.f48506nn86 = false;
            this.f48489hb = false;
            this.f2644j = null;
            this.f2649o = 0;
            this.f2647m = true;
            this.f48482ek5k = true;
            this.f48520yz = false;
            this.f48519y9n = false;
            this.f2637b = false;
            this.f48474bf2 = false;
            this.f48491i1 = false;
            this.f48473a98o = -1;
            this.f2636a = -1;
            this.f48521zp = -1;
            this.f2656x = -1;
            this.f48478ch = Integer.MIN_VALUE;
            this.f48505nmn5 = Integer.MIN_VALUE;
            this.f48498lv5 = 0.5f;
            this.f48518y2 = new C0341n();
            this.f48476c8jq = false;
            this.f2645k = source.f2645k;
            this.f48512toq = source.f48512toq;
            this.f48523zy = source.f48523zy;
            this.f2651q = source.f2651q;
            this.f2648n = source.f2648n;
            this.f2641g = source.f2641g;
            this.f48484f7l8 = source.f48484f7l8;
            this.f2657y = source.f2657y;
            this.f2653s = source.f2653s;
            this.f2650p = source.f2650p;
            this.f48496ld6 = source.f48496ld6;
            this.f48516x2 = source.f48516x2;
            this.f48509qrj = source.f48509qrj;
            this.f48502n7h = source.f48502n7h;
            this.f48495kja0 = source.f48495kja0;
            this.f2642h = source.f2642h;
            this.f48477cdj = source.f48477cdj;
            this.f48494ki = source.f48494ki;
            this.f48511t8r = source.f48511t8r;
            this.f2643i = source.f2643i;
            this.f48485fn3e = source.f48485fn3e;
            this.f48522zurt = source.f48522zurt;
            this.f48504ni7 = source.f48504ni7;
            this.f48487fu4 = source.f48487fu4;
            this.f2658z = source.f2658z;
            this.f48507o1t = source.f48507o1t;
            this.f48515wvg = source.f48515wvg;
            this.f2654t = source.f2654t;
            this.f48500mcp = source.f48500mcp;
            this.f48492jk = source.f48492jk;
            this.f48493jp0y = source.f48493jp0y;
            this.f48488gvn7 = source.f48488gvn7;
            this.f48480d3 = source.f48480d3;
            this.f48508oc = source.f48508oc;
            this.f48483eqxt = source.f48483eqxt;
            this.f48479d2ok = source.f48479d2ok;
            this.f48499lvui = source.f48499lvui;
            this.f2652r = source.f2652r;
            this.f48481dd = source.f48481dd;
            this.f48506nn86 = source.f48506nn86;
            this.f48489hb = source.f48489hb;
            this.f48517x9kr = source.f48517x9kr;
            this.f48503ncyb = source.f48503ncyb;
            this.f2646l = source.f2646l;
            this.f48490hyr = source.f48490hyr;
            this.f48501n5r1 = source.f48501n5r1;
            this.f2640f = source.f2640f;
            this.f2638c = source.f2638c;
            this.f48497lrht = source.f48497lrht;
            this.f48513uv6 = source.f48513uv6;
            this.f48514vyq = source.f48514vyq;
            this.f2639e = source.f2639e;
            this.f2647m = source.f2647m;
            this.f48482ek5k = source.f48482ek5k;
            this.f48520yz = source.f48520yz;
            this.f48519y9n = source.f48519y9n;
            this.f48473a98o = source.f48473a98o;
            this.f2636a = source.f2636a;
            this.f48521zp = source.f48521zp;
            this.f2656x = source.f2656x;
            this.f48478ch = source.f48478ch;
            this.f48505nmn5 = source.f48505nmn5;
            this.f48498lv5 = source.f48498lv5;
            this.f2644j = source.f2644j;
            this.f2649o = source.f2649o;
            this.f48518y2 = source.f48518y2;
            this.f48472a9 = source.f48472a9;
            this.f48486fti = source.f48486fti;
        }

        /* JADX INFO: renamed from: k */
        public String m1624k() {
            return this.f2644j;
        }

        /* JADX INFO: renamed from: n */
        public void m1625n() {
            this.f48519y9n = false;
            this.f2647m = true;
            this.f48482ek5k = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.f48506nn86) {
                this.f2647m = false;
                if (this.f48517x9kr == 0) {
                    this.f48517x9kr = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.f48489hb) {
                this.f48482ek5k = false;
                if (this.f48503ncyb == 0) {
                    this.f48503ncyb = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f2647m = false;
                if (i2 == 0 && this.f48517x9kr == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f48506nn86 = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.f48482ek5k = false;
                if (i3 == 0 && this.f48503ncyb == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f48489hb = true;
                }
            }
            if (this.f48523zy == -1.0f && this.f2645k == -1 && this.f48512toq == -1) {
                return;
            }
            this.f48519y9n = true;
            this.f2647m = true;
            this.f48482ek5k = true;
            if (!(this.f48518y2 instanceof C0345y)) {
                this.f48518y2 = new C0345y();
            }
            ((C0345y) this.f48518y2).tww7(this.f2639e);
        }

        /* JADX INFO: renamed from: q */
        public void m1626q(String text) {
            this.f48518y2.ktq(text);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.toq.resolveLayoutDirection(int):void");
        }

        public C0341n toq() {
            return this.f48518y2;
        }

        public void zy() {
            C0341n c0341n = this.f48518y2;
            if (c0341n != null) {
                c0341n.ltg8();
            }
        }

        public toq(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.f2645k = -1;
            this.f48512toq = -1;
            this.f48523zy = -1.0f;
            this.f2651q = true;
            this.f2648n = -1;
            this.f2641g = -1;
            this.f48484f7l8 = -1;
            this.f2657y = -1;
            this.f2653s = -1;
            this.f2650p = -1;
            this.f48496ld6 = -1;
            this.f48516x2 = -1;
            this.f48509qrj = -1;
            this.f48502n7h = -1;
            this.f48495kja0 = -1;
            this.f2642h = -1;
            this.f48477cdj = 0;
            this.f48494ki = 0.0f;
            this.f48511t8r = -1;
            this.f2643i = -1;
            this.f48485fn3e = -1;
            this.f48522zurt = -1;
            this.f48504ni7 = Integer.MIN_VALUE;
            this.f48487fu4 = Integer.MIN_VALUE;
            this.f2658z = Integer.MIN_VALUE;
            this.f48507o1t = Integer.MIN_VALUE;
            this.f48515wvg = Integer.MIN_VALUE;
            this.f2654t = Integer.MIN_VALUE;
            this.f48500mcp = Integer.MIN_VALUE;
            this.f48492jk = 0;
            this.f48472a9 = true;
            this.f48486fti = true;
            this.f48493jp0y = 0.5f;
            this.f48488gvn7 = 0.5f;
            this.f48480d3 = null;
            this.f48508oc = 0.0f;
            this.f48483eqxt = 1;
            this.f48479d2ok = -1.0f;
            this.f48499lvui = -1.0f;
            this.f2652r = 0;
            this.f48481dd = 0;
            this.f48517x9kr = 0;
            this.f48503ncyb = 0;
            this.f2646l = 0;
            this.f48501n5r1 = 0;
            this.f48490hyr = 0;
            this.f2640f = 0;
            this.f2638c = 1.0f;
            this.f48497lrht = 1.0f;
            this.f48513uv6 = -1;
            this.f48514vyq = -1;
            this.f2639e = -1;
            this.f48506nn86 = false;
            this.f48489hb = false;
            this.f2644j = null;
            this.f2649o = 0;
            this.f2647m = true;
            this.f48482ek5k = true;
            this.f48520yz = false;
            this.f48519y9n = false;
            this.f2637b = false;
            this.f48474bf2 = false;
            this.f48491i1 = false;
            this.f48473a98o = -1;
            this.f2636a = -1;
            this.f48521zp = -1;
            this.f2656x = -1;
            this.f48478ch = Integer.MIN_VALUE;
            this.f48505nmn5 = Integer.MIN_VALUE;
            this.f48498lv5 = 0.5f;
            this.f48518y2 = new C0341n();
            this.f48476c8jq = false;
            TypedArray typedArrayObtainStyledAttributes = c2.obtainStyledAttributes(attrs, C0394g.qrj.c4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = C0391k.f2659b.get(index);
                switch (i3) {
                    case 1:
                        this.f2639e = typedArrayObtainStyledAttributes.getInt(index, this.f2639e);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2642h);
                        this.f2642h = resourceId;
                        if (resourceId == -1) {
                            this.f2642h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f48477cdj = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48477cdj);
                        break;
                    case 4:
                        float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.f48494ki) % 360.0f;
                        this.f48494ki = f2;
                        if (f2 < 0.0f) {
                            this.f48494ki = (360.0f - f2) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f2645k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2645k);
                        break;
                    case 6:
                        this.f48512toq = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f48512toq);
                        break;
                    case 7:
                        this.f48523zy = typedArrayObtainStyledAttributes.getFloat(index, this.f48523zy);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2648n);
                        this.f2648n = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2648n = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2641g);
                        this.f2641g = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2641g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48484f7l8);
                        this.f48484f7l8 = resourceId4;
                        if (resourceId4 == -1) {
                            this.f48484f7l8 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2657y);
                        this.f2657y = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2657y = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2653s);
                        this.f2653s = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2653s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2650p);
                        this.f2650p = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2650p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48496ld6);
                        this.f48496ld6 = resourceId8;
                        if (resourceId8 == -1) {
                            this.f48496ld6 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48516x2);
                        this.f48516x2 = resourceId9;
                        if (resourceId9 == -1) {
                            this.f48516x2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48509qrj);
                        this.f48509qrj = resourceId10;
                        if (resourceId10 == -1) {
                            this.f48509qrj = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48511t8r);
                        this.f48511t8r = resourceId11;
                        if (resourceId11 == -1) {
                            this.f48511t8r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2643i);
                        this.f2643i = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2643i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48485fn3e);
                        this.f48485fn3e = resourceId13;
                        if (resourceId13 == -1) {
                            this.f48485fn3e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48522zurt);
                        this.f48522zurt = resourceId14;
                        if (resourceId14 == -1) {
                            this.f48522zurt = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f48504ni7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48504ni7);
                        break;
                    case 22:
                        this.f48487fu4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48487fu4);
                        break;
                    case 23:
                        this.f2658z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2658z);
                        break;
                    case 24:
                        this.f48507o1t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48507o1t);
                        break;
                    case 25:
                        this.f48515wvg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48515wvg);
                        break;
                    case 26:
                        this.f2654t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2654t);
                        break;
                    case 27:
                        this.f48506nn86 = typedArrayObtainStyledAttributes.getBoolean(index, this.f48506nn86);
                        break;
                    case 28:
                        this.f48489hb = typedArrayObtainStyledAttributes.getBoolean(index, this.f48489hb);
                        break;
                    case 29:
                        this.f48493jp0y = typedArrayObtainStyledAttributes.getFloat(index, this.f48493jp0y);
                        break;
                    case 30:
                        this.f48488gvn7 = typedArrayObtainStyledAttributes.getFloat(index, this.f48488gvn7);
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f48517x9kr = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.f2608w, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f48503ncyb = i5;
                        if (i5 == 1) {
                            Log.e(ConstraintLayout.f2608w, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f2646l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2646l);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f2646l) == -2) {
                                this.f2646l = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f48490hyr = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48490hyr);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f48490hyr) == -2) {
                                this.f48490hyr = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f2638c = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f2638c));
                        this.f48517x9kr = 2;
                        break;
                    case 36:
                        try {
                            this.f48501n5r1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48501n5r1);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f48501n5r1) == -2) {
                                this.f48501n5r1 = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f2640f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2640f);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f2640f) == -2) {
                                this.f2640f = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f48497lrht = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f48497lrht));
                        this.f48503ncyb = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                C0397q.m1647d(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f48479d2ok = typedArrayObtainStyledAttributes.getFloat(index, this.f48479d2ok);
                                break;
                            case 46:
                                this.f48499lvui = typedArrayObtainStyledAttributes.getFloat(index, this.f48499lvui);
                                break;
                            case 47:
                                this.f2652r = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f48481dd = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f48513uv6 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f48513uv6);
                                break;
                            case 50:
                                this.f48514vyq = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f48514vyq);
                                break;
                            case 51:
                                this.f2644j = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48502n7h);
                                this.f48502n7h = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f48502n7h = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48495kja0);
                                this.f48495kja0 = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f48495kja0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f48492jk = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48492jk);
                                break;
                            case 55:
                                this.f48500mcp = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f48500mcp);
                                break;
                            default:
                                switch (i3) {
                                    case 64:
                                        C0397q.m1654v(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f48472a9 = true;
                                        break;
                                    case 65:
                                        C0397q.m1654v(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f48486fti = true;
                                        break;
                                    case 66:
                                        this.f2649o = typedArrayObtainStyledAttributes.getInt(index, this.f2649o);
                                        break;
                                    case 67:
                                        this.f2651q = typedArrayObtainStyledAttributes.getBoolean(index, this.f2651q);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m1625n();
        }

        public toq(int width, int height) {
            super(width, height);
            this.f2645k = -1;
            this.f48512toq = -1;
            this.f48523zy = -1.0f;
            this.f2651q = true;
            this.f2648n = -1;
            this.f2641g = -1;
            this.f48484f7l8 = -1;
            this.f2657y = -1;
            this.f2653s = -1;
            this.f2650p = -1;
            this.f48496ld6 = -1;
            this.f48516x2 = -1;
            this.f48509qrj = -1;
            this.f48502n7h = -1;
            this.f48495kja0 = -1;
            this.f2642h = -1;
            this.f48477cdj = 0;
            this.f48494ki = 0.0f;
            this.f48511t8r = -1;
            this.f2643i = -1;
            this.f48485fn3e = -1;
            this.f48522zurt = -1;
            this.f48504ni7 = Integer.MIN_VALUE;
            this.f48487fu4 = Integer.MIN_VALUE;
            this.f2658z = Integer.MIN_VALUE;
            this.f48507o1t = Integer.MIN_VALUE;
            this.f48515wvg = Integer.MIN_VALUE;
            this.f2654t = Integer.MIN_VALUE;
            this.f48500mcp = Integer.MIN_VALUE;
            this.f48492jk = 0;
            this.f48472a9 = true;
            this.f48486fti = true;
            this.f48493jp0y = 0.5f;
            this.f48488gvn7 = 0.5f;
            this.f48480d3 = null;
            this.f48508oc = 0.0f;
            this.f48483eqxt = 1;
            this.f48479d2ok = -1.0f;
            this.f48499lvui = -1.0f;
            this.f2652r = 0;
            this.f48481dd = 0;
            this.f48517x9kr = 0;
            this.f48503ncyb = 0;
            this.f2646l = 0;
            this.f48501n5r1 = 0;
            this.f48490hyr = 0;
            this.f2640f = 0;
            this.f2638c = 1.0f;
            this.f48497lrht = 1.0f;
            this.f48513uv6 = -1;
            this.f48514vyq = -1;
            this.f2639e = -1;
            this.f48506nn86 = false;
            this.f48489hb = false;
            this.f2644j = null;
            this.f2649o = 0;
            this.f2647m = true;
            this.f48482ek5k = true;
            this.f48520yz = false;
            this.f48519y9n = false;
            this.f2637b = false;
            this.f48474bf2 = false;
            this.f48491i1 = false;
            this.f48473a98o = -1;
            this.f2636a = -1;
            this.f48521zp = -1;
            this.f2656x = -1;
            this.f48478ch = Integer.MIN_VALUE;
            this.f48505nmn5 = Integer.MIN_VALUE;
            this.f48498lv5 = 0.5f;
            this.f48518y2 = new C0341n();
            this.f48476c8jq = false;
        }

        public toq(ViewGroup.LayoutParams source) {
            super(source);
            this.f2645k = -1;
            this.f48512toq = -1;
            this.f48523zy = -1.0f;
            this.f2651q = true;
            this.f2648n = -1;
            this.f2641g = -1;
            this.f48484f7l8 = -1;
            this.f2657y = -1;
            this.f2653s = -1;
            this.f2650p = -1;
            this.f48496ld6 = -1;
            this.f48516x2 = -1;
            this.f48509qrj = -1;
            this.f48502n7h = -1;
            this.f48495kja0 = -1;
            this.f2642h = -1;
            this.f48477cdj = 0;
            this.f48494ki = 0.0f;
            this.f48511t8r = -1;
            this.f2643i = -1;
            this.f48485fn3e = -1;
            this.f48522zurt = -1;
            this.f48504ni7 = Integer.MIN_VALUE;
            this.f48487fu4 = Integer.MIN_VALUE;
            this.f2658z = Integer.MIN_VALUE;
            this.f48507o1t = Integer.MIN_VALUE;
            this.f48515wvg = Integer.MIN_VALUE;
            this.f2654t = Integer.MIN_VALUE;
            this.f48500mcp = Integer.MIN_VALUE;
            this.f48492jk = 0;
            this.f48472a9 = true;
            this.f48486fti = true;
            this.f48493jp0y = 0.5f;
            this.f48488gvn7 = 0.5f;
            this.f48480d3 = null;
            this.f48508oc = 0.0f;
            this.f48483eqxt = 1;
            this.f48479d2ok = -1.0f;
            this.f48499lvui = -1.0f;
            this.f2652r = 0;
            this.f48481dd = 0;
            this.f48517x9kr = 0;
            this.f48503ncyb = 0;
            this.f2646l = 0;
            this.f48501n5r1 = 0;
            this.f48490hyr = 0;
            this.f2640f = 0;
            this.f2638c = 1.0f;
            this.f48497lrht = 1.0f;
            this.f48513uv6 = -1;
            this.f48514vyq = -1;
            this.f2639e = -1;
            this.f48506nn86 = false;
            this.f48489hb = false;
            this.f2644j = null;
            this.f2649o = 0;
            this.f2647m = true;
            this.f48482ek5k = true;
            this.f48520yz = false;
            this.f48519y9n = false;
            this.f2637b = false;
            this.f48474bf2 = false;
            this.f48491i1 = false;
            this.f48473a98o = -1;
            this.f2636a = -1;
            this.f48521zp = -1;
            this.f2656x = -1;
            this.f48478ch = Integer.MIN_VALUE;
            this.f48505nmn5 = Integer.MIN_VALUE;
            this.f48498lv5 = 0.5f;
            this.f48518y2 = new C0341n();
            this.f48476c8jq = false;
        }
    }
}
