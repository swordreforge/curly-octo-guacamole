package com.miui.msa.api;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import m2t.C6794k;
import org.json.JSONObject;

/* JADX INFO: compiled from: RemoteWebViewHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f29746k = "RemoteWebViewHelper";

    /* JADX INFO: renamed from: k */
    private static String m18115k(String str, String str2, String str3, String str4, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mainTitle", str);
            jSONObject.put("mainJumpUrl", str2);
            jSONObject.put("configKey", str3);
            jSONObject.put("adPassback", str4);
            jSONObject.put("statusBarColor", i2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void toq(Context context, String str, String str2, String str3, String str4) {
        zy(context, str, str2, str3, str4, Color.parseColor("#cccccc"));
    }

    public static void zy(Context context, String str, String str2, String str3, String str4, int i2) {
        try {
            Intent intent = new Intent("miui.intent.action.ad.WEBVIEW");
            Bundle bundle = new Bundle();
            bundle.putString("extraData", m18115k(str, str2, str3, str4, i2));
            intent.putExtras(bundle);
            intent.setPackage(C6794k.f38036k);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            Log.e(f29746k, "startSystemWebView e : ", e2);
        }
    }
}
