package okhttp3;

import com.xiaomi.onetrack.api.C5693g;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.nn86;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okhttp3.y */
/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7533y {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String f43620k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final Map<String, String> f94222toq;

    public C7533y(@InterfaceC7396q String scheme, @InterfaceC7396q Map<String, String> authParams) {
        String lowerCase;
        d2ok.m23075h(scheme, "scheme");
        d2ok.m23075h(authParams, "authParams");
        this.f43620k = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                d2ok.kja0(US, "US");
                lowerCase = key.toLowerCase(US);
                d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        d2ok.kja0(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f94222toq = mapUnmodifiableMap;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof C7533y) {
            C7533y c7533y = (C7533y) obj;
            if (d2ok.f7l8(c7533y.f43620k, this.f43620k) && d2ok.f7l8(c7533y.f94222toq, this.f94222toq)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "realm")
    public final String f7l8() {
        return this.f94222toq.get("realm");
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "charset")
    /* JADX INFO: renamed from: g */
    public final Charset m27488g() {
        String str = this.f94222toq.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                d2ok.kja0(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        d2ok.kja0(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public int hashCode() {
        return ((899 + this.f43620k.hashCode()) * 31) + this.f94222toq.hashCode();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "authParams", imports = {}))
    @InterfaceC6769y(name = "-deprecated_authParams")
    /* JADX INFO: renamed from: k */
    public final Map<String, String> m27489k() {
        return this.f94222toq;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "authParams")
    /* JADX INFO: renamed from: n */
    public final Map<String, String> m27490n() {
        return this.f94222toq;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C5693g.f31761C, imports = {}))
    @InterfaceC6769y(name = "-deprecated_scheme")
    /* JADX INFO: renamed from: q */
    public final String m27491q() {
        return this.f43620k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final C7533y m27492s(@InterfaceC7396q Charset charset) {
        d2ok.m23075h(charset, "charset");
        Map mapWo = nn86.wo(this.f94222toq);
        String strName = charset.name();
        d2ok.kja0(strName, "charset.name()");
        mapWo.put("charset", strName);
        return new C7533y(this.f43620k, (Map<String, String>) mapWo);
    }

    @InterfaceC7396q
    public String toString() {
        return this.f43620k + " authParams=" + this.f94222toq;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "charset", imports = {}))
    @InterfaceC6769y(name = "-deprecated_charset")
    public final Charset toq() {
        return m27488g();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = C5693g.f31761C)
    /* JADX INFO: renamed from: y */
    public final String m27493y() {
        return this.f43620k;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "realm", imports = {}))
    @InterfaceC6769y(name = "-deprecated_realm")
    public final String zy() {
        return f7l8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7533y(@InterfaceC7396q String scheme, @InterfaceC7396q String realm) {
        d2ok.m23075h(scheme, "scheme");
        d2ok.m23075h(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        d2ok.kja0(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}
