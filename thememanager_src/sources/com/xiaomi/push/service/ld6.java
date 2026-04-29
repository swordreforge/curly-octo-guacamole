package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.erbd;
import com.xiaomi.push.m28;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private static InterfaceC5925k f33838k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static toq f73637toq;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ld6$k */
    public interface InterfaceC5925k {
        /* JADX INFO: renamed from: k */
        Map<String, String> m21682k(Context context, m28 m28Var);

        /* JADX INFO: renamed from: k */
        void m21683k(Context context, m28 m28Var);

        boolean toq(Context context, m28 m28Var, boolean z2);

        void zy(Context context, m28 m28Var, erbd erbdVar);
    }

    public interface toq {
        /* JADX INFO: renamed from: a */
        void m21684a(String str);

        /* JADX INFO: renamed from: k */
        void m21685k(m28 m28Var);

        /* JADX INFO: renamed from: k */
        boolean m21686k(m28 m28Var);
    }

    public static boolean f7l8(m28 m28Var) {
        toq toqVar = f73637toq;
        if (toqVar != null && m28Var != null) {
            return toqVar.m21686k(m28Var);
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("pepa handleReceiveMessage is null");
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m21678g(Context context, m28 m28Var, boolean z2) {
        InterfaceC5925k interfaceC5925k = f33838k;
        if (interfaceC5925k != null && m28Var != null) {
            return interfaceC5925k.toq(context, m28Var, z2);
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("pepa judement listener or container is null");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static Map<String, String> m21679k(Context context, m28 m28Var) {
        InterfaceC5925k interfaceC5925k = f33838k;
        if (interfaceC5925k != null && m28Var != null) {
            return interfaceC5925k.m21682k(context, m28Var);
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("pepa listener or container is null");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m21680n(String str) {
        toq toqVar = f73637toq;
        if (toqVar == null || str == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("pepa clearMessage is null");
        } else {
            toqVar.m21684a(str);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m21681q(m28 m28Var) {
        toq toqVar = f73637toq;
        if (toqVar == null || m28Var == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("pepa clearMessage is null");
        } else {
            toqVar.m21685k(m28Var);
        }
    }

    public static void toq(Context context, m28 m28Var) {
        InterfaceC5925k interfaceC5925k = f33838k;
        if (interfaceC5925k == null || m28Var == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("handle msg wrong");
        } else {
            interfaceC5925k.m21683k(context, m28Var);
        }
    }

    public static void zy(Context context, m28 m28Var, erbd erbdVar) {
        InterfaceC5925k interfaceC5925k = f33838k;
        if (interfaceC5925k == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("The Listener of EventProcessor must be set. Please check extension plugin initialization.");
        } else {
            interfaceC5925k.zy(context, m28Var, erbdVar);
        }
    }
}
