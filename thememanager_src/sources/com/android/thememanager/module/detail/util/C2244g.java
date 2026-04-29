package com.android.thememanager.module.detail.util;

import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.C1950s;
import com.android.thememanager.controller.x2;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.util.g */
/* JADX INFO: compiled from: ResourceDownloadHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2244g {
    public static Resource f7l8(String resourceCode, Resource resource, boolean asyncLoadLocal) {
        if (!TextUtils.isEmpty(resource.getLocalId())) {
            return resource;
        }
        return ((C1950s) C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(resourceCode)).m7690k()).d8wk(resource, resource.getOnlineId(), asyncLoadLocal);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8367g(String resourceCode, Resource resource) {
        return C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(resourceCode)).m7690k().mcp(resource);
    }

    /* JADX INFO: renamed from: k */
    public static void m8368k(InterfaceC1755y listener) {
        C2082k.zy().m8000g().zy(listener);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m8369n(String resourceCode, Resource resource) {
        return C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(resourceCode)).m7690k().mo7478t(resource);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m8370q(Resource resource) {
        return C2320q.x9kr(resource);
    }

    /* JADX INFO: renamed from: y */
    public static void m8371y(InterfaceC1755y listener) {
        C2082k.zy().m8000g().t8r(listener);
    }

    public static boolean zy(String resourceCode, Resource resource) {
        x2 x2VarLd6 = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(resourceCode));
        if (TextUtils.isEmpty(resource.getLocalId())) {
            resource = ((C1950s) x2VarLd6.m7690k()).wo(resource, resource.getOnlineId());
        }
        if (resource == null) {
            return false;
        }
        return x2VarLd6.m7690k().mo7478t(resource);
    }

    public void toq(x2 resController, Resource resource) {
        C2320q.t8r(resource, C1791k.getTheme());
    }
}
