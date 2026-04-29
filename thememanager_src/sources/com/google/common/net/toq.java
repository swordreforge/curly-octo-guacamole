package com.google.common.net;

import com.google.common.base.jk;
import java.net.InetAddress;
import java.text.ParseException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: HostSpecifier.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class toq {

    /* JADX INFO: renamed from: k */
    private final String f27240k;

    private toq(String str) {
        this.f27240k = str;
    }

    /* JADX INFO: renamed from: k */
    public static toq m16620k(String str) throws ParseException {
        try {
            return toq(str);
        } catch (IllegalArgumentException e2) {
            ParseException parseException = new ParseException("Invalid host specifier: " + str, 0);
            parseException.initCause(e2);
            throw parseException;
        }
    }

    public static toq toq(String str) {
        C4728k c4728kFromString = C4728k.fromString(str);
        jk.m15383q(!c4728kFromString.hasPort());
        String host = c4728kFromString.getHost();
        InetAddress inetAddressF7l8 = null;
        try {
            inetAddressF7l8 = C4730q.f7l8(host);
        } catch (IllegalArgumentException unused) {
        }
        if (inetAddressF7l8 != null) {
            return new toq(C4730q.eqxt(inetAddressF7l8));
        }
        C4729n c4729nM16600q = C4729n.m16600q(host);
        if (c4729nM16600q.m16601g()) {
            return new toq(c4729nM16600q.toString());
        }
        throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + host);
    }

    public static boolean zy(String str) {
        try {
            toq(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof toq) {
            return this.f27240k.equals(((toq) obj).f27240k);
        }
        return false;
    }

    public int hashCode() {
        return this.f27240k.hashCode();
    }

    public String toString() {
        return this.f27240k;
    }
}
