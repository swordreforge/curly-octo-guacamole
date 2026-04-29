package com.google.gson;

import com.google.gson.internal.C4905q;
import com.google.gson.internal.bind.C4875g;
import com.google.gson.internal.bind.C4876k;
import com.google.gson.internal.bind.C4878n;
import com.google.gson.internal.bind.C4891p;
import com.google.gson.internal.bind.C4892q;
import com.google.gson.internal.bind.C4893s;
import com.google.gson.internal.bind.C4896y;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4925n;
import com.google.gson.stream.C4926q;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: com.google.gson.g */
/* JADX INFO: compiled from: Gson.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4871g {

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    static final boolean f68702fu4 = false;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f68703jk = ")]}'\n";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final C4922k<?> f68704mcp = C4922k.get(Object.class);

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    static final boolean f68705ni7 = false;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static final boolean f68706o1t = false;

    /* JADX INFO: renamed from: t */
    static final boolean f27646t = false;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    static final boolean f68707wvg = false;

    /* JADX INFO: renamed from: z */
    static final boolean f27647z = true;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    static final boolean f68708zurt = false;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    final int f68709cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final InterfaceC4918n f68710f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    final List<InterfaceC4928z> f68711fn3e;

    /* JADX INFO: renamed from: g */
    final C4905q f27648g;

    /* JADX INFO: renamed from: h */
    final String f27649h;

    /* JADX INFO: renamed from: i */
    final List<InterfaceC4928z> f27650i;

    /* JADX INFO: renamed from: k */
    private final ThreadLocal<Map<C4922k<?>, g<?>>> f27651k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    final int f68712ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    final boolean f68713kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    final boolean f68714ld6;

    /* JADX INFO: renamed from: n */
    final List<InterfaceC4928z> f27652n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    final boolean f68715n7h;

    /* JADX INFO: renamed from: p */
    final boolean f27653p;

    /* JADX INFO: renamed from: q */
    private final C4892q f27654q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    final boolean f68716qrj;

    /* JADX INFO: renamed from: s */
    final boolean f27655s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    final ni7 f68717t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Map<C4922k<?>, fu4<?>> f68718toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    final boolean f68719x2;

    /* JADX INFO: renamed from: y */
    final Map<Type, InterfaceC4927y<?>> f27656y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.gson.internal.zy f68720zy;

    /* JADX INFO: renamed from: com.google.gson.g$g */
    /* JADX INFO: compiled from: Gson.java */
    static class g<T> extends fu4<T> {

        /* JADX INFO: renamed from: k */
        private fu4<T> f27657k;

        g() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: n */
        public T mo7087n(C4924k c4924k) throws IOException {
            fu4<T> fu4Var = this.f27657k;
            if (fu4Var != null) {
                return fu4Var.mo7087n(c4924k);
            }
            throw new IllegalStateException();
        }

        /* JADX INFO: renamed from: p */
        public void m17102p(fu4<T> fu4Var) {
            if (this.f27657k != null) {
                throw new AssertionError();
            }
            this.f27657k = fu4Var;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: s */
        public void mo7089s(C4926q c4926q, T t2) throws IOException {
            fu4<T> fu4Var = this.f27657k;
            if (fu4Var == null) {
                throw new IllegalStateException();
            }
            fu4Var.mo7089s(c4926q, t2);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.g$k */
    /* JADX INFO: compiled from: Gson.java */
    class k extends fu4<Number> {
        k() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            if (number == null) {
                c4926q.hyr();
            } else {
                C4871g.m17094q(number.doubleValue());
                c4926q.bek6(number);
            }
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Double mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return Double.valueOf(c4924k.hyr());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.g$n */
    /* JADX INFO: compiled from: Gson.java */
    class n extends fu4<AtomicLongArray> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ fu4 f27659k;

        n(fu4 fu4Var) {
            this.f27659k = fu4Var;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, AtomicLongArray atomicLongArray) throws IOException {
            c4926q.mo17110q();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.f27659k.mo7089s(c4926q, Long.valueOf(atomicLongArray.get(i2)));
            }
            c4926q.ld6();
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray mo7087n(C4924k c4924k) throws IOException {
            ArrayList arrayList = new ArrayList();
            c4924k.mo17116k();
            while (c4924k.ki()) {
                arrayList.add(Long.valueOf(((Number) this.f27659k.mo7087n(c4924k)).longValue()));
            }
            c4924k.ld6();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.g$q */
    /* JADX INFO: compiled from: Gson.java */
    class q extends fu4<AtomicLong> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ fu4 f27660k;

        q(fu4 fu4Var) {
            this.f27660k = fu4Var;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, AtomicLong atomicLong) throws IOException {
            this.f27660k.mo7089s(c4926q, Long.valueOf(atomicLong.get()));
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public AtomicLong mo7087n(C4924k c4924k) throws IOException {
            return new AtomicLong(((Number) this.f27660k.mo7087n(c4924k)).longValue());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.g$toq */
    /* JADX INFO: compiled from: Gson.java */
    class toq extends fu4<Number> {
        toq() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            if (number == null) {
                c4926q.hyr();
            } else {
                C4871g.m17094q(number.floatValue());
                c4926q.bek6(number);
            }
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Float mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return Float.valueOf((float) c4924k.hyr());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.g$zy */
    /* JADX INFO: compiled from: Gson.java */
    class zy extends fu4<Number> {
        zy() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            if (number == null) {
                c4926q.hyr();
            } else {
                c4926q.h7am(number.toString());
            }
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Number mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return Long.valueOf(c4924k.yz());
            }
            c4924k.a98o();
            return null;
        }
    }

    public C4871g() {
        this(C4905q.f27766h, EnumC4921q.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, ni7.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* JADX INFO: renamed from: i */
    private static fu4<Number> m17091i(ni7 ni7Var) {
        return ni7Var == ni7.DEFAULT ? com.google.gson.internal.bind.n7h.f27678i : new zy();
    }

    /* JADX INFO: renamed from: k */
    private static void m17092k(Object obj, C4924k c4924k) {
        if (obj != null) {
            try {
                if (c4924k.g1() == com.google.gson.stream.zy.END_DOCUMENT) {
                } else {
                    throw new qrj("JSON document was not fully consumed.");
                }
            } catch (C4925n e2) {
                throw new zurt(e2);
            } catch (IOException e3) {
                throw new qrj(e3);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private fu4<Number> m17093n(boolean z2) {
        return z2 ? com.google.gson.internal.bind.n7h.f68760zurt : new k();
    }

    /* JADX INFO: renamed from: q */
    static void m17094q(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private static fu4<AtomicLong> toq(fu4<Number> fu4Var) {
        return new q(fu4Var).m17089q();
    }

    /* JADX INFO: renamed from: y */
    private fu4<Number> m17095y(boolean z2) {
        return z2 ? com.google.gson.internal.bind.n7h.f68733fn3e : new toq();
    }

    private static fu4<AtomicLongArray> zy(fu4<Number> fu4Var) {
        return new n(fu4Var).m17089q();
    }

    public void a9(Object obj, Type type, C4926q c4926q) throws qrj {
        fu4 fu4VarM17097h = m17097h(C4922k.get(type));
        boolean zFu4 = c4926q.fu4();
        c4926q.nmn5(true);
        boolean zKi = c4926q.ki();
        c4926q.a98o(this.f68719x2);
        boolean zM17232h = c4926q.m17232h();
        c4926q.t8iq(this.f27655s);
        try {
            try {
                fu4VarM17097h.mo7089s(c4926q, obj);
            } catch (IOException e2) {
                throw new qrj(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            c4926q.nmn5(zFu4);
            c4926q.a98o(zKi);
            c4926q.t8iq(zM17232h);
        }
    }

    public <T> fu4<T> cdj(Class<T> cls) {
        return m17097h(C4922k.get((Class) cls));
    }

    public InterfaceC4918n f7l8() {
        return this.f68710f7l8;
    }

    public f7l8 fn3e() {
        return new f7l8(this);
    }

    public void fti(Object obj, Type type, Appendable appendable) throws qrj {
        try {
            a9(obj, type, ni7(com.google.gson.internal.n7h.zy(appendable)));
        } catch (IOException e2) {
            throw new qrj(e2);
        }
    }

    public boolean fu4() {
        return this.f27655s;
    }

    /* JADX INFO: renamed from: g */
    public C4905q m17096g() {
        return this.f27648g;
    }

    public x2 gvn7(Object obj, Type type) {
        C4875g c4875g = new C4875g();
        a9(obj, type, c4875g);
        return c4875g.ngy();
    }

    /* JADX INFO: renamed from: h */
    public <T> fu4<T> m17097h(C4922k<T> c4922k) {
        fu4<T> fu4Var = (fu4) this.f68718toq.get(c4922k == null ? f68704mcp : c4922k);
        if (fu4Var != null) {
            return fu4Var;
        }
        Map<C4922k<?>, g<?>> map = this.f27651k.get();
        boolean z2 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f27651k.set(map);
            z2 = true;
        }
        g<?> gVar = map.get(c4922k);
        if (gVar != null) {
            return gVar;
        }
        try {
            g<?> gVar2 = new g<>();
            map.put(c4922k, gVar2);
            Iterator<InterfaceC4928z> it = this.f27652n.iterator();
            while (it.hasNext()) {
                fu4<T> fu4VarMo17108k = it.next().mo17108k(this, c4922k);
                if (fu4VarMo17108k != null) {
                    gVar2.m17102p(fu4VarMo17108k);
                    this.f68718toq.put(c4922k, fu4VarMo17108k);
                    return fu4VarMo17108k;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + c4922k);
        } finally {
            map.remove(c4922k);
            if (z2) {
                this.f27651k.remove();
            }
        }
    }

    public void jk(Object obj, Appendable appendable) throws qrj {
        if (obj != null) {
            fti(obj, obj.getClass(), appendable);
        } else {
            mcp(n7h.f27821k, appendable);
        }
    }

    public x2 jp0y(Object obj) {
        return obj == null ? n7h.f27821k : gvn7(obj, obj.getClass());
    }

    public <T> fu4<T> ki(InterfaceC4928z interfaceC4928z, C4922k<T> c4922k) {
        if (!this.f27652n.contains(interfaceC4928z)) {
            interfaceC4928z = this.f27654q;
        }
        boolean z2 = false;
        for (InterfaceC4928z interfaceC4928z2 : this.f27652n) {
            if (z2) {
                fu4<T> fu4VarMo17108k = interfaceC4928z2.mo17108k(this, c4922k);
                if (fu4VarMo17108k != null) {
                    return fu4VarMo17108k;
                }
            } else if (interfaceC4928z2 == interfaceC4928z) {
                z2 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c4922k);
    }

    public <T> T kja0(String str, Type type) throws zurt {
        if (str == null) {
            return null;
        }
        return (T) qrj(new StringReader(str), type);
    }

    public <T> T ld6(C4924k c4924k, Type type) throws qrj, zurt {
        boolean zFu4 = c4924k.fu4();
        boolean z2 = true;
        c4924k.h7am(true);
        try {
            try {
                try {
                    c4924k.g1();
                    z2 = false;
                    T tMo7087n = m17097h(C4922k.get(type)).mo7087n(c4924k);
                    c4924k.h7am(zFu4);
                    return tMo7087n;
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                } catch (IllegalStateException e3) {
                    throw new zurt(e3);
                }
            } catch (EOFException e4) {
                if (!z2) {
                    throw new zurt(e4);
                }
                c4924k.h7am(zFu4);
                return null;
            } catch (IOException e6) {
                throw new zurt(e6);
            }
        } catch (Throwable th) {
            c4924k.h7am(zFu4);
            throw th;
        }
    }

    public void mcp(x2 x2Var, Appendable appendable) throws qrj {
        try {
            m17100t(x2Var, ni7(com.google.gson.internal.n7h.zy(appendable)));
        } catch (IOException e2) {
            throw new qrj(e2);
        }
    }

    public <T> T n7h(String str, Class<T> cls) throws zurt {
        return (T) com.google.gson.internal.qrj.m17183q(cls).cast(kja0(str, cls));
    }

    public C4926q ni7(Writer writer) throws IOException {
        if (this.f68714ld6) {
            writer.write(f68703jk);
        }
        C4926q c4926q = new C4926q(writer);
        if (this.f68716qrj) {
            c4926q.m17233x("  ");
        }
        c4926q.t8iq(this.f27655s);
        return c4926q;
    }

    public String o1t(Object obj) {
        return obj == null ? m17101z(n7h.f27821k) : wvg(obj, obj.getClass());
    }

    /* JADX INFO: renamed from: p */
    public <T> T m17098p(x2 x2Var, Type type) throws zurt {
        if (x2Var == null) {
            return null;
        }
        return (T) ld6(new C4878n(x2Var), type);
    }

    public <T> T qrj(Reader reader, Type type) throws qrj, zurt {
        C4924k c4924kZurt = zurt(reader);
        T t2 = (T) ld6(c4924kZurt, type);
        m17092k(t2, c4924kZurt);
        return t2;
    }

    /* JADX INFO: renamed from: s */
    public <T> T m17099s(x2 x2Var, Class<T> cls) throws zurt {
        return (T) com.google.gson.internal.qrj.m17183q(cls).cast(m17098p(x2Var, cls));
    }

    /* JADX INFO: renamed from: t */
    public void m17100t(x2 x2Var, C4926q c4926q) throws qrj {
        boolean zFu4 = c4926q.fu4();
        c4926q.nmn5(true);
        boolean zKi = c4926q.ki();
        c4926q.a98o(this.f68719x2);
        boolean zM17232h = c4926q.m17232h();
        c4926q.t8iq(this.f27655s);
        try {
            try {
                com.google.gson.internal.n7h.toq(x2Var, c4926q);
            } catch (IOException e2) {
                throw new qrj(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            c4926q.nmn5(zFu4);
            c4926q.a98o(zKi);
            c4926q.t8iq(zM17232h);
        }
    }

    public boolean t8r() {
        return this.f68719x2;
    }

    public String toString() {
        return "{serializeNulls:" + this.f27655s + ",factories:" + this.f27652n + ",instanceCreators:" + this.f68720zy + "}";
    }

    public String wvg(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        fti(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public <T> T x2(Reader reader, Class<T> cls) throws qrj, zurt {
        C4924k c4924kZurt = zurt(reader);
        Object objLd6 = ld6(c4924kZurt, cls);
        m17092k(objLd6, c4924kZurt);
        return (T) com.google.gson.internal.qrj.m17183q(cls).cast(objLd6);
    }

    /* JADX INFO: renamed from: z */
    public String m17101z(x2 x2Var) {
        StringWriter stringWriter = new StringWriter();
        mcp(x2Var, stringWriter);
        return stringWriter.toString();
    }

    public C4924k zurt(Reader reader) {
        C4924k c4924k = new C4924k(reader);
        c4924k.h7am(this.f68715n7h);
        return c4924k;
    }

    C4871g(C4905q c4905q, InterfaceC4918n interfaceC4918n, Map<Type, InterfaceC4927y<?>> map, boolean z2, boolean z3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, ni7 ni7Var, String str, int i2, int i3, List<InterfaceC4928z> list, List<InterfaceC4928z> list2, List<InterfaceC4928z> list3) {
        this.f27651k = new ThreadLocal<>();
        this.f68718toq = new ConcurrentHashMap();
        this.f27648g = c4905q;
        this.f68710f7l8 = interfaceC4918n;
        this.f27656y = map;
        com.google.gson.internal.zy zyVar = new com.google.gson.internal.zy(map);
        this.f68720zy = zyVar;
        this.f27655s = z2;
        this.f27653p = z3;
        this.f68714ld6 = z5;
        this.f68719x2 = z6;
        this.f68716qrj = z7;
        this.f68715n7h = z8;
        this.f68713kja0 = z9;
        this.f68717t8r = ni7Var;
        this.f27649h = str;
        this.f68709cdj = i2;
        this.f68712ki = i3;
        this.f27650i = list;
        this.f68711fn3e = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.n7h.f68756vyq);
        arrayList.add(C4896y.f68778toq);
        arrayList.add(c4905q);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.n7h.f68738jk);
        arrayList.add(com.google.gson.internal.bind.n7h.f68752qrj);
        arrayList.add(com.google.gson.internal.bind.n7h.f68732f7l8);
        arrayList.add(com.google.gson.internal.bind.n7h.f27685s);
        arrayList.add(com.google.gson.internal.bind.n7h.f68742ld6);
        fu4<Number> fu4VarM17091i = m17091i(ni7Var);
        arrayList.add(com.google.gson.internal.bind.n7h.zy(Long.TYPE, Long.class, fu4VarM17091i));
        arrayList.add(com.google.gson.internal.bind.n7h.zy(Double.TYPE, Double.class, m17093n(z9)));
        arrayList.add(com.google.gson.internal.bind.n7h.zy(Float.TYPE, Float.class, m17095y(z9)));
        arrayList.add(com.google.gson.internal.bind.n7h.f68735fu4);
        arrayList.add(com.google.gson.internal.bind.n7h.f68741kja0);
        arrayList.add(com.google.gson.internal.bind.n7h.f68727cdj);
        arrayList.add(com.google.gson.internal.bind.n7h.toq(AtomicLong.class, toq(fu4VarM17091i)));
        arrayList.add(com.google.gson.internal.bind.n7h.toq(AtomicLongArray.class, zy(fu4VarM17091i)));
        arrayList.add(com.google.gson.internal.bind.n7h.f68753t8r);
        arrayList.add(com.google.gson.internal.bind.n7h.f68750o1t);
        arrayList.add(com.google.gson.internal.bind.n7h.f68734fti);
        arrayList.add(com.google.gson.internal.bind.n7h.f68736gvn7);
        arrayList.add(com.google.gson.internal.bind.n7h.toq(BigDecimal.class, com.google.gson.internal.bind.n7h.f27686t));
        arrayList.add(com.google.gson.internal.bind.n7h.toq(BigInteger.class, com.google.gson.internal.bind.n7h.f68745mcp));
        arrayList.add(com.google.gson.internal.bind.n7h.f68751oc);
        arrayList.add(com.google.gson.internal.bind.n7h.f68728d2ok);
        arrayList.add(com.google.gson.internal.bind.n7h.f68759x9kr);
        arrayList.add(com.google.gson.internal.bind.n7h.f27680l);
        arrayList.add(com.google.gson.internal.bind.n7h.f68743lrht);
        arrayList.add(com.google.gson.internal.bind.n7h.f27684r);
        arrayList.add(com.google.gson.internal.bind.n7h.f27683q);
        arrayList.add(com.google.gson.internal.bind.zy.f68779toq);
        arrayList.add(com.google.gson.internal.bind.n7h.f27675f);
        arrayList.add(com.google.gson.internal.bind.ld6.f68725toq);
        arrayList.add(C4891p.f68767toq);
        arrayList.add(com.google.gson.internal.bind.n7h.f68746n5r1);
        arrayList.add(C4876k.f68723zy);
        arrayList.add(com.google.gson.internal.bind.n7h.f68754toq);
        arrayList.add(new com.google.gson.internal.bind.toq(zyVar));
        arrayList.add(new com.google.gson.internal.bind.f7l8(zyVar, z3));
        C4892q c4892q = new C4892q(zyVar);
        this.f27654q = c4892q;
        arrayList.add(c4892q);
        arrayList.add(com.google.gson.internal.bind.n7h.f27674e);
        arrayList.add(new C4893s(zyVar, interfaceC4918n, c4905q, c4892q));
        this.f27652n = Collections.unmodifiableList(arrayList);
    }
}
