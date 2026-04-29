package kotlinx.coroutines.internal;

import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import kotlinx.coroutines.internal.dd;
import l05.InterfaceC6761g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0010\u0092\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/x9kr;", "Lkotlinx/coroutines/internal/dd;", "S", "", "", C7704k.y.toq.f44691k, "(Ljava/lang/Object;)Ljava/lang/String;", "", "f7l8", "(Ljava/lang/Object;)I", C2690k.k.f61039ld6, "", "zy", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "k", "Ljava/lang/Object;", "value", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Object;)Z", "isClosed", C7704k.y.toq.f95579toq, "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/dd;", "getSegment$annotations", "()V", "segment", "toq", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC6761g
public final class x9kr<S extends dd<S>> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final Object f37264k;

    private /* synthetic */ x9kr(Object obj) {
        this.f37264k = obj;
    }

    public static int f7l8(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final S m24426g(Object obj) {
        if (obj == f7l8.f82009toq) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        if (obj != null) {
            return (S) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ x9kr m24427k(Object obj) {
        return new x9kr(obj);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m24428n() {
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m24429q(Object obj, Object obj2) {
        return kotlin.jvm.internal.d2ok.f7l8(obj, obj2);
    }

    /* JADX INFO: renamed from: s */
    public static String m24430s(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    @InterfaceC7396q
    public static <S extends dd<S>> Object toq(@InterfaceC7395n Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m24431y(Object obj) {
        return obj == f7l8.f82009toq;
    }

    public static boolean zy(Object obj, Object obj2) {
        return (obj2 instanceof x9kr) && kotlin.jvm.internal.d2ok.f7l8(obj, ((x9kr) obj2).m24432p());
    }

    public boolean equals(Object obj) {
        return zy(this.f37264k, obj);
    }

    public int hashCode() {
        return f7l8(this.f37264k);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object m24432p() {
        return this.f37264k;
    }

    public String toString() {
        return m24430s(this.f37264k);
    }
}
