package kotlinx.coroutines.debug.internal;

import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlinx.coroutines.internal.C6679l;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0002\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"", "Lkotlinx/coroutines/debug/internal/x2;", "q", "", "n", "", "k", com.market.sdk.reflect.toq.f28131g, "MAGIC", "toq", "MIN_CAPACITY", "Lkotlinx/coroutines/internal/l;", "zy", "Lkotlinx/coroutines/internal/l;", "REHASH", "Lkotlinx/coroutines/debug/internal/x2;", "MARKED_NULL", "MARKED_TRUE", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class zy {

    /* JADX INFO: renamed from: k */
    private static final int f36923k = -1640531527;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f81983toq = 16;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6679l f81984zy = new C6679l("REHASH");

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final x2 f36925q = new x2(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final x2 f36924n = new x2(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Void m24037n() {
        throw new UnsupportedOperationException("not implemented");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final x2 m24038q(Object obj) {
        return obj == null ? f36925q : d2ok.f7l8(obj, Boolean.TRUE) ? f36924n : new x2(obj);
    }
}
