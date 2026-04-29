package com.xiaomi.push.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.push.service.C5939t;
import com.xiaomi.push.uf;
import com.xiaomi.push.wu;

/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final SparseArray<C5939t.k<String, String, String>> f33913k = new jk(6);

    /* JADX INFO: renamed from: k */
    public static int m21767k(Context context, String str) {
        int i2;
        int i3 = 0;
        if (context == null || TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("context | packageName must not be null");
            return 0;
        }
        uf.toq toqVarM21858g = uf.m21858g(context, str, true);
        if (toqVarM21858g == uf.toq.ALLOWED) {
            i3 = 1;
        } else if (toqVarM21858g == uf.toq.NOT_ALLOWED) {
            i3 = 2;
        }
        if (C5939t.m21759h()) {
            Bundle bundleZy = zy(str);
            C5939t.k<String, String, String> kVar = C5939t.f33906s;
            if (bundleZy.containsKey(kVar.f73669zy)) {
                i3 |= bundleZy.getBoolean(kVar.f73669zy) ? 4 : 8;
            }
            C5939t.k<String, String, String> kVar2 = C5939t.f73664f7l8;
            if (bundleZy.containsKey(kVar2.f73669zy)) {
                i3 |= bundleZy.getBoolean(kVar2.f73669zy) ? 16 : 32;
            }
            C5939t.k<String, String, String> kVar3 = C5939t.f33907y;
            if (bundleZy.containsKey(kVar3.f73669zy)) {
                i3 |= bundleZy.getBoolean(kVar3.f73669zy) ? 64 : 128;
            }
            C5939t.k<String, String, String> kVar4 = C5939t.f33905q;
            if (bundleZy.containsKey(kVar4.f73669zy)) {
                i3 |= bundleZy.getBoolean(kVar4.f73669zy) ? 256 : 512;
            }
            C5939t.k<String, String, String> kVar5 = C5939t.f33903n;
            if (bundleZy.containsKey(kVar5.f73669zy)) {
                i3 |= bundleZy.getBoolean(kVar5.f73669zy) ? 1024 : 2048;
            }
            C5939t.k<String, String, String> kVar6 = C5939t.f33904p;
            if (bundleZy.containsKey(kVar6.f73669zy)) {
                return i3 | (bundleZy.getBoolean(kVar6.f73669zy) ? 4096 : 8192);
            }
            return i3;
        }
        int qVar = toq(str, 1);
        if (qVar == 1) {
            i3 |= 4;
        } else if (qVar == 0) {
            i3 |= 8;
        }
        int qVar2 = toq(str, 4);
        if (qVar2 == 1) {
            i3 |= 16;
        } else if (qVar2 == 0) {
            i3 |= 32;
        }
        int qVar3 = toq(str, 2);
        if (qVar3 == 1) {
            i3 |= 64;
        } else if (qVar3 == 0) {
            i3 |= 128;
        }
        int qVar4 = toq(str, 8);
        if (qVar4 == 1) {
            i3 |= 256;
        } else if (qVar4 == 0) {
            i3 |= 512;
        }
        int qVar5 = toq(str, 16);
        if (qVar5 == 1) {
            i3 |= 1024;
        } else if (qVar5 == 0) {
            i3 |= 2048;
        }
        int qVar6 = toq(str, 32);
        if (qVar6 == 1) {
            i2 = i3 | 4096;
        } else {
            if (qVar6 != 0) {
                return i3;
            }
            i2 = i3 | 8192;
        }
        return i2;
    }

    private static int toq(String str, int i2) {
        return C5939t.zy(wu.toq(), str, null, f33913k.get(i2));
    }

    private static Bundle zy(String str) {
        return C5939t.m21764q(wu.toq(), str, null);
    }
}
