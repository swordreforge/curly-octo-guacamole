package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: GapWorker.java */
/* JADX INFO: loaded from: classes.dex */
final class n7h implements Runnable {

    /* JADX INFO: renamed from: n */
    long f5982n;

    /* JADX INFO: renamed from: q */
    long f5983q;

    /* JADX INFO: renamed from: y */
    static final ThreadLocal<n7h> f5979y = new ThreadLocal<>();

    /* JADX INFO: renamed from: s */
    static Comparator<zy> f5978s = new C1100k();

    /* JADX INFO: renamed from: k */
    ArrayList<RecyclerView> f5981k = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private ArrayList<zy> f5980g = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n7h$k */
    /* JADX INFO: compiled from: GapWorker.java */
    class C1100k implements Comparator<zy> {
        C1100k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(zy zyVar, zy zyVar2) {
            RecyclerView recyclerView = zyVar.f5988q;
            if ((recyclerView == null) != (zyVar2.f5988q == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z2 = zyVar.f5986k;
            if (z2 != zyVar2.f5986k) {
                return z2 ? -1 : 1;
            }
            int i2 = zyVar2.f52225toq - zyVar.f52225toq;
            if (i2 != 0) {
                return i2;
            }
            int i3 = zyVar.f52226zy - zyVar2.f52226zy;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    static class toq implements RecyclerView.AbstractC1048h.zy {

        /* JADX INFO: renamed from: k */
        int f5984k;

        /* JADX INFO: renamed from: q */
        int f5985q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52223toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int[] f52224zy;

        toq() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h.zy
        /* JADX INFO: renamed from: k */
        public void mo4811k(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.f5985q * 2;
            int[] iArr = this.f52224zy;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f52224zy = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i4 * 2];
                this.f52224zy = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f52224zy;
            iArr4[i4] = i2;
            iArr4[i4 + 1] = i3;
            this.f5985q++;
        }

        /* JADX INFO: renamed from: n */
        void m5070n(int i2, int i3) {
            this.f5984k = i2;
            this.f52223toq = i3;
        }

        /* JADX INFO: renamed from: q */
        boolean m5071q(int i2) {
            if (this.f52224zy != null) {
                int i3 = this.f5985q * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f52224zy[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        void toq() {
            int[] iArr = this.f52224zy;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5985q = 0;
        }

        void zy(RecyclerView recyclerView, boolean z2) {
            this.f5985q = 0;
            int[] iArr = this.f52224zy;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1048h abstractC1048h = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || abstractC1048h == null || !abstractC1048h.isItemPrefetchEnabled()) {
                return;
            }
            if (z2) {
                if (!recyclerView.mAdapterHelper.cdj()) {
                    abstractC1048h.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                abstractC1048h.collectAdjacentPrefetchPositions(this.f5984k, this.f52223toq, recyclerView.mState, this);
            }
            int i2 = this.f5985q;
            if (i2 > abstractC1048h.mPrefetchMaxCountObserved) {
                abstractC1048h.mPrefetchMaxCountObserved = i2;
                abstractC1048h.mPrefetchMaxObservedInInitialPrefetch = z2;
                recyclerView.mRecycler.d2ok();
            }
        }
    }

    /* JADX INFO: compiled from: GapWorker.java */
    static class zy {

        /* JADX INFO: renamed from: k */
        public boolean f5986k;

        /* JADX INFO: renamed from: n */
        public int f5987n;

        /* JADX INFO: renamed from: q */
        public RecyclerView f5988q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f52225toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f52226zy;

        zy() {
        }

        /* JADX INFO: renamed from: k */
        public void m5072k() {
            this.f5986k = false;
            this.f52225toq = 0;
            this.f52226zy = 0;
            this.f5988q = null;
            this.f5987n = 0;
        }
    }

    n7h() {
    }

    /* JADX INFO: renamed from: n */
    static boolean m5062n(RecyclerView recyclerView, int i2) {
        int iM4968p = recyclerView.mChildHelper.m4968p();
        for (int i3 = 0; i3 < iM4968p; i3++) {
            RecyclerView.fti childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m4970s(i3));
            if (childViewHolderInt.mPosition == i2 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    private void m5063q(long j2) {
        for (int i2 = 0; i2 < this.f5980g.size(); i2++) {
            zy zyVar = this.f5980g.get(i2);
            if (zyVar.f5988q == null) {
                return;
            }
            zy(zyVar, j2);
            zyVar.m5072k();
        }
    }

    /* JADX INFO: renamed from: s */
    private RecyclerView.fti m5064s(RecyclerView recyclerView, int i2, long j2) {
        if (m5062n(recyclerView, i2)) {
            return null;
        }
        RecyclerView.fu4 fu4Var = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.fti ftiVarOc = fu4Var.oc(i2, false, j2);
            if (ftiVarOc != null) {
                if (!ftiVarOc.isBound() || ftiVarOc.isInvalid()) {
                    fu4Var.m4793k(ftiVarOc, false);
                } else {
                    fu4Var.mcp(ftiVarOc.itemView);
                }
            }
            return ftiVarOc;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    private void toq() {
        zy zyVar;
        int size = this.f5981k.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.f5981k.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.zy(recyclerView, false);
                i2 += recyclerView.mPrefetchRegistry.f5985q;
            }
        }
        this.f5980g.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.f5981k.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                toq toqVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(toqVar.f5984k) + Math.abs(toqVar.f52223toq);
                for (int i6 = 0; i6 < toqVar.f5985q * 2; i6 += 2) {
                    if (i4 >= this.f5980g.size()) {
                        zyVar = new zy();
                        this.f5980g.add(zyVar);
                    } else {
                        zyVar = this.f5980g.get(i4);
                    }
                    int[] iArr = toqVar.f52224zy;
                    int i7 = iArr[i6 + 1];
                    zyVar.f5986k = i7 <= iAbs;
                    zyVar.f52225toq = iAbs;
                    zyVar.f52226zy = i7;
                    zyVar.f5988q = recyclerView2;
                    zyVar.f5987n = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f5980g, f5978s);
    }

    /* JADX INFO: renamed from: y */
    private void m5065y(@zy.dd RecyclerView recyclerView, long j2) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m4968p() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        toq toqVar = recyclerView.mPrefetchRegistry;
        toqVar.zy(recyclerView, true);
        if (toqVar.f5985q != 0) {
            try {
                androidx.core.os.zurt.toq("RV Nested Prefetch");
                recyclerView.mState.ld6(recyclerView.mAdapter);
                for (int i2 = 0; i2 < toqVar.f5985q * 2; i2 += 2) {
                    m5064s(recyclerView, toqVar.f52224zy[i2], j2);
                }
            } finally {
                androidx.core.os.zurt.m2775q();
            }
        }
    }

    private void zy(zy zyVar, long j2) {
        RecyclerView.fti ftiVarM5064s = m5064s(zyVar.f5988q, zyVar.f5987n, zyVar.f5986k ? Long.MAX_VALUE : j2);
        if (ftiVarM5064s == null || ftiVarM5064s.mNestedRecyclerView == null || !ftiVarM5064s.isBound() || ftiVarM5064s.isInvalid()) {
            return;
        }
        m5065y(ftiVarM5064s.mNestedRecyclerView.get(), j2);
    }

    void f7l8(long j2) {
        toq();
        m5063q(j2);
    }

    /* JADX INFO: renamed from: g */
    void m5066g(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f5983q == 0) {
            this.f5983q = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m5070n(i2, i3);
    }

    /* JADX INFO: renamed from: k */
    public void m5067k(RecyclerView recyclerView) {
        this.f5981k.add(recyclerView);
    }

    /* JADX INFO: renamed from: p */
    public void m5068p(RecyclerView recyclerView) {
        this.f5981k.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.zurt.toq("RV Prefetch");
            if (!this.f5981k.isEmpty()) {
                int size = this.f5981k.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f5981k.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    f7l8(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5982n);
                }
            }
        } finally {
            this.f5983q = 0L;
            androidx.core.os.zurt.m2775q();
        }
    }
}
