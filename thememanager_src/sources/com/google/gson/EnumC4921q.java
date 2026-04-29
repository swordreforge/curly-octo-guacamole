package com.google.gson;

import com.xiaomi.mipush.sdk.C5658n;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.gson.q */
/* JADX INFO: compiled from: FieldNamingPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC4921q implements InterfaceC4918n {
    public static final EnumC4921q IDENTITY;
    public static final EnumC4921q LOWER_CASE_WITH_DASHES;
    public static final EnumC4921q LOWER_CASE_WITH_DOTS;
    public static final EnumC4921q LOWER_CASE_WITH_UNDERSCORES;
    public static final EnumC4921q UPPER_CAMEL_CASE;
    public static final EnumC4921q UPPER_CAMEL_CASE_WITH_SPACES;

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC4921q[] f27823k;

    /* JADX INFO: renamed from: com.google.gson.q$k */
    /* JADX INFO: compiled from: FieldNamingPolicy.java */
    enum k extends EnumC4921q {
        k(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.gson.InterfaceC4918n
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        k kVar = new k("IDENTITY", 0);
        IDENTITY = kVar;
        EnumC4921q enumC4921q = new EnumC4921q("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.q.toq
            {
                k kVar2 = null;
            }

            @Override // com.google.gson.InterfaceC4918n
            public String translateName(Field field) {
                return EnumC4921q.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = enumC4921q;
        EnumC4921q enumC4921q2 = new EnumC4921q("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.q.zy
            {
                k kVar2 = null;
            }

            @Override // com.google.gson.InterfaceC4918n
            public String translateName(Field field) {
                return EnumC4921q.upperCaseFirstLetter(EnumC4921q.separateCamelCase(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = enumC4921q2;
        EnumC4921q enumC4921q3 = new EnumC4921q("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.q.q
            {
                k kVar2 = null;
            }

            @Override // com.google.gson.InterfaceC4918n
            public String translateName(Field field) {
                return EnumC4921q.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = enumC4921q3;
        EnumC4921q enumC4921q4 = new EnumC4921q("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.q.n
            {
                k kVar2 = null;
            }

            @Override // com.google.gson.InterfaceC4918n
            public String translateName(Field field) {
                return EnumC4921q.separateCamelCase(field.getName(), C5658n.f73185t8r).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = enumC4921q4;
        EnumC4921q enumC4921q5 = new EnumC4921q("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.q.g
            {
                k kVar2 = null;
            }

            @Override // com.google.gson.InterfaceC4918n
            public String translateName(Field field) {
                return EnumC4921q.separateCamelCase(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = enumC4921q5;
        f27823k = new EnumC4921q[]{kVar, enumC4921q, enumC4921q2, enumC4921q3, enumC4921q4, enumC4921q5};
    }

    private EnumC4921q(String str, int i2) {
    }

    static String separateCamelCase(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String upperCaseFirstLetter(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char cCharAt = str.charAt(i2);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i2 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }

    public static EnumC4921q valueOf(String str) {
        return (EnumC4921q) Enum.valueOf(EnumC4921q.class, str);
    }

    public static EnumC4921q[] values() {
        return (EnumC4921q[]) f27823k.clone();
    }

    /* synthetic */ EnumC4921q(String str, int i2, k kVar) {
        this(str, i2);
    }
}
