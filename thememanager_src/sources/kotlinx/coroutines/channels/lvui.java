package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.hb;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.selects.InterfaceC6723n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J-\u0010\u0012\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u000eH'J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/lvui;", C0846k.d9i, "", "element", "Lkotlin/was;", "d3", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ki;", C7704k.y.toq.f44691k, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "jp0y", "Lkotlin/Function1;", "Lkotlin/c;", "name", "handler", "n", "offer", "(Ljava/lang/Object;)Z", "oc", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Lkotlinx/coroutines/selects/n;", C7704k.y.toq.f95579toq, "()Lkotlinx/coroutines/selects/n;", "onSend", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface lvui<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.lvui$k */
    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6502k {
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ boolean m23922k(lvui lvuiVar, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i2 & 1) != 0) {
                th = null;
            }
            return lvuiVar.jp0y(th);
        }

        @InterfaceC6533d
        public static /* synthetic */ void toq() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @hb(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean zy(@InterfaceC7396q lvui<? super E> lvuiVar, E e2) throws Throwable {
            Object objMo23921s = lvuiVar.mo23921s(e2);
            if (ki.qrj(objMo23921s)) {
                return true;
            }
            Throwable thM23911g = ki.m23911g(objMo23921s);
            if (thM23911g == null) {
                return false;
            }
            throw kotlinx.coroutines.internal.ncyb.m24375h(thM23911g);
        }
    }

    @InterfaceC7395n
    Object d3(E e2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    InterfaceC6723n<E, lvui<E>> mo23919g();

    boolean jp0y(@InterfaceC7395n Throwable th);

    @InterfaceC6533d
    /* JADX INFO: renamed from: n */
    void mo23920n(@InterfaceC7396q cyoe.x2<? super Throwable, was> x2Var);

    boolean oc();

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @hb(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e2);

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    Object mo23921s(E e2);
}
