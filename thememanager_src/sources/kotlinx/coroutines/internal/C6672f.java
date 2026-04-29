package kotlinx.coroutines.internal;

import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.f */
/* JADX INFO: compiled from: SystemProps.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"", "propertyName", "toq", "", "k", com.market.sdk.reflect.toq.f28131g, "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
final /* synthetic */ class C6672f {

    /* JADX INFO: renamed from: k */
    private static final int f37209k = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: k */
    public static final int m24330k() {
        return f37209k;
    }

    @InterfaceC7395n
    public static final String toq(@InterfaceC7396q String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
