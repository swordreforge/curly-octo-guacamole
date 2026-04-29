package com.android.thememanager.share.delegate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.android.thememanager.C2082k;
import com.android.thememanager.share.C2706p;
import com.android.thememanager.share.wechat.C2709g;
import com.android.thememanager.share.wechat.C2714y;

/* JADX INFO: compiled from: ShareDelegateManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj {

    /* JADX INFO: renamed from: k */
    private static final String f16008k = "ShareDelegateManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static SparseArray<AbstractC2694g> f61059toq = new SparseArray<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static SparseArray<f7l8> f61060zy = new SparseArray<>();

    static {
        m9426z(C2706p.f61112jp0y, new f7l8() { // from class: com.android.thememanager.share.delegate.y
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return cdj.kja0(bundle);
            }
        });
        m9426z(C2706p.f61110gvn7, new f7l8() { // from class: com.android.thememanager.share.delegate.s
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return cdj.m9418h(bundle);
            }
        });
        m9426z(C2706p.f61102a9, new f7l8() { // from class: com.android.thememanager.share.delegate.p
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return cdj.cdj(bundle);
            }
        });
        m9426z(C2706p.f61108fti, new f7l8() { // from class: com.android.thememanager.share.delegate.ld6
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return cdj.ki(bundle);
            }
        });
        m9426z(3, new f7l8() { // from class: com.android.thememanager.share.delegate.x2
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return cdj.t8r(bundle);
            }
        });
        m9426z(4, new f7l8() { // from class: com.android.thememanager.share.delegate.qrj
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return cdj.m9419i(bundle);
            }
        });
        m9426z(1, new f7l8() { // from class: com.android.thememanager.share.delegate.n7h
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return cdj.fn3e(bundle);
            }
        });
        m9426z(2, new f7l8() { // from class: com.android.thememanager.share.delegate.kja0
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return cdj.zurt(bundle);
            }
        });
        m9426z(0, new f7l8() { // from class: com.android.thememanager.share.delegate.h
            @Override // com.android.thememanager.share.delegate.f7l8
            /* JADX INFO: renamed from: k */
            public final AbstractC2694g mo9427k(Bundle bundle) {
                return new ki(bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2694g cdj(Bundle bundle) {
        return new C2709g(bundle, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2694g fn3e(Bundle bundle) {
        return new C2696k(1, bundle);
    }

    public static void fu4(int shareFlag, AbstractC2694g delegate) {
        f61059toq.put(shareFlag, delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ AbstractC2694g m9418h(Bundle bundle) {
        return new C2714y(C2082k.zy().toq(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ AbstractC2694g m9419i(Bundle bundle) {
        return new toq(4, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2694g ki(Bundle bundle) {
        return new C2709g(bundle, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2694g kja0(Bundle bundle) {
        return new com.android.thememanager.share.wechat.zy(C2082k.zy().toq(), bundle);
    }

    public static AbstractC2694g ld6(int shareFlag, Bundle shareConfig) {
        f7l8 f7l8VarX2 = x2(shareFlag);
        if (f7l8VarX2 != null) {
            return f7l8VarX2.mo9427k(shareConfig);
        }
        throw new UnsupportedOperationException("The share flag is NOT Support! Your flag is " + shareFlag);
    }

    public static boolean n7h(int shareFlag, Activity activity, Bundle shareConfig, Intent shareIntent) {
        AbstractC2694g abstractC2694gQrj;
        return (shareConfig == null || (abstractC2694gQrj = qrj(shareFlag, activity, shareConfig)) == null || !abstractC2694gQrj.mo9434y(shareIntent)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent ni7(int r3, android.content.Intent r4) {
        /*
            if (r3 != 0) goto Lb
            java.lang.String r3 = "com.miui.share.extra.intent_overlay_more"
            android.os.Parcelable r3 = r4.getParcelableExtra(r3)
            android.content.Intent r3 = (android.content.Intent) r3
            goto L33
        Lb:
            int r0 = com.android.thememanager.share.C2706p.m9460q(r3)
            r1 = 3
            if (r0 == r1) goto L13
            goto L32
        L13:
            int r0 = com.android.thememanager.share.C2706p.toq(r3)
            r2 = 1
            if (r0 != r2) goto L23
            java.lang.String r3 = "com.miui.share.extra.intent_overlay_weibo_sdk"
            android.os.Parcelable r3 = r4.getParcelableExtra(r3)
            android.content.Intent r3 = (android.content.Intent) r3
            goto L33
        L23:
            int r3 = com.android.thememanager.share.C2706p.toq(r3)
            if (r3 != r1) goto L32
            java.lang.String r3 = "com.miui.share.extra.intent_overlay_weibo_sdk_server"
            android.os.Parcelable r3 = r4.getParcelableExtra(r3)
            android.content.Intent r3 = (android.content.Intent) r3
            goto L33
        L32:
            r3 = 0
        L33:
            if (r3 == 0) goto L36
            r4 = r3
        L36:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.share.delegate.cdj.ni7(int, android.content.Intent):android.content.Intent");
    }

    /* JADX INFO: renamed from: p */
    public static void m9422p(int shareFlag) {
        AbstractC2694g abstractC2694g = f61059toq.get(shareFlag);
        if (abstractC2694g != null) {
            abstractC2694g.mo9429k();
        }
        f61059toq.delete(shareFlag);
    }

    public static AbstractC2694g qrj(int shareFlag, Activity activity, Bundle shareConfig) {
        AbstractC2694g abstractC2694gLd6 = f61059toq.get(shareFlag);
        if (abstractC2694gLd6 == null) {
            abstractC2694gLd6 = ld6(shareFlag, shareConfig);
            f61059toq.put(shareFlag, abstractC2694gLd6);
        }
        abstractC2694gLd6.m9433s(activity);
        return abstractC2694gLd6;
    }

    /* JADX INFO: renamed from: s */
    public static void m9424s() {
        for (int i2 = 0; i2 < f61059toq.size(); i2++) {
            m9422p(f61059toq.keyAt(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2694g t8r(Bundle bundle) {
        return new t8r(3, bundle);
    }

    static synchronized f7l8 x2(int shareFlag) {
        return f61060zy.get(shareFlag);
    }

    /* JADX INFO: renamed from: z */
    public static synchronized void m9426z(int shareFlag, f7l8 factory) {
        f61060zy.put(shareFlag, factory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2694g zurt(Bundle bundle) {
        return new C2697n(2, bundle);
    }
}
