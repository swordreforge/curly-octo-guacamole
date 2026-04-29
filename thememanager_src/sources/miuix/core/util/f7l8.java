package miuix.core.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import miuix.core.util.qrj;

/* JADX INFO: compiled from: IOUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f87339f7l8;

    /* JADX INFO: renamed from: g */
    private static final qrj.InterfaceC7086g<StringWriter> f39857g;

    /* JADX INFO: renamed from: k */
    private static final int f39858k = 4096;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ThreadLocal<SoftReference<byte[]>> f87340toq = new ThreadLocal<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final ThreadLocal<SoftReference<char[]>> f87341zy = new ThreadLocal<>();

    /* JADX INFO: renamed from: q */
    private static final qrj.InterfaceC7086g<ByteArrayOutputStream> f39860q = qrj.m25614q(new C7077k(), 2);

    /* JADX INFO: renamed from: n */
    private static final qrj.InterfaceC7086g<CharArrayWriter> f39859n = qrj.m25614q(new toq(), 2);

    /* JADX INFO: renamed from: miuix.core.util.f7l8$k */
    /* JADX INFO: compiled from: IOUtils.java */
    class C7077k extends qrj.AbstractC7088n<ByteArrayOutputStream> {
        C7077k() {
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo25542q(ByteArrayOutputStream byteArrayOutputStream) {
            byteArrayOutputStream.reset();
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ByteArrayOutputStream mo25540k() {
            return new ByteArrayOutputStream();
        }
    }

    /* JADX INFO: compiled from: IOUtils.java */
    class toq extends qrj.AbstractC7088n<CharArrayWriter> {
        toq() {
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo25542q(CharArrayWriter charArrayWriter) {
            charArrayWriter.reset();
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public CharArrayWriter mo25540k() {
            return new CharArrayWriter();
        }
    }

    /* JADX INFO: compiled from: IOUtils.java */
    class zy extends qrj.AbstractC7088n<StringWriter> {
        zy() {
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo25542q(StringWriter stringWriter) {
            stringWriter.getBuffer().setLength(0);
        }

        @Override // miuix.core.util.qrj.AbstractC7088n
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public StringWriter mo25540k() {
            return new StringWriter();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        qrj.C7090s c7090sM25614q = qrj.m25614q(new zy(), 2);
        f39857g = c7090sM25614q;
        StringWriter stringWriter = (StringWriter) c7090sM25614q.mo25617k();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println();
        printWriter.flush();
        f87339f7l8 = stringWriter.toString();
        printWriter.close();
        c7090sM25614q.toq(stringWriter);
    }

    protected f7l8() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    public static void a9(OutputStream outputStream, char[] cArr) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes());
        }
    }

    public static byte[] cdj(InputStream inputStream) throws IOException {
        qrj.InterfaceC7086g<ByteArrayOutputStream> interfaceC7086g = f39860q;
        ByteArrayOutputStream byteArrayOutputStreamMo25617k = interfaceC7086g.mo25617k();
        m25528g(inputStream, byteArrayOutputStreamMo25617k);
        byte[] byteArray = byteArrayOutputStreamMo25617k.toByteArray();
        interfaceC7086g.toq(byteArrayOutputStreamMo25617k);
        return byteArray;
    }

    public static void d2ok(OutputStream outputStream, Collection<Object> collection, String str, String str2) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f87339f7l8;
        }
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(str2));
            }
            outputStream.write(str.getBytes(str2));
        }
    }

    public static void d3(Writer writer, byte[] bArr, String str) throws IOException {
        if (bArr != null) {
            writer.write((str == null || str.length() == 0) ? new String(bArr) : new String(bArr, str));
        }
    }

    public static void eqxt(OutputStream outputStream, Collection<Object> collection, String str) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f87339f7l8;
        }
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes());
            }
            outputStream.write(str.getBytes());
        }
    }

    public static long f7l8(Reader reader, Writer writer) throws IOException {
        char[] cArrQrj = qrj();
        long j2 = 0;
        while (true) {
            int i2 = reader.read(cArrQrj);
            if (i2 == -1) {
                writer.flush();
                return j2;
            }
            writer.write(cArrQrj, 0, i2);
            j2 += (long) i2;
        }
    }

    public static char[] fn3e(InputStream inputStream, String str) throws IOException {
        qrj.InterfaceC7086g<CharArrayWriter> interfaceC7086g = f39859n;
        CharArrayWriter charArrayWriterMo25617k = interfaceC7086g.mo25617k();
        m25535s(inputStream, charArrayWriterMo25617k, str);
        char[] charArray = charArrayWriterMo25617k.toCharArray();
        interfaceC7086g.toq(charArrayWriterMo25617k);
        return charArray;
    }

    public static void fti(OutputStream outputStream, char[] cArr, String str) throws IOException {
        if (cArr != null) {
            outputStream.write((str == null || str.length() == 0) ? new String(cArr).getBytes() : new String(cArr).getBytes(str));
        }
    }

    public static InputStream fu4(String str, String str2) throws UnsupportedEncodingException {
        return new ByteArrayInputStream((str2 == null || str2.length() == 0) ? str.getBytes() : str.getBytes(str2));
    }

    /* JADX INFO: renamed from: g */
    public static long m25528g(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArrX2 = x2();
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArrX2);
            if (i2 == -1) {
                outputStream.flush();
                return j2;
            }
            outputStream.write(bArrX2, 0, i2);
            j2 += (long) i2;
        }
    }

    public static void gvn7(Writer writer, byte[] bArr) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr));
        }
    }

    /* JADX INFO: renamed from: h */
    public static List<String> m25529h(Reader reader) throws IOException {
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    /* JADX INFO: renamed from: i */
    public static char[] m25530i(InputStream inputStream) throws IOException {
        qrj.InterfaceC7086g<CharArrayWriter> interfaceC7086g = f39859n;
        CharArrayWriter charArrayWriterMo25617k = interfaceC7086g.mo25617k();
        m25537y(inputStream, charArrayWriterMo25617k);
        char[] charArray = charArrayWriterMo25617k.toCharArray();
        interfaceC7086g.toq(charArrayWriterMo25617k);
        return charArray;
    }

    public static void jk(OutputStream outputStream, byte[] bArr) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static void jp0y(Writer writer, String str) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m25531k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] ki(Reader reader) throws IOException {
        qrj.InterfaceC7086g<ByteArrayOutputStream> interfaceC7086g = f39860q;
        ByteArrayOutputStream byteArrayOutputStreamMo25617k = interfaceC7086g.mo25617k();
        m25533p(reader, byteArrayOutputStreamMo25617k);
        byte[] byteArray = byteArrayOutputStreamMo25617k.toByteArray();
        interfaceC7086g.toq(byteArrayOutputStreamMo25617k);
        return byteArray;
    }

    public static List<String> kja0(InputStream inputStream, String str) throws IOException {
        return m25529h((str == null || str.length() == 0) ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, str));
    }

    public static void ld6(Reader reader, OutputStream outputStream, String str) throws IOException {
        f7l8(reader, (str == null || str.length() == 0) ? new OutputStreamWriter(outputStream) : new OutputStreamWriter(outputStream, str));
    }

    public static void lvui(Writer writer, Collection<Object> collection, String str) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f87339f7l8;
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static void mcp(OutputStream outputStream, String str, String str2) throws IOException {
        if (str != null) {
            outputStream.write((str2 == null || str2.length() == 0) ? str.getBytes() : str.getBytes(str2));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m25532n(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException unused) {
            }
        }
    }

    public static List<String> n7h(InputStream inputStream) throws IOException {
        return m25529h(new InputStreamReader(inputStream));
    }

    public static InputStream ni7(String str) {
        return new ByteArrayInputStream(str.getBytes());
    }

    public static String o1t(InputStream inputStream, String str) throws IOException {
        qrj.InterfaceC7086g<StringWriter> interfaceC7086g = f39857g;
        StringWriter stringWriterMo25617k = interfaceC7086g.mo25617k();
        m25535s(inputStream, stringWriterMo25617k, str);
        String string = stringWriterMo25617k.toString();
        interfaceC7086g.toq(stringWriterMo25617k);
        return string;
    }

    public static void oc(Writer writer, char[] cArr) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m25533p(Reader reader, OutputStream outputStream) throws IOException {
        f7l8(reader, new OutputStreamWriter(outputStream));
    }

    /* JADX INFO: renamed from: q */
    public static void m25534q(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    private static char[] qrj() {
        ThreadLocal<SoftReference<char[]>> threadLocal = f87341zy;
        SoftReference<char[]> softReference = threadLocal.get();
        char[] cArr = softReference != null ? softReference.get() : null;
        if (cArr != null) {
            return cArr;
        }
        char[] cArr2 = new char[4096];
        threadLocal.set(new SoftReference<>(cArr2));
        return cArr2;
    }

    /* JADX INFO: renamed from: s */
    public static void m25535s(InputStream inputStream, Writer writer, String str) throws IOException {
        f7l8((str == null || str.length() == 0) ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, str), writer);
    }

    /* JADX INFO: renamed from: t */
    public static void m25536t(OutputStream outputStream, String str) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes());
        }
    }

    public static byte[] t8r(Reader reader, String str) throws IOException {
        qrj.InterfaceC7086g<ByteArrayOutputStream> interfaceC7086g = f39860q;
        ByteArrayOutputStream byteArrayOutputStreamMo25617k = interfaceC7086g.mo25617k();
        ld6(reader, byteArrayOutputStreamMo25617k, str);
        byte[] byteArray = byteArrayOutputStreamMo25617k.toByteArray();
        interfaceC7086g.toq(byteArrayOutputStreamMo25617k);
        return byteArray;
    }

    public static void toq(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String wvg(Reader reader) throws IOException {
        qrj.InterfaceC7086g<StringWriter> interfaceC7086g = f39857g;
        StringWriter stringWriterMo25617k = interfaceC7086g.mo25617k();
        f7l8(reader, stringWriterMo25617k);
        String string = stringWriterMo25617k.toString();
        interfaceC7086g.toq(stringWriterMo25617k);
        return string;
    }

    private static byte[] x2() {
        ThreadLocal<SoftReference<byte[]>> threadLocal = f87340toq;
        SoftReference<byte[]> softReference = threadLocal.get();
        byte[] bArr = softReference != null ? softReference.get() : null;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4096];
        threadLocal.set(new SoftReference<>(bArr2));
        return bArr2;
    }

    /* JADX INFO: renamed from: y */
    public static void m25537y(InputStream inputStream, Writer writer) throws IOException {
        f7l8(new InputStreamReader(inputStream), writer);
    }

    /* JADX INFO: renamed from: z */
    public static String m25538z(InputStream inputStream) throws IOException {
        qrj.InterfaceC7086g<StringWriter> interfaceC7086g = f39857g;
        StringWriter stringWriterMo25617k = interfaceC7086g.mo25617k();
        m25537y(inputStream, stringWriterMo25617k);
        String string = stringWriterMo25617k.toString();
        interfaceC7086g.toq(stringWriterMo25617k);
        return string;
    }

    public static char[] zurt(Reader reader) throws IOException {
        qrj.InterfaceC7086g<CharArrayWriter> interfaceC7086g = f39859n;
        CharArrayWriter charArrayWriterMo25617k = interfaceC7086g.mo25617k();
        f7l8(reader, charArrayWriterMo25617k);
        char[] charArray = charArrayWriterMo25617k.toCharArray();
        interfaceC7086g.toq(charArrayWriterMo25617k);
        return charArray;
    }

    public static void zy(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException unused) {
            }
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
        }
    }
}
