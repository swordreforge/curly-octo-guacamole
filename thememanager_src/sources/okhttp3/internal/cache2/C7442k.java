package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okio.x2;

/* JADX INFO: renamed from: okhttp3.internal.cache2.k */
/* JADX INFO: compiled from: FileOperator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7442k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final FileChannel f43029k;

    public C7442k(@InterfaceC7396q FileChannel fileChannel) {
        d2ok.m23075h(fileChannel, "fileChannel");
        this.f43029k = fileChannel;
    }

    /* JADX INFO: renamed from: k */
    public final void m26970k(long j2, @InterfaceC7396q x2 sink, long j3) throws IOException {
        d2ok.m23075h(sink, "sink");
        if (j3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j3 > 0) {
            long jTransferTo = this.f43029k.transferTo(j2, j3, sink);
            j2 += jTransferTo;
            j3 -= jTransferTo;
        }
    }

    public final void toq(long j2, @InterfaceC7396q x2 source, long j3) throws IOException {
        d2ok.m23075h(source, "source");
        if (j3 < 0 || j3 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j3 > 0) {
            long jTransferFrom = this.f43029k.transferFrom(source, j2, j3);
            j2 += jTransferFrom;
            j3 -= jTransferFrom;
        }
    }
}
