package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.C6220d;
import kotlin.C6475u;
import kotlin.InterfaceC6232i;
import kotlin.bo;
import kotlin.dr;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.qo;
import kotlin.tfm;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.u */
/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6165u {
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6232i
    public static final long[] f7l8(@InterfaceC7396q Collection<ikck> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        long[] jArrZy = C6220d.zy(collection.size());
        Iterator<ikck> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C6220d.m22781i(jArrZy, i2, it.next().a98o());
            i2++;
        }
        return jArrZy;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: g */
    public static final int[] m22613g(@InterfaceC7396q Collection<gyi> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        int[] iArrZy = dr.zy(collection.size());
        Iterator<gyi> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            dr.m22804i(iArrZy, i2, it.next().a98o());
            i2++;
        }
        return iArrZy;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUByte")
    /* JADX INFO: renamed from: k */
    public static final int m22614k(@InterfaceC7396q Iterable<C6475u> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<C6475u> it = iterable.iterator();
        int iLd6 = 0;
        while (it.hasNext()) {
            iLd6 = gyi.ld6(iLd6 + gyi.ld6(it.next().bf2() & 255));
        }
        return iLd6;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: n */
    public static final byte[] m22615n(@InterfaceC7396q Collection<C6475u> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        byte[] bArrZy = bo.zy(collection.size());
        Iterator<C6475u> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bo.m22414i(bArrZy, i2, it.next().bf2());
            i2++;
        }
        return bArrZy;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUShort")
    /* JADX INFO: renamed from: q */
    public static final int m22616q(@InterfaceC7396q Iterable<qo> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<qo> it = iterable.iterator();
        int iLd6 = 0;
        while (it.hasNext()) {
            iLd6 = gyi.ld6(iLd6 + gyi.ld6(it.next().bf2() & qo.f36486g));
        }
        return iLd6;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    public static final int toq(@InterfaceC7396q Iterable<gyi> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<gyi> it = iterable.iterator();
        int iLd6 = 0;
        while (it.hasNext()) {
            iLd6 = gyi.ld6(iLd6 + it.next().a98o());
        }
        return iLd6;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: y */
    public static final short[] m22617y(@InterfaceC7396q Collection<qo> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        short[] sArrZy = tfm.zy(collection.size());
        Iterator<qo> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            tfm.m23653i(sArrZy, i2, it.next().bf2());
            i2++;
        }
        return sArrZy;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    public static final long zy(@InterfaceC7396q Iterable<ikck> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<ikck> it = iterable.iterator();
        long jLd6 = 0;
        while (it.hasNext()) {
            jLd6 = ikck.ld6(jLd6 + it.next().a98o());
        }
        return jLd6;
    }
}
