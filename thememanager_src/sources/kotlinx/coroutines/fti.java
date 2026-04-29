package kotlinx.coroutines;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J$\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J:\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0014R/\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/fti;", "", "k", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlin/was;", "toq", "result", "onCancellation", "zy", "", "toString", "", "hashCode", C2690k.k.f61039ld6, "", "equals", "Ljava/lang/Object;", "Lcyoe/x2;", C4991s.f28129n, "(Ljava/lang/Object;Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class fti {

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    @InterfaceC7395n
    public final Object f37185k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public final cyoe.x2<Throwable, kotlin.was> f81999toq;

    /* JADX WARN: Multi-variable type inference failed */
    public fti(@InterfaceC7395n Object obj, @InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        this.f37185k = obj;
        this.f81999toq = x2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ fti m24287q(fti ftiVar, Object obj, cyoe.x2 x2Var, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = ftiVar.f37185k;
        }
        if ((i2 & 2) != 0) {
            x2Var = ftiVar.f81999toq;
        }
        return ftiVar.zy(obj, x2Var);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fti)) {
            return false;
        }
        fti ftiVar = (fti) obj;
        return kotlin.jvm.internal.d2ok.f7l8(this.f37185k, ftiVar.f37185k) && kotlin.jvm.internal.d2ok.f7l8(this.f81999toq, ftiVar.f81999toq);
    }

    public int hashCode() {
        Object obj = this.f37185k;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f81999toq.hashCode();
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Object m24288k() {
        return this.f37185k;
    }

    @InterfaceC7396q
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f37185k + ", onCancellation=" + this.f81999toq + ')';
    }

    @InterfaceC7396q
    public final cyoe.x2<Throwable, kotlin.was> toq() {
        return this.f81999toq;
    }

    @InterfaceC7396q
    public final fti zy(@InterfaceC7395n Object obj, @InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        return new fti(obj, x2Var);
    }
}
