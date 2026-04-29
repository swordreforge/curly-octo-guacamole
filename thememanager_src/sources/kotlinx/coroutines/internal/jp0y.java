package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import kotlin.C6480z;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6699m;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.z4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001b\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016J\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/jp0y;", "Lkotlinx/coroutines/z4;", "Lkotlinx/coroutines/m;", "", "lw", "Lkotlin/coroutines/f7l8;", "context", "", "wlev", "", "parallelism", "Lkotlinx/coroutines/dd;", "ga", "", "time", "bek6", "(JLkotlin/coroutines/q;)Ljava/lang/Object;", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/ch;", "i1", "a5id", "Lkotlinx/coroutines/cdj;", "Lkotlin/was;", "continuation", "gcp", "", "toString", "", "q", "Ljava/lang/Throwable;", "cause", "n", "Ljava/lang/String;", "errorHint", "dxef", "()Lkotlinx/coroutines/z4;", "immediate", C4991s.f28129n, "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class jp0y extends z4 implements InterfaceC6699m {

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final String f37220n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final Throwable f37221q;

    public /* synthetic */ jp0y(Throwable th, String str, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(th, (i2 & 2) != 0 ? null : str);
    }

    private final Void lw() {
        String strMcp;
        if (this.f37221q == null) {
            fti.m24336n();
            throw new C6480z();
        }
        String str = this.f37220n;
        String str2 = "";
        if (str != null && (strMcp = kotlin.jvm.internal.d2ok.mcp(". ", str)) != null) {
            str2 = strMcp;
        }
        throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Module with the Main dispatcher had failed to initialize", str2), this.f37221q);
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    /* JADX INFO: renamed from: a5id, reason: merged with bridge method [inline-methods] */
    public Void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        lw();
        throw new C6480z();
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7395n
    public Object bek6(long j2, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        lw();
        throw new C6480z();
    }

    @Override // kotlinx.coroutines.z4
    @InterfaceC7396q
    public z4 dxef() {
        return this;
    }

    @Override // kotlinx.coroutines.z4, kotlinx.coroutines.dd
    @InterfaceC7396q
    public kotlinx.coroutines.dd ga(int i2) {
        lw();
        throw new C6480z();
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7396q
    /* JADX INFO: renamed from: gcp, reason: merged with bridge method [inline-methods] */
    public Void zy(long j2, @InterfaceC7396q kotlinx.coroutines.cdj<? super was> cdjVar) {
        lw();
        throw new C6480z();
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7396q
    public ch i1(long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        lw();
        throw new C6480z();
    }

    @Override // kotlinx.coroutines.z4, kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f37221q;
        sb.append(th != null ? kotlin.jvm.internal.d2ok.mcp(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.dd
    public boolean wlev(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        lw();
        throw new C6480z();
    }

    public jp0y(@InterfaceC7395n Throwable th, @InterfaceC7395n String str) {
        this.f37221q = th;
        this.f37220n = str;
    }
}
