package ra;

import org.json.JSONObject;

/* JADX INFO: compiled from: OnlinePreference.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    public String f44127k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public String f94674toq;

    /* JADX INFO: renamed from: k */
    public static toq m27942k(JSONObject jSONObject) {
        toq toqVar = new toq();
        toqVar.f94674toq = jSONObject.optString("diagnosisDomain", null);
        toqVar.f44127k = jSONObject.optString("dataCenterZone", null);
        return toqVar;
    }
}
