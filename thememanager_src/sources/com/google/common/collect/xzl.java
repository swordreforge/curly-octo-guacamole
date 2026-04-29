package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: TreeRangeSet.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public class xzl<C extends Comparable<?>> extends ld6<C> implements Serializable {

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient Set<ps<C>> f26701k;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    private transient nnh<C> f26702n;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient Set<ps<C>> f26703q;

    @InterfaceC7732q
    final NavigableMap<ncyb<C>, ps<C>> rangesByLowerBound;

    /* JADX INFO: compiled from: TreeRangeSet.java */
    private static final class f7l8<C extends Comparable<?>> extends AbstractC4510p<ncyb<C>, ps<C>> {

        /* JADX INFO: renamed from: g */
        private final NavigableMap<ncyb<C>, ps<C>> f26704g;

        /* JADX INFO: renamed from: k */
        private final ps<ncyb<C>> f26705k;

        /* JADX INFO: renamed from: n */
        private final NavigableMap<ncyb<C>, ps<C>> f26706n;

        /* JADX INFO: renamed from: q */
        private final ps<C> f26707q;

        /* JADX INFO: renamed from: com.google.common.collect.xzl$f7l8$k */
        /* JADX INFO: compiled from: TreeRangeSet.java */
        class C4574k extends com.google.common.collect.zy<Map.Entry<ncyb<C>, ps<C>>> {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ ncyb f26708g;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26709n;

            C4574k(Iterator it, ncyb ncybVar) {
                this.f26709n = it;
                this.f26708g = ncybVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ncyb<C>, ps<C>> mo15703k() {
                if (!this.f26709n.hasNext()) {
                    return (Map.Entry) toq();
                }
                ps psVar = (ps) this.f26709n.next();
                if (this.f26708g.isLessThan(psVar.lowerBound)) {
                    return (Map.Entry) toq();
                }
                ps psVarIntersection = psVar.intersection(f7l8.this.f26707q);
                return vy.dd(psVarIntersection.lowerBound, psVarIntersection);
            }
        }

        /* JADX INFO: compiled from: TreeRangeSet.java */
        class toq extends com.google.common.collect.zy<Map.Entry<ncyb<C>, ps<C>>> {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26712n;

            toq(Iterator it) {
                this.f26712n = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
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
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ncyb<C>, ps<C>> mo15703k() {
                if (!this.f26712n.hasNext()) {
                    return (Map.Entry) toq();
                }
                ps psVar = (ps) this.f26712n.next();
                if (f7l8.this.f26707q.lowerBound.compareTo((ncyb) psVar.upperBound) >= 0) {
                    return (Map.Entry) toq();
                }
                ps psVarIntersection = psVar.intersection(f7l8.this.f26707q);
                return f7l8.this.f26705k.contains(psVarIntersection.lowerBound) ? vy.dd(psVarIntersection.lowerBound, psVarIntersection) : (Map.Entry) toq();
            }
        }

        /* JADX INFO: renamed from: p */
        private NavigableMap<ncyb<C>, ps<C>> m16083p(ps<ncyb<C>> psVar) {
            return !psVar.isConnected(this.f26705k) ? jbh.of() : new f7l8(this.f26705k.intersection(psVar), this.f26707q, this.f26706n);
        }

        @Override // java.util.SortedMap
        public Comparator<? super ncyb<C>> comparator() {
            return kx3.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> headMap(ncyb<C> ncybVar, boolean z2) {
            return m16083p(ps.upTo(ncybVar, fu4.forBoolean(z2)));
        }

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
        @Override // com.google.common.collect.AbstractC4510p, java.util.AbstractMap, java.util.Map
        @NullableDecl
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ps<C> get(@NullableDecl Object obj) {
            if (obj instanceof ncyb) {
                try {
                    ncyb<C> ncybVar = (ncyb) obj;
                    if (this.f26705k.contains(ncybVar) && ncybVar.compareTo((ncyb) this.f26707q.lowerBound) >= 0 && ncybVar.compareTo((ncyb) this.f26707q.upperBound) < 0) {
                        if (ncybVar.equals(this.f26707q.lowerBound)) {
                            ps psVar = (ps) vy.py(this.f26706n.floorEntry(ncybVar));
                            if (psVar != null && psVar.upperBound.compareTo((ncyb) this.f26707q.lowerBound) > 0) {
                                return psVar.intersection(this.f26707q);
                            }
                        } else {
                            ps<C> psVar2 = this.f26706n.get(ncybVar);
                            if (psVar2 != null) {
                                return psVar2.intersection(this.f26707q);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

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
        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<ncyb<C>, ps<C>>> mo15684k() {
            Iterator<ps<C>> it;
            if (this.f26707q.isEmpty()) {
                return zwy.fn3e();
            }
            if (this.f26705k.upperBound.isLessThan(this.f26707q.lowerBound)) {
                return zwy.fn3e();
            }
            if (this.f26705k.lowerBound.isLessThan(this.f26707q.lowerBound)) {
                it = this.f26704g.tailMap(this.f26707q.lowerBound, false).values().iterator();
            } else {
                it = this.f26706n.tailMap(this.f26705k.lowerBound.endpoint(), this.f26705k.lowerBoundType() == fu4.CLOSED).values().iterator();
            }
            return new C4574k(it, (ncyb) kx3.natural().min(this.f26705k.upperBound, ncyb.belowValue(this.f26707q.upperBound)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> tailMap(ncyb<C> ncybVar, boolean z2) {
            return m16083p(ps.downTo(ncybVar, fu4.forBoolean(z2)));
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            return zwy.m16119e(mo15684k());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.google.common.collect.AbstractC4510p
        Iterator<Map.Entry<ncyb<C>, ps<C>>> toq() {
            if (this.f26707q.isEmpty()) {
                return zwy.fn3e();
            }
            ncyb ncybVar = (ncyb) kx3.natural().min(this.f26705k.upperBound, ncyb.belowValue(this.f26707q.upperBound));
            return new toq(this.f26706n.headMap((ncyb<C>) ncybVar.endpoint(), ncybVar.typeAsUpperBound() == fu4.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> subMap(ncyb<C> ncybVar, boolean z2, ncyb<C> ncybVar2, boolean z3) {
            return m16083p(ps.range(ncybVar, fu4.forBoolean(z2), ncybVar2, fu4.forBoolean(z3)));
        }

        private f7l8(ps<ncyb<C>> psVar, ps<C> psVar2, NavigableMap<ncyb<C>, ps<C>> navigableMap) {
            this.f26705k = (ps) com.google.common.base.jk.a9(psVar);
            this.f26707q = (ps) com.google.common.base.jk.a9(psVar2);
            this.f26706n = (NavigableMap) com.google.common.base.jk.a9(navigableMap);
            this.f26704g = new C4577n(navigableMap);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.xzl$g */
    /* JADX INFO: compiled from: TreeRangeSet.java */
    private final class C4575g extends xzl<C> {
        private final ps<C> restriction;

        /* JADX WARN: Illegal instructions before constructor call */
        C4575g(ps<C> psVar) {
            super(new f7l8(ps.all(), psVar, xzl.this.rangesByLowerBound));
            this.restriction = psVar;
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        public void add(ps<C> psVar) {
            com.google.common.base.jk.m15391z(this.restriction.encloses(psVar), "Cannot add range %s to subRangeSet(%s)", psVar, this.restriction);
            super.add(psVar);
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        public void clear() {
            xzl.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        public boolean contains(C c2) {
            return this.restriction.contains(c2) && xzl.this.contains(c2);
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        public boolean encloses(ps<C> psVar) {
            ps psVarM16082k;
            return (this.restriction.isEmpty() || !this.restriction.encloses(psVar) || (psVarM16082k = xzl.this.m16082k(psVar)) == null || psVarM16082k.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        @NullableDecl
        public ps<C> rangeContaining(C c2) {
            ps<C> psVarRangeContaining;
            if (this.restriction.contains(c2) && (psVarRangeContaining = xzl.this.rangeContaining(c2)) != null) {
                return psVarRangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        public void remove(ps<C> psVar) {
            if (psVar.isConnected(this.restriction)) {
                xzl.this.remove(psVar.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.nnh
        public nnh<C> subRangeSet(ps<C> psVar) {
            return psVar.encloses(this.restriction) ? this : psVar.isConnected(this.restriction) ? new C4575g(this.restriction.intersection(psVar)) : h7am.of();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.xzl$q */
    /* JADX INFO: compiled from: TreeRangeSet.java */
    private static final class C4578q<C extends Comparable<?>> extends AbstractC4510p<ncyb<C>, ps<C>> {

        /* JADX INFO: renamed from: k */
        private final NavigableMap<ncyb<C>, ps<C>> f26719k;

        /* JADX INFO: renamed from: n */
        private final ps<ncyb<C>> f26720n;

        /* JADX INFO: renamed from: q */
        private final NavigableMap<ncyb<C>, ps<C>> f26721q;

        /* JADX INFO: renamed from: com.google.common.collect.xzl$q$k */
        /* JADX INFO: compiled from: TreeRangeSet.java */
        class k extends com.google.common.collect.zy<Map.Entry<ncyb<C>, ps<C>>> {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ ncyb f26722g;

            /* JADX INFO: renamed from: n */
            ncyb<C> f26723n;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC4555w f26725y;

            k(ncyb ncybVar, InterfaceC4555w interfaceC4555w) {
                this.f26722g = ncybVar;
                this.f26725y = interfaceC4555w;
                this.f26723n = ncybVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ncyb<C>, ps<C>> mo15703k() {
                ps psVarCreate;
                if (C4578q.this.f26720n.upperBound.isLessThan(this.f26723n) || this.f26723n == ncyb.aboveAll()) {
                    return (Map.Entry) toq();
                }
                if (this.f26725y.hasNext()) {
                    ps psVar = (ps) this.f26725y.next();
                    psVarCreate = ps.create(this.f26723n, psVar.lowerBound);
                    this.f26723n = psVar.upperBound;
                } else {
                    psVarCreate = ps.create(this.f26723n, ncyb.aboveAll());
                    this.f26723n = ncyb.aboveAll();
                }
                return vy.dd(psVarCreate.lowerBound, psVarCreate);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.xzl$q$toq */
        /* JADX INFO: compiled from: TreeRangeSet.java */
        class toq extends com.google.common.collect.zy<Map.Entry<ncyb<C>, ps<C>>> {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ ncyb f26726g;

            /* JADX INFO: renamed from: n */
            ncyb<C> f26727n;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC4555w f26729y;

            toq(ncyb ncybVar, InterfaceC4555w interfaceC4555w) {
                this.f26726g = ncybVar;
                this.f26729y = interfaceC4555w;
                this.f26727n = ncybVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
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
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ncyb<C>, ps<C>> mo15703k() {
                if (this.f26727n == ncyb.belowAll()) {
                    return (Map.Entry) toq();
                }
                if (this.f26729y.hasNext()) {
                    ps psVar = (ps) this.f26729y.next();
                    ps psVarCreate = ps.create(psVar.upperBound, this.f26727n);
                    this.f26727n = psVar.lowerBound;
                    if (C4578q.this.f26720n.lowerBound.isLessThan(psVarCreate.lowerBound)) {
                        return vy.dd(psVarCreate.lowerBound, psVarCreate);
                    }
                } else if (C4578q.this.f26720n.lowerBound.isLessThan(ncyb.belowAll())) {
                    ps psVarCreate2 = ps.create(ncyb.belowAll(), this.f26727n);
                    this.f26727n = ncyb.belowAll();
                    return vy.dd(ncyb.belowAll(), psVarCreate2);
                }
                return (Map.Entry) toq();
            }
        }

        C4578q(NavigableMap<ncyb<C>, ps<C>> navigableMap) {
            this(navigableMap, ps.all());
        }

        /* JADX INFO: renamed from: y */
        private NavigableMap<ncyb<C>, ps<C>> m16095y(ps<ncyb<C>> psVar) {
            if (!this.f26720n.isConnected(psVar)) {
                return jbh.of();
            }
            return new C4578q(this.f26719k, psVar.intersection(this.f26720n));
        }

        @Override // java.util.SortedMap
        public Comparator<? super ncyb<C>> comparator() {
            return kx3.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> subMap(ncyb<C> ncybVar, boolean z2, ncyb<C> ncybVar2, boolean z3) {
            return m16095y(ps.range(ncybVar, fu4.forBoolean(z2), ncybVar2, fu4.forBoolean(z3)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> headMap(ncyb<C> ncybVar, boolean z2) {
            return m16095y(ps.upTo(ncybVar, fu4.forBoolean(z2)));
        }

        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<ncyb<C>, ps<C>>> mo15684k() {
            Collection<ps<C>> collectionValues;
            ncyb ncybVarBelowAll;
            if (this.f26720n.hasLowerBound()) {
                collectionValues = this.f26721q.tailMap((ncyb<C>) this.f26720n.lowerEndpoint(), this.f26720n.lowerBoundType() == fu4.CLOSED).values();
            } else {
                collectionValues = this.f26721q.values();
            }
            InterfaceC4555w interfaceC4555wHyr = zwy.hyr(collectionValues.iterator());
            if (this.f26720n.contains(ncyb.belowAll()) && (!interfaceC4555wHyr.hasNext() || ((ps) interfaceC4555wHyr.peek()).lowerBound != ncyb.belowAll())) {
                ncybVarBelowAll = ncyb.belowAll();
            } else {
                if (!interfaceC4555wHyr.hasNext()) {
                    return zwy.fn3e();
                }
                ncybVarBelowAll = ((ps) interfaceC4555wHyr.next()).upperBound;
            }
            return new k(ncybVarBelowAll, interfaceC4555wHyr);
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> tailMap(ncyb<C> ncybVar, boolean z2) {
            return m16095y(ps.downTo(ncybVar, fu4.forBoolean(z2)));
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.AbstractMap, java.util.Map
        @NullableDecl
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public ps<C> get(Object obj) {
            if (obj instanceof ncyb) {
                try {
                    ncyb<C> ncybVar = (ncyb) obj;
                    Map.Entry<ncyb<C>, ps<C>> entryFirstEntry = tailMap(ncybVar, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(ncybVar)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            return zwy.m16119e(mo15684k());
        }

        @Override // com.google.common.collect.AbstractC4510p
        Iterator<Map.Entry<ncyb<C>, ps<C>>> toq() {
            ncyb<C> ncybVarHigherKey;
            InterfaceC4555w interfaceC4555wHyr = zwy.hyr(this.f26721q.headMap(this.f26720n.hasUpperBound() ? (ncyb) this.f26720n.upperEndpoint() : ncyb.aboveAll(), this.f26720n.hasUpperBound() && this.f26720n.upperBoundType() == fu4.CLOSED).descendingMap().values().iterator());
            if (interfaceC4555wHyr.hasNext()) {
                ncybVarHigherKey = ((ps) interfaceC4555wHyr.peek()).upperBound == ncyb.aboveAll() ? ((ps) interfaceC4555wHyr.next()).lowerBound : this.f26719k.higherKey(((ps) interfaceC4555wHyr.peek()).upperBound);
            } else {
                if (!this.f26720n.contains(ncyb.belowAll()) || this.f26719k.containsKey(ncyb.belowAll())) {
                    return zwy.fn3e();
                }
                ncybVarHigherKey = this.f26719k.higherKey(ncyb.belowAll());
            }
            return new toq((ncyb) com.google.common.base.fu4.m15351k(ncybVarHigherKey, ncyb.aboveAll()), interfaceC4555wHyr);
        }

        private C4578q(NavigableMap<ncyb<C>, ps<C>> navigableMap, ps<ncyb<C>> psVar) {
            this.f26719k = navigableMap;
            this.f26721q = new C4577n(navigableMap);
            this.f26720n = psVar;
        }
    }

    /* JADX INFO: compiled from: TreeRangeSet.java */
    final class toq extends AbstractC4572x<ps<C>> implements Set<ps<C>> {

        /* JADX INFO: renamed from: k */
        final Collection<ps<C>> f26730k;

        toq(Collection<ps<C>> collection) {
            this.f26730k = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return g0ad.f7l8(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return g0ad.ld6(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Collection<ps<C>> delegate() {
            return this.f26730k;
        }
    }

    /* JADX INFO: compiled from: TreeRangeSet.java */
    private final class zy extends xzl<C> {
        zy() {
            super(new C4578q(xzl.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        public void add(ps<C> psVar) {
            xzl.this.remove(psVar);
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.nnh
        public nnh<C> complement() {
            return xzl.this;
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        public boolean contains(C c2) {
            return !xzl.this.contains(c2);
        }

        @Override // com.google.common.collect.xzl, com.google.common.collect.ld6, com.google.common.collect.nnh
        public void remove(ps<C> psVar) {
            xzl.this.add(psVar);
        }
    }

    public static <C extends Comparable<?>> xzl<C> create() {
        return new xzl<>(new TreeMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    /* JADX INFO: renamed from: k */
    public ps<C> m16082k(ps<C> psVar) {
        com.google.common.base.jk.a9(psVar);
        Map.Entry<ncyb<C>, ps<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(psVar.lowerBound);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(psVar)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    private void toq(ps<C> psVar) {
        if (psVar.isEmpty()) {
            this.rangesByLowerBound.remove(psVar.lowerBound);
        } else {
            this.rangesByLowerBound.put(psVar.lowerBound, psVar);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public void add(ps<C> psVar) {
        com.google.common.base.jk.a9(psVar);
        if (psVar.isEmpty()) {
            return;
        }
        ncyb<C> ncybVar = psVar.lowerBound;
        ncyb<C> ncybVar2 = psVar.upperBound;
        Map.Entry<ncyb<C>, ps<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(ncybVar);
        if (entryLowerEntry != null) {
            ps<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((ncyb) ncybVar) >= 0) {
                if (value.upperBound.compareTo((ncyb) ncybVar2) >= 0) {
                    ncybVar2 = value.upperBound;
                }
                ncybVar = value.lowerBound;
            }
        }
        Map.Entry<ncyb<C>, ps<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(ncybVar2);
        if (entryFloorEntry != null) {
            ps<C> value2 = entryFloorEntry.getValue();
            if (value2.upperBound.compareTo((ncyb) ncybVar2) >= 0) {
                ncybVar2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(ncybVar, ncybVar2).clear();
        toq(ps.create(ncybVar, ncybVar2));
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ void addAll(nnh nnhVar) {
        super.addAll(nnhVar);
    }

    @Override // com.google.common.collect.nnh
    public Set<ps<C>> asDescendingSetOfRanges() {
        Set<ps<C>> set = this.f26703q;
        if (set != null) {
            return set;
        }
        toq toqVar = new toq(this.rangesByLowerBound.descendingMap().values());
        this.f26703q = toqVar;
        return toqVar;
    }

    @Override // com.google.common.collect.nnh
    public Set<ps<C>> asRanges() {
        Set<ps<C>> set = this.f26701k;
        if (set != null) {
            return set;
        }
        toq toqVar = new toq(this.rangesByLowerBound.values());
        this.f26701k = toqVar;
        return toqVar;
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.nnh
    public nnh<C> complement() {
        nnh<C> nnhVar = this.f26702n;
        if (nnhVar != null) {
            return nnhVar;
        }
        zy zyVar = new zy();
        this.f26702n = zyVar;
        return zyVar;
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public boolean encloses(ps<C> psVar) {
        com.google.common.base.jk.a9(psVar);
        Map.Entry<ncyb<C>, ps<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(psVar.lowerBound);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(psVar);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean enclosesAll(nnh nnhVar) {
        return super.enclosesAll(nnhVar);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public boolean intersects(ps<C> psVar) {
        com.google.common.base.jk.a9(psVar);
        Map.Entry<ncyb<C>, ps<C>> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(psVar.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(psVar) && !entryCeilingEntry.getValue().intersection(psVar).isEmpty()) {
            return true;
        }
        Map.Entry<ncyb<C>, ps<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(psVar.lowerBound);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(psVar) || entryLowerEntry.getValue().intersection(psVar).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    @NullableDecl
    public ps<C> rangeContaining(C c2) {
        com.google.common.base.jk.a9(c2);
        Map.Entry<ncyb<C>, ps<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(ncyb.belowValue(c2));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(c2)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

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
    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public void remove(ps<C> psVar) {
        com.google.common.base.jk.a9(psVar);
        if (psVar.isEmpty()) {
            return;
        }
        Map.Entry<ncyb<C>, ps<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(psVar.lowerBound);
        if (entryLowerEntry != null) {
            ps<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((ncyb) psVar.lowerBound) >= 0) {
                if (psVar.hasUpperBound() && value.upperBound.compareTo((ncyb) psVar.upperBound) >= 0) {
                    toq(ps.create(psVar.upperBound, value.upperBound));
                }
                toq(ps.create(value.lowerBound, psVar.lowerBound));
            }
        }
        Map.Entry<ncyb<C>, ps<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(psVar.upperBound);
        if (entryFloorEntry != null) {
            ps<C> value2 = entryFloorEntry.getValue();
            if (psVar.hasUpperBound() && value2.upperBound.compareTo((ncyb) psVar.upperBound) >= 0) {
                toq(ps.create(psVar.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(psVar.lowerBound, psVar.upperBound).clear();
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ void removeAll(nnh nnhVar) {
        super.removeAll(nnhVar);
    }

    @Override // com.google.common.collect.nnh
    public ps<C> span() {
        Map.Entry<ncyb<C>, ps<C>> entryFirstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<ncyb<C>, ps<C>> entryLastEntry = this.rangesByLowerBound.lastEntry();
        if (entryFirstEntry != null) {
            return ps.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.nnh
    public nnh<C> subRangeSet(ps<C> psVar) {
        return psVar.equals(ps.all()) ? this : new C4575g(psVar);
    }

    private xzl(NavigableMap<ncyb<C>, ps<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> xzl<C> create(nnh<C> nnhVar) {
        xzl<C> xzlVarCreate = create();
        xzlVarCreate.addAll(nnhVar);
        return xzlVarCreate;
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.ld6, com.google.common.collect.nnh
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    /* JADX INFO: renamed from: com.google.common.collect.xzl$n */
    /* JADX INFO: compiled from: TreeRangeSet.java */
    @InterfaceC7732q
    static final class C4577n<C extends Comparable<?>> extends AbstractC4510p<ncyb<C>, ps<C>> {

        /* JADX INFO: renamed from: k */
        private final NavigableMap<ncyb<C>, ps<C>> f26713k;

        /* JADX INFO: renamed from: q */
        private final ps<ncyb<C>> f26714q;

        /* JADX INFO: renamed from: com.google.common.collect.xzl$n$k */
        /* JADX INFO: compiled from: TreeRangeSet.java */
        class k extends com.google.common.collect.zy<Map.Entry<ncyb<C>, ps<C>>> {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Iterator f26716n;

            k(Iterator it) {
                this.f26716n = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
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
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ncyb<C>, ps<C>> mo15703k() {
                if (!this.f26716n.hasNext()) {
                    return (Map.Entry) toq();
                }
                ps psVar = (ps) this.f26716n.next();
                return C4577n.this.f26714q.upperBound.isLessThan(psVar.upperBound) ? (Map.Entry) toq() : vy.dd(psVar.upperBound, psVar);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.xzl$n$toq */
        /* JADX INFO: compiled from: TreeRangeSet.java */
        class toq extends com.google.common.collect.zy<Map.Entry<ncyb<C>, ps<C>>> {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ InterfaceC4555w f26718n;

            toq(InterfaceC4555w interfaceC4555w) {
                this.f26718n = interfaceC4555w;
            }

            /* JADX INFO: Access modifiers changed from: protected */
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
            @Override // com.google.common.collect.zy
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ncyb<C>, ps<C>> mo15703k() {
                if (!this.f26718n.hasNext()) {
                    return (Map.Entry) toq();
                }
                ps psVar = (ps) this.f26718n.next();
                return C4577n.this.f26714q.lowerBound.isLessThan(psVar.upperBound) ? vy.dd(psVar.upperBound, psVar) : (Map.Entry) toq();
            }
        }

        C4577n(NavigableMap<ncyb<C>, ps<C>> navigableMap) {
            this.f26713k = navigableMap;
            this.f26714q = ps.all();
        }

        /* JADX INFO: renamed from: y */
        private NavigableMap<ncyb<C>, ps<C>> m16089y(ps<ncyb<C>> psVar) {
            return psVar.isConnected(this.f26714q) ? new C4577n(this.f26713k, psVar.intersection(this.f26714q)) : jbh.of();
        }

        @Override // java.util.SortedMap
        public Comparator<? super ncyb<C>> comparator() {
            return kx3.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> subMap(ncyb<C> ncybVar, boolean z2, ncyb<C> ncybVar2, boolean z3) {
            return m16089y(ps.range(ncybVar, fu4.forBoolean(z2), ncybVar2, fu4.forBoolean(z3)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> headMap(ncyb<C> ncybVar, boolean z2) {
            return m16089y(ps.upTo(ncybVar, fu4.forBoolean(z2)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f26714q.equals(ps.all()) ? this.f26713k.isEmpty() : !mo15684k().hasNext();
        }

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
        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<ncyb<C>, ps<C>>> mo15684k() {
            Map.Entry entryLowerEntry;
            Iterator<ps<C>> it = (this.f26714q.hasLowerBound() && (entryLowerEntry = this.f26713k.lowerEntry((ncyb<C>) this.f26714q.lowerEndpoint())) != null) ? this.f26714q.lowerBound.isLessThan(((ps) entryLowerEntry.getValue()).upperBound) ? this.f26713k.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.f26713k.tailMap(this.f26714q.lowerEndpoint(), true).values().iterator() : this.f26713k.values().iterator();
            return new k(it);
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<ncyb<C>, ps<C>> tailMap(ncyb<C> ncybVar, boolean z2) {
            return m16089y(ps.downTo(ncybVar, fu4.forBoolean(z2)));
        }

        @Override // com.google.common.collect.AbstractC4510p, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public ps<C> get(@NullableDecl Object obj) {
            Map.Entry<ncyb<C>, ps<C>> entryLowerEntry;
            if (obj instanceof ncyb) {
                try {
                    ncyb<C> ncybVar = (ncyb) obj;
                    if (this.f26714q.contains(ncybVar) && (entryLowerEntry = this.f26713k.lowerEntry(ncybVar)) != null && entryLowerEntry.getValue().upperBound.equals(ncybVar)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f26714q.equals(ps.all()) ? this.f26713k.size() : zwy.m16119e(mo15684k());
        }

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
        @Override // com.google.common.collect.AbstractC4510p
        Iterator<Map.Entry<ncyb<C>, ps<C>>> toq() {
            InterfaceC4555w interfaceC4555wHyr = zwy.hyr((this.f26714q.hasUpperBound() ? this.f26713k.headMap(this.f26714q.upperEndpoint(), false).descendingMap().values() : this.f26713k.descendingMap().values()).iterator());
            if (interfaceC4555wHyr.hasNext() && this.f26714q.upperBound.isLessThan(((ps) interfaceC4555wHyr.peek()).upperBound)) {
                interfaceC4555wHyr.next();
            }
            return new toq(interfaceC4555wHyr);
        }

        private C4577n(NavigableMap<ncyb<C>, ps<C>> navigableMap, ps<ncyb<C>> psVar) {
            this.f26713k = navigableMap;
            this.f26714q = psVar;
        }
    }

    public static <C extends Comparable<?>> xzl<C> create(Iterable<ps<C>> iterable) {
        xzl<C> xzlVarCreate = create();
        xzlVarCreate.addAll(iterable);
        return xzlVarCreate;
    }
}
