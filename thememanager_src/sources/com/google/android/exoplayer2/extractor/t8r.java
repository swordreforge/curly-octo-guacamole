package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.C3258k;
import com.google.android.exoplayer2.audio.d2ok;
import com.google.android.exoplayer2.audio.ncyb;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.util.jp0y;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t8r {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f64394kja0 = "=";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f64395n7h = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f64396qrj = "FlacStreamMetadata";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final int f64397f7l8;

    /* JADX INFO: renamed from: g */
    public final int f20169g;

    /* JADX INFO: renamed from: k */
    public final int f20170k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    public final C3402k f64398ld6;

    /* JADX INFO: renamed from: n */
    public final int f20171n;

    /* JADX INFO: renamed from: p */
    public final long f20172p;

    /* JADX INFO: renamed from: q */
    public final int f20173q;

    /* JADX INFO: renamed from: s */
    public final int f20174s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f64399toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private final Metadata f64400x2;

    /* JADX INFO: renamed from: y */
    public final int f20175y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f64401zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.t8r$k */
    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class C3402k {

        /* JADX INFO: renamed from: k */
        public final long[] f20176k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long[] f64402toq;

        public C3402k(long[] jArr, long[] jArr2) {
            this.f20176k = jArr;
            this.f64402toq = jArr2;
        }
    }

    public t8r(byte[] bArr, int i2) {
        jp0y jp0yVar = new jp0y(bArr);
        jp0yVar.cdj(i2 * 8);
        this.f20170k = jp0yVar.m13627y(16);
        this.f64399toq = jp0yVar.m13627y(16);
        this.f64401zy = jp0yVar.m13627y(24);
        this.f20173q = jp0yVar.m13627y(24);
        int iM13627y = jp0yVar.m13627y(20);
        this.f20171n = iM13627y;
        this.f20169g = qrj(iM13627y);
        this.f64397f7l8 = jp0yVar.m13627y(3) + 1;
        int iM13627y2 = jp0yVar.m13627y(5) + 1;
        this.f20175y = iM13627y2;
        this.f20174s = m11932g(iM13627y2);
        this.f20172p = jp0yVar.m13624p(36);
        this.f64398ld6 = null;
        this.f64400x2 = null;
    }

    /* JADX INFO: renamed from: g */
    private static int m11932g(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    @dd
    /* JADX INFO: renamed from: k */
    private static Metadata m11933k(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] strArrJbh = lrht.jbh(str, f64394kja0);
            if (strArrJbh.length != 2) {
                String strValueOf = String.valueOf(str);
                com.google.android.exoplayer2.util.ni7.qrj(f64396qrj, strValueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(strValueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(strArrJbh[0], strArrJbh[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static int qrj(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case C3258k.f63451f7l8 /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case ncyb.f19427k /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case d2ok.f19306k /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public int f7l8() {
        return this.f20175y * this.f20171n * this.f64397f7l8;
    }

    @dd
    public Metadata ld6(@dd Metadata metadata) {
        Metadata metadata2 = this.f64400x2;
        return metadata2 == null ? metadata : metadata2.toq(metadata);
    }

    /* JADX INFO: renamed from: n */
    public long m11934n() {
        long j2;
        long j3;
        int i2 = this.f20173q;
        if (i2 > 0) {
            j2 = (((long) i2) + ((long) this.f64401zy)) / 2;
            j3 = 1;
        } else {
            int i3 = this.f20170k;
            j2 = ((((i3 != this.f64399toq || i3 <= 0) ? 4096L : i3) * ((long) this.f64397f7l8)) * ((long) this.f20175y)) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    /* JADX INFO: renamed from: p */
    public int m11935p() {
        return this.f64399toq * this.f64397f7l8 * (this.f20175y / 8);
    }

    /* JADX INFO: renamed from: q */
    public t8r m11936q(List<String> list) {
        return new t8r(this.f20170k, this.f64399toq, this.f64401zy, this.f20173q, this.f20171n, this.f64397f7l8, this.f20175y, this.f20172p, this.f64398ld6, ld6(m11933k(list, Collections.emptyList())));
    }

    /* JADX INFO: renamed from: s */
    public xwq3 m11937s(byte[] bArr, @dd Metadata metadata) {
        bArr[4] = -128;
        int i2 = this.f20173q;
        if (i2 <= 0) {
            i2 = -1;
        }
        return new xwq3.toq().m13945m(com.google.android.exoplayer2.util.wvg.f23299e).lrht(i2).gvn7(this.f64397f7l8).ek5k(this.f20171n).hyr(Collections.singletonList(bArr)).uv6(ld6(metadata)).a9();
    }

    public t8r toq(List<PictureFrame> list) {
        return new t8r(this.f20170k, this.f64399toq, this.f64401zy, this.f20173q, this.f20171n, this.f64397f7l8, this.f20175y, this.f20172p, this.f64398ld6, ld6(m11933k(Collections.emptyList(), list)));
    }

    public long x2(long j2) {
        return lrht.m13660i((j2 * ((long) this.f20171n)) / 1000000, 0L, this.f20172p - 1);
    }

    /* JADX INFO: renamed from: y */
    public long m11938y() {
        long j2 = this.f20172p;
        return j2 == 0 ? C3548p.f65257toq : (j2 * 1000000) / ((long) this.f20171n);
    }

    public t8r zy(@dd C3402k c3402k) {
        return new t8r(this.f20170k, this.f64399toq, this.f64401zy, this.f20173q, this.f20171n, this.f64397f7l8, this.f20175y, this.f20172p, c3402k, this.f64400x2);
    }

    public t8r(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i2, i3, i4, i5, i6, i7, i8, j2, (C3402k) null, m11933k(arrayList, arrayList2));
    }

    private t8r(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, @dd C3402k c3402k, @dd Metadata metadata) {
        this.f20170k = i2;
        this.f64399toq = i3;
        this.f64401zy = i4;
        this.f20173q = i5;
        this.f20171n = i6;
        this.f20169g = qrj(i6);
        this.f64397f7l8 = i7;
        this.f20175y = i8;
        this.f20174s = m11932g(i8);
        this.f20172p = j2;
        this.f64398ld6 = c3402k;
        this.f64400x2 = metadata;
    }
}
