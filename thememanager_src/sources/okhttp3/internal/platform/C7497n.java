package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.mcp;

/* JADX INFO: renamed from: okhttp3.internal.platform.n */
/* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7497n extends C7498p {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    public static final toq f94002ld6 = new toq(null);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final Method f94003f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final Method f43361g;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final Class<?> f43362p;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final Class<?> f43363s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final Method f43364y;

    /* JADX INFO: renamed from: okhttp3.internal.platform.n$k */
    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    private static final class k implements InvocationHandler {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final List<String> f43365k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f94004toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7395n
        private String f94005zy;

        public k(@InterfaceC7396q List<String> protocols) {
            d2ok.m23075h(protocols, "protocols");
            this.f43365k = protocols;
        }

        @Override // java.lang.reflect.InvocationHandler
        @InterfaceC7395n
        public Object invoke(@InterfaceC7396q Object proxy, @InterfaceC7396q Method method, @InterfaceC7395n Object[] objArr) throws Throwable {
            d2ok.m23075h(proxy, "proxy");
            d2ok.m23075h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (d2ok.f7l8(name, "supports") && d2ok.f7l8(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (d2ok.f7l8(name, "unsupported") && d2ok.f7l8(Void.TYPE, returnType)) {
                this.f94004toq = true;
                return null;
            }
            if (d2ok.f7l8(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f43365k;
                }
            }
            if ((d2ok.f7l8(name, "selectProtocol") || d2ok.f7l8(name, "select")) && d2ok.f7l8(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    d2ok.n7h(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i2 = 0;
                        while (true) {
                            Object obj2 = list.get(i2);
                            d2ok.n7h(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f43365k.contains(str)) {
                                if (i2 == size) {
                                    break;
                                }
                                i2++;
                            } else {
                                this.f94005zy = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f43365k.get(0);
                    this.f94005zy = str2;
                    return str2;
                }
            }
            if ((!d2ok.f7l8(name, "protocolSelected") && !d2ok.f7l8(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            d2ok.n7h(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f94005zy = (String) obj3;
            return null;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final String m27236k() {
            return this.f94005zy;
        }

        /* JADX INFO: renamed from: q */
        public final void m27237q(boolean z2) {
            this.f94004toq = z2;
        }

        public final boolean toq() {
            return this.f94004toq;
        }

        public final void zy(@InterfaceC7395n String str) {
            this.f94005zy = str;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.platform.n$toq */
    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final C7498p m27238k() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                d2ok.kja0(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                d2ok.kja0(putMethod, "putMethod");
                d2ok.kja0(getMethod, "getMethod");
                d2ok.kja0(removeMethod, "removeMethod");
                d2ok.kja0(clientProviderClass, "clientProviderClass");
                d2ok.kja0(serverProviderClass, "serverProviderClass");
                return new C7497n(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public C7497n(@InterfaceC7396q Method putMethod, @InterfaceC7396q Method getMethod, @InterfaceC7396q Method removeMethod, @InterfaceC7396q Class<?> clientProviderClass, @InterfaceC7396q Class<?> serverProviderClass) {
        d2ok.m23075h(putMethod, "putMethod");
        d2ok.m23075h(getMethod, "getMethod");
        d2ok.m23075h(removeMethod, "removeMethod");
        d2ok.m23075h(clientProviderClass, "clientProviderClass");
        d2ok.m23075h(serverProviderClass, "serverProviderClass");
        this.f43361g = putMethod;
        this.f94003f7l8 = getMethod;
        this.f43364y = removeMethod;
        this.f43363s = clientProviderClass;
        this.f43362p = serverProviderClass;
    }

    @Override // okhttp3.internal.platform.C7498p
    /* JADX INFO: renamed from: g */
    public void mo27232g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<? extends mcp> protocols) {
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        try {
            this.f43361g.invoke(null, sslSocket, Proxy.newProxyInstance(C7498p.class.getClassLoader(), new Class[]{this.f43363s, this.f43362p}, new k(C7498p.f43366k.toq(protocols))));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // okhttp3.internal.platform.C7498p
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public String mo27233p(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f94003f7l8.invoke(null, sslSocket));
            d2ok.n7h(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            k kVar = (k) invocationHandler;
            if (!kVar.toq() && kVar.m27236k() == null) {
                C7498p.n7h(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (kVar.toq()) {
                return null;
            }
            return kVar.m27236k();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }

    @Override // okhttp3.internal.platform.C7498p
    public void zy(@InterfaceC7396q SSLSocket sslSocket) {
        d2ok.m23075h(sslSocket, "sslSocket");
        try {
            this.f43364y.invoke(null, sslSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }
}
