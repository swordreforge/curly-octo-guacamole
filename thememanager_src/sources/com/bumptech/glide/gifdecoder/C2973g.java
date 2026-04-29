package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.InterfaceC2974k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: renamed from: com.bumptech.glide.gifdecoder.g */
/* JADX INFO: compiled from: StandardGifDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2973g implements InterfaceC2974k {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f61601a9 = 4;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f61602fti = 255;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f61603jk = -1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    @x2
    private static final int f61604jp0y = 0;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f61605mcp = -1;

    /* JADX INFO: renamed from: t */
    private static final int f17927t = 4096;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f61606wvg = "g";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f61607cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @x2
    private final int[] f61608f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f61609fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f61610fu4;

    /* JADX INFO: renamed from: g */
    @x2
    private int[] f17928g;

    /* JADX INFO: renamed from: h */
    @x2
    private int[] f17929h;

    /* JADX INFO: renamed from: i */
    private boolean f17930i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private zy f61611ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private byte[] f61612kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private C2976q f61613ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private byte[] f61614n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f61615ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    @lvui
    private Bitmap.Config f61616o1t;

    /* JADX INFO: renamed from: p */
    private byte[] f17931p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private byte[] f61617qrj;

    /* JADX INFO: renamed from: s */
    private ByteBuffer f17932s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private Bitmap f61618t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private short[] f61619x2;

    /* JADX INFO: renamed from: y */
    private final InterfaceC2974k.k f17933y;

    /* JADX INFO: renamed from: z */
    @dd
    private Boolean f17934z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f61620zurt;

    public C2973g(@lvui InterfaceC2974k.k kVar, zy zyVar, ByteBuffer byteBuffer) {
        this(kVar, zyVar, byteBuffer, 1);
    }

    private void fn3e(toq toqVar) {
        toq toqVar2 = toqVar;
        int[] iArr = this.f17929h;
        int i2 = toqVar2.f17951q;
        int i3 = toqVar2.f61644toq;
        int i4 = toqVar2.f61645zy;
        int i5 = toqVar2.f17948k;
        boolean z2 = this.f61607cdj == 0;
        int i6 = this.f61610fu4;
        byte[] bArr = this.f61612kja0;
        int[] iArr2 = this.f17928g;
        int i7 = 0;
        byte b2 = -1;
        while (i7 < i2) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = toqVar2.f61645zy * i7;
            int i13 = i9;
            while (i13 < i10) {
                byte b3 = bArr[i12];
                int i14 = i2;
                int i15 = b3 & 255;
                if (i15 != b2) {
                    int i16 = iArr2[i15];
                    if (i16 != 0) {
                        iArr[i13] = i16;
                    } else {
                        b2 = b3;
                    }
                }
                i12++;
                i13++;
                i2 = i14;
            }
            i7++;
            toqVar2 = toqVar;
        }
        Boolean bool = this.f17934z;
        this.f17934z = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f17934z == null && z2 && b2 != -1));
    }

    private Bitmap fu4() {
        Boolean bool = this.f17934z;
        Bitmap bitmapZy = this.f17933y.zy(this.f61610fu4, this.f61615ni7, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f61616o1t);
        bitmapZy.setHasAlpha(true);
        return bitmapZy;
    }

    /* JADX INFO: renamed from: i */
    private void m10584i(toq toqVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f17929h;
        int i7 = toqVar.f17951q;
        int i8 = this.f61620zurt;
        int i9 = i7 / i8;
        int i10 = toqVar.f61644toq / i8;
        int i11 = toqVar.f61645zy / i8;
        int i12 = toqVar.f17948k / i8;
        boolean z2 = this.f61607cdj == 0;
        int i13 = this.f61610fu4;
        int i14 = this.f61615ni7;
        byte[] bArr = this.f61612kja0;
        int[] iArr2 = this.f17928g;
        Boolean bool = this.f17934z;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i9) {
            Boolean bool2 = bool;
            if (toqVar.f17949n) {
                if (i17 >= i9) {
                    i2 = i9;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i15 = 4;
                        i17 = 2;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i2 = i9;
                }
                i3 = i17 + i15;
            } else {
                i2 = i9;
                i3 = i17;
                i17 = i16;
            }
            int i20 = i17 + i10;
            boolean z3 = i8 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i12;
                int i23 = i22 + i11;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i4 = i3;
                int i25 = i16 * i8 * toqVar.f61645zy;
                if (z3) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i10;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i25 += i8;
                        i26++;
                        i10 = i27;
                    }
                } else {
                    i6 = i10;
                    int i29 = ((i23 - i22) * i8) + i25;
                    int i30 = i22;
                    while (true) {
                        i5 = i11;
                        if (i30 < i23) {
                            int iT8r = t8r(i25, i29, toqVar.f61645zy);
                            if (iT8r != 0) {
                                iArr[i30] = iT8r;
                            } else if (z2 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i25 += i8;
                            i30++;
                            i11 = i5;
                        }
                    }
                    bool = bool2;
                    i16++;
                    i10 = i6;
                    i11 = i5;
                    i9 = i2;
                    i17 = i4;
                }
            } else {
                i4 = i3;
            }
            i6 = i10;
            i5 = i11;
            bool = bool2;
            i16++;
            i10 = i6;
            i11 = i5;
            i9 = i2;
            i17 = i4;
        }
        Boolean bool3 = bool;
        if (this.f17934z == null) {
            this.f17934z = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    @lvui
    private C2976q ni7() {
        if (this.f61613ld6 == null) {
            this.f61613ld6 = new C2976q();
        }
        return this.f61613ld6;
    }

    private int o1t() {
        return this.f17932s.get() & 255;
    }

    @x2
    private int t8r(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.f61620zurt + i2; i10++) {
            byte[] bArr = this.f61612kja0;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.f17928g[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += (i11 >> 24) & 255;
                i6 += (i11 >> 16) & 255;
                i7 += (i11 >> 8) & 255;
                i8 += i11 & 255;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.f61620zurt + i12; i13++) {
            byte[] bArr2 = this.f61612kja0;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            int i14 = this.f17928g[bArr2[i13] & 255];
            if (i14 != 0) {
                i5 += (i14 >> 24) & 255;
                i6 += (i14 >> 16) & 255;
                i7 += (i14 >> 8) & 255;
                i8 += i14 & 255;
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    private Bitmap wvg(toq toqVar, toq toqVar2) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.f17929h;
        int i4 = 0;
        if (toqVar2 == null) {
            Bitmap bitmap2 = this.f61618t8r;
            if (bitmap2 != null) {
                this.f17933y.mo10595k(bitmap2);
            }
            this.f61618t8r = null;
            Arrays.fill(iArr, 0);
        }
        if (toqVar2 != null && toqVar2.f61642f7l8 == 3 && this.f61618t8r == null) {
            Arrays.fill(iArr, 0);
        }
        if (toqVar2 != null && (i3 = toqVar2.f61642f7l8) > 0) {
            if (i3 == 2) {
                if (!toqVar.f17947g) {
                    zy zyVar = this.f61611ki;
                    int i5 = zyVar.f61652x2;
                    if (toqVar.f61643ld6 == null || zyVar.f17957p != toqVar.f17953y) {
                        i4 = i5;
                    }
                }
                int i6 = toqVar2.f17951q;
                int i7 = this.f61620zurt;
                int i8 = i6 / i7;
                int i9 = toqVar2.f61644toq / i7;
                int i10 = toqVar2.f61645zy / i7;
                int i11 = toqVar2.f17948k / i7;
                int i12 = this.f61610fu4;
                int i13 = (i9 * i12) + i11;
                int i14 = (i8 * i12) + i13;
                while (i13 < i14) {
                    int i15 = i13 + i10;
                    for (int i16 = i13; i16 < i15; i16++) {
                        iArr[i16] = i4;
                    }
                    i13 += this.f61610fu4;
                }
            } else if (i3 == 3 && (bitmap = this.f61618t8r) != null) {
                int i17 = this.f61610fu4;
                bitmap.getPixels(iArr, 0, i17, 0, 0, i17, this.f61615ni7);
            }
        }
        zurt(toqVar);
        if (toqVar.f17949n || this.f61620zurt != 1) {
            m10584i(toqVar);
        } else {
            fn3e(toqVar);
        }
        if (this.f17930i && ((i2 = toqVar.f61642f7l8) == 0 || i2 == 1)) {
            if (this.f61618t8r == null) {
                this.f61618t8r = fu4();
            }
            Bitmap bitmap3 = this.f61618t8r;
            int i18 = this.f61610fu4;
            bitmap3.setPixels(iArr, 0, i18, 0, 0, i18, this.f61615ni7);
        }
        Bitmap bitmapFu4 = fu4();
        int i19 = this.f61610fu4;
        bitmapFu4.setPixels(iArr, 0, i19, 0, 0, i19, this.f61615ni7);
        return bitmapFu4;
    }

    /* JADX INFO: renamed from: z */
    private int m10585z() {
        int iO1t = o1t();
        if (iO1t <= 0) {
            return iO1t;
        }
        ByteBuffer byteBuffer = this.f17932s;
        byteBuffer.get(this.f17931p, 0, Math.min(iO1t, byteBuffer.remaining()));
        return iO1t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void zurt(toq toqVar) {
        int i2;
        int i3;
        short s2;
        C2973g c2973g = this;
        if (toqVar != null) {
            c2973g.f17932s.position(toqVar.f17950p);
        }
        if (toqVar == null) {
            zy zyVar = c2973g.f61611ki;
            i2 = zyVar.f17954g;
            i3 = zyVar.f61648f7l8;
        } else {
            i2 = toqVar.f61645zy;
            i3 = toqVar.f17951q;
        }
        int i4 = i2 * i3;
        byte[] bArr = c2973g.f61612kja0;
        if (bArr == null || bArr.length < i4) {
            c2973g.f61612kja0 = c2973g.f17933y.toq(i4);
        }
        byte[] bArr2 = c2973g.f61612kja0;
        if (c2973g.f61619x2 == null) {
            c2973g.f61619x2 = new short[4096];
        }
        short[] sArr = c2973g.f61619x2;
        if (c2973g.f61617qrj == null) {
            c2973g.f61617qrj = new byte[4096];
        }
        byte[] bArr3 = c2973g.f61617qrj;
        if (c2973g.f61614n7h == null) {
            c2973g.f61614n7h = new byte[4097];
        }
        byte[] bArr4 = c2973g.f61614n7h;
        int iO1t = o1t();
        int i5 = 1 << iO1t;
        int i6 = i5 + 1;
        int i7 = i5 + 2;
        int i8 = iO1t + 1;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = c2973g.f17931p;
        int i12 = i8;
        int i13 = i7;
        int i14 = i9;
        int iM10585z = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = -1;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            if (iM10585z == 0) {
                iM10585z = m10585z();
                if (iM10585z <= 0) {
                    c2973g.f61609fn3e = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & 255) << i16;
            i15++;
            iM10585z--;
            int i22 = i16 + 8;
            int i23 = i13;
            int i24 = i12;
            int i25 = i21;
            int i26 = i8;
            int i27 = i19;
            while (true) {
                if (i22 < i24) {
                    i21 = i25;
                    i13 = i23;
                    i16 = i22;
                    c2973g = this;
                    i19 = i27;
                    i8 = i26;
                    i12 = i24;
                    break;
                }
                int i28 = i7;
                int i29 = i17 & i14;
                i17 >>= i24;
                i22 -= i24;
                if (i29 == i5) {
                    i14 = i9;
                    i24 = i26;
                    i23 = i28;
                    i7 = i23;
                    i25 = -1;
                } else {
                    if (i29 == i6) {
                        i16 = i22;
                        i19 = i27;
                        i13 = i23;
                        i8 = i26;
                        i7 = i28;
                        i21 = i25;
                        i12 = i24;
                        c2973g = this;
                        break;
                    }
                    if (i25 == -1) {
                        bArr2[i18] = bArr3[i29];
                        i18++;
                        i10++;
                        i25 = i29;
                        i27 = i25;
                        i7 = i28;
                        i22 = i22;
                    } else {
                        if (i29 >= i23) {
                            bArr4[i20] = (byte) i27;
                            i20++;
                            s2 = i25;
                        } else {
                            s2 = i29;
                        }
                        while (s2 >= i5) {
                            bArr4[i20] = bArr3[s2];
                            i20++;
                            s2 = sArr[s2];
                        }
                        i27 = bArr3[s2] & 255;
                        byte b2 = (byte) i27;
                        bArr2[i18] = b2;
                        while (true) {
                            i18++;
                            i10++;
                            if (i20 <= 0) {
                                break;
                            }
                            i20--;
                            bArr2[i18] = bArr4[i20];
                        }
                        byte[] bArr6 = bArr4;
                        if (i23 < 4096) {
                            sArr[i23] = (short) i25;
                            bArr3[i23] = b2;
                            i23++;
                            if ((i23 & i14) == 0 && i23 < 4096) {
                                i24++;
                                i14 += i23;
                            }
                        }
                        i25 = i29;
                        i7 = i28;
                        i22 = i22;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i18, i4, (byte) 0);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public int cdj(@dd InputStream inputStream, int i2) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2 > 0 ? i2 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i3 = inputStream.read(bArr, 0, 16384);
                    if (i3 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e2) {
                Log.w(f61606wvg, "Error reading data from stream", e2);
            }
        } else {
            this.f61609fn3e = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                Log.w(f61606wvg, "Error closing stream", e3);
            }
        }
        return this.f61609fn3e;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public void clear() {
        this.f61611ki = null;
        byte[] bArr = this.f61612kja0;
        if (bArr != null) {
            this.f17933y.mo10596n(bArr);
        }
        int[] iArr = this.f17929h;
        if (iArr != null) {
            this.f17933y.mo10594g(iArr);
        }
        Bitmap bitmap = this.f61618t8r;
        if (bitmap != null) {
            this.f17933y.mo10595k(bitmap);
        }
        this.f61618t8r = null;
        this.f17932s = null;
        this.f17934z = null;
        byte[] bArr2 = this.f17931p;
        if (bArr2 != null) {
            this.f17933y.mo10596n(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public int f7l8(int i2) {
        if (i2 >= 0) {
            zy zyVar = this.f61611ki;
            if (i2 < zyVar.f61653zy) {
                return zyVar.f17956n.get(i2).f17952s;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    /* JADX INFO: renamed from: g */
    public void mo10586g(@lvui Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f61616o1t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    @lvui
    public ByteBuffer getData() {
        return this.f17932s;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public int getStatus() {
        return this.f61609fn3e;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    /* JADX INFO: renamed from: h */
    public int mo10587h() {
        return this.f61611ki.f61650qrj;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    /* JADX INFO: renamed from: k */
    public int mo10588k() {
        return this.f61611ki.f61648f7l8;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public int ki() {
        return this.f17932s.limit() + this.f61612kja0.length + (this.f17929h.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public synchronized void kja0(@lvui zy zyVar, @lvui ByteBuffer byteBuffer, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
        int iHighestOneBit = Integer.highestOneBit(i2);
        this.f61609fn3e = 0;
        this.f61611ki = zyVar;
        this.f61607cdj = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f17932s = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f17932s.order(ByteOrder.LITTLE_ENDIAN);
        this.f17930i = false;
        Iterator<toq> it = zyVar.f17956n.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f61642f7l8 == 3) {
                this.f17930i = true;
                break;
            }
        }
        this.f61620zurt = iHighestOneBit;
        int i3 = zyVar.f17954g;
        this.f61610fu4 = i3 / iHighestOneBit;
        int i4 = zyVar.f61648f7l8;
        this.f61615ni7 = i4 / iHighestOneBit;
        this.f61612kja0 = this.f17933y.toq(i3 * i4);
        this.f17929h = this.f17933y.mo10597q(this.f61610fu4 * this.f61615ni7);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public int ld6() {
        int i2;
        if (this.f61611ki.f61653zy <= 0 || (i2 = this.f61607cdj) < 0) {
            return 0;
        }
        return f7l8(i2);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    /* JADX INFO: renamed from: n */
    public int mo10589n() {
        return this.f61611ki.f61653zy;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public int n7h() {
        return this.f61607cdj;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    /* JADX INFO: renamed from: p */
    public synchronized void mo10590p(@lvui zy zyVar, @lvui byte[] bArr) {
        qrj(zyVar, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    /* JADX INFO: renamed from: q */
    public void mo10591q() {
        this.f61607cdj = (this.f61607cdj + 1) % this.f61611ki.f61653zy;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public synchronized void qrj(@lvui zy zyVar, @lvui ByteBuffer byteBuffer) {
        kja0(zyVar, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public synchronized int read(@dd byte[] bArr) {
        zy zyVarM10606q = ni7().ki(bArr).m10606q();
        this.f61611ki = zyVarM10606q;
        if (bArr != null) {
            mo10590p(zyVarM10606q, bArr);
        }
        return this.f61609fn3e;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    @Deprecated
    /* JADX INFO: renamed from: s */
    public int mo10592s() {
        int i2 = this.f61611ki.f61650qrj;
        if (i2 == -1) {
            return 1;
        }
        return i2;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public int toq() {
        return this.f61611ki.f17954g;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    public void x2() {
        this.f61607cdj = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    /* JADX INFO: renamed from: y */
    public int mo10593y() {
        int i2 = this.f61611ki.f61650qrj;
        if (i2 == -1) {
            return 1;
        }
        if (i2 == 0) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k
    @dd
    public synchronized Bitmap zy() {
        if (this.f61611ki.f61653zy <= 0 || this.f61607cdj < 0) {
            String str = f61606wvg;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f61611ki.f61653zy + ", framePointer=" + this.f61607cdj);
            }
            this.f61609fn3e = 1;
        }
        int i2 = this.f61609fn3e;
        if (i2 != 1 && i2 != 2) {
            this.f61609fn3e = 0;
            if (this.f17931p == null) {
                this.f17931p = this.f17933y.toq(255);
            }
            toq toqVar = this.f61611ki.f17956n.get(this.f61607cdj);
            int i3 = this.f61607cdj - 1;
            toq toqVar2 = i3 >= 0 ? this.f61611ki.f17956n.get(i3) : null;
            int[] iArr = toqVar.f61643ld6;
            if (iArr == null) {
                iArr = this.f61611ki.f17955k;
            }
            this.f17928g = iArr;
            if (iArr == null) {
                String str2 = f61606wvg;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f61607cdj);
                }
                this.f61609fn3e = 1;
                return null;
            }
            if (toqVar.f17947g) {
                System.arraycopy(iArr, 0, this.f61608f7l8, 0, iArr.length);
                int[] iArr2 = this.f61608f7l8;
                this.f17928g = iArr2;
                iArr2[toqVar.f17953y] = 0;
                if (toqVar.f61642f7l8 == 2 && this.f61607cdj == 0) {
                    this.f17934z = Boolean.TRUE;
                }
            }
            return wvg(toqVar, toqVar2);
        }
        String str3 = f61606wvg;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f61609fn3e);
        }
        return null;
    }

    public C2973g(@lvui InterfaceC2974k.k kVar, zy zyVar, ByteBuffer byteBuffer, int i2) {
        this(kVar);
        kja0(zyVar, byteBuffer, i2);
    }

    public C2973g(@lvui InterfaceC2974k.k kVar) {
        this.f61608f7l8 = new int[256];
        this.f61616o1t = Bitmap.Config.ARGB_8888;
        this.f17933y = kVar;
        this.f61611ki = new zy();
    }
}
