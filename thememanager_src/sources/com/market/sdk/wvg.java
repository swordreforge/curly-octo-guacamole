package com.market.sdk;

import android.text.TextUtils;
import com.market.sdk.utils.C5013p;
import java.lang.reflect.Method;
import zy.lvui;

/* JADX INFO: compiled from: SystemProperties.java */
/* JADX INFO: loaded from: classes3.dex */
public class wvg {

    /* JADX INFO: renamed from: k */
    private static Class<?> f28263k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f69065toq;

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            f28263k = cls;
            f69065toq = cls.getDeclaredMethod("get", String.class, String.class);
        } catch (Exception e2) {
            C5013p.m17463n(com.market.sdk.utils.ki.f28210k, e2.getMessage(), e2);
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static String m17502k(String str, String str2) {
        try {
            String str3 = (String) f69065toq.invoke(f28263k, str, str2);
            return !TextUtils.isEmpty(str3) ? str3 : str2;
        } catch (Exception e2) {
            C5013p.m17463n(com.market.sdk.utils.ki.f28210k, e2.getMessage(), e2);
            return str2;
        }
    }
}
