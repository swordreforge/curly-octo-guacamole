package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.C3548p;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes3.dex */
class fn3e implements InterfaceC5868i, InvocationHandler {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String[][] f73323kja0 = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* JADX INFO: renamed from: p */
    private Context f32933p;

    /* JADX INFO: renamed from: k */
    private Class f32931k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Class f73328toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Method f73330zy = null;

    /* JADX INFO: renamed from: q */
    private Method f32934q = null;

    /* JADX INFO: renamed from: n */
    private Method f32932n = null;

    /* JADX INFO: renamed from: g */
    private Method f32930g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Method f73324f7l8 = null;

    /* JADX INFO: renamed from: y */
    private Method f32936y = null;

    /* JADX INFO: renamed from: s */
    private Method f32935s = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final Object f73325ld6 = new Object();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private volatile int f73329x2 = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private volatile long f73327qrj = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private volatile C5863k f73326n7h = null;

    /* JADX INFO: renamed from: com.xiaomi.push.fn3e$k */
    private class C5863k {

        /* JADX INFO: renamed from: k */
        Boolean f32938k;

        /* JADX INFO: renamed from: n */
        String f32939n;

        /* JADX INFO: renamed from: q */
        String f32940q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f73331toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        String f73332zy;

        private C5863k() {
            this.f32938k = null;
            this.f73331toq = null;
            this.f73332zy = null;
            this.f32940q = null;
            this.f32939n = null;
        }

        /* JADX INFO: renamed from: k */
        boolean m20878k() {
            if (!TextUtils.isEmpty(this.f73331toq) || !TextUtils.isEmpty(this.f73332zy) || !TextUtils.isEmpty(this.f32940q) || !TextUtils.isEmpty(this.f32939n)) {
                this.f32938k = Boolean.TRUE;
            }
            return this.f32938k != null;
        }
    }

    public fn3e(Context context) {
        this.f32933p = context.getApplicationContext();
        m20874n(context);
        m20877y(context);
    }

    private static boolean f7l8(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    /* JADX INFO: renamed from: g */
    private void m20872g(String str) {
        if (this.f73326n7h != null) {
            return;
        }
        long j2 = this.f73327qrj;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j2);
        int i2 = this.f73329x2;
        if (jElapsedRealtime > C3548p.f65176gcp && i2 < 3) {
            synchronized (this.f73325ld6) {
                if (this.f73327qrj == j2 && this.f73329x2 == i2) {
                    m20876s("retry, current count is " + i2);
                    this.f73329x2 = this.f73329x2 + 1;
                    m20877y(this.f32933p);
                    j2 = this.f73327qrj;
                    jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j2);
                }
            }
        }
        if (this.f73326n7h != null || j2 < 0 || jElapsedRealtime > C3548p.f65176gcp || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f73325ld6) {
            if (this.f73326n7h == null) {
                try {
                    m20876s(str + " wait...");
                    this.f73325ld6.wait(C3548p.f65176gcp);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private static Class<?> m20873k(Context context, String str) {
        try {
            return wu.zy(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m20874n(Context context) {
        Class<?> clsM20873k = m20873k(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i2 = 0;
        while (true) {
            String[][] strArr = f73323kja0;
            if (i2 >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i2];
            Class<?> clsM20873k2 = m20873k(context, strArr2[0]);
            Class<?> clsM20873k3 = m20873k(context, strArr2[1]);
            if (clsM20873k2 != null && clsM20873k3 != null) {
                m20876s("found class in index " + i2);
                cls2 = clsM20873k3;
                cls = clsM20873k2;
                break;
            }
            i2++;
            cls2 = clsM20873k3;
            cls = clsM20873k2;
        }
        this.f32931k = clsM20873k;
        this.f73330zy = zy(clsM20873k, "InitSdk", Context.class, cls);
        this.f73328toq = cls;
        this.f32932n = zy(cls2, "getOAID", new Class[0]);
        this.f32936y = zy(cls2, "isSupported", new Class[0]);
        this.f32935s = zy(cls2, "shutDown", new Class[0]);
    }

    /* JADX INFO: renamed from: q */
    private void m20875q() {
        synchronized (this.f73325ld6) {
            try {
                this.f73325ld6.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m20876s(String str) {
        com.xiaomi.channel.commonutils.logger.zy.kja0("mdid:" + str);
    }

    private static <T> T toq(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T t2 = (T) method.invoke(obj, objArr);
            if (t2 != null) {
                return t2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m20877y(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = -jElapsedRealtime;
        Class cls = this.f73328toq;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                toq(this.f73330zy, this.f32931k.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.f73328toq}, this));
            } catch (Throwable th) {
                m20876s("call init sdk error:" + th);
                jElapsedRealtime = j2;
            }
        } else {
            jElapsedRealtime = j2;
        }
        this.f73327qrj = jElapsedRealtime;
    }

    private static Method zy(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public boolean mo20573a() {
        m20872g("isSupported");
        return this.f73326n7h != null && Boolean.TRUE.equals(this.f73326n7h.f32938k);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f73327qrj = SystemClock.elapsedRealtime();
        if (objArr != null) {
            C5863k c5863k = new C5863k();
            int length = objArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Object obj2 = objArr[i2];
                if (obj2 != null && !f7l8(obj2)) {
                    c5863k.f73332zy = (String) toq(this.f32932n, obj2, new Object[0]);
                    c5863k.f32938k = (Boolean) toq(this.f32936y, obj2, new Object[0]);
                    toq(this.f32935s, obj2, new Object[0]);
                    if (c5863k.m20878k()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("has get succ, check duplicate:");
                        sb.append(this.f73326n7h != null);
                        m20876s(sb.toString());
                        synchronized (fn3e.class) {
                            if (this.f73326n7h == null) {
                                this.f73326n7h = c5863k;
                            }
                        }
                    }
                }
                i2++;
            }
        }
        m20875q();
        return null;
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public String mo20572a() {
        m20872g("getOAID");
        if (this.f73326n7h == null) {
            return null;
        }
        return this.f73326n7h.f73332zy;
    }
}
