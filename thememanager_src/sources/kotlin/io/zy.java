package kotlin.io;

import java.io.Closeable;
import java.io.IOException;
import kotlin.C6231h;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.nn86;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "CloseableKt")
public final class zy {
    @nn86
    @yz(version = "1.1")
    /* JADX INFO: renamed from: k */
    public static final void m23032k(@InterfaceC7395n Closeable closeable, @InterfaceC7395n Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C6231h.m22845k(th, th2);
            }
        }
    }

    @InterfaceC6234g
    private static final <T extends Closeable, R> R toq(T t2, cyoe.x2<? super T, ? extends R> block) throws IOException {
        d2ok.m23075h(block, "block");
        try {
            R rInvoke = block.invoke(t2);
            d3.m23090q(1);
            if (kotlin.internal.qrj.m22878k(1, 1, 0)) {
                m23032k(t2, null);
            } else if (t2 != null) {
                t2.close();
            }
            d3.zy(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                d3.m23090q(1);
                if (kotlin.internal.qrj.m22878k(1, 1, 0)) {
                    m23032k(t2, th);
                } else if (t2 != null) {
                    try {
                        t2.close();
                    } catch (Throwable unused) {
                    }
                }
                d3.zy(1);
                throw th2;
            }
        }
    }
}
