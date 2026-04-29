package androidx.lifecycle;

import android.os.Bundle;
import androidx.exifinterface.media.C0846k;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.kja0;
import androidx.savedstate.InterfaceC1157n;
import androidx.savedstate.zy;
import com.android.thememanager.controller.online.InterfaceC1925p;
import eqxt.AbstractC6008k;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.a98o;
import l05.InterfaceC6765n;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u001a\f\u0010\u000f\u001a\u00020\f*\u00020\u000eH\u0007\"\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0018\u0010\u001c\u001a\u00020\u001a*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b\"\u0018\u0010\u001f\u001a\u00020\u001d*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/savedstate/n;", "Landroidx/lifecycle/j;", C0846k.zaso, "Lkotlin/was;", "zy", "(Landroidx/savedstate/n;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", InterfaceC1925p.qn, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/dd;", "k", "Leqxt/k;", "toq", "Ljava/lang/String;", "VIEWMODEL_KEY", "SAVED_STATE_KEY", "Leqxt/k$toq;", "Leqxt/k$toq;", "SAVED_STATE_REGISTRY_OWNER_KEY", "q", "VIEW_MODEL_STORE_OWNER_KEY", "n", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/l;", "(Landroidx/lifecycle/j;)Landroidx/lifecycle/l;", "savedStateHandlesVM", "Landroidx/lifecycle/ncyb;", "(Landroidx/savedstate/n;)Landroidx/lifecycle/ncyb;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, m22787k = 2, mv = {1, 6, 0})
@InterfaceC6769y(name = "SavedStateHandleSupport")
public final class x9kr {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final String f5130k = "androidx.lifecycle.internal.SavedStateHandlesVM";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f51600toq = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final AbstractC6008k.toq<InterfaceC1157n> f51601zy = new toq();

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final AbstractC6008k.toq<InterfaceC0931j> f5132q = new zy();

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final AbstractC6008k.toq<Bundle> f5131n = new C0951k();

    /* JADX INFO: renamed from: androidx.lifecycle.x9kr$k */
    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/x9kr$k", "Leqxt/k$toq;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C0951k implements AbstractC6008k.toq<Bundle> {
        C0951k() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x9kr$q */
    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Leqxt/k;", "Landroidx/lifecycle/l;", "invoke", "(Leqxt/k;)Landroidx/lifecycle/l;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C0952q extends AbstractC6308r implements cyoe.x2<AbstractC6008k, C0936l> {
        public static final C0952q INSTANCE = new C0952q();

        C0952q() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final C0936l invoke(@InterfaceC7396q AbstractC6008k initializer) {
            kotlin.jvm.internal.d2ok.m23075h(initializer, "$this$initializer");
            return new C0936l();
        }
    }

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/x9kr$toq", "Leqxt/k$toq;", "Landroidx/savedstate/n;", "lifecycle-viewmodel-savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq implements AbstractC6008k.toq<InterfaceC1157n> {
        toq() {
        }
    }

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/x9kr$zy", "Leqxt/k$toq;", "Landroidx/lifecycle/j;", "lifecycle-viewmodel-savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy implements AbstractC6008k.toq<InterfaceC0931j> {
        zy() {
        }
    }

    /* JADX INFO: renamed from: k */
    private static final dd m4484k(InterfaceC1157n interfaceC1157n, InterfaceC0931j interfaceC0931j, String str, Bundle bundle) {
        ncyb ncybVarM4486q = m4486q(interfaceC1157n);
        C0936l c0936lM4485n = m4485n(interfaceC0931j);
        dd ddVar = c0936lM4485n.n5r1().get(str);
        if (ddVar != null) {
            return ddVar;
        }
        dd ddVarM4419k = dd.f5052g.m4419k(ncybVarM4486q.toq(str), bundle);
        c0936lM4485n.n5r1().put(str, ddVarM4419k);
        return ddVarM4419k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final C0936l m4485n(@InterfaceC7396q InterfaceC0931j interfaceC0931j) {
        kotlin.jvm.internal.d2ok.m23075h(interfaceC0931j, "<this>");
        eqxt.zy zyVar = new eqxt.zy();
        zyVar.m22256k(a98o.m23050q(C0936l.class), C0952q.INSTANCE);
        return (C0936l) new C0924e(interfaceC0931j, zyVar.toq()).toq(f5130k, C0936l.class);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final ncyb m4486q(@InterfaceC7396q InterfaceC1157n interfaceC1157n) {
        kotlin.jvm.internal.d2ok.m23075h(interfaceC1157n, "<this>");
        zy.InterfaceC7893zy interfaceC7893zyZy = interfaceC1157n.getSavedStateRegistry().zy(f51600toq);
        ncyb ncybVar = interfaceC7893zyZy instanceof ncyb ? (ncyb) interfaceC7893zyZy : null;
        if (ncybVar != null) {
            return ncybVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @InterfaceC7396q
    @zy.oc
    public static final dd toq(@InterfaceC7396q AbstractC6008k abstractC6008k) {
        kotlin.jvm.internal.d2ok.m23075h(abstractC6008k, "<this>");
        InterfaceC1157n interfaceC1157n = (InterfaceC1157n) abstractC6008k.mo22253k(f51601zy);
        if (interfaceC1157n == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0931j interfaceC0931j = (InterfaceC0931j) abstractC6008k.mo22253k(f5132q);
        if (interfaceC0931j == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC6008k.mo22253k(f5131n);
        String str = (String) abstractC6008k.mo22253k(C0924e.zy.f5066q);
        if (str != null) {
            return m4484k(interfaceC1157n, interfaceC0931j, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zy.oc
    public static final <T extends InterfaceC1157n & InterfaceC0931j> void zy(@InterfaceC7396q T t2) {
        kotlin.jvm.internal.d2ok.m23075h(t2, "<this>");
        kja0.zy qVar = t2.getLifecycle().toq();
        kotlin.jvm.internal.d2ok.kja0(qVar, "lifecycle.currentState");
        if (!(qVar == kja0.zy.INITIALIZED || qVar == kja0.zy.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t2.getSavedStateRegistry().zy(f51600toq) == null) {
            ncyb ncybVar = new ncyb(t2.getSavedStateRegistry(), t2);
            t2.getSavedStateRegistry().m5240p(f51600toq, ncybVar);
            t2.getLifecycle().mo4451k(new SavedStateHandleAttacher(ncybVar));
        }
    }
}
