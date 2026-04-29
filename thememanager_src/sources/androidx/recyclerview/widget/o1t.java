package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1t {

    /* JADX INFO: renamed from: g */
    public static final int f6016g = 1;

    /* JADX INFO: renamed from: n */
    public static final int f6017n = 0;

    /* JADX INFO: renamed from: q */
    private static final int f6018q = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    protected final RecyclerView.AbstractC1048h f6019k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f52240toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final Rect f52241zy;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.o1t$k */
    /* JADX INFO: compiled from: OrientationHelper.java */
    class C1106k extends o1t {
        C1106k(RecyclerView.AbstractC1048h abstractC1048h) {
            super(abstractC1048h, null);
        }

        @Override // androidx.recyclerview.widget.o1t
        public int cdj(View view) {
            this.f6019k.getTransformedBoundingBox(view, true, this.f52241zy);
            return this.f52241zy.right;
        }

        @Override // androidx.recyclerview.widget.o1t
        public int f7l8(View view) {
            return this.f6019k.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.cdj) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: g */
        public int mo5085g(View view) {
            RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
            return this.f6019k.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) cdjVar).topMargin + ((ViewGroup.MarginLayoutParams) cdjVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: i */
        public void mo5087i(int i2) {
            this.f6019k.offsetChildrenHorizontal(i2);
        }

        @Override // androidx.recyclerview.widget.o1t
        public int ki(View view) {
            this.f6019k.getTransformedBoundingBox(view, true, this.f52241zy);
            return this.f52241zy.left;
        }

        @Override // androidx.recyclerview.widget.o1t
        public int kja0() {
            return (this.f6019k.getWidth() - this.f6019k.getPaddingLeft()) - this.f6019k.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: n */
        public int mo5088n(View view) {
            RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
            return this.f6019k.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) cdjVar).leftMargin + ((ViewGroup.MarginLayoutParams) cdjVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o1t
        public int n7h() {
            return this.f6019k.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: p */
        public int mo5089p() {
            return this.f6019k.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: q */
        public int mo5090q(View view) {
            return this.f6019k.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.cdj) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o1t
        public int qrj() {
            return this.f6019k.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: s */
        public int mo5091s() {
            return this.f6019k.getWidth() - this.f6019k.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.o1t
        public void t8r(View view, int i2) {
            view.offsetLeftAndRight(i2);
        }

        @Override // androidx.recyclerview.widget.o1t
        public int x2() {
            return this.f6019k.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: y */
        public int mo5092y() {
            return this.f6019k.getWidth();
        }
    }

    /* JADX INFO: compiled from: OrientationHelper.java */
    class toq extends o1t {
        toq(RecyclerView.AbstractC1048h abstractC1048h) {
            super(abstractC1048h, null);
        }

        @Override // androidx.recyclerview.widget.o1t
        public int cdj(View view) {
            this.f6019k.getTransformedBoundingBox(view, true, this.f52241zy);
            return this.f52241zy.bottom;
        }

        @Override // androidx.recyclerview.widget.o1t
        public int f7l8(View view) {
            return this.f6019k.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.cdj) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: g */
        public int mo5085g(View view) {
            RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
            return this.f6019k.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) cdjVar).leftMargin + ((ViewGroup.MarginLayoutParams) cdjVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: i */
        public void mo5087i(int i2) {
            this.f6019k.offsetChildrenVertical(i2);
        }

        @Override // androidx.recyclerview.widget.o1t
        public int ki(View view) {
            this.f6019k.getTransformedBoundingBox(view, true, this.f52241zy);
            return this.f52241zy.top;
        }

        @Override // androidx.recyclerview.widget.o1t
        public int kja0() {
            return (this.f6019k.getHeight() - this.f6019k.getPaddingTop()) - this.f6019k.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: n */
        public int mo5088n(View view) {
            RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
            return this.f6019k.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) cdjVar).topMargin + ((ViewGroup.MarginLayoutParams) cdjVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o1t
        public int n7h() {
            return this.f6019k.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: p */
        public int mo5089p() {
            return this.f6019k.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: q */
        public int mo5090q(View view) {
            return this.f6019k.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.cdj) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.o1t
        public int qrj() {
            return this.f6019k.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: s */
        public int mo5091s() {
            return this.f6019k.getHeight() - this.f6019k.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.o1t
        public void t8r(View view, int i2) {
            view.offsetTopAndBottom(i2);
        }

        @Override // androidx.recyclerview.widget.o1t
        public int x2() {
            return this.f6019k.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.o1t
        /* JADX INFO: renamed from: y */
        public int mo5092y() {
            return this.f6019k.getHeight();
        }
    }

    /* synthetic */ o1t(RecyclerView.AbstractC1048h abstractC1048h, C1106k c1106k) {
        this(abstractC1048h);
    }

    /* JADX INFO: renamed from: k */
    public static o1t m5084k(RecyclerView.AbstractC1048h abstractC1048h) {
        return new C1106k(abstractC1048h);
    }

    public static o1t toq(RecyclerView.AbstractC1048h abstractC1048h, int i2) {
        if (i2 == 0) {
            return m5084k(abstractC1048h);
        }
        if (i2 == 1) {
            return zy(abstractC1048h);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static o1t zy(RecyclerView.AbstractC1048h abstractC1048h) {
        return new toq(abstractC1048h);
    }

    public abstract int cdj(View view);

    public abstract int f7l8(View view);

    public void fn3e() {
        this.f52240toq = kja0();
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo5085g(View view);

    /* JADX INFO: renamed from: h */
    public int m5086h() {
        if (Integer.MIN_VALUE == this.f52240toq) {
            return 0;
        }
        return kja0() - this.f52240toq;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo5087i(int i2);

    public abstract int ki(View view);

    public abstract int kja0();

    public RecyclerView.AbstractC1048h ld6() {
        return this.f6019k;
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo5088n(View view);

    public abstract int n7h();

    /* JADX INFO: renamed from: p */
    public abstract int mo5089p();

    /* JADX INFO: renamed from: q */
    public abstract int mo5090q(View view);

    public abstract int qrj();

    /* JADX INFO: renamed from: s */
    public abstract int mo5091s();

    public abstract void t8r(View view, int i2);

    public abstract int x2();

    /* JADX INFO: renamed from: y */
    public abstract int mo5092y();

    private o1t(RecyclerView.AbstractC1048h abstractC1048h) {
        this.f52240toq = Integer.MIN_VALUE;
        this.f52241zy = new Rect();
        this.f6019k = abstractC1048h;
    }
}
