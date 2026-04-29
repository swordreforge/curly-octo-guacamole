package com.google.common.net;

import com.google.common.base.AbstractC4265n;
import com.google.common.base.C4258g;
import com.google.common.base.C4280z;
import com.google.common.base.fu4;
import com.google.common.base.jk;
import com.google.common.base.ni7;
import com.google.common.base.o1t;
import com.google.common.base.t8r;
import com.google.common.collect.ab;
import com.google.common.collect.b3e;
import com.google.common.collect.gc3c;
import com.google.common.collect.lw;
import com.google.common.collect.oki;
import com.google.common.collect.vep5;
import com.google.common.collect.vy;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.xiaomi.settingsdk.backup.data.KeyBinarySettingItem;
import com.xiaomi.settingsdk.backup.data.KeyJsonSettingItem;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.eqxt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.net.g */
/* JADX INFO: compiled from: MediaType.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@wlev.toq
@InterfaceC7731k
public final class C4727g {

    /* JADX INFO: renamed from: h */
    private static final String f27204h = "video";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f68422kja0 = "text";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f68434n7h = "image";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f68444qrj = "audio";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f68461x2 = "application";

    /* JADX INFO: renamed from: g */
    @LazyInit
    private o1t<Charset> f27219g;

    /* JADX INFO: renamed from: k */
    private final String f27220k;

    /* JADX INFO: renamed from: n */
    @LazyInit
    private int f27221n;

    /* JADX INFO: renamed from: q */
    @LazyInit
    private String f27222q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f68473toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final gc3c<String, String> f68474zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f68400f7l8 = "charset";

    /* JADX INFO: renamed from: y */
    private static final gc3c<String, String> f27217y = gc3c.of(f68400f7l8, com.google.common.base.zy.f7l8(C4258g.f68103zy.name()));

    /* JADX INFO: renamed from: s */
    private static final AbstractC4265n f27212s = AbstractC4265n.m15414g().toq(AbstractC4265n.zurt().fti()).toq(AbstractC4265n.t8r(' ')).toq(AbstractC4265n.gvn7("()<>@,;:\\\"/[]?="));

    /* JADX INFO: renamed from: p */
    private static final AbstractC4265n f27210p = AbstractC4265n.m15414g().toq(AbstractC4265n.gvn7("\"\\\r"));

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final AbstractC4265n f68424ld6 = AbstractC4265n.m15420q(" \t\r\n");

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final Map<C4727g, C4727g> f68421ki = vy.vyq();

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f68388cdj = "*";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final C4727g f68449t8r = m16583p(f68388cdj, f68388cdj);

    /* JADX INFO: renamed from: i */
    public static final C4727g f27205i = m16583p("text", f68388cdj);

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final C4727g f68401fn3e = m16583p("image", f68388cdj);

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final C4727g f68472zurt = m16583p("audio", f68388cdj);

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final C4727g f68436ni7 = m16583p("video", f68388cdj);

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final C4727g f68404fu4 = m16583p("application", f68388cdj);

    /* JADX INFO: renamed from: z */
    public static final C4727g f27218z = ld6("text", "cache-manifest");

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final C4727g f68439o1t = ld6("text", "css");

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final C4727g f68460wvg = ld6("text", "csv");

    /* JADX INFO: renamed from: t */
    public static final C4727g f27213t = ld6("text", "html");

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final C4727g f68431mcp = ld6("text", com.android.thememanager.basemodule.analysis.toq.jhn);

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final C4727g f68417jk = ld6("text", "plain");

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final C4727g f68379a9 = ld6("text", "javascript");

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final C4727g f68403fti = ld6("text", "tab-separated-values");

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final C4727g f68418jp0y = ld6("text", "vcard");

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final C4727g f68408gvn7 = ld6("text", "vnd.wap.wml");

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final C4727g f68393d3 = ld6("text", "xml");

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final C4727g f68440oc = ld6("text", "vtt");

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final C4727g f68398eqxt = m16583p("image", "bmp");

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final C4727g f68392d2ok = m16583p("image", "x-canon-crw");

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final C4727g f68428lvui = m16583p("image", "gif");

    /* JADX INFO: renamed from: r */
    public static final C4727g f27211r = m16583p("image", "vnd.microsoft.icon");

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final C4727g f68395dd = m16583p("image", "jpeg");

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final C4727g f68462x9kr = m16583p("image", "png");

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final C4727g f68435ncyb = m16583p("image", "vnd.adobe.photoshop");

    /* JADX INFO: renamed from: l */
    public static final C4727g f27207l = ld6("image", "svg+xml");

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final C4727g f68433n5r1 = m16583p("image", "tiff");

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final C4727g f68412hyr = m16583p("image", "webp");

    /* JADX INFO: renamed from: f */
    public static final C4727g f27203f = m16583p("audio", "mp4");

    /* JADX INFO: renamed from: c */
    public static final C4727g f27200c = m16583p("audio", "mpeg");

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final C4727g f68425lrht = m16583p("audio", "ogg");

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final C4727g f68452uv6 = m16583p("audio", "webm");

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final C4727g f68456vyq = m16583p("audio", "l16");

    /* JADX INFO: renamed from: e */
    public static final C4727g f27202e = m16583p("audio", "l24");

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final C4727g f68438nn86 = m16583p("audio", "basic");

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final C4727g f68411hb = m16583p("audio", "aac");

    /* JADX INFO: renamed from: j */
    public static final C4727g f27206j = m16583p("audio", "vorbis");

    /* JADX INFO: renamed from: o */
    public static final C4727g f27209o = m16583p("audio", "x-ms-wma");

    /* JADX INFO: renamed from: m */
    public static final C4727g f27208m = m16583p("audio", "x-ms-wax");

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final C4727g f68397ek5k = m16583p("audio", "vnd.rn-realaudio");

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final C4727g f68467yz = m16583p("audio", "vnd.wave");

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final C4727g f68465y9n = m16583p("video", "mp4");

    /* JADX INFO: renamed from: b */
    public static final C4727g f27199b = m16583p("video", "mpeg");

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final C4727g f68383bf2 = m16583p("video", "ogg");

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final C4727g f68413i1 = m16583p("video", "quicktime");

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final C4727g f68380a98o = m16583p("video", "webm");

    /* JADX INFO: renamed from: a */
    public static final C4727g f27198a = m16583p("video", "x-ms-wmv");

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final C4727g f68470zp = m16583p("video", "x-flv");

    /* JADX INFO: renamed from: x */
    public static final C4727g f27216x = m16583p("video", "3gpp");

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final C4727g f68390ch = m16583p("video", "3gpp2");

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final C4727g f68437nmn5 = ld6("application", "xml");

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static final C4727g f68427lv5 = ld6("application", "atom+xml");

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static final C4727g f68448t8iq = m16583p("application", "x-bzip2");

    /* JADX INFO: renamed from: u */
    public static final C4727g f27214u = ld6("application", "dart");

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final C4727g f68384bo = m16583p("application", "vnd.apple.pkpass");

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final C4727g f68464y2 = m16583p("application", "vnd.ms-fontobject");

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    public static final C4727g f68387c8jq = m16583p("application", "epub+zip");

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    public static final C4727g f68409gyi = m16583p("application", "x-www-form-urlencoded");

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    public static final C4727g f68396dr = m16583p("application", "pkcs12");

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    public static final C4727g f68463xwq3 = m16583p("application", KeyBinarySettingItem.f34357g);

    /* JADX INFO: renamed from: v */
    public static final C4727g f27215v = m16583p("application", "x-gzip");

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    public static final C4727g f68415ikck = m16583p("application", "hal+json");

    /* JADX INFO: renamed from: d */
    public static final C4727g f27201d = ld6("application", "javascript");

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    public static final C4727g f68432mu = m16583p("application", "jose");

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    public static final C4727g f68455vq = m16583p("application", "jose+json");

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    public static final C4727g f68442qkj8 = ld6("application", KeyJsonSettingItem.f34358g);

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    public static final C4727g f68402fnq8 = ld6("application", "manifest+json");

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    public static final C4727g f68443qo = m16583p("application", "vnd.google-earth.kml+xml");

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    public static final C4727g f68450tfm = m16583p("application", "vnd.google-earth.kmz");

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    public static final C4727g f68459wo = m16583p("application", "mbox");

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    public static final C4727g f68394d8wk = m16583p("application", "x-apple-aspen-config");

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final C4727g f68405g1 = m16583p("application", "vnd.ms-excel");

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    public static final C4727g f68458was = m16583p("application", "vnd.ms-outlook");

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    public static final C4727g f68406gbni = m16583p("application", "vnd.ms-powerpoint");

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    public static final C4727g f68471zsr0 = m16583p("application", "msword");

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    public static final C4727g f68441py = m16583p("application", "wasm");

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    public static final C4727g f68414i9jn = m16583p("application", "x-nacl");

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    public static final C4727g f68426ltg8 = m16583p("application", "x-pnacl");

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    public static final C4727g f68445r8s8 = m16583p("application", "octet-stream");

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final C4727g f68429m4 = m16583p("application", "ogg");

    /* JADX INFO: renamed from: v0af, reason: collision with root package name */
    public static final C4727g f68453v0af = m16583p("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");

    /* JADX INFO: renamed from: etdu, reason: collision with root package name */
    public static final C4727g f68399etdu = m16583p("application", "vnd.openxmlformats-officedocument.presentationml.presentation");

    /* JADX INFO: renamed from: sok, reason: collision with root package name */
    public static final C4727g f68447sok = m16583p("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    /* JADX INFO: renamed from: cfr, reason: collision with root package name */
    public static final C4727g f68389cfr = m16583p("application", "vnd.oasis.opendocument.graphics");

    /* JADX INFO: renamed from: w831, reason: collision with root package name */
    public static final C4727g f68457w831 = m16583p("application", "vnd.oasis.opendocument.presentation");

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final C4727g f68468z4 = m16583p("application", "vnd.oasis.opendocument.spreadsheet");

    /* JADX INFO: renamed from: yqrt, reason: collision with root package name */
    public static final C4727g f68466yqrt = m16583p("application", "vnd.oasis.opendocument.text");

    /* JADX INFO: renamed from: kcsr, reason: collision with root package name */
    public static final C4727g f68420kcsr = m16583p("application", "pdf");

    /* JADX INFO: renamed from: bwp, reason: collision with root package name */
    public static final C4727g f68385bwp = m16583p("application", "postscript");

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    public static final C4727g f68446se = m16583p("application", "protobuf");

    /* JADX INFO: renamed from: gc3c, reason: collision with root package name */
    public static final C4727g f68407gc3c = ld6("application", "rdf+xml");

    /* JADX INFO: renamed from: zkd, reason: collision with root package name */
    public static final C4727g f68469zkd = ld6("application", "rtf");

    /* JADX INFO: renamed from: bz2, reason: collision with root package name */
    public static final C4727g f68386bz2 = m16583p("application", "font-sfnt");

    /* JADX INFO: renamed from: uj2j, reason: collision with root package name */
    public static final C4727g f68451uj2j = m16583p("application", "x-shockwave-flash");

    /* JADX INFO: renamed from: jz5, reason: collision with root package name */
    public static final C4727g f68419jz5 = m16583p("application", "vnd.sketchup.skp");

    /* JADX INFO: renamed from: ktq, reason: collision with root package name */
    public static final C4727g f68423ktq = ld6("application", "soap+xml");

    /* JADX INFO: renamed from: b3e, reason: collision with root package name */
    public static final C4727g f68381b3e = m16583p("application", "x-tar");

    /* JADX INFO: renamed from: bek6, reason: collision with root package name */
    public static final C4727g f68382bek6 = m16583p("application", "font-woff");

    /* JADX INFO: renamed from: cv06, reason: collision with root package name */
    public static final C4727g f68391cv06 = m16583p("application", "font-woff2");

    /* JADX INFO: renamed from: h7am, reason: collision with root package name */
    public static final C4727g f68410h7am = ld6("application", "xhtml+xml");

    /* JADX INFO: renamed from: vep5, reason: collision with root package name */
    public static final C4727g f68454vep5 = ld6("application", "xrd+xml");

    /* JADX INFO: renamed from: mbx, reason: collision with root package name */
    public static final C4727g f68430mbx = m16583p("application", "zip");

    /* JADX INFO: renamed from: jbh, reason: collision with root package name */
    private static final ni7.C4267q f68416jbh = ni7.m15433h("; ").fn3e("=");

    /* JADX INFO: renamed from: com.google.common.net.g$k */
    /* JADX INFO: compiled from: MediaType.java */
    class k implements t8r<Collection<String>, b3e<String>> {
        k() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b3e<String> apply(Collection<String> collection) {
            return b3e.copyOf(collection);
        }
    }

    /* JADX INFO: renamed from: com.google.common.net.g$toq */
    /* JADX INFO: compiled from: MediaType.java */
    class toq implements t8r<String, String> {
        toq() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return C4727g.f27212s.mcp(str) ? str : C4727g.kja0(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.net.g$zy */
    /* JADX INFO: compiled from: MediaType.java */
    private static final class zy {

        /* JADX INFO: renamed from: k */
        final String f27225k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f68475toq = 0;

        zy(String str) {
            this.f27225k = str;
        }

        /* JADX INFO: renamed from: g */
        char m16593g() {
            jk.yz(m16595n());
            return this.f27225k.charAt(this.f68475toq);
        }

        /* JADX INFO: renamed from: k */
        char m16594k(char c2) {
            jk.yz(m16595n());
            jk.yz(m16593g() == c2);
            this.f68475toq++;
            return c2;
        }

        /* JADX INFO: renamed from: n */
        boolean m16595n() {
            int i2 = this.f68475toq;
            return i2 >= 0 && i2 < this.f27225k.length();
        }

        /* JADX INFO: renamed from: q */
        String m16596q(AbstractC4265n abstractC4265n) {
            jk.yz(m16595n());
            int i2 = this.f68475toq;
            this.f68475toq = abstractC4265n.fti().kja0(this.f27225k, i2);
            return m16595n() ? this.f27225k.substring(i2, this.f68475toq) : this.f27225k.substring(i2);
        }

        char toq(AbstractC4265n abstractC4265n) {
            jk.yz(m16595n());
            char cM16593g = m16593g();
            jk.yz(abstractC4265n.mo15362t(cM16593g));
            this.f68475toq++;
            return cM16593g;
        }

        String zy(AbstractC4265n abstractC4265n) {
            int i2 = this.f68475toq;
            String strM16596q = m16596q(abstractC4265n);
            jk.yz(this.f68475toq != i2);
            return strM16596q;
        }
    }

    private C4727g(String str, String str2, gc3c<String, String> gc3cVar) {
        this.f27220k = str;
        this.f68473toq = str2;
        this.f68474zy = gc3cVar;
    }

    private static C4727g f7l8(String str, String str2, lw<String, String> lwVar) {
        jk.a9(str);
        jk.a9(str2);
        jk.a9(lwVar);
        String strT8r = t8r(str);
        String strT8r2 = t8r(str2);
        jk.m15380n(!f68388cdj.equals(strT8r) || f68388cdj.equals(strT8r2), "A wildcard type cannot be used with a non-wildcard subtype");
        gc3c.C4388k c4388kBuilder = gc3c.builder();
        for (Map.Entry<String, String> entry : lwVar.entries()) {
            String strT8r3 = t8r(entry.getKey());
            c4388kBuilder.mo15711g(strT8r3, ki(strT8r3, entry.getValue()));
        }
        C4727g c4727g = new C4727g(strT8r, strT8r2, c4388kBuilder.mo15714k());
        return (C4727g) fu4.m15351k(f68421ki.get(c4727g), c4727g);
    }

    private Map<String, b3e<String>> fn3e() {
        return vy.ikck(this.f68474zy.asMap(), new k());
    }

    /* JADX INFO: renamed from: g */
    public static C4727g m16580g(String str, String str2) {
        C4727g c4727gF7l8 = f7l8(str, str2, gc3c.of());
        c4727gF7l8.f27219g = o1t.absent();
        return c4727gF7l8;
    }

    private static String ki(String str, String str2) {
        return f68400f7l8.equals(str) ? com.google.common.base.zy.f7l8(str2) : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String kja0(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append(eqxt.f81913toq);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        sb.append(eqxt.f81913toq);
        return sb.toString();
    }

    private static C4727g ld6(String str, String str2) {
        C4727g c4727gZy = zy(new C4727g(str, str2, f27217y));
        c4727gZy.f27219g = o1t.of(C4258g.f68103zy);
        return c4727gZy;
    }

    /* JADX INFO: renamed from: n */
    private String m16582n() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27220k);
        sb.append('/');
        sb.append(this.f68473toq);
        if (!this.f68474zy.isEmpty()) {
            sb.append("; ");
            f68416jbh.m15446q(sb, oki.a9(this.f68474zy, new toq()).entries());
        }
        return sb.toString();
    }

    static C4727g n7h(String str) {
        return m16580g("video", str);
    }

    /* JADX INFO: renamed from: p */
    private static C4727g m16583p(String str, String str2) {
        C4727g c4727gZy = zy(new C4727g(str, str2, gc3c.of()));
        c4727gZy.f27219g = o1t.absent();
        return c4727gZy;
    }

    static C4727g qrj(String str) {
        return m16580g("text", str);
    }

    /* JADX INFO: renamed from: s */
    static C4727g m16584s(String str) {
        return m16580g("audio", str);
    }

    private static String t8r(String str) {
        jk.m15383q(f27212s.mcp(str));
        return com.google.common.base.zy.f7l8(str);
    }

    static C4727g x2(String str) {
        return m16580g("image", str);
    }

    /* JADX INFO: renamed from: y */
    static C4727g m16585y(String str) {
        return m16580g("application", str);
    }

    public static C4727g zurt(String str) {
        String strZy;
        jk.a9(str);
        zy zyVar = new zy(str);
        try {
            AbstractC4265n abstractC4265n = f27212s;
            String strZy2 = zyVar.zy(abstractC4265n);
            zyVar.m16594k('/');
            String strZy3 = zyVar.zy(abstractC4265n);
            gc3c.C4388k c4388kBuilder = gc3c.builder();
            while (zyVar.m16595n()) {
                AbstractC4265n abstractC4265n2 = f68424ld6;
                zyVar.m16596q(abstractC4265n2);
                zyVar.m16594k(';');
                zyVar.m16596q(abstractC4265n2);
                AbstractC4265n abstractC4265n3 = f27212s;
                String strZy4 = zyVar.zy(abstractC4265n3);
                zyVar.m16594k('=');
                if ('\"' == zyVar.m16593g()) {
                    zyVar.m16594k(eqxt.f81913toq);
                    StringBuilder sb = new StringBuilder();
                    while ('\"' != zyVar.m16593g()) {
                        if ('\\' == zyVar.m16593g()) {
                            zyVar.m16594k('\\');
                            sb.append(zyVar.toq(AbstractC4265n.m15414g()));
                        } else {
                            sb.append(zyVar.zy(f27210p));
                        }
                    }
                    strZy = sb.toString();
                    zyVar.m16594k(eqxt.f81913toq);
                } else {
                    strZy = zyVar.zy(abstractC4265n3);
                }
                c4388kBuilder.mo15711g(strZy4, strZy);
            }
            return f7l8(strZy2, strZy3, c4388kBuilder.mo15714k());
        } catch (IllegalStateException e2) {
            throw new IllegalArgumentException("Could not parse '" + str + "'", e2);
        }
    }

    private static C4727g zy(C4727g c4727g) {
        f68421ki.put(c4727g, c4727g);
        return c4727g;
    }

    public boolean cdj(C4727g c4727g) {
        return (c4727g.f27220k.equals(f68388cdj) || c4727g.f27220k.equals(this.f27220k)) && (c4727g.f68473toq.equals(f68388cdj) || c4727g.f68473toq.equals(this.f68473toq)) && this.f68474zy.entries().containsAll(c4727g.f68474zy.entries());
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4727g)) {
            return false;
        }
        C4727g c4727g = (C4727g) obj;
        return this.f27220k.equals(c4727g.f27220k) && this.f68473toq.equals(c4727g.f68473toq) && fn3e().equals(c4727g.fn3e());
    }

    public String fu4() {
        return this.f27220k;
    }

    /* JADX INFO: renamed from: h */
    public boolean m16586h() {
        return f68388cdj.equals(this.f27220k) || f68388cdj.equals(this.f68473toq);
    }

    public int hashCode() {
        int i2 = this.f27221n;
        if (i2 != 0) {
            return i2;
        }
        int qVar = C4280z.toq(this.f27220k, this.f68473toq, fn3e());
        this.f27221n = qVar;
        return qVar;
    }

    /* JADX INFO: renamed from: i */
    public gc3c<String, String> m16587i() {
        return this.f68474zy;
    }

    public C4727g mcp() {
        return this.f68474zy.isEmpty() ? this : m16580g(this.f27220k, this.f68473toq);
    }

    public String ni7() {
        return this.f68473toq;
    }

    public C4727g o1t(String str, String str2) {
        return m16589t(str, vep5.of(str2));
    }

    /* JADX INFO: renamed from: q */
    public o1t<Charset> m16588q() {
        o1t<Charset> o1tVarOf = this.f27219g;
        if (o1tVarOf == null) {
            o1t<Charset> o1tVarAbsent = o1t.absent();
            ab<String> it = this.f68474zy.get(f68400f7l8).iterator();
            String str = null;
            o1tVarOf = o1tVarAbsent;
            while (it.hasNext()) {
                String next = it.next();
                if (str == null) {
                    o1tVarOf = o1t.of(Charset.forName(next));
                    str = next;
                } else if (!str.equals(next)) {
                    throw new IllegalStateException("Multiple charset values defined: " + str + ", " + next);
                }
            }
            this.f27219g = o1tVarOf;
        }
        return o1tVarOf;
    }

    /* JADX INFO: renamed from: t */
    public C4727g m16589t(String str, Iterable<String> iterable) {
        jk.a9(str);
        jk.a9(iterable);
        String strT8r = t8r(str);
        gc3c.C4388k c4388kBuilder = gc3c.builder();
        ab<Map.Entry<String, String>> it = this.f68474zy.entries().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (!strT8r.equals(key)) {
                c4388kBuilder.mo15711g(key, next.getValue());
            }
        }
        Iterator<String> it2 = iterable.iterator();
        while (it2.hasNext()) {
            c4388kBuilder.mo15711g(strT8r, ki(strT8r, it2.next()));
        }
        C4727g c4727g = new C4727g(this.f27220k, this.f68473toq, c4388kBuilder.mo15714k());
        if (!strT8r.equals(f68400f7l8)) {
            c4727g.f27219g = this.f27219g;
        }
        return (C4727g) fu4.m15351k(f68421ki.get(c4727g), c4727g);
    }

    public String toString() {
        String str = this.f27222q;
        if (str != null) {
            return str;
        }
        String strM16582n = m16582n();
        this.f27222q = strM16582n;
        return strM16582n;
    }

    public C4727g wvg(lw<String, String> lwVar) {
        return f7l8(this.f27220k, this.f68473toq, lwVar);
    }

    /* JADX INFO: renamed from: z */
    public C4727g m16590z(Charset charset) {
        jk.a9(charset);
        C4727g c4727gO1t = o1t(f68400f7l8, charset.name());
        c4727gO1t.f27219g = o1t.of(charset);
        return c4727gO1t;
    }
}
