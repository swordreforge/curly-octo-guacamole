package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import kotlinx.coroutines.InterfaceC6695j;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/o1t;", C0846k.zaso, "Lkotlinx/coroutines/j;", "value", "", "nmn5", "(Ljava/lang/Object;)Z", "", "exception", AnimatedProperty.PROPERTY_NAME_Y, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface o1t<T> extends InterfaceC6695j<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.o1t$k */
    /* JADX INFO: compiled from: CompletableDeferred.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6707k {
        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: g */
        public static <T> gbni m24514g(@InterfaceC7396q o1t<T> o1tVar, @InterfaceC7396q gbni gbniVar) {
            return InterfaceC6695j.k.m24459g(o1tVar, gbniVar);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public static <T> kotlin.coroutines.f7l8 m24516n(@InterfaceC7396q o1t<T> o1tVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return InterfaceC6695j.k.m24461n(o1tVar, f7l8Var);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static <T> kotlin.coroutines.f7l8 m24517q(@InterfaceC7396q o1t<T> o1tVar, @InterfaceC7396q f7l8.zy<?> zyVar) {
            return InterfaceC6695j.k.m24462q(o1tVar, zyVar);
        }

        public static <T, R> R toq(@InterfaceC7396q o1t<T> o1tVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
            return (R) InterfaceC6695j.k.toq(o1tVar, r2, interfaceC5979h);
        }

        @InterfaceC7395n
        public static <T, E extends f7l8.toq> E zy(@InterfaceC7396q o1t<T> o1tVar, @InterfaceC7396q f7l8.zy<E> zyVar) {
            return (E) InterfaceC6695j.k.zy(o1tVar, zyVar);
        }
    }

    boolean nmn5(T t2);

    /* JADX INFO: renamed from: y */
    boolean mo24513y(@InterfaceC7396q Throwable th);
}
