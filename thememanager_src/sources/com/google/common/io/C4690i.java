package com.google.common.io;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.io.i */
/* JADX INFO: compiled from: Flushables.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class C4690i {

    /* JADX INFO: renamed from: k */
    private static final Logger f27066k = Logger.getLogger(C4690i.class.getName());

    private C4690i() {
    }

    /* JADX INFO: renamed from: k */
    public static void m16401k(Flushable flushable, boolean z2) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e2) {
            if (!z2) {
                throw e2;
            }
            f27066k.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e2);
        }
    }

    public static void toq(Flushable flushable) {
        try {
            m16401k(flushable, true);
        } catch (IOException e2) {
            f27066k.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e2);
        }
    }
}
