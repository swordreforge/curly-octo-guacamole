package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.internal.InterfaceC6244y;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.gvn7;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.lvui;
import kotlin.oc;
import kotlin.text.a9;
import kotlin.yz;
import l05.C6764k;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.reflect.t */
/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class C6377t {

    /* JADX INFO: renamed from: kotlin.reflect.t$k */
    /* JADX INFO: compiled from: TypesJVM.kt */
    public /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36581k;

        static {
            int[] iArr = new int[zurt.values().length];
            try {
                iArr[zurt.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zurt.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zurt.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36581k = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.t$toq */
    /* JADX INFO: compiled from: TypesJVM.kt */
    /* synthetic */ class toq extends gvn7 implements cyoe.x2<Class<?>, Class<?>> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // cyoe.x2
        public final Class<?> invoke(@InterfaceC7396q Class<?> p0) {
            d2ok.m23075h(p0, "p0");
            return p0.getComponentType();
        }
    }

    private static final Type f7l8(fn3e fn3eVar) {
        zurt zurtVarM23382y = fn3eVar.m23382y();
        if (zurtVarM23382y == null) {
            return mcp.f36574n.m23390k();
        }
        t8r t8rVarF7l8 = fn3eVar.f7l8();
        d2ok.qrj(t8rVarF7l8);
        int i2 = k.f36581k[zurtVarM23382y.ordinal()];
        if (i2 == 1) {
            return new mcp(null, zy(t8rVarF7l8, true));
        }
        if (i2 == 2) {
            return zy(t8rVarF7l8, true);
        }
        if (i2 == 3) {
            return new mcp(zy(t8rVarF7l8, true), null);
        }
        throw new oc();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final Type m23404g(@InterfaceC7396q t8r t8rVar) {
        Type typeLd6;
        d2ok.m23075h(t8rVar, "<this>");
        return (!(t8rVar instanceof lvui) || (typeLd6 = ((lvui) t8rVar).ld6()) == null) ? m23408q(t8rVar, false, 1, null) : typeLd6;
    }

    @kotlin.ki
    /* JADX INFO: renamed from: n */
    private static final Type m23406n(Class<?> cls, List<fn3e> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f7l8((fn3e) it.next()));
            }
            return new fu4(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(kotlin.collections.fu4.vyq(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f7l8((fn3e) it2.next()));
            }
            return new fu4(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeM23406n = m23406n(declaringClass, list.subList(length, list.size()));
        List<fn3e> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.fu4.vyq(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(f7l8((fn3e) it3.next()));
        }
        return new fu4(cls, typeM23406n, arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m23407p(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            kotlin.sequences.qrj qrjVarN7h = kotlin.sequences.t8r.n7h(type, toq.INSTANCE);
            name = ((Class) kotlin.sequences.fn3e.zkd(qrjVarN7h)).getName() + a9.ps(okhttp3.zurt.f43629h, kotlin.sequences.fn3e.yz(qrjVarN7h));
        } else {
            name = cls.getName();
        }
        d2ok.kja0(name, "{\n        if (type.isArr…   } else type.name\n    }");
        return name;
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ Type m23408q(t8r t8rVar, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return zy(t8rVar, z2);
    }

    @kotlin.ki
    /* JADX INFO: renamed from: s */
    private static /* synthetic */ void m23409s(fn3e fn3eVar) {
    }

    @InterfaceC6244y
    @kotlin.ki
    @yz(version = "1.4")
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m23410y(t8r t8rVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.ki
    public static final Type zy(t8r t8rVar, boolean z2) {
        f7l8 f7l8VarKja0 = t8rVar.kja0();
        if (f7l8VarKja0 instanceof InterfaceC6365i) {
            return new wvg((InterfaceC6365i) f7l8VarKja0);
        }
        if (!(f7l8VarKja0 instanceof InterfaceC6374q)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + t8rVar);
        }
        InterfaceC6374q interfaceC6374q = (InterfaceC6374q) f7l8VarKja0;
        Class clsF7l8 = z2 ? C6764k.f7l8(interfaceC6374q) : C6764k.m24702n(interfaceC6374q);
        List<fn3e> listMo23072z = t8rVar.mo23072z();
        if (listMo23072z.isEmpty()) {
            return clsF7l8;
        }
        if (!clsF7l8.isArray()) {
            return m23406n(clsF7l8, listMo23072z);
        }
        if (clsF7l8.getComponentType().isPrimitive()) {
            return clsF7l8;
        }
        fn3e fn3eVar = (fn3e) kotlin.collections.a9.c2(listMo23072z);
        if (fn3eVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + t8rVar);
        }
        zurt zurtVarM23380k = fn3eVar.m23380k();
        t8r qVar = fn3eVar.toq();
        int i2 = zurtVarM23380k == null ? -1 : k.f36581k[zurtVarM23380k.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return clsF7l8;
        }
        if (i2 != 2 && i2 != 3) {
            throw new oc();
        }
        d2ok.qrj(qVar);
        Type typeM23408q = m23408q(qVar, false, 1, null);
        return typeM23408q instanceof Class ? clsF7l8 : new C6366k(typeM23408q);
    }
}
