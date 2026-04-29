package com.google.common.io;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.io.n */
/* JADX INFO: compiled from: ByteProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public interface InterfaceC4697n<T> {
    T getResult();

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    boolean m16424k(byte[] bArr, int i2, int i3) throws IOException;
}
