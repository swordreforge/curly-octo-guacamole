package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.base.l */
/* JADX INFO: compiled from: Verify.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class C4262l {
    private C4262l() {
    }

    public static void cdj(boolean z2, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, obj));
        }
    }

    public static void f7l8(boolean z2, @NullableDecl String str, int i2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Integer.valueOf(i2)));
        }
    }

    public static void fn3e(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, obj, obj2));
        }
    }

    public static void fu4(boolean z2, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, objArr));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m15393g(boolean z2, @NullableDecl String str, char c2, @NullableDecl Object obj) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Character.valueOf(c2), obj));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m15394h(boolean z2, @NullableDecl String str, long j2, @NullableDecl Object obj) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Long.valueOf(j2), obj));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m15395i(boolean z2, @NullableDecl String str, @NullableDecl Object obj, long j2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, obj, Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m15396k(boolean z2) {
        if (!z2) {
            throw new n5r1();
        }
    }

    public static void ki(boolean z2, @NullableDecl String str, @NullableDecl Object obj, char c2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, obj, Character.valueOf(c2)));
        }
    }

    public static void kja0(boolean z2, @NullableDecl String str, long j2, long j3) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static void ld6(boolean z2, @NullableDecl String str, int i2, @NullableDecl Object obj) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Integer.valueOf(i2), obj));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m15397n(boolean z2, @NullableDecl String str, char c2, long j2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Character.valueOf(c2), Long.valueOf(j2)));
        }
    }

    public static void n7h(boolean z2, @NullableDecl String str, long j2, int i2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Long.valueOf(j2), Integer.valueOf(i2)));
        }
    }

    public static void ni7(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, obj, obj2, obj3, obj4));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T o1t(@NullableDecl T t2, @NullableDecl String str, @NullableDecl Object... objArr) {
        fu4(t2 != null, str, objArr);
        return t2;
    }

    /* JADX INFO: renamed from: p */
    public static void m15398p(boolean z2, @NullableDecl String str, int i2, long j2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Integer.valueOf(i2), Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m15399q(boolean z2, @NullableDecl String str, char c2, int i2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Character.valueOf(c2), Integer.valueOf(i2)));
        }
    }

    public static void qrj(boolean z2, @NullableDecl String str, long j2, char c2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Long.valueOf(j2), Character.valueOf(c2)));
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m15400s(boolean z2, @NullableDecl String str, int i2, int i3) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void t8r(boolean z2, @NullableDecl String str, @NullableDecl Object obj, int i2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, obj, Integer.valueOf(i2)));
        }
    }

    public static void toq(boolean z2, @NullableDecl String str, char c2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Character.valueOf(c2)));
        }
    }

    public static void x2(boolean z2, @NullableDecl String str, long j2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m15401y(boolean z2, @NullableDecl String str, int i2, char c2) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Integer.valueOf(i2), Character.valueOf(c2)));
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: z */
    public static <T> T m15402z(@NullableDecl T t2) {
        return (T) o1t(t2, "expected a non-null reference", new Object[0]);
    }

    public static void zurt(boolean z2, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, obj, obj2, obj3));
        }
    }

    public static void zy(boolean z2, @NullableDecl String str, char c2, char c3) {
        if (!z2) {
            throw new n5r1(d2ok.m15296n(str, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }
}
