package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: TreeMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public class vwb<K, V> extends n7h<K, V> {

    @wlev.zy
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: h */
    private transient Comparator<? super K> f26609h;

    /* JADX INFO: renamed from: i */
    private transient Comparator<? super V> f26610i;

    vwb(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.f26609h = comparator;
        this.f26610i = comparator2;
    }

    public static <K extends Comparable, V extends Comparable> vwb<K, V> create() {
        return new vwb<>(kx3.natural(), kx3.natural());
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f26609h = (Comparator) com.google.common.base.jk.a9((Comparator) objectInputStream.readObject());
        this.f26610i = (Comparator) com.google.common.base.jk.a9((Comparator) objectInputStream.readObject());
        setMap(new TreeMap(this.f26609h));
        el.m15648q(this, objectInputStream);
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(keyComparator());
        objectOutputStream.writeObject(valueComparator());
        el.m15647p(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean containsKey(@NullableDecl Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
    Map<K, Collection<V>> createAsMap() {
        return createMaybeNavigableAsMap();
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Deprecated
    public Comparator<? super K> keyComparator() {
        return this.f26609h;
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ o05 keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(lw lwVar) {
        return super.putAll(lwVar);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC4400h, com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ SortedSet removeAll(@NullableDecl Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC4400h, com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ SortedSet replaceValues(@NullableDecl Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC4579y
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.xm
    public Comparator<? super V> valueComparator() {
        return this.f26610i;
    }

    @Override // com.google.common.collect.AbstractC4400h, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> vwb<K, V> create(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        return new vwb<>((Comparator) com.google.common.base.jk.a9(comparator), (Comparator) com.google.common.base.jk.a9(comparator2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K extends Comparable, V extends Comparable> vwb<K, V> create(lw<? extends K, ? extends V> lwVar) {
        return new vwb<>(kx3.natural(), kx3.natural(), lwVar);
    }

    @Override // com.google.common.collect.n7h, com.google.common.collect.AbstractC4400h, com.google.common.collect.qrj, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public NavigableMap<K, Collection<V>> asMap() {
        return (NavigableMap) super.asMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4400h, com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
    public SortedSet<V> createCollection() {
        return new TreeSet(this.f26610i);
    }

    @Override // com.google.common.collect.n7h, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    private vwb(Comparator<? super K> comparator, Comparator<? super V> comparator2, lw<? extends K, ? extends V> lwVar) {
        this(comparator, comparator2);
        putAll(lwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC4469n
    Collection<V> createCollection(@NullableDecl K k2) {
        if (k2 == 0) {
            keyComparator().compare(k2, k2);
        }
        return super.createCollection(k2);
    }

    @Override // com.google.common.collect.AbstractC4400h, com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    @wlev.zy
    public NavigableSet<V> get(@NullableDecl K k2) {
        return (NavigableSet) super.get((Object) k2);
    }
}
