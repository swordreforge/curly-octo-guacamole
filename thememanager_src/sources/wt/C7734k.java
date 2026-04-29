package wt;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.d2ok;
import kotlin.random.AbstractC6333k;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: wt.k */
/* JADX INFO: compiled from: PlatformThreadLocalRandom.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C7734k extends AbstractC6333k {
    @Override // kotlin.random.AbstractC6333k
    @InterfaceC7396q
    public Random getImpl() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        d2ok.kja0(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }

    @Override // kotlin.random.AbstractC6332g
    public double nextDouble(double d2) {
        return ThreadLocalRandom.current().nextDouble(d2);
    }

    @Override // kotlin.random.AbstractC6332g
    public int nextInt(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // kotlin.random.AbstractC6332g
    public long nextLong(long j2) {
        return ThreadLocalRandom.current().nextLong(j2);
    }

    @Override // kotlin.random.AbstractC6332g
    public long nextLong(long j2, long j3) {
        return ThreadLocalRandom.current().nextLong(j2, j3);
    }
}
