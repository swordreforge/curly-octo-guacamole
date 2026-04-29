package com.xiaomi.passport.utils;

import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.account.C5504y;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5550t;
import com.xiaomi.accountsdk.request.n7h;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.lvui;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.passport.utils.q */
/* JADX INFO: compiled from: PassportOnlinePreference.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5848q {

    /* JADX INFO: renamed from: k */
    private static final String f32633k = "PassportOnlinePreference";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final String f73255toq = C5504y.f72850toq + "/pass/preference";

    /* JADX INFO: renamed from: k */
    public static ra.toq m20547k() throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        wvg.C5555y c5555yM19001s = C5550t.m19001s(lvui.m19106k(f73255toq), null, null, true);
        if (c5555yM19001s == null) {
            throw new n7h("result content is null");
        }
        String strM18811v = C5502s.m18811v(c5555yM19001s);
        try {
            return ra.toq.m27942k(new JSONObject(strM18811v));
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f32633k, "realBody", e2);
            throw new n7h(strM18811v);
        }
    }
}
