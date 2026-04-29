package kotlinx.coroutines.test;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlinx.coroutines.internal.hb;
import kotlinx.coroutines.internal.nn86;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: TestCoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B'\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R(\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lkotlinx/coroutines/test/zy;", "", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/internal/hb;", "Lkotlin/was;", "run", C2690k.k.f61039ld6, "", "zy", "", "toString", "k", "Ljava/lang/Runnable;", "", "q", com.market.sdk.reflect.toq.f68928f7l8, "count", "n", "time", "Lkotlinx/coroutines/internal/nn86;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/internal/nn86;", "()Lkotlinx/coroutines/internal/nn86;", "toq", "(Lkotlinx/coroutines/internal/nn86;)V", "heap", AnimatedProperty.PROPERTY_NAME_Y, com.market.sdk.reflect.toq.f28131g, "getIndex", "()I", "setIndex", "(I)V", "index", C4991s.f28129n, "(Ljava/lang/Runnable;JJ)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class zy implements Comparable<zy>, Runnable, hb {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private nn86<?> f37461g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Runnable f37462k;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public final long f37463n;

    /* JADX INFO: renamed from: q */
    private final long f37464q;

    /* JADX INFO: renamed from: y */
    private int f37465y;

    public zy(@InterfaceC7396q Runnable runnable, long j2, long j3) {
        this.f37462k = runnable;
        this.f37464q = j2;
        this.f37463n = j3;
    }

    @Override // kotlinx.coroutines.internal.hb
    public int getIndex() {
        return this.f37465y;
    }

    @Override // kotlinx.coroutines.internal.hb
    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public nn86<?> mo23835q() {
        return this.f37461g;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37462k.run();
    }

    @Override // kotlinx.coroutines.internal.hb
    public void setIndex(int i2) {
        this.f37465y = i2;
    }

    @InterfaceC7396q
    public String toString() {
        return "TimedRunnable(time=" + this.f37463n + ", run=" + this.f37462k + ')';
    }

    @Override // kotlinx.coroutines.internal.hb
    public void toq(@InterfaceC7395n nn86<?> nn86Var) {
        this.f37461g = nn86Var;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public int compareTo(@InterfaceC7396q zy zyVar) {
        long j2 = this.f37463n;
        long j3 = zyVar.f37463n;
        return j2 == j3 ? d2ok.fn3e(this.f37464q, zyVar.f37464q) : d2ok.fn3e(j2, j3);
    }

    public /* synthetic */ zy(Runnable runnable, long j2, long j3, int i2, ni7 ni7Var) {
        this(runnable, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0L : j3);
    }
}
