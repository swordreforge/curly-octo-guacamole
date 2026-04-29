package androidx.core.util;

import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.text.C6433g;
import kotlin.was;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.hyr;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0087\b\u001a\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u001e\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/c;", "name", "out", "Lkotlin/was;", "block", "q", "", "array", "n", "", "text", "Ljava/nio/charset/Charset;", "charset", C7704k.y.toq.f95579toq, "k", "toq", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class toq {
    public static /* synthetic */ void f7l8(AtomicFile atomicFile, String str, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            charset = C6433g.f81921toq;
        }
        m2998g(atomicFile, str, charset);
    }

    @hyr(17)
    /* JADX INFO: renamed from: g */
    public static final void m2998g(@InterfaceC7396q AtomicFile writeText, @InterfaceC7396q String text, @InterfaceC7396q Charset charset) throws IOException {
        d2ok.cdj(writeText, "$this$writeText");
        d2ok.cdj(text, "text");
        d2ok.cdj(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        d2ok.m23085y(bytes, "(this as java.lang.String).getBytes(charset)");
        m3000n(writeText, bytes);
    }

    @InterfaceC7396q
    @hyr(17)
    /* JADX INFO: renamed from: k */
    public static final byte[] m2999k(@InterfaceC7396q AtomicFile readBytes) throws IOException {
        d2ok.cdj(readBytes, "$this$readBytes");
        byte[] fully = readBytes.readFully();
        d2ok.m23085y(fully, "readFully()");
        return fully;
    }

    @hyr(17)
    /* JADX INFO: renamed from: n */
    public static final void m3000n(@InterfaceC7396q AtomicFile writeBytes, @InterfaceC7396q byte[] array) throws IOException {
        d2ok.cdj(writeBytes, "$this$writeBytes");
        d2ok.cdj(array, "array");
        FileOutputStream stream = writeBytes.startWrite();
        try {
            d2ok.m23085y(stream, "stream");
            stream.write(array);
            writeBytes.finishWrite(stream);
        } catch (Throwable th) {
            writeBytes.failWrite(stream);
            throw th;
        }
    }

    @hyr(17)
    /* JADX INFO: renamed from: q */
    public static final void m3001q(@InterfaceC7396q AtomicFile tryWrite, @InterfaceC7396q cyoe.x2<? super FileOutputStream, was> block) throws IOException {
        d2ok.cdj(tryWrite, "$this$tryWrite");
        d2ok.cdj(block, "block");
        FileOutputStream stream = tryWrite.startWrite();
        try {
            d2ok.m23085y(stream, "stream");
            block.invoke(stream);
            kotlin.jvm.internal.d3.m23090q(1);
            tryWrite.finishWrite(stream);
            kotlin.jvm.internal.d3.zy(1);
        } catch (Throwable th) {
            kotlin.jvm.internal.d3.m23090q(1);
            tryWrite.failWrite(stream);
            kotlin.jvm.internal.d3.zy(1);
            throw th;
        }
    }

    @InterfaceC7396q
    @hyr(17)
    public static final String toq(@InterfaceC7396q AtomicFile readText, @InterfaceC7396q Charset charset) throws IOException {
        d2ok.cdj(readText, "$this$readText");
        d2ok.cdj(charset, "charset");
        byte[] fully = readText.readFully();
        d2ok.m23085y(fully, "readFully()");
        return new String(fully, charset);
    }

    public static /* synthetic */ String zy(AtomicFile atomicFile, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        return toq(atomicFile, charset);
    }
}
