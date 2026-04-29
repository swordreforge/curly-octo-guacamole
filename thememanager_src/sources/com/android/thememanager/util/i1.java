package com.android.thememanager.util;

import android.content.Context;
import ek5k.C6002g;
import java.io.File;

/* JADX INFO: compiled from: PreloadHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class i1 {

    /* JADX INFO: renamed from: k */
    private static volatile File f16562k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile File f61308toq;

    /* JADX INFO: renamed from: n */
    public static void m9820n(final Context context) {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.util.bf2
            @Override // java.lang.Runnable
            public final void run() {
                i1.m9821q(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m9821q(Context context) {
        toq(context.getApplicationContext());
        zy(context.getApplicationContext());
    }

    public static File toq(Context context) {
        if (f16562k == null) {
            synchronized (i1.class) {
                if (f16562k == null) {
                    f16562k = context.getCacheDir();
                }
            }
        }
        return f16562k;
    }

    public static File zy(Context context) {
        if (f61308toq == null) {
            synchronized (i1.class) {
                if (f61308toq == null) {
                    f61308toq = context.getFilesDir();
                }
            }
        }
        return f61308toq;
    }
}
