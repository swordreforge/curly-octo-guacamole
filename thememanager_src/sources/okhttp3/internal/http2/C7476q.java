package okhttp3.internal.http2;

import b7.C1359g;
import com.miui.maml.data.VariableNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a9;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import mub.InterfaceC7396q;
import okio.kja0;
import okio.nn86;

/* JADX INFO: renamed from: okhttp3.internal.http2.q */
/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7476q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f93958f7l8 = 16384;

    /* JADX INFO: renamed from: g */
    private static final int f43271g = 4096;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7476q f43272k;

    /* JADX INFO: renamed from: n */
    private static final int f43273n = 127;

    /* JADX INFO: renamed from: q */
    private static final int f43274q = 63;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final Map<kja0, Integer> f43275s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f93959toq = 15;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final zy[] f43276y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f93960zy = 31;

    static {
        C7476q c7476q = new C7476q();
        f43272k = c7476q;
        kja0 kja0Var = zy.f93985x2;
        kja0 kja0Var2 = zy.f93984qrj;
        kja0 kja0Var3 = zy.f93983n7h;
        kja0 kja0Var4 = zy.f93982ld6;
        f43276y = new zy[]{new zy(zy.f93981kja0, ""), new zy(kja0Var, "GET"), new zy(kja0Var, "POST"), new zy(kja0Var2, "/"), new zy(kja0Var2, "/index.html"), new zy(kja0Var3, "http"), new zy(kja0Var3, "https"), new zy(kja0Var4, "200"), new zy(kja0Var4, "204"), new zy(kja0Var4, "206"), new zy(kja0Var4, "304"), new zy(kja0Var4, "400"), new zy(kja0Var4, "404"), new zy(kja0Var4, "500"), new zy("accept-charset", ""), new zy("accept-encoding", "gzip, deflate"), new zy("accept-language", ""), new zy("accept-ranges", ""), new zy("accept", ""), new zy("access-control-allow-origin", ""), new zy("age", ""), new zy("allow", ""), new zy("authorization", ""), new zy("cache-control", ""), new zy("content-disposition", ""), new zy("content-encoding", ""), new zy("content-language", ""), new zy("content-length", ""), new zy("content-location", ""), new zy("content-range", ""), new zy("content-type", ""), new zy("cookie", ""), new zy(VariableNames.VAR_DATE, ""), new zy("etag", ""), new zy("expect", ""), new zy("expires", ""), new zy("from", ""), new zy("host", ""), new zy("if-match", ""), new zy("if-modified-since", ""), new zy("if-none-match", ""), new zy("if-range", ""), new zy("if-unmodified-since", ""), new zy("last-modified", ""), new zy("link", ""), new zy("location", ""), new zy("max-forwards", ""), new zy("proxy-authenticate", ""), new zy("proxy-authorization", ""), new zy("range", ""), new zy("referer", ""), new zy(com.android.thememanager.basemodule.analysis.toq.u2a8, ""), new zy("retry-after", ""), new zy("server", ""), new zy("set-cookie", ""), new zy("strict-transport-security", ""), new zy("transfer-encoding", ""), new zy("user-agent", ""), new zy("vary", ""), new zy("via", ""), new zy("www-authenticate", "")};
        f43275s = c7476q.m27147q();
    }

    private C7476q() {
    }

    /* JADX INFO: renamed from: q */
    private final Map<kja0, Integer> m27147q() {
        zy[] zyVarArr = f43276y;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zyVarArr.length);
        int length = zyVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            zy[] zyVarArr2 = f43276y;
            if (!linkedHashMap.containsKey(zyVarArr2[i2].f43338k)) {
                linkedHashMap.put(zyVarArr2[i2].f43338k, Integer.valueOf(i2));
            }
        }
        Map<kja0, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        d2ok.kja0(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final kja0 m27148k(@InterfaceC7396q kja0 name) throws IOException {
        d2ok.m23075h(name, "name");
        int size = name.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte b2 = name.getByte(i2);
            if (65 <= b2 && b2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    @InterfaceC7396q
    public final Map<kja0, Integer> toq() {
        return f43275s;
    }

    @InterfaceC7396q
    public final zy[] zy() {
        return f43276y;
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.q$k */
    /* JADX INFO: compiled from: Hpack.kt */
    public static final class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC6765n
        public int f93961f7l8;

        /* JADX INFO: renamed from: g */
        private int f43277g;

        /* JADX INFO: renamed from: k */
        private final int f43278k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        @InterfaceC6765n
        public zy[] f43279n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final okio.n7h f43280q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f93962toq;

        /* JADX INFO: renamed from: y */
        @InterfaceC6765n
        public int f43281y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final List<zy> f93963zy;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC6768s
        public k(@InterfaceC7396q nn86 source, int i2) {
            this(source, i2, 0, 4, null);
            d2ok.m23075h(source, "source");
        }

        @InterfaceC6768s
        public k(@InterfaceC7396q nn86 source, int i2, int i3) {
            d2ok.m23075h(source, "source");
            this.f43278k = i2;
            this.f93962toq = i3;
            this.f93963zy = new ArrayList();
            this.f43280q = okio.d2ok.m27592n(source);
            this.f43279n = new zy[8];
            this.f43277g = r2.length - 1;
        }

        private final void cdj(int i2) throws IOException {
            this.f93963zy.add(new zy(m27149g(i2), ld6()));
        }

        private final void f7l8(int i2, zy zyVar) {
            this.f93963zy.add(zyVar);
            int i3 = zyVar.f93987zy;
            if (i2 != -1) {
                zy zyVar2 = this.f43279n[zy(i2)];
                d2ok.qrj(zyVar2);
                i3 -= zyVar2.f93987zy;
            }
            int i4 = this.f93962toq;
            if (i3 > i4) {
                toq();
                return;
            }
            int iM27153q = m27153q((this.f43281y + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f93961f7l8 + 1;
                zy[] zyVarArr = this.f43279n;
                if (i5 > zyVarArr.length) {
                    zy[] zyVarArr2 = new zy[zyVarArr.length * 2];
                    System.arraycopy(zyVarArr, 0, zyVarArr2, zyVarArr.length, zyVarArr.length);
                    this.f43277g = this.f43279n.length - 1;
                    this.f43279n = zyVarArr2;
                }
                int i6 = this.f43277g;
                this.f43277g = i6 - 1;
                this.f43279n[i6] = zyVar;
                this.f93961f7l8++;
            } else {
                this.f43279n[i2 + zy(i2) + iM27153q] = zyVar;
            }
            this.f43281y += i3;
        }

        /* JADX INFO: renamed from: g */
        private final kja0 m27149g(int i2) throws IOException {
            if (m27154y(i2)) {
                return C7476q.f43272k.zy()[i2].f43338k;
            }
            int iZy = zy(i2 - C7476q.f43272k.zy().length);
            if (iZy >= 0) {
                zy[] zyVarArr = this.f43279n;
                if (iZy < zyVarArr.length) {
                    zy zyVar = zyVarArr[iZy];
                    d2ok.qrj(zyVar);
                    return zyVar.f43338k;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        /* JADX INFO: renamed from: h */
        private final void m27150h() throws IOException {
            f7l8(-1, new zy(C7476q.f43272k.m27148k(ld6()), ld6()));
        }

        /* JADX INFO: renamed from: k */
        private final void m27151k() {
            int i2 = this.f93962toq;
            int i3 = this.f43281y;
            if (i2 < i3) {
                if (i2 == 0) {
                    toq();
                } else {
                    m27153q(i3 - i2);
                }
            }
        }

        private final void ki() throws IOException {
            this.f93963zy.add(new zy(C7476q.f43272k.m27148k(ld6()), ld6()));
        }

        private final void kja0(int i2) throws IOException {
            f7l8(-1, new zy(m27149g(i2), ld6()));
        }

        /* JADX INFO: renamed from: p */
        private final int m27152p() throws IOException {
            return C1359g.m5763q(this.f43280q.readByte(), 255);
        }

        /* JADX INFO: renamed from: q */
        private final int m27153q(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f43279n.length;
                while (true) {
                    length--;
                    i3 = this.f43277g;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    zy zyVar = this.f43279n[length];
                    d2ok.qrj(zyVar);
                    int i5 = zyVar.f93987zy;
                    i2 -= i5;
                    this.f43281y -= i5;
                    this.f93961f7l8--;
                    i4++;
                }
                zy[] zyVarArr = this.f43279n;
                System.arraycopy(zyVarArr, i3 + 1, zyVarArr, i3 + 1 + i4, this.f93961f7l8);
                this.f43277g += i4;
            }
            return i4;
        }

        private final void qrj(int i2) throws IOException {
            if (m27154y(i2)) {
                this.f93963zy.add(C7476q.f43272k.zy()[i2]);
                return;
            }
            int iZy = zy(i2 - C7476q.f43272k.zy().length);
            if (iZy >= 0) {
                zy[] zyVarArr = this.f43279n;
                if (iZy < zyVarArr.length) {
                    List<zy> list = this.f93963zy;
                    zy zyVar = zyVarArr[iZy];
                    d2ok.qrj(zyVar);
                    list.add(zyVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private final void toq() {
            kotlin.collections.kja0.b8(this.f43279n, null, 0, 0, 6, null);
            this.f43277g = this.f43279n.length - 1;
            this.f93961f7l8 = 0;
            this.f43281y = 0;
        }

        /* JADX INFO: renamed from: y */
        private final boolean m27154y(int i2) {
            return i2 >= 0 && i2 <= C7476q.f43272k.zy().length - 1;
        }

        private final int zy(int i2) {
            return this.f43277g + 1 + i2;
        }

        @InterfaceC7396q
        public final kja0 ld6() throws IOException {
            int iM27152p = m27152p();
            boolean z2 = (iM27152p & 128) == 128;
            long jN7h = n7h(iM27152p, 127);
            if (!z2) {
                return this.f43280q.fnq8(jN7h);
            }
            okio.x2 x2Var = new okio.x2();
            ld6.f43251k.toq(this.f43280q, jN7h, x2Var);
            return x2Var.uj2j();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final List<zy> m27155n() {
            List<zy> listWr = a9.wr(this.f93963zy);
            this.f93963zy.clear();
            return listWr;
        }

        public final int n7h(int i2, int i3) throws IOException {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int iM27152p = m27152p();
                if ((iM27152p & 128) == 0) {
                    return i3 + (iM27152p << i5);
                }
                i3 += (iM27152p & 127) << i5;
                i5 += 7;
            }
        }

        /* JADX INFO: renamed from: s */
        public final int m27156s() {
            return this.f93962toq;
        }

        public final void x2() throws IOException {
            while (!this.f43280q.py()) {
                int iM5763q = C1359g.m5763q(this.f43280q.readByte(), 255);
                if (iM5763q == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM5763q & 128) == 128) {
                    qrj(n7h(iM5763q, 127) - 1);
                } else if (iM5763q == 64) {
                    m27150h();
                } else if ((iM5763q & 64) == 64) {
                    kja0(n7h(iM5763q, 63) - 1);
                } else if ((iM5763q & 32) == 32) {
                    int iN7h = n7h(iM5763q, 31);
                    this.f93962toq = iN7h;
                    if (iN7h < 0 || iN7h > this.f43278k) {
                        throw new IOException("Invalid dynamic table size update " + this.f93962toq);
                    }
                    m27151k();
                } else if (iM5763q == 16 || iM5763q == 0) {
                    ki();
                } else {
                    cdj(n7h(iM5763q, 15) - 1);
                }
            }
        }

        public /* synthetic */ k(nn86 nn86Var, int i2, int i3, int i4, ni7 ni7Var) {
            this(nn86Var, i2, (i4 & 4) != 0 ? i2 : i3);
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.q$toq */
    /* JADX INFO: compiled from: Hpack.kt */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public zy[] f93964f7l8;

        /* JADX INFO: renamed from: g */
        @InterfaceC6765n
        public int f43282g;

        /* JADX INFO: renamed from: k */
        @InterfaceC6765n
        public int f43283k;

        /* JADX INFO: renamed from: n */
        private boolean f43284n;

        /* JADX INFO: renamed from: p */
        @InterfaceC6765n
        public int f43285p;

        /* JADX INFO: renamed from: q */
        private int f43286q;

        /* JADX INFO: renamed from: s */
        @InterfaceC6765n
        public int f43287s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f93965toq;

        /* JADX INFO: renamed from: y */
        private int f43288y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final okio.x2 f93966zy;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC6768s
        public toq(int i2, @InterfaceC7396q okio.x2 out) {
            this(i2, false, out, 2, null);
            d2ok.m23075h(out, "out");
        }

        @InterfaceC6768s
        public toq(int i2, boolean z2, @InterfaceC7396q okio.x2 out) {
            d2ok.m23075h(out, "out");
            this.f43283k = i2;
            this.f93965toq = z2;
            this.f93966zy = out;
            this.f43286q = Integer.MAX_VALUE;
            this.f43282g = i2;
            this.f93964f7l8 = new zy[8];
            this.f43288y = r2.length - 1;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC6768s
        public toq(@InterfaceC7396q okio.x2 out) {
            this(0, false, out, 3, null);
            d2ok.m23075h(out, "out");
        }

        /* JADX INFO: renamed from: k */
        private final void m27157k() {
            int i2 = this.f43282g;
            int i3 = this.f43285p;
            if (i2 < i3) {
                if (i2 == 0) {
                    toq();
                } else {
                    zy(i3 - i2);
                }
            }
        }

        /* JADX INFO: renamed from: q */
        private final void m27158q(zy zyVar) {
            int i2 = zyVar.f93987zy;
            int i3 = this.f43282g;
            if (i2 > i3) {
                toq();
                return;
            }
            zy((this.f43285p + i2) - i3);
            int i4 = this.f43287s + 1;
            zy[] zyVarArr = this.f93964f7l8;
            if (i4 > zyVarArr.length) {
                zy[] zyVarArr2 = new zy[zyVarArr.length * 2];
                System.arraycopy(zyVarArr, 0, zyVarArr2, zyVarArr.length, zyVarArr.length);
                this.f43288y = this.f93964f7l8.length - 1;
                this.f93964f7l8 = zyVarArr2;
            }
            int i5 = this.f43288y;
            this.f43288y = i5 - 1;
            this.f93964f7l8[i5] = zyVar;
            this.f43287s++;
            this.f43285p += i2;
        }

        private final void toq() {
            kotlin.collections.kja0.b8(this.f93964f7l8, null, 0, 0, 6, null);
            this.f43288y = this.f93964f7l8.length - 1;
            this.f43287s = 0;
            this.f43285p = 0;
        }

        private final int zy(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f93964f7l8.length;
                while (true) {
                    length--;
                    i3 = this.f43288y;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    zy zyVar = this.f93964f7l8[length];
                    d2ok.qrj(zyVar);
                    i2 -= zyVar.f93987zy;
                    int i5 = this.f43285p;
                    zy zyVar2 = this.f93964f7l8[length];
                    d2ok.qrj(zyVar2);
                    this.f43285p = i5 - zyVar2.f93987zy;
                    this.f43287s--;
                    i4++;
                }
                zy[] zyVarArr = this.f93964f7l8;
                System.arraycopy(zyVarArr, i3 + 1, zyVarArr, i3 + 1 + i4, this.f43287s);
                zy[] zyVarArr2 = this.f93964f7l8;
                int i6 = this.f43288y;
                Arrays.fill(zyVarArr2, i6 + 1, i6 + 1 + i4, (Object) null);
                this.f43288y += i4;
            }
            return i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void f7l8(@mub.InterfaceC7396q java.util.List<okhttp3.internal.http2.zy> r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C7476q.toq.f7l8(java.util.List):void");
        }

        /* JADX INFO: renamed from: g */
        public final void m27159g(@InterfaceC7396q kja0 data) throws IOException {
            d2ok.m23075h(data, "data");
            if (this.f93965toq) {
                ld6 ld6Var = ld6.f43251k;
                if (ld6Var.m27137q(data) < data.size()) {
                    okio.x2 x2Var = new okio.x2();
                    ld6Var.zy(data, x2Var);
                    kja0 kja0VarUj2j = x2Var.uj2j();
                    m27161y(kja0VarUj2j.size(), 127, 128);
                    this.f93966zy.uc(kja0VarUj2j);
                    return;
                }
            }
            m27161y(data.size(), 127, 0);
            this.f93966zy.uc(data);
        }

        /* JADX INFO: renamed from: n */
        public final void m27160n(int i2) {
            this.f43283k = i2;
            int iMin = Math.min(i2, 16384);
            int i3 = this.f43282g;
            if (i3 == iMin) {
                return;
            }
            if (iMin < i3) {
                this.f43286q = Math.min(this.f43286q, iMin);
            }
            this.f43284n = true;
            this.f43282g = iMin;
            m27157k();
        }

        /* JADX INFO: renamed from: y */
        public final void m27161y(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.f93966zy.writeByte(i2 | i4);
                return;
            }
            this.f93966zy.writeByte(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.f93966zy.writeByte(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.f93966zy.writeByte(i5);
        }

        public /* synthetic */ toq(int i2, boolean z2, okio.x2 x2Var, int i3, ni7 ni7Var) {
            this((i3 & 1) != 0 ? 4096 : i2, (i3 & 2) != 0 ? true : z2, x2Var);
        }
    }
}
