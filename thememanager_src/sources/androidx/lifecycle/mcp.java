package androidx.lifecycle;

import androidx.exifinterface.media.C0846k;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LiveData.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {C0846k.zaso, "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/z;", "owner", "Lkotlin/Function1;", "Lkotlin/was;", "onChanged", "Landroidx/lifecycle/jp0y;", "k", "lifecycle-livedata-core-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class mcp {

    /* JADX INFO: renamed from: androidx.lifecycle.mcp$k */
    /* JADX INFO: compiled from: LiveData.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.zaso, "kotlin.jvm.PlatformType", "t", "Lkotlin/was;", "toq", "(Ljava/lang/Object;)V"}, m22787k = 3, mv = {1, 4, 1})
    public static final class C0939k<T> implements jp0y<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f5102k;

        public C0939k(cyoe.x2 x2Var) {
            this.f5102k = x2Var;
        }

        @Override // androidx.lifecycle.jp0y
        public final void toq(T t2) {
            this.f5102k.invoke(t2);
        }
    }

    @InterfaceC7396q
    @kotlin.ld6(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @zy.oc
    /* JADX INFO: renamed from: k */
    public static final <T> jp0y<T> m4460k(@InterfaceC7396q LiveData<T> observe, @InterfaceC7396q InterfaceC0954z owner, @InterfaceC7396q cyoe.x2<? super T, was> onChanged) {
        kotlin.jvm.internal.d2ok.m23075h(observe, "$this$observe");
        kotlin.jvm.internal.d2ok.m23075h(owner, "owner");
        kotlin.jvm.internal.d2ok.m23075h(onChanged, "onChanged");
        C0939k c0939k = new C0939k(onChanged);
        observe.m4391p(owner, c0939k);
        return c0939k;
    }
}
