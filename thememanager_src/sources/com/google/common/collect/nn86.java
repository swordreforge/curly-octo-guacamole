package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: EnumHashBiMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class nn86<K extends Enum<K>, V> extends AbstractC4427k<K, V> {

    @wlev.zy
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: y */
    private transient Class<K> f26474y;

    private nn86(Class<K> cls) {
        super(new EnumMap(cls), vy.nn86(cls.getEnumConstants().length));
        this.f26474y = cls;
    }

    public static <K extends Enum<K>, V> nn86<K, V> create(Class<K> cls) {
        return new nn86<>(cls);
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f26474y = (Class) objectInputStream.readObject();
        setDelegates(new EnumMap(this.f26474y), new HashMap((this.f26474y.getEnumConstants().length * 3) / 2));
        el.toq(this, objectInputStream);
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f26474y);
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
        return this.f26474y;
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object remove(@NullableDecl Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map, com.google.common.collect.ni7
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V> nn86<K, V> create(Map<K, ? extends V> map) {
        nn86<K, V> nn86VarCreate = create(C4352e.inferKeyType(map));
        nn86VarCreate.putAll(map);
        return nn86VarCreate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4427k
    public K checkKey(K k2) {
        return (K) com.google.common.base.jk.a9(k2);
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.ni7
    @CanIgnoreReturnValue
    public V forcePut(K k2, @NullableDecl V v2) {
        return (V) super.forcePut(k2, (Object) v2);
    }

    @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k2, @NullableDecl V v2) {
        return (V) super.put(k2, (Object) v2);
    }
}
