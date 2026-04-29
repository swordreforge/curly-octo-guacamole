package com.xiaomi.accountsdk.futureservice;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.futureservice.q */
/* JADX INFO: compiled from: SimpleClientFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5506q<DataType> extends AbstractC5505k<DataType, DataType> {
    public C5506q() {
        super(null);
    }

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
    protected DataType toq(DataType datatype) throws Throwable {
        return datatype;
    }

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
    /* JADX INFO: renamed from: n */
    public void mo18833n(ExecutionException executionException) throws Exception {
        throw executionException;
    }
}
