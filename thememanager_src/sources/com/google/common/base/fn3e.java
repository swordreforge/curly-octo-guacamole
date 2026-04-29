package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Functions.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class fn3e {

    /* JADX INFO: compiled from: Functions.java */
    private static class f7l8<T> implements t8r<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        private final a9<T> predicate;

        @Override // com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof f7l8) {
                return this.predicate.equals(((f7l8) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            return "Functions.forPredicate(" + this.predicate + ")";
        }

        private f7l8(a9<T> a9Var) {
            this.predicate = (a9) jk.a9(a9Var);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.t8r
        public Boolean apply(@NullableDecl T t2) {
            return Boolean.valueOf(this.predicate.apply(t2));
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fn3e$g */
    /* JADX INFO: compiled from: Functions.java */
    private enum EnumC4243g implements t8r<Object, Object> {
        INSTANCE;

        @Override // com.google.common.base.t8r
        @NullableDecl
        public Object apply(@NullableDecl Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fn3e$n */
    /* JADX INFO: compiled from: Functions.java */
    private static class C4245n<K, V> implements t8r<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final Map<K, V> map;

        C4245n(Map<K, V> map) {
            this.map = (Map) jk.a9(map);
        }

        @Override // com.google.common.base.t8r
        public V apply(@NullableDecl K k2) {
            V v2 = this.map.get(k2);
            jk.fn3e(v2 != null || this.map.containsKey(k2), "Key '%s' not present in map", k2);
            return v2;
        }

        @Override // com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4245n) {
                return this.map.equals(((C4245n) obj).map);
            }
            return false;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            return "Functions.forMap(" + this.map + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fn3e$q */
    /* JADX INFO: compiled from: Functions.java */
    private static class C4246q<A, B, C> implements t8r<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f */
        private final t8r<A, ? extends B> f25653f;

        /* JADX INFO: renamed from: g */
        private final t8r<B, C> f25654g;

        public C4246q(t8r<B, C> t8rVar, t8r<A, ? extends B> t8rVar2) {
            this.f25654g = (t8r) jk.a9(t8rVar);
            this.f25653f = (t8r) jk.a9(t8rVar2);
        }

        @Override // com.google.common.base.t8r
        public C apply(@NullableDecl A a2) {
            return (C) this.f25654g.apply(this.f25653f.apply(a2));
        }

        @Override // com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof C4246q)) {
                return false;
            }
            C4246q c4246q = (C4246q) obj;
            return this.f25653f.equals(c4246q.f25653f) && this.f25654g.equals(c4246q.f25654g);
        }

        public int hashCode() {
            return this.f25653f.hashCode() ^ this.f25654g.hashCode();
        }

        public String toString() {
            return this.f25654g + "(" + this.f25653f + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fn3e$s */
    /* JADX INFO: compiled from: Functions.java */
    private enum EnumC4247s implements t8r<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // com.google.common.base.t8r
        public String apply(Object obj) {
            jk.a9(obj);
            return obj.toString();
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    private static class toq<E> implements t8r<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        @NullableDecl
        private final E value;

        public toq(@NullableDecl E e2) {
            this.value = e2;
        }

        @Override // com.google.common.base.t8r
        public E apply(@NullableDecl Object obj) {
            return this.value;
        }

        @Override // com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof toq) {
                return C4280z.m15455k(this.value, ((toq) obj).value);
            }
            return false;
        }

        public int hashCode() {
            E e2 = this.value;
            if (e2 == null) {
                return 0;
            }
            return e2.hashCode();
        }

        public String toString() {
            return "Functions.constant(" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fn3e$y */
    /* JADX INFO: compiled from: Functions.java */
    private static class C4248y<T> implements t8r<Object, T>, Serializable {
        private static final long serialVersionUID = 0;
        private final lvui<T> supplier;

        @Override // com.google.common.base.t8r
        public T apply(@NullableDecl Object obj) {
            return this.supplier.get();
        }

        @Override // com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4248y) {
                return this.supplier.equals(((C4248y) obj).supplier);
            }
            return false;
        }

        public int hashCode() {
            return this.supplier.hashCode();
        }

        public String toString() {
            return "Functions.forSupplier(" + this.supplier + ")";
        }

        private C4248y(lvui<T> lvuiVar) {
            this.supplier = (lvui) jk.a9(lvuiVar);
        }
    }

    /* JADX INFO: compiled from: Functions.java */
    private static class zy<K, V> implements t8r<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @NullableDecl
        final V defaultValue;
        final Map<K, ? extends V> map;

        zy(Map<K, ? extends V> map, @NullableDecl V v2) {
            this.map = (Map) jk.a9(map);
            this.defaultValue = v2;
        }

        @Override // com.google.common.base.t8r
        public V apply(@NullableDecl K k2) {
            V v2 = this.map.get(k2);
            return (v2 != null || this.map.containsKey(k2)) ? v2 : this.defaultValue;
        }

        @Override // com.google.common.base.t8r
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof zy)) {
                return false;
            }
            zy zyVar = (zy) obj;
            return this.map.equals(zyVar.map) && C4280z.m15455k(this.defaultValue, zyVar.defaultValue);
        }

        public int hashCode() {
            return C4280z.toq(this.map, this.defaultValue);
        }

        public String toString() {
            return "Functions.forMap(" + this.map + ", defaultValue=" + this.defaultValue + ")";
        }
    }

    private fn3e() {
    }

    public static <E> t8r<E, E> f7l8() {
        return EnumC4243g.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static <T> t8r<Object, T> m15337g(lvui<T> lvuiVar) {
        return new C4248y(lvuiVar);
    }

    /* JADX INFO: renamed from: k */
    public static <A, B, C> t8r<A, C> m15338k(t8r<B, C> t8rVar, t8r<A, ? extends B> t8rVar2) {
        return new C4246q(t8rVar, t8rVar2);
    }

    /* JADX INFO: renamed from: n */
    public static <T> t8r<T, Boolean> m15339n(a9<T> a9Var) {
        return new f7l8(a9Var);
    }

    /* JADX INFO: renamed from: q */
    public static <K, V> t8r<K, V> m15340q(Map<K, ? extends V> map, @NullableDecl V v2) {
        return new zy(map, v2);
    }

    public static <E> t8r<Object, E> toq(@NullableDecl E e2) {
        return new toq(e2);
    }

    /* JADX INFO: renamed from: y */
    public static t8r<Object, String> m15341y() {
        return EnumC4247s.INSTANCE;
    }

    public static <K, V> t8r<K, V> zy(Map<K, V> map) {
        return new C4245n(map);
    }
}
