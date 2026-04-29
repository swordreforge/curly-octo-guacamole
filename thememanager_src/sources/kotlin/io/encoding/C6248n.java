package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.kja0;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.encoding.n */
/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6246g
final class C6248n extends OutputStream {

    /* JADX INFO: renamed from: g */
    private int f36302g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final OutputStream f36303k;

    /* JADX INFO: renamed from: n */
    private boolean f36304n;

    /* JADX INFO: renamed from: p */
    private int f36305p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final C6247k f36306q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final byte[] f36307s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final byte[] f36308y;

    public C6248n(@InterfaceC7396q OutputStream output, @InterfaceC7396q C6247k base64) {
        d2ok.m23075h(output, "output");
        d2ok.m23075h(base64, "base64");
        this.f36303k = output;
        this.f36306q = base64;
        this.f36302g = base64.jk() ? 76 : -1;
        this.f36308y = new byte[1024];
        this.f36307s = new byte[3];
    }

    /* JADX INFO: renamed from: k */
    private final void m22901k() throws IOException {
        if (this.f36304n) {
            throw new IOException("The output stream is closed.");
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m22902q() {
        if (!(m22903y(this.f36307s, 0, this.f36305p) == 4)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f36305p = 0;
    }

    /* JADX INFO: renamed from: y */
    private final int m22903y(byte[] bArr, int i2, int i3) throws IOException {
        int iM22895i = this.f36306q.m22895i(bArr, this.f36308y, 0, i2, i3);
        if (this.f36302g == 0) {
            this.f36303k.write(C6247k.f81796zy.gvn7());
            this.f36302g = 76;
            if (!(iM22895i <= 76)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f36303k.write(this.f36308y, 0, iM22895i);
        this.f36302g -= iM22895i;
        return iM22895i;
    }

    private final int zy(byte[] bArr, int i2, int i3) {
        int iMin = Math.min(3 - this.f36305p, i3 - i2);
        kja0.y2(bArr, this.f36307s, this.f36305p, i2, i2 + iMin);
        int i4 = this.f36305p + iMin;
        this.f36305p = i4;
        if (i4 == 3) {
            m22902q();
        }
        return iMin;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f36304n) {
            return;
        }
        this.f36304n = true;
        if (this.f36305p != 0) {
            m22902q();
        }
        this.f36303k.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m22901k();
        this.f36303k.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        m22901k();
        byte[] bArr = this.f36307s;
        int i3 = this.f36305p;
        int i4 = i3 + 1;
        this.f36305p = i4;
        bArr[i3] = (byte) i2;
        if (i4 == 3) {
            m22902q();
        }
    }

    @Override // java.io.OutputStream
    public void write(@InterfaceC7396q byte[] source, int i2, int i3) throws IOException {
        int i4;
        d2ok.m23075h(source, "source");
        m22901k();
        if (i2 < 0 || i3 < 0 || (i4 = i2 + i3) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i2 + ", length: " + i3 + ", source size: " + source.length);
        }
        if (i3 == 0) {
            return;
        }
        int i5 = this.f36305p;
        if (i5 < 3) {
            if (i5 != 0) {
                i2 += zy(source, i2, i4);
                if (this.f36305p != 0) {
                    return;
                }
            }
            while (i2 + 3 <= i4) {
                int iMin = Math.min((this.f36306q.jk() ? this.f36302g : this.f36308y.length) / 4, (i4 - i2) / 3);
                int i6 = (iMin * 3) + i2;
                if (!(m22903y(source, i2, i6) == iMin * 4)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i2 = i6;
            }
            kja0.y2(source, this.f36307s, 0, i2, i4);
            this.f36305p = i4 - i2;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
