package okio;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: loaded from: classes4.dex */
public final class d2ok {
    @InterfaceC7396q
    public static final vyq cdj(@InterfaceC7396q Socket socket) throws IOException {
        return lvui.kja0(socket);
    }

    @InterfaceC7396q
    public static final cdj f7l8(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q Cipher cipher) {
        return lvui.m27791n(nn86Var, cipher);
    }

    @InterfaceC7396q
    public static final nn86 fn3e(@InterfaceC7396q InputStream inputStream) {
        return lvui.t8r(inputStream);
    }

    public static final <T extends Closeable, R> R fu4(T t2, @InterfaceC7396q cyoe.x2<? super T, ? extends R> x2Var) {
        return (R) C7574r.m27850q(t2, x2Var);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final C7546h m27588g(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q Cipher cipher) {
        return lvui.m27793q(vyqVar, cipher);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final vyq m27589h(@InterfaceC7396q OutputStream outputStream) {
        return lvui.n7h(outputStream);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public static final nn86 m27590i(@InterfaceC7396q File file) throws FileNotFoundException {
        return lvui.ki(file);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final vyq m27591k(@InterfaceC7396q File file) throws FileNotFoundException {
        return lvui.toq(file);
    }

    @InterfaceC7396q
    public static final vyq ki(@InterfaceC7396q Path path, @InterfaceC7396q OpenOption... openOptionArr) throws IOException {
        return lvui.m27788h(path, openOptionArr);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final vyq kja0(@InterfaceC7396q File file, boolean z2) throws FileNotFoundException {
        return lvui.qrj(file, z2);
    }

    @InterfaceC7396q
    public static final jk ld6(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q Mac mac) {
        return lvui.m27794s(nn86Var, mac);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final n7h m27592n(@InterfaceC7396q nn86 nn86Var) {
        return C7574r.zy(nn86Var);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final vyq n7h(@InterfaceC7396q File file) throws FileNotFoundException {
        return lvui.x2(file);
    }

    @InterfaceC7396q
    public static final nn86 ni7(@InterfaceC7396q Path path, @InterfaceC7396q OpenOption... openOptionArr) throws IOException {
        return lvui.fn3e(path, openOptionArr);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final jk m27593p(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q MessageDigest messageDigest) {
        return lvui.m27795y(nn86Var, messageDigest);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final qrj m27594q(@InterfaceC7396q vyq vyqVar) {
        return C7574r.toq(vyqVar);
    }

    @InterfaceC7396q
    public static final zurt qrj(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q ncyb ncybVar) throws IOException {
        return lvui.ld6(zurtVar, ncybVar);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final mcp m27595s(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q Mac mac) {
        return lvui.f7l8(vyqVar, mac);
    }

    @InterfaceC7396q
    public static final zurt toq(@InterfaceC7396q ClassLoader classLoader) {
        return lvui.zy(classLoader);
    }

    public static final boolean x2(@InterfaceC7396q AssertionError assertionError) {
        return lvui.m27792p(assertionError);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final mcp m27596y(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q MessageDigest messageDigest) {
        return lvui.m27787g(vyqVar, messageDigest);
    }

    @InterfaceC7396q
    public static final nn86 zurt(@InterfaceC7396q Socket socket) throws IOException {
        return lvui.m27789i(socket);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "blackhole")
    public static final vyq zy() {
        return C7574r.m27849k();
    }
}
