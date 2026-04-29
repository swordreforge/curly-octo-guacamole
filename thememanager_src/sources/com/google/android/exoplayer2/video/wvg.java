package com.google.android.exoplayer2.video;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import zy.a9;
import zy.dd;

/* JADX INFO: compiled from: VideoSize.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wvg implements InterfaceC3555s {

    /* JADX INFO: renamed from: h */
    private static final float f23567h = 1.0f;

    /* JADX INFO: renamed from: l */
    private static final int f23569l = 3;

    /* JADX INFO: renamed from: p */
    private static final int f23570p = 0;

    /* JADX INFO: renamed from: r */
    private static final int f23571r = 2;

    /* JADX INFO: renamed from: s */
    private static final int f23572s = 0;

    /* JADX INFO: renamed from: t */
    private static final int f23573t = 1;

    /* JADX INFO: renamed from: y */
    private static final int f23574y = 0;

    /* JADX INFO: renamed from: z */
    private static final int f23575z = 0;

    /* JADX INFO: renamed from: g */
    @zy.zurt(from = 0.0d, fromInclusive = false)
    public final float f23576g;

    /* JADX INFO: renamed from: k */
    @a9(from = 0)
    public final int f23577k;

    /* JADX INFO: renamed from: n */
    @a9(from = 0, to = 359)
    public final int f23578n;

    /* JADX INFO: renamed from: q */
    @a9(from = 0)
    public final int f23579q;

    /* JADX INFO: renamed from: i */
    public static final wvg f23568i = new wvg(0, 0);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3555s.k<wvg> f23566f = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.video.o1t
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return wvg.zy(bundle);
        }
    };

    public wvg(@a9(from = 0) int i2, @a9(from = 0) int i3) {
        this(i2, i3, 0, 1.0f);
    }

    private static String toq(int i2) {
        return Integer.toString(i2, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wvg zy(Bundle bundle) {
        return new wvg(bundle.getInt(toq(0), 0), bundle.getInt(toq(1), 0), bundle.getInt(toq(2), 0), bundle.getFloat(toq(3), 1.0f));
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvg)) {
            return false;
        }
        wvg wvgVar = (wvg) obj;
        return this.f23577k == wvgVar.f23577k && this.f23579q == wvgVar.f23579q && this.f23578n == wvgVar.f23578n && this.f23576g == wvgVar.f23576g;
    }

    public int hashCode() {
        return ((((((217 + this.f23577k) * 31) + this.f23579q) * 31) + this.f23578n) * 31) + Float.floatToRawIntBits(this.f23576g);
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(toq(0), this.f23577k);
        bundle.putInt(toq(1), this.f23579q);
        bundle.putInt(toq(2), this.f23578n);
        bundle.putFloat(toq(3), this.f23576g);
        return bundle;
    }

    public wvg(@a9(from = 0) int i2, @a9(from = 0) int i3, @a9(from = 0, to = 359) int i4, @zy.zurt(from = 0.0d, fromInclusive = false) float f2) {
        this.f23577k = i2;
        this.f23579q = i3;
        this.f23578n = i4;
        this.f23576g = f2;
    }
}
