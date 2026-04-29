package miuix.appcompat.app.floatingactivity;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.appcompat.app.t8r;

/* JADX INFO: loaded from: classes3.dex */
public class SingleAppFloatingLifecycleObserver extends FloatingLifecycleObserver {

    /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.SingleAppFloatingLifecycleObserver$k */
    class C6917k extends TransitionListener {

        /* JADX INFO: renamed from: k */
        WeakReference<t8r> f38819k;

        C6917k(t8r t8rVar) {
            this.f38819k = new WeakReference<>(t8rVar);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            FloatingActivitySwitcher floatingActivitySwitcherCdj;
            View viewKi;
            super.onComplete(obj);
            t8r t8rVar = this.f38819k.get();
            if (t8rVar == null || t8rVar.isDestroyed() || (floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj()) == null || (viewKi = floatingActivitySwitcherCdj.ki()) == null) {
                return;
            }
            ((ViewGroup) t8rVar.getFloatingBrightPanel().getParent()).getOverlay().remove(viewKi);
        }
    }

    public SingleAppFloatingLifecycleObserver(t8r t8rVar) {
        super(t8rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m24906g(View view, t8r t8rVar) {
        View childAt = ((ViewGroup) view).getChildAt(0);
        if (childAt != null) {
            AnimConfig animConfigQrj = zy.qrj(0, null);
            animConfigQrj.addListeners(new C6917k(t8rVar));
            zy.m24996n(childAt, animConfigQrj);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m24907n(final t8r t8rVar) {
        FloatingActivitySwitcher floatingActivitySwitcherCdj;
        final View viewKi;
        if (toq.m24987g() || (floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj()) == null || (viewKi = floatingActivitySwitcherCdj.ki()) == null) {
            return;
        }
        viewKi.post(new Runnable() { // from class: miuix.appcompat.app.floatingactivity.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f38924k.m24906g(viewKi, t8rVar);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    private void m24908q(t8r t8rVar) {
        FloatingActivitySwitcher floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj();
        if (toq.m24993y(t8rVar) < 0 || t8rVar.isInFloatingWindowMode() || floatingActivitySwitcherCdj == null) {
            return;
        }
        floatingActivitySwitcherCdj.jk(t8rVar);
        toq.m24990p(t8rVar, false);
    }

    /* JADX INFO: renamed from: y */
    private void m24909y(t8r t8rVar) {
        ArrayList<t8r> arrayListM24887h;
        int iKja0;
        t8r t8rVar2;
        FloatingActivitySwitcher floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj();
        if (floatingActivitySwitcherCdj == null || (arrayListM24887h = floatingActivitySwitcherCdj.m24887h(t8rVar.getTaskId())) == null || (iKja0 = floatingActivitySwitcherCdj.kja0(t8rVar) + 1) >= arrayListM24887h.size() || (t8rVar2 = arrayListM24887h.get(iKja0)) == null || !t8rVar2.isFinishing()) {
            return;
        }
        m24907n(t8rVar);
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onCreate() {
        t8r t8rVarQrj;
        FloatingActivitySwitcher floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj();
        if (floatingActivitySwitcherCdj == null || (t8rVarQrj = floatingActivitySwitcherCdj.qrj(m24905k(), toq())) == null) {
            return;
        }
        if (floatingActivitySwitcherCdj.m24888i(t8rVarQrj) == null) {
            m24908q(t8rVarQrj);
            return;
        }
        if (!t8rVarQrj.isInFloatingWindowMode()) {
            floatingActivitySwitcherCdj.jk(t8rVarQrj);
            toq.m24990p(t8rVarQrj, false);
        } else {
            if (floatingActivitySwitcherCdj.m24890t(t8rVarQrj)) {
                return;
            }
            floatingActivitySwitcherCdj.jk(t8rVarQrj);
            toq.ld6(t8rVarQrj);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onDestroy() {
        FloatingActivitySwitcher floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj();
        if (floatingActivitySwitcherCdj != null) {
            floatingActivitySwitcherCdj.jp0y(m24905k(), toq());
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onResume() {
        t8r t8rVarQrj;
        FloatingActivitySwitcher floatingActivitySwitcherCdj = FloatingActivitySwitcher.cdj();
        if (floatingActivitySwitcherCdj == null || (t8rVarQrj = floatingActivitySwitcherCdj.qrj(m24905k(), toq())) == null || !t8rVarQrj.isInFloatingWindowMode()) {
            return;
        }
        if (floatingActivitySwitcherCdj.m24888i(t8rVarQrj) != null) {
            t8rVarQrj.hideFloatingDimBackground();
        }
        m24909y(t8rVarQrj);
    }
}
