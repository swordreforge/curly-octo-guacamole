package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class d1ts {

    /* JADX INFO: renamed from: k */
    private static boolean f32792k = false;

    /* JADX INFO: renamed from: com.xiaomi.push.d1ts$k */
    static class RunnableC5858k implements Runnable {

        /* JADX INFO: renamed from: k */
        private Context f32793k;

        /* JADX INFO: renamed from: q */
        private ula6 f32794q;

        public RunnableC5858k(Context context, ula6 ula6Var) {
            this.f32794q = ula6Var;
            this.f32793k = context;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            d1ts.m20712g(this.f32793k, this.f32794q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m20712g(android.content.Context r11, com.xiaomi.push.ula6 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.d1ts.m20712g(android.content.Context, com.xiaomi.push.ula6):void");
    }

    /* JADX INFO: renamed from: k */
    private static void m20713k(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: q */
    private static void m20715q(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 4).edit();
        editorEdit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        editorEdit.commit();
    }

    public static void toq(Context context, ula6 ula6Var) {
        C5889p.toq(context).f7l8(new RunnableC5858k(context, ula6Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        com.xiaomi.channel.commonutils.logger.zy.jk("TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zy(android.content.Context r12, com.xiaomi.push.ula6 r13, java.io.File r14, byte[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.d1ts.zy(android.content.Context, com.xiaomi.push.ula6, java.io.File, byte[]):void");
    }
}
