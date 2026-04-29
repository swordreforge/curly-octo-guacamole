package kotlinx.coroutines;

import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import kotlinx.coroutines.uc;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/d2ok;", "S", "Lkotlinx/coroutines/uc;", "a98o", "Lkotlin/coroutines/f7l8$toq;", "overwritingElement", "Lkotlin/coroutines/f7l8;", "fu4", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC6533d
@yz
public interface d2ok<S> extends uc<S> {

    /* JADX INFO: renamed from: kotlinx.coroutines.d2ok$k */
    /* JADX INFO: compiled from: ThreadContextElement.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6534k {
        /* JADX INFO: renamed from: k */
        public static <S, R> R m23997k(@InterfaceC7396q d2ok<S> d2okVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
            return (R) uc.C6742k.m24634k(d2okVar, r2, interfaceC5979h);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static <S> kotlin.coroutines.f7l8 m23998q(@InterfaceC7396q d2ok<S> d2okVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return uc.C6742k.m24635q(d2okVar, f7l8Var);
        }

        @InterfaceC7395n
        public static <S, E extends f7l8.toq> E toq(@InterfaceC7396q d2ok<S> d2okVar, @InterfaceC7396q f7l8.zy<E> zyVar) {
            return (E) uc.C6742k.toq(d2okVar, zyVar);
        }

        @InterfaceC7396q
        public static <S> kotlin.coroutines.f7l8 zy(@InterfaceC7396q d2ok<S> d2okVar, @InterfaceC7396q f7l8.zy<?> zyVar) {
            return uc.C6742k.zy(d2okVar, zyVar);
        }
    }

    @InterfaceC7396q
    d2ok<S> a98o();

    @InterfaceC7396q
    kotlin.coroutines.f7l8 fu4(@InterfaceC7396q f7l8.toq toqVar);
}
