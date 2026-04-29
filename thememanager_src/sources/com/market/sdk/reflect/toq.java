package com.market.sdk.reflect;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: Field.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f68928f7l8 = "J";

    /* JADX INFO: renamed from: g */
    public static final String f28131g = "I";

    /* JADX INFO: renamed from: n */
    public static final String f28132n = "S";

    /* JADX INFO: renamed from: p */
    public static final String f28133p = "V";

    /* JADX INFO: renamed from: q */
    public static final String f28134q = "C";

    /* JADX INFO: renamed from: s */
    public static final String f28135s = "D";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f68929toq = "Z";

    /* JADX INFO: renamed from: y */
    public static final String f28136y = "F";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f68930zy = "B";

    /* JADX INFO: renamed from: k */
    private final Field f28137k;

    private toq(Field field) {
        this.f28137k = field;
    }

    /* JADX INFO: renamed from: n */
    public static toq m17362n(String str, String str2, String str3) throws C4988n, C4986g {
        try {
            return m17363q(Class.forName(str), str2, str3);
        } catch (ClassNotFoundException e2) {
            throw new C4988n(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public static toq m17363q(Class<?> cls, String str, String str2) throws C4986g {
        try {
            try {
                return new toq(cls.getDeclaredField(str));
            } catch (C4986g | NoSuchFieldException unused) {
                return new toq(cls.getField(str));
            }
        } catch (C4986g | NoSuchFieldException e2) {
            throw new C4986g(e2.getMessage());
        }
    }

    public static toq zy(Class<?> cls, String str, Class<?> cls2) throws C4986g {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public Object m17364k(Object obj) throws IllegalArgumentException {
        return new Object();
    }

    public int toq(Object obj) throws IllegalArgumentException {
        Field field = this.f28137k;
        if (field == null) {
            return -1;
        }
        try {
            field.setAccessible(true);
            Object obj2 = this.f28137k.get(obj);
            if (obj2 != null && (obj2 instanceof Integer)) {
                return ((Integer) obj2).intValue();
            }
            return -1;
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2.getMessage());
        }
    }
}
