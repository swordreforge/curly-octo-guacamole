package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.selects.InterfaceC6725q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.j */
/* JADX INFO: compiled from: Deferred.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/j;", C0846k.zaso, "Lkotlinx/coroutines/gbni;", "hyr", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", AnimatedProperty.PROPERTY_NAME_H, "()Ljava/lang/Object;", "", "t", "Lkotlinx/coroutines/selects/q;", "g1", "()Lkotlinx/coroutines/selects/q;", "onAwait", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface InterfaceC6695j<T> extends gbni {

    /* JADX INFO: renamed from: kotlinx.coroutines.j$k */
    /* JADX INFO: compiled from: Deferred.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k {
        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: g */
        public static <T> gbni m24459g(@InterfaceC7396q InterfaceC6695j<? extends T> interfaceC6695j, @InterfaceC7396q gbni gbniVar) {
            return gbni.C6665k.m24295s(interfaceC6695j, gbniVar);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public static <T> kotlin.coroutines.f7l8 m24461n(@InterfaceC7396q InterfaceC6695j<? extends T> interfaceC6695j, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return gbni.C6665k.m24296y(interfaceC6695j, f7l8Var);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static <T> kotlin.coroutines.f7l8 m24462q(@InterfaceC7396q InterfaceC6695j<? extends T> interfaceC6695j, @InterfaceC7396q f7l8.zy<?> zyVar) {
            return gbni.C6665k.f7l8(interfaceC6695j, zyVar);
        }

        public static <T, R> R toq(@InterfaceC7396q InterfaceC6695j<? extends T> interfaceC6695j, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
            return (R) gbni.C6665k.m24294q(interfaceC6695j, r2, interfaceC5979h);
        }

        @InterfaceC7395n
        public static <T, E extends f7l8.toq> E zy(@InterfaceC7396q InterfaceC6695j<? extends T> interfaceC6695j, @InterfaceC7396q f7l8.zy<E> zyVar) {
            return (E) gbni.C6665k.m24293n(interfaceC6695j, zyVar);
        }
    }

    @InterfaceC7396q
    InterfaceC6725q<T> g1();

    @InterfaceC6533d
    /* JADX INFO: renamed from: h */
    T mo24457h();

    @InterfaceC7395n
    Object hyr(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q);

    @InterfaceC7395n
    @InterfaceC6533d
    /* JADX INFO: renamed from: t */
    Throwable m24458t();
}
