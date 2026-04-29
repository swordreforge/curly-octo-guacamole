package okio.internal;

import cyoe.InterfaceC5979h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.collections.nn86;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.lv5;
import kotlin.nmn5;
import kotlin.qo;
import kotlin.text.C6452q;
import kotlin.text.a9;
import kotlin.text.fti;
import kotlin.was;
import mub.InterfaceC7396q;
import okio.AbstractC7549i;
import okio.C7565m;
import okio.fn3e;
import okio.n7h;
import okio.ncyb;
import okio.zurt;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"})
public final class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f94281f7l8 = 0;

    /* JADX INFO: renamed from: g */
    public static final int f43762g = 8;

    /* JADX INFO: renamed from: k */
    private static final int f43763k = 67324752;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f94282ld6 = 1;

    /* JADX INFO: renamed from: n */
    private static final int f43764n = 101075792;

    /* JADX INFO: renamed from: p */
    private static final long f43765p = 4294967295L;

    /* JADX INFO: renamed from: q */
    private static final int f43766q = 117853008;

    /* JADX INFO: renamed from: s */
    private static final int f43767s = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f94283toq = 33639248;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f94284x2 = 21589;

    /* JADX INFO: renamed from: y */
    private static final int f43768y = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f94285zy = 101010256;

    /* JADX INFO: renamed from: okio.internal.x2$k */
    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n1#1,328:1\n156#2:329\n*E\n"})
    public static final class C7556k<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            return kotlin.comparisons.f7l8.x2(((ld6) t2).m27695k(), ((ld6) t3).m27695k());
        }
    }

    /* JADX INFO: renamed from: okio.internal.x2$q */
    /* JADX INFO: compiled from: ZipFiles.kt */
    static final class C7557q extends AbstractC6308r implements InterfaceC5979h<Integer, Long, was> {
        final /* synthetic */ i1.C6299y<Long> $createdAtMillis;
        final /* synthetic */ i1.C6299y<Long> $lastAccessedAtMillis;
        final /* synthetic */ i1.C6299y<Long> $lastModifiedAtMillis;
        final /* synthetic */ n7h $this_readOrSkipLocalHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7557q(n7h n7hVar, i1.C6299y<Long> c6299y, i1.C6299y<Long> c6299y2, i1.C6299y<Long> c6299y3) {
            super(2);
            this.$this_readOrSkipLocalHeader = n7hVar;
            this.$lastModifiedAtMillis = c6299y;
            this.$lastAccessedAtMillis = c6299y2;
            this.$createdAtMillis = c6299y3;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ was invoke(Integer num, Long l2) throws IOException {
            invoke(num.intValue(), l2.longValue());
            return was.f36763k;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v12, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
        public final void invoke(int i2, long j2) throws IOException {
            if (i2 == x2.f94284x2) {
                if (j2 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                int i3 = this.$this_readOrSkipLocalHeader.readByte() & 255;
                boolean z2 = (i3 & 1) == 1;
                boolean z3 = (i3 & 2) == 2;
                boolean z5 = (i3 & 4) == 4;
                n7h n7hVar = this.$this_readOrSkipLocalHeader;
                long j3 = z2 ? 5L : 1L;
                if (z3) {
                    j3 += 4;
                }
                if (z5) {
                    j3 += 4;
                }
                if (j2 < j3) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z2) {
                    this.$lastModifiedAtMillis.element = Long.valueOf(((long) n7hVar.cv06()) * 1000);
                }
                if (z3) {
                    this.$lastAccessedAtMillis.element = Long.valueOf(((long) this.$this_readOrSkipLocalHeader.cv06()) * 1000);
                }
                if (z5) {
                    this.$createdAtMillis.element = Long.valueOf(((long) this.$this_readOrSkipLocalHeader.cv06()) * 1000);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: ZipFiles.kt */
    public static final class toq extends AbstractC6308r implements cyoe.x2<ld6, Boolean> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q ld6 it) {
            d2ok.m23075h(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: ZipFiles.kt */
    static final class zy extends AbstractC6308r implements InterfaceC5979h<Integer, Long, was> {
        final /* synthetic */ i1.f7l8 $compressedSize;
        final /* synthetic */ i1.C6295k $hasZip64Extra;
        final /* synthetic */ i1.f7l8 $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ i1.f7l8 $size;
        final /* synthetic */ n7h $this_readEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(i1.C6295k c6295k, long j2, i1.f7l8 f7l8Var, n7h n7hVar, i1.f7l8 f7l8Var2, i1.f7l8 f7l8Var3) {
            super(2);
            this.$hasZip64Extra = c6295k;
            this.$requiredZip64ExtraSize = j2;
            this.$size = f7l8Var;
            this.$this_readEntry = n7hVar;
            this.$compressedSize = f7l8Var2;
            this.$offset = f7l8Var3;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ was invoke(Integer num, Long l2) throws IOException {
            invoke(num.intValue(), l2.longValue());
            return was.f36763k;
        }

        public final void invoke(int i2, long j2) throws IOException {
            if (i2 == 1) {
                i1.C6295k c6295k = this.$hasZip64Extra;
                if (c6295k.element) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                c6295k.element = true;
                if (j2 < this.$requiredZip64ExtraSize) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                i1.f7l8 f7l8Var = this.$size;
                long jY2 = f7l8Var.element;
                if (jY2 == x2.f43765p) {
                    jY2 = this.$this_readEntry.y2();
                }
                f7l8Var.element = jY2;
                i1.f7l8 f7l8Var2 = this.$compressedSize;
                f7l8Var2.element = f7l8Var2.element == x2.f43765p ? this.$this_readEntry.y2() : 0L;
                i1.f7l8 f7l8Var3 = this.$offset;
                f7l8Var3.element = f7l8Var3.element == x2.f43765p ? this.$this_readEntry.y2() : 0L;
            }
        }
    }

    private static final C7558y f7l8(n7h n7hVar) throws IOException {
        int iBo = n7hVar.bo() & qo.f36486g;
        int iBo2 = n7hVar.bo() & qo.f36486g;
        long jBo = n7hVar.bo() & qo.f36486g;
        if (jBo != (n7hVar.bo() & qo.f36486g) || iBo != 0 || iBo2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        n7hVar.skip(4L);
        return new C7558y(jBo, f43765p & ((long) n7hVar.cv06()), n7hVar.bo() & qo.f36486g);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final ld6 m27742g(@InterfaceC7396q n7h n7hVar) throws IOException {
        i1.f7l8 f7l8Var;
        long j2;
        d2ok.m23075h(n7hVar, "<this>");
        int iCv06 = n7hVar.cv06();
        if (iCv06 != f94283toq) {
            throw new IOException("bad zip: expected " + zy(f94283toq) + " but was " + zy(iCv06));
        }
        n7hVar.skip(4L);
        int iBo = n7hVar.bo() & qo.f36486g;
        if ((iBo & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + zy(iBo));
        }
        int iBo2 = n7hVar.bo() & qo.f36486g;
        Long qVar = toq(n7hVar.bo() & qo.f36486g, n7hVar.bo() & qo.f36486g);
        long jCv06 = ((long) n7hVar.cv06()) & f43765p;
        i1.f7l8 f7l8Var2 = new i1.f7l8();
        f7l8Var2.element = ((long) n7hVar.cv06()) & f43765p;
        i1.f7l8 f7l8Var3 = new i1.f7l8();
        f7l8Var3.element = ((long) n7hVar.cv06()) & f43765p;
        int iBo3 = n7hVar.bo() & qo.f36486g;
        int iBo4 = n7hVar.bo() & qo.f36486g;
        int iBo5 = n7hVar.bo() & qo.f36486g;
        n7hVar.skip(8L);
        i1.f7l8 f7l8Var4 = new i1.f7l8();
        f7l8Var4.element = ((long) n7hVar.cv06()) & f43765p;
        String strMo27610d = n7hVar.mo27610d(iBo3);
        if (fti.vwb(strMo27610d, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (f7l8Var3.element == f43765p) {
            j2 = ((long) 8) + 0;
            f7l8Var = f7l8Var4;
        } else {
            f7l8Var = f7l8Var4;
            j2 = 0;
        }
        if (f7l8Var2.element == f43765p) {
            j2 += (long) 8;
        }
        i1.f7l8 f7l8Var5 = f7l8Var;
        if (f7l8Var5.element == f43765p) {
            j2 += (long) 8;
        }
        long j3 = j2;
        i1.C6295k c6295k = new i1.C6295k();
        m27748y(n7hVar, iBo4, new zy(c6295k, j3, f7l8Var3, n7hVar, f7l8Var2, f7l8Var5));
        if (j3 > 0 && !c6295k.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        return new ld6(ncyb.C7569k.m27824y(ncyb.f43814q, "/", false, 1, null).ni7(strMo27610d), a9.ga(strMo27610d, "/", false, 2, null), n7hVar.mo27610d(iBo5), jCv06, f7l8Var2.element, f7l8Var3.element, iBo2, qVar, f7l8Var5.element);
    }

    /* JADX INFO: renamed from: k */
    private static final Map<ncyb, ld6> m27743k(List<ld6> list) {
        ncyb ncybVarM27824y = ncyb.C7569k.m27824y(ncyb.f43814q, "/", false, 1, null);
        Map<ncyb, ld6> mapBf2 = nn86.bf2(nmn5.m23230k(ncybVarM27824y, new ld6(ncybVarM27824y, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (ld6 ld6Var : kotlin.collections.a9.zxa9(list, new C7556k())) {
            if (mapBf2.put(ld6Var.m27695k(), ld6Var) == null) {
                while (true) {
                    ncyb ncybVarFn3e = ld6Var.m27695k().fn3e();
                    if (ncybVarFn3e != null) {
                        ld6 ld6Var2 = mapBf2.get(ncybVarFn3e);
                        if (ld6Var2 != null) {
                            ld6Var2.toq().add(ld6Var.m27695k());
                            break;
                        }
                        ld6 ld6Var3 = new ld6(ncybVarFn3e, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        mapBf2.put(ncybVarFn3e, ld6Var3);
                        ld6Var3.toq().add(ld6Var.m27695k());
                        ld6Var = ld6Var3;
                    }
                }
            }
        }
        return mapBf2;
    }

    private static final C7558y ld6(n7h n7hVar, C7558y c7558y) throws IOException {
        n7hVar.skip(12L);
        int iCv06 = n7hVar.cv06();
        int iCv062 = n7hVar.cv06();
        long jY2 = n7hVar.y2();
        if (jY2 != n7hVar.y2() || iCv06 != 0 || iCv062 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        n7hVar.skip(8L);
        return new C7558y(jY2, n7hVar.y2(), c7558y.toq());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C7565m m27744n(ncyb ncybVar, zurt zurtVar, cyoe.x2 x2Var, int i2, Object obj) throws IOException {
        if ((i2 & 4) != 0) {
            x2Var = toq.INSTANCE;
        }
        return m27746q(ncybVar, zurtVar, x2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private static final fn3e m27745p(n7h n7hVar, fn3e fn3eVar) throws IOException {
        i1.C6299y c6299y = new i1.C6299y();
        c6299y.element = fn3eVar != null ? fn3eVar.f7l8() : 0;
        i1.C6299y c6299y2 = new i1.C6299y();
        i1.C6299y c6299y3 = new i1.C6299y();
        int iCv06 = n7hVar.cv06();
        if (iCv06 != f43763k) {
            throw new IOException("bad zip: expected " + zy(f43763k) + " but was " + zy(iCv06));
        }
        n7hVar.skip(2L);
        int iBo = n7hVar.bo() & qo.f36486g;
        if ((iBo & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + zy(iBo));
        }
        n7hVar.skip(18L);
        long jBo = ((long) n7hVar.bo()) & okhttp3.internal.ws.f7l8.f43390i;
        int iBo2 = n7hVar.bo() & qo.f36486g;
        n7hVar.skip(jBo);
        if (fn3eVar == null) {
            n7hVar.skip(iBo2);
            return null;
        }
        m27748y(n7hVar, iBo2, new C7557q(n7hVar, c6299y, c6299y2, c6299y3));
        return new fn3e(fn3eVar.ld6(), fn3eVar.m27618p(), null, fn3eVar.m27621y(), (Long) c6299y3.element, (Long) c6299y.element, (Long) c6299y2.element, null, 128, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final C7565m m27746q(@InterfaceC7396q ncyb zipPath, @InterfaceC7396q zurt fileSystem, @InterfaceC7396q cyoe.x2<? super ld6, Boolean> predicate) throws IOException {
        long size;
        long j2;
        n7h n7hVarM27592n;
        d2ok.m23075h(zipPath, "zipPath");
        d2ok.m23075h(fileSystem, "fileSystem");
        d2ok.m23075h(predicate, "predicate");
        AbstractC7549i abstractC7549iFti = fileSystem.fti(zipPath);
        try {
            size = abstractC7549iFti.size() - ((long) 22);
        } finally {
        }
        if (size < 0) {
            throw new IOException("not a zip: size=" + abstractC7549iFti.size());
        }
        long jMax = Math.max(size - 65536, 0L);
        do {
            n7h n7hVarM27592n2 = okio.d2ok.m27592n(abstractC7549iFti.ltg8(size));
            try {
                if (n7hVarM27592n2.cv06() == f94285zy) {
                    C7558y c7558yF7l8 = f7l8(n7hVarM27592n2);
                    String strMo27610d = n7hVarM27592n2.mo27610d(c7558yF7l8.toq());
                    n7hVarM27592n2.close();
                    long j3 = size - ((long) 20);
                    if (j3 > 0) {
                        n7hVarM27592n = okio.d2ok.m27592n(abstractC7549iFti.ltg8(j3));
                        try {
                            if (n7hVarM27592n.cv06() == f43766q) {
                                int iCv06 = n7hVarM27592n.cv06();
                                long jY2 = n7hVarM27592n.y2();
                                if (n7hVarM27592n.cv06() != 1 || iCv06 != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                n7hVarM27592n = okio.d2ok.m27592n(abstractC7549iFti.ltg8(jY2));
                                try {
                                    int iCv062 = n7hVarM27592n.cv06();
                                    if (iCv062 != f43764n) {
                                        throw new IOException("bad zip: expected " + zy(f43764n) + " but was " + zy(iCv062));
                                    }
                                    c7558yF7l8 = ld6(n7hVarM27592n, c7558yF7l8);
                                    was wasVar = was.f36763k;
                                    kotlin.io.zy.m23032k(n7hVarM27592n, null);
                                } finally {
                                }
                            }
                            was wasVar2 = was.f36763k;
                            kotlin.io.zy.m23032k(n7hVarM27592n, null);
                        } finally {
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    n7hVarM27592n = okio.d2ok.m27592n(abstractC7549iFti.ltg8(c7558yF7l8.m27749k()));
                    try {
                        long jZy = c7558yF7l8.zy();
                        for (j2 = 0; j2 < jZy; j2++) {
                            ld6 ld6VarM27742g = m27742g(n7hVarM27592n);
                            if (ld6VarM27742g.m27700y() >= c7558yF7l8.m27749k()) {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                            if (predicate.invoke(ld6VarM27742g).booleanValue()) {
                                arrayList.add(ld6VarM27742g);
                            }
                        }
                        was wasVar3 = was.f36763k;
                        kotlin.io.zy.m23032k(n7hVarM27592n, null);
                        C7565m c7565m = new C7565m(zipPath, fileSystem, m27743k(arrayList), strMo27610d);
                        kotlin.io.zy.m23032k(abstractC7549iFti, null);
                        return c7565m;
                    } finally {
                        try {
                            throw th;
                        } finally {
                            kotlin.io.zy.m23032k(n7hVarM27592n, th);
                        }
                    }
                }
                n7hVarM27592n2.close();
                size--;
            } catch (Throwable th) {
                n7hVarM27592n2.close();
                throw th;
            }
        } while (size >= jMax);
        throw new IOException("not a zip: end of central directory signature not found");
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final fn3e m27747s(@InterfaceC7396q n7h n7hVar, @InterfaceC7396q fn3e basicMetadata) throws IOException {
        d2ok.m23075h(n7hVar, "<this>");
        d2ok.m23075h(basicMetadata, "basicMetadata");
        fn3e fn3eVarM27745p = m27745p(n7hVar, basicMetadata);
        d2ok.qrj(fn3eVarM27745p);
        return fn3eVarM27745p;
    }

    private static final Long toq(int i2, int i3) {
        if (i3 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, (i3 >> 11) & 31, (i3 >> 5) & 63, (i3 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    public static final void x2(@InterfaceC7396q n7h n7hVar) throws IOException {
        d2ok.m23075h(n7hVar, "<this>");
        m27745p(n7hVar, null);
    }

    /* JADX INFO: renamed from: y */
    private static final void m27748y(n7h n7hVar, int i2, InterfaceC5979h<? super Integer, ? super Long, was> interfaceC5979h) throws IOException {
        long j2 = i2;
        while (j2 != 0) {
            if (j2 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iBo = n7hVar.bo() & qo.f36486g;
            long jBo = ((long) n7hVar.bo()) & okhttp3.internal.ws.f7l8.f43390i;
            long j3 = j2 - ((long) 4);
            if (j3 < jBo) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            n7hVar.dr(jBo);
            long size = n7hVar.mo27611g().size();
            interfaceC5979h.invoke(Integer.valueOf(iBo), Long.valueOf(jBo));
            long size2 = (n7hVar.mo27611g().size() + jBo) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iBo);
            }
            if (size2 > 0) {
                n7hVar.mo27611g().skip(size2);
            }
            j2 = j3 - jBo;
        }
    }

    private static final String zy(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String string = Integer.toString(i2, C6452q.m23604k(16));
        d2ok.kja0(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }
}
