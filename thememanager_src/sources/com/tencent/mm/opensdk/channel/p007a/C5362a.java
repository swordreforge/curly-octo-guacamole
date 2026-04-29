package com.tencent.mm.opensdk.channel.p007a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.C5377d;
import com.tencent.mm.opensdk.utils.Log;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5362a {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: W */
        public String f29897W;

        /* JADX INFO: renamed from: X */
        public long f29898X;
        public String action;
        public Bundle bundle;
        public String content;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18238a(Context context, a aVar) {
        String str;
        if (context == null) {
            str = "send fail, invalid argument";
        } else {
            if (!C5377d.m18261h(aVar.action)) {
                String str2 = null;
                if (!C5377d.m18261h(aVar.f29897W)) {
                    str2 = aVar.f29897W + ".permission.MM_MESSAGE";
                }
                Intent intent = new Intent(aVar.action);
                Bundle bundle = aVar.bundle;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, 620823552);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, aVar.content);
                intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, aVar.f29898X);
                intent.putExtra(ConstantsAPI.CHECK_SUM, C5363b.m18239a(aVar.content, 620823552, packageName));
                context.sendBroadcast(intent, str2);
                Log.m18252d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
                return true;
            }
            str = "send fail, action is null";
        }
        Log.m18253e("MicroMsg.SDK.MMessage", str);
        return false;
    }
}
