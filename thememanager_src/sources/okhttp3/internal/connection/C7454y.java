package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import okhttp3.gvn7;

/* JADX INFO: renamed from: okhttp3.internal.connection.y */
/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7454y {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Set<gvn7> f43115k = new LinkedHashSet();

    /* JADX INFO: renamed from: k */
    public final synchronized void m27054k(@InterfaceC7396q gvn7 route) {
        d2ok.m23075h(route, "route");
        this.f43115k.remove(route);
    }

    public final synchronized void toq(@InterfaceC7396q gvn7 failedRoute) {
        d2ok.m23075h(failedRoute, "failedRoute");
        this.f43115k.add(failedRoute);
    }

    public final synchronized boolean zy(@InterfaceC7396q gvn7 route) {
        d2ok.m23075h(route, "route");
        return this.f43115k.contains(route);
    }
}
