package g0ad;

import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6769y;

/* JADX INFO: renamed from: g0ad.k */
/* JADX INFO: compiled from: Process.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "ProcessKt")
public final class C6046k {
    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final Void m22275k(int i2) {
        System.exit(i2);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
