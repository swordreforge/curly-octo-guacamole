package kotlinx.coroutines.debug.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.d3;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/debug/internal/ld6;", C0846k.zaso, "Ljava/lang/ref/WeakReference;", "", "k", com.market.sdk.reflect.toq.f28131g, "hash", "ref", "Ljava/lang/ref/ReferenceQueue;", "queue", C4991s.f28129n, "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class ld6<T> extends WeakReference<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    public final int f36895k;

    public ld6(T t2, @InterfaceC7395n ReferenceQueue<T> referenceQueue) {
        super(t2, referenceQueue);
        this.f36895k = t2 == null ? 0 : t2.hashCode();
    }
}
