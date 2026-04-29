package kotlin;

import kotlin.coroutines.InterfaceC6215p;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.s */
/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {ki.class})
@yz(version = "1.7")
@InterfaceC6215p
public abstract class AbstractC6383s<T, R> {
    private AbstractC6383s() {
    }

    public /* synthetic */ AbstractC6383s(kotlin.jvm.internal.ni7 ni7Var) {
        this();
    }

    @InterfaceC7396q
    @ld6(level = qrj.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @hb(expression = "this.callRecursive(value)", imports = {}))
    /* JADX INFO: renamed from: q */
    public final Void m23417q(@InterfaceC7396q f7l8<?, ?> f7l8Var, @InterfaceC7395n Object obj) {
        kotlin.jvm.internal.d2ok.m23075h(f7l8Var, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    @InterfaceC7395n
    public abstract Object toq(T t2, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q);

    @InterfaceC7395n
    public abstract <U, S> Object zy(@InterfaceC7396q f7l8<U, S> f7l8Var, U u2, @InterfaceC7396q InterfaceC6216q<? super S> interfaceC6216q);
}
