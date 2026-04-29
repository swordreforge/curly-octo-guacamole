package com.android.thememanager.controller;

import com.android.thememanager.basemodule.local.InterfaceC1744k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.controller.q */
/* JADX INFO: compiled from: DataManager.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1949q {

    /* JADX INFO: renamed from: k */
    protected fu4 f11062k;

    /* JADX INFO: renamed from: q */
    protected List<InterfaceC1744k> f11063q = new ArrayList();

    public AbstractC1949q(fu4 context) {
        this.f11062k = context;
    }

    /* JADX INFO: renamed from: k */
    public void m7669k(InterfaceC1744k observer) {
        if (observer != null) {
            synchronized (this.f11063q) {
                this.f11063q.add(observer);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo7670n(fu4 context) {
        this.f11062k = context;
    }

    /* JADX INFO: renamed from: q */
    public void m7671q(InterfaceC1744k observer) {
        if (observer != null) {
            synchronized (this.f11063q) {
                this.f11063q.remove(observer);
            }
        }
    }

    protected void toq() {
        synchronized (this.f11063q) {
            Iterator<InterfaceC1744k> it = this.f11063q.iterator();
            while (it.hasNext()) {
                it.next().onDataSetUpdated();
            }
        }
    }

    protected void zy(Resource resource) {
        synchronized (this.f11063q) {
            Iterator<InterfaceC1744k> it = this.f11063q.iterator();
            while (it.hasNext()) {
                it.next().onDataUpdated(resource);
            }
        }
    }
}
