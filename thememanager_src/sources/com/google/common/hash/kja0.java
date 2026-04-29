package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: HashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@InterfaceC7731k
public interface kja0 {
    int bits();

    n7h hashBytes(ByteBuffer byteBuffer);

    n7h hashBytes(byte[] bArr);

    n7h hashBytes(byte[] bArr, int i2, int i3);

    n7h hashInt(int i2);

    n7h hashLong(long j2);

    <T> n7h hashObject(T t2, x2<? super T> x2Var);

    n7h hashString(CharSequence charSequence, Charset charset);

    n7h hashUnencodedChars(CharSequence charSequence);

    InterfaceC4663h newHasher();

    InterfaceC4663h newHasher(int i2);
}
