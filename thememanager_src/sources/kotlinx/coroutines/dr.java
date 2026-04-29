package kotlinx.coroutines;

import com.android.thememanager.settingssearch.C2690k;
import java.util.concurrent.CancellationException;
import kotlin.C6231h;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0080\b*\n\u0010\n\"\u00020\u00042\u00020\u0004¨\u0006\u000b"}, d2 = {"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "k", C2690k.k.f61039ld6, "Lkotlin/was;", "toq", "CancellationException", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class dr {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final CancellationException m24039k(@InterfaceC7395n String str, @InterfaceC7395n Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void toq(@InterfaceC7396q Throwable th, @InterfaceC7396q Throwable th2) {
        C6231h.m22845k(th, th2);
    }
}
