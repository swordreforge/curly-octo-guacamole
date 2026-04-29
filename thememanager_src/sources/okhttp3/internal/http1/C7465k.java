package okhttp3.internal.http1;

import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;
import okhttp3.fn3e;
import okio.n7h;

/* JADX INFO: renamed from: okhttp3.internal.http1.k */
/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7465k {

    /* JADX INFO: renamed from: q */
    private static final int f43157q = 262144;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f93904zy = new k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final n7h f43158k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f93905toq;

    /* JADX INFO: renamed from: okhttp3.internal.http1.k$k */
    /* JADX INFO: compiled from: HeadersReader.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C7465k(@InterfaceC7396q n7h source) {
        d2ok.m23075h(source, "source");
        this.f43158k = source;
        this.f93905toq = 262144L;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final n7h m27097k() {
        return this.f43158k;
    }

    @InterfaceC7396q
    public final fn3e toq() throws IOException {
        fn3e.C7432k c7432k = new fn3e.C7432k();
        while (true) {
            String strZy = zy();
            if (strZy.length() == 0) {
                return c7432k.m26870s();
            }
            c7432k.m26865g(strZy);
        }
    }

    @InterfaceC7396q
    public final String zy() throws IOException {
        String strMo27613r = this.f43158k.mo27613r(this.f93905toq);
        this.f93905toq -= (long) strMo27613r.length();
        return strMo27613r;
    }
}
