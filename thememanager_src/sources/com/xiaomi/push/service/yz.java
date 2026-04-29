package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.C5890q;
import com.xiaomi.push.cn02;
import com.xiaomi.push.cr3;
import com.xiaomi.push.f26p;
import com.xiaomi.push.kl7m;
import com.xiaomi.push.qla;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class yz {

    /* JADX INFO: renamed from: k */
    public static final Object f33938k = new Object();

    /* JADX INFO: renamed from: k */
    public static void m21802k(Context context, kl7m kl7mVar) {
        if (ek5k.m21577g(kl7mVar.m21130e())) {
            C5889p.toq(context).f7l8(new y9n(context, kl7mVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: n */
    public static void m21803n(Context context, kl7m kl7mVar) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        ?? qVar = toq(context);
        try {
            try {
                byte[] bArrZy = cn02.zy(qVar, qla.m21397g(kl7mVar));
                if (bArrZy == null || bArrZy.length < 1) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("TinyData write to cache file failed case encryption fail item:" + kl7mVar.m21127d() + "  ts:" + System.currentTimeMillis());
                } else {
                    if (bArrZy.length <= 30720) {
                        BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                        try {
                            bufferedOutputStream3.write(C5890q.toq(bArrZy.length));
                            bufferedOutputStream3.write(bArrZy);
                            bufferedOutputStream3.flush();
                            f26p.toq(null);
                            f26p.toq(bufferedOutputStream3);
                            return;
                        } catch (IOException e2) {
                            bufferedOutputStream2 = bufferedOutputStream3;
                            e = e2;
                            com.xiaomi.channel.commonutils.logger.zy.cdj("TinyData write to cache file failed cause io exception item:" + kl7mVar.m21127d(), e);
                            qVar = bufferedOutputStream2;
                            f26p.toq(null);
                            f26p.toq(qVar);
                            return;
                        } catch (Exception e3) {
                            bufferedOutputStream = bufferedOutputStream3;
                            e = e3;
                            com.xiaomi.channel.commonutils.logger.zy.cdj("TinyData write to cache file  failed item:" + kl7mVar.m21127d(), e);
                            qVar = bufferedOutputStream;
                            f26p.toq(null);
                            f26p.toq(qVar);
                            return;
                        } catch (Throwable th) {
                            qVar = bufferedOutputStream3;
                            th = th;
                            f26p.toq(null);
                            f26p.toq(qVar);
                            throw th;
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.zy.kja0("TinyData write to cache file failed case too much data content item:" + kl7mVar.m21127d() + "  ts:" + System.currentTimeMillis());
                }
                f26p.toq(null);
                f26p.toq(null);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            bufferedOutputStream2 = null;
        } catch (Exception e6) {
            e = e6;
            bufferedOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            qVar = 0;
        }
    }

    public static byte[] toq(Context context) {
        String strM20698q = cr3.toq(context).m20698q("mipush", "td_key", "");
        if (TextUtils.isEmpty(strM20698q)) {
            strM20698q = com.xiaomi.push.n5r1.m21302k(20);
            cr3.toq(context).m20697n("mipush", "td_key", strM20698q);
        }
        return zy(strM20698q);
    }

    private static byte[] zy(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(com.xiaomi.push.x9kr.toq(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }
}
