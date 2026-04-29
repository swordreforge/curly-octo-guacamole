package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.util.C3844k;
import java.nio.ByteBuffer;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.g */
/* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3653g extends com.google.android.exoplayer2.decoder.qrj<x2, qrj, C3660s> implements InterfaceC3691y {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final String f65690n7h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.g$k */
    /* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
    class k extends qrj {
        k() {
        }

        @Override // com.google.android.exoplayer2.decoder.AbstractC3294p
        public void cdj() {
            AbstractC3653g.this.ki(this);
        }
    }

    protected AbstractC3653g(String str) {
        super(new x2[2], new qrj[2]);
        this.f65690n7h = str;
        fn3e(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.qrj
    /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
    public final qrj mo11578y() {
        return new k();
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC3289g
    public final String getName() {
        return this.f65690n7h;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC3691y
    /* JADX INFO: renamed from: k */
    public void mo12866k(long j2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.qrj
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public final x2 f7l8() {
        return new x2();
    }

    protected abstract f7l8 o1t(byte[] bArr, int i2, boolean z2) throws C3660s;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.qrj
    @dd
    /* JADX INFO: renamed from: wvg, reason: merged with bridge method [inline-methods] */
    public final C3660s mo11576p(x2 x2Var, qrj qrjVar, boolean z2) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C3844k.f7l8(x2Var.f19612g);
            qrjVar.ki(x2Var.f19618s, o1t(byteBuffer.array(), byteBuffer.limit(), z2), x2Var.f22137l);
            qrjVar.m11566p(Integer.MIN_VALUE);
            return null;
        } catch (C3660s e2) {
            return e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.decoder.qrj
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final C3660s mo11577s(Throwable th) {
        return new C3660s("Unexpected decode error", th);
    }
}
