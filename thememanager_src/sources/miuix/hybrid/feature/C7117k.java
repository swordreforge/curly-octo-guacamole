package miuix.hybrid.feature;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.ni7;
import miuix.hybrid.o1t;
import miuix.hybrid.zurt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: miuix.hybrid.feature.k */
/* JADX INFO: compiled from: Barcode.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7117k implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f40175g = "type";

    /* JADX INFO: renamed from: h */
    private static final String f40176h = "type";

    /* JADX INFO: renamed from: i */
    private static final String f40177i = "result";

    /* JADX INFO: renamed from: k */
    private static final int f40178k = 1989682286;

    /* JADX INFO: renamed from: n */
    private static final String f40179n = "miui.intent.category.SYSAPP_TOOL";

    /* JADX INFO: renamed from: p */
    private static final String f40180p = "scan";

    /* JADX INFO: renamed from: q */
    private static final String f40181q = "android.intent.action.scanbarcode";

    /* JADX INFO: renamed from: s */
    private static final String f40182s = "isBackToThirdApp";

    /* JADX INFO: renamed from: y */
    private static final String f40183y = "result";

    /* JADX INFO: renamed from: miuix.hybrid.feature.k$k */
    /* JADX INFO: compiled from: Barcode.java */
    class k extends zurt {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ni7 f40184k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C7156z f87691toq;

        k(final ni7 val$nativeInterface, final C7156z val$request) {
            this.f40184k = val$nativeInterface;
            this.f87691toq = val$request;
        }

        @Override // miuix.hybrid.zurt
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == C7117k.f40178k) {
                this.f40184k.zy(this);
                this.f87691toq.toq().m25906k(resultCode == -1 ? new o1t(0, C7117k.this.zy(data)) : resultCode == 0 ? new o1t(100) : new o1t(200));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject zy(Intent data) {
        if (data == null) {
            return null;
        }
        int intExtra = data.getIntExtra("type", -1);
        String stringExtra = data.getStringExtra("result");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", intExtra);
            jSONObject.put("result", stringExtra);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), f40180p)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(final C7156z request) {
        if (!TextUtils.equals(request.m25920k(), f40180p)) {
            return new o1t(204, "no such action");
        }
        ni7 ni7VarZy = request.zy();
        Activity qVar = ni7VarZy.toq();
        Intent intent = new Intent(f40181q);
        intent.addCategory("miui.intent.category.SYSAPP_TOOL");
        intent.putExtra(f40182s, true);
        if (qVar.getPackageManager().resolveActivity(intent, 0) == null) {
            request.toq().m25906k(new o1t(204, "can't find barcode scanner activity"));
            return null;
        }
        ni7VarZy.m25907k(new k(ni7VarZy, request));
        qVar.startActivityForResult(intent, f40178k);
        return null;
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
