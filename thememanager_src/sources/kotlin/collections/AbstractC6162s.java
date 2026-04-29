package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.collections.s */
/* JADX INFO: compiled from: AbstractSet.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.1")
public abstract class AbstractC6162s<E> extends AbstractC6147k<E> implements Set<E>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final k f36194k = new k(null);

    /* JADX INFO: renamed from: kotlin.collections.s$k */
    /* JADX INFO: compiled from: AbstractSet.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        public final boolean m22606k(@InterfaceC7396q Set<?> c2, @InterfaceC7396q Set<?> other) {
            kotlin.jvm.internal.d2ok.m23075h(c2, "c");
            kotlin.jvm.internal.d2ok.m23075h(other, "other");
            if (c2.size() != other.size()) {
                return false;
            }
            return c2.containsAll(other);
        }

        public final int toq(@InterfaceC7396q Collection<?> c2) {
            kotlin.jvm.internal.d2ok.m23075h(c2, "c");
            Iterator<?> it = c2.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }
    }

    protected AbstractC6162s() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f36194k.m22606k(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f36194k.toq(this);
    }

    @Override // kotlin.collections.AbstractC6147k, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
