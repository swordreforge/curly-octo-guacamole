package androidx.lifecycle;

import android.annotation.SuppressLint;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.z4;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.InterfaceC7840q;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: compiled from: DispatchQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/y;", "", "Ljava/lang/Runnable;", "runnable", "Lkotlin/was;", C7704k.y.toq.f95579toq, AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "f7l8", "n", "", "toq", "Lkotlin/coroutines/f7l8;", "context", "zy", "k", com.market.sdk.reflect.toq.f68929toq, "paused", "finished", "isDraining", "Ljava/util/Queue;", "q", "Ljava/util/Queue;", "queue", C4991s.f28129n, "()V", "lifecycle-runtime-ktx_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C0953y {

    /* JADX INFO: renamed from: k */
    private boolean f5133k = true;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Queue<Runnable> f5134q = new ArrayDeque();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f51602toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f51603zy;

    @zy.oc
    /* JADX INFO: renamed from: g */
    private final void m4487g(Runnable runnable) {
        if (!this.f5134q.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        m4490n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m4489q(C0953y this$0, Runnable runnable) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        kotlin.jvm.internal.d2ok.m23075h(runnable, "$runnable");
        this$0.m4487g(runnable);
    }

    @zy.oc
    public final void f7l8() {
        this.f51602toq = true;
        m4490n();
    }

    @zy.oc
    /* JADX INFO: renamed from: n */
    public final void m4490n() {
        if (this.f51603zy) {
            return;
        }
        try {
            this.f51603zy = true;
            while ((!this.f5134q.isEmpty()) && toq()) {
                Runnable runnablePoll = this.f5134q.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.f51603zy = false;
        }
    }

    @zy.oc
    /* JADX INFO: renamed from: s */
    public final void m4491s() {
        if (this.f5133k) {
            if (!(!this.f51602toq)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.f5133k = false;
            m4490n();
        }
    }

    @zy.oc
    public final boolean toq() {
        return this.f51602toq || !this.f5133k;
    }

    @zy.oc
    /* JADX INFO: renamed from: y */
    public final void m4492y() {
        this.f5133k = true;
    }

    @InterfaceC7840q
    @SuppressLint({"WrongThread"})
    public final void zy(@InterfaceC7396q kotlin.coroutines.f7l8 context, @InterfaceC7396q final Runnable runnable) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        kotlin.jvm.internal.d2ok.m23075h(runnable, "runnable");
        z4 z4VarDxef = C6481a.m23813n().dxef();
        if (z4VarDxef.wlev(context) || toq()) {
            z4VarDxef.bap7(context, new Runnable() { // from class: androidx.lifecycle.f7l8
                @Override // java.lang.Runnable
                public final void run() {
                    C0953y.m4489q(this.f5083k, runnable);
                }
            });
        } else {
            m4487g(runnable);
        }
    }
}
