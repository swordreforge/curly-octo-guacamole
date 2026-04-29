package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.C0247k;
import androidx.core.app.y2;
import androidx.core.os.zy;
import androidx.core.view.C0683f;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0714r;
import androidx.core.view.t8iq;
import androidx.fragment.app.C0888n;
import androidx.fragment.app.d3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
class toq extends d3 {

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class f7l8 implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C0247k f4915g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ d3.C0874n f4916k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f4917n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ d3.C0874n f4918q;

        f7l8(d3.C0874n c0874n, d3.C0874n c0874n2, boolean z2, C0247k c0247k) {
            this.f4916k = c0874n;
            this.f4918q = c0874n2;
            this.f4917n = z2;
            this.f4915g = c0247k;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0894t.m4333g(this.f4916k.m4252g(), this.f4918q.m4252g(), this.f4917n, this.f4915g, false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.toq$g */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class C0895g implements zy.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f4920k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ ViewGroup f51541toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ ld6 f51542zy;

        C0895g(View view, ViewGroup viewGroup, ld6 ld6Var) {
            this.f4920k = view;
            this.f51541toq = viewGroup;
            this.f51542zy = ld6Var;
        }

        @Override // androidx.core.os.zy.toq
        public void onCancel() {
            this.f4920k.clearAnimation();
            this.f51541toq.endViewTransition(this.f4920k);
            this.f51542zy.m4351k();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.toq$k */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    static /* synthetic */ class C0896k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f4922k;

        static {
            int[] iArr = new int[d3.C0874n.zy.values().length];
            f4922k = iArr;
            try {
                iArr[d3.C0874n.zy.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4922k[d3.C0874n.zy.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4922k[d3.C0874n.zy.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4922k[d3.C0874n.zy.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    private static class ld6 extends x2 {

        /* JADX INFO: renamed from: n */
        @dd
        private C0888n.q f4923n;

        /* JADX INFO: renamed from: q */
        private boolean f4924q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f51543zy;

        ld6(@lvui d3.C0874n c0874n, @lvui androidx.core.os.zy zyVar, boolean z2) {
            super(c0874n, zyVar);
            this.f4924q = false;
            this.f51543zy = z2;
        }

        @dd
        /* JADX INFO: renamed from: n */
        C0888n.q m4345n(@lvui Context context) {
            if (this.f4924q) {
                return this.f4923n;
            }
            C0888n.q qVarZy = C0888n.zy(context, toq().m4252g(), toq().m4254n() == d3.C0874n.zy.VISIBLE, this.f51543zy);
            this.f4923n = qVarZy;
            this.f4924q = true;
            return qVarZy;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.toq$n */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class AnimationAnimationListenerC0897n implements Animation.AnimationListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewGroup f4925k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ View f51544toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ ld6 f51545zy;

        /* JADX INFO: renamed from: androidx.fragment.app.toq$n$k */
        /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AnimationAnimationListenerC0897n animationAnimationListenerC0897n = AnimationAnimationListenerC0897n.this;
                animationAnimationListenerC0897n.f4925k.endViewTransition(animationAnimationListenerC0897n.f51544toq);
                AnimationAnimationListenerC0897n.this.f51545zy.m4351k();
            }
        }

        AnimationAnimationListenerC0897n(ViewGroup viewGroup, View view, ld6 ld6Var) {
            this.f4925k = viewGroup;
            this.f51544toq = view;
            this.f51545zy = ld6Var;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4925k.post(new k());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.toq$p */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class RunnableC0898p implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ qrj f4928k;

        RunnableC0898p(qrj qrjVar) {
            this.f4928k = qrjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4928k.m4351k();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.toq$q */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class C0899q implements zy.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Animator f4930k;

        C0899q(Animator animator) {
            this.f4930k = animator;
        }

        @Override // androidx.core.os.zy.toq
        public void onCancel() {
            this.f4930k.end();
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    private static class qrj extends x2 {

        /* JADX INFO: renamed from: n */
        @dd
        private final Object f4931n;

        /* JADX INFO: renamed from: q */
        private final boolean f4932q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        private final Object f51547zy;

        qrj(@lvui d3.C0874n c0874n, @lvui androidx.core.os.zy zyVar, boolean z2, boolean z3) {
            super(c0874n, zyVar);
            if (c0874n.m4254n() == d3.C0874n.zy.VISIBLE) {
                this.f51547zy = z2 ? c0874n.m4252g().getReenterTransition() : c0874n.m4252g().getEnterTransition();
                this.f4932q = z2 ? c0874n.m4252g().getAllowReturnTransitionOverlap() : c0874n.m4252g().getAllowEnterTransitionOverlap();
            } else {
                this.f51547zy = z2 ? c0874n.m4252g().getReturnTransition() : c0874n.m4252g().getExitTransition();
                this.f4932q = true;
            }
            if (!z3) {
                this.f4931n = null;
            } else if (z2) {
                this.f4931n = c0874n.m4252g().getSharedElementReturnTransition();
            } else {
                this.f4931n = c0874n.m4252g().getSharedElementEnterTransition();
            }
        }

        @dd
        /* JADX INFO: renamed from: g */
        private jk m4346g(Object obj) {
            if (obj == null) {
                return null;
            }
            jk jkVar = C0894t.f51533toq;
            if (jkVar != null && jkVar.mo4288n(obj)) {
                return jkVar;
            }
            jk jkVar2 = C0894t.f51534zy;
            if (jkVar2 != null && jkVar2.mo4288n(obj)) {
                return jkVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + toq().m4252g() + " is not a valid framework Transition or AndroidX Transition");
        }

        @dd
        public Object f7l8() {
            return this.f4931n;
        }

        @dd
        /* JADX INFO: renamed from: n */
        jk m4347n() {
            jk jkVarM4346g = m4346g(this.f51547zy);
            jk jkVarM4346g2 = m4346g(this.f4931n);
            if (jkVarM4346g == null || jkVarM4346g2 == null || jkVarM4346g == jkVarM4346g2) {
                return jkVarM4346g != null ? jkVarM4346g : jkVarM4346g2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + toq().m4252g() + " returned Transition " + this.f51547zy + " which uses a different Transition  type than its shared element transition " + this.f4931n);
        }

        /* JADX INFO: renamed from: p */
        boolean m4348p() {
            return this.f4932q;
        }

        /* JADX INFO: renamed from: s */
        public boolean m4349s() {
            return this.f4931n != null;
        }

        @dd
        /* JADX INFO: renamed from: y */
        Object m4350y() {
            return this.f51547zy;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.toq$s */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class RunnableC0900s implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f4933k;

        RunnableC0900s(ArrayList arrayList) {
            this.f4933k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0894t.m4341t(this.f4933k, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class RunnableC7880toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f4935k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ d3.C0874n f4937q;

        RunnableC7880toq(List list, d3.C0874n c0874n) {
            this.f4935k = list;
            this.f4937q = c0874n;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4935k.contains(this.f4937q)) {
                this.f4935k.remove(this.f4937q);
                toq.this.t8r(this.f4937q);
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    private static class x2 {

        /* JADX INFO: renamed from: k */
        @lvui
        private final d3.C0874n f4938k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private final androidx.core.os.zy f51548toq;

        x2(@lvui d3.C0874n c0874n, @lvui androidx.core.os.zy zyVar) {
            this.f4938k = c0874n;
            this.f51548toq = zyVar;
        }

        /* JADX INFO: renamed from: k */
        void m4351k() {
            this.f4938k.m4256q(this.f51548toq);
        }

        /* JADX INFO: renamed from: q */
        boolean m4352q() {
            d3.C0874n.zy zyVar;
            d3.C0874n.zy zyVarFrom = d3.C0874n.zy.from(this.f4938k.m4252g().mView);
            d3.C0874n.zy zyVarM4254n = this.f4938k.m4254n();
            return zyVarFrom == zyVarM4254n || !(zyVarFrom == (zyVar = d3.C0874n.zy.VISIBLE) || zyVarM4254n == zyVar);
        }

        @lvui
        d3.C0874n toq() {
            return this.f4938k;
        }

        @lvui
        androidx.core.os.zy zy() {
            return this.f51548toq;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.toq$y */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class RunnableC0901y implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ jk f4940k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Rect f4941n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f4942q;

        RunnableC0901y(jk jkVar, View view, Rect rect) {
            this.f4940k = jkVar;
            this.f4942q = view;
            this.f4941n = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4940k.ld6(this.f4942q, this.f4941n);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ d3.C0874n f4943g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewGroup f4944k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f4945n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f4946q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ld6 f4948y;

        zy(ViewGroup viewGroup, View view, boolean z2, d3.C0874n c0874n, ld6 ld6Var) {
            this.f4944k = viewGroup;
            this.f4946q = view;
            this.f4945n = z2;
            this.f4943g = c0874n;
            this.f4948y = ld6Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4944k.endViewTransition(this.f4946q);
            if (this.f4945n) {
                this.f4943g.m4254n().applyState(this.f4946q);
            }
            this.f4948y.m4351k();
        }
    }

    toq(@lvui ViewGroup viewGroup) {
        super(viewGroup);
    }

    @lvui
    private Map<d3.C0874n, Boolean> fu4(@lvui List<qrj> list, @lvui List<d3.C0874n> list2, boolean z2, @dd d3.C0874n c0874n, @dd d3.C0874n c0874n2) {
        Iterator<qrj> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        d3.C0874n c0874n3;
        d3.C0874n c0874n4;
        View view2;
        Object objN7h;
        C0247k c0247k;
        ArrayList<View> arrayList3;
        toq toqVar;
        d3.C0874n c0874n5;
        ArrayList<View> arrayList4;
        Rect rect;
        jk jkVar;
        d3.C0874n c0874n6;
        View view3;
        y2 enterTransitionCallback;
        y2 exitTransitionCallback;
        ArrayList<String> arrayList5;
        View view4;
        View view5;
        String strCdj;
        ArrayList<String> arrayList6;
        toq toqVar2 = this;
        boolean z3 = z2;
        d3.C0874n c0874n7 = c0874n;
        d3.C0874n c0874n8 = c0874n2;
        HashMap map = new HashMap();
        jk jkVar2 = null;
        for (qrj qrjVar : list) {
            if (!qrjVar.m4352q()) {
                jk jkVarM4347n = qrjVar.m4347n();
                if (jkVar2 == null) {
                    jkVar2 = jkVarM4347n;
                } else if (jkVarM4347n != null && jkVar2 != jkVarM4347n) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + qrjVar.toq().m4252g() + " returned Transition " + qrjVar.m4350y() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (jkVar2 == null) {
            for (qrj qrjVar2 : list) {
                map.put(qrjVar2.toq(), Boolean.FALSE);
                qrjVar2.m4351k();
            }
            return map;
        }
        View view6 = new View(qrj().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        C0247k c0247k2 = new C0247k();
        Object obj3 = null;
        View view7 = null;
        boolean z5 = false;
        for (qrj qrjVar3 : list) {
            if (!qrjVar3.m4349s() || c0874n7 == null || c0874n8 == null) {
                c0247k = c0247k2;
                arrayList3 = arrayList8;
                toqVar = toqVar2;
                c0874n5 = c0874n7;
                arrayList4 = arrayList7;
                rect = rect2;
                jkVar = jkVar2;
                c0874n6 = c0874n8;
                view3 = view6;
                view7 = view7;
            } else {
                Object objMo4290t = jkVar2.mo4290t(jkVar2.f7l8(qrjVar3.f7l8()));
                ArrayList<String> sharedElementSourceNames = c0874n2.m4252g().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = c0874n.m4252g().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = c0874n.m4252g().getSharedElementTargetNames();
                View view8 = view7;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = c0874n2.m4252g().getSharedElementTargetNames();
                if (z3) {
                    enterTransitionCallback = c0874n.m4252g().getEnterTransitionCallback();
                    exitTransitionCallback = c0874n2.m4252g().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = c0874n.m4252g().getExitTransitionCallback();
                    exitTransitionCallback = c0874n2.m4252g().getEnterTransitionCallback();
                }
                int i3 = 0;
                for (int size = sharedElementSourceNames.size(); i3 < size; size = size) {
                    c0247k2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                }
                C0247k<String, View> c0247k3 = new C0247k<>();
                toqVar2.fn3e(c0247k3, c0874n.m4252g().mView);
                c0247k3.fn3e(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    enterTransitionCallback.m2136q(sharedElementSourceNames, c0247k3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = c0247k3.get(str);
                        if (view9 == null) {
                            c0247k2.remove(str);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str.equals(C0683f.gyi(view9))) {
                                c0247k2.put(C0683f.gyi(view9), (String) c0247k2.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    c0247k2.fn3e(c0247k3.keySet());
                }
                C0247k<String, View> c0247k4 = new C0247k<>();
                toqVar2.fn3e(c0247k4, c0874n2.m4252g().mView);
                c0247k4.fn3e(sharedElementTargetNames2);
                c0247k4.fn3e(c0247k2.values());
                if (exitTransitionCallback != null) {
                    exitTransitionCallback.m2136q(sharedElementTargetNames2, c0247k4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = c0247k4.get(str2);
                        if (view10 == null) {
                            String strCdj2 = C0894t.cdj(c0247k2, str2);
                            if (strCdj2 != null) {
                                c0247k2.remove(strCdj2);
                            }
                        } else if (!str2.equals(C0683f.gyi(view10)) && (strCdj = C0894t.cdj(c0247k2, str2)) != null) {
                            c0247k2.put(strCdj, C0683f.gyi(view10));
                        }
                    }
                } else {
                    C0894t.m4343z(c0247k2, c0247k4);
                }
                toqVar2.zurt(c0247k3, c0247k2.keySet());
                toqVar2.zurt(c0247k4, c0247k2.values());
                if (c0247k2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    c0874n5 = c0874n;
                    c0247k = c0247k2;
                    arrayList3 = arrayList8;
                    toqVar = toqVar2;
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view6;
                    jkVar = jkVar2;
                    view7 = view8;
                    obj3 = null;
                    c0874n6 = c0874n2;
                } else {
                    C0894t.m4333g(c0874n2.m4252g(), c0874n.m4252g(), z3, c0247k3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    HashMap map2 = map;
                    View view11 = view6;
                    c0247k = c0247k2;
                    ArrayList<View> arrayList11 = arrayList8;
                    ViewTreeObserverOnPreDrawListenerC0714r.m3434k(qrj(), new f7l8(c0874n2, c0874n, z2, c0247k4));
                    arrayList7.addAll(c0247k3.values());
                    if (arrayList10.isEmpty()) {
                        view7 = view8;
                    } else {
                        View view12 = c0247k3.get(arrayList10.get(0));
                        jkVar2.zurt(objMo4290t, view12);
                        view7 = view12;
                    }
                    arrayList3 = arrayList11;
                    arrayList3.addAll(c0247k4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = c0247k4.get(sharedElementTargetNames2.get(0))) == null) {
                        toqVar = this;
                        view4 = view11;
                    } else {
                        toqVar = this;
                        ViewTreeObserverOnPreDrawListenerC0714r.m3434k(qrj(), toqVar.new RunnableC0901y(jkVar2, view5, rect2));
                        view4 = view11;
                        z5 = true;
                    }
                    jkVar2.o1t(objMo4290t, view4, arrayList7);
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view4;
                    jkVar = jkVar2;
                    jkVar2.mo4286i(objMo4290t, null, null, null, null, objMo4290t, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    c0874n5 = c0874n;
                    map = map2;
                    map.put(c0874n5, bool);
                    c0874n6 = c0874n2;
                    map.put(c0874n6, bool);
                    obj3 = objMo4290t;
                }
            }
            z3 = z2;
            arrayList7 = arrayList4;
            toqVar2 = toqVar;
            rect2 = rect;
            view6 = view3;
            c0874n8 = c0874n6;
            c0247k2 = c0247k;
            arrayList8 = arrayList3;
            c0874n7 = c0874n5;
            jkVar2 = jkVar;
        }
        View view13 = view7;
        C0247k c0247k5 = c0247k2;
        ArrayList<View> arrayList12 = arrayList8;
        toq toqVar3 = toqVar2;
        d3.C0874n c0874n9 = c0874n7;
        ArrayList<View> arrayList13 = arrayList7;
        Rect rect3 = rect2;
        jk jkVar3 = jkVar2;
        d3.C0874n c0874n10 = c0874n8;
        View view14 = view6;
        ArrayList arrayList14 = new ArrayList();
        Iterator<qrj> it2 = list.iterator();
        Object obj4 = null;
        Object objN7h2 = null;
        while (it2.hasNext()) {
            qrj next = it2.next();
            if (next.m4352q()) {
                map.put(next.toq(), Boolean.FALSE);
                next.m4351k();
            } else {
                Object objF7l8 = jkVar3.f7l8(next.m4350y());
                d3.C0874n qVar = next.toq();
                boolean z6 = obj3 != null && (qVar == c0874n9 || qVar == c0874n10);
                if (objF7l8 == null) {
                    if (!z6) {
                        map.put(qVar, Boolean.FALSE);
                        next.m4351k();
                    }
                    arrayList2 = arrayList12;
                    arrayList = arrayList13;
                    it = it2;
                    view = view14;
                    objN7h = obj4;
                    c0874n3 = c0874n10;
                    view2 = view13;
                } else {
                    it = it2;
                    ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj5 = obj4;
                    toqVar3.m4344i(arrayList15, qVar.m4252g().mView);
                    if (z6) {
                        if (qVar == c0874n9) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        jkVar3.mo4287k(objF7l8, view14);
                        arrayList2 = arrayList12;
                        arrayList = arrayList13;
                        view = view14;
                        c0874n4 = qVar;
                        obj2 = objN7h2;
                        c0874n3 = c0874n10;
                        obj = obj5;
                    } else {
                        jkVar3.toq(objF7l8, arrayList15);
                        view = view14;
                        obj = obj5;
                        arrayList = arrayList13;
                        obj2 = objN7h2;
                        arrayList2 = arrayList12;
                        c0874n3 = c0874n10;
                        jkVar3.mo4286i(objF7l8, objF7l8, arrayList15, null, null, null, null);
                        if (qVar.m4254n() == d3.C0874n.zy.GONE) {
                            c0874n4 = qVar;
                            list2.remove(c0874n4);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList15);
                            arrayList16.remove(c0874n4.m4252g().mView);
                            jkVar3.ki(objF7l8, c0874n4.m4252g().mView, arrayList16);
                            ViewTreeObserverOnPreDrawListenerC0714r.m3434k(qrj(), toqVar3.new RunnableC0900s(arrayList15));
                        } else {
                            c0874n4 = qVar;
                        }
                    }
                    if (c0874n4.m4254n() == d3.C0874n.zy.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z5) {
                            jkVar3.fn3e(objF7l8, rect3);
                        }
                        view2 = view13;
                    } else {
                        view2 = view13;
                        jkVar3.zurt(objF7l8, view2);
                    }
                    map.put(c0874n4, Boolean.TRUE);
                    if (next.m4348p()) {
                        objN7h2 = jkVar3.n7h(obj2, objF7l8, null);
                        objN7h = obj;
                    } else {
                        objN7h = jkVar3.n7h(obj, objF7l8, null);
                        objN7h2 = obj2;
                    }
                }
                c0874n10 = c0874n3;
                obj4 = objN7h;
                view13 = view2;
                view14 = view;
                arrayList13 = arrayList;
                arrayList12 = arrayList2;
                it2 = it;
            }
        }
        ArrayList<View> arrayList17 = arrayList12;
        ArrayList<View> arrayList18 = arrayList13;
        d3.C0874n c0874n11 = c0874n10;
        Object objQrj = jkVar3.qrj(objN7h2, obj4, obj3);
        for (qrj qrjVar4 : list) {
            if (!qrjVar4.m4352q()) {
                Object objM4350y = qrjVar4.m4350y();
                d3.C0874n qVar2 = qrjVar4.toq();
                boolean z7 = obj3 != null && (qVar2 == c0874n9 || qVar2 == c0874n11);
                if (objM4350y != null || z7) {
                    if (C0683f.v0af(qrj())) {
                        jkVar3.ni7(qrjVar4.toq().m4252g(), objQrj, qrjVar4.zy(), toqVar3.new RunnableC0898p(qrjVar4));
                    } else {
                        if (FragmentManager.m4(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + qrj() + " has not been laid out. Completing operation " + qVar2);
                        }
                        qrjVar4.m4351k();
                    }
                }
            }
        }
        if (!C0683f.v0af(qrj())) {
            return map;
        }
        C0894t.m4341t(arrayList14, 4);
        ArrayList<String> arrayListKja0 = jkVar3.kja0(arrayList17);
        jkVar3.zy(qrj(), objQrj);
        jkVar3.m4291z(qrj(), arrayList18, arrayList17, arrayListKja0, c0247k5);
        C0894t.m4341t(arrayList14, 0);
        jkVar3.wvg(obj3, arrayList18, arrayList17);
        return map;
    }

    private void ni7(@lvui List<ld6> list, @lvui List<d3.C0874n> list2, boolean z2, @lvui Map<d3.C0874n, Boolean> map) {
        ViewGroup viewGroupQrj = qrj();
        Context context = viewGroupQrj.getContext();
        ArrayList<ld6> arrayList = new ArrayList();
        boolean z3 = false;
        for (ld6 ld6Var : list) {
            if (ld6Var.m4352q()) {
                ld6Var.m4351k();
            } else {
                C0888n.q qVarM4345n = ld6Var.m4345n(context);
                if (qVarM4345n == null) {
                    ld6Var.m4351k();
                } else {
                    Animator animator = qVarM4345n.f51499toq;
                    if (animator == null) {
                        arrayList.add(ld6Var);
                    } else {
                        d3.C0874n qVar = ld6Var.toq();
                        Fragment fragmentM4252g = qVar.m4252g();
                        if (Boolean.TRUE.equals(map.get(qVar))) {
                            if (FragmentManager.m4(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentM4252g + " as this Fragment was involved in a Transition.");
                            }
                            ld6Var.m4351k();
                        } else {
                            boolean z5 = qVar.m4254n() == d3.C0874n.zy.GONE;
                            if (z5) {
                                list2.remove(qVar);
                            }
                            View view = fragmentM4252g.mView;
                            viewGroupQrj.startViewTransition(view);
                            animator.addListener(new zy(viewGroupQrj, view, z5, qVar, ld6Var));
                            animator.setTarget(view);
                            animator.start();
                            ld6Var.zy().m2782q(new C0899q(animator));
                            z3 = true;
                        }
                    }
                }
            }
        }
        for (ld6 ld6Var2 : arrayList) {
            d3.C0874n qVar2 = ld6Var2.toq();
            Fragment fragmentM4252g2 = qVar2.m4252g();
            if (z2) {
                if (FragmentManager.m4(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM4252g2 + " as Animations cannot run alongside Transitions.");
                }
                ld6Var2.m4351k();
            } else if (z3) {
                if (FragmentManager.m4(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentM4252g2 + " as Animations cannot run alongside Animators.");
                }
                ld6Var2.m4351k();
            } else {
                View view2 = fragmentM4252g2.mView;
                Animation animation = (Animation) androidx.core.util.n7h.x2(((C0888n.q) androidx.core.util.n7h.x2(ld6Var2.m4345n(context))).f4835k);
                if (qVar2.m4254n() != d3.C0874n.zy.REMOVED) {
                    view2.startAnimation(animation);
                    ld6Var2.m4351k();
                } else {
                    viewGroupQrj.startViewTransition(view2);
                    C0888n.n nVar = new C0888n.n(animation, viewGroupQrj, view2);
                    nVar.setAnimationListener(new AnimationAnimationListenerC0897n(viewGroupQrj, view2, ld6Var2));
                    view2.startAnimation(nVar);
                }
                ld6Var2.zy().m2782q(new C0895g(view2, viewGroupQrj, ld6Var2));
            }
        }
    }

    void fn3e(Map<String, View> map, @lvui View view) {
        String strGyi = C0683f.gyi(view);
        if (strGyi != null) {
            map.put(strGyi, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    fn3e(map, childAt);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // androidx.fragment.app.d3
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mo4247g(@zy.lvui java.util.List<androidx.fragment.app.d3.C0874n> r11, boolean r12) {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.d3$n r1 = (androidx.fragment.app.d3.C0874n) r1
            androidx.fragment.app.Fragment r3 = r1.m4252g()
            android.view.View r3 = r3.mView
            androidx.fragment.app.d3$n$zy r3 = androidx.fragment.app.d3.C0874n.zy.from(r3)
            int[] r4 = androidx.fragment.app.toq.C0896k.f4922k
            androidx.fragment.app.d3$n$zy r5 = r1.m4254n()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r2) goto L3c
            r2 = 2
            if (r4 == r2) goto L3c
            r2 = 3
            if (r4 == r2) goto L3c
            r2 = 4
            if (r4 == r2) goto L36
            goto L7
        L36:
            androidx.fragment.app.d3$n$zy r2 = androidx.fragment.app.d3.C0874n.zy.VISIBLE
            if (r3 == r2) goto L7
            r7 = r1
            goto L7
        L3c:
            androidx.fragment.app.d3$n$zy r2 = androidx.fragment.app.d3.C0874n.zy.VISIBLE
            if (r3 != r2) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r11.next()
            androidx.fragment.app.d3$n r4 = (androidx.fragment.app.d3.C0874n) r4
            androidx.core.os.zy r5 = new androidx.core.os.zy
            r5.<init>()
            r4.m4255p(r5)
            androidx.fragment.app.toq$ld6 r8 = new androidx.fragment.app.toq$ld6
            r8.<init>(r4, r5, r12)
            r0.add(r8)
            androidx.core.os.zy r5 = new androidx.core.os.zy
            r5.<init>()
            r4.m4255p(r5)
            androidx.fragment.app.toq$qrj r8 = new androidx.fragment.app.toq$qrj
            r9 = 0
            if (r12 == 0) goto L83
            if (r4 != r6) goto L86
            goto L85
        L83:
            if (r4 != r7) goto L86
        L85:
            r9 = r2
        L86:
            r8.<init>(r4, r5, r12, r9)
            r3.add(r8)
            androidx.fragment.app.toq$toq r5 = new androidx.fragment.app.toq$toq
            r5.<init>(r1, r4)
            r4.m4253k(r5)
            goto L57
        L95:
            r2 = r10
            r4 = r1
            r5 = r12
            java.util.Map r11 = r2.fu4(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.ni7(r0, r1, r12, r11)
            java.util.Iterator r11 = r1.iterator()
        La9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.d3$n r12 = (androidx.fragment.app.d3.C0874n) r12
            r10.t8r(r12)
            goto La9
        Lb9:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.toq.mo4247g(java.util.List, boolean):void");
    }

    /* JADX INFO: renamed from: i */
    void m4344i(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (t8iq.zy(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                m4344i(arrayList, childAt);
            }
        }
    }

    void t8r(@lvui d3.C0874n c0874n) {
        c0874n.m4254n().applyState(c0874n.m4252g().mView);
    }

    void zurt(@lvui C0247k<String, View> c0247k, @lvui Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c0247k.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0683f.gyi(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
