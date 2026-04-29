package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import kotlinx.coroutines.internal.C6679l;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u001a\u0010\n\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\r\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u001a\u0010\u001a\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u0012\u0004\b\u0019\u0010\t*\u001e\b\u0002\u0010\u001d\u001a\u0004\b\u0000\u0010\u001b\"\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\u0012\u0004\u0012\u00028\u00000\u001c¨\u0006\u001e"}, d2 = {"", "timeMillis", "q", "timeNanos", "zy", "Lkotlinx/coroutines/internal/l;", "k", "Lkotlinx/coroutines/internal/l;", "getDISPOSED_TASK$annotations", "()V", "DISPOSED_TASK", "", "toq", com.market.sdk.reflect.toq.f28131g, "SCHEDULE_OK", "SCHEDULE_COMPLETED", "SCHEDULE_DISPOSED", "n", com.market.sdk.reflect.toq.f68928f7l8, "MS_TO_NS", C7704k.y.toq.f95579toq, "MAX_MS", "f7l8", "MAX_DELAY_NS", AnimatedProperty.PROPERTY_NAME_Y, "getCLOSED_EMPTY$annotations", "CLOSED_EMPTY", C0846k.zaso, "Lkotlinx/coroutines/internal/t;", "Queue", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class gyi {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final long f82000f7l8 = 4611686018427387903L;

    /* JADX INFO: renamed from: g */
    private static final long f37190g = 9223372036854L;

    /* JADX INFO: renamed from: n */
    private static final long f37192n = 1000000;

    /* JADX INFO: renamed from: q */
    private static final int f37193q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f82001toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f82002zy = 1;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final C6679l f37191k = new C6679l("REMOVED_TASK");

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final C6679l f37194y = new C6679l("CLOSED_EMPTY");

    /* JADX INFO: renamed from: g */
    private static /* synthetic */ void m24297g() {
    }

    /* JADX INFO: renamed from: n */
    private static /* synthetic */ void m24299n() {
    }

    /* JADX INFO: renamed from: q */
    public static final long m24300q(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        if (j2 >= f37190g) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j2;
    }

    public static final long zy(long j2) {
        return j2 / 1000000;
    }
}
