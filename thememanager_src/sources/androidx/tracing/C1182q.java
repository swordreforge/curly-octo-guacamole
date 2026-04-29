package androidx.tracing;

import android.os.Trace;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.tracing.q */
/* JADX INFO: compiled from: TraceApi29Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(29)
final class C1182q {
    private C1182q() {
    }

    /* JADX INFO: renamed from: k */
    public static void m5289k(@lvui String str, int i2) {
        Trace.beginAsyncSection(str, i2);
    }

    public static void toq(@lvui String str, int i2) {
        Trace.endAsyncSection(str, i2);
    }

    public static void zy(@lvui String str, int i2) {
        Trace.setCounter(str, i2);
    }
}
