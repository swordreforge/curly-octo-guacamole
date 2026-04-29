package com.android.thememanager.basemodule.analysis;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.n */
/* JADX INFO: compiled from: AnonymousProducer.java */
/* JADX INFO: loaded from: classes.dex */
public class C1704n {

    /* JADX INFO: renamed from: g */
    private static final long f9739g = 2592000000L;

    /* JADX INFO: renamed from: n */
    private static final String f9740n = "anonymous_update_time";

    /* JADX INFO: renamed from: q */
    private static final String f9741q = "anonymous_id";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57481zy = "theme_anonymous";

    /* JADX INFO: renamed from: k */
    private String f9742k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f57482toq;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.n$toq */
    /* JADX INFO: compiled from: AnonymousProducer.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static C1704n f9743k = new C1704n();

        private toq() {
        }
    }

    public static C1704n toq() {
        return toq.f9743k;
    }

    /* JADX INFO: renamed from: k */
    public String m6646k() {
        return this.f9742k;
    }

    private C1704n() {
        SharedPreferences sharedPreferences = bf2.toq.toq().getSharedPreferences(f57481zy, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        this.f9742k = sharedPreferences.getString(f9741q, "");
        this.f57482toq = sharedPreferences.getLong(f9740n, -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f9742k) || jCurrentTimeMillis - this.f57482toq > f9739g) {
            String string = UUID.randomUUID().toString();
            this.f9742k = string;
            editorEdit.putString(f9741q, string);
        }
        this.f57482toq = jCurrentTimeMillis;
        editorEdit.putLong(f9740n, jCurrentTimeMillis);
        editorEdit.commit();
    }
}
