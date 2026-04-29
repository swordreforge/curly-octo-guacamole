package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okhttp3.jk;
import okhttp3.zurt;

/* JADX INFO: renamed from: okhttp3.internal.http.s */
/* JADX INFO: compiled from: RequestLine.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7462s {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7462s f43150k = new C7462s();

    private C7462s() {
    }

    private final boolean toq(jk jkVar, Proxy.Type type) {
        return !jkVar.x2() && type == Proxy.Type.HTTP;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final String m27093k(@InterfaceC7396q jk request, @InterfaceC7396q Proxy.Type proxyType) {
        d2ok.m23075h(request, "request");
        d2ok.m23075h(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.qrj());
        sb.append(' ');
        C7462s c7462s = f43150k;
        if (c7462s.toq(request, proxyType)) {
            sb.append(request.cdj());
        } else {
            sb.append(c7462s.zy(request.cdj()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC7396q
    public final String zy(@InterfaceC7396q zurt url) {
        d2ok.m23075h(url, "url");
        String strFu4 = url.fu4();
        String strO1t = url.o1t();
        if (strO1t == null) {
            return strFu4;
        }
        return strFu4 + '?' + strO1t;
    }
}
