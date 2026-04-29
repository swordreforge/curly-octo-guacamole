package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.xiaomi.onetrack.api.at;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C6480z;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u001c\u0010\u0018\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/ebn;", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlin/was;", "Lkotlinx/coroutines/CompletionHandler;", "", "state", "", "toq", "(I)Ljava/lang/Void;", "q", "()V", "k", "zy", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/gbni;", "Lkotlinx/coroutines/gbni;", at.f31711e, "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/ch;", "n", "Lkotlinx/coroutines/ch;", "cancelHandle", C4991s.f28129n, "(Lkotlinx/coroutines/gbni;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class ebn implements cyoe.x2<Throwable, kotlin.was> {

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f36927g = AtomicIntegerFieldUpdater.newUpdater(ebn.class, "_state");

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final gbni f36928k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private ch f36929n;

    @InterfaceC7396q
    private volatile /* synthetic */ int _state = 0;

    /* JADX INFO: renamed from: q */
    private final Thread f36930q = Thread.currentThread();

    public ebn(@InterfaceC7396q gbni gbniVar) {
        this.f36928k = gbniVar;
    }

    private final Void toq(int i2) {
        throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Illegal state ", Integer.valueOf(i2)).toString());
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
        zy(th);
        return kotlin.was.f36763k;
    }

    /* JADX INFO: renamed from: k */
    public final void m24041k() {
        while (true) {
            int i2 = this._state;
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        toq(i2);
                        throw new C6480z();
                    }
                }
            } else if (f36927g.compareAndSet(this, i2, 1)) {
                ch chVar = this.f36929n;
                if (chVar == null) {
                    return;
                }
                chVar.zy();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m24042q() {
        int i2;
        this.f36929n = this.f36928k.ij(true, true, this);
        do {
            i2 = this._state;
            if (i2 != 0) {
                if (i2 == 2 || i2 == 3) {
                    return;
                }
                toq(i2);
                throw new C6480z();
            }
        } while (!f36927g.compareAndSet(this, i2, 0));
    }

    public void zy(@InterfaceC7395n Throwable th) {
        int i2;
        do {
            i2 = this._state;
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    return;
                }
                toq(i2);
                throw new C6480z();
            }
        } while (!f36927g.compareAndSet(this, i2, 2));
        this.f36930q.interrupt();
        this._state = 3;
    }
}
