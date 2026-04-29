package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: FileBackedOutputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class cdj extends OutputStream {

    /* JADX INFO: renamed from: g */
    private OutputStream f27050g;

    /* JADX INFO: renamed from: k */
    private final int f27051k;

    /* JADX INFO: renamed from: n */
    private final f7l8 f27052n;

    /* JADX INFO: renamed from: q */
    private final boolean f27053q;

    /* JADX INFO: renamed from: s */
    @NullableDecl
    private File f27054s;

    /* JADX INFO: renamed from: y */
    private zy f27055y;

    /* JADX INFO: renamed from: com.google.common.io.cdj$k */
    /* JADX INFO: compiled from: FileBackedOutputStream.java */
    class C4684k extends f7l8 {
        C4684k() {
        }

        protected void finalize() {
            try {
                cdj.this.m16381p();
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }

        @Override // com.google.common.io.f7l8
        public InputStream qrj() throws IOException {
            return cdj.this.m16380y();
        }
    }

    /* JADX INFO: compiled from: FileBackedOutputStream.java */
    class toq extends f7l8 {
        toq() {
        }

        @Override // com.google.common.io.f7l8
        public InputStream qrj() throws IOException {
            return cdj.this.m16380y();
        }
    }

    /* JADX INFO: compiled from: FileBackedOutputStream.java */
    private static class zy extends ByteArrayOutputStream {
        private zy() {
        }

        int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        /* JADX INFO: renamed from: k */
        byte[] m16383k() {
            return ((ByteArrayOutputStream) this).buf;
        }

        /* synthetic */ zy(C4684k c4684k) {
            this();
        }
    }

    public cdj(int i2) {
        this(i2, false);
    }

    private void ld6(int i2) throws IOException {
        if (this.f27054s != null || this.f27055y.getCount() + i2 <= this.f27051k) {
            return;
        }
        File fileCreateTempFile = File.createTempFile("FileBackedOutputStream", null);
        if (this.f27053q) {
            fileCreateTempFile.deleteOnExit();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        fileOutputStream.write(this.f27055y.m16383k(), 0, this.f27055y.getCount());
        fileOutputStream.flush();
        this.f27050g = fileOutputStream;
        this.f27054s = fileCreateTempFile;
        this.f27055y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public synchronized InputStream m16380y() throws IOException {
        if (this.f27054s != null) {
            return new FileInputStream(this.f27054s);
        }
        return new ByteArrayInputStream(this.f27055y.m16383k(), 0, this.f27055y.getCount());
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f27050g.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f27050g.flush();
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m16381p() throws IOException {
        C4684k c4684k = null;
        try {
            close();
            zy zyVar = this.f27055y;
            if (zyVar == null) {
                this.f27055y = new zy(c4684k);
            } else {
                zyVar.reset();
            }
            this.f27050g = this.f27055y;
            File file = this.f27054s;
            if (file != null) {
                this.f27054s = null;
                if (!file.delete()) {
                    throw new IOException("Could not delete: " + file);
                }
            }
        } catch (Throwable th) {
            if (this.f27055y == null) {
                this.f27055y = new zy(c4684k);
            } else {
                this.f27055y.reset();
            }
            this.f27050g = this.f27055y;
            File file2 = this.f27054s;
            if (file2 != null) {
                this.f27054s = null;
                if (!file2.delete()) {
                    throw new IOException("Could not delete: " + file2);
                }
            }
            throw th;
        }
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: q */
    synchronized File m16382q() {
        return this.f27054s;
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i2) throws IOException {
        ld6(1);
        this.f27050g.write(i2);
    }

    public f7l8 zy() {
        return this.f27052n;
    }

    public cdj(int i2, boolean z2) {
        this.f27051k = i2;
        this.f27053q = z2;
        zy zyVar = new zy(null);
        this.f27055y = zyVar;
        this.f27050g = zyVar;
        if (z2) {
            this.f27052n = new C4684k();
        } else {
            this.f27052n = new toq();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i2, int i3) throws IOException {
        ld6(i3);
        this.f27050g.write(bArr, i2, i3);
    }
}
