package kotlinx.coroutines;

import com.miui.maml.folme.AnimatedProperty;
import kotlinx.coroutines.internal.C6679l;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0014\"\u001a\u0010\u001b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u0012\u0004\b\u001a\u0010\u0007\"\u001a\u0010 \u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0007\"\u001a\u0010#\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u0012\u0004\b\"\u0010\u0007¨\u0006$"}, d2 = {"", "f7l8", "kja0", "Lkotlinx/coroutines/internal/l;", "k", "Lkotlinx/coroutines/internal/l;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "toq", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", "zy", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "q", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "", "n", com.market.sdk.reflect.toq.f28131g, "RETRY", C7704k.y.toq.f95579toq, "FALSE", "TRUE", AnimatedProperty.PROPERTY_NAME_Y, "getSEALED$annotations", "SEALED", "Lkotlinx/coroutines/t8iq;", C7704k.y.toq.f44691k, "Lkotlinx/coroutines/t8iq;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "p", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class sok {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f82067f7l8 = 1;

    /* JADX INFO: renamed from: g */
    private static final int f37411g = 0;

    /* JADX INFO: renamed from: n */
    private static final int f37413n = -1;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final C6679l f37412k = new C6679l("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f82068toq = new C6679l("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6679l f82069zy = new C6679l("COMPLETING_RETRY");

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final C6679l f37415q = new C6679l("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final C6679l f37417y = new C6679l("SEALED");

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final t8iq f37416s = new t8iq(false);

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private static final t8iq f37414p = new t8iq(true);

    @InterfaceC7395n
    public static final Object f7l8(@InterfaceC7395n Object obj) {
        return obj instanceof fnq8 ? new qo((fnq8) obj) : obj;
    }

    @InterfaceC7395n
    public static final Object kja0(@InterfaceC7395n Object obj) {
        fnq8 fnq8Var;
        qo qoVar = obj instanceof qo ? (qo) obj : null;
        return (qoVar == null || (fnq8Var = qoVar.f37320k) == null) ? obj : fnq8Var;
    }

    private static /* synthetic */ void ld6() {
    }

    private static /* synthetic */ void n7h() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m24581p() {
    }

    private static /* synthetic */ void qrj() {
    }

    /* JADX INFO: renamed from: s */
    private static /* synthetic */ void m24583s() {
    }

    private static /* synthetic */ void x2() {
    }

    /* JADX INFO: renamed from: y */
    private static /* synthetic */ void m24584y() {
    }
}
