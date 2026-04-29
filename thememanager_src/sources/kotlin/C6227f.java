package kotlin;

import java.io.Serializable;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.f */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6227f<A, B> implements Serializable {
    private final A first;
    private final B second;

    public C6227f(A a2, B b2) {
        this.first = a2;
        this.second = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C6227f copy$default(C6227f c6227f, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = c6227f.first;
        }
        if ((i2 & 2) != 0) {
            obj2 = c6227f.second;
        }
        return c6227f.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    @InterfaceC7396q
    public final C6227f<A, B> copy(A a2, B b2) {
        return new C6227f<>(a2, b2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6227f)) {
            return false;
        }
        C6227f c6227f = (C6227f) obj;
        return kotlin.jvm.internal.d2ok.f7l8(this.first, c6227f.first) && kotlin.jvm.internal.d2ok.f7l8(this.second, c6227f.second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a2 = this.first;
        int iHashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b2 = this.second;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    @InterfaceC7396q
    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
