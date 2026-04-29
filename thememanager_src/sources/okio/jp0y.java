package okio;

import java.io.RandomAccessFile;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JvmFileHandle.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class jp0y extends AbstractC7549i {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final RandomAccessFile f43776y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0y(boolean z2, @InterfaceC7396q RandomAccessFile randomAccessFile) {
        super(z2);
        kotlin.jvm.internal.d2ok.m23075h(randomAccessFile, "randomAccessFile");
        this.f43776y = randomAccessFile;
    }

    @Override // okio.AbstractC7549i
    protected synchronized int d2ok(long j2, @InterfaceC7396q byte[] array, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        this.f43776y.seek(j2);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i5 = this.f43776y.read(array, i2, i3 - i4);
            if (i5 != -1) {
                i4 += i5;
            } else if (i4 == 0) {
                return -1;
            }
        }
        return i4;
    }

    @Override // okio.AbstractC7549i
    /* JADX INFO: renamed from: f */
    protected synchronized long mo27597f() {
        return this.f43776y.length();
    }

    @Override // okio.AbstractC7549i
    protected synchronized void hyr(long j2) {
        long size = size();
        long j3 = j2 - size;
        if (j3 > 0) {
            int i2 = (int) j3;
            yz(size, new byte[i2], 0, i2);
        } else {
            this.f43776y.setLength(j2);
        }
    }

    @Override // okio.AbstractC7549i
    /* JADX INFO: renamed from: t */
    protected synchronized void mo27598t() {
        this.f43776y.getFD().sync();
    }

    @Override // okio.AbstractC7549i
    protected synchronized void wvg() {
        this.f43776y.close();
    }

    @Override // okio.AbstractC7549i
    protected synchronized void yz(long j2, @InterfaceC7396q byte[] array, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        this.f43776y.seek(j2);
        this.f43776y.write(array, i2, i3);
    }
}
