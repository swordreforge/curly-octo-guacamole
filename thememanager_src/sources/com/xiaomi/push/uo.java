package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class uo {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile uo f73691zy;

    /* JADX INFO: renamed from: k */
    private final Context f33989k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Map<String, ula6> f73692toq = new HashMap();

    private uo(Context context) {
        this.f33989k = context;
    }

    /* JADX INFO: renamed from: k */
    public static uo m21870k(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f73691zy == null) {
            synchronized (uo.class) {
                if (f73691zy == null) {
                    f73691zy = new uo(context);
                }
            }
        }
        return f73691zy;
    }

    /* JADX INFO: renamed from: n */
    public boolean m21871n(kl7m kl7mVar, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        }
        if (com.xiaomi.push.service.ek5k.m21579n(kl7mVar, false)) {
            return false;
        }
        if (TextUtils.isEmpty(kl7mVar.m21127d())) {
            kl7mVar.m21132f(com.xiaomi.push.service.ek5k.toq());
        }
        kl7mVar.m21134g(str);
        com.xiaomi.push.service.yz.m21802k(this.f33989k, kl7mVar);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m21872q(ula6 ula6Var, String str) {
        if (ula6Var == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.zy.jk("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            zy().put(str, ula6Var);
        }
    }

    ula6 toq() {
        ula6 ula6Var = this.f73692toq.get("UPLOADER_PUSH_CHANNEL");
        if (ula6Var != null) {
            return ula6Var;
        }
        ula6 ula6Var2 = this.f73692toq.get("UPLOADER_HTTP");
        if (ula6Var2 != null) {
            return ula6Var2;
        }
        return null;
    }

    Map<String, ula6> zy() {
        return this.f73692toq;
    }
}
