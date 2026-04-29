package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.bumptech.glide.module.n */
/* JADX INFO: compiled from: ManifestParser.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C3155n {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f62992toq = "ManifestParser";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62993zy = "GlideModule";

    /* JADX INFO: renamed from: k */
    private final Context f18910k;

    public C3155n(Context context) {
        this.f18910k = context;
    }

    @dd
    /* JADX INFO: renamed from: k */
    private ApplicationInfo m11115k() throws PackageManager.NameNotFoundException {
        return this.f18910k.getPackageManager().getApplicationInfo(this.f18910k.getPackageName(), 128);
    }

    /* JADX INFO: renamed from: q */
    private static void m11116q(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    private static zy zy(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e2) {
                m11116q(cls, e2);
            } catch (InstantiationException e3) {
                m11116q(cls, e3);
            } catch (NoSuchMethodException e4) {
                m11116q(cls, e4);
            } catch (InvocationTargetException e6) {
                m11116q(cls, e6);
            }
            if (objNewInstance instanceof zy) {
                return (zy) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e7) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e7);
        }
    }

    public List<zy> toq() {
        if (Log.isLoggable(f62992toq, 3)) {
            Log.d(f62992toq, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoM11115k = m11115k();
            if (applicationInfoM11115k != null && applicationInfoM11115k.metaData != null) {
                if (Log.isLoggable(f62992toq, 2)) {
                    Log.v(f62992toq, "Got app info metadata: " + applicationInfoM11115k.metaData);
                }
                for (String str : applicationInfoM11115k.metaData.keySet()) {
                    if (f62993zy.equals(applicationInfoM11115k.metaData.get(str))) {
                        arrayList.add(zy(str));
                        if (Log.isLoggable(f62992toq, 3)) {
                            Log.d(f62992toq, "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable(f62992toq, 3)) {
                    Log.d(f62992toq, "Finished loading Glide modules");
                }
                return arrayList;
            }
            if (Log.isLoggable(f62992toq, 3)) {
                Log.d(f62992toq, "Got null app info metadata");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
        }
    }
}
