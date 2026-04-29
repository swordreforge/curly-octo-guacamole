package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.fn3e;
import androidx.core.view.accessibility.ki;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C0779q;
import com.google.android.material.internal.C4058z;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ki.C6116k;
import zy.InterfaceC7833l;
import zy.dd;
import zy.lvui;
import zy.nn86;
import zy.uv6;
import zy.yz;
import zy.zurt;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.zy<V> {

    /* JADX INFO: renamed from: a */
    public static final int f23982a = 4;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final int f67381a98o = 2;

    /* JADX INFO: renamed from: b */
    public static final int f23983b = 6;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final int f67382bf2 = -1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f67383bo = 500;

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private static final int f67384c8jq = C6095k.n7h.jmz;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final int f67385ch = 0;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f67386ek5k = 3;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f67387i1 = 1;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final int f67388lv5 = 500;

    /* JADX INFO: renamed from: m */
    public static final int f23984m = 2;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private static final String f67389nmn5 = "BottomSheetBehavior";

    /* JADX INFO: renamed from: o */
    public static final int f23985o = 1;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static final float f67390t8iq = 0.5f;

    /* JADX INFO: renamed from: u */
    private static final float f23986u = 0.1f;

    /* JADX INFO: renamed from: x */
    public static final int f23987x = -1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f67391y2 = -1;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final int f67392y9n = 5;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final int f67393yz = 4;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final int f67394zp = 8;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    float f67395a9;

    /* JADX INFO: renamed from: c */
    @lvui
    private final ArrayList<AbstractC3952g> f23988c;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f67396cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    int f67397d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f67398d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f67399dd;

    /* JADX INFO: renamed from: e */
    boolean f23989e;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    int f67400eqxt;

    /* JADX INFO: renamed from: f */
    @dd
    WeakReference<View> f23990f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67401f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f67402fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    int f67403fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private kja0 f67404fu4;

    /* JADX INFO: renamed from: g */
    private boolean f23991g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    boolean f67405gvn7;

    /* JADX INFO: renamed from: h */
    private boolean f23992h;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private int f67406hb;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    @dd
    WeakReference<V> f67407hyr;

    /* JADX INFO: renamed from: i */
    private boolean f23993i;

    /* JADX INFO: renamed from: j */
    private final C0779q.zy f23994j;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    int f67408jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    float f67409jp0y;

    /* JADX INFO: renamed from: k */
    private int f23995k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f67410ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f67411kja0;

    /* JADX INFO: renamed from: l */
    int f23996l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f67412ld6;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    @dd
    private VelocityTracker f67413lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    @dd
    C0779q f67414lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    int f67415mcp;

    /* JADX INFO: renamed from: n */
    private int f23997n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    int f67416n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f67417n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private int f67418ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f67419ni7;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    @dd
    private Map<View, Integer> f67420nn86;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private final BottomSheetBehavior<V>.C3955p f67421o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private boolean f67422oc;

    /* JADX INFO: renamed from: p */
    @dd
    private ColorStateList f23998p;

    /* JADX INFO: renamed from: q */
    private float f23999q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f67423qrj;

    /* JADX INFO: renamed from: r */
    private boolean f24000r;

    /* JADX INFO: renamed from: s */
    private C4108p f24001s;

    /* JADX INFO: renamed from: t */
    int f24002t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f67424t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f67425toq;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    int f67426uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private int f67427vyq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    @dd
    private ValueAnimator f67428wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f67429x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private boolean f67430x9kr;

    /* JADX INFO: renamed from: y */
    private int f24003y;

    /* JADX INFO: renamed from: z */
    private boolean f24004z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f67431zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f67432zy;

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            @dd
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        boolean f24005g;

        /* JADX INFO: renamed from: n */
        int f24006n;

        /* JADX INFO: renamed from: q */
        final int f24007q;

        /* JADX INFO: renamed from: s */
        boolean f24008s;

        /* JADX INFO: renamed from: y */
        boolean f24009y;

        public SavedState(@lvui Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f24007q);
            parcel.writeInt(this.f24006n);
            parcel.writeInt(this.f24005g ? 1 : 0);
            parcel.writeInt(this.f24009y ? 1 : 0);
            parcel.writeInt(this.f24008s ? 1 : 0);
        }

        public SavedState(@lvui Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24007q = parcel.readInt();
            this.f24006n = parcel.readInt();
            this.f24005g = parcel.readInt() == 1;
            this.f24009y = parcel.readInt() == 1;
            this.f24008s = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @lvui BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f24007q = bottomSheetBehavior.f67400eqxt;
            this.f24006n = ((BottomSheetBehavior) bottomSheetBehavior).f23997n;
            this.f24005g = ((BottomSheetBehavior) bottomSheetBehavior).f67425toq;
            this.f24009y = bottomSheetBehavior.f67405gvn7;
            this.f24008s = ((BottomSheetBehavior) bottomSheetBehavior).f67398d3;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f24007q = i2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public static abstract class AbstractC3952g {
        /* JADX INFO: renamed from: k */
        void mo14154k(@lvui View view) {
        }

        public abstract void toq(@lvui View view, float f2);

        public abstract void zy(@lvui View view, int i2);
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$k */
    class RunnableC3953k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f24010k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f24012q;

        RunnableC3953k(View view, int i2) {
            this.f24010k = view;
            this.f24012q = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.zkd(this.f24010k, this.f24012q, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$n */
    class C3954n implements fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f24013k;

        C3954n(int i2) {
            this.f24013k = i2;
        }

        @Override // androidx.core.view.accessibility.fn3e
        public boolean perform(@lvui View view, @dd fn3e.AbstractC0648k abstractC0648k) {
            BottomSheetBehavior.this.sok(this.f24013k);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$q */
    class C3956q extends C0779q.zy {

        /* JADX INFO: renamed from: k */
        private long f24017k;

        C3956q() {
        }

        private boolean n7h(@lvui View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f67416n5r1 + bottomSheetBehavior.i1()) / 2;
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: k */
        public int mo3751k(@lvui View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.C0779q.zy
        public void ld6(@lvui View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.yz(i3);
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: n */
        public int mo3752n(@lvui View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f67405gvn7 ? bottomSheetBehavior.f67416n5r1 : bottomSheetBehavior.f67403fti;
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: p */
        public void mo3753p(int i2) {
            if (i2 == 1 && BottomSheetBehavior.this.f67422oc) {
                BottomSheetBehavior.this.cfr(1);
            }
        }

        @Override // androidx.customview.widget.C0779q.zy
        public boolean qrj(@lvui View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.f67400eqxt;
            if (i3 == 1 || bottomSheetBehavior.f23989e) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.f67426uv6 == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.f23990f;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f24017k = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f67407hyr;
            return weakReference2 != null && weakReference2.get() == view;
        }

        @Override // androidx.customview.widget.C0779q.zy
        public int toq(@lvui View view, int i2, int i3) {
            int iI1 = BottomSheetBehavior.this.i1();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C6116k.m22394n(i2, iI1, bottomSheetBehavior.f67405gvn7 ? bottomSheetBehavior.f67416n5r1 : bottomSheetBehavior.f67403fti);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // androidx.customview.widget.C0779q.zy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void x2(@zy.lvui android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C3956q.x2(android.view.View, float, float):void");
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$s */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC3957s {
    }

    class toq implements ValueAnimator.AnimatorUpdateListener {
        toq() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f24001s != null) {
                BottomSheetBehavior.this.f24001s.ch(fFloatValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$y */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC3958y {
    }

    class zy implements C4058z.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f24019k;

        zy(boolean z2) {
            this.f24019k = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.C4058z.n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.tfm mo14130k(android.view.View r11, androidx.core.view.tfm r12, com.google.android.material.internal.C4058z.g r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.zy.mo14130k(android.view.View, androidx.core.view.tfm, com.google.android.material.internal.z$g):androidx.core.view.tfm");
        }
    }

    public BottomSheetBehavior() {
        this.f23995k = 0;
        this.f67425toq = true;
        this.f67432zy = false;
        this.f67412ld6 = -1;
        this.f67429x2 = -1;
        this.f67421o1t = new C3955p(this, null);
        this.f67395a9 = 0.5f;
        this.f67409jp0y = -1.0f;
        this.f67422oc = true;
        this.f67400eqxt = 4;
        this.f67397d2ok = 4;
        this.f23988c = new ArrayList<>();
        this.f67406hb = -1;
        this.f23994j = new C3956q();
    }

    @lvui
    /* JADX INFO: renamed from: b */
    public static <V extends View> BottomSheetBehavior<V> m14139b(@lvui V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f7l8)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.zy zyVarM1740g = ((CoordinatorLayout.f7l8) layoutParams).m1740g();
        if (zyVarM1740g instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) zyVarM1740g;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int bf2(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    private void bz2() {
        V v2;
        WeakReference<V> weakReference = this.f67407hyr;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        C0683f.yl(v2, 524288);
        C0683f.yl(v2, 262144);
        C0683f.yl(v2, 1048576);
        int i2 = this.f67406hb;
        if (i2 != -1) {
            C0683f.yl(v2, i2);
        }
        if (!this.f67425toq && this.f67400eqxt != 6) {
            this.f67406hb = uv6(v2, C6095k.qrj.f79817jk, 6);
        }
        if (this.f67405gvn7 && this.f67400eqxt != 5) {
            vq(v2, ki.C0656k.f50717o1t, 5);
        }
        int i3 = this.f67400eqxt;
        if (i3 == 3) {
            vq(v2, ki.C0656k.f3947z, this.f67425toq ? 4 : 6);
            return;
        }
        if (i3 == 4) {
            vq(v2, ki.C0656k.f50705fu4, this.f67425toq ? 3 : 6);
        } else {
            if (i3 != 6) {
                return;
            }
            vq(v2, ki.C0656k.f3947z, 4);
            vq(v2, ki.C0656k.f50705fu4, 3);
        }
    }

    private float c8jq() {
        VelocityTracker velocityTracker = this.f67413lrht;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f23999q);
        return this.f67413lrht.getYVelocity(this.f67426uv6);
    }

    /* JADX INFO: renamed from: e */
    private void m14141e() {
        int iHb = hb();
        if (this.f67425toq) {
            this.f67403fti = Math.max(this.f67416n5r1 - iHb, this.f67415mcp);
        } else {
            this.f67403fti = this.f67416n5r1 - iHb;
        }
    }

    private void fnq8(@lvui SavedState savedState) {
        int i2 = this.f23995k;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f23997n = savedState.f24006n;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f67425toq = savedState.f24005g;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.f67405gvn7 = savedState.f24009y;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.f67398d3 = savedState.f24008s;
        }
    }

    private int hb() {
        int i2;
        return this.f23991g ? Math.min(Math.max(this.f67401f7l8, this.f67416n5r1 - ((this.f23996l * 9) / 16)), this.f67418ncyb) + this.f67431zurt : (this.f67417n7h || this.f67411kja0 || (i2 = this.f67423qrj) <= 0) ? this.f23997n + this.f67431zurt : Math.max(this.f23997n, i2 + this.f24003y);
    }

    private boolean ikck(V v2) {
        ViewParent parent = v2.getParent();
        return parent != null && parent.isLayoutRequested() && C0683f.zsr0(v2);
    }

    /* JADX INFO: renamed from: j */
    private fn3e m14143j(int i2) {
        return new C3954n(i2);
    }

    private void jz5(boolean z2) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f67407hyr;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f67420nn86 != null) {
                    return;
                } else {
                    this.f67420nn86 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f67407hyr.get()) {
                    if (z2) {
                        this.f67420nn86.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f67432zy) {
                            C0683f.o05(childAt, 4);
                        }
                    } else if (this.f67432zy && (map = this.f67420nn86) != null && map.containsKey(childAt)) {
                        C0683f.o05(childAt, this.f67420nn86.get(childAt).intValue());
                    }
                }
            }
            if (!z2) {
                this.f67420nn86 = null;
            } else if (this.f67432zy) {
                this.f67407hyr.get().sendAccessibilityEvent(8);
            }
        }
    }

    private boolean kcsr() {
        return this.f67414lvui != null && (this.f67422oc || this.f67400eqxt == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ktq(boolean z2) {
        V v2;
        if (this.f67407hyr != null) {
            m14141e();
            if (this.f67400eqxt != 4 || (v2 = this.f67407hyr.get()) == null) {
                return;
            }
            if (z2) {
                sok(4);
            } else {
                v2.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m14145m() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f67428wvg = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f67428wvg.addUpdateListener(new toq());
    }

    private void nn86() {
        this.f67408jk = (int) (this.f67416n5r1 * (1.0f - this.f67395a9));
    }

    /* JADX INFO: renamed from: o */
    private void m14146o(@lvui Context context) {
        if (this.f67404fu4 == null) {
            return;
        }
        C4108p c4108p = new C4108p(this.f67404fu4);
        this.f24001s = c4108p;
        c4108p.m14856e(context);
        ColorStateList colorStateList = this.f23998p;
        if (colorStateList != null) {
            this.f24001s.m14867x(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f24001s.setTint(typedValue.data);
    }

    private void qkj8() {
        this.f67426uv6 = -1;
        VelocityTracker velocityTracker = this.f67413lrht;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f67413lrht = null;
        }
    }

    private void qo(V v2, Runnable runnable) {
        if (ikck(v2)) {
            v2.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void uj2j(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z2 = i2 == 3;
        if (this.f24004z != z2) {
            this.f24004z = z2;
            if (this.f24001s == null || (valueAnimator = this.f67428wvg) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f67428wvg.reverse();
                return;
            }
            float f2 = z2 ? 0.0f : 1.0f;
            this.f67428wvg.setFloatValues(1.0f - f2, f2);
            this.f67428wvg.start();
        }
    }

    private int uv6(V v2, @nn86 int i2, int i3) {
        return C0683f.zy(v2, v2.getResources().getString(i2), m14143j(i3));
    }

    private void vq(V v2, ki.C0656k c0656k, int i2) {
        C0683f.ixz(v2, c0656k, null, m14143j(i2));
    }

    private int y2(int i2) {
        if (i2 == 3) {
            return i1();
        }
        if (i2 == 4) {
            return this.f67403fti;
        }
        if (i2 == 5) {
            return this.f67416n5r1;
        }
        if (i2 == 6) {
            return this.f67408jk;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i2);
    }

    private void z4(@lvui View view) {
        boolean z2 = (Build.VERSION.SDK_INT < 29 || xwq3() || this.f23991g) ? false : true;
        if (this.f67411kja0 || this.f23992h || this.f67396cdj || this.f67424t8r || this.f23993i || this.f67402fn3e || z2) {
            C4058z.m14626q(view, new zy(z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zkd(View view, int i2, boolean z2) {
        int iY2 = y2(i2);
        C0779q c0779q = this.f67414lvui;
        if (!(c0779q != null && (!z2 ? !c0779q.uv6(view, view.getLeft(), iY2) : !c0779q.m3742c(view.getLeft(), iY2)))) {
            cfr(i2);
            return;
        }
        cfr(2);
        uj2j(i2);
        this.f67421o1t.zy(i2);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public int m14148a() {
        return this.f67397d2ok;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean a9(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f67400eqxt == 1 && actionMasked == 0) {
            return true;
        }
        if (kcsr()) {
            this.f67414lvui.lvui(motionEvent);
        }
        if (actionMasked == 0) {
            qkj8();
        }
        if (this.f67413lrht == null) {
            this.f67413lrht = VelocityTracker.obtain();
        }
        this.f67413lrht.addMovement(motionEvent);
        if (kcsr() && actionMasked == 2 && !this.f24000r && Math.abs(this.f67427vyq - motionEvent.getY()) > this.f67414lvui.a9()) {
            this.f67414lvui.m3747q(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f24000r;
    }

    @zurt(from = 0.0d, to = 1.0d)
    public float a98o() {
        return this.f67395a9;
    }

    public int bo() {
        return this.f67400eqxt;
    }

    boolean bwp(@lvui View view, float f2) {
        if (this.f67398d3) {
            return true;
        }
        if (view.getTop() < this.f67403fti) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f67403fti)) / ((float) hb()) > 0.5f;
    }

    void cfr(int i2) {
        V v2;
        if (this.f67400eqxt == i2) {
            return;
        }
        this.f67400eqxt = i2;
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.f67405gvn7 && i2 == 5)) {
            this.f67397d2ok = i2;
        }
        WeakReference<V> weakReference = this.f67407hyr;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            jz5(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            jz5(false);
        }
        uj2j(i2);
        for (int i3 = 0; i3 < this.f23988c.size(); i3++) {
            this.f23988c.get(i3).zy(v2, i2);
        }
        bz2();
    }

    @InterfaceC7833l
    public int ch() {
        return this.f67412ld6;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: d */
    public boolean m14149d() {
        return true;
    }

    public void d8wk(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f24002t = i2;
    }

    public boolean dr() {
        return this.f67425toq;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    @yz
    public void ek5k() {
        this.f67428wvg = null;
    }

    public void etdu(boolean z2) {
        this.f67398d3 = z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public void fn3e(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
    }

    public void g1(boolean z2) {
        if (this.f67425toq == z2) {
            return;
        }
        this.f67425toq = z2;
        if (this.f67407hyr != null) {
            m14141e();
        }
        cfr((this.f67425toq && this.f67400eqxt == 6) ? 3 : this.f67400eqxt);
        bz2();
    }

    public void gbni(@zurt(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f67395a9 = f2;
        if (this.f67407hyr != null) {
            nn86();
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean gc3c() {
        return true;
    }

    public boolean gyi() {
        return this.f67422oc;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: h */
    public boolean mo1752h(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, float f2, float f3) {
        WeakReference<View> weakReference;
        if (m14149d() && (weakReference = this.f23990f) != null && view == weakReference.get()) {
            return this.f67400eqxt != 3 || super.mo1752h(coordinatorLayout, v2, view, f2, f3);
        }
        return false;
    }

    public int i1() {
        if (this.f67425toq) {
            return this.f67415mcp;
        }
        return Math.max(this.f24002t, this.f67410ki ? 0 : this.f67419ni7);
    }

    public void i9jn(@InterfaceC7833l int i2) {
        this.f67429x2 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jk(@zy.lvui androidx.coordinatorlayout.widget.CoordinatorLayout r3, @zy.lvui V r4, @zy.lvui android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.i1()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.cfr(r0)
            return
        Lf:
            boolean r3 = r2.m14149d()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f23990f
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f67430x9kr
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f67399dd
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L3a
            boolean r3 = r2.f67425toq
            if (r3 == 0) goto L30
            goto Laa
        L30:
            int r3 = r4.getTop()
            int r6 = r2.f67408jk
            if (r3 <= r6) goto Laa
            goto La9
        L3a:
            boolean r3 = r2.f67405gvn7
            if (r3 == 0) goto L4a
            float r3 = r2.c8jq()
            boolean r3 = r2.bwp(r4, r3)
            if (r3 == 0) goto L4a
            r0 = 5
            goto Laa
        L4a:
            int r3 = r2.f67399dd
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f67425toq
            if (r1 == 0) goto L68
            int r5 = r2.f67415mcp
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f67403fti
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f67408jk
            if (r3 >= r1) goto L7e
            int r1 = r2.f67403fti
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.se()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f67403fti
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f67425toq
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f67408jk
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f67403fti
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.zkd(r4, r0, r3)
            r2.f67430x9kr = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.jk(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public void ki(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, int i2, int i3, @lvui int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f23990f;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!m14149d() || view == view2) {
            int top = v2.getTop();
            int i5 = top - i3;
            if (i3 > 0) {
                if (i5 < i1()) {
                    int iI1 = top - i1();
                    iArr[1] = iI1;
                    C0683f.zkd(v2, -iI1);
                    cfr(3);
                } else {
                    if (!this.f67422oc) {
                        return;
                    }
                    iArr[1] = i3;
                    C0683f.zkd(v2, -i3);
                    cfr(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f67403fti;
                if (i5 > i6 && !this.f67405gvn7) {
                    int i7 = top - i6;
                    iArr[1] = i7;
                    C0683f.zkd(v2, -i7);
                    cfr(4);
                } else {
                    if (!this.f67422oc) {
                        return;
                    }
                    iArr[1] = i3;
                    C0683f.zkd(v2, -i3);
                    cfr(1);
                }
            }
            yz(v2.getTop());
            this.f67399dd = i3;
            this.f67430x9kr = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public void ld6() {
        super.ld6();
        this.f67407hyr = null;
        this.f67414lvui = null;
    }

    public void ltg8(@InterfaceC7833l int i2) {
        this.f67412ld6 = i2;
    }

    @yz
    int lv5() {
        return this.f67401f7l8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.f23991g
            if (r4 != 0) goto L15
            r3.f23991g = r0
            goto L1f
        Lc:
            boolean r2 = r3.f23991g
            if (r2 != 0) goto L17
            int r2 = r3.f23997n
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = r1
            goto L1f
        L17:
            r3.f23991g = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f23997n = r4
        L1f:
            if (r0 == 0) goto L24
            r3.ktq(r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m4(int, boolean):void");
    }

    public void mu(@lvui AbstractC3952g abstractC3952g) {
        this.f23988c.remove(abstractC3952g);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean n7h(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        v2.measure(bf2(i2, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f67412ld6, marginLayoutParams.width), bf2(i4, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.f67429x2, marginLayoutParams.height));
        return true;
    }

    public int nmn5() {
        if (this.f23991g) {
            return -1;
        }
        return this.f23997n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    @lvui
    public Parcelable o1t(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2) {
        return new SavedState(super.o1t(coordinatorLayout, v2), (BottomSheetBehavior<?>) this);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void py(boolean z2) {
        this.f67405gvn7 = z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, int i2) {
        if (C0683f.m3160f(coordinatorLayout) && !C0683f.m3160f(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.f67407hyr == null) {
            this.f67401f7l8 = coordinatorLayout.getResources().getDimensionPixelSize(C6095k.g.f78901gc3c);
            z4(v2);
            this.f67407hyr = new WeakReference<>(v2);
            C4108p c4108p = this.f24001s;
            if (c4108p != null) {
                C0683f.wlev(v2, c4108p);
                C4108p c4108p2 = this.f24001s;
                float fM3166l = this.f67409jp0y;
                if (fM3166l == -1.0f) {
                    fM3166l = C0683f.m3166l(v2);
                }
                c4108p2.zp(fM3166l);
                boolean z2 = this.f67400eqxt == 3;
                this.f24004z = z2;
                this.f24001s.ch(z2 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f23998p;
                if (colorStateList != null) {
                    C0683f.ga(v2, colorStateList);
                }
            }
            bz2();
            if (C0683f.m3157c(v2) == 0) {
                C0683f.o05(v2, 1);
            }
        }
        if (this.f67414lvui == null) {
            this.f67414lvui = C0779q.cdj(coordinatorLayout, this.f23994j);
        }
        int top = v2.getTop();
        coordinatorLayout.m1738r(v2, i2);
        this.f23996l = coordinatorLayout.getWidth();
        this.f67416n5r1 = coordinatorLayout.getHeight();
        int height = v2.getHeight();
        this.f67418ncyb = height;
        int i3 = this.f67416n5r1;
        int i4 = i3 - height;
        int i5 = this.f67419ni7;
        if (i4 < i5) {
            if (this.f67410ki) {
                this.f67418ncyb = i3;
            } else {
                this.f67418ncyb = i3 - i5;
            }
        }
        this.f67415mcp = Math.max(0, i3 - this.f67418ncyb);
        nn86();
        m14141e();
        int i6 = this.f67400eqxt;
        if (i6 == 3) {
            C0683f.zkd(v2, i1());
        } else if (i6 == 6) {
            C0683f.zkd(v2, this.f67408jk);
        } else if (this.f67405gvn7 && i6 == 5) {
            C0683f.zkd(v2, this.f67416n5r1);
        } else if (i6 == 4) {
            C0683f.zkd(v2, this.f67403fti);
        } else if (i6 == 1 || i6 == 2) {
            C0683f.zkd(v2, top - v2.getTop());
        }
        this.f23990f = new WeakReference<>(y9n(v2));
        for (int i7 = 0; i7 < this.f23988c.size(); i7++) {
            this.f23988c.get(i7).mo14154k(v2);
        }
        return true;
    }

    public void r8s8(int i2) {
        m4(i2, false);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean se() {
        return false;
    }

    public void sok(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f67405gvn7 && i2 == 5) {
            Log.w(f67389nmn5, "Cannot set state: " + i2);
            return;
        }
        int i3 = (i2 == 6 && this.f67425toq && y2(i2) <= this.f67415mcp) ? 3 : i2;
        WeakReference<V> weakReference = this.f67407hyr;
        if (weakReference == null || weakReference.get() == null) {
            cfr(i2);
        } else {
            V v2 = this.f67407hyr.get();
            qo(v2, new RunnableC3953k(v2, i3));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: t */
    public boolean mo1758t(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui View view, @lvui View view2, int i2, int i3) {
        this.f67399dd = 0;
        this.f67430x9kr = false;
        return (i2 & 2) != 0;
    }

    public int t8iq() {
        return this.f23995k;
    }

    @Deprecated
    public void tfm(AbstractC3952g abstractC3952g) {
        Log.w(f67389nmn5, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f23988c.clear();
        if (abstractC3952g != null) {
            this.f23988c.add(abstractC3952g);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m14150u() {
        return this.f67398d3;
    }

    /* JADX INFO: renamed from: v */
    public boolean m14151v() {
        return this.f67405gvn7;
    }

    public void v0af(int i2) {
        this.f23995k = i2;
    }

    public void vyq(@lvui AbstractC3952g abstractC3952g) {
        if (this.f23988c.contains(abstractC3952g)) {
            return;
        }
        this.f23988c.add(abstractC3952g);
    }

    public void w831(boolean z2) {
        this.f67432zy = z2;
    }

    public void was(boolean z2) {
        this.f67417n7h = z2;
    }

    public void wo(boolean z2) {
        this.f67422oc = z2;
    }

    @InterfaceC7833l
    /* JADX INFO: renamed from: x */
    public int m14152x() {
        return this.f67429x2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean x2(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui MotionEvent motionEvent) {
        C0779q c0779q;
        if (!v2.isShown() || !this.f67422oc) {
            this.f24000r = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            qkj8();
        }
        if (this.f67413lrht == null) {
            this.f67413lrht = VelocityTracker.obtain();
        }
        this.f67413lrht.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f67427vyq = (int) motionEvent.getY();
            if (this.f67400eqxt != 2) {
                WeakReference<View> weakReference = this.f23990f;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.jp0y(view, x3, this.f67427vyq)) {
                    this.f67426uv6 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f23989e = true;
                }
            }
            this.f24000r = this.f67426uv6 == -1 && !coordinatorLayout.jp0y(v2, x3, this.f67427vyq);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f23989e = false;
            this.f67426uv6 = -1;
            if (this.f24000r) {
                this.f24000r = false;
                return false;
            }
        }
        if (!this.f24000r && (c0779q = this.f67414lvui) != null && c0779q.lrht(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f23990f;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f24000r || this.f67400eqxt == 1 || coordinatorLayout.jp0y(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f67414lvui == null || Math.abs(((float) this.f67427vyq) - motionEvent.getY()) <= ((float) this.f67414lvui.a9())) ? false : true;
    }

    public boolean xwq3() {
        return this.f67417n7h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: y */
    public void mo1759y(@lvui CoordinatorLayout.f7l8 f7l8Var) {
        super.mo1759y(f7l8Var);
        this.f67407hyr = null;
        this.f67414lvui = null;
    }

    @dd
    @yz
    View y9n(View view) {
        if (C0683f.sok(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewY9n = y9n(viewGroup.getChildAt(i2));
            if (viewY9n != null) {
                return viewY9n;
            }
        }
        return null;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean yqrt(long j2, @zurt(from = 0.0d, to = 100.0d) float f2) {
        return false;
    }

    void yz(int i2) {
        float f2;
        float fI1;
        V v2 = this.f67407hyr.get();
        if (v2 == null || this.f23988c.isEmpty()) {
            return;
        }
        int i3 = this.f67403fti;
        if (i2 > i3 || i3 == i1()) {
            int i4 = this.f67403fti;
            f2 = i4 - i2;
            fI1 = this.f67416n5r1 - i4;
        } else {
            int i5 = this.f67403fti;
            f2 = i5 - i2;
            fI1 = i5 - i1();
        }
        float f3 = f2 / fI1;
        for (int i6 = 0; i6 < this.f23988c.size(); i6++) {
            this.f23988c.get(i6).toq(v2, f3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: z */
    public void mo1760z(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1760z(coordinatorLayout, v2, savedState.getSuperState());
        fnq8(savedState);
        int i2 = savedState.f24007q;
        if (i2 == 1 || i2 == 2) {
            this.f67400eqxt = 4;
            this.f67397d2ok = 4;
        } else {
            this.f67400eqxt = i2;
            this.f67397d2ok = i2;
        }
    }

    C4108p zp() {
        return this.f24001s;
    }

    public void zsr0(boolean z2) {
        if (this.f67405gvn7 != z2) {
            this.f67405gvn7 = z2;
            if (!z2 && this.f67400eqxt == 5) {
                sok(4);
            }
            bz2();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$p */
    private class C3955p {

        /* JADX INFO: renamed from: k */
        private int f24014k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f67434toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Runnable f67435zy;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$p$k */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3955p.this.f67434toq = false;
                C0779q c0779q = BottomSheetBehavior.this.f67414lvui;
                if (c0779q != null && c0779q.kja0(true)) {
                    C3955p c3955p = C3955p.this;
                    c3955p.zy(c3955p.f24014k);
                    return;
                }
                C3955p c3955p2 = C3955p.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f67400eqxt == 2) {
                    bottomSheetBehavior.cfr(c3955p2.f24014k);
                }
            }
        }

        private C3955p() {
            this.f67435zy = new k();
        }

        void zy(int i2) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f67407hyr;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f24014k = i2;
            if (this.f67434toq) {
                return;
            }
            C0683f.mbx(BottomSheetBehavior.this.f67407hyr.get(), this.f67435zy);
            this.f67434toq = true;
        }

        /* synthetic */ C3955p(BottomSheetBehavior bottomSheetBehavior, RunnableC3953k runnableC3953k) {
            this();
        }
    }

    public BottomSheetBehavior(@lvui Context context, @dd AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.f23995k = 0;
        this.f67425toq = true;
        this.f67432zy = false;
        this.f67412ld6 = -1;
        this.f67429x2 = -1;
        this.f67421o1t = new C3955p(this, null);
        this.f67395a9 = 0.5f;
        this.f67409jp0y = -1.0f;
        this.f67422oc = true;
        this.f67400eqxt = 4;
        this.f67397d2ok = 4;
        this.f23988c = new ArrayList<>();
        this.f67406hb = -1;
        this.f23994j = new C3956q();
        this.f24003y = context.getResources().getDimensionPixelSize(C6095k.g.fl);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.bb);
        int i3 = C6095k.kja0.mxh;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f23998p = com.google.android.material.resources.zy.m14753k(context, typedArrayObtainStyledAttributes, i3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6095k.kja0.zidq)) {
            this.f67404fu4 = kja0.m14820n(context, attributeSet, C6095k.zy.f80226ltg8, f67384c8jq).qrj();
        }
        m14146o(context);
        m14145m();
        this.f67409jp0y = typedArrayObtainStyledAttributes.getDimension(C6095k.kja0.wen, -1.0f);
        int i4 = C6095k.kja0.l92;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            ltg8(typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = C6095k.kja0.pi;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            i9jn(typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        int i6 = C6095k.kja0.fbr;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i6);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            r8s8(i2);
        } else {
            r8s8(typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        zsr0(typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.rlj, false));
        was(typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.k2b8, false));
        g1(typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.e9s, true));
        etdu(typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.i8, false));
        wo(typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.p996, true));
        v0af(typedArrayObtainStyledAttributes.getInt(C6095k.kja0.j3px, 0));
        gbni(typedArrayObtainStyledAttributes.getFloat(C6095k.kja0.xh, 0.5f));
        int i7 = C6095k.kja0.is;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i7);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            d8wk(typedValuePeekValue2.data);
        } else {
            d8wk(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i7, 0));
        }
        this.f67411kja0 = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.wr, false);
        this.f23992h = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.le9, false);
        this.f67396cdj = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.krto, false);
        this.f67410ki = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.xzk4, true);
        this.f67424t8r = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.g41, false);
        this.f23993i = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.u0z, false);
        this.f67402fn3e = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.lm, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f23999q = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
