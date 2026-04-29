package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import r6ty.InterfaceC7626n;

/* JADX INFO: renamed from: kotlin.collections.g */
/* JADX INFO: compiled from: AbstractMutableList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.1")
public abstract class AbstractC6143g<E> extends AbstractList<E> implements List<E>, InterfaceC7626n {
    protected AbstractC6143g() {
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i2, E e2);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i2) {
        return removeAt(i2);
    }

    public abstract E removeAt(int i2);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i2, E e2);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
