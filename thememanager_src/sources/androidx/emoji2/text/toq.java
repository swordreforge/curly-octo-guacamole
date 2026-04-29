package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class toq implements Executor {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Handler f4575k;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4575k.post(runnable);
    }
}
