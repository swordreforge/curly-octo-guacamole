package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import kotlin.C6323o;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.t */
/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/o1t;", "Lkotlin/o;", "result", "", "q", "(Lkotlinx/coroutines/o1t;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/gbni;", "parent", "toq", "value", "k", "(Ljava/lang/Object;)Lkotlinx/coroutines/o1t;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6739t {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> o1t<T> m24619k(T t2) {
        wvg wvgVar = new wvg(null);
        wvgVar.nmn5(t2);
        return wvgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static final <T> boolean m24620q(@InterfaceC7396q o1t<T> o1tVar, @InterfaceC7396q Object obj) {
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        return thM28283exceptionOrNullimpl == null ? o1tVar.nmn5(obj) : o1tVar.mo24513y(thM28283exceptionOrNullimpl);
    }

    @InterfaceC7396q
    public static final <T> o1t<T> toq(@InterfaceC7395n gbni gbniVar) {
        return new wvg(gbniVar);
    }

    public static /* synthetic */ o1t zy(gbni gbniVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gbniVar = null;
        }
        return toq(gbniVar);
    }
}
