package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.m */
/* JADX INFO: compiled from: ShuffleOrder.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3612m {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$k */
    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static class k implements InterfaceC3612m {

        /* JADX INFO: renamed from: k */
        private final Random f21602k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int[] f65425toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int[] f65426zy;

        public k(int i2) {
            this(i2, new Random());
        }

        /* JADX INFO: renamed from: y */
        private static int[] m12770y(int i2, Random random) {
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                int iNextInt = random.nextInt(i4);
                iArr[i3] = iArr[iNextInt];
                iArr[iNextInt] = i3;
                i3 = i4;
            }
            return iArr;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        public InterfaceC3612m f7l8(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i3) {
                iArr[i5] = this.f21602k.nextInt(this.f65425toq.length + 1);
                int i6 = i5 + 1;
                int iNextInt = this.f21602k.nextInt(i6);
                iArr2[i5] = iArr2[iNextInt];
                iArr2[iNextInt] = i5 + i2;
                i5 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f65425toq.length + i3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f65425toq;
                if (i4 >= iArr4.length + i3) {
                    return new k(iArr3, new Random(this.f21602k.nextLong()));
                }
                if (i7 >= i3 || i8 != iArr[i7]) {
                    int i9 = i8 + 1;
                    int i10 = iArr4[i8];
                    iArr3[i4] = i10;
                    if (i10 >= i2) {
                        iArr3[i4] = i10 + i3;
                    }
                    i8 = i9;
                } else {
                    iArr3[i4] = iArr2[i7];
                    i7++;
                }
                i4++;
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        /* JADX INFO: renamed from: g */
        public int mo12766g() {
            int[] iArr = this.f65425toq;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        public int getLength() {
            return this.f65425toq.length;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        /* JADX INFO: renamed from: k */
        public InterfaceC3612m mo12767k(int i2, int i3) {
            int i4 = i3 - i2;
            int[] iArr = new int[this.f65425toq.length - i4];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f65425toq;
                if (i5 >= iArr2.length) {
                    return new k(iArr, new Random(this.f21602k.nextLong()));
                }
                int i7 = iArr2[i5];
                if (i7 < i2 || i7 >= i3) {
                    int i8 = i5 - i6;
                    if (i7 >= i2) {
                        i7 -= i4;
                    }
                    iArr[i8] = i7;
                } else {
                    i6++;
                }
                i5++;
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        /* JADX INFO: renamed from: n */
        public InterfaceC3612m mo12768n() {
            return new k(0, new Random(this.f21602k.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        /* JADX INFO: renamed from: q */
        public int mo12769q() {
            int[] iArr = this.f65425toq;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        public int toq(int i2) {
            int i3 = this.f65426zy[i2] - 1;
            if (i3 >= 0) {
                return this.f65425toq[i3];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        public int zy(int i2) {
            int i3 = this.f65426zy[i2] + 1;
            int[] iArr = this.f65425toq;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        public k(int i2, long j2) {
            this(i2, new Random(j2));
        }

        public k(int[] iArr, long j2) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j2));
        }

        private k(int i2, Random random) {
            this(m12770y(i2, random), random);
        }

        private k(int[] iArr, Random random) {
            this.f65425toq = iArr;
            this.f21602k = random;
            this.f65426zy = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f65426zy[iArr[i2]] = i2;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$toq */
    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static final class toq implements InterfaceC3612m {

        /* JADX INFO: renamed from: k */
        private final int f21603k;

        public toq(int i2) {
            this.f21603k = i2;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        public InterfaceC3612m f7l8(int i2, int i3) {
            return new toq(this.f21603k + i3);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        /* JADX INFO: renamed from: g */
        public int mo12766g() {
            return this.f21603k > 0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        public int getLength() {
            return this.f21603k;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        /* JADX INFO: renamed from: k */
        public InterfaceC3612m mo12767k(int i2, int i3) {
            return new toq((this.f21603k - i3) + i2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        /* JADX INFO: renamed from: n */
        public InterfaceC3612m mo12768n() {
            return new toq(0);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        /* JADX INFO: renamed from: q */
        public int mo12769q() {
            int i2 = this.f21603k;
            if (i2 > 0) {
                return i2 - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        public int toq(int i2) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3612m
        public int zy(int i2) {
            int i3 = i2 + 1;
            if (i3 < this.f21603k) {
                return i3;
            }
            return -1;
        }
    }

    InterfaceC3612m f7l8(int i2, int i3);

    /* JADX INFO: renamed from: g */
    int mo12766g();

    int getLength();

    /* JADX INFO: renamed from: k */
    InterfaceC3612m mo12767k(int i2, int i3);

    /* JADX INFO: renamed from: n */
    InterfaceC3612m mo12768n();

    /* JADX INFO: renamed from: q */
    int mo12769q();

    int toq(int i2);

    int zy(int i2);
}
