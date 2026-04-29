package androidx.activity.contextaware;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ContextAwareHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private final Set<InterfaceC0047q> f33k = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private volatile Context f46340toq;

    /* JADX INFO: renamed from: k */
    public void m15k(@lvui InterfaceC0047q interfaceC0047q) {
        if (this.f46340toq != null) {
            interfaceC0047q.mo8k(this.f46340toq);
        }
        this.f33k.add(interfaceC0047q);
    }

    /* JADX INFO: renamed from: n */
    public void m16n(@lvui InterfaceC0047q interfaceC0047q) {
        this.f33k.remove(interfaceC0047q);
    }

    @dd
    /* JADX INFO: renamed from: q */
    public Context m17q() {
        return this.f46340toq;
    }

    public void toq() {
        this.f46340toq = null;
    }

    public void zy(@lvui Context context) {
        this.f46340toq = context;
        Iterator<InterfaceC0047q> it = this.f33k.iterator();
        while (it.hasNext()) {
            it.next().mo8k(context);
        }
    }
}
