package okhttp3.internal.http;

import b7.C1359g;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.text.a9;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;
import okhttp3.C7533y;
import okhttp3.fn3e;
import okhttp3.fti;
import okhttp3.internal.platform.C7498p;
import okhttp3.n7h;
import okhttp3.qrj;
import okhttp3.zurt;
import okio.kja0;
import okio.x2;

/* JADX INFO: renamed from: okhttp3.internal.http.n */
/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC6769y(name = "HttpHeaders")
public final class C7459n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final kja0 f43144k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final kja0 f93899toq;

    static {
        kja0.C7563k c7563k = kja0.Companion;
        f43144k = c7563k.x2("\"\\");
        f93899toq = c7563k.x2("\t ,=");
    }

    public static final void f7l8(@InterfaceC7396q n7h n7hVar, @InterfaceC7396q zurt url, @InterfaceC7396q fn3e headers) {
        d2ok.m23075h(n7hVar, "<this>");
        d2ok.m23075h(url, "url");
        d2ok.m23075h(headers, "headers");
        if (n7hVar == n7h.f94068toq) {
            return;
        }
        List<qrj> listF7l8 = qrj.f43528p.f7l8(url, headers);
        if (listF7l8.isEmpty()) {
            return;
        }
        n7hVar.toq(url, listF7l8);
    }

    /* JADX INFO: renamed from: g */
    private static final String m27078g(x2 x2Var) {
        long jD3 = x2Var.d3(f93899toq);
        if (jD3 == -1) {
            jD3 = x2Var.size();
        }
        if (jD3 != 0) {
            return x2Var.mo27610d(jD3);
        }
        return null;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "No longer supported", replaceWith = @hb(expression = "response.promisesBody()", imports = {}))
    /* JADX INFO: renamed from: k */
    public static final boolean m27079k(@InterfaceC7396q fti response) {
        d2ok.m23075h(response, "response");
        return zy(response);
    }

    /* JADX INFO: renamed from: n */
    private static final String m27080n(x2 x2Var) throws EOFException {
        if (!(x2Var.readByte() == 34)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        x2 x2Var2 = new x2();
        while (true) {
            long jD3 = x2Var.d3(f43144k);
            if (jD3 == -1) {
                return null;
            }
            if (x2Var.g1(jD3) == 34) {
                x2Var2.mo26936j(x2Var, jD3);
                x2Var.readByte();
                return x2Var2.jbh();
            }
            if (x2Var.size() == jD3 + 1) {
                return null;
            }
            x2Var2.mo26936j(x2Var, jD3);
            x2Var.readByte();
            x2Var2.mo26936j(x2Var, 1L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m27081q(okio.x2 r7, java.util.List<okhttp3.C7533y> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            m27083y(r7)
            java.lang.String r1 = m27078g(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = m27083y(r7)
            java.lang.String r3 = m27078g(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.py()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.y r7 = new okhttp3.y
            java.util.Map r0 = kotlin.collections.uv6.o1t()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = b7.C1359g.lrht(r7, r4)
            boolean r6 = m27083y(r7)
            if (r2 != 0) goto L67
            if (r6 != 0) goto L40
            boolean r2 = r7.py()
            if (r2 == 0) goto L67
        L40:
            okhttp3.y r2 = new okhttp3.y
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.zurt.ps(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.d2ok.kja0(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L67:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = b7.C1359g.lrht(r7, r4)
            int r5 = r5 + r6
        L71:
            if (r3 != 0) goto L81
            java.lang.String r3 = m27078g(r7)
            boolean r5 = m27083y(r7)
            if (r5 != 0) goto Lba
            int r5 = b7.C1359g.lrht(r7, r4)
        L81:
            if (r5 == 0) goto Lba
            r6 = 1
            if (r5 <= r6) goto L87
            return
        L87:
            boolean r6 = m27083y(r7)
            if (r6 == 0) goto L8e
            return
        L8e:
            r6 = 34
            boolean r6 = m27082s(r7, r6)
            if (r6 == 0) goto L9b
            java.lang.String r6 = m27080n(r7)
            goto L9f
        L9b:
            java.lang.String r6 = m27078g(r7)
        L9f:
            if (r6 != 0) goto La2
            return
        La2:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lab
            return
        Lab:
            boolean r3 = m27083y(r7)
            if (r3 != 0) goto Lb8
            boolean r3 = r7.py()
            if (r3 != 0) goto Lb8
            return
        Lb8:
            r3 = r0
            goto L71
        Lba:
            okhttp3.y r4 = new okhttp3.y
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.C7459n.m27081q(okio.x2, java.util.List):void");
    }

    /* JADX INFO: renamed from: s */
    private static final boolean m27082s(x2 x2Var, byte b2) {
        return !x2Var.py() && x2Var.g1(0L) == b2;
    }

    @InterfaceC7396q
    public static final List<C7533y> toq(@InterfaceC7396q fn3e fn3eVar, @InterfaceC7396q String headerName) {
        d2ok.m23075h(fn3eVar, "<this>");
        d2ok.m23075h(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = fn3eVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (a9.e5(headerName, fn3eVar.m26864y(i2), true)) {
                try {
                    m27081q(new x2().lrht(fn3eVar.n7h(i2)), arrayList);
                } catch (EOFException e2) {
                    C7498p.f43366k.f7l8().qrj("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m27083y(x2 x2Var) throws EOFException {
        boolean z2 = false;
        while (!x2Var.py()) {
            byte bG1 = x2Var.g1(0L);
            if (bG1 != 44) {
                if (!(bG1 == 32 || bG1 == 9)) {
                    break;
                }
                x2Var.readByte();
            } else {
                x2Var.readByte();
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean zy(@InterfaceC7396q fti ftiVar) {
        d2ok.m23075h(ftiVar, "<this>");
        if (d2ok.f7l8(ftiVar.wlev().qrj(), "HEAD")) {
            return false;
        }
        int iI1 = ftiVar.i1();
        return (((iI1 >= 100 && iI1 < 200) || iI1 == 204 || iI1 == 304) && C1359g.wvg(ftiVar) == -1 && !a9.e5("chunked", fti.g1(ftiVar, com.google.common.net.zy.f27247d, null, 2, null), true)) ? false : true;
    }
}
