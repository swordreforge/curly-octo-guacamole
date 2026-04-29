package le7;

import b7.C1359g;
import b7.C1360k;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.ni7;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.a9;
import kotlin.text.fti;
import mub.InterfaceC7396q;
import okio.C7571o;

/* JADX INFO: renamed from: le7.q */
/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
public final class C6773q implements HostnameVerifier {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6773q f37603k = new C6773q();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f82199toq = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f82200zy = 7;

    private C6773q() {
    }

    private final boolean f7l8(String str, X509Certificate x509Certificate) {
        String qVar = toq(str);
        List<String> listZy = zy(x509Certificate, 2);
        if ((listZy instanceof Collection) && listZy.isEmpty()) {
            return false;
        }
        Iterator<T> it = listZy.iterator();
        while (it.hasNext()) {
            if (f37603k.m24709g(qVar, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m24709g(String str, String str2) {
        String str3;
        String str4 = str;
        if ((str4 == null || str.length() == 0) || a9.r6ty(str4, ".", false, 2, null) || a9.ga(str4, "..", false, 2, null)) {
            return false;
        }
        if ((str2 == null || str2.length() == 0) || a9.r6ty(str2, ".", false, 2, null) || a9.ga(str2, "..", false, 2, null)) {
            return false;
        }
        if (!a9.ga(str4, ".", false, 2, null)) {
            str4 = str4 + '.';
        }
        String str5 = str4;
        if (a9.ga(str2, ".", false, 2, null)) {
            str3 = str2;
        } else {
            str3 = str2 + '.';
        }
        String qVar = toq(str3);
        if (!fti.lk(qVar, "*", false, 2, null)) {
            return d2ok.f7l8(str5, qVar);
        }
        if (!a9.r6ty(qVar, "*.", false, 2, null) || fti.sc(qVar, '*', 1, false, 4, null) != -1 || str5.length() < qVar.length() || d2ok.f7l8("*.", qVar)) {
            return false;
        }
        String strSubstring = qVar.substring(1);
        d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        if (!a9.ga(str5, strSubstring, false, 2, null)) {
            return false;
        }
        int length = str5.length() - strSubstring.length();
        return length <= 0 || fti.x7o(str5, '.', length + (-1), false, 4, null) == -1;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m24710q(String str) {
        return str.length() == ((int) C7571o.x2(str, 0, 0, 3, null));
    }

    private final String toq(String str) {
        if (!m24710q(str)) {
            return str;
        }
        Locale US = Locale.US;
        d2ok.kja0(US, "US");
        String lowerCase = str.toLowerCase(US);
        d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: y */
    private final boolean m24711y(String str, X509Certificate x509Certificate) {
        String strM5771n = C1360k.m5771n(str);
        List<String> listZy = zy(x509Certificate, 7);
        if ((listZy instanceof Collection) && listZy.isEmpty()) {
            return false;
        }
        Iterator<T> it = listZy.iterator();
        while (it.hasNext()) {
            if (d2ok.f7l8(strM5771n, C1360k.m5771n((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    private final List<String> zy(X509Certificate x509Certificate, int i2) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return ni7.a9();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && d2ok.f7l8(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return ni7.a9();
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final List<String> m24712k(@InterfaceC7396q X509Certificate certificate) {
        d2ok.m23075h(certificate, "certificate");
        return kotlin.collections.a9.l7o(zy(certificate, 7), zy(certificate, 2));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m24713n(@InterfaceC7396q String host, @InterfaceC7396q X509Certificate certificate) {
        d2ok.m23075h(host, "host");
        d2ok.m23075h(certificate, "certificate");
        return C1359g.ld6(host) ? m24711y(host, certificate) : f7l8(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@InterfaceC7396q String host, @InterfaceC7396q SSLSession session) {
        d2ok.m23075h(host, "host");
        d2ok.m23075h(session, "session");
        if (!m24710q(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            d2ok.n7h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m24713n(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
