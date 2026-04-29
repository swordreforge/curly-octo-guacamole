package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.zy;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5981k;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6308r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/ncyb;", "Landroidx/savedstate/zy$zy;", "Landroid/os/Bundle;", "k", "Lkotlin/was;", "q", "", InterfaceC1925p.qn, "toq", "Landroidx/savedstate/zy;", "Landroidx/savedstate/zy;", "savedStateRegistry", "", com.market.sdk.reflect.toq.f68929toq, "restored", "zy", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/l;", "Lkotlin/jk;", "()Landroidx/lifecycle/l;", "viewModel", "Landroidx/lifecycle/j;", "viewModelStoreOwner", C4991s.f28129n, "(Landroidx/savedstate/zy;Landroidx/lifecycle/j;)V", "lifecycle-viewmodel-savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
public final class ncyb implements zy.InterfaceC7893zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final androidx.savedstate.zy f5112k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final kotlin.jk f5113q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f51594toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private Bundle f51595zy;

    /* JADX INFO: renamed from: androidx.lifecycle.ncyb$k */
    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/l;", "invoke", "()Landroidx/lifecycle/l;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C0941k extends AbstractC6308r implements InterfaceC5981k<C0936l> {
        final /* synthetic */ InterfaceC0931j $viewModelStoreOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0941k(InterfaceC0931j interfaceC0931j) {
            super(0);
            this.$viewModelStoreOwner = interfaceC0931j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final C0936l invoke() {
            return x9kr.m4485n(this.$viewModelStoreOwner);
        }
    }

    public ncyb(@InterfaceC7396q androidx.savedstate.zy savedStateRegistry, @InterfaceC7396q InterfaceC0931j viewModelStoreOwner) {
        kotlin.jvm.internal.d2ok.m23075h(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.d2ok.m23075h(viewModelStoreOwner, "viewModelStoreOwner");
        this.f5112k = savedStateRegistry;
        this.f5113q = kotlin.fti.m22825k(new C0941k(viewModelStoreOwner));
    }

    private final C0936l zy() {
        return (C0936l) this.f5113q.getValue();
    }

    @Override // androidx.savedstate.zy.InterfaceC7893zy
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public Bundle mo10k() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f51595zy;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, dd> entry : zy().n5r1().entrySet()) {
            String key = entry.getKey();
            Bundle bundleMo10k = entry.getValue().kja0().mo10k();
            if (!kotlin.jvm.internal.d2ok.f7l8(bundleMo10k, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleMo10k);
            }
        }
        this.f51594toq = false;
        return bundle;
    }

    /* JADX INFO: renamed from: q */
    public final void m4463q() {
        if (this.f51594toq) {
            return;
        }
        this.f51595zy = this.f5112k.toq("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f51594toq = true;
        zy();
    }

    @InterfaceC7395n
    public final Bundle toq(@InterfaceC7396q String key) {
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        m4463q();
        Bundle bundle = this.f51595zy;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f51595zy;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f51595zy;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f51595zy = null;
        }
        return bundle2;
    }
}
