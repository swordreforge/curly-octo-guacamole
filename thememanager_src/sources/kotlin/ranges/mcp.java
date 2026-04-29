package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.C6475u;
import kotlin.InterfaceC6232i;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.qo;
import kotlin.random.AbstractC6332g;
import kotlin.random.C6338y;
import kotlin.ranges.C6357z;
import kotlin.ranges.zurt;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _URanges.kt */
/* JADX INFO: loaded from: classes3.dex */
public class mcp {
    @yz(version = "1.7")
    public static final int a9(@InterfaceC7396q zurt zurtVar) {
        d2ok.m23075h(zurtVar, "<this>");
        if (!zurtVar.isEmpty()) {
            return zurtVar.m23373y();
        }
        throw new NoSuchElementException("Progression " + zurtVar + " is empty.");
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: c */
    public static fu4 m23330c(int i2, int i3) {
        return Integer.compareUnsigned(i3, 0) <= 0 ? fu4.f36507y.m23312k() : new fu4(i2, gyi.ld6(i3 - 1), null);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final boolean cdj(@InterfaceC7396q wvg contains, int i2) {
        d2ok.m23075h(contains, "$this$contains");
        return contains.ld6(ikck.ld6(((long) i2) & 4294967295L));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final long d2ok(@InterfaceC7396q wvg wvgVar, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(wvgVar, "<this>");
        d2ok.m23075h(random, "random");
        try {
            return C6338y.x2(random, wvgVar);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int d3(fu4 fu4Var) {
        d2ok.m23075h(fu4Var, "<this>");
        return oc(fu4Var, AbstractC6332g.Default);
    }

    @i9jn(markerClass = {kotlin.ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final ikck dd(wvg wvgVar) {
        d2ok.m23075h(wvgVar, "<this>");
        return x9kr(wvgVar, AbstractC6332g.Default);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long eqxt(wvg wvgVar) {
        d2ok.m23075h(wvgVar, "<this>");
        return d2ok(wvgVar, AbstractC6332g.Default);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: f */
    public static final fu4 m23331f(short s2, short s3) {
        return d2ok.m23076i(s3 & qo.f36486g, 0) <= 0 ? fu4.f36507y.m23312k() : new fu4(gyi.ld6(s2 & qo.f36486g), gyi.ld6(gyi.ld6(r3) - 1), null);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final byte f7l8(byte b2, byte b3) {
        return d2ok.m23076i(b2 & 255, b3 & 255) > 0 ? b3 : b2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final boolean fn3e(@InterfaceC7396q fu4 contains, long j2) {
        d2ok.m23075h(contains, "$this$contains");
        return ikck.ld6(j2 >>> 32) == 0 && contains.ld6(gyi.ld6((int) j2));
    }

    @yz(version = "1.7")
    public static final long fti(@InterfaceC7396q C6357z c6357z) {
        d2ok.m23075h(c6357z, "<this>");
        if (!c6357z.isEmpty()) {
            return c6357z.m23370y();
        }
        throw new NoSuchElementException("Progression " + c6357z + " is empty.");
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final zurt fu4(int i2, int i3) {
        return zurt.f36560g.m23374k(i2, i3, -1);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: g */
    public static final int m23332g(int i2, int i3) {
        return Integer.compareUnsigned(i2, i3) > 0 ? i3 : i2;
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final ikck gvn7(@InterfaceC7396q C6357z c6357z) {
        d2ok.m23075h(c6357z, "<this>");
        if (c6357z.isEmpty()) {
            return null;
        }
        return ikck.zy(c6357z.m23370y());
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: h */
    private static final boolean m23333h(wvg contains, ikck ikckVar) {
        d2ok.m23075h(contains, "$this$contains");
        return ikckVar != null && contains.ld6(ikckVar.a98o());
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final C6357z hyr(@InterfaceC7396q C6357z c6357z, long j2) {
        d2ok.m23075h(c6357z, "<this>");
        C6344i.m23317k(j2 > 0, Long.valueOf(j2));
        C6357z.k kVar = C6357z.f36556g;
        long jF7l8 = c6357z.f7l8();
        long jM23370y = c6357z.m23370y();
        if (c6357z.m23369s() <= 0) {
            j2 = -j2;
        }
        return kVar.m23371k(jF7l8, jM23370y, j2);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: i */
    private static final boolean m23334i(fu4 contains, gyi gyiVar) {
        d2ok.m23075h(contains, "$this$contains");
        return gyiVar != null && contains.ld6(gyiVar.a98o());
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final ikck jk(@InterfaceC7396q C6357z c6357z) {
        d2ok.m23075h(c6357z, "<this>");
        if (c6357z.isEmpty()) {
            return null;
        }
        return ikck.zy(c6357z.f7l8());
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final gyi jp0y(@InterfaceC7396q zurt zurtVar) {
        d2ok.m23075h(zurtVar, "<this>");
        if (zurtVar.isEmpty()) {
            return null;
        }
        return gyi.zy(zurtVar.m23373y());
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: k */
    public static final short m23335k(short s2, short s3) {
        return d2ok.m23076i(s2 & qo.f36486g, 65535 & s3) < 0 ? s3 : s2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final boolean ki(@InterfaceC7396q wvg contains, byte b2) {
        d2ok.m23075h(contains, "$this$contains");
        return contains.ld6(ikck.ld6(((long) b2) & 255));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final boolean kja0(@InterfaceC7396q fu4 contains, byte b2) {
        d2ok.m23075h(contains, "$this$contains");
        return contains.ld6(gyi.ld6(b2 & 255));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: l */
    public static final C6357z m23336l(@InterfaceC7396q C6357z c6357z) {
        d2ok.m23075h(c6357z, "<this>");
        return C6357z.f36556g.m23371k(c6357z.m23370y(), c6357z.f7l8(), -c6357z.m23369s());
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final int ld6(int i2, int i3, int i4) {
        if (Integer.compareUnsigned(i3, i4) <= 0) {
            return Integer.compareUnsigned(i2, i3) < 0 ? i3 : Integer.compareUnsigned(i2, i4) > 0 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) gyi.yz(i4)) + " is less than minimum " + ((Object) gyi.yz(i3)) + '.');
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final fu4 lrht(byte b2, byte b3) {
        return d2ok.m23076i(b3 & 255, 0) <= 0 ? fu4.f36507y.m23312k() : new fu4(gyi.ld6(b2 & 255), gyi.ld6(gyi.ld6(r3) - 1), null);
    }

    @i9jn(markerClass = {kotlin.ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final gyi lvui(fu4 fu4Var) {
        d2ok.m23075h(fu4Var, "<this>");
        return m23340r(fu4Var, AbstractC6332g.Default);
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final gyi mcp(@InterfaceC7396q zurt zurtVar) {
        d2ok.m23075h(zurtVar, "<this>");
        if (zurtVar.isEmpty()) {
            return null;
        }
        return gyi.zy(zurtVar.f7l8());
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: n */
    public static final short m23337n(short s2, short s3) {
        return d2ok.m23076i(s2 & qo.f36486g, 65535 & s3) > 0 ? s3 : s2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final zurt n5r1(@InterfaceC7396q zurt zurtVar, int i2) {
        d2ok.m23075h(zurtVar, "<this>");
        C6344i.m23317k(i2 > 0, Integer.valueOf(i2));
        zurt.C6358k c6358k = zurt.f36560g;
        int iF7l8 = zurtVar.f7l8();
        int iM23373y = zurtVar.m23373y();
        if (zurtVar.m23372s() <= 0) {
            i2 = -i2;
        }
        return c6358k.m23374k(iF7l8, iM23373y, i2);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final int n7h(int i2, @InterfaceC7396q f7l8<gyi> range) {
        d2ok.m23075h(range, "range");
        if (range instanceof InterfaceC6342g) {
            return ((gyi) fn3e.m23304r(gyi.zy(i2), (InterfaceC6342g) range)).a98o();
        }
        if (!range.isEmpty()) {
            return Integer.compareUnsigned(i2, ((gyi) range.mo2951k()).a98o()) < 0 ? ((gyi) range.mo2951k()).a98o() : Integer.compareUnsigned(i2, ((gyi) range.zy()).a98o()) > 0 ? ((gyi) range.zy()).a98o() : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final zurt ncyb(@InterfaceC7396q zurt zurtVar) {
        d2ok.m23075h(zurtVar, "<this>");
        return zurt.f36560g.m23374k(zurtVar.m23373y(), zurtVar.f7l8(), -zurtVar.m23372s());
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final zurt ni7(short s2, short s3) {
        return zurt.f36560g.m23374k(gyi.ld6(s2 & qo.f36486g), gyi.ld6(s3 & qo.f36486g), -1);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final C6357z o1t(long j2, long j3) {
        return C6357z.f36556g.m23371k(j2, j3, -1L);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final int oc(@InterfaceC7396q fu4 fu4Var, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(fu4Var, "<this>");
        d2ok.m23075h(random, "random");
        try {
            return C6338y.m23285y(random, fu4Var);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: p */
    public static final short m23338p(short s2, short s3, short s4) {
        int i2 = s3 & qo.f36486g;
        int i3 = s4 & qo.f36486g;
        if (d2ok.m23076i(i2, i3) <= 0) {
            int i4 = 65535 & s2;
            return d2ok.m23076i(i4, i2) < 0 ? s3 : d2ok.m23076i(i4, i3) > 0 ? s4 : s2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) qo.m23257m(s4)) + " is less than minimum " + ((Object) qo.m23257m(s3)) + '.');
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: q */
    public static final long m23339q(long j2, long j3) {
        return Long.compareUnsigned(j2, j3) < 0 ? j3 : j2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final long qrj(long j2, long j3, long j4) {
        if (Long.compareUnsigned(j3, j4) <= 0) {
            return Long.compareUnsigned(j2, j3) < 0 ? j3 : Long.compareUnsigned(j2, j4) > 0 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ikck.yz(j4)) + " is less than minimum " + ((Object) ikck.yz(j3)) + '.');
    }

    @i9jn(markerClass = {kotlin.ki.class, InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    /* JADX INFO: renamed from: r */
    public static final gyi m23340r(@InterfaceC7396q fu4 fu4Var, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(fu4Var, "<this>");
        d2ok.m23075h(random, "random");
        if (fu4Var.isEmpty()) {
            return null;
        }
        return gyi.zy(C6338y.m23285y(random, fu4Var));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: s */
    public static final long m23341s(long j2, @InterfaceC7396q f7l8<ikck> range) {
        d2ok.m23075h(range, "range");
        if (range instanceof InterfaceC6342g) {
            return ((ikck) fn3e.m23304r(ikck.zy(j2), (InterfaceC6342g) range)).a98o();
        }
        if (!range.isEmpty()) {
            return Long.compareUnsigned(j2, ((ikck) range.mo2951k()).a98o()) < 0 ? ((ikck) range.mo2951k()).a98o() : Long.compareUnsigned(j2, ((ikck) range.zy()).a98o()) > 0 ? ((ikck) range.zy()).a98o() : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @yz(version = "1.7")
    /* JADX INFO: renamed from: t */
    public static final long m23342t(@InterfaceC7396q C6357z c6357z) {
        d2ok.m23075h(c6357z, "<this>");
        if (!c6357z.isEmpty()) {
            return c6357z.f7l8();
        }
        throw new NoSuchElementException("Progression " + c6357z + " is empty.");
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final boolean t8r(@InterfaceC7396q fu4 contains, short s2) {
        d2ok.m23075h(contains, "$this$contains");
        return contains.ld6(gyi.ld6(s2 & qo.f36486g));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final int toq(int i2, int i3) {
        return Integer.compareUnsigned(i2, i3) < 0 ? i3 : i2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static wvg uv6(long j2, long j3) {
        return Long.compareUnsigned(j3, 0L) <= 0 ? wvg.f36551y.m23366k() : new wvg(j2, ikck.ld6(j3 - ikck.ld6(((long) 1) & 4294967295L)), null);
    }

    @yz(version = "1.7")
    public static final int wvg(@InterfaceC7396q zurt zurtVar) {
        d2ok.m23075h(zurtVar, "<this>");
        if (!zurtVar.isEmpty()) {
            return zurtVar.f7l8();
        }
        throw new NoSuchElementException("Progression " + zurtVar + " is empty.");
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final byte x2(byte b2, byte b3, byte b4) {
        int i2 = b3 & 255;
        int i3 = b4 & 255;
        if (d2ok.m23076i(i2, i3) <= 0) {
            int i4 = b2 & 255;
            return d2ok.m23076i(i4, i2) < 0 ? b3 : d2ok.m23076i(i4, i3) > 0 ? b4 : b2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) C6475u.m23774m(b4)) + " is less than minimum " + ((Object) C6475u.m23774m(b3)) + '.');
    }

    @i9jn(markerClass = {kotlin.ki.class, InterfaceC6232i.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final ikck x9kr(@InterfaceC7396q wvg wvgVar, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(wvgVar, "<this>");
        d2ok.m23075h(random, "random");
        if (wvgVar.isEmpty()) {
            return null;
        }
        return ikck.zy(C6338y.x2(random, wvgVar));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: y */
    public static final long m23343y(long j2, long j3) {
        return Long.compareUnsigned(j2, j3) > 0 ? j3 : j2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: z */
    public static final zurt m23344z(byte b2, byte b3) {
        return zurt.f36560g.m23374k(gyi.ld6(b2 & 255), gyi.ld6(b3 & 255), -1);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final boolean zurt(@InterfaceC7396q wvg contains, short s2) {
        d2ok.m23075h(contains, "$this$contains");
        return contains.ld6(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final byte zy(byte b2, byte b3) {
        return d2ok.m23076i(b2 & 255, b3 & 255) < 0 ? b3 : b2;
    }
}
