package kotlinx.coroutines.debug.internal;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.List;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.d3;
import kotlin.nn86;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.q */
/* JADX INFO: compiled from: DebugCoroutineInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0014\u0010\nR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lkotlinx/coroutines/debug/internal/q;", "", "Lkotlin/coroutines/f7l8;", "k", "Lkotlin/coroutines/f7l8;", "()Lkotlin/coroutines/f7l8;", "context", "Lkotlin/coroutines/jvm/internal/n;", "toq", "Lkotlin/coroutines/jvm/internal/n;", "()Lkotlin/coroutines/jvm/internal/n;", "creationStackBottom", "", "zy", com.market.sdk.reflect.toq.f68928f7l8, C7704k.y.toq.f95579toq, "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", "q", "Ljava/util/List;", "()Ljava/util/List;", "creationStackTrace", "", "n", "Ljava/lang/String;", "f7l8", "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "lastObservedThread", "lastObservedFrame", AnimatedProperty.PROPERTY_NAME_Y, "lastObservedStackTrace", "Lkotlinx/coroutines/debug/internal/n;", "source", C4991s.f28129n, "(Lkotlinx/coroutines/debug/internal/n;Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@nn86
public final class C6545q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7395n
    private final InterfaceC6207n f81977f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private final Thread f36900g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 f36901k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final String f36902n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final List<StackTraceElement> f36903q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final InterfaceC6207n f81978toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final List<StackTraceElement> f36904y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f81979zy;

    public C6545q(@InterfaceC7396q C6543n c6543n, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        this.f36901k = f7l8Var;
        this.f81978toq = c6543n.m24018q();
        this.f81979zy = c6543n.f81975toq;
        this.f36903q = c6543n.m24016n();
        this.f36902n = c6543n.f7l8();
        this.f36900g = c6543n.f36898n;
        this.f81977f7l8 = c6543n.m24015g();
        this.f36904y = c6543n.m24020y();
    }

    @InterfaceC7396q
    public final String f7l8() {
        return this.f36902n;
    }

    /* JADX INFO: renamed from: g */
    public final long m24021g() {
        return this.f81979zy;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final kotlin.coroutines.f7l8 m24022k() {
        return this.f36901k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Thread m24023n() {
        return this.f36900g;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final InterfaceC6207n m24024q() {
        return this.f81977f7l8;
    }

    @InterfaceC7395n
    public final InterfaceC6207n toq() {
        return this.f81978toq;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "lastObservedStackTrace")
    /* JADX INFO: renamed from: y */
    public final List<StackTraceElement> m24025y() {
        return this.f36904y;
    }

    @InterfaceC7396q
    public final List<StackTraceElement> zy() {
        return this.f36903q;
    }
}
