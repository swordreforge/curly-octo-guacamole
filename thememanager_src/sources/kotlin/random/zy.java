package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes3.dex */
final class zy extends Random {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final C6339k f36503k = new C6339k(null);
    private static final long serialVersionUID = 0;

    @InterfaceC7396q
    private final AbstractC6332g impl;
    private boolean seedInitialized;

    /* JADX INFO: renamed from: kotlin.random.zy$k */
    /* JADX INFO: compiled from: PlatformRandom.kt */
    private static final class C6339k {
        private C6339k() {
        }

        public /* synthetic */ C6339k(ni7 ni7Var) {
            this();
        }
    }

    public zy(@InterfaceC7396q AbstractC6332g impl) {
        d2ok.m23075h(impl, "impl");
        this.impl = impl;
    }

    @InterfaceC7396q
    public final AbstractC6332g getImpl() {
        return this.impl;
    }

    @Override // java.util.Random
    protected int next(int i2) {
        return this.impl.nextBits(i2);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(@InterfaceC7396q byte[] bytes) {
        d2ok.m23075h(bytes, "bytes");
        this.impl.nextBytes(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.impl.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.impl.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.impl.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.impl.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long j2) {
        if (this.seedInitialized) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.seedInitialized = true;
    }

    @Override // java.util.Random
    public int nextInt(int i2) {
        return this.impl.nextInt(i2);
    }
}
