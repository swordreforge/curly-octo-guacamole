package kotlinx.coroutines;

import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.z */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/z;", "Lkotlinx/coroutines/gbni;", "Lkotlinx/coroutines/zkd;", "parentJob", "Lkotlin/was;", "f", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@kotlin.ld6(level = kotlin.qrj.ERROR, message = "This is internal API and may be removed in the future releases")
@tfm
public interface InterfaceC6749z extends gbni {

    /* JADX INFO: renamed from: kotlinx.coroutines.z$k */
    /* JADX INFO: compiled from: Job.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k {
        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: g */
        public static gbni m24658g(@InterfaceC7396q InterfaceC6749z interfaceC6749z, @InterfaceC7396q gbni gbniVar) {
            return gbni.C6665k.m24295s(interfaceC6749z, gbniVar);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public static kotlin.coroutines.f7l8 m24660n(@InterfaceC7396q InterfaceC6749z interfaceC6749z, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return gbni.C6665k.m24296y(interfaceC6749z, f7l8Var);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static kotlin.coroutines.f7l8 m24661q(@InterfaceC7396q InterfaceC6749z interfaceC6749z, @InterfaceC7396q f7l8.zy<?> zyVar) {
            return gbni.C6665k.f7l8(interfaceC6749z, zyVar);
        }

        public static <R> R toq(@InterfaceC7396q InterfaceC6749z interfaceC6749z, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
            return (R) gbni.C6665k.m24294q(interfaceC6749z, r2, interfaceC5979h);
        }

        @InterfaceC7395n
        public static <E extends f7l8.toq> E zy(@InterfaceC7396q InterfaceC6749z interfaceC6749z, @InterfaceC7396q f7l8.zy<E> zyVar) {
            return (E) gbni.C6665k.m24293n(interfaceC6749z, zyVar);
        }
    }

    @tfm
    /* JADX INFO: renamed from: f */
    void mo24057f(@InterfaceC7396q zkd zkdVar);
}
