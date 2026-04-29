package kotlinx.coroutines.selects;

import kotlin.coroutines.InterfaceC6216q;
import kotlin.d3;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.internal.C6694z;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.g */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&R\u0014\u0010\u0015\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/selects/g;", "R", "", "", "ki", "Lkotlinx/coroutines/internal/z$q;", "Lkotlinx/coroutines/internal/PrepareOp;", "otherOp", "x2", "Lkotlinx/coroutines/internal/toq;", "desc", "fu4", "", "exception", "Lkotlin/was;", "zurt", "Lkotlinx/coroutines/ch;", "handle", C7704k.y.toq.f44691k, C7704k.y.toq.f95579toq, "()Z", "isSelected", "Lkotlin/coroutines/q;", "t8r", "()Lkotlin/coroutines/q;", "completion", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public interface InterfaceC6720g<R> {
    @InterfaceC7395n
    Object fu4(@InterfaceC7396q kotlinx.coroutines.internal.toq toqVar);

    /* JADX INFO: renamed from: g */
    boolean mo24565g();

    boolean ki();

    /* JADX INFO: renamed from: s */
    void mo24566s(@InterfaceC7396q ch chVar);

    @InterfaceC7396q
    InterfaceC6216q<R> t8r();

    @InterfaceC7395n
    Object x2(@InterfaceC7395n C6694z.q qVar);

    void zurt(@InterfaceC7396q Throwable th);
}
