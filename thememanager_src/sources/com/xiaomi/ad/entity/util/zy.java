package com.xiaomi.ad.entity.util;

import android.text.TextUtils;
import com.google.gson.C4871g;
import com.google.gson.InterfaceC4873i;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.ld6;
import com.google.gson.reflect.C4922k;
import com.xiaomi.ad.entity.common.C5585n;
import com.xiaomi.ad.entity.contract.f7l8;
import com.xiaomi.mipush.sdk.C5658n;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u38j.C7683q;

/* JADX INFO: compiled from: GsonUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private static final String f31140k = "GSU";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73027toq = "GSON_CONTENT_VERSION";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Map<Class, InterfaceC4873i> f73028zy = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: q */
    private static final Map<Class, ld6> f31141q = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.xiaomi.ad.entity.util.zy$k */
    /* JADX INFO: compiled from: GsonUtils.java */
    static class C5596k implements InterfaceC4928z {

        /* JADX INFO: renamed from: k */
        private final String f31142k;

        public C5596k(String str) {
            this.f31142k = str;
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            return new toq(this, c4871g.ki(this, c4922k), c4922k);
        }
    }

    static {
        C5585n.m19183k();
        com.xiaomi.ad.entity.common.toq.m19197k();
    }

    private zy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f7l8(String str) {
        return str + C5658n.f73185t8r + f31140k;
    }

    /* JADX INFO: renamed from: g */
    private static <T extends f7l8> double m19211g(Class<T> cls) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(f73027toq);
        declaredField.setAccessible(true);
        return declaredField.getDouble(null);
    }

    /* JADX INFO: renamed from: n */
    private static C4871g m19213n(Class<? extends f7l8> cls, String str) {
        com.google.gson.f7l8 f7l8VarM17083s = new com.google.gson.f7l8().m17083s();
        for (Map.Entry<Class, InterfaceC4873i> entry : f73028zy.entrySet()) {
            f7l8VarM17083s.ld6(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Class, ld6> entry2 : f31141q.entrySet()) {
            f7l8VarM17083s.ld6(entry2.getKey(), entry2.getValue());
        }
        try {
            f7l8VarM17083s.m17085z(m19211g(cls)).x2(new C5596k(str));
            return f7l8VarM17083s.m17082q();
        } catch (IllegalAccessException e2) {
            C7683q.m28055n(f7l8(str), "illegal access GSON_CONTENT_VERSION in " + cls.getCanonicalName(), e2);
            throw new RuntimeException(e2);
        } catch (NoSuchFieldException e3) {
            C7683q.m28055n(f7l8(str), "no GSON_CONTENT_VERSION in " + cls.getCanonicalName(), e3);
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m19214p(f7l8 f7l8Var, String str) {
        if (f7l8Var == null) {
            return null;
        }
        try {
            return m19213n(f7l8Var.getClass(), str).o1t(f7l8Var);
        } catch (Exception e2) {
            C7683q.m28055n(f7l8(str), "serialize exception, class: " + f7l8Var.getClass().getCanonicalName(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static <T extends f7l8> T[] m19215q(Class<T> cls, T[] tArr, String str, String str2) {
        if (!TextUtils.isEmpty(str) && cls != null && tArr != null) {
            try {
                return (T[]) ((f7l8[]) m19213n(cls, str2).n7h(str, tArr.getClass()));
            } catch (Exception e2) {
                C7683q.m28055n(f7l8(str2), "exception json array string : " + str, e2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static void m19216s(Class cls, InterfaceC4873i interfaceC4873i) {
        f73028zy.put(cls, interfaceC4873i);
    }

    /* JADX INFO: renamed from: y */
    public static void m19217y(Class cls, ld6 ld6Var) {
        f31141q.put(cls, ld6Var);
    }

    public static <T extends f7l8> T zy(Class<T> cls, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) m19213n(cls, str2).n7h(str, cls);
        } catch (Exception e2) {
            C7683q.m28057q(f7l8(str2), "exception json string : " + str);
            C7683q.m28055n(f7l8(str2), "deserialize exception : ", e2);
            return null;
        }
    }
}
