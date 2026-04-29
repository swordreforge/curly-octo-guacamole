package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import kotlin.hb;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.lvui;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/jp0y;", C0846k.d9i, "Lkotlinx/coroutines/f;", "Lkotlinx/coroutines/channels/lvui;", "zy", "()Lkotlinx/coroutines/channels/lvui;", "channel", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface jp0y<E> extends InterfaceC6556f, lvui<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.jp0y$k */
    /* JADX INFO: compiled from: Produce.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6499k {
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @hb(expression = "trySend(element).isSuccess", imports = {}))
        /* JADX INFO: renamed from: k */
        public static <E> boolean m23895k(@InterfaceC7396q jp0y<? super E> jp0yVar, E e2) {
            return lvui.C6502k.zy(jp0yVar, e2);
        }
    }

    @InterfaceC7396q
    lvui<E> zy();
}
