package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0015\u001a\u00020\rH'J\u0014\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&J1\u0010\u001a\u001a\u00020\r2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u0018H&J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\tH'J<\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lkotlinx/coroutines/cdj;", C0846k.zaso, "Lkotlin/coroutines/q;", "value", "", "idempotent", "qrj", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlin/was;", "onCancellation", "lvui", "(Ljava/lang/Object;Ljava/lang/Object;Lcyoe/x2;)Ljava/lang/Object;", "exception", "kja0", "token", "r", "a9", "", "k", "Lkotlinx/coroutines/CompletionHandler;", "handler", "ni7", "Lkotlinx/coroutines/dd;", "jk", "(Lkotlinx/coroutines/dd;Ljava/lang/Object;)V", "cdj", "n7h", "(Ljava/lang/Object;Lcyoe/x2;)V", "isActive", "()Z", "p", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface cdj<T> extends InterfaceC6216q<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.cdj$k */
    /* JADX INFO: compiled from: CancellableContinuation.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6491k {
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ boolean m23849k(cdj cdjVar, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                th = null;
            }
            return cdjVar.mo23846k(th);
        }

        public static /* synthetic */ Object toq(cdj cdjVar, Object obj, Object obj2, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            return cdjVar.qrj(obj, obj2);
        }
    }

    @tfm
    void a9();

    @InterfaceC6533d
    void cdj(@InterfaceC7396q dd ddVar, @InterfaceC7396q Throwable th);

    boolean isActive();

    boolean isCancelled();

    @InterfaceC6533d
    void jk(@InterfaceC7396q dd ddVar, T t2);

    /* JADX INFO: renamed from: k */
    boolean mo23846k(@InterfaceC7395n Throwable th);

    @InterfaceC7395n
    @tfm
    Object kja0(@InterfaceC7396q Throwable th);

    @InterfaceC7395n
    @tfm
    Object lvui(T t2, @InterfaceC7395n Object obj, @InterfaceC7395n cyoe.x2<? super Throwable, kotlin.was> x2Var);

    @InterfaceC6533d
    void n7h(T t2, @InterfaceC7395n cyoe.x2<? super Throwable, kotlin.was> x2Var);

    void ni7(@InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var);

    /* JADX INFO: renamed from: p */
    boolean mo23847p();

    @InterfaceC7395n
    @tfm
    Object qrj(T t2, @InterfaceC7395n Object obj);

    @tfm
    /* JADX INFO: renamed from: r */
    void mo23848r(@InterfaceC7396q Object obj);
}
