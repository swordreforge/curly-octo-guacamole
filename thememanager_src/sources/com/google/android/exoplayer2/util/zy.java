package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: BundleUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private static final String f23346k = "BundleUtil";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private static Method f67164toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private static Method f67165zy;

    private zy() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static IBinder m13774k(Bundle bundle, @zy.dd String str) {
        return lrht.f23230k >= 18 ? bundle.getBinder(str) : toq(bundle, str);
    }

    /* JADX INFO: renamed from: q */
    private static void m13775q(Bundle bundle, @zy.dd String str, @zy.dd IBinder iBinder) {
        Method method = f67165zy;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f67165zy = method2;
                method2.setAccessible(true);
                method = f67165zy;
            } catch (NoSuchMethodException e2) {
                ni7.m13703s(f23346k, "Failed to retrieve putIBinder method", e2);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            ni7.m13703s(f23346k, "Failed to invoke putIBinder via reflection", e3);
        }
    }

    @zy.dd
    private static IBinder toq(Bundle bundle, @zy.dd String str) {
        Method method = f67164toq;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f67164toq = method2;
                method2.setAccessible(true);
                method = f67164toq;
            } catch (NoSuchMethodException e2) {
                ni7.m13703s(f23346k, "Failed to retrieve getIBinder method", e2);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            ni7.m13703s(f23346k, "Failed to invoke getIBinder via reflection", e3);
            return null;
        }
    }

    public static void zy(Bundle bundle, @zy.dd String str, @zy.dd IBinder iBinder) {
        if (lrht.f23230k >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            m13775q(bundle, str, iBinder);
        }
    }
}
