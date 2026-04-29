package com.android.thememanager.maml.widget;

import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.o1t;
import ek5k.C6002g;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: compiled from: ResourceDownloadManagerExt.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj extends o1t {

    /* JADX INFO: renamed from: com.android.thememanager.maml.widget.qrj$k */
    /* JADX INFO: compiled from: ResourceDownloadManagerExt.java */
    static /* synthetic */ class C2155k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f12675k;

        static {
            int[] iArr = new int[ld6.EnumC1748q.values().length];
            f12675k = iArr;
            try {
                iArr[ld6.EnumC1748q.STATUS_PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12675k[ld6.EnumC1748q.STATUS_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12675k[ld6.EnumC1748q.STATUS_WAITING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12675k[ld6.EnumC1748q.STATUS_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12675k[ld6.EnumC1748q.STATUS_DOWNLOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12675k[ld6.EnumC1748q.STATUS_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12675k[ld6.EnumC1748q.STATUS_NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12675k[ld6.EnumC1748q.STATUS_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: compiled from: ResourceDownloadManagerExt.java */
    static class toq {

        /* JADX INFO: renamed from: k */
        private static final qrj f12676k = new qrj(null);

        toq() {
        }
    }

    /* synthetic */ qrj(C2155k c2155k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mcp(InterfaceC1755y interfaceC1755y) {
        t8r(interfaceC1755y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m8211t(InterfaceC1755y interfaceC1755y) {
        zy(interfaceC1755y);
    }

    public static qrj wvg() {
        return toq.f12676k;
    }

    public void a9(@lvui final InterfaceC1755y listener) {
        if (y9n.m7250l()) {
            t8r(listener);
        } else {
            C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.maml.widget.ld6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12660k.mcp(listener);
                }
            });
        }
    }

    public void fti(@lvui String taskId) {
        this.f13441n.m6825t(taskId);
    }

    public void fu4(@lvui final InterfaceC1755y listener) {
        if (y9n.m7250l()) {
            zy(listener);
        } else {
            C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.maml.widget.x2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12679k.m8211t(listener);
                }
            });
        }
    }

    public void jk(@lvui String taskId) {
        this.f13441n.o1t(taskId);
    }

    public boolean jp0y(@lvui String taskId) {
        return this.f13441n.n7h(taskId) != null;
    }

    public void ni7(ld6.InterfaceC1747n task) {
        this.f13441n.x2(task, true);
    }

    public int o1t(@lvui String taskId) {
        ld6.EnumC1748q enumC1748qM6824h = this.f13441n.m6824h(taskId);
        switch (C2155k.f12675k[enumC1748qM6824h.ordinal()]) {
            case 1:
                return 4;
            case 2:
            case 3:
                return 1;
            case 4:
                return 8;
            case 5:
                return 2;
            default:
                C7794k.f7l8("ResourceDownloadManagerExt. unknown download status. " + enumC1748qM6824h);
            case 6:
            case 7:
            case 8:
                return 16;
        }
    }

    /* JADX INFO: renamed from: z */
    public long m8212z(@lvui String taskId) {
        return this.f13441n.kja0(taskId);
    }

    private qrj() {
    }
}
