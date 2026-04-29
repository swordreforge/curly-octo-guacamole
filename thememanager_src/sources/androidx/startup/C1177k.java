package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.zy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import zy.lvui;

/* JADX INFO: renamed from: androidx.startup.k */
/* JADX INFO: compiled from: AppInitializer.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1177k {

    /* JADX INFO: renamed from: g */
    private static final Object f6360g = new Object();

    /* JADX INFO: renamed from: n */
    private static volatile C1177k f6361n = null;

    /* JADX INFO: renamed from: q */
    private static final String f6362q = "Startup";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    final Context f52467zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    final Set<Class<? extends toq<?>>> f52466toq = new HashSet();

    /* JADX INFO: renamed from: k */
    @lvui
    final Map<Class<?>, Object> f6363k = new HashMap();

    C1177k(@lvui Context context) {
        this.f52467zy = context.getApplicationContext();
    }

    @lvui
    public static C1177k zy(@lvui Context context) {
        if (f6361n == null) {
            synchronized (f6360g) {
                if (f6361n == null) {
                    f6361n = new C1177k(context);
                }
            }
        }
        return f6361n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    void m5285k() {
        try {
            try {
                androidx.tracing.toq.zy(f6362q);
                Bundle bundle = this.f52467zy.getPackageManager().getProviderInfo(new ComponentName(this.f52467zy.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f52467zy.getString(zy.C1180k.f6365k);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (toq.class.isAssignableFrom(cls)) {
                                this.f52466toq.add((Class<? extends toq<?>>) cls);
                                toq(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                androidx.tracing.toq.m5290g();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e2) {
            throw new C1179q(e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m5286n(@lvui Class<? extends toq<?>> cls) {
        return this.f52466toq.contains(cls);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public <T> T m5287q(@lvui Class<? extends toq<T>> cls) {
        return (T) toq(cls, new HashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: all -> 0x008c, TRY_ENTER, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:29:0x0077, B:30:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:40:0x0009, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:29:0x0077, B:30:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:40:0x0009, outer: #0, inners: #1 }] */
    @zy.lvui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    <T> T toq(@zy.lvui java.lang.Class<? extends androidx.startup.toq<?>> r6, @zy.lvui java.util.Set<java.lang.Class<?>> r7) {
        /*
            r5 = this;
            java.lang.Object r0 = androidx.startup.C1177k.f6360g
            monitor-enter(r0)
            boolean r1 = androidx.tracing.toq.m5296y()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L10
            java.lang.String r1 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L8c
            androidx.tracing.toq.zy(r1)     // Catch: java.lang.Throwable -> L8c
        L10:
            boolean r1 = r7.contains(r6)     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            if (r1 != 0) goto L77
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r5.f6363k     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L6c
            r7.add(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L65
            java.lang.reflect.Constructor r1 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L65
            androidx.startup.toq r1 = (androidx.startup.toq) r1     // Catch: java.lang.Throwable -> L65
            java.util.List r2 = r1.mo3860k()     // Catch: java.lang.Throwable -> L65
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L56
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L65
        L3e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L65
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L65
            java.util.Map<java.lang.Class<?>, java.lang.Object> r4 = r5.f6363k     // Catch: java.lang.Throwable -> L65
            boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L3e
            r5.toq(r3, r7)     // Catch: java.lang.Throwable -> L65
            goto L3e
        L56:
            android.content.Context r2 = r5.f52467zy     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.toq(r2)     // Catch: java.lang.Throwable -> L65
            r7.remove(r6)     // Catch: java.lang.Throwable -> L65
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r5.f6363k     // Catch: java.lang.Throwable -> L65
            r7.put(r6, r1)     // Catch: java.lang.Throwable -> L65
            goto L72
        L65:
            r6 = move-exception
            androidx.startup.q r7 = new androidx.startup.q     // Catch: java.lang.Throwable -> L8c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            throw r7     // Catch: java.lang.Throwable -> L8c
        L6c:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r5.f6363k     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r7.get(r6)     // Catch: java.lang.Throwable -> L8c
        L72:
            androidx.tracing.toq.m5290g()     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            return r1
        L77:
            java.lang.String r7 = "Cannot initialize %s. Cycle detected."
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L8c
            r1[r2] = r6     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = java.lang.String.format(r7, r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r6 = move-exception
            androidx.tracing.toq.m5290g()     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.startup.C1177k.toq(java.lang.Class, java.util.Set):java.lang.Object");
    }
}
