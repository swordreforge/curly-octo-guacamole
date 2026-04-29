package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.internal.InterfaceC6234g;
import kotlin.internal.InterfaceC6239n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.h */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6231h {
    @InterfaceC6234g
    private static final void f7l8(Throwable th, PrintStream stream) {
        kotlin.jvm.internal.d2ok.m23075h(th, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(stream, "stream");
        th.printStackTrace(stream);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final void m22844g(Throwable th) {
        kotlin.jvm.internal.d2ok.m23075h(th, "<this>");
        th.printStackTrace();
    }

    @yz(version = "1.1")
    @InterfaceC6239n
    /* JADX INFO: renamed from: k */
    public static void m22845k(@InterfaceC7396q Throwable th, @InterfaceC7396q Throwable exception) {
        kotlin.jvm.internal.d2ok.m23075h(th, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(exception, "exception");
        if (th != exception) {
            kotlin.internal.qrj.f36293k.mo22869k(th, exception);
        }
    }

    @yz(version = "1.4")
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m22846n(Throwable th) {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final List<Throwable> m22847q(@InterfaceC7396q Throwable th) {
        kotlin.jvm.internal.d2ok.m23075h(th, "<this>");
        return kotlin.internal.qrj.f36293k.mo22870q(th);
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    /* JADX INFO: renamed from: s */
    public static final String m22848s(@InterfaceC7396q Throwable th) {
        kotlin.jvm.internal.d2ok.m23075h(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "sw.toString()");
        return string;
    }

    @InterfaceC7396q
    public static final StackTraceElement[] toq(@InterfaceC7396q Throwable th) {
        kotlin.jvm.internal.d2ok.m23075h(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.d2ok.qrj(stackTrace);
        return stackTrace;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: y */
    private static final void m22849y(Throwable th, PrintWriter writer) {
        kotlin.jvm.internal.d2ok.m23075h(th, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(writer, "writer");
        th.printStackTrace(writer);
    }

    public static /* synthetic */ void zy(Throwable th) {
    }
}
