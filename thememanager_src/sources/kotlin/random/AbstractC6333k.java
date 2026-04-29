package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.random.k */
/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public abstract class AbstractC6333k extends AbstractC6332g {
    @InterfaceC7396q
    public abstract Random getImpl();

    @Override // kotlin.random.AbstractC6332g
    public int nextBits(int i2) {
        return f7l8.m23272p(getImpl().nextInt(), i2);
    }

    @Override // kotlin.random.AbstractC6332g
    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @Override // kotlin.random.AbstractC6332g
    @InterfaceC7396q
    public byte[] nextBytes(@InterfaceC7396q byte[] array) {
        d2ok.m23075h(array, "array");
        getImpl().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.AbstractC6332g
    public double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // kotlin.random.AbstractC6332g
    public float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // kotlin.random.AbstractC6332g
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // kotlin.random.AbstractC6332g
    public long nextLong() {
        return getImpl().nextLong();
    }

    @Override // kotlin.random.AbstractC6332g
    public int nextInt(int i2) {
        return getImpl().nextInt(i2);
    }
}
