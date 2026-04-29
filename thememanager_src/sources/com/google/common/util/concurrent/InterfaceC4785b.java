package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.debug.internal.C6541g;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.util.concurrent.b */
/* JADX INFO: compiled from: Service.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public interface InterfaceC4785b {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$toq */
    /* JADX INFO: compiled from: Service.java */
    @InterfaceC7731k
    public static abstract class toq {
        /* JADX INFO: renamed from: k */
        public void mo16870k(zy zyVar, Throwable th) {
        }

        /* JADX INFO: renamed from: n */
        public void mo16871n(zy zyVar) {
        }

        /* JADX INFO: renamed from: q */
        public void mo16872q(zy zyVar) {
        }

        public void toq() {
        }

        public void zy() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$zy */
    /* JADX INFO: compiled from: Service.java */
    @InterfaceC7731k
    public static abstract class zy {
        public static final zy FAILED;
        public static final zy NEW;
        public static final zy RUNNING;
        public static final zy STARTING;
        public static final zy STOPPING;
        public static final zy TERMINATED;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ zy[] f27373k;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.b$zy$g */
        /* JADX INFO: compiled from: Service.java */
        enum g extends zy {
            g(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.util.concurrent.InterfaceC4785b.zy
            boolean isTerminal() {
                return true;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.b$zy$k */
        /* JADX INFO: compiled from: Service.java */
        enum k extends zy {
            k(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.util.concurrent.InterfaceC4785b.zy
            boolean isTerminal() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.b$zy$n */
        /* JADX INFO: compiled from: Service.java */
        enum n extends zy {
            n(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.util.concurrent.InterfaceC4785b.zy
            boolean isTerminal() {
                return true;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.b$zy$q */
        /* JADX INFO: compiled from: Service.java */
        enum q extends zy {
            q(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.util.concurrent.InterfaceC4785b.zy
            boolean isTerminal() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.b$zy$toq */
        /* JADX INFO: compiled from: Service.java */
        enum toq extends zy {
            toq(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.util.concurrent.InterfaceC4785b.zy
            boolean isTerminal() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.b$zy$zy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Service.java */
        enum C8016zy extends zy {
            C8016zy(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.util.concurrent.InterfaceC4785b.zy
            boolean isTerminal() {
                return false;
            }
        }

        static {
            k kVar = new k("NEW", 0);
            NEW = kVar;
            toq toqVar = new toq("STARTING", 1);
            STARTING = toqVar;
            C8016zy c8016zy = new C8016zy(C6541g.f81972toq, 2);
            RUNNING = c8016zy;
            q qVar = new q("STOPPING", 3);
            STOPPING = qVar;
            n nVar = new n("TERMINATED", 4);
            TERMINATED = nVar;
            g gVar = new g("FAILED", 5);
            FAILED = gVar;
            f27373k = new zy[]{kVar, toqVar, c8016zy, qVar, nVar, gVar};
        }

        private zy(String str, int i2) {
        }

        public static zy valueOf(String str) {
            return (zy) Enum.valueOf(zy.class, str);
        }

        public static zy[] values() {
            return (zy[]) f27373k.clone();
        }

        abstract boolean isTerminal();
    }

    Throwable f7l8();

    /* JADX INFO: renamed from: g */
    void mo16865g();

    boolean isRunning();

    /* JADX INFO: renamed from: k */
    void mo16866k(toq toqVar, Executor executor);

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    InterfaceC4785b mo16867n();

    /* JADX INFO: renamed from: q */
    void mo16868q();

    zy state();

    void toq(long j2, TimeUnit timeUnit) throws TimeoutException;

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: y */
    InterfaceC4785b mo16869y();

    void zy(long j2, TimeUnit timeUnit) throws TimeoutException;
}
