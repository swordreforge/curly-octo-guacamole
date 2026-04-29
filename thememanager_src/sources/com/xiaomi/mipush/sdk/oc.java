package com.xiaomi.mipush.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class oc extends Handler {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ d3 f31423k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    oc(d3 d3Var, Looper looper) {
        super(looper);
        this.f31423k = d3Var;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        if (message.what != 19) {
            return;
        }
        String str = (String) message.obj;
        int i2 = message.arg1;
        synchronized (o1t.class) {
            if (o1t.toq(this.f31423k.f73132toq).m19533g(str)) {
                if (o1t.toq(this.f31423k.f73132toq).m19534k(str) < 10) {
                    String string = message.getData() != null ? message.getData().getString("third_sync_reason") : "";
                    dd ddVar = dd.DISABLE_PUSH;
                    if (ddVar.ordinal() == i2 && "syncing".equals(o1t.toq(this.f31423k.f73132toq).zy(ddVar))) {
                        this.f31423k.fti(str, ddVar, true, null);
                    } else {
                        dd ddVar2 = dd.ENABLE_PUSH;
                        if (ddVar2.ordinal() == i2 && "syncing".equals(o1t.toq(this.f31423k.f73132toq).zy(ddVar2))) {
                            this.f31423k.fti(str, ddVar2, true, null);
                        } else {
                            dd ddVar3 = dd.UPLOAD_HUAWEI_TOKEN;
                            if (ddVar3.ordinal() == i2 && "syncing".equals(o1t.toq(this.f31423k.f73132toq).zy(ddVar3))) {
                                HashMap<String, String> mapM19565y = uv6.m19565y(this.f31423k.f73132toq, hyr.ASSEMBLE_PUSH_HUAWEI);
                                mapM19565y.put("third_sync_reason", string);
                                this.f31423k.fti(str, ddVar3, false, mapM19565y);
                            } else {
                                dd ddVar4 = dd.UPLOAD_FCM_TOKEN;
                                if (ddVar4.ordinal() == i2 && "syncing".equals(o1t.toq(this.f31423k.f73132toq).zy(ddVar4))) {
                                    d3 d3Var = this.f31423k;
                                    d3Var.fti(str, ddVar4, false, uv6.m19565y(d3Var.f73132toq, hyr.ASSEMBLE_PUSH_FCM));
                                } else {
                                    dd ddVar5 = dd.UPLOAD_COS_TOKEN;
                                    if (ddVar5.ordinal() == i2 && "syncing".equals(o1t.toq(this.f31423k.f73132toq).zy(ddVar5))) {
                                        HashMap<String, String> mapM19565y2 = uv6.m19565y(this.f31423k.f73132toq, hyr.ASSEMBLE_PUSH_COS);
                                        mapM19565y2.put("third_sync_reason", string);
                                        this.f31423k.fti(str, ddVar5, false, mapM19565y2);
                                    } else {
                                        dd ddVar6 = dd.UPLOAD_FTOS_TOKEN;
                                        if (ddVar6.ordinal() == i2 && "syncing".equals(o1t.toq(this.f31423k.f73132toq).zy(ddVar6))) {
                                            HashMap<String, String> mapM19565y3 = uv6.m19565y(this.f31423k.f73132toq, hyr.ASSEMBLE_PUSH_FTOS);
                                            mapM19565y3.put("third_sync_reason", string);
                                            this.f31423k.fti(str, ddVar6, false, mapM19565y3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    o1t.toq(this.f31423k.f73132toq).f7l8(str);
                } else {
                    o1t.toq(this.f31423k.f73132toq).m19537y(str);
                }
            }
        }
    }
}
