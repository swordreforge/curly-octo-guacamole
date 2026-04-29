package kotlin.collections;

import java.util.Iterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: PrimitiveIterators.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eqxt implements Iterator<Float>, InterfaceC7625k {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Float m22485k() {
        return Float.valueOf(toq());
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(toq());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract float toq();
}
