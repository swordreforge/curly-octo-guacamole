package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4918n;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.internal.C4905q;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import com.google.gson.zurt;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.gson.internal.bind.s */
/* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4893s implements InterfaceC4928z {

    /* JADX INFO: renamed from: g */
    private final C4892q f27712g;

    /* JADX INFO: renamed from: k */
    private final com.google.gson.internal.zy f27713k;

    /* JADX INFO: renamed from: n */
    private final C4905q f27714n;

    /* JADX INFO: renamed from: q */
    private final InterfaceC4918n f27715q;

    /* JADX INFO: renamed from: y */
    private final com.google.gson.internal.reflect.toq f27716y = com.google.gson.internal.reflect.toq.m17184k();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.s$k */
    /* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
    class k extends zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ C4871g f68770f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ fu4 f27717g;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f27718n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Field f27720q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ boolean f27721s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4922k f27722y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, boolean z2, boolean z3, Field field, boolean z5, fu4 fu4Var, C4871g c4871g, C4922k c4922k, boolean z6) {
            super(str, z2, z3);
            this.f27720q = field;
            this.f27718n = z5;
            this.f27717g = fu4Var;
            this.f68770f7l8 = c4871g;
            this.f27722y = c4922k;
            this.f27721s = z6;
        }

        @Override // com.google.gson.internal.bind.C4893s.zy
        /* JADX INFO: renamed from: k */
        void mo17155k(C4924k c4924k, Object obj) throws IllegalAccessException, IOException {
            Object objMo7087n = this.f27717g.mo7087n(c4924k);
            if (objMo7087n == null && this.f27721s) {
                return;
            }
            this.f27720q.set(obj, objMo7087n);
        }

        @Override // com.google.gson.internal.bind.C4893s.zy
        void toq(C4926q c4926q, Object obj) throws IllegalAccessException, IOException {
            (this.f27718n ? this.f27717g : new qrj(this.f68770f7l8, this.f27717g, this.f27722y.getType())).mo7089s(c4926q, this.f27720q.get(obj));
        }

        @Override // com.google.gson.internal.bind.C4893s.zy
        public boolean zy(Object obj) throws IllegalAccessException, IOException {
            return this.f68772toq && this.f27720q.get(obj) != obj;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.s$toq */
    /* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
    public static final class toq<T> extends fu4<T> {

        /* JADX INFO: renamed from: k */
        private final com.google.gson.internal.ld6<T> f27723k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Map<String, zy> f68771toq;

        toq(com.google.gson.internal.ld6<T> ld6Var, Map<String, zy> map) {
            this.f27723k = ld6Var;
            this.f68771toq = map;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: n */
        public T mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            T tMo17167k = this.f27723k.mo17167k();
            try {
                c4924k.zy();
                while (c4924k.ki()) {
                    zy zyVar = this.f68771toq.get(c4924k.y9n());
                    if (zyVar == null || !zyVar.f68773zy) {
                        c4924k.h4b();
                    } else {
                        zyVar.mo17155k(c4924k, tMo17167k);
                    }
                }
                c4924k.x2();
                return tMo17167k;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new zurt(e3);
            }
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: s */
        public void mo7089s(C4926q c4926q, T t2) throws IOException {
            if (t2 == null) {
                c4926q.hyr();
                return;
            }
            c4926q.mo17112y();
            try {
                for (zy zyVar : this.f68771toq.values()) {
                    if (zyVar.zy(t2)) {
                        c4926q.mo17111t(zyVar.f27724k);
                        zyVar.toq(c4926q, t2);
                    }
                }
                c4926q.x2();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.s$zy */
    /* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
    static abstract class zy {

        /* JADX INFO: renamed from: k */
        final String f27724k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final boolean f68772toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final boolean f68773zy;

        protected zy(String str, boolean z2, boolean z3) {
            this.f27724k = str;
            this.f68772toq = z2;
            this.f68773zy = z3;
        }

        /* JADX INFO: renamed from: k */
        abstract void mo17155k(C4924k c4924k, Object obj) throws IllegalAccessException, IOException;

        abstract void toq(C4926q c4926q, Object obj) throws IllegalAccessException, IOException;

        abstract boolean zy(Object obj) throws IllegalAccessException, IOException;
    }

    public C4893s(com.google.gson.internal.zy zyVar, InterfaceC4918n interfaceC4918n, C4905q c4905q, C4892q c4892q) {
        this.f27713k = zyVar;
        this.f27715q = interfaceC4918n;
        this.f27714n = c4905q;
        this.f27712g = c4892q;
    }

    /* JADX INFO: renamed from: g */
    private List<String> m17152g(Field field) {
        e5.zy zyVar = (e5.zy) field.getAnnotation(e5.zy.class);
        if (zyVar == null) {
            return Collections.singletonList(this.f27715q.translateName(field));
        }
        String strValue = zyVar.value();
        String[] strArrAlternate = zyVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: n */
    private Map<String, zy> m17153n(C4871g c4871g, C4922k<?> c4922k, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = c4922k.getType();
        C4922k<?> c4922k2 = c4922k;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            int length = declaredFields.length;
            boolean z2 = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean zZy = zy(field, true);
                boolean zZy2 = zy(field, z2);
                if (zZy || zZy2) {
                    this.f27716y.toq(field);
                    Type typeM17197h = com.google.gson.internal.toq.m17197h(c4922k2.getType(), rawType, field.getGenericType());
                    List<String> listM17152g = m17152g(field);
                    int size = listM17152g.size();
                    zy zyVar = null;
                    ?? r2 = z2;
                    while (r2 < size) {
                        String str = listM17152g.get(r2);
                        boolean z3 = r2 != 0 ? z2 : zZy;
                        ?? r20 = r2;
                        zy zyVar2 = zyVar;
                        int i3 = size;
                        List<String> list = listM17152g;
                        Field field2 = field;
                        zyVar = zyVar2 == null ? (zy) linkedHashMap.put(str, toq(c4871g, field, str, C4922k.get(typeM17197h), z3, zZy2)) : zyVar2;
                        zZy = z3;
                        listM17152g = list;
                        size = i3;
                        field = field2;
                        z2 = false;
                        r2 = (r20 == true ? 1 : 0) + 1;
                    }
                    zy zyVar3 = zyVar;
                    if (zyVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + zyVar3.f27724k);
                    }
                }
                i2++;
                z2 = false;
            }
            c4922k2 = C4922k.get(com.google.gson.internal.toq.m17197h(c4922k2.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = c4922k2.getRawType();
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: q */
    static boolean m17154q(Field field, boolean z2, C4905q c4905q) {
        return (c4905q.m17178g(field.getType(), z2) || c4905q.qrj(field, z2)) ? false : true;
    }

    private zy toq(C4871g c4871g, Field field, String str, C4922k<?> c4922k, boolean z2, boolean z3) {
        boolean zM17182k = com.google.gson.internal.qrj.m17182k(c4922k.getRawType());
        e5.toq toqVar = (e5.toq) field.getAnnotation(e5.toq.class);
        fu4<?> qVar = toqVar != null ? this.f27712g.toq(this.f27713k, c4871g, c4922k, toqVar) : null;
        boolean z5 = qVar != null;
        if (qVar == null) {
            qVar = c4871g.m17097h(c4922k);
        }
        return new k(str, z2, z3, field, z5, qVar, c4871g, c4922k, zM17182k);
    }

    @Override // com.google.gson.InterfaceC4928z
    /* JADX INFO: renamed from: k */
    public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
        Class<? super T> rawType = c4922k.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new toq(this.f27713k.m17209k(c4922k), m17153n(c4871g, c4922k, rawType));
        }
        return null;
    }

    public boolean zy(Field field, boolean z2) {
        return m17154q(field, z2, this.f27714n);
    }
}
