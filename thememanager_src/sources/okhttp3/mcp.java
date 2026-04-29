package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum mcp {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    @InterfaceC7396q
    public static final C7518k Companion = new C7518k(null);

    @InterfaceC7396q
    private final String protocol;

    /* JADX INFO: renamed from: okhttp3.mcp$k */
    /* JADX INFO: compiled from: Protocol.kt */
    public static final class C7518k {
        private C7518k() {
        }

        public /* synthetic */ C7518k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final mcp m27366k(@InterfaceC7396q String protocol) throws IOException {
            d2ok.m23075h(protocol, "protocol");
            mcp mcpVar = mcp.HTTP_1_0;
            if (!d2ok.f7l8(protocol, mcpVar.protocol)) {
                mcpVar = mcp.HTTP_1_1;
                if (!d2ok.f7l8(protocol, mcpVar.protocol)) {
                    mcpVar = mcp.H2_PRIOR_KNOWLEDGE;
                    if (!d2ok.f7l8(protocol, mcpVar.protocol)) {
                        mcpVar = mcp.HTTP_2;
                        if (!d2ok.f7l8(protocol, mcpVar.protocol)) {
                            mcpVar = mcp.SPDY_3;
                            if (!d2ok.f7l8(protocol, mcpVar.protocol)) {
                                mcpVar = mcp.QUIC;
                                if (!d2ok.f7l8(protocol, mcpVar.protocol)) {
                                    throw new IOException("Unexpected protocol: " + protocol);
                                }
                            }
                        }
                    }
                }
            }
            return mcpVar;
        }
    }

    mcp(String str) {
        this.protocol = str;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final mcp get(@InterfaceC7396q String str) throws IOException {
        return Companion.m27366k(str);
    }

    @Override // java.lang.Enum
    @InterfaceC7396q
    public String toString() {
        return this.protocol;
    }
}
