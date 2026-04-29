package com.android.thememanager.lockscreen.lock.wallpaper;

import android.graphics.Matrix;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.p */
/* JADX INFO: compiled from: GestureManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2129p {

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.p$k */
    /* JADX INFO: compiled from: GestureManager.kt */
    public static final class k {
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m8141k(InterfaceC2129p interfaceC2129p, Matrix matrix, Boolean bool, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onApply");
            }
            if ((i2 & 2) != 0) {
                bool = null;
            }
            interfaceC2129p.mo8119y(matrix, bool);
        }
    }

    /* JADX INFO: renamed from: y */
    void mo8119y(@InterfaceC7396q Matrix matrix, @InterfaceC7395n Boolean bool);
}
