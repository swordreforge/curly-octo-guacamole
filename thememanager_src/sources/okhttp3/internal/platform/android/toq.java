package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import miuix.hybrid.internal.n7h;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AndroidCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes4.dex */
@b7.zy
@lv5({"SMAP\nAndroidCertificateChainCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n37#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n*L\n43#1:75,2\n*E\n"})
public final class toq extends le7.zy {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C7492k f43351q = new C7492k(null);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final X509TrustManager f93995toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final X509TrustManagerExtensions f93996zy;

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.toq$k */
    /* JADX INFO: compiled from: AndroidCertificateChainCleaner.kt */
    public static final class C7492k {
        private C7492k() {
        }

        public /* synthetic */ C7492k(ni7 ni7Var) {
            this();
        }

        @b7.zy
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final toq m27223k(@InterfaceC7396q X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            d2ok.m23075h(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new toq(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public toq(@InterfaceC7396q X509TrustManager trustManager, @InterfaceC7396q X509TrustManagerExtensions x509TrustManagerExtensions) {
        d2ok.m23075h(trustManager, "trustManager");
        d2ok.m23075h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f93995toq = trustManager;
        this.f93996zy = x509TrustManagerExtensions;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof toq) && ((toq) obj).f93995toq == this.f93995toq;
    }

    public int hashCode() {
        return System.identityHashCode(this.f93995toq);
    }

    @Override // le7.zy
    @b7.zy
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public List<Certificate> mo24707k(@InterfaceC7396q List<? extends Certificate> chain, @InterfaceC7396q String hostname) throws SSLPeerUnverifiedException {
        d2ok.m23075h(chain, "chain");
        d2ok.m23075h(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f93996zy.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), n7h.f40280k, hostname);
            d2ok.kja0(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
