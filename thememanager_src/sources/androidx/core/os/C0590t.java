package androidx.core.os;

import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.os.t */
/* JADX INFO: compiled from: UserHandleCompat.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(17)
public class C0590t {

    /* JADX INFO: renamed from: k */
    @dd
    private static Method f3714k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private static Constructor<UserHandle> f50546toq;

    /* JADX INFO: renamed from: androidx.core.os.t$k */
    /* JADX INFO: compiled from: UserHandleCompat.java */
    @hyr(24)
    private static class k {
        private k() {
        }

        @lvui
        /* JADX INFO: renamed from: k */
        static UserHandle m2758k(int i2) {
            return UserHandle.getUserHandleForUid(i2);
        }
    }

    private C0590t() {
    }

    /* JADX INFO: renamed from: k */
    private static Method m2757k() throws NoSuchMethodException {
        if (f3714k == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f3714k = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f3714k;
    }

    private static Constructor<UserHandle> toq() throws NoSuchMethodException {
        if (f50546toq == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f50546toq = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f50546toq;
    }

    @lvui
    public static UserHandle zy(int i2) {
        return k.m2758k(i2);
    }
}
