package kotlin;

import cyoe.InterfaceC5981k;
import java.io.Serializable;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class gbni<T> implements jk<T>, Serializable {

    @InterfaceC7395n
    private Object _value;

    @InterfaceC7395n
    private InterfaceC5981k<? extends T> initializer;

    public gbni(@InterfaceC7396q InterfaceC5981k<? extends T> initializer) {
        kotlin.jvm.internal.d2ok.m23075h(initializer, "initializer");
        this.initializer = initializer;
        this._value = qkj8.f36485k;
    }

    private final Object writeReplace() {
        return new fu4(getValue());
    }

    @Override // kotlin.jk
    public T getValue() {
        if (this._value == qkj8.f36485k) {
            InterfaceC5981k<? extends T> interfaceC5981k = this.initializer;
            kotlin.jvm.internal.d2ok.qrj(interfaceC5981k);
            this._value = interfaceC5981k.invoke();
            this.initializer = null;
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
