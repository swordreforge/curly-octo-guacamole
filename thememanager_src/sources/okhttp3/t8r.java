package okhttp3;

import b7.C1359g;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.zurt;

/* JADX INFO: compiled from: FormBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class t8r extends a9 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final List<String> f94209toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final List<String> f94210zy;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final toq f43606q = new toq(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final fu4 f43605n = fu4.f42952n.zy("application/x-www-form-urlencoded");

    /* JADX INFO: compiled from: FormBody.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public t8r(@InterfaceC7396q List<String> encodedNames, @InterfaceC7396q List<String> encodedValues) {
        d2ok.m23075h(encodedNames, "encodedNames");
        d2ok.m23075h(encodedValues, "encodedValues");
        this.f94209toq = C1359g.y9n(encodedNames);
        this.f94210zy = C1359g.y9n(encodedValues);
    }

    /* JADX INFO: renamed from: z */
    private final long m27470z(okio.qrj qrjVar, boolean z2) throws EOFException {
        okio.x2 x2VarMo27638g;
        if (z2) {
            x2VarMo27638g = new okio.x2();
        } else {
            d2ok.qrj(qrjVar);
            x2VarMo27638g = qrjVar.mo27638g();
        }
        int size = this.f94209toq.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                x2VarMo27638g.writeByte(38);
            }
            x2VarMo27638g.lrht(this.f94209toq.get(i2));
            x2VarMo27638g.writeByte(61);
            x2VarMo27638g.lrht(this.f94210zy.get(i2));
        }
        if (!z2) {
            return 0L;
        }
        long size2 = x2VarMo27638g.size();
        x2VarMo27638g.m27873y();
        return size2;
    }

    @InterfaceC7396q
    public final String fn3e(int i2) {
        return this.f94210zy.get(i2);
    }

    @InterfaceC7396q
    public final String fu4(int i2) {
        return zurt.toq.n7h(zurt.f94239ld6, fn3e(i2), 0, 0, true, 3, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public final String m27471i(int i2) {
        return this.f94209toq.get(i2);
    }

    @Override // okhttp3.a9
    /* JADX INFO: renamed from: k */
    public long mo26833k() {
        return m27470z(null, true);
    }

    @Override // okhttp3.a9
    public void ki(@InterfaceC7396q okio.qrj sink) throws IOException {
        d2ok.m23075h(sink, "sink");
        m27470z(sink, false);
    }

    @InterfaceC6769y(name = "size")
    public final int ni7() {
        return this.f94209toq.size();
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "size", imports = {}))
    @InterfaceC6769y(name = "-deprecated_size")
    public final int t8r() {
        return ni7();
    }

    @Override // okhttp3.a9
    @InterfaceC7396q
    public fu4 toq() {
        return f43605n;
    }

    @InterfaceC7396q
    public final String zurt(int i2) {
        return zurt.toq.n7h(zurt.f94239ld6, m27471i(i2), 0, 0, true, 3, null);
    }

    /* JADX INFO: renamed from: okhttp3.t8r$k */
    /* JADX INFO: compiled from: FormBody.kt */
    public static final class C7530k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private final Charset f43607k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final List<String> f94211toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final List<String> f94212zy;

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6768s
        public C7530k() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @InterfaceC6768s
        public C7530k(@InterfaceC7395n Charset charset) {
            this.f43607k = charset;
            this.f94211toq = new ArrayList();
            this.f94212zy = new ArrayList();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7530k m27472k(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            List<String> list = this.f94211toq;
            zurt.toq toqVar = zurt.f94239ld6;
            list.add(zurt.toq.m27545g(toqVar, name, 0, 0, zurt.f94236fn3e, false, false, true, false, this.f43607k, 91, null));
            this.f94212zy.add(zurt.toq.m27545g(toqVar, value, 0, 0, zurt.f94236fn3e, false, false, true, false, this.f43607k, 91, null));
            return this;
        }

        @InterfaceC7396q
        public final C7530k toq(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            List<String> list = this.f94211toq;
            zurt.toq toqVar = zurt.f94239ld6;
            list.add(zurt.toq.m27545g(toqVar, name, 0, 0, zurt.f94236fn3e, true, false, true, false, this.f43607k, 83, null));
            this.f94212zy.add(zurt.toq.m27545g(toqVar, value, 0, 0, zurt.f94236fn3e, true, false, true, false, this.f43607k, 83, null));
            return this;
        }

        @InterfaceC7396q
        public final t8r zy() {
            return new t8r(this.f94211toq, this.f94212zy);
        }

        public /* synthetic */ C7530k(Charset charset, int i2, kotlin.jvm.internal.ni7 ni7Var) {
            this((i2 & 1) != 0 ? null : charset);
        }
    }
}
