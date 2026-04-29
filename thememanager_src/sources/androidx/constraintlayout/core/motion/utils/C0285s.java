package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C0266k;
import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.s */
/* JADX INFO: compiled from: KeyFrameArray.java */
/* JADX INFO: loaded from: classes.dex */
public class C0285s {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.s$k */
    /* JADX INFO: compiled from: KeyFrameArray.java */
    public static class k {

        /* JADX INFO: renamed from: q */
        private static final int f1648q = 999;

        /* JADX INFO: renamed from: k */
        int[] f1649k = new int[101];

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        C0266k[] f47330toq = new C0266k[101];

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f47331zy;

        public k() {
            toq();
        }

        public C0266k f7l8(int i2) {
            return this.f47330toq[this.f1649k[i2]];
        }

        /* JADX INFO: renamed from: g */
        public int m1053g() {
            return this.f47331zy;
        }

        /* JADX INFO: renamed from: k */
        public void m1054k(int i2, C0266k c0266k) {
            if (this.f47330toq[i2] != null) {
                m1055n(i2);
            }
            this.f47330toq[i2] = c0266k;
            int[] iArr = this.f1649k;
            int i3 = this.f47331zy;
            this.f47331zy = i3 + 1;
            iArr[i3] = i2;
            Arrays.sort(iArr);
        }

        /* JADX INFO: renamed from: n */
        public void m1055n(int i2) {
            this.f47330toq[i2] = null;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = this.f47331zy;
                if (i3 >= i5) {
                    this.f47331zy = i5 - 1;
                    return;
                }
                int[] iArr = this.f1649k;
                if (i2 == iArr[i3]) {
                    iArr[i3] = 999;
                    i4++;
                }
                if (i3 != i4) {
                    iArr[i3] = iArr[i4];
                }
                i4++;
                i3++;
            }
        }

        /* JADX INFO: renamed from: q */
        public int m1056q(int i2) {
            return this.f1649k[i2];
        }

        public void toq() {
            Arrays.fill(this.f1649k, 999);
            Arrays.fill(this.f47330toq, (Object) null);
            this.f47331zy = 0;
        }

        public void zy() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f1649k, this.f47331zy)));
            System.out.print("K: [");
            int i2 = 0;
            while (i2 < this.f47331zy) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i2 == 0 ? "" : ", ");
                sb.append(f7l8(i2));
                printStream.print(sb.toString());
                i2++;
            }
            System.out.println("]");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.s$toq */
    /* JADX INFO: compiled from: KeyFrameArray.java */
    public static class toq {

        /* JADX INFO: renamed from: q */
        private static final int f1650q = 999;

        /* JADX INFO: renamed from: k */
        int[] f1651k = new int[101];

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        androidx.constraintlayout.core.motion.toq[] f47332toq = new androidx.constraintlayout.core.motion.toq[101];

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f47333zy;

        public toq() {
            toq();
        }

        public androidx.constraintlayout.core.motion.toq f7l8(int i2) {
            return this.f47332toq[this.f1651k[i2]];
        }

        /* JADX INFO: renamed from: g */
        public int m1057g() {
            return this.f47333zy;
        }

        /* JADX INFO: renamed from: k */
        public void m1058k(int i2, androidx.constraintlayout.core.motion.toq toqVar) {
            if (this.f47332toq[i2] != null) {
                m1059n(i2);
            }
            this.f47332toq[i2] = toqVar;
            int[] iArr = this.f1651k;
            int i3 = this.f47333zy;
            this.f47333zy = i3 + 1;
            iArr[i3] = i2;
            Arrays.sort(iArr);
        }

        /* JADX INFO: renamed from: n */
        public void m1059n(int i2) {
            this.f47332toq[i2] = null;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = this.f47333zy;
                if (i3 >= i5) {
                    this.f47333zy = i5 - 1;
                    return;
                }
                int[] iArr = this.f1651k;
                if (i2 == iArr[i3]) {
                    iArr[i3] = 999;
                    i4++;
                }
                if (i3 != i4) {
                    iArr[i3] = iArr[i4];
                }
                i4++;
                i3++;
            }
        }

        /* JADX INFO: renamed from: q */
        public int m1060q(int i2) {
            return this.f1651k[i2];
        }

        public void toq() {
            Arrays.fill(this.f1651k, 999);
            Arrays.fill(this.f47332toq, (Object) null);
            this.f47333zy = 0;
        }

        public void zy() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f1651k, this.f47333zy)));
            System.out.print("K: [");
            int i2 = 0;
            while (i2 < this.f47333zy) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i2 == 0 ? "" : ", ");
                sb.append(f7l8(i2));
                printStream.print(sb.toString());
                i2++;
            }
            System.out.println("]");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.s$zy */
    /* JADX INFO: compiled from: KeyFrameArray.java */
    static class zy {

        /* JADX INFO: renamed from: q */
        private static final int f1652q = 999;

        /* JADX INFO: renamed from: k */
        int[] f1653k = new int[101];

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float[][] f47334toq = new float[101][];

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f47335zy;

        public zy() {
            toq();
        }

        public float[] f7l8(int i2) {
            return this.f47334toq[this.f1653k[i2]];
        }

        /* JADX INFO: renamed from: g */
        public int m1061g() {
            return this.f47335zy;
        }

        /* JADX INFO: renamed from: k */
        public void m1062k(int i2, float[] fArr) {
            if (this.f47334toq[i2] != null) {
                m1063n(i2);
            }
            this.f47334toq[i2] = fArr;
            int[] iArr = this.f1653k;
            int i3 = this.f47335zy;
            this.f47335zy = i3 + 1;
            iArr[i3] = i2;
            Arrays.sort(iArr);
        }

        /* JADX INFO: renamed from: n */
        public void m1063n(int i2) {
            this.f47334toq[i2] = null;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = this.f47335zy;
                if (i3 >= i5) {
                    this.f47335zy = i5 - 1;
                    return;
                }
                int[] iArr = this.f1653k;
                if (i2 == iArr[i3]) {
                    iArr[i3] = 999;
                    i4++;
                }
                if (i3 != i4) {
                    iArr[i3] = iArr[i4];
                }
                i4++;
                i3++;
            }
        }

        /* JADX INFO: renamed from: q */
        public int m1064q(int i2) {
            return this.f1653k[i2];
        }

        public void toq() {
            Arrays.fill(this.f1653k, 999);
            Arrays.fill(this.f47334toq, (Object) null);
            this.f47335zy = 0;
        }

        public void zy() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f1653k, this.f47335zy)));
            System.out.print("K: [");
            int i2 = 0;
            while (i2 < this.f47335zy) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i2 == 0 ? "" : ", ");
                sb.append(Arrays.toString(f7l8(i2)));
                printStream.print(sb.toString());
                i2++;
            }
            System.out.println("]");
        }
    }
}
