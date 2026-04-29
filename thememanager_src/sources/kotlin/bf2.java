package kotlin;

import cyoe.InterfaceC5981k;
import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: Synchronized.kt */
/* JADX INFO: loaded from: classes3.dex */
class bf2 extends C6124b {
    @InterfaceC6234g
    private static final <R> R x2(Object lock, InterfaceC5981k<? extends R> block) {
        R rInvoke;
        kotlin.jvm.internal.d2ok.m23075h(lock, "lock");
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                kotlin.jvm.internal.d3.m23090q(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.d3.m23090q(1);
                kotlin.jvm.internal.d3.zy(1);
                throw th;
            }
        }
        kotlin.jvm.internal.d3.zy(1);
        return rInvoke;
    }
}
