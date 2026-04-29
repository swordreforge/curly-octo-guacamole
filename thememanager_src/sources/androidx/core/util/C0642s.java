package androidx.core.util;

import java.util.Objects;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.util.s */
/* JADX INFO: compiled from: ObjectsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0642s {

    /* JADX INFO: renamed from: androidx.core.util.s$k */
    /* JADX INFO: compiled from: ObjectsCompat.java */
    @hyr(19)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2988k(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @InterfaceC7830i
        static int toq(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    private C0642s() {
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static String m2984g(@dd Object obj, @dd String str) {
        return obj != null ? obj.toString() : str;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2985k(@dd Object obj, @dd Object obj2) {
        return k.m2988k(obj, obj2);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static <T> T m2986n(@dd T t2, @lvui String str) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(str);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static <T> T m2987q(@dd T t2) {
        t2.getClass();
        return t2;
    }

    public static int toq(@dd Object... objArr) {
        return k.toq(objArr);
    }

    public static int zy(@dd Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
