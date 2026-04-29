package kotlin.reflect;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C6144h;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.gvn7;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
@kotlin.ki
final class fu4 implements ParameterizedType, InterfaceC6381z {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Class<?> f36569k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Type[] f36570n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final Type f36571q;

    /* JADX INFO: renamed from: kotlin.reflect.fu4$k */
    /* JADX INFO: compiled from: TypesJVM.kt */
    /* synthetic */ class C6362k extends gvn7 implements cyoe.x2<Type, String> {
        public static final C6362k INSTANCE = new C6362k();

        C6362k() {
            super(1, C6377t.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q Type p0) {
            d2ok.m23075h(p0, "p0");
            return C6377t.m23407p(p0);
        }
    }

    public fu4(@InterfaceC7396q Class<?> rawType, @InterfaceC7395n Type type, @InterfaceC7396q List<? extends Type> typeArguments) {
        d2ok.m23075h(rawType, "rawType");
        d2ok.m23075h(typeArguments, "typeArguments");
        this.f36569k = rawType;
        this.f36571q = type;
        this.f36570n = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (d2ok.f7l8(this.f36569k, parameterizedType.getRawType()) && d2ok.f7l8(this.f36571q, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @InterfaceC7396q
    public Type[] getActualTypeArguments() {
        return this.f36570n;
    }

    @Override // java.lang.reflect.ParameterizedType
    @InterfaceC7395n
    public Type getOwnerType() {
        return this.f36571q;
    }

    @Override // java.lang.reflect.ParameterizedType
    @InterfaceC7396q
    public Type getRawType() {
        return this.f36569k;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.InterfaceC6381z
    @InterfaceC7396q
    public String getTypeName() throws IOException {
        StringBuilder sb = new StringBuilder();
        Type type = this.f36571q;
        if (type != null) {
            sb.append(C6377t.m23407p(type));
            sb.append("$");
            sb.append(this.f36569k.getSimpleName());
        } else {
            sb.append(C6377t.m23407p(this.f36569k));
        }
        Type[] typeArr = this.f36570n;
        if (!(typeArr.length == 0)) {
            C6144h.anfo(typeArr, sb, (null & 2) != 0 ? ", " : null, (null & 4) != 0 ? "" : "<", (null & 8) == 0 ? ">" : "", (null & 16) != 0 ? -1 : 0, (null & 32) != 0 ? "..." : null, (null & 64) != 0 ? null : C6362k.INSTANCE);
        }
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.f36569k.hashCode();
        Type type = this.f36571q;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @InterfaceC7396q
    public String toString() {
        return getTypeName();
    }
}
