package androidx.constraintlayout.core.parser;

/* JADX INFO: renamed from: androidx.constraintlayout.core.parser.p */
/* JADX INFO: compiled from: CLToken.java */
/* JADX INFO: loaded from: classes.dex */
public class C0302p extends zy {

    /* JADX INFO: renamed from: h */
    int f1832h;

    /* JADX INFO: renamed from: i */
    toq f1833i;

    /* JADX INFO: renamed from: r */
    char[] f1834r;

    /* JADX INFO: renamed from: t */
    char[] f1835t;

    /* JADX INFO: renamed from: z */
    char[] f1836z;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.parser.p$k */
    /* JADX INFO: compiled from: CLToken.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1837k;

        static {
            int[] iArr = new int[toq.values().length];
            f1837k = iArr;
            try {
                iArr[toq.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1837k[toq.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1837k[toq.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1837k[toq.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.parser.p$toq */
    /* JADX INFO: compiled from: CLToken.java */
    enum toq {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public C0302p(char[] cArr) {
        super(cArr);
        this.f1832h = 0;
        this.f1833i = toq.UNKNOWN;
        this.f1836z = "true".toCharArray();
        this.f1835t = "false".toCharArray();
        this.f1834r = "null".toCharArray();
    }

    public static zy fn3e(char[] cArr) {
        return new C0302p(cArr);
    }

    public boolean fu4() throws C0305y {
        if (this.f1833i == toq.NULL) {
            return true;
        }
        throw new C0305y("this token is not a null: <" + toq() + ">", this);
    }

    @Override // androidx.constraintlayout.core.parser.zy
    /* JADX INFO: renamed from: i */
    protected String mo1134i() {
        if (!f7l8.f1824q) {
            return toq();
        }
        return "<" + toq() + ">";
    }

    public toq ni7() {
        return this.f1833i;
    }

    @Override // androidx.constraintlayout.core.parser.zy
    protected String t8r(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        m1146k(sb, i2);
        sb.append(toq());
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public boolean m1136z(char c2, long j2) {
        int i2 = k.f1837k[this.f1833i.ordinal()];
        if (i2 == 1) {
            char[] cArr = this.f1836z;
            int i3 = this.f1832h;
            z = cArr[i3] == c2;
            if (z && i3 + 1 == cArr.length) {
                m1145h(j2);
            }
        } else if (i2 == 2) {
            char[] cArr2 = this.f1835t;
            int i4 = this.f1832h;
            z = cArr2[i4] == c2;
            if (z && i4 + 1 == cArr2.length) {
                m1145h(j2);
            }
        } else if (i2 == 3) {
            char[] cArr3 = this.f1834r;
            int i5 = this.f1832h;
            z = cArr3[i5] == c2;
            if (z && i5 + 1 == cArr3.length) {
                m1145h(j2);
            }
        } else if (i2 == 4) {
            char[] cArr4 = this.f1836z;
            int i6 = this.f1832h;
            if (cArr4[i6] == c2) {
                this.f1833i = toq.TRUE;
            } else if (this.f1835t[i6] == c2) {
                this.f1833i = toq.FALSE;
            } else if (this.f1834r[i6] == c2) {
                this.f1833i = toq.NULL;
            }
            z = true;
        }
        this.f1832h++;
        return z;
    }

    public boolean zurt() throws C0305y {
        toq toqVar = this.f1833i;
        if (toqVar == toq.TRUE) {
            return true;
        }
        if (toqVar == toq.FALSE) {
            return false;
        }
        throw new C0305y("this token is not a boolean: <" + toq() + ">", this);
    }
}
