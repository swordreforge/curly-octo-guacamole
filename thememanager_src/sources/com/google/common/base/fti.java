package com.google.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Predicates.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class fti {

    /* JADX INFO: compiled from: Predicates.java */
    @wlev.zy
    private static class f7l8 implements a9<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        @Override // com.google.common.base.a9
        public boolean apply(@NullableDecl Object obj) {
            return this.clazz.isInstance(obj);
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof f7l8) && this.clazz == ((f7l8) obj).clazz;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.clazz.getName() + ")";
        }

        private f7l8(Class<?> cls) {
            this.clazz = (Class) jk.a9(cls);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fti$g */
    /* JADX INFO: compiled from: Predicates.java */
    private static class C4249g<T> implements a9<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        @Override // com.google.common.base.a9
        public boolean apply(@NullableDecl T t2) {
            try {
                return this.target.contains(t2);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4249g) {
                return this.target.equals(((C4249g) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.target + ")";
        }

        private C4249g(Collection<?> collection) {
            this.target = (Collection) jk.a9(collection);
        }
    }

    /* JADX INFO: compiled from: Predicates.java */
    private static class ld6<T> implements a9<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends a9<? super T>> components;

        @Override // com.google.common.base.a9
        public boolean apply(@NullableDecl T t2) {
            for (int i2 = 0; i2 < this.components.size(); i2++) {
                if (this.components.get(i2).apply(t2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof ld6) {
                return this.components.equals(((ld6) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        public String toString() {
            return fti.ni7("or", this.components);
        }

        private ld6(List<? extends a9<? super T>> list) {
            this.components = list;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fti$n */
    /* JADX INFO: compiled from: Predicates.java */
    @wlev.zy
    private static class C4251n implements a9<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final AbstractC4279y pattern;

        C4251n(AbstractC4279y abstractC4279y) {
            this.pattern = (AbstractC4279y) jk.a9(abstractC4279y);
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof C4251n)) {
                return false;
            }
            C4251n c4251n = (C4251n) obj;
            return C4280z.m15455k(this.pattern.pattern(), c4251n.pattern.pattern()) && this.pattern.flags() == c4251n.pattern.flags();
        }

        public int hashCode() {
            return C4280z.toq(this.pattern.pattern(), Integer.valueOf(this.pattern.flags()));
        }

        public String toString() {
            return "Predicates.contains(" + fu4.zy(this.pattern).m15356g("pattern", this.pattern.pattern()).m15360q("pattern.flags", this.pattern.flags()).toString() + ")";
        }

        @Override // com.google.common.base.a9
        public boolean apply(CharSequence charSequence) {
            return this.pattern.matcher(charSequence).toq();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.base.fti$p */
    /* JADX INFO: compiled from: Predicates.java */
    static abstract class EnumC4252p implements a9<Object> {
        public static final EnumC4252p ALWAYS_FALSE;
        public static final EnumC4252p ALWAYS_TRUE;
        public static final EnumC4252p IS_NULL;
        public static final EnumC4252p NOT_NULL;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC4252p[] f25656k;

        /* JADX INFO: renamed from: com.google.common.base.fti$p$k */
        /* JADX INFO: compiled from: Predicates.java */
        enum k extends EnumC4252p {
            k(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.base.a9
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.fti$p$q */
        /* JADX INFO: compiled from: Predicates.java */
        enum q extends EnumC4252p {
            q(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.base.a9
            public boolean apply(@NullableDecl Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.fti$p$toq */
        /* JADX INFO: compiled from: Predicates.java */
        enum toq extends EnumC4252p {
            toq(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.base.a9
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.fti$p$zy */
        /* JADX INFO: compiled from: Predicates.java */
        enum zy extends EnumC4252p {
            zy(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.base.a9
            public boolean apply(@NullableDecl Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        static {
            k kVar = new k("ALWAYS_TRUE", 0);
            ALWAYS_TRUE = kVar;
            toq toqVar = new toq("ALWAYS_FALSE", 1);
            ALWAYS_FALSE = toqVar;
            zy zyVar = new zy("IS_NULL", 2);
            IS_NULL = zyVar;
            q qVar = new q("NOT_NULL", 3);
            NOT_NULL = qVar;
            f25656k = new EnumC4252p[]{kVar, toqVar, zyVar, qVar};
        }

        private EnumC4252p(String str, int i2) {
        }

        public static EnumC4252p valueOf(String str) {
            return (EnumC4252p) Enum.valueOf(EnumC4252p.class, str);
        }

        public static EnumC4252p[] values() {
            return (EnumC4252p[]) f25656k.clone();
        }

        <T> a9<T> withNarrowedType() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fti$q */
    /* JADX INFO: compiled from: Predicates.java */
    @wlev.zy
    private static class C4253q extends C4251n {
        private static final long serialVersionUID = 0;

        C4253q(String str) {
            super(mcp.m15407k(str));
        }

        @Override // com.google.common.base.fti.C4251n
        public String toString() {
            return "Predicates.containsPattern(" + this.pattern.pattern() + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fti$s */
    /* JADX INFO: compiled from: Predicates.java */
    private static class C4254s<T> implements a9<T>, Serializable {
        private static final long serialVersionUID = 0;
        final a9<T> predicate;

        C4254s(a9<T> a9Var) {
            this.predicate = (a9) jk.a9(a9Var);
        }

        @Override // com.google.common.base.a9
        public boolean apply(@NullableDecl T t2) {
            return !this.predicate.apply(t2);
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4254s) {
                return this.predicate.equals(((C4254s) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.predicate + ")";
        }
    }

    /* JADX INFO: compiled from: Predicates.java */
    private static class toq<T> implements a9<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends a9<? super T>> components;

        @Override // com.google.common.base.a9
        public boolean apply(@NullableDecl T t2) {
            for (int i2 = 0; i2 < this.components.size(); i2++) {
                if (!this.components.get(i2).apply(t2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof toq) {
                return this.components.equals(((toq) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return fti.ni7("and", this.components);
        }

        private toq(List<? extends a9<? super T>> list) {
            this.components = list;
        }
    }

    /* JADX INFO: compiled from: Predicates.java */
    @wlev.zy
    private static class x2 implements a9<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof x2) && this.clazz == ((x2) obj).clazz;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.clazz.getName() + ")";
        }

        private x2(Class<?> cls) {
            this.clazz = (Class) jk.a9(cls);
        }

        @Override // com.google.common.base.a9
        public boolean apply(Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.fti$y */
    /* JADX INFO: compiled from: Predicates.java */
    private static class C4255y<T> implements a9<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final T target;

        @Override // com.google.common.base.a9
        public boolean apply(T t2) {
            return this.target.equals(t2);
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4255y) {
                return this.target.equals(((C4255y) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.target + ")";
        }

        private C4255y(T t2) {
            this.target = t2;
        }
    }

    /* JADX INFO: compiled from: Predicates.java */
    private static class zy<A, B> implements a9<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f */
        final t8r<A, ? extends B> f25657f;

        /* JADX INFO: renamed from: p */
        final a9<B> f25658p;

        @Override // com.google.common.base.a9
        public boolean apply(@NullableDecl A a2) {
            return this.f25658p.apply(this.f25657f.apply(a2));
        }

        @Override // com.google.common.base.a9
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof zy)) {
                return false;
            }
            zy zyVar = (zy) obj;
            return this.f25657f.equals(zyVar.f25657f) && this.f25658p.equals(zyVar.f25658p);
        }

        public int hashCode() {
            return this.f25657f.hashCode() ^ this.f25658p.hashCode();
        }

        public String toString() {
            return this.f25658p + "(" + this.f25657f + ")";
        }

        private zy(a9<B> a9Var, t8r<A, ? extends B> t8rVar) {
            this.f25658p = (a9) jk.a9(a9Var);
            this.f25657f = (t8r) jk.a9(t8rVar);
        }
    }

    private fti() {
    }

    public static <T> a9<T> cdj(a9<T> a9Var) {
        return new C4254s(a9Var);
    }

    private static <T> List<a9<? super T>> f7l8(a9<? super T> a9Var, a9<? super T> a9Var2) {
        return Arrays.asList(a9Var, a9Var2);
    }

    @SafeVarargs
    public static <T> a9<T> fn3e(a9<? super T>... a9VarArr) {
        return new ld6(x2(a9VarArr));
    }

    @SafeVarargs
    /* JADX INFO: renamed from: g */
    public static <T> a9<T> m15342g(a9<? super T>... a9VarArr) {
        return new toq(x2(a9VarArr));
    }

    @wlev.toq(serializable = true)
    /* JADX INFO: renamed from: h */
    public static <T> a9<T> m15343h() {
        return EnumC4252p.IS_NULL.withNarrowedType();
    }

    /* JADX INFO: renamed from: i */
    public static <T> a9<T> m15344i(Iterable<? extends a9<? super T>> iterable) {
        return new ld6(ld6(iterable));
    }

    @wlev.toq(serializable = true)
    public static <T> a9<T> ki() {
        return EnumC4252p.NOT_NULL.withNarrowedType();
    }

    @wlev.zy
    public static a9<Object> kja0(Class<?> cls) {
        return new f7l8(cls);
    }

    static <T> List<T> ld6(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(jk.a9(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static <T> a9<T> m15346n(Iterable<? extends a9<? super T>> iterable) {
        return new toq(ld6(iterable));
    }

    public static <T> a9<T> n7h(Collection<? extends T> collection) {
        return new C4249g(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ni7(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z2 = true;
        for (Object obj : iterable) {
            if (!z2) {
                sb.append(',');
            }
            sb.append(obj);
            z2 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @wlev.zy
    /* JADX INFO: renamed from: p */
    public static a9<CharSequence> m15347p(String str) {
        return new C4253q(str);
    }

    /* JADX INFO: renamed from: q */
    public static <T> a9<T> m15348q(a9<? super T> a9Var, a9<? super T> a9Var2) {
        return new toq(f7l8((a9) jk.a9(a9Var), (a9) jk.a9(a9Var2)));
    }

    public static <T> a9<T> qrj(@NullableDecl T t2) {
        return t2 == null ? m15343h() : new C4255y(t2);
    }

    @wlev.zy("java.util.regex.Pattern")
    /* JADX INFO: renamed from: s */
    public static a9<CharSequence> m15349s(Pattern pattern) {
        return new C4251n(new zurt(pattern));
    }

    public static <T> a9<T> t8r(a9<? super T> a9Var, a9<? super T> a9Var2) {
        return new ld6(f7l8((a9) jk.a9(a9Var), (a9) jk.a9(a9Var2)));
    }

    @wlev.toq(serializable = true)
    public static <T> a9<T> toq() {
        return EnumC4252p.ALWAYS_FALSE.withNarrowedType();
    }

    private static <T> List<T> x2(T... tArr) {
        return ld6(Arrays.asList(tArr));
    }

    /* JADX INFO: renamed from: y */
    public static <A, B> a9<A> m15350y(a9<B> a9Var, t8r<A, ? extends B> t8rVar) {
        return new zy(a9Var, t8rVar);
    }

    @InterfaceC7731k
    @wlev.zy
    public static a9<Class<?>> zurt(Class<?> cls) {
        return new x2(cls);
    }

    @wlev.toq(serializable = true)
    public static <T> a9<T> zy() {
        return EnumC4252p.ALWAYS_TRUE.withNarrowedType();
    }
}
