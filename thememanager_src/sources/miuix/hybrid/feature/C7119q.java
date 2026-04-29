package miuix.hybrid.feature;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.ni7;
import miuix.hybrid.o1t;
import miuix.hybrid.zurt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: miuix.hybrid.feature.q */
/* JADX INFO: compiled from: Mipay.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7119q implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f40197g = "order";

    /* JADX INFO: renamed from: h */
    private static final String f40198h = "result";

    /* JADX INFO: renamed from: i */
    private static final int f40199i = -1;

    /* JADX INFO: renamed from: k */
    private static final int f40200k = 20140424;

    /* JADX INFO: renamed from: n */
    private static final String f40201n = "orderInfo";

    /* JADX INFO: renamed from: p */
    private static final String f40202p = "message";

    /* JADX INFO: renamed from: q */
    private static final String f40203q = "pay";

    /* JADX INFO: renamed from: s */
    private static final String f40204s = "code";

    /* JADX INFO: renamed from: t */
    private static final String f40205t = "com.mipay.wallet";

    /* JADX INFO: renamed from: y */
    private static final String f40206y = "extra";

    /* JADX INFO: renamed from: z */
    private static final String f40207z = "com.xiaomi.action.MIPAY_PAY_ORDER";

    /* JADX INFO: renamed from: miuix.hybrid.feature.q$k */
    /* JADX INFO: compiled from: Mipay.java */
    class k extends zurt {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ni7 f40208k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C7156z f87694toq;

        k(final ni7 val$nativeInterface, final C7156z val$request) {
            this.f40208k = val$nativeInterface;
            this.f87694toq = val$request;
        }

        @Override // miuix.hybrid.zurt
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == C7119q.f40200k) {
                this.f40208k.zy(this);
                this.f87694toq.toq().m25906k(resultCode == -1 ? new o1t(0, C7119q.this.toq(data)) : resultCode == 0 ? new o1t(100, C7119q.this.toq(data)) : new o1t(200));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject toq(Intent data) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", data.getIntExtra("code", -1));
            String stringExtra = data.getStringExtra("message");
            if (!TextUtils.isEmpty(stringExtra)) {
                jSONObject.put("message", stringExtra);
            }
            String stringExtra2 = data.getStringExtra("result");
            if (!TextUtils.isEmpty(stringExtra2)) {
                jSONObject.put("result", stringExtra2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private o1t zy(final Activity activity, final String order, final Bundle extra) {
        if (TextUtils.isEmpty(order)) {
            return new o1t(204, "order cannot be empty");
        }
        Intent intent = new Intent(f40207z);
        intent.setPackage(f40205t);
        if (activity.getPackageManager().resolveActivity(intent, 0) == null) {
            return new o1t(204, "mipay feature not available");
        }
        intent.putExtra("order", order);
        intent.putExtra("extra", extra);
        activity.startActivityForResult(intent, f40200k);
        return null;
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), f40203q)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(final C7156z request) {
        String string;
        if (!TextUtils.equals(request.m25920k(), f40203q)) {
            return new o1t(204, "no such action");
        }
        ni7 ni7VarZy = request.zy();
        Activity qVar = ni7VarZy.toq();
        ni7VarZy.m25907k(new k(ni7VarZy, request));
        try {
            string = new JSONObject(request.m25921n()).getString("orderInfo");
        } catch (JSONException e2) {
            e2.printStackTrace();
            string = null;
        }
        return zy(qVar, string, null);
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
