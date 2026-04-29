package kotlinx.coroutines.internal;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.f7l8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/vyq;", "Lkotlin/coroutines/f7l8$zy;", "Lkotlinx/coroutines/internal/uv6;", "Ljava/lang/ThreadLocal;", "k", "threadLocal", "toq", "", "toString", "", "hashCode", "", C2690k.k.f61039ld6, "", "equals", "Ljava/lang/ThreadLocal;", C4991s.f28129n, "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@kotlin.nn86
public final class vyq implements f7l8.zy<uv6<?>> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ThreadLocal<?> f37257k;

    public vyq(@InterfaceC7396q ThreadLocal<?> threadLocal) {
        this.f37257k = threadLocal;
    }

    /* JADX INFO: renamed from: k */
    private final ThreadLocal<?> m24417k() {
        return this.f37257k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ vyq zy(vyq vyqVar, ThreadLocal threadLocal, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            threadLocal = vyqVar.f37257k;
        }
        return vyqVar.toq(threadLocal);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyq) && kotlin.jvm.internal.d2ok.f7l8(this.f37257k, ((vyq) obj).f37257k);
    }

    public int hashCode() {
        return this.f37257k.hashCode();
    }

    @InterfaceC7396q
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f37257k + ')';
    }

    @InterfaceC7396q
    public final vyq toq(@InterfaceC7396q ThreadLocal<?> threadLocal) {
        return new vyq(threadLocal);
    }
}
