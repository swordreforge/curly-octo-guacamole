package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import zy.lvui;

/* JADX INFO: compiled from: CalleeHandler.java */
/* JADX INFO: loaded from: classes.dex */
class toq {
    private toq() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    static Handler m2812k() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
