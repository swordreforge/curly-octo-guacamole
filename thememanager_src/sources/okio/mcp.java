package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import l05.InterfaceC6769y;
import miuix.security.C7323k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: HashingSink.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"})
public final class mcp extends fu4 implements vyq {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final C7566k f43798g = new C7566k(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final Mac f43799n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final MessageDigest f43800q;

    /* JADX INFO: renamed from: okio.mcp$k */
    /* JADX INFO: compiled from: HashingSink.kt */
    public static final class C7566k {
        private C7566k() {
        }

        public /* synthetic */ C7566k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        public final mcp f7l8(@InterfaceC7396q vyq sink) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            return new mcp(sink, "SHA-512");
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: g */
        public final mcp m27802g(@InterfaceC7396q vyq sink) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            return new mcp(sink, "SHA-256");
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final mcp m27803k(@InterfaceC7396q vyq sink, @InterfaceC7396q kja0 key) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            kotlin.jvm.internal.d2ok.m23075h(key, "key");
            return new mcp(sink, key, "HmacSHA1");
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: n */
        public final mcp m27804n(@InterfaceC7396q vyq sink) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            return new mcp(sink, C7323k.f90062zy);
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: q */
        public final mcp m27805q(@InterfaceC7396q vyq sink) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            return new mcp(sink, C7323k.f90061toq);
        }

        @InterfaceC7396q
        @l05.qrj
        public final mcp toq(@InterfaceC7396q vyq sink, @InterfaceC7396q kja0 key) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            kotlin.jvm.internal.d2ok.m23075h(key, "key");
            return new mcp(sink, key, "HmacSHA256");
        }

        @InterfaceC7396q
        @l05.qrj
        public final mcp zy(@InterfaceC7396q vyq sink, @InterfaceC7396q kja0 key) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            kotlin.jvm.internal.d2ok.m23075h(key, "key");
            return new mcp(sink, key, "HmacSHA512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcp(@InterfaceC7396q vyq sink, @InterfaceC7396q MessageDigest digest) {
        super(sink);
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        kotlin.jvm.internal.d2ok.m23075h(digest, "digest");
        this.f43800q = digest;
        this.f43799n = null;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final mcp fu4(@InterfaceC7396q vyq vyqVar) {
        return f43798g.m27802g(vyqVar);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: h */
    public static final mcp m27798h(@InterfaceC7396q vyq vyqVar) {
        return f43798g.m27805q(vyqVar);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final mcp ki(@InterfaceC7396q vyq vyqVar) {
        return f43798g.m27804n(vyqVar);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final mcp ld6(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q kja0 kja0Var) {
        return f43798g.toq(vyqVar, kja0Var);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: p */
    public static final mcp m27799p(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q kja0 kja0Var) {
        return f43798g.m27803k(vyqVar, kja0Var);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final mcp wvg(@InterfaceC7396q vyq vyqVar) {
        return f43798g.f7l8(vyqVar);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final mcp x2(@InterfaceC7396q vyq vyqVar, @InterfaceC7396q kja0 kja0Var) {
        return f43798g.zy(vyqVar, kja0Var);
    }

    @Override // okio.fu4, okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        C7575s.m27855n(source.size(), 0L, j2);
        C7541c c7541c = source.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        long j3 = 0;
        while (j3 < j2) {
            int iMin = (int) Math.min(j2 - j3, c7541c.f94264zy - c7541c.f94263toq);
            MessageDigest messageDigest = this.f43800q;
            if (messageDigest != null) {
                messageDigest.update(c7541c.f43687k, c7541c.f94263toq, iMin);
            } else {
                Mac mac = this.f43799n;
                kotlin.jvm.internal.d2ok.qrj(mac);
                mac.update(c7541c.f43687k, c7541c.f94263toq, iMin);
            }
            j3 += (long) iMin;
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
        }
        super.mo26936j(source, j2);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "hash", imports = {}))
    @InterfaceC6769y(name = "-deprecated_hash")
    /* JADX INFO: renamed from: q */
    public final kja0 m27800q() {
        return m27801y();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "hash")
    /* JADX INFO: renamed from: y */
    public final kja0 m27801y() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f43800q;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f43799n;
            kotlin.jvm.internal.d2ok.qrj(mac);
            bArrDoFinal = mac.doFinal();
        }
        kotlin.jvm.internal.d2ok.qrj(bArrDoFinal);
        return new kja0(bArrDoFinal);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mcp(@InterfaceC7396q vyq sink, @InterfaceC7396q String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        kotlin.jvm.internal.d2ok.m23075h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.d2ok.kja0(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcp(@InterfaceC7396q vyq sink, @InterfaceC7396q Mac mac) {
        super(sink);
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        kotlin.jvm.internal.d2ok.m23075h(mac, "mac");
        this.f43799n = mac;
        this.f43800q = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mcp(@InterfaceC7396q vyq sink, @InterfaceC7396q kja0 key, @InterfaceC7396q String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        kotlin.jvm.internal.d2ok.m23075h(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            was wasVar = was.f36763k;
            kotlin.jvm.internal.d2ok.qrj(mac);
            this(sink, mac);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
