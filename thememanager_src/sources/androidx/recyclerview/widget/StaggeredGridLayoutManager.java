package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1048h implements RecyclerView.AbstractC1058t.toq {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f52068a9 = 2;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    static final int f52069fti = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    @Deprecated
    public static final int f52070jk = 1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final float f52071jp0y = 0.33333334f;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f52072mcp = 0;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static final boolean f52073o1t = false;

    /* JADX INFO: renamed from: t */
    public static final int f5768t = 1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f52074wvg = 0;

    /* JADX INFO: renamed from: z */
    private static final String f5769z = "StaggeredGridLManager";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private SavedState f52075cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.lvui
    private final ki f52076f7l8;

    /* JADX INFO: renamed from: g */
    private int f5770g;

    /* JADX INFO: renamed from: h */
    private boolean f5771h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f52079ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f52080kja0;

    /* JADX INFO: renamed from: n */
    private int f5774n;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int[] f52083ni7;

    /* JADX INFO: renamed from: p */
    private BitSet f5775p;

    /* JADX INFO: renamed from: q */
    @zy.lvui
    o1t f5776q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    C1068q[] f52086toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.lvui
    o1t f52089zy;

    /* JADX INFO: renamed from: k */
    private int f5773k = -1;

    /* JADX INFO: renamed from: y */
    boolean f5778y = false;

    /* JADX INFO: renamed from: s */
    boolean f5777s = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    int f52081ld6 = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    int f52087x2 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    LazySpanLookup f52084qrj = new LazySpanLookup();

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f52082n7h = 2;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final Rect f52085t8r = new Rect();

    /* JADX INFO: renamed from: i */
    private final toq f5772i = new toq();

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f52077fn3e = false;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f52088zurt = true;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private final Runnable f52078fu4 = new RunnableC1067k();

    @SuppressLint({"BanParcelableUsage"})
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        int[] f5784g;

        /* JADX INFO: renamed from: h */
        boolean f5785h;

        /* JADX INFO: renamed from: i */
        boolean f5786i;

        /* JADX INFO: renamed from: k */
        int f5787k;

        /* JADX INFO: renamed from: n */
        int f5788n;

        /* JADX INFO: renamed from: p */
        List<LazySpanLookup.FullSpanItem> f5789p;

        /* JADX INFO: renamed from: q */
        int f5790q;

        /* JADX INFO: renamed from: s */
        int[] f5791s;

        /* JADX INFO: renamed from: y */
        int f5792y;

        /* JADX INFO: renamed from: z */
        boolean f5793z;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: k */
        void m4912k() {
            this.f5784g = null;
            this.f5788n = 0;
            this.f5787k = -1;
            this.f5790q = -1;
        }

        void toq() {
            this.f5784g = null;
            this.f5788n = 0;
            this.f5792y = 0;
            this.f5791s = null;
            this.f5789p = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f5787k);
            parcel.writeInt(this.f5790q);
            parcel.writeInt(this.f5788n);
            if (this.f5788n > 0) {
                parcel.writeIntArray(this.f5784g);
            }
            parcel.writeInt(this.f5792y);
            if (this.f5792y > 0) {
                parcel.writeIntArray(this.f5791s);
            }
            parcel.writeInt(this.f5785h ? 1 : 0);
            parcel.writeInt(this.f5786i ? 1 : 0);
            parcel.writeInt(this.f5793z ? 1 : 0);
            parcel.writeList(this.f5789p);
        }

        SavedState(Parcel parcel) {
            this.f5787k = parcel.readInt();
            this.f5790q = parcel.readInt();
            int i2 = parcel.readInt();
            this.f5788n = i2;
            if (i2 > 0) {
                int[] iArr = new int[i2];
                this.f5784g = iArr;
                parcel.readIntArray(iArr);
            }
            int i3 = parcel.readInt();
            this.f5792y = i3;
            if (i3 > 0) {
                int[] iArr2 = new int[i3];
                this.f5791s = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f5785h = parcel.readInt() == 1;
            this.f5786i = parcel.readInt() == 1;
            this.f5793z = parcel.readInt() == 1;
            this.f5789p = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f5788n = savedState.f5788n;
            this.f5787k = savedState.f5787k;
            this.f5790q = savedState.f5790q;
            this.f5784g = savedState.f5784g;
            this.f5792y = savedState.f5792y;
            this.f5791s = savedState.f5791s;
            this.f5785h = savedState.f5785h;
            this.f5786i = savedState.f5786i;
            this.f5793z = savedState.f5793z;
            this.f5789p = savedState.f5789p;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$k */
    class RunnableC1067k implements Runnable {
        RunnableC1067k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.f7l8();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$q */
    class C1068q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        static final int f52092f7l8 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: n */
        final int f5797n;

        /* JADX INFO: renamed from: k */
        ArrayList<View> f5796k = new ArrayList<>();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52093toq = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f52094zy = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: q */
        int f5798q = 0;

        C1068q(int i2) {
            this.f5797n = i2;
        }

        int cdj(int i2) {
            int i3 = this.f52094zy;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f5796k.size() == 0) {
                return i2;
            }
            zy();
            return this.f52094zy;
        }

        public int f7l8() {
            return StaggeredGridLayoutManager.this.f5778y ? qrj(this.f5796k.size() - 1, -1, true) : qrj(0, this.f5796k.size(), true);
        }

        int fn3e(int i2) {
            int i3 = this.f52093toq;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f5796k.size() == 0) {
                return i2;
            }
            m4920q();
            return this.f52093toq;
        }

        void fu4() {
            int size = this.f5796k.size();
            View viewRemove = this.f5796k.remove(size - 1);
            zy zyVarT8r = t8r(viewRemove);
            zyVarT8r.f5804n = null;
            if (zyVarT8r.f7l8() || zyVarT8r.m4784g()) {
                this.f5798q -= StaggeredGridLayoutManager.this.f52089zy.mo5088n(viewRemove);
            }
            if (size == 1) {
                this.f52093toq = Integer.MIN_VALUE;
            }
            this.f52094zy = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: g */
        public int m4914g() {
            return StaggeredGridLayoutManager.this.f5778y ? n7h(this.f5796k.size() - 1, -1, true) : n7h(0, this.f5796k.size(), true);
        }

        /* JADX INFO: renamed from: h */
        int m4915h() {
            int i2 = this.f52094zy;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            zy();
            return this.f52094zy;
        }

        /* JADX INFO: renamed from: i */
        int m4916i() {
            int i2 = this.f52093toq;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            m4920q();
            return this.f52093toq;
        }

        /* JADX INFO: renamed from: k */
        void m4917k(View view) {
            zy zyVarT8r = t8r(view);
            zyVarT8r.f5804n = this;
            this.f5796k.add(view);
            this.f52094zy = Integer.MIN_VALUE;
            if (this.f5796k.size() == 1) {
                this.f52093toq = Integer.MIN_VALUE;
            }
            if (zyVarT8r.f7l8() || zyVarT8r.m4784g()) {
                this.f5798q += StaggeredGridLayoutManager.this.f52089zy.mo5088n(view);
            }
        }

        public View ki(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.f5796k.size() - 1;
                while (size >= 0) {
                    View view2 = this.f5796k.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5778y && staggeredGridLayoutManager.getPosition(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5778y && staggeredGridLayoutManager2.getPosition(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f5796k.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.f5796k.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f5778y && staggeredGridLayoutManager3.getPosition(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f5778y && staggeredGridLayoutManager4.getPosition(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        public int kja0() {
            return this.f5798q;
        }

        public int ld6() {
            return StaggeredGridLayoutManager.this.f5778y ? n7h(0, this.f5796k.size(), false) : n7h(this.f5796k.size() - 1, -1, false);
        }

        /* JADX INFO: renamed from: n */
        void m4918n() {
            this.f5796k.clear();
            zurt();
            this.f5798q = 0;
        }

        int n7h(int i2, int i3, boolean z2) {
            return x2(i2, i3, z2, true, false);
        }

        void ni7(int i2) {
            int i3 = this.f52093toq;
            if (i3 != Integer.MIN_VALUE) {
                this.f52093toq = i3 + i2;
            }
            int i4 = this.f52094zy;
            if (i4 != Integer.MIN_VALUE) {
                this.f52094zy = i4 + i2;
            }
        }

        void o1t(View view) {
            zy zyVarT8r = t8r(view);
            zyVarT8r.f5804n = this;
            this.f5796k.add(0, view);
            this.f52093toq = Integer.MIN_VALUE;
            if (this.f5796k.size() == 1) {
                this.f52094zy = Integer.MIN_VALUE;
            }
            if (zyVarT8r.f7l8() || zyVarT8r.m4784g()) {
                this.f5798q += StaggeredGridLayoutManager.this.f52089zy.mo5088n(view);
            }
        }

        /* JADX INFO: renamed from: p */
        public int m4919p() {
            return StaggeredGridLayoutManager.this.f5778y ? qrj(0, this.f5796k.size(), true) : qrj(this.f5796k.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: q */
        void m4920q() {
            LazySpanLookup.FullSpanItem fullSpanItemM4904g;
            View view = this.f5796k.get(0);
            zy zyVarT8r = t8r(view);
            this.f52093toq = StaggeredGridLayoutManager.this.f52089zy.f7l8(view);
            if (zyVarT8r.f5803g && (fullSpanItemM4904g = StaggeredGridLayoutManager.this.f52084qrj.m4904g(zyVarT8r.m4787q())) != null && fullSpanItemM4904g.f5783q == -1) {
                this.f52093toq -= fullSpanItemM4904g.m4910k(this.f5797n);
            }
        }

        int qrj(int i2, int i3, boolean z2) {
            return x2(i2, i3, false, false, z2);
        }

        /* JADX INFO: renamed from: s */
        public int m4921s() {
            return StaggeredGridLayoutManager.this.f5778y ? n7h(0, this.f5796k.size(), true) : n7h(this.f5796k.size() - 1, -1, true);
        }

        zy t8r(View view) {
            return (zy) view.getLayoutParams();
        }

        void toq(boolean z2, int i2) {
            int iCdj = z2 ? cdj(Integer.MIN_VALUE) : fn3e(Integer.MIN_VALUE);
            m4918n();
            if (iCdj == Integer.MIN_VALUE) {
                return;
            }
            if (!z2 || iCdj >= StaggeredGridLayoutManager.this.f52089zy.mo5091s()) {
                if (z2 || iCdj <= StaggeredGridLayoutManager.this.f52089zy.n7h()) {
                    if (i2 != Integer.MIN_VALUE) {
                        iCdj += i2;
                    }
                    this.f52094zy = iCdj;
                    this.f52093toq = iCdj;
                }
            }
        }

        void wvg(int i2) {
            this.f52093toq = i2;
            this.f52094zy = i2;
        }

        int x2(int i2, int i3, boolean z2, boolean z3, boolean z5) {
            int iN7h = StaggeredGridLayoutManager.this.f52089zy.n7h();
            int iMo5091s = StaggeredGridLayoutManager.this.f52089zy.mo5091s();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.f5796k.get(i2);
                int iF7l8 = StaggeredGridLayoutManager.this.f52089zy.f7l8(view);
                int iMo5090q = StaggeredGridLayoutManager.this.f52089zy.mo5090q(view);
                boolean z6 = false;
                boolean z7 = !z5 ? iF7l8 >= iMo5091s : iF7l8 > iMo5091s;
                if (!z5 ? iMo5090q > iN7h : iMo5090q >= iN7h) {
                    z6 = true;
                }
                if (z7 && z6) {
                    if (z2 && z3) {
                        if (iF7l8 >= iN7h && iMo5090q <= iMo5091s) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z3) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iF7l8 < iN7h || iMo5090q > iMo5091s) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i2 += i4;
            }
            return -1;
        }

        /* JADX INFO: renamed from: y */
        public int m4922y() {
            return StaggeredGridLayoutManager.this.f5778y ? n7h(this.f5796k.size() - 1, -1, false) : n7h(0, this.f5796k.size(), false);
        }

        /* JADX INFO: renamed from: z */
        void m4923z() {
            View viewRemove = this.f5796k.remove(0);
            zy zyVarT8r = t8r(viewRemove);
            zyVarT8r.f5804n = null;
            if (this.f5796k.size() == 0) {
                this.f52094zy = Integer.MIN_VALUE;
            }
            if (zyVarT8r.f7l8() || zyVarT8r.m4784g()) {
                this.f5798q -= StaggeredGridLayoutManager.this.f52089zy.mo5088n(viewRemove);
            }
            this.f52093toq = Integer.MIN_VALUE;
        }

        void zurt() {
            this.f52093toq = Integer.MIN_VALUE;
            this.f52094zy = Integer.MIN_VALUE;
        }

        void zy() {
            LazySpanLookup.FullSpanItem fullSpanItemM4904g;
            ArrayList<View> arrayList = this.f5796k;
            View view = arrayList.get(arrayList.size() - 1);
            zy zyVarT8r = t8r(view);
            this.f52094zy = StaggeredGridLayoutManager.this.f52089zy.mo5090q(view);
            if (zyVarT8r.f5803g && (fullSpanItemM4904g = StaggeredGridLayoutManager.this.f52084qrj.m4904g(zyVarT8r.m4787q())) != null && fullSpanItemM4904g.f5783q == 1) {
                this.f52094zy += fullSpanItemM4904g.m4910k(this.f5797n);
            }
        }
    }

    class toq {

        /* JADX INFO: renamed from: g */
        int[] f5799g;

        /* JADX INFO: renamed from: k */
        int f5800k;

        /* JADX INFO: renamed from: n */
        boolean f5801n;

        /* JADX INFO: renamed from: q */
        boolean f5802q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52096toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f52097zy;

        toq() {
            zy();
        }

        /* JADX INFO: renamed from: k */
        void m4924k() {
            this.f52096toq = this.f52097zy ? StaggeredGridLayoutManager.this.f52089zy.mo5091s() : StaggeredGridLayoutManager.this.f52089zy.n7h();
        }

        /* JADX INFO: renamed from: q */
        void m4925q(C1068q[] c1068qArr) {
            int length = c1068qArr.length;
            int[] iArr = this.f5799g;
            if (iArr == null || iArr.length < length) {
                this.f5799g = new int[StaggeredGridLayoutManager.this.f52086toq.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.f5799g[i2] = c1068qArr[i2].fn3e(Integer.MIN_VALUE);
            }
        }

        void toq(int i2) {
            if (this.f52097zy) {
                this.f52096toq = StaggeredGridLayoutManager.this.f52089zy.mo5091s() - i2;
            } else {
                this.f52096toq = StaggeredGridLayoutManager.this.f52089zy.n7h() + i2;
            }
        }

        void zy() {
            this.f5800k = -1;
            this.f52096toq = Integer.MIN_VALUE;
            this.f52097zy = false;
            this.f5802q = false;
            this.f5801n = false;
            int[] iArr = this.f5799g;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class zy extends RecyclerView.cdj {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f52098f7l8 = -1;

        /* JADX INFO: renamed from: g */
        boolean f5803g;

        /* JADX INFO: renamed from: n */
        C1068q f5804n;

        public zy(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean ld6() {
            return this.f5803g;
        }

        /* JADX INFO: renamed from: p */
        public final int m4926p() {
            C1068q c1068q = this.f5804n;
            if (c1068q == null) {
                return -1;
            }
            return c1068q.f5797n;
        }

        public void x2(boolean z2) {
            this.f5803g = z2;
        }

        public zy(int i2, int i3) {
            super(i2, i3);
        }

        public zy(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public zy(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public zy(RecyclerView.cdj cdjVar) {
            super(cdjVar);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.AbstractC1048h.q properties = RecyclerView.AbstractC1048h.getProperties(context, attributeSet, i2, i3);
        setOrientation(properties.f5711k);
        m4897c(properties.f52036toq);
        setReverseLayout(properties.f52037zy);
        this.f52076f7l8 = new ki();
        ld6();
    }

    private C1068q a9(ki kiVar) {
        int i2;
        int i3;
        int i4 = -1;
        if (lvui(kiVar.f5895n)) {
            i2 = this.f5773k - 1;
            i3 = -1;
        } else {
            i2 = 0;
            i4 = this.f5773k;
            i3 = 1;
        }
        C1068q c1068q = null;
        if (kiVar.f5895n == 1) {
            int i5 = Integer.MAX_VALUE;
            int iN7h = this.f52089zy.n7h();
            while (i2 != i4) {
                C1068q c1068q2 = this.f52086toq[i2];
                int iCdj = c1068q2.cdj(iN7h);
                if (iCdj < i5) {
                    c1068q = c1068q2;
                    i5 = iCdj;
                }
                i2 += i3;
            }
            return c1068q;
        }
        int i6 = Integer.MIN_VALUE;
        int iMo5091s = this.f52089zy.mo5091s();
        while (i2 != i4) {
            C1068q c1068q3 = this.f52086toq[i2];
            int iFn3e = c1068q3.fn3e(iMo5091s);
            if (iFn3e > i6) {
                c1068q = c1068q3;
                i6 = iFn3e;
            }
            i2 += i3;
        }
        return c1068q;
    }

    private int computeScrollExtent(RecyclerView.mcp mcpVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return fti.m4977k(mcpVar, this.f52089zy, m4899h(!this.f52088zurt), kja0(!this.f52088zurt), this, this.f52088zurt);
    }

    private int computeScrollOffset(RecyclerView.mcp mcpVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return fti.toq(mcpVar, this.f52089zy, m4899h(!this.f52088zurt), kja0(!this.f52088zurt), this, this.f52088zurt, this.f5777s);
    }

    private int computeScrollRange(RecyclerView.mcp mcpVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return fti.zy(mcpVar, this.f52089zy, m4899h(!this.f52088zurt), kja0(!this.f52088zurt), this, this.f52088zurt);
    }

    private int convertFocusDirectionToLayoutDirection(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f5774n == 1) ? 1 : Integer.MIN_VALUE : this.f5774n == 0 ? 1 : Integer.MIN_VALUE : this.f5774n == 1 ? -1 : Integer.MIN_VALUE : this.f5774n == 0 ? -1 : Integer.MIN_VALUE : (this.f5774n != 1 && isLayoutRTL()) ? -1 : 1 : (this.f5774n != 1 && isLayoutRTL()) ? 1 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d2ok(androidx.recyclerview.widget.RecyclerView.fu4 r9, androidx.recyclerview.widget.RecyclerView.mcp r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d2ok(androidx.recyclerview.widget.RecyclerView$fu4, androidx.recyclerview.widget.RecyclerView$mcp, boolean):void");
    }

    private void dd(View view) {
        for (int i2 = this.f5773k - 1; i2 >= 0; i2--) {
            this.f52086toq[i2].o1t(view);
        }
    }

    private void eqxt(View view, zy zyVar, boolean z2) {
        if (zyVar.f5803g) {
            if (this.f5774n == 1) {
                oc(view, this.f52079ki, RecyclerView.AbstractC1048h.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) zyVar).height, true), z2);
                return;
            } else {
                oc(view, RecyclerView.AbstractC1048h.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) zyVar).width, true), this.f52079ki, z2);
                return;
            }
        }
        if (this.f5774n == 1) {
            oc(view, RecyclerView.AbstractC1048h.getChildMeasureSpec(this.f5770g, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) zyVar).width, false), RecyclerView.AbstractC1048h.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) zyVar).height, true), z2);
        } else {
            oc(view, RecyclerView.AbstractC1048h.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) zyVar).width, true), RecyclerView.AbstractC1048h.getChildMeasureSpec(this.f5770g, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) zyVar).height, false), z2);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m4885f(int i2) {
        ki kiVar = this.f52076f7l8;
        kiVar.f5895n = i2;
        kiVar.f5896q = this.f5777s != (i2 == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: g */
    private int m4886g(int i2) {
        if (getChildCount() == 0) {
            return this.f5777s ? 1 : -1;
        }
        return (i2 < fu4()) != this.f5777s ? -1 : 1;
    }

    /* JADX INFO: renamed from: i */
    private int m4887i(int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i2) {
                return position;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    private void m4888j(C1068q c1068q, int i2, int i3) {
        int iKja0 = c1068q.kja0();
        if (i2 == -1) {
            if (c1068q.m4916i() + iKja0 <= i3) {
                this.f5775p.set(c1068q.f5797n, false);
            }
        } else if (c1068q.m4915h() - iKja0 >= i3) {
            this.f5775p.set(c1068q.f5797n, false);
        }
    }

    private int jk(int i2) {
        int iFn3e = this.f52086toq[0].fn3e(i2);
        for (int i3 = 1; i3 < this.f5773k; i3++) {
            int iFn3e2 = this.f52086toq[i3].fn3e(i2);
            if (iFn3e2 < iFn3e) {
                iFn3e = iFn3e2;
            }
        }
        return iFn3e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jp0y(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5777s
            if (r0 == 0) goto L9
            int r0 = r6.o1t()
            goto Ld
        L9:
            int r0 = r6.fu4()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f52084qrj
            r4.m4909y(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f52084qrj
            r9.ld6(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f52084qrj
            r7.m4907p(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f52084qrj
            r9.ld6(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f52084qrj
            r9.m4907p(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f5777s
            if (r7 == 0) goto L4d
            int r7 = r6.fu4()
            goto L51
        L4d:
            int r7 = r6.o1t()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.jp0y(int, int, int):void");
    }

    /* JADX INFO: renamed from: k */
    private void m4889k(View view) {
        for (int i2 = this.f5773k - 1; i2 >= 0; i2--) {
            this.f52086toq[i2].m4917k(view);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m4890l(RecyclerView.fu4 fu4Var, int i2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f52089zy.mo5090q(childAt) > i2 || this.f52089zy.cdj(childAt) > i2) {
                return;
            }
            zy zyVar = (zy) childAt.getLayoutParams();
            if (zyVar.f5803g) {
                for (int i3 = 0; i3 < this.f5773k; i3++) {
                    if (this.f52086toq[i3].f5796k.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.f5773k; i4++) {
                    this.f52086toq[i4].m4923z();
                }
            } else if (zyVar.f5804n.f5796k.size() == 1) {
                return;
            } else {
                zyVar.f5804n.m4923z();
            }
            removeAndRecycleView(childAt, fu4Var);
        }
    }

    private void ld6() {
        this.f52089zy = o1t.toq(this, this.f5774n);
        this.f5776q = o1t.toq(this, 1 - this.f5774n);
    }

    private void lrht(int i2, int i3) {
        for (int i4 = 0; i4 < this.f5773k; i4++) {
            if (!this.f52086toq[i4].f5796k.isEmpty()) {
                m4888j(this.f52086toq[i4], i2, i3);
            }
        }
    }

    private boolean lvui(int i2) {
        if (this.f5774n == 0) {
            return (i2 == -1) != this.f5777s;
        }
        return ((i2 == -1) == this.f5777s) == isLayoutRTL();
    }

    private int mcp(int i2) {
        int iCdj = this.f52086toq[0].cdj(i2);
        for (int i3 = 1; i3 < this.f5773k; i3++) {
            int iCdj2 = this.f52086toq[i3].cdj(i2);
            if (iCdj2 < iCdj) {
                iCdj = iCdj2;
            }
        }
        return iCdj;
    }

    /* JADX INFO: renamed from: n */
    private void m4891n(View view, zy zyVar, ki kiVar) {
        if (kiVar.f5895n == 1) {
            if (zyVar.f5803g) {
                m4889k(view);
                return;
            } else {
                zyVar.f5804n.m4917k(view);
                return;
            }
        }
        if (zyVar.f5803g) {
            dd(view);
        } else {
            zyVar.f5804n.o1t(view);
        }
    }

    private void n5r1() {
        if (this.f5776q.x2() == 1073741824) {
            return;
        }
        float fMax = 0.0f;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float fMo5088n = this.f5776q.mo5088n(childAt);
            if (fMo5088n >= fMax) {
                if (((zy) childAt.getLayoutParams()).ld6()) {
                    fMo5088n = (fMo5088n * 1.0f) / this.f5773k;
                }
                fMax = Math.max(fMax, fMo5088n);
            }
        }
        int i3 = this.f5770g;
        int iRound = Math.round(fMax * this.f5773k);
        if (this.f5776q.x2() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f5776q.kja0());
        }
        hb(iRound);
        if (this.f5770g == i3) {
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            zy zyVar = (zy) childAt2.getLayoutParams();
            if (!zyVar.f5803g) {
                if (isLayoutRTL() && this.f5774n == 1) {
                    int i5 = this.f5773k;
                    int i6 = zyVar.f5804n.f5797n;
                    childAt2.offsetLeftAndRight(((-((i5 - 1) - i6)) * this.f5770g) - ((-((i5 - 1) - i6)) * i3));
                } else {
                    int i7 = zyVar.f5804n.f5797n;
                    int i8 = this.f5770g * i7;
                    int i9 = i7 * i3;
                    if (this.f5774n == 1) {
                        childAt2.offsetLeftAndRight(i8 - i9);
                    } else {
                        childAt2.offsetTopAndBottom(i8 - i9);
                    }
                }
            }
        }
    }

    private int n7h(int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            int position = getPosition(getChildAt(i3));
            if (position >= 0 && position < i2) {
                return position;
            }
        }
        return 0;
    }

    private void ncyb(RecyclerView.fu4 fu4Var, int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f52089zy.f7l8(childAt) < i2 || this.f52089zy.ki(childAt) < i2) {
                return;
            }
            zy zyVar = (zy) childAt.getLayoutParams();
            if (zyVar.f5803g) {
                for (int i3 = 0; i3 < this.f5773k; i3++) {
                    if (this.f52086toq[i3].f5796k.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.f5773k; i4++) {
                    this.f52086toq[i4].fu4();
                }
            } else if (zyVar.f5804n.f5796k.size() == 1) {
                return;
            } else {
                zyVar.f5804n.fu4();
            }
            removeAndRecycleView(childAt, fu4Var);
        }
    }

    private void ni7(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, boolean z2) {
        int iN7h;
        int iJk = jk(Integer.MAX_VALUE);
        if (iJk != Integer.MAX_VALUE && (iN7h = iJk - this.f52089zy.n7h()) > 0) {
            int iScrollBy = iN7h - scrollBy(iN7h, fu4Var, mcpVar);
            if (!z2 || iScrollBy <= 0) {
                return;
            }
            this.f52089zy.mo5087i(-iScrollBy);
        }
    }

    private void nn86(int i2, RecyclerView.mcp mcpVar) {
        int iKja0;
        int iKja02;
        int iF7l8;
        ki kiVar = this.f52076f7l8;
        boolean z2 = false;
        kiVar.f52152toq = 0;
        kiVar.f52153zy = i2;
        if (!isSmoothScrolling() || (iF7l8 = mcpVar.f7l8()) == -1) {
            iKja0 = 0;
            iKja02 = 0;
        } else {
            if (this.f5777s == (iF7l8 < i2)) {
                iKja0 = this.f52089zy.kja0();
                iKja02 = 0;
            } else {
                iKja02 = this.f52089zy.kja0();
                iKja0 = 0;
            }
        }
        if (getClipToPadding()) {
            this.f52076f7l8.f5893g = this.f52089zy.n7h() - iKja02;
            this.f52076f7l8.f52151f7l8 = this.f52089zy.mo5091s() + iKja0;
        } else {
            this.f52076f7l8.f52151f7l8 = this.f52089zy.mo5092y() + iKja0;
            this.f52076f7l8.f5893g = -iKja02;
        }
        ki kiVar2 = this.f52076f7l8;
        kiVar2.f5898y = false;
        kiVar2.f5894k = true;
        if (this.f52089zy.x2() == 0 && this.f52089zy.mo5092y() == 0) {
            z2 = true;
        }
        kiVar2.f5897s = z2;
    }

    /* JADX INFO: renamed from: o */
    private int m4892o(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    private void oc(View view, int i2, int i3, boolean z2) {
        calculateItemDecorationsForChild(view, this.f52085t8r);
        zy zyVar = (zy) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) zyVar).leftMargin;
        Rect rect = this.f52085t8r;
        int iM4892o = m4892o(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) zyVar).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) zyVar).topMargin;
        Rect rect2 = this.f52085t8r;
        int iM4892o2 = m4892o(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) zyVar).bottomMargin + rect2.bottom);
        if (z2 ? shouldReMeasureChild(view, iM4892o, iM4892o2, zyVar) : shouldMeasureChild(view, iM4892o, iM4892o2, zyVar)) {
            view.measure(iM4892o, iM4892o2);
        }
    }

    /* JADX INFO: renamed from: p */
    private LazySpanLookup.FullSpanItem m4893p(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f5782n = new int[this.f5773k];
        for (int i3 = 0; i3 < this.f5773k; i3++) {
            fullSpanItem.f5782n[i3] = this.f52086toq[i3].fn3e(i2) - i2;
        }
        return fullSpanItem;
    }

    private void resolveShouldLayoutReverse() {
        if (this.f5774n == 1 || !isLayoutRTL()) {
            this.f5777s = this.f5778y;
        } else {
            this.f5777s = !this.f5778y;
        }
    }

    /* JADX INFO: renamed from: s */
    private LazySpanLookup.FullSpanItem m4894s(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f5782n = new int[this.f5773k];
        for (int i3 = 0; i3 < this.f5773k; i3++) {
            fullSpanItem.f5782n[i3] = i2 - this.f52086toq[i3].cdj(i2);
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: t */
    private int m4895t(int i2) {
        int iFn3e = this.f52086toq[0].fn3e(i2);
        for (int i3 = 1; i3 < this.f5773k; i3++) {
            int iFn3e2 = this.f52086toq[i3].fn3e(i2);
            if (iFn3e2 > iFn3e) {
                iFn3e = iFn3e2;
            }
        }
        return iFn3e;
    }

    private void toq(toq toqVar) {
        SavedState savedState = this.f52075cdj;
        int i2 = savedState.f5788n;
        if (i2 > 0) {
            if (i2 == this.f5773k) {
                for (int i3 = 0; i3 < this.f5773k; i3++) {
                    this.f52086toq[i3].m4918n();
                    SavedState savedState2 = this.f52075cdj;
                    int iMo5091s = savedState2.f5784g[i3];
                    if (iMo5091s != Integer.MIN_VALUE) {
                        iMo5091s += savedState2.f5786i ? this.f52089zy.mo5091s() : this.f52089zy.n7h();
                    }
                    this.f52086toq[i3].wvg(iMo5091s);
                }
            } else {
                savedState.toq();
                SavedState savedState3 = this.f52075cdj;
                savedState3.f5787k = savedState3.f5790q;
            }
        }
        SavedState savedState4 = this.f52075cdj;
        this.f5771h = savedState4.f5793z;
        setReverseLayout(savedState4.f5785h);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.f52075cdj;
        int i4 = savedState5.f5787k;
        if (i4 != -1) {
            this.f52081ld6 = i4;
            toqVar.f52097zy = savedState5.f5786i;
        } else {
            toqVar.f52097zy = this.f5777s;
        }
        if (savedState5.f5792y > 1) {
            LazySpanLookup lazySpanLookup = this.f52084qrj;
            lazySpanLookup.f5779k = savedState5.f5791s;
            lazySpanLookup.f52091toq = savedState5.f5789p;
        }
    }

    private boolean uv6(RecyclerView.mcp mcpVar, toq toqVar) {
        toqVar.f5800k = this.f52080kja0 ? m4887i(mcpVar.m4822q()) : n7h(mcpVar.m4822q());
        toqVar.f52096toq = Integer.MIN_VALUE;
        return true;
    }

    private int wvg(int i2) {
        int iCdj = this.f52086toq[0].cdj(i2);
        for (int i3 = 1; i3 < this.f5773k; i3++) {
            int iCdj2 = this.f52086toq[i3].cdj(i2);
            if (iCdj2 > iCdj) {
                iCdj = iCdj2;
            }
        }
        return iCdj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.recyclerview.widget.RecyclerView$h, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int x2(RecyclerView.fu4 fu4Var, ki kiVar, RecyclerView.mcp mcpVar) {
        C1068q c1068qA9;
        int iMo5088n;
        int i2;
        int iMo5088n2;
        int iMo5088n3;
        boolean z2;
        ?? r9 = 0;
        this.f5775p.set(0, this.f5773k, true);
        int i3 = this.f52076f7l8.f5897s ? kiVar.f5895n == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : kiVar.f5895n == 1 ? kiVar.f52151f7l8 + kiVar.f52152toq : kiVar.f5893g - kiVar.f52152toq;
        lrht(kiVar.f5895n, i3);
        int iMo5091s = this.f5777s ? this.f52089zy.mo5091s() : this.f52089zy.n7h();
        ?? r0 = false;
        while (kiVar.m5004k(mcpVar) && (this.f52076f7l8.f5897s || !this.f5775p.isEmpty())) {
            View qVar = kiVar.toq(fu4Var);
            zy zyVar = (zy) qVar.getLayoutParams();
            int iM4787q = zyVar.m4787q();
            int iF7l8 = this.f52084qrj.f7l8(iM4787q);
            ?? r3 = iF7l8 == -1 ? 1 : r9;
            if (r3 != 0) {
                c1068qA9 = zyVar.f5803g ? this.f52086toq[r9] : a9(kiVar);
                this.f52084qrj.n7h(iM4787q, c1068qA9);
            } else {
                c1068qA9 = this.f52086toq[iF7l8];
            }
            C1068q c1068q = c1068qA9;
            zyVar.f5804n = c1068q;
            if (kiVar.f5895n == 1) {
                addView(qVar);
            } else {
                addView(qVar, r9);
            }
            eqxt(qVar, zyVar, r9);
            if (kiVar.f5895n == 1) {
                int iWvg = zyVar.f5803g ? wvg(iMo5091s) : c1068q.cdj(iMo5091s);
                int iMo5088n4 = this.f52089zy.mo5088n(qVar) + iWvg;
                if (r3 != 0 && zyVar.f5803g) {
                    LazySpanLookup.FullSpanItem fullSpanItemM4894s = m4894s(iWvg);
                    fullSpanItemM4894s.f5783q = -1;
                    fullSpanItemM4894s.f5781k = iM4787q;
                    this.f52084qrj.m4905k(fullSpanItemM4894s);
                }
                i2 = iMo5088n4;
                iMo5088n = iWvg;
            } else {
                int iJk = zyVar.f5803g ? jk(iMo5091s) : c1068q.fn3e(iMo5091s);
                iMo5088n = iJk - this.f52089zy.mo5088n(qVar);
                if (r3 != 0 && zyVar.f5803g) {
                    LazySpanLookup.FullSpanItem fullSpanItemM4893p = m4893p(iJk);
                    fullSpanItemM4893p.f5783q = 1;
                    fullSpanItemM4893p.f5781k = iM4787q;
                    this.f52084qrj.m4905k(fullSpanItemM4893p);
                }
                i2 = iJk;
            }
            if (zyVar.f5803g && kiVar.f5896q == -1) {
                if (r3 != 0) {
                    this.f52077fn3e = true;
                } else {
                    if (!(kiVar.f5895n == 1 ? zy() : m4900q())) {
                        LazySpanLookup.FullSpanItem fullSpanItemM4904g = this.f52084qrj.m4904g(iM4787q);
                        if (fullSpanItemM4904g != null) {
                            fullSpanItemM4904g.f5780g = true;
                        }
                        this.f52077fn3e = true;
                    }
                }
            }
            m4891n(qVar, zyVar, kiVar);
            if (isLayoutRTL() && this.f5774n == 1) {
                int iMo5091s2 = zyVar.f5803g ? this.f5776q.mo5091s() : this.f5776q.mo5091s() - (((this.f5773k - 1) - c1068q.f5797n) * this.f5770g);
                iMo5088n3 = iMo5091s2;
                iMo5088n2 = iMo5091s2 - this.f5776q.mo5088n(qVar);
            } else {
                int iN7h = zyVar.f5803g ? this.f5776q.n7h() : (c1068q.f5797n * this.f5770g) + this.f5776q.n7h();
                iMo5088n2 = iN7h;
                iMo5088n3 = this.f5776q.mo5088n(qVar) + iN7h;
            }
            if (this.f5774n == 1) {
                layoutDecoratedWithMargins(qVar, iMo5088n2, iMo5088n, iMo5088n3, i2);
            } else {
                layoutDecoratedWithMargins(qVar, iMo5088n, iMo5088n2, i2, iMo5088n3);
            }
            if (zyVar.f5803g) {
                lrht(this.f52076f7l8.f5895n, i3);
            } else {
                m4888j(c1068q, this.f52076f7l8.f5895n, i3);
            }
            x9kr(fu4Var, this.f52076f7l8);
            if (!this.f52076f7l8.f5898y || !qVar.hasFocusable()) {
                z2 = false;
            } else if (zyVar.f5803g) {
                this.f5775p.clear();
                z2 = false;
            } else {
                z2 = false;
                this.f5775p.set(c1068q.f5797n, false);
            }
            r9 = z2;
            r0 = true;
        }
        ?? r32 = r9;
        if (r0 == false) {
            x9kr(fu4Var, this.f52076f7l8);
        }
        int iN7h2 = this.f52076f7l8.f5895n == -1 ? this.f52089zy.n7h() - jk(this.f52089zy.n7h()) : wvg(this.f52089zy.mo5091s()) - this.f52089zy.mo5091s();
        return iN7h2 > 0 ? Math.min(kiVar.f52152toq, iN7h2) : r32 == true ? 1 : 0;
    }

    private void x9kr(RecyclerView.fu4 fu4Var, ki kiVar) {
        if (!kiVar.f5894k || kiVar.f5897s) {
            return;
        }
        if (kiVar.f52152toq == 0) {
            if (kiVar.f5895n == -1) {
                ncyb(fu4Var, kiVar.f52151f7l8);
                return;
            } else {
                m4890l(fu4Var, kiVar.f5893g);
                return;
            }
        }
        if (kiVar.f5895n != -1) {
            int iMcp = mcp(kiVar.f52151f7l8) - kiVar.f52151f7l8;
            m4890l(fu4Var, iMcp < 0 ? kiVar.f5893g : Math.min(iMcp, kiVar.f52152toq) + kiVar.f5893g);
        } else {
            int i2 = kiVar.f5893g;
            int iM4895t = i2 - m4895t(i2);
            ncyb(fu4Var, iM4895t < 0 ? kiVar.f52151f7l8 : kiVar.f52151f7l8 - Math.min(iM4895t, kiVar.f52152toq));
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m4896y(C1068q c1068q) {
        if (this.f5777s) {
            if (c1068q.m4915h() < this.f52089zy.mo5091s()) {
                ArrayList<View> arrayList = c1068q.f5796k;
                return !c1068q.t8r(arrayList.get(arrayList.size() - 1)).f5803g;
            }
        } else if (c1068q.m4916i() > this.f52089zy.n7h()) {
            return !c1068q.t8r(c1068q.f5796k.get(0)).f5803g;
        }
        return false;
    }

    private void zurt(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, boolean z2) {
        int iMo5091s;
        int iWvg = wvg(Integer.MIN_VALUE);
        if (iWvg != Integer.MIN_VALUE && (iMo5091s = this.f52089zy.mo5091s() - iWvg) > 0) {
            int i2 = iMo5091s - (-scrollBy(-iMo5091s, fu4Var, mcpVar));
            if (!z2 || i2 <= 0) {
                return;
            }
            this.f52089zy.mo5087i(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f52075cdj == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4897c(int i2) {
        assertNotInLayoutOrScroll(null);
        if (i2 != this.f5773k) {
            d3();
            this.f5773k = i2;
            this.f5775p = new BitSet(this.f5773k);
            this.f52086toq = new C1068q[this.f5773k];
            for (int i3 = 0; i3 < this.f5773k; i3++) {
                this.f52086toq[i3] = new C1068q(i3);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean canScrollHorizontally() {
        return this.f5774n == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean canScrollVertically() {
        return this.f5774n == 1;
    }

    int cdj() {
        View viewKja0 = this.f5777s ? kja0(true) : m4899h(true);
        if (viewKja0 == null) {
            return -1;
        }
        return getPosition(viewKja0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean checkLayoutParams(RecyclerView.cdj cdjVar) {
        return cdjVar instanceof zy;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    @uv6({uv6.EnumC7844k.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.mcp mcpVar, RecyclerView.AbstractC1048h.zy zyVar) {
        int iCdj;
        int iFn3e;
        if (this.f5774n != 0) {
            i2 = i3;
        }
        if (getChildCount() == 0 || i2 == 0) {
            return;
        }
        m4901r(i2, mcpVar);
        int[] iArr = this.f52083ni7;
        if (iArr == null || iArr.length < this.f5773k) {
            this.f52083ni7 = new int[this.f5773k];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f5773k; i5++) {
            ki kiVar = this.f52076f7l8;
            if (kiVar.f5896q == -1) {
                iCdj = kiVar.f5893g;
                iFn3e = this.f52086toq[i5].fn3e(iCdj);
            } else {
                iCdj = this.f52086toq[i5].cdj(kiVar.f52151f7l8);
                iFn3e = this.f52076f7l8.f52151f7l8;
            }
            int i6 = iCdj - iFn3e;
            if (i6 >= 0) {
                this.f52083ni7[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f52083ni7, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f52076f7l8.m5004k(mcpVar); i7++) {
            zyVar.mo4811k(this.f52076f7l8.f52153zy, this.f52083ni7[i7]);
            ki kiVar2 = this.f52076f7l8;
            kiVar2.f52153zy += kiVar2.f5896q;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeHorizontalScrollExtent(RecyclerView.mcp mcpVar) {
        return computeScrollExtent(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeHorizontalScrollOffset(RecyclerView.mcp mcpVar) {
        return computeScrollOffset(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeHorizontalScrollRange(RecyclerView.mcp mcpVar) {
        return computeScrollRange(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1058t.toq
    public PointF computeScrollVectorForPosition(int i2) {
        int iM4886g = m4886g(i2);
        PointF pointF = new PointF();
        if (iM4886g == 0) {
            return null;
        }
        if (this.f5774n == 0) {
            pointF.x = iM4886g;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM4886g;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeVerticalScrollExtent(RecyclerView.mcp mcpVar) {
        return computeScrollExtent(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeVerticalScrollOffset(RecyclerView.mcp mcpVar) {
        return computeScrollOffset(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeVerticalScrollRange(RecyclerView.mcp mcpVar) {
        return computeScrollRange(mcpVar);
    }

    public void d3() {
        this.f52084qrj.toq();
        requestLayout();
    }

    /* JADX INFO: renamed from: e */
    void m4898e(RecyclerView.mcp mcpVar, toq toqVar) {
        if (vyq(mcpVar, toqVar) || uv6(mcpVar, toqVar)) {
            return;
        }
        toqVar.m4924k();
        toqVar.f5800k = 0;
    }

    boolean f7l8() {
        int iFu4;
        int iO1t;
        if (getChildCount() == 0 || this.f52082n7h == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f5777s) {
            iFu4 = o1t();
            iO1t = fu4();
        } else {
            iFu4 = fu4();
            iO1t = o1t();
        }
        if (iFu4 == 0 && gvn7() != null) {
            this.f52084qrj.toq();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f52077fn3e) {
            return false;
        }
        int i2 = this.f5777s ? -1 : 1;
        int i3 = iO1t + 1;
        LazySpanLookup.FullSpanItem fullSpanItemM4906n = this.f52084qrj.m4906n(iFu4, i3, i2, true);
        if (fullSpanItemM4906n == null) {
            this.f52077fn3e = false;
            this.f52084qrj.m4908q(i3);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemM4906n2 = this.f52084qrj.m4906n(iFu4, fullSpanItemM4906n.f5781k, i2 * (-1), true);
        if (fullSpanItemM4906n2 == null) {
            this.f52084qrj.m4908q(fullSpanItemM4906n.f5781k);
        } else {
            this.f52084qrj.m4908q(fullSpanItemM4906n2.f5781k + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public int[] fn3e(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5773k];
        } else if (iArr.length < this.f5773k) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5773k + ", array size:" + iArr.length);
        }
        for (int i2 = 0; i2 < this.f5773k; i2++) {
            iArr[i2] = this.f52086toq[i2].ld6();
        }
        return iArr;
    }

    public int fti() {
        return this.f5773k;
    }

    int fu4() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public RecyclerView.cdj generateDefaultLayoutParams() {
        return this.f5774n == 0 ? new zy(-2, -1) : new zy(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public RecyclerView.cdj generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new zy(context, attributeSet);
    }

    public int getOrientation() {
        return this.f5774n;
    }

    public boolean getReverseLayout() {
        return this.f5778y;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View gvn7() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5773k
            r2.<init>(r3)
            int r3 = r12.f5773k
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f5774n
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.f5777s
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$zy r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.zy) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$q r9 = r8.f5804n
            int r9 = r9.f5797n
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$q r9 = r8.f5804n
            boolean r9 = r12.m4896y(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$q r9 = r8.f5804n
            int r9 = r9.f5797n
            r2.clear(r9)
        L54:
            boolean r9 = r8.f5803g
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f5777s
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.o1t r10 = r12.f52089zy
            int r10 = r10.mo5090q(r7)
            androidx.recyclerview.widget.o1t r11 = r12.f52089zy
            int r11 = r11.mo5090q(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.o1t r10 = r12.f52089zy
            int r10 = r10.f7l8(r7)
            androidx.recyclerview.widget.o1t r11 = r12.f52089zy
            int r11 = r11.f7l8(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$zy r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.zy) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$q r8 = r8.f5804n
            int r8 = r8.f5797n
            androidx.recyclerview.widget.StaggeredGridLayoutManager$q r9 = r9.f5804n
            int r9 = r9.f5797n
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.gvn7():android.view.View");
    }

    /* JADX INFO: renamed from: h */
    View m4899h(boolean z2) {
        int iN7h = this.f52089zy.n7h();
        int iMo5091s = this.f52089zy.mo5091s();
        int childCount = getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int iF7l8 = this.f52089zy.f7l8(childAt);
            if (this.f52089zy.mo5090q(childAt) > iN7h && iF7l8 < iMo5091s) {
                if (iF7l8 >= iN7h || !z2) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    void hb(int i2) {
        this.f5770g = i2 / this.f5773k;
        this.f52079ki = View.MeasureSpec.makeMeasureSpec(i2, this.f5776q.x2());
    }

    public void hyr(int i2) {
        assertNotInLayoutOrScroll(null);
        if (i2 == this.f52082n7h) {
            return;
        }
        if (i2 != 0 && i2 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f52082n7h = i2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean isAutoMeasureEnabled() {
        return this.f52082n7h != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public int[] ki(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5773k];
        } else if (iArr.length < this.f5773k) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5773k + ", array size:" + iArr.length);
        }
        for (int i2 = 0; i2 < this.f5773k; i2++) {
            iArr[i2] = this.f52086toq[i2].m4922y();
        }
        return iArr;
    }

    View kja0(boolean z2) {
        int iN7h = this.f52089zy.n7h();
        int iMo5091s = this.f52089zy.mo5091s();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iF7l8 = this.f52089zy.f7l8(childAt);
            int iMo5090q = this.f52089zy.mo5090q(childAt);
            if (iMo5090q > iN7h && iF7l8 < iMo5091s) {
                if (iMo5090q <= iMo5091s || !z2) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    int o1t() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void offsetChildrenHorizontal(int i2) {
        super.offsetChildrenHorizontal(i2);
        for (int i3 = 0; i3 < this.f5773k; i3++) {
            this.f52086toq[i3].ni7(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void offsetChildrenVertical(int i2) {
        super.offsetChildrenVertical(i2);
        for (int i3 = 0; i3 < this.f5773k; i3++) {
            this.f52086toq[i3].ni7(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onAdapterChanged(@zy.dd RecyclerView.AbstractC1060y abstractC1060y, @zy.dd RecyclerView.AbstractC1060y abstractC1060y2) {
        this.f52084qrj.toq();
        for (int i2 = 0; i2 < this.f5773k; i2++) {
            this.f52086toq[i2].m4918n();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.fu4 fu4Var) {
        super.onDetachedFromWindow(recyclerView, fu4Var);
        removeCallbacks(this.f52078fu4);
        for (int i2 = 0; i2 < this.f5773k; i2++) {
            this.f52086toq[i2].m4918n();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    @zy.dd
    public View onFocusSearchFailed(View view, int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        View viewFindContainingItemView;
        View viewKi;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i2);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        zy zyVar = (zy) viewFindContainingItemView.getLayoutParams();
        boolean z2 = zyVar.f5803g;
        C1068q c1068q = zyVar.f5804n;
        int iO1t = iConvertFocusDirectionToLayoutDirection == 1 ? o1t() : fu4();
        nn86(iO1t, mcpVar);
        m4885f(iConvertFocusDirectionToLayoutDirection);
        ki kiVar = this.f52076f7l8;
        kiVar.f52153zy = kiVar.f5896q + iO1t;
        kiVar.f52152toq = (int) (this.f52089zy.kja0() * f52071jp0y);
        ki kiVar2 = this.f52076f7l8;
        kiVar2.f5898y = true;
        kiVar2.f5894k = false;
        x2(fu4Var, kiVar2, mcpVar);
        this.f52080kja0 = this.f5777s;
        if (!z2 && (viewKi = c1068q.ki(iO1t, iConvertFocusDirectionToLayoutDirection)) != null && viewKi != viewFindContainingItemView) {
            return viewKi;
        }
        if (lvui(iConvertFocusDirectionToLayoutDirection)) {
            for (int i3 = this.f5773k - 1; i3 >= 0; i3--) {
                View viewKi2 = this.f52086toq[i3].ki(iO1t, iConvertFocusDirectionToLayoutDirection);
                if (viewKi2 != null && viewKi2 != viewFindContainingItemView) {
                    return viewKi2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f5773k; i4++) {
                View viewKi3 = this.f52086toq[i4].ki(iO1t, iConvertFocusDirectionToLayoutDirection);
                if (viewKi3 != null && viewKi3 != viewFindContainingItemView) {
                    return viewKi3;
                }
            }
        }
        boolean z3 = (this.f5778y ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z2) {
            View viewFindViewByPosition = findViewByPosition(z3 ? c1068q.f7l8() : c1068q.m4919p());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (lvui(iConvertFocusDirectionToLayoutDirection)) {
            for (int i5 = this.f5773k - 1; i5 >= 0; i5--) {
                if (i5 != c1068q.f5797n) {
                    View viewFindViewByPosition2 = findViewByPosition(z3 ? this.f52086toq[i5].f7l8() : this.f52086toq[i5].m4919p());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f5773k; i6++) {
                View viewFindViewByPosition3 = findViewByPosition(z3 ? this.f52086toq[i6].f7l8() : this.f52086toq[i6].m4919p());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM4899h = m4899h(false);
            View viewKja0 = kja0(false);
            if (viewM4899h == null || viewKja0 == null) {
                return;
            }
            int position = getPosition(viewM4899h);
            int position2 = getPosition(viewKja0);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        jp0y(i2, i3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f52084qrj.toq();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        jp0y(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        jp0y(i2, i3, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        jp0y(i2, i3, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onLayoutChildren(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        d2ok(fu4Var, mcpVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onLayoutCompleted(RecyclerView.mcp mcpVar) {
        super.onLayoutCompleted(mcpVar);
        this.f52081ld6 = -1;
        this.f52087x2 = Integer.MIN_VALUE;
        this.f52075cdj = null;
        this.f5772i.zy();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f52075cdj = savedState;
            if (this.f52081ld6 != -1) {
                savedState.m4912k();
                this.f52075cdj.toq();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public Parcelable onSaveInstanceState() {
        int iFn3e;
        int iN7h;
        int[] iArr;
        if (this.f52075cdj != null) {
            return new SavedState(this.f52075cdj);
        }
        SavedState savedState = new SavedState();
        savedState.f5785h = this.f5778y;
        savedState.f5786i = this.f52080kja0;
        savedState.f5793z = this.f5771h;
        LazySpanLookup lazySpanLookup = this.f52084qrj;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f5779k) == null) {
            savedState.f5792y = 0;
        } else {
            savedState.f5791s = iArr;
            savedState.f5792y = iArr.length;
            savedState.f5789p = lazySpanLookup.f52091toq;
        }
        if (getChildCount() > 0) {
            savedState.f5787k = this.f52080kja0 ? o1t() : fu4();
            savedState.f5790q = cdj();
            int i2 = this.f5773k;
            savedState.f5788n = i2;
            savedState.f5784g = new int[i2];
            for (int i3 = 0; i3 < this.f5773k; i3++) {
                if (this.f52080kja0) {
                    iFn3e = this.f52086toq[i3].cdj(Integer.MIN_VALUE);
                    if (iFn3e != Integer.MIN_VALUE) {
                        iN7h = this.f52089zy.mo5091s();
                        iFn3e -= iN7h;
                    }
                } else {
                    iFn3e = this.f52086toq[i3].fn3e(Integer.MIN_VALUE);
                    if (iFn3e != Integer.MIN_VALUE) {
                        iN7h = this.f52089zy.n7h();
                        iFn3e -= iN7h;
                    }
                }
                savedState.f5784g[i3] = iFn3e;
            }
        } else {
            savedState.f5787k = -1;
            savedState.f5790q = -1;
            savedState.f5788n = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onScrollStateChanged(int i2) {
        if (i2 == 0) {
            f7l8();
        }
    }

    /* JADX INFO: renamed from: q */
    boolean m4900q() {
        int iFn3e = this.f52086toq[0].fn3e(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f5773k; i2++) {
            if (this.f52086toq[i2].fn3e(Integer.MIN_VALUE) != iFn3e) {
                return false;
            }
        }
        return true;
    }

    public int[] qrj(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5773k];
        } else if (iArr.length < this.f5773k) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5773k + ", array size:" + iArr.length);
        }
        for (int i2 = 0; i2 < this.f5773k; i2++) {
            iArr[i2] = this.f52086toq[i2].m4914g();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: r */
    void m4901r(int i2, RecyclerView.mcp mcpVar) {
        int i3;
        int iFu4;
        if (i2 > 0) {
            iFu4 = o1t();
            i3 = 1;
        } else {
            i3 = -1;
            iFu4 = fu4();
        }
        this.f52076f7l8.f5894k = true;
        nn86(iFu4, mcpVar);
        m4885f(i3);
        ki kiVar = this.f52076f7l8;
        kiVar.f52153zy = iFu4 + kiVar.f5896q;
        kiVar.f52152toq = Math.abs(i2);
    }

    int scrollBy(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        m4901r(i2, mcpVar);
        int iX2 = x2(fu4Var, this.f52076f7l8, mcpVar);
        if (this.f52076f7l8.f52152toq >= iX2) {
            i2 = i2 < 0 ? -iX2 : iX2;
        }
        this.f52089zy.mo5087i(-i2);
        this.f52080kja0 = this.f5777s;
        ki kiVar = this.f52076f7l8;
        kiVar.f52152toq = 0;
        x9kr(fu4Var, kiVar);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollHorizontallyBy(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        return scrollBy(i2, fu4Var, mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void scrollToPosition(int i2) {
        SavedState savedState = this.f52075cdj;
        if (savedState != null && savedState.f5787k != i2) {
            savedState.m4912k();
        }
        this.f52081ld6 = i2;
        this.f52087x2 = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i2, int i3) {
        SavedState savedState = this.f52075cdj;
        if (savedState != null) {
            savedState.m4912k();
        }
        this.f52081ld6 = i2;
        this.f52087x2 = i3;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollVerticallyBy(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        return scrollBy(i2, fu4Var, mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void setMeasuredDimension(Rect rect, int i2, int i3) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f5774n == 1) {
            iChooseSize2 = RecyclerView.AbstractC1048h.chooseSize(i3, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.AbstractC1048h.chooseSize(i2, (this.f5770g * this.f5773k) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC1048h.chooseSize(i2, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.AbstractC1048h.chooseSize(i3, (this.f5770g * this.f5773k) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i2 == this.f5774n) {
            return;
        }
        this.f5774n = i2;
        o1t o1tVar = this.f52089zy;
        this.f52089zy = this.f5776q;
        this.f5776q = o1tVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z2) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f52075cdj;
        if (savedState != null && savedState.f5785h != z2) {
            savedState.f5785h = z2;
        }
        this.f5778y = z2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.mcp mcpVar, int i2) {
        t8r t8rVar = new t8r(recyclerView.getContext());
        t8rVar.cdj(i2);
        startSmoothScroll(t8rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean supportsPredictiveItemAnimations() {
        return this.f52075cdj == null;
    }

    public int[] t8r(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5773k];
        } else if (iArr.length < this.f5773k) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5773k + ", array size:" + iArr.length);
        }
        for (int i2 = 0; i2 < this.f5773k; i2++) {
            iArr[i2] = this.f52086toq[i2].m4921s();
        }
        return iArr;
    }

    boolean vyq(RecyclerView.mcp mcpVar, toq toqVar) {
        int i2;
        if (!mcpVar.m4821p() && (i2 = this.f52081ld6) != -1) {
            if (i2 >= 0 && i2 < mcpVar.m4822q()) {
                SavedState savedState = this.f52075cdj;
                if (savedState == null || savedState.f5787k == -1 || savedState.f5788n < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f52081ld6);
                    if (viewFindViewByPosition != null) {
                        toqVar.f5800k = this.f5777s ? o1t() : fu4();
                        if (this.f52087x2 != Integer.MIN_VALUE) {
                            if (toqVar.f52097zy) {
                                toqVar.f52096toq = (this.f52089zy.mo5091s() - this.f52087x2) - this.f52089zy.mo5090q(viewFindViewByPosition);
                            } else {
                                toqVar.f52096toq = (this.f52089zy.n7h() + this.f52087x2) - this.f52089zy.f7l8(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f52089zy.mo5088n(viewFindViewByPosition) > this.f52089zy.kja0()) {
                            toqVar.f52096toq = toqVar.f52097zy ? this.f52089zy.mo5091s() : this.f52089zy.n7h();
                            return true;
                        }
                        int iF7l8 = this.f52089zy.f7l8(viewFindViewByPosition) - this.f52089zy.n7h();
                        if (iF7l8 < 0) {
                            toqVar.f52096toq = -iF7l8;
                            return true;
                        }
                        int iMo5091s = this.f52089zy.mo5091s() - this.f52089zy.mo5090q(viewFindViewByPosition);
                        if (iMo5091s < 0) {
                            toqVar.f52096toq = iMo5091s;
                            return true;
                        }
                        toqVar.f52096toq = Integer.MIN_VALUE;
                    } else {
                        int i3 = this.f52081ld6;
                        toqVar.f5800k = i3;
                        int i4 = this.f52087x2;
                        if (i4 == Integer.MIN_VALUE) {
                            toqVar.f52097zy = m4886g(i3) == 1;
                            toqVar.m4924k();
                        } else {
                            toqVar.toq(i4);
                        }
                        toqVar.f5802q = true;
                    }
                } else {
                    toqVar.f52096toq = Integer.MIN_VALUE;
                    toqVar.f5800k = this.f52081ld6;
                }
                return true;
            }
            this.f52081ld6 = -1;
            this.f52087x2 = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public int m4902z() {
        return this.f52082n7h;
    }

    boolean zy() {
        int iCdj = this.f52086toq[0].cdj(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f5773k; i2++) {
            if (this.f52086toq[i2].cdj(Integer.MIN_VALUE) != iCdj) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public RecyclerView.cdj generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new zy((ViewGroup.MarginLayoutParams) layoutParams) : new zy(layoutParams);
    }

    static class LazySpanLookup {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f52090zy = 10;

        /* JADX INFO: renamed from: k */
        int[] f5779k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        List<FullSpanItem> f52091toq;

        LazySpanLookup() {
        }

        private void qrj(int i2, int i3) {
            List<FullSpanItem> list = this.f52091toq;
            if (list == null) {
                return;
            }
            int i4 = i2 + i3;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f52091toq.get(size);
                int i5 = fullSpanItem.f5781k;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f52091toq.remove(size);
                    } else {
                        fullSpanItem.f5781k = i5 - i3;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: s */
        private int m4903s(int i2) {
            if (this.f52091toq == null) {
                return -1;
            }
            FullSpanItem fullSpanItemM4904g = m4904g(i2);
            if (fullSpanItemM4904g != null) {
                this.f52091toq.remove(fullSpanItemM4904g);
            }
            int size = this.f52091toq.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (this.f52091toq.get(i3).f5781k >= i2) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f52091toq.get(i3);
            this.f52091toq.remove(i3);
            return fullSpanItem.f5781k;
        }

        private void x2(int i2, int i3) {
            List<FullSpanItem> list = this.f52091toq;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f52091toq.get(size);
                int i4 = fullSpanItem.f5781k;
                if (i4 >= i2) {
                    fullSpanItem.f5781k = i4 + i3;
                }
            }
        }

        int f7l8(int i2) {
            int[] iArr = this.f5779k;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        /* JADX INFO: renamed from: g */
        public FullSpanItem m4904g(int i2) {
            List<FullSpanItem> list = this.f52091toq;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f52091toq.get(size);
                if (fullSpanItem.f5781k == i2) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        public void m4905k(FullSpanItem fullSpanItem) {
            if (this.f52091toq == null) {
                this.f52091toq = new ArrayList();
            }
            int size = this.f52091toq.size();
            for (int i2 = 0; i2 < size; i2++) {
                FullSpanItem fullSpanItem2 = this.f52091toq.get(i2);
                if (fullSpanItem2.f5781k == fullSpanItem.f5781k) {
                    this.f52091toq.remove(i2);
                }
                if (fullSpanItem2.f5781k >= fullSpanItem.f5781k) {
                    this.f52091toq.add(i2, fullSpanItem);
                    return;
                }
            }
            this.f52091toq.add(fullSpanItem);
        }

        int kja0(int i2) {
            int length = this.f5779k.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }

        void ld6(int i2, int i3) {
            int[] iArr = this.f5779k;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            zy(i4);
            int[] iArr2 = this.f5779k;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.f5779k;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            qrj(i2, i3);
        }

        /* JADX INFO: renamed from: n */
        public FullSpanItem m4906n(int i2, int i3, int i4, boolean z2) {
            List<FullSpanItem> list = this.f52091toq;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                FullSpanItem fullSpanItem = this.f52091toq.get(i5);
                int i6 = fullSpanItem.f5781k;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || fullSpanItem.f5783q == i4 || (z2 && fullSpanItem.f5780g))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        void n7h(int i2, C1068q c1068q) {
            zy(i2);
            this.f5779k[i2] = c1068q.f5797n;
        }

        /* JADX INFO: renamed from: p */
        void m4907p(int i2, int i3) {
            int[] iArr = this.f5779k;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            zy(i4);
            int[] iArr2 = this.f5779k;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.f5779k, i2, i4, -1);
            x2(i2, i3);
        }

        /* JADX INFO: renamed from: q */
        int m4908q(int i2) {
            List<FullSpanItem> list = this.f52091toq;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f52091toq.get(size).f5781k >= i2) {
                        this.f52091toq.remove(size);
                    }
                }
            }
            return m4909y(i2);
        }

        void toq() {
            int[] iArr = this.f5779k;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f52091toq = null;
        }

        /* JADX INFO: renamed from: y */
        int m4909y(int i2) {
            int[] iArr = this.f5779k;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int iM4903s = m4903s(i2);
            if (iM4903s == -1) {
                int[] iArr2 = this.f5779k;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.f5779k.length;
            }
            int iMin = Math.min(iM4903s + 1, this.f5779k.length);
            Arrays.fill(this.f5779k, i2, iMin, -1);
            return iMin;
        }

        void zy(int i2) {
            int[] iArr = this.f5779k;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.f5779k = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[kja0(i2)];
                this.f5779k = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5779k;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }
            };

            /* JADX INFO: renamed from: g */
            boolean f5780g;

            /* JADX INFO: renamed from: k */
            int f5781k;

            /* JADX INFO: renamed from: n */
            int[] f5782n;

            /* JADX INFO: renamed from: q */
            int f5783q;

            FullSpanItem(Parcel parcel) {
                this.f5781k = parcel.readInt();
                this.f5783q = parcel.readInt();
                this.f5780g = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    this.f5782n = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: k */
            int m4910k(int i2) {
                int[] iArr = this.f5782n;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5781k + ", mGapDir=" + this.f5783q + ", mHasUnwantedGapAfter=" + this.f5780g + ", mGapPerSpan=" + Arrays.toString(this.f5782n) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f5781k);
                parcel.writeInt(this.f5783q);
                parcel.writeInt(this.f5780g ? 1 : 0);
                int[] iArr = this.f5782n;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f5782n);
                }
            }

            FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i2, int i3) {
        this.f5774n = i3;
        m4897c(i2);
        this.f52076f7l8 = new ki();
        ld6();
    }
}
