package kotlin.time;

import cyoe.InterfaceC5981k;
import kotlin.i9jn;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.time.t8r;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,121:1\n50#1,7:122\n113#1,7:129\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n21#1:122,7\n83#1:129,7\n*E\n"})
public final class n7h {
    @i9jn(markerClass = {x2.class})
    @InterfaceC7396q
    @yz(version = "1.9")
    /* JADX INFO: renamed from: g */
    public static final <T> C6463i<T> m23743g(@InterfaceC7396q t8r t8rVar, @InterfaceC7396q InterfaceC5981k<? extends T> block) {
        d2ok.m23075h(t8rVar, "<this>");
        d2ok.m23075h(block, "block");
        return new C6463i<>(block.invoke(), t8rVar.mo23685k().toq(), null);
    }

    @i9jn(markerClass = {x2.class})
    @yz(version = "1.9")
    /* JADX INFO: renamed from: k */
    public static final long m23744k(@InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(block, "block");
        long qVar = t8r.toq.f81949toq.toq();
        block.invoke();
        return t8r.toq.C6472k.ld6(qVar);
    }

    @i9jn(markerClass = {x2.class})
    @InterfaceC7396q
    @yz(version = "1.9")
    /* JADX INFO: renamed from: n */
    public static final <T> C6463i<T> m23745n(@InterfaceC7396q t8r.toq toqVar, @InterfaceC7396q InterfaceC5981k<? extends T> block) {
        d2ok.m23075h(toqVar, "<this>");
        d2ok.m23075h(block, "block");
        return new C6463i<>(block.invoke(), t8r.toq.C6472k.ld6(toqVar.toq()), null);
    }

    @i9jn(markerClass = {x2.class})
    @InterfaceC7396q
    @yz(version = "1.9")
    /* JADX INFO: renamed from: q */
    public static final <T> C6463i<T> m23746q(@InterfaceC7396q InterfaceC5981k<? extends T> block) {
        d2ok.m23075h(block, "block");
        return new C6463i<>(block.invoke(), t8r.toq.C6472k.ld6(t8r.toq.f81949toq.toq()), null);
    }

    @i9jn(markerClass = {x2.class})
    @yz(version = "1.9")
    public static final long toq(@InterfaceC7396q t8r.toq toqVar, @InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(toqVar, "<this>");
        d2ok.m23075h(block, "block");
        long qVar = toqVar.toq();
        block.invoke();
        return t8r.toq.C6472k.ld6(qVar);
    }

    @i9jn(markerClass = {x2.class})
    @yz(version = "1.9")
    public static final long zy(@InterfaceC7396q t8r t8rVar, @InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(t8rVar, "<this>");
        d2ok.m23075h(block, "block");
        ki kiVarMo23685k = t8rVar.mo23685k();
        block.invoke();
        return kiVarMo23685k.toq();
    }
}
