package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.zy;
import java.io.EOFException;
import java.io.IOException;
import okio.kja0;
import okio.n7h;
import okio.x2;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.n */
/* JADX INFO: compiled from: JsonUtf8Reader.java */
/* JADX INFO: loaded from: classes.dex */
final class C1490n extends zy {

    /* JADX INFO: renamed from: a */
    private static final int f8183a = 1;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f56166ab = 8;
    private static final int ac = 3;
    private static final int ad = 4;
    private static final int am = 5;
    private static final int an = 12;
    private static final int as = 16;
    private static final int ax = 1;
    private static final int ay = 6;
    private static final int az = 18;

    /* JADX INFO: renamed from: b */
    private static final int f8184b = 0;
    private static final int ba = 0;
    private static final int bb = 9;
    private static final int be = 7;
    private static final int bg = 17;
    private static final int bl = 15;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f56167bo = 4;
    private static final int bp = 10;
    private static final int bq = 2;
    private static final int bv = 11;

    /* JADX INFO: renamed from: d */
    private static final int f8186d = 6;

    /* JADX INFO: renamed from: f */
    private static final long f8188f = -922337203685477580L;
    private static final int id = 13;
    private static final int in = 14;

    /* JADX INFO: renamed from: u */
    private static final int f8192u = 3;

    /* JADX INFO: renamed from: v */
    private static final int f8193v = 5;

    /* JADX INFO: renamed from: w */
    private static final int f8194w = 7;

    /* JADX INFO: renamed from: x */
    private static final int f8195x = 2;

    /* JADX INFO: renamed from: h */
    private final n7h f8196h;

    /* JADX INFO: renamed from: i */
    private final x2 f8197i;

    /* JADX INFO: renamed from: l */
    @dd
    private String f8198l;

    /* JADX INFO: renamed from: r */
    private int f8199r;

    /* JADX INFO: renamed from: t */
    private long f8200t;

    /* JADX INFO: renamed from: z */
    private int f8201z = 0;

    /* JADX INFO: renamed from: c */
    private static final kja0 f8185c = kja0.encodeUtf8("'\\");

    /* JADX INFO: renamed from: e */
    private static final kja0 f8187e = kja0.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: j */
    private static final kja0 f8189j = kja0.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: o */
    private static final kja0 f8191o = kja0.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: m */
    private static final kja0 f8190m = kja0.encodeUtf8("*/");

