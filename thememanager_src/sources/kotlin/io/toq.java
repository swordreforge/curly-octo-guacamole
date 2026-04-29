package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.hb;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.text.C6433g;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: IOStreams.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "ByteStreamsKt")
public final class toq {

    /* JADX INFO: renamed from: kotlin.io.toq$k */
    /* JADX INFO: compiled from: IOStreams.kt */
    public static final class C6278k extends kotlin.collections.t8r {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ BufferedInputStream f36370g;

        /* JADX INFO: renamed from: k */
        private int f36371k = -1;

        /* JADX INFO: renamed from: n */
        private boolean f36372n;

        /* JADX INFO: renamed from: q */
        private boolean f36373q;

        C6278k(BufferedInputStream bufferedInputStream) {
            this.f36370g = bufferedInputStream;
        }

        /* JADX INFO: renamed from: y */
        private final void m23021y() throws IOException {
            if (this.f36373q || this.f36372n) {
                return;
            }
            int i2 = this.f36370g.read();
            this.f36371k = i2;
            this.f36373q = true;
            this.f36372n = i2 == -1;
        }

        public final boolean f7l8() {
            return this.f36373q;
        }

        /* JADX INFO: renamed from: g */
        public final int m23022g() {
            return this.f36371k;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            m23021y();
            return !this.f36372n;
        }

        public final void ld6(boolean z2) {
            this.f36373q = z2;
        }

        /* JADX INFO: renamed from: p */
        public final void m23023p(int i2) {
            this.f36371k = i2;
        }

        /* JADX INFO: renamed from: s */
        public final void m23024s(boolean z2) {
            this.f36372n = z2;
        }

        @Override // kotlin.collections.t8r
        public byte toq() throws IOException {
            m23021y();
            if (this.f36372n) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b2 = (byte) this.f36371k;
            this.f36373q = false;
            return b2;
        }

        public final boolean zy() {
            return this.f36372n;
        }
    }

    @InterfaceC7396q
    @kotlin.x2(errorSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @hb(expression = "readBytes()", imports = {}))
    public static final byte[] cdj(@InterfaceC7396q InputStream inputStream, int i2) {
        d2ok.m23075h(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i2, inputStream.available()));
        x2(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        d2ok.kja0(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @InterfaceC6234g
    private static final BufferedWriter f7l8(OutputStream outputStream, Charset charset) {
        d2ok.m23075h(outputStream, "<this>");
        d2ok.m23075h(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @InterfaceC6234g
    private static final OutputStreamWriter fn3e(OutputStream outputStream, Charset charset) {
        d2ok.m23075h(outputStream, "<this>");
        d2ok.m23075h(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ BufferedReader m23012g(InputStream inputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(inputStream, "<this>");
        d2ok.m23075h(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    /* JADX INFO: renamed from: h */
    public static final byte[] m23013h(@InterfaceC7396q InputStream inputStream) {
        d2ok.m23075h(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        x2(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        d2ok.kja0(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ InputStreamReader m23014i(InputStream inputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(inputStream, "<this>");
        d2ok.m23075h(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final BufferedInputStream m23015k(InputStream inputStream, int i2) {
        d2ok.m23075h(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i2);
    }

    public static /* synthetic */ byte[] ki(InputStream inputStream, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        return cdj(inputStream, i2);
    }

    @InterfaceC7396q
    public static final kotlin.collections.t8r kja0(@InterfaceC7396q BufferedInputStream bufferedInputStream) {
        d2ok.m23075h(bufferedInputStream, "<this>");
        return new C6278k(bufferedInputStream);
    }

    public static final long ld6(@InterfaceC7396q InputStream inputStream, @InterfaceC7396q OutputStream out, int i2) throws IOException {
        d2ok.m23075h(inputStream, "<this>");
        d2ok.m23075h(out, "out");
        byte[] bArr = new byte[i2];
        int i3 = inputStream.read(bArr);
        long j2 = 0;
        while (i3 >= 0) {
            out.write(bArr, 0, i3);
            j2 += (long) i3;
            i3 = inputStream.read(bArr);
        }
        return j2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final BufferedReader m23016n(InputStream inputStream, Charset charset) {
        d2ok.m23075h(inputStream, "<this>");
        d2ok.m23075h(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @InterfaceC6234g
    private static final ByteArrayInputStream n7h(byte[] bArr, int i2, int i3) {
        d2ok.m23075h(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i2, i3);
    }

    /* JADX INFO: renamed from: p */
    static /* synthetic */ ByteArrayInputStream m23017p(String str, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(str, "<this>");
        d2ok.m23075h(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ BufferedOutputStream m23018q(OutputStream outputStream, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        d2ok.m23075h(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i2);
    }

    @InterfaceC6234g
    private static final ByteArrayInputStream qrj(byte[] bArr) {
        d2ok.m23075h(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static final ByteArrayInputStream m23019s(String str, Charset charset) {
        d2ok.m23075h(str, "<this>");
        d2ok.m23075h(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    @InterfaceC6234g
    private static final InputStreamReader t8r(InputStream inputStream, Charset charset) {
        d2ok.m23075h(inputStream, "<this>");
        d2ok.m23075h(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @InterfaceC6234g
    private static final BufferedOutputStream toq(OutputStream outputStream, int i2) {
        d2ok.m23075h(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i2);
    }

    public static /* synthetic */ long x2(InputStream inputStream, OutputStream outputStream, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return ld6(inputStream, outputStream, i2);
    }

    /* JADX INFO: renamed from: y */
    static /* synthetic */ BufferedWriter m23020y(OutputStream outputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(outputStream, "<this>");
        d2ok.m23075h(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    static /* synthetic */ OutputStreamWriter zurt(OutputStream outputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(outputStream, "<this>");
        d2ok.m23075h(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ BufferedInputStream zy(InputStream inputStream, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        d2ok.m23075h(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i2);
    }
}
