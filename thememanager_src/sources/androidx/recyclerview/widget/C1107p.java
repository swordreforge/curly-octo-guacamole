package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C0683f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class C1107p extends jp0y {

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final boolean f52242o1t = false;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static TimeInterpolator f52243wvg;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private ArrayList<RecyclerView.fti> f52248kja0 = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    private ArrayList<RecyclerView.fti> f6021h = new ArrayList<>();

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private ArrayList<p> f52244cdj = new ArrayList<>();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private ArrayList<s> f52247ki = new ArrayList<>();

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.fti>> f52250t8r = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    ArrayList<ArrayList<p>> f6022i = new ArrayList<>();

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    ArrayList<ArrayList<s>> f52245fn3e = new ArrayList<>();

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    ArrayList<RecyclerView.fti> f52251zurt = new ArrayList<>();

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    ArrayList<RecyclerView.fti> f52249ni7 = new ArrayList<>();

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    ArrayList<RecyclerView.fti> f52246fu4 = new ArrayList<>();

    /* JADX INFO: renamed from: z */
    ArrayList<RecyclerView.fti> f6023z = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$f7l8 */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class f7l8 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ s f6025k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f6026n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f6027q;

        f7l8(s sVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6025k = sVar;
            this.f6027q = viewPropertyAnimator;
            this.f6026n = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6027q.setListener(null);
            this.f6026n.setAlpha(1.0f);
            this.f6026n.setTranslationX(0.0f);
            this.f6026n.setTranslationY(0.0f);
            C1107p.this.oc(this.f6025k.f6048k, true);
            C1107p.this.f6023z.remove(this.f6025k.f6048k);
            C1107p.this.m5096m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1107p.this.eqxt(this.f6025k.f6048k, true);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$g */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f6028g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecyclerView.fti f6029k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f6030n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f6031q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ViewPropertyAnimator f6033y;

        g(RecyclerView.fti ftiVar, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6029k = ftiVar;
            this.f6031q = i2;
            this.f6030n = view;
            this.f6028g = i3;
            this.f6033y = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f6031q != 0) {
                this.f6030n.setTranslationX(0.0f);
            }
            if (this.f6028g != 0) {
                this.f6030n.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6033y.setListener(null);
            C1107p.this.d2ok(this.f6029k);
            C1107p.this.f52249ni7.remove(this.f6029k);
            C1107p.this.m5096m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1107p.this.lvui(this.f6029k);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$k */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f6034k;

        k(ArrayList arrayList) {
            this.f6034k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (p pVar : this.f6034k) {
                C1107p.this.hb(pVar.f6040k, pVar.f52252toq, pVar.f52253zy, pVar.f6042q, pVar.f6041n);
            }
            this.f6034k.clear();
            C1107p.this.f6022i.remove(this.f6034k);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$n */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class n extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecyclerView.fti f6037k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ViewPropertyAnimator f6038n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f6039q;

        n(RecyclerView.fti ftiVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6037k = ftiVar;
            this.f6039q = view;
            this.f6038n = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6039q.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6038n.setListener(null);
            C1107p.this.gvn7(this.f6037k);
            C1107p.this.f52251zurt.remove(this.f6037k);
            C1107p.this.m5096m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1107p.this.d3(this.f6037k);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$p */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    private static class p {

        /* JADX INFO: renamed from: k */
        public RecyclerView.fti f6040k;

        /* JADX INFO: renamed from: n */
        public int f6041n;

        /* JADX INFO: renamed from: q */
        public int f6042q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f52252toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f52253zy;

        p(RecyclerView.fti ftiVar, int i2, int i3, int i4, int i5) {
            this.f6040k = ftiVar;
            this.f52252toq = i2;
            this.f52253zy = i3;
            this.f6042q = i4;
            this.f6041n = i5;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$q */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class q extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecyclerView.fti f6044k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f6045n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f6046q;

        q(RecyclerView.fti ftiVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6044k = ftiVar;
            this.f6046q = viewPropertyAnimator;
            this.f6045n = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6046q.setListener(null);
            this.f6045n.setAlpha(1.0f);
            C1107p.this.m4992r(this.f6044k);
            C1107p.this.f52246fu4.remove(this.f6044k);
            C1107p.this.m5096m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1107p.this.dd(this.f6044k);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$toq */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f6051k;

        toq(ArrayList arrayList) {
            this.f6051k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6051k.iterator();
            while (it.hasNext()) {
                C1107p.this.nn86((s) it.next());
            }
            this.f6051k.clear();
            C1107p.this.f52245fn3e.remove(this.f6051k);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$y */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class y extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ s f6054k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f6055n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f6056q;

        y(s sVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6054k = sVar;
            this.f6056q = viewPropertyAnimator;
            this.f6055n = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6056q.setListener(null);
            this.f6055n.setAlpha(1.0f);
            this.f6055n.setTranslationX(0.0f);
            this.f6055n.setTranslationY(0.0f);
            C1107p.this.oc(this.f6054k.f52254toq, false);
            C1107p.this.f6023z.remove(this.f6054k.f52254toq);
            C1107p.this.m5096m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1107p.this.eqxt(this.f6054k.f52254toq, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$zy */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f6057k;

        zy(ArrayList arrayList) {
            this.f6057k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6057k.iterator();
            while (it.hasNext()) {
                C1107p.this.m5095e((RecyclerView.fti) it.next());
            }
            this.f6057k.clear();
            C1107p.this.f52250t8r.remove(this.f6057k);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5093b(RecyclerView.fti ftiVar) {
        if (f52243wvg == null) {
            f52243wvg = new ValueAnimator().getInterpolator();
        }
        ftiVar.itemView.animate().setInterpolator(f52243wvg);
        ld6(ftiVar);
    }

    private void ek5k(List<s> list, RecyclerView.fti ftiVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            s sVar = list.get(size);
            if (y9n(sVar, ftiVar) && sVar.f6048k == null && sVar.f52254toq == null) {
                list.remove(sVar);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m5094j(RecyclerView.fti ftiVar) {
        View view = ftiVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f52246fu4.add(ftiVar);
        viewPropertyAnimatorAnimate.setDuration(m4845h()).alpha(0.0f).setListener(new q(ftiVar, viewPropertyAnimatorAnimate, view)).start();
    }

    private boolean y9n(s sVar, RecyclerView.fti ftiVar) {
        boolean z2 = false;
        if (sVar.f52254toq == ftiVar) {
            sVar.f52254toq = null;
        } else {
            if (sVar.f6048k != ftiVar) {
                return false;
            }
            sVar.f6048k = null;
            z2 = true;
        }
        ftiVar.itemView.setAlpha(1.0f);
        ftiVar.itemView.setTranslationX(0.0f);
        ftiVar.itemView.setTranslationY(0.0f);
        oc(ftiVar, z2);
        return true;
    }

    private void yz(s sVar) {
        RecyclerView.fti ftiVar = sVar.f6048k;
        if (ftiVar != null) {
            y9n(sVar, ftiVar);
        }
        RecyclerView.fti ftiVar2 = sVar.f52254toq;
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
        m5093b(ftiVar);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        ftiVar.itemView.setTranslationX(translationX);
        ftiVar.itemView.setTranslationY(translationY);
        ftiVar.itemView.setAlpha(alpha);
        if (ftiVar2 != null) {
            m5093b(ftiVar2);
            ftiVar2.itemView.setTranslationX(-i6);
            ftiVar2.itemView.setTranslationY(-i7);
            ftiVar2.itemView.setAlpha(0.0f);
        }
        this.f52247ki.add(new s(ftiVar, ftiVar2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public boolean cdj() {
        return (this.f6021h.isEmpty() && this.f52247ki.isEmpty() && this.f52244cdj.isEmpty() && this.f52248kja0.isEmpty() && this.f52249ni7.isEmpty() && this.f52246fu4.isEmpty() && this.f52251zurt.isEmpty() && this.f6023z.isEmpty() && this.f6022i.isEmpty() && this.f52250t8r.isEmpty() && this.f52245fn3e.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    void m5095e(RecyclerView.fti ftiVar) {
        View view = ftiVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f52251zurt.add(ftiVar);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(qrj()).setListener(new n(ftiVar, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public boolean f7l8(@zy.lvui RecyclerView.fti ftiVar, @zy.lvui List<Object> list) {
        return !list.isEmpty() || super.f7l8(ftiVar, list);
    }

    @Override // androidx.recyclerview.widget.jp0y
    public boolean fti(RecyclerView.fti ftiVar, int i2, int i3, int i4, int i5) {
        View view = ftiVar.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) ftiVar.itemView.getTranslationY());
        m5093b(ftiVar);
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
        this.f52244cdj.add(new p(ftiVar, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public void fu4() {
        boolean z2 = !this.f52248kja0.isEmpty();
        boolean z3 = !this.f52244cdj.isEmpty();
        boolean z5 = !this.f52247ki.isEmpty();
        boolean z6 = !this.f6021h.isEmpty();
        if (z2 || z3 || z6 || z5) {
            Iterator<RecyclerView.fti> it = this.f52248kja0.iterator();
            while (it.hasNext()) {
                m5094j(it.next());
            }
            this.f52248kja0.clear();
            if (z3) {
                ArrayList<p> arrayList = new ArrayList<>();
                arrayList.addAll(this.f52244cdj);
                this.f6022i.add(arrayList);
                this.f52244cdj.clear();
                k kVar = new k(arrayList);
                if (z2) {
                    C0683f.jbh(arrayList.get(0).f6040k.itemView, kVar, m4845h());
                } else {
                    kVar.run();
                }
            }
            if (z5) {
                ArrayList<s> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f52247ki);
                this.f52245fn3e.add(arrayList2);
                this.f52247ki.clear();
                toq toqVar = new toq(arrayList2);
                if (z2) {
                    C0683f.jbh(arrayList2.get(0).f6048k.itemView, toqVar, m4845h());
                } else {
                    toqVar.run();
                }
            }
            if (z6) {
                ArrayList<RecyclerView.fti> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f6021h);
                this.f52250t8r.add(arrayList3);
                this.f6021h.clear();
                zy zyVar = new zy(arrayList3);
                if (z2 || z3 || z5) {
                    C0683f.jbh(arrayList3.get(0).itemView, zyVar, (z2 ? m4845h() : 0L) + Math.max(z3 ? kja0() : 0L, z5 ? n7h() : 0L));
                } else {
                    zyVar.run();
                }
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
        this.f52249ni7.add(ftiVar);
        viewPropertyAnimatorAnimate.setDuration(kja0()).setListener(new g(ftiVar, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.jp0y
    public boolean jk(RecyclerView.fti ftiVar) {
        m5093b(ftiVar);
        ftiVar.itemView.setAlpha(0.0f);
        this.f6021h.add(ftiVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.jp0y
    public boolean jp0y(RecyclerView.fti ftiVar) {
        m5093b(ftiVar);
        this.f52248kja0.add(ftiVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public void ld6(RecyclerView.fti ftiVar) {
        View view = ftiVar.itemView;
        view.animate().cancel();
        int size = this.f52244cdj.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f52244cdj.get(size).f6040k == ftiVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                d2ok(ftiVar);
                this.f52244cdj.remove(size);
            }
        }
        ek5k(this.f52247ki, ftiVar);
        if (this.f52248kja0.remove(ftiVar)) {
            view.setAlpha(1.0f);
            m4992r(ftiVar);
        }
        if (this.f6021h.remove(ftiVar)) {
            view.setAlpha(1.0f);
            gvn7(ftiVar);
        }
        for (int size2 = this.f52245fn3e.size() - 1; size2 >= 0; size2--) {
            ArrayList<s> arrayList = this.f52245fn3e.get(size2);
            ek5k(arrayList, ftiVar);
            if (arrayList.isEmpty()) {
                this.f52245fn3e.remove(size2);
            }
        }
        for (int size3 = this.f6022i.size() - 1; size3 >= 0; size3--) {
            ArrayList<p> arrayList2 = this.f6022i.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f6040k == ftiVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d2ok(ftiVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f6022i.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f52250t8r.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.fti> arrayList3 = this.f52250t8r.get(size5);
            if (arrayList3.remove(ftiVar)) {
                view.setAlpha(1.0f);
                gvn7(ftiVar);
                if (arrayList3.isEmpty()) {
                    this.f52250t8r.remove(size5);
                }
            }
        }
        this.f52246fu4.remove(ftiVar);
        this.f52251zurt.remove(ftiVar);
        this.f6023z.remove(ftiVar);
        this.f52249ni7.remove(ftiVar);
        m5096m();
    }

    /* JADX INFO: renamed from: m */
    void m5096m() {
        if (cdj()) {
            return;
        }
        m4848p();
    }

    void nn86(s sVar) {
        RecyclerView.fti ftiVar = sVar.f6048k;
        View view = ftiVar == null ? null : ftiVar.itemView;
        RecyclerView.fti ftiVar2 = sVar.f52254toq;
        View view2 = ftiVar2 != null ? ftiVar2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n7h());
            this.f6023z.add(sVar.f6048k);
            duration.translationX(sVar.f6049n - sVar.f52255zy);
            duration.translationY(sVar.f6047g - sVar.f6050q);
            duration.alpha(0.0f).setListener(new f7l8(sVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f6023z.add(sVar.f52254toq);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(n7h()).alpha(1.0f).setListener(new y(sVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* JADX INFO: renamed from: o */
    void m5097o(List<RecyclerView.fti> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public void x2() {
        int size = this.f52244cdj.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            p pVar = this.f52244cdj.get(size);
            View view = pVar.f6040k.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            d2ok(pVar.f6040k);
            this.f52244cdj.remove(size);
        }
        for (int size2 = this.f52248kja0.size() - 1; size2 >= 0; size2--) {
            m4992r(this.f52248kja0.get(size2));
            this.f52248kja0.remove(size2);
        }
        int size3 = this.f6021h.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.fti ftiVar = this.f6021h.get(size3);
            ftiVar.itemView.setAlpha(1.0f);
            gvn7(ftiVar);
            this.f6021h.remove(size3);
        }
        for (int size4 = this.f52247ki.size() - 1; size4 >= 0; size4--) {
            yz(this.f52247ki.get(size4));
        }
        this.f52247ki.clear();
        if (cdj()) {
            for (int size5 = this.f6022i.size() - 1; size5 >= 0; size5--) {
                ArrayList<p> arrayList = this.f6022i.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    p pVar2 = arrayList.get(size6);
                    View view2 = pVar2.f6040k.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    d2ok(pVar2.f6040k);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f6022i.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f52250t8r.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.fti> arrayList2 = this.f52250t8r.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.fti ftiVar2 = arrayList2.get(size8);
                    ftiVar2.itemView.setAlpha(1.0f);
                    gvn7(ftiVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f52250t8r.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f52245fn3e.size() - 1; size9 >= 0; size9--) {
                ArrayList<s> arrayList3 = this.f52245fn3e.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    yz(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f52245fn3e.remove(arrayList3);
                    }
                }
            }
            m5097o(this.f52246fu4);
            m5097o(this.f52249ni7);
            m5097o(this.f52251zurt);
            m5097o(this.f6023z);
            m4848p();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$s */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    private static class s {

        /* JADX INFO: renamed from: g */
        public int f6047g;

        /* JADX INFO: renamed from: k */
        public RecyclerView.fti f6048k;

        /* JADX INFO: renamed from: n */
        public int f6049n;

        /* JADX INFO: renamed from: q */
        public int f6050q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public RecyclerView.fti f52254toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f52255zy;

        private s(RecyclerView.fti ftiVar, RecyclerView.fti ftiVar2) {
            this.f6048k = ftiVar;
            this.f52254toq = ftiVar2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f6048k + ", newHolder=" + this.f52254toq + ", fromX=" + this.f52255zy + ", fromY=" + this.f6050q + ", toX=" + this.f6049n + ", toY=" + this.f6047g + '}';
        }

        s(RecyclerView.fti ftiVar, RecyclerView.fti ftiVar2, int i2, int i3, int i4, int i5) {
            this(ftiVar, ftiVar2);
            this.f52255zy = i2;
            this.f6050q = i3;
            this.f6049n = i4;
            this.f6047g = i5;
        }
    }
}
