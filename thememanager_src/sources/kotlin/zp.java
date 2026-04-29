package kotlin;

import cyoe.InterfaceC5981k;
import java.io.Serializable;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
final class zp<T> implements jk<T>, Serializable {

    @InterfaceC7395n
    private volatile Object _value;

    @InterfaceC7395n
    private InterfaceC5981k<? extends T> initializer;

    @InterfaceC7396q
    private final Object lock;

    public zp(@InterfaceC7396q InterfaceC5981k<? extends T> initializer, @InterfaceC7395n Object obj) {
        kotlin.jvm.internal.d2ok.m23075h(initializer, "initializer");
        this.initializer = initializer;
        this._value = qkj8.f36485k;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new fu4(getValue());
    }

    @Override // kotlin.jk
    public T getValue() {
        T tInvoke;
        T t2 = (T) this._value;
        qkj8 qkj8Var = qkj8.f36485k;
        if (t2 != qkj8Var) {
            return t2;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == qkj8Var) {
                InterfaceC5981k<? extends T> interfaceC5981k = this.initializer;
                kotlin.jvm.internal.d2ok.qrj(interfaceC5981k);
                tInvoke = interfaceC5981k.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.jk
    public boolean isInitialized() {
        return this._value != qkj8.f36485k;
    }

    @InterfaceC7396q
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ zp(InterfaceC5981k interfaceC5981k, Object obj, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(interfaceC5981k, (i2 & 2) != 0 ? null : obj);
    }
}
