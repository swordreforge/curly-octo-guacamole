package okhttp3.internal.http;

import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.fu4;
import okhttp3.jp0y;
import okio.n7h;

/* JADX INFO: renamed from: okhttp3.internal.http.y */
/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7463y extends jp0y {

    /* JADX INFO: renamed from: g */
    private final long f43152g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final String f43153n;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final n7h f43154y;

    public C7463y(@InterfaceC7395n String str, long j2, @InterfaceC7396q n7h source) {
        d2ok.m23075h(source, "source");
        this.f43153n = str;
        this.f43152g = j2;
        this.f43154y = source;
    }

    @Override // okhttp3.jp0y
    @InterfaceC7395n
    /* JADX INFO: renamed from: h */
    public fu4 mo27094h() {
        String str = this.f43153n;
        if (str != null) {
            return fu4.f42952n.m26909q(str);
        }
        return null;
    }

    @Override // okhttp3.jp0y
    public long x2() {
        return this.f43152g;
    }

    @Override // okhttp3.jp0y
    @InterfaceC7396q
    public n7h y9n() {
        return this.f43154y;
    }
}
