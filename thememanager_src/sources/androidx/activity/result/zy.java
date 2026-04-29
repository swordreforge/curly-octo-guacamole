package androidx.activity.result;

import androidx.activity.result.contract.AbstractC0059k;
import cyoe.x2;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {com.market.sdk.reflect.toq.f28131g, "O", "Landroidx/activity/result/toq;", "Landroidx/activity/result/contract/k;", "contract", "input", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlin/Function1;", "Lkotlin/was;", "callback", "Landroidx/activity/result/g;", "k", "(Landroidx/activity/result/toq;Landroidx/activity/result/contract/k;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lcyoe/x2;)Landroidx/activity/result/g;", "toq", "(Landroidx/activity/result/toq;Landroidx/activity/result/contract/k;Ljava/lang/Object;Lcyoe/x2;)Landroidx/activity/result/g;", "activity-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class zy {

    /* JADX INFO: renamed from: androidx.activity.result.zy$k */
    /* JADX INFO: compiled from: ActivityResultCaller.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {com.market.sdk.reflect.toq.f28131g, "O", "kotlin.jvm.PlatformType", "it", "Lkotlin/was;", "k", "(Ljava/lang/Object;)V"}, m22787k = 3, mv = {1, 4, 1})
    static final class C0072k<O> implements InterfaceC0068k<O> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2 f134k;

        C0072k(x2 x2Var) {
            this.f134k = x2Var;
        }

        @Override // androidx.activity.result.InterfaceC0068k
        /* JADX INFO: renamed from: k */
        public final void mo79k(O o2) {
            this.f134k.invoke(o2);
        }
    }

    /* JADX INFO: compiled from: ActivityResultCaller.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {com.market.sdk.reflect.toq.f28131g, "O", "kotlin.jvm.PlatformType", "it", "Lkotlin/was;", "k", "(Ljava/lang/Object;)V"}, m22787k = 3, mv = {1, 4, 1})
    static final class toq<O> implements InterfaceC0068k<O> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2 f135k;

        toq(x2 x2Var) {
            this.f135k = x2Var;
        }

        @Override // androidx.activity.result.InterfaceC0068k
        /* JADX INFO: renamed from: k */
        public final void mo79k(O o2) {
            this.f135k.invoke(o2);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <I, O> AbstractC0067g<was> m86k(@InterfaceC7396q androidx.activity.result.toq registerForActivityResult, @InterfaceC7396q AbstractC0059k<I, O> contract, I i2, @InterfaceC7396q ActivityResultRegistry registry, @InterfaceC7396q x2<? super O, was> callback) {
        d2ok.m23075h(registerForActivityResult, "$this$registerForActivityResult");
        d2ok.m23075h(contract, "contract");
        d2ok.m23075h(registry, "registry");
        d2ok.m23075h(callback, "callback");
        AbstractC0067g<I> abstractC0067gRegisterForActivityResult = registerForActivityResult.registerForActivityResult(contract, registry, new C0072k(callback));
        d2ok.kja0(abstractC0067gRegisterForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new C0070q(abstractC0067gRegisterForActivityResult, contract, i2);
    }

    @InterfaceC7396q
    public static final <I, O> AbstractC0067g<was> toq(@InterfaceC7396q androidx.activity.result.toq registerForActivityResult, @InterfaceC7396q AbstractC0059k<I, O> contract, I i2, @InterfaceC7396q x2<? super O, was> callback) {
        d2ok.m23075h(registerForActivityResult, "$this$registerForActivityResult");
        d2ok.m23075h(contract, "contract");
        d2ok.m23075h(callback, "callback");
        AbstractC0067g<I> abstractC0067gRegisterForActivityResult = registerForActivityResult.registerForActivityResult(contract, new toq(callback));
        d2ok.kja0(abstractC0067gRegisterForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new C0070q(abstractC0067gRegisterForActivityResult, contract, i2);
    }
}
