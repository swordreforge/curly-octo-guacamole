package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.zurt;
import com.miui.maml.elements.ScreenElementArray;
import cyoe.InterfaceC5978g;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5980i;
import cyoe.InterfaceC5981k;
import cyoe.InterfaceC5982n;
import cyoe.InterfaceC5983p;
import cyoe.InterfaceC5984q;
import cyoe.InterfaceC5985s;
import cyoe.InterfaceC5986y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C6227f;
import kotlin.C6480z;
import kotlin.collections.C6140e;
import kotlin.reflect.InterfaceC6365i;
import kotlin.reflect.InterfaceC6374q;
import kotlin.reflect.InterfaceC6376s;
import l05.C6764k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class fn3e implements InterfaceC6374q<Object>, InterfaceC6293i {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final HashMap<String, String> f36397g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final Map<Class<? extends kotlin.zurt<?>>, Integer> f36398n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private static final Map<String, String> f36399p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C6290k f36400q = new C6290k(null);

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final HashMap<String, String> f36401s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final HashMap<String, String> f36402y;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Class<?> f36403k;

    /* JADX INFO: renamed from: kotlin.jvm.internal.fn3e$k */
    /* JADX INFO: compiled from: ClassReference.kt */
    @lv5({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class C6290k {
        private C6290k() {
        }

        public /* synthetic */ C6290k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final String m23102k(@InterfaceC7396q Class<?> jClass) {
            String str;
            d2ok.m23075h(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) fn3e.f36401s.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) fn3e.f36401s.get(componentType.getName())) != null) {
                str2 = str + ScreenElementArray.TAG_NAME;
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        @InterfaceC7395n
        public final String toq(@InterfaceC7396q Class<?> jClass) {
            String str;
            d2ok.m23075h(jClass, "jClass");
            String str2 = null;
            if (!jClass.isAnonymousClass()) {
                if (jClass.isLocalClass()) {
                    String name = jClass.getSimpleName();
                    Method enclosingMethod = jClass.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        d2ok.kja0(name, "name");
                        String strJre = kotlin.text.fti.jre(name, enclosingMethod.getName() + kotlin.text.eqxt.f81918zy, null, 2, null);
                        if (strJre != null) {
                            return strJre;
                        }
                    }
                    Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        d2ok.kja0(name, "name");
                        return kotlin.text.fti.vymi(name, kotlin.text.eqxt.f81918zy, null, 2, null);
                    }
                    d2ok.kja0(name, "name");
                    return kotlin.text.fti.jre(name, enclosingConstructor.getName() + kotlin.text.eqxt.f81918zy, null, 2, null);
                }
                if (!jClass.isArray()) {
                    String str3 = (String) fn3e.f36399p.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) fn3e.f36399p.get(componentType.getName())) != null) {
                    str2 = str + ScreenElementArray.TAG_NAME;
                }
                if (str2 == null) {
                    return ScreenElementArray.TAG_NAME;
                }
            }
            return str2;
        }

        public final boolean zy(@InterfaceC7395n Object obj, @InterfaceC7396q Class<?> jClass) {
            d2ok.m23075h(jClass, "jClass");
            Map map = fn3e.f36398n;
            d2ok.n7h(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return bo.m23064t(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = C6764k.f7l8(C6764k.m24705s(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i2 = 0;
        List listD2ok = kotlin.collections.ni7.d2ok(InterfaceC5981k.class, cyoe.x2.class, InterfaceC5979h.class, cyoe.cdj.class, cyoe.ki.class, cyoe.t8r.class, InterfaceC5980i.class, cyoe.fn3e.class, cyoe.zurt.class, cyoe.ni7.class, cyoe.toq.class, cyoe.zy.class, InterfaceC5984q.class, InterfaceC5982n.class, InterfaceC5978g.class, cyoe.f7l8.class, InterfaceC5986y.class, InterfaceC5985s.class, InterfaceC5983p.class, cyoe.ld6.class, cyoe.qrj.class, cyoe.n7h.class, cyoe.kja0.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(listD2ok, 10));
        for (Object obj : listD2ok) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            arrayList.add(kotlin.nmn5.m23230k((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f36398n = kotlin.collections.nn86.ikck(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put(zurt.toq.f1755g, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(zurt.toq.f47471zy, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f36397g = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f36402y = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        d2ok.kja0(collectionValues, "primitiveFqNames.values");
        for (String kotlinName : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            d2ok.kja0(kotlinName, "kotlinName");
            sb.append(kotlin.text.fti.je1q(kotlinName, '.', null, 2, null));
            sb.append("CompanionObject");
            C6227f c6227fM23230k = kotlin.nmn5.m23230k(sb.toString(), kotlinName + ".Companion");
            map3.put(c6227fM23230k.getFirst(), c6227fM23230k.getSecond());
        }
        for (Map.Entry<Class<? extends kotlin.zurt<?>>, Integer> entry : f36398n.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f36401s = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C6140e.m22479p(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), kotlin.text.fti.je1q((String) entry2.getValue(), '.', null, 2, null));
        }
        f36399p = linkedHashMap;
    }

    public fn3e(@InterfaceC7396q Class<?> jClass) {
        d2ok.m23075h(jClass, "jClass");
        this.f36403k = jClass;
    }

    @kotlin.yz(version = "1.3")
    public static /* synthetic */ void a9() {
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void d2ok() {
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void d3() {
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void dd() {
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void eqxt() {
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void fti() {
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void gvn7() {
    }

    private final Void jk() {
        throw new l05.cdj();
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void jp0y() {
    }

    @kotlin.yz(version = "1.4")
    public static /* synthetic */ void lvui() {
    }

    @kotlin.yz(version = "1.5")
    public static /* synthetic */ void ncyb() {
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void oc() {
    }

    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m23095r() {
    }

    @kotlin.yz(version = "1.1")
    public static /* synthetic */ void x9kr() {
    }

    @Override // kotlin.jvm.internal.InterfaceC6293i
    @InterfaceC7396q
    public Class<?> cdj() {
        return this.f36403k;
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof fn3e) && d2ok.f7l8(C6764k.f7l8(this), C6764k.f7l8((InterfaceC6374q) obj));
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7396q
    public List<InterfaceC6374q<? extends Object>> f7l8() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean fn3e() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.toq
    @InterfaceC7396q
    public List<Annotation> getAnnotations() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7396q
    public List<InterfaceC6365i> getTypeParameters() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7395n
    public kotlin.reflect.ni7 getVisibility() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: h */
    public boolean mo23097h(@InterfaceC7395n Object obj) {
        return f36400q.zy(obj, cdj());
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public int hashCode() {
        return C6764k.f7l8(this).hashCode();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean isAbstract() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean isFinal() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean isOpen() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q, kotlin.reflect.InterfaceC6380y
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public Collection<kotlin.reflect.zy<?>> mo23098k() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7395n
    public String ki() {
        return f36400q.m23102k(cdj());
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7396q
    public List<kotlin.reflect.t8r> ni7() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public Object mo23099p() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public Collection<InterfaceC6376s<Object>> mo23100q() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean qrj() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean t8r() {
        jk();
        throw new C6480z();
    }

    @InterfaceC7396q
    public String toString() {
        return cdj().toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean wvg() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    public boolean x2() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    /* JADX INFO: renamed from: y */
    public boolean mo23101y() {
        jk();
        throw new C6480z();
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7395n
    public String zurt() {
        return f36400q.toq(cdj());
    }

    @Override // kotlin.reflect.InterfaceC6374q
    @InterfaceC7396q
    public Collection<InterfaceC6374q<?>> zy() {
        jk();
        throw new C6480z();
    }
}
