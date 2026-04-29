package okhttp3.internal.platform.android;

import b7.C1359g;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.C7498p;

/* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class x2 extends C7485g {

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    public static final C7493k f43352p = new C7493k(null);

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final Class<?> f43353s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final Class<? super SSLSocketFactory> f43354y;

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.x2$k */
    /* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
    public static final class C7493k {
        private C7493k() {
        }

        public /* synthetic */ C7493k(ni7 ni7Var) {
            this();
        }

        public static /* synthetic */ ld6 toq(C7493k c7493k, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return c7493k.m27224k(str);
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final ld6 m27224k(@InterfaceC7396q String packageName) {
            d2ok.m23075h(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                d2ok.n7h(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                d2ok.n7h(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                d2ok.kja0(paramsClass, "paramsClass");
                return new x2(cls, cls2, paramsClass);
            } catch (Exception e2) {
                C7498p.f43366k.f7l8().qrj("unable to load android socket classes", 5, e2);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(@InterfaceC7396q Class<? super SSLSocket> sslSocketClass, @InterfaceC7396q Class<? super SSLSocketFactory> sslSocketFactoryClass, @InterfaceC7396q Class<?> paramClass) {
        super(sslSocketClass);
        d2ok.m23075h(sslSocketClass, "sslSocketClass");
        d2ok.m23075h(sslSocketFactoryClass, "sslSocketFactoryClass");
        d2ok.m23075h(paramClass, "paramClass");
        this.f43354y = sslSocketFactoryClass;
        this.f43353s = paramClass;
    }

    @Override // okhttp3.internal.platform.android.C7485g, okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: n */
    public boolean mo27214n(@InterfaceC7396q SSLSocketFactory sslSocketFactory) {
        d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
        return this.f43354y.isInstance(sslSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.C7485g, okhttp3.internal.platform.android.ld6
    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public X509TrustManager mo27215q(@InterfaceC7396q SSLSocketFactory sslSocketFactory) {
        d2ok.m23075h(sslSocketFactory, "sslSocketFactory");
        Object objM5752f = C1359g.m5752f(sslSocketFactory, this.f43353s, "sslParameters");
        d2ok.qrj(objM5752f);
        X509TrustManager x509TrustManager = (X509TrustManager) C1359g.m5752f(objM5752f, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) C1359g.m5752f(objM5752f, X509TrustManager.class, "trustManager") : x509TrustManager;
    }
}
