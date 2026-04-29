package com.google.android.exoplayer2.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f67085zy = "AtomicFile";

    /* JADX INFO: renamed from: k */
    private final File f23292k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final File f67086toq;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.toq$k */
    /* JADX INFO: compiled from: AtomicFile.java */
    private static final class C3857k extends OutputStream {

        /* JADX INFO: renamed from: k */
        private final FileOutputStream f23293k;

        /* JADX INFO: renamed from: q */
        private boolean f23294q = false;

        public C3857k(File file) throws FileNotFoundException {
            this.f23293k = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f23294q) {
                return;
            }
            this.f23294q = true;
            flush();
            try {
                this.f23293k.getFD().sync();
            } catch (IOException e2) {
                ni7.n7h(toq.f67085zy, "Failed to sync file descriptor:", e2);
            }
            this.f23293k.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f23293k.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.f23293k.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f23293k.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f23293k.write(bArr, i2, i3);
        }
    }

    public toq(File file) {
        this.f23292k = file;
        this.f67086toq = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    /* JADX INFO: renamed from: n */
    private void m13734n() {
        if (this.f67086toq.exists()) {
            this.f23292k.delete();
            this.f67086toq.renameTo(this.f23292k);
        }
    }

    /* JADX INFO: renamed from: g */
    public OutputStream m13735g() throws IOException {
        if (this.f23292k.exists()) {
            if (this.f67086toq.exists()) {
                this.f23292k.delete();
            } else if (!this.f23292k.renameTo(this.f67086toq)) {
                String strValueOf = String.valueOf(this.f23292k);
                String strValueOf2 = String.valueOf(this.f67086toq);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 37 + strValueOf2.length());
                sb.append("Couldn't rename file ");
                sb.append(strValueOf);
                sb.append(" to backup file ");
                sb.append(strValueOf2);
                ni7.qrj(f67085zy, sb.toString());
            }
        }
        try {
            return new C3857k(this.f23292k);
        } catch (FileNotFoundException e2) {
            File parentFile = this.f23292k.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String strValueOf3 = String.valueOf(this.f23292k);
                StringBuilder sb2 = new StringBuilder(strValueOf3.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(strValueOf3);
                throw new IOException(sb2.toString(), e2);
            }
            try {
                return new C3857k(this.f23292k);
            } catch (FileNotFoundException e3) {
                String strValueOf4 = String.valueOf(this.f23292k);
                StringBuilder sb3 = new StringBuilder(strValueOf4.length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(strValueOf4);
                throw new IOException(sb3.toString(), e3);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13736k() {
        this.f23292k.delete();
        this.f67086toq.delete();
    }

    /* JADX INFO: renamed from: q */
    public InputStream m13737q() throws FileNotFoundException {
        m13734n();
        return new FileInputStream(this.f23292k);
    }

    public void toq(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f67086toq.delete();
    }

    public boolean zy() {
        return this.f23292k.exists() || this.f67086toq.exists();
    }
}
