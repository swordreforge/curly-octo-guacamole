package okio;

import cyoe.InterfaceC5981k;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.C6433g;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: -JvmPlatform.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ek5k {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final byte[] m27605k(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        byte[] bytes = str.getBytes(C6433g.f81921toq);
        kotlin.jvm.internal.d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* JADX INFO: renamed from: q */
    public static final <T> T m27606q(@InterfaceC7396q ReentrantLock reentrantLock, @InterfaceC7396q InterfaceC5981k<? extends T> action) {
        kotlin.jvm.internal.d2ok.m23075h(reentrantLock, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        reentrantLock.lock();
        try {
            return action.invoke();
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    @InterfaceC7396q
    public static final ReentrantLock toq() {
        return new ReentrantLock();
    }

    @InterfaceC7396q
    public static final String zy(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return new String(bArr, C6433g.f81921toq);
    }
}
