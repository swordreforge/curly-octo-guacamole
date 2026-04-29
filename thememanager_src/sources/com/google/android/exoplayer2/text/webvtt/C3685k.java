package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.AbstractC3653g;
import com.google.android.exoplayer2.text.C3660s;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.k */
/* JADX INFO: compiled from: Mp4WebvttDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3685k extends AbstractC3653g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f65928cdj = 1885436268;

    /* JADX INFO: renamed from: h */
    private static final int f22109h = 8;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f65929ki = 1937011815;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f65930t8r = 1987343459;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final gvn7 f65931kja0;

    public C3685k() {
        super("Mp4WebvttDecoder");
        this.f65931kja0 = new gvn7();
    }

    /* JADX INFO: renamed from: t */
    private static com.google.android.exoplayer2.text.toq m12992t(gvn7 gvn7Var, int i2) throws C3660s {
        CharSequence charSequenceCdj = null;
        toq.zy zyVarKja0 = null;
        while (i2 > 0) {
            if (i2 < 8) {
                throw new C3660s("Incomplete vtt cue box header found.");
            }
            int iKja0 = gvn7Var.kja0();
            int iKja02 = gvn7Var.kja0();
            int i3 = iKja0 - 8;
            String strOc = lrht.oc(gvn7Var.m13598q(), gvn7Var.m13596n(), i3);
            gvn7Var.hyr(i3);
            i2 = (i2 - 8) - i3;
            if (iKja02 == f65929ki) {
                zyVarKja0 = C3684g.kja0(strOc);
            } else if (iKja02 == f65928cdj) {
                charSequenceCdj = C3684g.cdj(null, strOc.trim(), Collections.emptyList());
            }
        }
        if (charSequenceCdj == null) {
            charSequenceCdj = "";
        }
        return zyVarKja0 != null ? zyVarKja0.wvg(charSequenceCdj).m12938k() : C3684g.x2(charSequenceCdj);
    }

    @Override // com.google.android.exoplayer2.text.AbstractC3653g
    protected com.google.android.exoplayer2.text.f7l8 o1t(byte[] bArr, int i2, boolean z2) throws C3660s {
        this.f65931kja0.ncyb(bArr, i2);
        ArrayList arrayList = new ArrayList();
        while (this.f65931kja0.m13594k() > 0) {
            if (this.f65931kja0.m13594k() < 8) {
                throw new C3660s("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iKja0 = this.f65931kja0.kja0();
            if (this.f65931kja0.kja0() == f65930t8r) {
                arrayList.add(m12992t(this.f65931kja0, iKja0 - 8));
            } else {
                this.f65931kja0.hyr(iKja0 - 8);
            }
        }
        return new toq(arrayList);
    }
}
