package okio;

import java.util.concurrent.atomic.AtomicReference;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class lrht {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final AtomicReference<C7541c>[] f43790n;

    /* JADX INFO: renamed from: q */
    private static final int f43791q;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final lrht f43789k = new lrht();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f94291toq = 65536;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final C7541c f94292zy = new C7541c(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f43791q = iHighestOneBit;
        AtomicReference<C7541c>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i2 = 0; i2 < iHighestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f43790n = atomicReferenceArr;
    }

    private lrht() {
    }

    /* JADX INFO: renamed from: k */
    private final AtomicReference<C7541c> m27784k() {
        return f43790n[(int) (Thread.currentThread().getId() & (((long) f43791q) - 1))];
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: n */
    public static final C7541c m27785n() {
        AtomicReference<C7541c> atomicReferenceM27784k = f43789k.m27784k();
        C7541c c7541c = f94292zy;
        C7541c andSet = atomicReferenceM27784k.getAndSet(c7541c);
        if (andSet == c7541c) {
            return new C7541c();
        }
        if (andSet == null) {
            atomicReferenceM27784k.set(null);
            return new C7541c();
        }
        atomicReferenceM27784k.set(andSet.f43686g);
        andSet.f43686g = null;
        andSet.f94264zy = 0;
        return andSet;
    }

    @l05.qrj
    /* JADX INFO: renamed from: q */
    public static final void m27786q(@InterfaceC7396q C7541c segment) {
        AtomicReference<C7541c> atomicReferenceM27784k;
        C7541c c7541c;
        C7541c andSet;
        kotlin.jvm.internal.d2ok.m23075h(segment, "segment");
        if (!(segment.f43686g == null && segment.f94262f7l8 == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f43689q || (andSet = (atomicReferenceM27784k = f43789k.m27784k()).getAndSet((c7541c = f94292zy))) == c7541c) {
            return;
        }
        int i2 = andSet != null ? andSet.f94264zy : 0;
        if (i2 >= f94291toq) {
            atomicReferenceM27784k.set(andSet);
            return;
        }
        segment.f43686g = andSet;
        segment.f94263toq = 0;
        segment.f94264zy = i2 + 8192;
        atomicReferenceM27784k.set(segment);
    }

    public final int toq() {
        C7541c c7541c = m27784k().get();
        if (c7541c == null) {
            return 0;
        }
        return c7541c.f94264zy;
    }

    public final int zy() {
        return f94291toq;
    }
}
