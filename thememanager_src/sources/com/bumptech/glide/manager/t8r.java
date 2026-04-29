package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.request.InterfaceC3170n;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: RequestTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public class t8r {

    /* JADX INFO: renamed from: q */
    private static final String f18907q = "RequestTracker";

    /* JADX INFO: renamed from: k */
    private final Set<InterfaceC3170n> f18908k = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Set<InterfaceC3170n> f62990toq = new HashSet();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f62991zy;

    public void f7l8() {
        for (InterfaceC3170n interfaceC3170n : com.bumptech.glide.util.kja0.ld6(this.f18908k)) {
            if (!interfaceC3170n.f7l8() && !interfaceC3170n.mo11171n()) {
                interfaceC3170n.clear();
                if (this.f62991zy) {
                    this.f62990toq.add(interfaceC3170n);
                } else {
                    interfaceC3170n.mo11173s();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11106g() {
        this.f62991zy = true;
        for (InterfaceC3170n interfaceC3170n : com.bumptech.glide.util.kja0.ld6(this.f18908k)) {
            if (interfaceC3170n.isRunning()) {
                interfaceC3170n.pause();
                this.f62990toq.add(interfaceC3170n);
            }
        }
    }

    @yz
    /* JADX INFO: renamed from: k */
    void m11107k(InterfaceC3170n interfaceC3170n) {
        this.f18908k.add(interfaceC3170n);
    }

    /* JADX INFO: renamed from: n */
    public void m11108n() {
        this.f62991zy = true;
        for (InterfaceC3170n interfaceC3170n : com.bumptech.glide.util.kja0.ld6(this.f18908k)) {
            if (interfaceC3170n.isRunning() || interfaceC3170n.f7l8()) {
                interfaceC3170n.clear();
                this.f62990toq.add(interfaceC3170n);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m11109q() {
        return this.f62991zy;
    }

    /* JADX INFO: renamed from: s */
    public void m11110s(@lvui InterfaceC3170n interfaceC3170n) {
        this.f18908k.add(interfaceC3170n);
        if (!this.f62991zy) {
            interfaceC3170n.mo11173s();
            return;
        }
        interfaceC3170n.clear();
        if (Log.isLoggable(f18907q, 2)) {
            Log.v(f18907q, "Paused, delaying request");
        }
        this.f62990toq.add(interfaceC3170n);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f18908k.size() + ", isPaused=" + this.f62991zy + "}";
    }

    public boolean toq(@dd InterfaceC3170n interfaceC3170n) {
        boolean z2 = true;
        if (interfaceC3170n == null) {
            return true;
        }
        boolean zRemove = this.f18908k.remove(interfaceC3170n);
        if (!this.f62990toq.remove(interfaceC3170n) && !zRemove) {
            z2 = false;
        }
        if (z2) {
            interfaceC3170n.clear();
        }
        return z2;
    }

    /* JADX INFO: renamed from: y */
    public void m11111y() {
        this.f62991zy = false;
        for (InterfaceC3170n interfaceC3170n : com.bumptech.glide.util.kja0.ld6(this.f18908k)) {
            if (!interfaceC3170n.f7l8() && !interfaceC3170n.isRunning()) {
                interfaceC3170n.mo11173s();
            }
        }
        this.f62990toq.clear();
    }

    public void zy() {
        Iterator it = com.bumptech.glide.util.kja0.ld6(this.f18908k).iterator();
        while (it.hasNext()) {
            toq((InterfaceC3170n) it.next());
        }
        this.f62990toq.clear();
    }
}
