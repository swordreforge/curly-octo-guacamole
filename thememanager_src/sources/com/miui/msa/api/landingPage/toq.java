package com.miui.msa.api.landingPage;

import com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener;
import com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener;
import com.miui.systemAdSolution.landingPageV2.listener.IH5Listener;
import com.miui.systemAdSolution.landingPageV2.task.action.Action;
import com.miui.systemAdSolution.landingPageV2.task.action.DeeplinkAction;
import com.miui.systemAdSolution.landingPageV2.task.action.DownloadAction;
import com.miui.systemAdSolution.landingPageV2.task.action.H5Action;
import com.miui.systemAdSolution.landingPageV2.task.builder.C5340q;
import com.miui.systemAdSolution.landingPageV2.task.builder.zy.C5341k;
import com.miui.systemAdSolution.landingPageV2.task.builder.zy.toq;
import org.json.JSONObject;
import r25n.C7622k;

/* JADX INFO: compiled from: LandingPageHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f29731k = "adPassback";

    /* JADX INFO: renamed from: q */
    private static final String f29732q = "apkChannel";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72456toq = "configKey";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72457zy = "ref";

    /* JADX INFO: renamed from: k */
    public static Action.C5336k m18094k(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f29731k, str2);
            jSONObject.put(f72456toq, str);
            jSONObject.put(f29732q, str4);
            jSONObject.put("ref", str3);
            return (Action.C5336k) com.xiaomi.ad.entity.util.zy.zy(Action.C5336k.class, jSONObject.toString(), "buildAdTrackInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static H5Action m18095n(String str, boolean z2, IH5Listener iH5Listener) {
        return (H5Action) new C5340q().m18172g(str).zy(z2).m18171q(iH5Listener).toq(null).mo18170k();
    }

    /* JADX INFO: renamed from: q */
    public static DownloadAction m18096q(r25n.zy zyVar, r25n.toq toqVar, C7622k c7622k) {
        com.miui.systemAdSolution.landingPageV2.task.builder.zy zyVar2 = new com.miui.systemAdSolution.landingPageV2.task.builder.zy();
        return (DownloadAction) zyVar2.m18177n(zyVar2.new C5341k().zy(toqVar.toq()).f7l8(toqVar.m27928g()).toq(toqVar.m27929k()).f7l8(toqVar.m27928g()).m18180g(toqVar.m27930n()).m18182n(toqVar.m27932q()).m18181k()).m18179y(zyVar2.new toq().toq(c7622k.m27926k()).zy(c7622k.toq()).m18184k()).m18178s(zyVar.m27937n()).m18176g(zyVar.m27936k()).f7l8(!zyVar.zy()).zy(zyVar.toq()).toq(zyVar.m27935g()).m18171q(zyVar.m27939q()).mo18170k();
    }

    public static DeeplinkAction toq(String str, String str2, boolean z2, IDeeplinkListener iDeeplinkListener) {
        return (DeeplinkAction) new com.miui.systemAdSolution.landingPageV2.task.builder.toq().m18175n(str2).m18174g(str).toq(null).m18171q(iDeeplinkListener).zy(z2).mo18170k();
    }

    public static DownloadAction zy(String str, int i2, boolean z2, String str2, Action.C5336k c5336k, boolean z3, String str3, String str4, String str5, long j2, String str6, boolean z5, boolean z6, IDownloadListener iDownloadListener) {
        com.miui.systemAdSolution.landingPageV2.task.builder.zy zyVar = new com.miui.systemAdSolution.landingPageV2.task.builder.zy();
        return (DownloadAction) zyVar.m18178s(str).m18176g(i2).f7l8(z2).m18177n(zyVar.new C5341k().toq(str2).zy(str3).m18183q(str4).m18180g(str5).m18182n(j2).f7l8(str6).m18181k()).m18179y(zyVar.new toq().toq(z5).zy(z6).m18184k()).m18171q(iDownloadListener).toq(c5336k).zy(z3).mo18170k();
    }
}
