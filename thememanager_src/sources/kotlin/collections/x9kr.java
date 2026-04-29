package kotlin.collections;

import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x9kr<T> {

    /* JADX INFO: renamed from: k */
    private final int f36205k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final T f81783toq;

    public x9kr(int i2, T t2) {
        this.f36205k = i2;
        this.f81783toq = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ x9kr m22663q(x9kr x9krVar, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i2 = x9krVar.f36205k;
        }
        if ((i3 & 2) != 0) {
            obj = x9krVar.f81783toq;
        }
        return x9krVar.zy(i2, obj);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9kr)) {
            return false;
        }
        x9kr x9krVar = (x9kr) obj;
        return this.f36205k == x9krVar.f36205k && kotlin.jvm.internal.d2ok.f7l8(this.f81783toq, x9krVar.f81783toq);
    }

    /* JADX INFO: renamed from: g */
    public final T m22664g() {
        return this.f81783toq;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f36205k) * 31;
        T t2 = this.f81783toq;
        return iHashCode + (t2 == null ? 0 : t2.hashCode());
    }

    /* JADX INFO: renamed from: k */
    public final int m22665k() {
        return this.f36205k;
    }

    /* JADX INFO: renamed from: n */
    public final int m22666n() {
        return this.f36205k;
    }

    @InterfaceC7396q
    public String toString() {
        return "IndexedValue(index=" + this.f36205k + ", value=" + this.f81783toq + ')';
    }

    public final T toq() {
        return this.f81783toq;
    }

    @InterfaceC7396q
    public final x9kr<T> zy(int i2, T t2) {
        return new x9kr<>(i2, t2);
    }
}
