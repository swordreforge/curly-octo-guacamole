package kotlin.internal;

import kotlin.enums.InterfaceC6225k;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.2")
public final class cdj {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ cdj[] f36289k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36290q;
    public static final cdj LANGUAGE_VERSION = new cdj("LANGUAGE_VERSION", 0);
    public static final cdj COMPILER_VERSION = new cdj("COMPILER_VERSION", 1);
    public static final cdj API_VERSION = new cdj("API_VERSION", 2);

    static {
        cdj[] qVar = toq();
        f36289k = qVar;
        f36290q = kotlin.enums.toq.toq(qVar);
    }

    private cdj(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<cdj> getEntries() {
        return f36290q;
    }

    private static final /* synthetic */ cdj[] toq() {
        return new cdj[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION};
    }

    public static cdj valueOf(String str) {
        return (cdj) Enum.valueOf(cdj.class, str);
    }

    public static cdj[] values() {
        return (cdj[]) f36289k.clone();
    }
}
