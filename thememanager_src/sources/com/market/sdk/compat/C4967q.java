package com.market.sdk.compat;

import android.os.UserHandle;
import androidx.room.AbstractC1141t;
import com.market.sdk.utils.n7h;

/* JADX INFO: renamed from: com.market.sdk.compat.q */
/* JADX INFO: compiled from: UserHandleCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4967q {

    /* JADX INFO: renamed from: k */
    public static final int f28034k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f68878toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Class<?> f68879zy;

    static {
        Integer num = (Integer) n7h.m17457n(UserHandle.class, UserHandle.class, "USER_CURRENT", com.market.sdk.reflect.toq.f28131g);
        f28034k = num != null ? num.intValue() : -2;
        Integer num2 = (Integer) n7h.m17457n(UserHandle.class, UserHandle.class, "USER_OWNER", com.market.sdk.reflect.toq.f28131g);
        f68878toq = num2 != null ? num2.intValue() : 0;
        f68879zy = n7h.zy("android.os.UserHandle");
    }

    /* JADX INFO: renamed from: k */
    public static int m17300k() {
        Integer num;
        Class<?> clsZy = n7h.zy("miui.securityspace.XSpaceUserHandle");
        return (clsZy == null || (num = (Integer) n7h.m17457n(clsZy, clsZy, "USER_XSPACE", com.market.sdk.reflect.toq.f28131g)) == null) ? AbstractC1141t.f52393qrj : num.intValue();
    }

    public static int toq() {
        Class<?> cls = f68879zy;
        return ((Integer) n7h.m17459s(cls, cls, "myUserId", n7h.f7l8(Integer.TYPE, new Class[0]), new Object[0])).intValue();
    }
}
