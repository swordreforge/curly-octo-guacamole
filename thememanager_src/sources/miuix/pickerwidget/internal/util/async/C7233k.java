package miuix.pickerwidget.internal.util.async;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: renamed from: miuix.pickerwidget.internal.util.async.k */
/* JADX INFO: compiled from: WorkerThreads.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7233k {

    /* JADX INFO: renamed from: k */
    public static final String f40824k = "common_work";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Map<String, k> f87994toq = new ArrayMap();

    /* JADX INFO: renamed from: miuix.pickerwidget.internal.util.async.k$k */
    /* JADX INFO: compiled from: WorkerThreads.java */
    private static class k {

        /* JADX INFO: renamed from: k */
        final HandlerThread f40825k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87995toq = 1;

        k(String str) {
            HandlerThread handlerThread = new HandlerThread(str);
            this.f40825k = handlerThread;
            handlerThread.start();
        }
    }

    private C7233k() {
    }

    /* JADX INFO: renamed from: k */
    public static synchronized Looper m26310k(String str) {
        k kVar;
        Map<String, k> map = f87994toq;
        kVar = map.get(str);
        if (kVar == null) {
            kVar = new k(str);
            map.put(str, kVar);
        } else {
            kVar.f87995toq++;
        }
        return kVar.f40825k.getLooper();
    }

    public static synchronized void toq(String str) {
        Map<String, k> map = f87994toq;
        k kVar = map.get(str);
        if (kVar != null) {
            int i2 = kVar.f87995toq - 1;
            kVar.f87995toq = i2;
            if (i2 == 0) {
                map.remove(str);
                kVar.f40825k.quitSafely();
            }
        }
    }
}
