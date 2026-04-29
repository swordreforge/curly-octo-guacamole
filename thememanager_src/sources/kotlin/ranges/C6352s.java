package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.d2ok;
import kotlin.ranges.f7l8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.ranges.s */
/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6352s<T extends Comparable<? super T>> implements f7l8<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final T f36544k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final T f36545q;

    public C6352s(@InterfaceC7396q T start, @InterfaceC7396q T endInclusive) {
        d2ok.m23075h(start, "start");
        d2ok.m23075h(endInclusive, "endInclusive");
        this.f36544k = start;
        this.f36545q = endInclusive;
    }

    @Override // kotlin.ranges.f7l8
    public boolean contains(@InterfaceC7396q T t2) {
        return f7l8.C6340k.m23290k(this, t2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C6352s) {
            if (!isEmpty() || !((C6352s) obj).isEmpty()) {
                C6352s c6352s = (C6352s) obj;
                if (!d2ok.f7l8(mo2951k(), c6352s.mo2951k()) || !d2ok.f7l8(zy(), c6352s.zy())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo2951k().hashCode() * 31) + zy().hashCode();
    }

    @Override // kotlin.ranges.f7l8
    public boolean isEmpty() {
        return f7l8.C6340k.toq(this);
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public T mo2951k() {
        return this.f36544k;
    }

    @InterfaceC7396q
    public String toString() {
        return mo2951k() + ".." + zy();
    }

    @Override // kotlin.ranges.f7l8
    @InterfaceC7396q
    public T zy() {
        return this.f36545q;
    }
}
