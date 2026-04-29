package com.android.thememanager.basemodule.analysis;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.config.model.Config;
import java.util.Map;

/* JADX INFO: compiled from: AnalyticsHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class zy implements toq {

    /* JADX INFO: renamed from: k */
    private static final String f9805k = "AnalyticsHelper";

    /* JADX INFO: renamed from: q */
    private static String f9806q;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.zy$k */
    /* JADX INFO: compiled from: AnalyticsHelper.java */
    public static class C1711k {

        /* JADX INFO: renamed from: k */
        public String f9807k;

        /* JADX INFO: renamed from: n */
        public boolean f9808n;

        /* JADX INFO: renamed from: q */
        public String f9809q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f57496toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public String f57497zy;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayMap<String, Object> m6679k() {
        return new ArrayMap<>(2);
    }

    /* JADX INFO: renamed from: n */
    public static void m6680n(String moduleId) {
        f9806q = moduleId;
    }

    /* JADX INFO: renamed from: q */
    public static void m6681q(Map<String, Object> map) {
        Config configX2;
        Config.AbTestResult abTestResult;
        if (map == null || (configX2 = C1724k.m6723p().x2()) == null || (abTestResult = configX2.abTest_result) == null || TextUtils.isEmpty(abTestResult.main_tab_sort)) {
            return;
        }
        map.put(toq.y84, toq.yuzy + configX2.abTest_result.main_tab_sort);
    }

    public static String toq() {
        Config.AbTestResult abTestResult;
        Config configX2 = C1724k.m6723p().x2();
        if (configX2 == null || (abTestResult = configX2.abTest_result) == null || TextUtils.isEmpty(abTestResult.main_tab_sort)) {
            return null;
        }
        return "testGroup=main_tab_sort_" + configX2.abTest_result.main_tab_sort;
    }

    public static String zy() {
        return f9806q;
    }
}
