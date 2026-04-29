package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class fu4 implements InterfaceC5868i {

    /* JADX INFO: renamed from: k */
    private Context f32947k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Class<?> f73338toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Object f73339zy;

    /* JADX INFO: renamed from: q */
    private Method f32949q = null;

    /* JADX INFO: renamed from: n */
    private Method f32948n = null;

    /* JADX INFO: renamed from: g */
    private Method f32946g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Method f73337f7l8 = null;

    public fu4(Context context) {
        this.f32947k = context;
        toq(context);
    }

    /* JADX INFO: renamed from: k */
    private String m20882k(Context context, Method method) {
        Object obj = this.f73339zy;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("miui invoke error", e2);
            return null;
        }
    }

    private void toq(Context context) {
        try {
            Class<?> clsZy = wu.zy(context, "com.android.id.impl.IdProviderImpl");
            this.f73338toq = clsZy;
            this.f73339zy = clsZy.newInstance();
            this.f32948n = this.f73338toq.getMethod("getOAID", Context.class);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("miui load class error", e2);
        }
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public boolean mo20573a() {
        return (this.f73338toq == null || this.f73339zy == null) ? false : true;
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public String mo20572a() {
        return m20882k(this.f32947k, this.f32948n);
    }
}
