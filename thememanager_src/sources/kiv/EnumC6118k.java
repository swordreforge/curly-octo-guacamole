package kiv;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kiv.k */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6118k {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC6118k[] f36091k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36092q;
    public static final EnumC6118k SOURCE = new EnumC6118k("SOURCE", 0);
    public static final EnumC6118k BINARY = new EnumC6118k("BINARY", 1);
    public static final EnumC6118k RUNTIME = new EnumC6118k("RUNTIME", 2);

    static {
        EnumC6118k[] qVar = toq();
        f36091k = qVar;
        f36092q = kotlin.enums.toq.toq(qVar);
    }

    private EnumC6118k(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<EnumC6118k> getEntries() {
        return f36092q;
    }

    private static final /* synthetic */ EnumC6118k[] toq() {
        return new EnumC6118k[]{SOURCE, BINARY, RUNTIME};
    }

    public static EnumC6118k valueOf(String str) {
        return (EnumC6118k) Enum.valueOf(EnumC6118k.class, str);
    }

    public static EnumC6118k[] values() {
        return (EnumC6118k[]) f36091k.clone();
    }
}
