package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class i1an {
    /* JADX INFO: renamed from: k */
    private static HashMap<String, ArrayList<kl7m>> m20967k(Context context, List<kl7m> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<kl7m>> map = new HashMap<>();
        for (kl7m kl7mVar : list) {
            m20968q(context, kl7mVar);
            ArrayList<kl7m> arrayList = map.get(kl7mVar.m21123c());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(kl7mVar.m21123c(), arrayList);
            }
            arrayList.add(kl7mVar);
        }
        return map;
    }

    /* JADX INFO: renamed from: q */
    private static void m20968q(Context context, kl7m kl7mVar) {
        if (kl7mVar.f33166a) {
            kl7mVar.m21107a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(kl7mVar.m21127d())) {
            kl7mVar.m21132f(com.xiaomi.push.service.ek5k.toq());
        }
        kl7mVar.m21117b(System.currentTimeMillis());
        if (TextUtils.isEmpty(kl7mVar.m21130e())) {
            kl7mVar.m21129e(context.getPackageName());
        }
        if (TextUtils.isEmpty(kl7mVar.m21123c())) {
            kl7mVar.m21129e(kl7mVar.m21130e());
        }
    }

    private static void toq(Context context, ula6 ula6Var, HashMap<String, ArrayList<kl7m>> map) {
        for (Map.Entry<String, ArrayList<kl7m>> entry : map.entrySet()) {
            try {
                ArrayList<kl7m> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    ula6Var.mo21747k(value, value.get(0).m21130e(), entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void zy(Context context, ula6 ula6Var, List<kl7m> list) {
        HashMap<String, ArrayList<kl7m>> mapM20967k = m20967k(context, list);
        if (mapM20967k != null && mapM20967k.size() != 0) {
            toq(context, ula6Var, mapM20967k);
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
    }
}
