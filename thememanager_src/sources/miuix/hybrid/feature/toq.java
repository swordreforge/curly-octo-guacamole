package miuix.hybrid.feature;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1807g;
import java.util.Locale;
import java.util.Map;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f40209g = "romVersion";

    /* JADX INFO: renamed from: k */
    private static final String f40210k = "Device";

    /* JADX INFO: renamed from: n */
    private static final String f40211n = "model";

    /* JADX INFO: renamed from: p */
    private static final String f40212p = "deviceId";

    /* JADX INFO: renamed from: q */
    private static final String f40213q = "getDeviceInfo";

    /* JADX INFO: renamed from: s */
    private static final String f40214s = "region";

    /* JADX INFO: renamed from: y */
    private static final String f40215y = "language";

    /* JADX INFO: renamed from: k */
    private o1t m25783k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", Build.MODEL);
            jSONObject.put(f40209g, Build.VERSION.RELEASE);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("region", Locale.getDefault().getCountry());
            String strQrj = C1807g.qrj();
            if (TextUtils.isEmpty(strQrj)) {
                String strM7079p = C1807g.m7079p(bf2.toq.toq());
                if (strM7079p != null && strM7079p.length() > 1) {
                    jSONObject.put("deviceId", strM7079p);
                }
            } else {
                jSONObject.put("deviceId", strQrj);
            }
            return new o1t(jSONObject);
        } catch (JSONException e2) {
            Log.e(f40210k, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (f40213q.equals(request.m25920k())) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return f40213q.equals(request.m25920k()) ? m25783k() : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
