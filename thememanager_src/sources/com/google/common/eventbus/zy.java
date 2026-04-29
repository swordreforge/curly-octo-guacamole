package com.google.common.eventbus;

import com.google.common.base.fu4;
import com.google.common.base.jk;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: DeadEvent.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public class zy {

    /* JADX INFO: renamed from: k */
    private final Object f26860k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object f68266toq;

    public zy(Object obj, Object obj2) {
        this.f26860k = jk.a9(obj);
        this.f68266toq = jk.a9(obj2);
    }

    /* JADX INFO: renamed from: k */
    public Object m16187k() {
        return this.f68266toq;
    }

    public String toString() {
        return fu4.zy(this).m15356g("source", this.f26860k).m15356g("event", this.f68266toq).toString();
    }

    public Object toq() {
        return this.f26860k;
    }
}
