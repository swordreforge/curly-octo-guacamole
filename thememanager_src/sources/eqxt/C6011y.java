package eqxt;

import androidx.exifinterface.media.C0846k;
import androidx.lifecycle.lrht;
import com.market.sdk.reflect.C4991s;
import cyoe.x2;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: eqxt.y */
/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R+\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Leqxt/y;", "Landroidx/lifecycle/lrht;", C0846k.zaso, "", "Ljava/lang/Class;", "k", "Ljava/lang/Class;", "()Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "Leqxt/k;", "Lkotlin/fn3e;", "toq", "Lcyoe/x2;", "()Lcyoe/x2;", "initializer", C4991s.f28129n, "(Ljava/lang/Class;Lcyoe/x2;)V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C6011y<T extends lrht> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Class<T> f34401k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final x2<AbstractC6008k, T> f73820toq;

    /* JADX WARN: Multi-variable type inference failed */
    public C6011y(@InterfaceC7396q Class<T> clazz, @InterfaceC7396q x2<? super AbstractC6008k, ? extends T> initializer) {
        d2ok.m23075h(clazz, "clazz");
        d2ok.m23075h(initializer, "initializer");
        this.f34401k = clazz;
        this.f73820toq = initializer;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Class<T> m22255k() {
        return this.f34401k;
    }

    @InterfaceC7396q
    public final x2<AbstractC6008k, T> toq() {
        return this.f73820toq;
    }
}
