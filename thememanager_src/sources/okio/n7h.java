package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: BufferedSource.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface n7h extends nn86, ReadableByteChannel {
    boolean bf2(long j2) throws IOException;

    short bo() throws IOException;

    boolean ch(long j2, @InterfaceC7396q kja0 kja0Var, int i2, int i3) throws IOException;

    int cv06() throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: d */
    String mo27610d(long j2) throws IOException;

    long d3(@InterfaceC7396q kja0 kja0Var) throws IOException;

    void dr(long j2) throws IOException;

    @InterfaceC7396q
    kja0 fnq8(long j2) throws IOException;

    long fti(byte b2, long j2) throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    x2 mo27611g();

    @InterfaceC7396q
    byte[] gbni() throws IOException;

    long gvn7(byte b2, long j2, long j3) throws IOException;

    long gyi(@InterfaceC7396q kja0 kja0Var, long j2) throws IOException;

    long ikck(byte b2) throws IOException;

    @InterfaceC7396q
    String jbh() throws IOException;

    long jk(@InterfaceC7396q kja0 kja0Var) throws IOException;

    void jp0y(@InterfaceC7396q x2 x2Var, long j2) throws IOException;

    long kja0(@InterfaceC7396q kja0 kja0Var, long j2) throws IOException;

    int lh(@InterfaceC7396q dd ddVar) throws IOException;

    @InterfaceC7396q
    byte[] lv5(long j2) throws IOException;

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.hb(expression = "buffer", imports = {}))
    /* JADX INFO: renamed from: n */
    x2 mo27612n();

    long n2t() throws IOException;

    @InterfaceC7395n
    String oc() throws IOException;

    @InterfaceC7396q
    n7h peek();

    @InterfaceC7396q
    InputStream pjz9();

    boolean py() throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    String mo27613r(long j2) throws IOException;

    long r8s8() throws IOException;

    int read(@InterfaceC7396q byte[] bArr) throws IOException;

    int read(@InterfaceC7396q byte[] bArr, int i2, int i3) throws IOException;

    byte readByte() throws IOException;

    void readFully(@InterfaceC7396q byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    @InterfaceC7396q
    String se(@InterfaceC7396q Charset charset) throws IOException;

    void skip(long j2) throws IOException;

    @InterfaceC7396q
    kja0 uj2j() throws IOException;

    long ukdy(@InterfaceC7396q vyq vyqVar) throws IOException;

    boolean vyq(long j2, @InterfaceC7396q kja0 kja0Var) throws IOException;

    long y2() throws IOException;

    @InterfaceC7396q
    String yl(long j2, @InterfaceC7396q Charset charset) throws IOException;

    int zkd() throws IOException;

    @InterfaceC7396q
    String zp() throws IOException;
}
