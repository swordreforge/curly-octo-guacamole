package kotlin.jvm.internal;

import kotlin.collections.AbstractC6145i;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.p */
/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6306p {
    @InterfaceC7396q
    public static final kotlin.collections.hyr f7l8(@InterfaceC7396q long[] array) {
        d2ok.m23075h(array, "array");
        return new ld6(array);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final kotlin.collections.n5r1 m23140g(@InterfaceC7396q int[] array) {
        d2ok.m23075h(array, "array");
        return new f7l8(array);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final kotlin.collections.ki m23141k(@InterfaceC7396q boolean[] array) {
        d2ok.m23075h(array, "array");
        return new toq(array);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final kotlin.collections.eqxt m23142n(@InterfaceC7396q float[] array) {
        d2ok.m23075h(array, "array");
        return new C6291g(array);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final kotlin.collections.fti m23143q(@InterfaceC7396q double[] array) {
        d2ok.m23075h(array, "array");
        return new C6304n(array);
    }

    @InterfaceC7396q
    public static final kotlin.collections.t8r toq(@InterfaceC7396q byte[] array) {
        d2ok.m23075h(array, "array");
        return new zy(array);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final kotlin.collections.zp m23144y(@InterfaceC7396q short[] array) {
        d2ok.m23075h(array, "array");
        return new x2(array);
    }

    @InterfaceC7396q
    public static final AbstractC6145i zy(@InterfaceC7396q char[] array) {
        d2ok.m23075h(array, "array");
        return new C6307q(array);
    }
}
