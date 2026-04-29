package com.google.common.collect;

import com.google.common.collect.o05;
import com.google.common.collect.z4;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public abstract class b3e<E> extends bek6<E> implements o05<E> {

    /* JADX INFO: renamed from: n */
    @LazyInit
    private transient vep5<o05.InterfaceC4482k<E>> f25964n;

    /* JADX INFO: renamed from: q */
    @LazyInit
    private transient se<E> f25965q;

    /* JADX INFO: renamed from: com.google.common.collect.b3e$k */
    /* JADX INFO: compiled from: ImmutableMultiset.java */
    class C4314k extends ab<E> {

        /* JADX INFO: renamed from: k */
        int f25967k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Iterator f25968n;

        /* JADX INFO: renamed from: q */
        @MonotonicNonNullDecl
        E f25969q;

        C4314k(Iterator it) {
            this.f25968n = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25967k > 0 || this.f25968n.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f25967k <= 0) {
                o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) this.f25968n.next();
                this.f25969q = (E) interfaceC4482k.getElement();
                this.f25967k = interfaceC4482k.getCount();
            }
            this.f25967k--;
            return this.f25969q;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.b3e$q */
    /* JADX INFO: compiled from: ImmutableMultiset.java */
    @wlev.zy
    static class C4315q<E> implements Serializable {
        final b3e<E> multiset;

        C4315q(b3e<E> b3eVar) {
            this.multiset = b3eVar;
        }

        Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    /* JADX INFO: compiled from: ImmutableMultiset.java */
    public static class toq<E> extends z4.toq<E> {

        /* JADX INFO: renamed from: q */
        boolean f25970q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ew<E> f68184toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f68185zy;

        public toq() {
            this(4);
        }

        @NullableDecl
        static <T> ew<T> n7h(Iterable<T> iterable) {
            if (iterable instanceof o5) {
                return ((o5) iterable).contents;
            }
            if (iterable instanceof AbstractC4375g) {
                return ((AbstractC4375g) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public toq<E> f7l8(E e2) {
            return ld6(e2, 1);
        }

        @CanIgnoreReturnValue
        public toq<E> ld6(E e2, int i2) {
            if (i2 == 0) {
                return this;
            }
            if (this.f68185zy) {
                this.f68184toq = new ew<>(this.f68184toq);
                this.f25970q = false;
            }
            this.f68185zy = false;
            com.google.common.base.jk.a9(e2);
            ew<E> ewVar = this.f68184toq;
            ewVar.zurt(e2, i2 + ewVar.f7l8(e2));
            return this;
        }

        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public toq<E> mo15572q(Iterator<? extends E> it) {
            super.mo15572q(it);
            return this;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @CanIgnoreReturnValue
        public toq<E> qrj(E e2, int i2) {
            if (i2 == 0 && !this.f25970q) {
                this.f68184toq = new ix(this.f68184toq);
                this.f25970q = true;
            } else if (this.f68185zy) {
                this.f68184toq = new ew<>(this.f68184toq);
                this.f25970q = false;
            }
            this.f68185zy = false;
            com.google.common.base.jk.a9(e2);
            if (i2 == 0) {
                this.f68184toq.ni7(e2);
            } else {
                this.f68184toq.zurt((E) com.google.common.base.jk.a9(e2), i2);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public toq<E> zy(Iterable<? extends E> iterable) {
            if (iterable instanceof o05) {
                o05 o05VarM15839q = m58i.m15839q(iterable);
                ew ewVarN7h = n7h(o05VarM15839q);
                if (ewVarN7h != null) {
                    ew<E> ewVar = this.f68184toq;
                    ewVar.m15661n(Math.max(ewVar.jk(), ewVarN7h.jk()));
                    for (int iMo15657g = ewVarN7h.mo15657g(); iMo15657g >= 0; iMo15657g = ewVarN7h.mo15659i(iMo15657g)) {
                        ld6(ewVarN7h.m15662p(iMo15657g), ewVarN7h.x2(iMo15657g));
                    }
                } else {
                    Set<o05.InterfaceC4482k<E>> setEntrySet = o05VarM15839q.entrySet();
                    ew<E> ewVar2 = this.f68184toq;
                    ewVar2.m15661n(Math.max(ewVar2.jk(), setEntrySet.size()));
                    for (o05.InterfaceC4482k<E> interfaceC4482k : o05VarM15839q.entrySet()) {
                        ld6(interfaceC4482k.getElement(), interfaceC4482k.getCount());
                    }
                }
            } else {
                super.zy(iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.z4.toq
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public b3e<E> mo15570n() {
            if (this.f68184toq.jk() == 0) {
                return b3e.of();
            }
            if (this.f25970q) {
                this.f68184toq = new ew<>(this.f68184toq);
                this.f25970q = false;
            }
            this.f68185zy = true;
            return new o5(this.f68184toq);
        }

        @Override // com.google.common.collect.z4.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public toq<E> toq(E... eArr) {
            super.toq(eArr);
            return this;
        }

        toq(int i2) {
            this.f68185zy = false;
            this.f25970q = false;
            this.f68184toq = ew.m15654q(i2);
        }

        toq(boolean z2) {
            this.f68185zy = false;
            this.f25970q = false;
            this.f68184toq = null;
        }
    }

    /* JADX INFO: compiled from: ImmutableMultiset.java */
    private final class zy extends ebn<o05.InterfaceC4482k<E>> {
        private static final long serialVersionUID = 0;

        private zy() {
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(Object obj) {
            if (!(obj instanceof o05.InterfaceC4482k)) {
                return false;
            }
            o05.InterfaceC4482k interfaceC4482k = (o05.InterfaceC4482k) obj;
            return interfaceC4482k.getCount() > 0 && b3e.this.count(interfaceC4482k.getElement()) == interfaceC4482k.getCount();
        }

        @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
        public int hashCode() {
            return b3e.this.hashCode();
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return b3e.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b3e.this.elementSet().size();
        }

        @Override // com.google.common.collect.vep5, com.google.common.collect.z4
        @wlev.zy
        Object writeReplace() {
            return new C4315q(b3e.this);
        }

        /* synthetic */ zy(b3e b3eVar, C4314k c4314k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ebn
        public o05.InterfaceC4482k<E> get(int i2) {
            return b3e.this.getEntry(i2);
        }
    }

    b3e() {
    }

    public static <E> toq<E> builder() {
        return new toq<>();
    }

    static <E> b3e<E> copyFromEntries(Collection<? extends o05.InterfaceC4482k<? extends E>> collection) {
        toq toqVar = new toq(collection.size());
        for (o05.InterfaceC4482k<? extends E> interfaceC4482k : collection) {
            toqVar.ld6(interfaceC4482k.getElement(), interfaceC4482k.getCount());
        }
        return toqVar.mo15570n();
    }

    public static <E> b3e<E> copyOf(E[] eArr) {
        return m15568k(eArr);
    }

    /* JADX INFO: renamed from: k */
    private static <E> b3e<E> m15568k(E... eArr) {
        return new toq().toq(eArr).mo15570n();
    }

    public static <E> b3e<E> of() {
        return o5.EMPTY;
    }

    private vep5<o05.InterfaceC4482k<E>> toq() {
        return isEmpty() ? vep5.of() : new zy(this, null);
    }

    @Override // com.google.common.collect.o05
    @CanIgnoreReturnValue
    @Deprecated
    public final int add(E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.z4
    public se<E> asList() {
        se<E> seVar = this.f25965q;
        if (seVar != null) {
            return seVar;
        }
        se<E> seVarAsList = super.asList();
        this.f25965q = seVarAsList;
        return seVarAsList;
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.z4
    @wlev.zy
    int copyIntoArray(Object[] objArr, int i2) {
        ab<o05.InterfaceC4482k<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            o05.InterfaceC4482k<E> next = it.next();
            Arrays.fill(objArr, i2, next.getCount() + i2, next.getElement());
            i2 += next.getCount();
        }
        return i2;
    }

    @Override // com.google.common.collect.o05
    public abstract vep5<E> elementSet();

    @Override // java.util.Collection, com.google.common.collect.o05
    public boolean equals(@NullableDecl Object obj) {
        return m58i.m15840s(this, obj);
    }

    abstract o05.InterfaceC4482k<E> getEntry(int i2);

    @Override // java.util.Collection, com.google.common.collect.o05
    public int hashCode() {
        return g0ad.ld6(entrySet());
    }

    @Override // com.google.common.collect.o05
    @CanIgnoreReturnValue
    @Deprecated
    public final int remove(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o05
    @CanIgnoreReturnValue
    @Deprecated
    public final int setCount(E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.o05
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.z4
    @wlev.zy
    abstract Object writeReplace();

    public static <E> b3e<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof b3e) {
            b3e<E> b3eVar = (b3e) iterable;
            if (!b3eVar.isPartialView()) {
                return b3eVar;
            }
        }
        toq toqVar = new toq(m58i.x2(iterable));
        toqVar.zy(iterable);
        return toqVar.mo15570n();
    }

    public static <E> b3e<E> of(E e2) {
        return m15568k(e2);
    }

    @Override // com.google.common.collect.o05
    public vep5<o05.InterfaceC4482k<E>> entrySet() {
        vep5<o05.InterfaceC4482k<E>> vep5Var = this.f25964n;
        if (vep5Var != null) {
            return vep5Var;
        }
        vep5<o05.InterfaceC4482k<E>> qVar = toq();
        this.f25964n = qVar;
        return qVar;
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<E> iterator() {
        return new C4314k(entrySet().iterator());
    }

    @Override // com.google.common.collect.o05
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean setCount(E e2, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public static <E> b3e<E> of(E e2, E e3) {
        return m15568k(e2, e3);
    }

    public static <E> b3e<E> of(E e2, E e3, E e4) {
        return m15568k(e2, e3, e4);
    }

    public static <E> b3e<E> of(E e2, E e3, E e4, E e6) {
        return m15568k(e2, e3, e4, e6);
    }

    public static <E> b3e<E> of(E e2, E e3, E e4, E e6, E e7) {
        return m15568k(e2, e3, e4, e6, e7);
    }

    public static <E> b3e<E> of(E e2, E e3, E e4, E e6, E e7, E e8, E... eArr) {
        return new toq().mo15569k(e2).mo15569k(e3).mo15569k(e4).mo15569k(e6).mo15569k(e7).mo15569k(e8).toq(eArr).mo15570n();
    }

    public static <E> b3e<E> copyOf(Iterator<? extends E> it) {
        return new toq().mo15572q(it).mo15570n();
    }
}
