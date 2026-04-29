package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3856t;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h implements qrj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64576cdj = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f64577fn3e = 178;

    /* JADX INFO: renamed from: i */
    private static final int f20331i = 184;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64578ki = 179;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64579t8r = 181;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final double[] f64580zurt = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final C3416k f64581f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean[] f20332g;

    /* JADX INFO: renamed from: h */
    private boolean f20333h;

    /* JADX INFO: renamed from: k */
    private String f20334k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f64582kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64583ld6;

    /* JADX INFO: renamed from: n */
    @dd
    private final fn3e f20335n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private long f64584n7h;

    /* JADX INFO: renamed from: p */
    private boolean f20336p;

    /* JADX INFO: renamed from: q */
    @dd
    private final com.google.android.exoplayer2.util.gvn7 f20337q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f64585qrj;

    /* JADX INFO: renamed from: s */
    private boolean f20338s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC3401t f64586toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f64587x2;

    /* JADX INFO: renamed from: y */
    private long f20339y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private final eqxt f64588zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.n7h$k */
    /* JADX INFO: compiled from: H262Reader.java */
    private static final class C3416k {

        /* JADX INFO: renamed from: n */
        private static final byte[] f20340n = {0, 0, 1};

        /* JADX INFO: renamed from: k */
        private boolean f20341k;

        /* JADX INFO: renamed from: q */
        public byte[] f20342q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f64589toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f64590zy;

        public C3416k(int i2) {
            this.f20342q = new byte[i2];
        }

        /* JADX INFO: renamed from: k */
        public void m12001k(byte[] bArr, int i2, int i3) {
            if (this.f20341k) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f20342q;
                int length = bArr2.length;
                int i5 = this.f64589toq;
                if (length < i5 + i4) {
                    this.f20342q = Arrays.copyOf(bArr2, (i5 + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f20342q, this.f64589toq, i4);
                this.f64589toq += i4;
            }
        }

        public boolean toq(int i2, int i3) {
            if (this.f20341k) {
                int i4 = this.f64589toq - i3;
                this.f64589toq = i4;
                if (this.f64590zy != 0 || i2 != n7h.f64579t8r) {
                    this.f20341k = false;
                    return true;
                }
                this.f64590zy = i4;
            } else if (i2 == n7h.f64578ki) {
                this.f20341k = true;
            }
            byte[] bArr = f20340n;
            m12001k(bArr, 0, bArr.length);
            return false;
        }

        public void zy() {
            this.f20341k = false;
            this.f64589toq = 0;
            this.f64590zy = 0;
        }
    }

    public n7h() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<com.google.android.exoplayer2.xwq3, java.lang.Long> m12000k(com.google.android.exoplayer2.extractor.ts.n7h.C3416k r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f20342q
            int r1 = r8.f64589toq
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            com.google.android.exoplayer2.xwq3$toq r6 = new com.google.android.exoplayer2.xwq3$toq
            r6.<init>()
            com.google.android.exoplayer2.xwq3$toq r9 = r6.n5r1(r9)
            java.lang.String r6 = "video/mpeg2"
            com.google.android.exoplayer2.xwq3$toq r9 = r9.m13945m(r6)
            com.google.android.exoplayer2.xwq3$toq r9 = r9.bf2(r2)
            com.google.android.exoplayer2.xwq3$toq r9 = r9.ncyb(r4)
            com.google.android.exoplayer2.xwq3$toq r9 = r9.nn86(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.google.android.exoplayer2.xwq3$toq r9 = r9.hyr(r1)
            com.google.android.exoplayer2.xwq3 r9 = r9.a9()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L99
            double[] r5 = com.google.android.exoplayer2.extractor.ts.n7h.f64580zurt
            int r6 = r5.length
            if (r4 >= r6) goto L99
            r1 = r5[r4]
            int r8 = r8.f64590zy
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L92
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L92:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L99:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.n7h.m12000k(com.google.android.exoplayer2.extractor.ts.n7h$k, java.lang.String):android.util.Pair");
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: g */
    public void mo11943g(long j2, int i2) {
        this.f64587x2 = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: n */
    public void mo11944n() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /* JADX INFO: renamed from: q */
    public void mo11945q(com.google.android.exoplayer2.extractor.x2 x2Var, d3.C3406n c3406n) {
        c3406n.m11952k();
        this.f20334k = c3406n.toq();
        this.f64586toq = x2Var.toq(c3406n.zy(), 2);
        eqxt eqxtVar = this.f64588zy;
        if (eqxtVar != null) {
            eqxtVar.toq(x2Var, c3406n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
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
    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void toq(com.google.android.exoplayer2.util.gvn7 r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.n7h.toq(com.google.android.exoplayer2.util.gvn7):void");
    }

    @Override // com.google.android.exoplayer2.extractor.ts.qrj
    public void zy() {
        C3856t.m13727k(this.f20332g);
        this.f64581f7l8.zy();
        fn3e fn3eVar = this.f20335n;
        if (fn3eVar != null) {
            fn3eVar.m11957q();
        }
        this.f20339y = 0L;
        this.f20338s = false;
        this.f64587x2 = C3548p.f65257toq;
        this.f64584n7h = C3548p.f65257toq;
    }

    n7h(@dd eqxt eqxtVar) {
        this.f64588zy = eqxtVar;
        this.f20332g = new boolean[4];
        this.f64581f7l8 = new C3416k(128);
        if (eqxtVar != null) {
            this.f20335n = new fn3e(f64577fn3e, 128);
            this.f20337q = new com.google.android.exoplayer2.util.gvn7();
        } else {
            this.f20335n = null;
            this.f20337q = null;
        }
        this.f64587x2 = C3548p.f65257toq;
        this.f64584n7h = C3548p.f65257toq;
    }
}
