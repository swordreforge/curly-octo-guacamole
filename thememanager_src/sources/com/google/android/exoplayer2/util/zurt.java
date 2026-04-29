package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.C3839h;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import zy.InterfaceC7839p;

/* JADX INFO: compiled from: ListenerSet.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zurt<T> {

    /* JADX INFO: renamed from: y */
    private static final int f23339y = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f67159f7l8;

    /* JADX INFO: renamed from: g */
    private final ArrayDeque<Runnable> f23340g;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3850n f23341k;

    /* JADX INFO: renamed from: n */
    private final ArrayDeque<Runnable> f23342n;

    /* JADX INFO: renamed from: q */
    private final CopyOnWriteArraySet<zy<T>> f23343q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ki f67160toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final toq<T> f67161zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.zurt$k */
    /* JADX INFO: compiled from: ListenerSet.java */
    public interface InterfaceC3864k<T> {
        void invoke(T t2);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface toq<T> {
        /* JADX INFO: renamed from: k */
        void mo11290k(T t2, C3839h c3839h);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    private static final class zy<T> {

        /* JADX INFO: renamed from: k */
        public final T f23344k;

        /* JADX INFO: renamed from: q */
        private boolean f23345q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private C3839h.toq f67162toq = new C3839h.toq();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f67163zy;

        public zy(T t2) {
            this.f23344k = t2;
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || zy.class != obj.getClass()) {
                return false;
            }
            return this.f23344k.equals(((zy) obj).f23344k);
        }

        public int hashCode() {
            return this.f23344k.hashCode();
        }

        /* JADX INFO: renamed from: k */
        public void m13773k(int i2, InterfaceC3864k<T> interfaceC3864k) {
            if (this.f23345q) {
                return;
            }
            if (i2 != -1) {
                this.f67162toq.m13607k(i2);
            }
            this.f67163zy = true;
            interfaceC3864k.invoke(this.f23344k);
        }

        public void toq(toq<T> toqVar) {
            if (this.f23345q || !this.f67163zy) {
                return;
            }
            C3839h c3839hM13608n = this.f67162toq.m13608n();
            this.f67162toq = new C3839h.toq();
            this.f67163zy = false;
            toqVar.mo11290k(this.f23344k, c3839hM13608n);
        }

        public void zy(toq<T> toqVar) {
            this.f23345q = true;
            if (this.f67163zy) {
                toqVar.mo11290k(this.f23344k, this.f67162toq.m13608n());
            }
        }
    }

    public zurt(Looper looper, InterfaceC3850n interfaceC3850n, toq<T> toqVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC3850n, toqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f7l8(CopyOnWriteArraySet copyOnWriteArraySet, int i2, InterfaceC3864k interfaceC3864k) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zy) it.next()).m13773k(i2, interfaceC3864k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m13766g(Message message) {
        Iterator<zy<T>> it = this.f23343q.iterator();
        while (it.hasNext()) {
            it.next().toq(this.f67161zy);
            if (this.f67160toq.mo13637n(0)) {
                return true;
            }
        }
        return true;
    }

    public void ld6(int i2, InterfaceC3864k<T> interfaceC3864k) {
        m13772y(i2, interfaceC3864k);
        m13768n();
    }

    /* JADX INFO: renamed from: n */
    public void m13768n() {
        if (this.f23340g.isEmpty()) {
            return;
        }
        if (!this.f67160toq.mo13637n(0)) {
            ki kiVar = this.f67160toq;
            kiVar.mo13639q(kiVar.zy(0));
        }
        boolean z2 = !this.f23342n.isEmpty();
        this.f23342n.addAll(this.f23340g);
        this.f23340g.clear();
        if (z2) {
            return;
        }
        while (!this.f23342n.isEmpty()) {
            this.f23342n.peekFirst().run();
            this.f23342n.removeFirst();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m13769p(T t2) {
        for (zy<T> zyVar : this.f23343q) {
            if (zyVar.f23344k.equals(t2)) {
                zyVar.zy(this.f67161zy);
                this.f23343q.remove(zyVar);
            }
        }
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: q */
    public zurt<T> m13770q(Looper looper, toq<T> toqVar) {
        return new zurt<>(this.f23343q, looper, this.f23341k, toqVar);
    }

    /* JADX INFO: renamed from: s */
    public void m13771s() {
        Iterator<zy<T>> it = this.f23343q.iterator();
        while (it.hasNext()) {
            it.next().zy(this.f67161zy);
        }
        this.f23343q.clear();
        this.f67159f7l8 = true;
    }

    public int x2() {
        return this.f23343q.size();
    }

    /* JADX INFO: renamed from: y */
    public void m13772y(final int i2, final InterfaceC3864k<T> interfaceC3864k) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f23343q);
        this.f23340g.add(new Runnable() { // from class: com.google.android.exoplayer2.util.fn3e
            @Override // java.lang.Runnable
            public final void run() {
                zurt.f7l8(copyOnWriteArraySet, i2, interfaceC3864k);
            }
        });
    }

    public void zy(T t2) {
        if (this.f67159f7l8) {
            return;
        }
        C3844k.f7l8(t2);
        this.f23343q.add(new zy<>(t2));
    }

    private zurt(CopyOnWriteArraySet<zy<T>> copyOnWriteArraySet, Looper looper, InterfaceC3850n interfaceC3850n, toq<T> toqVar) {
        this.f23341k = interfaceC3850n;
        this.f23343q = copyOnWriteArraySet;
        this.f67161zy = toqVar;
        this.f23342n = new ArrayDeque<>();
        this.f23340g = new ArrayDeque<>();
        this.f67160toq = interfaceC3850n.zy(looper, new Handler.Callback() { // from class: com.google.android.exoplayer2.util.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f23198k.m13766g(message);
            }
        });
    }
}
