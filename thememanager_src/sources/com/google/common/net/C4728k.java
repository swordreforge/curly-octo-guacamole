package com.google.common.net;

import com.google.common.base.C4280z;
import com.google.common.base.jk;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.net.k */
/* JADX INFO: compiled from: HostAndPort.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@wlev.toq
@InterfaceC7731k
public final class C4728k implements Serializable {

    /* JADX INFO: renamed from: k */
    private static final int f27226k = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private C4728k(String str, int i2, boolean z2) {
        this.host = str;
        this.port = i2;
        this.hasBracketlessColons = z2;
    }

    public static C4728k fromHost(String str) {
        C4728k c4728kFromString = fromString(str);
        jk.fn3e(!c4728kFromString.hasPort(), "Host has a port: %s", str);
        return c4728kFromString;
    }

    public static C4728k fromParts(String str, int i2) {
        jk.ld6(toq(i2), "Port out of range: %s", i2);
        C4728k c4728kFromString = fromString(str);
        jk.fn3e(!c4728kFromString.hasPort(), "Host has a port: %s", str);
        return new C4728k(c4728kFromString.host, i2, c4728kFromString.hasBracketlessColons);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.net.C4728k fromString(java.lang.String r6) {
        /*
            com.google.common.base.jk.a9(r6)
            java.lang.String r0 = "["
            boolean r0 = r6.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L17
            java.lang.String[] r0 = m16597k(r6)
            r4 = r0[r3]
            r0 = r0[r2]
            goto L35
        L17:
            r0 = 58
            int r4 = r6.indexOf(r0)
            if (r4 < 0) goto L30
            int r5 = r4 + 1
            int r0 = r6.indexOf(r0, r5)
            if (r0 != r1) goto L30
            java.lang.String r4 = r6.substring(r3, r4)
            java.lang.String r0 = r6.substring(r5)
            goto L35
        L30:
            if (r4 < 0) goto L33
            r3 = r2
        L33:
            r0 = 0
            r4 = r6
        L35:
            boolean r5 = com.google.common.base.d2ok.m15298q(r0)
            if (r5 != 0) goto L6c
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            r1 = r1 ^ r2
            java.lang.String r2 = "Unparseable port number: %s"
            com.google.common.base.jk.fn3e(r1, r2, r6)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L55
            boolean r0 = toq(r1)
            java.lang.String r2 = "Port number out of range: %s"
            com.google.common.base.jk.fn3e(r0, r2, r6)
            goto L6c
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unparseable port number: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L6c:
            com.google.common.net.k r6 = new com.google.common.net.k
            r6.<init>(r4, r1, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.C4728k.fromString(java.lang.String):com.google.common.net.k");
    }

    /* JADX INFO: renamed from: k */
    private static String[] m16597k(String str) {
        jk.fn3e(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        jk.fn3e(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i2 = iLastIndexOf + 1;
        if (i2 == str.length()) {
            return new String[]{strSubstring, ""};
        }
        jk.fn3e(str.charAt(i2) == ':', "Only a colon may follow a close bracket: %s", str);
        int i3 = iLastIndexOf + 2;
        for (int i4 = i3; i4 < str.length(); i4++) {
            jk.fn3e(Character.isDigit(str.charAt(i4)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i3)};
    }

    private static boolean toq(int i2) {
        return i2 >= 0 && i2 <= 65535;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4728k)) {
            return false;
        }
        C4728k c4728k = (C4728k) obj;
        return C4280z.m15455k(this.host, c4728k.host) && this.port == c4728k.port;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        jk.yz(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int i2) {
        return hasPort() ? this.port : i2;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int hashCode() {
        return C4280z.toq(this.host, Integer.valueOf(this.port));
    }

    public C4728k requireBracketsForIPv6() {
        jk.fn3e(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }

    public C4728k withDefaultPort(int i2) {
        jk.m15383q(toq(i2));
        return hasPort() ? this : new C4728k(this.host, i2, this.hasBracketlessColons);
    }
}