    C1490n(n7h n7hVar) {
        if (n7hVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f8196h = n7hVar;
        this.f8197i = n7hVar.mo27612n();
        hyr(6);
    }

    private void bap7() throws IOException {
        long jD3 = this.f8196h.d3(f8191o);
        x2 x2Var = this.f8197i;
        x2Var.skip(jD3 != -1 ? jD3 + 1 : x2Var.size());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int bek6() throws IOException {
        int i2;
        String str;
        String str2;
        byte bG1 = this.f8197i.g1(0L);
        if (bG1 == 116 || bG1 == 84) {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (bG1 == 102 || bG1 == 70) {
            i2 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (bG1 != 110 && bG1 != 78) {
                return 0;
            }
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i3 = 1;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (!this.f8196h.bf2(i4)) {
                return 0;
            }
            byte bG12 = this.f8197i.g1(i3);
            if (bG12 != str.charAt(i3) && bG12 != str2.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (this.f8196h.bf2(length + 1) && g1(this.f8197i.g1(length))) {
            return 0;
        }
        this.f8197i.skip(length);
        this.f8201z = i2;
        return i2;
    }

    private String bwp() throws IOException {
        long jD3 = this.f8196h.d3(f8189j);
        return jD3 != -1 ? this.f8197i.mo27610d(jD3) : this.f8197i.jbh();
    }

    private boolean g1(int i2) throws IOException {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m6169x();
        return false;
    }

    private void h4b() throws IOException {
        long jD3 = this.f8196h.d3(f8189j);
        x2 x2Var = this.f8197i;
        if (jD3 == -1) {
            jD3 = x2Var.size();
        }
        x2Var.skip(jD3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (g1(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
    
        if (r6 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
    
        if (r7 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        if (r10 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
    
        if (r8 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        if (r10 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
    
        r16.f8200t = r8;
        r16.f8197i.skip(r5);
        r16.f8201z = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        if (r6 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
    
        if (r6 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:
    
        r16.f8199r = r5;
        r16.f8201z = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b8, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int h7am() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C1490n.h7am():int");
    }

    private char ij() throws IOException {
        int i2;
        int i3;
        if (!this.f8196h.bf2(1L)) {
            throw a98o("Unterminated escape sequence");
        }
        byte b2 = this.f8197i.readByte();
        if (b2 == 10 || b2 == 34 || b2 == 39 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            if (this.f8213y) {
                return (char) b2;
            }
            throw a98o("Invalid escape sequence: \\" + ((char) b2));
        }
        if (!this.f8196h.bf2(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c2 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            byte bG1 = this.f8197i.g1(i4);
            char c3 = (char) (c2 << 4);
            if (bG1 < 48 || bG1 > 57) {
                if (bG1 >= 97 && bG1 <= 102) {
                    i2 = bG1 - 97;
                } else {
                    if (bG1 < 65 || bG1 > 70) {
                        throw a98o("\\u" + this.f8197i.mo27610d(4L));
                    }
                    i2 = bG1 - 65;
                }
                i3 = i2 + 10;
            } else {
                i3 = bG1 - 48;
            }
            c2 = (char) (c3 + i3);
        }
        this.f8197i.skip(4L);
        return c2;
    }

    private String ltg8(kja0 kja0Var) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jD3 = this.f8196h.d3(kja0Var);
            if (jD3 == -1) {
                throw a98o("Unterminated string");
            }
            if (this.f8197i.g1(jD3) != 92) {
                if (sb == null) {
                    String strMo27610d = this.f8197i.mo27610d(jD3);
                    this.f8197i.readByte();
                    return strMo27610d;
                }
                sb.append(this.f8197i.mo27610d(jD3));
                this.f8197i.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f8197i.mo27610d(jD3));
            this.f8197i.readByte();
            sb.append(ij());
        }
    }

    private boolean ngy() throws IOException {
        n7h n7hVar = this.f8196h;
        kja0 kja0Var = f8190m;
        long jJk = n7hVar.jk(kja0Var);
        boolean z2 = jJk != -1;
        x2 x2Var = this.f8197i;
        x2Var.skip(z2 ? jJk + ((long) kja0Var.size()) : x2Var.size());
        return z2;
    }

    private int nmn5() throws IOException {
        int[] iArr = this.f8211q;
        int i2 = this.f8209k;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iWas = was(true);
            this.f8197i.readByte();
            if (iWas != 44) {
                if (iWas != 59) {
                    if (iWas != 93) {
                        throw a98o("Unterminated array");
                    }
                    this.f8201z = 4;
                    return 4;
                }
                m6169x();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5) {
                    int iWas2 = was(true);
                    this.f8197i.readByte();
                    if (iWas2 != 44) {
                        if (iWas2 != 59) {
                            if (iWas2 != 125) {
                                throw a98o("Unterminated object");
                            }
                            this.f8201z = 2;
                            return 2;
                        }
                        m6169x();
                    }
                }
                int iWas3 = was(true);
                if (iWas3 == 34) {
                    this.f8197i.readByte();
                    this.f8201z = 13;
                    return 13;
                }
                if (iWas3 == 39) {
                    this.f8197i.readByte();
                    m6169x();
                    this.f8201z = 12;
                    return 12;
                }
                if (iWas3 != 125) {
                    m6169x();
                    if (!g1((char) iWas3)) {
                        throw a98o("Expected name");
                    }
                    this.f8201z = 14;
                    return 14;
                }
                if (i3 == 5) {
                    throw a98o("Expected name");
                }
                this.f8197i.readByte();
                this.f8201z = 2;
                return 2;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iWas4 = was(true);
                this.f8197i.readByte();
                if (iWas4 != 58) {
                    if (iWas4 != 61) {
                        throw a98o("Expected ':'");
                    }
                    m6169x();
                    if (this.f8196h.bf2(1L) && this.f8197i.g1(0L) == 62) {
                        this.f8197i.readByte();
                    }
                }
            } else if (i3 == 6) {
                iArr[i2 - 1] = 7;
            } else if (i3 == 7) {
                if (was(false) == -1) {
                    this.f8201z = 18;
                    return 18;
                }
                m6169x();
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iWas5 = was(true);
        if (iWas5 == 34) {
            this.f8197i.readByte();
            this.f8201z = 9;
            return 9;
        }
        if (iWas5 == 39) {
            m6169x();
            this.f8197i.readByte();
            this.f8201z = 8;
            return 8;
        }
        if (iWas5 != 44 && iWas5 != 59) {
            if (iWas5 == 91) {
                this.f8197i.readByte();
                this.f8201z = 3;
                return 3;
            }
            if (iWas5 != 93) {
                if (iWas5 == 123) {
                    this.f8197i.readByte();
                    this.f8201z = 1;
                    return 1;
                }
                int iBek6 = bek6();
                if (iBek6 != 0) {
                    return iBek6;
                }
                int iH7am = h7am();
                if (iH7am != 0) {
                    return iH7am;
                }
                if (!g1(this.f8197i.g1(0L))) {
                    throw a98o("Expected value");
                }
                m6169x();
                this.f8201z = 10;
                return 10;
            }
            if (i3 == 1) {
                this.f8197i.readByte();
                this.f8201z = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw a98o("Unexpected value");
        }
        m6169x();
        this.f8201z = 7;
        return 7;
    }

    private void nsb(kja0 kja0Var) throws IOException {
        while (true) {
            long jD3 = this.f8196h.d3(kja0Var);
            if (jD3 == -1) {
                throw a98o("Unterminated string");
            }
            if (this.f8197i.g1(jD3) != 92) {
                this.f8197i.skip(jD3 + 1);
                return;
            } else {
                this.f8197i.skip(jD3 + 1);
                ij();
            }
        }
    }

    private int t8iq(String str, zy.C1492k c1492k) {
        int length = c1492k.f8214k.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(c1492k.f8214k[i2])) {
                this.f8201z = 0;
                this.f8210n[this.f8209k - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f8197i.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r6.f8196h.bf2(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        m6169x();
        r3 = r6.f8197i.g1(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r6.f8197i.readByte();
        r6.f8197i.readByte();
        bap7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r6.f8197i.readByte();
        r6.f8197i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (ngy() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        throw a98o("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r1 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        m6169x();
        bap7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int was(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            okio.n7h r2 = r6.f8196h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.bf2(r4)
            if (r2 == 0) goto L82
            okio.x2 r2 = r6.f8197i
            long r4 = (long) r1
            byte r1 = r2.g1(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            okio.x2 r2 = r6.f8197i
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            okio.n7h r3 = r6.f8196h
            r4 = 2
            boolean r3 = r3.bf2(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.m6169x()
            okio.x2 r3 = r6.f8197i
            r4 = 1
            byte r3 = r3.g1(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            okio.x2 r1 = r6.f8197i
            r1.readByte()
            okio.x2 r1 = r6.f8197i
            r1.readByte()
            r6.bap7()
            goto L1
        L5c:
            okio.x2 r1 = r6.f8197i
            r1.readByte()
            okio.x2 r1 = r6.f8197i
            r1.readByte()
            boolean r1 = r6.ngy()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.toq r7 = r6.a98o(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.m6169x()
            r6.bap7()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C1490n.was(boolean):int");
    }

    /* JADX INFO: renamed from: x */
    private void m6169x() throws IOException {
        if (!this.f8213y) {
            throw a98o("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8201z = 0;
        this.f8211q[0] = 8;
        this.f8209k = 1;
        this.f8197i.m27873y();
        this.f8196h.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public zy.toq d2ok() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        switch (iNmn5) {
            case 1:
                return zy.toq.BEGIN_OBJECT;
            case 2:
                return zy.toq.END_OBJECT;
            case 3:
                return zy.toq.BEGIN_ARRAY;
            case 4:
                return zy.toq.END_ARRAY;
            case 5:
            case 6:
                return zy.toq.BOOLEAN;
            case 7:
                return zy.toq.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return zy.toq.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return zy.toq.NAME;
            case 16:
            case 17:
                return zy.toq.NUMBER;
            case 18:
                return zy.toq.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    /* JADX INFO: renamed from: f */
    public int mo6170f(zy.C1492k c1492k) throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 < 12 || iNmn5 > 15) {
            return -1;
        }
        if (iNmn5 == 15) {
            return t8iq(this.f8198l, c1492k);
        }
        int iLh = this.f8196h.lh(c1492k.f56171toq);
        if (iLh != -1) {
            this.f8201z = 0;
            this.f8210n[this.f8209k - 1] = c1492k.f8214k[iLh];
            return iLh;
        }
        String str = this.f8210n[this.f8209k - 1];
        String strFu4 = fu4();
        int iT8iq = t8iq(strFu4, c1492k);
        if (iT8iq == -1) {
            this.f8201z = 15;
            this.f8198l = strFu4;
            this.f8210n[this.f8209k - 1] = str;
        }
        return iT8iq;
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public String fu4() throws IOException {
        String strLtg8;
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 == 14) {
            strLtg8 = bwp();
        } else if (iNmn5 == 13) {
            strLtg8 = ltg8(f8187e);
        } else if (iNmn5 == 12) {
            strLtg8 = ltg8(f8185c);
        } else {
            if (iNmn5 != 15) {
                throw new C1489k("Expected a name but was " + d2ok() + " at path " + getPath());
            }
            strLtg8 = this.f8198l;
        }
        this.f8201z = 0;
        this.f8210n[this.f8209k - 1] = strLtg8;
        return strLtg8;
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    /* JADX INFO: renamed from: h */
    public double mo6171h() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 == 16) {
            this.f8201z = 0;
            int[] iArr = this.f8208g;
            int i2 = this.f8209k - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f8200t;
        }
        if (iNmn5 == 17) {
            this.f8198l = this.f8197i.mo27610d(this.f8199r);
        } else if (iNmn5 == 9) {
            this.f8198l = ltg8(f8187e);
        } else if (iNmn5 == 8) {
            this.f8198l = ltg8(f8185c);
        } else if (iNmn5 == 10) {
            this.f8198l = bwp();
        } else if (iNmn5 != 11) {
            throw new C1489k("Expected a double but was " + d2ok() + " at path " + getPath());
        }
        this.f8201z = 11;
        try {
            double d2 = Double.parseDouble(this.f8198l);
            if (this.f8213y || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
                this.f8198l = null;
                this.f8201z = 0;
                int[] iArr2 = this.f8208g;
                int i3 = this.f8209k - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return d2;
            }
            throw new toq("JSON forbids NaN and infinities: " + d2 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new C1489k("Expected a double but was " + this.f8198l + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public int ki() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 == 16) {
            long j2 = this.f8200t;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f8201z = 0;
                int[] iArr = this.f8208g;
                int i3 = this.f8209k - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C1489k("Expected an int but was " + this.f8200t + " at path " + getPath());
        }
        if (iNmn5 == 17) {
            this.f8198l = this.f8197i.mo27610d(this.f8199r);
        } else if (iNmn5 == 9 || iNmn5 == 8) {
            String strLtg8 = iNmn5 == 9 ? ltg8(f8187e) : ltg8(f8185c);
            this.f8198l = strLtg8;
            try {
                int i4 = Integer.parseInt(strLtg8);
                this.f8201z = 0;
                int[] iArr2 = this.f8208g;
                int i5 = this.f8209k - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        } else if (iNmn5 != 11) {
            throw new C1489k("Expected an int but was " + d2ok() + " at path " + getPath());
        }
        this.f8201z = 11;
        try {
            double d2 = Double.parseDouble(this.f8198l);
            int i6 = (int) d2;
            if (i6 == d2) {
                this.f8198l = null;
                this.f8201z = 0;
                int[] iArr3 = this.f8208g;
                int i7 = this.f8209k - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new C1489k("Expected an int but was " + this.f8198l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C1489k("Expected an int but was " + this.f8198l + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public boolean ld6() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        return (iNmn5 == 2 || iNmn5 == 4 || iNmn5 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    /* JADX INFO: renamed from: p */
    public void mo6172p() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 != 2) {
            throw new C1489k("Expected END_OBJECT but was " + d2ok() + " at path " + getPath());
        }
        int i2 = this.f8209k - 1;
        this.f8209k = i2;
        this.f8210n[i2] = null;
        int[] iArr = this.f8208g;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f8201z = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    /* JADX INFO: renamed from: q */
    public void mo6173q() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 == 1) {
            hyr(3);
            this.f8201z = 0;
            return;
        }
        throw new C1489k("Expected BEGIN_OBJECT but was " + d2ok() + " at path " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.f8196h + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public String wvg() throws IOException {
        String strMo27610d;
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 == 10) {
            strMo27610d = bwp();
        } else if (iNmn5 == 9) {
            strMo27610d = ltg8(f8187e);
        } else if (iNmn5 == 8) {
            strMo27610d = ltg8(f8185c);
        } else if (iNmn5 == 11) {
            strMo27610d = this.f8198l;
            this.f8198l = null;
        } else if (iNmn5 == 16) {
            strMo27610d = Long.toString(this.f8200t);
        } else {
            if (iNmn5 != 17) {
                throw new C1489k("Expected a string but was " + d2ok() + " at path " + getPath());
            }
            strMo27610d = this.f8197i.mo27610d(this.f8199r);
        }
        this.f8201z = 0;
        int[] iArr = this.f8208g;
        int i2 = this.f8209k - 1;
        iArr[i2] = iArr[i2] + 1;
        return strMo27610d;
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public boolean x2() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 == 5) {
            this.f8201z = 0;
            int[] iArr = this.f8208g;
            int i2 = this.f8209k - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iNmn5 == 6) {
            this.f8201z = 0;
            int[] iArr2 = this.f8208g;
            int i3 = this.f8209k - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new C1489k("Expected a boolean but was " + d2ok() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    /* JADX INFO: renamed from: y */
    public void mo6174y() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 != 4) {
            throw new C1489k("Expected END_ARRAY but was " + d2ok() + " at path " + getPath());
        }
        int i2 = this.f8209k - 1;
        this.f8209k = i2;
        int[] iArr = this.f8208g;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f8201z = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public void y9n() throws IOException {
        if (this.f8212s) {
            throw new C1489k("Cannot skip unexpected " + d2ok() + " at " + getPath());
        }
        int i2 = 0;
        do {
            int iNmn5 = this.f8201z;
            if (iNmn5 == 0) {
                iNmn5 = nmn5();
            }
            if (iNmn5 == 3) {
                hyr(1);
            } else if (iNmn5 == 1) {
                hyr(3);
            } else {
                if (iNmn5 == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new C1489k("Expected a value but was " + d2ok() + " at path " + getPath());
                    }
                    this.f8209k--;
                } else if (iNmn5 == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new C1489k("Expected a value but was " + d2ok() + " at path " + getPath());
                    }
                    this.f8209k--;
                } else if (iNmn5 == 14 || iNmn5 == 10) {
                    h4b();
                } else if (iNmn5 == 9 || iNmn5 == 13) {
                    nsb(f8187e);
                } else if (iNmn5 == 8 || iNmn5 == 12) {
                    nsb(f8185c);
                } else if (iNmn5 == 17) {
                    this.f8197i.skip(this.f8199r);
                } else if (iNmn5 == 18) {
                    throw new C1489k("Expected a value but was " + d2ok() + " at path " + getPath());
                }
                this.f8201z = 0;
            }
            i2++;
            this.f8201z = 0;
        } while (i2 != 0);
        int[] iArr = this.f8208g;
        int i3 = this.f8209k;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f8210n[i3 - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public void yz() throws IOException {
        if (this.f8212s) {
            throw new C1489k("Cannot skip unexpected " + d2ok() + " at " + getPath());
        }
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 == 14) {
            h4b();
        } else if (iNmn5 == 13) {
            nsb(f8187e);
        } else if (iNmn5 == 12) {
            nsb(f8185c);
        } else if (iNmn5 != 15) {
            throw new C1489k("Expected a name but was " + d2ok() + " at path " + getPath());
        }
        this.f8201z = 0;
        this.f8210n[this.f8209k - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.zy
    public void zy() throws IOException {
        int iNmn5 = this.f8201z;
        if (iNmn5 == 0) {
            iNmn5 = nmn5();
        }
        if (iNmn5 == 3) {
            hyr(1);
            this.f8208g[this.f8209k - 1] = 0;
            this.f8201z = 0;
        } else {
            throw new C1489k("Expected BEGIN_ARRAY but was " + d2ok() + " at path " + getPath());
        }
    }
}
