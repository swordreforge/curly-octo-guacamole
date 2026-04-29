package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.qo;
import kotlin.text.eqxt;

/* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p */
/* JADX INFO: compiled from: FlexBuffers.java */
/* JADX INFO: loaded from: classes.dex */
public class C0816p {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f51106cdj = 16;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f51107f7l8 = 6;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f51108fn3e = 20;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f51109fu4 = 23;

    /* JADX INFO: renamed from: g */
    public static final int f4461g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f4462h = 15;

    /* JADX INFO: renamed from: i */
    public static final int f4463i = 19;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    static final /* synthetic */ boolean f51110jk = false;

    /* JADX INFO: renamed from: k */
    public static final int f4464k = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f51111ki = 17;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f51112kja0 = 14;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f51113ld6 = 10;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final cdj f51114mcp = new C0811k(new byte[]{0}, 1);

    /* JADX INFO: renamed from: n */
    public static final int f4465n = 4;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f51115n7h = 13;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f51116ni7 = 22;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f51117o1t = 25;

    /* JADX INFO: renamed from: p */
    public static final int f4466p = 9;

    /* JADX INFO: renamed from: q */
    public static final int f4467q = 3;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f51118qrj = 12;

    /* JADX INFO: renamed from: s */
    public static final int f4468s = 8;

    /* JADX INFO: renamed from: t */
    public static final int f4469t = 36;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f51119t8r = 18;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f51120toq = 1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f51121wvg = 26;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f51122x2 = 11;

    /* JADX INFO: renamed from: y */
    public static final int f4470y = 7;

    /* JADX INFO: renamed from: z */
    public static final int f4471z = 24;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f51123zurt = 21;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f51124zy = 2;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$f7l8 */
    /* JADX INFO: compiled from: FlexBuffers.java */
    public static class f7l8 {

        /* JADX INFO: renamed from: g */
        private static final f7l8 f4472g = new f7l8(C0816p.f51114mcp, 0, 1, 0);

        /* JADX INFO: renamed from: k */
        private cdj f4473k;

        /* JADX INFO: renamed from: n */
        private int f4474n;

        /* JADX INFO: renamed from: q */
        private int f4475q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f51125toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f51126zy;

        f7l8(cdj cdjVar, int i2, int i3, int i4) {
            this(cdjVar, i2, i3, 1 << (i4 & 3), i4 >> 2);
        }

        public boolean cdj() {
            return m3940h() || fu4();
        }

