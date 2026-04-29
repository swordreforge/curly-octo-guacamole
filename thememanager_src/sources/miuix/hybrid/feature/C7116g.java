package miuix.hybrid.feature;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import miuix.hybrid.C7148k;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.ni7;
import miuix.hybrid.o1t;
import miuix.hybrid.zurt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: miuix.hybrid.feature.g */
/* JADX INFO: compiled from: Share.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7116g implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f40170g = "data";

    /* JADX INFO: renamed from: k */
    private static final String f40171k = "HybridShare";

    /* JADX INFO: renamed from: n */
    private static final String f40172n = "type";

    /* JADX INFO: renamed from: q */
    private static final String f40173q = "send";

    /* JADX INFO: renamed from: miuix.hybrid.feature.g$k */
    /* JADX INFO: compiled from: Share.java */
    class k extends zurt {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ni7 f40174k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C7148k f87689toq;

        k(final ni7 val$nativeInterface, final C7148k val$cb) {
            this.f40174k = val$nativeInterface;
            this.f87689toq = val$cb;
        }

        @Override // miuix.hybrid.zurt
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            this.f40174k.zy(this);
            this.f87689toq.m25906k(resultCode == -1 ? new o1t(0, "success") : resultCode == 0 ? new o1t(100, "cancel") : new o1t(200));
        }
    }

    /* JADX INFO: renamed from: k */
    private o1t m25775k(final C7156z request) {
        String string;
        String string2;
        ni7 ni7VarZy = request.zy();
        Activity qVar = ni7VarZy.toq();
        C7148k qVar2 = request.toq();
        ni7VarZy.m25907k(new k(ni7VarZy, qVar2));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        String strM25921n = request.m25921n();
        try {
            JSONObject jSONObject = new JSONObject(strM25921n);
            string = jSONObject.getString("type");
            string2 = jSONObject.getString("data");
        } catch (JSONException unused) {
            Log.i(f40171k, "invalid JSON string:" + strM25921n);
            qVar2.m25906k(new o1t(200, "invalid data to share"));
        }
        if (string != null && string2 != null) {
            intent.setType(string);
            if (string.startsWith("text/")) {
                intent.putExtra("android.intent.extra.TEXT", string2);
            } else {
                intent.putExtra("android.intent.extra.STREAM", string2);
            }
            qVar.startActivityForResult(intent, 1);
            return null;
        }
        qVar2.m25906k(new o1t(200, "no data to share"));
        return null;
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        return n7h.EnumC7150k.CALLBACK;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return "send".equals(request.m25920k()) ? m25775k(request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
