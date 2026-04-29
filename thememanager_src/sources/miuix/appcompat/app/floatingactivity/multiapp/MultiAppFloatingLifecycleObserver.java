package miuix.appcompat.app.floatingactivity.multiapp;

import android.view.View;
import android.view.ViewGroup;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver;
import miuix.appcompat.app.t8r;

/* JADX INFO: loaded from: classes3.dex */
public class MultiAppFloatingLifecycleObserver extends FloatingLifecycleObserver {

    /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingLifecycleObserver$k */
    class RunnableC6932k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ t8r f38908k;

        RunnableC6932k(t8r t8rVar) {
            this.f38908k = t8rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
            if (multiAppFloatingActivitySwitcherGvn7 != null) {
                if (multiAppFloatingActivitySwitcherGvn7.fti(MultiAppFloatingLifecycleObserver.this.toq()) > 1 || multiAppFloatingActivitySwitcherGvn7.oc(MultiAppFloatingLifecycleObserver.this.toq()) > 1) {
                    if (miuix.appcompat.app.floatingactivity.toq.m24987g()) {
                        t8r t8rVar = this.f38908k;
                        miuix.appcompat.app.floatingactivity.toq.m24990p(t8rVar, t8rVar.isInFloatingWindowMode());
                    } else if (this.f38908k.isInFloatingWindowMode()) {
                        this.f38908k.executeOpenEnterAnimation();
                        multiAppFloatingActivitySwitcherGvn7.vyq(MultiAppFloatingLifecycleObserver.this.toq(), MultiAppFloatingLifecycleObserver.this.m24905k());
                    }
                }
            }
        }
    }

    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f38910k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f38912q;

        /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingLifecycleObserver$toq$k */
        class C6933k extends TransitionListener {
            C6933k() {
            }

            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                ((ViewGroup) toq.this.f38912q.getParent()).getOverlay().remove(toq.this.f38910k);
                MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
                if (multiAppFloatingActivitySwitcherGvn7 != null) {
                    multiAppFloatingActivitySwitcherGvn7.m24975b(null);
                }
            }
        }

        toq(View view, View view2) {
            this.f38910k = view;
            this.f38912q = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt = ((ViewGroup) this.f38910k).getChildAt(0);
            AnimConfig animConfigQrj = miuix.appcompat.app.floatingactivity.zy.qrj(0, null);
            animConfigQrj.addListeners(new C6933k());
            miuix.appcompat.app.floatingactivity.zy.m24996n(childAt, animConfigQrj);
        }
    }

    public MultiAppFloatingLifecycleObserver(t8r t8rVar) {
        super(t8rVar);
    }

    /* JADX INFO: renamed from: s */
    private void m24984s(t8r t8rVar) {
        View viewD3;
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
        if (multiAppFloatingActivitySwitcherGvn7 == null || (viewD3 = multiAppFloatingActivitySwitcherGvn7.d3()) == null) {
            return;
        }
        viewD3.post(new toq(viewD3, t8rVar.getFloatingBrightPanel()));
    }

    /* JADX INFO: renamed from: y */
    private void m24985y(t8r t8rVar) {
        int iM24993y = miuix.appcompat.app.floatingactivity.toq.m24993y(t8rVar);
        boolean z2 = iM24993y >= 0 && !t8rVar.isInFloatingWindowMode();
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
        if (multiAppFloatingActivitySwitcherGvn7 != null) {
            if (!z2 || iM24993y != 0) {
                if (z2) {
                    multiAppFloatingActivitySwitcherGvn7.uv6(t8rVar.getTaskId(), t8rVar.getActivityIdentity());
                }
            } else {
                multiAppFloatingActivitySwitcherGvn7.uv6(t8rVar.getTaskId(), t8rVar.getActivityIdentity());
                if (miuix.appcompat.app.floatingactivity.toq.m24987g()) {
                    miuix.appcompat.app.floatingactivity.toq.m24990p(t8rVar, false);
                } else {
                    miuix.appcompat.app.floatingactivity.toq.toq(t8rVar);
                }
            }
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onCreate() {
        t8r t8rVarJk;
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
        if (multiAppFloatingActivitySwitcherGvn7 == null || (t8rVarJk = multiAppFloatingActivitySwitcherGvn7.jk(toq(), m24905k())) == null) {
            return;
        }
        multiAppFloatingActivitySwitcherGvn7.m24978o(toq(), m24905k(), new RunnableC6932k(t8rVarJk));
        m24985y(t8rVarJk);
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onDestroy() {
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
        if (multiAppFloatingActivitySwitcherGvn7 != null) {
            multiAppFloatingActivitySwitcherGvn7.fn3e(toq(), m24905k());
            multiAppFloatingActivitySwitcherGvn7.ek5k(toq(), m24905k());
            if (multiAppFloatingActivitySwitcherGvn7.fti(toq()) <= 0) {
                multiAppFloatingActivitySwitcherGvn7.m24975b(null);
            }
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onPause() {
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
        if (multiAppFloatingActivitySwitcherGvn7 != null) {
            multiAppFloatingActivitySwitcherGvn7.m24979x(toq(), m24905k(), false);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onResume() {
        t8r t8rVarJk;
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
        if (multiAppFloatingActivitySwitcherGvn7 == null || (t8rVarJk = multiAppFloatingActivitySwitcherGvn7.jk(toq(), m24905k())) == null) {
            return;
        }
        multiAppFloatingActivitySwitcherGvn7.m24979x(toq(), m24905k(), true);
        multiAppFloatingActivitySwitcherGvn7.ki(toq(), m24905k());
        if (!multiAppFloatingActivitySwitcherGvn7.ncyb(toq(), m24905k()) || miuix.appcompat.app.floatingactivity.toq.m24987g()) {
            return;
        }
        t8rVarJk.executeCloseEnterAnimation();
        m24984s(t8rVarJk);
    }
}
