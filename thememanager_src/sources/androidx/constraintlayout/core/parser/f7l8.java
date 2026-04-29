package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: CLParser.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {

    /* JADX INFO: renamed from: q */
    static boolean f1824q = false;

    /* JADX INFO: renamed from: k */
    private String f1825k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f47590toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f47591zy;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.parser.f7l8$k */
    /* JADX INFO: compiled from: CLParser.java */
    static /* synthetic */ class C0298k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1826k;

        static {
            int[] iArr = new int[toq.values().length];
            f1826k = iArr;
            try {
                iArr[toq.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1826k[toq.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1826k[toq.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1826k[toq.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1826k[toq.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1826k[toq.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: CLParser.java */
    enum toq {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public f7l8(String str) {
        this.f1825k = str;
    }

    /* JADX INFO: renamed from: k */
    private zy m1132k(zy zyVar, int i2, toq toqVar, boolean z2, char[] cArr) {
        zy zyVarLrht;
        if (f1824q) {
            System.out.println("CREATE " + toqVar + " at " + cArr[i2]);
        }
        switch (C0298k.f1826k[toqVar.ordinal()]) {
            case 1:
                zyVarLrht = C0299g.lrht(cArr);
                i2++;
                break;
            case 2:
                zyVarLrht = C0300k.zurt(cArr);
                i2++;
                break;
            case 3:
                zyVarLrht = C0304s.fn3e(cArr);
                break;
            case 4:
                zyVarLrht = C0301n.fn3e(cArr);
                break;
            case 5:
                zyVarLrht = C0303q.zurt(cArr);
                break;
            case 6:
                zyVarLrht = C0302p.fn3e(cArr);
                break;
            default:
                zyVarLrht = null;
                break;
        }
        if (zyVarLrht == null) {
            return null;
        }
        zyVarLrht.cdj(this.f47591zy);
        if (z2) {
            zyVarLrht.ki(i2);
        }
        if (zyVar instanceof androidx.constraintlayout.core.parser.toq) {
            zyVarLrht.kja0((androidx.constraintlayout.core.parser.toq) zyVar);
        }
        return zyVarLrht;
    }

    /* JADX INFO: renamed from: q */
    public static C0299g m1133q(String str) throws C0305y {
        return new f7l8(str).zy();
    }

    private zy toq(int i2, char c2, zy zyVar, char[] cArr) throws C0305y {
        if (c2 == '\t' || c2 == '\n' || c2 == '\r' || c2 == ' ') {
            return zyVar;
        }
        if (c2 == '\"' || c2 == '\'') {
            return zyVar instanceof C0299g ? m1132k(zyVar, i2, toq.KEY, true, cArr) : m1132k(zyVar, i2, toq.STRING, true, cArr);
        }
        if (c2 == '[') {
            return m1132k(zyVar, i2, toq.ARRAY, true, cArr);
        }
        if (c2 != ']') {
            if (c2 == '{') {
                return m1132k(zyVar, i2, toq.OBJECT, true, cArr);
            }
            if (c2 != '}') {
                switch (c2) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return m1132k(zyVar, i2, toq.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return zyVar;
                    case '/':
                        int i3 = i2 + 1;
                        if (i3 >= cArr.length || cArr[i3] != '/') {
                            return zyVar;
                        }
                        this.f47590toq = true;
                        return zyVar;
                    default:
                        if (!(zyVar instanceof androidx.constraintlayout.core.parser.toq) || (zyVar instanceof C0299g)) {
                            return m1132k(zyVar, i2, toq.KEY, true, cArr);
                        }
                        zy zyVarM1132k = m1132k(zyVar, i2, toq.TOKEN, true, cArr);
                        C0302p c0302p = (C0302p) zyVarM1132k;
                        if (c0302p.m1136z(c2, i2)) {
                            return zyVarM1132k;
                        }
                        throw new C0305y("incorrect token <" + c2 + "> at line " + this.f47591zy, c0302p);
                }
            }
        }
        zyVar.m1145h(i2 - 1);
        zy zyVarZy = zyVar.zy();
        zyVarZy.m1145h(i2);
        return zyVarZy;
    }

    public C0299g zy() throws C0305y {
        char[] charArray = this.f1825k.toCharArray();
        int length = charArray.length;
        int i2 = 1;
        this.f47591zy = 1;
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            char c2 = charArray[i3];
            if (c2 == '{') {
                break;
            }
            if (c2 == '\n') {
                this.f47591zy++;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new C0305y("invalid json content", null);
        }
        C0299g c0299gLrht = C0299g.lrht(charArray);
        c0299gLrht.cdj(this.f47591zy);
        c0299gLrht.ki(i3);
        int i4 = i3 + 1;
        zy zyVarZy = c0299gLrht;
        while (i4 < length) {
            char c3 = charArray[i4];
            if (c3 == '\n') {
                this.f47591zy += i2;
            }
            if (this.f47590toq) {
                if (c3 == '\n') {
                    this.f47590toq = z2;
                } else {
                    continue;
                    i4++;
                    i2 = 1;
                    z2 = false;
                }
            }
            if (zyVarZy == null) {
                break;
            }
            if (zyVarZy.x2()) {
                zyVarZy = toq(i4, c3, zyVarZy, charArray);
            } else if (zyVarZy instanceof C0299g) {
                if (c3 == '}') {
                    zyVarZy.m1145h(i4 - 1);
                } else {
                    zyVarZy = toq(i4, c3, zyVarZy, charArray);
                }
            } else if (!(zyVarZy instanceof C0300k)) {
                boolean z3 = zyVarZy instanceof C0304s;
                if (z3) {
                    long j2 = zyVarZy.f1846q;
                    if (charArray[(int) j2] == c3) {
                        zyVarZy.ki(j2 + 1);
                        zyVarZy.m1145h(i4 - 1);
                    }
                } else {
                    if (zyVarZy instanceof C0302p) {
                        C0302p c0302p = (C0302p) zyVarZy;
                        if (!c0302p.m1136z(c3, i4)) {
                            throw new C0305y("parsing incorrect token " + c0302p.toq() + " at line " + this.f47591zy, c0302p);
                        }
                    }
                    if ((zyVarZy instanceof C0303q) || z3) {
                        long j3 = zyVarZy.f1846q;
                        char c4 = charArray[(int) j3];
                        if ((c4 == '\'' || c4 == '\"') && c4 == c3) {
                            zyVarZy.ki(j3 + 1);
                            zyVarZy.m1145h(i4 - 1);
                        }
                    }
                    if (!zyVarZy.x2() && (c3 == '}' || c3 == ']' || c3 == ',' || c3 == ' ' || c3 == '\t' || c3 == '\r' || c3 == '\n' || c3 == ':')) {
                        long j4 = i4 - 1;
                        zyVarZy.m1145h(j4);
                        if (c3 == '}' || c3 == ']') {
                            zyVarZy = zyVarZy.zy();
                            zyVarZy.m1145h(j4);
                            if (zyVarZy instanceof C0303q) {
                                zyVarZy = zyVarZy.zy();
                                zyVarZy.m1145h(j4);
                            }
                        }
                    }
                }
            } else if (c3 == ']') {
                zyVarZy.m1145h(i4 - 1);
            } else {
                zyVarZy = toq(i4, c3, zyVarZy, charArray);
            }
            if (zyVarZy.x2() && (!(zyVarZy instanceof C0303q) || ((C0303q) zyVarZy).f1840h.size() > 0)) {
                zyVarZy = zyVarZy.zy();
            }
            i4++;
            i2 = 1;
            z2 = false;
        }
        while (zyVarZy != null && !zyVarZy.x2()) {
            if (zyVarZy instanceof C0304s) {
                zyVarZy.ki(((int) zyVarZy.f1846q) + 1);
            }
            zyVarZy.m1145h(length - 1);
            zyVarZy = zyVarZy.zy();
        }
        if (f1824q) {
            System.out.println("Root: " + c0299gLrht.mo1134i());
        }
        return c0299gLrht;
    }
}
