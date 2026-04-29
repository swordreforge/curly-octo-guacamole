package retrofit2;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.InterfaceC7435g;
import okhttp3.InterfaceC7519n;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.jp0y;
import okio.AbstractC7579z;
import okio.C7560j;
import okio.d2ok;
import okio.nn86;

/* JADX INFO: compiled from: OkHttpCall.java */
/* JADX INFO: loaded from: classes4.dex */
final class n7h<T> implements retrofit2.toq<T> {

    /* JADX INFO: renamed from: g */
    private final InterfaceC7637g<jp0y, T> f44203g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("this")
    private boolean f44204h;

    /* JADX INFO: renamed from: k */
    private final t8r f44205k;

    /* JADX INFO: renamed from: n */
    private final InterfaceC7519n.k f44206n;

    /* JADX INFO: renamed from: p */
    @GuardedBy("this")
    @Nullable
    private Throwable f44207p;

    /* JADX INFO: renamed from: q */
    private final Object[] f44208q;

    /* JADX INFO: renamed from: s */
    @GuardedBy("this")
    @Nullable
    private InterfaceC7519n f44209s;

    /* JADX INFO: renamed from: y */
    private volatile boolean f44210y;

    /* JADX INFO: renamed from: retrofit2.n7h$k */
    /* JADX INFO: compiled from: OkHttpCall.java */
    class C7645k implements InterfaceC7435g {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC7648q f44211k;

        C7645k(InterfaceC7648q interfaceC7648q) {
            this.f44211k = interfaceC7648q;
        }

