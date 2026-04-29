package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.text.C6433g;
import kotlin.text.a9;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.C7498p;
import okhttp3.internal.platform.android.C7489p;
import okhttp3.internal.platform.android.ld6;
import okhttp3.mcp;

/* JADX INFO: renamed from: okhttp3.internal.platform.android.g */
/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public class C7485g implements ld6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final C7489p.k f93990f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final k f43342g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Class<? super SSLSocket> f43343k;

    /* JADX INFO: renamed from: n */
    private final Method f43344n;

    /* JADX INFO: renamed from: q */
    private final Method f43345q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final Method f93991toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Method f93992zy;

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.g$k */
    /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
    public static final class k {

        /* JADX INFO: renamed from: okhttp3.internal.platform.android.g$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
        public static final class C8126k implements C7489p.k {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ String f43346k;

            C8126k(String str) {
                this.f43346k = str;
            }

            @Override // okhttp3.internal.platform.android.C7489p.k
            public boolean toq(@InterfaceC7396q SSLSocket sslSocket) {
                d2ok.m23075h(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                d2ok.kja0(name, "sslSocket.javaClass.name");
                return a9.r6ty(name, this.f43346k + '.', false, 2, null);
            }

            @Override // okhttp3.internal.platform.android.C7489p.k
            @InterfaceC7396q
            public ld6 zy(@InterfaceC7396q SSLSocket sslSocket) {
                d2ok.m23075h(sslSocket, "sslSocket");
                return C7485g.f43342g.toq(sslSocket.getClass());
            }
        }

        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C7485g toq(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !d2ok.f7l8(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            d2ok.qrj(superclass);
            return new C7485g(superclass);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C7489p.k m27218q() {
            return C7485g.f93990f7l8;
        }

        @InterfaceC7396q
        public final C7489p.k zy(@InterfaceC7396q String packageName) {
            d2ok.m23075h(packageName, "packageName");
            return new C8126k(packageName);
        }
    }

    static {
        k kVar = new k(null);
        f43342g = kVar;
        f93990f7l8 = kVar.zy("com.google.android.gms.org.conscrypt");
    }

    public C7485g(@InterfaceC7396q Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        d2ok.m23075h(sslSocketClass, "sslSocketClass");
        this.f43343k = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        d2ok.kja0(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f93991toq = declaredMethod;
        this.f93992zy = sslSocketClass.getMethod("setHostname", String.class);
        this.f43345q = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f43344n = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: g */
    public void mo27212g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<? extends mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        if (toq(sslSocket)) {
            try {
                this.f93991toq.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f93992zy.invoke(sslSocket, str);
                }
                this.f43344n.invoke(sslSocket, C7498p.f43366k.zy(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: k */
    public boolean mo27213k() {
        return okhttp3.internal.platform.toq.f43375y.toq();
    }

    @Override // okhttp3.internal.platform.android.ld6
    /* JADX INFO: renamed from: n */
    public boolean mo27214n(@InterfaceC7396q SSLSocketFactory sSLSocketFactory) {
        return ld6.C7487k.m27220k(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.ld6
    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public X509TrustManager mo27215q(@InterfaceC7396q SSLSocketFactory sSLSocketFactory) {
        return ld6.C7487k.toq(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.ld6
    public boolean toq(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        return this.f43343k.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.ld6
    @InterfaceC7395n
    public String zy(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        if (!toq(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f43345q.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, C6433g.f81921toq);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && d2ok.f7l8(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }
}
