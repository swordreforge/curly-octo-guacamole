package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import l05.InterfaceC6768s;
import mub.InterfaceC7396q;
import okio.internal.C7553p;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class lvui {

    /* JADX INFO: renamed from: k */
    private static final Logger f43792k = Logger.getLogger("okio.Okio");

    public static /* synthetic */ vyq cdj(File file, boolean z2, int i2, Object obj) throws FileNotFoundException {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return d2ok.kja0(file, z2);
    }

    @InterfaceC7396q
    public static final mcp f7l8(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q Mac mac) {
        kotlin.jvm.internal.d2ok.m23075h(vyqVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(mac, "mac");
        return new mcp(vyqVar, mac);
    }

    @InterfaceC7396q
    public static final nn86 fn3e(@InterfaceC7396q Path path, @InterfaceC7396q OpenOption... options) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.d2ok.kja0(inputStreamNewInputStream, "newInputStream(...)");
        return d2ok.fn3e(inputStreamNewInputStream);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final mcp m27787g(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q MessageDigest digest) {
        kotlin.jvm.internal.d2ok.m23075h(vyqVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(digest, "digest");
        return new mcp(vyqVar, digest);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final vyq m27788h(@InterfaceC7396q Path path, @InterfaceC7396q OpenOption... options) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.d2ok.kja0(outputStreamNewOutputStream, "newOutputStream(...)");
        return d2ok.m27589h(outputStreamNewOutputStream);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public static final nn86 m27789i(@InterfaceC7396q Socket socket) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(socket, "<this>");
        C7543e c7543e = new C7543e(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.d2ok.kja0(inputStream, "getInputStream(...)");
        return c7543e.a9(new fti(inputStream, c7543e));
    }

    @InterfaceC7396q
    public static final nn86 ki(@InterfaceC7396q File file) throws FileNotFoundException {
        kotlin.jvm.internal.d2ok.m23075h(file, "<this>");
        return new fti(new FileInputStream(file), C7560j.f43770n);
    }

    @InterfaceC7396q
    public static final vyq kja0(@InterfaceC7396q Socket socket) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(socket, "<this>");
        C7543e c7543e = new C7543e(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.d2ok.kja0(outputStream, "getOutputStream(...)");
        return c7543e.jk(new x9kr(outputStream, c7543e));
    }

    @InterfaceC7396q
    public static final zurt ld6(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q ncyb zipPath) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(zurtVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(zipPath, "zipPath");
        return okio.internal.x2.m27744n(zipPath, zurtVar, null, 4, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final cdj m27791n(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q Cipher cipher) {
        kotlin.jvm.internal.d2ok.m23075h(nn86Var, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(cipher, "cipher");
        return new cdj(d2ok.m27592n(nn86Var), cipher);
    }

    @InterfaceC7396q
    public static final vyq n7h(@InterfaceC7396q OutputStream outputStream) {
        kotlin.jvm.internal.d2ok.m23075h(outputStream, "<this>");
        return new x9kr(outputStream, new C7560j());
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m27792p(@InterfaceC7396q AssertionError assertionError) {
        kotlin.jvm.internal.d2ok.m23075h(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? kotlin.text.fti.lk(message, "getsockname failed", false, 2, null) : false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final C7546h m27793q(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q Cipher cipher) {
        kotlin.jvm.internal.d2ok.m23075h(vyqVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(cipher, "cipher");
        return new C7546h(d2ok.m27594q(vyqVar), cipher);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final vyq qrj(@InterfaceC7396q File file, boolean z2) throws FileNotFoundException {
        kotlin.jvm.internal.d2ok.m23075h(file, "<this>");
        return d2ok.m27589h(new FileOutputStream(file, z2));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final jk m27794s(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q Mac mac) {
        kotlin.jvm.internal.d2ok.m23075h(nn86Var, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(mac, "mac");
        return new jk(nn86Var, mac);
    }

    @InterfaceC7396q
    public static final nn86 t8r(@InterfaceC7396q InputStream inputStream) {
        kotlin.jvm.internal.d2ok.m23075h(inputStream, "<this>");
        return new fti(inputStream, new C7560j());
    }

    @InterfaceC7396q
    public static final vyq toq(@InterfaceC7396q File file) throws FileNotFoundException {
        kotlin.jvm.internal.d2ok.m23075h(file, "<this>");
        return d2ok.m27589h(new FileOutputStream(file, true));
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final vyq x2(@InterfaceC7396q File file) throws FileNotFoundException {
        kotlin.jvm.internal.d2ok.m23075h(file, "<this>");
        return cdj(file, false, 1, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final jk m27795y(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q MessageDigest digest) {
        kotlin.jvm.internal.d2ok.m23075h(nn86Var, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(digest, "digest");
        return new jk(nn86Var, digest);
    }

    @InterfaceC7396q
    public static final zurt zy(@InterfaceC7396q ClassLoader classLoader) {
        kotlin.jvm.internal.d2ok.m23075h(classLoader, "<this>");
        return new C7553p(classLoader, true, null, 4, null);
    }
}
