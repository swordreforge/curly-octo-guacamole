package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.InterfaceC6374q;
import l05.C6764k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.4")
public final class c8jq implements kotlin.reflect.t8r {

    /* JADX INFO: renamed from: h */
    public static final int f36380h = 4;

    /* JADX INFO: renamed from: p */
    public static final int f36381p = 2;

    /* JADX INFO: renamed from: s */
    public static final int f36382s = 1;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C6285k f36383y = new C6285k(null);

    /* JADX INFO: renamed from: g */
    private final int f36384g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kotlin.reflect.f7l8 f36385k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final kotlin.reflect.t8r f36386n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final List<kotlin.reflect.fn3e> f36387q;

    /* JADX INFO: renamed from: kotlin.jvm.internal.c8jq$k */
    /* JADX INFO: compiled from: TypeReference.kt */
    public static final class C6285k {
        private C6285k() {
        }

        public /* synthetic */ C6285k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    public /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36388k;

        static {
            int[] iArr = new int[kotlin.reflect.zurt.values().length];
            try {
                iArr[kotlin.reflect.zurt.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.zurt.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.zurt.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36388k = iArr;
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    static final class zy extends AbstractC6308r implements cyoe.x2<kotlin.reflect.fn3e, CharSequence> {
        zy() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final CharSequence invoke(@InterfaceC7396q kotlin.reflect.fn3e it) {
            d2ok.m23075h(it, "it");
            return c8jq.this.m23069s(it);
        }
    }

    @kotlin.yz(version = "1.6")
    public c8jq(@InterfaceC7396q kotlin.reflect.f7l8 classifier, @InterfaceC7396q List<kotlin.reflect.fn3e> arguments, @InterfaceC7395n kotlin.reflect.t8r t8rVar, int i2) {
        d2ok.m23075h(classifier, "classifier");
        d2ok.m23075h(arguments, "arguments");
        this.f36385k = classifier;
        this.f36387q = arguments;
        this.f36386n = t8rVar;
        this.f36384g = i2;
    }

    @kotlin.yz(version = "1.6")
    public static /* synthetic */ void a9() {
    }

    private final String cdj(boolean z2) {
        String name;
        kotlin.reflect.f7l8 f7l8VarKja0 = kja0();
        InterfaceC6374q interfaceC6374q = f7l8VarKja0 instanceof InterfaceC6374q ? (InterfaceC6374q) f7l8VarKja0 : null;
        Class<?> clsM24702n = interfaceC6374q != null ? C6764k.m24702n(interfaceC6374q) : null;
        if (clsM24702n == null) {
            name = kja0().toString();
        } else if ((this.f36384g & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsM24702n.isArray()) {
            name = m23067i(clsM24702n);
        } else if (z2 && clsM24702n.isPrimitive()) {
            kotlin.reflect.f7l8 f7l8VarKja02 = kja0();
            d2ok.n7h(f7l8VarKja02, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = C6764k.f7l8((InterfaceC6374q) f7l8VarKja02).getName();
        } else {
            name = clsM24702n.getName();
        }
        String str = name + (mo23072z().isEmpty() ? "" : kotlin.collections.a9.uo(mo23072z(), ", ", "<", ">", 0, null, new zy(), 24, null)) + (mo23070g() ? "?" : "");
        kotlin.reflect.t8r t8rVar = this.f36386n;
        if (!(t8rVar instanceof c8jq)) {
            return str;
        }
        String strCdj = ((c8jq) t8rVar).cdj(true);
        if (d2ok.f7l8(strCdj, str)) {
            return str;
        }
        if (d2ok.f7l8(strCdj, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strCdj + ')';
    }

    /* JADX INFO: renamed from: i */
    private final String m23067i(Class<?> cls) {
        return d2ok.f7l8(cls, boolean[].class) ? "kotlin.BooleanArray" : d2ok.f7l8(cls, char[].class) ? "kotlin.CharArray" : d2ok.f7l8(cls, byte[].class) ? "kotlin.ByteArray" : d2ok.f7l8(cls, short[].class) ? "kotlin.ShortArray" : d2ok.f7l8(cls, int[].class) ? "kotlin.IntArray" : d2ok.f7l8(cls, float[].class) ? "kotlin.FloatArray" : d2ok.f7l8(cls, long[].class) ? "kotlin.LongArray" : d2ok.f7l8(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @kotlin.yz(version = "1.6")
    public static /* synthetic */ void mcp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final String m23069s(kotlin.reflect.fn3e fn3eVar) {
        String strValueOf;
        if (fn3eVar.m23382y() == null) {
            return "*";
        }
        kotlin.reflect.t8r t8rVarF7l8 = fn3eVar.f7l8();
        c8jq c8jqVar = t8rVarF7l8 instanceof c8jq ? (c8jq) t8rVarF7l8 : null;
        if (c8jqVar == null || (strValueOf = c8jqVar.cdj(true)) == null) {
            strValueOf = String.valueOf(fn3eVar.f7l8());
        }
        int i2 = toq.f36388k[fn3eVar.m23382y().ordinal()];
        if (i2 == 1) {
            return strValueOf;
        }
        if (i2 == 2) {
            return "in " + strValueOf;
        }
        if (i2 != 3) {
            throw new kotlin.oc();
        }
        return "out " + strValueOf;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof c8jq) {
            c8jq c8jqVar = (c8jq) obj;
            if (d2ok.f7l8(kja0(), c8jqVar.kja0()) && d2ok.f7l8(mo23072z(), c8jqVar.mo23072z()) && d2ok.f7l8(this.f36386n, c8jqVar.f36386n) && this.f36384g == c8jqVar.f36384g) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.t8r
    /* JADX INFO: renamed from: g */
    public boolean mo23070g() {
        return (this.f36384g & 1) != 0;
    }

    @Override // kotlin.reflect.toq
    @InterfaceC7396q
    public List<Annotation> getAnnotations() {
        return kotlin.collections.ni7.a9();
    }

    public int hashCode() {
        return (((kja0().hashCode() * 31) + mo23072z().hashCode()) * 31) + Integer.hashCode(this.f36384g);
    }

    @InterfaceC7395n
    public final kotlin.reflect.t8r jk() {
        return this.f36386n;
    }

    @Override // kotlin.reflect.t8r
    @InterfaceC7396q
    public kotlin.reflect.f7l8 kja0() {
        return this.f36385k;
    }

    /* JADX INFO: renamed from: t */
    public final int m23071t() {
        return this.f36384g;
    }

    @InterfaceC7396q
    public String toString() {
        return cdj(false) + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.t8r
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public List<kotlin.reflect.fn3e> mo23072z() {
        return this.f36387q;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c8jq(@InterfaceC7396q kotlin.reflect.f7l8 classifier, @InterfaceC7396q List<kotlin.reflect.fn3e> arguments, boolean z2) {
        this(classifier, arguments, null, z2 ? 1 : 0);
        d2ok.m23075h(classifier, "classifier");
        d2ok.m23075h(arguments, "arguments");
    }
}
