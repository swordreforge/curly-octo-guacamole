package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: -DeprecatedOkio.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.ld6(message = "changed in Okio 2.x")
public final class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final zy f43862k = new zy();

    private zy() {
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "socket.sink()", imports = {"okio.sink"}))
    public final vyq f7l8(@InterfaceC7396q Socket socket) {
        kotlin.jvm.internal.d2ok.m23075h(socket, "socket");
        return d2ok.cdj(socket);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "outputStream.sink()", imports = {"okio.sink"}))
    /* JADX INFO: renamed from: g */
    public final vyq m27887g(@InterfaceC7396q OutputStream outputStream) {
        kotlin.jvm.internal.d2ok.m23075h(outputStream, "outputStream");
        return d2ok.m27589h(outputStream);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    /* JADX INFO: renamed from: k */
    public final vyq m27888k(@InterfaceC7396q File file) {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return d2ok.m27591k(file);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "socket.source()", imports = {"okio.source"}))
    public final nn86 ld6(@InterfaceC7396q Socket socket) {
        kotlin.jvm.internal.d2ok.m23075h(socket, "socket");
        return d2ok.zurt(socket);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "file.sink()", imports = {"okio.sink"}))
    /* JADX INFO: renamed from: n */
    public final vyq m27889n(@InterfaceC7396q File file) {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return lvui.cdj(file, false, 1, null);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "inputStream.source()", imports = {"okio.source"}))
    /* JADX INFO: renamed from: p */
    public final nn86 m27890p(@InterfaceC7396q InputStream inputStream) {
        kotlin.jvm.internal.d2ok.m23075h(inputStream, "inputStream");
        return d2ok.fn3e(inputStream);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "source.buffer()", imports = {"okio.buffer"}))
    /* JADX INFO: renamed from: q */
    public final n7h m27891q(@InterfaceC7396q nn86 source) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        return d2ok.m27592n(source);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "file.source()", imports = {"okio.source"}))
    /* JADX INFO: renamed from: s */
    public final nn86 m27892s(@InterfaceC7396q File file) {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return d2ok.m27590i(file);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    public final vyq toq() {
        return d2ok.zy();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "path.source(*options)", imports = {"okio.source"}))
    public final nn86 x2(@InterfaceC7396q Path path, @InterfaceC7396q OpenOption... options) {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        kotlin.jvm.internal.d2ok.m23075h(options, "options");
        return d2ok.ni7(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "path.sink(*options)", imports = {"okio.sink"}))
    /* JADX INFO: renamed from: y */
    public final vyq m27893y(@InterfaceC7396q Path path, @InterfaceC7396q OpenOption... options) {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        kotlin.jvm.internal.d2ok.m23075h(options, "options");
        return d2ok.ki(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @kotlin.hb(expression = "sink.buffer()", imports = {"okio.buffer"}))
    public final qrj zy(@InterfaceC7396q vyq sink) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        return d2ok.m27594q(sink);
    }
}
