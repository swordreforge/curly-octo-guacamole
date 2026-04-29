package com.google.common.collect;

import com.google.common.collect.ob;
import com.google.common.collect.se;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableRangeMap.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public class cv06<K extends Comparable<?>, V> implements ra<K, V>, Serializable {

    /* JADX INFO: renamed from: n */
    private static final cv06<Comparable<?>, Object> f26028n = new cv06<>(se.of(), se.of());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: k */
    private final transient se<ps<K>> f26029k;

    /* JADX INFO: renamed from: q */
    private final transient se<V> f26030q;

    /* JADX INFO: renamed from: com.google.common.collect.cv06$k */
    /* JADX INFO: compiled from: ImmutableRangeMap.java */
    class C4330k extends se<ps<K>> {
        final /* synthetic */ int val$len;
        final /* synthetic */ int val$off;
        final /* synthetic */ ps val$range;

        C4330k(int i2, int i3, ps psVar) {
            this.val$len = i2;
            this.val$off = i3;
            this.val$range = psVar;
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.val$len;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public ps<K> get(int i2) {
            com.google.common.base.jk.mcp(i2, this.val$len);
            return (i2 == 0 || i2 == this.val$len + (-1)) ? ((ps) cv06.this.f26029k.get(i2 + this.val$off)).intersection(this.val$range) : (ps) cv06.this.f26029k.get(i2 + this.val$off);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.cv06$q */
    /* JADX INFO: compiled from: ImmutableRangeMap.java */
    private static class C4331q<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final zkd<ps<K>, V> mapOfRanges;

        C4331q(zkd<ps<K>, V> zkdVar) {
            this.mapOfRanges = zkdVar;
        }

        Object createRangeMap() {
            zy zyVar = new zy();
            ab<Map.Entry<ps<K>, V>> it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ps<K>, V> next = it.next();
                zyVar.toq(next.getKey(), next.getValue());
            }
            return zyVar.m15596k();
        }

        Object readResolve() {
            return this.mapOfRanges.isEmpty() ? cv06.of() : createRangeMap();
        }
    }

    /* JADX INFO: compiled from: ImmutableRangeMap.java */
    class toq extends cv06<K, V> {
        final /* synthetic */ cv06 val$outer;
        final /* synthetic */ ps val$range;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(se seVar, se seVar2, ps psVar, cv06 cv06Var) {
            super(seVar, seVar2);
            this.val$range = psVar;
            this.val$outer = cv06Var;
        }

        @Override // com.google.common.collect.cv06, com.google.common.collect.ra
        public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
            return super.asDescendingMapOfRanges();
        }

        @Override // com.google.common.collect.cv06, com.google.common.collect.ra
        public /* bridge */ /* synthetic */ Map asMapOfRanges() {
            return super.asMapOfRanges();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.cv06, com.google.common.collect.ra
        public cv06<K, V> subRangeMap(ps<K> psVar) {
            return this.val$range.isConnected(psVar) ? this.val$outer.subRangeMap((ps) psVar.intersection(this.val$range)) : cv06.of();
        }
    }

    /* JADX INFO: compiled from: ImmutableRangeMap.java */
    public static final class zy<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: k */
        private final List<Map.Entry<ps<K>, V>> f26031k = wlev.cdj();

        /* JADX INFO: renamed from: k */
        public cv06<K, V> m15596k() {
            Collections.sort(this.f26031k, ps.rangeLexOrdering().onKeys());
            se.C4520k c4520k = new se.C4520k(this.f26031k.size());
            se.C4520k c4520k2 = new se.C4520k(this.f26031k.size());
            for (int i2 = 0; i2 < this.f26031k.size(); i2++) {
                ps<K> key = this.f26031k.get(i2).getKey();
                if (i2 > 0) {
                    ps<K> key2 = this.f26031k.get(i2 - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + key2 + " overlaps with entry " + key);
                    }
                }
                c4520k.mo15569k(key);
                c4520k2.mo15569k(this.f26031k.get(i2).getValue());
            }
            return new cv06<>(c4520k.mo15570n(), c4520k2.mo15570n());
        }

        @CanIgnoreReturnValue
        public zy<K, V> toq(ps<K> psVar, V v2) {
            com.google.common.base.jk.a9(psVar);
            com.google.common.base.jk.a9(v2);
            com.google.common.base.jk.fn3e(!psVar.isEmpty(), "Range must not be empty, but was %s", psVar);
            this.f26031k.add(vy.dd(psVar, v2));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public zy<K, V> zy(ra<K, ? extends V> raVar) {
            for (Map.Entry entry : raVar.asMapOfRanges().entrySet()) {
                toq((ps) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    cv06(se<ps<K>> seVar, se<V> seVar2) {
        this.f26029k = seVar;
        this.f26030q = seVar2;
    }

    public static <K extends Comparable<?>, V> zy<K, V> builder() {
        return new zy<>();
    }

    public static <K extends Comparable<?>, V> cv06<K, V> copyOf(ra<K, ? extends V> raVar) {
        if (raVar instanceof cv06) {
            return (cv06) raVar;
        }
        Map<ps<K>, ? extends V> mapAsMapOfRanges = raVar.asMapOfRanges();
        se.C4520k c4520k = new se.C4520k(mapAsMapOfRanges.size());
        se.C4520k c4520k2 = new se.C4520k(mapAsMapOfRanges.size());
        for (Map.Entry entry : mapAsMapOfRanges.entrySet()) {
            c4520k.mo15569k(entry.getKey());
            c4520k2.mo15569k(entry.getValue());
        }
        return new cv06<>(c4520k.mo15570n(), c4520k2.mo15570n());
    }

    public static <K extends Comparable<?>, V> cv06<K, V> of() {
        return (cv06<K, V>) f26028n;
    }

    @Override // com.google.common.collect.ra
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ra
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof ra) {
            return asMapOfRanges().equals(((ra) obj).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.ra
    @NullableDecl
    public V get(K k2) {
        int iM15920k = ob.m15920k(this.f26029k, ps.lowerBoundFn(), ncyb.belowValue(k2), ob.zy.ANY_PRESENT, ob.toq.NEXT_LOWER);
        if (iM15920k != -1 && this.f26029k.get(iM15920k).contains(k2)) {
            return this.f26030q.get(iM15920k);
        }
        return null;
    }

    @Override // com.google.common.collect.ra
    @NullableDecl
    public Map.Entry<ps<K>, V> getEntry(K k2) {
        int iM15920k = ob.m15920k(this.f26029k, ps.lowerBoundFn(), ncyb.belowValue(k2), ob.zy.ANY_PRESENT, ob.toq.NEXT_LOWER);
        if (iM15920k == -1) {
            return null;
        }
        ps<K> psVar = this.f26029k.get(iM15920k);
        if (psVar.contains(k2)) {
            return vy.dd(psVar, this.f26030q.get(iM15920k));
        }
        return null;
    }

    @Override // com.google.common.collect.ra
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.ra
    @Deprecated
    public void put(ps<K> psVar, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ra
    @Deprecated
    public void putAll(ra<K, V> raVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ra
    @Deprecated
    public void putCoalescing(ps<K> psVar, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ra
    @Deprecated
    public void remove(ps<K> psVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ra
    public ps<K> span() {
        if (this.f26029k.isEmpty()) {
            throw new NoSuchElementException();
        }
        return ps.create(this.f26029k.get(0).lowerBound, this.f26029k.get(r1.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.ra
    public String toString() {
        return asMapOfRanges().toString();
    }

    Object writeReplace() {
        return new C4331q(asMapOfRanges());
    }

    public static <K extends Comparable<?>, V> cv06<K, V> of(ps<K> psVar, V v2) {
        return new cv06<>(se.of(psVar), se.of(v2));
    }

    @Override // com.google.common.collect.ra
    public zkd<ps<K>, V> asDescendingMapOfRanges() {
        return this.f26029k.isEmpty() ? zkd.of() : new jbh(new l05(this.f26029k.reverse(), ps.rangeLexOrdering().reverse()), this.f26030q.reverse());
    }

    @Override // com.google.common.collect.ra
    public zkd<ps<K>, V> asMapOfRanges() {
        return this.f26029k.isEmpty() ? zkd.of() : new jbh(new l05(this.f26029k, ps.rangeLexOrdering()), this.f26030q);
    }

    @Override // com.google.common.collect.ra
    public cv06<K, V> subRangeMap(ps<K> psVar) {
        if (((ps) com.google.common.base.jk.a9(psVar)).isEmpty()) {
            return of();
        }
        if (this.f26029k.isEmpty() || psVar.encloses(span())) {
            return this;
        }
        se<ps<K>> seVar = this.f26029k;
        com.google.common.base.t8r t8rVarUpperBoundFn = ps.upperBoundFn();
        Comparable comparable = psVar.lowerBound;
        ob.zy zyVar = ob.zy.FIRST_AFTER;
        ob.toq toqVar = ob.toq.NEXT_HIGHER;
        int iM15920k = ob.m15920k(seVar, t8rVarUpperBoundFn, comparable, zyVar, toqVar);
        int iM15920k2 = ob.m15920k(this.f26029k, ps.lowerBoundFn(), psVar.upperBound, ob.zy.ANY_PRESENT, toqVar);
        return iM15920k >= iM15920k2 ? of() : new toq(new C4330k(iM15920k2 - iM15920k, iM15920k, psVar), this.f26030q.subList(iM15920k, iM15920k2), psVar, this);
    }
}
