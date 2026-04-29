package com.android.thememanager.share;

import android.util.ArrayMap;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.kja0;
import java.util.Map;
import kotlin.text.eqxt;

/* JADX INFO: renamed from: com.android.thememanager.share.s */
/* JADX INFO: compiled from: ShareStatisticsUploadHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2708s implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    public static final String f16055g = "detail";

    /* JADX INFO: renamed from: n */
    public static final String f16056n = "subject";

    /* JADX INFO: renamed from: k */
    private final String f16057k;

    /* JADX INFO: renamed from: q */
    private final String f16058q;

    public C2708s(String pageId, String trackId) {
        this.f16057k = pageId;
        this.f16058q = trackId;
    }

    private void zy(ArrayMap<String, Object> extras) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry<String, Object> entry : extras.entrySet()) {
            if (!z2) {
                sb.append(eqxt.f36674q);
            }
            z2 = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        kja0.m6641s("SHARE", this.f16057k, this.f16058q, sb.toString());
        C1708s.f7l8().ld6().o1t(C1706p.n7h(this.f16057k, this.f16058q, extras));
    }

    /* JADX INFO: renamed from: k */
    public void m9461k(String from) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>(1);
        arrayMap.put("type", "share_button");
        arrayMap.put("entryType", from);
        zy(arrayMap);
    }

    /* JADX INFO: renamed from: q */
    public void m9462q(int pos, ArrayMap<String, Object> extras) {
        extras.put("position", Integer.valueOf(pos));
        zy(extras);
    }

    public void toq() {
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.c4my, null, ""));
    }
}
