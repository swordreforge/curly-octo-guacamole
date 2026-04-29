package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: HtmlCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f50622f7l8 = 16;

    /* JADX INFO: renamed from: g */
    public static final int f3852g = 8;

    /* JADX INFO: renamed from: k */
    public static final int f3853k = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f50623ld6 = 63;

    /* JADX INFO: renamed from: n */
    public static final int f3854n = 4;

    /* JADX INFO: renamed from: p */
    public static final int f3855p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f3856q = 2;

    /* JADX INFO: renamed from: s */
    public static final int f3857s = 256;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50624toq = 1;

    /* JADX INFO: renamed from: y */
    public static final int f3858y = 32;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50625zy = 1;

    /* JADX INFO: renamed from: androidx.core.text.zy$k */
    /* JADX INFO: compiled from: HtmlCompat.java */
    @hyr(24)
    static class C0629k {
        private C0629k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Spanned m2916k(String str, int i2) {
            return Html.fromHtml(str, i2);
        }

        @InterfaceC7830i
        static Spanned toq(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i2, imageGetter, tagHandler);
        }

        @InterfaceC7830i
        static String zy(Spanned spanned, int i2) {
            return Html.toHtml(spanned, i2);
        }
    }

    private zy() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static Spanned m2915k(@lvui String str, int i2) {
        return C0629k.m2916k(str, i2);
    }

    @lvui
    public static Spanned toq(@lvui String str, int i2, @dd Html.ImageGetter imageGetter, @dd Html.TagHandler tagHandler) {
        return C0629k.toq(str, i2, imageGetter, tagHandler);
    }

    @lvui
    public static String zy(@lvui Spanned spanned, int i2) {
        return C0629k.zy(spanned, i2);
    }
}
