package okhttp3;

import b7.C1359g;
import cyoe.InterfaceC5981k;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.hb;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okhttp3.i */
/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"})
public final class C7437i {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final k f42962n = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final d3 f42963k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final kotlin.jk f42964q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final C7528s f93835toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final List<Certificate> f93836zy;

    /* JADX INFO: renamed from: okhttp3.i$k */
    /* JADX INFO: compiled from: Handshake.kt */
    @lv5({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    public static final class k {

        /* JADX INFO: renamed from: okhttp3.i$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Handshake.kt */
        static final class C8120k extends AbstractC6308r implements InterfaceC5981k<List<? extends Certificate>> {
            final /* synthetic */ List<Certificate> $peerCertificatesCopy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C8120k(List<? extends Certificate> list) {
                super(0);
                this.$peerCertificatesCopy = list;
            }

            @Override // cyoe.InterfaceC5981k
            @InterfaceC7396q
            public final List<? extends Certificate> invoke() {
                return this.$peerCertificatesCopy;
            }
        }

        /* JADX INFO: renamed from: okhttp3.i$k$toq */
        /* JADX INFO: compiled from: Handshake.kt */
        static final class toq extends AbstractC6308r implements InterfaceC5981k<List<? extends Certificate>> {
            final /* synthetic */ List<Certificate> $peerCertificatesCopy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            toq(List<? extends Certificate> list) {
                super(0);
                this.$peerCertificatesCopy = list;
            }

            @Override // cyoe.InterfaceC5981k
            @InterfaceC7396q
            public final List<? extends Certificate> invoke() {
                return this.$peerCertificatesCopy;
            }
        }

        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: q */
        private final List<Certificate> m26930q(Certificate[] certificateArr) {
            return certificateArr != null ? C1359g.mcp(Arrays.copyOf(certificateArr, certificateArr.length)) : kotlin.collections.ni7.a9();
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @hb(expression = "sslSession.handshake()", imports = {}))
        @InterfaceC6769y(name = "-deprecated_get")
        /* JADX INFO: renamed from: k */
        public final C7437i m26931k(@InterfaceC7396q SSLSession sslSession) throws IOException {
            d2ok.m23075h(sslSession, "sslSession");
            return toq(sslSession);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        @l05.qrj
        public final C7437i toq(@InterfaceC7396q SSLSession sSLSession) throws IOException {
            List<Certificate> listA9;
            d2ok.m23075h(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (d2ok.f7l8(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : d2ok.f7l8(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C7528s qVar = C7528s.f94162toq.toq(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (d2ok.f7l8("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            d3 d3VarM26843k = d3.Companion.m26843k(protocol);
            try {
                listA9 = m26930q(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listA9 = kotlin.collections.ni7.a9();
            }
            return new C7437i(d3VarM26843k, qVar, m26930q(sSLSession.getLocalCertificates()), new toq(listA9));
        }

        @InterfaceC7396q
        @l05.qrj
        public final C7437i zy(@InterfaceC7396q d3 tlsVersion, @InterfaceC7396q C7528s cipherSuite, @InterfaceC7396q List<? extends Certificate> peerCertificates, @InterfaceC7396q List<? extends Certificate> localCertificates) {
            d2ok.m23075h(tlsVersion, "tlsVersion");
            d2ok.m23075h(cipherSuite, "cipherSuite");
            d2ok.m23075h(peerCertificates, "peerCertificates");
            d2ok.m23075h(localCertificates, "localCertificates");
            return new C7437i(tlsVersion, cipherSuite, C1359g.y9n(localCertificates), new C8120k(C1359g.y9n(peerCertificates)));
        }
    }

    /* JADX INFO: renamed from: okhttp3.i$toq */
    /* JADX INFO: compiled from: Handshake.kt */
    static final class toq extends AbstractC6308r implements InterfaceC5981k<List<? extends Certificate>> {
        final /* synthetic */ InterfaceC5981k<List<Certificate>> $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(InterfaceC5981k<? extends List<? extends Certificate>> interfaceC5981k) {
            super(0);
            this.$peerCertificatesFn = interfaceC5981k;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final List<? extends Certificate> invoke() {
            try {
                return this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return kotlin.collections.ni7.a9();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7437i(@InterfaceC7396q d3 tlsVersion, @InterfaceC7396q C7528s cipherSuite, @InterfaceC7396q List<? extends Certificate> localCertificates, @InterfaceC7396q InterfaceC5981k<? extends List<? extends Certificate>> peerCertificatesFn) {
        d2ok.m23075h(tlsVersion, "tlsVersion");
        d2ok.m23075h(cipherSuite, "cipherSuite");
        d2ok.m23075h(localCertificates, "localCertificates");
        d2ok.m23075h(peerCertificatesFn, "peerCertificatesFn");
        this.f42963k = tlsVersion;
        this.f93835toq = cipherSuite;
        this.f93836zy = localCertificates;
        this.f42964q = kotlin.fti.m22825k(new toq(peerCertificatesFn));
    }

    /* JADX INFO: renamed from: p */
    private final String m26923p(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        d2ok.kja0(type, "type");
        return type;
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final C7437i m26924s(@InterfaceC7396q d3 d3Var, @InterfaceC7396q C7528s c7528s, @InterfaceC7396q List<? extends Certificate> list, @InterfaceC7396q List<? extends Certificate> list2) {
        return f42962n.zy(d3Var, c7528s, list, list2);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    @l05.qrj
    /* JADX INFO: renamed from: y */
    public static final C7437i m26925y(@InterfaceC7396q SSLSession sSLSession) throws IOException {
        return f42962n.toq(sSLSession);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C7437i) {
            C7437i c7437i = (C7437i) obj;
            if (c7437i.f42963k == this.f42963k && d2ok.f7l8(c7437i.f93835toq, this.f93835toq) && d2ok.f7l8(c7437i.qrj(), qrj()) && d2ok.f7l8(c7437i.f93836zy, this.f93836zy)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "cipherSuite")
    public final C7528s f7l8() {
        return this.f93835toq;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "tlsVersion", imports = {}))
    @InterfaceC6769y(name = "-deprecated_tlsVersion")
    /* JADX INFO: renamed from: g */
    public final d3 m26926g() {
        return this.f42963k;
    }

    public int hashCode() {
        return ((((((527 + this.f42963k.hashCode()) * 31) + this.f93835toq.hashCode()) * 31) + qrj().hashCode()) * 31) + this.f93836zy.hashCode();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "cipherSuite", imports = {}))
    @InterfaceC6769y(name = "-deprecated_cipherSuite")
    /* JADX INFO: renamed from: k */
    public final C7528s m26927k() {
        return this.f93835toq;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "tlsVersion")
    public final d3 kja0() {
        return this.f42963k;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "localCertificates")
    public final List<Certificate> ld6() {
        return this.f93836zy;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "peerPrincipal", imports = {}))
    @InterfaceC6769y(name = "-deprecated_peerPrincipal")
    /* JADX INFO: renamed from: n */
    public final Principal m26928n() {
        return n7h();
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "peerPrincipal")
    public final Principal n7h() {
        Object objKbj = kotlin.collections.a9.kbj(qrj());
        X509Certificate x509Certificate = objKbj instanceof X509Certificate ? (X509Certificate) objKbj : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "peerCertificates", imports = {}))
    @InterfaceC6769y(name = "-deprecated_peerCertificates")
    /* JADX INFO: renamed from: q */
    public final List<Certificate> m26929q() {
        return qrj();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "peerCertificates")
    public final List<Certificate> qrj() {
        return (List) this.f42964q.getValue();
    }

    @InterfaceC7396q
    public String toString() {
        List<Certificate> listQrj = qrj();
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(listQrj, 10));
        Iterator<T> it = listQrj.iterator();
        while (it.hasNext()) {
            arrayList.add(m26923p((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f42963k);
        sb.append(" cipherSuite=");
        sb.append(this.f93835toq);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f93836zy;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.fu4.vyq(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m26923p((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "localCertificates", imports = {}))
    @InterfaceC6769y(name = "-deprecated_localCertificates")
    public final List<Certificate> toq() {
        return this.f93836zy;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "localPrincipal")
    public final Principal x2() {
        Object objKbj = kotlin.collections.a9.kbj(this.f93836zy);
        X509Certificate x509Certificate = objKbj instanceof X509Certificate ? (X509Certificate) objKbj : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "localPrincipal", imports = {}))
    @InterfaceC6769y(name = "-deprecated_localPrincipal")
    public final Principal zy() {
        return x2();
    }
}
