package yl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.d2ok;
import miuix.appcompat.app.t8r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: BlurController.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private WeakReference<t8r> f45960k;

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final t8r m28189k() {
        WeakReference<t8r> weakReference = this.f45960k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo28171n(boolean z2);

    /* JADX INFO: renamed from: q */
    public abstract void mo28172q(float f2);

    public abstract boolean toq();

    public final void zy(@InterfaceC7396q t8r activity) {
        d2ok.m23075h(activity, "activity");
        this.f45960k = new WeakReference<>(activity);
    }
}
