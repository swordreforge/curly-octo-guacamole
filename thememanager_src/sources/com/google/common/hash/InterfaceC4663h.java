package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.hash.h */
/* JADX INFO: compiled from: Hasher.java */
/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@InterfaceC7731k
public interface InterfaceC4663h extends mcp {
    @Override // com.google.common.hash.mcp
    InterfaceC4663h f7l8(byte[] bArr);

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: g */
    InterfaceC4663h mo16337g(long j2);

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: k */
    InterfaceC4663h mo16343k(double d2);

    n7h kja0();

    @Override // com.google.common.hash.mcp
    InterfaceC4663h ld6(byte[] bArr, int i2, int i3);

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: n */
    InterfaceC4663h mo16340n(int i2);

    <T> InterfaceC4663h n7h(T t2, x2<? super T> x2Var);

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: p */
    InterfaceC4663h mo16344p(CharSequence charSequence);

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: q */
    InterfaceC4663h mo16345q(boolean z2);

    @Override // com.google.common.hash.mcp
    InterfaceC4663h qrj(CharSequence charSequence, Charset charset);

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: s */
    InterfaceC4663h mo16341s(byte b2);

    @Override // com.google.common.hash.mcp
    InterfaceC4663h toq(float f2);

    @Override // com.google.common.hash.mcp
    InterfaceC4663h x2(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.mcp
    /* JADX INFO: renamed from: y */
    InterfaceC4663h mo16342y(char c2);

    @Override // com.google.common.hash.mcp
    InterfaceC4663h zy(short s2);
}
