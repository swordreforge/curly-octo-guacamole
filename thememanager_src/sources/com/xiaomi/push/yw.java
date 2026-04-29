package com.xiaomi.push;

import android.util.Log;
import com.xiaomi.push.cyoe;

/* JADX INFO: loaded from: classes3.dex */
class yw {

    /* JADX INFO: renamed from: k */
    private static final boolean f34218k = Log.isLoggable("BCompressed", 3);

    /* JADX INFO: renamed from: k */
    static byte[] m22063k(o5 o5Var, byte[] bArr) {
        try {
            byte[] bArrM20708k = cyoe.C5855k.m20708k(bArr);
            if (f34218k) {
                com.xiaomi.channel.commonutils.logger.zy.m19293h("BCompressed", "decompress " + bArr.length + " to " + bArrM20708k.length + " for " + o5Var);
                if (o5Var.f33490n == 1) {
                    com.xiaomi.channel.commonutils.logger.zy.m19293h("BCompressed", "decompress not support upStream");
                }
            }
            return bArrM20708k;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.m19293h("BCompressed", "decompress error " + e2);
            return bArr;
        }
    }
}
