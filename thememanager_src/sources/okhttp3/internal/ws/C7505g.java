package okhttp3.internal.ws;

import b7.C1359g;
import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.text.a9;
import kotlin.text.fti;
import kotlin.text.jk;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.fn3e;

/* JADX INFO: renamed from: okhttp3.internal.ws.g */
/* JADX INFO: compiled from: WebSocketExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7505g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f94031f7l8 = new k(null);

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final String f43397y = "Sec-WebSocket-Extensions";

    /* JADX INFO: renamed from: g */
    @InterfaceC6765n
    public final boolean f43398g;

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    public final boolean f43399k;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public final boolean f43400n;

    /* JADX INFO: renamed from: q */
    @InterfaceC6765n
    @InterfaceC7395n
    public final Integer f43401q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    @InterfaceC7395n
    public final Integer f94032toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC6765n
    public final boolean f94033zy;

    /* JADX INFO: renamed from: okhttp3.internal.ws.g$k */
    /* JADX INFO: compiled from: WebSocketExtensions.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7505g m27278k(@InterfaceC7396q fn3e responseHeaders) throws IOException {
            d2ok.m23075h(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z2 = false;
            Integer numCfr = null;
            boolean z3 = false;
            Integer numCfr2 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i2 = 0; i2 < size; i2++) {
                if (a9.e5(responseHeaders.m26864y(i2), C7505g.f43397y, true)) {
                    String strN7h = responseHeaders.n7h(i2);
                    int i3 = 0;
                    while (i3 < strN7h.length()) {
                        int iFn3e = C1359g.fn3e(strN7h, ',', i3, 0, 4, null);
                        int iT8r = C1359g.t8r(strN7h, ';', i3, iFn3e);
                        String strA98o = C1359g.a98o(strN7h, i3, iT8r);
                        int i4 = iT8r + 1;
                        if (a9.e5(strA98o, "permessage-deflate", true)) {
                            if (z2) {
                                z6 = true;
                            }
                            i3 = i4;
                            while (i3 < iFn3e) {
                                int iT8r2 = C1359g.t8r(strN7h, ';', i3, iFn3e);
                                int iT8r3 = C1359g.t8r(strN7h, '=', i3, iT8r2);
                                String strA98o2 = C1359g.a98o(strN7h, i3, iT8r3);
                                String strIp = iT8r3 < iT8r2 ? fti.ip(C1359g.a98o(strN7h, iT8r3 + 1, iT8r2), "\"") : null;
                                i3 = iT8r2 + 1;
                                if (a9.e5(strA98o2, "client_max_window_bits", true)) {
                                    if (numCfr != null) {
                                        z6 = true;
                                    }
                                    numCfr = strIp != null ? jk.cfr(strIp) : null;
                                    if (numCfr == null) {
                                        z6 = true;
                                    }
                                } else if (a9.e5(strA98o2, "client_no_context_takeover", true)) {
                                    if (z3) {
                                        z6 = true;
                                    }
                                    if (strIp != null) {
                                        z6 = true;
                                    }
                                    z3 = true;
                                } else if (a9.e5(strA98o2, "server_max_window_bits", true)) {
                                    if (numCfr2 != null) {
                                        z6 = true;
                                    }
                                    numCfr2 = strIp != null ? jk.cfr(strIp) : null;
                                    if (numCfr2 == null) {
                                        z6 = true;
                                    }
                                } else if (a9.e5(strA98o2, "server_no_context_takeover", true)) {
                                    if (z5) {
                                        z6 = true;
                                    }
                                    if (strIp != null) {
                                        z6 = true;
                                    }
                                    z5 = true;
                                } else {
                                    z6 = true;
                                }
                            }
                            z2 = true;
                        } else {
                            i3 = i4;
                            z6 = true;
                        }
                    }
                }
            }
            return new C7505g(z2, numCfr, z3, numCfr2, z5, z6);
        }
    }

    public C7505g() {
        this(false, null, false, null, false, false, 63, null);
    }

    public C7505g(boolean z2, @InterfaceC7395n Integer num, boolean z3, @InterfaceC7395n Integer num2, boolean z5, boolean z6) {
        this.f43399k = z2;
        this.f94032toq = num;
        this.f94033zy = z3;
        this.f43401q = num2;
        this.f43400n = z5;
        this.f43398g = z6;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C7505g m27272y(C7505g c7505g, boolean z2, Integer num, boolean z3, Integer num2, boolean z5, boolean z6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = c7505g.f43399k;
        }
        if ((i2 & 2) != 0) {
            num = c7505g.f94032toq;
        }
        Integer num3 = num;
        if ((i2 & 4) != 0) {
            z3 = c7505g.f94033zy;
        }
        boolean z7 = z3;
        if ((i2 & 8) != 0) {
            num2 = c7505g.f43401q;
        }
        Integer num4 = num2;
        if ((i2 & 16) != 0) {
            z5 = c7505g.f43400n;
        }
        boolean z8 = z5;
        if ((i2 & 32) != 0) {
            z6 = c7505g.f43398g;
        }
        return c7505g.f7l8(z2, num3, z7, num4, z8, z6);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7505g)) {
            return false;
        }
        C7505g c7505g = (C7505g) obj;
        return this.f43399k == c7505g.f43399k && d2ok.f7l8(this.f94032toq, c7505g.f94032toq) && this.f94033zy == c7505g.f94033zy && d2ok.f7l8(this.f43401q, c7505g.f43401q) && this.f43400n == c7505g.f43400n && this.f43398g == c7505g.f43398g;
    }

    @InterfaceC7396q
    public final C7505g f7l8(boolean z2, @InterfaceC7395n Integer num, boolean z3, @InterfaceC7395n Integer num2, boolean z5, boolean z6) {
        return new C7505g(z2, num, z3, num2, z5, z6);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m27273g() {
        return this.f43398g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z2 = this.f43399k;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        Integer num = this.f94032toq;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z3 = this.f94033zy;
        ?? r2 = z3;
        if (z3) {
            r2 = 1;
        }
        int i3 = (iHashCode + r2) * 31;
        Integer num2 = this.f43401q;
        int iHashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z5 = this.f43400n;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int i4 = (iHashCode2 + r22) * 31;
        boolean z6 = this.f43398g;
        return i4 + (z6 ? 1 : z6);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m27274k() {
        return this.f43399k;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m27275n() {
        return this.f43400n;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final Integer m27276q() {
        return this.f43401q;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m27277s(boolean z2) {
        return z2 ? this.f94033zy : this.f43400n;
    }

    @InterfaceC7396q
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f43399k + ", clientMaxWindowBits=" + this.f94032toq + ", clientNoContextTakeover=" + this.f94033zy + ", serverMaxWindowBits=" + this.f43401q + ", serverNoContextTakeover=" + this.f43400n + ", unknownValues=" + this.f43398g + ')';
    }

    @InterfaceC7395n
    public final Integer toq() {
        return this.f94032toq;
    }

    public final boolean zy() {
        return this.f94033zy;
    }

    public /* synthetic */ C7505g(boolean z2, Integer num, boolean z3, Integer num2, boolean z5, boolean z6, int i2, ni7 ni7Var) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? false : z3, (i2 & 8) == 0 ? num2 : null, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6);
    }
}
