package miuix.hybrid.internal.webkit;

import android.webkit.ValueCallback;
import miuix.hybrid.InterfaceC7154t;

/* JADX INFO: compiled from: ValueCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8<T> implements InterfaceC7154t<T> {

    /* JADX INFO: renamed from: k */
    private ValueCallback<T> f40303k;

    public f7l8(ValueCallback<T> valueCallback) {
        this.f40303k = valueCallback;
    }

    @Override // miuix.hybrid.InterfaceC7154t
    public void onReceiveValue(T value) {
        this.f40303k.onReceiveValue(value);
    }
}
