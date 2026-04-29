package kotlin.io.path;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: OnErrorResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.8")
@InterfaceC6261g
public final class ld6 {
    public static final ld6 SKIP_SUBTREE = new ld6("SKIP_SUBTREE", 0);
    public static final ld6 TERMINATE = new ld6("TERMINATE", 1);

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ ld6[] f36344k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36345q;

    static {
        ld6[] qVar = toq();
        f36344k = qVar;
        f36345q = kotlin.enums.toq.toq(qVar);
    }

    private ld6(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<ld6> getEntries() {
        return f36345q;
    }

    private static final /* synthetic */ ld6[] toq() {
        return new ld6[]{SKIP_SUBTREE, TERMINATE};
    }

    public static ld6 valueOf(String str) {
        return (ld6) Enum.valueOf(ld6.class, str);
    }

    public static ld6[] values() {
        return (ld6[]) f36344k.clone();
    }
}
