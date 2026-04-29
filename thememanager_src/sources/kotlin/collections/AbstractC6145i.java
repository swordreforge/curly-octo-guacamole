package kotlin.collections;

import java.util.Iterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.collections.i */
/* JADX INFO: compiled from: PrimitiveIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6145i implements Iterator<Character>, InterfaceC7625k {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Character m22498k() {
        return Character.valueOf(toq());
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(toq());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract char toq();
}
