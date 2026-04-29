package kotlin.io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.encoding.y */
/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6250y {
    @InterfaceC7396q
    @InterfaceC6246g
    @yz(version = "1.8")
    /* JADX INFO: renamed from: k */
    public static final InputStream m22910k(@InterfaceC7396q InputStream inputStream, @InterfaceC7396q C6247k base64) {
        d2ok.m23075h(inputStream, "<this>");
        d2ok.m23075h(base64, "base64");
        return new C6249q(inputStream, base64);
    }

    @InterfaceC7396q
    @InterfaceC6246g
    @yz(version = "1.8")
    public static final OutputStream toq(@InterfaceC7396q OutputStream outputStream, @InterfaceC7396q C6247k base64) {
        d2ok.m23075h(outputStream, "<this>");
        d2ok.m23075h(base64, "base64");
        return new C6248n(outputStream, base64);
    }
}
