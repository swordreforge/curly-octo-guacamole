package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.xiaomi.push.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5851b {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile C5851b f73266toq;

    /* JADX INFO: renamed from: k */
    private Context f32696k;

    private C5851b(Context context) {
        this.f32696k = context;
    }

    public static C5851b toq(Context context) {
        if (f73266toq == null) {
            synchronized (C5851b.class) {
                if (f73266toq == null) {
                    f73266toq = new C5851b(context);
                }
            }
        }
        return f73266toq;
    }

    /* JADX INFO: renamed from: k */
    public synchronized long m20620k(String str, String str2, long j2) {
        try {
        } catch (Throwable unused) {
            return j2;
        }
        return this.f32696k.getSharedPreferences(str, 4).getLong(str2, j2);
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m20621n(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.f32696k.getSharedPreferences(str, 4).edit();
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m20622q(String str, String str2, long j2) {
        SharedPreferences.Editor editorEdit = this.f32696k.getSharedPreferences(str, 4).edit();
        editorEdit.putLong(str2, j2);
        editorEdit.commit();
    }

    public synchronized String zy(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f32696k.getSharedPreferences(str, 4).getString(str2, str3);
    }
}
