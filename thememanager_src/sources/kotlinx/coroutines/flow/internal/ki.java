package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import kotlin.coroutines.C6217s;
import kotlin.d3;
import kotlinx.coroutines.flow.InterfaceC6622s;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/ki;", C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "q", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public interface ki<T> extends InterfaceC6622s<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ki$k */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6582k {
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ InterfaceC6622s m24131k(ki kiVar, kotlin.coroutines.f7l8 f7l8Var, int i2, kotlinx.coroutines.channels.qrj qrjVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i3 & 1) != 0) {
                f7l8Var = C6217s.INSTANCE;
            }
            if ((i3 & 2) != 0) {
                i2 = -3;
            }
            if ((i3 & 4) != 0) {
                qrjVar = kotlinx.coroutines.channels.qrj.SUSPEND;
            }
            return kiVar.mo24089q(f7l8Var, i2, qrjVar);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    InterfaceC6622s<T> mo24089q(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar);
}
