package com.android.thememanager.util;

import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import java.io.File;
import java.util.Collections;

/* JADX INFO: compiled from: TrialBackupManager.java */
/* JADX INFO: loaded from: classes2.dex */
@zy.y9n
public class etdu implements bf2.zy, InterfaceC1789q {

    /* JADX INFO: renamed from: y */
    private static final String f16415y = "componentCode";

    /* JADX INFO: renamed from: k */
    public static String f16412k = com.android.thememanager.basemodule.utils.vyq.f10426q + "trial_backup/";

    /* JADX INFO: renamed from: q */
    public static String f16414q = f16412k + InterfaceC1789q.ef;

    /* JADX INFO: renamed from: n */
    public static String f16413n = f16412k + com.android.thememanager.basemodule.resource.constants.toq.q92d;

    /* JADX INFO: renamed from: g */
    public static String f16411g = f16413n + "backup" + com.android.thememanager.basemodule.resource.constants.toq.n5;

    public static void f7l8() {
        if (new File(f16412k).exists()) {
            return;
        }
        com.android.thememanager.basemodule.utils.vyq.m7230p();
        toq.m10015s(f16412k);
        g1.m9752p(com.android.thememanager.basemodule.utils.vyq.f10423n, f16414q);
    }

    /* JADX INFO: renamed from: g */
    private static void m9708g() {
        File file = new File(f16413n);
        if (file.exists() && !"fonts".equals(m9709k())) {
            file.delete();
        }
        if (!file.exists()) {
            toq.m10015s(f16413n);
            for (String str : new File(bf2.zy.oaex).list()) {
                if (C1792n.fti(str) || "rights".equals(str)) {
                    g1.m9752p(bf2.zy.oaex + str, f16413n + str);
                }
            }
        }
        new ch.zy(f16411g).putString(f16415y, "fonts").commit();
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static String m9709k() {
        if (new File(f16411g).exists()) {
            return new ch.zy(f16411g).getString(f16415y, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m9710n(@zy.dd String resourceCode) {
        if (C1792n.fti(resourceCode)) {
            m9708g();
        } else if (C1792n.wvg(resourceCode)) {
            m9712y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m9711q() {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.etdu.m9711q():void");
    }

    public static void toq(@zy.dd String resourceCode) {
        if (C1792n.fti(resourceCode)) {
            zy();
        } else if (C1792n.wvg(resourceCode)) {
            m9711q();
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m9712y() {
        File file = new File(f16413n);
        if (file.exists() && !"theme".equals(m9709k())) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        toq.m10015s(f16413n);
        for (String str : new File(bf2.zy.oaex).list()) {
            if (!str.contains(com.android.thememanager.basemodule.utils.vyq.f10421k)) {
                g1.m9752p(bf2.zy.oaex + str, f16413n + str);
            }
        }
        new ch.zy(f16411g).putString(f16415y, "theme").commit();
    }

    private static void zy() {
        d8wk.x2(bf2.zy.oaex + "fonts");
        File file = new File(f16413n);
        if (file.exists()) {
            File file2 = new File(f16411g);
            if (file2.exists()) {
                file2.delete();
            }
            for (String str : file.list()) {
                if ("rights".equals(str)) {
                    File file3 = new File(f16413n + str);
                    StringBuilder sb = new StringBuilder();
                    String str2 = bf2.zy.oaex;
                    sb.append(str2);
                    sb.append(str);
                    d8wk.zy(file3, new File(sb.toString()));
                    d8wk.ld6(str2 + str);
                } else {
                    g1.m9752p(f16413n + str, bf2.zy.oaex + str);
                }
            }
            com.android.thememanager.basemodule.utils.o1t.jp0y();
            if (g1.m9746j()) {
                com.android.thememanager.basemodule.utils.vyq.f7l8("fonts");
            } else if (new File(f16414q).exists()) {
                com.android.thememanager.basemodule.utils.vyq.m7233t(f16414q, Collections.singleton("fonts"), null);
            }
        }
        d8wk.x2(f16412k);
    }
}
