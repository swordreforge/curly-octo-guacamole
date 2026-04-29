package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.gvn7;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.n */
/* JADX INFO: compiled from: TagPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3345n {

    /* JADX INFO: renamed from: k */
    protected final InterfaceC3401t f19797k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.n$k */
    /* JADX INFO: compiled from: TagPayloadReader.java */
    public static final class k extends sok {
        public k(String str) {
            super(str, null, false, 1);
        }
    }

    protected AbstractC3345n(InterfaceC3401t interfaceC3401t) {
        this.f19797k = interfaceC3401t;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11712k(gvn7 gvn7Var, long j2) throws sok {
        return toq(gvn7Var) && zy(gvn7Var, j2);
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo11711q();

    protected abstract boolean toq(gvn7 gvn7Var) throws sok;

    protected abstract boolean zy(gvn7 gvn7Var, long j2) throws sok;
}
