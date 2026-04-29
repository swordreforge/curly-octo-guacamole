package kotlin.text;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kotlin.text.k */
/* JADX INFO: compiled from: CharCategoryJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6441k {

    @InterfaceC7396q
    public static final k Companion;

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC6441k[] f36696k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f36697q;

    @InterfaceC7396q
    private final String code;
    private final int value;
    public static final EnumC6441k UNASSIGNED = new EnumC6441k("UNASSIGNED", 0, 0, "Cn");
    public static final EnumC6441k UPPERCASE_LETTER = new EnumC6441k("UPPERCASE_LETTER", 1, 1, "Lu");
    public static final EnumC6441k LOWERCASE_LETTER = new EnumC6441k("LOWERCASE_LETTER", 2, 2, "Ll");
    public static final EnumC6441k TITLECASE_LETTER = new EnumC6441k("TITLECASE_LETTER", 3, 3, "Lt");
    public static final EnumC6441k MODIFIER_LETTER = new EnumC6441k("MODIFIER_LETTER", 4, 4, "Lm");
    public static final EnumC6441k OTHER_LETTER = new EnumC6441k("OTHER_LETTER", 5, 5, "Lo");
    public static final EnumC6441k NON_SPACING_MARK = new EnumC6441k("NON_SPACING_MARK", 6, 6, "Mn");
    public static final EnumC6441k ENCLOSING_MARK = new EnumC6441k("ENCLOSING_MARK", 7, 7, "Me");
    public static final EnumC6441k COMBINING_SPACING_MARK = new EnumC6441k("COMBINING_SPACING_MARK", 8, 8, "Mc");
    public static final EnumC6441k DECIMAL_DIGIT_NUMBER = new EnumC6441k("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
    public static final EnumC6441k LETTER_NUMBER = new EnumC6441k("LETTER_NUMBER", 10, 10, "Nl");
    public static final EnumC6441k OTHER_NUMBER = new EnumC6441k("OTHER_NUMBER", 11, 11, "No");
    public static final EnumC6441k SPACE_SEPARATOR = new EnumC6441k("SPACE_SEPARATOR", 12, 12, "Zs");
    public static final EnumC6441k LINE_SEPARATOR = new EnumC6441k("LINE_SEPARATOR", 13, 13, "Zl");
    public static final EnumC6441k PARAGRAPH_SEPARATOR = new EnumC6441k("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
    public static final EnumC6441k CONTROL = new EnumC6441k("CONTROL", 15, 15, "Cc");
    public static final EnumC6441k FORMAT = new EnumC6441k("FORMAT", 16, 16, "Cf");
    public static final EnumC6441k PRIVATE_USE = new EnumC6441k("PRIVATE_USE", 17, 18, "Co");
    public static final EnumC6441k SURROGATE = new EnumC6441k("SURROGATE", 18, 19, "Cs");
    public static final EnumC6441k DASH_PUNCTUATION = new EnumC6441k("DASH_PUNCTUATION", 19, 20, "Pd");
    public static final EnumC6441k START_PUNCTUATION = new EnumC6441k("START_PUNCTUATION", 20, 21, "Ps");
    public static final EnumC6441k END_PUNCTUATION = new EnumC6441k("END_PUNCTUATION", 21, 22, "Pe");
    public static final EnumC6441k CONNECTOR_PUNCTUATION = new EnumC6441k("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    public static final EnumC6441k OTHER_PUNCTUATION = new EnumC6441k("OTHER_PUNCTUATION", 23, 24, "Po");
    public static final EnumC6441k MATH_SYMBOL = new EnumC6441k("MATH_SYMBOL", 24, 25, "Sm");
    public static final EnumC6441k CURRENCY_SYMBOL = new EnumC6441k("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final EnumC6441k MODIFIER_SYMBOL = new EnumC6441k("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final EnumC6441k OTHER_SYMBOL = new EnumC6441k("OTHER_SYMBOL", 27, 28, "So");
    public static final EnumC6441k INITIAL_QUOTE_PUNCTUATION = new EnumC6441k("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final EnumC6441k FINAL_QUOTE_PUNCTUATION = new EnumC6441k("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    /* JADX INFO: renamed from: kotlin.text.k$k */
    /* JADX INFO: compiled from: CharCategoryJVM.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final EnumC6441k m23537k(int i2) {
            if (new kotlin.ranges.x2(0, 16).x2(i2)) {
                return EnumC6441k.values()[i2];
            }
            if (new kotlin.ranges.x2(18, 30).x2(i2)) {
                return EnumC6441k.values()[i2 - 1];
            }
            throw new IllegalArgumentException("Category #" + i2 + " is not defined.");
        }
    }

    static {
        EnumC6441k[] qVar = toq();
        f36696k = qVar;
        Companion = new k(null);
        f36697q = kotlin.enums.toq.toq(qVar);
    }

    private EnumC6441k(String str, int i2, int i3, String str2) {
        this.value = i3;
        this.code = str2;
    }

    @InterfaceC7396q
    public static InterfaceC6225k<EnumC6441k> getEntries() {
        return f36697q;
    }

    private static final /* synthetic */ EnumC6441k[] toq() {
        return new EnumC6441k[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    public static EnumC6441k valueOf(String str) {
        return (EnumC6441k) Enum.valueOf(EnumC6441k.class, str);
    }

    public static EnumC6441k[] values() {
        return (EnumC6441k[]) f36696k.clone();
    }

    public final boolean contains(char c2) {
        return Character.getType(c2) == this.value;
    }

    @InterfaceC7396q
    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }
}
