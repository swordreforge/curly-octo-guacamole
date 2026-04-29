package com.google.common.eventbus;

import com.google.common.base.jk;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.common.eventbus.y */
/* JADX INFO: compiled from: SubscriberExceptionContext.java */
/* JADX INFO: loaded from: classes2.dex */
public class C4615y {

    /* JADX INFO: renamed from: k */
    private final C4611n f26858k;

    /* JADX INFO: renamed from: q */
    private final Method f26859q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object f68264toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Object f68265zy;

    C4615y(C4611n c4611n, Object obj, Object obj2, Method method) {
        this.f26858k = (C4611n) jk.a9(c4611n);
        this.f68264toq = jk.a9(obj);
        this.f68265zy = jk.a9(obj2);
        this.f26859q = (Method) jk.a9(method);
    }

    /* JADX INFO: renamed from: k */
    public Object m16185k() {
        return this.f68264toq;
    }

    /* JADX INFO: renamed from: q */
    public Method m16186q() {
        return this.f26859q;
    }

    public C4611n toq() {
        return this.f26858k;
    }

    public Object zy() {
        return this.f68265zy;
    }
}
