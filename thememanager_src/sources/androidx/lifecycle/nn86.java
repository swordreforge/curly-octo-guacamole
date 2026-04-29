package androidx.lifecycle;

import eqxt.AbstractC6008k;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a \u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/j;", "owner", "Leqxt/k;", "k", "Landroidx/lifecycle/lrht;", "VM", "Landroidx/lifecycle/e;", "toq", "(Landroidx/lifecycle/e;)Landroidx/lifecycle/lrht;", "lifecycle-viewmodel_release"}, m22787k = 2, mv = {1, 6, 0})
@InterfaceC6769y(name = "ViewModelProviderGetKt")
public final class nn86 {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final AbstractC6008k m4465k(@InterfaceC7396q InterfaceC0931j owner) {
        kotlin.jvm.internal.d2ok.m23075h(owner, "owner");
        if (!(owner instanceof n7h)) {
            return AbstractC6008k.k.f73818toq;
        }
        AbstractC6008k abstractC6008kLtg8 = ((n7h) owner).ltg8();
        kotlin.jvm.internal.d2ok.kja0(abstractC6008kLtg8, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        return abstractC6008kLtg8;
    }

    @zy.oc
    public static final /* synthetic */ <VM extends lrht> VM toq(C0924e c0924e) {
        kotlin.jvm.internal.d2ok.m23075h(c0924e, "<this>");
        kotlin.jvm.internal.d2ok.m23086z(4, "VM");
        return (VM) c0924e.m4420k(lrht.class);
    }
}
