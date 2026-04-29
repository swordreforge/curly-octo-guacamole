package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class jk {
    private jk() {
    }

    /* JADX INFO: renamed from: a */
    public static void m15367a(boolean z2, @NullableDecl String str, char c2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Character.valueOf(c2), obj));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T a9(@NonNullDecl T t2) {
        t2.getClass();
        return t2;
    }

    public static void a98o(boolean z2, @NullableDecl String str, char c2, long j2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Character.valueOf(c2), Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15368b(boolean z2, @NullableDecl String str, char c2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Character.valueOf(c2)));
        }
    }

    public static void bf2(boolean z2, @NullableDecl String str, char c2, char c3) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void bo(boolean z2, @NullableDecl String str, long j2, int i2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Long.valueOf(j2), Integer.valueOf(i2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    /* JADX INFO: renamed from: c */
    public static <T> T m15369c(@NonNullDecl T t2, @NullableDecl String str, @NullableDecl Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, obj));
    }

    public static void c8jq(boolean z2, @NullableDecl String str, long j2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Long.valueOf(j2), obj));
        }
    }

    public static void cdj(boolean z2, @NullableDecl String str, long j2, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Long.valueOf(j2), Character.valueOf(c2)));
        }
    }

    public static void ch(boolean z2, @NullableDecl String str, int i2, int i3) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m15370d(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, obj, obj2, obj3));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T d2ok(@NonNullDecl T t2, @NullableDecl String str, int i2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Integer.valueOf(i2)));
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T d3(@NonNullDecl T t2, @NullableDecl String str, char c2, int i2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Character.valueOf(c2), Integer.valueOf(i2)));
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T dd(@NonNullDecl T t2, @NullableDecl String str, int i2, long j2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Integer.valueOf(i2), Long.valueOf(j2)));
    }

    public static void dr(boolean z2, @NullableDecl String str, @NullableDecl Object obj, char c2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, obj, Character.valueOf(c2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    /* JADX INFO: renamed from: e */
    public static <T> T m15371e(@NonNullDecl T t2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, obj, obj2));
    }

    public static void ek5k(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException(zy(i2, i3, i4));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T eqxt(@NonNullDecl T t2, @NullableDecl String str, char c2, @NullableDecl Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Character.valueOf(c2), obj));
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    /* JADX INFO: renamed from: f */
    public static <T> T m15372f(@NonNullDecl T t2, @NullableDecl String str, long j2, @NullableDecl Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Long.valueOf(j2), obj));
    }

    public static void f7l8(boolean z2, @NullableDecl String str, char c2, char c3) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void fn3e(boolean z2, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, obj));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T fti(@NonNullDecl T t2, @NullableDecl Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void fu4(boolean z2, @NullableDecl String str, @NullableDecl Object obj, long j2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, obj, Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m15373g(boolean z2, @NullableDecl String str, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Character.valueOf(c2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T gvn7(@NonNullDecl T t2, @NullableDecl String str, char c2, char c3) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Character.valueOf(c2), Character.valueOf(c3)));
    }

    public static void gyi(boolean z2, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, obj));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m15374h(boolean z2, @NullableDecl String str, long j2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Long.valueOf(j2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T hb(@NonNullDecl T t2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, obj, obj2, obj3, obj4));
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T hyr(@NonNullDecl T t2, @NullableDecl String str, long j2, long j3) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    /* JADX INFO: renamed from: i */
    public static void m15375i(boolean z2, @NullableDecl String str, long j2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Long.valueOf(j2), obj));
        }
    }

    public static void i1(boolean z2, @NullableDecl String str, char c2, int i2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Character.valueOf(c2), Integer.valueOf(i2)));
        }
    }

    public static void ikck(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, obj, obj2));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    /* JADX INFO: renamed from: j */
    public static <T> T m15376j(@NonNullDecl T t2, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, objArr));
    }

    @CanIgnoreReturnValue
    public static int jk(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(m15377k(i2, i3, str));
        }
        return i2;
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T jp0y(@NonNullDecl T t2, @NullableDecl String str, char c2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Character.valueOf(c2)));
    }

    /* JADX INFO: renamed from: k */
    private static String m15377k(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return d2ok.m15296n("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return d2ok.m15296n("%s (%s) must be less than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    public static void ki(boolean z2, @NullableDecl String str, long j2, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Long.valueOf(j2), Integer.valueOf(i2)));
        }
    }

    public static void kja0(boolean z2, @NullableDecl String str, int i2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Integer.valueOf(i2), obj));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    /* JADX INFO: renamed from: l */
    public static <T> T m15378l(@NonNullDecl T t2, @NullableDecl String str, long j2, char c2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Long.valueOf(j2), Character.valueOf(c2)));
    }

    public static void ld6(boolean z2, @NullableDecl String str, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Integer.valueOf(i2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T lrht(@NonNullDecl T t2, @NullableDecl String str, @NullableDecl Object obj, char c2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, obj, Character.valueOf(c2)));
    }

    public static void lv5(boolean z2, @NullableDecl String str, int i2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Integer.valueOf(i2), obj));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T lvui(@NonNullDecl T t2, @NullableDecl String str, int i2, char c2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Integer.valueOf(i2), Character.valueOf(c2)));
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: m */
    public static int m15379m(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(toq(i2, i3, str));
        }
        return i2;
    }

    @CanIgnoreReturnValue
    public static int mcp(int i2, int i3) {
        return jk(i2, i3, "index");
    }

    public static void mu(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, obj, obj2, obj3, obj4));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m15380n(boolean z2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T n5r1(@NonNullDecl T t2, @NullableDecl String str, long j2, int i2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Long.valueOf(j2), Integer.valueOf(i2)));
    }

    public static void n7h(boolean z2, @NullableDecl String str, int i2, long j2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Integer.valueOf(i2), Long.valueOf(j2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T ncyb(@NonNullDecl T t2, @NullableDecl String str, long j2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Long.valueOf(j2)));
    }

    public static void ni7(boolean z2, @NullableDecl String str, @NullableDecl Object obj, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, obj, Integer.valueOf(i2)));
        }
    }

    public static void nmn5(boolean z2, @NullableDecl String str, int i2, long j2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Integer.valueOf(i2), Long.valueOf(j2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T nn86(@NonNullDecl T t2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, obj, obj2, obj3));
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: o */
    public static int m15381o(int i2, int i3) {
        return m15379m(i2, i3, "index");
    }

    public static void o1t(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, obj, obj2, obj3));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T oc(@NonNullDecl T t2, @NullableDecl String str, char c2, long j2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Character.valueOf(c2), Long.valueOf(j2)));
    }

    /* JADX INFO: renamed from: p */
    public static void m15382p(boolean z2, @NullableDecl String str, char c2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Character.valueOf(c2), obj));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m15383q(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void qrj(boolean z2, @NullableDecl String str, int i2, int i3) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    /* JADX INFO: renamed from: r */
    public static <T> T m15384r(@NonNullDecl T t2, @NullableDecl String str, int i2, int i3) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* JADX INFO: renamed from: s */
    public static void m15385s(boolean z2, @NullableDecl String str, char c2, long j2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Character.valueOf(c2), Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m15386t(boolean z2, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, objArr));
        }
    }

    public static void t8iq(boolean z2, @NullableDecl String str, long j2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Long.valueOf(j2)));
        }
    }

    public static void t8r(boolean z2, @NullableDecl String str, long j2, long j3) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    private static String toq(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return d2ok.m15296n("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return d2ok.m15296n("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    /* JADX INFO: renamed from: u */
    public static void m15387u(boolean z2, @NullableDecl String str, long j2, char c2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Long.valueOf(j2), Character.valueOf(c2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T uv6(@NonNullDecl T t2, @NullableDecl String str, @NullableDecl Object obj, int i2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, obj, Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: v */
    public static void m15388v(boolean z2, @NullableDecl String str, @NullableDecl Object obj, long j2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, obj, Long.valueOf(j2)));
        }
    }

    public static void vq(boolean z2, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, objArr));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T vyq(@NonNullDecl T t2, @NullableDecl String str, @NullableDecl Object obj, long j2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, obj, Long.valueOf(j2)));
    }

    public static void wvg(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, obj, obj2, obj3, obj4));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m15389x(boolean z2, @NullableDecl String str, int i2, char c2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Integer.valueOf(i2), Character.valueOf(c2)));
        }
    }

    public static void x2(boolean z2, @NullableDecl String str, int i2, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Integer.valueOf(i2), Character.valueOf(c2)));
        }
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T x9kr(@NonNullDecl T t2, @NullableDecl String str, int i2, @NullableDecl Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(d2ok.m15296n(str, Integer.valueOf(i2), obj));
    }

    public static void xwq3(boolean z2, @NullableDecl String str, @NullableDecl Object obj, int i2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, obj, Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m15390y(boolean z2, @NullableDecl String str, char c2, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, Character.valueOf(c2), Integer.valueOf(i2)));
        }
    }

    public static void y2(boolean z2, @NullableDecl String str, long j2, long j3) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void y9n(boolean z2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void yz(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m15391z(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, obj, obj2));
        }
    }

    public static void zp(boolean z2, @NullableDecl String str, int i2) {
        if (!z2) {
            throw new IllegalStateException(d2ok.m15296n(str, Integer.valueOf(i2)));
        }
    }

    public static void zurt(boolean z2, @NullableDecl String str, @NullableDecl Object obj, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(d2ok.m15296n(str, obj, Character.valueOf(c2)));
        }
    }

    private static String zy(int i2, int i3, int i4) {
        return (i2 < 0 || i2 > i4) ? toq(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? toq(i3, i4, "end index") : d2ok.m15296n("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
    }
}
