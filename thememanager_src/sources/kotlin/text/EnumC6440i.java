package kotlin.text;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kotlin.text.i */
/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6440i implements InterfaceC6454s {
    public static final EnumC6440i CANON_EQ;
    public static final EnumC6440i COMMENTS;
    public static final EnumC6440i DOT_MATCHES_ALL;
    public static final EnumC6440i IGNORE_CASE;
    public static final EnumC6440i LITERAL;
    public static final EnumC6440i MULTILINE;
    public static final EnumC6440i UNIX_LINES;

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC6440i[] f36694k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36695q;
    private final int mask;
    private final int value;

    static {
        int i2 = 2;
        IGNORE_CASE = new EnumC6440i("IGNORE_CASE", 0, i2, 0, 2, null);
        int i3 = 0;
        int i4 = 2;
        kotlin.jvm.internal.ni7 ni7Var = null;
        MULTILINE = new EnumC6440i("MULTILINE", 1, 8, i3, i4, ni7Var);
        int i5 = 0;
        int i6 = 2;
        kotlin.jvm.internal.ni7 ni7Var2 = null;
        LITERAL = new EnumC6440i("LITERAL", i2, 16, i5, i6, ni7Var2);
        UNIX_LINES = new EnumC6440i("UNIX_LINES", 3, 1, i3, i4, ni7Var);
        COMMENTS = new EnumC6440i("COMMENTS", 4, 4, i5, i6, ni7Var2);
        DOT_MATCHES_ALL = new EnumC6440i("DOT_MATCHES_ALL", 5, 32, i3, i4, ni7Var);
        CANON_EQ = new EnumC6440i("CANON_EQ", 6, 128, i5, i6, ni7Var2);
        EnumC6440i[] qVar = toq();
        f36694k = qVar;
        f36695q = kotlin.enums.toq.toq(qVar);
    }

    private EnumC6440i(String str, int i2, int i3, int i4) {
        this.value = i3;
        this.mask = i4;
    }

    @InterfaceC7396q
    public static InterfaceC6225k<EnumC6440i> getEntries() {
        return f36695q;
    }

    private static final /* synthetic */ EnumC6440i[] toq() {
        return new EnumC6440i[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static EnumC6440i valueOf(String str) {
        return (EnumC6440i) Enum.valueOf(EnumC6440i.class, str);
    }

    public static EnumC6440i[] values() {
        return (EnumC6440i[]) f36694k.clone();
    }

    @Override // kotlin.text.InterfaceC6454s
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.InterfaceC6454s
    public int getValue() {
        return this.value;
    }

    /* synthetic */ EnumC6440i(String str, int i2, int i3, int i4, int i5, kotlin.jvm.internal.ni7 ni7Var) {
        this(str, i2, i3, (i5 & 2) != 0 ? i3 : i4);
    }
}
