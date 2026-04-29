package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import kotlinx.coroutines.internal.C6679l;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0001H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u0005H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u0012\u0004\b\u0015\u0010\u0012\"\u001a\u0010\u0019\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u0018\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0012\"\u001a\u0010\u001e\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u0012\u0004\b\u001d\u0010\u0012\"\u001a\u0010 \u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u0012\u0004\b\u001f\u0010\u0012*(\b\u0000\u0010$\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#0!2\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#0!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {C0846k.d9i, "", "Lkotlinx/coroutines/channels/ki;", "f7l8", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ni7;", AnimatedProperty.PROPERTY_NAME_Y, "(Lkotlinx/coroutines/channels/ni7;)Ljava/lang/Object;", "", "k", com.market.sdk.reflect.toq.f28131g, "RECEIVE_THROWS_ON_CLOSE", "toq", "RECEIVE_RESULT", "Lkotlinx/coroutines/internal/l;", "zy", "Lkotlinx/coroutines/internal/l;", "getEMPTY$annotations", "()V", "EMPTY", "q", "getOFFER_SUCCESS$annotations", "OFFER_SUCCESS", "n", "getOFFER_FAILED$annotations", "OFFER_FAILED", C7704k.y.toq.f95579toq, "getPOLL_FAILED$annotations", "POLL_FAILED", "getENQUEUE_FAILED$annotations", "ENQUEUE_FAILED", "getHANDLER_INVOKED$annotations", "HANDLER_INVOKED", "Lkotlin/Function1;", "", "Lkotlin/was;", "Handler", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class toq {

    /* JADX INFO: renamed from: k */
    public static final int f36854k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f81965toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f81966zy = new C6679l("EMPTY");

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f36856q = new C6679l("OFFER_SUCCESS");

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f36855n = new C6679l("OFFER_FAILED");

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f36853g = new C6679l("POLL_FAILED");

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f81964f7l8 = new C6679l("ENQUEUE_FAILED");

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f36857y = new C6679l("ON_CLOSE_HANDLER_INVOKED");

    private static final <E> Object f7l8(Object obj) {
        return obj instanceof ni7 ? ki.f81958toq.m23918k(((ni7) obj).f36836g) : ki.f81958toq.zy(obj);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m23959g() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m23960k() {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m23961n() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m23962q() {
    }

    public static /* synthetic */ void toq() {
    }

    /* JADX INFO: renamed from: y */
    private static final <E> Object m23963y(ni7<?> ni7Var) {
        return ki.f81958toq.m23918k(ni7Var.f36836g);
    }

    public static /* synthetic */ void zy() {
    }
}
