package le7;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.C7498p;

/* JADX INFO: compiled from: CertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6774k f37605k = new C6774k(null);

    /* JADX INFO: renamed from: le7.zy$k */
    /* JADX INFO: compiled from: CertificateChainCleaner.kt */
    public static final class C6774k {
        private C6774k() {
        }

        public /* synthetic */ C6774k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final zy m24714k(@InterfaceC7396q X509TrustManager trustManager) {
            d2ok.m23075h(trustManager, "trustManager");
            return C7498p.f43366k.f7l8().mo27234q(trustManager);
        }

        @InterfaceC7396q
        public final zy toq(@InterfaceC7396q X509Certificate... caCerts) {
            d2ok.m23075h(caCerts, "caCerts");
            return new C6771k(new toq((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public abstract List<Certificate> mo24707k(@InterfaceC7396q List<? extends Certificate> list, @InterfaceC7396q String str) throws SSLPeerUnverifiedException;
}
