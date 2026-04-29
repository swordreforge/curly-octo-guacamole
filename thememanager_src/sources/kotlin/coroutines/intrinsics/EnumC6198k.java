package kotlin.coroutines.intrinsics;

import kotlin.enums.InterfaceC6225k;
import kotlin.nn86;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kotlin.coroutines.intrinsics.k */
/* JADX INFO: compiled from: Intrinsics.kt */
/* JADX INFO: loaded from: classes3.dex */
@nn86
@yz(version = "1.3")
public final class EnumC6198k {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC6198k[] f36251k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36252q;
    public static final EnumC6198k COROUTINE_SUSPENDED = new EnumC6198k("COROUTINE_SUSPENDED", 0);
    public static final EnumC6198k UNDECIDED = new EnumC6198k("UNDECIDED", 1);
    public static final EnumC6198k RESUMED = new EnumC6198k("RESUMED", 2);

    static {
        EnumC6198k[] qVar = toq();
        f36251k = qVar;
        f36252q = kotlin.enums.toq.toq(qVar);
    }

    private EnumC6198k(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<EnumC6198k> getEntries() {
        return f36252q;
    }

    private static final /* synthetic */ EnumC6198k[] toq() {
        return new EnumC6198k[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static EnumC6198k valueOf(String str) {
        return (EnumC6198k) Enum.valueOf(EnumC6198k.class, str);
    }

    public static EnumC6198k[] values() {
        return (EnumC6198k[]) f36251k.clone();
    }
}
