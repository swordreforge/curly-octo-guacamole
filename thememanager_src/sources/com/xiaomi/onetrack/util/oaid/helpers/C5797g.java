package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.Context;
import com.xiaomi.onetrack.util.C5804p;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.g */
/* JADX INFO: loaded from: classes3.dex */
public class C5797g {

    /* JADX INFO: renamed from: b */
    private static final String f32384b = "MsaSDKHelper";

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue<a> f32385a = new LinkedBlockingQueue<>(1);

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.g$a */
    private class a {

        /* JADX INFO: renamed from: a */
        Object f32386a;

        /* JADX INFO: renamed from: b */
        Method f32387b;

        /* JADX INFO: renamed from: c */
        Object[] f32388c;

        public a(Object obj, Method method, Object[] objArr) {
            this.f32386a = obj;
            this.f32387b = method;
            this.f32388c = objArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.g$b */
    public class b implements InvocationHandler {
        public b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                C5797g.this.f32385a.offer(C5797g.this.new a(obj, method, objArr), 1L, TimeUnit.SECONDS);
                return null;
            } catch (Exception e2) {
                try {
                    e2.printStackTrace();
                    return null;
                } catch (Exception e3) {
                    C5804p.m20342a(C5797g.f32384b, e3.getMessage());
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public String m20328a(Context context) {
        try {
            Class<?> cls = Class.forName("com.bun.miitmdid.core.MdidSdkHelper");
            Class<?> cls2 = Class.forName("com.bun.supplier.IIdentifierListener");
            cls.getDeclaredMethod("InitSdk", Context.class, Boolean.TYPE, cls2).invoke(cls, context, Boolean.TRUE, Proxy.newProxyInstance(context.getClassLoader(), new Class[]{cls2}, new b()));
            a aVarPoll = this.f32385a.poll(1L, TimeUnit.SECONDS);
            return aVarPoll != null ? aVarPoll.f32388c[1].getClass().getMethod("getOAID", new Class[0]).invoke(aVarPoll.f32388c[1], new Object[0]).toString() : "";
        } catch (Throwable th) {
            C5804p.m20342a(f32384b, th.getMessage());
            return "";
        }
    }
}
