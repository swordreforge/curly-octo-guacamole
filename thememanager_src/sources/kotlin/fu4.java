package kotlin;

import java.io.Serializable;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class fu4<T> implements jk<T>, Serializable {
    private final T value;

    public fu4(T t2) {
        this.value = t2;
    }

    @Override // kotlin.jk
    public T getValue() {
        return this.value;
    }

    @Override // kotlin.jk
    public boolean isInitialized() {
        return true;
    }

    @InterfaceC7396q
    public String toString() {
        return String.valueOf(getValue());
    }
}
