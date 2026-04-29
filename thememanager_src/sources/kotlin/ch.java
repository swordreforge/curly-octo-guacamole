package kotlin;

import java.io.Serializable;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ch<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public ch(A a2, B b2, C c2) {
        this.first = a2;
        this.second = b2;
        this.third = c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ch copy$default(ch chVar, Object obj, Object obj2, Object obj3, int i2, Object obj4) {
        if ((i2 & 1) != 0) {
            obj = chVar.first;
        }
        if ((i2 & 2) != 0) {
            obj2 = chVar.second;
        }
        if ((i2 & 4) != 0) {
            obj3 = chVar.third;
        }
        return chVar.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    @InterfaceC7396q
    public final ch<A, B, C> copy(A a2, B b2, C c2) {
        return new ch<>(a2, b2, c2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return kotlin.jvm.internal.d2ok.f7l8(this.first, chVar.first) && kotlin.jvm.internal.d2ok.f7l8(this.second, chVar.second) && kotlin.jvm.internal.d2ok.f7l8(this.third, chVar.third);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a2 = this.first;
        int iHashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b2 = this.second;
        int iHashCode2 = (iHashCode + (b2 == null ? 0 : b2.hashCode())) * 31;
        C c2 = this.third;
        return iHashCode2 + (c2 != null ? c2.hashCode() : 0);
    }

    @InterfaceC7396q
    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
