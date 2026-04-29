package com.google.common.base;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.base.r */
/* JADX INFO: compiled from: Suppliers.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class C4271r {

    /* JADX INFO: renamed from: com.google.common.base.r$f7l8 */
    /* JADX INFO: compiled from: Suppliers.java */
    private static class f7l8<T> implements lvui<T>, Serializable {
        private static final long serialVersionUID = 0;

        @NullableDecl
        final T instance;

        f7l8(@NullableDecl T t2) {
            this.instance = t2;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof f7l8) {
                return C4280z.m15455k(this.instance, ((f7l8) obj).instance);
            }
            return false;
        }

        @Override // com.google.common.base.lvui
        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return C4280z.toq(this.instance);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.instance + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.r$g */
    /* JADX INFO: compiled from: Suppliers.java */
    private enum g implements n<Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // com.google.common.base.t8r
        public Object apply(lvui<Object> lvuiVar) {
            return lvuiVar.get();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.r$k */
    /* JADX INFO: compiled from: Suppliers.java */
    @InterfaceC7732q
    static class k<T> implements lvui<T>, Serializable {
        private static final long serialVersionUID = 0;
        final lvui<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;

        @NullableDecl
        volatile transient T value;

        k(lvui<T> lvuiVar, long j2, TimeUnit timeUnit) {
            this.delegate = (lvui) jk.a9(lvuiVar);
            this.durationNanos = timeUnit.toNanos(j2);
            jk.m15375i(j2 > 0, "duration (%s %s) must be > 0", j2, timeUnit);
        }

        @Override // com.google.common.base.lvui
        public T get() {
            long j2 = this.expirationNanos;
            long jLd6 = mcp.ld6();
            if (j2 == 0 || jLd6 - j2 >= 0) {
                synchronized (this) {
                    if (j2 == this.expirationNanos) {
                        T t2 = this.delegate.get();
                        this.value = t2;
                        long j3 = jLd6 + this.durationNanos;
                        if (j3 == 0) {
                            j3 = 1;
                        }
                        this.expirationNanos = j3;
                        return t2;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.delegate + ", " + this.durationNanos + ", NANOS)";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.r$n */
    /* JADX INFO: compiled from: Suppliers.java */
    private interface n<T> extends t8r<lvui<T>, T> {
    }

    /* JADX INFO: renamed from: com.google.common.base.r$q */
    /* JADX INFO: compiled from: Suppliers.java */
    private static class q<F, T> implements lvui<T>, Serializable {
        private static final long serialVersionUID = 0;
        final t8r<? super F, T> function;
        final lvui<F> supplier;

        q(t8r<? super F, T> t8rVar, lvui<F> lvuiVar) {
            this.function = (t8r) jk.a9(t8rVar);
            this.supplier = (lvui) jk.a9(lvuiVar);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.function.equals(qVar.function) && this.supplier.equals(qVar.supplier);
        }

        @Override // com.google.common.base.lvui
        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return C4280z.toq(this.function, this.supplier);
        }

        public String toString() {
            return "Suppliers.compose(" + this.function + ", " + this.supplier + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.r$toq */
    /* JADX INFO: compiled from: Suppliers.java */
    @InterfaceC7732q
    static class toq<T> implements lvui<T>, Serializable {
        private static final long serialVersionUID = 0;
        final lvui<T> delegate;
        volatile transient boolean initialized;

        @NullableDecl
        transient T value;

        toq(lvui<T> lvuiVar) {
            this.delegate = (lvui) jk.a9(lvuiVar);
        }

        @Override // com.google.common.base.lvui
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t2 = this.delegate.get();
                        this.value = t2;
                        this.initialized = true;
                        return t2;
                    }
                }
            }
            return this.value;
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.initialized) {
                obj = "<supplier that returned " + this.value + ">";
            } else {
                obj = this.delegate;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.r$y */
    /* JADX INFO: compiled from: Suppliers.java */
    private static class y<T> implements lvui<T>, Serializable {
        private static final long serialVersionUID = 0;
        final lvui<T> delegate;

        y(lvui<T> lvuiVar) {
            this.delegate = (lvui) jk.a9(lvuiVar);
        }

        @Override // com.google.common.base.lvui
        public T get() {
            T t2;
            synchronized (this.delegate) {
                t2 = this.delegate.get();
            }
            return t2;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(" + this.delegate + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.r$zy */
    /* JADX INFO: compiled from: Suppliers.java */
    @InterfaceC7732q
    static class zy<T> implements lvui<T> {

        /* JADX INFO: renamed from: k */
        volatile lvui<T> f25736k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        T f25737n;

        /* JADX INFO: renamed from: q */
        volatile boolean f25738q;

        zy(lvui<T> lvuiVar) {
            this.f25736k = (lvui) jk.a9(lvuiVar);
        }

        @Override // com.google.common.base.lvui
        public T get() {
            if (!this.f25738q) {
                synchronized (this) {
                    if (!this.f25738q) {
                        T t2 = this.f25736k.get();
                        this.f25737n = t2;
                        this.f25738q = true;
                        this.f25736k = null;
                        return t2;
                    }
                }
            }
            return this.f25737n;
        }

        public String toString() {
            Object obj = this.f25736k;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == null) {
                obj = "<supplier that returned " + this.f25737n + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    private C4271r() {
    }

    /* JADX INFO: renamed from: g */
    public static <T> lvui<T> m15450g(lvui<T> lvuiVar) {
        return new y(lvuiVar);
    }

    /* JADX INFO: renamed from: k */
    public static <F, T> lvui<T> m15451k(t8r<? super F, T> t8rVar, lvui<F> lvuiVar) {
        return new q(t8rVar, lvuiVar);
    }

    /* JADX INFO: renamed from: n */
    public static <T> t8r<lvui<T>, T> m15452n() {
        return g.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static <T> lvui<T> m15453q(@NullableDecl T t2) {
        return new f7l8(t2);
    }

    public static <T> lvui<T> toq(lvui<T> lvuiVar) {
        return ((lvuiVar instanceof zy) || (lvuiVar instanceof toq)) ? lvuiVar : lvuiVar instanceof Serializable ? new toq(lvuiVar) : new zy(lvuiVar);
    }

    public static <T> lvui<T> zy(lvui<T> lvuiVar, long j2, TimeUnit timeUnit) {
        return new k(lvuiVar, j2, timeUnit);
    }
}
