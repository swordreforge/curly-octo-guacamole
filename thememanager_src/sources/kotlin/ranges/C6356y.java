package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.d2ok;
import kotlin.ranges.ki;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.ranges.y */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6356y<T extends Comparable<? super T>> implements ki<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final T f36554k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final T f36555q;

    public C6356y(@InterfaceC7396q T start, @InterfaceC7396q T endExclusive) {
        d2ok.m23075h(start, "start");
        d2ok.m23075h(endExclusive, "endExclusive");
        this.f36554k = start;
        this.f36555q = endExclusive;
    }

    @Override // kotlin.ranges.ki
    public boolean contains(@InterfaceC7396q T t2) {
        return ki.C6346k.m23326k(this, t2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C6356y) {
            if (!isEmpty() || !((C6356y) obj).isEmpty()) {
                C6356y c6356y = (C6356y) obj;
                if (!d2ok.f7l8(mo23288k(), c6356y.mo23288k()) || !d2ok.f7l8(mo23287g(), c6356y.mo23287g())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public T mo23287g() {
        return this.f36555q;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo23288k().hashCode() * 31) + mo23287g().hashCode();
    }

    @Override // kotlin.ranges.ki
    public boolean isEmpty() {
        return ki.C6346k.toq(this);
    }

    @Override // kotlin.ranges.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public T mo23288k() {
        return this.f36554k;
    }

    @InterfaceC7396q
    public String toString() {
        return mo23288k() + "..<" + mo23287g();
    }
}
