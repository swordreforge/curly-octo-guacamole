package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.kja0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MenuHostHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class fu4 {

    /* JADX INFO: renamed from: k */
    private final Runnable f4023k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final CopyOnWriteArrayList<wvg> f50813toq = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Map<wvg, C0684k> f50814zy = new HashMap();

    /* JADX INFO: renamed from: androidx.core.view.fu4$k */
    /* JADX INFO: compiled from: MenuHostHelper.java */
    private static class C0684k {

        /* JADX INFO: renamed from: k */
        final androidx.lifecycle.kja0 f4024k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private androidx.lifecycle.fn3e f50815toq;

        C0684k(@zy.lvui androidx.lifecycle.kja0 kja0Var, @zy.lvui androidx.lifecycle.fn3e fn3eVar) {
            this.f4024k = kja0Var;
            this.f50815toq = fn3eVar;
            kja0Var.mo4451k(fn3eVar);
        }

        /* JADX INFO: renamed from: k */
        void m3276k() {
            this.f4024k.zy(this.f50815toq);
            this.f50815toq = null;
        }
    }

    public fu4(@zy.lvui Runnable runnable) {
        this.f4023k = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f7l8(kja0.zy zyVar, wvg wvgVar, InterfaceC0954z interfaceC0954z, kja0.toq toqVar) {
        if (toqVar == kja0.toq.upTo(zyVar)) {
            zy(wvgVar);
            return;
        }
        if (toqVar == kja0.toq.ON_DESTROY) {
            x2(wvgVar);
        } else if (toqVar == kja0.toq.downFrom(zyVar)) {
            this.f50813toq.remove(wvgVar);
            this.f4023k.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m3269g(wvg wvgVar, InterfaceC0954z interfaceC0954z, kja0.toq toqVar) {
        if (toqVar == kja0.toq.ON_DESTROY) {
            x2(wvgVar);
        }
    }

    public void ld6(@zy.lvui Menu menu) {
        Iterator<wvg> it = this.f50813toq.iterator();
        while (it.hasNext()) {
            it.next().toq(menu);
        }
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: n */
    public void m3271n(@zy.lvui final wvg wvgVar, @zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui final kja0.zy zyVar) {
        androidx.lifecycle.kja0 lifecycle = interfaceC0954z.getLifecycle();
        C0684k c0684kRemove = this.f50814zy.remove(wvgVar);
        if (c0684kRemove != null) {
            c0684kRemove.m3276k();
        }
        this.f50814zy.put(wvgVar, new C0684k(lifecycle, new androidx.lifecycle.fn3e() { // from class: androidx.core.view.ni7
            @Override // androidx.lifecycle.fn3e
            public final void gvn7(InterfaceC0954z interfaceC0954z2, kja0.toq toqVar) {
                this.f4076k.f7l8(zyVar, wvgVar, interfaceC0954z2, toqVar);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public boolean m3272p(@zy.lvui MenuItem menuItem) {
        Iterator<wvg> it = this.f50813toq.iterator();
        while (it.hasNext()) {
            if (it.next().zy(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public void m3273q(@zy.lvui final wvg wvgVar, @zy.lvui InterfaceC0954z interfaceC0954z) {
        zy(wvgVar);
        androidx.lifecycle.kja0 lifecycle = interfaceC0954z.getLifecycle();
        C0684k c0684kRemove = this.f50814zy.remove(wvgVar);
        if (c0684kRemove != null) {
            c0684kRemove.m3276k();
        }
        this.f50814zy.put(wvgVar, new C0684k(lifecycle, new androidx.lifecycle.fn3e() { // from class: androidx.core.view.zurt
            @Override // androidx.lifecycle.fn3e
            public final void gvn7(InterfaceC0954z interfaceC0954z2, kja0.toq toqVar) {
                this.f4205k.m3269g(wvgVar, interfaceC0954z2, toqVar);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m3274s(@zy.lvui Menu menu) {
        Iterator<wvg> it = this.f50813toq.iterator();
        while (it.hasNext()) {
            it.next().m3550k(menu);
        }
    }

    public void x2(@zy.lvui wvg wvgVar) {
        this.f50813toq.remove(wvgVar);
        C0684k c0684kRemove = this.f50814zy.remove(wvgVar);
        if (c0684kRemove != null) {
            c0684kRemove.m3276k();
        }
        this.f4023k.run();
    }

    /* JADX INFO: renamed from: y */
    public void m3275y(@zy.lvui Menu menu, @zy.lvui MenuInflater menuInflater) {
        Iterator<wvg> it = this.f50813toq.iterator();
        while (it.hasNext()) {
            it.next().m3551q(menu, menuInflater);
        }
    }

    public void zy(@zy.lvui wvg wvgVar) {
        this.f50813toq.add(wvgVar);
        this.f4023k.run();
    }
}
