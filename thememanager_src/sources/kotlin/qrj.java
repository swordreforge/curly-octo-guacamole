package kotlin;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class qrj {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ qrj[] f36492k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36493q;
    public static final qrj WARNING = new qrj("WARNING", 0);
    public static final qrj ERROR = new qrj("ERROR", 1);
    public static final qrj HIDDEN = new qrj("HIDDEN", 2);

    static {
        qrj[] qVar = toq();
        f36492k = qVar;
        f36493q = kotlin.enums.toq.toq(qVar);
    }

    private qrj(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<qrj> getEntries() {
        return f36493q;
    }

    private static final /* synthetic */ qrj[] toq() {
        return new qrj[]{WARNING, ERROR, HIDDEN};
    }

    public static qrj valueOf(String str) {
        return (qrj) Enum.valueOf(qrj.class, str);
    }

    public static qrj[] values() {
        return (qrj[]) f36492k.clone();
    }
}
