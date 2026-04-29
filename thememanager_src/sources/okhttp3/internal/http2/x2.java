package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface x2 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7480k f43318k = C7480k.f43319k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final x2 f93979toq = new C7480k.k();

    /* JADX INFO: renamed from: okhttp3.internal.http2.x2$k */
    /* JADX INFO: compiled from: PushObserver.kt */
    public static final class C7480k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ C7480k f43319k = new C7480k();

        /* JADX INFO: renamed from: okhttp3.internal.http2.x2$k$k */
        /* JADX INFO: compiled from: PushObserver.kt */
        private static final class k implements x2 {
            @Override // okhttp3.internal.http2.x2
            /* JADX INFO: renamed from: k */
            public void mo27191k(int i2, @InterfaceC7396q toq errorCode) {
                d2ok.m23075h(errorCode, "errorCode");
            }

            @Override // okhttp3.internal.http2.x2
            /* JADX INFO: renamed from: q */
            public boolean mo27192q(int i2, @InterfaceC7396q okio.n7h source, int i3, boolean z2) throws IOException {
                d2ok.m23075h(source, "source");
                source.skip(i3);
                return true;
            }

            @Override // okhttp3.internal.http2.x2
            public boolean toq(int i2, @InterfaceC7396q List<zy> requestHeaders) {
                d2ok.m23075h(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.x2
            public boolean zy(int i2, @InterfaceC7396q List<zy> responseHeaders, boolean z2) {
                d2ok.m23075h(responseHeaders, "responseHeaders");
                return true;
            }
        }

        private C7480k() {
        }
    }

    /* JADX INFO: renamed from: k */
    void mo27191k(int i2, @InterfaceC7396q toq toqVar);

    /* JADX INFO: renamed from: q */
    boolean mo27192q(int i2, @InterfaceC7396q okio.n7h n7hVar, int i3, boolean z2) throws IOException;

    boolean toq(int i2, @InterfaceC7396q List<zy> list);

    boolean zy(int i2, @InterfaceC7396q List<zy> list, boolean z2);
}
