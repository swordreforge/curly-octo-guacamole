package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MutableClassToInstanceMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class cnbm<B> extends xwq3<Class<? extends B>, B> implements wvg<B>, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    /* JADX INFO: renamed from: com.google.common.collect.cnbm$k */
    /* JADX INFO: compiled from: MutableClassToInstanceMap.java */
    static class C4328k extends AbstractC4531v<Class<? extends B>, B> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Map.Entry f26025k;

        C4328k(Map.Entry entry) {
            this.f26025k = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4531v, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: ld6 */
        public Map.Entry<Class<? extends B>, B> delegate() {
            return this.f26025k;
        }

        @Override // com.google.common.collect.AbstractC4531v, java.util.Map.Entry
        public B setValue(B b2) {
            return (B) super.setValue(cnbm.ld6(getKey(), b2));
        }
    }

    /* JADX INFO: compiled from: MutableClassToInstanceMap.java */
    class toq extends qo<Map.Entry<Class<? extends B>, B>> {

        /* JADX INFO: renamed from: com.google.common.collect.cnbm$toq$k */
        /* JADX INFO: compiled from: MutableClassToInstanceMap.java */
        class C4329k extends pnt2<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            C4329k(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.pnt2
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> mo15580k(Map.Entry<Class<? extends B>, B> entry) {
                return cnbm.checkedEntry(entry);
            }
        }

        toq() {
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new C4329k(delegate().iterator());
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<Map.Entry<Class<? extends B>, B>> delegate() {
            return cnbm.this.delegate().entrySet();
        }
    }

    /* JADX INFO: compiled from: MutableClassToInstanceMap.java */
    private static final class zy<B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Map<Class<? extends B>, B> backingMap;

        zy(Map<Class<? extends B>, B> map) {
            this.backingMap = map;
        }

        Object readResolve() {
            return cnbm.create(this.backingMap);
        }
    }

    private cnbm(Map<Class<? extends B>, B> map) {
        this.delegate = (Map) com.google.common.base.jk.a9(map);
    }

    static <B> Map.Entry<Class<? extends B>, B> checkedEntry(Map.Entry<Class<? extends B>, B> entry) {
        return new C4328k(entry);
    }

    public static <B> cnbm<B> create() {
        return new cnbm<>(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public static <B, T extends B> T ld6(Class<T> cls, B b2) {
        return (T) com.google.common.primitives.x2.m16739g(cls).cast(b2);
    }

    private Object writeReplace() {
        return new zy(delegate());
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new toq();
    }

    @Override // com.google.common.collect.wvg
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) ld6(cls, get(cls));
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ld6((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.wvg
    @CanIgnoreReturnValue
    public <T extends B> T putInstance(Class<T> cls, T t2) {
        return (T) ld6(cls, put((Class<? extends T>) cls, t2));
    }

    public static <B> cnbm<B> create(Map<Class<? extends B>, B> map) {
        return new cnbm<>(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    @CanIgnoreReturnValue
    public B put(Class<? extends B> cls, B b2) {
        return (B) super.put(cls, ld6(cls, b2));
    }
}
