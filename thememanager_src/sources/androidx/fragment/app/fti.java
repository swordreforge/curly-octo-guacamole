package androidx.fragment.app;

import androidx.lifecycle.C0924e;
import androidx.lifecycle.InterfaceC0931j;
import androidx.lifecycle.hb;
import androidx.lifecycle.lrht;
import androidx.lifecycle.vyq;
import cyoe.InterfaceC5981k;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.a98o;
import kotlin.reflect.InterfaceC6374q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/j;", "ownerProducer", "Landroidx/lifecycle/e$toq;", "factoryProducer", "Lkotlin/jk;", "n", "k", "Lkotlin/reflect/q;", "viewModelClass", "Landroidx/lifecycle/hb;", "storeProducer", "zy", "fragment-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class fti {

    /* JADX INFO: renamed from: androidx.fragment.app.fti$k */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/lifecycle/hb;", "invoke", "()Landroidx/lifecycle/hb;", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    public static final class C0876k extends AbstractC6308r implements InterfaceC5981k<hb> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0876k(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final hb invoke() {
            ActivityC0891q activityC0891qRequireActivity = this.$this_activityViewModels.requireActivity();
            kotlin.jvm.internal.d2ok.kja0(activityC0891qRequireActivity, "requireActivity()");
            hb viewModelStore = activityC0891qRequireActivity.getViewModelStore();
            kotlin.jvm.internal.d2ok.kja0(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.fti$n */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/lifecycle/hb;", "invoke", "()Landroidx/lifecycle/hb;", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    public static final class C0877n extends AbstractC6308r implements InterfaceC5981k<hb> {
        final /* synthetic */ InterfaceC5981k $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0877n(InterfaceC5981k interfaceC5981k) {
            super(0);
            this.$ownerProducer = interfaceC5981k;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final hb invoke() {
            hb viewModelStore = ((InterfaceC0931j) this.$ownerProducer.invoke()).getViewModelStore();
            kotlin.jvm.internal.d2ok.kja0(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.fti$q */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    public static final class C0878q extends AbstractC6308r implements InterfaceC5981k<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0878q(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/lifecycle/e$toq;", "invoke", "()Landroidx/lifecycle/e$toq;", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    public static final class toq extends AbstractC6308r implements InterfaceC5981k<C0924e.toq> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toq(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final C0924e.toq invoke() {
            ActivityC0891q activityC0891qRequireActivity = this.$this_activityViewModels.requireActivity();
            kotlin.jvm.internal.d2ok.kja0(activityC0891qRequireActivity, "requireActivity()");
            return activityC0891qRequireActivity.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Landroidx/lifecycle/e$toq;", "invoke", "()Landroidx/lifecycle/e$toq;", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    static final class zy extends AbstractC6308r implements InterfaceC5981k<C0924e.toq> {
        final /* synthetic */ Fragment $this_createViewModelLazy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(Fragment fragment) {
            super(0);
            this.$this_createViewModelLazy = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final C0924e.toq invoke() {
            return this.$this_createViewModelLazy.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ kotlin.jk m4271g(Fragment viewModels, InterfaceC5981k ownerProducer, InterfaceC5981k interfaceC5981k, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ownerProducer = new C0878q(viewModels);
        }
        if ((i2 & 2) != 0) {
            interfaceC5981k = null;
        }
        kotlin.jvm.internal.d2ok.m23075h(viewModels, "$this$viewModels");
        kotlin.jvm.internal.d2ok.m23075h(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.d2ok.m23086z(4, "VM");
        return zy(viewModels, a98o.m23050q(lrht.class), new C0877n(ownerProducer), interfaceC5981k);
    }

    @zy.oc
    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ <VM extends lrht> kotlin.jk<VM> m4272k(Fragment activityViewModels, InterfaceC5981k<? extends C0924e.toq> interfaceC5981k) {
        kotlin.jvm.internal.d2ok.m23075h(activityViewModels, "$this$activityViewModels");
        kotlin.jvm.internal.d2ok.m23086z(4, "VM");
        InterfaceC6374q interfaceC6374qM23050q = a98o.m23050q(lrht.class);
        C0876k c0876k = new C0876k(activityViewModels);
        if (interfaceC5981k == null) {
            interfaceC5981k = new toq(activityViewModels);
        }
        return zy(activityViewModels, interfaceC6374qM23050q, c0876k, interfaceC5981k);
    }

    @zy.oc
    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ <VM extends lrht> kotlin.jk<VM> m4273n(Fragment viewModels, InterfaceC5981k<? extends InterfaceC0931j> ownerProducer, InterfaceC5981k<? extends C0924e.toq> interfaceC5981k) {
        kotlin.jvm.internal.d2ok.m23075h(viewModels, "$this$viewModels");
        kotlin.jvm.internal.d2ok.m23075h(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.d2ok.m23086z(4, "VM");
        return zy(viewModels, a98o.m23050q(lrht.class), new C0877n(ownerProducer), interfaceC5981k);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ kotlin.jk m4274q(Fragment fragment, InterfaceC6374q interfaceC6374q, InterfaceC5981k interfaceC5981k, InterfaceC5981k interfaceC5981k2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            interfaceC5981k2 = null;
        }
        return zy(fragment, interfaceC6374q, interfaceC5981k, interfaceC5981k2);
    }

    public static /* synthetic */ kotlin.jk toq(Fragment activityViewModels, InterfaceC5981k interfaceC5981k, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5981k = null;
        }
        kotlin.jvm.internal.d2ok.m23075h(activityViewModels, "$this$activityViewModels");
        kotlin.jvm.internal.d2ok.m23086z(4, "VM");
        InterfaceC6374q interfaceC6374qM23050q = a98o.m23050q(lrht.class);
        C0876k c0876k = new C0876k(activityViewModels);
        if (interfaceC5981k == null) {
            interfaceC5981k = new toq(activityViewModels);
        }
        return zy(activityViewModels, interfaceC6374qM23050q, c0876k, interfaceC5981k);
    }

    @InterfaceC7396q
    @zy.oc
    public static final <VM extends lrht> kotlin.jk<VM> zy(@InterfaceC7396q Fragment createViewModelLazy, @InterfaceC7396q InterfaceC6374q<VM> viewModelClass, @InterfaceC7396q InterfaceC5981k<? extends hb> storeProducer, @InterfaceC7395n InterfaceC5981k<? extends C0924e.toq> interfaceC5981k) {
        kotlin.jvm.internal.d2ok.m23075h(createViewModelLazy, "$this$createViewModelLazy");
        kotlin.jvm.internal.d2ok.m23075h(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.d2ok.m23075h(storeProducer, "storeProducer");
        if (interfaceC5981k == null) {
            interfaceC5981k = new zy(createViewModelLazy);
        }
        return new vyq(viewModelClass, storeProducer, interfaceC5981k);
    }
}
