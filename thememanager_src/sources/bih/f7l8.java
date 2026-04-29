package bih;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ContractBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1369g
@yz(version = "1.3")
@kotlin.internal.toq
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ f7l8[] f7277k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f7278q;

    @kotlin.internal.toq
    public static final f7l8 AT_MOST_ONCE = new f7l8("AT_MOST_ONCE", 0);

    @kotlin.internal.toq
    public static final f7l8 AT_LEAST_ONCE = new f7l8("AT_LEAST_ONCE", 1);

    @kotlin.internal.toq
    public static final f7l8 EXACTLY_ONCE = new f7l8("EXACTLY_ONCE", 2);

    @kotlin.internal.toq
    public static final f7l8 UNKNOWN = new f7l8("UNKNOWN", 3);

    static {
        f7l8[] qVar = toq();
        f7277k = qVar;
        f7278q = kotlin.enums.toq.toq(qVar);
    }

    private f7l8(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<f7l8> getEntries() {
        return f7278q;
    }

    private static final /* synthetic */ f7l8[] toq() {
        return new f7l8[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
    }

    public static f7l8 valueOf(String str) {
        return (f7l8) Enum.valueOf(f7l8.class, str);
    }

    public static f7l8[] values() {
        return (f7l8[]) f7277k.clone();
    }
}
