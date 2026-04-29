package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC6365i;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TypeParameterReference.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
@kotlin.yz(version = "1.4")
public final class y2 implements InterfaceC6365i {

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    public static final C6314k f36457s = new C6314k(null);

    /* JADX INFO: renamed from: g */
    private final boolean f36458g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final Object f36459k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final kotlin.reflect.zurt f36460n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final String f36461q;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private volatile List<? extends kotlin.reflect.t8r> f36462y;

    /* JADX INFO: renamed from: kotlin.jvm.internal.y2$k */
    /* JADX INFO: compiled from: TypeParameterReference.kt */
    public static final class C6314k {

        /* JADX INFO: renamed from: kotlin.jvm.internal.y2$k$k */
        /* JADX INFO: compiled from: TypeParameterReference.kt */
        public /* synthetic */ class k {

            /* JADX INFO: renamed from: k */
            public static final /* synthetic */ int[] f36463k;

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
                f36463k = iArr;
            }
        }

        private C6314k() {
        }

        public /* synthetic */ C6314k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final String m23167k(@InterfaceC7396q InterfaceC6365i typeParameter) {
            d2ok.m23075h(typeParameter, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i2 = k.f36463k[typeParameter.mo23166s().ordinal()];
            if (i2 == 2) {
                sb.append("in ");
            } else if (i2 == 3) {
                sb.append("out ");
            }
            sb.append(typeParameter.getName());
            String string = sb.toString();
            d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public y2(@InterfaceC7395n Object obj, @InterfaceC7396q String name, @InterfaceC7396q kotlin.reflect.zurt variance, boolean z2) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(variance, "variance");
        this.f36459k = obj;
        this.f36461q = name;
        this.f36460n = variance;
        this.f36458g = z2;
    }

    public static /* synthetic */ void toq() {
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            if (d2ok.f7l8(this.f36459k, y2Var.f36459k) && d2ok.f7l8(getName(), y2Var.getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m23164g(@InterfaceC7396q List<? extends kotlin.reflect.t8r> upperBounds) {
        d2ok.m23075h(upperBounds, "upperBounds");
        if (this.f36462y == null) {
            this.f36462y = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    @Override // kotlin.reflect.InterfaceC6365i
    @InterfaceC7396q
    public String getName() {
        return this.f36461q;
    }

    @Override // kotlin.reflect.InterfaceC6365i
    @InterfaceC7396q
    public List<kotlin.reflect.t8r> getUpperBounds() {
        List list = this.f36462y;
        if (list != null) {
            return list;
        }
        List<kotlin.reflect.t8r> listLd6 = kotlin.collections.zurt.ld6(a98o.n7h(Object.class));
        this.f36462y = listLd6;
        return listLd6;
    }

    public int hashCode() {
        Object obj = this.f36459k;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.InterfaceC6365i
    /* JADX INFO: renamed from: n */
    public boolean mo23165n() {
        return this.f36458g;
    }

    @Override // kotlin.reflect.InterfaceC6365i
    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public kotlin.reflect.zurt mo23166s() {
        return this.f36460n;
    }

    @InterfaceC7396q
    public String toString() {
        return f36457s.m23167k(this);
    }
}
