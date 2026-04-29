package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: PrimitiveSink.java */
/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@InterfaceC7731k
public interface mcp {
    mcp f7l8(byte[] bArr);

    /* JADX INFO: renamed from: g */
    mcp mo16337g(long j2);

    /* JADX INFO: renamed from: k */
    mcp mo16343k(double d2);

    mcp ld6(byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: n */
    mcp mo16340n(int i2);

    /* JADX INFO: renamed from: p */
    mcp mo16344p(CharSequence charSequence);

    /* JADX INFO: renamed from: q */
    mcp mo16345q(boolean z2);

    mcp qrj(CharSequence charSequence, Charset charset);

    /* JADX INFO: renamed from: s */
    mcp mo16341s(byte b2);

    mcp toq(float f2);

    mcp x2(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: y */
    mcp mo16342y(char c2);

    mcp zy(short s2);
}
