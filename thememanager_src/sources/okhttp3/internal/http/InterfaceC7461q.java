package okhttp3.internal.http;

import java.io.IOException;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.internal.connection.C7448g;
import okhttp3.jk;
import okio.nn86;
import okio.vyq;

/* JADX INFO: renamed from: okhttp3.internal.http.q */
/* JADX INFO: compiled from: ExchangeCodec.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7461q {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final k f43148k = k.f43149k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f93900toq = 100;

    /* JADX INFO: renamed from: okhttp3.internal.http.q$k */
    /* JADX INFO: compiled from: ExchangeCodec.kt */
    public static final class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ k f43149k = new k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f93901toq = 100;

        private k() {
        }
    }

    void cancel();

    @InterfaceC7395n
    fti.C7433k f7l8(boolean z2) throws IOException;

    /* JADX INFO: renamed from: g */
    void mo27087g(@InterfaceC7396q jk jkVar) throws IOException;

    /* JADX INFO: renamed from: k */
    void mo27088k() throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    vyq mo27089n(@InterfaceC7396q jk jkVar, long j2) throws IOException;

    /* JADX INFO: renamed from: q */
    long mo27090q(@InterfaceC7396q fti ftiVar) throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    fn3e mo27091s() throws IOException;

    @InterfaceC7396q
    nn86 toq(@InterfaceC7396q fti ftiVar) throws IOException;

    /* JADX INFO: renamed from: y */
    void mo27092y() throws IOException;

    @InterfaceC7396q
    C7448g zy();
}
