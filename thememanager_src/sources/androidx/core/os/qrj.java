package androidx.core.os;

import com.market.sdk.utils.C5016s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import zy.InterfaceC7830i;
import zy.a9;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: LocaleListCompatWrapper.java */
/* JADX INFO: loaded from: classes.dex */
final class qrj implements n7h {

    /* JADX INFO: renamed from: k */
    private final Locale[] f3712k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final String f50545toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Locale[] f50544zy = new Locale[0];

    /* JADX INFO: renamed from: q */
    private static final Locale f3711q = new Locale(C5016s.f28231k, "XA");

    /* JADX INFO: renamed from: n */
    private static final Locale f3710n = new Locale("ar", "XB");

    /* JADX INFO: renamed from: g */
    private static final Locale f3709g = x2.toq("en-Latn");

    /* JADX INFO: renamed from: androidx.core.os.qrj$k */
    /* JADX INFO: compiled from: LocaleListCompatWrapper.java */
    @hyr(21)
    static class C0588k {
        private C0588k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static String m2752k(Locale locale) {
            return locale.getScript();
        }
    }

    qrj(@lvui Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3712k = f50544zy;
            this.f50545toq = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < localeArr.length; i2++) {
            Locale locale = localeArr[i2];
            if (locale == null) {
                throw new NullPointerException("list[" + i2 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                ld6(sb, locale2);
                if (i2 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f3712k = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f50545toq = sb.toString();
    }

    private int f7l8(Locale locale) {
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f3712k;
            if (i2 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (m2749p(locale, localeArr[i2]) > 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m2747g(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f3712k
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L8
            return r2
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = androidx.core.os.qrj.f3709g
            int r6 = r4.f7l8(r6)
            if (r6 != 0) goto L1b
            return r2
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.os.x2.toq(r1)
            int r1 = r4.f7l8(r1)
            if (r1 != 0) goto L3a
            return r2
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r2
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.qrj.m2747g(java.util.Collection, boolean):int");
    }

    @yz
    static void ld6(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    /* JADX INFO: renamed from: n */
    private Locale m2748n(Collection<String> collection, boolean z2) {
        int iM2747g = m2747g(collection, z2);
        if (iM2747g == -1) {
            return null;
        }
        return this.f3712k[iM2747g];
    }

    @a9(from = 0, to = 1)
    /* JADX INFO: renamed from: p */
    private static int m2749p(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m2750s(locale) || m2750s(locale2)) {
            return 0;
        }
        String strM2751y = m2751y(locale);
        if (!strM2751y.isEmpty()) {
            return strM2751y.equals(m2751y(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m2750s(Locale locale) {
        return f3711q.equals(locale) || f3710n.equals(locale);
    }

    /* JADX INFO: renamed from: y */
    private static String m2751y(Locale locale) {
        String strM2752k = C0588k.m2752k(locale);
        return !strM2752k.isEmpty() ? strM2752k : "";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qrj)) {
            return false;
        }
        Locale[] localeArr = ((qrj) obj).f3712k;
        if (this.f3712k.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.f3712k;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    @Override // androidx.core.os.n7h
    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.f3712k;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f3712k) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.n7h
    public boolean isEmpty() {
        return this.f3712k.length == 0;
    }

    @Override // androidx.core.os.n7h
    /* JADX INFO: renamed from: k */
    public int mo2733k(Locale locale) {
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f3712k;
            if (i2 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i2].equals(locale)) {
                return i2;
            }
            i2++;
        }
    }

    @Override // androidx.core.os.n7h
    /* JADX INFO: renamed from: q */
    public Locale mo2734q(@lvui String[] strArr) {
        return m2748n(Arrays.asList(strArr), false);
    }

    @Override // androidx.core.os.n7h
    public int size() {
        return this.f3712k.length;
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f3712k;
            if (i2 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i2]);
            if (i2 < this.f3712k.length - 1) {
                sb.append(',');
            }
            i2++;
        }
    }

    @Override // androidx.core.os.n7h
    public String toq() {
        return this.f50545toq;
    }

    @Override // androidx.core.os.n7h
    @dd
    public Object zy() {
        return null;
    }
}
