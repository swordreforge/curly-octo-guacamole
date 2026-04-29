package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
class vyq implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ String f31430k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ hyr f31431n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ Context f31432q;

    vyq(String str, Context context, hyr hyrVar) {
        this.f31430k = str;
        this.f31432q = context;
        this.f31431n = hyrVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strSubstring;
        if (TextUtils.isEmpty(this.f31430k)) {
            return;
        }
        String[] strArrSplit = this.f31430k.split(C5658n.f73167eqxt);
        int length = strArrSplit.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                strSubstring = "";
                break;
            }
            String str = strArrSplit[i2];
            if (!TextUtils.isEmpty(str) && str.startsWith("token:")) {
                strSubstring = str.substring(str.indexOf(":") + 1);
                break;
            }
            i2++;
        }
        if (TextUtils.isEmpty(strSubstring)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : receive incorrect token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : receive correct token");
        uv6.o1t(this.f31432q, this.f31431n, strSubstring);
        uv6.m19564s(this.f31432q);
    }
}
