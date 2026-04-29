package miuix.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C0683f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.jp0y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.animation.utils.EaseManager;
import zy.lvui;

/* JADX INFO: renamed from: miuix.recyclerview.widget.k */
/* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7318k extends jp0y {

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    static final TimeInterpolator f90033jk = new EaseManager.SpringInterpolator().setDamping(0.9f).setResponse(0.3f).setDuration(300);

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static TimeInterpolator f90034mcp = null;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final boolean f90035o1t = false;

    /* JADX INFO: renamed from: t */
    private static final long f41539t = 100;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final long f90036wvg = 50;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    ArrayList<RecyclerView.fti> f90041kja0 = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    ArrayList<RecyclerView.fti> f41540h = new ArrayList<>();

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    ArrayList<p> f90037cdj = new ArrayList<>();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    ArrayList<s> f90040ki = new ArrayList<>();

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.fti>> f90043t8r = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    ArrayList<ArrayList<p>> f41541i = new ArrayList<>();

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    ArrayList<ArrayList<s>> f90038fn3e = new ArrayList<>();

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    ArrayList<RecyclerView.fti> f90044zurt = new ArrayList<>();

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    ArrayList<RecyclerView.fti> f90042ni7 = new ArrayList<>();

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    ArrayList<RecyclerView.fti> f90039fu4 = new ArrayList<>();

    /* JADX INFO: renamed from: z */
    ArrayList<RecyclerView.fti> f41542z = new ArrayList<>();

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$f7l8 */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    class f7l8 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ s f41544k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f41545n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f41546q;

        f7l8(s sVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f41544k = sVar;
            this.f41546q = viewPropertyAnimator;
            this.f41545n = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f41546q.setListener(null);
            this.f41545n.setAlpha(1.0f);
            this.f41545n.setTranslationX(0.0f);
            this.f41545n.setTranslationY(0.0f);
            C7318k.this.oc(this.f41544k.f41567k, true);
            C7318k.this.f41542z.remove(this.f41544k.f41567k);
            C7318k.this.m26523m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7318k.this.eqxt(this.f41544k.f41567k, true);
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$g */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f41547g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecyclerView.fti f41548k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f41549n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f41550q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ViewPropertyAnimator f41552y;

        g(RecyclerView.fti ftiVar, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.f41548k = ftiVar;
            this.f41550q = i2;
            this.f41549n = view;
            this.f41547g = i3;
            this.f41552y = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f41550q != 0) {
                this.f41549n.setTranslationX(0.0f);
            }
            if (this.f41547g != 0) {
                this.f41549n.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f41552y.setListener(null);
            C7318k.this.d2ok(this.f41548k);
            C7318k.this.f90042ni7.remove(this.f41548k);
            C7318k.this.m26523m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7318k.this.lvui(this.f41548k);
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$k */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f41553k;

        k(ArrayList arrayList) {
            this.f41553k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (p pVar : this.f41553k) {
                C7318k.this.hb(pVar.f41559k, pVar.f90045toq, pVar.f90046zy, pVar.f41561q, pVar.f41560n);
            }
            this.f41553k.clear();
            C7318k.this.f41541i.remove(this.f41553k);
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$n */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    class n extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecyclerView.fti f41556k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ViewPropertyAnimator f41557n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f41558q;

        n(RecyclerView.fti ftiVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f41556k = ftiVar;
            this.f41558q = view;
            this.f41557n = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f41558q.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f41557n.setListener(null);
            C7318k.this.gvn7(this.f41556k);
            C7318k.this.f90044zurt.remove(this.f41556k);
            C7318k.this.m26523m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7318k.this.d3(this.f41556k);
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$p */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    private static class p {

        /* JADX INFO: renamed from: k */
        public RecyclerView.fti f41559k;

        /* JADX INFO: renamed from: n */
        public int f41560n;

        /* JADX INFO: renamed from: q */
        public int f41561q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f90045toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f90046zy;

        p(RecyclerView.fti ftiVar, int i2, int i3, int i4, int i5) {
            this.f41559k = ftiVar;
            this.f90045toq = i2;
            this.f90046zy = i3;
            this.f41561q = i4;
            this.f41560n = i5;
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$q */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    class q extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecyclerView.fti f41563k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f41564n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f41565q;

        q(RecyclerView.fti ftiVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f41563k = ftiVar;
            this.f41565q = viewPropertyAnimator;
            this.f41564n = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f41565q.setListener(null);
            this.f41564n.setAlpha(1.0f);
            C7318k.this.m4992r(this.f41563k);
            C7318k.this.f90039fu4.remove(this.f41563k);
            C7318k.this.m26523m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7318k.this.dd(this.f41563k);
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$toq */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f41570k;

        toq(ArrayList arrayList) {
            this.f41570k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f41570k.iterator();
            while (it.hasNext()) {
                C7318k.this.nn86((s) it.next());
            }
            this.f41570k.clear();
            C7318k.this.f90038fn3e.remove(this.f41570k);
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$y */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    class y extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ s f41573k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f41574n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f41575q;

        y(s sVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f41573k = sVar;
            this.f41575q = viewPropertyAnimator;
            this.f41574n = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f41575q.setListener(null);
            this.f41574n.setAlpha(1.0f);
            this.f41574n.setTranslationX(0.0f);
            this.f41574n.setTranslationY(0.0f);
            C7318k.this.oc(this.f41573k.f90047toq, false);
            C7318k.this.f41542z.remove(this.f41573k.f90047toq);
            C7318k.this.m26523m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7318k.this.eqxt(this.f41573k.f90047toq, false);
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$zy */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f41576k;

        zy(ArrayList arrayList) {
            this.f41576k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f41576k.iterator();
            while (it.hasNext()) {
                C7318k.this.mo26521e((RecyclerView.fti) it.next());
            }
            this.f41576k.clear();
            C7318k.this.f90043t8r.remove(this.f41576k);
        }
    }

    public C7318k() {
        m4853z(300L);
        mcp(300L);
        m4851t(300L);
        o1t(300L);
    }

    private void ek5k(List<s> list, RecyclerView.fti ftiVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            s sVar = list.get(size);
            if (y9n(sVar, ftiVar) && sVar.f41567k == null && sVar.f90047toq == null) {
                list.remove(sVar);
            }
        }
    }

    private boolean y9n(s sVar, RecyclerView.fti ftiVar) {
        boolean z2 = false;
        if (sVar.f90047toq == ftiVar) {
            sVar.f90047toq = null;
        } else {
            if (sVar.f41567k != ftiVar) {
                return false;
            }
            sVar.f41567k = null;
            z2 = true;
        }
        ftiVar.itemView.setAlpha(1.0f);
        ftiVar.itemView.setTranslationX(0.0f);
        ftiVar.itemView.setTranslationY(0.0f);
        oc(ftiVar, z2);
        return true;
    }

    private void yz(s sVar) {
        RecyclerView.fti ftiVar = sVar.f41567k;
        if (ftiVar != null) {
            y9n(sVar, ftiVar);
        }
        RecyclerView.fti ftiVar2 = sVar.f90047toq;
        if (ftiVar2 != null) {
            y9n(sVar, ftiVar2);
        }
    }

    @Override // androidx.recyclerview.widget.jp0y
    public boolean a9(RecyclerView.fti ftiVar, RecyclerView.fti ftiVar2, int i2, int i3, int i4, int i5) {
        if (ftiVar == ftiVar2) {
            return fti(ftiVar, i2, i3, i4, i5);
        }
        float translationX = ftiVar.itemView.getTranslationX();
        float translationY = ftiVar.itemView.getTranslationY();
        float alpha = ftiVar.itemView.getAlpha();
        m26520b(ftiVar);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        ftiVar.itemView.setTranslationX(translationX);
        ftiVar.itemView.setTranslationY(translationY);
        ftiVar.itemView.setAlpha(alpha);
        if (ftiVar2 != null) {
            m26520b(ftiVar2);
            ftiVar2.itemView.setTranslationX(-i6);
            ftiVar2.itemView.setTranslationY(-i7);
            ftiVar2.itemView.setAlpha(0.0f);
        }
        this.f90040ki.add(new s(ftiVar, ftiVar2, i2, i3, i4, i5));
        return true;
    }

    /* JADX INFO: renamed from: b */
    void m26520b(RecyclerView.fti ftiVar) {
        if (f90034mcp == null) {
            f90034mcp = new ValueAnimator().getInterpolator();
        }
        ftiVar.itemView.animate().setInterpolator(f90034mcp);
        ld6(ftiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public boolean cdj() {
        return (this.f41540h.isEmpty() && this.f90040ki.isEmpty() && this.f90037cdj.isEmpty() && this.f90041kja0.isEmpty() && this.f90042ni7.isEmpty() && this.f90039fu4.isEmpty() && this.f90044zurt.isEmpty() && this.f41542z.isEmpty() && this.f41541i.isEmpty() && this.f90043t8r.isEmpty() && this.f90038fn3e.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    void mo26521e(RecyclerView.fti ftiVar) {
        View view = ftiVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f90044zurt.add(ftiVar);
        viewPropertyAnimatorAnimate.setInterpolator(f90033jk);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(qrj()).setListener(new n(ftiVar, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public boolean f7l8(@lvui RecyclerView.fti ftiVar, @lvui List<Object> list) {
        return !list.isEmpty() || super.f7l8(ftiVar, list);
    }

    @Override // androidx.recyclerview.widget.jp0y
    public boolean fti(RecyclerView.fti ftiVar, int i2, int i3, int i4, int i5) {
        View view = ftiVar.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) ftiVar.itemView.getTranslationY());
        m26520b(ftiVar);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            d2ok(ftiVar);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f90037cdj.add(new p(ftiVar, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public void fu4() {
        boolean z2 = !this.f90041kja0.isEmpty();
        boolean z3 = !this.f90037cdj.isEmpty();
        boolean z5 = !this.f90040ki.isEmpty();
        boolean z6 = !this.f41540h.isEmpty();
        if (z2 || z3 || z6 || z5) {
            Iterator<RecyclerView.fti> it = this.f90041kja0.iterator();
            while (it.hasNext()) {
                mo26522j(it.next());
            }
            this.f90041kja0.clear();
            long j2 = f41539t;
            if (z3) {
                ArrayList<p> arrayList = new ArrayList<>();
                arrayList.addAll(this.f90037cdj);
                this.f41541i.add(arrayList);
                this.f90037cdj.clear();
                k kVar = new k(arrayList);
                if (z2) {
                    C0683f.jbh(arrayList.get(0).f41559k.itemView, kVar, f41539t);
                } else {
                    kVar.run();
                }
            }
            if (z5) {
                ArrayList<s> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f90040ki);
                this.f90038fn3e.add(arrayList2);
                this.f90040ki.clear();
                toq toqVar = new toq(arrayList2);
                if (z2) {
                    C0683f.jbh(arrayList2.get(0).f41567k.itemView, toqVar, f41539t);
                } else {
                    toqVar.run();
                }
            }
            if (z6) {
                ArrayList<RecyclerView.fti> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f41540h);
                this.f90043t8r.add(arrayList3);
                this.f41540h.clear();
                zy zyVar = new zy(arrayList3);
                if (!z2 && !z3 && !z5) {
                    zyVar.run();
                    return;
                }
                if (!z2) {
                    j2 = 0;
                }
                C0683f.jbh(arrayList3.get(0).itemView, zyVar, j2 + ((z3 || z5) ? f90036wvg : 0L));
            }
        }
    }

    void hb(RecyclerView.fti ftiVar, int i2, int i3, int i4, int i5) {
        View view = ftiVar.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f90042ni7.add(ftiVar);
        viewPropertyAnimatorAnimate.setInterpolator(f90033jk);
        viewPropertyAnimatorAnimate.setDuration(kja0()).setListener(new g(ftiVar, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: j */
    void mo26522j(RecyclerView.fti ftiVar) {
        View view = ftiVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f90039fu4.add(ftiVar);
        viewPropertyAnimatorAnimate.setInterpolator(f90033jk);
        viewPropertyAnimatorAnimate.setDuration(m4845h()).alpha(0.0f).setListener(new q(ftiVar, viewPropertyAnimatorAnimate, view)).start();
    }

    @Override // androidx.recyclerview.widget.jp0y
    public boolean jk(RecyclerView.fti ftiVar) {
        m26520b(ftiVar);
        ftiVar.itemView.setAlpha(0.0f);
        this.f41540h.add(ftiVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.jp0y
    public boolean jp0y(RecyclerView.fti ftiVar) {
        m26520b(ftiVar);
        this.f90041kja0.add(ftiVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public void ld6(RecyclerView.fti ftiVar) {
        View view = ftiVar.itemView;
        view.animate().cancel();
        int size = this.f90037cdj.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f90037cdj.get(size).f41559k == ftiVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                d2ok(ftiVar);
                this.f90037cdj.remove(size);
            }
        }
        ek5k(this.f90040ki, ftiVar);
        if (this.f90041kja0.remove(ftiVar)) {
            view.setAlpha(1.0f);
            m4992r(ftiVar);
        }
        if (this.f41540h.remove(ftiVar)) {
            view.setAlpha(1.0f);
            gvn7(ftiVar);
        }
        for (int size2 = this.f90038fn3e.size() - 1; size2 >= 0; size2--) {
            ArrayList<s> arrayList = this.f90038fn3e.get(size2);
            ek5k(arrayList, ftiVar);
            if (arrayList.isEmpty()) {
                this.f90038fn3e.remove(size2);
            }
        }
        for (int size3 = this.f41541i.size() - 1; size3 >= 0; size3--) {
            ArrayList<p> arrayList2 = this.f41541i.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f41559k == ftiVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d2ok(ftiVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f41541i.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f90043t8r.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.fti> arrayList3 = this.f90043t8r.get(size5);
            if (arrayList3.remove(ftiVar)) {
                view.setAlpha(1.0f);
                gvn7(ftiVar);
                if (arrayList3.isEmpty()) {
                    this.f90043t8r.remove(size5);
                }
            }
        }
        this.f90039fu4.remove(ftiVar);
        this.f90044zurt.remove(ftiVar);
        this.f41542z.remove(ftiVar);
        this.f90042ni7.remove(ftiVar);
        m26523m();
    }

    /* JADX INFO: renamed from: m */
    void m26523m() {
        if (cdj()) {
            return;
        }
        m4848p();
    }

    void nn86(s sVar) {
        RecyclerView.fti ftiVar = sVar.f41567k;
        View view = ftiVar == null ? null : ftiVar.itemView;
        RecyclerView.fti ftiVar2 = sVar.f90047toq;
        View view2 = ftiVar2 != null ? ftiVar2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n7h());
            this.f41542z.add(sVar.f41567k);
            duration.setInterpolator(f90033jk);
            duration.translationX(sVar.f41568n - sVar.f90048zy);
            duration.translationY(sVar.f41566g - sVar.f41569q);
            duration.alpha(0.0f).setListener(new f7l8(sVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f41542z.add(sVar.f90047toq);
            viewPropertyAnimatorAnimate.setInterpolator(f90033jk);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(n7h()).alpha(1.0f).setListener(new y(sVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* JADX INFO: renamed from: o */
    void m26524o(List<RecyclerView.fti> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public void x2() {
        int size = this.f90037cdj.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            p pVar = this.f90037cdj.get(size);
            View view = pVar.f41559k.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            d2ok(pVar.f41559k);
            this.f90037cdj.remove(size);
        }
        for (int size2 = this.f90041kja0.size() - 1; size2 >= 0; size2--) {
            m4992r(this.f90041kja0.get(size2));
            this.f90041kja0.remove(size2);
        }
        int size3 = this.f41540h.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.fti ftiVar = this.f41540h.get(size3);
            ftiVar.itemView.setAlpha(1.0f);
            gvn7(ftiVar);
            this.f41540h.remove(size3);
        }
        for (int size4 = this.f90040ki.size() - 1; size4 >= 0; size4--) {
            yz(this.f90040ki.get(size4));
        }
        this.f90040ki.clear();
        if (cdj()) {
            for (int size5 = this.f41541i.size() - 1; size5 >= 0; size5--) {
                ArrayList<p> arrayList = this.f41541i.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    p pVar2 = arrayList.get(size6);
                    View view2 = pVar2.f41559k.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    d2ok(pVar2.f41559k);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f41541i.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f90043t8r.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.fti> arrayList2 = this.f90043t8r.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.fti ftiVar2 = arrayList2.get(size8);
                    ftiVar2.itemView.setAlpha(1.0f);
                    gvn7(ftiVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f90043t8r.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f90038fn3e.size() - 1; size9 >= 0; size9--) {
                ArrayList<s> arrayList3 = this.f90038fn3e.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    yz(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f90038fn3e.remove(arrayList3);
                    }
                }
            }
            m26524o(this.f90039fu4);
            m26524o(this.f90042ni7);
            m26524o(this.f90044zurt);
            m26524o(this.f41542z);
            m4848p();
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.k$s */
    /* JADX INFO: compiled from: MiuiDefaultItemAnimator.java */
    private static class s {

        /* JADX INFO: renamed from: g */
        public int f41566g;

        /* JADX INFO: renamed from: k */
        public RecyclerView.fti f41567k;

        /* JADX INFO: renamed from: n */
        public int f41568n;

        /* JADX INFO: renamed from: q */
        public int f41569q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public RecyclerView.fti f90047toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f90048zy;

        private s(RecyclerView.fti ftiVar, RecyclerView.fti ftiVar2) {
            this.f41567k = ftiVar;
            this.f90047toq = ftiVar2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f41567k + ", newHolder=" + this.f90047toq + ", fromX=" + this.f90048zy + ", fromY=" + this.f41569q + ", toX=" + this.f41568n + ", toY=" + this.f41566g + '}';
        }

        s(RecyclerView.fti ftiVar, RecyclerView.fti ftiVar2, int i2, int i3, int i4, int i5) {
            this(ftiVar, ftiVar2);
            this.f90048zy = i2;
            this.f41569q = i3;
            this.f41568n = i4;
            this.f41566g = i5;
        }
    }
}