        public long f7l8() {
            int i2 = this.f4474n;
            if (i2 == 1) {
                return C0816p.kja0(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 2) {
                return C0816p.m3931h(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 3) {
                return (long) C0816p.qrj(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 5) {
                try {
                    return Long.parseLong(m3945s());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i2 == 6) {
                cdj cdjVar = this.f4473k;
                return C0816p.kja0(cdjVar, C0816p.m3936s(cdjVar, this.f51125toq, this.f51126zy), this.f4475q);
            }
            if (i2 == 7) {
                cdj cdjVar2 = this.f4473k;
                return C0816p.m3931h(cdjVar2, C0816p.m3936s(cdjVar2, this.f51125toq, this.f51126zy), this.f51126zy);
            }
            if (i2 == 8) {
                cdj cdjVar3 = this.f4473k;
                return (long) C0816p.qrj(cdjVar3, C0816p.m3936s(cdjVar3, this.f51125toq, this.f51126zy), this.f4475q);
            }
            if (i2 == 10) {
                return ld6().toq();
            }
            if (i2 != 26) {
                return 0L;
            }
            return C0816p.n7h(this.f4473k, this.f51125toq, this.f51126zy);
        }

        public boolean fn3e() {
            return cdj() || kja0();
        }

        public boolean fu4() {
            int i2 = this.f4474n;
            return i2 == 2 || i2 == 7;
        }

        /* JADX INFO: renamed from: g */
        public zy m3939g() {
            if (!ki()) {
                return zy.m3962q();
            }
            cdj cdjVar = this.f4473k;
            return new zy(cdjVar, C0816p.m3936s(cdjVar, this.f51125toq, this.f51126zy), this.f4475q);
        }

        /* JADX INFO: renamed from: h */
        public boolean m3940h() {
            int i2 = this.f4474n;
            return i2 == 1 || i2 == 6;
        }

        /* JADX INFO: renamed from: i */
        public boolean m3941i() {
            return this.f4474n == 0;
        }

        public boolean ki() {
            return this.f4474n == 4;
        }

        public boolean kja0() {
            int i2 = this.f4474n;
            return i2 == 3 || i2 == 8;
        }

        public ld6 ld6() {
            if (m3947z()) {
                cdj cdjVar = this.f4473k;
                return new ld6(cdjVar, C0816p.m3936s(cdjVar, this.f51125toq, this.f51126zy), this.f4475q);
            }
            int i2 = this.f4474n;
            if (i2 == 15) {
                cdj cdjVar2 = this.f4473k;
                return new s(cdjVar2, C0816p.m3936s(cdjVar2, this.f51125toq, this.f51126zy), this.f4475q, 4);
            }
            if (!C0816p.ld6(i2)) {
                return ld6.zy();
            }
            cdj cdjVar3 = this.f4473k;
            return new s(cdjVar3, C0816p.m3936s(cdjVar3, this.f51125toq, this.f51126zy), this.f4475q, C0816p.ki(this.f4474n));
        }

        /* JADX INFO: renamed from: n */
        public int m3942n() {
            int i2 = this.f4474n;
            if (i2 == 1) {
                return C0816p.n7h(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 2) {
                return (int) C0816p.m3931h(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 3) {
                return (int) C0816p.qrj(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 5) {
                return Integer.parseInt(m3945s());
            }
            if (i2 == 6) {
                cdj cdjVar = this.f4473k;
                return C0816p.n7h(cdjVar, C0816p.m3936s(cdjVar, this.f51125toq, this.f51126zy), this.f4475q);
            }
            if (i2 == 7) {
                cdj cdjVar2 = this.f4473k;
                return (int) C0816p.m3931h(cdjVar2, C0816p.m3936s(cdjVar2, this.f51125toq, this.f51126zy), this.f51126zy);
            }
            if (i2 == 8) {
                cdj cdjVar3 = this.f4473k;
                return (int) C0816p.qrj(cdjVar3, C0816p.m3936s(cdjVar3, this.f51125toq, this.f51126zy), this.f4475q);
            }
            if (i2 == 10) {
                return ld6().toq();
            }
            if (i2 != 26) {
                return 0;
            }
            return C0816p.n7h(this.f4473k, this.f51125toq, this.f51126zy);
        }

        public boolean n7h() {
            return this.f4474n == 26;
        }

        public boolean ni7() {
            return C0816p.ld6(this.f4474n);
        }

        StringBuilder o1t(StringBuilder sb) {
            int i2 = this.f4474n;
            if (i2 != 36) {
                switch (i2) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(f7l8());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(m3943p());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(m3944q());
                        return sb;
                    case 4:
                        zy zyVarM3939g = m3939g();
                        sb.append(eqxt.f81913toq);
                        StringBuilder sbMo3948k = zyVarM3939g.mo3948k(sb);
                        sbMo3948k.append(eqxt.f81913toq);
                        return sbMo3948k;
                    case 5:
                        sb.append(eqxt.f81913toq);
                        sb.append(m3945s());
                        sb.append(eqxt.f81913toq);
                        return sb;
                    case 9:
                        return m3946y().mo3948k(sb);
                    case 10:
                        return ld6().mo3948k(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new toq("not_implemented:" + this.f4474n);
                    case 25:
                        return toq().mo3948k(sb);
                    case 26:
                        sb.append(zy());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(ld6());
            return sb;
        }

        /* JADX INFO: renamed from: p */
        public long m3943p() {
            int i2 = this.f4474n;
            if (i2 == 2) {
                return C0816p.m3931h(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 1) {
                return C0816p.kja0(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 3) {
                return (long) C0816p.qrj(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 10) {
                return ld6().toq();
            }
            if (i2 == 26) {
                return C0816p.n7h(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 5) {
                return Long.parseLong(m3945s());
            }
            if (i2 == 6) {
                cdj cdjVar = this.f4473k;
                return C0816p.kja0(cdjVar, C0816p.m3936s(cdjVar, this.f51125toq, this.f51126zy), this.f4475q);
            }
            if (i2 == 7) {
                cdj cdjVar2 = this.f4473k;
                return C0816p.m3931h(cdjVar2, C0816p.m3936s(cdjVar2, this.f51125toq, this.f51126zy), this.f4475q);
            }
            if (i2 != 8) {
                return 0L;
            }
            cdj cdjVar3 = this.f4473k;
            return (long) C0816p.qrj(cdjVar3, C0816p.m3936s(cdjVar3, this.f51125toq, this.f51126zy), this.f51126zy);
        }

        /* JADX INFO: renamed from: q */
        public double m3944q() {
            int i2 = this.f4474n;
            if (i2 == 3) {
                return C0816p.qrj(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 == 1) {
                return C0816p.n7h(this.f4473k, this.f51125toq, this.f51126zy);
            }
            if (i2 != 2) {
                if (i2 == 5) {
                    return Double.parseDouble(m3945s());
                }
                if (i2 == 6) {
                    cdj cdjVar = this.f4473k;
                    return C0816p.n7h(cdjVar, C0816p.m3936s(cdjVar, this.f51125toq, this.f51126zy), this.f4475q);
                }
                if (i2 == 7) {
                    cdj cdjVar2 = this.f4473k;
                    return C0816p.m3931h(cdjVar2, C0816p.m3936s(cdjVar2, this.f51125toq, this.f51126zy), this.f4475q);
                }
                if (i2 == 8) {
                    cdj cdjVar3 = this.f4473k;
                    return C0816p.qrj(cdjVar3, C0816p.m3936s(cdjVar3, this.f51125toq, this.f51126zy), this.f4475q);
                }
                if (i2 == 10) {
                    return ld6().toq();
                }
                if (i2 != 26) {
                    return 0.0d;
                }
            }
            return C0816p.m3931h(this.f4473k, this.f51125toq, this.f51126zy);
        }

        public boolean qrj() {
            return this.f4474n == 25;
        }

        /* JADX INFO: renamed from: s */
        public String m3945s() {
            if (zurt()) {
                int iM3936s = C0816p.m3936s(this.f4473k, this.f51125toq, this.f51126zy);
                cdj cdjVar = this.f4473k;
                int i2 = this.f4475q;
                return this.f4473k.x2(iM3936s, (int) C0816p.m3931h(cdjVar, iM3936s - i2, i2));
            }
            if (!ki()) {
                return "";
            }
            int iM3936s2 = C0816p.m3936s(this.f4473k, this.f51125toq, this.f4475q);
            int i3 = iM3936s2;
            while (this.f4473k.get(i3) != 0) {
                i3++;
            }
            return this.f4473k.x2(iM3936s2, i3 - iM3936s2);
        }

        public boolean t8r() {
            return this.f4474n == 9;
        }

        public String toString() {
            return o1t(new StringBuilder(128)).toString();
        }

        public k toq() {
            if (!qrj() && !zurt()) {
                return k.m3949q();
            }
            cdj cdjVar = this.f4473k;
            return new k(cdjVar, C0816p.m3936s(cdjVar, this.f51125toq, this.f51126zy), this.f4475q);
        }

        public int x2() {
            return this.f4474n;
        }

        /* JADX INFO: renamed from: y */
        public n m3946y() {
            if (!t8r()) {
                return n.f7l8();
            }
            cdj cdjVar = this.f4473k;
            return new n(cdjVar, C0816p.m3936s(cdjVar, this.f51125toq, this.f51126zy), this.f4475q);
        }

        /* JADX INFO: renamed from: z */
        public boolean m3947z() {
            int i2 = this.f4474n;
            return i2 == 10 || i2 == 9;
        }

        public boolean zurt() {
            return this.f4474n == 5;
        }

        public boolean zy() {
            return n7h() ? this.f4473k.get(this.f51125toq) != 0 : m3943p() != 0;
        }

        f7l8(cdj cdjVar, int i2, int i3, int i4, int i5) {
            this.f4473k = cdjVar;
            this.f51125toq = i2;
            this.f51126zy = i3;
            this.f4475q = i4;
            this.f4474n = i5;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$g */
    /* JADX INFO: compiled from: FlexBuffers.java */
    private static abstract class g {

        /* JADX INFO: renamed from: k */
        cdj f4476k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f51127toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f51128zy;

        g(cdj cdjVar, int i2, int i3) {
            this.f4476k = cdjVar;
            this.f51127toq = i2;
            this.f51128zy = i3;
        }

        /* JADX INFO: renamed from: k */
        public abstract StringBuilder mo3948k(StringBuilder sb);

        public String toString() {
            return mo3948k(new StringBuilder(128)).toString();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$k */
    /* JADX INFO: compiled from: FlexBuffers.java */
    public static class k extends y {

        /* JADX INFO: renamed from: g */
        static final /* synthetic */ boolean f4477g = false;

        /* JADX INFO: renamed from: n */
        static final k f4478n = new k(C0816p.f51114mcp, 1, 1);

        k(cdj cdjVar, int i2, int i3) {
            super(cdjVar, i2, i3);
        }

        /* JADX INFO: renamed from: q */
        public static k m3949q() {
            return f4478n;
        }

        /* JADX INFO: renamed from: g */
        public byte[] m3950g() {
            int qVar = toq();
            byte[] bArr = new byte[qVar];
            for (int i2 = 0; i2 < qVar; i2++) {
                bArr[i2] = this.f4476k.get(this.f51127toq + i2);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.g
        /* JADX INFO: renamed from: k */
        public StringBuilder mo3948k(StringBuilder sb) {
            sb.append(eqxt.f81913toq);
            sb.append(this.f4476k.x2(this.f51127toq, toq()));
            sb.append(eqxt.f81913toq);
            return sb;
        }

        /* JADX INFO: renamed from: n */
        public byte m3951n(int i2) {
            return this.f4476k.get(this.f51127toq + i2);
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.g
        public String toString() {
            return this.f4476k.x2(this.f51127toq, toq());
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.y
        public /* bridge */ /* synthetic */ int toq() {
            return super.toq();
        }

        public ByteBuffer zy() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f4476k.ld6());
            byteBufferWrap.position(this.f51127toq);
            byteBufferWrap.limit(this.f51127toq + toq());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$ld6 */
    /* JADX INFO: compiled from: FlexBuffers.java */
    public static class ld6 extends y {

        /* JADX INFO: renamed from: n */
        private static final ld6 f4479n = new ld6(C0816p.f51114mcp, 1, 1);

        ld6(cdj cdjVar, int i2, int i3) {
            super(cdjVar, i2, i3);
        }

        public static ld6 zy() {
            return f4479n;
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.g
        /* JADX INFO: renamed from: k */
        public StringBuilder mo3948k(StringBuilder sb) {
            sb.append("[ ");
            int qVar = toq();
            for (int i2 = 0; i2 < qVar; i2++) {
                mo3953q(i2).o1t(sb);
                if (i2 != qVar - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        /* JADX INFO: renamed from: n */
        public boolean m3952n() {
            return this == f4479n;
        }

        /* JADX INFO: renamed from: q */
        public f7l8 mo3953q(int i2) {
            long qVar = toq();
            long j2 = i2;
            if (j2 >= qVar) {
                return f7l8.f4472g;
            }
            return new f7l8(this.f4476k, this.f51127toq + (i2 * this.f51128zy), this.f51128zy, p.m3958k(this.f4476k.get((int) (((long) this.f51127toq) + (qVar * ((long) this.f51128zy)) + j2))));
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.g
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.y
        public /* bridge */ /* synthetic */ int toq() {
            return super.toq();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$n */
    /* JADX INFO: compiled from: FlexBuffers.java */
    public static class n extends ld6 {

        /* JADX INFO: renamed from: g */
        private static final n f4480g = new n(C0816p.f51114mcp, 1, 1);

        n(cdj cdjVar, int i2, int i3) {
            super(cdjVar, i2, i3);
        }

        public static n f7l8() {
            return f4480g;
        }

        /* JADX INFO: renamed from: g */
        private int m3954g(q qVar, byte[] bArr) {
            int qVar2 = qVar.toq() - 1;
            int i2 = 0;
            while (i2 <= qVar2) {
                int i3 = (i2 + qVar2) >>> 1;
                int iZy = qVar.m3959k(i3).zy(bArr);
                if (iZy < 0) {
                    i2 = i3 + 1;
                } else {
                    if (iZy <= 0) {
                        return i3;
                    }
                    qVar2 = i3 - 1;
                }
            }
            return -(i2 + 1);
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.ld6, androidx.emoji2.text.flatbuffer.C0816p.g
        /* JADX INFO: renamed from: k */
        public StringBuilder mo3948k(StringBuilder sb) {
            sb.append("{ ");
            q qVarM3955p = m3955p();
            int qVar = toq();
            ld6 ld6VarLd6 = ld6();
            for (int i2 = 0; i2 < qVar; i2++) {
                sb.append(eqxt.f81913toq);
                sb.append(qVarM3955p.m3959k(i2).toString());
                sb.append("\" : ");
                sb.append(ld6VarLd6.mo3953q(i2).toString());
                if (i2 != qVar - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public ld6 ld6() {
            return new ld6(this.f4476k, this.f51127toq, this.f51128zy);
        }

        /* JADX INFO: renamed from: p */
        public q m3955p() {
            int i2 = this.f51127toq - (this.f51128zy * 3);
            cdj cdjVar = this.f4476k;
            int iM3936s = C0816p.m3936s(cdjVar, i2, this.f51128zy);
            cdj cdjVar2 = this.f4476k;
            int i3 = this.f51128zy;
            return new q(new s(cdjVar, iM3936s, C0816p.n7h(cdjVar2, i2 + i3, i3), 4));
        }

        /* JADX INFO: renamed from: s */
        public f7l8 m3956s(byte[] bArr) {
            q qVarM3955p = m3955p();
            int qVar = qVarM3955p.toq();
            int iM3954g = m3954g(qVarM3955p, bArr);
            return (iM3954g < 0 || iM3954g >= qVar) ? f7l8.f4472g : mo3953q(iM3954g);
        }

        /* JADX INFO: renamed from: y */
        public f7l8 m3957y(String str) {
            return m3956s(str.getBytes(StandardCharsets.UTF_8));
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$p */
    /* JADX INFO: compiled from: FlexBuffers.java */
    static class p {
        p() {
        }

        /* JADX INFO: renamed from: k */
        static int m3958k(byte b2) {
            return b2 & 255;
        }

        static long toq(int i2) {
            return ((long) i2) & 4294967295L;
        }

        static int zy(short s2) {
            return s2 & qo.f36486g;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$q */
    /* JADX INFO: compiled from: FlexBuffers.java */
    public static class q {

        /* JADX INFO: renamed from: k */
        private final s f4481k;

        q(s sVar) {
            this.f4481k = sVar;
        }

        /* JADX INFO: renamed from: k */
        public zy m3959k(int i2) {
            if (i2 >= toq()) {
                return zy.f4484q;
            }
            s sVar = this.f4481k;
            int i3 = sVar.f51127toq + (i2 * sVar.f51128zy);
            s sVar2 = this.f4481k;
            cdj cdjVar = sVar2.f4476k;
            return new zy(cdjVar, C0816p.m3936s(cdjVar, i3, sVar2.f51128zy), 1);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i2 = 0; i2 < this.f4481k.toq(); i2++) {
                this.f4481k.mo3953q(i2).o1t(sb);
                if (i2 != this.f4481k.toq() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }

        public int toq() {
            return this.f4481k.toq();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$s */
    /* JADX INFO: compiled from: FlexBuffers.java */
    public static class s extends ld6 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final s f51129f7l8 = new s(C0816p.f51114mcp, 1, 1, 1);

        /* JADX INFO: renamed from: g */
        private final int f4482g;

        s(cdj cdjVar, int i2, int i3, int i4) {
            super(cdjVar, i2, i3);
            this.f4482g = i4;
        }

        /* JADX INFO: renamed from: g */
        public static s m3960g() {
            return f51129f7l8;
        }

        public int f7l8() {
            return this.f4482g;
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.ld6
        /* JADX INFO: renamed from: q */
        public f7l8 mo3953q(int i2) {
            if (i2 >= toq()) {
                return f7l8.f4472g;
            }
            return new f7l8(this.f4476k, this.f51127toq + (i2 * this.f51128zy), this.f51128zy, 1, this.f4482g);
        }

        /* JADX INFO: renamed from: y */
        public boolean m3961y() {
            return this == f51129f7l8;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$toq */
    /* JADX INFO: compiled from: FlexBuffers.java */
    public static class toq extends RuntimeException {
        toq(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$y */
    /* JADX INFO: compiled from: FlexBuffers.java */
    private static abstract class y extends g {

        /* JADX INFO: renamed from: q */
        protected final int f4483q;

        y(cdj cdjVar, int i2, int i3) {
            super(cdjVar, i2, i3);
            this.f4483q = C0816p.n7h(this.f4476k, i2 - i3, i3);
        }

        public int toq() {
            return this.f4483q;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.p$zy */
    /* JADX INFO: compiled from: FlexBuffers.java */
    public static class zy extends g {

        /* JADX INFO: renamed from: q */
        private static final zy f4484q = new zy(C0816p.f51114mcp, 0, 0);

        zy(cdj cdjVar, int i2, int i3) {
            super(cdjVar, i2, i3);
        }

        /* JADX INFO: renamed from: q */
        public static zy m3962q() {
            return f4484q;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zy)) {
                return false;
            }
            zy zyVar = (zy) obj;
            return zyVar.f51127toq == this.f51127toq && zyVar.f51128zy == this.f51128zy;
        }

        public int hashCode() {
            return this.f51127toq ^ this.f51128zy;
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.g
        /* JADX INFO: renamed from: k */
        public StringBuilder mo3948k(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.C0816p.g
        public String toString() {
            int i2 = this.f51127toq;
            while (this.f4476k.get(i2) != 0) {
                i2++;
            }
            int i3 = this.f51127toq;
            return this.f4476k.x2(i3, i2 - i3);
        }

        int zy(byte[] bArr) {
            byte b2;
            byte b3;
            int i2 = this.f51127toq;
            int i3 = 0;
            do {
                b2 = this.f4476k.get(i2);
                b3 = bArr[i3];
                if (b2 == 0) {
                    return b2 - b3;
                }
                i2++;
                i3++;
                if (i3 == bArr.length) {
                    return b2 - b3;
                }
            } while (b2 == b3);
            return b2 - b3;
        }
    }

    static int cdj(int i2, int i3) {
        if (i3 == 0) {
            return (i2 - 1) + 11;
        }
        if (i3 == 2) {
            return (i2 - 1) + 16;
        }
        if (i3 == 3) {
            return (i2 - 1) + 19;
        }
        if (i3 != 4) {
            return 0;
        }
        return (i2 - 1) + 22;
    }

    public static f7l8 f7l8(cdj cdjVar) {
        int iF7l8 = cdjVar.f7l8() - 1;
        byte b2 = cdjVar.get(iF7l8);
        int i2 = iF7l8 - 1;
        return new f7l8(cdjVar, i2 - b2, b2, p.m3958k(cdjVar.get(i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static long m3931h(cdj cdjVar, int i2, int i3) {
        if (i3 == 1) {
            return p.m3958k(cdjVar.get(i2));
        }
        if (i3 == 2) {
            return p.zy(cdjVar.getShort(i2));
        }
        if (i3 == 4) {
            return p.toq(cdjVar.getInt(i2));
        }
        if (i3 != 8) {
            return -1L;
        }
        return cdjVar.getLong(i2);
    }

    static int ki(int i2) {
        return (i2 - 11) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long kja0(cdj cdjVar, int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = cdjVar.get(i2);
        } else if (i3 == 2) {
            i4 = cdjVar.getShort(i2);
        } else {
            if (i3 != 4) {
                if (i3 != 8) {
                    return -1L;
                }
                return cdjVar.getLong(i2);
            }
            i4 = cdjVar.getInt(i2);
        }
        return i4;
    }

    static boolean ld6(int i2) {
        return (i2 >= 11 && i2 <= 15) || i2 == 36;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n7h(cdj cdjVar, int i2, int i3) {
        return (int) kja0(cdjVar, i2, i3);
    }

    /* JADX INFO: renamed from: p */
    static boolean m3934p(int i2) {
        return i2 <= 3 || i2 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double qrj(cdj cdjVar, int i2, int i3) {
        if (i3 == 4) {
            return cdjVar.getFloat(i2);
        }
        if (i3 != 8) {
            return -1.0d;
        }
        return cdjVar.getDouble(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static int m3936s(cdj cdjVar, int i2, int i3) {
        return (int) (((long) i2) - m3931h(cdjVar, i2, i3));
    }

    static boolean x2(int i2) {
        return (i2 >= 1 && i2 <= 4) || i2 == 26;
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static f7l8 m3937y(ByteBuffer byteBuffer) {
        return f7l8(byteBuffer.hasArray() ? new C0811k(byteBuffer.array(), byteBuffer.limit()) : new C0817q(byteBuffer));
    }
}
