package okio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.internal.C7554q;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
public final class ncyb implements Comparable<ncyb> {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final String f43813n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C7569k f43814q = new C7569k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kja0 f43815k;

    /* JADX INFO: renamed from: okio.ncyb$k */
    /* JADX INFO: compiled from: Path.kt */
    public static final class C7569k {
        private C7569k() {
        }

        public /* synthetic */ C7569k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        public static /* synthetic */ ncyb f7l8(C7569k c7569k, File file, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return c7569k.toq(file, z2);
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ ncyb m27823s(C7569k c7569k, Path path, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return c7569k.m27825g(path, z2);
        }

        /* JADX INFO: renamed from: y */
        public static /* synthetic */ ncyb m27824y(C7569k c7569k, String str, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return c7569k.m27828q(str, z2);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        /* JADX INFO: renamed from: g */
        public final ncyb m27825g(@InterfaceC7396q Path path, boolean z2) {
            kotlin.jvm.internal.d2ok.m23075h(path, "<this>");
            return m27828q(path.toString(), z2);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        /* JADX INFO: renamed from: k */
        public final ncyb m27826k(@InterfaceC7396q File file) {
            kotlin.jvm.internal.d2ok.m23075h(file, "<this>");
            return f7l8(this, file, false, 1, null);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        /* JADX INFO: renamed from: n */
        public final ncyb m27827n(@InterfaceC7396q Path path) {
            kotlin.jvm.internal.d2ok.m23075h(path, "<this>");
            return m27823s(this, path, false, 1, null);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        /* JADX INFO: renamed from: q */
        public final ncyb m27828q(@InterfaceC7396q String str, boolean z2) {
            kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
            return C7554q.m27726t(str, z2);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        public final ncyb toq(@InterfaceC7396q File file, boolean z2) {
            kotlin.jvm.internal.d2ok.m23075h(file, "<this>");
            String string = file.toString();
            kotlin.jvm.internal.d2ok.kja0(string, "toString(...)");
            return m27828q(string, z2);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        public final ncyb zy(@InterfaceC7396q String str) {
            kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
            return m27824y(this, str, false, 1, null);
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.d2ok.kja0(separator, "separator");
        f43813n = separator;
    }

    public ncyb(@InterfaceC7396q kja0 bytes) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        this.f43815k = bytes;
    }

    public static /* synthetic */ ncyb a9(ncyb ncybVar, ncyb ncybVar2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return ncybVar.m27821t(ncybVar2, z2);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    public static final ncyb f7l8(@InterfaceC7396q String str, boolean z2) {
        return f43814q.m27828q(str, z2);
    }

    public static /* synthetic */ ncyb jk(ncyb ncybVar, kja0 kja0Var, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return ncybVar.o1t(kja0Var, z2);
    }

    public static /* synthetic */ ncyb mcp(ncyb ncybVar, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return ncybVar.fu4(str, z2);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    /* JADX INFO: renamed from: n */
    public static final ncyb m27815n(@InterfaceC7396q String str) {
        return f43814q.zy(str);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    /* JADX INFO: renamed from: p */
    public static final ncyb m27816p(@InterfaceC7396q Path path, boolean z2) {
        return f43814q.m27825g(path, z2);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    /* JADX INFO: renamed from: q */
    public static final ncyb m27817q(@InterfaceC7396q File file, boolean z2) {
        return f43814q.toq(file, z2);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    /* JADX INFO: renamed from: s */
    public static final ncyb m27818s(@InterfaceC7396q Path path) {
        return f43814q.m27827n(path);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    public static final ncyb zy(@InterfaceC7396q File file) {
        return f43814q.m27826k(file);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "name")
    public final String cdj() {
        return ki().utf8();
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof ncyb) && kotlin.jvm.internal.d2ok.f7l8(((ncyb) obj).ld6(), ld6());
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "parent")
    public final ncyb fn3e() {
        ncyb ncybVar;
        if (kotlin.jvm.internal.d2ok.f7l8(ld6(), C7554q.f43757q) || kotlin.jvm.internal.d2ok.f7l8(ld6(), C7554q.f43755k) || kotlin.jvm.internal.d2ok.f7l8(ld6(), C7554q.f94279toq) || C7554q.d2ok(this)) {
            return null;
        }
        int iD3 = C7554q.d3(this);
        if (iD3 != 2 || jp0y() == null) {
            if (iD3 == 1 && ld6().startsWith(C7554q.f94279toq)) {
                return null;
            }
            if (iD3 != -1 || jp0y() == null) {
                if (iD3 == -1) {
                    return new ncyb(C7554q.f43757q);
                }
                if (iD3 != 0) {
                    return new ncyb(kja0.substring$default(ld6(), 0, iD3, 1, null));
                }
                ncybVar = new ncyb(kja0.substring$default(ld6(), 0, 1, 1, null));
            } else {
                if (ld6().size() == 2) {
                    return null;
                }
                ncybVar = new ncyb(kja0.substring$default(ld6(), 0, 2, 1, null));
            }
        } else {
            if (ld6().size() == 3) {
                return null;
            }
            ncybVar = new ncyb(kja0.substring$default(ld6(), 0, 3, 1, null));
        }
        return ncybVar;
    }

    @InterfaceC7396q
    public final Path fti() {
        Path path = Paths.get(toString(), new String[0]);
        kotlin.jvm.internal.d2ok.kja0(path, "get(...)");
        return path;
    }

    @InterfaceC7396q
    public final ncyb fu4(@InterfaceC7396q String child, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(child, "child");
        return C7554q.fu4(this, C7554q.dd(new x2().lrht(child), false), z2);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m27819h() {
        return C7554q.lvui(this) == ld6().size();
    }

    public int hashCode() {
        return ld6().hashCode();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public final ncyb m27820i() {
        return f43814q.m27828q(toString(), true);
    }

    public final boolean isAbsolute() {
        return C7554q.lvui(this) != -1;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "volumeLetter")
    public final Character jp0y() {
        boolean z2 = false;
        if (kja0.indexOf$default(ld6(), C7554q.f43755k, 0, 2, (Object) null) != -1 || ld6().size() < 2 || ld6().getByte(1) != 58) {
            return null;
        }
        char c2 = (char) ld6().getByte(0);
        if (!('a' <= c2 && c2 < '{')) {
            if ('A' <= c2 && c2 < '[') {
                z2 = true;
            }
            if (!z2) {
                return null;
            }
        }
        return Character.valueOf(c2);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "nameBytes")
    public final kja0 ki() {
        int iD3 = C7554q.d3(this);
        return iD3 != -1 ? kja0.substring$default(ld6(), iD3 + 1, 0, 2, null) : (jp0y() == null || ld6().size() != 2) ? ld6() : kja0.EMPTY;
    }

    public final boolean kja0() {
        return C7554q.lvui(this) == -1;
    }

    @InterfaceC7396q
    public final kja0 ld6() {
        return this.f43815k;
    }

    @InterfaceC7396q
    public final List<kja0> n7h() {
        ArrayList arrayList = new ArrayList();
        int iLvui = C7554q.lvui(this);
        if (iLvui == -1) {
            iLvui = 0;
        } else if (iLvui < ld6().size() && ld6().getByte(iLvui) == 92) {
            iLvui++;
        }
        int size = ld6().size();
        int i2 = iLvui;
        while (iLvui < size) {
            if (ld6().getByte(iLvui) == 47 || ld6().getByte(iLvui) == 92) {
                arrayList.add(ld6().substring(i2, iLvui));
                i2 = iLvui + 1;
            }
            iLvui++;
        }
        if (i2 < ld6().size()) {
            arrayList.add(ld6().substring(i2, ld6().size()));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "resolve")
    public final ncyb ni7(@InterfaceC7396q String child) {
        kotlin.jvm.internal.d2ok.m23075h(child, "child");
        return C7554q.fu4(this, C7554q.dd(new x2().lrht(child), false), false);
    }

    @InterfaceC7396q
    public final ncyb o1t(@InterfaceC7396q kja0 child, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(child, "child");
        return C7554q.fu4(this, C7554q.dd(new x2().uc(child), false), z2);
    }

    @InterfaceC7396q
    public final List<String> qrj() {
        ArrayList arrayList = new ArrayList();
        int iLvui = C7554q.lvui(this);
        if (iLvui == -1) {
            iLvui = 0;
        } else if (iLvui < ld6().size() && ld6().getByte(iLvui) == 92) {
            iLvui++;
        }
        int size = ld6().size();
        int i2 = iLvui;
        while (iLvui < size) {
            if (ld6().getByte(iLvui) == 47 || ld6().getByte(iLvui) == 92) {
                arrayList.add(ld6().substring(i2, iLvui));
                i2 = iLvui + 1;
            }
            iLvui++;
        }
        if (i2 < ld6().size()) {
            arrayList.add(ld6().substring(i2, ld6().size()));
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.fu4.vyq(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((kja0) it.next()).utf8());
        }
        return arrayList2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public final ncyb m27821t(@InterfaceC7396q ncyb child, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(child, "child");
        return C7554q.fu4(this, child, z2);
    }

    @InterfaceC7396q
    public final File toFile() {
        return new File(toString());
    }

    @InterfaceC7396q
    public String toString() {
        return ld6().utf8();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(@InterfaceC7396q ncyb other) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return ld6().compareTo(other.ld6());
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "resolve")
    public final ncyb wvg(@InterfaceC7396q ncyb child) {
        kotlin.jvm.internal.d2ok.m23075h(child, "child");
        return C7554q.fu4(this, child, false);
    }

    @InterfaceC7395n
    public final ncyb x2() {
        int iLvui = C7554q.lvui(this);
        if (iLvui == -1) {
            return null;
        }
        return new ncyb(ld6().substring(0, iLvui));
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "resolve")
    /* JADX INFO: renamed from: z */
    public final ncyb m27822z(@InterfaceC7396q kja0 child) {
        kotlin.jvm.internal.d2ok.m23075h(child, "child");
        return C7554q.fu4(this, C7554q.dd(new x2().uc(child), false), false);
    }

    @InterfaceC7396q
    public final ncyb zurt(@InterfaceC7396q ncyb other) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        if (!kotlin.jvm.internal.d2ok.f7l8(x2(), other.x2())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<kja0> listN7h = n7h();
        List<kja0> listN7h2 = other.n7h();
        int iMin = Math.min(listN7h.size(), listN7h2.size());
        int i2 = 0;
        while (i2 < iMin && kotlin.jvm.internal.d2ok.f7l8(listN7h.get(i2), listN7h2.get(i2))) {
            i2++;
        }
        if (i2 == iMin && ld6().size() == other.ld6().size()) {
            return C7569k.m27824y(f43814q, ".", false, 1, null);
        }
        if (!(listN7h2.subList(i2, listN7h2.size()).indexOf(C7554q.f43756n) == -1)) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        x2 x2Var = new x2();
        kja0 kja0VarEqxt = C7554q.eqxt(other);
        if (kja0VarEqxt == null && (kja0VarEqxt = C7554q.eqxt(this)) == null) {
            kja0VarEqxt = C7554q.ncyb(f43813n);
        }
        int size = listN7h2.size();
        for (int i3 = i2; i3 < size; i3++) {
            x2Var.uc(C7554q.f43756n);
            x2Var.uc(kja0VarEqxt);
        }
        int size2 = listN7h.size();
        while (i2 < size2) {
            x2Var.uc(listN7h.get(i2));
            x2Var.uc(kja0VarEqxt);
            i2++;
        }
        return C7554q.dd(x2Var, false);
    }
}
