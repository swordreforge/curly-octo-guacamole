package kotlin;

import cyoe.InterfaceC5981k;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
final class ek5k<T> implements jk<T>, Serializable {

    @InterfaceC7396q
    public static final C6224k Companion = new C6224k(null);

    /* JADX INFO: renamed from: k */
    private static final AtomicReferenceFieldUpdater<ek5k<?>, Object> f36270k = AtomicReferenceFieldUpdater.newUpdater(ek5k.class, Object.class, "_value");

    @InterfaceC7395n
    private volatile Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    @InterfaceC7396q
    private final Object f46268final;

    @InterfaceC7395n
    private volatile InterfaceC5981k<? extends T> initializer;

    /* JADX INFO: renamed from: kotlin.ek5k$k */
    /* JADX INFO: compiled from: LazyJVM.kt */
    public static final class C6224k {
        private C6224k() {
        }

        public /* synthetic */ C6224k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public ek5k(@InterfaceC7396q InterfaceC5981k<? extends T> initializer) {
        kotlin.jvm.internal.d2ok.m23075h(initializer, "initializer");
        this.initializer = initializer;
        qkj8 qkj8Var = qkj8.f36485k;
        this._value = qkj8Var;
        this.f46268final = qkj8Var;
    }

    private final Object writeReplace() {
        return new fu4(getValue());
    }

    @Override // kotlin.jk
    public T getValue() {
        T t2 = (T) this._value;
        qkj8 qkj8Var = qkj8.f36485k;
        if (t2 != qkj8Var) {
            return t2;
        }
        InterfaceC5981k<? extends T> interfaceC5981k = this.initializer;
        if (interfaceC5981k != null) {
            T tInvoke = interfaceC5981k.invoke();
            if (androidx.concurrent.futures.toq.m906k(f36270k, this, qkj8Var, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
        }
        return (T) this._value;
    }

    @Override // kotlin.jk
    public boolean isInitialized() {
        return this._value != qkj8.f36485k;
    }

    @InterfaceC7396q
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
