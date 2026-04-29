package okio.internal;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;
import okio.C7560j;
import okio.hyr;
import okio.kja0;
import okio.nn86;
import okio.vyq;

/* JADX INFO: renamed from: okio.internal.n */
/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
@InterfaceC6769y(name = "-RealBufferedSink")
public final class C7552n {
    @InterfaceC7396q
    public static final okio.qrj cdj(@InterfaceC7396q hyr hyrVar, int i2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.writeInt(i2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj f7l8(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q kja0 byteString) {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(byteString, "byteString");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.uc(byteString);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj fn3e(@InterfaceC7396q hyr hyrVar, int i2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.writeShort(i2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj fu4(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q String string, int i2, int i3) {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(string, "string");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.mo27639m(string, i2, i3);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final String m27701g(@InterfaceC7396q hyr hyrVar) {
        d2ok.m23075h(hyrVar, "<this>");
        return "buffer(" + hyrVar.f43728k + ')';
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final okio.qrj m27702h(@InterfaceC7396q hyr hyrVar, long j2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.bz2(j2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public static final okio.qrj m27703i(@InterfaceC7396q hyr hyrVar, long j2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.o1t(j2);
        return hyrVar.eqxt();
    }

    /* JADX INFO: renamed from: k */
    public static final void m27704k(@InterfaceC7396q hyr hyrVar) throws Throwable {
        d2ok.m23075h(hyrVar, "<this>");
        if (hyrVar.f43729n) {
            return;
        }
        Throwable th = null;
        try {
            if (hyrVar.f43730q.size() > 0) {
                vyq vyqVar = hyrVar.f43728k;
                okio.x2 x2Var = hyrVar.f43730q;
                vyqVar.mo26936j(x2Var, x2Var.size());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            hyrVar.f43728k.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        hyrVar.f43729n = true;
        if (th != null) {
            throw th;
        }
    }

    @InterfaceC7396q
    public static final okio.qrj ki(@InterfaceC7396q hyr hyrVar, int i2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.zsr0(i2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj kja0(@InterfaceC7396q hyr hyrVar, long j2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.xwq3(j2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj ld6(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q byte[] source, int i2, int i3) {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(source, "source");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.write(source, i2, i3);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final C7560j m27705n(@InterfaceC7396q hyr hyrVar) {
        d2ok.m23075h(hyrVar, "<this>");
        return hyrVar.f43728k.toq();
    }

    @InterfaceC7396q
    public static final okio.qrj n7h(@InterfaceC7396q hyr hyrVar, int i2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.writeByte(i2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj ni7(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q String string) {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(string, "string");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.lrht(string);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final okio.qrj m27706p(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q byte[] source) {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(source, "source");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.write(source);
        return hyrVar.eqxt();
    }

    /* JADX INFO: renamed from: q */
    public static final void m27707q(@InterfaceC7396q hyr hyrVar) throws IOException {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (hyrVar.f43730q.size() > 0) {
            vyq vyqVar = hyrVar.f43728k;
            okio.x2 x2Var = hyrVar.f43730q;
            vyqVar.mo26936j(x2Var, x2Var.size());
        }
        hyrVar.f43728k.flush();
    }

    public static final long qrj(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q nn86 source) throws IOException {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(source, "source");
        long j2 = 0;
        while (true) {
            long jWx16 = source.wx16(hyrVar.f43730q, 8192L);
            if (jWx16 == -1) {
                return j2;
            }
            j2 += jWx16;
            hyrVar.eqxt();
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final okio.qrj m27708s(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q nn86 source, long j2) throws IOException {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(source, "source");
        while (j2 > 0) {
            long jWx16 = source.wx16(hyrVar.f43730q, j2);
            if (jWx16 == -1) {
                throw new EOFException();
            }
            j2 -= jWx16;
            hyrVar.eqxt();
        }
        return hyrVar;
    }

    @InterfaceC7396q
    public static final okio.qrj t8r(@InterfaceC7396q hyr hyrVar, long j2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.writeLong(j2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj toq(@InterfaceC7396q hyr hyrVar) throws IOException {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = hyrVar.f43730q.size();
        if (size > 0) {
            hyrVar.f43728k.mo26936j(hyrVar.f43730q, size);
        }
        return hyrVar;
    }

    public static final void x2(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q okio.x2 source, long j2) throws IOException {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(source, "source");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.mo26936j(source, j2);
        hyrVar.eqxt();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final okio.qrj m27709y(@InterfaceC7396q hyr hyrVar, @InterfaceC7396q kja0 byteString, int i2, int i3) {
        d2ok.m23075h(hyrVar, "<this>");
        d2ok.m23075h(byteString, "byteString");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.wo(byteString, i2, i3);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public static final okio.qrj m27710z(@InterfaceC7396q hyr hyrVar, int i2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.ni7(i2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj zurt(@InterfaceC7396q hyr hyrVar, int i2) {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.f43730q.cfr(i2);
        return hyrVar.eqxt();
    }

    @InterfaceC7396q
    public static final okio.qrj zy(@InterfaceC7396q hyr hyrVar) throws IOException {
        d2ok.m23075h(hyrVar, "<this>");
        if (!(!hyrVar.f43729n)) {
            throw new IllegalStateException("closed".toString());
        }
        long jFu4 = hyrVar.f43730q.fu4();
        if (jFu4 > 0) {
            hyrVar.f43728k.mo26936j(hyrVar.f43730q, jFu4);
        }
        return hyrVar;
    }
}
