package kotlinx.coroutines;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J&\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J`\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR1\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010$\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lkotlinx/coroutines/jk;", "", "Lkotlinx/coroutines/ki;", "cont", "", "cause", "Lkotlin/was;", C7704k.y.toq.f44691k, "k", "Lkotlinx/coroutines/kja0;", "toq", "Lkotlin/Function1;", "Lkotlin/c;", "name", "zy", "q", "n", "result", "cancelHandler", "onCancellation", "idempotentResume", "cancelCause", C7704k.y.toq.f95579toq, "", "toString", "", "hashCode", C2690k.k.f61039ld6, "", "equals", "Ljava/lang/Object;", "Lkotlinx/coroutines/kja0;", "Lcyoe/x2;", "Ljava/lang/Throwable;", AnimatedProperty.PROPERTY_NAME_Y, "()Z", "cancelled", C4991s.f28129n, "(Ljava/lang/Object;Lkotlinx/coroutines/kja0;Lcyoe/x2;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class jk {

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    @InterfaceC7395n
    public final Object f37276k;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    @InterfaceC7395n
    public final Throwable f37277n;

    /* JADX INFO: renamed from: q */
    @InterfaceC6765n
    @InterfaceC7395n
    public final Object f37278q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    @InterfaceC7395n
    public final kja0 f82052toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC6765n
    @InterfaceC7395n
    public final cyoe.x2<Throwable, kotlin.was> f82053zy;

    /* JADX WARN: Multi-variable type inference failed */
    public jk(@InterfaceC7395n Object obj, @InterfaceC7395n kja0 kja0Var, @InterfaceC7395n cyoe.x2<? super Throwable, kotlin.was> x2Var, @InterfaceC7395n Object obj2, @InterfaceC7395n Throwable th) {
        this.f37276k = obj;
        this.f82052toq = kja0Var;
        this.f82053zy = x2Var;
        this.f37278q = obj2;
        this.f37277n = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jk f7l8(jk jkVar, Object obj, kja0 kja0Var, cyoe.x2 x2Var, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = jkVar.f37276k;
        }
        if ((i2 & 2) != 0) {
            kja0Var = jkVar.f82052toq;
        }
        kja0 kja0Var2 = kja0Var;
        if ((i2 & 4) != 0) {
            x2Var = jkVar.f82053zy;
        }
        cyoe.x2 x2Var2 = x2Var;
        if ((i2 & 8) != 0) {
            obj2 = jkVar.f37278q;
        }
        Object obj4 = obj2;
        if ((i2 & 16) != 0) {
            th = jkVar.f37277n;
        }
        return jkVar.m24463g(obj, kja0Var2, x2Var2, obj4, th);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return kotlin.jvm.internal.d2ok.f7l8(this.f37276k, jkVar.f37276k) && kotlin.jvm.internal.d2ok.f7l8(this.f82052toq, jkVar.f82052toq) && kotlin.jvm.internal.d2ok.f7l8(this.f82053zy, jkVar.f82053zy) && kotlin.jvm.internal.d2ok.f7l8(this.f37278q, jkVar.f37278q) && kotlin.jvm.internal.d2ok.f7l8(this.f37277n, jkVar.f37277n);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final jk m24463g(@InterfaceC7395n Object obj, @InterfaceC7395n kja0 kja0Var, @InterfaceC7395n cyoe.x2<? super Throwable, kotlin.was> x2Var, @InterfaceC7395n Object obj2, @InterfaceC7395n Throwable th) {
        return new jk(obj, kja0Var, x2Var, obj2, th);
    }

    public int hashCode() {
        Object obj = this.f37276k;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        kja0 kja0Var = this.f82052toq;
        int iHashCode2 = (iHashCode + (kja0Var == null ? 0 : kja0Var.hashCode())) * 31;
        cyoe.x2<Throwable, kotlin.was> x2Var = this.f82053zy;
        int iHashCode3 = (iHashCode2 + (x2Var == null ? 0 : x2Var.hashCode())) * 31;
        Object obj2 = this.f37278q;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f37277n;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Object m24464k() {
        return this.f37276k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Throwable m24465n() {
        return this.f37277n;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final Object m24466q() {
        return this.f37278q;
    }

    /* JADX INFO: renamed from: s */
    public final void m24467s(@InterfaceC7396q ki<?> kiVar, @InterfaceC7396q Throwable th) {
        kja0 kja0Var = this.f82052toq;
        if (kja0Var != null) {
            kiVar.x2(kja0Var, th);
        }
        cyoe.x2<Throwable, kotlin.was> x2Var = this.f82053zy;
        if (x2Var == null) {
            return;
        }
        kiVar.ki(x2Var, th);
    }

    @InterfaceC7396q
    public String toString() {
        return "CompletedContinuation(result=" + this.f37276k + ", cancelHandler=" + this.f82052toq + ", onCancellation=" + this.f82053zy + ", idempotentResume=" + this.f37278q + ", cancelCause=" + this.f37277n + ')';
    }

    @InterfaceC7395n
    public final kja0 toq() {
        return this.f82052toq;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m24468y() {
        return this.f37277n != null;
    }

    @InterfaceC7395n
    public final cyoe.x2<Throwable, kotlin.was> zy() {
        return this.f82053zy;
    }

    public /* synthetic */ jk(Object obj, kja0 kja0Var, cyoe.x2 x2Var, Object obj2, Throwable th, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(obj, (i2 & 2) != 0 ? null : kja0Var, (i2 & 4) != 0 ? null : x2Var, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }
}
