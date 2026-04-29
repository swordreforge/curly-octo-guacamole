package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.InterfaceC0931j;
import androidx.lifecycle.hb;
import androidx.lifecycle.kja0;
import androidx.lifecycle.n5r1;
import androidx.savedstate.C1158q;
import androidx.savedstate.InterfaceC1157n;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FragmentViewLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
class a9 implements androidx.lifecycle.n7h, InterfaceC1157n, InterfaceC0931j {

    /* JADX INFO: renamed from: k */
    private final Fragment f4754k;

    /* JADX INFO: renamed from: n */
    private C0924e.toq f4755n;

    /* JADX INFO: renamed from: q */
    private final hb f4756q;

    /* JADX INFO: renamed from: g */
    private androidx.lifecycle.wvg f4753g = null;

    /* JADX INFO: renamed from: y */
    private C1158q f4757y = null;

    a9(@lvui Fragment fragment, @lvui hb hbVar) {
        this.f4754k = fragment;
        this.f4756q = hbVar;
    }

    /* JADX INFO: renamed from: g */
    void m4233g(@lvui kja0.zy zyVar) {
        this.f4753g.cdj(zyVar);
    }

    @Override // androidx.lifecycle.n7h
    @lvui
    public C0924e.toq getDefaultViewModelProviderFactory() {
        C0924e.toq defaultViewModelProviderFactory = this.f4754k.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f4754k.mDefaultFactory)) {
            this.f4755n = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4755n == null) {
            Application application = null;
            Context applicationContext = this.f4754k.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f4755n = new n5r1(application, this, this.f4754k.getArguments());
        }
        return this.f4755n;
    }

    @Override // androidx.lifecycle.InterfaceC0954z
    @lvui
    public androidx.lifecycle.kja0 getLifecycle() {
        toq();
        return this.f4753g;
    }

    @Override // androidx.savedstate.InterfaceC1157n
    @lvui
    public androidx.savedstate.zy getSavedStateRegistry() {
        toq();
        return this.f4757y.toq();
    }

    @Override // androidx.lifecycle.InterfaceC0931j
    @lvui
    public hb getViewModelStore() {
        toq();
        return this.f4756q;
    }

    /* JADX INFO: renamed from: k */
    void m4234k(@lvui kja0.toq toqVar) {
        this.f4753g.m4480p(toqVar);
    }

    /* JADX INFO: renamed from: n */
    void m4235n(@lvui Bundle bundle) {
        this.f4757y.m5234n(bundle);
    }

    /* JADX INFO: renamed from: q */
    void m4236q(@dd Bundle bundle) {
        this.f4757y.m5235q(bundle);
    }

    void toq() {
        if (this.f4753g == null) {
            this.f4753g = new androidx.lifecycle.wvg(this);
            this.f4757y = C1158q.m5233k(this);
        }
    }

    boolean zy() {
        return this.f4753g != null;
    }
}
