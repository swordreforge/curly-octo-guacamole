package miuix.core.util;

import android.app.Application;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: miuix.core.util.k */
/* JADX INFO: compiled from: ActivityThreadWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7081k {

    /* JADX INFO: renamed from: n */
    private static C7081k f39863n;

    /* JADX INFO: renamed from: k */
    private Object f39864k;

    /* JADX INFO: renamed from: q */
    private Object f39865q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private volatile Application f87344toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f87345zy;

    private C7081k() {
        this.f39864k = null;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            this.f39864k = declaredMethod.invoke(null, new Object[0]);
        } catch (Exception unused) {
            this.f39864k = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static C7081k m25560n() {
        if (f39863n == null) {
            f39863n = new C7081k();
        }
        return f39863n;
    }

    /* JADX INFO: renamed from: k */
    public Object m25561k() {
        return this.f39864k;
    }

    /* JADX INFO: renamed from: q */
    public String m25562q(Object obj) {
        try {
            if (this.f87345zy == null) {
                Field declaredField = obj.getClass().getDeclaredField("mPackages");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(obj);
                this.f87345zy = (String) map.keySet().iterator().next();
                this.f39865q = ((WeakReference) map.values().iterator().next()).get();
            }
            return this.f87345zy;
        } catch (Exception unused) {
            return null;
        }
    }

    public Application toq() {
        try {
            if (this.f87344toq == null) {
                Method declaredMethod = this.f39864k.getClass().getDeclaredMethod("currentApplication", new Class[0]);
                declaredMethod.setAccessible(true);
                this.f87344toq = (Application) declaredMethod.invoke(null, new Object[0]);
            }
            return this.f87344toq;
        } catch (Exception unused) {
            return null;
        }
    }

    public Object zy(Object obj) {
        m25562q(obj);
        return this.f39865q;
    }
}
