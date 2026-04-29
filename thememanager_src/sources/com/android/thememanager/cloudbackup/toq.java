package com.android.thememanager.cloudbackup;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.util.h7am;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import cyoe.InterfaceC5981k;
import java.io.File;
import kotlin.fti;
import kotlin.jk;
import kotlin.jvm.internal.AbstractC6308r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThemeCloudBackupFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final toq f10672k = new toq();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final jk f57870toq = fti.m22825k(zy.INSTANCE);

    /* JADX INFO: renamed from: com.android.thememanager.cloudbackup.toq$k */
    /* JADX INFO: compiled from: ThemeCloudBackupFactory.kt */
    private static final class C1877k implements InterfaceC1876k {
        @Override // com.android.thememanager.cloudbackup.InterfaceC1876k
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Bitmap mo7406k() {
            return C2951n.fn3e().zurt(true, false);
        }

        @Override // com.android.thememanager.cloudbackup.InterfaceC1876k
        @InterfaceC7395n
        public Bitmap toq() {
            return C2951n.fn3e().zurt(false, false);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.cloudbackup.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ThemeCloudBackupFactory.kt */
    private static final class C7911toq implements InterfaceC1876k {
        @Override // com.android.thememanager.cloudbackup.InterfaceC1876k
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Bitmap mo7406k() {
            String strM9799q = InterfaceC1789q.sxpt;
            if (!new File(strM9799q).exists()) {
                strM9799q = h7am.m9799q(C1819o.d2ok(bf2.toq.toq()));
            }
            return BitmapFactory.decodeFile(strM9799q);
        }

        @Override // com.android.thememanager.cloudbackup.InterfaceC1876k
        @InterfaceC7395n
        public Bitmap toq() {
            return uc.fu4(WallpaperManager.getInstance(bf2.toq.toq()));
        }
    }

    /* JADX INFO: compiled from: ThemeCloudBackupFactory.kt */
    static final class zy extends AbstractC6308r implements InterfaceC5981k<InterfaceC1876k> {
        public static final zy INSTANCE = new zy();

        zy() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final InterfaceC1876k invoke() {
            return C2951n.fn3e().kja0() ? new C1877k() : new C7911toq();
        }
    }

    private toq() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final InterfaceC1876k m7407k() {
        return (InterfaceC1876k) f57870toq.getValue();
    }
}
