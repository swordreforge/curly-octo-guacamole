package kotlin.jvm.internal;

import java.util.Iterator;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.s */
/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6309s {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> Iterator<T> m23145k(@InterfaceC7396q T[] array) {
        d2ok.m23075h(array, "array");
        return new C6313y(array);
    }
}
