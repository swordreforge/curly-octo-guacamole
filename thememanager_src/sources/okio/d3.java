package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: NioFileSystemFileHandle.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d3 extends AbstractC7549i {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final FileChannel f43696y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(boolean z2, @InterfaceC7396q FileChannel fileChannel) {
        super(z2);
        kotlin.jvm.internal.d2ok.m23075h(fileChannel, "fileChannel");
        this.f43696y = fileChannel;
    }

    @Override // okio.AbstractC7549i
    protected synchronized int d2ok(long j2, @InterfaceC7396q byte[] array, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        this.f43696y.position(j2);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i2, i3);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i5 = this.f43696y.read(byteBufferWrap);
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
        return this.f43696y.size();
    }

    @Override // okio.AbstractC7549i
    protected synchronized void hyr(long j2) {
        long size = size();
        long j3 = j2 - size;
        if (j3 > 0) {
            int i2 = (int) j3;
            yz(size, new byte[i2], 0, i2);
        } else {
            this.f43696y.truncate(j2);
        }
    }

    @Override // okio.AbstractC7549i
    /* JADX INFO: renamed from: t */
    protected synchronized void mo27598t() {
        this.f43696y.force(true);
    }

    @Override // okio.AbstractC7549i
    protected synchronized void wvg() {
        this.f43696y.close();
    }

    @Override // okio.AbstractC7549i
    protected synchronized void yz(long j2, @InterfaceC7396q byte[] array, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        this.f43696y.position(j2);
        this.f43696y.write(ByteBuffer.wrap(array, i2, i3));
    }
}
