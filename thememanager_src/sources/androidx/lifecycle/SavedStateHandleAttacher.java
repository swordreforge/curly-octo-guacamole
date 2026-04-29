package androidx.lifecycle;

import androidx.lifecycle.kja0;
import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/fn3e;", "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/kja0$toq;", "event", "Lkotlin/was;", "gvn7", "Landroidx/lifecycle/ncyb;", "k", "Landroidx/lifecycle/ncyb;", "provider", C4991s.f28129n, "(Landroidx/lifecycle/ncyb;)V", "lifecycle-viewmodel-savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
public final class SavedStateHandleAttacher implements fn3e {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ncyb f5035k;

    public SavedStateHandleAttacher(@InterfaceC7396q ncyb provider) {
        kotlin.jvm.internal.d2ok.m23075h(provider, "provider");
        this.f5035k = provider;
    }

    @Override // androidx.lifecycle.fn3e
    public void gvn7(@InterfaceC7396q InterfaceC0954z source, @InterfaceC7396q kja0.toq event) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(event, "event");
        if (event == kja0.toq.ON_CREATE) {
            source.getLifecycle().zy(this);
            this.f5035k.m4463q();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
