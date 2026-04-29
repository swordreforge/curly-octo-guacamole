package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import zy.dd;
import zy.lvui;
import zy.o1t;

/* JADX INFO: renamed from: com.bumptech.glide.util.n */
/* JADX INFO: compiled from: ExceptionPassthroughInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3203n extends InputStream {

    /* JADX INFO: renamed from: n */
    @o1t("POOL")
    private static final Queue<C3203n> f19084n = kja0.m11225g(0);

    /* JADX INFO: renamed from: k */
    private InputStream f19085k;

    /* JADX INFO: renamed from: q */
    private IOException f19086q;

    C3203n() {
    }

    /* JADX INFO: renamed from: k */
    static void m11236k() {
        synchronized (f19084n) {
            while (true) {
                Queue<C3203n> queue = f19084n;
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static C3203n m11237q(@lvui InputStream inputStream) {
        C3203n c3203nPoll;
        Queue<C3203n> queue = f19084n;
        synchronized (queue) {
            c3203nPoll = queue.poll();
        }
        if (c3203nPoll == null) {
            c3203nPoll = new C3203n();
        }
        c3203nPoll.m11238p(inputStream);
        return c3203nPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f19085k.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19085k.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f19085k.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f19085k.markSupported();
    }

    /* JADX INFO: renamed from: p */
    void m11238p(@lvui InputStream inputStream) {
        this.f19085k = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f19085k.read();
        } catch (IOException e2) {
            this.f19086q = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f19085k.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        try {
            return this.f19085k.skip(j2);
        } catch (IOException e2) {
            this.f19086q = e2;
            throw e2;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m11239y() {
        this.f19086q = null;
        this.f19085k = null;
        Queue<C3203n> queue = f19084n;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @dd
    public IOException zy() {
        return this.f19086q;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f19085k.read(bArr);
        } catch (IOException e2) {
            this.f19086q = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            return this.f19085k.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f19086q = e2;
            throw e2;
        }
    }
}
