package miuix.appcompat.app.floatingactivity;

import androidx.lifecycle.fu4;
import androidx.lifecycle.gvn7;
import androidx.lifecycle.kja0;
import miuix.appcompat.app.t8r;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingLifecycleObserver implements fu4 {

    /* JADX INFO: renamed from: k */
    protected String f38817k;

    /* JADX INFO: renamed from: q */
    protected int f38818q;

    public FloatingLifecycleObserver(t8r t8rVar) {
        this.f38817k = t8rVar.getActivityIdentity();
        this.f38818q = t8rVar.getTaskId();
    }

    /* JADX INFO: renamed from: k */
    protected String m24905k() {
        return this.f38817k;
    }

    @gvn7(kja0.toq.ON_CREATE)
    public void onCreate() {
    }

    @gvn7(kja0.toq.ON_DESTROY)
    public void onDestroy() {
    }

    @gvn7(kja0.toq.ON_PAUSE)
    public void onPause() {
    }

    @gvn7(kja0.toq.ON_RESUME)
    public void onResume() {
    }

    protected int toq() {
        return this.f38818q;
    }
}
