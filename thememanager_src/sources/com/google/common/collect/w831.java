package com.google.common.collect;

import com.google.common.collect.zkd;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmutableClassToInstanceMap.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"B"})
@wlev.zy
public final class w831<B> extends xwq3<Class<? extends B>, B> implements wvg<B>, Serializable {

    /* JADX INFO: renamed from: k */
    private static final w831<Object> f26665k = new w831<>(zkd.of());
    private final zkd<Class<? extends B>, B> delegate;

    /* JADX INFO: compiled from: ImmutableClassToInstanceMap.java */
    public static final class toq<B> {

        /* JADX INFO: renamed from: k */
        private final zkd.toq<Class<? extends B>, B> f26666k = zkd.builder();

        private static <B, T extends B> T toq(Class<T> cls, B b2) {
            return (T) com.google.common.primitives.x2.m16739g(cls).cast(b2);
        }

        /* JADX INFO: renamed from: k */
        public w831<B> m16053k() {
            zkd<Class<? extends B>, B> zkdVarMo15589k = this.f26666k.mo15589k();
            return zkdVarMo15589k.isEmpty() ? w831.of() : new w831<>(zkdVarMo15589k);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q */
        public <T extends B> toq<B> m16054q(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class key = entry.getKey();
                T value = entry.getValue();
                this.f26666k.mo15592q((Class<? extends B>) key, (B) toq(key, value));
            }
            return this;
        }

        @CanIgnoreReturnValue
        public <T extends B> toq<B> zy(Class<T> cls, T t2) {
            this.f26666k.mo15592q(cls, t2);
            return this;
        }
    }

    public static <B> toq<B> builder() {
        return new toq<>();
    }

    public static <B, S extends B> w831<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof w831 ? (w831) map : new toq().m16054q(map).m16053k();
    }

    public static <B> w831<B> of() {
        return (w831<B>) f26665k;
    }

    @Override // com.google.common.collect.wvg
    @NullableDecl
    public <T extends B> T getInstance(Class<T> cls) {
        return this.delegate.get(com.google.common.base.jk.a9(cls));
    }

    @Override // com.google.common.collect.wvg
    @CanIgnoreReturnValue
    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t2) {
        throw new UnsupportedOperationException();
    }

    Object readResolve() {
        return isEmpty() ? of() : this;
    }

    private w831(zkd<Class<? extends B>, B> zkdVar) {
        this.delegate = zkdVar;
    }

    public static <B, T extends B> w831<B> of(Class<T> cls, T t2) {
        return new w831<>(zkd.of(cls, t2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }
}
