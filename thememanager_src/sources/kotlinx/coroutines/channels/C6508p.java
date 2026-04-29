package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import kotlinx.coroutines.gc3c;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.p */
/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {C0846k.d9i, "", "capacity", "Lkotlinx/coroutines/channels/s;", "k", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6508p {
    @InterfaceC7396q
    @gc3c
    /* JADX INFO: renamed from: k */
    public static final <E> InterfaceC6511s<E> m23935k(int i2) {
        if (i2 == -2) {
            return new f7l8(n7h.zzoo.m23927k());
        }
        if (i2 == -1) {
            return new o1t();
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        }
        if (i2 != Integer.MAX_VALUE) {
            return new f7l8(i2);
        }
        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
    }
}
