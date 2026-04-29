package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okhttp3.x2;

/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final List<x2> f43113k;

    /* JADX INFO: renamed from: q */
    private boolean f43114q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f93888toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f93889zy;

    public toq(@InterfaceC7396q List<x2> connectionSpecs) {
        d2ok.m23075h(connectionSpecs, "connectionSpecs");
        this.f43113k = connectionSpecs;
    }

    private final boolean zy(SSLSocket sSLSocket) {
        int size = this.f43113k.size();
        for (int i2 = this.f93888toq; i2 < size; i2++) {
            if (this.f43113k.get(i2).m27479y(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final x2 m27053k(@InterfaceC7396q SSLSocket sslSocket) throws IOException {
        x2 x2Var;
        d2ok.m23075h(sslSocket, "sslSocket");
        int i2 = this.f93888toq;
        int size = this.f43113k.size();
        while (true) {
            if (i2 >= size) {
                x2Var = null;
                break;
            }
            x2Var = this.f43113k.get(i2);
            if (x2Var.m27479y(sslSocket)) {
                this.f93888toq = i2 + 1;
                break;
            }
            i2++;
        }
        if (x2Var != null) {
            this.f93889zy = zy(sslSocket);
            x2Var.m27476g(sslSocket, this.f43114q);
            return x2Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f43114q);
        sb.append(", modes=");
        sb.append(this.f43113k);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        d2ok.qrj(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        d2ok.kja0(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean toq(@InterfaceC7396q IOException e2) {
        d2ok.m23075h(e2, "e");
        this.f43114q = true;
        return (!this.f93889zy || (e2 instanceof ProtocolException) || (e2 instanceof InterruptedIOException) || ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) || (e2 instanceof SSLPeerUnverifiedException) || !(e2 instanceof SSLException)) ? false : true;
    }
}
