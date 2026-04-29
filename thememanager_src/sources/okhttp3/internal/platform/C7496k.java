package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.platform.android.C7485g;
import okhttp3.internal.platform.android.C7486k;
import okhttp3.internal.platform.android.C7489p;
import okhttp3.internal.platform.android.C7491s;
import okhttp3.internal.platform.android.ld6;
import okhttp3.mcp;

/* JADX INFO: renamed from: okhttp3.internal.platform.k */
/* JADX INFO: compiled from: Android10Platform.kt */
/* JADX INFO: loaded from: classes4.dex */
@b7.zy
@lv5({"SMAP\nAndroid10Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n766#2:73\n857#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n*L\n43#1:73\n43#1:74,2\n*E\n"})
public final class C7496k extends C7498p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f94001f7l8 = new k(null);

    /* JADX INFO: renamed from: y */
    private static final boolean f43359y;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final List<ld6> f43360g;

    /* JADX INFO: renamed from: okhttp3.internal.platform.k$k */
    /* JADX INFO: compiled from: Android10Platform.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final C7498p m27235k() {
            if (toq()) {
                return new C7496k();
            }
            return null;
        }

        public final boolean toq() {
            return C7496k.f43359y;
        }
    }

    static {
        f43359y = C7498p.f43366k.m27250y() && Build.VERSION.SDK_INT >= 29;
    }

    public C7496k() {
        List listM22568r = kotlin.collections.ni7.m22568r(C7486k.f43347k.m27219k(), new C7489p(C7485g.f43342g.m27218q()), new C7489p(C7491s.f43350k.m27222k()), new C7489p(okhttp3.internal.platform.android.f7l8.f43341k.m27216k()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM22568r) {
            if (((ld6) obj).mo27213k()) {
                arrayList.add(obj);
            }
        }
        this.f43360g = arrayList;
    }

    @Override // okhttp3.internal.platform.C7498p
    /* JADX INFO: renamed from: g */
    public void mo27232g(@InterfaceC7396q SSLSocket sslSocket, @InterfaceC7395n String str, @InterfaceC7396q List<? extends mcp> protocols) {
        Object next;
        d2ok.m23075h(sslSocket, "sslSocket");
        d2ok.m23075h(protocols, "protocols");
        Iterator<T> it = this.f43360g.iterator();
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
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public String mo27233p(@InterfaceC7396q SSLSocket sslSocket) {
        Object next;
        d2ok.m23075h(sslSocket, "sslSocket");
        Iterator<T> it = this.f43360g.iterator();
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
        Iterator<T> it = this.f43360g.iterator();
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
    @SuppressLint({"NewApi"})
    public boolean x2(@InterfaceC7396q String hostname) {
        d2ok.m23075h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
