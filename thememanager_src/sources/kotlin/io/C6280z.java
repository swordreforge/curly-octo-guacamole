package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6433g;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.z */
/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1313#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
@InterfaceC6769y(name = "TextStreamsKt")
public final class C6280z {

    /* JADX INFO: renamed from: kotlin.io.z$k */
    /* JADX INFO: compiled from: ReadWrite.kt */
    static final class k extends AbstractC6308r implements cyoe.x2<String, was> {
        final /* synthetic */ ArrayList<String> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList<String> arrayList) {
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

    public static final void f7l8(@InterfaceC7396q Reader reader, @InterfaceC7396q cyoe.x2<? super String, was> action) {
        d2ok.m23075h(reader, "<this>");
        d2ok.m23075h(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = m23031y(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            was wasVar = was.f36763k;
            zy.m23032k(bufferedReader, null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ long m23025g(Reader reader, Writer writer, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return m23027n(reader, writer, i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final BufferedReader m23026k(Reader reader, int i2) {
        d2ok.m23075h(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i2);
    }

    public static final <T> T kja0(@InterfaceC7396q Reader reader, @InterfaceC7396q cyoe.x2<? super kotlin.sequences.qrj<String>, ? extends T> block) {
        d2ok.m23075h(reader, "<this>");
        d2ok.m23075h(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T tInvoke = block.invoke(m23031y(bufferedReader));
            d3.m23090q(1);
            zy.m23032k(bufferedReader, null);
            d3.zy(1);
            return tInvoke;
        } finally {
        }
    }

    @InterfaceC7396q
    public static final String ld6(@InterfaceC7396q Reader reader) {
        d2ok.m23075h(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m23025g(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        d2ok.kja0(string, "buffer.toString()");
        return string;
    }

    /* JADX INFO: renamed from: n */
    public static final long m23027n(@InterfaceC7396q Reader reader, @InterfaceC7396q Writer out, int i2) throws IOException {
        d2ok.m23075h(reader, "<this>");
        d2ok.m23075h(out, "out");
        char[] cArr = new char[i2];
        int i3 = reader.read(cArr);
        long j2 = 0;
        while (i3 >= 0) {
            out.write(cArr, 0, i3);
            j2 += (long) i3;
            i3 = reader.read(cArr);
        }
        return j2;
    }

    @InterfaceC6234g
    private static final StringReader n7h(String str) {
        d2ok.m23075h(str, "<this>");
        return new StringReader(str);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final List<String> m23028p(@InterfaceC7396q Reader reader) {
        d2ok.m23075h(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        f7l8(reader, new k(arrayList));
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ BufferedWriter m23029q(Writer writer, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        d2ok.m23075h(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i2);
    }

    static /* synthetic */ String qrj(URL url, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        d2ok.m23075h(url, "<this>");
        d2ok.m23075h(charset, "charset");
        return new String(m23030s(url), charset);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final byte[] m23030s(@InterfaceC7396q URL url) throws IOException {
        d2ok.m23075h(url, "<this>");
        InputStream it = url.openStream();
        try {
            d2ok.kja0(it, "it");
            byte[] bArrM23013h = toq.m23013h(it);
            zy.m23032k(it, null);
            return bArrM23013h;
        } finally {
        }
    }

    @InterfaceC6234g
    private static final BufferedWriter toq(Writer writer, int i2) {
        d2ok.m23075h(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i2);
    }

    @InterfaceC6234g
    private static final String x2(URL url, Charset charset) {
        d2ok.m23075h(url, "<this>");
        d2ok.m23075h(charset, "charset");
        return new String(m23030s(url), charset);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final kotlin.sequences.qrj<String> m23031y(@InterfaceC7396q BufferedReader bufferedReader) {
        d2ok.m23075h(bufferedReader, "<this>");
        return kotlin.sequences.t8r.m23472g(new t8r(bufferedReader));
    }

    static /* synthetic */ BufferedReader zy(Reader reader, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8192;
        }
        d2ok.m23075h(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i2);
    }
}
