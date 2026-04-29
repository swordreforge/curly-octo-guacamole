package com.xiaomi.onetrack.util;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.n */
/* JADX INFO: loaded from: classes3.dex */
public class C5781n {

    /* JADX INFO: renamed from: a */
    private static final String f32320a = "IdentifierManager";

    /* JADX INFO: renamed from: b */
    private static Object f32321b;

    /* JADX INFO: renamed from: c */
    private static Class<?> f32322c;

    /* JADX INFO: renamed from: d */
    private static Method f32323d;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f32322c = cls;
            f32321b = cls.newInstance();
            f32323d = f32322c.getMethod("getOAID", Context.class);
        } catch (Exception e2) {
            C5804p.m20344a(f32320a, "reflect exception!", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20285a() {
        return (f32322c == null || f32321b == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static String m20283a(Context context) {
        return m20284a(context, f32323d);
    }

    /* JADX INFO: renamed from: a */
    private static String m20284a(Context context, Method method) {
        Object obj;
        if (context == null || (obj = f32321b) == null || method == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            return objInvoke != null ? (String) objInvoke : "";
        } catch (Throwable th) {
            C5804p.m20344a(f32320a, "oaid invoke exception!", th);
            return "";
        }
    }
}
