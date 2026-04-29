package kotlin.io.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.io.C6280z;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.jvm.internal.lv5;
import kotlin.sequences.fn3e;
import kotlin.text.C6433g;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PathReadWrite.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1313#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
class ki {
    public static /* synthetic */ void a9(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        jk(path, charSequence, charset, openOptionArr);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final List<String> cdj(Path path, Charset charset) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        d2ok.kja0(allLines, "readAllLines(this, charset)");
        return allLines;
    }

    public static /* synthetic */ void f7l8(Path path, CharSequence charSequence, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        m22955g(path, charSequence, charset);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final InputStreamReader fn3e(Path path, Charset charset, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final OutputStreamWriter fti(Path path, Charset charset, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ Object fu4(Path path, Charset charset, cyoe.x2 block, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(block, "block");
        BufferedReader it = Files.newBufferedReader(path, charset);
        try {
            d2ok.kja0(it, "it");
            Object objInvoke = block.invoke(C6280z.m23031y(it));
            d3.m23090q(1);
            kotlin.io.zy.m23032k(it, null);
            d3.zy(1);
            return objInvoke;
        } finally {
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: g */
    public static final void m22955g(@InterfaceC7396q Path path, @InterfaceC7396q CharSequence text, @InterfaceC7396q Charset charset) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(text, "text");
        d2ok.m23075h(charset, "charset");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        d2ok.kja0(outputStreamNewOutputStream, "newOutputStream(this, StandardOpenOption.APPEND)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.zy.m23032k(outputStreamWriter, null);
        } finally {
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: h */
    private static final byte[] m22956h(Path path) throws IOException {
        d2ok.m23075h(path, "<this>");
        byte[] allBytes = Files.readAllBytes(path);
        d2ok.kja0(allBytes, "readAllBytes(this)");
        return allBytes;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m22957i(Path path, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        return t8r(path, charset);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @yz(version = "1.5")
    public static final void jk(@InterfaceC7396q Path path, @InterfaceC7396q CharSequence text, @InterfaceC7396q Charset charset, @InterfaceC7396q OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(text, "text");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.zy.m23032k(outputStreamWriter, null);
        } finally {
        }
    }

    static /* synthetic */ OutputStreamWriter jp0y(Path path, Charset charset, OpenOption[] options, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: k */
    private static final void m22958k(Path path, byte[] array) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(array, "array");
        Files.write(path, array, StandardOpenOption.APPEND);
    }

    static /* synthetic */ List ki(Path path, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        d2ok.kja0(allLines, "readAllLines(this, charset)");
        return allLines;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final OutputStream kja0(Path path, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        return outputStreamNewOutputStream;
    }

    static /* synthetic */ BufferedWriter ld6(Path path, Charset charset, int i2, OpenOption[] options, int i3, Object obj) throws IOException {
        if ((i3 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i2);
    }

    static /* synthetic */ Path mcp(Path path, kotlin.sequences.qrj lines, Charset charset, OpenOption[] options, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(lines, "lines");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        Path pathWrite = Files.write(path, fn3e.m23431r(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(pathWrite, "write(this, lines.asIterable(), charset, *options)");
        return pathWrite;
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ Path m22959n(Path path, kotlin.sequences.qrj lines, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(lines, "lines");
        d2ok.m23075h(charset, "charset");
        Path pathWrite = Files.write(path, fn3e.m23431r(lines), charset, StandardOpenOption.APPEND);
        d2ok.kja0(pathWrite, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final InputStream n7h(Path path, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(inputStreamNewInputStream, "newInputStream(this, *options)");
        return inputStreamNewInputStream;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final <T> T ni7(Path path, Charset charset, cyoe.x2<? super kotlin.sequences.qrj<String>, ? extends T> block) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(block, "block");
        BufferedReader it = Files.newBufferedReader(path, charset);
        try {
            d2ok.kja0(it, "it");
            T tInvoke = block.invoke(C6280z.m23031y(it));
            d3.m23090q(1);
            kotlin.io.zy.m23032k(it, null);
            d3.zy(1);
            return tInvoke;
        } finally {
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path o1t(Path path, Iterable<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(lines, "lines");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        Path pathWrite = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(pathWrite, "write(this, lines, charset, *options)");
        return pathWrite;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: p */
    private static final BufferedWriter m22960p(Path path, Charset charset, int i2, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i2);
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ Path m22961q(Path path, Iterable lines, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(lines, "lines");
        d2ok.m23075h(charset, "charset");
        Path pathWrite = Files.write(path, lines, charset, StandardOpenOption.APPEND);
        d2ok.kja0(pathWrite, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    static /* synthetic */ void qrj(Path path, Charset charset, cyoe.x2 action, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(action, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        d2ok.kja0(bufferedReaderNewBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = C6280z.m23031y(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            was wasVar = was.f36763k;
            d3.m23090q(1);
            kotlin.io.zy.m23032k(bufferedReaderNewBufferedReader, null);
            d3.zy(1);
        } finally {
        }
    }

    /* JADX INFO: renamed from: s */
    static /* synthetic */ BufferedReader m22962s(Path path, Charset charset, int i2, OpenOption[] options, int i3, Object obj) throws IOException {
        if ((i3 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i2);
    }

    /* JADX INFO: renamed from: t */
    static /* synthetic */ Path m22963t(Path path, Iterable lines, Charset charset, OpenOption[] options, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(lines, "lines");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        Path pathWrite = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(pathWrite, "write(this, lines, charset, *options)");
        return pathWrite;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final String t8r(@InterfaceC7396q Path path, @InterfaceC7396q Charset charset) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String strLd6 = C6280z.ld6(inputStreamReader);
            kotlin.io.zy.m23032k(inputStreamReader, null);
            return strLd6;
        } finally {
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path toq(Path path, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(lines, "lines");
        d2ok.m23075h(charset, "charset");
        Path pathWrite = Files.write(path, lines, charset, StandardOpenOption.APPEND);
        d2ok.kja0(pathWrite, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path wvg(Path path, kotlin.sequences.qrj<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(lines, "lines");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        Path pathWrite = Files.write(path, fn3e.m23431r(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(pathWrite, "write(this, lines.asIterable(), charset, *options)");
        return pathWrite;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final void x2(Path path, Charset charset, cyoe.x2<? super String, was> action) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(action, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        d2ok.kja0(bufferedReaderNewBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = C6280z.m23031y(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            was wasVar = was.f36763k;
            d3.m23090q(1);
            kotlin.io.zy.m23032k(bufferedReaderNewBufferedReader, null);
            d3.zy(1);
        } finally {
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: y */
    private static final BufferedReader m22964y(Path path, Charset charset, int i2, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i2);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: z */
    private static final void m22965z(Path path, byte[] array, OpenOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(array, "array");
        d2ok.m23075h(options, "options");
        Files.write(path, array, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    static /* synthetic */ InputStreamReader zurt(Path path, Charset charset, OpenOption[] options, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(options, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path zy(Path path, kotlin.sequences.qrj<? extends CharSequence> lines, Charset charset) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(lines, "lines");
        d2ok.m23075h(charset, "charset");
        Path pathWrite = Files.write(path, fn3e.m23431r(lines), charset, StandardOpenOption.APPEND);
        d2ok.kja0(pathWrite, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return pathWrite;
    }
}
