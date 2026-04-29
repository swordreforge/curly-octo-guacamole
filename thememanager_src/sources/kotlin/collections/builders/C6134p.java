package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC6172y;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7628y;

/* JADX INFO: renamed from: kotlin.collections.builders.p */
/* JADX INFO: compiled from: SetBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6134p<E> extends AbstractC6172y<E> implements Set<E>, Serializable, InterfaceC7628y {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final k f36119k = new k(null);

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final C6134p f36120q = new C6134p(C6135q.Companion.m22450n());

    @InterfaceC7396q
    private final C6135q<E, ?> backing;

    /* JADX INFO: renamed from: kotlin.collections.builders.p$k */
    /* JADX INFO: compiled from: SetBuilder.kt */
    private static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C6134p(@InterfaceC7396q C6135q<E, ?> backing) {
        d2ok.m23075h(backing, "backing");
        this.backing = backing;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.backing.isReadOnly$kotlin_stdlib()) {
            return new C6138y(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractC6172y, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e2) {
        return this.backing.addKey$kotlin_stdlib(e2) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@InterfaceC7396q Collection<? extends E> elements) {
        d2ok.m23075h(elements, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.addAll(elements);
    }

    @InterfaceC7396q
    public final Set<E> build() {
        this.backing.build();
        return size() > 0 ? this : f36120q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC6172y
    public int getSize() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @InterfaceC7396q
    public Iterator<E> iterator() {
        return this.backing.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.backing.removeKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@InterfaceC7396q Collection<? extends Object> elements) {
        d2ok.m23075h(elements, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    public C6134p() {
        this(new C6135q());
    }

    public C6134p(int i2) {
        this(new C6135q(i2));
    }
}
