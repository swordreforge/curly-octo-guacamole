package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.was;
import l05.InterfaceC6769y;
import miuix.security.C7323k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: HashingSource.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class jk extends AbstractC7579z implements nn86 {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final C7561k f43773g = new C7561k(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final Mac f43774n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final MessageDigest f43775q;

    /* JADX INFO: renamed from: okio.jk$k */
    /* JADX INFO: compiled from: HashingSource.kt */
    public static final class C7561k {
        private C7561k() {
        }

        public /* synthetic */ C7561k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        public final jk f7l8(@InterfaceC7396q nn86 source) {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            return new jk(source, "SHA-512");
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: g */
        public final jk m27767g(@InterfaceC7396q nn86 source) {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            return new jk(source, "SHA-256");
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final jk m27768k(@InterfaceC7396q nn86 source, @InterfaceC7396q kja0 key) {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            kotlin.jvm.internal.d2ok.m23075h(key, "key");
            return new jk(source, key, "HmacSHA1");
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: n */
        public final jk m27769n(@InterfaceC7396q nn86 source) {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            return new jk(source, C7323k.f90062zy);
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: q */
        public final jk m27770q(@InterfaceC7396q nn86 source) {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            return new jk(source, C7323k.f90061toq);
        }

        @InterfaceC7396q
        @l05.qrj
        public final jk toq(@InterfaceC7396q nn86 source, @InterfaceC7396q kja0 key) {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            kotlin.jvm.internal.d2ok.m23075h(key, "key");
            return new jk(source, key, "HmacSHA256");
        }

        @InterfaceC7396q
        @l05.qrj
        public final jk zy(@InterfaceC7396q nn86 source, @InterfaceC7396q kja0 key) {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            kotlin.jvm.internal.d2ok.m23075h(key, "key");
            return new jk(source, key, "HmacSHA512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(@InterfaceC7396q nn86 source, @InterfaceC7396q MessageDigest digest) {
        super(source);
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(digest, "digest");
        this.f43775q = digest;
        this.f43774n = null;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final jk fu4(@InterfaceC7396q nn86 nn86Var) {
        return f43773g.m27767g(nn86Var);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: h */
    public static final jk m27763h(@InterfaceC7396q nn86 nn86Var) {
        return f43773g.m27770q(nn86Var);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final jk ki(@InterfaceC7396q nn86 nn86Var) {
        return f43773g.m27769n(nn86Var);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final jk ld6(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q kja0 kja0Var) {
        return f43773g.toq(nn86Var, kja0Var);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: p */
    public static final jk m27764p(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q kja0 kja0Var) {
        return f43773g.m27768k(nn86Var, kja0Var);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final jk wvg(@InterfaceC7396q nn86 nn86Var) {
        return f43773g.f7l8(nn86Var);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final jk x2(@InterfaceC7396q nn86 nn86Var, @InterfaceC7396q kja0 kja0Var) {
        return f43773g.zy(nn86Var, kja0Var);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "hash", imports = {}))
    @InterfaceC6769y(name = "-deprecated_hash")
    /* JADX INFO: renamed from: q */
    public final kja0 m27765q() {
        return m27766y();
    }

    @Override // okio.AbstractC7579z, okio.nn86
    public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        long jWx16 = super.wx16(sink, j2);
        if (jWx16 != -1) {
            long size = sink.size() - jWx16;
            long size2 = sink.size();
            C7541c c7541c = sink.f43846k;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            while (size2 > size) {
                c7541c = c7541c.f94262f7l8;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                size2 -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            while (size2 < sink.size()) {
                int i2 = (int) ((((long) c7541c.f94263toq) + size) - size2);
                MessageDigest messageDigest = this.f43775q;
                if (messageDigest != null) {
                    messageDigest.update(c7541c.f43687k, i2, c7541c.f94264zy - i2);
                } else {
                    Mac mac = this.f43774n;
                    kotlin.jvm.internal.d2ok.qrj(mac);
                    mac.update(c7541c.f43687k, i2, c7541c.f94264zy - i2);
                }
                size2 += (long) (c7541c.f94264zy - c7541c.f94263toq);
                c7541c = c7541c.f43686g;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                size = size2;
            }
        }
        return jWx16;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "hash")
    /* JADX INFO: renamed from: y */
    public final kja0 m27766y() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f43775q;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f43774n;
            kotlin.jvm.internal.d2ok.qrj(mac);
            bArrDoFinal = mac.doFinal();
        }
        kotlin.jvm.internal.d2ok.qrj(bArrDoFinal);
        return new kja0(bArrDoFinal);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jk(@InterfaceC7396q nn86 source, @InterfaceC7396q String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.d2ok.kja0(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(@InterfaceC7396q nn86 source, @InterfaceC7396q Mac mac) {
        super(source);
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(mac, "mac");
        this.f43774n = mac;
        this.f43775q = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jk(@InterfaceC7396q nn86 source, @InterfaceC7396q kja0 key, @InterfaceC7396q String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        kotlin.jvm.internal.d2ok.m23075h(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            was wasVar = was.f36763k;
            kotlin.jvm.internal.d2ok.qrj(mac);
            this(source, mac);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
