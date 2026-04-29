package com.xiaomi.onetrack.p017f;

import android.content.Context;
import com.xiaomi.onetrack.util.C5776i;

/* JADX INFO: renamed from: com.xiaomi.onetrack.f.g */
/* JADX INFO: loaded from: classes3.dex */
public class C5762g {

    /* JADX INFO: renamed from: a */
    private static final String f32169a = "OneTrackApp";

    /* JADX INFO: renamed from: b */
    private static C5762g f32170b;

    private C5762g(Context context) {
        C5776i.m20256a(new RunnableC5763h(this, context.getApplicationContext()));
    }

    /* JADX INFO: renamed from: a */
    public static void m20098a(Context context) {
        if (f32170b == null) {
            f32170b = new C5762g(context);
        }
    }
}
