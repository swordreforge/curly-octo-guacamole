package com.google.gson;

import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4925n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: JsonStreamParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fn3e implements Iterator<x2> {

    /* JADX INFO: renamed from: k */
    private final C4924k f27643k;

    /* JADX INFO: renamed from: q */
    private final Object f27644q;

    public fn3e(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z2;
        synchronized (this.f27644q) {
            try {
                try {
                    z2 = this.f27643k.g1() != com.google.gson.stream.zy.END_DOCUMENT;
                } catch (C4925n e2) {
                    throw new zurt(e2);
                } catch (IOException e3) {
                    throw new qrj(e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public x2 next() throws C4872h {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return com.google.gson.internal.n7h.m17168k(this.f27643k);
        } catch (C4872h e2) {
            if (e2.getCause() instanceof EOFException) {
                throw new NoSuchElementException();
            }
            throw e2;
        } catch (OutOfMemoryError e3) {
            throw new C4872h("Failed parsing JSON source to Json", e3);
        } catch (StackOverflowError e4) {
            throw new C4872h("Failed parsing JSON source to Json", e4);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public fn3e(Reader reader) {
        C4924k c4924k = new C4924k(reader);
        this.f27643k = c4924k;
        c4924k.h7am(true);
        this.f27644q = new Object();
    }
}
