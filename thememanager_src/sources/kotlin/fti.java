package kotlin;

import cyoe.InterfaceC5981k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public class fti {

    /* JADX INFO: renamed from: kotlin.fti$k */
    /* JADX INFO: compiled from: LazyJVM.kt */
    public /* synthetic */ class C6228k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36274k;

        static {
            int[] iArr = new int[gvn7.values().length];
            try {
                iArr[gvn7.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gvn7.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gvn7.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36274k = iArr;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static <T> jk<T> m22825k(@InterfaceC7396q InterfaceC5981k<? extends T> initializer) {
        kotlin.jvm.internal.d2ok.m23075h(initializer, "initializer");
        return new zp(initializer, null, 2, null);
    }

    @InterfaceC7396q
    public static final <T> jk<T> toq(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC5981k<? extends T> initializer) {
        kotlin.jvm.internal.d2ok.m23075h(initializer, "initializer");
        return new zp(initializer, obj);
    }

    @InterfaceC7396q
    public static final <T> jk<T> zy(@InterfaceC7396q gvn7 mode, @InterfaceC7396q InterfaceC5981k<? extends T> initializer) {
        kotlin.jvm.internal.d2ok.m23075h(mode, "mode");
        kotlin.jvm.internal.d2ok.m23075h(initializer, "initializer");
        int i2 = C6228k.f36274k[mode.ordinal()];
        if (i2 == 1) {
            return new zp(initializer, null, 2, null);
        }
        if (i2 == 2) {
            return new ek5k(initializer);
        }
        if (i2 == 3) {
            return new gbni(initializer);
        }
        throw new oc();
    }
}
