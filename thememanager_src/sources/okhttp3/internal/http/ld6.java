package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.text.a9;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;
import okhttp3.fti;
import okhttp3.mcp;

/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ld6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f93896f7l8 = 421;

    /* JADX INFO: renamed from: g */
    public static final int f43139g = 308;

    /* JADX INFO: renamed from: n */
    public static final int f43140n = 307;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C7458k f43141q = new C7458k(null);

    /* JADX INFO: renamed from: y */
    public static final int f43142y = 100;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final mcp f43143k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    public final int f93897toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public final String f93898zy;

    /* JADX INFO: renamed from: okhttp3.internal.http.ld6$k */
    /* JADX INFO: compiled from: StatusLine.kt */
    public static final class C7458k {
        private C7458k() {
        }

        public /* synthetic */ C7458k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final ld6 m27077k(@InterfaceC7396q fti response) {
            d2ok.m23075h(response, "response");
            return new ld6(response.bap7(), response.i1(), response.bek6());
        }

        @InterfaceC7396q
        public final ld6 toq(@InterfaceC7396q String statusLine) throws IOException {
            mcp mcpVar;
            String strSubstring;
            d2ok.m23075h(statusLine, "statusLine");
            int i2 = 9;
            if (a9.r6ty(statusLine, "HTTP/1.", false, 2, null)) {
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    mcpVar = mcp.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    mcpVar = mcp.HTTP_1_1;
                }
            } else {
                if (!a9.r6ty(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                mcpVar = mcp.HTTP_1_0;
                i2 = 4;
            }
            int i3 = i2 + 3;
            if (statusLine.length() < i3) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i2, i3);
                d2ok.kja0(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i4 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i3) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i3) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i2 + 4);
                    d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new ld6(mcpVar, i4, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }

    public ld6(@InterfaceC7396q mcp protocol, int i2, @InterfaceC7396q String message) {
        d2ok.m23075h(protocol, "protocol");
        d2ok.m23075h(message, "message");
        this.f43143k = protocol;
        this.f93897toq = i2;
        this.f93898zy = message;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f43143k == mcp.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f93897toq);
        sb.append(' ');
        sb.append(this.f93898zy);
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
