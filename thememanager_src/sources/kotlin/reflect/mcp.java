package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
@kotlin.ki
final class mcp implements WildcardType, InterfaceC6381z {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final Type f36575k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final Type f36576q;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final C6370k f36574n = new C6370k(null);

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final mcp f36573g = new mcp(null, null);

    /* JADX INFO: renamed from: kotlin.reflect.mcp$k */
    /* JADX INFO: compiled from: TypesJVM.kt */
    public static final class C6370k {
        private C6370k() {
        }

        public /* synthetic */ C6370k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final mcp m23390k() {
            return mcp.f36573g;
        }
    }

    public mcp(@InterfaceC7395n Type type, @InterfaceC7395n Type type2) {
        this.f36575k = type;
        this.f36576q = type2;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @InterfaceC7396q
    public Type[] getLowerBounds() {
        Type type = this.f36576q;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.InterfaceC6381z
    @InterfaceC7396q
    public String getTypeName() {
        if (this.f36576q != null) {
            return "? super " + C6377t.m23407p(this.f36576q);
        }
        Type type = this.f36575k;
        if (type == null || d2ok.f7l8(type, Object.class)) {
            return "?";
        }
        return "? extends " + C6377t.m23407p(this.f36575k);
    }

    @Override // java.lang.reflect.WildcardType
    @InterfaceC7396q
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f36575k;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @InterfaceC7396q
    public String toString() {
        return getTypeName();
    }
}
