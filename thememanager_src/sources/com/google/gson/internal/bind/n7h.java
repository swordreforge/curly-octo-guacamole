package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.C4923s;
import com.google.gson.InterfaceC4928z;
import com.google.gson.internal.C4909y;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: TypeAdapters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n7h {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final com.google.gson.fu4<StringBuilder> f68726a9;

    /* JADX INFO: renamed from: c */
    public static final com.google.gson.fu4<Locale> f27673c;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final InterfaceC4928z f68727cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final InterfaceC4928z f68728d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final com.google.gson.fu4<URL> f68729d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final com.google.gson.fu4<UUID> f68730dd;

    /* JADX INFO: renamed from: e */
    public static final InterfaceC4928z f27674e;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final com.google.gson.fu4<URI> f68731eqxt;

    /* JADX INFO: renamed from: f */
    public static final InterfaceC4928z f27675f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final InterfaceC4928z f68732f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final com.google.gson.fu4<Number> f68733fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final InterfaceC4928z f68734fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final InterfaceC4928z f68735fu4;

    /* JADX INFO: renamed from: g */
    public static final com.google.gson.fu4<Boolean> f27676g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final InterfaceC4928z f68736gvn7;

    /* JADX INFO: renamed from: h */
    public static final com.google.gson.fu4<AtomicBoolean> f27677h;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final com.google.gson.fu4<Calendar> f68737hyr;

    /* JADX INFO: renamed from: i */
    public static final com.google.gson.fu4<Number> f27678i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final InterfaceC4928z f68738jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final com.google.gson.fu4<StringBuffer> f68739jp0y;

    /* JADX INFO: renamed from: k */
    public static final com.google.gson.fu4<Class> f27679k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final com.google.gson.fu4<AtomicIntegerArray> f68740ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final InterfaceC4928z f68741kja0;

    /* JADX INFO: renamed from: l */
    public static final InterfaceC4928z f27680l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final InterfaceC4928z f68742ld6;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final InterfaceC4928z f68743lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final com.google.gson.fu4<InetAddress> f68744lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final com.google.gson.fu4<BigInteger> f68745mcp;

    /* JADX INFO: renamed from: n */
    public static final com.google.gson.fu4<Boolean> f27681n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final InterfaceC4928z f68746n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final com.google.gson.fu4<AtomicInteger> f68747n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final com.google.gson.fu4<Currency> f68748ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final com.google.gson.fu4<Number> f68749ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final InterfaceC4928z f68750o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final InterfaceC4928z f68751oc;

    /* JADX INFO: renamed from: p */
    public static final com.google.gson.fu4<Number> f27682p;

    /* JADX INFO: renamed from: q */
    public static final InterfaceC4928z f27683q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final InterfaceC4928z f68752qrj;

    /* JADX INFO: renamed from: r */
    public static final InterfaceC4928z f27684r;

    /* JADX INFO: renamed from: s */
    public static final InterfaceC4928z f27685s;

    /* JADX INFO: renamed from: t */
    public static final com.google.gson.fu4<BigDecimal> f27686t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final InterfaceC4928z f68753t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final InterfaceC4928z f68754toq;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final com.google.gson.fu4<com.google.gson.x2> f68755uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final InterfaceC4928z f68756vyq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final com.google.gson.fu4<String> f68757wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final com.google.gson.fu4<Number> f68758x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final InterfaceC4928z f68759x9kr;

    /* JADX INFO: renamed from: y */
    public static final com.google.gson.fu4<Number> f27687y;

    /* JADX INFO: renamed from: z */
    public static final com.google.gson.fu4<Character> f27688z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final com.google.gson.fu4<Number> f68760zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final com.google.gson.fu4<BitSet> f68761zy;

    /* JADX INFO: compiled from: TypeAdapters.java */
    class a9 extends com.google.gson.fu4<Boolean> {
        a9() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Boolean bool) throws IOException {
            c4926q.h7am(bool == null ? "null" : bool.toString());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Boolean mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return Boolean.valueOf(c4924k.nmn5());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class cdj extends com.google.gson.fu4<Currency> {
        cdj() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Currency currency) throws IOException {
            c4926q.h7am(currency.getCurrencyCode());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Currency mo7087n(C4924k c4924k) throws IOException {
            return Currency.getInstance(c4924k.nmn5());
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class d3 extends com.google.gson.fu4<AtomicInteger> {
        d3() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, AtomicInteger atomicInteger) throws IOException {
            c4926q.ltg8(atomicInteger.get());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public AtomicInteger mo7087n(C4924k c4924k) throws IOException {
            try {
                return new AtomicInteger(c4924k.mo17115f());
            } catch (NumberFormatException e2) {
                throw new com.google.gson.zurt(e2);
            }
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    private static final class eqxt<T extends Enum<T>> extends com.google.gson.fu4<T> {

        /* JADX INFO: renamed from: k */
        private final Map<String, T> f27689k = new HashMap();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Map<T, String> f68762toq = new HashMap();

        public eqxt(Class<T> cls) {
            try {
                for (T t2 : cls.getEnumConstants()) {
                    String strName = t2.name();
                    e5.zy zyVar = (e5.zy) cls.getField(strName).getAnnotation(e5.zy.class);
                    if (zyVar != null) {
                        strName = zyVar.value();
                        for (String str : zyVar.alternate()) {
                            this.f27689k.put(str, t2);
                        }
                    }
                    this.f27689k.put(strName, t2);
                    this.f68762toq.put(t2, strName);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, T t2) throws IOException {
            c4926q.h7am(t2 == null ? null : this.f68762toq.get(t2));
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public T mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return this.f27689k.get(c4924k.nmn5());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class f7l8 extends com.google.gson.fu4<String> {
        f7l8() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, String str) throws IOException {
            c4926q.h7am(str);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String mo7087n(C4924k c4924k) throws IOException {
            com.google.gson.stream.zy zyVarG1 = c4924k.g1();
            if (zyVarG1 != com.google.gson.stream.zy.NULL) {
                return zyVarG1 == com.google.gson.stream.zy.BOOLEAN ? Boolean.toString(c4924k.d2ok()) : c4924k.nmn5();
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class fn3e extends com.google.gson.fu4<com.google.gson.x2> {
        fn3e() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, com.google.gson.x2 x2Var) throws IOException {
            if (x2Var == null || x2Var.m17235i()) {
                c4926q.hyr();
                return;
            }
            if (x2Var.zurt()) {
                com.google.gson.ki kiVarN7h = x2Var.n7h();
                if (kiVarN7h.o1t()) {
                    c4926q.bek6(kiVarN7h.mo17213h());
                    return;
                } else if (kiVarN7h.fu4()) {
                    c4926q.ij(kiVarN7h.mo17215n());
                    return;
                } else {
                    c4926q.h7am(kiVarN7h.ki());
                    return;
                }
            }
            if (x2Var.t8r()) {
                c4926q.mo17110q();
                Iterator<com.google.gson.x2> it = x2Var.ld6().iterator();
                while (it.hasNext()) {
                    mo7089s(c4926q, it.next());
                }
                c4926q.ld6();
                return;
            }
            if (!x2Var.fn3e()) {
                throw new IllegalArgumentException("Couldn't write " + x2Var.getClass());
            }
            c4926q.mo17112y();
            for (Map.Entry<String, com.google.gson.x2> entry : x2Var.qrj().entrySet()) {
                c4926q.mo17111t(entry.getKey());
                mo7089s(c4926q, entry.getValue());
            }
            c4926q.x2();
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public com.google.gson.x2 mo7087n(C4924k c4924k) throws IOException {
            switch (mcp.f27693k[c4924k.g1().ordinal()]) {
                case 1:
                    return new com.google.gson.ki(new C4909y(c4924k.nmn5()));
                case 2:
                    return new com.google.gson.ki(Boolean.valueOf(c4924k.d2ok()));
                case 3:
                    return new com.google.gson.ki(c4924k.nmn5());
                case 4:
                    c4924k.a98o();
                    return com.google.gson.n7h.f27821k;
                case 5:
                    C4923s c4923s = new C4923s();
                    c4924k.mo17116k();
                    while (c4924k.ki()) {
                        c4923s.ni7(mo7087n(c4924k));
                    }
                    c4924k.ld6();
                    return c4923s;
                case 6:
                    com.google.gson.kja0 kja0Var = new com.google.gson.kja0();
                    c4924k.zy();
                    while (c4924k.ki()) {
                        kja0Var.ni7(c4924k.y9n(), mo7087n(c4924k));
                    }
                    c4924k.x2();
                    return kja0Var;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class fti extends com.google.gson.fu4<Number> {
        fti() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            c4926q.bek6(number);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Number mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            try {
                return Byte.valueOf((byte) c4924k.mo17115f());
            } catch (NumberFormatException e2) {
                throw new com.google.gson.zurt(e2);
            }
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class fu4 implements InterfaceC4928z {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C4922k f27690k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.google.gson.fu4 f27691q;

        fu4(C4922k c4922k, com.google.gson.fu4 fu4Var) {
            this.f27690k = c4922k;
            this.f27691q = fu4Var;
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> com.google.gson.fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            if (c4922k.equals(this.f27690k)) {
                return this.f27691q;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$g */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4879g extends com.google.gson.fu4<Character> {
        C4879g() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Character ch2) throws IOException {
            c4926q.h7am(ch2 == null ? null : String.valueOf(ch2));
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Character mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            String strNmn5 = c4924k.nmn5();
            if (strNmn5.length() == 1) {
                return Character.valueOf(strNmn5.charAt(0));
            }
            throw new com.google.gson.zurt("Expecting character, got: " + strNmn5);
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class gvn7 extends com.google.gson.fu4<Number> {
        gvn7() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            c4926q.bek6(number);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Number mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            try {
                return Integer.valueOf(c4924k.mo17115f());
            } catch (NumberFormatException e2) {
                throw new com.google.gson.zurt(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$h */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4880h extends com.google.gson.fu4<UUID> {
        C4880h() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, UUID uuid) throws IOException {
            c4926q.h7am(uuid == null ? null : uuid.toString());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public UUID mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return UUID.fromString(c4924k.nmn5());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$i */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4881i extends com.google.gson.fu4<Locale> {
        C4881i() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Locale locale) throws IOException {
            c4926q.h7am(locale == null ? null : locale.toString());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Locale mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c4924k.nmn5(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class jk extends com.google.gson.fu4<Boolean> {
        jk() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Boolean bool) throws IOException {
            c4926q.bwp(bool);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Boolean mo7087n(C4924k c4924k) throws IOException {
            com.google.gson.stream.zy zyVarG1 = c4924k.g1();
            if (zyVarG1 != com.google.gson.stream.zy.NULL) {
                return zyVarG1 == com.google.gson.stream.zy.STRING ? Boolean.valueOf(Boolean.parseBoolean(c4924k.nmn5())) : Boolean.valueOf(c4924k.d2ok());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class jp0y extends com.google.gson.fu4<Number> {
        jp0y() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            c4926q.bek6(number);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Number mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            try {
                return Short.valueOf((short) c4924k.mo17115f());
            } catch (NumberFormatException e2) {
                throw new com.google.gson.zurt(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$k */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4882k extends com.google.gson.fu4<AtomicIntegerArray> {
        C4882k() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c4926q.mo17110q();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                c4926q.ltg8(atomicIntegerArray.get(i2));
            }
            c4926q.ld6();
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray mo7087n(C4924k c4924k) throws IOException {
            ArrayList arrayList = new ArrayList();
            c4924k.mo17116k();
            while (c4924k.ki()) {
                try {
                    arrayList.add(Integer.valueOf(c4924k.mo17115f()));
                } catch (NumberFormatException e2) {
                    throw new com.google.gson.zurt(e2);
                }
            }
            c4924k.ld6();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class ki implements InterfaceC4928z {

        /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$ki$k */
        /* JADX INFO: compiled from: TypeAdapters.java */
        class C4883k extends com.google.gson.fu4<Timestamp> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ com.google.gson.fu4 f27692k;

            C4883k(com.google.gson.fu4 fu4Var) {
                this.f27692k = fu4Var;
            }

            @Override // com.google.gson.fu4
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public void mo7089s(C4926q c4926q, Timestamp timestamp) throws IOException {
                this.f27692k.mo7089s(c4926q, timestamp);
            }

            @Override // com.google.gson.fu4
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public Timestamp mo7087n(C4924k c4924k) throws IOException {
                Date date = (Date) this.f27692k.mo7087n(c4924k);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }
        }

        ki() {
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> com.google.gson.fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            if (c4922k.getRawType() != Timestamp.class) {
                return null;
            }
            return new C4883k(c4871g.cdj(Date.class));
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class kja0 extends com.google.gson.fu4<InetAddress> {
        kja0() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, InetAddress inetAddress) throws IOException {
            c4926q.h7am(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public InetAddress mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return InetAddress.getByName(c4924k.nmn5());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class ld6 extends com.google.gson.fu4<Class> {
        ld6() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Class mo7087n(C4924k c4924k) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    static /* synthetic */ class mcp {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f27693k;

        static {
            int[] iArr = new int[com.google.gson.stream.zy.values().length];
            f27693k = iArr;
            try {
                iArr[com.google.gson.stream.zy.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27693k[com.google.gson.stream.zy.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27693k[com.google.gson.stream.zy.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27693k[com.google.gson.stream.zy.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27693k[com.google.gson.stream.zy.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27693k[com.google.gson.stream.zy.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27693k[com.google.gson.stream.zy.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27693k[com.google.gson.stream.zy.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27693k[com.google.gson.stream.zy.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27693k[com.google.gson.stream.zy.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$n */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4884n extends com.google.gson.fu4<Number> {
        C4884n() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            c4926q.bek6(number);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Number mo7087n(C4924k c4924k) throws IOException {
            com.google.gson.stream.zy zyVarG1 = c4924k.g1();
            int i2 = mcp.f27693k[zyVarG1.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new C4909y(c4924k.nmn5());
            }
            if (i2 == 4) {
                c4924k.a98o();
                return null;
            }
            throw new com.google.gson.zurt("Expecting number, got: " + zyVarG1);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$n7h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C8019n7h extends com.google.gson.fu4<URI> {
        C8019n7h() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, URI uri) throws IOException {
            c4926q.h7am(uri == null ? null : uri.toASCIIString());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public URI mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            try {
                String strNmn5 = c4924k.nmn5();
                if ("null".equals(strNmn5)) {
                    return null;
                }
                return new URI(strNmn5);
            } catch (URISyntaxException e2) {
                throw new com.google.gson.qrj(e2);
            }
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class ni7 implements InterfaceC4928z {
        ni7() {
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> com.google.gson.fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            Class<? super T> rawType = c4922k.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new eqxt(rawType);
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class o1t implements InterfaceC4928z {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Class f27694k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ com.google.gson.fu4 f27695n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Class f27696q;

        o1t(Class cls, Class cls2, com.google.gson.fu4 fu4Var) {
            this.f27694k = cls;
            this.f27696q = cls2;
            this.f27695n = fu4Var;
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> com.google.gson.fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            Class<? super T> rawType = c4922k.getRawType();
            if (rawType == this.f27694k || rawType == this.f27696q) {
                return this.f27695n;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27696q.getName() + "+" + this.f27694k.getName() + ",adapter=" + this.f27695n + "]";
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class oc extends com.google.gson.fu4<AtomicBoolean> {
        oc() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, AtomicBoolean atomicBoolean) throws IOException {
            c4926q.ij(atomicBoolean.get());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean mo7087n(C4924k c4924k) throws IOException {
            return new AtomicBoolean(c4924k.d2ok());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$p */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4885p extends com.google.gson.fu4<StringBuilder> {
        C4885p() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, StringBuilder sb) throws IOException {
            c4926q.h7am(sb == null ? null : sb.toString());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public StringBuilder mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return new StringBuilder(c4924k.nmn5());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$q */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4886q extends com.google.gson.fu4<Number> {
        C4886q() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            c4926q.bek6(number);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Number mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return Double.valueOf(c4924k.hyr());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class qrj extends com.google.gson.fu4<URL> {
        qrj() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, URL url) throws IOException {
            c4926q.h7am(url == null ? null : url.toExternalForm());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public URL mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            String strNmn5 = c4924k.nmn5();
            if ("null".equals(strNmn5)) {
                return null;
            }
            return new URL(strNmn5);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$s */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4887s extends com.google.gson.fu4<BigInteger> {
        C4887s() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, BigInteger bigInteger) throws IOException {
            c4926q.bek6(bigInteger);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public BigInteger mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            try {
                return new BigInteger(c4924k.nmn5());
            } catch (NumberFormatException e2) {
                throw new com.google.gson.zurt(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$t */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4888t implements InterfaceC4928z {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Class f27697k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.google.gson.fu4 f27698q;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$t$k */
        /* JADX INFO: compiled from: TypeAdapters.java */
        class k<T1> extends com.google.gson.fu4<T1> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Class f27699k;

            k(Class cls) {
                this.f27699k = cls;
            }

            @Override // com.google.gson.fu4
            /* JADX INFO: renamed from: n */
            public T1 mo7087n(C4924k c4924k) throws IOException {
                T1 t1 = (T1) C4888t.this.f27698q.mo7087n(c4924k);
                if (t1 == null || this.f27699k.isInstance(t1)) {
                    return t1;
                }
                throw new com.google.gson.zurt("Expected a " + this.f27699k.getName() + " but was " + t1.getClass().getName());
            }

            @Override // com.google.gson.fu4
            /* JADX INFO: renamed from: s */
            public void mo7089s(C4926q c4926q, T1 t1) throws IOException {
                C4888t.this.f27698q.mo7089s(c4926q, t1);
            }
        }

        C4888t(Class cls, com.google.gson.fu4 fu4Var) {
            this.f27697k = cls;
            this.f27698q = fu4Var;
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T2> com.google.gson.fu4<T2> mo17108k(C4871g c4871g, C4922k<T2> c4922k) {
            Class<? super T2> rawType = c4922k.getRawType();
            if (this.f27697k.isAssignableFrom(rawType)) {
                return new k(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f27697k.getName() + ",adapter=" + this.f27698q + "]";
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class t8r extends com.google.gson.fu4<Calendar> {

        /* JADX INFO: renamed from: g */
        private static final String f27700g = "second";

        /* JADX INFO: renamed from: k */
        private static final String f27701k = "year";

        /* JADX INFO: renamed from: n */
        private static final String f27702n = "minute";

        /* JADX INFO: renamed from: q */
        private static final String f27703q = "hourOfDay";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final String f68765toq = "month";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f68766zy = "dayOfMonth";

        t8r() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Calendar calendar) throws IOException {
            if (calendar == null) {
                c4926q.hyr();
                return;
            }
            c4926q.mo17112y();
            c4926q.mo17111t("year");
            c4926q.ltg8(calendar.get(1));
            c4926q.mo17111t("month");
            c4926q.ltg8(calendar.get(2));
            c4926q.mo17111t(f68766zy);
            c4926q.ltg8(calendar.get(5));
            c4926q.mo17111t(f27703q);
            c4926q.ltg8(calendar.get(11));
            c4926q.mo17111t("minute");
            c4926q.ltg8(calendar.get(12));
            c4926q.mo17111t("second");
            c4926q.ltg8(calendar.get(13));
            c4926q.x2();
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Calendar mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            c4924k.zy();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (c4924k.g1() != com.google.gson.stream.zy.END_OBJECT) {
                String strY9n = c4924k.y9n();
                int iMo17115f = c4924k.mo17115f();
                if ("year".equals(strY9n)) {
                    i2 = iMo17115f;
                } else if ("month".equals(strY9n)) {
                    i3 = iMo17115f;
                } else if (f68766zy.equals(strY9n)) {
                    i4 = iMo17115f;
                } else if (f27703q.equals(strY9n)) {
                    i5 = iMo17115f;
                } else if ("minute".equals(strY9n)) {
                    i6 = iMo17115f;
                } else if ("second".equals(strY9n)) {
                    i7 = iMo17115f;
                }
            }
            c4924k.x2();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class toq extends com.google.gson.fu4<Number> {
        toq() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            c4926q.bek6(number);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Number mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            try {
                return Long.valueOf(c4924k.yz());
            } catch (NumberFormatException e2) {
                throw new com.google.gson.zurt(e2);
            }
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class wvg implements InterfaceC4928z {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Class f27704k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ com.google.gson.fu4 f27705n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Class f27706q;

        wvg(Class cls, Class cls2, com.google.gson.fu4 fu4Var) {
            this.f27704k = cls;
            this.f27706q = cls2;
            this.f27705n = fu4Var;
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> com.google.gson.fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            Class<? super T> rawType = c4922k.getRawType();
            if (rawType == this.f27704k || rawType == this.f27706q) {
                return this.f27705n;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27704k.getName() + "+" + this.f27706q.getName() + ",adapter=" + this.f27705n + "]";
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class x2 extends com.google.gson.fu4<StringBuffer> {
        x2() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, StringBuffer stringBuffer) throws IOException {
            c4926q.h7am(stringBuffer == null ? null : stringBuffer.toString());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public StringBuffer mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return new StringBuffer(c4924k.nmn5());
            }
            c4924k.a98o();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$y */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4889y extends com.google.gson.fu4<BigDecimal> {
        C4889y() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, BigDecimal bigDecimal) throws IOException {
            c4926q.bek6(bigDecimal);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
                c4924k.a98o();
                return null;
            }
            try {
                return new BigDecimal(c4924k.nmn5());
            } catch (NumberFormatException e2) {
                throw new com.google.gson.zurt(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n7h$z */
    /* JADX INFO: compiled from: TypeAdapters.java */
    class C4890z implements InterfaceC4928z {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Class f27707k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.google.gson.fu4 f27708q;

        C4890z(Class cls, com.google.gson.fu4 fu4Var) {
            this.f27707k = cls;
            this.f27708q = fu4Var;
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> com.google.gson.fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            if (c4922k.getRawType() == this.f27707k) {
                return this.f27708q;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27707k.getName() + ",adapter=" + this.f27708q + "]";
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class zurt extends com.google.gson.fu4<BitSet> {
        zurt() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, BitSet bitSet) throws IOException {
            c4926q.mo17110q();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                c4926q.ltg8(bitSet.get(i2) ? 1L : 0L);
            }
            c4926q.ld6();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet mo7087n(com.google.gson.stream.C4924k r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo17116k()
                com.google.gson.stream.zy r1 = r8.g1()
                r2 = 0
                r3 = r2
            Le:
                com.google.gson.stream.zy r4 = com.google.gson.stream.zy.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.internal.bind.n7h.mcp.f27693k
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.nmn5()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = r2
                goto L69
            L30:
                com.google.gson.zurt r8 = new com.google.gson.zurt
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.zurt r8 = new com.google.gson.zurt
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.d2ok()
                goto L69
            L63:
                int r1 = r8.mo17115f()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.zy r1 = r8.g1()
                goto Le
            L75:
                r8.ld6()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.n7h.zurt.mo7087n(com.google.gson.stream.k):java.util.BitSet");
        }
    }

    /* JADX INFO: compiled from: TypeAdapters.java */
    class zy extends com.google.gson.fu4<Number> {
        zy() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q c4926q, Number number) throws IOException {
            c4926q.bek6(number);
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Number mo7087n(C4924k c4924k) throws IOException {
            if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
                return Float.valueOf((float) c4924k.hyr());
            }
            c4924k.a98o();
            return null;
        }
    }

    static {
        com.google.gson.fu4<Class> fu4VarM17089q = new ld6().m17089q();
        f27679k = fu4VarM17089q;
        f68754toq = toq(Class.class, fu4VarM17089q);
        com.google.gson.fu4<BitSet> fu4VarM17089q2 = new zurt().m17089q();
        f68761zy = fu4VarM17089q2;
        f27683q = toq(BitSet.class, fu4VarM17089q2);
        jk jkVar = new jk();
        f27681n = jkVar;
        f27676g = new a9();
        f68732f7l8 = zy(Boolean.TYPE, Boolean.class, jkVar);
        fti ftiVar = new fti();
        f27687y = ftiVar;
        f27685s = zy(Byte.TYPE, Byte.class, ftiVar);
        jp0y jp0yVar = new jp0y();
        f27682p = jp0yVar;
        f68742ld6 = zy(Short.TYPE, Short.class, jp0yVar);
        gvn7 gvn7Var = new gvn7();
        f68758x2 = gvn7Var;
        f68752qrj = zy(Integer.TYPE, Integer.class, gvn7Var);
        com.google.gson.fu4<AtomicInteger> fu4VarM17089q3 = new d3().m17089q();
        f68747n7h = fu4VarM17089q3;
        f68741kja0 = toq(AtomicInteger.class, fu4VarM17089q3);
        com.google.gson.fu4<AtomicBoolean> fu4VarM17089q4 = new oc().m17089q();
        f27677h = fu4VarM17089q4;
        f68727cdj = toq(AtomicBoolean.class, fu4VarM17089q4);
        com.google.gson.fu4<AtomicIntegerArray> fu4VarM17089q5 = new C4882k().m17089q();
        f68740ki = fu4VarM17089q5;
        f68753t8r = toq(AtomicIntegerArray.class, fu4VarM17089q5);
        f27678i = new toq();
        f68733fn3e = new zy();
        f68760zurt = new C4886q();
        C4884n c4884n = new C4884n();
        f68749ni7 = c4884n;
        f68735fu4 = toq(Number.class, c4884n);
        C4879g c4879g = new C4879g();
        f27688z = c4879g;
        f68750o1t = zy(Character.TYPE, Character.class, c4879g);
        f7l8 f7l8Var = new f7l8();
        f68757wvg = f7l8Var;
        f27686t = new C4889y();
        f68745mcp = new C4887s();
        f68738jk = toq(String.class, f7l8Var);
        C4885p c4885p = new C4885p();
        f68726a9 = c4885p;
        f68734fti = toq(StringBuilder.class, c4885p);
        x2 x2Var = new x2();
        f68739jp0y = x2Var;
        f68736gvn7 = toq(StringBuffer.class, x2Var);
        qrj qrjVar = new qrj();
        f68729d3 = qrjVar;
        f68751oc = toq(URL.class, qrjVar);
        C8019n7h c8019n7h = new C8019n7h();
        f68731eqxt = c8019n7h;
        f68728d2ok = toq(URI.class, c8019n7h);
        kja0 kja0Var = new kja0();
        f68744lvui = kja0Var;
        f27684r = m17118n(InetAddress.class, kja0Var);
        C4880h c4880h = new C4880h();
        f68730dd = c4880h;
        f68759x9kr = toq(UUID.class, c4880h);
        com.google.gson.fu4<Currency> fu4VarM17089q6 = new cdj().m17089q();
        f68748ncyb = fu4VarM17089q6;
        f27680l = toq(Currency.class, fu4VarM17089q6);
        f68746n5r1 = new ki();
        t8r t8rVar = new t8r();
        f68737hyr = t8rVar;
        f27675f = m17119q(Calendar.class, GregorianCalendar.class, t8rVar);
        C4881i c4881i = new C4881i();
        f27673c = c4881i;
        f68743lrht = toq(Locale.class, c4881i);
        fn3e fn3eVar = new fn3e();
        f68755uv6 = fn3eVar;
        f68756vyq = m17118n(com.google.gson.x2.class, fn3eVar);
        f27674e = new ni7();
    }

    private n7h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: k */
    public static <TT> InterfaceC4928z m17117k(C4922k<TT> c4922k, com.google.gson.fu4<TT> fu4Var) {
        return new fu4(c4922k, fu4Var);
    }

    /* JADX INFO: renamed from: n */
    public static <T1> InterfaceC4928z m17118n(Class<T1> cls, com.google.gson.fu4<T1> fu4Var) {
        return new C4888t(cls, fu4Var);
    }

    /* JADX INFO: renamed from: q */
    public static <TT> InterfaceC4928z m17119q(Class<TT> cls, Class<? extends TT> cls2, com.google.gson.fu4<? super TT> fu4Var) {
        return new wvg(cls, cls2, fu4Var);
    }

    public static <TT> InterfaceC4928z toq(Class<TT> cls, com.google.gson.fu4<TT> fu4Var) {
        return new C4890z(cls, fu4Var);
    }

    public static <TT> InterfaceC4928z zy(Class<TT> cls, Class<TT> cls2, com.google.gson.fu4<? super TT> fu4Var) {
        return new o1t(cls, cls2, fu4Var);
    }
}
