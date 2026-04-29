package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.x2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.f7l8;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.ranges.fn3e;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.InterfaceC6699m;
import kotlinx.coroutines.bwp;
import kotlinx.coroutines.cdj;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.ltg8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b+\u0010-J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lkotlinx/coroutines/android/toq;", "Lkotlinx/coroutines/android/zy;", "Lkotlinx/coroutines/m;", "Lkotlin/coroutines/f7l8;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "oki", "", "wlev", "bap7", "", "timeMillis", "Lkotlinx/coroutines/cdj;", "continuation", "zy", "Lkotlinx/coroutines/ch;", "i1", "", "toString", "", C2690k.k.f61039ld6, "equals", "", "hashCode", "Landroid/os/Handler;", "q", "Landroid/os/Handler;", "handler", "n", "Ljava/lang/String;", "name", C7704k.y.toq.f95579toq, com.market.sdk.reflect.toq.f68929toq, "invokeImmediately", "_immediate", "Lkotlinx/coroutines/android/toq;", AnimatedProperty.PROPERTY_NAME_Y, "o05", "()Lkotlinx/coroutines/android/toq;", "immediate", C4991s.f28129n, "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, m22787k = 1, mv = {1, 6, 0})
public final class toq extends zy implements InterfaceC6699m {

    @InterfaceC7395n
    private volatile toq _immediate;

    /* JADX INFO: renamed from: g */
    private final boolean f36781g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final String f36782n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Handler f36783q;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final toq f36784y;

    /* JADX INFO: renamed from: kotlinx.coroutines.android.toq$k */
    /* JADX INFO: compiled from: Runnable.kt */
    @d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/was;", "run", "()V", "kotlinx/coroutines/b3e$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class RunnableC6485k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cdj f36785k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ toq f36786q;

        public RunnableC6485k(cdj cdjVar, toq toqVar) {
            this.f36785k = cdjVar;
            this.f36786q = toqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f36785k.jk(this.f36786q, was.f36763k);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.android.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HandlerDispatcher.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C8065toq extends AbstractC6308r implements x2<Throwable, was> {
        final /* synthetic */ Runnable $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8065toq(Runnable runnable) {
            super(1);
            this.$block = runnable;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Throwable th) {
            toq.this.f36783q.removeCallbacks(this.$block);
        }
    }

    private toq(Handler handler, String str, boolean z2) {
        super(null);
        this.f36783q = handler;
        this.f36782n = str;
        this.f36781g = z2;
        this._immediate = z2 ? this : null;
        toq toqVar = this._immediate;
        if (toqVar == null) {
            toqVar = new toq(handler, str, true);
            this._immediate = toqVar;
        }
        this.f36784y = toqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m58i(toq toqVar, Runnable runnable) {
        toqVar.f36783q.removeCallbacks(runnable);
    }

    private final void oki(f7l8 f7l8Var, Runnable runnable) {
        ltg8.m24478g(f7l8Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C6481a.zy().bap7(f7l8Var, runnable);
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        if (this.f36783q.post(runnable)) {
            return;
        }
        oki(f7l8Var, runnable);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof toq) && ((toq) obj).f36783q == this.f36783q;
    }

    public int hashCode() {
        return System.identityHashCode(this.f36783q);
    }

    @Override // kotlinx.coroutines.android.zy, kotlinx.coroutines.InterfaceC6699m
    @InterfaceC7396q
    public ch i1(long j2, @InterfaceC7396q final Runnable runnable, @InterfaceC7396q f7l8 f7l8Var) {
        if (this.f36783q.postDelayed(runnable, fn3e.mcp(j2, kotlin.time.f7l8.f81943zy))) {
            return new ch() { // from class: kotlinx.coroutines.android.k
                @Override // kotlinx.coroutines.ch
                public final void zy() {
                    toq.m58i(this.f36776k, runnable);
                }
            };
        }
        oki(f7l8Var, runnable);
        return bwp.f36798k;
    }

    @Override // kotlinx.coroutines.z4
    @InterfaceC7396q
    /* JADX INFO: renamed from: o05, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public toq dxef() {
        return this.f36784y;
    }

    @Override // kotlinx.coroutines.z4, kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        String strVy = vy();
        if (strVy != null) {
            return strVy;
        }
        String string = this.f36782n;
        if (string == null) {
            string = this.f36783q.toString();
        }
        return this.f36781g ? d2ok.mcp(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.dd
    public boolean wlev(@InterfaceC7396q f7l8 f7l8Var) {
        return (this.f36781g && d2ok.f7l8(Looper.myLooper(), this.f36783q.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.InterfaceC6699m
    public void zy(long j2, @InterfaceC7396q cdj<? super was> cdjVar) {
        RunnableC6485k runnableC6485k = new RunnableC6485k(cdjVar, this);
        if (this.f36783q.postDelayed(runnableC6485k, fn3e.mcp(j2, kotlin.time.f7l8.f81943zy))) {
            cdjVar.ni7(new C8065toq(runnableC6485k));
        } else {
            oki(cdjVar.getContext(), runnableC6485k);
        }
    }

    public /* synthetic */ toq(Handler handler, String str, int i2, ni7 ni7Var) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    public toq(@InterfaceC7396q Handler handler, @InterfaceC7395n String str) {
        this(handler, str, false);
    }
}
