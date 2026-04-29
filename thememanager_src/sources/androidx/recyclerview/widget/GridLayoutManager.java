package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.ki;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f52008ld6 = "GridLayoutManager";

    /* JADX INFO: renamed from: p */
    private static final boolean f5663p = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f52009x2 = -1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    zy f52010f7l8;

    /* JADX INFO: renamed from: g */
    final SparseIntArray f5664g;

    /* JADX INFO: renamed from: k */
    boolean f5665k;

    /* JADX INFO: renamed from: n */
    final SparseIntArray f5666n;

    /* JADX INFO: renamed from: q */
    View[] f5667q;

    /* JADX INFO: renamed from: s */
    private boolean f5668s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f52011toq;

    /* JADX INFO: renamed from: y */
    final Rect f5669y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int[] f52012zy;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$k */
    public static final class C1043k extends zy {
        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int i2) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: n */
        public int mo4761n(int i2, int i3) {
            return i2 % i3;
        }
    }

    public static abstract class zy {

        /* JADX INFO: renamed from: k */
        final SparseIntArray f5672k = new SparseIntArray();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final SparseIntArray f52014toq = new SparseIntArray();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f52015zy = false;

        /* JADX INFO: renamed from: q */
        private boolean f5673q = false;

        /* JADX INFO: renamed from: k */
        static int m4763k(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        public void f7l8() {
            this.f52014toq.clear();
        }

        /* JADX INFO: renamed from: g */
        public abstract int mo4760g(int i2);

        public void ld6(boolean z2) {
            if (!z2) {
                this.f52014toq.clear();
            }
            this.f5673q = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo4761n(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo4760g(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f52015zy
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f5672k
                int r2 = m4763k(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f5672k
                int r3 = r3.get(r2)
                int r4 = r5.mo4760g(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.mo4760g(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.zy.mo4761n(int, int):int");
        }

        /* JADX INFO: renamed from: p */
        public boolean m4764p() {
            return this.f52015zy;
        }

        /* JADX INFO: renamed from: q */
        public int m4765q(int i2, int i3) {
            int i4;
            int i5;
            int iZy;
            int iM4763k;
            if (!this.f5673q || (iM4763k = m4763k(this.f52014toq, i2)) == -1) {
                i4 = 0;
                i5 = 0;
                iZy = 0;
            } else {
                i4 = this.f52014toq.get(iM4763k);
                i5 = iM4763k + 1;
                iZy = zy(iM4763k, i3) + mo4760g(iM4763k);
                if (iZy == i3) {
                    i4++;
                    iZy = 0;
                }
            }
            int iMo4760g = mo4760g(i2);
            while (i5 < i2) {
                int iMo4760g2 = mo4760g(i5);
                iZy += iMo4760g2;
                if (iZy == i3) {
                    i4++;
                    iZy = 0;
                } else if (iZy > i3) {
                    i4++;
                    iZy = iMo4760g2;
                }
                i5++;
            }
            return iZy + iMo4760g > i3 ? i4 + 1 : i4;
        }

        /* JADX INFO: renamed from: s */
        public boolean m4766s() {
            return this.f5673q;
        }

        int toq(int i2, int i3) {
            if (!this.f5673q) {
                return m4765q(i2, i3);
            }
            int i4 = this.f52014toq.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int iM4765q = m4765q(i2, i3);
            this.f52014toq.put(i2, iM4765q);
            return iM4765q;
        }

        public void x2(boolean z2) {
            if (!z2) {
                this.f52014toq.clear();
            }
            this.f52015zy = z2;
        }

        /* JADX INFO: renamed from: y */
        public void m4767y() {
            this.f5672k.clear();
        }

        int zy(int i2, int i3) {
            if (!this.f52015zy) {
                return mo4761n(i2, i3);
            }
            int i4 = this.f5672k.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int iMo4761n = mo4761n(i2, i3);
            this.f5672k.put(i2, iMo4761n);
            return iMo4761n;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f5665k = false;
        this.f52011toq = -1;
        this.f5666n = new SparseIntArray();
        this.f5664g = new SparseIntArray();
        this.f52010f7l8 = new C1043k();
        this.f5669y = new Rect();
        m4758i(RecyclerView.AbstractC1048h.getProperties(context, attributeSet, i2, i3).f52036toq);
    }

    private int f7l8(RecyclerView.mcp mcpVar) {
        if (getChildCount() != 0 && mcpVar.m4822q() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f52010f7l8.toq(mcpVar.m4822q() - 1, this.f52011toq) + 1;
                }
                int iMo5090q = this.mOrientationHelper.mo5090q(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.f7l8(viewFindFirstVisibleChildClosestToStart);
                int qVar = this.f52010f7l8.toq(getPosition(viewFindFirstVisibleChildClosestToStart), this.f52011toq);
                return (int) ((iMo5090q / ((this.f52010f7l8.toq(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f52011toq) - qVar) + 1)) * (this.f52010f7l8.toq(mcpVar.m4822q() - 1, this.f52011toq) + 1));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    private int m4751g(RecyclerView.mcp mcpVar) {
        if (getChildCount() != 0 && mcpVar.m4822q() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int qVar = this.f52010f7l8.toq(getPosition(viewFindFirstVisibleChildClosestToStart), this.f52011toq);
                int qVar2 = this.f52010f7l8.toq(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f52011toq);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.f52010f7l8.toq(mcpVar.m4822q() - 1, this.f52011toq) + 1) - Math.max(qVar, qVar2)) - 1) : Math.max(0, Math.min(qVar, qVar2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.mo5090q(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.f7l8(viewFindFirstVisibleChildClosestToStart)) / ((this.f52010f7l8.toq(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f52011toq) - this.f52010f7l8.toq(getPosition(viewFindFirstVisibleChildClosestToStart), this.f52011toq)) + 1))) + (this.mOrientationHelper.n7h() - this.mOrientationHelper.f7l8(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    private void m4752h(float f2, int i2) {
        zy(Math.max(Math.round(f2 * this.f52011toq), i2));
    }

    /* JADX INFO: renamed from: k */
    private void m4753k(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, int i2, boolean z2) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z2) {
            i4 = 1;
            i6 = i2;
            i3 = 0;
        } else {
            i3 = i2 - 1;
            i4 = -1;
        }
        while (i3 != i6) {
            View view = this.f5667q[i3];
            toq toqVar = (toq) view.getLayoutParams();
            int iN7h = n7h(fu4Var, mcpVar, getPosition(view));
            toqVar.f5670g = iN7h;
            toqVar.f5671n = i5;
            i5 += iN7h;
            i3 += i4;
        }
    }

    private void ki(View view, int i2, boolean z2) {
        int childMeasureSpec;
        int childMeasureSpec2;
        toq toqVar = (toq) view.getLayoutParams();
        Rect rect = toqVar.f52031toq;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) toqVar).topMargin + ((ViewGroup.MarginLayoutParams) toqVar).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) toqVar).leftMargin + ((ViewGroup.MarginLayoutParams) toqVar).rightMargin;
        int iM4759p = m4759p(toqVar.f5671n, toqVar.f5670g);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.AbstractC1048h.getChildMeasureSpec(iM4759p, i2, i4, ((ViewGroup.MarginLayoutParams) toqVar).width, false);
            childMeasureSpec = RecyclerView.AbstractC1048h.getChildMeasureSpec(this.mOrientationHelper.kja0(), getHeightMode(), i3, ((ViewGroup.MarginLayoutParams) toqVar).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.AbstractC1048h.getChildMeasureSpec(iM4759p, i2, i3, ((ViewGroup.MarginLayoutParams) toqVar).height, false);
            int childMeasureSpec4 = RecyclerView.AbstractC1048h.getChildMeasureSpec(this.mOrientationHelper.kja0(), getWidthMode(), i4, ((ViewGroup.MarginLayoutParams) toqVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        t8r(view, childMeasureSpec2, childMeasureSpec, z2);
    }

    /* JADX INFO: renamed from: n */
    private void m4754n() {
        this.f5666n.clear();
        this.f5664g.clear();
    }

    private int n7h(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, int i2) {
        if (!mcpVar.m4821p()) {
            return this.f52010f7l8.mo4760g(i2);
        }
        int i3 = this.f5666n.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iF7l8 = fu4Var.f7l8(i2);
        if (iF7l8 != -1) {
            return this.f52010f7l8.mo4760g(iF7l8);
        }
        Log.w(f52008ld6, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    private void ni7() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        zy(height - paddingTop);
    }

    /* JADX INFO: renamed from: q */
    static int[] m4755q(int[] iArr, int i2, int i3) {
        int i4;
        if (iArr == null || iArr.length != i2 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i2 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    private int qrj(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, int i2) {
        if (!mcpVar.m4821p()) {
            return this.f52010f7l8.zy(i2, this.f52011toq);
        }
        int i3 = this.f5664g.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iF7l8 = fu4Var.f7l8(i2);
        if (iF7l8 != -1) {
            return this.f52010f7l8.zy(iF7l8, this.f52011toq);
        }
        Log.w(f52008ld6, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    /* JADX INFO: renamed from: s */
    private void m4756s() {
        View[] viewArr = this.f5667q;
        if (viewArr == null || viewArr.length != this.f52011toq) {
            this.f5667q = new View[this.f52011toq];
        }
    }

    private void t8r(View view, int i2, int i3, boolean z2) {
        RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
        if (z2 ? shouldReMeasureChild(view, i2, i3, cdjVar) : shouldMeasureChild(view, i2, i3, cdjVar)) {
            view.measure(i2, i3);
        }
    }

    private void toq() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            toq toqVar = (toq) getChildAt(i2).getLayoutParams();
            int iM4787q = toqVar.m4787q();
            this.f5666n.put(iM4787q, toqVar.ld6());
            this.f5664g.put(iM4787q, toqVar.m4762p());
        }
    }

    private int x2(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, int i2) {
        if (!mcpVar.m4821p()) {
            return this.f52010f7l8.toq(i2, this.f52011toq);
        }
        int iF7l8 = fu4Var.f7l8(i2);
        if (iF7l8 != -1) {
            return this.f52010f7l8.toq(iF7l8, this.f52011toq);
        }
        Log.w(f52008ld6, "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    /* JADX INFO: renamed from: y */
    private void m4757y(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, LinearLayoutManager.C1045k c1045k, int i2) {
        boolean z2 = i2 == 1;
        int iQrj = qrj(fu4Var, mcpVar, c1045k.f52016toq);
        if (z2) {
            while (iQrj > 0) {
                int i3 = c1045k.f52016toq;
                if (i3 <= 0) {
                    return;
                }
                int i4 = i3 - 1;
                c1045k.f52016toq = i4;
                iQrj = qrj(fu4Var, mcpVar, i4);
            }
            return;
        }
        int iM4822q = mcpVar.m4822q() - 1;
        int i5 = c1045k.f52016toq;
        while (i5 < iM4822q) {
            int i6 = i5 + 1;
            int iQrj2 = qrj(fu4Var, mcpVar, i6);
            if (iQrj2 <= iQrj) {
                break;
            }
            i5 = i6;
            iQrj = iQrj2;
        }
        c1045k.f52016toq = i5;
    }

    private void zy(int i2) {
        this.f52012zy = m4755q(this.f52012zy, this.f52011toq, i2);
    }

    public boolean cdj() {
        return this.f5668s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean checkLayoutParams(RecyclerView.cdj cdjVar) {
        return cdjVar instanceof toq;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.mcp mcpVar, LinearLayoutManager.zy zyVar, RecyclerView.AbstractC1048h.zy zyVar2) {
        int iMo4760g = this.f52011toq;
        for (int i2 = 0; i2 < this.f52011toq && zyVar.zy(mcpVar) && iMo4760g > 0; i2++) {
            int i3 = zyVar.f5688q;
            zyVar2.mo4811k(i3, Math.max(0, zyVar.f52025f7l8));
            iMo4760g -= this.f52010f7l8.mo4760g(i3);
            zyVar.f5688q += zyVar.f5686n;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeHorizontalScrollOffset(RecyclerView.mcp mcpVar) {
        return this.f5668s ? m4751g(mcpVar) : super.computeHorizontalScrollOffset(mcpVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeHorizontalScrollRange(RecyclerView.mcp mcpVar) {
        return this.f5668s ? f7l8(mcpVar) : super.computeHorizontalScrollRange(mcpVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeVerticalScrollOffset(RecyclerView.mcp mcpVar) {
        return this.f5668s ? m4751g(mcpVar) : super.computeVerticalScrollOffset(mcpVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeVerticalScrollRange(RecyclerView.mcp mcpVar) {
        return this.f5668s ? f7l8(mcpVar) : super.computeVerticalScrollRange(mcpVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View findReferenceChild(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, boolean z2, boolean z3) {
        int childCount;
        int childCount2 = getChildCount();
        int i2 = -1;
        int i3 = 1;
        if (z3) {
            childCount = getChildCount() - 1;
            i3 = -1;
        } else {
            i2 = childCount2;
            childCount = 0;
        }
        int iM4822q = mcpVar.m4822q();
        ensureLayoutState();
        int iN7h = this.mOrientationHelper.n7h();
        int iMo5091s = this.mOrientationHelper.mo5091s();
        View view = null;
        View view2 = null;
        while (childCount != i2) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM4822q && qrj(fu4Var, mcpVar, position) == 0) {
                if (((RecyclerView.cdj) childAt.getLayoutParams()).f7l8()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.f7l8(childAt) < iMo5091s && this.mOrientationHelper.mo5090q(childAt) >= iN7h) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i3;
        }
        return view != null ? view : view2;
    }

    public void fn3e(zy zyVar) {
        this.f52010f7l8 = zyVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public RecyclerView.cdj generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new toq(-2, -1) : new toq(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public RecyclerView.cdj generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new toq(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int getColumnCountForAccessibility(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        if (this.mOrientation == 1) {
            return this.f52011toq;
        }
        if (mcpVar.m4822q() < 1) {
            return 0;
        }
        return x2(fu4Var, mcpVar, mcpVar.m4822q() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int getRowCountForAccessibility(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        if (this.mOrientation == 0) {
            return this.f52011toq;
        }
        if (mcpVar.m4822q() < 1) {
            return 0;
        }
        return x2(fu4Var, mcpVar, mcpVar.m4822q() - 1) + 1;
    }

    /* JADX INFO: renamed from: i */
    public void m4758i(int i2) {
        if (i2 == this.f52011toq) {
            return;
        }
        this.f5665k = true;
        if (i2 >= 1) {
            this.f52011toq = i2;
            this.f52010f7l8.m4767y();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }

    public zy kja0() {
        return this.f52010f7l8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void layoutChunk(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, LinearLayoutManager.zy zyVar, LinearLayoutManager.toq toqVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iMo5085g;
        int iMo5085g2;
        int iMo5085g3;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewM4776n;
        int iQrj = this.mOrientationHelper.qrj();
        ?? r5 = 0;
        boolean z2 = iQrj != 1073741824;
        int i7 = getChildCount() > 0 ? this.f52012zy[this.f52011toq] : 0;
        if (z2) {
            ni7();
        }
        boolean z3 = zyVar.f5686n == 1;
        int iQrj2 = this.f52011toq;
        if (!z3) {
            iQrj2 = qrj(fu4Var, mcpVar, zyVar.f5688q) + n7h(fu4Var, mcpVar, zyVar.f5688q);
        }
        int i8 = 0;
        while (i8 < this.f52011toq && zyVar.zy(mcpVar) && iQrj2 > 0) {
            int i9 = zyVar.f5688q;
            int iN7h = n7h(fu4Var, mcpVar, i9);
            if (iN7h > this.f52011toq) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iN7h + " spans but GridLayoutManager has only " + this.f52011toq + " spans.");
            }
            iQrj2 -= iN7h;
            if (iQrj2 < 0 || (viewM4776n = zyVar.m4776n(fu4Var)) == null) {
                break;
            }
            this.f5667q[i8] = viewM4776n;
            i8++;
        }
        if (i8 == 0) {
            toqVar.f52018toq = true;
            return;
        }
        float f2 = 0.0f;
        m4753k(fu4Var, mcpVar, i8, z3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            View view = this.f5667q[i10];
            if (zyVar.f52029x2 == null) {
                if (z3) {
                    addView(view);
                } else {
                    addView(view, r5);
                }
            } else if (z3) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, r5);
            }
            calculateItemDecorationsForChild(view, this.f5669y);
            ki(view, iQrj, r5);
            int iMo5088n = this.mOrientationHelper.mo5088n(view);
            if (iMo5088n > i11) {
                i11 = iMo5088n;
            }
            float fMo5085g = (this.mOrientationHelper.mo5085g(view) * 1.0f) / ((toq) view.getLayoutParams()).f5670g;
            if (fMo5085g > f2) {
                f2 = fMo5085g;
            }
            i10++;
            r5 = 0;
        }
        if (z2) {
            m4752h(f2, i7);
            i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                View view2 = this.f5667q[i12];
                ki(view2, 1073741824, true);
                int iMo5088n2 = this.mOrientationHelper.mo5088n(view2);
                if (iMo5088n2 > i11) {
                    i11 = iMo5088n2;
                }
            }
        }
        for (int i13 = 0; i13 < i8; i13++) {
            View view3 = this.f5667q[i13];
            if (this.mOrientationHelper.mo5088n(view3) != i11) {
                toq toqVar2 = (toq) view3.getLayoutParams();
                Rect rect = toqVar2.f52031toq;
                int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) toqVar2).topMargin + ((ViewGroup.MarginLayoutParams) toqVar2).bottomMargin;
                int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) toqVar2).leftMargin + ((ViewGroup.MarginLayoutParams) toqVar2).rightMargin;
                int iM4759p = m4759p(toqVar2.f5671n, toqVar2.f5670g);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.AbstractC1048h.getChildMeasureSpec(iM4759p, 1073741824, i15, ((ViewGroup.MarginLayoutParams) toqVar2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                    childMeasureSpec = RecyclerView.AbstractC1048h.getChildMeasureSpec(iM4759p, 1073741824, i14, ((ViewGroup.MarginLayoutParams) toqVar2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                t8r(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        int i16 = 0;
        toqVar.f5680k = i11;
        if (this.mOrientation == 1) {
            if (zyVar.f5684g == -1) {
                i4 = zyVar.f52028toq;
                i5 = i4 - i11;
            } else {
                int i17 = zyVar.f52028toq;
                i5 = i17;
                i4 = i11 + i17;
            }
            i2 = 0;
            i3 = 0;
        } else if (zyVar.f5684g == -1) {
            int i18 = zyVar.f52028toq;
            i3 = i18 - i11;
            i5 = 0;
            i2 = i18;
            i4 = 0;
        } else {
            int i19 = zyVar.f52028toq;
            i2 = i11 + i19;
            i3 = i19;
            i4 = 0;
            i5 = 0;
        }
        while (i16 < i8) {
            View view4 = this.f5667q[i16];
            toq toqVar3 = (toq) view4.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    int paddingLeft = getPaddingLeft() + this.f52012zy[this.f52011toq - toqVar3.f5671n];
                    iMo5085g3 = i4;
                    iMo5085g = paddingLeft;
                    iMo5085g2 = paddingLeft - this.mOrientationHelper.mo5085g(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f52012zy[toqVar3.f5671n];
                    iMo5085g3 = i4;
                    iMo5085g2 = paddingLeft2;
                    iMo5085g = this.mOrientationHelper.mo5085g(view4) + paddingLeft2;
                }
                i6 = i5;
            } else {
                int paddingTop = getPaddingTop() + this.f52012zy[toqVar3.f5671n];
                i6 = paddingTop;
                iMo5085g = i2;
                iMo5085g2 = i3;
                iMo5085g3 = this.mOrientationHelper.mo5085g(view4) + paddingTop;
            }
            layoutDecoratedWithMargins(view4, iMo5085g2, i6, iMo5085g, iMo5085g3);
            if (toqVar3.f7l8() || toqVar3.m4784g()) {
                toqVar.f52019zy = true;
            }
            toqVar.f5681q |= view4.hasFocusable();
            i16++;
            i4 = iMo5085g3;
            i2 = iMo5085g;
            i3 = iMo5085g2;
            i5 = i6;
        }
        Arrays.fill(this.f5667q, (Object) null);
    }

    public int ld6() {
        return this.f52011toq;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void onAnchorReady(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, LinearLayoutManager.C1045k c1045k, int i2) {
        super.onAnchorReady(fu4Var, mcpVar, c1045k, i2);
        ni7();
        if (mcpVar.m4822q() > 0 && !mcpVar.m4821p()) {
            m4757y(fu4Var, mcpVar, c1045k, i2);
        }
        m4756s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.fu4 r26, androidx.recyclerview.widget.RecyclerView.mcp r27) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$fu4, androidx.recyclerview.widget.RecyclerView$mcp):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, View view, androidx.core.view.accessibility.ki kiVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof toq)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, kiVar);
            return;
        }
        toq toqVar = (toq) layoutParams;
        int iX2 = x2(fu4Var, mcpVar, toqVar.m4787q());
        if (this.mOrientation == 0) {
            kiVar.z4(ki.zy.m3073y(toqVar.m4762p(), toqVar.ld6(), iX2, 1, false, false));
        } else {
            kiVar.z4(ki.zy.m3073y(iX2, 1, toqVar.m4762p(), toqVar.ld6(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        this.f52010f7l8.m4767y();
        this.f52010f7l8.f7l8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f52010f7l8.m4767y();
        this.f52010f7l8.f7l8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.f52010f7l8.m4767y();
        this.f52010f7l8.f7l8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        this.f52010f7l8.m4767y();
        this.f52010f7l8.f7l8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.f52010f7l8.m4767y();
        this.f52010f7l8.f7l8();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onLayoutChildren(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        if (mcpVar.m4821p()) {
            toq();
        }
        super.onLayoutChildren(fu4Var, mcpVar);
        m4754n();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onLayoutCompleted(RecyclerView.mcp mcpVar) {
        super.onLayoutCompleted(mcpVar);
        this.f5665k = false;
    }

    /* JADX INFO: renamed from: p */
    int m4759p(int i2, int i3) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f52012zy;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f52012zy;
        int i4 = this.f52011toq;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollHorizontallyBy(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        ni7();
        m4756s();
        return super.scrollHorizontallyBy(i2, fu4Var, mcpVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollVerticallyBy(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        ni7();
        m4756s();
        return super.scrollVerticallyBy(i2, fu4Var, mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void setMeasuredDimension(Rect rect, int i2, int i3) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f52012zy == null) {
            super.setMeasuredDimension(rect, i2, i3);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.AbstractC1048h.chooseSize(i3, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f52012zy;
            iChooseSize = RecyclerView.AbstractC1048h.chooseSize(i2, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC1048h.chooseSize(i2, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f52012zy;
            iChooseSize2 = RecyclerView.AbstractC1048h.chooseSize(i3, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f5665k;
    }

    public void zurt(boolean z2) {
        this.f5668s = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public RecyclerView.cdj generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new toq((ViewGroup.MarginLayoutParams) layoutParams) : new toq(layoutParams);
    }

    public static class toq extends RecyclerView.cdj {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f52013f7l8 = -1;

        /* JADX INFO: renamed from: g */
        int f5670g;

        /* JADX INFO: renamed from: n */
        int f5671n;

        public toq(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5671n = -1;
            this.f5670g = 0;
        }

        public int ld6() {
            return this.f5670g;
        }

        /* JADX INFO: renamed from: p */
        public int m4762p() {
            return this.f5671n;
        }

        public toq(int i2, int i3) {
            super(i2, i3);
            this.f5671n = -1;
            this.f5670g = 0;
        }

        public toq(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5671n = -1;
            this.f5670g = 0;
        }

        public toq(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5671n = -1;
            this.f5670g = 0;
        }

        public toq(RecyclerView.cdj cdjVar) {
            super(cdjVar);
            this.f5671n = -1;
            this.f5670g = 0;
        }
    }

    public GridLayoutManager(Context context, int i2) {
        super(context);
        this.f5665k = false;
        this.f52011toq = -1;
        this.f5666n = new SparseIntArray();
        this.f5664g = new SparseIntArray();
        this.f52010f7l8 = new C1043k();
        this.f5669y = new Rect();
        m4758i(i2);
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z2) {
        super(context, i3, z2);
        this.f5665k = false;
        this.f52011toq = -1;
        this.f5666n = new SparseIntArray();
        this.f5664g = new SparseIntArray();
        this.f52010f7l8 = new C1043k();
        this.f5669y = new Rect();
        m4758i(i2);
    }
}
