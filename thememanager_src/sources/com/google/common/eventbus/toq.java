package com.google.common.eventbus;

import com.google.common.eventbus.C4611n;
import java.util.concurrent.Executor;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: AsyncEventBus.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public class toq extends C4611n {
    public toq(String str, Executor executor) {
        super(str, executor, AbstractC4613q.zy(), C4611n.k.f26847k);
    }

    public toq(Executor executor, InterfaceC4614s interfaceC4614s) {
        super("default", executor, AbstractC4613q.zy(), interfaceC4614s);
    }

    public toq(Executor executor) {
        super("default", executor, AbstractC4613q.zy(), C4611n.k.f26847k);
    }
}
