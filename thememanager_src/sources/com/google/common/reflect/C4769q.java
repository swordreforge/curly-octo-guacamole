package com.google.common.reflect;

import com.google.common.collect.xwq3;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.reflect.q */
/* JADX INFO: compiled from: ImmutableTypeToInstanceMap.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class C4769q<B> extends xwq3<qrj<? extends B>, B> implements x2<B> {

    /* JADX INFO: renamed from: k */
    private final zkd<qrj<? extends B>, B> f27336k;

    /* JADX INFO: renamed from: com.google.common.reflect.q$toq */
    /* JADX INFO: compiled from: ImmutableTypeToInstanceMap.java */
    @InterfaceC7731k
    public static final class toq<B> {

        /* JADX INFO: renamed from: k */
        private final zkd.toq<qrj<? extends B>, B> f27337k;

        /* JADX INFO: renamed from: k */
        public C4769q<B> m16801k() {
            return new C4769q<>(this.f27337k.mo15589k());
        }

        @CanIgnoreReturnValue
        public <T extends B> toq<B> toq(qrj<T> qrjVar, T t2) {
            this.f27337k.mo15592q(qrjVar.rejectTypeVariables(), t2);
            return this;
        }

        @CanIgnoreReturnValue
        public <T extends B> toq<B> zy(Class<T> cls, T t2) {
            this.f27337k.mo15592q(qrj.of((Class) cls), t2);
            return this;
        }

        private toq() {
            this.f27337k = zkd.builder();
        }
    }

    /* JADX INFO: renamed from: h */
    private <T extends B> T m16800h(qrj<T> qrjVar) {
        return this.f27336k.get(qrjVar);
    }

    public static <B> toq<B> ld6() {
        return new toq<>();
    }

    public static <B> C4769q<B> x2() {
        return new C4769q<>(zkd.of());
    }

    @Override // com.google.common.reflect.x2
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) m16800h(qrj.of((Class) cls));
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public B put(qrj<? extends B> qrjVar, B b2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    @Deprecated
    public void putAll(Map<? extends qrj<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.x2
    @CanIgnoreReturnValue
    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.x2
    @CanIgnoreReturnValue
    @Deprecated
    public <T extends B> T qrj(qrj<T> qrjVar, T t2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.x2
    /* JADX INFO: renamed from: s */
    public <T extends B> T mo16761s(qrj<T> qrjVar) {
        return (T) m16800h(qrjVar.rejectTypeVariables());
    }

    private C4769q(zkd<qrj<? extends B>, B> zkdVar) {
        this.f27336k = zkdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
    public Map<qrj<? extends B>, B> delegate() {
        return this.f27336k;
    }
}
