package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6323o;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.intrinsics.EnumC6198k;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.nn86;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SafeContinuationJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@nn86
@yz(version = "1.3")
public final class ld6<T> implements InterfaceC6216q<T>, InterfaceC6207n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC6216q<T> f36260k;

    @InterfaceC7395n
    private volatile Object result;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final C6213k f36259q = new C6213k(null);

    /* JADX INFO: renamed from: n */
    private static final AtomicReferenceFieldUpdater<ld6<?>, Object> f36258n = AtomicReferenceFieldUpdater.newUpdater(ld6.class, Object.class, "result");

    /* JADX INFO: renamed from: kotlin.coroutines.ld6$k */
    /* JADX INFO: compiled from: SafeContinuationJvm.kt */
    private static final class C6213k {
        private C6213k() {
        }

        public /* synthetic */ C6213k(ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        private static /* synthetic */ void m22772k() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ld6(@InterfaceC7396q InterfaceC6216q<? super T> delegate, @InterfaceC7395n Object obj) {
        d2ok.m23075h(delegate, "delegate");
        this.f36260k = delegate;
        this.result = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public InterfaceC6207n getCallerFrame() {
        InterfaceC6216q<T> interfaceC6216q = this.f36260k;
        if (interfaceC6216q instanceof InterfaceC6207n) {
            return (InterfaceC6207n) interfaceC6216q;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public f7l8 getContext() {
        return this.f36260k.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC6198k enumC6198k = EnumC6198k.UNDECIDED;
            if (obj2 == enumC6198k) {
                if (androidx.concurrent.futures.toq.m906k(f36258n, this, enumC6198k, obj)) {
                    return;
                }
            } else {
                if (obj2 != C6199q.x2()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.toq.m906k(f36258n, this, C6199q.x2(), EnumC6198k.RESUMED)) {
                    this.f36260k.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @InterfaceC7396q
    public String toString() {
        return "SafeContinuation for " + this.f36260k;
    }

    @nn86
    @InterfaceC7395n
    public final Object toq() throws Throwable {
        Object obj = this.result;
        EnumC6198k enumC6198k = EnumC6198k.UNDECIDED;
        if (obj == enumC6198k) {
            if (androidx.concurrent.futures.toq.m906k(f36258n, this, enumC6198k, C6199q.x2())) {
                return C6199q.x2();
            }
            obj = this.result;
        }
        if (obj == EnumC6198k.RESUMED) {
            return C6199q.x2();
        }
        if (obj instanceof C6323o.toq) {
            throw ((C6323o.toq) obj).exception;
        }
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @nn86
    public ld6(@InterfaceC7396q InterfaceC6216q<? super T> delegate) {
        this(delegate, EnumC6198k.UNDECIDED);
        d2ok.m23075h(delegate, "delegate");
    }
}
