package com.miui.msa.api.landingPage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.systemAdSolution.landingPage.ILandingPageListener;
import com.miui.systemAdSolution.landingPageV2.listener.IActionTaskResultListener;
import com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener;
import com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener;
import com.miui.systemAdSolution.landingPageV2.listener.IH5Listener;
import com.miui.systemAdSolution.landingPageV2.task.action.Action;
import org.json.JSONObject;
import r25n.C7622k;
import u38j.C7683q;

/* JADX INFO: renamed from: com.miui.msa.api.landingPage.q */
/* JADX INFO: compiled from: LandingPageProxyForOldOperation.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5314q {

    /* JADX INFO: renamed from: g */
    public static final String f29718g = "isDownloadBySystem";

    /* JADX INFO: renamed from: n */
    public static final String f29719n = "dismissWhenDownloadStart";

    /* JADX INFO: renamed from: q */
    public static final String f29720q = "showCancelFlags";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72440toq = "LandingPageProxyForOldOperation";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f72441zy = "startAppFlags";

    /* JADX INFO: renamed from: k */
    private Context f29721k;

    /* JADX INFO: renamed from: com.miui.msa.api.landingPage.q$k */
    /* JADX INFO: compiled from: LandingPageProxyForOldOperation.java */
    class k {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final String f72442cdj = "description";

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final String f72443fn3e = "landingPageDeeplinkUrl";

        /* JADX INFO: renamed from: h */
        public static final String f29722h = "category";

        /* JADX INFO: renamed from: i */
        public static final String f29723i = "downloadUrl";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final String f72444ki = "size";

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final String f72445kja0 = "name";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final String f72446n7h = "package";

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final String f72447ni7 = "ex";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final String f72448qrj = "AppInfo";

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final String f72449t8r = "iconUrl";

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final String f72450zurt = "landingPageH5Url";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public String f72451f7l8;

        /* JADX INFO: renamed from: g */
        public String f29724g;

        /* JADX INFO: renamed from: k */
        public String f29725k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public int f72452ld6;

        /* JADX INFO: renamed from: n */
        public String f29726n;

        /* JADX INFO: renamed from: p */
        public String f29727p;

        /* JADX INFO: renamed from: q */
        public String f29728q;

        /* JADX INFO: renamed from: s */
        public String f29729s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f72453toq;

        /* JADX INFO: renamed from: y */
        public String f29730y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public String f72455zy;

        public k(String str) {
            this.f72452ld6 = 0;
            JSONObject jSONObject = new JSONObject(str);
            this.f29725k = str;
            this.f72453toq = jSONObject.optString("package");
            this.f72455zy = jSONObject.optString("name");
            this.f29728q = jSONObject.optString("category");
            this.f29726n = jSONObject.optString("description");
            this.f72452ld6 = jSONObject.optInt("size");
            this.f29724g = jSONObject.optString("iconUrl");
            this.f72451f7l8 = jSONObject.optString("downloadUrl");
            this.f29730y = jSONObject.optString(f72443fn3e);
            this.f29729s = jSONObject.optString(f72450zurt);
            this.f29727p = jSONObject.optString("ex");
        }
    }

    public C5314q(Context context) {
        this.f29721k = context;
        zy.m18097y(context);
    }

    /* JADX INFO: renamed from: q */
    public static void m18090q(Context context) {
        zy.m18097y(context);
    }

    /* JADX INFO: renamed from: g */
    public void m18091g(String str, Bundle bundle, Action.C5336k c5336k, final ILandingPageListener iLandingPageListener, IActionTaskResultListener iActionTaskResultListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            k kVar = new k(str);
            zy zyVar = new zy(this.f29721k);
            zyVar.toq(toq.m18096q(new r25n.zy(kVar.f72453toq).x2(c5336k).f7l8(!bundle.getBoolean(f29718g, false) ? 3 : 2).m27941y(true).m27940s(true).m27938p(new IDownloadListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$10
                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadCancel() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadCancel();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadFail() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadFail("");
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadProgress(int i2) {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadProgress(i2);
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadStart() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadStart();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadSuccess() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadSuccess();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallFail() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallFail("");
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallStart() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallStart();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallSuccess() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallSuccess();
                    }
                }
            }), new r25n.toq().m27934y(kVar.f72451f7l8).f7l8(kVar.f29728q).m27933s(kVar.f29724g).m27931p(kVar.f72452ld6).ld6(kVar.f29726n).x2(kVar.f72455zy), new C7622k().zy(bundle.getBoolean(f29719n, false)).m27927q(bundle.getBoolean(f29720q, true))));
            if (bundle.getBoolean(f72441zy, false)) {
                zyVar.toq(toq.toq(kVar.f29730y, "", false, new IDeeplinkListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$11
                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkFail() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onDeeplinkFail();
                        }
                    }

                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkSuccess() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onDeeplinkSuccess();
                        }
                    }
                }));
                zyVar.toq(toq.toq("", kVar.f72453toq, false, new IDeeplinkListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$12
                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkFail() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onLanuchAppFail();
                        }
                    }

                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkSuccess() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onLanuchAppSuccess();
                        }
                    }
                }));
            }
            zyVar.ld6(iActionTaskResultListener);
            zyVar.m18100n();
        } catch (Exception e2) {
            C7683q.m28055n(f72440toq, "startDownload e : ", e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m18092k(String str, Bundle bundle, Action.C5336k c5336k, final ILandingPageListener iLandingPageListener, IActionTaskResultListener iActionTaskResultListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            k kVar = new k(str);
            zy zyVar = new zy(this.f29721k);
            zyVar.toq(toq.toq(kVar.f29730y, "", false, new IDeeplinkListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$1
                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                public void onDeeplinkFail() {
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                public void onDeeplinkSuccess() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDeeplinkSuccess();
                    }
                }
            }));
            zyVar.toq(toq.m18095n(kVar.f29729s, false, new IH5Listener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$2
                @Override // com.miui.systemAdSolution.landingPageV2.listener.IH5Listener
                public void onH5Fail() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onH5Fail();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IH5Listener
                public void onH5Success() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onH5Success();
                    }
                }
            }));
            zyVar.toq(toq.toq("", kVar.f72453toq, false, new IDeeplinkListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$3
                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                public void onDeeplinkFail() {
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                public void onDeeplinkSuccess() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onLanuchAppSuccess();
                    }
                }
            }));
            zyVar.toq(toq.m18096q(new r25n.zy(kVar.f72453toq).x2(c5336k).f7l8(!bundle.getBoolean(f29718g, false) ? 3 : 2).m27941y(true).m27940s(false).m27938p(new IDownloadListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$4
                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadCancel() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadCancel();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadFail() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadFail("");
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadProgress(int i2) {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadProgress(i2);
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadStart() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadStart();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadSuccess() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadSuccess();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallFail() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallFail("");
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallStart() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallStart();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallSuccess() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallSuccess();
                    }
                }
            }), new r25n.toq().m27934y(kVar.f72451f7l8).f7l8(kVar.f29728q).m27933s(kVar.f29724g).m27931p(kVar.f72452ld6).ld6(kVar.f29726n).x2(kVar.f72455zy), new C7622k().zy(bundle.getBoolean(f29719n, false)).m27927q(bundle.getBoolean(f29720q, true))));
            if (bundle.getBoolean(f72441zy, false)) {
                zyVar.toq(toq.toq(kVar.f29730y, "", false, new IDeeplinkListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$5
                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkFail() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onDeeplinkFail();
                        }
                    }

                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkSuccess() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onDeeplinkSuccess();
                        }
                    }
                }));
                zyVar.toq(toq.toq("", kVar.f72453toq, false, new IDeeplinkListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$6
                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkFail() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onLanuchAppFail();
                        }
                    }

                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkSuccess() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onLanuchAppSuccess();
                        }
                    }
                }));
            }
            zyVar.ld6(iActionTaskResultListener);
            zyVar.m18100n();
        } catch (Exception e2) {
            C7683q.m28055n(f72440toq, "deeplinkStartApp e : ", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m18093n(String str, Bundle bundle, Action.C5336k c5336k, final ILandingPageListener iLandingPageListener, IActionTaskResultListener iActionTaskResultListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            k kVar = new k(str);
            zy zyVar = new zy(this.f29721k);
            zyVar.toq(toq.m18096q(new r25n.zy(kVar.f72453toq).x2(c5336k).f7l8(!bundle.getBoolean(f29718g, false) ? 3 : 2).m27941y(true).m27940s(false).m27938p(new IDownloadListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$7
                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadCancel() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadCancel();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadFail() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadFail("");
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadProgress(int i2) {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadProgress(i2);
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadStart() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadStart();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onDownloadSuccess() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onDownloadSuccess();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallFail() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallFail("");
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallStart() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallStart();
                    }
                }

                @Override // com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener
                public void onInstallSuccess() {
                    ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                    if (iLandingPageListener2 != null) {
                        iLandingPageListener2.onInstallSuccess();
                    }
                }
            }), new r25n.toq().m27934y(kVar.f72451f7l8).f7l8(kVar.f29728q).m27933s(kVar.f29724g).m27931p(kVar.f72452ld6).ld6(kVar.f29726n).x2(kVar.f72455zy), new C7622k().zy(bundle.getBoolean(f29719n, false)).m27927q(bundle.getBoolean(f29720q, true))));
            if (bundle.getBoolean(f72441zy, false)) {
                zyVar.toq(toq.toq(kVar.f29730y, "", false, new IDeeplinkListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$8
                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkFail() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onDeeplinkFail();
                        }
                    }

                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkSuccess() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onDeeplinkSuccess();
                        }
                    }
                }));
                zyVar.toq(toq.toq("", kVar.f72453toq, false, new IDeeplinkListener.Stub() { // from class: com.miui.msa.api.landingPage.LandingPageProxyForOldOperation$9
                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkFail() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onLanuchAppFail();
                        }
                    }

                    @Override // com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener
                    public void onDeeplinkSuccess() {
                        ILandingPageListener iLandingPageListener2 = iLandingPageListener;
                        if (iLandingPageListener2 != null) {
                            iLandingPageListener2.onLanuchAppSuccess();
                        }
                    }
                }));
            }
            zyVar.ld6(iActionTaskResultListener);
            zyVar.m18100n();
        } catch (Exception e2) {
            C7683q.m28055n(f72440toq, "showAppDetailCard e : ", e2);
        }
    }

    public EnumC5312k toq(String str) {
        try {
            return new zy(this.f29721k).m18098g(str);
        } catch (Exception e2) {
            C7683q.m28055n(f72440toq, "getPackageDownloadStatus : ", e2);
            return null;
        }
    }

    public int zy() {
        try {
            return new zy(this.f29721k).f7l8();
        } catch (Exception e2) {
            C7683q.m28055n(f72440toq, "getPackageDownloadStatus : ", e2);
            return 0;
        }
    }
}
