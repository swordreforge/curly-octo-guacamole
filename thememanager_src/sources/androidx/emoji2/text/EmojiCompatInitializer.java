package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.zurt;
import androidx.emoji2.text.C0830n;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1177k;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.y9n;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements androidx.startup.toq<Boolean> {

    /* JADX INFO: renamed from: k */
    private static final long f4430k = 500;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f51083toq = "EmojiCompatInitializer";

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$k */
    @hyr(19)
    static class C0805k extends C0830n.zy {
        protected C0805k(Context context) {
            super(new toq(context));
            m4046g(1);
        }
    }

    @hyr(19)
    static class toq implements C0830n.y {

        /* JADX INFO: renamed from: k */
        private final Context f4433k;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$toq$k */
        class C0806k extends C0830n.s {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ C0830n.s f4434k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f51084toq;

            C0806k(C0830n.s sVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f4434k = sVar;
                this.f51084toq = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C0830n.s
            /* JADX INFO: renamed from: k */
            public void mo3865k(@dd Throwable th) {
                try {
                    this.f4434k.mo3865k(th);
                } finally {
                    this.f51084toq.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C0830n.s
            public void toq(@lvui kja0 kja0Var) {
                try {
                    this.f4434k.toq(kja0Var);
                } finally {
                    this.f51084toq.shutdown();
                }
            }
        }

        toq(Context context) {
            this.f4433k = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C0830n.y
        /* JADX INFO: renamed from: k */
        public void mo3864k(@lvui final C0830n.s sVar) {
            final ThreadPoolExecutor threadPoolExecutorZy = androidx.emoji2.text.zy.zy(EmojiCompatInitializer.f51083toq);
            threadPoolExecutorZy.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4502k.m3863q(sVar, threadPoolExecutorZy);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @y9n
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void m3863q(@lvui C0830n.s sVar, @lvui ThreadPoolExecutor threadPoolExecutor) {
            try {
                ld6 ld6VarM4064k = C0834q.m4064k(this.f4433k);
                if (ld6VarM4064k == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                ld6VarM4064k.x2(threadPoolExecutor);
                ld6VarM4064k.m4047k().mo3864k(new C0806k(sVar, threadPoolExecutor));
            } catch (Throwable th) {
                sVar.mo3865k(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zurt.toq("EmojiCompat.EmojiCompatInitializer.run");
                if (C0830n.qrj()) {
                    C0830n.toq().m4033h();
                }
            } finally {
                zurt.m2775q();
            }
        }
    }

    @Override // androidx.startup.toq
    @lvui
    /* JADX INFO: renamed from: k */
    public List<Class<? extends androidx.startup.toq<?>>> mo3860k() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @hyr(19)
    /* JADX INFO: renamed from: n */
    void m3861n() {
        androidx.emoji2.text.zy.m4091n().postDelayed(new zy(), 500L);
    }

    @hyr(19)
    /* JADX INFO: renamed from: q */
    void m3862q(@lvui Context context) {
        final androidx.lifecycle.kja0 lifecycle = ((InterfaceC0954z) C1177k.zy(context).m5287q(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo4451k(new InterfaceC0928g() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
            public void t8r(@lvui InterfaceC0954z interfaceC0954z) {
                EmojiCompatInitializer.this.m3861n();
                lifecycle.zy(this);
            }
        });
    }

    @Override // androidx.startup.toq
    @lvui
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public Boolean toq(@lvui Context context) {
        C0830n.x2(new C0805k(context));
        m3862q(context);
        return Boolean.TRUE;
    }
}
