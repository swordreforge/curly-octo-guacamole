package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.text.C6433g;
import kotlin.yz;

/* JADX INFO: compiled from: Base64JVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class toq {
    @InterfaceC6246g
    @InterfaceC6234g
    @yz(version = "1.8")
    /* JADX INFO: renamed from: k */
    private static final byte[] m22908k(C6247k c6247k, CharSequence source, int i2, int i3) {
        d2ok.m23075h(c6247k, "<this>");
        d2ok.m23075h(source, "source");
        if (!(source instanceof String)) {
            return c6247k.m22896n(source, i2, i3);
        }
        c6247k.f7l8(source.length(), i2, i3);
        String strSubstring = ((String) source).substring(i2, i3);
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Charset charset = C6433g.f81920f7l8;
        d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strSubstring.getBytes(charset);
        d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @InterfaceC6246g
    @InterfaceC6234g
    @yz(version = "1.8")
    /* JADX INFO: renamed from: q */
    private static final String m22909q(C6247k c6247k, byte[] source, int i2, int i3) {
        d2ok.m23075h(c6247k, "<this>");
        d2ok.m23075h(source, "source");
        return new String(c6247k.m22899t(source, i2, i3), C6433g.f81920f7l8);
    }

    @InterfaceC6246g
    @InterfaceC6234g
    @yz(version = "1.8")
    private static final int toq(C6247k c6247k, byte[] source, byte[] destination, int i2, int i3, int i4) {
        d2ok.m23075h(c6247k, "<this>");
        d2ok.m23075h(source, "source");
        d2ok.m23075h(destination, "destination");
        return c6247k.zurt(source, destination, i2, i3, i4);
    }

    @InterfaceC6246g
    @InterfaceC6234g
    @yz(version = "1.8")
    private static final byte[] zy(C6247k c6247k, byte[] source, int i2, int i3) {
        d2ok.m23075h(c6247k, "<this>");
        d2ok.m23075h(source, "source");
        return c6247k.m22899t(source, i2, i3);
    }
}
