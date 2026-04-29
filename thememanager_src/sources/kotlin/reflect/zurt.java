package kotlin.reflect;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: KVariance.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.1")
public final class zurt {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ zurt[] f36583k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36584q;
    public static final zurt INVARIANT = new zurt("INVARIANT", 0);
    public static final zurt IN = new zurt(com.market.sdk.utils.kja0.f28213k, 1);
    public static final zurt OUT = new zurt("OUT", 2);

    static {
        zurt[] qVar = toq();
        f36583k = qVar;
        f36584q = kotlin.enums.toq.toq(qVar);
    }

    private zurt(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<zurt> getEntries() {
        return f36584q;
    }

    private static final /* synthetic */ zurt[] toq() {
        return new zurt[]{INVARIANT, IN, OUT};
    }

    public static zurt valueOf(String str) {
        return (zurt) Enum.valueOf(zurt.class, str);
    }

    public static zurt[] values() {
        return (zurt[]) f36583k.clone();
    }
}
