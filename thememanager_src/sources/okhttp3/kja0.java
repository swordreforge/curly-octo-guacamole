package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6768s;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Credentials.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class kja0 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final kja0 f43486k = new kja0();

    private kja0() {
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: k */
    public static final String m27357k(@InterfaceC7396q String username, @InterfaceC7396q String password) {
        d2ok.m23075h(username, "username");
        d2ok.m23075h(password, "password");
        return zy(username, password, null, 4, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @l05.qrj
    public static final String toq(@InterfaceC7396q String username, @InterfaceC7396q String password, @InterfaceC7396q Charset charset) {
        d2ok.m23075h(username, "username");
        d2ok.m23075h(password, "password");
        d2ok.m23075h(charset, "charset");
        return "Basic " + okio.kja0.Companion.m27780p(username + ':' + password, charset).base64();
    }

    public static /* synthetic */ String zy(String str, String str2, Charset ISO_8859_1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            d2ok.kja0(ISO_8859_1, "ISO_8859_1");
        }
        return toq(str, str2, ISO_8859_1);
    }
}
