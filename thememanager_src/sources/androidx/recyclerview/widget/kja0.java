package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.C0683f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ncyb.C7401k;
import zy.yz;

/* JADX INFO: compiled from: ItemTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 extends RecyclerView.kja0 implements RecyclerView.ki {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f52154a9 = 4;

    /* JADX INFO: renamed from: c */
    private static final int f5899c = 1000;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f52155d2ok = 2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f52156d3 = 0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String f52157dd = "ItemTouchHelper";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f52158eqxt = 2;

    /* JADX INFO: renamed from: f */
    static final int f5900f = 16711680;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f52159fti = 8;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f52160gvn7 = 32;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    static final int f52161hyr = 65280;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f52162jk = 2;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f52163jp0y = 16;

    /* JADX INFO: renamed from: l */
    static final int f5901l = 8;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f52164lvui = 4;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f52165mcp = 1;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final int f52166n5r1 = 255;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f52167ncyb = -1;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f52168oc = 1;

    /* JADX INFO: renamed from: r */
    public static final int f5902r = 8;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final boolean f52169x9kr = false;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    RecyclerView f52170cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float f52171f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private List<Integer> f52172fn3e;

    /* JADX INFO: renamed from: g */
    private float f5903g;

    /* JADX INFO: renamed from: h */
    private int f5904h;

    /* JADX INFO: renamed from: i */
    private List<RecyclerView.fti> f5905i;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private float f52176ld6;
    private long mDragScrollStartTimeInMs;

    /* JADX INFO: renamed from: n */
    float f5907n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    int f52177n7h;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private f7l8 f52179o1t;

    /* JADX INFO: renamed from: p */
    private float f5908p;

    /* JADX INFO: renamed from: q */
    float f5909q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @zy.lvui
    AbstractC1085g f52180qrj;

    /* JADX INFO: renamed from: s */
    float f5910s;

    /* JADX INFO: renamed from: t */
    private Rect f5911t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    VelocityTracker f52181t8r;

    /* JADX INFO: renamed from: y */
    float f5912y;

    /* JADX INFO: renamed from: z */
    androidx.core.view.x2 f5913z;

    /* JADX INFO: renamed from: k */
    final List<View> f5906k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float[] f52182toq = new float[2];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    RecyclerView.fti f52186zy = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    int f52184x2 = -1;
    private int mActionState = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @yz
    List<C1091y> f52175kja0 = new ArrayList();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    final Runnable f52174ki = new RunnableC1086k();

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private RecyclerView.ld6 f52185zurt = null;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    View f52178ni7 = null;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    int f52173fu4 = -1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private final RecyclerView.InterfaceC1049i f52183wvg = new toq();

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    private class f7l8 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: k */
        private boolean f5914k = true;

        f7l8() {
        }

        /* JADX INFO: renamed from: k */
        void m5010k() {
            this.f5914k = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewKi;
            RecyclerView.fti childViewHolder;
            if (!this.f5914k || (viewKi = kja0.this.ki(motionEvent)) == null || (childViewHolder = kja0.this.f52170cdj.getChildViewHolder(viewKi)) == null) {
                return;
            }
            kja0 kja0Var = kja0.this;
            if (kja0Var.f52180qrj.m5015h(kja0Var.f52170cdj, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i2 = kja0.this.f52184x2;
                if (pointerId == i2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    kja0 kja0Var2 = kja0.this;
                    kja0Var2.f5909q = x3;
                    kja0Var2.f5907n = y3;
                    kja0Var2.f5910s = 0.0f;
                    kja0Var2.f5912y = 0.0f;
                    if (kja0Var2.f52180qrj.m5016i()) {
                        kja0.this.mcp(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$g */
    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public static abstract class AbstractC1085g {

        /* JADX INFO: renamed from: n */
        private static final int f5917n = 789516;

        /* JADX INFO: renamed from: q */
        static final int f5918q = 3158064;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f52188toq = 200;

        /* JADX INFO: renamed from: y */
        private static final long f5919y = 2000;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f52189zy = 250;

        /* JADX INFO: renamed from: k */
        private int f5920k = -1;

        /* JADX INFO: renamed from: g */
        private static final Interpolator f5916g = new k();

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final Interpolator f52187f7l8 = new toq();

        /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$g$k */
        /* JADX INFO: compiled from: ItemTouchHelper.java */
        class k implements Interpolator {
            k() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                return f2 * f2 * f2 * f2 * f2;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$g$toq */
        /* JADX INFO: compiled from: ItemTouchHelper.java */
        class toq implements Interpolator {
            toq() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        }

        public static int fn3e(int i2, int i3) {
            return i3 << (i2 * 8);
        }

        /* JADX INFO: renamed from: n */
        public static int m5011n(int i2, int i3) {
            int i4;
            int i5 = i2 & f5917n;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= (-789517) & i7;
                i4 = (i7 & f5917n) << 2;
            }
            return i6 | i4;
        }

        /* JADX INFO: renamed from: p */
        private int m5012p(RecyclerView recyclerView) {
            if (this.f5920k == -1) {
                this.f5920k = recyclerView.getResources().getDimensionPixelSize(C7401k.zy.f93452ld6);
            }
            return this.f5920k;
        }

        @zy.lvui
        /* JADX INFO: renamed from: s */
        public static InterfaceC1082h m5013s() {
            return cdj.f5824k;
        }

        public static int zurt(int i2, int i3) {
            return fn3e(2, i2) | fn3e(1, i3) | fn3e(0, i3 | i2);
        }

        boolean cdj(RecyclerView recyclerView, RecyclerView.fti ftiVar) {
            return (m5014g(recyclerView, ftiVar) & 65280) != 0;
        }

        public long f7l8(@zy.lvui RecyclerView recyclerView, int i2, float f2, float f3) {
            RecyclerView.qrj itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i2 == 8 ? 200L : 250L : i2 == 8 ? itemAnimator.kja0() : itemAnimator.m4845h();
        }

        public void fu4(@zy.lvui Canvas canvas, @zy.lvui RecyclerView recyclerView, RecyclerView.fti ftiVar, float f2, float f3, int i2, boolean z2) {
            cdj.f5824k.mo4938q(canvas, recyclerView, ftiVar.itemView, f2, f3, i2, z2);
        }

        /* JADX INFO: renamed from: g */
        final int m5014g(RecyclerView recyclerView, RecyclerView.fti ftiVar) {
            return m5018q(x2(recyclerView, ftiVar), C0683f.m3159e(recyclerView));
        }

        /* JADX INFO: renamed from: h */
        boolean m5015h(RecyclerView recyclerView, RecyclerView.fti ftiVar) {
            return (m5014g(recyclerView, ftiVar) & 16711680) != 0;
        }

        /* JADX INFO: renamed from: i */
        public boolean m5016i() {
            return true;
        }

        public abstract void jk(@zy.lvui RecyclerView.fti ftiVar, int i2);

        /* JADX INFO: renamed from: k */
        public boolean m5017k(@zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar, @zy.lvui RecyclerView.fti ftiVar2) {
            return true;
        }

        public int ki(@zy.lvui RecyclerView recyclerView, int i2, int i3, int i4, long j2) {
            int iSignum = (int) (((int) (((int) Math.signum(i3)) * m5012p(recyclerView) * f52187f7l8.getInterpolation(Math.min(1.0f, (Math.abs(i3) * 1.0f) / i2)))) * f5916g.getInterpolation(j2 <= 2000 ? j2 / 2000.0f : 1.0f));
            return iSignum == 0 ? i3 > 0 ? 1 : -1 : iSignum;
        }

        public float kja0(float f2) {
            return f2;
        }

        public float ld6(@zy.lvui RecyclerView.fti ftiVar) {
            return 0.5f;
        }

        public void mcp(@zy.dd RecyclerView.fti ftiVar, int i2) {
            if (ftiVar != null) {
                cdj.f5824k.toq(ftiVar.itemView);
            }
        }

        public float n7h(@zy.lvui RecyclerView.fti ftiVar) {
            return 0.5f;
        }

        public void ni7(@zy.lvui Canvas canvas, @zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar, float f2, float f3, int i2, boolean z2) {
            cdj.f5824k.zy(canvas, recyclerView, ftiVar.itemView, f2, f3, i2, z2);
        }

        void o1t(Canvas canvas, RecyclerView recyclerView, RecyclerView.fti ftiVar, List<C1091y> list, int i2, float f2, float f3) {
            int size = list.size();
            boolean z2 = false;
            for (int i3 = 0; i3 < size; i3++) {
                C1091y c1091y = list.get(i3);
                int iSave = canvas.save();
                fu4(canvas, recyclerView, c1091y.f5941y, c1091y.f5942z, c1091y.f5940t, c1091y.f5939s, false);
                canvas.restoreToCount(iSave);
            }
            if (ftiVar != null) {
                int iSave2 = canvas.save();
                fu4(canvas, recyclerView, ftiVar, f2, f3, i2, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i4 = size - 1; i4 >= 0; i4--) {
                C1091y c1091y2 = list.get(i4);
                boolean z3 = c1091y2.f5934l;
                if (z3 && !c1091y2.f5932i) {
                    list.remove(i4);
                } else if (!z3) {
                    z2 = true;
                }
            }
            if (z2) {
                recyclerView.invalidate();
            }
        }

        /* JADX INFO: renamed from: q */
        public int m5018q(int i2, int i3) {
            int i4;
            int i5 = i2 & f5918q;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= (-3158065) & i7;
                i4 = (i7 & f5918q) >> 2;
            }
            return i6 | i4;
        }

        public float qrj(float f2) {
            return f2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: t */
        public void m5019t(@zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar, int i2, @zy.lvui RecyclerView.fti ftiVar2, int i3, int i4, int i5) {
            RecyclerView.AbstractC1048h layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof InterfaceC1088p) {
                ((InterfaceC1088p) layoutManager).prepareForDrop(ftiVar.itemView, ftiVar2.itemView, i4, i5);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(ftiVar2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.getDecoratedRight(ftiVar2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(ftiVar2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.getDecoratedBottom(ftiVar2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
        }

        public boolean t8r() {
            return true;
        }

        public RecyclerView.fti toq(@zy.lvui RecyclerView.fti ftiVar, @zy.lvui List<RecyclerView.fti> list, int i2, int i3) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i2 + ftiVar.itemView.getWidth();
            int height = i3 + ftiVar.itemView.getHeight();
            int left2 = i2 - ftiVar.itemView.getLeft();
            int top2 = i3 - ftiVar.itemView.getTop();
            int size = list.size();
            RecyclerView.fti ftiVar2 = null;
            int i4 = -1;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.fti ftiVar3 = list.get(i5);
                if (left2 > 0 && (right = ftiVar3.itemView.getRight() - width) < 0 && ftiVar3.itemView.getRight() > ftiVar.itemView.getRight() && (iAbs4 = Math.abs(right)) > i4) {
                    ftiVar2 = ftiVar3;
                    i4 = iAbs4;
                }
                if (left2 < 0 && (left = ftiVar3.itemView.getLeft() - i2) > 0 && ftiVar3.itemView.getLeft() < ftiVar.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i4) {
                    ftiVar2 = ftiVar3;
                    i4 = iAbs3;
                }
                if (top2 < 0 && (top = ftiVar3.itemView.getTop() - i3) > 0 && ftiVar3.itemView.getTop() < ftiVar.itemView.getTop() && (iAbs2 = Math.abs(top)) > i4) {
                    ftiVar2 = ftiVar3;
                    i4 = iAbs2;
                }
                if (top2 > 0 && (bottom = ftiVar3.itemView.getBottom() - height) < 0 && ftiVar3.itemView.getBottom() > ftiVar.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i4) {
                    ftiVar2 = ftiVar3;
                    i4 = iAbs;
                }
            }
            return ftiVar2;
        }

        public abstract boolean wvg(@zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar, @zy.lvui RecyclerView.fti ftiVar2);

        public abstract int x2(@zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar);

        /* JADX INFO: renamed from: y */
        public int m5020y() {
            return 0;
        }

        /* JADX INFO: renamed from: z */
        void m5021z(Canvas canvas, RecyclerView recyclerView, RecyclerView.fti ftiVar, List<C1091y> list, int i2, float f2, float f3) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1091y c1091y = list.get(i3);
                c1091y.m5023n();
                int iSave = canvas.save();
                ni7(canvas, recyclerView, c1091y.f5941y, c1091y.f5942z, c1091y.f5940t, c1091y.f5939s, false);
                canvas.restoreToCount(iSave);
            }
            if (ftiVar != null) {
                int iSave2 = canvas.save();
                ni7(canvas, recyclerView, ftiVar, f2, f3, i2, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void zy(@zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar) {
            cdj.f5824k.mo4937k(ftiVar.itemView);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$k */
    /* JADX INFO: compiled from: ItemTouchHelper.java */
    class RunnableC1086k implements Runnable {
        RunnableC1086k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kja0 kja0Var = kja0.this;
            if (kja0Var.f52186zy == null || !kja0Var.m5008t()) {
                return;
            }
            kja0 kja0Var2 = kja0.this;
            RecyclerView.fti ftiVar = kja0Var2.f52186zy;
            if (ftiVar != null) {
                kja0Var2.ni7(ftiVar);
            }
            kja0 kja0Var3 = kja0.this;
            kja0Var3.f52170cdj.removeCallbacks(kja0Var3.f52174ki);
            C0683f.mbx(kja0.this.f52170cdj, this);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$n */
    /* JADX INFO: compiled from: ItemTouchHelper.java */
    class C1087n implements RecyclerView.ld6 {
        C1087n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ld6
        /* JADX INFO: renamed from: k */
        public int mo4817k(int i2, int i3) {
            kja0 kja0Var = kja0.this;
            View view = kja0Var.f52178ni7;
            if (view == null) {
                return i3;
            }
            int iIndexOfChild = kja0Var.f52173fu4;
            if (iIndexOfChild == -1) {
                iIndexOfChild = kja0Var.f52170cdj.indexOfChild(view);
                kja0.this.f52173fu4 = iIndexOfChild;
            }
            return i3 == i2 + (-1) ? iIndexOfChild : i3 < iIndexOfChild ? i3 : i3 + 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$p */
    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public interface InterfaceC1088p {
        void prepareForDrop(@zy.lvui View view, @zy.lvui View view2, int i2, int i3);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$q */
    /* JADX INFO: compiled from: ItemTouchHelper.java */
    class RunnableC1089q implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C1091y f5923k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f5925q;

        RunnableC1089q(C1091y c1091y, int i2) {
            this.f5923k = c1091y;
            this.f5925q = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = kja0.this.f52170cdj;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            C1091y c1091y = this.f5923k;
            if (c1091y.f5938r || c1091y.f5941y.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.qrj itemAnimator = kja0.this.f52170cdj.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.ki(null)) && !kja0.this.fn3e()) {
                kja0.this.f52180qrj.jk(this.f5923k.f5941y, this.f5925q);
            } else {
                kja0.this.f52170cdj.post(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$s */
    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public static abstract class AbstractC1090s extends AbstractC1085g {

        /* JADX INFO: renamed from: p */
        private int f5926p;

        /* JADX INFO: renamed from: s */
        private int f5927s;

        public AbstractC1090s(int i2, int i3) {
            this.f5927s = i3;
            this.f5926p = i2;
        }

        public int a9(@zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar) {
            return this.f5926p;
        }

        public int fti(@zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar) {
            return this.f5927s;
        }

        public void gvn7(int i2) {
            this.f5927s = i2;
        }

        public void jp0y(int i2) {
            this.f5926p = i2;
        }

        @Override // androidx.recyclerview.widget.kja0.AbstractC1085g
        public int x2(@zy.lvui RecyclerView recyclerView, @zy.lvui RecyclerView.fti ftiVar) {
            return AbstractC1085g.zurt(a9(recyclerView, ftiVar), fti(recyclerView, ftiVar));
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    class toq implements RecyclerView.InterfaceC1049i {
        toq() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        /* JADX INFO: renamed from: k */
        public void mo4812k(@zy.lvui RecyclerView recyclerView, @zy.lvui MotionEvent motionEvent) {
            kja0.this.f5913z.toq(motionEvent);
            VelocityTracker velocityTracker = kja0.this.f52181t8r;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (kja0.this.f52184x2 == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(kja0.this.f52184x2);
            if (iFindPointerIndex >= 0) {
                kja0.this.qrj(actionMasked, motionEvent, iFindPointerIndex);
            }
            kja0 kja0Var = kja0.this;
            RecyclerView.fti ftiVar = kja0Var.f52186zy;
            if (ftiVar == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        kja0Var.oc(motionEvent, kja0Var.f52177n7h, iFindPointerIndex);
                        kja0.this.ni7(ftiVar);
                        kja0 kja0Var2 = kja0.this;
                        kja0Var2.f52170cdj.removeCallbacks(kja0Var2.f52174ki);
                        kja0.this.f52174ki.run();
                        kja0.this.f52170cdj.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    kja0 kja0Var3 = kja0.this;
                    if (pointerId == kja0Var3.f52184x2) {
                        kja0Var3.f52184x2 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        kja0 kja0Var4 = kja0.this;
                        kja0Var4.oc(motionEvent, kja0Var4.f52177n7h, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = kja0Var.f52181t8r;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            kja0.this.mcp(null, 0);
            kja0.this.f52184x2 = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        public boolean toq(@zy.lvui RecyclerView recyclerView, @zy.lvui MotionEvent motionEvent) {
            int iFindPointerIndex;
            C1091y c1091yCdj;
            kja0.this.f5913z.toq(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                kja0.this.f52184x2 = motionEvent.getPointerId(0);
                kja0.this.f5909q = motionEvent.getX();
                kja0.this.f5907n = motionEvent.getY();
                kja0.this.fu4();
                kja0 kja0Var = kja0.this;
                if (kja0Var.f52186zy == null && (c1091yCdj = kja0Var.cdj(motionEvent)) != null) {
                    kja0 kja0Var2 = kja0.this;
                    kja0Var2.f5909q -= c1091yCdj.f5942z;
                    kja0Var2.f5907n -= c1091yCdj.f5940t;
                    kja0Var2.m5007h(c1091yCdj.f5941y, true);
                    if (kja0.this.f5906k.remove(c1091yCdj.f5941y.itemView)) {
                        kja0 kja0Var3 = kja0.this;
                        kja0Var3.f52180qrj.zy(kja0Var3.f52170cdj, c1091yCdj.f5941y);
                    }
                    kja0.this.mcp(c1091yCdj.f5941y, c1091yCdj.f5939s);
                    kja0 kja0Var4 = kja0.this;
                    kja0Var4.oc(motionEvent, kja0Var4.f52177n7h, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                kja0 kja0Var5 = kja0.this;
                kja0Var5.f52184x2 = -1;
                kja0Var5.mcp(null, 0);
            } else {
                int i2 = kja0.this.f52184x2;
                if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    kja0.this.qrj(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = kja0.this.f52181t8r;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return kja0.this.f52186zy != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        public void zy(boolean z2) {
            if (z2) {
                kja0.this.mcp(null, 0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$y */
    /* JADX INFO: compiled from: ItemTouchHelper.java */
    @yz
    static class C1091y implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: f */
        private float f5929f;

        /* JADX INFO: renamed from: g */
        final float f5930g;

        /* JADX INFO: renamed from: h */
        final int f5931h;

        /* JADX INFO: renamed from: i */
        boolean f5932i;

        /* JADX INFO: renamed from: k */
        final float f5933k;

        /* JADX INFO: renamed from: n */
        final float f5935n;

        /* JADX INFO: renamed from: p */
        @yz
        final ValueAnimator f5936p;

        /* JADX INFO: renamed from: q */
        final float f5937q;

        /* JADX INFO: renamed from: s */
        final int f5939s;

        /* JADX INFO: renamed from: t */
        float f5940t;

        /* JADX INFO: renamed from: y */
        final RecyclerView.fti f5941y;

        /* JADX INFO: renamed from: z */
        float f5942z;

        /* JADX INFO: renamed from: r */
        boolean f5938r = false;

        /* JADX INFO: renamed from: l */
        boolean f5934l = false;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.kja0$y$k */
        /* JADX INFO: compiled from: ItemTouchHelper.java */
        class k implements ValueAnimator.AnimatorUpdateListener {
            k() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1091y.this.zy(valueAnimator.getAnimatedFraction());
            }
        }

        C1091y(RecyclerView.fti ftiVar, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f5939s = i3;
            this.f5931h = i2;
            this.f5941y = ftiVar;
            this.f5933k = f2;
            this.f5937q = f3;
            this.f5935n = f4;
            this.f5930g = f5;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5936p = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new k());
            valueAnimatorOfFloat.setTarget(ftiVar.itemView);
            valueAnimatorOfFloat.addListener(this);
            zy(0.0f);
        }

        /* JADX INFO: renamed from: k */
        public void m5022k() {
            this.f5936p.cancel();
        }

        /* JADX INFO: renamed from: n */
        public void m5023n() {
            float f2 = this.f5933k;
            float f3 = this.f5935n;
            if (f2 == f3) {
                this.f5942z = this.f5941y.itemView.getTranslationX();
            } else {
                this.f5942z = f2 + (this.f5929f * (f3 - f2));
            }
            float f4 = this.f5937q;
            float f5 = this.f5930g;
            if (f4 == f5) {
                this.f5940t = this.f5941y.itemView.getTranslationY();
            } else {
                this.f5940t = f4 + (this.f5929f * (f5 - f4));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            zy(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5934l) {
                this.f5941y.setIsRecyclable(true);
            }
            this.f5934l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        /* JADX INFO: renamed from: q */
        public void m5024q() {
            this.f5941y.setIsRecyclable(false);
            this.f5936p.start();
        }

        public void toq(long j2) {
            this.f5936p.setDuration(j2);
        }

        public void zy(float f2) {
            this.f5929f = f2;
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    class zy extends C1091y {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f5944c;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ RecyclerView.fti f5945e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(RecyclerView.fti ftiVar, int i2, int i3, float f2, float f3, float f4, float f5, int i4, RecyclerView.fti ftiVar2) {
            super(ftiVar, i2, i3, f2, f3, f4, f5);
            this.f5944c = i4;
            this.f5945e = ftiVar2;
        }

        @Override // androidx.recyclerview.widget.kja0.C1091y, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f5938r) {
                return;
            }
            if (this.f5944c <= 0) {
                kja0 kja0Var = kja0.this;
                kja0Var.f52180qrj.zy(kja0Var.f52170cdj, this.f5945e);
            } else {
                kja0.this.f5906k.add(this.f5945e.itemView);
                this.f5932i = true;
                int i2 = this.f5944c;
                if (i2 > 0) {
                    kja0.this.m5009z(this, i2);
                }
            }
            kja0 kja0Var2 = kja0.this;
            View view = kja0Var2.f52178ni7;
            View view2 = this.f5945e.itemView;
            if (view == view2) {
                kja0Var2.wvg(view2);
            }
        }
    }

    public kja0(@zy.lvui AbstractC1085g abstractC1085g) {
        this.f52180qrj = abstractC1085g;
    }

    private int d3(RecyclerView.fti ftiVar) {
        if (this.mActionState == 2) {
            return 0;
        }
        int iX2 = this.f52180qrj.x2(this.f52170cdj, ftiVar);
        int iM5018q = (this.f52180qrj.m5018q(iX2, C0683f.m3159e(this.f52170cdj)) & 65280) >> 8;
        if (iM5018q == 0) {
            return 0;
        }
        int i2 = (iX2 & 65280) >> 8;
        if (Math.abs(this.f5912y) > Math.abs(this.f5910s)) {
            int iX22 = x2(ftiVar, iM5018q);
            if (iX22 > 0) {
                return (i2 & iX22) == 0 ? AbstractC1085g.m5011n(iX22, C0683f.m3159e(this.f52170cdj)) : iX22;
            }
            int iN7h = n7h(ftiVar, iM5018q);
            if (iN7h > 0) {
                return iN7h;
            }
        } else {
            int iN7h2 = n7h(ftiVar, iM5018q);
            if (iN7h2 > 0) {
                return iN7h2;
            }
            int iX23 = x2(ftiVar, iM5018q);
            if (iX23 > 0) {
                return (i2 & iX23) == 0 ? AbstractC1085g.m5011n(iX23, C0683f.m3159e(this.f52170cdj)) : iX23;
            }
        }
        return 0;
    }

    private void fti() {
        this.f52179o1t = new f7l8();
        this.f5913z = new androidx.core.view.x2(this.f52170cdj.getContext(), this.f52179o1t);
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.f52177n7h & 12) != 0) {
            fArr[0] = (this.f5908p + this.f5912y) - this.f52186zy.itemView.getLeft();
        } else {
            fArr[0] = this.f52186zy.itemView.getTranslationX();
        }
        if ((this.f52177n7h & 3) != 0) {
            fArr[1] = (this.f52176ld6 + this.f5910s) - this.f52186zy.itemView.getTop();
        } else {
            fArr[1] = this.f52186zy.itemView.getTranslationY();
        }
    }

    private void gvn7() {
        f7l8 f7l8Var = this.f52179o1t;
        if (f7l8Var != null) {
            f7l8Var.m5010k();
            this.f52179o1t = null;
        }
        if (this.f5913z != null) {
            this.f5913z = null;
        }
    }

    /* JADX INFO: renamed from: i */
    private RecyclerView.fti m5005i(MotionEvent motionEvent) {
        View viewKi;
        RecyclerView.AbstractC1048h layoutManager = this.f52170cdj.getLayoutManager();
        int i2 = this.f52184x2;
        if (i2 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        float x3 = motionEvent.getX(iFindPointerIndex) - this.f5909q;
        float y3 = motionEvent.getY(iFindPointerIndex) - this.f5907n;
        float fAbs = Math.abs(x3);
        float fAbs2 = Math.abs(y3);
        int i3 = this.f5904h;
        if (fAbs < i3 && fAbs2 < i3) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewKi = ki(motionEvent)) != null) {
            return this.f52170cdj.getChildViewHolder(viewKi);
        }
        return null;
    }

    private void jk() {
        this.f5904h = ViewConfiguration.get(this.f52170cdj.getContext()).getScaledTouchSlop();
        this.f52170cdj.addItemDecoration(this);
        this.f52170cdj.addOnItemTouchListener(this.f52183wvg);
        this.f52170cdj.addOnChildAttachStateChangeListener(this);
        fti();
    }

    private void kja0() {
        this.f52170cdj.removeItemDecoration(this);
        this.f52170cdj.removeOnItemTouchListener(this.f52183wvg);
        this.f52170cdj.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f52175kja0.size() - 1; size >= 0; size--) {
            C1091y c1091y = this.f52175kja0.get(0);
            c1091y.m5022k();
            this.f52180qrj.zy(this.f52170cdj, c1091y.f5941y);
        }
        this.f52175kja0.clear();
        this.f52178ni7 = null;
        this.f52173fu4 = -1;
        o1t();
        gvn7();
    }

    private int n7h(RecyclerView.fti ftiVar, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = this.f5910s > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f52181t8r;
        if (velocityTracker != null && this.f52184x2 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f52180qrj.kja0(this.f52171f7l8));
            float xVelocity = this.f52181t8r.getXVelocity(this.f52184x2);
            float yVelocity = this.f52181t8r.getYVelocity(this.f52184x2);
            int i4 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i4 & i2) != 0 && i4 == i3 && fAbs >= this.f52180qrj.qrj(this.f5903g) && fAbs > Math.abs(xVelocity)) {
                return i4;
            }
        }
        float height = this.f52170cdj.getHeight() * this.f52180qrj.n7h(ftiVar);
        if ((i2 & i3) == 0 || Math.abs(this.f5910s) <= height) {
            return 0;
        }
        return i3;
    }

    private void o1t() {
        VelocityTracker velocityTracker = this.f52181t8r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f52181t8r = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m5006p() {
    }

    private List<RecyclerView.fti> t8r(RecyclerView.fti ftiVar) {
        RecyclerView.fti ftiVar2 = ftiVar;
        List<RecyclerView.fti> list = this.f5905i;
        if (list == null) {
            this.f5905i = new ArrayList();
            this.f52172fn3e = new ArrayList();
        } else {
            list.clear();
            this.f52172fn3e.clear();
        }
        int iM5020y = this.f52180qrj.m5020y();
        int iRound = Math.round(this.f5908p + this.f5912y) - iM5020y;
        int iRound2 = Math.round(this.f52176ld6 + this.f5910s) - iM5020y;
        int i2 = iM5020y * 2;
        int width = ftiVar2.itemView.getWidth() + iRound + i2;
        int height = ftiVar2.itemView.getHeight() + iRound2 + i2;
        int i3 = (iRound + width) / 2;
        int i4 = (iRound2 + height) / 2;
        RecyclerView.AbstractC1048h layoutManager = this.f52170cdj.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = layoutManager.getChildAt(i5);
            if (childAt != ftiVar2.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                RecyclerView.fti childViewHolder = this.f52170cdj.getChildViewHolder(childAt);
                if (this.f52180qrj.m5017k(this.f52170cdj, this.f52186zy, childViewHolder)) {
                    int iAbs = Math.abs(i3 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int iAbs2 = Math.abs(i4 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i6 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f5905i.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size && i6 > this.f52172fn3e.get(i8).intValue(); i8++) {
                        i7++;
                    }
                    this.f5905i.add(i7, childViewHolder);
                    this.f52172fn3e.add(i7, Integer.valueOf(i6));
                }
            }
            i5++;
            ftiVar2 = ftiVar;
        }
        return this.f5905i;
    }

    private int x2(RecyclerView.fti ftiVar, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = this.f5912y > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f52181t8r;
        if (velocityTracker != null && this.f52184x2 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f52180qrj.kja0(this.f52171f7l8));
            float xVelocity = this.f52181t8r.getXVelocity(this.f52184x2);
            float yVelocity = this.f52181t8r.getYVelocity(this.f52184x2);
            int i4 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i4 & i2) != 0 && i3 == i4 && fAbs >= this.f52180qrj.qrj(this.f5903g) && fAbs > Math.abs(yVelocity)) {
                return i4;
            }
        }
        float width = this.f52170cdj.getWidth() * this.f52180qrj.n7h(ftiVar);
        if ((i2 & i3) == 0 || Math.abs(this.f5912y) <= width) {
            return 0;
        }
        return i3;
    }

    private static boolean zurt(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    public void a9(@zy.lvui RecyclerView.fti ftiVar) {
        if (!this.f52180qrj.m5015h(this.f52170cdj, ftiVar)) {
            Log.e(f52157dd, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (ftiVar.itemView.getParent() != this.f52170cdj) {
            Log.e(f52157dd, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        fu4();
        this.f5910s = 0.0f;
        this.f5912y = 0.0f;
        mcp(ftiVar, 2);
    }

    C1091y cdj(MotionEvent motionEvent) {
        if (this.f52175kja0.isEmpty()) {
            return null;
        }
        View viewKi = ki(motionEvent);
        for (int size = this.f52175kja0.size() - 1; size >= 0; size--) {
            C1091y c1091y = this.f52175kja0.get(size);
            if (c1091y.f5941y.itemView == viewKi) {
                return c1091y;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    public void f7l8(Canvas canvas, RecyclerView recyclerView, RecyclerView.mcp mcpVar) {
        float f2;
        float f3;
        this.f52173fu4 = -1;
        if (this.f52186zy != null) {
            getSelectedDxDy(this.f52182toq);
            float[] fArr = this.f52182toq;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.f52180qrj.m5021z(canvas, recyclerView, this.f52186zy, this.f52175kja0, this.mActionState, f2, f3);
    }

    boolean fn3e() {
        int size = this.f52175kja0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f52175kja0.get(i2).f5934l) {
                return true;
            }
        }
        return false;
    }

    void fu4() {
        VelocityTracker velocityTracker = this.f52181t8r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f52181t8r = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: h */
    void m5007h(RecyclerView.fti ftiVar, boolean z2) {
        for (int size = this.f52175kja0.size() - 1; size >= 0; size--) {
            C1091y c1091y = this.f52175kja0.get(size);
            if (c1091y.f5941y == ftiVar) {
                c1091y.f5938r |= z2;
                if (!c1091y.f5934l) {
                    c1091y.m5022k();
                }
                this.f52175kja0.remove(size);
                return;
            }
        }
    }

    public void jp0y(@zy.lvui RecyclerView.fti ftiVar) {
        if (!this.f52180qrj.cdj(this.f52170cdj, ftiVar)) {
            Log.e(f52157dd, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (ftiVar.itemView.getParent() != this.f52170cdj) {
            Log.e(f52157dd, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        fu4();
        this.f5910s = 0.0f;
        this.f5912y = 0.0f;
        mcp(ftiVar, 1);
    }

    View ki(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        RecyclerView.fti ftiVar = this.f52186zy;
        if (ftiVar != null) {
            View view = ftiVar.itemView;
            if (zurt(view, x3, y3, this.f5908p + this.f5912y, this.f52176ld6 + this.f5910s)) {
                return view;
            }
        }
        for (int size = this.f52175kja0.size() - 1; size >= 0; size--) {
            C1091y c1091y = this.f52175kja0.get(size);
            View view2 = c1091y.f5941y.itemView;
            if (zurt(view2, x3, y3, c1091y.f5942z, c1091y.f5940t)) {
                return view2;
            }
        }
        return this.f52170cdj.findChildViewUnder(x3, y3);
    }

    public void ld6(@zy.dd RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f52170cdj;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            kja0();
        }
        this.f52170cdj = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f5903g = resources.getDimension(C7401k.zy.f93456qrj);
            this.f52171f7l8 = resources.getDimension(C7401k.zy.f93460x2);
            jk();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mcp(@zy.dd androidx.recyclerview.widget.RecyclerView.fti r24, int r25) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.kja0.mcp(androidx.recyclerview.widget.RecyclerView$fti, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect rect, View view, RecyclerView recyclerView, RecyclerView.mcp mcpVar) {
        rect.setEmpty();
    }

    void ni7(RecyclerView.fti ftiVar) {
        if (!this.f52170cdj.isLayoutRequested() && this.mActionState == 2) {
            float fLd6 = this.f52180qrj.ld6(ftiVar);
            int i2 = (int) (this.f5908p + this.f5912y);
            int i3 = (int) (this.f52176ld6 + this.f5910s);
            if (Math.abs(i3 - ftiVar.itemView.getTop()) >= ftiVar.itemView.getHeight() * fLd6 || Math.abs(i2 - ftiVar.itemView.getLeft()) >= ftiVar.itemView.getWidth() * fLd6) {
                List<RecyclerView.fti> listT8r = t8r(ftiVar);
                if (listT8r.size() == 0) {
                    return;
                }
                RecyclerView.fti qVar = this.f52180qrj.toq(ftiVar, listT8r, i2, i3);
                if (qVar == null) {
                    this.f5905i.clear();
                    this.f52172fn3e.clear();
                    return;
                }
                int absoluteAdapterPosition = qVar.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = ftiVar.getAbsoluteAdapterPosition();
                if (this.f52180qrj.wvg(this.f52170cdj, ftiVar, qVar)) {
                    this.f52180qrj.m5019t(this.f52170cdj, ftiVar, absoluteAdapterPosition2, qVar, absoluteAdapterPosition, i2, i3);
                }
            }
        }
    }

    void oc(MotionEvent motionEvent, int i2, int i3) {
        float x3 = motionEvent.getX(i3);
        float y3 = motionEvent.getY(i3);
        float f2 = x3 - this.f5909q;
        this.f5912y = f2;
        this.f5910s = y3 - this.f5907n;
        if ((i2 & 4) == 0) {
            this.f5912y = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.f5912y = Math.min(0.0f, this.f5912y);
        }
        if ((i2 & 1) == 0) {
            this.f5910s = Math.max(0.0f, this.f5910s);
        }
        if ((i2 & 2) == 0) {
            this.f5910s = Math.min(0.0f, this.f5910s);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ki
    public void onChildViewAttachedToWindow(@zy.lvui View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ki
    public void onChildViewDetachedFromWindow(@zy.lvui View view) {
        wvg(view);
        RecyclerView.fti childViewHolder = this.f52170cdj.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.fti ftiVar = this.f52186zy;
        if (ftiVar != null && childViewHolder == ftiVar) {
            mcp(null, 0);
            return;
        }
        m5007h(childViewHolder, false);
        if (this.f5906k.remove(childViewHolder.itemView)) {
            this.f52180qrj.zy(this.f52170cdj, childViewHolder);
        }
    }

    void qrj(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.fti ftiVarM5005i;
        int iM5014g;
        if (this.f52186zy != null || i2 != 2 || this.mActionState == 2 || !this.f52180qrj.t8r() || this.f52170cdj.getScrollState() == 1 || (ftiVarM5005i = m5005i(motionEvent)) == null || (iM5014g = (this.f52180qrj.m5014g(this.f52170cdj, ftiVarM5005i) & 65280) >> 8) == 0) {
            return;
        }
        float x3 = motionEvent.getX(i3);
        float y3 = motionEvent.getY(i3);
        float f2 = x3 - this.f5909q;
        float f3 = y3 - this.f5907n;
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        int i4 = this.f5904h;
        if (fAbs >= i4 || fAbs2 >= i4) {
            if (fAbs > fAbs2) {
                if (f2 < 0.0f && (iM5014g & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iM5014g & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iM5014g & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iM5014g & 2) == 0) {
                    return;
                }
            }
            this.f5910s = 0.0f;
            this.f5912y = 0.0f;
            this.f52184x2 = motionEvent.getPointerId(0);
            mcp(ftiVarM5005i, 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: s */
    public void mo4713s(Canvas canvas, RecyclerView recyclerView, RecyclerView.mcp mcpVar) {
        float f2;
        float f3;
        if (this.f52186zy != null) {
            getSelectedDxDy(this.f52182toq);
            float[] fArr = this.f52182toq;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.f52180qrj.o1t(canvas, recyclerView, this.f52186zy, this.f52175kja0, this.mActionState, f2, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m5008t() {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.kja0.m5008t():boolean");
    }

    void wvg(View view) {
        if (view == this.f52178ni7) {
            this.f52178ni7 = null;
            if (this.f52185zurt != null) {
                this.f52170cdj.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    void m5009z(C1091y c1091y, int i2) {
        this.f52170cdj.post(new RunnableC1089q(c1091y, i2));
    }
}
