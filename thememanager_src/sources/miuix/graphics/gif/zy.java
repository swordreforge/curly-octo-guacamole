package miuix.graphics.gif;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: compiled from: GifDecoder.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: c */
    public static final int f40019c = 1048576;

    /* JADX INFO: renamed from: e */
    public static final int f40020e = 3;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final int f87471lrht = 0;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    protected static final int f87472nn86 = 4096;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final int f87473uv6 = 1;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final int f87474vyq = 2;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    protected Bitmap f87475a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    protected int f87476cdj;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    protected byte[] f87479dd;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected int f87481f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    protected boolean f87482fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    protected Bitmap f87483fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    protected int f87484fu4;

    /* JADX INFO: renamed from: g */
    protected BufferedInputStream f40022g;

    /* JADX INFO: renamed from: h */
    protected int f40023h;

    /* JADX INFO: renamed from: i */
    protected boolean f40024i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    protected int f87487jk;

    /* JADX INFO: renamed from: k */
    private long f40025k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected int f87489ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected int[] f87490kja0;

    /* JADX INFO: renamed from: l */
    protected Vector<C7110k> f40026l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected int f87491ld6;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    protected int f87492lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    protected int f87493mcp;

    /* JADX INFO: renamed from: n */
    private int f40027n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private int[] f87494n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    protected int[] f87495n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    protected byte[] f87496ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    protected int f87497ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    protected int f87498o1t;

    /* JADX INFO: renamed from: p */
    protected boolean f40028p;

    /* JADX INFO: renamed from: q */
    private int f40029q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected int[] f87500qrj;

    /* JADX INFO: renamed from: r */
    protected short[] f40030r;

    /* JADX INFO: renamed from: s */
    private int f40031s;

    /* JADX INFO: renamed from: t */
    protected int f40032t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    protected int f87501t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    protected int f87503wvg;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    protected byte[] f87505x9kr;

    /* JADX INFO: renamed from: y */
    private int f40033y;

    /* JADX INFO: renamed from: z */
    protected int f40034z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    protected int f87506zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f87507zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f87502toq = 1048576;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected int f87504x2 = 1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    protected byte[] f87488jp0y = new byte[256];

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    protected int f87485gvn7 = 0;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    protected int f87478d3 = 0;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    protected int f87499oc = 0;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    protected boolean f87480eqxt = false;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    protected int f87477d2ok = 0;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private boolean f87486hyr = false;

    /* JADX INFO: renamed from: f */
    private boolean f40021f = false;

    /* JADX INFO: renamed from: miuix.graphics.gif.zy$k */
    /* JADX INFO: compiled from: GifDecoder.java */
    private static class C7110k {

        /* JADX INFO: renamed from: k */
        public Bitmap f40035k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f87508toq;

        public C7110k(Bitmap bitmap, int i2) {
            this.f40035k = bitmap;
            this.f87508toq = i2;
        }

        /* JADX INFO: renamed from: k */
        public void m25742k() {
            Bitmap bitmap = this.f40035k;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            this.f40035k.recycle();
        }
    }

    protected static int fu4(InputStream inputStream) {
        try {
            return inputStream.read();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean qrj(InputStream inputStream) {
        int iFu4;
        if (inputStream == null) {
            return false;
        }
        String str = "";
        for (int i2 = 0; i2 < 6 && (iFu4 = fu4(inputStream)) != -1; i2++) {
            str = str + ((char) iFu4);
        }
        return str.startsWith(com.android.thememanager.basemodule.analysis.toq.li);
    }

    private void wvg() {
    }

    protected void a9() {
        Bitmap bitmap;
        int i2;
        if (this.f87494n5r1 == null) {
            this.f87494n5r1 = new int[this.f40033y * this.f40031s];
        }
        int i3 = this.f87499oc;
        int i4 = 0;
        if (i3 > 0) {
            if (i3 == 3) {
                int iM25731g = m25731g() - 2;
                if (iM25731g > 0) {
                    Bitmap bitmapM25735n = m25735n(iM25731g - 1);
                    if (!bitmapM25735n.equals(this.f87483fti)) {
                        this.f87483fti = bitmapM25735n;
                        int[] iArr = this.f87494n5r1;
                        int i5 = this.f40033y;
                        bitmapM25735n.getPixels(iArr, 0, i5, 0, 0, i5, this.f40031s);
                    }
                } else {
                    this.f87483fti = null;
                    this.f87494n5r1 = new int[this.f40033y * this.f40031s];
                }
            }
            if (this.f87483fti != null && this.f87499oc == 2) {
                int i6 = !this.f87480eqxt ? this.f87489ki : 0;
                int i7 = (this.f40032t * this.f40033y) + this.f87503wvg;
                for (int i8 = 0; i8 < this.f87487jk; i8++) {
                    int i9 = this.f87493mcp + i7;
                    for (int i10 = i7; i10 < i9; i10++) {
                        this.f87494n5r1[i10] = i6;
                    }
                    i7 += this.f40033y;
                }
            }
        }
        int i11 = 8;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            int i14 = this.f87498o1t;
            if (i4 >= i14) {
                break;
            }
            if (this.f87482fn3e) {
                if (i12 >= i14) {
                    i13++;
                    if (i13 == 2) {
                        i12 = 4;
                    } else if (i13 == 3) {
                        i12 = 2;
                        i11 = 4;
                    } else if (i13 == 4) {
                        i11 = 2;
                        i12 = 1;
                    }
                }
                i2 = i12 + i11;
            } else {
                i2 = i12;
                i12 = i4;
            }
            int i15 = i12 + this.f87484fu4;
            if (i15 < this.f40031s) {
                int i16 = this.f40033y;
                int i17 = i15 * i16;
                int i18 = this.f87497ni7 + i17;
                int i19 = this.f40034z;
                int i20 = i18 + i19;
                if (i17 + i16 < i20) {
                    i20 = i17 + i16;
                }
                int i21 = i19 * i4;
                while (i18 < i20) {
                    int i22 = i21 + 1;
                    int i23 = this.f87490kja0[this.f87496ncyb[i21] & 255];
                    if (i23 != 0) {
                        this.f87494n5r1[i18] = i23;
                    }
                    i18++;
                    i21 = i22;
                }
            }
            i4++;
            i12 = i2;
        }
        if (this.f40029q <= this.f40027n && (bitmap = this.f87475a9) != null && !bitmap.isRecycled()) {
            this.f87475a9.recycle();
        }
        this.f87475a9 = Bitmap.createBitmap(this.f87494n5r1, this.f40033y, this.f40031s, Bitmap.Config.ARGB_8888);
    }

    protected int cdj() {
        int iN7h = n7h();
        this.f87485gvn7 = iN7h;
        int i2 = 0;
        if (iN7h > 0) {
            while (true) {
                try {
                    int i3 = this.f87485gvn7;
                    if (i2 >= i3) {
                        break;
                    }
                    int i4 = this.f40022g.read(this.f87488jp0y, i2, i3 - i2);
                    if (i4 == -1) {
                        break;
                    }
                    i2 += i4;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (i2 < this.f87485gvn7) {
                this.f87481f7l8 = 1;
            }
        }
        return i2;
    }

    public int f7l8() {
        return this.f40031s;
    }

    protected void fn3e() {
        if (this.f87486hyr) {
            return;
        }
        String str = "";
        for (int i2 = 0; i2 < 6; i2++) {
            str = str + ((char) n7h());
        }
        if (!str.startsWith(com.android.thememanager.basemodule.analysis.toq.li)) {
            this.f87481f7l8 = 1;
            return;
        }
        zurt();
        if (!this.f40028p || toq()) {
            return;
        }
        int[] iArrKi = ki(this.f87491ld6);
        this.f87500qrj = iArrKi;
        this.f87476cdj = iArrKi[this.f40023h];
    }

    public void fti(int i2) {
        this.f40027n = i2;
    }

    /* JADX INFO: renamed from: g */
    public int m25731g() {
        Vector<C7110k> vector = this.f40026l;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    /* JADX INFO: renamed from: h */
    protected void m25732h() {
        this.f87497ni7 = m25741z();
        this.f87484fu4 = m25741z();
        this.f40034z = m25741z();
        this.f87498o1t = m25741z();
        int iN7h = n7h();
        int i2 = 0;
        boolean z2 = (iN7h & 128) != 0;
        this.f40024i = z2;
        int i3 = 2 << (iN7h & 7);
        this.f87506zurt = i3;
        this.f87482fn3e = (iN7h & 64) != 0;
        if (z2) {
            int[] iArrKi = ki(i3);
            this.f87495n7h = iArrKi;
            this.f87490kja0 = iArrKi;
        } else {
            this.f87490kja0 = this.f87500qrj;
            if (this.f40023h == this.f87492lvui) {
                this.f87476cdj = 0;
            }
        }
        if (this.f87480eqxt) {
            int[] iArr = this.f87490kja0;
            int i4 = this.f87492lvui;
            int i5 = iArr[i4];
            iArr[i4] = 0;
            i2 = i5;
        }
        if (this.f87490kja0 == null) {
            this.f87481f7l8 = 1;
        }
        if (toq()) {
            return;
        }
        m25734k();
        jp0y();
        if (toq() || this.f87486hyr) {
            return;
        }
        a9();
        if (this.f40029q >= this.f40027n) {
            this.f40026l.addElement(new C7110k(this.f87475a9, this.f87477d2ok));
        }
        this.f40029q++;
        if (this.f87480eqxt) {
            this.f87490kja0[this.f87492lvui] = i2;
        }
        mcp();
    }

    /* JADX INFO: renamed from: i */
    protected void m25733i() {
        n7h();
        int iN7h = n7h();
        int i2 = (iN7h & 28) >> 2;
        this.f87478d3 = i2;
        if (i2 == 0) {
            this.f87478d3 = 1;
        }
        this.f87480eqxt = (iN7h & 1) != 0;
        int iM25741z = m25741z() * 10;
        this.f87477d2ok = iM25741z;
        if (iM25741z <= 0) {
            this.f87477d2ok = 100;
        }
        this.f87492lvui = n7h();
        n7h();
    }

    public void jk(long j2) {
        this.f87502toq = j2;
    }

    protected void jp0y() {
        do {
            cdj();
            if (this.f87485gvn7 <= 0) {
                return;
            }
        } while (!toq());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25, types: [short] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX INFO: renamed from: k */
    protected void m25734k() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        short s2;
        int i7 = this.f40034z * this.f87498o1t;
        byte[] bArr = this.f87496ncyb;
        if (bArr == null || bArr.length < i7) {
            this.f87496ncyb = new byte[i7];
        }
        if (this.f40030r == null) {
            this.f40030r = new short[4096];
        }
        if (this.f87479dd == null) {
            this.f87479dd = new byte[4096];
        }
        if (this.f87505x9kr == null) {
            this.f87505x9kr = new byte[4097];
        }
        int iN7h = n7h();
        int i8 = 1 << iN7h;
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = iN7h + 1;
        int i12 = (1 << i11) - 1;
        for (int i13 = 0; i13 < i8; i13++) {
            this.f40030r[i13] = 0;
            this.f87479dd[i13] = (byte) i13;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iCdj = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = i10;
        while (i16 < i7) {
            if (i17 != 0) {
                i2 = i11;
                i3 = i9;
                int i25 = i21;
                i4 = i8;
                i5 = i25;
            } else if (i18 < i14) {
                if (iCdj == 0) {
                    iCdj = cdj();
                    if (iCdj <= 0) {
                        break;
                    } else {
                        i20 = 0;
                    }
                }
                i19 += (this.f87488jp0y[i20] & 255) << i18;
                i18 += 8;
                i20++;
                iCdj--;
            } else {
                int i26 = i19 & i15;
                i19 >>= i14;
                i18 -= i14;
                if (i26 > i24 || i26 == i9) {
                    break;
                }
                if (i26 == i8) {
                    i14 = i11;
                    i24 = i10;
                    i15 = i12;
                    i23 = -1;
                } else if (i23 == -1) {
                    this.f87505x9kr[i17] = this.f87479dd[i26];
                    i23 = i26;
                    i21 = i23;
                    i17++;
                    i11 = i11;
                } else {
                    i2 = i11;
                    if (i26 == i24) {
                        i6 = i26;
                        this.f87505x9kr[i17] = (byte) i21;
                        s2 = i23;
                        i17++;
                    } else {
                        i6 = i26;
                        s2 = i6;
                    }
                    while (s2 > i8) {
                        this.f87505x9kr[i17] = this.f87479dd[s2];
                        s2 = this.f40030r[s2];
                        i17++;
                        i8 = i8;
                    }
                    i4 = i8;
                    byte[] bArr2 = this.f87479dd;
                    i5 = bArr2[s2] & 255;
                    if (i24 >= 4096) {
                        break;
                    }
                    int i27 = i17 + 1;
                    i3 = i9;
                    byte b2 = (byte) i5;
                    this.f87505x9kr[i17] = b2;
                    this.f40030r[i24] = (short) i23;
                    bArr2[i24] = b2;
                    i24++;
                    if ((i24 & i15) == 0 && i24 < 4096) {
                        i14++;
                        i15 += i24;
                    }
                    i17 = i27;
                    i23 = i6;
                }
            }
            i17--;
            this.f87496ncyb[i22] = this.f87505x9kr[i17];
            i16++;
            i22++;
            i8 = i4;
            i9 = i3;
            i21 = i5;
            i11 = i2;
        }
        for (int i28 = i22; i28 < i7; i28++) {
            this.f87496ncyb[i28] = 0;
        }
    }

    protected int[] ki(int i2) {
        int i3;
        int i4 = i2 * 3;
        byte[] bArr = new byte[i4];
        try {
            i3 = this.f40022g.read(bArr, 0, i4);
        } catch (Exception e2) {
            e2.printStackTrace();
            i3 = 0;
        }
        if (i3 < i4) {
            this.f87481f7l8 = 1;
            return null;
        }
        int[] iArr = new int[256];
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i5 + 1;
            int i8 = i7 + 1;
            iArr[i6] = ((bArr[i5] & 255) << 16) | (-16777216) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
            i5 = i8 + 1;
        }
        return iArr;
    }

    public int kja0(InputStream inputStream) {
        this.f87507zy = false;
        if (this.f40021f) {
            throw new IllegalStateException("decoder cannot be called more than once");
        }
        this.f40021f = true;
        ld6();
        if (inputStream != null) {
            this.f40022g = new BufferedInputStream(inputStream);
            try {
                fn3e();
                if (!this.f87486hyr && !toq()) {
                    t8r();
                    if (m25731g() < 0) {
                        this.f87481f7l8 = 1;
                    }
                }
            } catch (OutOfMemoryError unused) {
                this.f87481f7l8 = 2;
                o1t();
            }
        } else {
            this.f87481f7l8 = 2;
        }
        if (this.f87486hyr) {
            o1t();
            this.f87481f7l8 = 3;
        }
        return this.f87481f7l8;
    }

    protected void ld6() {
        this.f87481f7l8 = 0;
        this.f40026l = new Vector<>();
        this.f87500qrj = null;
        this.f87495n7h = null;
    }

    protected void mcp() {
        this.f87499oc = this.f87478d3;
        this.f87503wvg = this.f87497ni7;
        this.f40032t = this.f87484fu4;
        this.f87493mcp = this.f40034z;
        this.f87487jk = this.f87498o1t;
        this.f87483fti = this.f87475a9;
        this.f87489ki = this.f87476cdj;
        this.f87478d3 = 0;
        this.f87480eqxt = false;
        this.f87477d2ok = 0;
        this.f87495n7h = null;
    }

    /* JADX INFO: renamed from: n */
    public Bitmap m25735n(int i2) {
        int iM25731g = m25731g();
        if (iM25731g <= 0) {
            return null;
        }
        return this.f40026l.elementAt(i2 % iM25731g).f40035k;
    }

    protected int n7h() {
        try {
            return this.f40022g.read();
        } catch (Exception unused) {
            this.f87481f7l8 = 1;
            return 0;
        }
    }

    protected void ni7() {
        do {
            cdj();
            byte[] bArr = this.f87488jp0y;
            if (bArr[0] == 1) {
                this.f87504x2 = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f87485gvn7 <= 0) {
                return;
            }
        } while (!toq());
    }

    public void o1t() {
        Vector<C7110k> vector = this.f40026l;
        if (vector != null) {
            int size = vector.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f40026l.elementAt(i2).m25742k();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public int m25736p() {
        return this.f40033y;
    }

    /* JADX INFO: renamed from: q */
    public int m25737q(int i2) {
        this.f87477d2ok = -1;
        int iM25731g = m25731g();
        if (i2 >= 0 && i2 < iM25731g) {
            this.f87477d2ok = this.f40026l.elementAt(i2).f87508toq;
        }
        return this.f87477d2ok;
    }

    /* JADX INFO: renamed from: s */
    public int m25738s() {
        if (this.f87507zy) {
            return this.f40029q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public void m25739t() {
        this.f87486hyr = true;
        wvg();
    }

    protected void t8r() {
        this.f40029q = 0;
        boolean z2 = false;
        while (!z2 && !toq() && !this.f87486hyr) {
            int iN7h = n7h();
            if (iN7h == 33) {
                int iN7h2 = n7h();
                if (iN7h2 == 1) {
                    jp0y();
                } else if (iN7h2 == 249) {
                    m25733i();
                } else if (iN7h2 == 254) {
                    jp0y();
                } else if (iN7h2 != 255) {
                    jp0y();
                } else {
                    cdj();
                    String str = "";
                    for (int i2 = 0; i2 < 11; i2++) {
                        str = str + ((char) this.f87488jp0y[i2]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        ni7();
                    } else {
                        jp0y();
                    }
                }
            } else if (iN7h == 44) {
                int size = this.f40026l.size();
                m25732h();
                if (this.f40026l.size() > size) {
                    this.f40025k += (long) (this.f87475a9.getRowBytes() * this.f87475a9.getHeight());
                }
                if (this.f40025k > this.f87502toq) {
                    z2 = true;
                }
            } else if (iN7h != 59) {
                this.f87481f7l8 = 1;
            } else {
                this.f87507zy = true;
                z2 = true;
            }
        }
    }

    protected boolean toq() {
        return this.f87481f7l8 != 0;
    }

    public boolean x2() {
        return this.f87507zy;
    }

    /* JADX INFO: renamed from: y */
    public int m25740y() {
        return this.f87504x2;
    }

    /* JADX INFO: renamed from: z */
    protected int m25741z() {
        return n7h() | (n7h() << 8);
    }

    protected void zurt() {
        this.f40033y = m25741z();
        this.f40031s = m25741z();
        int iN7h = n7h();
        this.f40028p = (iN7h & 128) != 0;
        this.f87491ld6 = 2 << (iN7h & 7);
        this.f40023h = n7h();
        this.f87501t8r = n7h();
    }

    public Bitmap zy() {
        return m25735n(0);
    }
}
