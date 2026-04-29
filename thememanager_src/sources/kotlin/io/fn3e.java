package kotlin.io;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class fn3e {
    public static final fn3e SKIP = new fn3e("SKIP", 0);
    public static final fn3e TERMINATE = new fn3e("TERMINATE", 1);

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ fn3e[] f36320k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36321q;

    static {
        fn3e[] qVar = toq();
        f36320k = qVar;
        f36321q = kotlin.enums.toq.toq(qVar);
    }

    private fn3e(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<fn3e> getEntries() {
        return f36321q;
    }

    private static final /* synthetic */ fn3e[] toq() {
        return new fn3e[]{SKIP, TERMINATE};
    }

    public static fn3e valueOf(String str) {
        return (fn3e) Enum.valueOf(fn3e.class, str);
    }

    public static fn3e[] values() {
        return (fn3e[]) f36320k.clone();
    }
}
