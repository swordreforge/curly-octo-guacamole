package kotlinx.coroutines.internal;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.i */
/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "Lkotlin/was;", "k", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6675i {
    /* JADX INFO: renamed from: k */
    public static final void m24351k(int i2) {
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("Expected positive parallelism level, but got ", Integer.valueOf(i2)).toString());
        }
    }
}
