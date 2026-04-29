package kotlin.io.path;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CopyActionResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.8")
@InterfaceC6261g
public final class toq {
    public static final toq CONTINUE = new toq("CONTINUE", 0);
    public static final toq SKIP_SUBTREE = new toq("SKIP_SUBTREE", 1);
    public static final toq TERMINATE = new toq("TERMINATE", 2);

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ toq[] f36357k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36358q;

    static {
        toq[] qVar = toq();
        f36357k = qVar;
        f36358q = kotlin.enums.toq.toq(qVar);
    }

    private toq(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<toq> getEntries() {
        return f36358q;
    }

    private static final /* synthetic */ toq[] toq() {
        return new toq[]{CONTINUE, SKIP_SUBTREE, TERMINATE};
    }

    public static toq valueOf(String str) {
        return (toq) Enum.valueOf(toq.class, str);
    }

    public static toq[] values() {
        return (toq[]) f36357k.clone();
    }
}
