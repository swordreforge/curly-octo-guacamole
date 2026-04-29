package okhttp3.internal.concurrent;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okhttp3.internal.concurrent.k */
/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public abstract class AbstractC7444k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String f43042k;

    /* JADX INFO: renamed from: q */
    private long f43043q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f93859toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private zy f93860zy;

    public AbstractC7444k(@InterfaceC7396q String name, boolean z2) {
        d2ok.m23075h(name, "name");
        this.f43042k = name;
        this.f93859toq = z2;
        this.f43043q = -1L;
    }

    public final void f7l8(long j2) {
        this.f43043q = j2;
    }

    /* JADX INFO: renamed from: g */
    public abstract long mo26947g();

    /* JADX INFO: renamed from: k */
    public final boolean m26981k() {
        return this.f93859toq;
    }

    /* JADX INFO: renamed from: n */
    public final void m26982n(@InterfaceC7396q zy queue) {
        d2ok.m23075h(queue, "queue");
        zy zyVar = this.f93860zy;
        if (zyVar == queue) {
            return;
        }
        if (!(zyVar == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f93860zy = queue;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final zy m26983q() {
        return this.f93860zy;
    }

    @InterfaceC7396q
    public String toString() {
        return this.f43042k;
    }

    @InterfaceC7396q
    public final String toq() {
        return this.f43042k;
    }

    /* JADX INFO: renamed from: y */
    public final void m26984y(@InterfaceC7395n zy zyVar) {
        this.f93860zy = zyVar;
    }

    public final long zy() {
        return this.f43043q;
    }

    public /* synthetic */ AbstractC7444k(String str, boolean z2, int i2, ni7 ni7Var) {
        this(str, (i2 & 2) != 0 ? true : z2);
    }
}
