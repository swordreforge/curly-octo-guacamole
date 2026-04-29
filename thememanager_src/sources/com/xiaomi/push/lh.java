package com.xiaomi.push;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class lh {

    public static final class f7l8 extends bz2 {

        /* JADX INFO: renamed from: k */
        private boolean f33304k;

        /* JADX INFO: renamed from: n */
        private boolean f33305n;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73409zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f73408toq = "";

        /* JADX INFO: renamed from: q */
        private String f33306q = "";

        /* JADX INFO: renamed from: g */
        private String f33303g = "";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f73407f7l8 = -1;

        public static f7l8 x2(byte[] bArr) {
            return (f7l8) new f7l8().zy(bArr);
        }

        public boolean cdj() {
            return this.f73409zy;
        }

        /* JADX INFO: renamed from: h */
        public String m21156h() {
            return this.f33306q;
        }

        /* JADX INFO: renamed from: i */
        public boolean m21157i() {
            return this.f33305n;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f73407f7l8 < 0) {
                mo20673s();
            }
            return this.f73407f7l8;
        }

        public f7l8 ki(String str) {
            this.f33305n = true;
            this.f33303g = str;
            return this;
        }

        public f7l8 kja0(String str) {
            this.f73409zy = true;
            this.f33306q = str;
            return this;
        }

        public f7l8 ld6(String str) {
            this.f33304k = true;
            this.f73408toq = str;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (n7h()) {
                c5882m.fu4(1, qrj());
            }
            if (cdj()) {
                c5882m.fu4(2, m21156h());
            }
            if (m21157i()) {
                c5882m.fu4(3, t8r());
            }
        }

        public boolean n7h() {
            return this.f33304k;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public f7l8 toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 10) {
                    ld6(jkVar.m21060y());
                } else if (qVar == 18) {
                    kja0(jkVar.m21060y());
                } else if (qVar == 26) {
                    ki(jkVar.m21060y());
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        public String qrj() {
            return this.f73408toq;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iF7l8 = n7h() ? 0 + C5882m.f7l8(1, qrj()) : 0;
            if (cdj()) {
                iF7l8 += C5882m.f7l8(2, m21156h());
            }
            if (m21157i()) {
                iF7l8 += C5882m.f7l8(3, t8r());
            }
            this.f73407f7l8 = iF7l8;
            return iF7l8;
        }

        public String t8r() {
            return this.f33303g;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.lh$g */
    public static final class C5875g extends bz2 {

        /* JADX INFO: renamed from: k */
        private boolean f33308k;

        /* JADX INFO: renamed from: n */
        private boolean f33309n;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73412zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f73411toq = "";

        /* JADX INFO: renamed from: q */
        private String f33310q = "";

        /* JADX INFO: renamed from: g */
        private toq f33307g = null;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f73410f7l8 = -1;

        public static C5875g n7h(byte[] bArr) {
            return (C5875g) new C5875g().zy(bArr);
        }

        public C5875g cdj(String str) {
            this.f73412zy = true;
            this.f33310q = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public boolean m21159h() {
            return this.f33308k;
        }

        /* JADX INFO: renamed from: i */
        public boolean m21160i() {
            return this.f33309n;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f73410f7l8 < 0) {
                mo20673s();
            }
            return this.f73410f7l8;
        }

        public String ki() {
            return this.f33310q;
        }

        public String kja0() {
            return this.f73411toq;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public C5875g toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 10) {
                    qrj(jkVar.m21060y());
                } else if (qVar == 18) {
                    cdj(jkVar.m21060y());
                } else if (qVar == 26) {
                    toq toqVar = new toq();
                    jkVar.ld6(toqVar);
                    x2(toqVar);
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (m21159h()) {
                c5882m.fu4(1, kja0());
            }
            if (t8r()) {
                c5882m.fu4(2, ki());
            }
            if (m21160i()) {
                c5882m.ni7(3, m21161p());
            }
        }

        /* JADX INFO: renamed from: p */
        public toq m21161p() {
            return this.f33307g;
        }

        public C5875g qrj(String str) {
            this.f33308k = true;
            this.f73411toq = str;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iF7l8 = m21159h() ? 0 + C5882m.f7l8(1, kja0()) : 0;
            if (t8r()) {
                iF7l8 += C5882m.f7l8(2, ki());
            }
            if (m21160i()) {
                iF7l8 += C5882m.m21220g(3, m21161p());
            }
            this.f73410f7l8 = iF7l8;
            return iF7l8;
        }

        public boolean t8r() {
            return this.f73412zy;
        }

        public C5875g x2(toq toqVar) {
            toqVar.getClass();
            this.f33309n = true;
            this.f33307g = toqVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.lh$k */
    public static final class C5876k extends bz2 {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private boolean f73413cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f73414f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private boolean f73415fn3e;

        /* JADX INFO: renamed from: k */
        private boolean f33314k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private boolean f73418kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f73419ld6;

        /* JADX INFO: renamed from: n */
        private boolean f33315n;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private boolean f73421ni7;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private boolean f73423qrj;

        /* JADX INFO: renamed from: s */
        private boolean f33318s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private boolean f73424t8r;

        /* JADX INFO: renamed from: z */
        private boolean f33320z;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73429zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f73425toq = 0;

        /* JADX INFO: renamed from: q */
        private long f33317q = 0;

        /* JADX INFO: renamed from: g */
        private String f33311g = "";

        /* JADX INFO: renamed from: y */
        private String f33319y = "";

        /* JADX INFO: renamed from: p */
        private String f33316p = "";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private String f73427x2 = "";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private String f73420n7h = "";

        /* JADX INFO: renamed from: h */
        private int f33312h = 1;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private int f73417ki = 0;

        /* JADX INFO: renamed from: i */
        private int f33313i = 0;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private String f73428zurt = "";

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private long f73416fu4 = 0;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private long f73422o1t = 0;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private int f73426wvg = -1;

        public int a9() {
            return this.f33312h;
        }

        /* JADX INFO: renamed from: c */
        public boolean m21162c() {
            return this.f73415fn3e;
        }

        public boolean cdj() {
            return this.f33314k;
        }

        public String d2ok() {
            return this.f73420n7h;
        }

        public boolean d3() {
            return this.f73414f7l8;
        }

        public C5876k dd(String str) {
            this.f73415fn3e = true;
            this.f73428zurt = str;
            return this;
        }

        public C5876k eqxt(String str) {
            this.f73423qrj = true;
            this.f73420n7h = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public boolean m21163f() {
            return this.f73424t8r;
        }

        public C5876k fn3e(String str) {
            this.f73414f7l8 = true;
            this.f33319y = str;
            return this;
        }

        public C5876k fti(int i2) {
            this.f73424t8r = true;
            this.f33313i = i2;
            return this;
        }

        public int fu4() {
            return this.f73425toq;
        }

        public String gvn7() {
            return this.f73427x2;
        }

        /* JADX INFO: renamed from: h */
        public String m21164h() {
            return this.f33311g;
        }

        public boolean hyr() {
            return this.f73413cdj;
        }

        /* JADX INFO: renamed from: i */
        public C5876k m21165i(long j2) {
            this.f73421ni7 = true;
            this.f73416fu4 = j2;
            return this;
        }

        public boolean jk() {
            return this.f33315n;
        }

        public C5876k jp0y(String str) {
            this.f73419ld6 = true;
            this.f73427x2 = str;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f73426wvg < 0) {
                mo20673s();
            }
            return this.f73426wvg;
        }

        public long ki() {
            return this.f73416fu4;
        }

        public C5876k kja0(String str) {
            this.f33315n = true;
            this.f33311g = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public boolean m21166l() {
            return this.f73423qrj;
        }

        public C5876k ld6() {
            this.f73419ld6 = false;
            this.f73427x2 = "";
            return this;
        }

        public boolean lrht() {
            return this.f73421ni7;
        }

        public boolean lvui() {
            return this.f33318s;
        }

        public String mcp() {
            return this.f33316p;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (cdj()) {
                c5882m.m21229i(1, fu4());
            }
            if (ni7()) {
                c5882m.m21231r(2, m21167p());
            }
            if (jk()) {
                c5882m.fu4(3, m21164h());
            }
            if (d3()) {
                c5882m.fu4(4, zurt());
            }
            if (lvui()) {
                c5882m.fu4(5, mcp());
            }
            if (ncyb()) {
                c5882m.fu4(6, gvn7());
            }
            if (m21166l()) {
                c5882m.fu4(7, d2ok());
            }
            if (n5r1()) {
                c5882m.m21229i(8, a9());
            }
            if (hyr()) {
                c5882m.m21229i(9, oc());
            }
            if (m21163f()) {
                c5882m.m21229i(10, m21168r());
            }
            if (m21162c()) {
                c5882m.fu4(11, x9kr());
            }
            if (lrht()) {
                c5882m.m21231r(12, ki());
            }
            if (uv6()) {
                c5882m.m21231r(13, m21170z());
            }
        }

        public boolean n5r1() {
            return this.f73418kja0;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public C5876k toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                switch (qVar) {
                    case 0:
                        return this;
                    case 8:
                        x2(jkVar.m21053h());
                        break;
                    case 16:
                        qrj(jkVar.cdj());
                        break;
                    case 26:
                        kja0(jkVar.m21060y());
                        break;
                    case 34:
                        fn3e(jkVar.m21060y());
                        break;
                    case 42:
                        m21169t(jkVar.m21060y());
                        break;
                    case 50:
                        jp0y(jkVar.m21060y());
                        break;
                    case 58:
                        eqxt(jkVar.m21060y());
                        break;
                    case 64:
                        t8r(jkVar.m21053h());
                        break;
                    case 72:
                        o1t(jkVar.m21053h());
                        break;
                    case 80:
                        fti(jkVar.m21053h());
                        break;
                    case 90:
                        dd(jkVar.m21060y());
                        break;
                    case 96:
                        m21165i(jkVar.cdj());
                        break;
                    case 104:
                        wvg(jkVar.cdj());
                        break;
                    default:
                        if (!f7l8(jkVar, qVar)) {
                            return this;
                        }
                        break;
                        break;
                }
            }
        }

        public boolean ncyb() {
            return this.f73419ld6;
        }

        public boolean ni7() {
            return this.f73429zy;
        }

        public C5876k o1t(int i2) {
            this.f73413cdj = true;
            this.f73417ki = i2;
            return this;
        }

        public int oc() {
            return this.f73417ki;
        }

        /* JADX INFO: renamed from: p */
        public long m21167p() {
            return this.f33317q;
        }

        public C5876k qrj(long j2) {
            this.f73429zy = true;
            this.f33317q = j2;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public int m21168r() {
            return this.f33313i;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iZy = cdj() ? 0 + C5882m.zy(1, fu4()) : 0;
            if (ni7()) {
                iZy += C5882m.d3(2, m21167p());
            }
            if (jk()) {
                iZy += C5882m.f7l8(3, m21164h());
            }
            if (d3()) {
                iZy += C5882m.f7l8(4, zurt());
            }
            if (lvui()) {
                iZy += C5882m.f7l8(5, mcp());
            }
            if (ncyb()) {
                iZy += C5882m.f7l8(6, gvn7());
            }
            if (m21166l()) {
                iZy += C5882m.f7l8(7, d2ok());
            }
            if (n5r1()) {
                iZy += C5882m.zy(8, a9());
            }
            if (hyr()) {
                iZy += C5882m.zy(9, oc());
            }
            if (m21163f()) {
                iZy += C5882m.zy(10, m21168r());
            }
            if (m21162c()) {
                iZy += C5882m.f7l8(11, x9kr());
            }
            if (lrht()) {
                iZy += C5882m.d3(12, ki());
            }
            if (uv6()) {
                iZy += C5882m.d3(13, m21170z());
            }
            this.f73426wvg = iZy;
            return iZy;
        }

        /* JADX INFO: renamed from: t */
        public C5876k m21169t(String str) {
            this.f33318s = true;
            this.f33316p = str;
            return this;
        }

        public C5876k t8r(int i2) {
            this.f73418kja0 = true;
            this.f33312h = i2;
            return this;
        }

        public boolean uv6() {
            return this.f33320z;
        }

        public C5876k wvg(long j2) {
            this.f33320z = true;
            this.f73422o1t = j2;
            return this;
        }

        public C5876k x2(int i2) {
            this.f33314k = true;
            this.f73425toq = i2;
            return this;
        }

        public String x9kr() {
            return this.f73428zurt;
        }

        /* JADX INFO: renamed from: z */
        public long m21170z() {
            return this.f73422o1t;
        }

        public String zurt() {
            return this.f33319y;
        }
    }

    public static final class ld6 extends bz2 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f73430f7l8;

        /* JADX INFO: renamed from: k */
        private boolean f33322k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f73431ld6;

        /* JADX INFO: renamed from: n */
        private boolean f33323n;

        /* JADX INFO: renamed from: s */
        private boolean f33326s;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73435zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f73433toq = "";

        /* JADX INFO: renamed from: q */
        private String f33325q = "";

        /* JADX INFO: renamed from: g */
        private long f33321g = 0;

        /* JADX INFO: renamed from: y */
        private long f33327y = 0;

        /* JADX INFO: renamed from: p */
        private boolean f33324p = false;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private int f73434x2 = 0;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private int f73432qrj = -1;

        /* JADX INFO: renamed from: h */
        public static ld6 m21171h(byte[] bArr) {
            return (ld6) new ld6().zy(bArr);
        }

        public String cdj() {
            return this.f73433toq;
        }

        public ld6 fn3e(String str) {
            this.f73435zy = true;
            this.f33325q = str;
            return this;
        }

        public int fu4() {
            return this.f73434x2;
        }

        /* JADX INFO: renamed from: i */
        public ld6 m21172i(long j2) {
            this.f73430f7l8 = true;
            this.f33327y = j2;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f73432qrj < 0) {
                mo20673s();
            }
            return this.f73432qrj;
        }

        public boolean ki() {
            return this.f33322k;
        }

        public ld6 kja0(boolean z2) {
            this.f33326s = true;
            this.f33324p = z2;
            return this;
        }

        public ld6 ld6(int i2) {
            this.f73431ld6 = true;
            this.f73434x2 = i2;
            return this;
        }

        public boolean mcp() {
            return this.f73431ld6;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (ki()) {
                c5882m.fu4(1, cdj());
            }
            if (ni7()) {
                c5882m.fu4(2, zurt());
            }
            if (m21175z()) {
                c5882m.fn3e(3, m21173p());
            }
            if (o1t()) {
                c5882m.fn3e(4, t8r());
            }
            if (m21174t()) {
                c5882m.m21233z(5, wvg());
            }
            if (mcp()) {
                c5882m.m21229i(6, fu4());
            }
        }

        public ld6 n7h(String str) {
            this.f33322k = true;
            this.f73433toq = str;
            return this;
        }

        public boolean ni7() {
            return this.f73435zy;
        }

        public boolean o1t() {
            return this.f73430f7l8;
        }

        /* JADX INFO: renamed from: p */
        public long m21173p() {
            return this.f33321g;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public ld6 toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 10) {
                    n7h(jkVar.m21060y());
                } else if (qVar == 18) {
                    fn3e(jkVar.m21060y());
                } else if (qVar == 24) {
                    x2(jkVar.m21058q());
                } else if (qVar == 32) {
                    m21172i(jkVar.m21058q());
                } else if (qVar == 40) {
                    kja0(jkVar.x2());
                } else if (qVar == 48) {
                    ld6(jkVar.m21053h());
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iF7l8 = ki() ? 0 + C5882m.f7l8(1, cdj()) : 0;
            if (ni7()) {
                iF7l8 += C5882m.f7l8(2, zurt());
            }
            if (m21175z()) {
                iF7l8 += C5882m.m21225q(3, m21173p());
            }
            if (o1t()) {
                iF7l8 += C5882m.m21225q(4, t8r());
            }
            if (m21174t()) {
                iF7l8 += C5882m.m21227y(5, wvg());
            }
            if (mcp()) {
                iF7l8 += C5882m.zy(6, fu4());
            }
            this.f73432qrj = iF7l8;
            return iF7l8;
        }

        /* JADX INFO: renamed from: t */
        public boolean m21174t() {
            return this.f33326s;
        }

        public long t8r() {
            return this.f33327y;
        }

        public boolean wvg() {
            return this.f33324p;
        }

        public ld6 x2(long j2) {
            this.f33323n = true;
            this.f33321g = j2;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public boolean m21175z() {
            return this.f33323n;
        }

        public String zurt() {
            return this.f33325q;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.lh$n */
    public static final class C5877n extends bz2 {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private boolean f73436cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f73437f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private boolean f73438fn3e;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private com.xiaomi.push.zy f73439fu4;

        /* JADX INFO: renamed from: k */
        private boolean f33331k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private boolean f73441kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f73442ld6;

        /* JADX INFO: renamed from: n */
        private boolean f33332n;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private boolean f73444ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private int f73445o1t;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private boolean f73446qrj;

        /* JADX INFO: renamed from: s */
        private boolean f33335s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private boolean f73447t8r;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private int f73449wvg;

        /* JADX INFO: renamed from: z */
        private boolean f33337z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private com.xiaomi.push.zy f73451zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73452zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f73448toq = 0;

        /* JADX INFO: renamed from: q */
        private String f33334q = "";

        /* JADX INFO: renamed from: g */
        private String f33328g = "";

        /* JADX INFO: renamed from: y */
        private String f33336y = "";

        /* JADX INFO: renamed from: p */
        private int f33333p = 0;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private String f73450x2 = "";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private String f73443n7h = "";

        /* JADX INFO: renamed from: h */
        private String f33329h = "";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private toq f73440ki = null;

        /* JADX INFO: renamed from: i */
        private int f33330i = 0;

        public C5877n() {
            com.xiaomi.push.zy zyVar = com.xiaomi.push.zy.f73779zy;
            this.f73451zurt = zyVar;
            this.f73439fu4 = zyVar;
            this.f73445o1t = 0;
            this.f73449wvg = -1;
        }

        public C5877n a9(int i2) {
            this.f33337z = true;
            this.f73445o1t = i2;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public boolean m21176c() {
            return this.f73444ni7;
        }

        public String cdj() {
            return this.f33334q;
        }

        public boolean d2ok() {
            return this.f33335s;
        }

        public int d3() {
            return this.f33330i;
        }

        public String dd() {
            return this.f33329h;
        }

        public String eqxt() {
            return this.f73443n7h;
        }

        /* JADX INFO: renamed from: f */
        public boolean m21177f() {
            return this.f73438fn3e;
        }

        public C5877n fn3e(com.xiaomi.push.zy zyVar) {
            this.f73444ni7 = true;
            this.f73439fu4 = zyVar;
            return this;
        }

        public C5877n fti(String str) {
            this.f73442ld6 = true;
            this.f73450x2 = str;
            return this;
        }

        public boolean fu4() {
            return this.f73452zy;
        }

        public boolean gvn7() {
            return this.f73437f7l8;
        }

        /* JADX INFO: renamed from: h */
        public C5877n m21178h(String str) {
            this.f73452zy = true;
            this.f33334q = str;
            return this;
        }

        public boolean hyr() {
            return this.f73447t8r;
        }

        /* JADX INFO: renamed from: i */
        public C5877n m21179i(int i2) {
            this.f33335s = true;
            this.f33333p = i2;
            return this;
        }

        public int jk() {
            return this.f33333p;
        }

        public String jp0y() {
            return this.f73450x2;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f73449wvg < 0) {
                mo20673s();
            }
            return this.f73449wvg;
        }

        public boolean ki() {
            return this.f33331k;
        }

        public C5877n kja0(toq toqVar) {
            toqVar.getClass();
            this.f73436cdj = true;
            this.f73440ki = toqVar;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public boolean m21180l() {
            return this.f73441kja0;
        }

        public toq ld6() {
            return this.f73440ki;
        }

        public boolean lrht() {
            return this.f33337z;
        }

        public int lvui() {
            return this.f73445o1t;
        }

        public boolean mcp() {
            return this.f33332n;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (ki()) {
                c5882m.lvui(1, m21184z());
            }
            if (fu4()) {
                c5882m.fu4(2, cdj());
            }
            if (mcp()) {
                c5882m.fu4(3, ni7());
            }
            if (gvn7()) {
                c5882m.fu4(4, m21183t());
            }
            if (d2ok()) {
                c5882m.m21229i(5, jk());
            }
            if (x9kr()) {
                c5882m.fu4(6, jp0y());
            }
            if (ncyb()) {
                c5882m.fu4(7, eqxt());
            }
            if (m21180l()) {
                c5882m.fu4(8, dd());
            }
            if (n5r1()) {
                c5882m.ni7(9, ld6());
            }
            if (hyr()) {
                c5882m.m21229i(10, d3());
            }
            if (m21177f()) {
                c5882m.zurt(11, m21181p());
            }
            if (m21176c()) {
                c5882m.zurt(12, t8r());
            }
            if (lrht()) {
                c5882m.m21229i(13, lvui());
            }
        }

        public boolean n5r1() {
            return this.f73436cdj;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public C5877n toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                switch (qVar) {
                    case 0:
                        return this;
                    case 8:
                        x2(jkVar.fn3e());
                        break;
                    case 18:
                        m21178h(jkVar.m21060y());
                        break;
                    case 26:
                        zurt(jkVar.m21060y());
                        break;
                    case 34:
                        wvg(jkVar.m21060y());
                        break;
                    case 40:
                        m21179i(jkVar.m21053h());
                        break;
                    case 50:
                        fti(jkVar.m21060y());
                        break;
                    case 58:
                        oc(jkVar.m21060y());
                        break;
                    case 66:
                        m21182r(jkVar.m21060y());
                        break;
                    case 74:
                        toq toqVar = new toq();
                        jkVar.ld6(toqVar);
                        kja0(toqVar);
                        break;
                    case 80:
                        o1t(jkVar.m21053h());
                        break;
                    case 90:
                        qrj(jkVar.m21056n());
                        break;
                    case 98:
                        fn3e(jkVar.m21056n());
                        break;
                    case 104:
                        a9(jkVar.m21053h());
                        break;
                    default:
                        if (!f7l8(jkVar, qVar)) {
                            return this;
                        }
                        break;
                        break;
                }
            }
        }

        public boolean ncyb() {
            return this.f73446qrj;
        }

        public String ni7() {
            return this.f33328g;
        }

        public C5877n o1t(int i2) {
            this.f73447t8r = true;
            this.f33330i = i2;
            return this;
        }

        public C5877n oc(String str) {
            this.f73446qrj = true;
            this.f73443n7h = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public com.xiaomi.push.zy m21181p() {
            return this.f73451zurt;
        }

        public C5877n qrj(com.xiaomi.push.zy zyVar) {
            this.f73438fn3e = true;
            this.f73451zurt = zyVar;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C5877n m21182r(String str) {
            this.f73441kja0 = true;
            this.f33329h = str;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iGvn7 = ki() ? 0 + C5882m.gvn7(1, m21184z()) : 0;
            if (fu4()) {
                iGvn7 += C5882m.f7l8(2, cdj());
            }
            if (mcp()) {
                iGvn7 += C5882m.f7l8(3, ni7());
            }
            if (gvn7()) {
                iGvn7 += C5882m.f7l8(4, m21183t());
            }
            if (d2ok()) {
                iGvn7 += C5882m.zy(5, jk());
            }
            if (x9kr()) {
                iGvn7 += C5882m.f7l8(6, jp0y());
            }
            if (ncyb()) {
                iGvn7 += C5882m.f7l8(7, eqxt());
            }
            if (m21180l()) {
                iGvn7 += C5882m.f7l8(8, dd());
            }
            if (n5r1()) {
                iGvn7 += C5882m.m21220g(9, ld6());
            }
            if (hyr()) {
                iGvn7 += C5882m.zy(10, d3());
            }
            if (m21177f()) {
                iGvn7 += C5882m.m21223n(11, m21181p());
            }
            if (m21176c()) {
                iGvn7 += C5882m.m21223n(12, t8r());
            }
            if (lrht()) {
                iGvn7 += C5882m.zy(13, lvui());
            }
            this.f73449wvg = iGvn7;
            return iGvn7;
        }

        /* JADX INFO: renamed from: t */
        public String m21183t() {
            return this.f33336y;
        }

        public com.xiaomi.push.zy t8r() {
            return this.f73439fu4;
        }

        public C5877n wvg(String str) {
            this.f73437f7l8 = true;
            this.f33336y = str;
            return this;
        }

        public C5877n x2(int i2) {
            this.f33331k = true;
            this.f73448toq = i2;
            return this;
        }

        public boolean x9kr() {
            return this.f73442ld6;
        }

        /* JADX INFO: renamed from: z */
        public int m21184z() {
            return this.f73448toq;
        }

        public C5877n zurt(String str) {
            this.f33332n = true;
            this.f33328g = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.lh$p */
    public static final class C5878p extends bz2 {

        /* JADX INFO: renamed from: k */
        private boolean f33338k;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73454zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.xiaomi.push.zy f73453toq = com.xiaomi.push.zy.f73779zy;

        /* JADX INFO: renamed from: q */
        private toq f33340q = null;

        /* JADX INFO: renamed from: n */
        private int f33339n = -1;

        public static C5878p kja0(byte[] bArr) {
            return (C5878p) new C5878p().zy(bArr);
        }

        public boolean cdj() {
            return this.f73454zy;
        }

        /* JADX INFO: renamed from: h */
        public boolean m21185h() {
            return this.f33338k;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f33339n < 0) {
                mo20673s();
            }
            return this.f33339n;
        }

        public toq ld6() {
            return this.f33340q;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (m21185h()) {
                c5882m.zurt(1, m21186p());
            }
            if (cdj()) {
                c5882m.ni7(2, ld6());
            }
        }

        public C5878p n7h(toq toqVar) {
            toqVar.getClass();
            this.f73454zy = true;
            this.f33340q = toqVar;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public com.xiaomi.push.zy m21186p() {
            return this.f73453toq;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public C5878p toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 10) {
                    x2(jkVar.m21056n());
                } else if (qVar == 18) {
                    toq toqVar = new toq();
                    jkVar.ld6(toqVar);
                    n7h(toqVar);
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iM21223n = m21185h() ? 0 + C5882m.m21223n(1, m21186p()) : 0;
            if (cdj()) {
                iM21223n += C5882m.m21220g(2, ld6());
            }
            this.f33339n = iM21223n;
            return iM21223n;
        }

        public C5878p x2(com.xiaomi.push.zy zyVar) {
            this.f33338k = true;
            this.f73453toq = zyVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.lh$q */
    public static final class C5879q extends bz2 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f73455f7l8;

        /* JADX INFO: renamed from: k */
        private boolean f33342k;

        /* JADX INFO: renamed from: n */
        private boolean f33343n;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73457zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f73456toq = false;

        /* JADX INFO: renamed from: q */
        private String f33344q = "";

        /* JADX INFO: renamed from: g */
        private String f33341g = "";

        /* JADX INFO: renamed from: y */
        private String f33346y = "";

        /* JADX INFO: renamed from: s */
        private int f33345s = -1;

        public static C5879q qrj(byte[] bArr) {
            return (C5879q) new C5879q().zy(bArr);
        }

        public String cdj() {
            return this.f33341g;
        }

        public boolean fn3e() {
            return this.f73457zy;
        }

        /* JADX INFO: renamed from: h */
        public C5879q m21187h(String str) {
            this.f33343n = true;
            this.f33341g = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public String m21188i() {
            return this.f33346y;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f33345s < 0) {
                mo20673s();
            }
            return this.f33345s;
        }

        public boolean ki() {
            return this.f33342k;
        }

        public boolean kja0() {
            return this.f73456toq;
        }

        public C5879q ld6(String str) {
            this.f73457zy = true;
            this.f33344q = str;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (ki()) {
                c5882m.m21233z(1, kja0());
            }
            if (fn3e()) {
                c5882m.fu4(2, n7h());
            }
            if (zurt()) {
                c5882m.fu4(3, cdj());
            }
            if (ni7()) {
                c5882m.fu4(4, m21188i());
            }
        }

        public String n7h() {
            return this.f33344q;
        }

        public boolean ni7() {
            return this.f73455f7l8;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C5879q toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 8) {
                    x2(jkVar.x2());
                } else if (qVar == 18) {
                    ld6(jkVar.m21060y());
                } else if (qVar == 26) {
                    m21187h(jkVar.m21060y());
                } else if (qVar == 34) {
                    t8r(jkVar.m21060y());
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iM21227y = ki() ? 0 + C5882m.m21227y(1, kja0()) : 0;
            if (fn3e()) {
                iM21227y += C5882m.f7l8(2, n7h());
            }
            if (zurt()) {
                iM21227y += C5882m.f7l8(3, cdj());
            }
            if (ni7()) {
                iM21227y += C5882m.f7l8(4, m21188i());
            }
            this.f33345s = iM21227y;
            return iM21227y;
        }

        public C5879q t8r(String str) {
            this.f73455f7l8 = true;
            this.f33346y = str;
            return this;
        }

        public C5879q x2(boolean z2) {
            this.f33342k = true;
            this.f73456toq = z2;
            return this;
        }

        public boolean zurt() {
            return this.f33343n;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.lh$s */
    public static final class C5880s extends bz2 {

        /* JADX INFO: renamed from: k */
        private boolean f33347k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.xiaomi.push.zy f73458toq = com.xiaomi.push.zy.f73779zy;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f73459zy = -1;

        public static C5880s qrj(byte[] bArr) {
            return (C5880s) new C5880s().zy(bArr);
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f73459zy < 0) {
                mo20673s();
            }
            return this.f73459zy;
        }

        public C5880s ld6(com.xiaomi.push.zy zyVar) {
            this.f33347k = true;
            this.f73458toq = zyVar;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (n7h()) {
                c5882m.zurt(1, m21190p());
            }
        }

        public boolean n7h() {
            return this.f33347k;
        }

        /* JADX INFO: renamed from: p */
        public com.xiaomi.push.zy m21190p() {
            return this.f73458toq;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iM21223n = n7h() ? 0 + C5882m.m21223n(1, m21190p()) : 0;
            this.f73459zy = iM21223n;
            return iM21223n;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public C5880s toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 10) {
                    ld6(jkVar.m21056n());
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }
    }

    public static final class toq extends bz2 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f73460f7l8;

        /* JADX INFO: renamed from: k */
        private boolean f33349k;

        /* JADX INFO: renamed from: n */
        private boolean f33350n;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73462zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f73461toq = false;

        /* JADX INFO: renamed from: q */
        private int f33351q = 0;

        /* JADX INFO: renamed from: g */
        private int f33348g = 0;

        /* JADX INFO: renamed from: y */
        private int f33353y = 0;

        /* JADX INFO: renamed from: s */
        private int f33352s = -1;

        public static toq qrj(byte[] bArr) {
            return (toq) new toq().zy(bArr);
        }

        public int cdj() {
            return this.f33351q;
        }

        public boolean fn3e() {
            return this.f33350n;
        }

        /* JADX INFO: renamed from: h */
        public boolean m21191h() {
            return this.f33349k;
        }

        /* JADX INFO: renamed from: i */
        public int m21192i() {
            return this.f33348g;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f33352s < 0) {
                mo20673s();
            }
            return this.f33352s;
        }

        public toq ki(int i2) {
            this.f73460f7l8 = true;
            this.f33353y = i2;
            return this;
        }

        public toq kja0(int i2) {
            this.f33350n = true;
            this.f33348g = i2;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public toq toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 8) {
                    x2(jkVar.x2());
                } else if (qVar == 24) {
                    m21193p(jkVar.m21053h());
                } else if (qVar == 32) {
                    kja0(jkVar.m21053h());
                } else if (qVar == 40) {
                    ki(jkVar.m21053h());
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (m21191h()) {
                c5882m.m21233z(1, n7h());
            }
            if (t8r()) {
                c5882m.m21229i(3, cdj());
            }
            if (fn3e()) {
                c5882m.m21229i(4, m21192i());
            }
            if (ni7()) {
                c5882m.m21229i(5, zurt());
            }
        }

        public boolean n7h() {
            return this.f73461toq;
        }

        public boolean ni7() {
            return this.f73460f7l8;
        }

        /* JADX INFO: renamed from: p */
        public toq m21193p(int i2) {
            this.f73462zy = true;
            this.f33351q = i2;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iM21227y = m21191h() ? 0 + C5882m.m21227y(1, n7h()) : 0;
            if (t8r()) {
                iM21227y += C5882m.zy(3, cdj());
            }
            if (fn3e()) {
                iM21227y += C5882m.zy(4, m21192i());
            }
            if (ni7()) {
                iM21227y += C5882m.zy(5, zurt());
            }
            this.f33352s = iM21227y;
            return iM21227y;
        }

        public boolean t8r() {
            return this.f73462zy;
        }

        public toq x2(boolean z2) {
            this.f33349k = true;
            this.f73461toq = z2;
            return this;
        }

        public int zurt() {
            return this.f33353y;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.lh$y */
    public static final class C5881y extends bz2 {

        /* JADX INFO: renamed from: k */
        private boolean f33354k;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73464zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f73463toq = 0;

        /* JADX INFO: renamed from: q */
        private String f33356q = "";

        /* JADX INFO: renamed from: n */
        private int f33355n = -1;

        public static C5881y qrj(byte[] bArr) {
            return (C5881y) new C5881y().zy(bArr);
        }

        public int cdj() {
            return this.f73463toq;
        }

        /* JADX INFO: renamed from: h */
        public boolean m21194h() {
            return this.f73464zy;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f33355n < 0) {
                mo20673s();
            }
            return this.f33355n;
        }

        public boolean kja0() {
            return this.f33354k;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public C5881y toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 8) {
                    m21195p(jkVar.m21053h());
                } else if (qVar == 18) {
                    x2(jkVar.m21060y());
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (kja0()) {
                c5882m.m21229i(1, cdj());
            }
            if (m21194h()) {
                c5882m.fu4(2, n7h());
            }
        }

        public String n7h() {
            return this.f33356q;
        }

        /* JADX INFO: renamed from: p */
        public C5881y m21195p(int i2) {
            this.f33354k = true;
            this.f73463toq = i2;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iZy = kja0() ? 0 + C5882m.zy(1, cdj()) : 0;
            if (m21194h()) {
                iZy += C5882m.f7l8(2, n7h());
            }
            this.f33355n = iZy;
            return iZy;
        }

        public C5881y x2(String str) {
            this.f73464zy = true;
            this.f33356q = str;
            return this;
        }
    }

    public static final class zy extends bz2 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f73465f7l8;

        /* JADX INFO: renamed from: k */
        private boolean f33358k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f73466ld6;

        /* JADX INFO: renamed from: n */
        private boolean f33359n;

        /* JADX INFO: renamed from: s */
        private boolean f33362s;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73470zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f73468toq = "";

        /* JADX INFO: renamed from: q */
        private String f33361q = "";

        /* JADX INFO: renamed from: g */
        private String f33357g = "";

        /* JADX INFO: renamed from: y */
        private String f33363y = "";

        /* JADX INFO: renamed from: p */
        private String f33360p = "";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private String f73469x2 = "";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private int f73467qrj = -1;

        public zy cdj(String str) {
            this.f33359n = true;
            this.f33357g = str;
            return this;
        }

        public String fn3e() {
            return this.f33363y;
        }

        public String fu4() {
            return this.f33360p;
        }

        /* JADX INFO: renamed from: h */
        public boolean m21196h() {
            return this.f73470zy;
        }

        /* JADX INFO: renamed from: i */
        public zy m21197i(String str) {
            this.f73465f7l8 = true;
            this.f33363y = str;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f73467qrj < 0) {
                mo20673s();
            }
            return this.f73467qrj;
        }

        public String ki() {
            return this.f33357g;
        }

        public String kja0() {
            return this.f33361q;
        }

        public zy ld6(String str) {
            this.f33358k = true;
            this.f73468toq = str;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) throws IOException {
            if (qrj()) {
                c5882m.fu4(1, x2());
            }
            if (m21196h()) {
                c5882m.fu4(2, kja0());
            }
            if (t8r()) {
                c5882m.fu4(3, ki());
            }
            if (zurt()) {
                c5882m.fu4(4, fn3e());
            }
            if (m21200z()) {
                c5882m.fu4(5, fu4());
            }
            if (m21199t()) {
                c5882m.fu4(6, wvg());
            }
        }

        public zy n7h(String str) {
            this.f73470zy = true;
            this.f33361q = str;
            return this;
        }

        public zy ni7(String str) {
            this.f33362s = true;
            this.f33360p = str;
            return this;
        }

        public zy o1t(String str) {
            this.f73466ld6 = true;
            this.f73469x2 = str;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public zy toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 10) {
                    ld6(jkVar.m21060y());
                } else if (qVar == 18) {
                    n7h(jkVar.m21060y());
                } else if (qVar == 26) {
                    cdj(jkVar.m21060y());
                } else if (qVar == 34) {
                    m21197i(jkVar.m21060y());
                } else if (qVar == 42) {
                    ni7(jkVar.m21060y());
                } else if (qVar == 50) {
                    o1t(jkVar.m21060y());
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        public boolean qrj() {
            return this.f33358k;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iF7l8 = qrj() ? 0 + C5882m.f7l8(1, x2()) : 0;
            if (m21196h()) {
                iF7l8 += C5882m.f7l8(2, kja0());
            }
            if (t8r()) {
                iF7l8 += C5882m.f7l8(3, ki());
            }
            if (zurt()) {
                iF7l8 += C5882m.f7l8(4, fn3e());
            }
            if (m21200z()) {
                iF7l8 += C5882m.f7l8(5, fu4());
            }
            if (m21199t()) {
                iF7l8 += C5882m.f7l8(6, wvg());
            }
            this.f73467qrj = iF7l8;
            return iF7l8;
        }

        /* JADX INFO: renamed from: t */
        public boolean m21199t() {
            return this.f73466ld6;
        }

        public boolean t8r() {
            return this.f33359n;
        }

        public String wvg() {
            return this.f73469x2;
        }

        public String x2() {
            return this.f73468toq;
        }

        /* JADX INFO: renamed from: z */
        public boolean m21200z() {
            return this.f33362s;
        }

        public boolean zurt() {
            return this.f73465f7l8;
        }
    }
}
