package g0ad;

import cyoe.InterfaceC5981k;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Timing.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "TimingKt")
public final class toq {
    /* JADX INFO: renamed from: k */
    public static final long m22276k(@InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(block, "block");
        long jNanoTime = System.nanoTime();
        block.invoke();
        return System.nanoTime() - jNanoTime;
    }

    public static final long toq(@InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(block, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        block.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
