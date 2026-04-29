package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.AbstractC3483g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.emsg.k */
/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3479k extends AbstractC3483g {
    @Override // com.google.android.exoplayer2.metadata.AbstractC3483g
    protected Metadata toq(com.google.android.exoplayer2.metadata.zy zyVar, ByteBuffer byteBuffer) {
        return new Metadata(zy(new gvn7(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage zy(gvn7 gvn7Var) {
        return new EventMessage((String) C3844k.f7l8(gvn7Var.wvg()), (String) C3844k.f7l8(gvn7Var.wvg()), gvn7Var.o1t(), gvn7Var.o1t(), Arrays.copyOfRange(gvn7Var.m13598q(), gvn7Var.m13596n(), gvn7Var.m13591g()));
    }
}
