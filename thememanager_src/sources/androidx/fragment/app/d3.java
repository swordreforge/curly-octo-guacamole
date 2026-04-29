package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.zy;
import androidx.core.view.C0683f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o1t.C7422k;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: SpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
abstract class d3 {

    /* JADX INFO: renamed from: k */
    private final ViewGroup f4767k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final ArrayList<C0874n> f51474toq = new ArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final ArrayList<C0874n> f51475zy = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    boolean f4769q = false;

    /* JADX INFO: renamed from: n */
    boolean f4768n = false;

    /* JADX INFO: renamed from: androidx.fragment.app.d3$k */
    /* JADX INFO: compiled from: SpecialEffectsController.java */
    class RunnableC0873k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0875q f4770k;

        RunnableC0873k(C0875q c0875q) {
            this.f4770k = c0875q;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d3.this.f51474toq.contains(this.f4770k)) {
                this.f4770k.m4254n().applyState(this.f4770k.m4252g().mView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d3$q */
    /* JADX INFO: compiled from: SpecialEffectsController.java */
    private static class C0875q extends C0874n {

        /* JADX INFO: renamed from: y */
        @lvui
        private final zurt f4779y;

        C0875q(@lvui C0874n.zy zyVar, @lvui C0874n.toq toqVar, @lvui zurt zurtVar, @lvui androidx.core.os.zy zyVar2) {
            super(zyVar, toqVar, zurtVar.ld6(), zyVar2);
            this.f4779y = zurtVar;
        }

        @Override // androidx.fragment.app.d3.C0874n
        void x2() {
            if (f7l8() == C0874n.toq.ADDING) {
                Fragment fragmentLd6 = this.f4779y.ld6();
                View viewFindFocus = fragmentLd6.mView.findFocus();
                if (viewFindFocus != null) {
                    fragmentLd6.setFocusedView(viewFindFocus);
                    if (FragmentManager.m4(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentLd6);
                    }
                }
                View viewRequireView = m4252g().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f4779y.toq();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentLd6.getPostOnViewCreatedAlpha());
            }
        }

        @Override // androidx.fragment.app.d3.C0874n
        public void zy() {
            super.zy();
            this.f4779y.qrj();
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0875q f4780k;

        toq(C0875q c0875q) {
            this.f4780k = c0875q;
        }

        @Override // java.lang.Runnable
        public void run() {
            d3.this.f51474toq.remove(this.f4780k);
            d3.this.f51475zy.remove(this.f4780k);
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    static /* synthetic */ class zy {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f4782k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final /* synthetic */ int[] f51479toq;

        static {
            int[] iArr = new int[C0874n.toq.values().length];
            f51479toq = iArr;
            try {
                iArr[C0874n.toq.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51479toq[C0874n.toq.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51479toq[C0874n.toq.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C0874n.zy.values().length];
            f4782k = iArr2;
            try {
                iArr2[C0874n.zy.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4782k[C0874n.zy.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4782k[C0874n.zy.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4782k[C0874n.zy.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    d3(@lvui ViewGroup viewGroup) {
        this.f4767k = viewGroup;
    }

    private void cdj() {
        for (C0874n c0874n : this.f51474toq) {
            if (c0874n.f7l8() == C0874n.toq.ADDING) {
                c0874n.ld6(C0874n.zy.from(c0874n.m4252g().requireView().getVisibility()), C0874n.toq.NONE);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m4244k(@lvui C0874n.zy zyVar, @lvui C0874n.toq toqVar, @lvui zurt zurtVar) {
        synchronized (this.f51474toq) {
            androidx.core.os.zy zyVar2 = new androidx.core.os.zy();
            C0874n c0874nM4246y = m4246y(zurtVar.ld6());
            if (c0874nM4246y != null) {
                c0874nM4246y.ld6(zyVar, toqVar);
                return;
            }
            C0875q c0875q = new C0875q(zyVar, toqVar, zurtVar, zyVar2);
            this.f51474toq.add(c0875q);
            c0875q.m4253k(new RunnableC0873k(c0875q));
            c0875q.m4253k(new toq(c0875q));
        }
    }

    @lvui
    static d3 kja0(@lvui ViewGroup viewGroup, @lvui oc ocVar) {
        int i2 = C7422k.f7l8.f42849m;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof d3) {
            return (d3) tag;
        }
        d3 d3VarMo4210k = ocVar.mo4210k(viewGroup);
        viewGroup.setTag(i2, d3VarMo4210k);
        return d3VarMo4210k;
    }

    @lvui
    static d3 n7h(@lvui ViewGroup viewGroup, @lvui FragmentManager fragmentManager) {
        return kja0(viewGroup, fragmentManager.was());
    }

    @dd
    /* JADX INFO: renamed from: s */
    private C0874n m4245s(@lvui Fragment fragment) {
        for (C0874n c0874n : this.f51475zy) {
            if (c0874n.m4252g().equals(fragment) && !c0874n.m4258y()) {
                return c0874n;
            }
        }
        return null;
    }

    @dd
    /* JADX INFO: renamed from: y */
    private C0874n m4246y(@lvui Fragment fragment) {
        for (C0874n c0874n : this.f51474toq) {
            if (c0874n.m4252g().equals(fragment) && !c0874n.m4258y()) {
                return c0874n;
            }
        }
        return null;
    }

    void f7l8() {
        if (this.f4768n) {
            return;
        }
        if (!C0683f.zsr0(this.f4767k)) {
            m4250p();
            this.f4769q = false;
            return;
        }
        synchronized (this.f51474toq) {
            if (!this.f51474toq.isEmpty()) {
                ArrayList<C0874n> arrayList = new ArrayList(this.f51475zy);
                this.f51475zy.clear();
                for (C0874n c0874n : arrayList) {
                    if (FragmentManager.m4(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0874n);
                    }
                    c0874n.toq();
                    if (!c0874n.m4257s()) {
                        this.f51475zy.add(c0874n);
                    }
                }
                cdj();
                ArrayList arrayList2 = new ArrayList(this.f51474toq);
                this.f51474toq.clear();
                this.f51475zy.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0874n) it.next()).x2();
                }
                mo4247g(arrayList2, this.f4769q);
                this.f4769q = false;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    abstract void mo4247g(@lvui List<C0874n> list, boolean z2);

    /* JADX INFO: renamed from: h */
    void m4248h() {
        synchronized (this.f51474toq) {
            cdj();
            this.f4768n = false;
            int size = this.f51474toq.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0874n c0874n = this.f51474toq.get(size);
                C0874n.zy zyVarFrom = C0874n.zy.from(c0874n.m4252g().mView);
                C0874n.zy zyVarM4254n = c0874n.m4254n();
                C0874n.zy zyVar = C0874n.zy.VISIBLE;
                if (zyVarM4254n == zyVar && zyVarFrom != zyVar) {
                    this.f4768n = c0874n.m4252g().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    void ki(boolean z2) {
        this.f4769q = z2;
    }

    void ld6() {
        if (this.f4768n) {
            this.f4768n = false;
            f7l8();
        }
    }

    /* JADX INFO: renamed from: n */
    void m4249n(@lvui zurt zurtVar) {
        if (FragmentManager.m4(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + zurtVar.ld6());
        }
        m4244k(C0874n.zy.VISIBLE, C0874n.toq.NONE, zurtVar);
    }

    /* JADX INFO: renamed from: p */
    void m4250p() {
        boolean zZsr0 = C0683f.zsr0(this.f4767k);
        synchronized (this.f51474toq) {
            cdj();
            Iterator<C0874n> it = this.f51474toq.iterator();
            while (it.hasNext()) {
                it.next().x2();
            }
            for (C0874n c0874n : new ArrayList(this.f51475zy)) {
                if (FragmentManager.m4(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zZsr0 ? "" : "Container " + this.f4767k + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(c0874n);
                    Log.v("FragmentManager", sb.toString());
                }
                c0874n.toq();
            }
            for (C0874n c0874n2 : new ArrayList(this.f51474toq)) {
                if (FragmentManager.m4(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zZsr0 ? "" : "Container " + this.f4767k + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(c0874n2);
                    Log.v("FragmentManager", sb2.toString());
                }
                c0874n2.toq();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    void m4251q(@lvui zurt zurtVar) {
        if (FragmentManager.m4(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + zurtVar.ld6());
        }
        m4244k(C0874n.zy.REMOVED, C0874n.toq.REMOVING, zurtVar);
    }

    @lvui
    public ViewGroup qrj() {
        return this.f4767k;
    }

    void toq(@lvui C0874n.zy zyVar, @lvui zurt zurtVar) {
        if (FragmentManager.m4(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + zurtVar.ld6());
        }
        m4244k(zyVar, C0874n.toq.ADDING, zurtVar);
    }

    @dd
    C0874n.toq x2(@lvui zurt zurtVar) {
        C0874n c0874nM4246y = m4246y(zurtVar.ld6());
        C0874n.toq toqVarF7l8 = c0874nM4246y != null ? c0874nM4246y.f7l8() : null;
        C0874n c0874nM4245s = m4245s(zurtVar.ld6());
        return (c0874nM4245s == null || !(toqVarF7l8 == null || toqVarF7l8 == C0874n.toq.NONE)) ? toqVarF7l8 : c0874nM4245s.f7l8();
    }

    void zy(@lvui zurt zurtVar) {
        if (FragmentManager.m4(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + zurtVar.ld6());
        }
        m4244k(C0874n.zy.GONE, C0874n.toq.NONE, zurtVar);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d3$n */
    /* JADX INFO: compiled from: SpecialEffectsController.java */
    static class C0874n {

        /* JADX INFO: renamed from: k */
        @lvui
        private zy f4773k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private toq f51477toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private final Fragment f51478zy;

        /* JADX INFO: renamed from: q */
        @lvui
        private final List<Runnable> f4775q = new ArrayList();

        /* JADX INFO: renamed from: n */
        @lvui
        private final HashSet<androidx.core.os.zy> f4774n = new HashSet<>();

        /* JADX INFO: renamed from: g */
        private boolean f4772g = false;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f51476f7l8 = false;

        /* JADX INFO: renamed from: androidx.fragment.app.d3$n$k */
        /* JADX INFO: compiled from: SpecialEffectsController.java */
        class k implements zy.toq {
            k() {
            }

            @Override // androidx.core.os.zy.toq
            public void onCancel() {
                C0874n.this.toq();
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.d3$n$toq */
        /* JADX INFO: compiled from: SpecialEffectsController.java */
        enum toq {
            NONE,
            ADDING,
            REMOVING
        }

        C0874n(@lvui zy zyVar, @lvui toq toqVar, @lvui Fragment fragment, @lvui androidx.core.os.zy zyVar2) {
            this.f4773k = zyVar;
            this.f51477toq = toqVar;
            this.f51478zy = fragment;
            zyVar2.m2782q(new k());
        }

        @lvui
        toq f7l8() {
            return this.f51477toq;
        }

        @lvui
        /* JADX INFO: renamed from: g */
        public final Fragment m4252g() {
            return this.f51478zy;
        }

        /* JADX INFO: renamed from: k */
        final void m4253k(@lvui Runnable runnable) {
            this.f4775q.add(runnable);
        }

        final void ld6(@lvui zy zyVar, @lvui toq toqVar) {
            int i2 = zy.f51479toq[toqVar.ordinal()];
            if (i2 == 1) {
                if (this.f4773k == zy.REMOVED) {
                    if (FragmentManager.m4(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f51478zy + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f51477toq + " to ADDING.");
                    }
                    this.f4773k = zy.VISIBLE;
                    this.f51477toq = toq.ADDING;
                    return;
                }
                return;
            }
            if (i2 == 2) {
                if (FragmentManager.m4(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f51478zy + " mFinalState = " + this.f4773k + " -> REMOVED. mLifecycleImpact  = " + this.f51477toq + " to REMOVING.");
                }
                this.f4773k = zy.REMOVED;
                this.f51477toq = toq.REMOVING;
                return;
            }
            if (i2 == 3 && this.f4773k != zy.REMOVED) {
                if (FragmentManager.m4(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f51478zy + " mFinalState = " + this.f4773k + " -> " + zyVar + ". ");
                }
                this.f4773k = zyVar;
            }
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public zy m4254n() {
            return this.f4773k;
        }

        /* JADX INFO: renamed from: p */
        public final void m4255p(@lvui androidx.core.os.zy zyVar) {
            x2();
            this.f4774n.add(zyVar);
        }

        /* JADX INFO: renamed from: q */
        public final void m4256q(@lvui androidx.core.os.zy zyVar) {
            if (this.f4774n.remove(zyVar) && this.f4774n.isEmpty()) {
                zy();
            }
        }

        /* JADX INFO: renamed from: s */
        final boolean m4257s() {
            return this.f51476f7l8;
        }

        @lvui
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4773k + "} {mLifecycleImpact = " + this.f51477toq + "} {mFragment = " + this.f51478zy + "}";
        }

        final void toq() {
            if (m4258y()) {
                return;
            }
            this.f4772g = true;
            if (this.f4774n.isEmpty()) {
                zy();
                return;
            }
            Iterator it = new ArrayList(this.f4774n).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.zy) it.next()).m2780k();
            }
        }

        void x2() {
        }

        /* JADX INFO: renamed from: y */
        final boolean m4258y() {
            return this.f4772g;
        }

        @InterfaceC7842s
        public void zy() {
            if (this.f51476f7l8) {
                return;
            }
            if (FragmentManager.m4(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f51476f7l8 = true;
            Iterator<Runnable> it = this.f4775q.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.d3$n$zy */
        /* JADX INFO: compiled from: SpecialEffectsController.java */
        enum zy {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @lvui
            static zy from(@lvui View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            void applyState(@lvui View view) {
                int i2 = zy.f4782k[ordinal()];
                if (i2 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m4(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (FragmentManager.m4(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i2 == 3) {
                    if (FragmentManager.m4(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i2 != 4) {
                    return;
                }
                if (FragmentManager.m4(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }

            @lvui
            static zy from(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }
        }
    }
}
