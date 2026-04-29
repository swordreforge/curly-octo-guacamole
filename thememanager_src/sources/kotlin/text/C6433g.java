package kotlin.text;

import com.google.android.exoplayer2.C3548p;
import java.nio.charset.Charset;
import l05.InterfaceC6765n;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.text.g */
/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6433g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final Charset f81920f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final Charset f36683g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6433g f36684k = new C6433g();

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final Charset f36685n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7395n
    private static volatile Charset f36686p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final Charset f36687q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private static volatile Charset f36688s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final Charset f81921toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private static volatile Charset f36689y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final Charset f81922zy;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.d2ok.kja0(charsetForName, "forName(\"UTF-8\")");
        f81921toq = charsetForName;
        Charset charsetForName2 = Charset.forName(C3548p.f21093h);
        kotlin.jvm.internal.d2ok.kja0(charsetForName2, "forName(\"UTF-16\")");
        f81922zy = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.d2ok.kja0(charsetForName3, "forName(\"UTF-16BE\")");
        f36687q = charsetForName3;
        Charset charsetForName4 = Charset.forName(C3548p.f65142cdj);
        kotlin.jvm.internal.d2ok.kja0(charsetForName4, "forName(\"UTF-16LE\")");
        f36685n = charsetForName4;
        Charset charsetForName5 = Charset.forName(C3548p.f65246qrj);
        kotlin.jvm.internal.d2ok.kja0(charsetForName5, "forName(\"US-ASCII\")");
        f36683g = charsetForName5;
        Charset charsetForName6 = Charset.forName(C3548p.f65199kja0);
        kotlin.jvm.internal.d2ok.kja0(charsetForName6, "forName(\"ISO-8859-1\")");
        f81920f7l8 = charsetForName6;
    }

    private C6433g() {
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "UTF32")
    /* JADX INFO: renamed from: k */
    public final Charset m23528k() {
        Charset charset = f36689y;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        kotlin.jvm.internal.d2ok.kja0(charsetForName, "forName(\"UTF-32\")");
        f36689y = charsetForName;
        return charsetForName;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "UTF32_BE")
    public final Charset toq() {
        Charset charset = f36686p;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.d2ok.kja0(charsetForName, "forName(\"UTF-32BE\")");
        f36686p = charsetForName;
        return charsetForName;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "UTF32_LE")
    public final Charset zy() {
        Charset charset = f36688s;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.d2ok.kja0(charsetForName, "forName(\"UTF-32LE\")");
        f36688s = charsetForName;
        return charsetForName;
    }
}
