package okio.internal;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6163t;
import kotlin.collections.a9;
import kotlin.collections.fu4;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.kja0;
import okio.ncyb;

/* JADX INFO: renamed from: okio.internal.q */
/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n59#1,22:407\n209#1:433\n209#1:434\n1549#2:429\n1620#2,3:430\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n53#1:407,22\n199#1:433\n204#1:434\n53#1:429\n53#1:430,3\n*E\n"})
@InterfaceC6769y(name = "-Path")
public final class C7554q {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final kja0 f43755k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final kja0 f43756n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final kja0 f43757q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final kja0 f94279toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final kja0 f94280zy;

    static {
        kja0.C7563k c7563k = kja0.Companion;
        f43755k = c7563k.x2("/");
        f94279toq = c7563k.x2("\\");
        f94280zy = c7563k.x2("/\\");
        f43757q = c7563k.x2(".");
        f43756n = c7563k.x2("..");
    }

    private static /* synthetic */ void a9() {
    }

    @InterfaceC7396q
    public static final kja0 cdj(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        int iD3 = d3(ncybVar);
        return iD3 != -1 ? kja0.substring$default(ncybVar.ld6(), iD3 + 1, 0, 2, null) : (ncybVar.jp0y() == null || ncybVar.ld6().size() != 2) ? ncybVar.ld6() : kja0.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d2ok(ncyb ncybVar) {
        return ncybVar.ld6().endsWith(f43756n) && (ncybVar.ld6().size() == 2 || ncybVar.ld6().rangeEquals(ncybVar.ld6().size() + (-3), f43755k, 0, 1) || ncybVar.ld6().rangeEquals(ncybVar.ld6().size() + (-3), f94279toq, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d3(ncyb ncybVar) {
        int iLastIndexOf$default = kja0.lastIndexOf$default(ncybVar.ld6(), f43755k, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : kja0.lastIndexOf$default(ncybVar.ld6(), f94279toq, 0, 2, (Object) null);
    }

    @InterfaceC7396q
    public static final ncyb dd(@InterfaceC7396q okio.x2 x2Var, boolean z2) throws EOFException {
        kja0 kja0Var;
        kja0 kja0VarFnq8;
        d2ok.m23075h(x2Var, "<this>");
        okio.x2 x2Var2 = new okio.x2();
        kja0 kja0VarX9kr = null;
        int i2 = 0;
        while (true) {
            if (!x2Var.vyq(0L, f43755k)) {
                kja0Var = f94279toq;
                if (!x2Var.vyq(0L, kja0Var)) {
                    break;
                }
            }
            byte b2 = x2Var.readByte();
            if (kja0VarX9kr == null) {
                kja0VarX9kr = x9kr(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && d2ok.f7l8(kja0VarX9kr, kja0Var);
        if (z3) {
            d2ok.qrj(kja0VarX9kr);
            x2Var2.uc(kja0VarX9kr);
            x2Var2.uc(kja0VarX9kr);
        } else if (i2 > 0) {
            d2ok.qrj(kja0VarX9kr);
            x2Var2.uc(kja0VarX9kr);
        } else {
            long jD3 = x2Var.d3(f94280zy);
            if (kja0VarX9kr == null) {
                kja0VarX9kr = jD3 == -1 ? ncyb(ncyb.f43813n) : x9kr(x2Var.g1(jD3));
            }
            if (m27724r(x2Var, kja0VarX9kr)) {
                if (jD3 == 2) {
                    x2Var2.mo26936j(x2Var, 3L);
                } else {
                    x2Var2.mo26936j(x2Var, 2L);
                }
            }
        }
        boolean z5 = x2Var2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!x2Var.py()) {
            long jD32 = x2Var.d3(f94280zy);
            if (jD32 == -1) {
                kja0VarFnq8 = x2Var.uj2j();
            } else {
                kja0VarFnq8 = x2Var.fnq8(jD32);
                x2Var.readByte();
            }
            kja0 kja0Var2 = f43756n;
            if (d2ok.f7l8(kja0VarFnq8, kja0Var2)) {
                if (!z5 || !arrayList.isEmpty()) {
                    if (!z2 || (!z5 && (arrayList.isEmpty() || d2ok.f7l8(a9.wwp(arrayList), kja0Var2)))) {
                        arrayList.add(kja0VarFnq8);
                    } else if (!z3 || arrayList.size() != 1) {
                        C6163t.was(arrayList);
                    }
                }
            } else if (!d2ok.f7l8(kja0VarFnq8, f43757q) && !d2ok.f7l8(kja0VarFnq8, kja0.EMPTY)) {
                arrayList.add(kja0VarFnq8);
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 > 0) {
                x2Var2.uc(kja0VarX9kr);
            }
            x2Var2.uc((kja0) arrayList.get(i3));
        }
        if (x2Var2.size() == 0) {
            x2Var2.uc(f43757q);
        }
        return new ncyb(x2Var2.uj2j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kja0 eqxt(ncyb ncybVar) {
        kja0 kja0VarLd6 = ncybVar.ld6();
        kja0 kja0Var = f43755k;
        if (kja0.indexOf$default(kja0VarLd6, kja0Var, 0, 2, (Object) null) != -1) {
            return kja0Var;
        }
        kja0 kja0VarLd62 = ncybVar.ld6();
        kja0 kja0Var2 = f94279toq;
        if (kja0.indexOf$default(kja0VarLd62, kja0Var2, 0, 2, (Object) null) != -1) {
            return kja0Var2;
        }
        return null;
    }

    @InterfaceC7396q
    public static final ncyb fn3e(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q String child, boolean z2) {
        d2ok.m23075h(ncybVar, "<this>");
        d2ok.m23075h(child, "child");
        return fu4(ncybVar, dd(new okio.x2().lrht(child), false), z2);
    }

    private static /* synthetic */ void fti() {
    }

    @InterfaceC7396q
    public static final ncyb fu4(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q ncyb child, boolean z2) {
        d2ok.m23075h(ncybVar, "<this>");
        d2ok.m23075h(child, "child");
        if (child.isAbsolute() || child.jp0y() != null) {
            return child;
        }
        kja0 kja0VarEqxt = eqxt(ncybVar);
        if (kja0VarEqxt == null && (kja0VarEqxt = eqxt(child)) == null) {
            kja0VarEqxt = ncyb(ncyb.f43813n);
        }
        okio.x2 x2Var = new okio.x2();
        x2Var.uc(ncybVar.ld6());
        if (x2Var.size() > 0) {
            x2Var.uc(kja0VarEqxt);
        }
        x2Var.uc(child.ld6());
        return dd(x2Var, z2);
    }

    private static /* synthetic */ void gvn7() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final String m27718h(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        return ncybVar.ki().utf8();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public static final ncyb m27719i(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q ncyb other) {
        d2ok.m23075h(ncybVar, "<this>");
        d2ok.m23075h(other, "other");
        if (!d2ok.f7l8(ncybVar.x2(), other.x2())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + ncybVar + " and " + other).toString());
        }
        List<kja0> listN7h = ncybVar.n7h();
        List<kja0> listN7h2 = other.n7h();
        int iMin = Math.min(listN7h.size(), listN7h2.size());
        int i2 = 0;
        while (i2 < iMin && d2ok.f7l8(listN7h.get(i2), listN7h2.get(i2))) {
            i2++;
        }
        if (i2 == iMin && ncybVar.ld6().size() == other.ld6().size()) {
            return ncyb.C7569k.m27824y(ncyb.f43814q, ".", false, 1, null);
        }
        if (!(listN7h2.subList(i2, listN7h2.size()).indexOf(f43756n) == -1)) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + ncybVar + " and " + other).toString());
        }
        okio.x2 x2Var = new okio.x2();
        kja0 kja0VarEqxt = eqxt(other);
        if (kja0VarEqxt == null && (kja0VarEqxt = eqxt(ncybVar)) == null) {
            kja0VarEqxt = ncyb(ncyb.f43813n);
        }
        int size = listN7h2.size();
        for (int i3 = i2; i3 < size; i3++) {
            x2Var.uc(f43756n);
            x2Var.uc(kja0VarEqxt);
        }
        int size2 = listN7h.size();
        while (i2 < size2) {
            x2Var.uc(listN7h.get(i2));
            x2Var.uc(kja0VarEqxt);
            i2++;
        }
        return dd(x2Var, false);
    }

    @InterfaceC7395n
    public static final Character jk(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        boolean z2 = false;
        if (kja0.indexOf$default(ncybVar.ld6(), f43755k, 0, 2, (Object) null) != -1 || ncybVar.ld6().size() < 2 || ncybVar.ld6().getByte(1) != 58) {
            return null;
        }
        char c2 = (char) ncybVar.ld6().getByte(0);
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

    private static /* synthetic */ void jp0y() {
    }

    @InterfaceC7396q
    public static final ncyb ki(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        return ncyb.f43814q.m27828q(ncybVar.toString(), true);
    }

    public static final boolean kja0(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        return lvui(ncybVar) == ncybVar.ld6().size();
    }

    public static final boolean ld6(@InterfaceC7396q ncyb ncybVar, @InterfaceC7395n Object obj) {
        d2ok.m23075h(ncybVar, "<this>");
        return (obj instanceof ncyb) && d2ok.f7l8(((ncyb) obj).ld6(), ncybVar.ld6());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lvui(ncyb ncybVar) {
        if (ncybVar.ld6().size() == 0) {
            return -1;
        }
        boolean z2 = false;
        if (ncybVar.ld6().getByte(0) == 47) {
            return 1;
        }
        if (ncybVar.ld6().getByte(0) == 92) {
            if (ncybVar.ld6().size() <= 2 || ncybVar.ld6().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = ncybVar.ld6().indexOf(f94279toq, 2);
            return iIndexOf == -1 ? ncybVar.ld6().size() : iIndexOf;
        }
        if (ncybVar.ld6().size() <= 2 || ncybVar.ld6().getByte(1) != 58 || ncybVar.ld6().getByte(2) != 92) {
            return -1;
        }
        char c2 = (char) ncybVar.ld6().getByte(0);
        if ('a' <= c2 && c2 < '{') {
            return 3;
        }
        if ('A' <= c2 && c2 < '[') {
            z2 = true;
        }
        return !z2 ? -1 : 3;
    }

    @InterfaceC7396q
    public static final String mcp(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        return ncybVar.ld6().utf8();
    }

    public static final boolean n7h(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        return lvui(ncybVar) == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kja0 ncyb(String str) {
        if (d2ok.f7l8(str, "/")) {
            return f43755k;
        }
        if (d2ok.f7l8(str, "\\")) {
            return f94279toq;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    @InterfaceC7396q
    public static final ncyb ni7(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q kja0 child, boolean z2) {
        d2ok.m23075h(ncybVar, "<this>");
        d2ok.m23075h(child, "child");
        return fu4(ncybVar, dd(new okio.x2().uc(child), false), z2);
    }

    @InterfaceC7396q
    public static final List<String> o1t(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        ArrayList arrayList = new ArrayList();
        int iLvui = lvui(ncybVar);
        if (iLvui == -1) {
            iLvui = 0;
        } else if (iLvui < ncybVar.ld6().size() && ncybVar.ld6().getByte(iLvui) == 92) {
            iLvui++;
        }
        int size = ncybVar.ld6().size();
        int i2 = iLvui;
        while (iLvui < size) {
            if (ncybVar.ld6().getByte(iLvui) == 47 || ncybVar.ld6().getByte(iLvui) == 92) {
                arrayList.add(ncybVar.ld6().substring(i2, iLvui));
                i2 = iLvui + 1;
            }
            iLvui++;
        }
        if (i2 < ncybVar.ld6().size()) {
            arrayList.add(ncybVar.ld6().substring(i2, ncybVar.ld6().size()));
        }
        ArrayList arrayList2 = new ArrayList(fu4.vyq(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((kja0) it.next()).utf8());
        }
        return arrayList2;
    }

    private static /* synthetic */ void oc() {
    }

    /* JADX INFO: renamed from: p */
    public static final int m27722p(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q ncyb other) {
        d2ok.m23075h(ncybVar, "<this>");
        d2ok.m23075h(other, "other");
        return ncybVar.ld6().compareTo(other.ld6());
    }

    public static final boolean qrj(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        return lvui(ncybVar) != -1;
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m27724r(okio.x2 x2Var, kja0 kja0Var) {
        if (!d2ok.f7l8(kja0Var, f94279toq) || x2Var.size() < 2 || x2Var.g1(1L) != 58) {
            return false;
        }
        char cG1 = (char) x2Var.g1(0L);
        if (!('a' <= cG1 && cG1 < '{')) {
            if (!('A' <= cG1 && cG1 < '[')) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public static final ncyb m27726t(@InterfaceC7396q String str, boolean z2) {
        d2ok.m23075h(str, "<this>");
        return dd(new okio.x2().lrht(str), z2);
    }

    @InterfaceC7395n
    public static final ncyb t8r(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        if (d2ok.f7l8(ncybVar.ld6(), f43757q) || d2ok.f7l8(ncybVar.ld6(), f43755k) || d2ok.f7l8(ncybVar.ld6(), f94279toq) || d2ok(ncybVar)) {
            return null;
        }
        int iD3 = d3(ncybVar);
        if (iD3 == 2 && ncybVar.jp0y() != null) {
            if (ncybVar.ld6().size() == 3) {
                return null;
            }
            return new ncyb(kja0.substring$default(ncybVar.ld6(), 0, 3, 1, null));
        }
        if (iD3 == 1 && ncybVar.ld6().startsWith(f94279toq)) {
            return null;
        }
        if (iD3 != -1 || ncybVar.jp0y() == null) {
            return iD3 == -1 ? new ncyb(f43757q) : iD3 == 0 ? new ncyb(kja0.substring$default(ncybVar.ld6(), 0, 1, 1, null)) : new ncyb(kja0.substring$default(ncybVar.ld6(), 0, iD3, 1, null));
        }
        if (ncybVar.ld6().size() == 2) {
            return null;
        }
        return new ncyb(kja0.substring$default(ncybVar.ld6(), 0, 2, 1, null));
    }

    @InterfaceC7396q
    public static final List<kja0> wvg(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        ArrayList arrayList = new ArrayList();
        int iLvui = lvui(ncybVar);
        if (iLvui == -1) {
            iLvui = 0;
        } else if (iLvui < ncybVar.ld6().size() && ncybVar.ld6().getByte(iLvui) == 92) {
            iLvui++;
        }
        int size = ncybVar.ld6().size();
        int i2 = iLvui;
        while (iLvui < size) {
            if (ncybVar.ld6().getByte(iLvui) == 47 || ncybVar.ld6().getByte(iLvui) == 92) {
                arrayList.add(ncybVar.ld6().substring(i2, iLvui));
                i2 = iLvui + 1;
            }
            iLvui++;
        }
        if (i2 < ncybVar.ld6().size()) {
            arrayList.add(ncybVar.ld6().substring(i2, ncybVar.ld6().size()));
        }
        return arrayList;
    }

    public static final int x2(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        return ncybVar.ld6().hashCode();
    }

    private static final kja0 x9kr(byte b2) {
        if (b2 == 47) {
            return f43755k;
        }
        if (b2 == 92) {
            return f94279toq;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b2));
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: z */
    public static final ncyb m27728z(@InterfaceC7396q ncyb ncybVar) {
        d2ok.m23075h(ncybVar, "<this>");
        int iLvui = lvui(ncybVar);
        if (iLvui == -1) {
            return null;
        }
        return new ncyb(ncybVar.ld6().substring(0, iLvui));
    }

    @InterfaceC7396q
    public static final ncyb zurt(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q okio.x2 child, boolean z2) {
        d2ok.m23075h(ncybVar, "<this>");
        d2ok.m23075h(child, "child");
        return fu4(ncybVar, dd(child, false), z2);
    }
}
