package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: TextUtilsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class n7h {

    /* JADX INFO: renamed from: k */
    private static final Locale f3828k = new Locale("", "");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f50597toq = "Arab";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f50598zy = "Hebr";

    /* JADX INFO: renamed from: androidx.core.text.n7h$k */
    /* JADX INFO: compiled from: TextUtilsCompat.java */
    @hyr(17)
    static class C0618k {
        private C0618k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2882k(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    private n7h() {
    }

    /* JADX INFO: renamed from: k */
    private static int m2881k(@lvui Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int toq(@dd Locale locale) {
        return C0618k.m2882k(locale);
    }

    @lvui
    public static String zy(@lvui String str) {
        return TextUtils.htmlEncode(str);
    }
}
