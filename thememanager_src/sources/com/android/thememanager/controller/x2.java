package com.android.thememanager.controller;

import com.android.thememanager.fu4;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ThemeController.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, WeakReference<ld6>> f57997toq = new HashMap();

    /* JADX INFO: renamed from: k */
    private ld6 f11096k;

    public x2(fu4 context) {
        this.f11096k = toq(context);
    }

    private ld6 toq(fu4 context) {
        WeakReference<ld6> weakReference = f57997toq.get(context.getResourceIdentity());
        ld6 ld6Var = null;
        ld6 ld6VarZy = weakReference == null ? null : weakReference.get();
        if (ld6VarZy == null) {
            synchronized (x2.class) {
                WeakReference<ld6> weakReference2 = f57997toq.get(context.getResourceIdentity());
                if (weakReference2 != null) {
                    ld6Var = weakReference2.get();
                }
                if (ld6Var == null) {
                    ld6VarZy = zy(context);
                    f57997toq.put(context.getResourceIdentity(), new WeakReference<>(ld6VarZy));
                } else {
                    ld6VarZy = ld6Var;
                }
            }
        }
        return ld6VarZy;
    }

    /* JADX INFO: renamed from: k */
    public ld6 m7690k() {
        return this.f11096k;
    }

    protected ld6 zy(fu4 context) {
        return context.getResourceFormat() == 3 ? new C1902k(context) : "wallpaper".equals(context.getResourceCode()) ? new kja0(context) : new qrj(context);
    }
}
