package com.android.thememanager.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.o1t;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import miui.content.res.ThemeCompatibility;
import miui.content.res.ThemeResources;

/* JADX INFO: compiled from: ApplicationHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements bf2.zy {

    /* JADX INFO: renamed from: k */
    private static final String f16811k = "first_boot_time";

    /* JADX INFO: renamed from: q */
    private static final String f16813q = "fresh_man_mark";

    /* JADX INFO: renamed from: n */
    private static Set<String> f16812n = new HashSet();

    /* JADX INFO: renamed from: g */
    public static Set<String> f16810g = new HashSet();

    static {
        f16812n.add("fonts");
        f16812n.add(com.android.thememanager.basemodule.utils.vyq.f10421k);
        f16812n.add("rights");
        f16810g.add("fonts");
        f16810g.add("fonts_fallback");
        f16810g.add(InterfaceC1789q.ta3f);
    }

    public static boolean f7l8() {
        return o1t.C1820k.m7181n() > 6;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10010g(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(f16813q, -1) == 1;
    }

    /* JADX INFO: renamed from: k */
    public static void m10011k() {
        String str = bf2.zy.jyr;
        if (new File(str).exists()) {
            return;
        }
        d8wk.m9699p(str);
    }

    /* JADX INFO: renamed from: n */
    public static void m10012n() {
        String str = bf2.zy.oaex;
        if (!ThemeCompatibility.isCompatibleResource(str)) {
            C2082k.zy().m8003s().toq();
            File file = new File(str);
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (!f16812n.contains(file2.getName())) {
                        d8wk.x2(file2.getAbsolutePath());
                    }
                }
            }
            com.android.thememanager.basemodule.utils.vyq.m7234y(f16810g);
        }
        m10011k();
    }

    /* JADX INFO: renamed from: p */
    public static long m10013p(Context context) {
        long j2 = PreferenceManager.getDefaultSharedPreferences(context).getLong(f16811k, -1L);
        if (j2 >= 0 && j2 <= System.currentTimeMillis()) {
            return j2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putLong(f16811k, jCurrentTimeMillis);
        editorEdit.apply();
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: q */
    public static void m10014q() {
        m10015s(ThemeResources.THEME_MAGIC_PATH);
    }

    /* JADX INFO: renamed from: s */
    public static void m10015s(String path) {
        d8wk.m9699p(path);
    }

    public static void toq() {
        if (m10016y()) {
            String str = InterfaceC1789q.r5c;
            if (new File(str).exists()) {
                return;
            }
            d8wk.m9699p(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m10016y() {
        return "scorpio".equals(Build.DEVICE);
    }

    public static void zy() {
        m10015s(bf2.zy.oaex);
    }
}
