package kotlin;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class gvn7 {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ gvn7[] f36275k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36276q;
    public static final gvn7 SYNCHRONIZED = new gvn7("SYNCHRONIZED", 0);
    public static final gvn7 PUBLICATION = new gvn7("PUBLICATION", 1);
    public static final gvn7 NONE = new gvn7("NONE", 2);

    static {
        gvn7[] qVar = toq();
        f36275k = qVar;
        f36276q = kotlin.enums.toq.toq(qVar);
    }

    private gvn7(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<gvn7> getEntries() {
        return f36276q;
    }

    private static final /* synthetic */ gvn7[] toq() {
        return new gvn7[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    public static gvn7 valueOf(String str) {
        return (gvn7) Enum.valueOf(gvn7.class, str);
    }

    public static gvn7[] values() {
        return (gvn7[]) f36275k.clone();
    }
}
