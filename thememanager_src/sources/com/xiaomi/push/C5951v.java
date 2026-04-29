package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.xiaomi.push.v */
/* JADX INFO: loaded from: classes3.dex */
public class C5951v {

    /* JADX INFO: renamed from: k */
    private static SimpleDateFormat f34011k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f73695toq;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f34011k = simpleDateFormat;
        f73695toq = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: k */
    public static kl7m m21889k(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        kl7m kl7mVar = new kl7m();
        kl7mVar.m21126d("category_push_stat");
        kl7mVar.m21107a("push_sdk_stat_channel");
        kl7mVar.m21106a(1L);
        kl7mVar.m21118b(str);
        kl7mVar.m21109a(true);
        kl7mVar.m21117b(System.currentTimeMillis());
        kl7mVar.m21134g(bf2.toq(context).m20647q());
        kl7mVar.m21129e("com.xiaomi.xmsf");
        kl7mVar.m21132f("");
        kl7mVar.m21122c("push_stat");
        return kl7mVar;
    }
}
