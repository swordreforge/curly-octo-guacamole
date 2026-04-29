package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import java.util.concurrent.CancellationException;
import kotlin.hb;
import kotlinx.coroutines.channels.lvui;
import kotlinx.coroutines.gc3c;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.s */
/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0014\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\nH'¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/s;", C0846k.d9i, "Lkotlinx/coroutines/channels/lvui;", "Lkotlinx/coroutines/channels/d3;", "f7l8", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/was;", "q", "", "", "k", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@gc3c
public interface InterfaceC6511s<E> extends lvui<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.s$k */
    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k {
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m23936k(InterfaceC6511s interfaceC6511s, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC6511s.mo23877q(cancellationException);
        }

        public static /* synthetic */ boolean toq(InterfaceC6511s interfaceC6511s, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                th = null;
            }
            return interfaceC6511s.mo23876k(th);
        }

        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @hb(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean zy(@InterfaceC7396q InterfaceC6511s<E> interfaceC6511s, E e2) {
            return lvui.C6502k.zy(interfaceC6511s, e2);
        }
    }

    @InterfaceC7396q
    d3<E> f7l8();

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Binary compatibility only")
    /* JADX INFO: renamed from: k */
    /* synthetic */ boolean mo23876k(Throwable th);

    /* JADX INFO: renamed from: q */
    void mo23877q(@InterfaceC7395n CancellationException cancellationException);
}
