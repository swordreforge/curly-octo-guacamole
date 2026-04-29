package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Closeables.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class qrj {

    /* JADX INFO: renamed from: k */
    @InterfaceC7732q
    static final Logger f27099k = Logger.getLogger(qrj.class.getName());

    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    public static void m16437k(@NullableDecl Closeable closeable, boolean z2) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            if (!z2) {
                throw e2;
            }
            f27099k.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e2);
        }
    }

    public static void toq(@NullableDecl InputStream inputStream) {
        try {
            m16437k(inputStream, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void zy(@NullableDecl Reader reader) {
        try {
            m16437k(reader, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
