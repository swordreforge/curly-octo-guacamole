package com.android.thememanager.view;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.android.thememanager.view.z */
/* JADX INFO: compiled from: PickerDragController.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2946z {

    /* JADX INFO: renamed from: k */
    private int f17728k;

    public C2946z(int source) {
        this.f17728k = source;
    }

    /* JADX INFO: renamed from: g */
    private void m10454g(int messageFlag, int messageTo, o1t event) {
        C2919i c2919iM10455k = m10455k();
        c2919iM10455k.f17545k = messageTo;
        c2919iM10455k.f61513toq = messageFlag;
        c2919iM10455k.f61514zy = event;
        ni7.m10416q(c2919iM10455k);
    }

    /* JADX INFO: renamed from: k */
    private C2919i m10455k() {
        C2919i c2919i = new C2919i();
        c2919i.f17545k = this.f17728k;
        return c2919i;
    }

    /* JADX INFO: renamed from: n */
    public void m10456n(MotionEvent event) {
        o1t o1tVar = new o1t();
        o1tVar.f17659q = event;
        o1tVar.f17660y = 0;
        C2919i c2919iM10455k = m10455k();
        c2919iM10455k.f61514zy = o1tVar;
        c2919iM10455k.f61513toq = 103;
        ni7.m10416q(c2919iM10455k);
    }

    /* JADX INFO: renamed from: q */
    public void m10457q(o1t event, int dragTo) {
        m10454g(100, dragTo, event);
    }

    public void toq(int messageTo, o1t event) {
        m10454g(101, messageTo, event);
    }

    public void zy(int messageTo, o1t event) {
        m10454g(102, messageTo, event);
    }
}
