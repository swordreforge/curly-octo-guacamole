package androidx.core.os;

import android.os.LocaleList;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.Locale;
import zy.InterfaceC7830i;
import zy.a9;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.vyq;

/* JADX INFO: compiled from: LocaleListCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final x2 f50547toq = m2762k(new Locale[0]);

    /* JADX INFO: renamed from: k */
    private final n7h f3715k;

    /* JADX INFO: renamed from: androidx.core.os.x2$k */
    /* JADX INFO: compiled from: LocaleListCompat.java */
    @hyr(21)
    static class C0591k {
        private C0591k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Locale m2768k(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: LocaleListCompat.java */
    @hyr(24)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static LocaleList m2769k(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @InterfaceC7830i
        static LocaleList toq() {
            return LocaleList.getAdjustedDefault();
        }

        @InterfaceC7830i
        static LocaleList zy() {
            return LocaleList.getDefault();
        }
    }

    private x2(n7h n7hVar) {
        this.f3715k = n7hVar;
    }

    @lvui
    public static x2 f7l8() {
        return f50547toq;
    }

    @vyq(min = 1)
    @lvui
    /* JADX INFO: renamed from: g */
    public static x2 m2761g() {
        return n7h(toq.zy());
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static x2 m2762k(@lvui Locale... localeArr) {
        return n7h(toq.m2769k(localeArr));
    }

    @hyr(24)
    @Deprecated
    public static x2 kja0(Object obj) {
        return n7h((LocaleList) obj);
    }

    @vyq(min = 1)
    @lvui
    /* JADX INFO: renamed from: n */
    public static x2 m2763n() {
        return n7h(toq.toq());
    }

    @hyr(24)
    @lvui
    public static x2 n7h(@lvui LocaleList localeList) {
        return new x2(new kja0(localeList));
    }

    static Locale toq(String str) {
        if (str.contains(C5658n.f73185t8r)) {
            String[] strArrSplit = str.split(C5658n.f73185t8r, -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @lvui
    public static x2 zy(@dd String str) {
        if (str == null || str.isEmpty()) {
            return f7l8();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = C0591k.m2768k(strArrSplit[i2]);
        }
        return m2762k(localeArr);
    }

    public boolean equals(Object obj) {
        return (obj instanceof x2) && this.f3715k.equals(((x2) obj).f3715k);
    }

    public int hashCode() {
        return this.f3715k.hashCode();
    }

    @a9(from = 0)
    public int ld6() {
        return this.f3715k.size();
    }

    /* JADX INFO: renamed from: p */
    public boolean m2764p() {
        return this.f3715k.isEmpty();
    }

    @dd
    /* JADX INFO: renamed from: q */
    public Locale m2765q(int i2) {
        return this.f3715k.get(i2);
    }

    @dd
    public Object qrj() {
        return this.f3715k.zy();
    }

    @a9(from = -1)
    /* JADX INFO: renamed from: s */
    public int m2766s(@dd Locale locale) {
        return this.f3715k.mo2733k(locale);
    }

    @lvui
    public String toString() {
        return this.f3715k.toString();
    }

    @lvui
    public String x2() {
        return this.f3715k.toq();
    }

    @dd
    /* JADX INFO: renamed from: y */
    public Locale m2767y(@lvui String[] strArr) {
        return this.f3715k.mo2734q(strArr);
    }
}
