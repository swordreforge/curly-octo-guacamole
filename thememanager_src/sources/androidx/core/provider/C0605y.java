package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.core.content.res.C0506s;
import androidx.core.graphics.jp0y;
import androidx.core.graphics.o1t;
import androidx.core.util.n7h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import zy.a9;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: renamed from: androidx.core.provider.y */
/* JADX INFO: compiled from: FontsContractCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0605y {

    /* JADX INFO: renamed from: k */
    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static final String f3776k = "font_results";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    static final int f50562toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    static final int f50563zy = -2;

    /* JADX INFO: renamed from: androidx.core.provider.y$k */
    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static final class k implements BaseColumns {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f50564f7l8 = 0;

        /* JADX INFO: renamed from: g */
        public static final String f3777g = "result_code";

        /* JADX INFO: renamed from: k */
        public static final String f3778k = "file_id";

        /* JADX INFO: renamed from: n */
        public static final String f3779n = "font_italic";

        /* JADX INFO: renamed from: p */
        public static final int f3780p = 3;

        /* JADX INFO: renamed from: q */
        public static final String f3781q = "font_weight";

        /* JADX INFO: renamed from: s */
        public static final int f3782s = 2;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f50565toq = "font_ttc_index";

        /* JADX INFO: renamed from: y */
        public static final int f3783y = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f50566zy = "font_variation_settings";
    }

    /* JADX INFO: renamed from: androidx.core.provider.y$q */
    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f50567f7l8 = 1;

        /* JADX INFO: renamed from: g */
        public static final int f3784g = -4;

        /* JADX INFO: renamed from: k */
        @Deprecated
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public static final int f3785k = 0;

        /* JADX INFO: renamed from: n */
        public static final int f3786n = -3;

        /* JADX INFO: renamed from: q */
        public static final int f3787q = -2;

        /* JADX INFO: renamed from: s */
        public static final int f3788s = 3;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final int f50568toq = 0;

        /* JADX INFO: renamed from: y */
        public static final int f3789y = 2;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f50569zy = -1;

        /* JADX INFO: renamed from: androidx.core.provider.y$q$k */
        /* JADX INFO: compiled from: FontsContractCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public @interface k {
        }

        /* JADX INFO: renamed from: k */
        public void mo2533k(int i2) {
        }

        public void toq(Typeface typeface) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.y$toq */
    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class toq {

        /* JADX INFO: renamed from: n */
        public static final int f3790n = 2;

        /* JADX INFO: renamed from: q */
        public static final int f3791q = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f50570zy = 0;

        /* JADX INFO: renamed from: k */
        private final int f3792k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final zy[] f50571toq;

        @Deprecated
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public toq(int i2, @dd zy[] zyVarArr) {
            this.f3792k = i2;
            this.f50571toq = zyVarArr;
        }

        /* JADX INFO: renamed from: k */
        static toq m2819k(int i2, @dd zy[] zyVarArr) {
            return new toq(i2, zyVarArr);
        }

        public zy[] toq() {
            return this.f50571toq;
        }

        public int zy() {
            return this.f3792k;
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.y$zy */
    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class zy {

        /* JADX INFO: renamed from: k */
        private final Uri f3793k;

        /* JADX INFO: renamed from: n */
        private final int f3794n;

        /* JADX INFO: renamed from: q */
        private final boolean f3795q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f50572toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f50573zy;

        @Deprecated
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public zy(@lvui Uri uri, @a9(from = 0) int i2, @a9(from = 1, to = 1000) int i3, boolean z2, int i4) {
            this.f3793k = (Uri) n7h.x2(uri);
            this.f50572toq = i2;
            this.f50573zy = i3;
            this.f3795q = z2;
            this.f3794n = i4;
        }

        /* JADX INFO: renamed from: k */
        static zy m2820k(@lvui Uri uri, @a9(from = 0) int i2, @a9(from = 1, to = 1000) int i3, boolean z2, int i4) {
            return new zy(uri, i2, i3, z2, i4);
        }

        /* JADX INFO: renamed from: g */
        public boolean m2821g() {
            return this.f3795q;
        }

        @a9(from = 1, to = 1000)
        /* JADX INFO: renamed from: n */
        public int m2822n() {
            return this.f50573zy;
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public Uri m2823q() {
            return this.f3793k;
        }

        public int toq() {
            return this.f3794n;
        }

        @a9(from = 0)
        public int zy() {
            return this.f50572toq;
        }
    }

    private C0605y() {
    }

    public static void f7l8(@lvui Context context, @lvui C0599g c0599g, @lvui q qVar, @lvui Handler handler) {
        C0600k c0600k = new C0600k(qVar);
        f7l8.m2787q(context.getApplicationContext(), c0599g, 0, C0604s.toq(handler), c0600k);
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: g */
    public static Typeface m2813g(@lvui Context context, @lvui C0599g c0599g, int i2, boolean z2, @a9(from = 0) int i3, @lvui Handler handler, @lvui q qVar) {
        C0600k c0600k = new C0600k(qVar, handler);
        return z2 ? f7l8.m2786n(context, c0599g, c0600k, i2, i3) : f7l8.m2787q(context, c0599g, i2, null, c0600k);
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static Typeface m2814k(@lvui Context context, @dd CancellationSignal cancellationSignal, @lvui zy[] zyVarArr) {
        return o1t.zy(context, cancellationSignal, zyVarArr, 0);
    }

    @hyr(19)
    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: n */
    public static Map<Uri, ByteBuffer> m2815n(Context context, zy[] zyVarArr, CancellationSignal cancellationSignal) {
        return jp0y.m2493y(context, zyVarArr, cancellationSignal);
    }

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    @dd
    @yz
    /* JADX INFO: renamed from: q */
    public static ProviderInfo m2816q(@lvui PackageManager packageManager, @lvui C0599g c0599g, @dd Resources resources) throws PackageManager.NameNotFoundException {
        return C0601n.m2799g(packageManager, c0599g, resources);
    }

    @uv6({uv6.EnumC7844k.TESTS})
    @yz
    /* JADX INFO: renamed from: s */
    public static void m2817s() {
        f7l8.m2784g();
    }

    @lvui
    public static toq toq(@lvui Context context, @dd CancellationSignal cancellationSignal, @lvui C0599g c0599g) throws PackageManager.NameNotFoundException {
        return C0601n.m2801n(context, c0599g, cancellationSignal);
    }

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: y */
    public static void m2818y() {
        f7l8.m2784g();
    }

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static Typeface zy(Context context, C0599g c0599g, @dd C0506s.f7l8 f7l8Var, @dd Handler handler, boolean z2, int i2, int i3) {
        return m2813g(context, c0599g, i3, z2, i2, C0506s.f7l8.m2337n(handler), new o1t.C0540k(f7l8Var));
    }
}
