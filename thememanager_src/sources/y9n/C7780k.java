package y9n;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: y9n.k */
/* JADX INFO: compiled from: AdTrackPlugin.java */
/* JADX INFO: loaded from: classes.dex */
public class C7780k implements InterfaceC7779g {

    /* JADX INFO: renamed from: a */
    private static final String f45917a = "view";

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final String f100564a9 = "ad_position";

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final String f100565a98o = "other_position";

    /* JADX INFO: renamed from: b */
    public static final String f45918b = "privacy";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final String f100566bf2 = "permission";

    /* JADX INFO: renamed from: c */
    public static final String f45919c = "PAUSE";

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private static final String f100567ch = "ex";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final String f100568d2ok = "APP_DOWNLOAD_SUCCESS";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f100569d3 = "CLICK";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f100570dd = "APP_LAUNCH_START_DEEPLINK";

    /* JADX INFO: renamed from: e */
    private static final String f45920e = "pageId";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final String f100571ek5k = "ad";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final String f100572eqxt = "APP_START_DOWNLOAD";

    /* JADX INFO: renamed from: f */
    public static final String f45921f = "COMPLETE";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final String f100573fti = "isVideo";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f100574gvn7 = "VIEW";

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private static final String f100575hb = "btn";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f100576hyr = "APP_LAUNCH_FAIL";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f100577i1 = "introduction";

    /* JADX INFO: renamed from: j */
    private static final String f45922j = "button";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f100578jk = "ex";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f100579jp0y = "ABT_RES";

    /* JADX INFO: renamed from: l */
    public static final String f45923l = "APP_LAUNCH_START";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f100580lrht = "PLAY";

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static final String f100581lv5 = "1";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f100582lvui = "APP_INSTALL_START";

    /* JADX INFO: renamed from: m */
    private static final String f45924m = "videodetailbutton";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f100583mcp = "e";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f100584n5r1 = "APP_LAUNCH_SUCCESS";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f100585ncyb = "APP_LAUNCH_FAIL_DEEPLINK";

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final String f100586nmn5 = "ext_normClickArea";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private static final String f100587nn86 = "trackId";

    /* JADX INFO: renamed from: o */
    private static final String f45925o = "card";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f100588o1t = "theme_adfeedback";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final String f100589oc = "CLICK_XOUT_DISLIKE";

    /* JADX INFO: renamed from: r */
    public static final String f45926r = "APP_INSTALL_SUCCESS";

    /* JADX INFO: renamed from: t */
    private static final String f45927t = "t";

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static final String f100590t8iq = "2";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f100591uv6 = "AUDIO_ON";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f100592vyq = "AUDIO_OFF";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f100593wvg = "NEW_NATIVE_AD";

    /* JADX INFO: renamed from: x */
    private static final String f45928x = "adTrackInfo";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f100594x9kr = "APP_LAUNCH_SUCCESS_DEEPLINK";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final String f100595y9n = "click_content";

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final String f100596yz = "button";

