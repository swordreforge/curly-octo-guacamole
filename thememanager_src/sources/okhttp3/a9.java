package okhttp3;

import b7.C1359g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6433g;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.nn86;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a9 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7427k f42917k = new C7427k(null);

    /* JADX INFO: renamed from: okhttp3.a9$k */
    /* JADX INFO: compiled from: RequestBody.kt */
    public static final class C7427k {

        /* JADX INFO: renamed from: okhttp3.a9$k$k */
        /* JADX INFO: compiled from: RequestBody.kt */
        @lv5({"SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nokhttp3/RequestBody$Companion$asRequestBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
        public static final class k extends a9 {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ fu4 f93810toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ File f93811zy;

            k(fu4 fu4Var, File file) {
                this.f93810toq = fu4Var;
                this.f93811zy = file;
            }

            @Override // okhttp3.a9
            /* JADX INFO: renamed from: k */
            public long mo26833k() {
                return this.f93811zy.length();
            }

            @Override // okhttp3.a9
            public void ki(@InterfaceC7396q okio.qrj sink) throws FileNotFoundException {
                d2ok.m23075h(sink, "sink");
                nn86 nn86VarM27590i = okio.d2ok.m27590i(this.f93811zy);
                try {
                    sink.ek5k(nn86VarM27590i);
                    kotlin.io.zy.m23032k(nn86VarM27590i, null);
                } finally {
                }
            }

            @Override // okhttp3.a9
            @InterfaceC7395n
            public fu4 toq() {
                return this.f93810toq;
            }
        }

        /* JADX INFO: renamed from: okhttp3.a9$k$toq */
        /* JADX INFO: compiled from: RequestBody.kt */
        public static final class toq extends a9 {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ fu4 f93812toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ okio.kja0 f93813zy;

            toq(fu4 fu4Var, okio.kja0 kja0Var) {
                this.f93812toq = fu4Var;
                this.f93813zy = kja0Var;
            }

            @Override // okhttp3.a9
            /* JADX INFO: renamed from: k */
            public long mo26833k() {
                return this.f93813zy.size();
            }

            @Override // okhttp3.a9
            public void ki(@InterfaceC7396q okio.qrj sink) throws IOException {
                d2ok.m23075h(sink, "sink");
                sink.uc(this.f93813zy);
            }

            @Override // okhttp3.a9
            @InterfaceC7395n
            public fu4 toq() {
                return this.f93812toq;
            }
        }

        /* JADX INFO: renamed from: okhttp3.a9$k$zy */
        /* JADX INFO: compiled from: RequestBody.kt */
        public static final class zy extends a9 {

            /* JADX INFO: renamed from: n */
            final /* synthetic */ int f42918n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ byte[] f42919q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ fu4 f93814toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ int f93815zy;

            zy(fu4 fu4Var, int i2, byte[] bArr, int i3) {
                this.f93814toq = fu4Var;
                this.f93815zy = i2;
                this.f42919q = bArr;
                this.f42918n = i3;
            }

            @Override // okhttp3.a9
            /* JADX INFO: renamed from: k */
            public long mo26833k() {
                return this.f93815zy;
            }

            @Override // okhttp3.a9
            public void ki(@InterfaceC7396q okio.qrj sink) throws IOException {
                d2ok.m23075h(sink, "sink");
                sink.write(this.f42919q, this.f42918n, this.f93815zy);
            }

            @Override // okhttp3.a9
            @InterfaceC7395n
            public fu4 toq() {
                return this.f93814toq;
            }
        }

        private C7427k() {
        }

        public /* synthetic */ C7427k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        public static /* synthetic */ a9 cdj(C7427k c7427k, okio.kja0 kja0Var, fu4 fu4Var, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fu4Var = null;
            }
            return c7427k.m26840s(kja0Var, fu4Var);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ a9 m26834h(C7427k c7427k, fu4 fu4Var, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bArr.length;
            }
            return c7427k.m26841y(fu4Var, bArr, i2, i3);
        }

        public static /* synthetic */ a9 ki(C7427k c7427k, byte[] bArr, fu4 fu4Var, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                fu4Var = null;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return c7427k.qrj(bArr, fu4Var, i2, i3);
        }

        public static /* synthetic */ a9 kja0(C7427k c7427k, String str, fu4 fu4Var, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fu4Var = null;
            }
            return c7427k.toq(str, fu4Var);
        }

        public static /* synthetic */ a9 n7h(C7427k c7427k, File file, fu4 fu4Var, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fu4Var = null;
            }
            return c7427k.m26836k(file, fu4Var);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final a9 f7l8(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q byte[] content, int i2) {
            d2ok.m23075h(content, "content");
            return m26834h(this, fu4Var, content, i2, 0, 8, null);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        /* JADX INFO: renamed from: g */
        public final a9 m26835g(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q byte[] content) {
            d2ok.m23075h(content, "content");
            return m26834h(this, fu4Var, content, 0, 0, 12, null);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final a9 m26836k(@InterfaceC7396q File file, @InterfaceC7395n fu4 fu4Var) {
            d2ok.m23075h(file, "<this>");
            return new k(fu4Var, file);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        public final a9 ld6(@InterfaceC7396q byte[] bArr, @InterfaceC7395n fu4 fu4Var) {
            d2ok.m23075h(bArr, "<this>");
            return ki(this, bArr, fu4Var, 0, 0, 6, null);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @l05.qrj
        /* JADX INFO: renamed from: n */
        public final a9 m26837n(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q okio.kja0 content) {
            d2ok.m23075h(content, "content");
            return m26840s(content, fu4Var);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        /* JADX INFO: renamed from: p */
        public final a9 m26838p(@InterfaceC7396q byte[] bArr) {
            d2ok.m23075h(bArr, "<this>");
            return ki(this, bArr, null, 0, 0, 7, null);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @l05.qrj
        /* JADX INFO: renamed from: q */
        public final a9 m26839q(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q String content) {
            d2ok.m23075h(content, "content");
            return toq(content, fu4Var);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        public final a9 qrj(@InterfaceC7396q byte[] bArr, @InterfaceC7395n fu4 fu4Var, int i2, int i3) {
            d2ok.m23075h(bArr, "<this>");
            C1359g.n7h(bArr.length, i2, i3);
            return new zy(fu4Var, i3, bArr, i2);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        @l05.qrj
        /* JADX INFO: renamed from: s */
        public final a9 m26840s(@InterfaceC7396q okio.kja0 kja0Var, @InterfaceC7395n fu4 fu4Var) {
            d2ok.m23075h(kja0Var, "<this>");
            return new toq(fu4Var, kja0Var);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        @l05.qrj
        public final a9 toq(@InterfaceC7396q String str, @InterfaceC7395n fu4 fu4Var) {
            d2ok.m23075h(str, "<this>");
            Charset charset = C6433g.f81921toq;
            if (fu4Var != null) {
                Charset charsetF7l8 = fu4.f7l8(fu4Var, null, 1, null);
                if (charsetF7l8 == null) {
                    fu4Var = fu4.f42952n.m26909q(fu4Var + "; charset=utf-8");
                } else {
                    charset = charsetF7l8;
                }
            }
            byte[] bytes = str.getBytes(charset);
            d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
            return qrj(bytes, fu4Var, 0, bytes.length);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @InterfaceC6769y(name = "create")
        public final a9 x2(@InterfaceC7396q byte[] bArr, @InterfaceC7395n fu4 fu4Var, int i2) {
            d2ok.m23075h(bArr, "<this>");
            return ki(this, bArr, fu4Var, i2, 0, 4, null);
        }

        @InterfaceC6768s
        @l05.qrj
        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        /* JADX INFO: renamed from: y */
        public final a9 m26841y(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q byte[] content, int i2, int i3) {
            d2ok.m23075h(content, "content");
            return qrj(content, fu4Var, i2, i3);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @hb(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @l05.qrj
        public final a9 zy(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q File file) {
            d2ok.m23075h(file, "file");
            return m26836k(file, fu4Var);
        }
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @l05.qrj
    public static final a9 f7l8(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q okio.kja0 kja0Var) {
        return f42917k.m26837n(fu4Var, kja0Var);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @l05.qrj
    /* JADX INFO: renamed from: g */
    public static final a9 m26826g(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q String str) {
        return f42917k.m26839q(fu4Var, str);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    public static final a9 kja0(@InterfaceC7396q byte[] bArr, @InterfaceC7395n fu4 fu4Var, int i2, int i3) {
        return f42917k.qrj(bArr, fu4Var, i2, i3);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    @l05.qrj
    public static final a9 ld6(@InterfaceC7396q okio.kja0 kja0Var, @InterfaceC7395n fu4 fu4Var) {
        return f42917k.m26840s(kja0Var, fu4Var);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @hb(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @l05.qrj
    /* JADX INFO: renamed from: n */
    public static final a9 m26827n(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q File file) {
        return f42917k.zy(fu4Var, file);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    public static final a9 n7h(@InterfaceC7396q byte[] bArr, @InterfaceC7395n fu4 fu4Var, int i2) {
        return f42917k.x2(bArr, fu4Var, i2);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    /* JADX INFO: renamed from: p */
    public static final a9 m26828p(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q byte[] bArr, int i2, int i3) {
        return f42917k.m26841y(fu4Var, bArr, i2, i3);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    @l05.qrj
    /* JADX INFO: renamed from: q */
    public static final a9 m26829q(@InterfaceC7396q String str, @InterfaceC7395n fu4 fu4Var) {
        return f42917k.toq(str, fu4Var);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    public static final a9 qrj(@InterfaceC7396q byte[] bArr, @InterfaceC7395n fu4 fu4Var) {
        return f42917k.ld6(bArr, fu4Var);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    /* JADX INFO: renamed from: s */
    public static final a9 m26830s(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q byte[] bArr, int i2) {
        return f42917k.f7l8(fu4Var, bArr, i2);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    public static final a9 x2(@InterfaceC7396q byte[] bArr) {
        return f42917k.m26838p(bArr);
    }

    @InterfaceC6768s
    @l05.qrj
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @hb(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    /* JADX INFO: renamed from: y */
    public static final a9 m26831y(@InterfaceC7395n fu4 fu4Var, @InterfaceC7396q byte[] bArr) {
        return f42917k.m26835g(fu4Var, bArr);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "create")
    @l05.qrj
    public static final a9 zy(@InterfaceC7396q File file, @InterfaceC7395n fu4 fu4Var) {
        return f42917k.m26836k(file, fu4Var);
    }

    public boolean cdj() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m26832h() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public long mo26833k() throws IOException {
        return -1L;
    }

    public abstract void ki(@InterfaceC7396q okio.qrj qrjVar) throws IOException;

    @InterfaceC7395n
    public abstract fu4 toq();
}
