package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.InterfaceC5621k;
import com.xiaomi.push.jbh;
import com.xiaomi.push.yl;
import java.io.File;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.p */
/* JADX INFO: loaded from: classes3.dex */
public class C5661p {

    /* JADX INFO: renamed from: k */
    private static boolean f31424k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static InterfaceC5621k f73195toq;

    @Deprecated
    public static void f7l8(Context context, boolean z2) {
    }

    /* JADX INFO: renamed from: g */
    public static void m19538g(Context context) {
        InterfaceC5621k interfaceC5621k = f73195toq;
        boolean z2 = interfaceC5621k != null;
        boolean z3 = f31424k;
        boolean z5 = true ^ z3;
        if (!(z3 ? false : z2)) {
            interfaceC5621k = null;
        }
        com.xiaomi.channel.commonutils.logger.zy.qrj(new jbh(interfaceC5621k, z5 ? yl.m22054q(context) : null));
    }

    /* JADX INFO: renamed from: k */
    public static void m19539k(Context context) {
        f31424k = true;
        m19538g(context);
    }

    /* JADX INFO: renamed from: n */
    public static void m19540n(Context context, InterfaceC5621k interfaceC5621k) {
        f73195toq = interfaceC5621k;
        m19538g(context);
    }

    /* JADX INFO: renamed from: q */
    protected static InterfaceC5621k m19541q() {
        return f73195toq;
    }

    public static void toq(Context context) {
        f31424k = false;
        m19538g(context);
    }

    @Deprecated
    public static File zy(String str) {
        return null;
    }
}
