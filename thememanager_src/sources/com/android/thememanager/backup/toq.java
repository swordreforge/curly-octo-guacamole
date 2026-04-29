package com.android.thememanager.backup;

import android.app.WallpaperManager;
import android.content.Context;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThemeBackupManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final C1682k f57418toq = new C1682k(null);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private static toq f57419zy;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private zy f9631k;

    /* JADX INFO: renamed from: com.android.thememanager.backup.toq$k */
    /* JADX INFO: compiled from: ThemeBackupManager.kt */
    public static final class C1682k {
        private C1682k() {
        }

        public /* synthetic */ C1682k(ni7 ni7Var) {
            this();
        }

        private final toq toq() {
            if (toq.f57419zy == null) {
                toq.f57419zy = new toq(null);
            }
            return toq.f57419zy;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final toq m6568k() {
            toq qVar = toq();
            d2ok.qrj(qVar);
            return qVar;
        }
    }

    private toq() {
        int iF7l8 = ThemeBackupAgent.f7l8();
        this.f9631k = iF7l8 != 2 ? iF7l8 != 3 ? new C1678g() : new C1679k() : new C1680n();
    }

    public /* synthetic */ toq(ni7 ni7Var) {
        this();
    }

    /* JADX INFO: renamed from: q */
    public final void m6567q(@InterfaceC7396q Context context, @InterfaceC7396q WallpaperManager wm) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(wm, "wm");
        this.f9631k.toq(context, wm);
    }

    public final void zy(@InterfaceC7396q Context context, @InterfaceC7396q WallpaperManager wm) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(wm, "wm");
        this.f9631k.mo6562k(context, wm);
    }
}
