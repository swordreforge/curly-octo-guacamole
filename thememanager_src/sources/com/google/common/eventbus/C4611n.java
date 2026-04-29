package com.google.common.eventbus;

import com.google.common.base.fu4;
import com.google.common.base.jk;
import com.google.common.util.concurrent.C4815j;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.eventbus.n */
/* JADX INFO: compiled from: EventBus.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public class C4611n {

    /* JADX INFO: renamed from: g */
    private static final Logger f26843g = Logger.getLogger(C4611n.class.getName());

    /* JADX INFO: renamed from: k */
    private final String f26844k;

    /* JADX INFO: renamed from: n */
    private final AbstractC4613q f26845n;

    /* JADX INFO: renamed from: q */
    private final C4612p f26846q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Executor f68256toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC4614s f68257zy;

    /* JADX INFO: renamed from: com.google.common.eventbus.n$k */
    /* JADX INFO: compiled from: EventBus.java */
    static final class k implements InterfaceC4614s {

        /* JADX INFO: renamed from: k */
        static final k f26847k = new k();

        k() {
        }

        private static Logger toq(C4615y c4615y) {
            return Logger.getLogger(C4611n.class.getName() + "." + c4615y.toq().zy());
        }

        private static String zy(C4615y c4615y) {
            Method methodM16186q = c4615y.m16186q();
            return "Exception thrown by subscriber method " + methodM16186q.getName() + '(' + methodM16186q.getParameterTypes()[0].getName() + ") on subscriber " + c4615y.zy() + " when dispatching event: " + c4615y.m16185k();
        }

        @Override // com.google.common.eventbus.InterfaceC4614s
        /* JADX INFO: renamed from: k */
        public void mo16169k(Throwable th, C4615y c4615y) {
            Logger qVar = toq(c4615y);
            Level level = Level.SEVERE;
            if (qVar.isLoggable(level)) {
                qVar.log(level, zy(c4615y), th);
            }
        }
    }

    public C4611n() {
        this("default");
    }

    /* JADX INFO: renamed from: g */
    public void m16165g(Object obj) {
        this.f26846q.m16174s(obj);
    }

    /* JADX INFO: renamed from: k */
    final Executor m16166k() {
        return this.f68256toq;
    }

    /* JADX INFO: renamed from: n */
    public void m16167n(Object obj) {
        this.f26846q.m16175y(obj);
    }

    /* JADX INFO: renamed from: q */
    public void m16168q(Object obj) {
        Iterator<f7l8> itM16173g = this.f26846q.m16173g(obj);
        if (itM16173g.hasNext()) {
            this.f26845n.mo16179k(obj, itM16173g);
        } else {
            if (obj instanceof zy) {
                return;
            }
            m16168q(new zy(this, obj));
        }
    }

    public String toString() {
        return fu4.zy(this).m15357h(this.f26844k).toString();
    }

    void toq(Throwable th, C4615y c4615y) {
        jk.a9(th);
        jk.a9(c4615y);
        try {
            this.f68257zy.mo16169k(th, c4615y);
        } catch (Throwable th2) {
            f26843g.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, th), th2);
        }
    }

    public final String zy() {
        return this.f26844k;
    }

    public C4611n(String str) {
        this(str, C4815j.zy(), AbstractC4613q.m16178q(), k.f26847k);
    }

    public C4611n(InterfaceC4614s interfaceC4614s) {
        this("default", C4815j.zy(), AbstractC4613q.m16178q(), interfaceC4614s);
    }

    C4611n(String str, Executor executor, AbstractC4613q abstractC4613q, InterfaceC4614s interfaceC4614s) {
        this.f26846q = new C4612p(this);
        this.f26844k = (String) jk.a9(str);
        this.f68256toq = (Executor) jk.a9(executor);
        this.f26845n = (AbstractC4613q) jk.a9(abstractC4613q);
        this.f68257zy = (InterfaceC4614s) jk.a9(interfaceC4614s);
    }
}
