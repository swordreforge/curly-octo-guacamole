package androidx.core.net;

import android.net.Uri;
import androidx.core.util.n7h;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.eqxt;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: MailTo.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50535f7l8 = "bcc";

    /* JADX INFO: renamed from: g */
    private static final String f3695g = "cc";

    /* JADX INFO: renamed from: n */
    private static final String f3696n = "body";

    /* JADX INFO: renamed from: q */
    private static final String f3697q = "to";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f50536toq = "mailto:";

    /* JADX INFO: renamed from: y */
    private static final String f3698y = "subject";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f50537zy = "mailto";

    /* JADX INFO: renamed from: k */
    private HashMap<String, String> f3699k = new HashMap<>();

    private zy() {
    }

    public static boolean f7l8(@dd Uri uri) {
        return uri != null && f50537zy.equals(uri.getScheme());
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public static zy m2707p(@lvui String str) throws C0576q {
        String strDecode;
        String strSubstring;
        n7h.x2(str);
        if (!m2709y(str)) {
            throw new C0576q("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        zy zyVar = new zy();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    zyVar.f3699k.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String strM2710g = zyVar.m2710g();
        if (strM2710g != null) {
            strDecode = strDecode + ", " + strM2710g;
        }
        zyVar.f3699k.put("to", strDecode);
        return zyVar;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public static zy m2708s(@lvui Uri uri) throws C0576q {
        return m2707p(uri.toString());
    }

    /* JADX INFO: renamed from: y */
    public static boolean m2709y(@dd String str) {
        return str != null && str.startsWith(f50536toq);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public String m2710g() {
        return this.f3699k.get("to");
    }

    @dd
    /* JADX INFO: renamed from: k */
    public String m2711k() {
        return this.f3699k.get(f50535f7l8);
    }

    @dd
    /* JADX INFO: renamed from: n */
    public String m2712n() {
        return this.f3699k.get("subject");
    }

    @dd
    /* JADX INFO: renamed from: q */
    public Map<String, String> m2713q() {
        return this.f3699k;
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder(f50536toq);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.f3699k.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append(eqxt.f36674q);
        }
        return sb.toString();
    }

    @dd
    public String toq() {
        return this.f3699k.get("body");
    }

    @dd
    public String zy() {
        return this.f3699k.get(f3695g);
    }
}
