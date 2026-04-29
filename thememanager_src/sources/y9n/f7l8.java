package y9n;

import android.util.Log;
import com.android.thememanager.basemodule.analysis.C1697g;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.ServiceQualityEvent;
import java.util.Map;

/* JADX INFO: compiled from: OneTrackManager.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final String f45915k = "f7l8";

    /* JADX INFO: renamed from: q */
    private static OneTrack f45916q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f100562toq = "11800";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f100563zy = "31000000893";

    /* JADX INFO: renamed from: k */
    public static void m28162k(InterfaceC7781n provider) {
        if (f45916q == null) {
            f45916q = OneTrack.createInstance(bf2.toq.toq(), new Configuration.Builder().setAppId(f100562toq).setAdEventAppId(f100563zy).setChannel(provider.zy()).setUseCustomPrivacyPolicy(true).setMode(OneTrack.Mode.APP).setExceptionCatcherEnable(true).setAutoTrackActivityAction(true).build());
            Log.i(f45915k, "OneTrack successfully initialized");
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m28163n(C1697g params) {
        if (f45916q == null) {
            Log.w(f45915k, "sOneTrack is not initialized");
            return;
        }
        if (params != null && params.n7h()) {
            f45916q.trackServiceQualityEvent(new ServiceQualityEvent.Builder().setScheme(params.x2()).setHost(params.m6618n()).setPath(params.m6616g()).setPort(Integer.valueOf(params.f7l8())).setResponseCode(Integer.valueOf(params.m6621s())).setResultType(params.m6619p() == 1 ? ServiceQualityEvent.ResultType.FAILED : params.m6619p() == 2 ? ServiceQualityEvent.ResultType.TIMEOUT : ServiceQualityEvent.ResultType.SUCCESS).setDuration(Long.valueOf(params.m6617k())).build());
            return;
        }
        String str = f45915k;
        StringBuilder sb = new StringBuilder();
        sb.append("OneTrackPlugin:trackNet param is not valid. param = ");
        sb.append(params != null ? params.toString() : "null");
        Log.e(str, sb.toString());
    }

    /* JADX INFO: renamed from: q */
    public static void m28164q(String eventName, Map<String, Object> params) {
        if (p029m.zy.m24738k(eventName, C7780k.f100574gvn7) || p029m.zy.m24738k(eventName, C7780k.f100569d3) || p029m.zy.m24738k(eventName, "EXPOSE")) {
            eventName = "T_" + eventName;
        }
        OneTrack oneTrack = f45916q;
        if (oneTrack == null) {
            Log.w(f45915k, "sOneTrack is not initialized");
        } else {
            oneTrack.track(eventName, params);
        }
    }

    public static void toq(String eventName, Map<String, Object> params) {
        OneTrack oneTrack = f45916q;
        if (oneTrack == null) {
            Log.w(f45915k, "sOneTrack is not initialized");
        } else {
            oneTrack.adTrack(eventName, params);
        }
    }

    public static void zy(String eventName, String eventGroup, Map<String, Object> params) {
        m28164q(eventName, params);
    }
}
