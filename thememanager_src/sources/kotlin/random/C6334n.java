package kotlin.random;

import java.util.Random;
import kotlin.internal.InterfaceC6234g;
import kotlin.internal.qrj;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.random.n */
/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6334n {
    @InterfaceC7396q
    @yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    public static final Random m23276k(@InterfaceC7396q AbstractC6332g abstractC6332g) {
        Random impl;
        d2ok.m23075h(abstractC6332g, "<this>");
        AbstractC6333k abstractC6333k = abstractC6332g instanceof AbstractC6333k ? (AbstractC6333k) abstractC6332g : null;
        return (abstractC6333k == null || (impl = abstractC6333k.getImpl()) == null) ? new zy(abstractC6332g) : impl;
    }

    /* JADX INFO: renamed from: q */
    public static final double m23277q(int i2, int i3) {
        return ((((long) i2) << 27) + ((long) i3)) / 9.007199254740992E15d;
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final AbstractC6332g toq(@InterfaceC7396q Random random) {
        AbstractC6332g impl;
        d2ok.m23075h(random, "<this>");
        zy zyVar = random instanceof zy ? (zy) random : null;
        return (zyVar == null || (impl = zyVar.getImpl()) == null) ? new C6335q(random) : impl;
    }

    @InterfaceC6234g
    private static final AbstractC6332g zy() {
        return qrj.f36293k.toq();
    }
}
