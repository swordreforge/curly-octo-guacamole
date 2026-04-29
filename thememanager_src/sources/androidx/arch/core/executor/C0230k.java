package androidx.arch.core.executor;

import java.util.concurrent.Executor;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.arch.core.executor.k */
/* JADX INFO: compiled from: ArchTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0230k extends AbstractC0231q {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile C0230k f47003zy;

    /* JADX INFO: renamed from: k */
    @lvui
    private AbstractC0231q f1261k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private AbstractC0231q f47004toq;

    /* JADX INFO: renamed from: q */
    @lvui
    private static final Executor f1260q = new k();

    /* JADX INFO: renamed from: n */
    @lvui
    private static final Executor f1259n = new toq();

    /* JADX INFO: renamed from: androidx.arch.core.executor.k$k */
    /* JADX INFO: compiled from: ArchTaskExecutor.java */
    static class k implements Executor {
        k() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0230k.m762g().mo765q(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.arch.core.executor.k$toq */
    /* JADX INFO: compiled from: ArchTaskExecutor.java */
    static class toq implements Executor {
        toq() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0230k.m762g().mo764k(runnable);
        }
    }

    private C0230k() {
        zy zyVar = new zy();
        this.f47004toq = zyVar;
        this.f1261k = zyVar;
    }

    @lvui
    public static Executor f7l8() {
        return f1260q;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public static C0230k m762g() {
        if (f47003zy != null) {
            return f47003zy;
        }
        synchronized (C0230k.class) {
            if (f47003zy == null) {
                f47003zy = new C0230k();
            }
        }
        return f47003zy;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static Executor m763n() {
        return f1259n;
    }

    @Override // androidx.arch.core.executor.AbstractC0231q
    /* JADX INFO: renamed from: k */
    public void mo764k(Runnable runnable) {
        this.f1261k.mo764k(runnable);
    }

    @Override // androidx.arch.core.executor.AbstractC0231q
    /* JADX INFO: renamed from: q */
    public void mo765q(Runnable runnable) {
        this.f1261k.mo765q(runnable);
    }

    /* JADX INFO: renamed from: y */
    public void m766y(@dd AbstractC0231q abstractC0231q) {
        if (abstractC0231q == null) {
            abstractC0231q = this.f47004toq;
        }
        this.f1261k = abstractC0231q;
    }

    @Override // androidx.arch.core.executor.AbstractC0231q
    public boolean zy() {
        return this.f1261k.zy();
    }
}
