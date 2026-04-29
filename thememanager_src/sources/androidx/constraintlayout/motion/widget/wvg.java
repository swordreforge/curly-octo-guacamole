package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.o1t;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f7l8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewTransitionController.java */
/* JADX INFO: loaded from: classes.dex */
public class wvg {

    /* JADX INFO: renamed from: k */
    private final MotionLayout f2432k;

    /* JADX INFO: renamed from: n */
    ArrayList<o1t.toq> f2433n;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private HashSet<View> f48332zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ArrayList<o1t> f48331toq = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    private String f2434q = "ViewTransitionController";

    /* JADX INFO: renamed from: g */
    ArrayList<o1t.toq> f2431g = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.wvg$k */
    /* JADX INFO: compiled from: ViewTransitionController.java */
    class C0381k implements f7l8.InterfaceC0393k {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f2435g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ o1t f2436k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f2437n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f2438q;

        C0381k(final o1t val$viewTransition, final int val$listen_for_id, final boolean val$isSet, final int val$listen_for_value) {
            this.f2436k = val$viewTransition;
            this.f2438q = val$listen_for_id;
            this.f2437n = val$isSet;
            this.f2435g = val$listen_for_value;
        }

        @Override // androidx.constraintlayout.widget.f7l8.InterfaceC0393k
        /* JADX INFO: renamed from: k */
        public void mo1565k(int id, int value, int oldValue) {
            int iM1496y = this.f2436k.m1496y();
            this.f2436k.ki(value);
            if (this.f2438q != id || iM1496y == value) {
                return;
            }
            if (this.f2437n) {
                if (this.f2435g == value) {
                    int childCount = wvg.this.f2432k.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = wvg.this.f2432k.getChildAt(i2);
                        if (this.f2436k.qrj(childAt)) {
                            int currentState = wvg.this.f2432k.getCurrentState();
                            C0397q c0397qV0af = wvg.this.f2432k.v0af(currentState);
                            o1t o1tVar = this.f2436k;
                            wvg wvgVar = wvg.this;
                            o1tVar.zy(wvgVar, wvgVar.f2432k, currentState, c0397qV0af, childAt);
                        }
                    }
                    return;
                }
                return;
            }
            if (this.f2435g != value) {
                int childCount2 = wvg.this.f2432k.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt2 = wvg.this.f2432k.getChildAt(i3);
                    if (this.f2436k.qrj(childAt2)) {
                        int currentState2 = wvg.this.f2432k.getCurrentState();
                        C0397q c0397qV0af2 = wvg.this.f2432k.v0af(currentState2);
                        o1t o1tVar2 = this.f2436k;
                        wvg wvgVar2 = wvg.this;
                        o1tVar2.zy(wvgVar2, wvgVar2.f2432k, currentState2, c0397qV0af2, childAt2);
                    }
                }
            }
        }
    }

    public wvg(MotionLayout layout) {
        this.f2432k = layout;
    }

    private void n7h(o1t vt, View... view) {
        int currentState = this.f2432k.getCurrentState();
        if (vt.f2337g == 2) {
            vt.zy(this, this.f2432k, currentState, null, view);
            return;
        }
        if (currentState != -1) {
            C0397q c0397qV0af = this.f2432k.v0af(currentState);
            if (c0397qV0af == null) {
                return;
            }
            vt.zy(this, this.f2432k, currentState, c0397qV0af, view);
            return;
        }
        Log.w(this.f2434q, "No support for ViewTransition within transition yet. Currently: " + this.f2432k.toString());
    }

    /* JADX INFO: renamed from: s */
    private void m1559s(o1t viewTransition, boolean isSet) {
        ConstraintLayout.getSharedValues().m1632k(viewTransition.m1495s(), new C0381k(viewTransition, viewTransition.m1495s(), isSet, viewTransition.f7l8()));
    }

    void f7l8() {
        this.f2432k.invalidate();
    }

    /* JADX INFO: renamed from: g */
    void m1560g(int id, boolean enable) {
        for (o1t o1tVar : this.f48331toq) {
            if (o1tVar.m1492n() == id) {
                o1tVar.kja0(enable);
                return;
            }
        }
    }

    void ld6(o1t.toq animation) {
        this.f2431g.add(animation);
    }

    /* JADX INFO: renamed from: n */
    boolean m1561n(int viewTransitionId, kja0 motionController) {
        for (o1t o1tVar : this.f48331toq) {
            if (o1tVar.m1492n() == viewTransitionId) {
                o1tVar.f48190f7l8.m1514k(motionController);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    void m1562p(int id) {
        o1t next;
        Iterator<o1t> it = this.f48331toq.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.m1492n() == id) {
                    break;
                }
            }
        }
        if (next != null) {
            this.f48332zy = null;
            this.f48331toq.remove(next);
        }
    }

    /* JADX INFO: renamed from: q */
    void m1563q() {
        ArrayList<o1t.toq> arrayList = this.f2433n;
        if (arrayList == null) {
            return;
        }
        Iterator<o1t.toq> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m1497k();
        }
        this.f2433n.removeAll(this.f2431g);
        this.f2431g.clear();
        if (this.f2433n.isEmpty()) {
            this.f2433n = null;
        }
    }

    void qrj(int id, View... views) {
        ArrayList arrayList = new ArrayList();
        o1t o1tVar = null;
        for (o1t o1tVar2 : this.f48331toq) {
            if (o1tVar2.m1492n() == id) {
                for (View view : views) {
                    if (o1tVar2.m1494q(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    n7h(o1tVar2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                o1tVar = o1tVar2;
            }
        }
        if (o1tVar == null) {
            Log.e(this.f2434q, " Could not find ViewTransition");
        }
    }

    public void toq(o1t viewTransition) {
        this.f48331toq.add(viewTransition);
        this.f48332zy = null;
        if (viewTransition.m1493p() == 4) {
            m1559s(viewTransition, true);
        } else if (viewTransition.m1493p() == 5) {
            m1559s(viewTransition, false);
        }
    }

    void x2(MotionEvent event) {
        o1t o1tVar;
        int currentState = this.f2432k.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f48332zy == null) {
            this.f48332zy = new HashSet<>();
            for (o1t o1tVar2 : this.f48331toq) {
                int childCount = this.f2432k.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.f2432k.getChildAt(i2);
                    if (o1tVar2.qrj(childAt)) {
                        childAt.getId();
                        this.f48332zy.add(childAt);
                    }
                }
            }
        }
        float x3 = event.getX();
        float y3 = event.getY();
        Rect rect = new Rect();
        int action = event.getAction();
        ArrayList<o1t.toq> arrayList = this.f2433n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<o1t.toq> it = this.f2433n.iterator();
            while (it.hasNext()) {
                it.next().m1499q(action, x3, y3);
            }
        }
        if (action == 0 || action == 1) {
            C0397q c0397qV0af = this.f2432k.v0af(currentState);
            Iterator<o1t> it2 = this.f48331toq.iterator();
            while (it2.hasNext()) {
                o1t next = it2.next();
                if (next.fn3e(action)) {
                    for (View view : this.f48332zy) {
                        if (next.qrj(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x3, (int) y3)) {
                                o1tVar = next;
                                next.zy(this, this.f2432k, currentState, c0397qV0af, view);
                            } else {
                                o1tVar = next;
                            }
                            next = o1tVar;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    boolean m1564y(int id) {
        for (o1t o1tVar : this.f48331toq) {
            if (o1tVar.m1492n() == id) {
                return o1tVar.ld6();
            }
        }
        return false;
    }

    void zy(o1t.toq animation) {
        if (this.f2433n == null) {
            this.f2433n = new ArrayList<>();
        }
        this.f2433n.add(animation);
    }
}
