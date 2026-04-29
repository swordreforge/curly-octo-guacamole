package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.internal.C6690r;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/ij;", "U", C0846k.zaso, "Lkotlinx/coroutines/internal/r;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/was;", "run", "", "m4", "()Ljava/lang/String;", "", C7704k.y.toq.f95579toq, com.market.sdk.reflect.toq.f68928f7l8, "time", "Lkotlin/coroutines/q;", "uCont", C4991s.f28129n, "(JLkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class ij<U, T extends U> extends C6690r<T> implements Runnable {

    /* JADX INFO: renamed from: g */
    @InterfaceC6765n
    public final long f37204g;

    public ij(long j2, @InterfaceC7396q InterfaceC6216q<? super U> interfaceC6216q) {
        super(interfaceC6216q.getContext(), interfaceC6216q);
        this.f37204g = j2;
    }

    @Override // kotlinx.coroutines.AbstractC6696k, kotlinx.coroutines.etdu
    @InterfaceC7396q
    public String m4() {
        return super.m4() + "(timeMillis=" + this.f37204g + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m24056e(nsb.m24510k(this.f37204g, this));
    }
}
