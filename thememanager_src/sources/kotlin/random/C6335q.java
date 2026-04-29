package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.random.q */
/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6335q extends AbstractC6333k implements Serializable {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final k f36495q = new k(null);
    private static final long serialVersionUID = 0;

    @InterfaceC7396q
    private final Random impl;

    /* JADX INFO: renamed from: kotlin.random.q$k */
    /* JADX INFO: compiled from: PlatformRandom.kt */
    private static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C6335q(@InterfaceC7396q Random impl) {
        d2ok.m23075h(impl, "impl");
        this.impl = impl;
    }

    @Override // kotlin.random.AbstractC6333k
    @InterfaceC7396q
    public Random getImpl() {
        return this.impl;
    }
}
