package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.lvui;
import zy.oc;

/* JADX INFO: compiled from: OnBackPressedCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy {

    /* JADX INFO: renamed from: k */
    private boolean f136k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private CopyOnWriteArrayList<toq> f46474toq = new CopyOnWriteArrayList<>();

    public zy(boolean z2) {
        this.f136k = z2;
    }

    @oc
    public final void f7l8() {
        Iterator<toq> it = this.f46474toq.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    @oc
    /* JADX INFO: renamed from: g */
    public final boolean m87g() {
        return this.f136k;
    }

    @oc
    /* JADX INFO: renamed from: n */
    public abstract void mo21n();

    /* JADX INFO: renamed from: q */
    void m88q(@lvui toq toqVar) {
        this.f46474toq.add(toqVar);
    }

    @oc
    /* JADX INFO: renamed from: s */
    public final void m89s(boolean z2) {
        this.f136k = z2;
    }

    /* JADX INFO: renamed from: y */
    void m90y(@lvui toq toqVar) {
        this.f46474toq.remove(toqVar);
    }
}
