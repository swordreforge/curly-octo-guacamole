package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: TraceCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zurt {

    /* JADX INFO: renamed from: g */
    private static Method f3716g = null;

    /* JADX INFO: renamed from: k */
    private static final String f3717k = "TraceCompat";

    /* JADX INFO: renamed from: n */
    private static Method f3718n;

    /* JADX INFO: renamed from: q */
    private static Method f3719q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static long f50548toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Method f50549zy;

    /* JADX INFO: renamed from: androidx.core.os.zurt$k */
    /* JADX INFO: compiled from: TraceCompat.java */
    @hyr(18)
    static class C0594k {
        private C0594k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2776k(String str) {
            Trace.beginSection(str);
        }

        @InterfaceC7830i
        static void toq() {
            Trace.endSection();
        }
    }

    /* JADX INFO: compiled from: TraceCompat.java */
    @hyr(29)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2777k(String str, int i2) {
            Trace.beginAsyncSection(str, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m2778q(String str, long j2) {
            Trace.setCounter(str, j2);
        }

        @InterfaceC7830i
        static void toq(String str, int i2) {
            Trace.endAsyncSection(str, i2);
        }

        @InterfaceC7830i
        static boolean zy() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f50548toq = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f50549zy = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f3719q = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f3718n = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f3716g = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i(f3717k, "Unable to initialize via reflection.", e2);
            }
        }
    }

    private zurt() {
    }

    /* JADX INFO: renamed from: g */
    public static void m2772g(@lvui String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            toq.m2778q(str, i2);
            return;
        }
        try {
            f3716g.invoke(null, Long.valueOf(f50548toq), str, Integer.valueOf(i2));
        } catch (Exception unused) {
            Log.v(f3717k, "Unable to invoke traceCounter() via reflection.");
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2773k(@lvui String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            toq.m2777k(str, i2);
            return;
        }
        try {
            f3719q.invoke(null, Long.valueOf(f50548toq), str, Integer.valueOf(i2));
        } catch (Exception unused) {
            Log.v(f3717k, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2774n() {
        if (Build.VERSION.SDK_INT >= 29) {
            return toq.zy();
        }
        try {
            return ((Boolean) f50549zy.invoke(null, Long.valueOf(f50548toq))).booleanValue();
        } catch (Exception unused) {
            Log.v(f3717k, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m2775q() {
        C0594k.toq();
    }

    public static void toq(@lvui String str) {
        C0594k.m2776k(str);
    }

    public static void zy(@lvui String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            toq.toq(str, i2);
            return;
        }
        try {
            f3718n.invoke(null, Long.valueOf(f50548toq), str, Integer.valueOf(i2));
        } catch (Exception unused) {
            Log.v(f3717k, "Unable to invoke endAsyncSection() via reflection.");
        }
    }
}
