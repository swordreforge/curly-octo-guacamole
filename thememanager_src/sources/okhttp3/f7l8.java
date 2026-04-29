package okhttp3;

import b7.C1360k;
import cyoe.InterfaceC5981k;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.C6144h;
import kotlin.hb;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.bo;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.kja0;

/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Set<zy> f42924k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final le7.zy f93818toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final toq f93817zy = new toq(null);

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final f7l8 f42923q = new C7430k().toq();

    /* JADX INFO: renamed from: okhttp3.f7l8$k */
    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class C7430k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final List<zy> f42925k = new ArrayList();

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7430k m26855k(@InterfaceC7396q String pattern, @InterfaceC7396q String... pins) {
            d2ok.m23075h(pattern, "pattern");
            d2ok.m23075h(pins, "pins");
            for (String str : pins) {
                this.f42925k.add(new zy(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7396q
        public final f7l8 toq() {
            return new f7l8(kotlin.collections.a9.yvs(this.f42925k), null, 2, 0 == true ? 1 : 0);
        }

        @InterfaceC7396q
        public final List<zy> zy() {
            return this.f42925k;
        }
    }

    /* JADX INFO: renamed from: okhttp3.f7l8$q */
    /* JADX INFO: compiled from: CertificatePinner.kt */
    @lv5({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n*L\n152#1:371\n152#1:372,3\n*E\n"})
    static final class C7431q extends AbstractC6308r implements InterfaceC5981k<List<? extends X509Certificate>> {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7431q(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final List<? extends X509Certificate> invoke() {
            List<Certificate> listMo24707k;
            le7.zy zyVarM26852n = f7l8.this.m26852n();
            if (zyVarM26852n == null || (listMo24707k = zyVarM26852n.mo24707k(this.$peerCertificates, this.$hostname)) == null) {
                listMo24707k = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(listMo24707k, 10));
            for (Certificate certificate : listMo24707k) {
                d2ok.n7h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @lv5({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final String m26856k(@InterfaceC7396q Certificate certificate) {
            d2ok.m23075h(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + zy((X509Certificate) certificate).base64();
        }

        @InterfaceC7396q
        @l05.qrj
        public final okio.kja0 toq(@InterfaceC7396q X509Certificate x509Certificate) {
            d2ok.m23075h(x509Certificate, "<this>");
            kja0.C7563k c7563k = okio.kja0.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            d2ok.kja0(encoded, "publicKey.encoded");
            return kja0.C7563k.m27776h(c7563k, encoded, 0, 0, 3, null).sha1();
        }

        @InterfaceC7396q
        @l05.qrj
        public final okio.kja0 zy(@InterfaceC7396q X509Certificate x509Certificate) {
            d2ok.m23075h(x509Certificate, "<this>");
            kja0.C7563k c7563k = okio.kja0.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            d2ok.kja0(encoded, "publicKey.encoded");
            return kja0.C7563k.m27776h(c7563k, encoded, 0, 0, 3, null).sha256();
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f42926k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final String f93819toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final okio.kja0 f93820zy;

        public zy(@InterfaceC7396q String pattern, @InterfaceC7396q String pin) {
            d2ok.m23075h(pattern, "pattern");
            d2ok.m23075h(pin, "pin");
            if (!((kotlin.text.a9.r6ty(pattern, "*.", false, 2, null) && kotlin.text.fti.b7(pattern, "*", 1, false, 4, null) == -1) || (kotlin.text.a9.r6ty(pattern, "**.", false, 2, null) && kotlin.text.fti.b7(pattern, "*", 2, false, 4, null) == -1) || kotlin.text.fti.b7(pattern, "*", 0, false, 6, null) == -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + pattern).toString());
            }
            String strM5771n = C1360k.m5771n(pattern);
            if (strM5771n == null) {
                throw new IllegalArgumentException("Invalid pattern: " + pattern);
            }
            this.f42926k = strM5771n;
            if (kotlin.text.a9.r6ty(pin, "sha1/", false, 2, null)) {
                this.f93819toq = "sha1";
                kja0.C7563k c7563k = okio.kja0.Companion;
                String strSubstring = pin.substring(5);
                d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
                okio.kja0 kja0VarM27783y = c7563k.m27783y(strSubstring);
                if (kja0VarM27783y != null) {
                    this.f93820zy = kja0VarM27783y;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            if (!kotlin.text.a9.r6ty(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            this.f93819toq = "sha256";
            kja0.C7563k c7563k2 = okio.kja0.Companion;
            String strSubstring2 = pin.substring(7);
            d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
            okio.kja0 kja0VarM27783y2 = c7563k2.m27783y(strSubstring2);
            if (kja0VarM27783y2 != null) {
                this.f93820zy = kja0VarM27783y2;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + pin);
        }

        public boolean equals(@InterfaceC7395n Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zy)) {
                return false;
            }
            zy zyVar = (zy) obj;
            return d2ok.f7l8(this.f42926k, zyVar.f42926k) && d2ok.f7l8(this.f93819toq, zyVar.f93819toq) && d2ok.f7l8(this.f93820zy, zyVar.f93820zy);
        }

        public int hashCode() {
            return (((this.f42926k.hashCode() * 31) + this.f93819toq.hashCode()) * 31) + this.f93820zy.hashCode();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final okio.kja0 m26857k() {
            return this.f93820zy;
        }

        /* JADX INFO: renamed from: n */
        public final boolean m26858n(@InterfaceC7396q String hostname) {
            d2ok.m23075h(hostname, "hostname");
            if (kotlin.text.a9.r6ty(this.f42926k, "**.", false, 2, null)) {
                int length = this.f42926k.length() - 3;
                int length2 = hostname.length() - length;
                if (!kotlin.text.a9.u38j(hostname, hostname.length() - length, this.f42926k, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!kotlin.text.a9.r6ty(this.f42926k, "*.", false, 2, null)) {
                    return d2ok.f7l8(hostname, this.f42926k);
                }
                int length3 = this.f42926k.length() - 1;
                int length4 = hostname.length() - length3;
                if (!kotlin.text.a9.u38j(hostname, hostname.length() - length3, this.f42926k, 1, length3, false, 16, null) || kotlin.text.fti.x7o(hostname, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m26859q(@InterfaceC7396q X509Certificate certificate) {
            d2ok.m23075h(certificate, "certificate");
            String str = this.f93819toq;
            if (d2ok.f7l8(str, "sha256")) {
                return d2ok.f7l8(this.f93820zy, f7l8.f93817zy.zy(certificate));
            }
            if (d2ok.f7l8(str, "sha1")) {
                return d2ok.f7l8(this.f93820zy, f7l8.f93817zy.toq(certificate));
            }
            return false;
        }

        @InterfaceC7396q
        public String toString() {
            return this.f93819toq + '/' + this.f93820zy.base64();
        }

        @InterfaceC7396q
        public final String toq() {
            return this.f93819toq;
        }

        @InterfaceC7396q
        public final String zy() {
            return this.f42926k;
        }
    }

    public f7l8(@InterfaceC7396q Set<zy> pins, @InterfaceC7395n le7.zy zyVar) {
        d2ok.m23075h(pins, "pins");
        this.f42924k = pins;
        this.f93818toq = zyVar;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final String f7l8(@InterfaceC7396q Certificate certificate) {
        return f93817zy.m26856k(certificate);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final okio.kja0 m26848s(@InterfaceC7396q X509Certificate x509Certificate) {
        return f93817zy.zy(x509Certificate);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: y */
    public static final okio.kja0 m26849y(@InterfaceC7396q X509Certificate x509Certificate) {
        return f93817zy.toq(x509Certificate);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof f7l8) {
            f7l8 f7l8Var = (f7l8) obj;
            if (d2ok.f7l8(f7l8Var.f42924k, this.f42924k) && d2ok.f7l8(f7l8Var.f93818toq, this.f93818toq)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final Set<zy> m26850g() {
        return this.f42924k;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f42924k.hashCode()) * 41;
        le7.zy zyVar = this.f93818toq;
        return iHashCode + (zyVar != null ? zyVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k */
    public final void m26851k(@InterfaceC7396q String hostname, @InterfaceC7396q List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        d2ok.m23075h(hostname, "hostname");
        d2ok.m23075h(peerCertificates, "peerCertificates");
        zy(hostname, new C7431q(peerCertificates, hostname));
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final le7.zy m26852n() {
        return this.f93818toq;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final f7l8 m26853p(@InterfaceC7396q le7.zy certificateChainCleaner) {
        d2ok.m23075h(certificateChainCleaner, "certificateChainCleaner");
        return d2ok.f7l8(this.f93818toq, certificateChainCleaner) ? this : new f7l8(this.f42924k, certificateChainCleaner);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final List<zy> m26854q(@InterfaceC7396q String hostname) {
        d2ok.m23075h(hostname, "hostname");
        Set<zy> set = this.f42924k;
        List<zy> listA9 = kotlin.collections.ni7.a9();
        for (Object obj : set) {
            if (((zy) obj).m26858n(hostname)) {
                if (listA9.isEmpty()) {
                    listA9 = new ArrayList<>();
                }
                d2ok.n7h(listA9, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                bo.f7l8(listA9).add(obj);
            }
        }
        return listA9;
    }

    @kotlin.ld6(message = "replaced with {@link #check(String, List)}.", replaceWith = @hb(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void toq(@InterfaceC7396q String hostname, @InterfaceC7396q Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        d2ok.m23075h(hostname, "hostname");
        d2ok.m23075h(peerCertificates, "peerCertificates");
        m26851k(hostname, C6144h.vyee(peerCertificates));
    }

    public final void zy(@InterfaceC7396q String hostname, @InterfaceC7396q InterfaceC5981k<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        d2ok.m23075h(hostname, "hostname");
        d2ok.m23075h(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<zy> listM26854q = m26854q(hostname);
        if (listM26854q.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            okio.kja0 kja0VarZy = null;
            okio.kja0 qVar = null;
            for (zy zyVar : listM26854q) {
                String qVar2 = zyVar.toq();
                if (d2ok.f7l8(qVar2, "sha256")) {
                    if (kja0VarZy == null) {
                        kja0VarZy = f93817zy.zy(x509Certificate);
                    }
                    if (d2ok.f7l8(zyVar.m26857k(), kja0VarZy)) {
                        return;
                    }
                } else {
                    if (!d2ok.f7l8(qVar2, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + zyVar.toq());
                    }
                    if (qVar == null) {
                        qVar = f93817zy.toq(x509Certificate);
                    }
                    if (d2ok.f7l8(zyVar.m26857k(), qVar)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb.append("\n    ");
            sb.append(f93817zy.m26856k(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (zy zyVar2 : listM26854q) {
            sb.append("\n    ");
            sb.append(zyVar2);
        }
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public /* synthetic */ f7l8(Set set, le7.zy zyVar, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(set, (i2 & 2) != 0 ? null : zyVar);
    }
}
