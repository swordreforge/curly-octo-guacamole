package okhttp3.internal.http2;

import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ErrorCode.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum toq {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    @InterfaceC7396q
    public static final C7479k Companion = new C7479k(null);
    private final int httpCode;

    /* JADX INFO: renamed from: okhttp3.internal.http2.toq$k */
    /* JADX INFO: compiled from: ErrorCode.kt */
    @lv5({"SMAP\nErrorCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorCode.kt\nokhttp3/internal/http2/ErrorCode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    public static final class C7479k {
        private C7479k() {
        }

        public /* synthetic */ C7479k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final toq m27190k(int i2) {
            for (toq toqVar : toq.values()) {
                if (toqVar.getHttpCode() == i2) {
                    return toqVar;
                }
            }
            return null;
        }
    }

    toq(int i2) {
        this.httpCode = i2;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
