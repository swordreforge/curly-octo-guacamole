package com.google.common.base;

import com.xiaomi.mipush.sdk.C5658n;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.common.base.q */
/* JADX INFO: compiled from: CaseFormat.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class EnumC4270q {
    public static final EnumC4270q LOWER_CAMEL;
    public static final EnumC4270q LOWER_HYPHEN;
    public static final EnumC4270q LOWER_UNDERSCORE;
    public static final EnumC4270q UPPER_CAMEL;
    public static final EnumC4270q UPPER_UNDERSCORE;

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC4270q[] f25734k;
    private final AbstractC4265n wordBoundary;
    private final String wordSeparator;

    /* JADX INFO: renamed from: com.google.common.base.q$g */
    /* JADX INFO: compiled from: CaseFormat.java */
    private static final class g extends AbstractC4272s<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final EnumC4270q sourceFormat;
        private final EnumC4270q targetFormat;

        g(EnumC4270q enumC4270q, EnumC4270q enumC4270q2) {
            this.sourceFormat = (EnumC4270q) jk.a9(enumC4270q);
            this.targetFormat = (EnumC4270q) jk.a9(enumC4270q2);
        }

        @Override // com.google.common.base.AbstractC4272s, com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.sourceFormat.equals(gVar.sourceFormat) && this.targetFormat.equals(gVar.targetFormat);
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public String toString() {
            return this.sourceFormat + ".converterTo(" + this.targetFormat + ")";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public String doBackward(String str) {
            return this.targetFormat.to(this.sourceFormat, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractC4272s
        public String doForward(String str) {
            return this.sourceFormat.to(this.targetFormat, str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.q$k */
    /* JADX INFO: compiled from: CaseFormat.java */
    enum k extends EnumC4270q {
        k(String str, int i2, AbstractC4265n abstractC4265n, String str2) {
            super(str, i2, abstractC4265n, str2, null);
        }

        @Override // com.google.common.base.EnumC4270q
        String convert(EnumC4270q enumC4270q, String str) {
            return enumC4270q == EnumC4270q.LOWER_UNDERSCORE ? str.replace('-', '_') : enumC4270q == EnumC4270q.UPPER_UNDERSCORE ? com.google.common.base.zy.m15459p(str.replace('-', '_')) : super.convert(enumC4270q, str);
        }

        @Override // com.google.common.base.EnumC4270q
        String normalizeWord(String str) {
            return com.google.common.base.zy.f7l8(str);
        }
    }

    static {
        k kVar = new k("LOWER_HYPHEN", 0, AbstractC4265n.cdj('-'), C5658n.f73185t8r);
        LOWER_HYPHEN = kVar;
        String str = "_";
        EnumC4270q enumC4270q = new EnumC4270q("LOWER_UNDERSCORE", 1, AbstractC4265n.cdj('_'), str) { // from class: com.google.common.base.q.toq
            {
                k kVar2 = null;
            }

            @Override // com.google.common.base.EnumC4270q
            String convert(EnumC4270q enumC4270q2, String str2) {
                return enumC4270q2 == EnumC4270q.LOWER_HYPHEN ? str2.replace('_', '-') : enumC4270q2 == EnumC4270q.UPPER_UNDERSCORE ? com.google.common.base.zy.m15459p(str2) : super.convert(enumC4270q2, str2);
            }

            @Override // com.google.common.base.EnumC4270q
            String normalizeWord(String str2) {
                return com.google.common.base.zy.f7l8(str2);
            }
        };
        LOWER_UNDERSCORE = enumC4270q;
        String str2 = "";
        EnumC4270q enumC4270q2 = new EnumC4270q("LOWER_CAMEL", 2, AbstractC4265n.qrj('A', 'Z'), str2) { // from class: com.google.common.base.q.zy
            {
                k kVar2 = null;
            }

            @Override // com.google.common.base.EnumC4270q
            String normalizeWord(String str3) {
                return EnumC4270q.toq(str3);
            }
        };
        LOWER_CAMEL = enumC4270q2;
        EnumC4270q enumC4270q3 = new EnumC4270q("UPPER_CAMEL", 3, AbstractC4265n.qrj('A', 'Z'), str2) { // from class: com.google.common.base.q.q
            {
                k kVar2 = null;
            }

            @Override // com.google.common.base.EnumC4270q
            String normalizeWord(String str3) {
                return EnumC4270q.toq(str3);
            }
        };
        UPPER_CAMEL = enumC4270q3;
        EnumC4270q enumC4270q4 = new EnumC4270q("UPPER_UNDERSCORE", 4, AbstractC4265n.cdj('_'), str) { // from class: com.google.common.base.q.n
            {
                k kVar2 = null;
            }

            @Override // com.google.common.base.EnumC4270q
            String convert(EnumC4270q enumC4270q5, String str3) {
                return enumC4270q5 == EnumC4270q.LOWER_HYPHEN ? com.google.common.base.zy.f7l8(str3.replace('_', '-')) : enumC4270q5 == EnumC4270q.LOWER_UNDERSCORE ? com.google.common.base.zy.f7l8(str3) : super.convert(enumC4270q5, str3);
            }

            @Override // com.google.common.base.EnumC4270q
            String normalizeWord(String str3) {
                return com.google.common.base.zy.m15459p(str3);
            }
        };
        UPPER_UNDERSCORE = enumC4270q4;
        f25734k = new EnumC4270q[]{kVar, enumC4270q, enumC4270q2, enumC4270q3, enumC4270q4};
    }

    /* synthetic */ EnumC4270q(String str, int i2, AbstractC4265n abstractC4265n, String str2, k kVar) {
        this(str, i2, abstractC4265n, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toq(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return com.google.common.base.zy.m15462y(str.charAt(0)) + com.google.common.base.zy.f7l8(str.substring(1));
    }

    public static EnumC4270q valueOf(String str) {
        return (EnumC4270q) Enum.valueOf(EnumC4270q.class, str);
    }

    public static EnumC4270q[] values() {
        return (EnumC4270q[]) f25734k.clone();
    }

    private String zy(String str) {
        return this == LOWER_CAMEL ? com.google.common.base.zy.f7l8(str) : normalizeWord(str);
    }

    String convert(EnumC4270q enumC4270q, String str) {
        StringBuilder sb = null;
        int length = 0;
        int iKja0 = -1;
        while (true) {
            iKja0 = this.wordBoundary.kja0(str, iKja0 + 1);
            if (iKja0 == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder(str.length() + (this.wordSeparator.length() * 4));
                sb.append(enumC4270q.zy(str.substring(length, iKja0)));
            } else {
                sb.append(enumC4270q.normalizeWord(str.substring(length, iKja0)));
            }
            sb.append(enumC4270q.wordSeparator);
            length = this.wordSeparator.length() + iKja0;
        }
        if (length == 0) {
            return enumC4270q.zy(str);
        }
        sb.append(enumC4270q.normalizeWord(str.substring(length)));
        return sb.toString();
    }

    public AbstractC4272s<String, String> converterTo(EnumC4270q enumC4270q) {
        return new g(this, enumC4270q);
    }

    abstract String normalizeWord(String str);

    public final String to(EnumC4270q enumC4270q, String str) {
        jk.a9(enumC4270q);
        jk.a9(str);
        return enumC4270q == this ? str : convert(enumC4270q, str);
    }

    private EnumC4270q(String str, int i2, AbstractC4265n abstractC4265n, String str2) {
        this.wordBoundary = abstractC4265n;
        this.wordSeparator = str2;
    }
}
