package com.google.android.exoplayer2.extractor;

import zy.dd;

/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wvg {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final wvg f64718zy = new wvg(0, 0);

    /* JADX INFO: renamed from: k */
    public final long f20458k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final long f64719toq;

    public wvg(long j2, long j3) {
        this.f20458k = j2;
        this.f64719toq = j3;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wvg.class != obj.getClass()) {
            return false;
        }
        wvg wvgVar = (wvg) obj;
        return this.f20458k == wvgVar.f20458k && this.f64719toq == wvgVar.f64719toq;
    }

    public int hashCode() {
        return (((int) this.f20458k) * 31) + ((int) this.f64719toq);
    }

    public String toString() {
        long j2 = this.f20458k;
        long j3 = this.f64719toq;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j2);
        sb.append(", position=");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }
}
