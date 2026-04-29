package kotlin.reflect;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: KVisibility.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.1")
public final class ni7 {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ ni7[] f36579k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36580q;
    public static final ni7 PUBLIC = new ni7("PUBLIC", 0);
    public static final ni7 PROTECTED = new ni7("PROTECTED", 1);
    public static final ni7 INTERNAL = new ni7("INTERNAL", 2);
    public static final ni7 PRIVATE = new ni7("PRIVATE", 3);

    static {
        ni7[] qVar = toq();
        f36579k = qVar;
        f36580q = kotlin.enums.toq.toq(qVar);
    }

    private ni7(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<ni7> getEntries() {
        return f36580q;
    }

    private static final /* synthetic */ ni7[] toq() {
        return new ni7[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    public static ni7 valueOf(String str) {
        return (ni7) Enum.valueOf(ni7.class, str);
    }

    public static ni7[] values() {
        return (ni7[]) f36579k.clone();
    }
}
