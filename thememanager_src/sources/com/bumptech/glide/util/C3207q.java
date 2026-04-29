package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.util.q */
/* JADX INFO: compiled from: ExceptionCatchingInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C3207q extends InputStream {

    /* JADX INFO: renamed from: n */
    private static final Queue<C3207q> f19094n = kja0.m11225g(0);

    /* JADX INFO: renamed from: k */
    private InputStream f19095k;

    /* JADX INFO: renamed from: q */
    private IOException f19096q;

    C3207q() {
    }

    /* JADX INFO: renamed from: k */
    static void m11256k() {
        while (true) {
            Queue<C3207q> queue = f19094n;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static C3207q m11257q(@lvui InputStream inputStream) {
        C3207q c3207qPoll;
        Queue<C3207q> queue = f19094n;
        synchronized (queue) {
            c3207qPoll = queue.poll();
        }
        if (c3207qPoll == null) {
            c3207qPoll = new C3207q();
        }
        c3207qPoll.m11258p(inputStream);
        return c3207qPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f19095k.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19095k.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f19095k.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f19095k.markSupported();
    }

    /* JADX INFO: renamed from: p */
    void m11258p(@lvui InputStream inputStream) {
        this.f19095k = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f19095k.read(bArr);
        } catch (IOException e2) {
            this.f19096q = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f19095k.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f19095k.skip(j2);
        } catch (IOException e2) {
            this.f19096q = e2;
            return 0L;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m11259y() {
        this.f19096q = null;
        this.f19095k = null;
        Queue<C3207q> queue = f19094n;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @dd
    public IOException zy() {
        return this.f19096q;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f19095k.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f19096q = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f19095k.read();
        } catch (IOException e2) {
            this.f19096q = e2;
            return -1;
        }
    }
}
