package kotlin.text;

import kotlin.internal.InterfaceC6234g;
import kotlin.nn86;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.ki
@yz(version = "1.9")
public final class ld6 {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final ld6 f36698g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final ld6 f36699n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final zy f36700q = new zy(null);

    /* JADX INFO: renamed from: k */
    private final boolean f36701k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final toq f81924toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final C6448q f81925zy;

    /* JADX INFO: renamed from: kotlin.text.ld6$k */
    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class C6447k {

        /* JADX INFO: renamed from: k */
        private boolean f36702k = ld6.f36700q.m23569k().m23542n();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7395n
        private toq.C6449k f81926toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7395n
        private C6448q.k f81927zy;

        @nn86
        public C6447k() {
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: g */
        private final void m23544g(cyoe.x2<? super C6448q.k, was> builderAction) {
            kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
            builderAction.invoke(m23547q());
        }

        @InterfaceC6234g
        private final void toq(cyoe.x2<? super toq.C6449k, was> builderAction) {
            kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
            builderAction.invoke(zy());
        }

        public final void f7l8(boolean z2) {
            this.f36702k = z2;
        }

        @nn86
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final ld6 m23545k() {
            toq toqVarM23568k;
            C6448q c6448qM23555k;
            boolean z2 = this.f36702k;
            toq.C6449k c6449k = this.f81926toq;
            if (c6449k == null || (toqVarM23568k = c6449k.m23562k()) == null) {
                toqVarM23568k = toq.f81932f7l8.m23568k();
            }
            C6448q.k kVar = this.f81927zy;
            if (kVar == null || (c6448qM23555k = kVar.m23552k()) == null) {
                c6448qM23555k = C6448q.f36704q.m23555k();
            }
            return new ld6(z2, toqVarM23568k, c6448qM23555k);
        }

        /* JADX INFO: renamed from: n */
        public final boolean m23546n() {
            return this.f36702k;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C6448q.k m23547q() {
            if (this.f81927zy == null) {
                this.f81927zy = new C6448q.k();
            }
            C6448q.k kVar = this.f81927zy;
            kotlin.jvm.internal.d2ok.qrj(kVar);
            return kVar;
        }

        @InterfaceC7396q
        public final toq.C6449k zy() {
            if (this.f81926toq == null) {
                this.f81926toq = new toq.C6449k();
            }
            toq.C6449k c6449k = this.f81926toq;
            kotlin.jvm.internal.d2ok.qrj(c6449k);
            return c6449k;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.ld6$q */
    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class C6448q {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f36705k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final String f81928toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f81929zy;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        public static final toq f36704q = new toq(null);

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private static final C6448q f36703n = new C6448q("", "", false);

        /* JADX INFO: renamed from: kotlin.text.ld6$q$k */
        /* JADX INFO: compiled from: HexFormat.kt */
        public static final class k {

            /* JADX INFO: renamed from: k */
            @InterfaceC7396q
            private String f36706k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            @InterfaceC7396q
            private String f81930toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private boolean f81931zy;

            public k() {
                toq toqVar = C6448q.f36704q;
                this.f36706k = toqVar.m23555k().zy();
                this.f81930toq = toqVar.m23555k().m23549n();
                this.f81931zy = toqVar.m23555k().m23550q();
            }

            public final void f7l8(@InterfaceC7396q String value) {
                kotlin.jvm.internal.d2ok.m23075h(value, "value");
                if (!fti.vwb(value, '\n', false, 2, null) && !fti.vwb(value, '\r', false, 2, null)) {
                    this.f81930toq = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
            }

            /* JADX INFO: renamed from: g */
            public final void m23551g(boolean z2) {
                this.f81931zy = z2;
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final C6448q m23552k() {
                return new C6448q(this.f36706k, this.f81930toq, this.f81931zy);
            }

            /* JADX INFO: renamed from: n */
            public final void m23553n(@InterfaceC7396q String value) {
                kotlin.jvm.internal.d2ok.m23075h(value, "value");
                if (!fti.vwb(value, '\n', false, 2, null) && !fti.vwb(value, '\r', false, 2, null)) {
                    this.f36706k = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: q */
            public final String m23554q() {
                return this.f81930toq;
            }

            @InterfaceC7396q
            public final String toq() {
                return this.f36706k;
            }

            public final boolean zy() {
                return this.f81931zy;
            }
        }

        /* JADX INFO: renamed from: kotlin.text.ld6$q$toq */
        /* JADX INFO: compiled from: HexFormat.kt */
        public static final class toq {
            private toq() {
            }

            public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final C6448q m23555k() {
                return C6448q.f36703n;
            }
        }

        public C6448q(@InterfaceC7396q String prefix, @InterfaceC7396q String suffix, boolean z2) {
            kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
            kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
            this.f36705k = prefix;
            this.f81928toq = suffix;
            this.f81929zy = z2;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final String m23549n() {
            return this.f81928toq;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m23550q() {
            return this.f81929zy;
        }

        @InterfaceC7396q
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(\"NumberHexFormat(\")");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            StringBuilder qVar = toq(sb, "    ");
            qVar.append('\n');
            kotlin.jvm.internal.d2ok.kja0(qVar, "append('\\n')");
            sb.append(")");
            String string = sb.toString();
            kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        @InterfaceC7396q
        public final StringBuilder toq(@InterfaceC7396q StringBuilder sb, @InterfaceC7396q String indent) {
            kotlin.jvm.internal.d2ok.m23075h(sb, "sb");
            kotlin.jvm.internal.d2ok.m23075h(indent, "indent");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.f36705k);
            kotlin.jvm.internal.d2ok.kja0(sb, "sb.append(indent).append…fix = \\\"\").append(prefix)");
            sb.append("\",");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.f81928toq);
            kotlin.jvm.internal.d2ok.kja0(sb, "sb.append(indent).append…fix = \\\"\").append(suffix)");
            sb.append("\",");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f81929zy);
            return sb;
        }

        @InterfaceC7396q
        public final String zy() {
            return this.f36705k;
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7396q
        public static final C8062toq f81932f7l8 = new C8062toq(null);

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        private static final toq f36707y = new toq(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final String f36708g;

        /* JADX INFO: renamed from: k */
        private final int f36709k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private final String f36710n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final String f36711q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f81933toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final String f81934zy;

        /* JADX INFO: renamed from: kotlin.text.ld6$toq$k */
        /* JADX INFO: compiled from: HexFormat.kt */
        public static final class C6449k {

            /* JADX INFO: renamed from: g */
            @InterfaceC7396q
            private String f36712g;

            /* JADX INFO: renamed from: k */
            private int f36713k;

            /* JADX INFO: renamed from: n */
            @InterfaceC7396q
            private String f36714n;

            /* JADX INFO: renamed from: q */
            @InterfaceC7396q
            private String f36715q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private int f81935toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            @InterfaceC7396q
            private String f81936zy;

            public C6449k() {
                C8062toq c8062toq = toq.f81932f7l8;
                this.f36713k = c8062toq.m23568k().f7l8();
                this.f81935toq = c8062toq.m23568k().m23557g();
                this.f81936zy = c8062toq.m23568k().m23560y();
                this.f36715q = c8062toq.m23568k().m23559q();
                this.f36714n = c8062toq.m23568k().zy();
                this.f36712g = c8062toq.m23568k().m23558n();
            }

            @InterfaceC7396q
            public final String f7l8() {
                return this.f81936zy;
            }

            /* JADX INFO: renamed from: g */
            public final int m23561g() {
                return this.f36713k;
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final toq m23562k() {
                return new toq(this.f36713k, this.f81935toq, this.f81936zy, this.f36715q, this.f36714n, this.f36712g);
            }

            public final void ld6(int i2) {
                if (i2 > 0) {
                    this.f81935toq = i2;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i2);
            }

            /* JADX INFO: renamed from: n */
            public final int m23563n() {
                return this.f81935toq;
            }

            /* JADX INFO: renamed from: p */
            public final void m23564p(@InterfaceC7396q String value) {
                kotlin.jvm.internal.d2ok.m23075h(value, "value");
                if (!fti.vwb(value, '\n', false, 2, null) && !fti.vwb(value, '\r', false, 2, null)) {
                    this.f36712g = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: q */
            public final String m23565q() {
                return this.f36712g;
            }

            public final void qrj(@InterfaceC7396q String str) {
                kotlin.jvm.internal.d2ok.m23075h(str, "<set-?>");
                this.f81936zy = str;
            }

            /* JADX INFO: renamed from: s */
            public final void m23566s(@InterfaceC7396q String value) {
                kotlin.jvm.internal.d2ok.m23075h(value, "value");
                if (!fti.vwb(value, '\n', false, 2, null) && !fti.vwb(value, '\r', false, 2, null)) {
                    this.f36715q = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
            }

            @InterfaceC7396q
            public final String toq() {
                return this.f36714n;
            }

            public final void x2(int i2) {
                if (i2 > 0) {
                    this.f36713k = i2;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i2);
            }

            /* JADX INFO: renamed from: y */
            public final void m23567y(@InterfaceC7396q String value) {
                kotlin.jvm.internal.d2ok.m23075h(value, "value");
                if (!fti.vwb(value, '\n', false, 2, null) && !fti.vwb(value, '\r', false, 2, null)) {
                    this.f36714n = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
            }

            @InterfaceC7396q
            public final String zy() {
                return this.f36715q;
            }
        }

        /* JADX INFO: renamed from: kotlin.text.ld6$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HexFormat.kt */
        public static final class C8062toq {
            private C8062toq() {
            }

            public /* synthetic */ C8062toq(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final toq m23568k() {
                return toq.f36707y;
            }
        }

        public toq(int i2, int i3, @InterfaceC7396q String groupSeparator, @InterfaceC7396q String byteSeparator, @InterfaceC7396q String bytePrefix, @InterfaceC7396q String byteSuffix) {
            kotlin.jvm.internal.d2ok.m23075h(groupSeparator, "groupSeparator");
            kotlin.jvm.internal.d2ok.m23075h(byteSeparator, "byteSeparator");
            kotlin.jvm.internal.d2ok.m23075h(bytePrefix, "bytePrefix");
            kotlin.jvm.internal.d2ok.m23075h(byteSuffix, "byteSuffix");
            this.f36709k = i2;
            this.f81933toq = i3;
            this.f81934zy = groupSeparator;
            this.f36711q = byteSeparator;
            this.f36710n = bytePrefix;
            this.f36708g = byteSuffix;
        }

        public final int f7l8() {
            return this.f36709k;
        }

        /* JADX INFO: renamed from: g */
        public final int m23557g() {
            return this.f81933toq;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final String m23558n() {
            return this.f36708g;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final String m23559q() {
            return this.f36711q;
        }

        @InterfaceC7396q
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(\"BytesHexFormat(\")");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            StringBuilder qVar = toq(sb, "    ");
            qVar.append('\n');
            kotlin.jvm.internal.d2ok.kja0(qVar, "append('\\n')");
            sb.append(")");
            String string = sb.toString();
            kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        @InterfaceC7396q
        public final StringBuilder toq(@InterfaceC7396q StringBuilder sb, @InterfaceC7396q String indent) {
            kotlin.jvm.internal.d2ok.m23075h(sb, "sb");
            kotlin.jvm.internal.d2ok.m23075h(indent, "indent");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.f36709k);
            kotlin.jvm.internal.d2ok.kja0(sb, "sb.append(indent).append…= \").append(bytesPerLine)");
            sb.append(",");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.f81933toq);
            kotlin.jvm.internal.d2ok.kja0(sb, "sb.append(indent).append… \").append(bytesPerGroup)");
            sb.append(",");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.f81934zy);
            kotlin.jvm.internal.d2ok.kja0(sb, "sb.append(indent).append…\").append(groupSeparator)");
            sb.append("\",");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.f36711q);
            kotlin.jvm.internal.d2ok.kja0(sb, "sb.append(indent).append…\"\").append(byteSeparator)");
            sb.append("\",");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.f36710n);
            kotlin.jvm.internal.d2ok.kja0(sb, "sb.append(indent).append…= \\\"\").append(bytePrefix)");
            sb.append("\",");
            kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
            sb.append('\n');
            kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.f36708g);
            sb.append("\"");
            return sb;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final String m23560y() {
            return this.f81934zy;
        }

        @InterfaceC7396q
        public final String zy() {
            return this.f36710n;
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class zy {
        private zy() {
        }

        public /* synthetic */ zy(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final ld6 m23569k() {
            return ld6.f36699n;
        }

        @InterfaceC7396q
        public final ld6 toq() {
            return ld6.f36698g;
        }
    }

    static {
        toq.C8062toq c8062toq = toq.f81932f7l8;
        toq toqVarM23568k = c8062toq.m23568k();
        C6448q.toq toqVar = C6448q.f36704q;
        f36699n = new ld6(false, toqVarM23568k, toqVar.m23555k());
        f36698g = new ld6(true, c8062toq.m23568k(), toqVar.m23555k());
    }

    public ld6(boolean z2, @InterfaceC7396q toq bytes, @InterfaceC7396q C6448q number) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        kotlin.jvm.internal.d2ok.m23075h(number, "number");
        this.f36701k = z2;
        this.f81924toq = bytes;
        this.f81925zy = number;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m23542n() {
        return this.f36701k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final C6448q m23543q() {
        return this.f81925zy;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        kotlin.jvm.internal.d2ok.kja0(sb, "append(\"HexFormat(\")");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        sb.append("    upperCase = ");
        sb.append(this.f36701k);
        kotlin.jvm.internal.d2ok.kja0(sb, "append(\"    upperCase = \").append(upperCase)");
        sb.append(",");
        kotlin.jvm.internal.d2ok.kja0(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        sb.append("    bytes = BytesHexFormat(");
        kotlin.jvm.internal.d2ok.kja0(sb, "append(\"    bytes = BytesHexFormat(\")");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        StringBuilder qVar = this.f81924toq.toq(sb, "        ");
        qVar.append('\n');
        kotlin.jvm.internal.d2ok.kja0(qVar, "append('\\n')");
        sb.append("    ),");
        kotlin.jvm.internal.d2ok.kja0(sb, "append(\"    ),\")");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        sb.append("    number = NumberHexFormat(");
        kotlin.jvm.internal.d2ok.kja0(sb, "append(\"    number = NumberHexFormat(\")");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        StringBuilder qVar2 = this.f81925zy.toq(sb, "        ");
        qVar2.append('\n');
        kotlin.jvm.internal.d2ok.kja0(qVar2, "append('\\n')");
        sb.append("    )");
        kotlin.jvm.internal.d2ok.kja0(sb, "append(\"    )\")");
        sb.append('\n');
        kotlin.jvm.internal.d2ok.kja0(sb, "append('\\n')");
        sb.append(")");
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC7396q
    public final toq zy() {
        return this.f81924toq;
    }
}
