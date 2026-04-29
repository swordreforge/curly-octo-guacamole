package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC6147k;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.text.InterfaceC6439h;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes3.dex */
final class cdj implements InterfaceC6439h {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Matcher f36663k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private List<String> f36664q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final CharSequence f81886toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final n7h f81887zy;

    /* JADX INFO: renamed from: kotlin.text.cdj$k */
    /* JADX INFO: compiled from: Regex.kt */
    public static final class C6427k extends kotlin.collections.zy<String> {
        C6427k() {
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return m23509k((String) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public /* bridge */ int m23508g(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return cdj.this.m23504g().groupCount() + 1;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return zy((String) obj);
            }
            return -1;
        }

        /* JADX INFO: renamed from: k */
        public /* bridge */ boolean m23509k(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m23508g((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public String get(int i2) {
            String strGroup = cdj.this.m23504g().group(i2);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int zy(String str) {
            return super.indexOf(str);
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class toq extends AbstractC6147k<qrj> implements kja0 {

        /* JADX INFO: renamed from: kotlin.text.cdj$toq$k */
        /* JADX INFO: compiled from: Regex.kt */
        static final class C6428k extends AbstractC6308r implements cyoe.x2<Integer, qrj> {
            C6428k() {
                super(1);
            }

            @Override // cyoe.x2
            public /* bridge */ /* synthetic */ qrj invoke(Integer num) {
                return invoke(num.intValue());
            }

            @InterfaceC7395n
            public final qrj invoke(int i2) {
                return toq.this.get(i2);
            }
        }

        toq() {
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof qrj) {
                return m23510k((qrj) obj);
            }
            return false;
        }

        @Override // kotlin.text.n7h
        @InterfaceC7395n
        public qrj get(int i2) {
            kotlin.ranges.x2 x2VarM23624p = t8r.m23624p(cdj.this.m23504g(), i2);
            if (x2VarM23624p.mo2951k().intValue() < 0) {
                return null;
            }
            String strGroup = cdj.this.m23504g().group(i2);
            kotlin.jvm.internal.d2ok.kja0(strGroup, "matchResult.group(index)");
            return new qrj(strGroup, x2VarM23624p);
        }

        @Override // kotlin.collections.AbstractC6147k
        public int getSize() {
            return cdj.this.m23504g().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection, java.lang.Iterable, java.util.List
        @InterfaceC7396q
        public Iterator<qrj> iterator() {
            return kotlin.sequences.fn3e.b3e(kotlin.collections.a9.ebn(kotlin.collections.ni7.fti(this)), new C6428k()).iterator();
        }

        /* JADX INFO: renamed from: k */
        public /* bridge */ boolean m23510k(qrj qrjVar) {
            return super.contains(qrjVar);
        }

        @Override // kotlin.text.kja0
        @InterfaceC7395n
        /* JADX INFO: renamed from: q */
        public qrj mo23511q(@InterfaceC7396q String name) {
            kotlin.jvm.internal.d2ok.m23075h(name, "name");
            return kotlin.internal.qrj.f36293k.zy(cdj.this.m23504g(), name);
        }
    }

    public cdj(@InterfaceC7396q Matcher matcher, @InterfaceC7396q CharSequence input) {
        kotlin.jvm.internal.d2ok.m23075h(matcher, "matcher");
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        this.f36663k = matcher;
        this.f81886toq = input;
        this.f81887zy = new toq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final MatchResult m23504g() {
        return this.f36663k;
    }

    @Override // kotlin.text.InterfaceC6439h
    @InterfaceC7396q
    public String getValue() {
        String strGroup = m23504g().group();
        kotlin.jvm.internal.d2ok.kja0(strGroup, "matchResult.group()");
        return strGroup;
    }

    @Override // kotlin.text.InterfaceC6439h
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public InterfaceC6439h.toq mo23506k() {
        return InterfaceC6439h.k.m23529k(this);
    }

    @Override // kotlin.text.InterfaceC6439h
    @InterfaceC7395n
    public InterfaceC6439h next() {
        int iEnd = m23504g().end() + (m23504g().end() == m23504g().start() ? 1 : 0);
        if (iEnd > this.f81886toq.length()) {
            return null;
        }
        Matcher matcher = this.f36663k.pattern().matcher(this.f81886toq);
        kotlin.jvm.internal.d2ok.kja0(matcher, "matcher.pattern().matcher(input)");
        return t8r.m23621g(matcher, iEnd, this.f81886toq);
    }

    @Override // kotlin.text.InterfaceC6439h
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public n7h mo23507q() {
        return this.f81887zy;
    }

    @Override // kotlin.text.InterfaceC6439h
    @InterfaceC7396q
    public List<String> toq() {
        if (this.f36664q == null) {
            this.f36664q = new C6427k();
        }
        List<String> list = this.f36664q;
        kotlin.jvm.internal.d2ok.qrj(list);
        return list;
    }

    @Override // kotlin.text.InterfaceC6439h
    @InterfaceC7396q
    public kotlin.ranges.x2 zy() {
        return t8r.m23626s(m23504g());
    }
}
