package kotlin.collections;

import java.util.Iterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: PrimitiveIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zp implements Iterator<Short>, InterfaceC7625k {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Short m22672k() {
        return Short.valueOf(toq());
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(toq());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract short toq();
}
