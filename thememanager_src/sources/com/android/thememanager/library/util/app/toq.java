package com.android.thememanager.library.util.app;

import com.android.thememanager.util.C2789j;
import com.google.gson.C4871g;
import com.google.gson.C4872h;
import com.google.gson.InterfaceC4873i;
import com.google.gson.InterfaceC4920p;
import com.google.gson.f7l8;
import com.google.gson.ki;
import com.google.gson.ld6;
import com.google.gson.reflect.C4922k;
import com.google.gson.t8r;
import com.google.gson.x2;
import com.google.gson.zurt;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import vq.C7706k;
import zy.lvui;

/* JADX INFO: compiled from: GsonUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f12326k = "toq";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static C4871g f60334toq;

    /* JADX INFO: renamed from: com.android.thememanager.library.util.app.toq$n */
    /* JADX INFO: compiled from: GsonUtils.java */
    private static class C2090n implements InterfaceC4873i<Long>, ld6<Long> {
        private C2090n() {
        }

        @Override // com.google.gson.InterfaceC4873i
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public x2 toq(Long src, Type typeOfSrc, t8r context) {
            return new ki(src);
        }

        @Override // com.google.gson.ld6
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Long mo8034k(x2 json, Type typeOfT, InterfaceC4920p context) throws C4872h {
            try {
                if (json.ki().equals("") || json.ki().equals("null")) {
                    return 0L;
                }
            } catch (Exception unused) {
            }
            try {
                return Long.valueOf(json.kja0());
            } catch (NumberFormatException e2) {
                throw new zurt(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.library.util.app.toq$q */
    /* JADX INFO: compiled from: GsonUtils.java */
    private static class C2091q implements InterfaceC4873i<Integer>, ld6<Integer> {
        private C2091q() {
        }

        @Override // com.google.gson.InterfaceC4873i
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public x2 toq(Integer src, Type typeOfSrc, t8r context) {
            return new ki(src);
        }

        @Override // com.google.gson.ld6
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Integer mo8034k(x2 json, Type typeOfT, InterfaceC4920p context) throws C4872h {
            try {
                if (json.ki().equals("") || json.ki().equals("null")) {
                    return 0;
                }
            } catch (Exception unused) {
            }
            try {
                return Integer.valueOf(json.mo17216p());
            } catch (NumberFormatException e2) {
                throw new zurt(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.library.util.app.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GsonUtils.java */
    public static class C7924toq implements InterfaceC4873i<Double>, ld6<Double> {
        @Override // com.google.gson.InterfaceC4873i
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public x2 toq(Double src, Type typeOfSrc, t8r context) {
            return new ki(src);
        }

        @Override // com.google.gson.ld6
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Double mo8034k(x2 json, Type typeOfT, InterfaceC4920p context) throws C4872h {
            try {
                if (json.ki().equals("") || json.ki().equals("null")) {
                    return Double.valueOf(0.0d);
                }
            } catch (Exception unused) {
            }
            try {
                return Double.valueOf(json.mo17218y());
            } catch (NumberFormatException e2) {
                throw new zurt(e2);
            }
        }
    }

    /* JADX INFO: compiled from: GsonUtils.java */
    public static class zy implements InterfaceC4873i<Float>, ld6<Float> {
        @Override // com.google.gson.InterfaceC4873i
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public x2 toq(Float src, Type typeOfSrc, t8r context) {
            return new ki(src);
        }

        @Override // com.google.gson.ld6
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Float mo8034k(x2 json, Type typeOfT, InterfaceC4920p context) throws C4872h {
            try {
                if (json.ki().equals("") || json.ki().equals("null")) {
                    return Float.valueOf(0.0f);
                }
            } catch (Exception unused) {
            }
            try {
                return Float.valueOf(json.mo17217s());
            } catch (NumberFormatException e2) {
                throw new zurt(e2);
            }
        }
    }

    private toq() {
        throw new C7706k(toq.class);
    }

    public static <T> List<T> f7l8(String result, @lvui C4922k<List<T>> typeToken) {
        try {
            return (List) m8029n().kja0(result, typeToken.getType());
        } catch (Exception e2) {
            C2789j.qrj(f12326k, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m8027g(Object object) {
        try {
            return m8029n().o1t(object);
        } catch (Throwable th) {
            C2789j.qrj(f12326k, th);
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    private static C4871g m8028k() {
        return new f7l8().ld6(Integer.class, new C2091q()).ld6(Integer.TYPE, new C2091q()).ld6(Double.class, new C7924toq()).ld6(Double.TYPE, new C7924toq()).ld6(Float.class, new zy()).ld6(Float.TYPE, new zy()).ld6(Long.class, new C2090n()).ld6(Long.TYPE, new C2090n()).m17082q();
    }

    /* JADX INFO: renamed from: n */
    public static C4871g m8029n() {
        if (f60334toq == null) {
            synchronized (C4871g.class) {
                if (f60334toq == null) {
                    f60334toq = m8028k();
                }
            }
        }
        return f60334toq;
    }

    /* JADX INFO: renamed from: p */
    public static <T> List<T> m8030p(String result, @lvui C4922k<Map<String, T>> typeToken) throws JSONException {
        try {
            return (List) m8029n().kja0(result, typeToken.getType());
        } catch (Exception unused) {
            throw new JSONException("");
        }
    }

    /* JADX INFO: renamed from: q */
    public static Object m8031q(String result, @lvui Type type) throws JSONException {
        try {
            return m8029n().kja0(result, type);
        } catch (Exception e2) {
            C2789j.qrj(f12326k, e2);
            throw new JSONException("");
        }
    }

    /* JADX INFO: renamed from: s */
    public static <T> Map<String, T> m8032s(String result, @lvui C4922k<Map<String, T>> typeToken) {
        try {
            return (Map) m8029n().kja0(result, typeToken.getType());
        } catch (Exception e2) {
            C2789j.qrj(f12326k, e2);
            return null;
        }
    }

    public static <T> T toq(String str, @lvui Class<T> cls) {
        try {
            return (T) m8029n().n7h(str, cls);
        } catch (Exception e2) {
            C2789j.qrj(f12326k, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static <T> List<T> m8033y(String result, @lvui C4922k<List<T>> typeToken) throws JSONException {
        try {
            return (List) m8029n().kja0(result, typeToken.getType());
        } catch (Exception unused) {
            throw new JSONException("");
        }
    }

    public static <T> T zy(String str, @lvui Type type) {
        try {
            return (T) m8029n().kja0(str, type);
        } catch (Exception e2) {
            C2789j.qrj(f12326k, e2);
            return null;
        }
    }
}
