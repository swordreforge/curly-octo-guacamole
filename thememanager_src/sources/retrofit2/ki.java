package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.C7534z;
import okhttp3.a9;
import okhttp3.fn3e;
import okhttp3.jk;
import okhttp3.t8r;
import okhttp3.zurt;

/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
final class ki {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f94716qrj = " \"<>^`{}|\\?#";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @Nullable
    private okhttp3.fu4 f94718f7l8;

    /* JADX INFO: renamed from: g */
    private final fn3e.C7432k f44181g;

    /* JADX INFO: renamed from: k */
    private final String f44182k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @Nullable
    private a9 f94719ld6;

    /* JADX INFO: renamed from: n */
    private final jk.C7511k f44183n = new jk.C7511k();

    /* JADX INFO: renamed from: p */
    @Nullable
    private t8r.C7530k f44184p;

    /* JADX INFO: renamed from: q */
    @Nullable
    private zurt.C7535k f44185q;

    /* JADX INFO: renamed from: s */
    @Nullable
    private C7534z.k f44186s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final okhttp3.zurt f94720toq;

    /* JADX INFO: renamed from: y */
    private final boolean f44187y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Nullable
    private String f94721zy;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final char[] f94717x2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final Pattern f94715n7h = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: retrofit2.ki$k */
    /* JADX INFO: compiled from: RequestBuilder.java */
    private static class C7641k extends a9 {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final a9 f94722toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final okhttp3.fu4 f94723zy;

        C7641k(a9 a9Var, okhttp3.fu4 fu4Var) {
            this.f94722toq = a9Var;
            this.f94723zy = fu4Var;
        }

        @Override // okhttp3.a9
        /* JADX INFO: renamed from: k */
        public long mo26833k() throws IOException {
            return this.f94722toq.mo26833k();
        }

        @Override // okhttp3.a9
        public void ki(okio.qrj qrjVar) throws IOException {
            this.f94722toq.ki(qrjVar);
        }

        @Override // okhttp3.a9
        public okhttp3.fu4 toq() {
            return this.f94723zy;
        }
    }

    ki(String str, okhttp3.zurt zurtVar, @Nullable String str2, @Nullable okhttp3.fn3e fn3eVar, @Nullable okhttp3.fu4 fu4Var, boolean z2, boolean z3, boolean z5) {
        this.f44182k = str;
        this.f94720toq = zurtVar;
        this.f94721zy = str2;
        this.f94718f7l8 = fu4Var;
        this.f44187y = z2;
        if (fn3eVar != null) {
            this.f44181g = fn3eVar.m26862p();
        } else {
            this.f44181g = new fn3e.C7432k();
        }
        if (z3) {
            this.f44184p = new t8r.C7530k();
        } else if (z5) {
            C7534z.k kVar = new C7534z.k();
            this.f44186s = kVar;
            kVar.f7l8(C7534z.f94228x2);
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m27990p(okio.x2 x2Var, String str, int i2, int i3, boolean z2) {
        okio.x2 x2Var2 = null;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (!z2 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || f94716qrj.indexOf(iCodePointAt) != -1 || (!z2 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (x2Var2 == null) {
                        x2Var2 = new okio.x2();
                    }
                    x2Var2.ni7(iCodePointAt);
                    while (!x2Var2.py()) {
                        int i4 = x2Var2.readByte() & 255;
                        x2Var.writeByte(37);
                        char[] cArr = f94717x2;
                        x2Var.writeByte(cArr[(i4 >> 4) & 15]);
                        x2Var.writeByte(cArr[i4 & 15]);
                    }
                } else {
                    x2Var.ni7(iCodePointAt);
                }
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: s */
    private static String m27991s(String str, boolean z2) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || f94716qrj.indexOf(iCodePointAt) != -1 || (!z2 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                okio.x2 x2Var = new okio.x2();
                x2Var.mo27639m(str, 0, iCharCount);
                m27990p(x2Var, str, iCharCount, length, z2);
                return x2Var.jbh();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    void f7l8(String str, @Nullable String str2, boolean z2) {
        String str3 = this.f94721zy;
        if (str3 != null) {
            zurt.C7535k c7535kD3 = this.f94720toq.d3(str3);
            this.f44185q = c7535kD3;
            if (c7535kD3 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f94720toq + ", Relative: " + this.f94721zy);
            }
            this.f94721zy = null;
        }
        if (z2) {
            this.f44185q.zy(str, str2);
        } else {
            this.f44185q.f7l8(str, str2);
        }
    }

    /* JADX INFO: renamed from: g */
    void m27992g(String str, String str2, boolean z2) {
        if (this.f94721zy == null) {
            throw new AssertionError();
        }
        String strM27991s = m27991s(str2, z2);
        String strReplace = this.f94721zy.replace("{" + str + "}", strM27991s);
        if (!f94715n7h.matcher(strReplace).matches()) {
            this.f94721zy = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* JADX INFO: renamed from: k */
    void m27993k(String str, String str2, boolean z2) {
        if (z2) {
            this.f44184p.toq(str, str2);
        } else {
            this.f44184p.m27472k(str, str2);
        }
    }

    jk.C7511k ld6() {
        okhttp3.zurt zurtVarLrht;
        zurt.C7535k c7535k = this.f44185q;
        if (c7535k != null) {
            zurtVarLrht = c7535k.m27539y();
        } else {
            zurtVarLrht = this.f94720toq.lrht(this.f94721zy);
            if (zurtVarLrht == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f94720toq + ", Relative: " + this.f94721zy);
            }
        }
        a9 c7641k = this.f94719ld6;
        if (c7641k == null) {
            t8r.C7530k c7530k = this.f44184p;
            if (c7530k != null) {
                c7641k = c7530k.zy();
            } else {
                C7534z.k kVar = this.f44186s;
                if (kVar != null) {
                    c7641k = kVar.m27497g();
                } else if (this.f44187y) {
                    c7641k = a9.m26831y(null, new byte[0]);
                }
            }
        }
        okhttp3.fu4 fu4Var = this.f94718f7l8;
        if (fu4Var != null) {
            if (c7641k != null) {
                c7641k = new C7641k(c7641k, fu4Var);
            } else {
                this.f44181g.toq(com.google.common.net.zy.f68571zy, fu4Var.toString());
            }
        }
        return this.f44183n.jk(zurtVarLrht).kja0(this.f44181g.m26870s()).m27314h(this.f44182k, c7641k);
    }

    /* JADX INFO: renamed from: n */
    void m27994n(C7534z.zy zyVar) {
        this.f44186s.m27500q(zyVar);
    }

    /* JADX INFO: renamed from: q */
    void m27995q(okhttp3.fn3e fn3eVar, a9 a9Var) {
        this.f44186s.zy(fn3eVar, a9Var);
    }

    void qrj(Object obj) {
        this.f94721zy = obj.toString();
    }

    void toq(String str, String str2) {
        if (!com.google.common.net.zy.f68571zy.equalsIgnoreCase(str)) {
            this.f44181g.toq(str, str2);
            return;
        }
        try {
            this.f94718f7l8 = okhttp3.fu4.m26903y(str2);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e2);
        }
    }

    void x2(a9 a9Var) {
        this.f94719ld6 = a9Var;
    }

    /* JADX INFO: renamed from: y */
    <T> void m27996y(Class<T> cls, @Nullable T t2) {
        this.f44183n.o1t(cls, t2);
    }

    void zy(okhttp3.fn3e fn3eVar) {
        this.f44181g.m26867n(fn3eVar);
    }
}
