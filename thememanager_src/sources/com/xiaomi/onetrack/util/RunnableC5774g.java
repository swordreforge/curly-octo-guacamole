package com.xiaomi.onetrack.util;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.onetrack.p018g.C5765b;
import com.xiaomi.onetrack.util.oaid.C5783a;
import java.util.HashMap;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.g */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5774g implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f32305a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f32306b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f32307c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C5771d f32308d;

    RunnableC5774g(C5771d c5771d, String str, String str2, String str3) {
        this.f32308d = c5771d;
        this.f32305a = str;
        this.f32306b = str2;
        this.f32307c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            if (TextUtils.isEmpty(this.f32305a)) {
                return;
            }
            if (this.f32305a.contains("http://") || this.f32305a.contains("https://")) {
                str = this.f32305a + "/api/open/device/writeBack";
            } else {
                str = "https://" + this.f32305a + "/api/open/device/writeBack";
            }
            HashMap map = new HashMap();
            map.put("instanceId", C5782o.m20286a().m20292b());
            map.put("imei", DeviceUtil.m20118b(this.f32308d.f32300j));
            map.put("oaid", C5783a.m20293a().m20295a(this.f32308d.f32300j));
            map.put("projectId", this.f32306b);
            map.put("user", this.f32307c);
            String strM20107b = C5765b.m20107b(str, map, false);
            if (!TextUtils.isEmpty(strM20107b) && !"".equals(strM20107b)) {
                this.f32308d.m20252b(strM20107b);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString("hint", "注册信息失败，请检查是网络环境是否在内网");
            messageObtain.setData(bundle);
            this.f32308d.f32301k.sendMessage(messageObtain);
        } catch (Exception e2) {
            C5804p.m20347b(C5771d.f32291a, e2.getMessage());
        }
    }
}
