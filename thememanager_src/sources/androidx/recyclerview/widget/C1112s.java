package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1116y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d2ok;
import androidx.recyclerview.widget.fu4;
import androidx.recyclerview.widget.ncyb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.s */
/* JADX INFO: compiled from: ConcatAdapterController.java */
/* JADX INFO: loaded from: classes.dex */
class C1112s implements fu4.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.lvui
    private final C1116y.k.toq f52296f7l8;

    /* JADX INFO: renamed from: k */
    private final C1116y f6095k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ncyb f52297toq;

    /* JADX INFO: renamed from: y */
    private final d2ok f6098y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private List<WeakReference<RecyclerView>> f52298zy = new ArrayList();

    /* JADX INFO: renamed from: q */
    private final IdentityHashMap<RecyclerView.fti, fu4> f6097q = new IdentityHashMap<>();

    /* JADX INFO: renamed from: n */
    private List<fu4> f6096n = new ArrayList();

    /* JADX INFO: renamed from: g */
    private k f6094g = new k();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$k */
    /* JADX INFO: compiled from: ConcatAdapterController.java */
    static class k {

        /* JADX INFO: renamed from: k */
        fu4 f6099k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52299toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f52300zy;

        k() {
        }
    }

    C1112s(C1116y c1116y, C1116y.k kVar) {
        this.f6095k = c1116y;
        if (kVar.f6121k) {
            this.f52297toq = new ncyb.C1101k();
        } else {
            this.f52297toq = new ncyb.toq();
        }
        C1116y.k.toq toqVar = kVar.f52325toq;
        this.f52296f7l8 = toqVar;
        if (toqVar == C1116y.k.toq.NO_STABLE_IDS) {
            this.f6098y = new d2ok.toq();
        } else if (toqVar == C1116y.k.toq.ISOLATED_STABLE_IDS) {
            this.f6098y = new d2ok.C1070k();
        } else {
            if (toqVar != C1116y.k.toq.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f6098y = new d2ok.zy();
        }
    }

    private int fu4(RecyclerView.AbstractC1060y<RecyclerView.fti> abstractC1060y) {
        int size = this.f6096n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f6096n.get(i2).f52131zy == abstractC1060y) {
                return i2;
            }
        }
        return -1;
    }

    private void gvn7(k kVar) {
        kVar.f52300zy = false;
        kVar.f6099k = null;
        kVar.f52299toq = -1;
        this.f6094g = kVar;
    }

    @zy.dd
    private fu4 kja0(RecyclerView.AbstractC1060y<RecyclerView.fti> abstractC1060y) {
        int iFu4 = fu4(abstractC1060y);
        if (iFu4 == -1) {
            return null;
        }
        return this.f6096n.get(iFu4);
    }

    @zy.lvui
    private k n7h(int i2) {
        k kVar = this.f6094g;
        if (kVar.f52300zy) {
            kVar = new k();
        } else {
            kVar.f52300zy = true;
        }
        Iterator<fu4> it = this.f6096n.iterator();
        int qVar = i2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fu4 next = it.next();
            if (next.toq() > qVar) {
                kVar.f6099k = next;
                kVar.f52299toq = qVar;
                break;
            }
            qVar -= next.toq();
        }
        if (kVar.f6099k != null) {
            return kVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i2);
    }

    /* JADX INFO: renamed from: p */
    private void m5112p() {
        RecyclerView.AbstractC1060y.k kVarX2 = x2();
        if (kVarX2 != this.f6095k.getStateRestorationPolicy()) {
            this.f6095k.ni7(kVarX2);
        }
    }

    private int qrj(fu4 fu4Var) {
        fu4 next;
        Iterator<fu4> it = this.f6096n.iterator();
        int qVar = 0;
        while (it.hasNext() && (next = it.next()) != fu4Var) {
            qVar += next.toq();
        }
        return qVar;
    }

    private RecyclerView.AbstractC1060y.k x2() {
        for (fu4 fu4Var : this.f6096n) {
            RecyclerView.AbstractC1060y.k stateRestorationPolicy = fu4Var.f52131zy.getStateRestorationPolicy();
            RecyclerView.AbstractC1060y.k kVar = RecyclerView.AbstractC1060y.k.PREVENT;
            if (stateRestorationPolicy == kVar) {
                return kVar;
            }
            if (stateRestorationPolicy == RecyclerView.AbstractC1060y.k.PREVENT_WHEN_EMPTY && fu4Var.toq() == 0) {
                return kVar;
            }
        }
        return RecyclerView.AbstractC1060y.k.ALLOW;
    }

    /* JADX INFO: renamed from: z */
    private boolean m5113z(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.f52298zy.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    @zy.lvui
    private fu4 zurt(RecyclerView.fti ftiVar) {
        fu4 fu4Var = this.f6097q.get(ftiVar);
        if (fu4Var != null) {
            return fu4Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + ftiVar + ", seems like it is not bound by this adapter: " + this);
    }

    public void a9(RecyclerView.fti ftiVar) {
        zurt(ftiVar).f52131zy.onViewAttachedToWindow(ftiVar);
    }

    public List<RecyclerView.AbstractC1060y<? extends RecyclerView.fti>> cdj() {
        if (this.f6096n.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f6096n.size());
        Iterator<fu4> it = this.f6096n.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f52131zy);
        }
        return arrayList;
    }

    boolean d3(RecyclerView.AbstractC1060y<RecyclerView.fti> abstractC1060y) {
        int iFu4 = fu4(abstractC1060y);
        if (iFu4 == -1) {
            return false;
        }
        fu4 fu4Var = this.f6096n.get(iFu4);
        int iQrj = qrj(fu4Var);
        this.f6096n.remove(iFu4);
        this.f6095k.notifyItemRangeRemoved(iQrj, fu4Var.toq());
        Iterator<WeakReference<RecyclerView>> it = this.f52298zy.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                abstractC1060y.onDetachedFromRecyclerView(recyclerView);
            }
        }
        fu4Var.m4979k();
        m5112p();
        return true;
    }

    @Override // androidx.recyclerview.widget.fu4.toq
    public void f7l8(@zy.lvui fu4 fu4Var, int i2, int i3) {
        this.f6095k.notifyItemRangeRemoved(i2 + qrj(fu4Var), i3);
    }

    public int fn3e() {
        Iterator<fu4> it = this.f6096n.iterator();
        int qVar = 0;
        while (it.hasNext()) {
            qVar += it.next().toq();
        }
        return qVar;
    }

    public void fti(RecyclerView.fti ftiVar) {
        zurt(ftiVar).f52131zy.onViewDetachedFromWindow(ftiVar);
    }

    @Override // androidx.recyclerview.widget.fu4.toq
    /* JADX INFO: renamed from: g */
    public void mo4982g(@zy.lvui fu4 fu4Var) {
        this.f6095k.notifyDataSetChanged();
        m5112p();
    }

    @zy.dd
    /* JADX INFO: renamed from: h */
    public RecyclerView.AbstractC1060y<? extends RecyclerView.fti> m5114h(RecyclerView.fti ftiVar) {
        fu4 fu4Var = this.f6097q.get(ftiVar);
        if (fu4Var == null) {
            return null;
        }
        return fu4Var.f52131zy;
    }

    /* JADX INFO: renamed from: i */
    public int m5115i(RecyclerView.AbstractC1060y<? extends RecyclerView.fti> abstractC1060y, RecyclerView.fti ftiVar, int i2) {
        fu4 fu4Var = this.f6097q.get(ftiVar);
        if (fu4Var == null) {
            return -1;
        }
        int iQrj = i2 - qrj(fu4Var);
        int itemCount = fu4Var.f52131zy.getItemCount();
        if (iQrj >= 0 && iQrj < itemCount) {
            return fu4Var.f52131zy.findRelativeAdapterPositionIn(abstractC1060y, ftiVar, iQrj);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iQrj + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + ftiVar + "adapter:" + abstractC1060y);
    }

    public boolean jk(RecyclerView.fti ftiVar) {
        fu4 fu4Var = this.f6097q.get(ftiVar);
        if (fu4Var != null) {
            boolean zOnFailedToRecycleView = fu4Var.f52131zy.onFailedToRecycleView(ftiVar);
            this.f6097q.remove(ftiVar);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + ftiVar + ", seems like it is not bound by this adapter: " + this);
    }

    public void jp0y(RecyclerView.fti ftiVar) {
        fu4 fu4Var = this.f6097q.get(ftiVar);
        if (fu4Var != null) {
            fu4Var.f52131zy.onViewRecycled(ftiVar);
            this.f6097q.remove(ftiVar);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + ftiVar + ", seems like it is not bound by this adapter: " + this);
    }

    @Override // androidx.recyclerview.widget.fu4.toq
    /* JADX INFO: renamed from: k */
    public void mo4983k(@zy.lvui fu4 fu4Var, int i2, int i3, @zy.dd Object obj) {
        this.f6095k.notifyItemRangeChanged(i2 + qrj(fu4Var), i3, obj);
    }

    public long ki(int i2) {
        k kVarN7h = n7h(i2);
        long jZy = kVarN7h.f6099k.zy(kVarN7h.f52299toq);
        gvn7(kVarN7h);
        return jZy;
    }

    public boolean ld6() {
        Iterator<fu4> it = this.f6096n.iterator();
        while (it.hasNext()) {
            if (!it.next().f52131zy.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    public void mcp(RecyclerView recyclerView) {
        int size = this.f52298zy.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f52298zy.get(size);
            if (weakReference.get() == null) {
                this.f52298zy.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f52298zy.remove(size);
                break;
            }
            size--;
        }
        Iterator<fu4> it = this.f6096n.iterator();
        while (it.hasNext()) {
            it.next().f52131zy.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.fu4.toq
    /* JADX INFO: renamed from: n */
    public void mo4984n(@zy.lvui fu4 fu4Var, int i2, int i3) {
        this.f6095k.notifyItemRangeChanged(i2 + qrj(fu4Var), i3);
    }

    public boolean ni7() {
        return this.f52296f7l8 != C1116y.k.toq.NO_STABLE_IDS;
    }

    public void o1t(RecyclerView recyclerView) {
        if (m5113z(recyclerView)) {
            return;
        }
        this.f52298zy.add(new WeakReference<>(recyclerView));
        Iterator<fu4> it = this.f6096n.iterator();
        while (it.hasNext()) {
            it.next().f52131zy.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.fu4.toq
    /* JADX INFO: renamed from: q */
    public void mo4985q(fu4 fu4Var) {
        m5112p();
    }

    /* JADX INFO: renamed from: s */
    boolean m5116s(RecyclerView.AbstractC1060y<RecyclerView.fti> abstractC1060y) {
        return m5118y(this.f6096n.size(), abstractC1060y);
    }

    /* JADX INFO: renamed from: t */
    public RecyclerView.fti m5117t(ViewGroup viewGroup, int i2) {
        return this.f52297toq.mo5073k(i2).m4978g(viewGroup, i2);
    }

    public int t8r(int i2) {
        k kVarN7h = n7h(i2);
        int iM4981q = kVarN7h.f6099k.m4981q(kVarN7h.f52299toq);
        gvn7(kVarN7h);
        return iM4981q;
    }

    @Override // androidx.recyclerview.widget.fu4.toq
    public void toq(@zy.lvui fu4 fu4Var, int i2, int i3) {
        this.f6095k.notifyItemRangeInserted(i2 + qrj(fu4Var), i3);
    }

    public void wvg(RecyclerView.fti ftiVar, int i2) {
        k kVarN7h = n7h(i2);
        this.f6097q.put(ftiVar, kVarN7h.f6099k);
        kVarN7h.f6099k.m4980n(ftiVar, kVarN7h.f52299toq);
        gvn7(kVarN7h);
    }

    /* JADX INFO: renamed from: y */
    boolean m5118y(int i2, RecyclerView.AbstractC1060y<RecyclerView.fti> abstractC1060y) {
        if (i2 < 0 || i2 > this.f6096n.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f6096n.size() + ". Given:" + i2);
        }
        if (ni7()) {
            androidx.core.util.n7h.toq(abstractC1060y.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (abstractC1060y.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if (kja0(abstractC1060y) != null) {
            return false;
        }
        fu4 fu4Var = new fu4(abstractC1060y, this, this.f52297toq, this.f6098y.mo4939k());
        this.f6096n.add(i2, fu4Var);
        Iterator<WeakReference<RecyclerView>> it = this.f52298zy.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                abstractC1060y.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (fu4Var.toq() > 0) {
            this.f6095k.notifyItemRangeInserted(qrj(fu4Var), fu4Var.toq());
        }
        m5112p();
        return true;
    }

    @Override // androidx.recyclerview.widget.fu4.toq
    public void zy(@zy.lvui fu4 fu4Var, int i2, int i3) {
        int iQrj = qrj(fu4Var);
        this.f6095k.notifyItemMoved(i2 + iQrj, i3 + iQrj);
    }
}
