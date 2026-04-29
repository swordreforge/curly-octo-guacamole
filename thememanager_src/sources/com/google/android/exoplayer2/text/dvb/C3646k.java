package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.AbstractC3653g;
import com.google.android.exoplayer2.text.f7l8;
import com.google.android.exoplayer2.util.gvn7;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.k */
/* JADX INFO: compiled from: DvbDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3646k extends AbstractC3653g {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final toq f65654kja0;

    public C3646k(List<byte[]> list) {
        super("DvbDecoder");
        gvn7 gvn7Var = new gvn7(list.get(0));
        this.f65654kja0 = new toq(gvn7Var.lvui(), gvn7Var.lvui());
    }

    @Override // com.google.android.exoplayer2.text.AbstractC3653g
    protected f7l8 o1t(byte[] bArr, int i2, boolean z2) {
        if (z2) {
            this.f65654kja0.ki();
        }
        return new zy(this.f65654kja0.toq(bArr, i2));
    }
}
