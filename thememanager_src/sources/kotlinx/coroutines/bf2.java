package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.C6231h;
import kotlin.coroutines.InterfaceC6216q;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198 X \u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/bf2;", C0846k.zaso, "Lkotlinx/coroutines/scheduling/ld6;", "Lkotlinx/coroutines/SchedulerTask;", "", AnimatedProperty.PROPERTY_NAME_Y, "()Ljava/lang/Object;", "takenState", "", "cause", "Lkotlin/was;", "zy", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", C7704k.y.toq.f95579toq, "(Ljava/lang/Object;)Ljava/lang/Object;", "n", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "f7l8", "", com.market.sdk.reflect.toq.f28131g, "resumeMode", "Lkotlin/coroutines/q;", "q", "()Lkotlin/coroutines/q;", "delegate", C4991s.f28129n, "(I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class bf2<T> extends kotlinx.coroutines.scheduling.ld6 {

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public int f36789n;

    public bf2(int i2) {
        this.f36789n = i2;
    }

    public final void f7l8(@InterfaceC7395n Throwable th, @InterfaceC7395n Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C6231h.m22845k(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.d2ok.qrj(th);
        C6697l.toq(mo23829q().getContext(), new uv6("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public <T> T mo23827g(@InterfaceC7395n Object obj) {
        return obj;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public Throwable mo23828n(@InterfaceC7395n Object obj) {
        a9 a9Var = obj instanceof a9 ? (a9) obj : null;
        if (a9Var == null) {
            return null;
        }
        return a9Var.f36774k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public abstract InterfaceC6216q<T> mo23829q();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[Catch: all -> 0x00b0, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x00b0, blocks: (B:3:0x0002, B:5:0x0019, B:23:0x007d, B:25:0x0083, B:33:0x00a6, B:36:0x00af, B:35:0x00ac, B:8:0x001f, B:10:0x002d, B:12:0x0035, B:15:0x0041, B:17:0x0047, B:21:0x0079, B:19:0x005e, B:20:0x006c), top: B:46:0x0002, inners: #2 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bf2.run():void");
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public abstract Object mo23830y();

    public void zy(@InterfaceC7395n Object obj, @InterfaceC7396q Throwable th) {
    }
}
