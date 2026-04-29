package kotlinx.coroutines.selects;

import cyoe.x2;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.d3;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.ek5k;
import kotlinx.coroutines.internal.C6679l;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\u000bH\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0015\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u0019\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0014\"\u001a\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u001d\u0010\u0014\"\u001a\u0010#\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"R", "Lkotlinx/coroutines/selects/k;", "Lkotlin/time/n;", "timeout", "Lkotlin/Function1;", "Lkotlin/coroutines/q;", "", "block", "Lkotlin/was;", "ld6", "(Lkotlinx/coroutines/selects/k;JLcyoe/x2;)V", "Lkotlin/fn3e;", "builder", "x2", "(Lcyoe/x2;Lkotlin/coroutines/q;)Ljava/lang/Object;", "k", "Ljava/lang/Object;", C7704k.y.toq.f95579toq, "()Ljava/lang/Object;", "getNOT_SELECTED$annotations", "()V", "NOT_SELECTED", "toq", "q", "getALREADY_SELECTED$annotations", "ALREADY_SELECTED", "zy", "getUNDECIDED$annotations", "UNDECIDED", "getRESUMED$annotations", "RESUMED", "Lkotlinx/coroutines/selects/s;", "n", "Lkotlinx/coroutines/selects/s;", "getSelectOpSequenceNumber$annotations", "selectOpSequenceNumber", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final Object f37396k = new C6679l("NOT_SELECTED");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final Object f82063toq = new C6679l("ALREADY_SELECTED");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final Object f82064zy = new C6679l("UNDECIDED");

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final Object f37398q = new C6679l("RESUMED");

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final C6726s f37397n = new C6726s();

    public static /* synthetic */ void f7l8() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final Object m24558g() {
        return f37396k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6533d
    public static final <R> void ld6(@InterfaceC7396q InterfaceC6721k<? super R> interfaceC6721k, long j2, @InterfaceC7396q x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
        interfaceC6721k.mo24568n(ek5k.m24044n(j2), x2Var);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m24560n() {
    }

    /* JADX INFO: renamed from: p */
    private static /* synthetic */ void m24561p() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final Object m24562q() {
        return f82063toq;
    }

    private static final <R> Object qrj(x2<? super InterfaceC6721k<? super R>, was> x2Var, InterfaceC6216q<? super R> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(0);
        toq toqVar = new toq(interfaceC6216q);
        try {
            x2Var.invoke(toqVar);
        } catch (Throwable th) {
            toqVar.nmn5(th);
        }
        Object objCh = toqVar.ch();
        if (objCh == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        kotlin.jvm.internal.d3.m23089n(1);
        return objCh;
    }

    /* JADX INFO: renamed from: s */
    private static /* synthetic */ void m24563s() {
    }

    @InterfaceC7395n
    public static final <R> Object x2(@InterfaceC7396q x2<? super InterfaceC6721k<? super R>, was> x2Var, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        toq toqVar = new toq(interfaceC6216q);
        try {
            x2Var.invoke(toqVar);
        } catch (Throwable th) {
            toqVar.nmn5(th);
        }
        Object objCh = toqVar.ch();
        if (objCh == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objCh;
    }

    /* JADX INFO: renamed from: y */
    private static /* synthetic */ void m24564y() {
    }
}
