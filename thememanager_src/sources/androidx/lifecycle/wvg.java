package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.C0230k;
import androidx.arch.core.internal.C0233k;
import androidx.lifecycle.kja0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import zy.yz;

/* JADX INFO: compiled from: LifecycleRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class wvg extends kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f51596f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f5124g;

    /* JADX INFO: renamed from: n */
    private int f5125n;

    /* JADX INFO: renamed from: q */
    private final WeakReference<InterfaceC0954z> f5126q;

    /* JADX INFO: renamed from: s */
    private final boolean f5127s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C0233k<fu4, C0950k> f51597toq;

    /* JADX INFO: renamed from: y */
    private ArrayList<kja0.zy> f5128y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private kja0.zy f51598zy;

    /* JADX INFO: renamed from: androidx.lifecycle.wvg$k */
    /* JADX INFO: compiled from: LifecycleRegistry.java */
    static class C0950k {

        /* JADX INFO: renamed from: k */
        kja0.zy f5129k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        fn3e f51599toq;

        C0950k(fu4 fu4Var, kja0.zy zyVar) {
            this.f51599toq = Lifecycling.f7l8(fu4Var);
            this.f5129k = zyVar;
        }

        /* JADX INFO: renamed from: k */
        void m4482k(InterfaceC0954z interfaceC0954z, kja0.toq toqVar) {
            kja0.zy targetState = toqVar.getTargetState();
            this.f5129k = wvg.qrj(this.f5129k, targetState);
            this.f51599toq.gvn7(interfaceC0954z, toqVar);
            this.f5129k = targetState;
        }
    }

    public wvg(@zy.lvui InterfaceC0954z interfaceC0954z) {
        this(interfaceC0954z, true);
    }

    @SuppressLint({"RestrictedApi"})
    private void f7l8(String str) {
        if (!this.f5127s || C0230k.m762g().zy()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    @zy.lvui
    @yz
    /* JADX INFO: renamed from: g */
    public static wvg m4475g(@zy.lvui InterfaceC0954z interfaceC0954z) {
        return new wvg(interfaceC0954z, false);
    }

    /* JADX INFO: renamed from: h */
    private void m4476h(kja0.zy zyVar) {
        this.f5128y.add(zyVar);
    }

    private void ki() {
        InterfaceC0954z interfaceC0954z = this.f5126q.get();
        if (interfaceC0954z == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!ld6()) {
            this.f51596f7l8 = false;
            if (this.f51598zy.compareTo(this.f51597toq.m772k().getValue().f5129k) < 0) {
                m4478q(interfaceC0954z);
            }
            Map.Entry<fu4, C0950k> entryM773n = this.f51597toq.m773n();
            if (!this.f51596f7l8 && entryM773n != null && this.f51598zy.compareTo(entryM773n.getValue().f5129k) > 0) {
                m4479y(interfaceC0954z);
            }
        }
        this.f51596f7l8 = false;
    }

    private void kja0() {
        this.f5128y.remove(r0.size() - 1);
    }

    private boolean ld6() {
        if (this.f51597toq.size() == 0) {
            return true;
        }
        kja0.zy zyVar = this.f51597toq.m772k().getValue().f5129k;
        kja0.zy zyVar2 = this.f51597toq.m773n().getValue().f5129k;
        return zyVar == zyVar2 && this.f51598zy == zyVar2;
    }

    /* JADX INFO: renamed from: n */
    private kja0.zy m4477n(fu4 fu4Var) {
        Map.Entry<fu4, C0950k> entryM769s = this.f51597toq.m769s(fu4Var);
        kja0.zy zyVar = null;
        kja0.zy zyVar2 = entryM769s != null ? entryM769s.getValue().f5129k : null;
        if (!this.f5128y.isEmpty()) {
            zyVar = this.f5128y.get(r0.size() - 1);
        }
        return qrj(qrj(this.f51598zy, zyVar2), zyVar);
    }

    private void n7h(kja0.zy zyVar) {
        kja0.zy zyVar2 = this.f51598zy;
        if (zyVar2 == zyVar) {
            return;
        }
        if (zyVar2 == kja0.zy.INITIALIZED && zyVar == kja0.zy.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.f51598zy);
        }
        this.f51598zy = zyVar;
        if (this.f5124g || this.f5125n != 0) {
            this.f51596f7l8 = true;
            return;
        }
        this.f5124g = true;
        ki();
        this.f5124g = false;
        if (this.f51598zy == kja0.zy.DESTROYED) {
            this.f51597toq = new C0233k<>();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m4478q(InterfaceC0954z interfaceC0954z) {
        Iterator<Map.Entry<fu4, C0950k>> itDescendingIterator = this.f51597toq.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f51596f7l8) {
            Map.Entry<fu4, C0950k> next = itDescendingIterator.next();
            C0950k value = next.getValue();
            while (value.f5129k.compareTo(this.f51598zy) > 0 && !this.f51596f7l8 && this.f51597toq.contains(next.getKey())) {
                kja0.toq toqVarDownFrom = kja0.toq.downFrom(value.f5129k);
                if (toqVarDownFrom == null) {
                    throw new IllegalStateException("no event down from " + value.f5129k);
                }
                m4476h(toqVarDownFrom.getTargetState());
                value.m4482k(interfaceC0954z, toqVarDownFrom);
                kja0();
            }
        }
    }

    static kja0.zy qrj(@zy.lvui kja0.zy zyVar, @zy.dd kja0.zy zyVar2) {
        return (zyVar2 == null || zyVar2.compareTo(zyVar) >= 0) ? zyVar : zyVar2;
    }

    /* JADX INFO: renamed from: y */
    private void m4479y(InterfaceC0954z interfaceC0954z) {
        androidx.arch.core.internal.toq<fu4, C0950k>.C0237q c0237qZy = this.f51597toq.zy();
        while (c0237qZy.hasNext() && !this.f51596f7l8) {
            Map.Entry next = c0237qZy.next();
            C0950k c0950k = (C0950k) next.getValue();
            while (c0950k.f5129k.compareTo(this.f51598zy) < 0 && !this.f51596f7l8 && this.f51597toq.contains((fu4) next.getKey())) {
                m4476h(c0950k.f5129k);
                kja0.toq toqVarUpFrom = kja0.toq.upFrom(c0950k.f5129k);
                if (toqVarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + c0950k.f5129k);
                }
                c0950k.m4482k(interfaceC0954z, toqVarUpFrom);
                kja0();
            }
        }
    }

    @zy.oc
    public void cdj(@zy.lvui kja0.zy zyVar) {
        f7l8("setCurrentState");
        n7h(zyVar);
    }

    @Override // androidx.lifecycle.kja0
    /* JADX INFO: renamed from: k */
    public void mo4451k(@zy.lvui fu4 fu4Var) {
        InterfaceC0954z interfaceC0954z;
        f7l8("addObserver");
        kja0.zy zyVar = this.f51598zy;
        kja0.zy zyVar2 = kja0.zy.DESTROYED;
        if (zyVar != zyVar2) {
            zyVar2 = kja0.zy.INITIALIZED;
        }
        C0950k c0950k = new C0950k(fu4Var, zyVar2);
        if (this.f51597toq.f7l8(fu4Var, c0950k) == null && (interfaceC0954z = this.f5126q.get()) != null) {
            boolean z2 = this.f5125n != 0 || this.f5124g;
            kja0.zy zyVarM4477n = m4477n(fu4Var);
            this.f5125n++;
            while (c0950k.f5129k.compareTo(zyVarM4477n) < 0 && this.f51597toq.contains(fu4Var)) {
                m4476h(c0950k.f5129k);
                kja0.toq toqVarUpFrom = kja0.toq.upFrom(c0950k.f5129k);
                if (toqVarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + c0950k.f5129k);
                }
                c0950k.m4482k(interfaceC0954z, toqVarUpFrom);
                kja0();
                zyVarM4477n = m4477n(fu4Var);
            }
            if (!z2) {
                ki();
            }
            this.f5125n--;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m4480p(@zy.lvui kja0.toq toqVar) {
        f7l8("handleLifecycleEvent");
        n7h(toqVar.getTargetState());
    }

    /* JADX INFO: renamed from: s */
    public int m4481s() {
        f7l8("getObserverCount");
        return this.f51597toq.size();
    }

    @Override // androidx.lifecycle.kja0
    @zy.lvui
    public kja0.zy toq() {
        return this.f51598zy;
    }

    @Deprecated
    @zy.oc
    public void x2(@zy.lvui kja0.zy zyVar) {
        f7l8("markState");
        cdj(zyVar);
    }

    @Override // androidx.lifecycle.kja0
    public void zy(@zy.lvui fu4 fu4Var) {
        f7l8("removeObserver");
        this.f51597toq.mo770y(fu4Var);
    }

    private wvg(@zy.lvui InterfaceC0954z interfaceC0954z, boolean z2) {
        this.f51597toq = new C0233k<>();
        this.f5125n = 0;
        this.f5124g = false;
        this.f51596f7l8 = false;
        this.f5128y = new ArrayList<>();
        this.f5126q = new WeakReference<>(interfaceC0954z);
        this.f51598zy = kja0.zy.INITIALIZED;
        this.f5127s = z2;
    }
}
