package kotlinx.coroutines;

import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CompletableJob.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/mcp;", "Lkotlinx/coroutines/gbni;", "", "ld6", "", "exception", AnimatedProperty.PROPERTY_NAME_Y, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface mcp extends gbni {

    /* JADX INFO: renamed from: kotlinx.coroutines.mcp$k */
    /* JADX INFO: compiled from: CompletableJob.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6700k {
        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: g */
        public static gbni m24501g(@InterfaceC7396q mcp mcpVar, @InterfaceC7396q gbni gbniVar) {
            return gbni.C6665k.m24295s(mcpVar, gbniVar);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public static kotlin.coroutines.f7l8 m24503n(@InterfaceC7396q mcp mcpVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return gbni.C6665k.m24296y(mcpVar, f7l8Var);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static kotlin.coroutines.f7l8 m24504q(@InterfaceC7396q mcp mcpVar, @InterfaceC7396q f7l8.zy<?> zyVar) {
            return gbni.C6665k.f7l8(mcpVar, zyVar);
        }

        public static <R> R toq(@InterfaceC7396q mcp mcpVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
            return (R) gbni.C6665k.m24294q(mcpVar, r2, interfaceC5979h);
        }

        @InterfaceC7395n
        public static <E extends f7l8.toq> E zy(@InterfaceC7396q mcp mcpVar, @InterfaceC7396q f7l8.zy<E> zyVar) {
            return (E) gbni.C6665k.m24293n(mcpVar, zyVar);
        }
    }

    boolean ld6();

    /* JADX INFO: renamed from: y */
    boolean mo24311y(@InterfaceC7396q Throwable th);
}
