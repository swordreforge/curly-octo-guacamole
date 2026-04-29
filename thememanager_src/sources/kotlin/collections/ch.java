package kotlin.collections;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes3.dex */
final class ch {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ ch[] f36136k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36137q;
    public static final ch Ready = new ch("Ready", 0);
    public static final ch NotReady = new ch("NotReady", 1);
    public static final ch Done = new ch("Done", 2);
    public static final ch Failed = new ch("Failed", 3);

    static {
        ch[] qVar = toq();
        f36136k = qVar;
        f36137q = kotlin.enums.toq.toq(qVar);
    }

    private ch(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<ch> getEntries() {
        return f36137q;
    }

    private static final /* synthetic */ ch[] toq() {
        return new ch[]{Ready, NotReady, Done, Failed};
    }

    public static ch valueOf(String str) {
        return (ch) Enum.valueOf(ch.class, str);
    }

    public static ch[] values() {
        return (ch[]) f36136k.clone();
    }
}
