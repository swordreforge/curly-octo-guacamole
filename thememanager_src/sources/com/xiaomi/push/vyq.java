package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class vyq implements Runnable {

    /* JADX INFO: renamed from: k */
    public static SharedPreferences f34054k;

    /* JADX INFO: renamed from: k */
    public static String m21926k() {
        return "dc_job_result_time_25";
    }

    /* JADX INFO: renamed from: q */
    private void m21927q(C5862f c5862f, hyr hyrVar, Exception exc) {
        HashMap map = new HashMap();
        String strM21600q = com.xiaomi.push.service.etdu.m21600q(wu.toq());
        if (!TextUtils.isEmpty(strM21600q)) {
            map.put("uuid", strM21600q);
        }
        map.put("appCount", Long.valueOf(c5862f.toq()));
        map.put("channels", Long.valueOf(c5862f.m20823n()));
        map.put("packCount", Long.valueOf(c5862f.f7l8()));
        map.put("totalSize", Long.valueOf(c5862f.m20825s()));
        map.put("isBatch", Integer.valueOf(c5862f.m20822k()));
        map.put("maxCallTime", Long.valueOf(hyrVar.m20964k()));
        map.put("minCallTime", Long.valueOf(hyrVar.zy()));
        map.put("callAvg", Long.valueOf(hyrVar.m20966q()));
        map.put("duration", Long.valueOf(hyrVar.m20965n()));
        if (exc != null) {
            map.put("exception", exc.toString());
        }
        ew.zy().mo20819k("app_switch_upload", map);
    }

    public static void toq(Context context) {
        if (context == null || !context.getPackageName().equals("com.xiaomi.xmsf")) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis % 86400000;
        if (f34054k == null) {
            f34054k = context.getSharedPreferences("mipush_extra", 0);
        }
        String strM21926k = m21926k();
        long j3 = f34054k.getLong(strM21926k, 0L);
        if (j3 <= 0) {
            Random random = new Random(jCurrentTimeMillis);
            f34054k.edit().putLong(strM21926k, jCurrentTimeMillis + ((long) random.nextInt(46800000)) + (86400000 - j2) + ((long) (random.nextInt(3) * 86400000))).apply();
            return;
        }
        long j4 = jCurrentTimeMillis - j3;
        if (j4 >= 0) {
            f34054k.edit().putLong(strM21926k, j3 + (((j4 / 259200000) + 1) * 259200000)).apply();
            new Thread(new vyq()).start();
        } else if (Math.abs(j4) > 259200000) {
            f34054k.edit().putLong(strM21926k, jCurrentTimeMillis + ((long) new Random(jCurrentTimeMillis).nextInt(46800000)) + (86400000 - j2)).apply();
        }
    }

    private void zy(Context context, uv6 uv6Var, C5862f c5862f) {
        kl7m kl7mVar = new kl7m();
        kl7mVar.m21126d("category_app_channel_info");
        kl7mVar.m21122c("app_channel_info");
        kl7mVar.m21118b(uv6Var.toString());
        kl7mVar.m21109a(false);
        kl7mVar.m21106a(1L);
        kl7mVar.m21107a("xmsf_channel");
        kl7mVar.m21117b(System.currentTimeMillis());
        kl7mVar.m21134g("com.xiaomi.xmsf");
        kl7mVar.m21129e("com.xiaomi.xmsf");
        kl7mVar.m21132f(com.xiaomi.push.service.ek5k.toq());
        com.xiaomi.push.service.yz.m21802k(context, kl7mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.xiaomi.push.uv6] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.xiaomi.push.uv6] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.xiaomi.push.uv6] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v3, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.xiaomi.push.lrht, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.xiaomi.push.vyq] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.xiaomi.push.uv6, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.vyq.run():void");
    }
}
