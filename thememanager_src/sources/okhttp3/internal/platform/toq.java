package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import le7.InterfaceC6772n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.android.C7485g;
import okhttp3.internal.platform.android.C7489p;
import okhttp3.internal.platform.android.C7491s;
import okhttp3.internal.platform.android.C7494y;
import okhttp3.internal.platform.android.ld6;
import okhttp3.internal.platform.android.x2;
import okhttp3.mcp;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes4.dex */
@b7.zy
@lv5({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
public final class toq extends C7498p {

    /* JADX INFO: renamed from: s */
    private static final boolean f43374s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C7501k f43375y = new C7501k(null);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final C7494y f94010f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final List<ld6> f43376g;

    /* JADX INFO: renamed from: okhttp3.internal.platform.toq$k */
    /* JADX INFO: compiled from: AndroidPlatform.kt */
    public static final class C7501k {
        private C7501k() {
        }

        public /* synthetic */ C7501k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final C7498p m27258k() {
            if (toq()) {
                return new toq();
            }
            return null;
        }

        public final boolean toq() {
            return toq.f43374s;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.platform.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidPlatform.kt */
    public static final class C8127toq implements InterfaceC6772n {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final X509TrustManager f43377k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final Method f94011toq;

        public C8127toq(@InterfaceC7396q X509TrustManager trustManager, @InterfaceC7396q Method findByIssuerAndSignatureMethod) {
            d2ok.m23075h(trustManager, "trustManager");
            d2ok.m23075h(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f43377k = trustManager;
            this.f94011toq = findByIssuerAndSignatureMethod;
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ C8127toq m27259n(C8127toq c8127toq, X509TrustManager x509TrustManager, Method method, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                x509TrustManager = c8127toq.f43377k;
            }
            if ((i2 & 2) != 0) {
                method = c8127toq.f94011toq;
            }
            return c8127toq.m27260q(x509TrustManager, method);
        }

        private final X509TrustManager toq() {
            return this.f43377k;
        }

        private final Method zy() {
            return this.f94011toq;
        }

        public boolean equals(@InterfaceC7395n Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8127toq)) {
                return false;
            }
            C8127toq c8127toq = (C8127toq) obj;
            return d2ok.f7l8(this.f43377k, c8127toq.f43377k) && d2ok.f7l8(this.f94011toq, c8127toq.f94011toq);
        }

        public int hashCode() {
            return (this.f43377k.hashCode() * 31) + this.f94011toq.hashCode();
        }

        @Override // le7.InterfaceC6772n
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public X509Certificate mo24708k(@InterfaceC7396q X509Certificate cert) {
            d2ok.m23075h(cert, "cert");
            try {
                Object objInvoke = this.f94011toq.invoke(this.f43377k, cert);
                d2ok.n7h(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C8127toq m27260q(@InterfaceC7396q X509TrustManager trustManager, @InterfaceC7396q Method findByIssuerAndSignatureMethod) {
            d2ok.m23075h(trustManager, "trustManager");
            d2ok.m23075h(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            return new C8127toq(trustManager, findByIssuerAndSignatureMethod);
        }

        @InterfaceC7396q
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f43377k + ", findByIssuerAndSignatureMethod=" + this.f94011toq + ')';
        }
    }

    static {
        boolean z2 = false;
        if (C7498p.f43366k.m27250y() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f43374s = z2;
    }

    public toq() {
        List listM22568r = kotlin.collections.ni7.m22568r(x2.C7493k.toq(x2.f43352p, null, 1, null), new C7489p(C7485g.f43342g.m27218q()), new C7489p(C7491s.f43350k.m27222k()), new C7489p(okhttp3.internal.platform.android.f7l8.f43341k.m27216k()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM22568r) {
            if (((ld6) obj).mo27213k()) {
                arrayList.add(obj);
            }
        }
        this.f43376g = arrayList;
        this.f94010f7l8 = C7494y.f43355q.m27226k();
    }

    @Override // okhttp3.internal.platform.C7498p
    public void f7l8(@InterfaceC7396q Socket socket, @InterfaceC7396q InetSocketAddress address, int i2) throws IOException {
        d2ok.m23075h(socket, "socket");
        d2ok.m23075h(address, "address");
        try {
            socket.connect(address, i2);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // okhttp3.internal.platform.C7498p
    /* JADX INFO: renamed from: g */
    public void mo27232g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<mcp> protocols) {
        Object next;
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        Iterator<T> it = this.f43376g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ld6) next).toq(sslSocket)) {
                    break;
                }
            }
        }
        ld6 ld6Var = (ld6) next;
        if (ld6Var != null) {
            ld6Var.mo27212g(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.C7498p
    public void kja0(@InterfaceC7396q String message, @InterfaceC7395n Object obj) {
        d2ok.m23075h(message, "message");
        if (this.f94010f7l8.toq(obj)) {
            return;
        }
        C7498p.n7h(this, message, 5, null, 4, null);
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    public Object ld6(@InterfaceC7396q String closer) {
        d2ok.m23075h(closer, "closer");
        return this.f94010f7l8.m27225k(closer);
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public InterfaceC6772n mo27242n(@InterfaceC7396q X509TrustManager trustManager) {
        d2ok.m23075h(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            d2ok.kja0(method, "method");
            return new C8127toq(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo27242n(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public String mo27233p(@InterfaceC7396q SSLSocket sslSocket) {
        Object next;
        d2ok.m23075h(sslSocket, "sslSocket");
        Iterator<T> it = this.f43376g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ld6) next).toq(sslSocket)) {
                break;
            }
        }
        ld6 ld6Var = (ld6) next;
        if (ld6Var != null) {
            return ld6Var.zy(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public le7.zy mo27234q(@InterfaceC7396q X509TrustManager trustManager) {
        d2ok.m23075h(trustManager, "trustManager");
        okhttp3.internal.platform.android.toq toqVarM27223k = okhttp3.internal.platform.android.toq.f43351q.m27223k(trustManager);
        return toqVarM27223k != null ? toqVarM27223k : super.mo27234q(trustManager);
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    public X509TrustManager t8r(@InterfaceC7396q SSLSocketFactory sslSocketFactory) {
        Object next;
        d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f43376g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ld6) next).mo27214n(sslSocketFactory)) {
                break;
            }
        }
        ld6 ld6Var = (ld6) next;
        if (ld6Var != null) {
            return ld6Var.mo27215q(sslSocketFactory);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.C7498p
    public boolean x2(@InterfaceC7396q String hostname) {
        d2ok.m23075h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
