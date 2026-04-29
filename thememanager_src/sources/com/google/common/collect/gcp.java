package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: MultimapBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class gcp<K0, V0> {

    /* JADX INFO: renamed from: k */
    private static final int f26183k = 8;

    /* JADX INFO: compiled from: MultimapBuilder.java */
    private static final class f7l8<V> implements com.google.common.base.lvui<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        f7l8(int i2) {
            this.expectedValuesPerKey = C4524t.toq(i2, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.lvui
        public Set<V> get() {
            return m2t.m15830q(this.expectedValuesPerKey);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.gcp$g */
    /* JADX INFO: compiled from: MultimapBuilder.java */
    private static final class C4389g<V extends Enum<V>> implements com.google.common.base.lvui<Set<V>>, Serializable {
        private final Class<V> clazz;

        C4389g(Class<V> cls) {
            this.clazz = (Class) com.google.common.base.jk.a9(cls);
        }

        @Override // com.google.common.base.lvui
        public Set<V> get() {
            return EnumSet.noneOf(this.clazz);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.gcp$k */
    /* JADX INFO: compiled from: MultimapBuilder.java */
    static class C4390k extends ld6<Object> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f68200toq;

        C4390k(int i2) {
            this.f68200toq = i2;
        }

        @Override // com.google.common.collect.gcp.ld6
        <K, V> Map<K, Collection<V>> zy() {
            return m2t.zy(this.f68200toq);
        }
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    public static abstract class ld6<K0> {

        /* JADX INFO: renamed from: k */
        private static final int f26184k = 2;

        /* JADX INFO: renamed from: com.google.common.collect.gcp$ld6$g */
        /* JADX INFO: compiled from: MultimapBuilder.java */
        class C4391g extends x2<K0, V0> {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ Class f68201toq;

            C4391g(Class cls) {
                this.f68201toq = cls;
            }

            @Override // com.google.common.collect.gcp.x2, com.google.common.collect.gcp
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V extends V0> wt<K, V> mo15725k() {
                return oki.ni7(ld6.this.zy(), new C4389g(this.f68201toq));
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.gcp$ld6$k */
        /* JADX INFO: compiled from: MultimapBuilder.java */
        class C4392k extends AbstractC4396p<K0, Object> {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ int f68203toq;

            C4392k(int i2) {
                this.f68203toq = i2;
            }

            @Override // com.google.common.collect.gcp.AbstractC4396p, com.google.common.collect.gcp
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V> h4b<K, V> mo15725k() {
                return oki.fn3e(ld6.this.zy(), new C4395n(this.f68203toq));
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.gcp$ld6$n */
        /* JADX INFO: compiled from: MultimapBuilder.java */
        class C4393n extends qrj<K0, V0> {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ Comparator f68205toq;

            C4393n(Comparator comparator) {
                this.f68205toq = comparator;
            }

            @Override // com.google.common.collect.gcp.qrj, com.google.common.collect.gcp.x2
            /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V extends V0> xm<K, V> mo15725k() {
                return oki.fu4(ld6.this.zy(), new n7h(this.f68205toq));
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.gcp$ld6$q */
        /* JADX INFO: compiled from: MultimapBuilder.java */
        class C4394q extends x2<K0, Object> {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ int f68207toq;

            C4394q(int i2) {
                this.f68207toq = i2;
            }

            @Override // com.google.common.collect.gcp.x2, com.google.common.collect.gcp
            /* JADX INFO: renamed from: p */
            public <K extends K0, V> wt<K, V> mo15725k() {
                return oki.ni7(ld6.this.zy(), new C4399y(this.f68207toq));
            }
        }

        /* JADX INFO: compiled from: MultimapBuilder.java */
        class toq extends AbstractC4396p<K0, Object> {
            toq() {
            }

            @Override // com.google.common.collect.gcp.AbstractC4396p, com.google.common.collect.gcp
            /* JADX INFO: renamed from: p */
            public <K extends K0, V> h4b<K, V> mo15725k() {
                return oki.fn3e(ld6.this.zy(), EnumC4398s.instance());
            }
        }

        /* JADX INFO: compiled from: MultimapBuilder.java */
        class zy extends x2<K0, Object> {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ int f68210toq;

            zy(int i2) {
                this.f68210toq = i2;
            }

            @Override // com.google.common.collect.gcp.x2, com.google.common.collect.gcp
            /* JADX INFO: renamed from: p */
            public <K extends K0, V> wt<K, V> mo15725k() {
                return oki.ni7(ld6.this.zy(), new f7l8(this.f68210toq));
            }
        }

        ld6() {
        }

        public x2<K0, Object> f7l8() {
            return m15732y(2);
        }

        /* JADX INFO: renamed from: g */
        public x2<K0, Object> m15726g(int i2) {
            C4524t.toq(i2, "expectedValuesPerKey");
            return new zy(i2);
        }

        /* JADX INFO: renamed from: k */
        public AbstractC4396p<K0, Object> m15727k() {
            return toq(2);
        }

        public <V0> qrj<K0, V0> ld6(Comparator<V0> comparator) {
            com.google.common.base.jk.fti(comparator, "comparator");
            return new C4393n(comparator);
        }

        /* JADX INFO: renamed from: n */
        public x2<K0, Object> m15728n() {
            return m15726g(2);
        }

        /* JADX INFO: renamed from: p */
        public qrj<K0, Comparable> m15729p() {
            return ld6(kx3.natural());
        }

        /* JADX INFO: renamed from: q */
        public <V0 extends Enum<V0>> x2<K0, V0> m15730q(Class<V0> cls) {
            com.google.common.base.jk.fti(cls, "valueClass");
            return new C4391g(cls);
        }

        /* JADX INFO: renamed from: s */
        public AbstractC4396p<K0, Object> m15731s() {
            return new toq();
        }

        public AbstractC4396p<K0, Object> toq(int i2) {
            C4524t.toq(i2, "expectedValuesPerKey");
            return new C4392k(i2);
        }

        /* JADX INFO: renamed from: y */
        public x2<K0, Object> m15732y(int i2) {
            C4524t.toq(i2, "expectedValuesPerKey");
            return new C4394q(i2);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> zy();
    }

    /* JADX INFO: renamed from: com.google.common.collect.gcp$n */
    /* JADX INFO: compiled from: MultimapBuilder.java */
    private static final class C4395n<V> implements com.google.common.base.lvui<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        C4395n(int i2) {
            this.expectedValuesPerKey = C4524t.toq(i2, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.lvui
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    private static final class n7h<V> implements com.google.common.base.lvui<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        n7h(Comparator<? super V> comparator) {
            this.comparator = (Comparator) com.google.common.base.jk.a9(comparator);
        }

        @Override // com.google.common.base.lvui
        public SortedSet<V> get() {
            return new TreeSet(this.comparator);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.gcp$p */
    /* JADX INFO: compiled from: MultimapBuilder.java */
    public static abstract class AbstractC4396p<K0, V0> extends gcp<K0, V0> {
        AbstractC4396p() {
            super(null);
        }

        @Override // com.google.common.collect.gcp
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> h4b<K, V> toq(lw<? extends K, ? extends V> lwVar) {
            return (h4b) super.toq(lwVar);
        }

        @Override // com.google.common.collect.gcp
        /* JADX INFO: renamed from: p */
        public abstract <K extends K0, V extends V0> h4b<K, V> mo15725k();
    }

    /* JADX INFO: renamed from: com.google.common.collect.gcp$q */
    /* JADX INFO: compiled from: MultimapBuilder.java */
    static class C4397q extends ld6<K0> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Class f68212toq;

        C4397q(Class cls) {
            this.f68212toq = cls;
        }

        @Override // com.google.common.collect.gcp.ld6
        <K extends K0, V> Map<K, Collection<V>> zy() {
            return new EnumMap(this.f68212toq);
        }
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    public static abstract class qrj<K0, V0> extends x2<K0, V0> {
        qrj() {
        }

        @Override // com.google.common.collect.gcp.x2, com.google.common.collect.gcp
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> xm<K, V> toq(lw<? extends K, ? extends V> lwVar) {
            return (xm) super.toq(lwVar);
        }

        @Override // com.google.common.collect.gcp.x2
        /* JADX INFO: renamed from: x2 */
        public abstract <K extends K0, V extends V0> xm<K, V> mo15725k();
    }

    /* JADX INFO: renamed from: com.google.common.collect.gcp$s */
    /* JADX INFO: compiled from: MultimapBuilder.java */
    private enum EnumC4398s implements com.google.common.base.lvui<List<Object>> {
        INSTANCE;

        public static <V> com.google.common.base.lvui<List<V>> instance() {
            return INSTANCE;
        }

        @Override // com.google.common.base.lvui
        public List<Object> get() {
            return new LinkedList();
        }
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    static class toq extends ld6<Object> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f68213toq;

        toq(int i2) {
            this.f68213toq = i2;
        }

        @Override // com.google.common.collect.gcp.ld6
        <K, V> Map<K, Collection<V>> zy() {
            return m2t.m15828n(this.f68213toq);
        }
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    public static abstract class x2<K0, V0> extends gcp<K0, V0> {
        x2() {
            super(null);
        }

        @Override // com.google.common.collect.gcp
        /* JADX INFO: renamed from: ld6 */
        public <K extends K0, V extends V0> wt<K, V> toq(lw<? extends K, ? extends V> lwVar) {
            return (wt) super.toq(lwVar);
        }

        @Override // com.google.common.collect.gcp
        /* JADX INFO: renamed from: p */
        public abstract <K extends K0, V extends V0> wt<K, V> mo15725k();
    }

    /* JADX INFO: renamed from: com.google.common.collect.gcp$y */
    /* JADX INFO: compiled from: MultimapBuilder.java */
    private static final class C4399y<V> implements com.google.common.base.lvui<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        C4399y(int i2) {
            this.expectedValuesPerKey = C4524t.toq(i2, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.lvui
        public Set<V> get() {
            return m2t.m15826g(this.expectedValuesPerKey);
        }
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    static class zy extends ld6<K0> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Comparator f68214toq;

        zy(Comparator comparator) {
            this.f68214toq = comparator;
        }

        @Override // com.google.common.collect.gcp.ld6
        <K extends K0, V> Map<K, Collection<V>> zy() {
            return new TreeMap(this.f68214toq);
        }
    }

    /* synthetic */ gcp(C4390k c4390k) {
        this();
    }

    public static ld6<Object> f7l8(int i2) {
        C4524t.toq(i2, "expectedKeys");
        return new toq(i2);
    }

    /* JADX INFO: renamed from: g */
    public static ld6<Object> m15720g() {
        return f7l8(8);
    }

    /* JADX INFO: renamed from: n */
    public static ld6<Object> m15721n(int i2) {
        C4524t.toq(i2, "expectedKeys");
        return new C4390k(i2);
    }

    /* JADX INFO: renamed from: q */
    public static ld6<Object> m15722q() {
        return m15721n(8);
    }

    /* JADX INFO: renamed from: s */
    public static <K0> ld6<K0> m15723s(Comparator<K0> comparator) {
        com.google.common.base.jk.a9(comparator);
        return new zy(comparator);
    }

    /* JADX INFO: renamed from: y */
    public static ld6<Comparable> m15724y() {
        return m15723s(kx3.natural());
    }

    public static <K0 extends Enum<K0>> ld6<K0> zy(Class<K0> cls) {
        com.google.common.base.jk.a9(cls);
        return new C4397q(cls);
    }

    /* JADX INFO: renamed from: k */
    public abstract <K extends K0, V extends V0> lw<K, V> mo15725k();

    public <K extends K0, V extends V0> lw<K, V> toq(lw<? extends K, ? extends V> lwVar) {
        lw<K, V> lwVarMo15725k = mo15725k();
        lwVarMo15725k.putAll(lwVar);
        return lwVarMo15725k;
    }

    private gcp() {
    }
}
