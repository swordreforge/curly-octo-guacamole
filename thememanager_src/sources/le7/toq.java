package le7;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: BasicTrustRootIndex.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nBasicTrustRootIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n372#2,7:57\n288#3,2:64\n*S KotlinDebug\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n*L\n28#1:57,7\n37#1:64,2\n*E\n"})
public final class toq implements InterfaceC6772n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Map<X500Principal, Set<X509Certificate>> f37604k;

    public toq(@InterfaceC7396q X509Certificate... caCerts) {
        d2ok.m23075h(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            d2ok.kja0(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f37604k = linkedHashMap;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return obj == this || ((obj instanceof toq) && d2ok.f7l8(((toq) obj).f37604k, this.f37604k));
    }

    public int hashCode() {
        return this.f37604k.hashCode();
    }

    @Override // le7.InterfaceC6772n
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public X509Certificate mo24708k(@InterfaceC7396q X509Certificate cert) {
        boolean z2;
        d2ok.m23075h(cert, "cert");
        Set<X509Certificate> set = this.f37604k.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                z2 = true;
            } catch (Exception unused) {
                z2 = false;
            }
            if (z2) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }
}
