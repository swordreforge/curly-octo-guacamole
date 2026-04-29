package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.e */
/* JADX INFO: compiled from: EnumBiMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class C4352e<K extends Enum<K>, V extends Enum<V>> extends AbstractC4427k<K, V> {

    @wlev.zy
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: s */
    private transient Class<V> f26072s;

    /* JADX INFO: renamed from: y */
    private transient Class<K> f26073y;

    private C4352e(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.f26073y = cls;
        this.f26072s = cls2;
    }

    private static <V extends Enum<V>> Class<V> cdj(Map<?, V> map) {
        if (map instanceof C4352e) {
            return ((C4352e) map).f26072s;
        }
        com.google.common.base.jk.m15383q(!map.isEmpty());
        return map.values().iterator().next().getDeclaringClass();
    }

    public static <K extends Enum<K>, V extends Enum<V>> C4352e<K, V> create(Class<K> cls, Class<V> cls2) {
        return new C4352e<>(cls, cls2);
    }

    static <K extends Enum<K>> Class<K> inferKeyType(Map<K, ?> map) {
        if (map instanceof C4352e) {
            return ((C4352e) map).keyType();
        }
        if (map instanceof nn86) {
            return ((nn86) map).keyType();
        }
        com.google.common.base.jk.m15383q(!map.isEmpty());
        return map.keySet().iterator().next().getDeclaringClass();
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f26073y = (Class) objectInputStream.readObject();
        this.f26072s = (Class) objectInputStream.readObject();
        setDelegates(new EnumMap(this.f26073y), new EnumMap(this.f26072s));
        el.toq(this, objectInputStream);
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f26073y);
        objectOutputStream.writeObject(this.f26072s);
        el.m15649s(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.ni7
    public /* bridge */ /* synthetic */ ni7 inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public Class<K> keyType() {
        return this.f26073y;
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public Class<V> valueType() {
        return this.f26072s;
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map, com.google.common.collect.ni7
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V extends Enum<V>> C4352e<K, V> create(Map<K, V> map) {
        C4352e<K, V> c4352eCreate = create(inferKeyType(map), cdj(map));
        c4352eCreate.putAll(map);
        return c4352eCreate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4427k
    public K checkKey(K k2) {
        return (K) com.google.common.base.jk.a9(k2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4427k
    public V checkValue(V v2) {
        return (V) com.google.common.base.jk.a9(v2);
    }
}
