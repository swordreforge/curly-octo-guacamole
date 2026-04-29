package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.util.C3844k;
import java.nio.ByteBuffer;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.g */
/* JADX INFO: compiled from: SimpleMetadataDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3483g implements InterfaceC3500k {
    @Override // com.google.android.exoplayer2.metadata.InterfaceC3500k
    @dd
    /* JADX INFO: renamed from: k */
    public final Metadata mo12291k(zy zyVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C3844k.f7l8(zyVar.f19612g);
        C3844k.m13629k(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (zyVar.qrj()) {
            return null;
        }
        return toq(zyVar, byteBuffer);
    }

    @dd
    protected abstract Metadata toq(zy zyVar, ByteBuffer byteBuffer);
}
