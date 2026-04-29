package yw;

import cyoe.x2;
import kotlin.C6231h;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.nn86;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;

/* JADX INFO: renamed from: yw.k */
/* JADX INFO: compiled from: AutoCloseableJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "AutoCloseableKt")
public final class C7793k {
    @nn86
    @yz(version = "1.2")
    /* JADX INFO: renamed from: k */
    public static final void m28192k(@InterfaceC7395n AutoCloseable autoCloseable, @InterfaceC7395n Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                C6231h.m22845k(th, th2);
            }
        }
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final <T extends AutoCloseable, R> R toq(T t2, x2<? super T, ? extends R> block) throws Exception {
        d2ok.m23075h(block, "block");
        try {
            R rInvoke = block.invoke(t2);
            d3.m23090q(1);
            m28192k(t2, null);
            d3.zy(1);
            return rInvoke;
        } finally {
        }
    }
}
