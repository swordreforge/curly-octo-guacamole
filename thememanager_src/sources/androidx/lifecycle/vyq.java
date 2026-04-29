package androidx.lifecycle;

import androidx.lifecycle.C0924e;
import androidx.lifecycle.lrht;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5981k;
import eqxt.AbstractC6008k;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.reflect.InterfaceC6374q;
import l05.C6764k;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/vyq;", "Landroidx/lifecycle/lrht;", "VM", "Lkotlin/jk;", "", "isInitialized", "Lkotlin/reflect/q;", "k", "Lkotlin/reflect/q;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/hb;", "q", "Lcyoe/k;", "storeProducer", "Landroidx/lifecycle/e$toq;", "n", "factoryProducer", "Leqxt/k;", C7704k.y.toq.f95579toq, "extrasProducer", AnimatedProperty.PROPERTY_NAME_Y, "Landroidx/lifecycle/lrht;", "cached", "()Landroidx/lifecycle/lrht;", "value", C4991s.f28129n, "(Lkotlin/reflect/q;Lcyoe/k;Lcyoe/k;Lcyoe/k;)V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
public final class vyq<VM extends lrht> implements kotlin.jk<VM> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final InterfaceC5981k<AbstractC6008k> f5119g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC6374q<VM> f5120k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final InterfaceC5981k<C0924e.toq> f5121n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final InterfaceC5981k<hb> f5122q;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private VM f5123y;

    /* JADX INFO: renamed from: androidx.lifecycle.vyq$k */
    /* JADX INFO: compiled from: ViewModelLazy.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/lrht;", "VM", "Leqxt/k$k;", "invoke", "()Leqxt/k$k;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C0949k extends AbstractC6308r implements InterfaceC5981k<AbstractC6008k.k> {
        public static final C0949k INSTANCE = new C0949k();

        C0949k() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final AbstractC6008k.k invoke() {
            return AbstractC6008k.k.f73818toq;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public vyq(@InterfaceC7396q InterfaceC6374q<VM> viewModelClass, @InterfaceC7396q InterfaceC5981k<? extends hb> storeProducer, @InterfaceC7396q InterfaceC5981k<? extends C0924e.toq> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        kotlin.jvm.internal.d2ok.m23075h(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.d2ok.m23075h(storeProducer, "storeProducer");
        kotlin.jvm.internal.d2ok.m23075h(factoryProducer, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6768s
    public vyq(@InterfaceC7396q InterfaceC6374q<VM> viewModelClass, @InterfaceC7396q InterfaceC5981k<? extends hb> storeProducer, @InterfaceC7396q InterfaceC5981k<? extends C0924e.toq> factoryProducer, @InterfaceC7396q InterfaceC5981k<? extends AbstractC6008k> extrasProducer) {
        kotlin.jvm.internal.d2ok.m23075h(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.d2ok.m23075h(storeProducer, "storeProducer");
        kotlin.jvm.internal.d2ok.m23075h(factoryProducer, "factoryProducer");
        kotlin.jvm.internal.d2ok.m23075h(extrasProducer, "extrasProducer");
        this.f5120k = viewModelClass;
        this.f5122q = storeProducer;
        this.f5121n = factoryProducer;
        this.f5119g = extrasProducer;
    }

    @Override // kotlin.jk
    public boolean isInitialized() {
        return this.f5123y != null;
    }

    @Override // kotlin.jk
    @InterfaceC7396q
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.f5123y;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new C0924e(this.f5122q.invoke(), this.f5121n.invoke(), this.f5119g.invoke()).m4420k(C6764k.m24702n(this.f5120k));
        this.f5123y = vm2;
        return vm2;
    }

    public /* synthetic */ vyq(InterfaceC6374q interfaceC6374q, InterfaceC5981k interfaceC5981k, InterfaceC5981k interfaceC5981k2, InterfaceC5981k interfaceC5981k3, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(interfaceC6374q, interfaceC5981k, interfaceC5981k2, (i2 & 8) != 0 ? C0949k.INSTANCE : interfaceC5981k3);
    }
}
