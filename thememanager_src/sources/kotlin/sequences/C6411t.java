package kotlin.sequences;

import java.util.Iterator;
import kotlin.C6475u;
import kotlin.InterfaceC6232i;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.jvm.internal.d2ok;
import kotlin.qo;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.sequences.t */
/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6411t {
    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUByte")
    /* JADX INFO: renamed from: k */
    public static final int m23470k(@InterfaceC7396q qrj<C6475u> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<C6475u> it = qrjVar.iterator();
        int iLd6 = 0;
        while (it.hasNext()) {
            iLd6 = gyi.ld6(iLd6 + gyi.ld6(it.next().bf2() & 255));
        }
        return iLd6;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUShort")
    /* JADX INFO: renamed from: q */
    public static final int m23471q(@InterfaceC7396q qrj<qo> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<qo> it = qrjVar.iterator();
        int iLd6 = 0;
        while (it.hasNext()) {
            iLd6 = gyi.ld6(iLd6 + gyi.ld6(it.next().bf2() & qo.f36486g));
        }
        return iLd6;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    public static final int toq(@InterfaceC7396q qrj<gyi> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<gyi> it = qrjVar.iterator();
        int iLd6 = 0;
        while (it.hasNext()) {
            iLd6 = gyi.ld6(iLd6 + it.next().a98o());
        }
        return iLd6;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    public static final long zy(@InterfaceC7396q qrj<ikck> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        Iterator<ikck> it = qrjVar.iterator();
        long jLd6 = 0;
        while (it.hasNext()) {
            jLd6 = ikck.ld6(jLd6 + it.next().a98o());
        }
        return jLd6;
    }
}
