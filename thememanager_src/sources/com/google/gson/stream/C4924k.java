package com.google.gson.stream;

import com.google.gson.internal.bind.C4878n;
import com.google.gson.internal.f7l8;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kotlin.text.eqxt;

/* JADX INFO: renamed from: com.google.gson.stream.k */
/* JADX INFO: compiled from: JsonReader.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4924k implements Closeable {

    /* JADX INFO: renamed from: a */
    private static final int f27825a = 3;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f68799ab = 10;
    private static final int ac = 6;
    private static final int ad = 7;
    private static final int an = 14;
    private static final int as = 0;
    private static final int ax = 4;
    private static final int az = 2;

    /* JADX INFO: renamed from: b */
    private static final int f27826b = 2;
    private static final int ba = 3;
    private static final int bb = 11;
    private static final int bg = 1;
    private static final int bl = 17;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f68800bo = 6;
    private static final int bp = 12;
    private static final int bq = 5;
    private static final int bv = 13;

    /* JADX INFO: renamed from: d */
    private static final int f27827d = 8;

    /* JADX INFO: renamed from: e */
    private static final char[] f27828e = ")]}'\n".toCharArray();
    private static final int id = 15;
    private static final int in = 16;

    /* JADX INFO: renamed from: j */
    private static final long f27829j = -922337203685477580L;

    /* JADX INFO: renamed from: m */
    private static final int f27830m = 1;

    /* JADX INFO: renamed from: o */
    private static final int f27831o = 0;

    /* JADX INFO: renamed from: u */
    private static final int f27832u = 5;

    /* JADX INFO: renamed from: v */
    private static final int f27833v = 7;

    /* JADX INFO: renamed from: w */
    private static final int f27834w = 9;

    /* JADX INFO: renamed from: x */
    private static final int f27835x = 4;

    /* JADX INFO: renamed from: c */
    private int[] f27836c;

    /* JADX INFO: renamed from: f */
    private String[] f27837f;

    /* JADX INFO: renamed from: i */
    private long f27840i;

    /* JADX INFO: renamed from: k */
    private final Reader f27841k;

    /* JADX INFO: renamed from: r */
    private int[] f27846r;

    /* JADX INFO: renamed from: t */
    private String f27848t;

    /* JADX INFO: renamed from: z */
    private int f27850z;

    /* JADX INFO: renamed from: q */
    private boolean f27845q = false;

    /* JADX INFO: renamed from: n */
    private final char[] f27843n = new char[1024];

    /* JADX INFO: renamed from: g */
    private int f27838g = 0;

    /* JADX INFO: renamed from: y */
    private int f27849y = 0;

    /* JADX INFO: renamed from: s */
    private int f27847s = 0;

    /* JADX INFO: renamed from: p */
    private int f27844p = 0;

    /* JADX INFO: renamed from: h */
    int f27839h = 0;

    /* JADX INFO: renamed from: l */
    private int f27842l = 0 + 1;

    /* JADX INFO: renamed from: com.google.gson.stream.k$k */
    /* JADX INFO: compiled from: JsonReader.java */
    class k extends f7l8 {
        k() {
        }

        @Override // com.google.gson.internal.f7l8
        /* JADX INFO: renamed from: k */
        public void mo17160k(C4924k c4924k) throws IOException {
            if (c4924k instanceof C4878n) {
                ((C4878n) c4924k).vy();
                return;
            }
            int iM17227p = c4924k.f27839h;
            if (iM17227p == 0) {
                iM17227p = c4924k.m17227p();
            }
            if (iM17227p == 13) {
                c4924k.f27839h = 9;
                return;
            }
            if (iM17227p == 12) {
                c4924k.f27839h = 8;
                return;
            }
            if (iM17227p == 14) {
                c4924k.f27839h = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + c4924k.g1() + c4924k.m17228t());
        }
    }

    static {
        f7l8.f27740k = new k();
    }

    public C4924k(Reader reader) {
        int[] iArr = new int[32];
        this.f27846r = iArr;
        iArr[0] = 6;
        this.f27837f = new String[32];
        this.f27836c = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f27841k = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m17224q();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void bap7() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f27838g
            int r2 = r1 + r0
            int r3 = r4.f27849y
            if (r2 >= r3) goto L51
            char[] r2 = r4.f27843n
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m17224q()
        L4b:
            int r1 = r4.f27838g
            int r1 = r1 + r0
            r4.f27838g = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f27838g = r1
            r0 = 1
            boolean r0 = r4.m17223h(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4924k.bap7():void");
    }

    private char bek6() throws IOException {
        int i2;
        int i3;
        if (this.f27838g == this.f27849y && !m17223h(1)) {
            throw wlev("Unterminated escape sequence");
        }
        char[] cArr = this.f27843n;
        int i4 = this.f27838g;
        int i5 = i4 + 1;
        this.f27838g = i5;
        char c2 = cArr[i4];
        if (c2 == '\n') {
            this.f27847s++;
            this.f27844p = i5;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                throw wlev("Invalid escape sequence");
            }
            if (i5 + 4 > this.f27849y && !m17223h(4)) {
                throw wlev("Unterminated escape sequence");
            }
            char c3 = 0;
            int i6 = this.f27838g;
            int i7 = i6 + 4;
            while (i6 < i7) {
                char c4 = this.f27843n[i6];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i2 = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f27843n, this.f27838g, 4));
                        }
                        i2 = c4 - 'A';
                    }
                    i3 = i2 + 10;
                } else {
                    i3 = c4 - '0';
                }
                c3 = (char) (c5 + i3);
                i6++;
            }
            this.f27838g += 4;
            return c3;
        }
        return c2;
    }

    private void bwp(int i2) {
        int i3 = this.f27842l;
        int[] iArr = this.f27846r;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f27846r = Arrays.copyOf(iArr, i4);
            this.f27836c = Arrays.copyOf(this.f27836c, i4);
            this.f27837f = (String[]) Arrays.copyOf(this.f27837f, i4);
        }
        int[] iArr2 = this.f27846r;
        int i5 = this.f27842l;
        this.f27842l = i5 + 1;
        iArr2[i5] = i2;
    }

    /* JADX INFO: renamed from: h */
    private boolean m17223h(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f27843n;
        int i5 = this.f27844p;
        int i6 = this.f27838g;
        this.f27844p = i5 - i6;
        int i7 = this.f27849y;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f27849y = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f27849y = 0;
        }
        this.f27838g = 0;
        do {
            Reader reader = this.f27841k;
            int i9 = this.f27849y;
            int i10 = reader.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.f27849y + i10;
            this.f27849y = i3;
            if (this.f27847s == 0 && (i4 = this.f27844p) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f27838g++;
                this.f27844p = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private int i1(boolean z2) throws IOException {
        char[] cArr = this.f27843n;
        int i2 = this.f27838g;
        int i3 = this.f27849y;
        while (true) {
            if (i2 == i3) {
                this.f27838g = i2;
                if (!m17223h(1)) {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m17228t());
                }
                i2 = this.f27838g;
                i3 = this.f27849y;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f27847s++;
                this.f27844p = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f27838g = i4;
                    if (i4 == i3) {
                        this.f27838g = i4 - 1;
                        boolean zM17223h = m17223h(2);
                        this.f27838g++;
                        if (!zM17223h) {
                            return c2;
                        }
                    }
                    m17224q();
                    int i5 = this.f27838g;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f27838g = i5 + 1;
                        if (!nsb("*/")) {
                            throw wlev("Unterminated comment");
                        }
                        i2 = this.f27838g + 2;
                        i3 = this.f27849y;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f27838g = i5 + 1;
                        ngy();
                        i2 = this.f27838g;
                        i3 = this.f27849y;
                    }
                } else {
                    if (c2 != '#') {
                        this.f27838g = i4;
                        return c2;
                    }
                    this.f27838g = i4;
                    m17224q();
                    ngy();
                    i2 = this.f27838g;
                    i3 = this.f27849y;
                }
            }
            i2 = i4;
        }
    }

    private void ij(char c2) throws IOException {
        char[] cArr = this.f27843n;
        do {
            int i2 = this.f27838g;
            int i3 = this.f27849y;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f27838g = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f27838g = i4;
                    bek6();
                    i2 = this.f27838g;
                    i3 = this.f27849y;
                } else {
                    if (c3 == '\n') {
                        this.f27847s++;
                        this.f27844p = i4;
                    }
                    i2 = i4;
                }
            }
            this.f27838g = i2;
        } while (m17223h(1));
        throw wlev("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (wvg(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        r18.f27840i = r11;
        r18.f27838g += r8;
        r18.f27839h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
    
        r18.f27850z = r8;
        r18.f27839h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int ltg8() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4924k.ltg8():int");
    }

    private void ngy() throws IOException {
        char c2;
        do {
            if (this.f27838g >= this.f27849y && !m17223h(1)) {
                return;
            }
            char[] cArr = this.f27843n;
            int i2 = this.f27838g;
            int i3 = i2 + 1;
            this.f27838g = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f27847s++;
                this.f27844p = i3;
                return;
            }
        } while (c2 != '\r');
    }

    private boolean nsb(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f27838g + length > this.f27849y && !m17223h(length)) {
                return false;
            }
            char[] cArr = this.f27843n;
            int i2 = this.f27838g;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f27843n[this.f27838g + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.f27847s++;
            this.f27844p = i2 + 1;
            this.f27838g++;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m17224q() throws IOException {
        if (!this.f27845q) {
            throw wlev("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m17224q();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String t8iq() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f27838g
            int r4 = r3 + r2
            int r5 = r6.f27849y
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f27843n
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m17224q()
            goto L5c
        L4e:
            char[] r3 = r6.f27843n
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m17223h(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f27843n
            int r4 = r6.f27838g
            r1.append(r3, r4, r2)
            int r3 = r6.f27838g
            int r3 = r3 + r2
            r6.f27838g = r3
            r2 = 1
            boolean r2 = r6.m17223h(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f27843n
            int r3 = r6.f27838g
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f27843n
            int r3 = r6.f27838g
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f27838g
            int r2 = r2 + r0
            r6.f27838g = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4924k.t8iq():java.lang.String");
    }

    private int was() throws IOException {
        int i2;
        String str;
        String str2;
        char c2 = this.f27843n[this.f27838g];
        if (c2 == 't' || c2 == 'T') {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i2 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f27838g + i3 >= this.f27849y && !m17223h(i3 + 1)) {
                return 0;
            }
            char c3 = this.f27843n[this.f27838g + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f27838g + length < this.f27849y || m17223h(length + 1)) && wvg(this.f27843n[this.f27838g + length])) {
            return 0;
        }
        this.f27838g += length;
        this.f27839h = i2;
        return i2;
    }

    private IOException wlev(String str) throws IOException {
        throw new C4925n(str + m17228t());
    }

    private boolean wvg(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m17224q();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f27838g = r2;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m17225x(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f27843n
            r1 = 0
        L3:
            int r2 = r9.f27838g
            int r3 = r9.f27849y
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f27838g = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f27838g = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.bek6()
            r1.append(r2)
            int r2 = r9.f27838g
            int r3 = r9.f27849y
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f27847s
            int r2 = r2 + r6
            r9.f27847s = r2
            r9.f27844p = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f27838g = r2
            boolean r2 = r9.m17223h(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.wlev(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4924k.m17225x(char):java.lang.String");
    }

    /* JADX INFO: renamed from: y */
    private void m17226y() throws IOException {
        i1(true);
        int i2 = this.f27838g - 1;
        this.f27838g = i2;
        char[] cArr = f27828e;
        if (i2 + cArr.length > this.f27849y && !m17223h(cArr.length)) {
            return;
        }
        int i3 = 0;
        while (true) {
            char[] cArr2 = f27828e;
            if (i3 >= cArr2.length) {
                this.f27838g += cArr2.length;
                return;
            } else if (this.f27843n[this.f27838g + i3] != cArr2[i3]) {
                return;
            } else {
                i3++;
            }
        }
    }

    public void a98o() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 7) {
            this.f27839h = 0;
            int[] iArr = this.f27836c;
            int i2 = this.f27842l - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + g1() + m17228t());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27839h = 0;
        this.f27846r[0] = 8;
        this.f27842l = 1;
        this.f27841k.close();
    }

    public boolean d2ok() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 5) {
            this.f27839h = 0;
            int[] iArr = this.f27836c;
            int i2 = this.f27842l - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iM17227p == 6) {
            this.f27839h = 0;
            int[] iArr2 = this.f27836c;
            int i3 = this.f27842l - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + g1() + m17228t());
    }

    /* JADX INFO: renamed from: f */
    public int mo17115f() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 15) {
            long j2 = this.f27840i;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f27839h = 0;
                int[] iArr = this.f27836c;
                int i3 = this.f27842l - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f27840i + m17228t());
        }
        if (iM17227p == 16) {
            this.f27848t = new String(this.f27843n, this.f27838g, this.f27850z);
            this.f27838g += this.f27850z;
        } else {
            if (iM17227p != 8 && iM17227p != 9 && iM17227p != 10) {
                throw new IllegalStateException("Expected an int but was " + g1() + m17228t());
            }
            if (iM17227p == 10) {
                this.f27848t = t8iq();
            } else {
                this.f27848t = m17225x(iM17227p == 8 ? '\'' : eqxt.f81913toq);
            }
            try {
                int i4 = Integer.parseInt(this.f27848t);
                this.f27839h = 0;
                int[] iArr2 = this.f27836c;
                int i5 = this.f27842l - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f27839h = 11;
        double d2 = Double.parseDouble(this.f27848t);
        int i6 = (int) d2;
        if (i6 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.f27848t + m17228t());
        }
        this.f27848t = null;
        this.f27839h = 0;
        int[] iArr3 = this.f27836c;
        int i7 = this.f27842l - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    public final boolean fu4() {
        return this.f27845q;
    }

    public zy g1() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        switch (iM17227p) {
            case 1:
                return zy.BEGIN_OBJECT;
            case 2:
                return zy.END_OBJECT;
            case 3:
                return zy.BEGIN_ARRAY;
            case 4:
                return zy.END_ARRAY;
            case 5:
            case 6:
                return zy.BOOLEAN;
            case 7:
                return zy.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return zy.STRING;
            case 12:
            case 13:
            case 14:
                return zy.NAME;
            case 15:
            case 16:
                return zy.NUMBER;
            case 17:
                return zy.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(eqxt.f81918zy);
        int i2 = this.f27842l;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f27846r[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.f27836c[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.f27837f[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public void h4b() throws IOException {
        int i2 = 0;
        do {
            int iM17227p = this.f27839h;
            if (iM17227p == 0) {
                iM17227p = m17227p();
            }
            if (iM17227p == 3) {
                bwp(1);
            } else if (iM17227p == 1) {
                bwp(3);
            } else if (iM17227p == 4 || iM17227p == 2) {
                this.f27842l--;
                i2--;
                this.f27839h = 0;
            } else {
                if (iM17227p == 14 || iM17227p == 10) {
                    bap7();
                } else if (iM17227p == 8 || iM17227p == 12) {
                    ij('\'');
                } else if (iM17227p == 9 || iM17227p == 13) {
                    ij(eqxt.f81913toq);
                } else if (iM17227p == 16) {
                    this.f27838g += this.f27850z;
                }
                this.f27839h = 0;
            }
            i2++;
            this.f27839h = 0;
        } while (i2 != 0);
        int[] iArr = this.f27836c;
        int i3 = this.f27842l;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f27837f[i3 - 1] = "null";
    }

    public final void h7am(boolean z2) {
        this.f27845q = z2;
    }

    public double hyr() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 15) {
            this.f27839h = 0;
            int[] iArr = this.f27836c;
            int i2 = this.f27842l - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f27840i;
        }
        if (iM17227p == 16) {
            this.f27848t = new String(this.f27843n, this.f27838g, this.f27850z);
            this.f27838g += this.f27850z;
        } else if (iM17227p == 8 || iM17227p == 9) {
            this.f27848t = m17225x(iM17227p == 8 ? '\'' : eqxt.f81913toq);
        } else if (iM17227p == 10) {
            this.f27848t = t8iq();
        } else if (iM17227p != 11) {
            throw new IllegalStateException("Expected a double but was " + g1() + m17228t());
        }
        this.f27839h = 11;
        double d2 = Double.parseDouble(this.f27848t);
        if (!this.f27845q && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new C4925n("JSON forbids NaN and infinities: " + d2 + m17228t());
        }
        this.f27848t = null;
        this.f27839h = 0;
        int[] iArr2 = this.f27836c;
        int i3 = this.f27842l - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d2;
    }

    /* JADX INFO: renamed from: k */
    public void mo17116k() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 3) {
            bwp(1);
            this.f27836c[this.f27842l - 1] = 0;
            this.f27839h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + g1() + m17228t());
        }
    }

    public boolean ki() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        return (iM17227p == 2 || iM17227p == 4) ? false : true;
    }

    public void ld6() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + g1() + m17228t());
        }
        int i2 = this.f27842l - 1;
        this.f27842l = i2;
        int[] iArr = this.f27836c;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f27839h = 0;
    }

    public String nmn5() throws IOException {
        String str;
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 10) {
            str = t8iq();
        } else if (iM17227p == 8) {
            str = m17225x('\'');
        } else if (iM17227p == 9) {
            str = m17225x(eqxt.f81913toq);
        } else if (iM17227p == 11) {
            str = this.f27848t;
            this.f27848t = null;
        } else if (iM17227p == 15) {
            str = Long.toString(this.f27840i);
        } else {
            if (iM17227p != 16) {
                throw new IllegalStateException("Expected a string but was " + g1() + m17228t());
            }
            str = new String(this.f27843n, this.f27838g, this.f27850z);
            this.f27838g += this.f27850z;
        }
        this.f27839h = 0;
        int[] iArr = this.f27836c;
        int i2 = this.f27842l - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX INFO: renamed from: p */
    int m17227p() throws IOException {
        int iI1;
        int[] iArr = this.f27846r;
        int i2 = this.f27842l;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iI12 = i1(true);
            if (iI12 != 44) {
                if (iI12 != 59) {
                    if (iI12 != 93) {
                        throw wlev("Unterminated array");
                    }
                    this.f27839h = 4;
                    return 4;
                }
                m17224q();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (iI1 = i1(true)) != 44) {
                    if (iI1 != 59) {
                        if (iI1 != 125) {
                            throw wlev("Unterminated object");
                        }
                        this.f27839h = 2;
                        return 2;
                    }
                    m17224q();
                }
                int iI13 = i1(true);
                if (iI13 == 34) {
                    this.f27839h = 13;
                    return 13;
                }
                if (iI13 == 39) {
                    m17224q();
                    this.f27839h = 12;
                    return 12;
                }
                if (iI13 == 125) {
                    if (i3 == 5) {
                        throw wlev("Expected name");
                    }
                    this.f27839h = 2;
                    return 2;
                }
                m17224q();
                this.f27838g--;
                if (!wvg((char) iI13)) {
                    throw wlev("Expected name");
                }
                this.f27839h = 14;
                return 14;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iI14 = i1(true);
                if (iI14 != 58) {
                    if (iI14 != 61) {
                        throw wlev("Expected ':'");
                    }
                    m17224q();
                    if (this.f27838g < this.f27849y || m17223h(1)) {
                        char[] cArr = this.f27843n;
                        int i4 = this.f27838g;
                        if (cArr[i4] == '>') {
                            this.f27838g = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.f27845q) {
                    m17226y();
                }
                this.f27846r[this.f27842l - 1] = 7;
            } else if (i3 == 7) {
                if (i1(false) == -1) {
                    this.f27839h = 17;
                    return 17;
                }
                m17224q();
                this.f27838g--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iI15 = i1(true);
        if (iI15 == 34) {
            this.f27839h = 9;
            return 9;
        }
        if (iI15 == 39) {
            m17224q();
            this.f27839h = 8;
            return 8;
        }
        if (iI15 != 44 && iI15 != 59) {
            if (iI15 == 91) {
                this.f27839h = 3;
                return 3;
            }
            if (iI15 != 93) {
                if (iI15 == 123) {
                    this.f27839h = 1;
                    return 1;
                }
                this.f27838g--;
                int iWas = was();
                if (iWas != 0) {
                    return iWas;
                }
                int iLtg8 = ltg8();
                if (iLtg8 != 0) {
                    return iLtg8;
                }
                if (!wvg(this.f27843n[this.f27838g])) {
                    throw wlev("Expected value");
                }
                m17224q();
                this.f27839h = 10;
                return 10;
            }
            if (i3 == 1) {
                this.f27839h = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw wlev("Unexpected value");
        }
        m17224q();
        this.f27838g--;
        this.f27839h = 7;
        return 7;
    }

    /* JADX INFO: renamed from: t */
    String m17228t() {
        return " at line " + (this.f27847s + 1) + " column " + ((this.f27838g - this.f27844p) + 1) + " path " + getPath();
    }

    public String toString() {
        return getClass().getSimpleName() + m17228t();
    }

    public void x2() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + g1() + m17228t());
        }
        int i2 = this.f27842l - 1;
        this.f27842l = i2;
        this.f27837f[i2] = null;
        int[] iArr = this.f27836c;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f27839h = 0;
    }

    public String y9n() throws IOException {
        String strM17225x;
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 14) {
            strM17225x = t8iq();
        } else if (iM17227p == 12) {
            strM17225x = m17225x('\'');
        } else {
            if (iM17227p != 13) {
                throw new IllegalStateException("Expected a name but was " + g1() + m17228t());
            }
            strM17225x = m17225x(eqxt.f81913toq);
        }
        this.f27839h = 0;
        this.f27837f[this.f27842l - 1] = strM17225x;
        return strM17225x;
    }

    public long yz() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 15) {
            this.f27839h = 0;
            int[] iArr = this.f27836c;
            int i2 = this.f27842l - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f27840i;
        }
        if (iM17227p == 16) {
            this.f27848t = new String(this.f27843n, this.f27838g, this.f27850z);
            this.f27838g += this.f27850z;
        } else {
            if (iM17227p != 8 && iM17227p != 9 && iM17227p != 10) {
                throw new IllegalStateException("Expected a long but was " + g1() + m17228t());
            }
            if (iM17227p == 10) {
                this.f27848t = t8iq();
            } else {
                this.f27848t = m17225x(iM17227p == 8 ? '\'' : eqxt.f81913toq);
            }
            try {
                long j2 = Long.parseLong(this.f27848t);
                this.f27839h = 0;
                int[] iArr2 = this.f27836c;
                int i3 = this.f27842l - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f27839h = 11;
        double d2 = Double.parseDouble(this.f27848t);
        long j3 = (long) d2;
        if (j3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.f27848t + m17228t());
        }
        this.f27848t = null;
        this.f27839h = 0;
        int[] iArr3 = this.f27836c;
        int i4 = this.f27842l - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    public void zy() throws IOException {
        int iM17227p = this.f27839h;
        if (iM17227p == 0) {
            iM17227p = m17227p();
        }
        if (iM17227p == 1) {
            bwp(3);
            this.f27839h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + g1() + m17228t());
        }
    }
}
