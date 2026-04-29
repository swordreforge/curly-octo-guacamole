package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.q */
/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "ConsoleKt")
public final class C6275q {
    @InterfaceC6234g
    private static final void cdj(long j2) {
        System.out.println(j2);
    }

    @InterfaceC6234g
    private static final void f7l8(Object obj) {
        System.out.print(obj);
    }

    @InterfaceC6234g
    private static final void fn3e(char[] message) {
        d2ok.m23075h(message, "message");
        System.out.println(message);
    }

    @InterfaceC7395n
    @yz(version = "1.6")
    public static final String fu4() {
        return zurt();
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final void m22994g(long j2) {
        System.out.print(j2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final void m22995h(int i2) {
        System.out.println(i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: i */
    private static final void m22996i(boolean z2) {
        System.out.println(z2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final void m22997k(byte b2) {
        System.out.print(Byte.valueOf(b2));
    }

    @InterfaceC6234g
    private static final void ki(Object obj) {
        System.out.println(obj);
    }

    @InterfaceC6234g
    private static final void kja0(float f2) {
        System.out.println(f2);
    }

    @InterfaceC6234g
    private static final void ld6() {
        System.out.println();
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final void m22998n(int i2) {
        System.out.print(i2);
    }

    @InterfaceC6234g
    private static final void n7h(double d2) {
        System.out.println(d2);
    }

    @InterfaceC7396q
    @yz(version = "1.6")
    public static final String ni7() {
        String strFu4 = fu4();
        if (strFu4 != null) {
            return strFu4;
        }
        throw new zurt("EOF has already been reached");
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final void m22999p(char[] message) {
        d2ok.m23075h(message, "message");
        System.out.print(message);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final void m23000q(float f2) {
        System.out.print(f2);
    }

    @InterfaceC6234g
    private static final void qrj(char c2) {
        System.out.println(c2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static final void m23001s(boolean z2) {
        System.out.print(z2);
    }

    @InterfaceC6234g
    private static final void t8r(short s2) {
        System.out.println(Short.valueOf(s2));
    }

    @InterfaceC6234g
    private static final void toq(char c2) {
        System.out.print(c2);
    }

    @InterfaceC6234g
    private static final void x2(byte b2) {
        System.out.println(Byte.valueOf(b2));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: y */
    private static final void m23002y(short s2) {
        System.out.print(Short.valueOf(s2));
    }

    @InterfaceC7395n
    public static final String zurt() {
        ki kiVar = ki.f36323k;
        InputStream inputStream = System.in;
        d2ok.kja0(inputStream, "`in`");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        d2ok.kja0(charsetDefaultCharset, "defaultCharset()");
        return kiVar.m22922q(inputStream, charsetDefaultCharset);
    }

    @InterfaceC6234g
    private static final void zy(double d2) {
        System.out.print(d2);
    }
}
