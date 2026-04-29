package ec;

import java.util.concurrent.CancellationException;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.lv5;
import kotlin.yz;

/* JADX INFO: renamed from: ec.k */
/* JADX INFO: compiled from: CancellationException.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class C6001k {
    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: k */
    private static final CancellationException m22237k(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final CancellationException toq(Throwable th) {
        CancellationException cancellationException = new CancellationException(th != null ? th.toString() : null);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @yz(version = "1.4")
    public static /* synthetic */ void zy() {
    }
}
