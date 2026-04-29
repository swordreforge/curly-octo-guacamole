package com.google.common.eventbus;

import com.google.common.base.jk;
import com.google.common.collect.u38j;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.google.common.eventbus.q */
/* JADX INFO: compiled from: Dispatcher.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4613q {

    /* JADX INFO: renamed from: com.google.common.eventbus.q$q */
    /* JADX INFO: compiled from: Dispatcher.java */
    private static final class q extends AbstractC4613q {

        /* JADX INFO: renamed from: k */
        private final ThreadLocal<Queue<zy>> f26851k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final ThreadLocal<Boolean> f68261toq;

        /* JADX INFO: renamed from: com.google.common.eventbus.q$q$k */
        /* JADX INFO: compiled from: Dispatcher.java */
        class k extends ThreadLocal<Queue<zy>> {
            k() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Queue<zy> initialValue() {
                return u38j.m15993q();
            }
        }

        /* JADX INFO: renamed from: com.google.common.eventbus.q$q$toq */
        /* JADX INFO: compiled from: Dispatcher.java */
        class toq extends ThreadLocal<Boolean> {
            toq() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: renamed from: com.google.common.eventbus.q$q$zy */
        /* JADX INFO: compiled from: Dispatcher.java */
        private static final class zy {

            /* JADX INFO: renamed from: k */
            private final Object f26854k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private final Iterator<f7l8> f68262toq;

            private zy(Object obj, Iterator<f7l8> it) {
                this.f26854k = obj;
                this.f68262toq = it;
            }
        }

        private q() {
            this.f26851k = new k();
            this.f68261toq = new toq();
        }

        @Override // com.google.common.eventbus.AbstractC4613q
        /* JADX INFO: renamed from: k */
        void mo16179k(Object obj, Iterator<f7l8> it) {
            jk.a9(obj);
            jk.a9(it);
            Queue<zy> queue = this.f26851k.get();
            queue.offer(new zy(obj, it));
            if (this.f68261toq.get().booleanValue()) {
                return;
            }
            this.f68261toq.set(Boolean.TRUE);
            while (true) {
                try {
                    zy zyVarPoll = queue.poll();
                    if (zyVarPoll == null) {
                        return;
                    }
                    while (zyVarPoll.f68262toq.hasNext()) {
                        ((f7l8) zyVarPoll.f68262toq.next()).m16164n(zyVarPoll.f26854k);
                    }
                } finally {
                    this.f68261toq.remove();
                    this.f26851k.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.q$toq */
    /* JADX INFO: compiled from: Dispatcher.java */
    private static final class toq extends AbstractC4613q {

        /* JADX INFO: renamed from: k */
        private static final toq f26855k = new toq();

        private toq() {
        }

        @Override // com.google.common.eventbus.AbstractC4613q
        /* JADX INFO: renamed from: k */
        void mo16179k(Object obj, Iterator<f7l8> it) {
            jk.a9(obj);
            while (it.hasNext()) {
                it.next().m16164n(obj);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.q$zy */
    /* JADX INFO: compiled from: Dispatcher.java */
    private static final class zy extends AbstractC4613q {

        /* JADX INFO: renamed from: k */
        private final ConcurrentLinkedQueue<k> f26856k;

        /* JADX INFO: renamed from: com.google.common.eventbus.q$zy$k */
        /* JADX INFO: compiled from: Dispatcher.java */
        private static final class k {

            /* JADX INFO: renamed from: k */
            private final Object f26857k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private final f7l8 f68263toq;

            private k(Object obj, f7l8 f7l8Var) {
                this.f26857k = obj;
                this.f68263toq = f7l8Var;
            }
        }

        private zy() {
            this.f26856k = u38j.m15987g();
        }

        @Override // com.google.common.eventbus.AbstractC4613q
        /* JADX INFO: renamed from: k */
        void mo16179k(Object obj, Iterator<f7l8> it) {
            jk.a9(obj);
            while (it.hasNext()) {
                this.f26856k.add(new k(obj, it.next()));
            }
            while (true) {
                k kVarPoll = this.f26856k.poll();
                if (kVarPoll == null) {
                    return;
                } else {
                    kVarPoll.f68263toq.m16164n(kVarPoll.f26857k);
                }
            }
        }
    }

    AbstractC4613q() {
    }

    /* JADX INFO: renamed from: q */
    static AbstractC4613q m16178q() {
        return new q();
    }

    static AbstractC4613q toq() {
        return toq.f26855k;
    }

    static AbstractC4613q zy() {
        return new zy();
    }

    /* JADX INFO: renamed from: k */
    abstract void mo16179k(Object obj, Iterator<f7l8> it);
}
