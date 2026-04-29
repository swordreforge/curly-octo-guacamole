package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: kotlin.collections.n */
/* JADX INFO: compiled from: AbstractMutableCollection.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.1")
public abstract class AbstractC6156n<E> extends AbstractCollection<E> implements Collection<E>, r6ty.toq {
    protected AbstractC6156n() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e2);

    /* JADX INFO: renamed from: k */
    public abstract int mo22439k();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return mo22439k();
    }
}
