package kotlin.time;

import kotlin.i9jn;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.time.i */
/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {x2.class})
@yz(version = "1.9")
public final class C6463i<T> {

    /* JADX INFO: renamed from: k */
    private final T f36736k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f81947toq;

    private C6463i(T t2, long j2) {
        this.f36736k = t2;
        this.f81947toq = j2;
    }

    public /* synthetic */ C6463i(Object obj, long j2, ni7 ni7Var) {
        this(obj, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C6463i m23688q(C6463i c6463i, Object obj, long j2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = c6463i.f36736k;
        }
        if ((i2 & 2) != 0) {
            j2 = c6463i.f81947toq;
        }
        return c6463i.zy(obj, j2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6463i)) {
            return false;
        }
        C6463i c6463i = (C6463i) obj;
        return d2ok.f7l8(this.f36736k, c6463i.f36736k) && C6467n.cdj(this.f81947toq, c6463i.f81947toq);
    }

    /* JADX INFO: renamed from: g */
    public final T m23689g() {
        return this.f36736k;
    }

    public int hashCode() {
        T t2 = this.f36736k;
        return ((t2 == null ? 0 : t2.hashCode()) * 31) + C6467n.m23704e(this.f81947toq);
    }

    /* JADX INFO: renamed from: k */
    public final T m23690k() {
        return this.f36736k;
    }

    /* JADX INFO: renamed from: n */
    public final long m23691n() {
        return this.f81947toq;
    }

    @InterfaceC7396q
    public String toString() {
        return "TimedValue(value=" + this.f36736k + ", duration=" + ((Object) C6467n.bo(this.f81947toq)) + ')';
    }

    public final long toq() {
        return this.f81947toq;
    }

    @InterfaceC7396q
    public final C6463i<T> zy(T t2, long j2) {
        return new C6463i<>(t2, j2, null);
    }
}
