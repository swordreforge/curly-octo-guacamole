package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: FragmentTransitionCompat21.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(21)
class mcp extends jk {

    /* JADX INFO: renamed from: androidx.fragment.app.mcp$k */
    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    class C0885k extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Rect f4821k;

        C0885k(Rect rect) {
            this.f4821k = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f4821k;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.mcp$n */
    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    class C0886n extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Rect f4822k;

        C0886n(Rect rect) {
            this.f4822k = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4822k;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4822k;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.mcp$q */
    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    class C0887q implements Transition.TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Runnable f4823k;

        C0887q(Runnable runnable) {
            this.f4823k = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f4823k.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    class toq implements Transition.TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f4824k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ ArrayList f51494toq;

        toq(View view, ArrayList arrayList) {
            this.f4824k = view;
            this.f51494toq = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f4824k.setVisibility(8);
            int size = this.f51494toq.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f51494toq.get(i2)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    class zy implements Transition.TransitionListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ArrayList f4825g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f4826k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Object f4827n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ArrayList f4828q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ ArrayList f51497toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ Object f51498zy;

        zy(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4826k = obj;
            this.f51497toq = arrayList;
            this.f51498zy = obj2;
            this.f4828q = arrayList2;
            this.f4827n = obj3;
            this.f4825g = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4826k;
            if (obj != null) {
                mcp.this.cdj(obj, this.f51497toq, null);
            }
            Object obj2 = this.f51498zy;
            if (obj2 != null) {
                mcp.this.cdj(obj2, this.f4828q, null);
            }
            Object obj3 = this.f4827n;
            if (obj3 != null) {
                mcp.this.cdj(obj3, this.f4825g, null);
            }
        }
    }

    mcp() {
    }

    private static boolean mcp(Transition transition) {
        return (jk.x2(transition.getTargetIds()) && jk.x2(transition.getTargetNames()) && jk.x2(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.jk
    public void cdj(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                cdj(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (mcp(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i2 < size) {
            transition.addTarget(arrayList2.get(i2));
            i2++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.jk
    public Object f7l8(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.jk
    public void fn3e(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0886n(rect));
        }
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: h */
    public void mo4285h(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: i */
    public void mo4286i(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new zy(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: k */
    public void mo4287k(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.jk
    public void ki(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new toq(view, arrayList));
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: n */
    public boolean mo4288n(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.jk
    public Object n7h(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.jk
    public void ni7(@lvui Fragment fragment, @lvui Object obj, @lvui androidx.core.os.zy zyVar, @lvui Runnable runnable) {
        ((Transition) obj).addListener(new C0887q(runnable));
    }

    @Override // androidx.fragment.app.jk
    public void o1t(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jk.m4281q(targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        toq(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.jk
    public Object qrj(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: t */
    public Object mo4290t(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.jk
    public void toq(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                toq(transitionSet.getTransitionAt(i2), arrayList);
                i2++;
            }
            return;
        }
        if (mcp(transition) || !jk.x2(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            transition.addTarget(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.jk
    public void wvg(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            cdj(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.jk
    public void zurt(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            ld6(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0885k(rect));
        }
    }

    @Override // androidx.fragment.app.jk
    public void zy(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }
}
