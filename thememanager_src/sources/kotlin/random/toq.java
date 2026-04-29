package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class toq extends AbstractC6333k {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final C6337k f36502q = new C6337k();

    /* JADX INFO: renamed from: kotlin.random.toq$k */
    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class C6337k extends ThreadLocal<Random> {
        C6337k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.random.AbstractC6333k
    @InterfaceC7396q
    public Random getImpl() {
        Random random = this.f36502q.get();
        d2ok.kja0(random, "implStorage.get()");
        return random;
    }
}
