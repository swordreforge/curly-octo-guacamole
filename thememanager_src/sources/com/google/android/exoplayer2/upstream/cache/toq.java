package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import com.google.android.exoplayer2.upstream.n7h;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import zy.dd;

/* JADX INFO: compiled from: CacheDataSink.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements com.google.android.exoplayer2.upstream.n7h {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final long f66783ld6 = 5242880;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f66784n7h = "CacheDataSink";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final long f66785qrj = 2097152;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f66786x2 = 20480;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private OutputStream f66787f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private File f22939g;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3775k f22940k;

    /* JADX INFO: renamed from: n */
    private long f22941n;

    /* JADX INFO: renamed from: p */
    private t8r f22942p;

    /* JADX INFO: renamed from: q */
    @dd
    private com.google.android.exoplayer2.upstream.t8r f22943q;

    /* JADX INFO: renamed from: s */
    private long f22944s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f66788toq;

    /* JADX INFO: renamed from: y */
    private long f22945y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f66789zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.toq$k */
    /* JADX INFO: compiled from: CacheDataSink.java */
    public static final class C3781k extends InterfaceC3775k.k {
        public C3781k(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheDataSink.java */
    public static final class C7966toq implements n7h.InterfaceC3809k {

        /* JADX INFO: renamed from: k */
        private InterfaceC3775k f22946k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f66790toq = toq.f66783ld6;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f66791zy = toq.f66786x2;

        @Override // com.google.android.exoplayer2.upstream.n7h.InterfaceC3809k
        /* JADX INFO: renamed from: k */
        public com.google.android.exoplayer2.upstream.n7h mo13417k() {
            return new toq((InterfaceC3775k) C3844k.f7l8(this.f22946k), this.f66790toq, this.f66791zy);
        }

        /* JADX INFO: renamed from: q */
        public C7966toq m13418q(long j2) {
            this.f66790toq = j2;
            return this;
        }

        public C7966toq toq(int i2) {
            this.f66791zy = i2;
            return this;
        }

        public C7966toq zy(InterfaceC3775k interfaceC3775k) {
            this.f22946k = interfaceC3775k;
            return this;
        }
    }

    public toq(InterfaceC3775k interfaceC3775k, long j2) {
        this(interfaceC3775k, j2, f66786x2);
    }

    private void toq() throws IOException {
        OutputStream outputStream = this.f66787f7l8;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            lrht.m13659h(this.f66787f7l8);
            this.f66787f7l8 = null;
            File file = (File) lrht.ld6(this.f22939g);
            this.f22939g = null;
            this.f22940k.qrj(file, this.f22945y);
        } catch (Throwable th) {
            lrht.m13659h(this.f66787f7l8);
            this.f66787f7l8 = null;
            File file2 = (File) lrht.ld6(this.f22939g);
            this.f22939g = null;
            file2.delete();
            throw th;
        }
    }

    private void zy(com.google.android.exoplayer2.upstream.t8r t8rVar) throws IOException {
        long j2 = t8rVar.f23108y;
        this.f22939g = this.f22940k.toq((String) lrht.ld6(t8rVar.f23107s), t8rVar.f66911f7l8 + this.f22944s, j2 != -1 ? Math.min(j2 - this.f22944s, this.f22941n) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f22939g);
        if (this.f66789zy > 0) {
            t8r t8rVar2 = this.f22942p;
            if (t8rVar2 == null) {
                this.f22942p = new t8r(fileOutputStream, this.f66789zy);
            } else {
                t8rVar2.m13415k(fileOutputStream);
            }
            this.f66787f7l8 = this.f22942p;
        } else {
            this.f66787f7l8 = fileOutputStream;
        }
        this.f22945y = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.n7h
    public void close() throws C3781k {
        if (this.f22943q == null) {
            return;
        }
        try {
            toq();
        } catch (IOException e2) {
            throw new C3781k(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n7h
    /* JADX INFO: renamed from: k */
    public void mo13416k(com.google.android.exoplayer2.upstream.t8r t8rVar) throws C3781k {
        C3844k.f7l8(t8rVar.f23107s);
        if (t8rVar.f23108y == -1 && t8rVar.m13515q(2)) {
            this.f22943q = null;
            return;
        }
        this.f22943q = t8rVar;
        this.f22941n = t8rVar.m13515q(4) ? this.f66788toq : Long.MAX_VALUE;
        this.f22944s = 0L;
        try {
            zy(t8rVar);
        } catch (IOException e2) {
            throw new C3781k(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n7h
    public void write(byte[] bArr, int i2, int i3) throws C3781k {
        com.google.android.exoplayer2.upstream.t8r t8rVar = this.f22943q;
        if (t8rVar == null) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            try {
                if (this.f22945y == this.f22941n) {
                    toq();
                    zy(t8rVar);
                }
                int iMin = (int) Math.min(i3 - i4, this.f22941n - this.f22945y);
                ((OutputStream) lrht.ld6(this.f66787f7l8)).write(bArr, i2 + i4, iMin);
                i4 += iMin;
                long j2 = iMin;
                this.f22945y += j2;
                this.f22944s += j2;
            } catch (IOException e2) {
                throw new C3781k(e2);
            }
        }
    }

    public toq(InterfaceC3775k interfaceC3775k, long j2, int i2) {
        C3844k.m13631p(j2 > 0 || j2 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j2 != -1 && j2 < 2097152) {
            ni7.qrj(f66784n7h, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f22940k = (InterfaceC3775k) C3844k.f7l8(interfaceC3775k);
        this.f66788toq = j2 == -1 ? Long.MAX_VALUE : j2;
        this.f66789zy = i2;
    }
}
