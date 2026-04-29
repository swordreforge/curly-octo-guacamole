package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Splitter.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class d3 {

    /* JADX INFO: renamed from: k */
    private final AbstractC4265n f25626k;

    /* JADX INFO: renamed from: q */
    private final int f25627q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f68090toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC4239y f68091zy;

    /* JADX INFO: compiled from: Splitter.java */
    private static abstract class f7l8 extends com.google.common.base.toq<String> {

        /* JADX INFO: renamed from: g */
        final AbstractC4265n f25628g;

        /* JADX INFO: renamed from: n */
        final CharSequence f25629n;

        /* JADX INFO: renamed from: p */
        int f25630p;

        /* JADX INFO: renamed from: s */
        int f25631s = 0;

        /* JADX INFO: renamed from: y */
        final boolean f25632y;

        protected f7l8(d3 d3Var, CharSequence charSequence) {
            this.f25628g = d3Var.f25626k;
            this.f25632y = d3Var.f68090toq;
            this.f25630p = d3Var.f25627q;
            this.f25629n = charSequence;
        }

        /* JADX INFO: renamed from: g */
        abstract int mo15310g(int i2);

        /* JADX INFO: renamed from: n */
        abstract int mo15312n(int i2);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.toq
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public String mo15311k() {
            int iMo15310g;
            int i2 = this.f25631s;
            while (true) {
                int i3 = this.f25631s;
                if (i3 == -1) {
                    return toq();
                }
                iMo15310g = mo15310g(i3);
                if (iMo15310g == -1) {
                    iMo15310g = this.f25629n.length();
                    this.f25631s = -1;
                } else {
                    this.f25631s = mo15312n(iMo15310g);
                }
                int i4 = this.f25631s;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f25631s = i5;
                    if (i5 > this.f25629n.length()) {
                        this.f25631s = -1;
                    }
                } else {
                    while (i2 < iMo15310g && this.f25628g.mo15362t(this.f25629n.charAt(i2))) {
                        i2++;
                    }
                    while (iMo15310g > i2 && this.f25628g.mo15362t(this.f25629n.charAt(iMo15310g - 1))) {
                        iMo15310g--;
                    }
                    if (!this.f25632y || i2 != iMo15310g) {
                        break;
                    }
                    i2 = this.f25631s;
                }
            }
            int i6 = this.f25630p;
            if (i6 == 1) {
                iMo15310g = this.f25629n.length();
                this.f25631s = -1;
                while (iMo15310g > i2 && this.f25628g.mo15362t(this.f25629n.charAt(iMo15310g - 1))) {
                    iMo15310g--;
                }
            } else {
                this.f25630p = i6 - 1;
            }
            return this.f25629n.subSequence(i2, iMo15310g).toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.d3$g */
    /* JADX INFO: compiled from: Splitter.java */
    @InterfaceC7731k
    public static final class C4234g {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f68092zy = "Chunk [%s] is not a valid entry";

        /* JADX INFO: renamed from: k */
        private final d3 f25633k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final d3 f68093toq;

        /* synthetic */ C4234g(d3 d3Var, d3 d3Var2, C4235k c4235k) {
            this(d3Var, d3Var2);
        }

        /* JADX INFO: renamed from: k */
        public Map<String, String> m15314k(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f25633k.n7h(charSequence)) {
                Iterator itM15301h = this.f68093toq.m15301h(str);
                jk.fn3e(itM15301h.hasNext(), f68092zy, str);
                String str2 = (String) itM15301h.next();
                jk.fn3e(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                jk.fn3e(itM15301h.hasNext(), f68092zy, str);
                linkedHashMap.put(str2, (String) itM15301h.next());
                jk.fn3e(!itM15301h.hasNext(), f68092zy, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private C4234g(d3 d3Var, d3 d3Var2) {
            this.f25633k = d3Var;
            this.f68093toq = (d3) jk.a9(d3Var2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.d3$k */
    /* JADX INFO: compiled from: Splitter.java */
    static class C4235k implements InterfaceC4239y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC4265n f25634k;

        /* JADX INFO: renamed from: com.google.common.base.d3$k$k */
        /* JADX INFO: compiled from: Splitter.java */
        class k extends f7l8 {
            k(d3 d3Var, CharSequence charSequence) {
                super(d3Var, charSequence);
            }

            @Override // com.google.common.base.d3.f7l8
            /* JADX INFO: renamed from: g */
            int mo15310g(int i2) {
                return C4235k.this.f25634k.kja0(this.f25629n, i2);
            }

            @Override // com.google.common.base.d3.f7l8
            /* JADX INFO: renamed from: n */
            int mo15312n(int i2) {
                return i2 + 1;
            }
        }

        C4235k(AbstractC4265n abstractC4265n) {
            this.f25634k = abstractC4265n;
        }

        @Override // com.google.common.base.d3.InterfaceC4239y
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public f7l8 mo15315k(d3 d3Var, CharSequence charSequence) {
            return new k(d3Var, charSequence);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.d3$n */
    /* JADX INFO: compiled from: Splitter.java */
    class C4236n implements Iterable<String> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ CharSequence f25636k;

        C4236n(CharSequence charSequence) {
            this.f25636k = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return d3.this.m15301h(this.f25636k);
        }

        public String toString() {
            ni7 ni7VarM15433h = ni7.m15433h(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder sbM15436g = ni7VarM15433h.m15436g(sb, this);
            sbM15436g.append(']');
            return sbM15436g.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.d3$q */
    /* JADX INFO: compiled from: Splitter.java */
    static class C4237q implements InterfaceC4239y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f25638k;

        /* JADX INFO: renamed from: com.google.common.base.d3$q$k */
        /* JADX INFO: compiled from: Splitter.java */
        class k extends f7l8 {
            k(d3 d3Var, CharSequence charSequence) {
                super(d3Var, charSequence);
            }

            @Override // com.google.common.base.d3.f7l8
            /* JADX INFO: renamed from: g */
            public int mo15310g(int i2) {
                int i3 = i2 + C4237q.this.f25638k;
                if (i3 < this.f25629n.length()) {
                    return i3;
                }
                return -1;
            }

            @Override // com.google.common.base.d3.f7l8
            /* JADX INFO: renamed from: n */
            public int mo15312n(int i2) {
                return i2;
            }
        }

        C4237q(int i2) {
            this.f25638k = i2;
        }

        @Override // com.google.common.base.d3.InterfaceC4239y
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public f7l8 mo15315k(d3 d3Var, CharSequence charSequence) {
            return new k(d3Var, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    static class toq implements InterfaceC4239y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f25640k;

        /* JADX INFO: renamed from: com.google.common.base.d3$toq$k */
        /* JADX INFO: compiled from: Splitter.java */
        class C4238k extends f7l8 {
            C4238k(d3 d3Var, CharSequence charSequence) {
                super(d3Var, charSequence);
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // com.google.common.base.d3.f7l8
            /* JADX INFO: renamed from: g */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int mo15310g(int r6) {
                /*
                    r5 = this;
                    com.google.common.base.d3$toq r0 = com.google.common.base.d3.toq.this
                    java.lang.String r0 = r0.f25640k
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f25629n
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f25629n
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.google.common.base.d3$toq r4 = com.google.common.base.d3.toq.this
                    java.lang.String r4 = r4.f25640k
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.d3.toq.C4238k.mo15310g(int):int");
            }

            @Override // com.google.common.base.d3.f7l8
            /* JADX INFO: renamed from: n */
            public int mo15312n(int i2) {
                return i2 + toq.this.f25640k.length();
            }
        }

        toq(String str) {
            this.f25640k = str;
        }

        @Override // com.google.common.base.d3.InterfaceC4239y
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public f7l8 mo15315k(d3 d3Var, CharSequence charSequence) {
            return new C4238k(d3Var, charSequence);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.d3$y */
    /* JADX INFO: compiled from: Splitter.java */
    private interface InterfaceC4239y {
        /* JADX INFO: renamed from: k */
        Iterator<String> mo15315k(d3 d3Var, CharSequence charSequence);
    }

    /* JADX INFO: compiled from: Splitter.java */
    static class zy implements InterfaceC4239y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC4279y f25642k;

        /* JADX INFO: renamed from: com.google.common.base.d3$zy$k */
        /* JADX INFO: compiled from: Splitter.java */
        class C4240k extends f7l8 {

            /* JADX INFO: renamed from: h */
            final /* synthetic */ com.google.common.base.f7l8 f25643h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4240k(d3 d3Var, CharSequence charSequence, com.google.common.base.f7l8 f7l8Var) {
                super(d3Var, charSequence);
                this.f25643h = f7l8Var;
            }

            @Override // com.google.common.base.d3.f7l8
            /* JADX INFO: renamed from: g */
            public int mo15310g(int i2) {
                if (this.f25643h.zy(i2)) {
                    return this.f25643h.mo15333g();
                }
                return -1;
            }

            @Override // com.google.common.base.d3.f7l8
            /* JADX INFO: renamed from: n */
            public int mo15312n(int i2) {
                return this.f25643h.mo15334k();
            }
        }

        zy(AbstractC4279y abstractC4279y) {
            this.f25642k = abstractC4279y;
        }

        @Override // com.google.common.base.d3.InterfaceC4239y
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public f7l8 mo15315k(d3 d3Var, CharSequence charSequence) {
            return new C4240k(d3Var, charSequence, this.f25642k.matcher(charSequence));
        }
    }

    private d3(InterfaceC4239y interfaceC4239y) {
        this(interfaceC4239y, false, AbstractC4265n.jp0y(), Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public Iterator<String> m15301h(CharSequence charSequence) {
        return this.f68091zy.mo15315k(this, charSequence);
    }

    public static d3 ld6(String str) {
        jk.m15380n(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? m15307y(str.charAt(0)) : new d3(new toq(str));
    }

    /* JADX INFO: renamed from: n */
    public static d3 m15303n(int i2) {
        jk.m15380n(i2 > 0, "The length may not be less than 1");
        return new d3(new C4237q(i2));
    }

    /* JADX INFO: renamed from: p */
    private static d3 m15304p(AbstractC4279y abstractC4279y) {
        jk.fn3e(!abstractC4279y.matcher("").mo15336q(), "The pattern may not match the empty string: %s", abstractC4279y);
        return new d3(new zy(abstractC4279y));
    }

    @wlev.zy
    public static d3 qrj(String str) {
        return m15304p(mcp.m15407k(str));
    }

    /* JADX INFO: renamed from: s */
    public static d3 m15306s(AbstractC4265n abstractC4265n) {
        jk.a9(abstractC4265n);
        return new d3(new C4235k(abstractC4265n));
    }

    @wlev.zy
    public static d3 x2(Pattern pattern) {
        return m15304p(new zurt(pattern));
    }

    /* JADX INFO: renamed from: y */
    public static d3 m15307y(char c2) {
        return m15306s(AbstractC4265n.cdj(c2));
    }

    public d3 cdj() {
        return ki(AbstractC4265n.uv6());
    }

    public d3 f7l8() {
        return new d3(this.f68091zy, true, this.f25626k, this.f25627q);
    }

    @InterfaceC7731k
    public C4234g fn3e(String str) {
        return m15309i(ld6(str));
    }

    /* JADX INFO: renamed from: g */
    public d3 m15308g(int i2) {
        jk.ld6(i2 > 0, "must be greater than zero: %s", i2);
        return new d3(this.f68091zy, this.f68090toq, this.f25626k, i2);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: i */
    public C4234g m15309i(d3 d3Var) {
        return new C4234g(this, d3Var, null);
    }

    public d3 ki(AbstractC4265n abstractC4265n) {
        jk.a9(abstractC4265n);
        return new d3(this.f68091zy, this.f68090toq, abstractC4265n, this.f25627q);
    }

    public List<String> kja0(CharSequence charSequence) {
        jk.a9(charSequence);
        Iterator<String> itM15301h = m15301h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM15301h.hasNext()) {
            arrayList.add(itM15301h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Iterable<String> n7h(CharSequence charSequence) {
        jk.a9(charSequence);
        return new C4236n(charSequence);
    }

    @InterfaceC7731k
    public C4234g t8r(char c2) {
        return m15309i(m15307y(c2));
    }

    private d3(InterfaceC4239y interfaceC4239y, boolean z2, AbstractC4265n abstractC4265n, int i2) {
        this.f68091zy = interfaceC4239y;
        this.f68090toq = z2;
        this.f25626k = abstractC4265n;
        this.f25627q = i2;
    }
}
