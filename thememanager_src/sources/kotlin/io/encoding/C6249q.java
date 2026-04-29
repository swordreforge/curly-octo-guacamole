package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.kja0;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.encoding.q */
/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6246g
final class C6249q extends InputStream {

    /* JADX INFO: renamed from: g */
    private boolean f36309g;

    /* JADX INFO: renamed from: h */
    private int f36310h;

    /* JADX INFO: renamed from: i */
    private int f36311i;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InputStream f36312k;

    /* JADX INFO: renamed from: n */
    private boolean f36313n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final byte[] f36314p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final C6247k f36315q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final byte[] f36316s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final byte[] f36317y;

    public C6249q(@InterfaceC7396q InputStream input, @InterfaceC7396q C6247k base64) {
        d2ok.m23075h(input, "input");
        d2ok.m23075h(base64, "base64");
        this.f36312k = input;
        this.f36315q = base64;
        this.f36317y = new byte[1];
        this.f36316s = new byte[1024];
        this.f36314p = new byte[1024];
    }

    /* JADX INFO: renamed from: k */
    private final void m22904k(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.f36314p;
        int i4 = this.f36310h;
        kja0.y2(bArr2, bArr, i2, i4, i4 + i3);
        this.f36310h += i3;
        ld6();
    }

    private final void ld6() {
        if (this.f36310h == this.f36311i) {
            this.f36310h = 0;
            this.f36311i = 0;
        }
    }

    /* JADX INFO: renamed from: p */
    private final int m22905p() throws IOException {
        int i2;
        if (!this.f36315q.jk()) {
            return this.f36312k.read();
        }
        do {
            i2 = this.f36312k.read();
            if (i2 == -1) {
                break;
            }
        } while (!zy.m22915s(i2));
        return i2;
    }

    /* JADX INFO: renamed from: q */
    private final int m22906q() {
        return this.f36311i - this.f36310h;
    }

    private final void x2() {
        byte[] bArr = this.f36314p;
        int length = bArr.length;
        int i2 = this.f36311i;
        if ((this.f36316s.length / 4) * 3 > length - i2) {
            kja0.y2(bArr, bArr, 0, this.f36310h, i2);
            this.f36311i -= this.f36310h;
            this.f36310h = 0;
        }
    }

    /* JADX INFO: renamed from: y */
    private final int m22907y(int i2) throws IOException {
        this.f36316s[i2] = C6247k.f36300y;
        if ((i2 & 3) != 2) {
            return i2 + 1;
        }
        int iM22905p = m22905p();
        if (iM22905p >= 0) {
            this.f36316s[i2 + 1] = (byte) iM22905p;
        }
        return i2 + 2;
    }

    private final int zy(byte[] bArr, int i2, int i3, int i4) {
        int i5 = this.f36311i;
        this.f36311i = i5 + this.f36315q.n7h(this.f36316s, this.f36314p, i5, 0, i4);
        int iMin = Math.min(m22906q(), i3 - i2);
        m22904k(bArr, i2, iMin);
        x2();
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f36313n) {
            return;
        }
        this.f36313n = true;
        this.f36312k.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i2 = this.f36310h;
        if (i2 < this.f36311i) {
            int i3 = this.f36314p[i2] & 255;
            this.f36310h = i2 + 1;
            ld6();
            return i3;
        }
        int i4 = read(this.f36317y, 0, 1);
        if (i4 == -1) {
            return -1;
        }
        if (i4 == 1) {
            return this.f36317y[0] & 255;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        if (r4 != r11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (r5 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        return r4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(@mub.InterfaceC7396q byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.d2ok.m23075h(r10, r0)
            if (r11 < 0) goto L91
            if (r12 < 0) goto L91
            int r0 = r11 + r12
            int r1 = r10.length
            if (r0 > r1) goto L91
            boolean r1 = r9.f36313n
            if (r1 != 0) goto L89
            boolean r1 = r9.f36309g
            r2 = -1
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = 0
            if (r12 != 0) goto L1c
            return r1
        L1c:
            int r3 = r9.m22906q()
            if (r3 < r12) goto L26
            r9.m22904k(r10, r11, r12)
            return r12
        L26:
            int r3 = r9.m22906q()
            int r12 = r12 - r3
            int r12 = r12 + 3
            r3 = 1
            int r12 = r12 - r3
            int r12 = r12 / 3
            int r12 = r12 * 4
            r4 = r11
        L34:
            boolean r5 = r9.f36309g
            if (r5 != 0) goto L81
            if (r12 <= 0) goto L81
            byte[] r5 = r9.f36316s
            int r5 = r5.length
            int r5 = java.lang.Math.min(r5, r12)
            r6 = r1
        L42:
            boolean r7 = r9.f36309g
            if (r7 != 0) goto L64
            if (r6 >= r5) goto L64
            int r7 = r9.m22905p()
            if (r7 == r2) goto L61
            r8 = 61
            if (r7 == r8) goto L5a
            byte[] r8 = r9.f36316s
            byte r7 = (byte) r7
            r8[r6] = r7
            int r6 = r6 + 1
            goto L42
        L5a:
            int r6 = r9.m22907y(r6)
            r9.f36309g = r3
            goto L42
        L61:
            r9.f36309g = r3
            goto L42
        L64:
            if (r7 != 0) goto L6b
            if (r6 != r5) goto L69
            goto L6b
        L69:
            r5 = r1
            goto L6c
        L6b:
            r5 = r3
        L6c:
            if (r5 == 0) goto L75
            int r12 = r12 - r6
            int r5 = r9.zy(r10, r4, r0, r6)
            int r4 = r4 + r5
            goto L34
        L75:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L81:
            if (r4 != r11) goto L86
            if (r5 == 0) goto L86
            goto L88
        L86:
            int r2 = r4 - r11
        L88:
            return r2
        L89:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "The input stream is closed."
            r10.<init>(r11)
            throw r10
        L91:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = ", length: "
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = ", buffer size: "
            r1.append(r11)
            int r10 = r10.length
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.C6249q.read(byte[], int, int):int");
    }
}
