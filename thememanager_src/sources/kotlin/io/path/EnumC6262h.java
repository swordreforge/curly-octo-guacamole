package kotlin.io.path;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kotlin.io.path.h */
/* JADX INFO: compiled from: PathWalkOption.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.7")
@InterfaceC6261g
public final class EnumC6262h {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC6262h[] f36342k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36343q;
    public static final EnumC6262h INCLUDE_DIRECTORIES = new EnumC6262h("INCLUDE_DIRECTORIES", 0);
    public static final EnumC6262h BREADTH_FIRST = new EnumC6262h("BREADTH_FIRST", 1);
    public static final EnumC6262h FOLLOW_LINKS = new EnumC6262h("FOLLOW_LINKS", 2);

    static {
        EnumC6262h[] qVar = toq();
        f36342k = qVar;
        f36343q = kotlin.enums.toq.toq(qVar);
    }

    private EnumC6262h(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<EnumC6262h> getEntries() {
        return f36343q;
    }

    private static final /* synthetic */ EnumC6262h[] toq() {
        return new EnumC6262h[]{INCLUDE_DIRECTORIES, BREADTH_FIRST, FOLLOW_LINKS};
    }

    public static EnumC6262h valueOf(String str) {
        return (EnumC6262h) Enum.valueOf(EnumC6262h.class, str);
    }

    public static EnumC6262h[] values() {
        return (EnumC6262h[]) f36342k.clone();
    }
}
