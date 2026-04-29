package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.C6697l;
import kotlinx.coroutines.dr;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.q */
/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/q;", C0846k.d9i, "Lkotlinx/coroutines/channels/kja0;", "Lkotlinx/coroutines/channels/g;", "", "cause", "Lkotlin/was;", "w831", "exception", "", "vq", "Lkotlin/coroutines/f7l8;", "parentContext", "Lkotlinx/coroutines/channels/n7h;", "channel", C7704k.q.f95568zurt, C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/channels/n7h;Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
class C6509q<E> extends kja0<E> implements InterfaceC6496g<E> {
    public C6509q(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q n7h<E> n7hVar, boolean z2) {
        super(f7l8Var, n7hVar, false, z2);
        fnq8((gbni) f7l8Var.get(gbni.ygy));
    }

    @Override // kotlinx.coroutines.etdu
    protected boolean vq(@InterfaceC7396q Throwable th) {
        C6697l.toq(getContext(), th);
        return true;
    }

    @Override // kotlinx.coroutines.etdu
    protected void w831(@InterfaceC7395n Throwable th) {
        n7h<E> n7hVarEbn = ebn();
        if (th != null) {
            cancellationExceptionM24039k = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM24039k == null) {
                cancellationExceptionM24039k = dr.m24039k(kotlin.jvm.internal.d2ok.mcp(C6551e.m24040k(this), " was cancelled"), th);
            }
        }
        n7hVarEbn.mo23862q(cancellationExceptionM24039k);
    }
}
