package com.android.thememanager.basemodule.analysis;

import android.text.TextUtils;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.network.theme.AbstractC1770g;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1807g;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: compiled from: V9StatisticsUpload.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h {

    /* JADX INFO: renamed from: n */
    private static volatile n7h f9744n = null;

    /* JADX INFO: renamed from: q */
    private static final Object f9745q = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57483zy = "V9StatisticsUpload";

    /* JADX INFO: renamed from: k */
    private InterfaceC1707q f9746k = (InterfaceC1707q) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(InterfaceC1707q.class);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private AbstractC1770g f57484toq = new C1705k();

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.n7h$k */
    /* JADX INFO: compiled from: V9StatisticsUpload.java */
    class C1705k extends AbstractC1770g {
        C1705k() {
        }
    }

    private n7h() {
    }

    /* JADX INFO: renamed from: k */
    public static n7h m6648k() {
        if (f9744n == null) {
            synchronized (f9745q) {
                if (f9744n == null) {
                    f9744n = new n7h();
                }
            }
        }
        return f9744n;
    }

    public void toq(String actionType, String pageId, HashMap<String, Long> trackIdMap, String userId, String extra) {
        if (C1807g.lvui() || TextUtils.isEmpty(actionType) || TextUtils.isEmpty(pageId) || trackIdMap.isEmpty() || !C1781k.n7h()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = trackIdMap.keySet().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        if (C1724k.m6723p().ld6().close_self_stats) {
            return;
        }
        this.f9746k.toq(actionType, pageId, jSONArray.toString(), userId, extra).mo27954p(this.f57484toq);
    }
}
