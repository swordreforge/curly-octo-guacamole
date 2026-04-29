package androidx.tracing;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zy.lvui;

/* JADX INFO: compiled from: Trace.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: g */
    private static Method f6366g = null;

    /* JADX INFO: renamed from: k */
    static final String f6367k = "Trace";

    /* JADX INFO: renamed from: n */
    private static Method f6368n;

    /* JADX INFO: renamed from: q */
    private static Method f6369q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static long f52469toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Method f52470zy;

    private toq() {
    }

    private static void f7l8(@lvui String str, @lvui Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v(f6367k, "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: g */
    public static void m5290g() {
        zy.toq();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: k */
    public static void m5291k(@lvui String str, int i2) {
        try {
            if (f6369q == null) {
                C1182q.m5289k(str, i2);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        toq(str, i2);
    }

    private static void ld6(@lvui String str, int i2) {
        try {
            if (f6366g == null) {
                f6366g = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f6366g.invoke(null, Long.valueOf(f52469toq), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            f7l8("traceCounter", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m5292n(@lvui String str, int i2) {
        try {
            if (f6368n == null) {
                f6368n = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f6368n.invoke(null, Long.valueOf(f52469toq), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            f7l8("asyncTraceEnd", e2);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: p */
    public static void m5293p(@lvui String str, int i2) {
        try {
            if (f6366g == null) {
                C1182q.zy(str, i2);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        ld6(str, i2);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: q */
    public static void m5294q(@lvui String str, int i2) {
        try {
            if (f6368n == null) {
                C1182q.toq(str, i2);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m5292n(str, i2);
    }

    /* JADX INFO: renamed from: s */
    private static boolean m5295s() {
        try {
            if (f52470zy == null) {
                f52469toq = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f52470zy = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f52470zy.invoke(null, Long.valueOf(f52469toq))).booleanValue();
        } catch (Exception e2) {
            f7l8("isTagEnabled", e2);
            return false;
        }
    }

    private static void toq(@lvui String str, int i2) {
        try {
            if (f6369q == null) {
                f6369q = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f6369q.invoke(null, Long.valueOf(f52469toq), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            f7l8("asyncTraceBegin", e2);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: y */
    public static boolean m5296y() {
        try {
            if (f52470zy == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m5295s();
    }

    public static void zy(@lvui String str) {
        zy.m5297k(str);
    }
}
