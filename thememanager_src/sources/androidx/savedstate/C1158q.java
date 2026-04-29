package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.kja0;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.oc;

/* JADX INFO: renamed from: androidx.savedstate.q */
/* JADX INFO: compiled from: SavedStateRegistryController.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/savedstate/q;", "", "Lkotlin/was;", "zy", "Landroid/os/Bundle;", "savedState", "q", "outBundle", "n", "Landroidx/savedstate/n;", "k", "Landroidx/savedstate/n;", "owner", "Landroidx/savedstate/zy;", "toq", "Landroidx/savedstate/zy;", "()Landroidx/savedstate/zy;", "savedStateRegistry", "", com.market.sdk.reflect.toq.f68929toq, "attached", C4991s.f28129n, "(Landroidx/savedstate/n;)V", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C1158q {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final k f6285q = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC1157n f6286k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final zy f52443toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f52444zy;

    /* JADX INFO: renamed from: androidx.savedstate.q$k */
    /* JADX INFO: compiled from: SavedStateRegistryController.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/savedstate/q$k;", "", "Landroidx/savedstate/n;", "owner", "Landroidx/savedstate/q;", "k", C4991s.f28129n, "()V", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @qrj
        /* JADX INFO: renamed from: k */
        public final C1158q m5236k(@InterfaceC7396q InterfaceC1157n owner) {
            d2ok.m23075h(owner, "owner");
            return new C1158q(owner, null);
        }
    }

    private C1158q(InterfaceC1157n interfaceC1157n) {
        this.f6286k = interfaceC1157n;
        this.f52443toq = new zy();
    }

    public /* synthetic */ C1158q(InterfaceC1157n interfaceC1157n, ni7 ni7Var) {
        this(interfaceC1157n);
    }

    @InterfaceC7396q
    @qrj
    /* JADX INFO: renamed from: k */
    public static final C1158q m5233k(@InterfaceC7396q InterfaceC1157n interfaceC1157n) {
        return f6285q.m5236k(interfaceC1157n);
    }

    @oc
    /* JADX INFO: renamed from: n */
    public final void m5234n(@InterfaceC7396q Bundle outBundle) {
        d2ok.m23075h(outBundle, "outBundle");
        this.f52443toq.m5242s(outBundle);
    }

    @oc
    /* JADX INFO: renamed from: q */
    public final void m5235q(@InterfaceC7395n Bundle bundle) {
        if (!this.f52444zy) {
            zy();
        }
        kja0 lifecycle = this.f6286k.getLifecycle();
        d2ok.kja0(lifecycle, "owner.lifecycle");
        if (!lifecycle.toq().isAtLeast(kja0.zy.STARTED)) {
            this.f52443toq.m5243y(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.toq()).toString());
    }

    @InterfaceC7396q
    public final zy toq() {
        return this.f52443toq;
    }

    @oc
    public final void zy() {
        kja0 lifecycle = this.f6286k.getLifecycle();
        d2ok.kja0(lifecycle, "owner.lifecycle");
        if (!(lifecycle.toq() == kja0.zy.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.mo4451k(new Recreator(this.f6286k));
        this.f52443toq.f7l8(lifecycle);
        this.f52444zy = true;
    }
}
