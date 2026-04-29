package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: BufferedSink.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface qrj extends vyq, WritableByteChannel {
    @InterfaceC7396q
    qrj bz2(long j2) throws IOException;

    @InterfaceC7396q
    qrj c8jq(@InterfaceC7396q String str, int i2, int i3, @InterfaceC7396q Charset charset) throws IOException;

    @InterfaceC7396q
    qrj cfr(int i2) throws IOException;

    long ek5k(@InterfaceC7396q nn86 nn86Var) throws IOException;

    @InterfaceC7396q
    qrj eqxt() throws IOException;

    @Override // okio.vyq, java.io.Flushable
    void flush() throws IOException;

    @InterfaceC7396q
    qrj fn3e() throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    x2 mo27638g();

    @InterfaceC7396q
    qrj jz5(@InterfaceC7396q String str, @InterfaceC7396q Charset charset) throws IOException;

    @InterfaceC7396q
    qrj ktq(@InterfaceC7396q nn86 nn86Var, long j2) throws IOException;

    @InterfaceC7396q
    qrj lrht(@InterfaceC7396q String str) throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    qrj mo27639m(@InterfaceC7396q String str, int i2, int i3) throws IOException;

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.hb(expression = "buffer", imports = {}))
    /* JADX INFO: renamed from: n */
    x2 mo27640n();

    @InterfaceC7396q
    qrj ni7(int i2) throws IOException;

    @InterfaceC7396q
    qrj o1t(long j2) throws IOException;

    @InterfaceC7396q
    qrj uc(@InterfaceC7396q kja0 kja0Var) throws IOException;

    @InterfaceC7396q
    qrj wo(@InterfaceC7396q kja0 kja0Var, int i2, int i3) throws IOException;

    @InterfaceC7396q
    qrj write(@InterfaceC7396q byte[] bArr) throws IOException;

    @InterfaceC7396q
    qrj write(@InterfaceC7396q byte[] bArr, int i2, int i3) throws IOException;

    @InterfaceC7396q
    qrj writeByte(int i2) throws IOException;

    @InterfaceC7396q
    qrj writeInt(int i2) throws IOException;

    @InterfaceC7396q
    qrj writeLong(long j2) throws IOException;

    @InterfaceC7396q
    qrj writeShort(int i2) throws IOException;

    @InterfaceC7396q
    qrj xwq3(long j2) throws IOException;

    @InterfaceC7396q
    qrj zsr0(int i2) throws IOException;

    @InterfaceC7396q
    OutputStream zwy();
}
