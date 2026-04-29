package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;
import r6ty.InterfaceC7628y;

/* JADX INFO: renamed from: kotlin.collections.y */
/* JADX INFO: compiled from: AbstractMutableSet.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.1")
public abstract class AbstractC6172y<E> extends AbstractSet<E> implements Set<E>, InterfaceC7628y {
    protected AbstractC6172y() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e2);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
