package okhttp3;

import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TlsVersion.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum d3 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    @InterfaceC7396q
    public static final C7429k Companion = new C7429k(null);

    @InterfaceC7396q
    private final String javaName;

    /* JADX INFO: renamed from: okhttp3.d3$k */
    /* JADX INFO: compiled from: TlsVersion.kt */
    public static final class C7429k {
        private C7429k() {
        }

        public /* synthetic */ C7429k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final d3 m26843k(@InterfaceC7396q String javaName) {
            d2ok.m23075h(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return d3.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return d3.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return d3.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return d3.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return d3.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }
    }

    d3(String str) {
        this.javaName = str;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final d3 forJavaName(@InterfaceC7396q String str) {
        return Companion.m26843k(str);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "javaName", imports = {}))
    @InterfaceC6769y(name = "-deprecated_javaName")
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m28302deprecated_javaName() {
        return this.javaName;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "javaName")
    public final String javaName() {
        return this.javaName;
    }
}
