package com.xiaomi.accountsdk.guestaccount.data;

import com.xiaomi.accountsdk.futureservice.C5506q;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: GuestAccountFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public final class toq extends C5506q<zy> {

    /* JADX INFO: renamed from: n */
    private static final String f30849n = "GuestAccountFuture";

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k, java.util.concurrent.FutureTask, java.util.concurrent.Future
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public zy get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        try {
            return (zy) super.get(j2, timeUnit);
        } catch (ExecutionException e2) {
            AbstractC5574n.m19116z(f30849n, "get(,)", e2);
            return com.xiaomi.accountsdk.guestaccount.toq.f72887x2;
        }
    }

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k, java.util.concurrent.FutureTask, java.util.concurrent.Future
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public zy get() throws InterruptedException {
        try {
            return (zy) super.get();
        } catch (ExecutionException e2) {
            AbstractC5574n.m19116z(f30849n, "get()", e2);
            return com.xiaomi.accountsdk.guestaccount.toq.f72887x2;
        }
    }
}
