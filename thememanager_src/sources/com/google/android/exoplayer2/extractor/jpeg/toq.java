package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.wvg;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: MotionPhotoDescription.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: k */
    public final long f19843k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final List<C3354k> f63783toq;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.jpeg.toq$k */
    /* JADX INFO: compiled from: MotionPhotoDescription.java */
    public static final class C3354k {

        /* JADX INFO: renamed from: k */
        public final String f19844k;

        /* JADX INFO: renamed from: q */
        public final long f19845q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final String f63784toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final long f63785zy;

        public C3354k(String str, String str2, long j2, long j3) {
            this.f19844k = str;
            this.f63784toq = str2;
            this.f63785zy = j2;
            this.f19845q = j3;
        }
    }

    public toq(long j2, List<C3354k> list) {
        this.f19843k = j2;
        this.f63783toq = list;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public MotionPhotoMetadata m11756k(long j2) {
        long j3;
        if (this.f63783toq.size() < 2) {
            return null;
        }
        long j4 = j2;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        long j8 = -1;
        boolean z2 = false;
        for (int size = this.f63783toq.size() - 1; size >= 0; size--) {
            C3354k c3354k = this.f63783toq.get(size);
            boolean zEquals = wvg.f23301g.equals(c3354k.f19844k) | z2;
            if (size == 0) {
                j3 = j4 - c3354k.f19845q;
                j4 = 0;
            } else {
                long j9 = j4;
                j4 -= c3354k.f63785zy;
                j3 = j9;
            }
            if (!zEquals || j4 == j3) {
                z2 = zEquals;
            } else {
                j8 = j3 - j4;
                j7 = j4;
                z2 = false;
            }
            if (size == 0) {
                j5 = j4;
                j6 = j3;
            }
        }
        if (j7 == -1 || j8 == -1 || j5 == -1 || j6 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j5, j6, this.f19843k, j7, j8);
    }
}
