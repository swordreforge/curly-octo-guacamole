package oph;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.zurt;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: oph.k */
/* JADX INFO: compiled from: NullProxySelector.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class C7581k extends ProxySelector {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7581k f43863k = new C7581k();

    private C7581k() {
    }

    @Override // java.net.ProxySelector
    public void connectFailed(@InterfaceC7395n URI uri, @InterfaceC7395n SocketAddress socketAddress, @InterfaceC7395n IOException iOException) {
    }

    @Override // java.net.ProxySelector
    @InterfaceC7396q
    public List<Proxy> select(@InterfaceC7395n URI uri) {
        if (uri != null) {
            return zurt.ld6(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
