package androidx.activity;

import androidx.lifecycle.C0924e;
import androidx.lifecycle.hb;
import androidx.lifecycle.lrht;
import androidx.lifecycle.vyq;
import cyoe.InterfaceC5981k;
import kotlin.d3;
import kotlin.jk;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.a98o;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.oc;

/* JADX INFO: renamed from: androidx.activity.k */
/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/activity/ComponentActivity;", "Lkotlin/Function0;", "Landroidx/lifecycle/e$toq;", "factoryProducer", "Lkotlin/jk;", "k", "activity-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class C0050k {

    /* JADX INFO: renamed from: androidx.activity.k$k */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/lifecycle/hb;", "invoke", "()Landroidx/lifecycle/hb;", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    public static final class k extends AbstractC6308r implements InterfaceC5981k<hb> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final hb invoke() {
            hb viewModelStore = this.$this_viewModels.getViewModelStore();
            d2ok.kja0(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.k$toq */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/lifecycle/e$toq;", "invoke", "()Landroidx/lifecycle/e$toq;", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    public static final class toq extends AbstractC6308r implements InterfaceC5981k<C0924e.toq> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toq(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final C0924e.toq invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    @oc
    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ <VM extends lrht> jk<VM> m19k(ComponentActivity viewModels, InterfaceC5981k<? extends C0924e.toq> interfaceC5981k) {
        d2ok.m23075h(viewModels, "$this$viewModels");
        if (interfaceC5981k == null) {
            interfaceC5981k = new toq(viewModels);
        }
        d2ok.m23086z(4, "VM");
        return new vyq(a98o.m23050q(lrht.class), new k(viewModels), interfaceC5981k);
    }

    public static /* synthetic */ jk toq(ComponentActivity viewModels, InterfaceC5981k interfaceC5981k, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5981k = null;
        }
        d2ok.m23075h(viewModels, "$this$viewModels");
        if (interfaceC5981k == null) {
            interfaceC5981k = new toq(viewModels);
        }
        d2ok.m23086z(4, "VM");
        return new vyq(a98o.m23050q(lrht.class), new k(viewModels), interfaceC5981k);
    }
}