    /* JADX INFO: renamed from: z */
    private static final String f45929z = "AdTrackPlugin";

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private static final String f100597zp = "click";

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m28165l(java.lang.String r23, java.util.List<java.lang.String> r24, com.android.thememanager.basemodule.ad.model.AdInfo r25, java.util.Map<java.lang.String, java.lang.String> r26, boolean r27, java.util.Map<java.lang.String, java.lang.String> r28) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y9n.C7780k.m28165l(java.lang.String, java.util.List, com.android.thememanager.basemodule.ad.model.AdInfo, java.util.Map, boolean, java.util.Map):void");
    }

    private static void ncyb(String actionType, List<String> monitorUrls, AdInfo info, Map<String, String> extraMap) {
        m28165l(actionType, monitorUrls, info, extraMap, false, null);
    }

    private static void x9kr(String actionType, List<String> monitorUrls, AdInfo info) {
        ncyb(actionType, monitorUrls, info, null);
    }

    @Override // y9n.toq
    public void a9(AdInfo adInfo) {
        x9kr(f100572eqxt, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    public void cdj(Map<String, Object> params) {
    }

    @Override // y9n.InterfaceC7779g
    public void d2ok(Map<String, Object> params) {
    }

    @Override // y9n.InterfaceC7779g
    public void d3(Map<String, Object> params) {
    }

    @Override // y9n.InterfaceC7779g
    public void dd(Map<String, Object> params) {
    }

    @Override // y9n.InterfaceC7779g
    public void eqxt(Map<String, Object> params) {
    }

    @Override // y9n.toq
    public void f7l8(AdInfo adInfo) {
        x9kr(f100582lvui, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    public void fn3e(Map<String, Object> params) {
    }

    @Override // y9n.toq
    public void fti(AdInfo adInfo) {
        qrj(adInfo, false);
    }

    @Override // y9n.InterfaceC7779g
    public void fu4(Map<String, Object> params) {
    }

    @Override // y9n.toq
    /* JADX INFO: renamed from: g */
    public void mo6666g(AdInfo adInfo) {
        x9kr(f45919c, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    public void gvn7(Map<String, Object> params) {
    }

    @Override // y9n.InterfaceC7779g
    /* JADX INFO: renamed from: h */
    public void mo6667h(Map<String, Object> params) {
    }

    @Override // y9n.toq
    /* JADX INFO: renamed from: i */
    public void mo6668i(AdInfo adInfo) {
        x9kr(f100584n5r1, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.toq
    public void jk(AdInfo adInfo, Map<String, String> extra) {
        t8r(adInfo, extra, false, null);
    }

    @Override // y9n.toq
    public void jp0y(AdInfo adInfo) {
        x9kr(f100591uv6, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    /* JADX INFO: renamed from: k */
    public void mo6669k(Map<String, Object> params) {
    }

    @Override // y9n.toq
    public void ki(AdInfo adInfo) {
        x9kr(f100570dd, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.toq
    public void kja0(String event, AdInfo adInfo) {
        x9kr(event, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    public void ld6(Map<String, Object> params) {
    }

    @Override // y9n.toq
    public void lvui(AdInfo adInfo) {
        x9kr(f100580lrht, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    public void mcp(Map<String, Object> params) {
    }

    @Override // y9n.toq
    /* JADX INFO: renamed from: n */
    public void mo6670n(AdInfo adInfo) {
        x9kr(f45926r, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    public void n7h(Map<String, Object> params) {
    }

    @Override // y9n.InterfaceC7779g
    public void ni7(Map<String, Object> params) {
    }

    @Override // y9n.InterfaceC7779g
    public void o1t(Map<String, Object> params) {
    }

    @Override // y9n.toq
    public void oc(AdInfo adInfo) {
        x9kr(f100576hyr, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    /* JADX INFO: renamed from: p */
    public void mo6671p(Map<String, Object> params) {
    }

    @Override // y9n.toq
    /* JADX INFO: renamed from: q */
    public void mo6672q(AdInfo adInfo) {
        x9kr(f100568d2ok, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.toq
    public void qrj(AdInfo adInfo, boolean reportToAdDataDepartment) {
        m28165l(f100574gvn7, adInfo.viewMonitorUrls, adInfo, null, reportToAdDataDepartment, null);
    }

    @Override // y9n.InterfaceC7779g
    /* JADX INFO: renamed from: r */
    public void mo6673r(Map<String, Object> params) {
    }

    @Override // y9n.toq
    /* JADX INFO: renamed from: s */
    public void mo6674s(AdInfo adInfo) {
        x9kr(f100592vyq, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    /* JADX INFO: renamed from: t */
    public void mo6675t(Map<String, Object> params) {
    }

    @Override // y9n.toq
    public void t8r(AdInfo adInfo, Map<String, String> extra, boolean reportToAdDataDepartment, Map<String, String> extraToAdDataDepartment) {
        m28165l(f100569d3, adInfo.clickMonitorUrls, adInfo, extra, reportToAdDataDepartment, extraToAdDataDepartment);
    }

    @Override // y9n.toq
    public void toq(AdInfo adInfo) {
        x9kr(f100594x9kr, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    public void wvg(Map<String, Object> params) {
    }

    @Override // y9n.toq
    public void x2(AdInfo adInfo) {
        x9kr(f45923l, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.toq
    /* JADX INFO: renamed from: y */
    public void mo6676y(AdInfo adInfo) {
        x9kr(f100585ncyb, adInfo.viewMonitorUrls, adInfo);
    }

    @Override // y9n.InterfaceC7779g
    /* JADX INFO: renamed from: z */
    public void mo6677z(Map<String, Object> params) {
    }

    @Override // y9n.InterfaceC7779g
    public void zurt(Map<String, Object> params) {
    }

    @Override // y9n.toq
    public void zy(AdInfo adInfo) {
        x9kr(f100589oc, adInfo.viewMonitorUrls, adInfo);
    }
}
