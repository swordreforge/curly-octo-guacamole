package f1bi;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.market.sdk.reflect.C4991s;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlinx.coroutines.debug.internal.C6542k;
import kotlinx.coroutines.debug.internal.f7l8;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/* JADX INFO: compiled from: AgentPremain.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lf1bi/toq;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lkotlin/was;", "q", "toq", "", com.market.sdk.reflect.toq.f68929toq, "enableCreationStackTraces", C4991s.f28129n, "()V", "k", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@SuppressLint({C3678q.f65828lv5})
@IgnoreJRERequirement
public final class toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final toq f34683k = new toq();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f75147toq;

    /* JADX INFO: renamed from: f1bi.toq$k */
    /* JADX INFO: compiled from: AgentPremain.kt */
    @d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lf1bi/toq$k;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "k", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6026k implements ClassFileTransformer {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final C6026k f34684k = new C6026k();

        private C6026k() {
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public byte[] m22262k(@InterfaceC7396q ClassLoader classLoader, @InterfaceC7396q String str, @InterfaceC7395n Class<?> cls, @InterfaceC7396q ProtectionDomain protectionDomain, @InterfaceC7395n byte[] bArr) {
            if (!d2ok.f7l8(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            C6542k.f36894k.toq(true);
            return kotlin.io.toq.m23013h(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object objM28280constructorimpl;
        try {
            C6323o.k kVar = C6323o.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objM28280constructorimpl = C6323o.m28280constructorimpl(property == null ? null : Boolean.valueOf(Boolean.parseBoolean(property)));
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        Boolean bool = (Boolean) (C6323o.m28285isFailureimpl(objM28280constructorimpl) ? null : objM28280constructorimpl);
        f75147toq = bool == null ? f7l8.f36884k.fn3e() : bool.booleanValue();
    }

    private toq() {
    }

    @qrj
    /* JADX INFO: renamed from: q */
    public static final void m22261q(@InterfaceC7395n String str, @InterfaceC7396q Instrumentation instrumentation) {
        C6542k.f36894k.toq(true);
        instrumentation.addTransformer(C6026k.f34684k);
        f7l8 f7l8Var = f7l8.f36884k;
        f7l8Var.eqxt(f75147toq);
        f7l8Var.fu4();
        f34683k.toq();
    }

    private final void toq() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: f1bi.k
                /* JADX INFO: renamed from: k */
                public final void m22259k(Signal signal) {
                    toq.zy(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zy(Signal signal) {
        f7l8 f7l8Var = f7l8.f36884k;
        if (f7l8Var.o1t()) {
            f7l8Var.m24011g(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }
}
