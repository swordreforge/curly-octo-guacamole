package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.g1;

/* JADX INFO: compiled from: Intrinsics.java */
/* JADX INFO: loaded from: classes3.dex */
public class d2ok {

    /* JADX INFO: renamed from: kotlin.jvm.internal.d2ok$k */
    /* JADX INFO: compiled from: Intrinsics.java */
    @kotlin.yz(version = "1.4")
    public static class C6287k {
        private C6287k() {
        }
    }

    private d2ok() {
    }

    public static void a9(String str) {
        throw ((AssertionError) wvg(new AssertionError(str)));
    }

    public static void cdj(Object obj, String str) {
        if (obj == null) {
            m23082r(str);
        }
    }

    public static void d2ok() {
        throw ((kotlin.o1t) wvg(new kotlin.o1t()));
    }

    public static void d3(String str) {
        throw ((IllegalStateException) wvg(new IllegalStateException(str)));
    }

    private static void dd(String str) {
        throw ((NullPointerException) wvg(new NullPointerException(zurt(str))));
    }

    @kotlin.yz(version = "1.4")
    public static void eqxt(String str) {
        throw ((NullPointerException) wvg(new NullPointerException(str)));
    }

    public static boolean f7l8(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int fn3e(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static void fti() {
        throw ((IllegalArgumentException) wvg(new IllegalArgumentException()));
    }

    public static void fu4(String str) {
        ncyb(str);
    }

    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: g */
    public static boolean m23074g(Float f2, Float f3) {
        if (f2 == null) {
            if (f3 == null) {
                return true;
            }
        } else if (f3 != null && f2.floatValue() == f3.floatValue()) {
            return true;
        }
        return false;
    }

    public static void gvn7() {
        throw ((IllegalStateException) wvg(new IllegalStateException()));
    }

    /* JADX INFO: renamed from: h */
    public static void m23075h(Object obj, String str) {
        if (obj == null) {
            dd(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m23076i(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static void jk() {
        throw ((AssertionError) wvg(new AssertionError()));
    }

    public static void jp0y(String str) {
        throw ((IllegalArgumentException) wvg(new IllegalArgumentException(str)));
    }

    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: k */
    public static boolean m23077k(double d2, Double d4) {
        return d4 != null && d2 == d4.doubleValue();
    }

    public static void ki(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) wvg(new IllegalStateException(str)));
        }
    }

    public static void kja0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) wvg(new NullPointerException(str + " must not be null")));
    }

    /* JADX INFO: renamed from: l */
    public static void m23078l(String str) {
        throw ((g1) wvg(new g1(str)));
    }

    public static void ld6(String str) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e2) {
            throw ((ClassNotFoundException) wvg(new ClassNotFoundException("Class " + strReplace + " is not found. Please update the Kotlin runtime to the latest version", e2)));
        }
    }

    public static void lvui(String str) {
        throw ((kotlin.o1t) wvg(new kotlin.o1t(str)));
    }

    public static String mcp(String str, Object obj) {
        return str + obj;
    }

    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: n */
    public static boolean m23079n(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static void n5r1(String str) {
        m23078l("lateinit property " + str + " has not been initialized");
    }

    public static void n7h(Object obj, String str) {
        if (obj == null) {
            eqxt(str);
        }
    }

    public static void ncyb(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void ni7() {
        x9kr();
    }

    public static void o1t(int i2, String str, String str2) {
        ncyb(str2);
    }

    @kotlin.yz(version = "1.4")
    public static void oc() {
        throw ((NullPointerException) wvg(new NullPointerException()));
    }

    /* JADX INFO: renamed from: p */
    public static void m23080p(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) wvg(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
    }

    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: q */
    public static boolean m23081q(Double d2, Double d4) {
        if (d2 == null) {
            if (d4 == null) {
                return true;
            }
        } else if (d4 != null && d2.doubleValue() == d4.doubleValue()) {
            return true;
        }
        return false;
    }

    public static void qrj(Object obj) {
        if (obj == null) {
            oc();
        }
    }

    /* JADX INFO: renamed from: r */
    private static void m23082r(String str) {
        throw ((IllegalArgumentException) wvg(new IllegalArgumentException(zurt(str))));
    }

    /* JADX INFO: renamed from: s */
    public static void m23083s(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) wvg(new IllegalStateException(str)));
        }
    }

    /* JADX INFO: renamed from: t */
    static <T extends Throwable> T m23084t(T t2, String str) {
        StackTraceElement[] stackTrace = t2.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t2;
    }

    public static void t8r(Object obj, String str, String str2) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) wvg(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
    }

    @kotlin.yz(version = "1.1")
    public static boolean toq(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    private static <T extends Throwable> T wvg(T t2) {
        return (T) m23084t(t2, d2ok.class.getName());
    }

    public static void x2(String str, String str2) throws ClassNotFoundException {
        String strReplace = str.replace('/', '.');
        try {
            Class.forName(strReplace);
        } catch (ClassNotFoundException e2) {
            throw ((ClassNotFoundException) wvg(new ClassNotFoundException("Class " + strReplace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e2)));
        }
    }

    public static void x9kr() {
        ncyb("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: y */
    public static void m23085y(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) wvg(new IllegalStateException(str + " must not be null")));
    }

    /* JADX INFO: renamed from: z */
    public static void m23086z(int i2, String str) {
        x9kr();
    }

    private static String zurt(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = d2ok.class.getName();
        int i2 = 0;
        while (!stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        while (stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    @kotlin.yz(version = "1.1")
    public static boolean zy(Double d2, double d4) {
        return d2 != null && d2.doubleValue() == d4;
    }
}
