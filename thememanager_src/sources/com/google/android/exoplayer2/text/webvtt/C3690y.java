package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.text.AbstractC3653g;
import com.google.android.exoplayer2.text.C3660s;
import com.google.android.exoplayer2.util.gvn7;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.y */
/* JADX INFO: compiled from: WebvttDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3690y extends AbstractC3653g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f65952cdj = -1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f65953fn3e = 3;

    /* JADX INFO: renamed from: i */
    private static final int f22126i = 2;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f65954ki = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f65955ni7 = "STYLE";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f65956t8r = 1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f65957zurt = "NOTE";

    /* JADX INFO: renamed from: h */
    private final zy f22127h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final gvn7 f65958kja0;

    public C3690y() {
        super("WebvttDecoder");
        this.f65958kja0 = new gvn7();
        this.f22127h = new zy();
    }

    private static void mcp(gvn7 gvn7Var) {
        while (!TextUtils.isEmpty(gvn7Var.cdj())) {
        }
    }

    /* JADX INFO: renamed from: t */
    private static int m13009t(gvn7 gvn7Var) {
        int iM13596n = 0;
        int i2 = -1;
        while (i2 == -1) {
            iM13596n = gvn7Var.m13596n();
            String strCdj = gvn7Var.cdj();
            i2 = strCdj == null ? 0 : f65955ni7.equals(strCdj) ? 2 : strCdj.startsWith("NOTE") ? 1 : 3;
        }
        gvn7Var.n5r1(iM13596n);
        return i2;
    }

    @Override // com.google.android.exoplayer2.text.AbstractC3653g
    protected com.google.android.exoplayer2.text.f7l8 o1t(byte[] bArr, int i2, boolean z2) throws C3660s {
        C3686n c3686nQrj;
        this.f65958kja0.ncyb(bArr, i2);
        ArrayList arrayList = new ArrayList();
        try {
            C3689s.m13007n(this.f65958kja0);
            while (!TextUtils.isEmpty(this.f65958kja0.cdj())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iM13009t = m13009t(this.f65958kja0);
                if (iM13009t == 0) {
                    return new ld6(arrayList2);
                }
                if (iM13009t == 1) {
                    mcp(this.f65958kja0);
                } else if (iM13009t == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new C3660s("A style block was found after the first cue.");
                    }
                    this.f65958kja0.cdj();
                    arrayList.addAll(this.f22127h.m13016q(this.f65958kja0));
                } else if (iM13009t == 3 && (c3686nQrj = C3684g.qrj(this.f65958kja0, arrayList)) != null) {
                    arrayList2.add(c3686nQrj);
                }
            }
        } catch (sok e2) {
            throw new C3660s(e2);
        }
    }
}
