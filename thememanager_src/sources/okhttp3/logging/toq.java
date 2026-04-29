package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7437i;
import okhttp3.InterfaceC7519n;
import okhttp3.InterfaceC7525p;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.ki;
import okhttp3.logging.C7516k;
import okhttp3.mcp;
import okhttp3.zurt;

/* JADX INFO: compiled from: LoggingEventListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class toq extends ki {

    /* JADX INFO: renamed from: q */
    private long f43494q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final C7516k.toq f94067zy;

    private toq(C7516k.toq toqVar) {
        this.f94067zy = toqVar;
    }

    public /* synthetic */ toq(C7516k.toq toqVar, ni7 ni7Var) {
        this(toqVar);
    }

    private final void jk(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f43494q);
        this.f94067zy.mo27364k('[' + millis + " ms] " + str);
    }

    @Override // okhttp3.ki
    public void cdj(@InterfaceC7396q InterfaceC7519n call, long j2) {
        d2ok.m23075h(call, "call");
        jk("requestBodyEnd: byteCount=" + j2);
    }

    @Override // okhttp3.ki
    public void f7l8(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        jk("canceled");
    }

    @Override // okhttp3.ki
    public void fn3e(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        jk("requestHeadersStart");
    }

    @Override // okhttp3.ki
    public void fu4(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q IOException ioe) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(ioe, "ioe");
        jk("responseFailed: " + ioe);
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: g */
    public void mo27346g(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        this.f43494q = System.nanoTime();
        jk("callStart: " + call.zy());
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: h */
    public void mo27347h(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q zurt url) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(url, "url");
        jk("proxySelectStart: " + url);
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: i */
    public void mo27348i(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q jk request) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(request, "request");
        jk("requestHeadersEnd");
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: k */
    public void mo27349k(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q fti cachedResponse) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(cachedResponse, "cachedResponse");
        jk("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.ki
    public void ki(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        jk("requestBodyStart");
    }

    @Override // okhttp3.ki
    public void kja0(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q zurt url, @InterfaceC7396q List<? extends Proxy> proxies) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(url, "url");
        d2ok.m23075h(proxies, "proxies");
        jk("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.ki
    public void ld6(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q InterfaceC7525p connection) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(connection, "connection");
        jk("connectionAcquired: " + connection);
    }

    @Override // okhttp3.ki
    public void mcp(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        jk("secureConnectStart");
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: n */
    public void mo27350n(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q IOException ioe) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(ioe, "ioe");
        jk("callFailed: " + ioe);
    }

    @Override // okhttp3.ki
    public void n7h(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q String domainName) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(domainName, "domainName");
        jk("dnsStart: " + domainName);
    }

    @Override // okhttp3.ki
    public void ni7(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        jk("responseBodyStart");
    }

    @Override // okhttp3.ki
    public void o1t(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        jk("responseHeadersStart");
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: p */
    public void mo27351p(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q InetSocketAddress inetSocketAddress, @InterfaceC7396q Proxy proxy) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(inetSocketAddress, "inetSocketAddress");
        d2ok.m23075h(proxy, "proxy");
        jk("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: q */
    public void mo27352q(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        jk("callEnd");
    }

    @Override // okhttp3.ki
    public void qrj(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q String domainName, @InterfaceC7396q List<? extends InetAddress> inetAddressList) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(domainName, "domainName");
        d2ok.m23075h(inetAddressList, "inetAddressList");
        jk("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: s */
    public void mo27353s(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q InetSocketAddress inetSocketAddress, @InterfaceC7396q Proxy proxy, @InterfaceC7395n mcp mcpVar, @InterfaceC7396q IOException ioe) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(inetSocketAddress, "inetSocketAddress");
        d2ok.m23075h(proxy, "proxy");
        d2ok.m23075h(ioe, "ioe");
        jk("connectFailed: " + mcpVar + ' ' + ioe);
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: t */
    public void mo27354t(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7395n C7437i c7437i) {
        d2ok.m23075h(call, "call");
        jk("secureConnectEnd: " + c7437i);
    }

    @Override // okhttp3.ki
    public void t8r(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q IOException ioe) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(ioe, "ioe");
        jk("requestFailed: " + ioe);
    }

    @Override // okhttp3.ki
    public void toq(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q fti response) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(response, "response");
        jk("cacheHit: " + response);
    }

    @Override // okhttp3.ki
    public void wvg(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q fti response) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(response, "response");
        jk("satisfactionFailure: " + response);
    }

    @Override // okhttp3.ki
    public void x2(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q InterfaceC7525p connection) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(connection, "connection");
        jk("connectionReleased");
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: y */
    public void mo27355y(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q InetSocketAddress inetSocketAddress, @InterfaceC7396q Proxy proxy, @InterfaceC7395n mcp mcpVar) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(inetSocketAddress, "inetSocketAddress");
        d2ok.m23075h(proxy, "proxy");
        jk("connectEnd: " + mcpVar);
    }

    @Override // okhttp3.ki
    /* JADX INFO: renamed from: z */
    public void mo27356z(@InterfaceC7396q InterfaceC7519n call, @InterfaceC7396q fti response) {
        d2ok.m23075h(call, "call");
        d2ok.m23075h(response, "response");
        jk("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.ki
    public void zurt(@InterfaceC7396q InterfaceC7519n call, long j2) {
        d2ok.m23075h(call, "call");
        jk("responseBodyEnd: byteCount=" + j2);
    }

    @Override // okhttp3.ki
    public void zy(@InterfaceC7396q InterfaceC7519n call) {
        d2ok.m23075h(call, "call");
        jk("cacheMiss");
    }

    /* JADX INFO: renamed from: okhttp3.logging.toq$k */
    /* JADX INFO: compiled from: LoggingEventListener.kt */
    public static class C7517k implements ki.zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C7516k.toq f43495k;

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6768s
        public C7517k() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @InterfaceC6768s
        public C7517k(@InterfaceC7396q C7516k.toq logger) {
            d2ok.m23075h(logger, "logger");
            this.f43495k = logger;
        }

        @Override // okhttp3.ki.zy
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public ki mo5773k(@InterfaceC7396q InterfaceC7519n call) {
            d2ok.m23075h(call, "call");
            return new toq(this.f43495k, null);
        }

        public /* synthetic */ C7517k(C7516k.toq toqVar, int i2, ni7 ni7Var) {
            this((i2 & 1) != 0 ? C7516k.toq.f94066toq : toqVar);
        }
    }
}
