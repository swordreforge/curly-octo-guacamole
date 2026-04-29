package okhttp3;

import b7.C1359g;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.a9;
import okhttp3.fn3e;
import okhttp3.fu4;

/* JADX INFO: renamed from: okhttp3.z */
/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7534z extends a9 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    public static final toq f94223f7l8 = new toq(null);

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    private static final byte[] f94224kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final fu4 f94225ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7396q
    private static final byte[] f94226n7h;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final fu4 f43621p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7396q
    private static final byte[] f94227qrj;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final fu4 f43622s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final fu4 f94228x2;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final fu4 f43623y;

    /* JADX INFO: renamed from: g */
    private long f43624g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final fu4 f43625n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final List<zy> f43626q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final okio.kja0 f94229toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final fu4 f94230zy;

    /* JADX INFO: renamed from: okhttp3.z$toq */
    /* JADX INFO: compiled from: MultipartBody.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        public final void m27501k(@InterfaceC7396q StringBuilder sb, @InterfaceC7396q String key) {
            d2ok.m23075h(sb, "<this>");
            d2ok.m23075h(key, "key");
            sb.append(kotlin.text.eqxt.f81913toq);
            int length = key.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = key.charAt(i2);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append(kotlin.text.eqxt.f81913toq);
        }
    }

    /* JADX INFO: renamed from: okhttp3.z$zy */
    /* JADX INFO: compiled from: MultipartBody.kt */
    public static final class zy {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        public static final k f94233zy = new k(null);

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private final fn3e f43628k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final a9 f94234toq;

        /* JADX INFO: renamed from: okhttp3.z$zy$k */
        /* JADX INFO: compiled from: MultipartBody.kt */
        @lv5({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        public static final class k {
            private k() {
            }

            public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }

            @InterfaceC7396q
            @l05.qrj
            /* JADX INFO: renamed from: k */
            public final zy m27507k(@InterfaceC7395n fn3e fn3eVar, @InterfaceC7396q a9 body) {
                d2ok.m23075h(body, "body");
                kotlin.jvm.internal.ni7 ni7Var = null;
                if (!((fn3eVar != null ? fn3eVar.zy(com.google.common.net.zy.f68571zy) : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((fn3eVar != null ? fn3eVar.zy(com.google.common.net.zy.f68551toq) : null) == null) {
                    return new zy(fn3eVar, body, ni7Var);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @InterfaceC7396q
            @l05.qrj
            /* JADX INFO: renamed from: q */
            public final zy m27508q(@InterfaceC7396q String name, @InterfaceC7395n String str, @InterfaceC7396q a9 body) {
                d2ok.m23075h(name, "name");
                d2ok.m23075h(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                toq toqVar = C7534z.f94223f7l8;
                toqVar.m27501k(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    toqVar.m27501k(sb, str);
                }
                String string = sb.toString();
                d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
                return m27507k(new fn3e.C7432k().m26871y(com.google.common.net.zy.f68526lrht, string).m26870s(), body);
            }

            @InterfaceC7396q
            @l05.qrj
            public final zy toq(@InterfaceC7396q a9 body) {
                d2ok.m23075h(body, "body");
                return m27507k(null, body);
            }

            @InterfaceC7396q
            @l05.qrj
            public final zy zy(@InterfaceC7396q String name, @InterfaceC7396q String value) {
                d2ok.m23075h(name, "name");
                d2ok.m23075h(value, "value");
                return m27508q(name, null, a9.C7427k.kja0(a9.f42917k, value, null, 1, null));
            }
        }

        private zy(fn3e fn3eVar, a9 a9Var) {
            this.f43628k = fn3eVar;
            this.f94234toq = a9Var;
        }

        public /* synthetic */ zy(fn3e fn3eVar, a9 a9Var, kotlin.jvm.internal.ni7 ni7Var) {
            this(fn3eVar, a9Var);
        }

        @InterfaceC7396q
        @l05.qrj
        public static final zy f7l8(@InterfaceC7396q String str, @InterfaceC7395n String str2, @InterfaceC7396q a9 a9Var) {
            return f94233zy.m27508q(str, str2, a9Var);
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: g */
        public static final zy m27502g(@InterfaceC7396q String str, @InterfaceC7396q String str2) {
            return f94233zy.zy(str, str2);
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: n */
        public static final zy m27503n(@InterfaceC7396q a9 a9Var) {
            return f94233zy.toq(a9Var);
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: q */
        public static final zy m27504q(@InterfaceC7395n fn3e fn3eVar, @InterfaceC7396q a9 a9Var) {
            return f94233zy.m27507k(fn3eVar, a9Var);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C3678q.f22041h, imports = {}))
        @InterfaceC6769y(name = "-deprecated_body")
        /* JADX INFO: renamed from: k */
        public final a9 m27505k() {
            return this.f94234toq;
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "headers", imports = {}))
        @InterfaceC6769y(name = "-deprecated_headers")
        public final fn3e toq() {
            return this.f43628k;
        }

        @InterfaceC7395n
        @InterfaceC6769y(name = "headers")
        /* JADX INFO: renamed from: y */
        public final fn3e m27506y() {
            return this.f43628k;
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = C3678q.f22041h)
        public final a9 zy() {
            return this.f94234toq;
        }
    }

    static {
        fu4.C7434k c7434k = fu4.f42952n;
        f43623y = c7434k.zy("multipart/mixed");
        f43622s = c7434k.zy("multipart/alternative");
        f43621p = c7434k.zy("multipart/digest");
        f94225ld6 = c7434k.zy("multipart/parallel");
        f94228x2 = c7434k.zy("multipart/form-data");
        f94227qrj = new byte[]{58, 32};
        f94226n7h = new byte[]{com.google.common.base.zy.f68124kja0, 10};
        f94224kja0 = new byte[]{45, 45};
    }

    public C7534z(@InterfaceC7396q okio.kja0 boundaryByteString, @InterfaceC7396q fu4 type, @InterfaceC7396q List<zy> parts) {
        d2ok.m23075h(boundaryByteString, "boundaryByteString");
        d2ok.m23075h(type, "type");
        d2ok.m23075h(parts, "parts");
        this.f94229toq = boundaryByteString;
        this.f94230zy = type;
        this.f43626q = parts;
        this.f43625n = fu4.f42952n.zy(type + "; boundary=" + ni7());
        this.f43624g = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    private final long m27494t(okio.qrj qrjVar, boolean z2) throws IOException {
        okio.x2 x2Var;
        if (z2) {
            qrjVar = new okio.x2();
            x2Var = qrjVar;
        } else {
            x2Var = 0;
        }
        int size = this.f43626q.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zy zyVar = this.f43626q.get(i2);
            fn3e fn3eVarM27506y = zyVar.m27506y();
            a9 a9VarZy = zyVar.zy();
            d2ok.qrj(qrjVar);
            qrjVar.write(f94224kja0);
            qrjVar.uc(this.f94229toq);
            qrjVar.write(f94226n7h);
            if (fn3eVarM27506y != null) {
                int size2 = fn3eVarM27506y.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    qrjVar.lrht(fn3eVarM27506y.m26864y(i3)).write(f94227qrj).lrht(fn3eVarM27506y.n7h(i3)).write(f94226n7h);
                }
            }
            fu4 qVar = a9VarZy.toq();
            if (qVar != null) {
                qrjVar.lrht("Content-Type: ").lrht(qVar.toString()).write(f94226n7h);
            }
            long jMo26833k = a9VarZy.mo26833k();
            if (jMo26833k != -1) {
                qrjVar.lrht("Content-Length: ").xwq3(jMo26833k).write(f94226n7h);
            } else if (z2) {
                d2ok.qrj(x2Var);
                x2Var.m27873y();
                return -1L;
            }
            byte[] bArr = f94226n7h;
            qrjVar.write(bArr);
            if (z2) {
                j2 += jMo26833k;
            } else {
                a9VarZy.ki(qrjVar);
            }
            qrjVar.write(bArr);
        }
        d2ok.qrj(qrjVar);
        byte[] bArr2 = f94224kja0;
        qrjVar.write(bArr2);
        qrjVar.uc(this.f94229toq);
        qrjVar.write(bArr2);
        qrjVar.write(f94226n7h);
        if (!z2) {
            return j2;
        }
        d2ok.qrj(x2Var);
        long size3 = j2 + x2Var.size();
        x2Var.m27873y();
        return size3;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "size", imports = {}))
    @InterfaceC6769y(name = "-deprecated_size")
    public final int fn3e() {
        return o1t();
    }

    @InterfaceC7396q
    public final zy fu4(int i2) {
        return this.f43626q.get(i2);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "parts", imports = {}))
    @InterfaceC6769y(name = "-deprecated_parts")
    /* JADX INFO: renamed from: i */
    public final List<zy> m27495i() {
        return this.f43626q;
    }

    @Override // okhttp3.a9
    /* JADX INFO: renamed from: k */
    public long mo26833k() throws IOException {
        long j2 = this.f43624g;
        if (j2 != -1) {
            return j2;
        }
        long jM27494t = m27494t(null, true);
        this.f43624g = jM27494t;
        return jM27494t;
    }

    @Override // okhttp3.a9
    public void ki(@InterfaceC7396q okio.qrj sink) throws IOException {
        d2ok.m23075h(sink, "sink");
        m27494t(sink, false);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "boundary")
    public final String ni7() {
        return this.f94229toq.utf8();
    }

    @InterfaceC6769y(name = "size")
    public final int o1t() {
        return this.f43626q.size();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "boundary", imports = {}))
    @InterfaceC6769y(name = "-deprecated_boundary")
    public final String t8r() {
        return ni7();
    }

    @Override // okhttp3.a9
    @InterfaceC7396q
    public fu4 toq() {
        return this.f43625n;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "type")
    public final fu4 wvg() {
        return this.f94230zy;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "parts")
    /* JADX INFO: renamed from: z */
    public final List<zy> m27496z() {
        return this.f43626q;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "type", imports = {}))
    @InterfaceC6769y(name = "-deprecated_type")
    public final fu4 zurt() {
        return this.f94230zy;
    }

    /* JADX INFO: renamed from: okhttp3.z$k */
    /* JADX INFO: compiled from: MultipartBody.kt */
    @lv5({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    public static final class k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final okio.kja0 f43627k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private fu4 f94231toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final List<zy> f94232zy;

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6768s
        public k() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @InterfaceC6768s
        public k(@InterfaceC7396q String boundary) {
            d2ok.m23075h(boundary, "boundary");
            this.f43627k = okio.kja0.Companion.x2(boundary);
            this.f94231toq = C7534z.f43623y;
            this.f94232zy = new ArrayList();
        }

        @InterfaceC7396q
        public final k f7l8(@InterfaceC7396q fu4 type) {
            d2ok.m23075h(type, "type");
            if (d2ok.f7l8(type.x2(), "multipart")) {
                this.f94231toq = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final C7534z m27497g() {
            if (!this.f94232zy.isEmpty()) {
                return new C7534z(this.f43627k, this.f94231toq, C1359g.y9n(this.f94232zy));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final k m27498k(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            m27500q(zy.f94233zy.zy(name, value));
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final k m27499n(@InterfaceC7396q a9 body) {
            d2ok.m23075h(body, "body");
            m27500q(zy.f94233zy.toq(body));
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final k m27500q(@InterfaceC7396q zy part) {
            d2ok.m23075h(part, "part");
            this.f94232zy.add(part);
            return this;
        }

        @InterfaceC7396q
        public final k toq(@InterfaceC7396q String name, @InterfaceC7395n String str, @InterfaceC7396q a9 body) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(body, "body");
            m27500q(zy.f94233zy.m27508q(name, str, body));
            return this;
        }

        @InterfaceC7396q
        public final k zy(@InterfaceC7395n fn3e fn3eVar, @InterfaceC7396q a9 body) {
            d2ok.m23075h(body, "body");
            m27500q(zy.f94233zy.m27507k(fn3eVar, body));
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ k(String str, int i2, kotlin.jvm.internal.ni7 ni7Var) {
            if ((i2 & 1) != 0) {
                str = UUID.randomUUID().toString();
                d2ok.kja0(str, "randomUUID().toString()");
            }
            this(str);
        }
    }
}
