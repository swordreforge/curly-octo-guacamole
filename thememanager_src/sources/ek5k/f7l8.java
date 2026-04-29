package ek5k;

import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.d2ok;
import kotlinx.coroutines.dd;
import kotlinx.coroutines.ikck;
import l05.qrj;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThemeCoroutines.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final f7l8 f34394k = new f7l8();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final dd f73813toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final dd f73814zy;

    static {
        ThreadPoolExecutor threadPoolExecutorLd6 = C6002g.ld6();
        d2ok.kja0(threadPoolExecutorLd6, "getLocalTaskExecutor(...)");
        f73813toq = ikck.m24313q(threadPoolExecutorLd6);
        ThreadPoolExecutor threadPoolExecutorX2 = C6002g.x2();
        d2ok.kja0(threadPoolExecutorX2, "getLongOnlineTaskExecutor(...)");
        f73814zy = ikck.m24313q(threadPoolExecutorX2);
    }

    private f7l8() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final dd m22238k() {
        return f73813toq;
    }

    @qrj
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m22239q() {
    }

    @qrj
    public static /* synthetic */ void toq() {
    }

    @InterfaceC7396q
    public static final dd zy() {
        return f73814zy;
    }
}
