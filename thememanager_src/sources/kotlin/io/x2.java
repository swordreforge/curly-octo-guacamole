package kotlin.io;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x2 {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ x2[] f36374k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36375q;
    public static final x2 TOP_DOWN = new x2("TOP_DOWN", 0);
    public static final x2 BOTTOM_UP = new x2("BOTTOM_UP", 1);

    static {
        x2[] qVar = toq();
        f36374k = qVar;
        f36375q = kotlin.enums.toq.toq(qVar);
    }

    private x2(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<x2> getEntries() {
        return f36375q;
    }

    private static final /* synthetic */ x2[] toq() {
        return new x2[]{TOP_DOWN, BOTTOM_UP};
    }

    public static x2 valueOf(String str) {
        return (x2) Enum.valueOf(x2.class, str);
    }

    public static x2[] values() {
        return (x2[]) f36374k.clone();
    }
}
