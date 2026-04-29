package kotlinx.coroutines.internal;

import kotlin.C6318m;
import kotlin.C6323o;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.h */
/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "k", com.market.sdk.reflect.toq.f68929toq, "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6674h {

    /* JADX INFO: renamed from: k */
    private static final boolean f37217k;

    static {
        Object objM28280constructorimpl;
        try {
            C6323o.k kVar = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        f37217k = C6323o.m28286isSuccessimpl(objM28280constructorimpl);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m24346k() {
        return f37217k;
    }
}
