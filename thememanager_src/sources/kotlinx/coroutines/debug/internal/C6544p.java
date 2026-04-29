package kotlinx.coroutines.debug.internal;

import com.market.sdk.reflect.C4991s;
import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.d3;
import kotlin.nn86;
import kotlinx.coroutines.hyr;
import kotlinx.coroutines.n5r1;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.p */
/* JADX INFO: compiled from: DebuggerInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lkotlinx/coroutines/debug/internal/p;", "Ljava/io/Serializable;", "", "coroutineId", "Ljava/lang/Long;", "getCoroutineId", "()Ljava/lang/Long;", "", "dispatcher", "Ljava/lang/String;", "getDispatcher", "()Ljava/lang/String;", "name", "getName", "state", "getState", "lastObservedThreadState", "getLastObservedThreadState", "lastObservedThreadName", "getLastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "lastObservedStackTrace", "Ljava/util/List;", "getLastObservedStackTrace", "()Ljava/util/List;", "sequenceNumber", com.market.sdk.reflect.toq.f68928f7l8, "getSequenceNumber", "()J", "Lkotlinx/coroutines/debug/internal/n;", "source", "Lkotlin/coroutines/f7l8;", "context", C4991s.f28129n, "(Lkotlinx/coroutines/debug/internal/n;Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@nn86
public final class C6544p implements Serializable {

    @InterfaceC7395n
    private final Long coroutineId;

    @InterfaceC7395n
    private final String dispatcher;

    @InterfaceC7396q
    private final List<StackTraceElement> lastObservedStackTrace;

    @InterfaceC7395n
    private final String lastObservedThreadName;

    @InterfaceC7395n
    private final String lastObservedThreadState;

    @InterfaceC7395n
    private final String name;
    private final long sequenceNumber;

    @InterfaceC7396q
    private final String state;

    public C6544p(@InterfaceC7396q C6543n c6543n, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        Thread.State state;
        n5r1 n5r1Var = (n5r1) f7l8Var.get(n5r1.f37301q);
        this.coroutineId = n5r1Var == null ? null : Long.valueOf(n5r1Var.ga());
        InterfaceC6214n interfaceC6214n = (InterfaceC6214n) f7l8Var.get(InterfaceC6214n.ep);
        this.dispatcher = interfaceC6214n == null ? null : interfaceC6214n.toString();
        hyr hyrVar = (hyr) f7l8Var.get(hyr.f37198q);
        this.name = hyrVar == null ? null : hyrVar.ga();
        this.state = c6543n.f7l8();
        Thread thread = c6543n.f36898n;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = c6543n.f36898n;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = c6543n.m24020y();
        this.sequenceNumber = c6543n.f81975toq;
    }

    @InterfaceC7395n
    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    @InterfaceC7395n
    public final String getDispatcher() {
        return this.dispatcher;
    }

    @InterfaceC7396q
    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    @InterfaceC7395n
    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    @InterfaceC7395n
    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    @InterfaceC7395n
    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @InterfaceC7396q
    public final String getState() {
        return this.state;
    }
}
