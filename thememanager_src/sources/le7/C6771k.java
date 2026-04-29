package le7;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: le7.k */
/* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C6771k extends zy {

    /* JADX INFO: renamed from: q */
    private static final int f37602q = 9;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f82197zy = new k(null);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final InterfaceC6772n f82198toq;

    /* JADX INFO: renamed from: le7.k$k */
    /* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C6771k(@InterfaceC7396q InterfaceC6772n trustRootIndex) {
        d2ok.m23075h(trustRootIndex, "trustRootIndex");
        this.f82198toq = trustRootIndex;
    }

    private final boolean toq(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!d2ok.f7l8(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C6771k) && d2ok.f7l8(((C6771k) obj).f82198toq, this.f82198toq);
    }

    public int hashCode() {
        return this.f82198toq.hashCode();
    }

    @Override // le7.zy
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public List<Certificate> mo24707k(@InterfaceC7396q List<? extends Certificate> chain, @InterfaceC7396q String hostname) throws SSLPeerUnverifiedException {
        d2ok.m23075h(chain, "chain");
        d2ok.m23075h(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        d2ok.kja0(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z2 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            d2ok.n7h(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo24708k = this.f82198toq.mo24708k(x509Certificate);
            if (x509CertificateMo24708k == null) {
                Iterator it = arrayDeque.iterator();
                d2ok.kja0(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    d2ok.n7h(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (toq(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z2) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !d2ok.f7l8(x509Certificate, x509CertificateMo24708k)) {
                arrayList.add(x509CertificateMo24708k);
            }
            if (toq(x509CertificateMo24708k, x509CertificateMo24708k)) {
                return arrayList;
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
