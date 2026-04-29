package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.hb;
import kotlin.internal.InterfaceC6244y;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.d3;
import kotlinx.coroutines.gc3c;
import kotlinx.coroutines.selects.InterfaceC6725q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.g */
/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/channels/g;", C0846k.d9i, "Lkotlinx/coroutines/f;", "Lkotlinx/coroutines/channels/d3;", "Lkotlinx/coroutines/channels/n7h;", "zy", "()Lkotlinx/coroutines/channels/n7h;", "channel", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@gc3c
public interface InterfaceC6496g<E> extends InterfaceC6556f, d3<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.g$k */
    /* JADX INFO: compiled from: Actor.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k {
        @InterfaceC6244y
        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @hb(expression = "receiveCatching().getOrNull()", imports = {}))
        /* JADX INFO: renamed from: q */
        public static <E> Object m23889q(@InterfaceC7396q InterfaceC6496g<E> interfaceC6496g, @InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q) {
            return d3.C6493k.m23868s(interfaceC6496g, interfaceC6216q);
        }

        @InterfaceC7396q
        public static <E> InterfaceC6725q<E> toq(@InterfaceC7396q InterfaceC6496g<E> interfaceC6496g) {
            return d3.C6493k.m23867q(interfaceC6496g);
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @hb(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E zy(@InterfaceC7396q InterfaceC6496g<E> interfaceC6496g) {
            return (E) d3.C6493k.m23869y(interfaceC6496g);
        }
    }

    @InterfaceC7396q
    n7h<E> zy();
}
