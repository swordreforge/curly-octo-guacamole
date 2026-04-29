package kotlin.jvm.internal;

import cyoe.InterfaceC5978g;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5980i;
import cyoe.InterfaceC5981k;
import cyoe.InterfaceC5982n;
import cyoe.InterfaceC5983p;
import cyoe.InterfaceC5984q;
import cyoe.InterfaceC5985s;
import cyoe.InterfaceC5986y;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import r6ty.InterfaceC7624g;
import r6ty.InterfaceC7625k;
import r6ty.InterfaceC7626n;
import r6ty.InterfaceC7627q;
import r6ty.InterfaceC7628y;
import r6ty.f7l8;

/* JADX INFO: compiled from: TypeIntrinsics.java */
/* JADX INFO: loaded from: classes3.dex */
public class bo {
    public static boolean a9(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof InterfaceC7625k) || (obj instanceof InterfaceC7627q));
    }

    public static Object cdj(Object obj, int i2) {
        if (obj != null && !m23064t(obj, i2)) {
            lvui(obj, "kotlin.jvm.functions.Function" + i2);
        }
        return obj;
    }

    public static ClassCastException d2ok(ClassCastException classCastException) {
        throw ((ClassCastException) eqxt(classCastException));
    }

    public static boolean d3(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof InterfaceC7625k) || (obj instanceof f7l8.InterfaceC7623k));
    }

    private static <T extends Throwable> T eqxt(T t2) {
        return (T) d2ok.m23084t(t2, bo.class.getName());
    }

    public static List f7l8(Object obj) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof InterfaceC7626n)) {
            lvui(obj, "kotlin.collections.MutableList");
        }
        return zurt(obj);
    }

    public static Iterator fn3e(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e2) {
            throw d2ok(e2);
        }
    }

    public static boolean fti(Object obj) {
        return (obj instanceof List) && (!(obj instanceof InterfaceC7625k) || (obj instanceof InterfaceC7626n));
    }

    public static Map fu4(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            throw d2ok(e2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Iterator m23055g(Object obj, String str) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof InterfaceC7627q)) {
            m23062r(str);
        }
        return fn3e(obj);
    }

    public static boolean gvn7(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof InterfaceC7625k) || (obj instanceof r6ty.f7l8));
    }

    /* JADX INFO: renamed from: h */
    public static Set m23056h(Object obj, String str) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof InterfaceC7628y)) {
            m23062r(str);
        }
        return o1t(obj);
    }

    /* JADX INFO: renamed from: i */
    public static Iterable m23057i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e2) {
            throw d2ok(e2);
        }
    }

    public static boolean jk(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof InterfaceC7625k) || (obj instanceof r6ty.zy));
    }

    public static boolean jp0y(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof InterfaceC7625k) || (obj instanceof InterfaceC7624g));
    }

    /* JADX INFO: renamed from: k */
    public static Collection m23058k(Object obj) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof r6ty.toq)) {
            lvui(obj, "kotlin.collections.MutableCollection");
        }
        return t8r(obj);
    }

    public static Object ki(Object obj, int i2, String str) {
        if (obj != null && !m23064t(obj, i2)) {
            m23062r(str);
        }
        return obj;
    }

    public static Set kja0(Object obj) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof InterfaceC7628y)) {
            lvui(obj, "kotlin.collections.MutableSet");
        }
        return o1t(obj);
    }

    public static Map ld6(Object obj) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof r6ty.f7l8)) {
            lvui(obj, "kotlin.collections.MutableMap");
        }
        return fu4(obj);
    }

    public static void lvui(Object obj, String str) {
        m23062r((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static boolean mcp(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof InterfaceC7625k) || (obj instanceof r6ty.toq));
    }

    /* JADX INFO: renamed from: n */
    public static Iterator m23059n(Object obj) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof InterfaceC7627q)) {
            lvui(obj, "kotlin.collections.MutableIterator");
        }
        return fn3e(obj);
    }

    public static Map.Entry n7h(Object obj, String str) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof f7l8.InterfaceC7623k)) {
            m23062r(str);
        }
        return m23066z(obj);
    }

    public static ListIterator ni7(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e2) {
            throw d2ok(e2);
        }
    }

    public static Set o1t(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            throw d2ok(e2);
        }
    }

    public static boolean oc(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof InterfaceC7625k) || (obj instanceof InterfaceC7628y));
    }

    /* JADX INFO: renamed from: p */
    public static ListIterator m23060p(Object obj, String str) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof InterfaceC7624g)) {
            m23062r(str);
        }
        return ni7(obj);
    }

    /* JADX INFO: renamed from: q */
    public static Iterable m23061q(Object obj, String str) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof r6ty.zy)) {
            m23062r(str);
        }
        return m23057i(obj);
    }

    public static Map.Entry qrj(Object obj) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof f7l8.InterfaceC7623k)) {
            lvui(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m23066z(obj);
    }

    /* JADX INFO: renamed from: r */
    public static void m23062r(String str) {
        throw d2ok(new ClassCastException(str));
    }

    /* JADX INFO: renamed from: s */
    public static ListIterator m23063s(Object obj) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof InterfaceC7624g)) {
            lvui(obj, "kotlin.collections.MutableListIterator");
        }
        return ni7(obj);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m23064t(Object obj, int i2) {
        return (obj instanceof kotlin.zurt) && wvg(obj) == i2;
    }

    public static Collection t8r(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            throw d2ok(e2);
        }
    }

    public static Collection toq(Object obj, String str) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof r6ty.toq)) {
            m23062r(str);
        }
        return t8r(obj);
    }

    public static int wvg(Object obj) {
        if (obj instanceof a9) {
            return ((a9) obj).getArity();
        }
        if (obj instanceof InterfaceC5981k) {
            return 0;
        }
        if (obj instanceof cyoe.x2) {
            return 1;
        }
        if (obj instanceof InterfaceC5979h) {
            return 2;
        }
        if (obj instanceof cyoe.cdj) {
            return 3;
        }
        if (obj instanceof cyoe.ki) {
            return 4;
        }
        if (obj instanceof cyoe.t8r) {
            return 5;
        }
        if (obj instanceof InterfaceC5980i) {
            return 6;
        }
        if (obj instanceof cyoe.fn3e) {
            return 7;
        }
        if (obj instanceof cyoe.zurt) {
            return 8;
        }
        if (obj instanceof cyoe.ni7) {
            return 9;
        }
        if (obj instanceof cyoe.toq) {
            return 10;
        }
        if (obj instanceof cyoe.zy) {
            return 11;
        }
        if (obj instanceof InterfaceC5984q) {
            return 12;
        }
        if (obj instanceof InterfaceC5982n) {
            return 13;
        }
        if (obj instanceof InterfaceC5978g) {
            return 14;
        }
        if (obj instanceof cyoe.f7l8) {
            return 15;
        }
        if (obj instanceof InterfaceC5986y) {
            return 16;
        }
        if (obj instanceof InterfaceC5985s) {
            return 17;
        }
        if (obj instanceof InterfaceC5983p) {
            return 18;
        }
        if (obj instanceof cyoe.ld6) {
            return 19;
        }
        if (obj instanceof cyoe.qrj) {
            return 20;
        }
        if (obj instanceof cyoe.n7h) {
            return 21;
        }
        return obj instanceof cyoe.kja0 ? 22 : -1;
    }

    public static Map x2(Object obj, String str) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof r6ty.f7l8)) {
            m23062r(str);
        }
        return fu4(obj);
    }

    /* JADX INFO: renamed from: y */
    public static List m23065y(Object obj, String str) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof InterfaceC7626n)) {
            m23062r(str);
        }
        return zurt(obj);
    }

    /* JADX INFO: renamed from: z */
    public static Map.Entry m23066z(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e2) {
            throw d2ok(e2);
        }
    }

    public static List zurt(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            throw d2ok(e2);
        }
    }

    public static Iterable zy(Object obj) {
        if ((obj instanceof InterfaceC7625k) && !(obj instanceof r6ty.zy)) {
            lvui(obj, "kotlin.collections.MutableIterable");
        }
        return m23057i(obj);
    }
}
