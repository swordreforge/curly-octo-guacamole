package androidx.tracing;

import android.os.Trace;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: TraceApi18Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(18)
final class zy {
    private zy() {
    }

    /* JADX INFO: renamed from: k */
    public static void m5297k(@lvui String str) {
        Trace.beginSection(str);
    }

    public static void toq() {
        Trace.endSection();
    }
}
