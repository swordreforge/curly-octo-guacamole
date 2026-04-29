package androidx.arch.core.executor;

import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.arch.core.executor.q */
/* JADX INFO: compiled from: TaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC0231q {
    /* JADX INFO: renamed from: k */
    public abstract void mo764k(@lvui Runnable runnable);

    /* JADX INFO: renamed from: q */
    public abstract void mo765q(@lvui Runnable runnable);

    public void toq(@lvui Runnable runnable) {
        if (zy()) {
            runnable.run();
        } else {
            mo765q(runnable);
        }
    }

    public abstract boolean zy();
}
