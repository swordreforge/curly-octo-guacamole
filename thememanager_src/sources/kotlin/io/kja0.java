package kotlin.io;

import cyoe.InterfaceC5979h;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6433g;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n231#1:234\n1#2:233\n1#2:235\n*S KotlinDebug\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n*L\n230#1:234\n230#1:235\n*E\n"})
public class kja0 extends n7h {

    /* JADX INFO: renamed from: kotlin.io.kja0$k */
    /* JADX INFO: compiled from: FileReadWrite.kt */
    static final class C6255k extends AbstractC6308r implements cyoe.x2<String, was> {
        final /* synthetic */ ArrayList<String> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6255k(ArrayList<String> arrayList) {
            super(1);
            this.$result = arrayList;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(String str) {
            invoke2(str);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q String it) {
            d2ok.m23075h(it, "it");
            this.$result.add(it);
        }
    }

    public static final void a9(@InterfaceC7396q File file, @InterfaceC7396q byte[] array) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            was wasVar = was.f36763k;
            zy.m23032k(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void cdj(File file, Charset charset, cyoe.x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        m22923h(file, charset, x2Var);
    }

    static /* synthetic */ OutputStreamWriter d3(File file, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void f7l8(@InterfaceC7396q File file, @InterfaceC7396q byte[] array) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            was wasVar = was.f36763k;
            zy.m23032k(fileOutputStream, null);
        } finally {
        }
    }

    static /* synthetic */ PrintWriter fn3e(File file, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    public static final void fti(@InterfaceC7396q File file, @InterfaceC7396q String text, @InterfaceC7396q Charset charset) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(text, "text");
        d2ok.m23075h(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        a9(file, bytes);
    }

    public static /* synthetic */ List fu4(File file, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        return ni7(file, charset);
    }

    @InterfaceC6234g
    private static final OutputStreamWriter gvn7(File file, Charset charset) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* JADX INFO: renamed from: h */
    public static final void m22923h(@InterfaceC7396q File file, @InterfaceC7396q Charset charset, @InterfaceC7396q cyoe.x2<? super String, was> action) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(action, "action");
        C6280z.f7l8(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: i */
    private static final PrintWriter m22924i(File file, Charset charset) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    public static /* synthetic */ Object jk(File file, Charset charset, cyoe.x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Object objInvoke = x2Var.invoke(C6280z.m23031y(bufferedReader));
            d3.m23090q(1);
            zy.m23032k(bufferedReader, null);
            d3.zy(1);
            return objInvoke;
        } finally {
        }
    }

    public static /* synthetic */ void jp0y(File file, String str, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        fti(file, str, charset);
    }

    @InterfaceC6234g
    private static final FileInputStream ki(File file) {
        d2ok.m23075h(file, "<this>");
        return new FileInputStream(file);
    }

    public static final void kja0(@InterfaceC7396q File file, @InterfaceC7396q InterfaceC5979h<? super byte[], ? super Integer, was> action) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(action, "action");
        n7h(file, 4096, action);
    }

    static /* synthetic */ BufferedReader ld6(File file, Charset charset, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i2);
    }

    public static final <T> T mcp(@InterfaceC7396q File file, @InterfaceC7396q Charset charset, @InterfaceC7396q cyoe.x2<? super kotlin.sequences.qrj<String>, ? extends T> block) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        d2ok.m23075h(block, "block");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            T tInvoke = block.invoke(C6280z.m23031y(bufferedReader));
            d3.m23090q(1);
            zy.m23032k(bufferedReader, null);
            d3.zy(1);
            return tInvoke;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void n7h(@InterfaceC7396q File file, int i2, @InterfaceC7396q InterfaceC5979h<? super byte[], ? super Integer, was> action) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(action, "action");
        ?? r2 = new byte[kotlin.ranges.fn3e.fn3e(i2, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i3 = fileInputStream.read(r2);
                if (i3 <= 0) {
                    was wasVar = was.f36763k;
                    zy.m23032k(fileInputStream, null);
                    return;
                }
                action.invoke(r2, Integer.valueOf(i3));
            } finally {
            }
        }
    }

    @InterfaceC7396q
    public static final List<String> ni7(@InterfaceC7396q File file, @InterfaceC7396q Charset charset) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        ArrayList arrayList = new ArrayList();
        m22923h(file, charset, new C6255k(arrayList));
        return arrayList;
    }

    public static /* synthetic */ String o1t(File file, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        return m22929z(file, charset);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final BufferedReader m22925p(File file, Charset charset, int i2) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i2);
    }

    static /* synthetic */ BufferedWriter qrj(File file, Charset charset, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m22926s(File file, String str, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        m22928y(file, str, charset);
    }

    /* JADX INFO: renamed from: t */
    static /* synthetic */ InputStreamReader m22927t(File file, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    @InterfaceC6234g
    private static final FileOutputStream t8r(File file) {
        d2ok.m23075h(file, "<this>");
        return new FileOutputStream(file);
    }

    @InterfaceC6234g
    private static final InputStreamReader wvg(File file, Charset charset) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    @InterfaceC6234g
    private static final BufferedWriter x2(File file, Charset charset, int i2) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i2);
    }

    /* JADX INFO: renamed from: y */
    public static final void m22928y(@InterfaceC7396q File file, @InterfaceC7396q String text, @InterfaceC7396q Charset charset) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(text, "text");
        d2ok.m23075h(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        f7l8(file, bytes);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public static final String m22929z(@InterfaceC7396q File file, @InterfaceC7396q Charset charset) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strLd6 = C6280z.ld6(inputStreamReader);
            zy.m23032k(inputStreamReader, null);
            return strLd6;
        } finally {
        }
    }

    @InterfaceC7396q
    public static final byte[] zurt(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i2 = (int) length;
            byte[] bArrY2 = new byte[i2];
            int i3 = i2;
            int i4 = 0;
            while (i3 > 0) {
                int i5 = fileInputStream.read(bArrY2, i4, i3);
                if (i5 < 0) {
                    break;
                }
                i3 -= i5;
                i4 += i5;
            }
            if (i3 > 0) {
                bArrY2 = Arrays.copyOf(bArrY2, i4);
                d2ok.kja0(bArrY2, "copyOf(this, newSize)");
            } else {
                int i6 = fileInputStream.read();
                if (i6 != -1) {
                    f7l8 f7l8Var = new f7l8(8193);
                    f7l8Var.write(i6);
                    toq.x2(fileInputStream, f7l8Var, 0, 2, null);
                    int size = f7l8Var.size() + i2;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM22917k = f7l8Var.m22917k();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrY2, size);
                    d2ok.kja0(bArrCopyOf, "copyOf(this, newSize)");
                    bArrY2 = kotlin.collections.kja0.y2(bArrM22917k, bArrCopyOf, i2, 0, f7l8Var.size());
                }
            }
            zy.m23032k(fileInputStream, null);
            return bArrY2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                zy.m23032k(fileInputStream, th);
                throw th2;
            }
        }
    }
}
