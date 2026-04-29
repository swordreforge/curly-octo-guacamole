package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: HashMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public final class r8s8<K, V> extends m4<K, V> {

    /* JADX INFO: renamed from: h */
    private static final int f26578h = 2;

    @wlev.zy
    private static final long serialVersionUID = 0;

    @InterfaceC7732q
    transient int expectedValuesPerKey;

    private r8s8() {
        this(12, 2);
    }

    public static <K, V> r8s8<K, V> create() {
        return new r8s8<>();
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int iM15650y = el.m15650y(objectInputStream);
        setMap(m2t.zy(12));
        el.m15646n(this, objectInputStream, iM15650y);
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        el.m15647p(this, objectOutputStream);
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
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

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ Set get(@NullableDecl Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
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

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Set removeAll(@NullableDecl Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Set replaceValues(@NullableDecl Object obj, Iterable iterable) {
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

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private r8s8(int i2, int i3) {
        super(m2t.zy(i2));
        this.expectedValuesPerKey = 2;
        com.google.common.base.jk.m15383q(i3 >= 0);
        this.expectedValuesPerKey = i3;
    }

    public static <K, V> r8s8<K, V> create(int i2, int i3) {
        return new r8s8<>(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
    public Set<V> createCollection() {
        return m2t.m15830q(this.expectedValuesPerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K, V> r8s8<K, V> create(lw<? extends K, ? extends V> lwVar) {
        return new r8s8<>(lwVar);
    }

    private r8s8(lw<? extends K, ? extends V> lwVar) {
        super(m2t.zy(lwVar.keySet().size()));
        this.expectedValuesPerKey = 2;
        putAll(lwVar);
    }
}
