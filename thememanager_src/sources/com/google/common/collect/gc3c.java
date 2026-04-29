package com.google.common.collect;

import com.google.common.collect.ktq;
import com.google.common.collect.se;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableListMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public class gc3c<K, V> extends ktq<K, V> implements h4b<K, V> {

    @wlev.zy
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: s */
    @RetainedWith
    @LazyInit
    private transient gc3c<V, K> f26182s;

    /* JADX INFO: renamed from: com.google.common.collect.gc3c$k */
    /* JADX INFO: compiled from: ImmutableListMultimap.java */
    public static final class C4388k<K, V> extends ktq.zy<K, V> {
        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
        public C4388k<K, V> mo15719y(lw<? extends K, ? extends V> lwVar) {
            super.mo15719y(lwVar);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C4388k<K, V> f7l8(Map.Entry<? extends K, ? extends V> entry) {
            super.f7l8(entry);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C4388k<K, V> ld6(K k2, V... vArr) {
            super.ld6(k2, vArr);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public C4388k<K, V> mo15718s(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo15718s(iterable);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
        public C4388k<K, V> mo15711g(K k2, V v2) {
            super.mo15711g(k2, v2);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public C4388k<K, V> mo15715n(Comparator<? super V> comparator) {
            super.mo15715n(comparator);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public C4388k<K, V> mo15717q(Comparator<? super K> comparator) {
            super.mo15717q(comparator);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
        public C4388k<K, V> mo15716p(K k2, Iterable<? extends V> iterable) {
            super.mo15716p(k2, iterable);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public gc3c<K, V> mo15714k() {
            return (gc3c) super.mo15714k();
        }
    }

    gc3c(zkd<K, se<V>> zkdVar, int i2) {
        super(zkdVar, i2);
    }

    public static <K, V> C4388k<K, V> builder() {
        return new C4388k<>();
    }

    public static <K, V> gc3c<K, V> copyOf(lw<? extends K, ? extends V> lwVar) {
        if (lwVar.isEmpty()) {
            return of();
        }
        if (lwVar instanceof gc3c) {
            gc3c<K, V> gc3cVar = (gc3c) lwVar;
            if (!gc3cVar.isPartialView()) {
                return gc3cVar;
            }
        }
        return fromMapEntries(lwVar.asMap().entrySet(), null);
    }

    static <K, V> gc3c<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        zkd.toq toqVar = new zkd.toq(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            se seVarCopyOf = comparator == null ? se.copyOf((Collection) value) : se.sortedCopyOf(comparator, value);
            if (!seVarCopyOf.isEmpty()) {
                toqVar.mo15592q(key, seVarCopyOf);
                size += seVarCopyOf.size();
            }
        }
        return new gc3c<>(toqVar.mo15589k(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private gc3c<V, K> m15710k() {
        C4388k c4388kBuilder = builder();
        ab it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c4388kBuilder.mo15711g(entry.getValue(), entry.getKey());
        }
        gc3c<V, K> gc3cVarMo15714k = c4388kBuilder.mo15714k();
        gc3cVarMo15714k.f26182s = this;
        return gc3cVarMo15714k;
    }

    public static <K, V> gc3c<K, V> of() {
        return uv6.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Invalid key count " + i2);
        }
        zkd.toq toqVarBuilder = zkd.builder();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object object = objectInputStream.readObject();
            int i5 = objectInputStream.readInt();
            if (i5 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i5);
            }
            se.C4520k c4520kBuilder = se.builder();
            for (int i6 = 0; i6 < i5; i6++) {
                c4520kBuilder.mo15569k(objectInputStream.readObject());
            }
            toqVarBuilder.mo15592q(object, c4520kBuilder.mo15570n());
            i3 += i5;
        }
        try {
            ktq.C4433n.f26283k.toq(this, toqVarBuilder.mo15589k());
            ktq.C4433n.f68221toq.m15651k(this, i3);
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        el.m15647p(this, objectOutputStream);
    }

    public static <K, V> gc3c<K, V> of(K k2, V v2) {
        C4388k c4388kBuilder = builder();
        c4388kBuilder.mo15711g(k2, v2);
        return c4388kBuilder.mo15714k();
    }

    @Override // com.google.common.collect.ktq
    public gc3c<V, K> inverse() {
        gc3c<V, K> gc3cVar = this.f26182s;
        if (gc3cVar != null) {
            return gc3cVar;
        }
        gc3c<V, K> gc3cVarM15710k = m15710k();
        this.f26182s = gc3cVarM15710k;
        return gc3cVarM15710k;
    }

    @Override // com.google.common.collect.ktq, com.google.common.collect.lw
    public se<V> get(@NullableDecl K k2) {
        se<V> seVar = (se) this.map.get(k2);
        return seVar == null ? se.of() : seVar;
    }

    @Override // com.google.common.collect.ktq, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public se<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ktq, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public se<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> gc3c<K, V> of(K k2, V v2, K k3, V v3) {
        C4388k c4388kBuilder = builder();
        c4388kBuilder.mo15711g(k2, v2);
        c4388kBuilder.mo15711g(k3, v3);
        return c4388kBuilder.mo15714k();
    }

    @InterfaceC7731k
    public static <K, V> gc3c<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C4388k().mo15718s(iterable).mo15714k();
    }

    public static <K, V> gc3c<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4) {
        C4388k c4388kBuilder = builder();
        c4388kBuilder.mo15711g(k2, v2);
        c4388kBuilder.mo15711g(k3, v3);
        c4388kBuilder.mo15711g(k4, v4);
        return c4388kBuilder.mo15714k();
    }

    public static <K, V> gc3c<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C4388k c4388kBuilder = builder();
        c4388kBuilder.mo15711g(k2, v2);
        c4388kBuilder.mo15711g(k3, v3);
        c4388kBuilder.mo15711g(k4, v4);
        c4388kBuilder.mo15711g(k5, v5);
        return c4388kBuilder.mo15714k();
    }

    public static <K, V> gc3c<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        C4388k c4388kBuilder = builder();
        c4388kBuilder.mo15711g(k2, v2);
        c4388kBuilder.mo15711g(k3, v3);
        c4388kBuilder.mo15711g(k4, v4);
        c4388kBuilder.mo15711g(k5, v5);
        c4388kBuilder.mo15711g(k6, v6);
        return c4388kBuilder.mo15714k();
    }
}
