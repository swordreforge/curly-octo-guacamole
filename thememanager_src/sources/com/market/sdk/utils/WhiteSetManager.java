package com.market.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.market.sdk.C4979n;
import com.market.sdk.IMarketService;
import com.market.sdk.ni7;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class WhiteSetManager {

    /* JADX INFO: renamed from: k */
    private static final String f28184k = "pref_white_set";

    /* JADX INFO: renamed from: q */
    private static final String f28185q = "defaultService";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f68981toq = "_pkg";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f68982zy = "_sig";

    /* JADX INFO: renamed from: k */
    private static String m17403k(String str) {
        return str + f68981toq;
    }

    /* JADX INFO: renamed from: n */
    private static void m17404n(Context context) {
        String strZy = zy();
        if (TextUtils.isEmpty(strZy)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZy);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (true) {
                if (!itKeys.hasNext()) {
                    break;
                }
                String next = itKeys.next();
                JSONArray jSONArray = jSONObject.getJSONObject(next).getJSONArray("list");
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    String string = jSONObject2.getString("packageName");
                    String string2 = jSONObject2.getString(C4979n.f68907f7l8);
                    hashSet.add(string);
                    hashSet2.add(string2);
                }
                map.put(next, hashSet);
                map2.put(next, hashSet2);
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f28184k, 0).edit();
            for (String str : map.keySet()) {
                Set<String> set = (Set) map.get(str);
                Set<String> set2 = (Set) map2.get(str);
                editorEdit.putStringSet(m17403k(str), set);
                editorEdit.putStringSet(toq(str), set2);
            }
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m17405q(Context context, String str, String str2) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strM17496k = x2.m17496k(context, str);
        if (TextUtils.isEmpty(strM17496k)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = f28185q;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f28184k, 0);
        Set<String> stringSet = sharedPreferences.getStringSet(m17403k(str2), null);
        Set<String> stringSet2 = sharedPreferences.getStringSet(toq(str2), null);
        if (stringSet != null && stringSet.contains(str) && stringSet2 != null && stringSet2.contains(strM17496k)) {
            z2 = true;
        }
        m17404n(context);
        return z2;
    }

    private static String toq(String str) {
        return str + f68982zy;
    }

    public static String zy() {
        final com.market.sdk.compat.toq toqVar = new com.market.sdk.compat.toq();
        new ni7<Void>() { // from class: com.market.sdk.utils.WhiteSetManager.1
            @Override // com.market.sdk.ni7
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public Void mo17245g(IMarketService iMarketService) throws RemoteException {
                try {
                    iMarketService.getWhiteSetV2(new ResultReceiver(null) { // from class: com.market.sdk.utils.WhiteSetManager.1.1
                        @Override // android.os.ResultReceiver
                        public void onReceiveResult(int i2, Bundle bundle) {
                            toqVar.set(bundle.getString("whiteSet"));
                        }
                    });
                } catch (RemoteException unused) {
                }
                return null;
            }
        }.m17337s();
        return (String) toqVar.get();
    }
}
