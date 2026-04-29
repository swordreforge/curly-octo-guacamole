package okhttp3;

import java.util.List;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CookieJar.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface n7h {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7520k f43497k = C7520k.f43498k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final n7h f94068toq = new C7520k.k();

    /* JADX INFO: renamed from: okhttp3.n7h$k */
    /* JADX INFO: compiled from: CookieJar.kt */
    public static final class C7520k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ C7520k f43498k = new C7520k();

        /* JADX INFO: renamed from: okhttp3.n7h$k$k */
        /* JADX INFO: compiled from: CookieJar.kt */
        private static final class k implements n7h {
            @Override // okhttp3.n7h
            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public List<qrj> mo27368k(@InterfaceC7396q zurt url) {
                d2ok.m23075h(url, "url");
                return kotlin.collections.ni7.a9();
            }

            @Override // okhttp3.n7h
            public void toq(@InterfaceC7396q zurt url, @InterfaceC7396q List<qrj> cookies) {
                d2ok.m23075h(url, "url");
                d2ok.m23075h(cookies, "cookies");
            }
        }

        private C7520k() {
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    List<qrj> mo27368k(@InterfaceC7396q zurt zurtVar);

    void toq(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q List<qrj> list);
}
