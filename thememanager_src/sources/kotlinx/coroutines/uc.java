package kotlinx.coroutines;

import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/uc;", "S", "Lkotlin/coroutines/f7l8$toq;", "Lkotlin/coroutines/f7l8;", "context", "nsb", "(Lkotlin/coroutines/f7l8;)Ljava/lang/Object;", "oldState", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_X, "(Lkotlin/coroutines/f7l8;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface uc<S> extends f7l8.toq {

    /* JADX INFO: renamed from: kotlinx.coroutines.uc$k */
    /* JADX INFO: compiled from: ThreadContextElement.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6742k {
        /* JADX INFO: renamed from: k */
        public static <S, R> R m24634k(@InterfaceC7396q uc<S> ucVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
            return (R) f7l8.toq.C6196k.m22735k(ucVar, r2, interfaceC5979h);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static <S> kotlin.coroutines.f7l8 m24635q(@InterfaceC7396q uc<S> ucVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return f7l8.toq.C6196k.m22736q(ucVar, f7l8Var);
        }

        @InterfaceC7395n
        public static <S, E extends f7l8.toq> E toq(@InterfaceC7396q uc<S> ucVar, @InterfaceC7396q f7l8.zy<E> zyVar) {
            return (E) f7l8.toq.C6196k.toq(ucVar, zyVar);
        }

        @InterfaceC7396q
        public static <S> kotlin.coroutines.f7l8 zy(@InterfaceC7396q uc<S> ucVar, @InterfaceC7396q f7l8.zy<?> zyVar) {
            return f7l8.toq.C6196k.zy(ucVar, zyVar);
        }
    }

    S nsb(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var);

    /* JADX INFO: renamed from: x */
    void mo24416x(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, S s2);
}
