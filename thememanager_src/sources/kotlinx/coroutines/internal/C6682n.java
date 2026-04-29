package kotlinx.coroutines.internal;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.n */
/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007*\u0001\b\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/n;", "Lkotlinx/coroutines/internal/ld6;", "Ljava/lang/Class;", "", InterfaceC1925p.qn, "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "k", "kotlinx/coroutines/internal/n$k", "toq", "Lkotlinx/coroutines/internal/n$k;", "cache", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
final class C6682n extends ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6682n f37228k = new C6682n();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final k f82022toq = new k();

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.n$k */
    /* JADX INFO: compiled from: ExceptionsConstructor.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001J(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0014¨\u0006\b"}, d2 = {"kotlinx/coroutines/internal/n$k", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "Ljava/lang/Class;", "type", "k", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k extends ClassValue<cyoe.x2<? super Throwable, ? extends Throwable>> {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public cyoe.x2<Throwable, Throwable> toq(@InterfaceC7395n Class<?> cls) {
            if (cls != null) {
                return n7h.toq(cls);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        }
    }

    private C6682n() {
    }

    @Override // kotlinx.coroutines.internal.ld6
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public cyoe.x2<Throwable, Throwable> mo24364k(@InterfaceC7396q Class<? extends Throwable> cls) {
        return (cyoe.x2) f82022toq.get(cls);
    }
}
