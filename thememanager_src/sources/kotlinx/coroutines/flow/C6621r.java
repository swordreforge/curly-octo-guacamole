package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.r */
/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/r;", C0846k.zaso, "", "Lkotlinx/coroutines/flow/s;", "k", "Lkotlinx/coroutines/flow/s;", "upstream", "", "toq", com.market.sdk.reflect.toq.f28131g, "extraBufferCapacity", "Lkotlinx/coroutines/channels/qrj;", "zy", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Lkotlin/coroutines/f7l8;", "q", "Lkotlin/coroutines/f7l8;", "context", C4991s.f28129n, "(Lkotlinx/coroutines/flow/s;ILkotlinx/coroutines/channels/qrj;Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6621r<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final InterfaceC6622s<T> f37075k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kotlin.coroutines.f7l8 f37076q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    public final int f81995toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kotlinx.coroutines.channels.qrj f81996zy;

    /* JADX WARN: Multi-variable type inference failed */
    public C6621r(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        this.f37075k = interfaceC6622s;
        this.f81995toq = i2;
        this.f81996zy = qrjVar;
        this.f37076q = f7l8Var;
    }
}
