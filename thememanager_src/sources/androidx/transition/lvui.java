package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C0247k;
import androidx.core.view.C0683f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: TransitionManager.java */
/* JADX INFO: loaded from: classes.dex */
public class lvui {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f53512zy = "TransitionManager";

    /* JADX INFO: renamed from: k */
    private C0247k<fti, oc> f6712k = new C0247k<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C0247k<fti, C0247k<fti, oc>> f53513toq = new C0247k<>();

    /* JADX INFO: renamed from: q */
    private static oc f6711q = new zy();

    /* JADX INFO: renamed from: n */
    private static ThreadLocal<WeakReference<C0247k<ViewGroup, ArrayList<oc>>>> f6710n = new ThreadLocal<>();

    /* JADX INFO: renamed from: g */
    static ArrayList<ViewGroup> f6709g = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.transition.lvui$k */
    /* JADX INFO: compiled from: TransitionManager.java */
    private static class ViewTreeObserverOnPreDrawListenerC1230k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: k */
        oc f6713k;

        /* JADX INFO: renamed from: q */
        ViewGroup f6714q;

        /* JADX INFO: renamed from: androidx.transition.lvui$k$k */
        /* JADX INFO: compiled from: TransitionManager.java */
        class k extends d2ok {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ C0247k f6715k;

            k(C0247k c0247k) {
                this.f6715k = c0247k;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
            /* JADX INFO: renamed from: q */
            public void mo5311q(@zy.lvui oc ocVar) {
                ((ArrayList) this.f6715k.get(ViewTreeObserverOnPreDrawListenerC1230k.this.f6714q)).remove(ocVar);
                ocVar.mo5320x(this);
            }
        }

        ViewTreeObserverOnPreDrawListenerC1230k(oc ocVar, ViewGroup viewGroup) {
            this.f6713k = ocVar;
            this.f6714q = viewGroup;
        }

        /* JADX INFO: renamed from: k */
        private void m5387k() {
            this.f6714q.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6714q.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m5387k();
            if (!lvui.f6709g.remove(this.f6714q)) {
                return true;
            }
            C0247k<ViewGroup, ArrayList<oc>> c0247kM5382n = lvui.m5382n();
            ArrayList<oc> arrayList = c0247kM5382n.get(this.f6714q);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c0247kM5382n.put(this.f6714q, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6713k);
            this.f6713k.mo5316k(new k(c0247kM5382n));
            this.f6713k.fn3e(this.f6714q, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((oc) it.next()).mo5319u(this.f6714q);
                }
            }
            this.f6713k.zp(this.f6714q);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m5387k();
            lvui.f6709g.remove(this.f6714q);
            ArrayList<oc> arrayList = lvui.m5382n().get(this.f6714q);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<oc> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo5319u(this.f6714q);
                }
            }
            this.f6713k.zurt(true);
        }
    }

    public static void f7l8(@zy.lvui fti ftiVar) {
        zy(ftiVar, f6711q);
    }

    /* JADX INFO: renamed from: g */
    private oc m5380g(fti ftiVar) {
        fti ftiVarZy;
        C0247k<fti, oc> c0247k;
        oc ocVar;
        ViewGroup viewGroupM5342n = ftiVar.m5342n();
        if (viewGroupM5342n != null && (ftiVarZy = fti.zy(viewGroupM5342n)) != null && (c0247k = this.f53513toq.get(ftiVar)) != null && (ocVar = c0247k.get(ftiVarZy)) != null) {
            return ocVar;
        }
        oc ocVar2 = this.f6712k.get(ftiVar);
        return ocVar2 != null ? ocVar2 : f6711q;
    }

    /* JADX INFO: renamed from: k */
    public static void m5381k(@zy.lvui ViewGroup viewGroup) {
        toq(viewGroup, null);
    }

    /* JADX INFO: renamed from: n */
    static C0247k<ViewGroup, ArrayList<oc>> m5382n() {
        C0247k<ViewGroup, ArrayList<oc>> c0247k;
        WeakReference<C0247k<ViewGroup, ArrayList<oc>>> weakReference = f6710n.get();
        if (weakReference != null && (c0247k = weakReference.get()) != null) {
            return c0247k;
        }
        C0247k<ViewGroup, ArrayList<oc>> c0247k2 = new C0247k<>();
        f6710n.set(new WeakReference<>(c0247k2));
        return c0247k2;
    }

    /* JADX INFO: renamed from: p */
    private static void m5383p(ViewGroup viewGroup, oc ocVar) {
        ArrayList<oc> arrayList = m5382n().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<oc> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo5312a(viewGroup);
            }
        }
        if (ocVar != null) {
            ocVar.fn3e(viewGroup, true);
        }
        fti ftiVarZy = fti.zy(viewGroup);
        if (ftiVarZy != null) {
            ftiVarZy.toq();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m5384q(ViewGroup viewGroup) {
        f6709g.remove(viewGroup);
        ArrayList<oc> arrayList = m5382n().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((oc) arrayList2.get(size)).d2ok(viewGroup);
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m5385s(ViewGroup viewGroup, oc ocVar) {
        if (ocVar == null || viewGroup == null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC1230k viewTreeObserverOnPreDrawListenerC1230k = new ViewTreeObserverOnPreDrawListenerC1230k(ocVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1230k);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1230k);
    }

    public static void toq(@zy.lvui ViewGroup viewGroup, @zy.dd oc ocVar) {
        if (f6709g.contains(viewGroup) || !C0683f.v0af(viewGroup)) {
            return;
        }
        f6709g.add(viewGroup);
        if (ocVar == null) {
            ocVar = f6711q;
        }
        oc ocVarClone = ocVar.clone();
        m5383p(viewGroup, ocVarClone);
        fti.f7l8(viewGroup, null);
        m5385s(viewGroup, ocVarClone);
    }

    /* JADX INFO: renamed from: y */
    public static void m5386y(@zy.lvui fti ftiVar, @zy.dd oc ocVar) {
        zy(ftiVar, ocVar);
    }

    private static void zy(fti ftiVar, oc ocVar) {
        ViewGroup viewGroupM5342n = ftiVar.m5342n();
        if (f6709g.contains(viewGroupM5342n)) {
            return;
        }
        fti ftiVarZy = fti.zy(viewGroupM5342n);
        if (ocVar == null) {
            if (ftiVarZy != null) {
                ftiVarZy.toq();
            }
            ftiVar.m5341k();
            return;
        }
        f6709g.add(viewGroupM5342n);
        oc ocVarClone = ocVar.clone();
        if (ftiVarZy != null && ftiVarZy.m5340g()) {
            ocVarClone.c8jq(true);
        }
        m5383p(viewGroupM5342n, ocVarClone);
        ftiVar.m5341k();
        m5385s(viewGroupM5342n, ocVarClone);
    }

    public void ld6(@zy.lvui fti ftiVar, @zy.lvui fti ftiVar2, @zy.dd oc ocVar) {
        C0247k<fti, oc> c0247k = this.f53513toq.get(ftiVar2);
        if (c0247k == null) {
            c0247k = new C0247k<>();
            this.f53513toq.put(ftiVar2, c0247k);
        }
        c0247k.put(ftiVar, ocVar);
    }

    public void qrj(@zy.lvui fti ftiVar) {
        zy(ftiVar, m5380g(ftiVar));
    }

    public void x2(@zy.lvui fti ftiVar, @zy.dd oc ocVar) {
        this.f6712k.put(ftiVar, ocVar);
    }
}