        /* JADX INFO: renamed from: k */
        private void m28005k(Throwable th) {
            try {
                this.f44211k.onFailure(n7h.this, th);
            } catch (Throwable th2) {
                C7657z.t8r(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.InterfaceC7435g
        /* JADX INFO: renamed from: q */
        public void mo22383q(InterfaceC7519n interfaceC7519n, fti ftiVar) {
            try {
                try {
                    this.f44211k.onResponse(n7h.this, n7h.this.m28003g(ftiVar));
                } catch (Throwable th) {
                    C7657z.t8r(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C7657z.t8r(th2);
                m28005k(th2);
            }
        }

        @Override // okhttp3.InterfaceC7435g
        public void zy(InterfaceC7519n interfaceC7519n, IOException iOException) {
            m28005k(iOException);
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    static final class toq extends jp0y {

        /* JADX INFO: renamed from: g */
        private final okio.n7h f44213g;

        /* JADX INFO: renamed from: n */
        private final jp0y f44214n;

        /* JADX INFO: renamed from: y */
        @Nullable
        IOException f44215y;

        /* JADX INFO: renamed from: retrofit2.n7h$toq$k */
        /* JADX INFO: compiled from: OkHttpCall.java */
        class C7646k extends AbstractC7579z {
            C7646k(nn86 nn86Var) {
                super(nn86Var);
            }

            @Override // okio.AbstractC7579z, okio.nn86
            public long wx16(okio.x2 x2Var, long j2) throws IOException {
                try {
                    return super.wx16(x2Var, j2);
                } catch (IOException e2) {
                    toq.this.f44215y = e2;
                    throw e2;
                }
            }
        }

        toq(jp0y jp0yVar) {
            this.f44214n = jp0yVar;
            this.f44213g = d2ok.m27592n(new C7646k(jp0yVar.y9n()));
        }

        void a98o() throws IOException {
            IOException iOException = this.f44215y;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.jp0y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f44214n.close();
        }

        @Override // okhttp3.jp0y
        /* JADX INFO: renamed from: h */
        public okhttp3.fu4 mo27094h() {
            return this.f44214n.mo27094h();
        }

        @Override // okhttp3.jp0y
        public long x2() {
            return this.f44214n.x2();
        }

        @Override // okhttp3.jp0y
        public okio.n7h y9n() {
            return this.f44213g;
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    static final class zy extends jp0y {

        /* JADX INFO: renamed from: g */
        private final long f44217g;

        /* JADX INFO: renamed from: n */
        @Nullable
        private final okhttp3.fu4 f44218n;

        zy(@Nullable okhttp3.fu4 fu4Var, long j2) {
            this.f44218n = fu4Var;
            this.f44217g = j2;
        }

        @Override // okhttp3.jp0y
        /* JADX INFO: renamed from: h */
        public okhttp3.fu4 mo27094h() {
            return this.f44218n;
        }

        @Override // okhttp3.jp0y
        public long x2() {
            return this.f44217g;
        }

        @Override // okhttp3.jp0y
        public okio.n7h y9n() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    n7h(t8r t8rVar, Object[] objArr, InterfaceC7519n.k kVar, InterfaceC7637g<jp0y, T> interfaceC7637g) {
        this.f44205k = t8rVar;
        this.f44208q = objArr;
        this.f44206n = kVar;
        this.f44203g = interfaceC7637g;
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: n */
    private InterfaceC7519n m28001n() throws IOException {
        InterfaceC7519n interfaceC7519n = this.f44209s;
        if (interfaceC7519n != null) {
            return interfaceC7519n;
        }
        Throwable th = this.f44207p;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC7519n interfaceC7519nM28002q = m28002q();
            this.f44209s = interfaceC7519nM28002q;
            return interfaceC7519nM28002q;
        } catch (IOException | Error | RuntimeException e2) {
            C7657z.t8r(e2);
            this.f44207p = e2;
            throw e2;
        }
    }

    /* JADX INFO: renamed from: q */
    private InterfaceC7519n m28002q() throws IOException {
        InterfaceC7519n interfaceC7519nMo27367k = this.f44206n.mo27367k(this.f44205k.m28010k(this.f44208q));
        if (interfaceC7519nMo27367k != null) {
            return interfaceC7519nMo27367k;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.toq
    public void cancel() {
        InterfaceC7519n interfaceC7519n;
        this.f44210y = true;
        synchronized (this) {
            interfaceC7519n = this.f44209s;
        }
        if (interfaceC7519n != null) {
            interfaceC7519n.cancel();
        }
    }

    @Override // retrofit2.toq
    public C7639i<T> f7l8() throws IOException {
        InterfaceC7519n interfaceC7519nM28001n;
        synchronized (this) {
            if (this.f44204h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f44204h = true;
            interfaceC7519nM28001n = m28001n();
        }
        if (this.f44210y) {
            interfaceC7519nM28001n.cancel();
        }
        return m28003g(interfaceC7519nM28001n.f7l8());
    }

    /* JADX INFO: renamed from: g */
    C7639i<T> m28003g(fti ftiVar) throws IOException {
        jp0y jp0yVarHyr = ftiVar.hyr();
        fti ftiVarZy = ftiVar.ij().toq(new zy(jp0yVarHyr.mo27094h(), jp0yVarHyr.x2())).zy();
        int iI1 = ftiVarZy.i1();
        if (iI1 < 200 || iI1 >= 300) {
            try {
                return C7639i.m27984q(C7657z.m28022k(jp0yVarHyr), ftiVarZy);
            } finally {
                jp0yVarHyr.close();
            }
        }
        if (iI1 == 204 || iI1 == 205) {
            jp0yVarHyr.close();
            return C7639i.qrj(null, ftiVarZy);
        }
        toq toqVar = new toq(jp0yVarHyr);
        try {
            return C7639i.qrj(this.f44203g.mo27951k(toqVar), ftiVarZy);
        } catch (RuntimeException e2) {
            toqVar.a98o();
            throw e2;
        }
    }

    @Override // retrofit2.toq
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public n7h<T> clone() {
        return new n7h<>(this.f44205k, this.f44208q, this.f44206n, this.f44203g);
    }

    @Override // retrofit2.toq
    public synchronized boolean ld6() {
        return this.f44204h;
    }

    @Override // retrofit2.toq
    /* JADX INFO: renamed from: p */
    public void mo27954p(InterfaceC7648q<T> interfaceC7648q) {
        InterfaceC7519n interfaceC7519n;
        Throwable th;
        Objects.requireNonNull(interfaceC7648q, "callback == null");
        synchronized (this) {
            if (this.f44204h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f44204h = true;
            interfaceC7519n = this.f44209s;
            th = this.f44207p;
            if (interfaceC7519n == null && th == null) {
                try {
                    InterfaceC7519n interfaceC7519nM28002q = m28002q();
                    this.f44209s = interfaceC7519nM28002q;
                    interfaceC7519n = interfaceC7519nM28002q;
                } catch (Throwable th2) {
                    th = th2;
                    C7657z.t8r(th);
                    this.f44207p = th;
                }
            }
        }
        if (th != null) {
            interfaceC7648q.onFailure(this, th);
            return;
        }
        if (this.f44210y) {
            interfaceC7519n.cancel();
        }
        interfaceC7519n.mo27031h(new C7645k(interfaceC7648q));
    }

    @Override // retrofit2.toq
    public synchronized C7560j toq() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create call.", e2);
        }
        return m28001n().toq();
    }

    @Override // retrofit2.toq
    public boolean x2() {
        boolean z2 = true;
        if (this.f44210y) {
            return true;
        }
        synchronized (this) {
            InterfaceC7519n interfaceC7519n = this.f44209s;
            if (interfaceC7519n == null || !interfaceC7519n.x2()) {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // retrofit2.toq
    public synchronized jk zy() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return m28001n().zy();
    }
}
