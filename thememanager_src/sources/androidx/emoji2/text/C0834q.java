package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C0599g;
import androidx.emoji2.text.C0830n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: renamed from: androidx.emoji2.text.q */
/* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0834q {

    /* JADX INFO: renamed from: androidx.emoji2.text.q$k */
    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class k {

        /* JADX INFO: renamed from: q */
        @lvui
        private static final String f4558q = "emojicompat-emoji-font";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private static final String f51181toq = "emoji2.text.DefaultEmojiConfig";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private static final String f51182zy = "androidx.content.action.LOAD_EMOJI_FONT";

        /* JADX INFO: renamed from: k */
        private final toq f4559k;

        @uv6({uv6.EnumC7844k.LIBRARY})
        public k(@dd toq toqVar) {
            this.f4559k = toqVar == null ? m4067n() : toqVar;
        }

        @dd
        private ProviderInfo f7l8(@lvui PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f4559k.zy(packageManager, new Intent(f51182zy), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoMo4070k = this.f4559k.mo4070k(it.next());
                if (m4065g(providerInfoMo4070k)) {
                    return providerInfoMo4070k;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        private boolean m4065g(@dd ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @dd
        /* JADX INFO: renamed from: k */
        private C0830n.zy m4066k(@lvui Context context, @dd C0599g c0599g) {
            if (c0599g == null) {
                return null;
            }
            return new ld6(context, c0599g);
        }

        @lvui
        /* JADX INFO: renamed from: n */
        private static toq m4067n() {
            return Build.VERSION.SDK_INT >= 28 ? new q() : new zy();
        }

        @lvui
        /* JADX INFO: renamed from: q */
        private C0599g m4068q(@lvui ProviderInfo providerInfo, @lvui PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0599g(str, str2, f4558q, toq(this.f4559k.toq(packageManager, str2)));
        }

        @lvui
        private List<List<byte[]>> toq(@lvui Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @dd
        @uv6({uv6.EnumC7844k.LIBRARY})
        @yz
        /* JADX INFO: renamed from: y */
        C0599g m4069y(@lvui Context context) {
            PackageManager packageManager = context.getPackageManager();
            androidx.core.util.n7h.qrj(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoF7l8 = f7l8(packageManager);
            if (providerInfoF7l8 == null) {
                return null;
            }
            try {
                return m4068q(providerInfoF7l8, packageManager);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf(f51181toq, e2);
                return null;
            }
        }

        @dd
        @uv6({uv6.EnumC7844k.LIBRARY})
        public C0830n.zy zy(@lvui Context context) {
            return m4066k(context, m4069y(context));
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.q$q */
    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    @hyr(28)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class q extends zy {
        @Override // androidx.emoji2.text.C0834q.toq
        @lvui
        public Signature[] toq(@lvui PackageManager packageManager, @lvui String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.q$toq */
    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class toq {
        @dd
        /* JADX INFO: renamed from: k */
        public ProviderInfo mo4070k(@lvui ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @lvui
        public Signature[] toq(@lvui PackageManager packageManager, @lvui String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @lvui
        public List<ResolveInfo> zy(@lvui PackageManager packageManager, @lvui Intent intent, int i2) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.q$zy */
    /* JADX INFO: compiled from: DefaultEmojiCompatConfig.java */
    @hyr(19)
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class zy extends toq {
        @Override // androidx.emoji2.text.C0834q.toq
        @dd
        /* JADX INFO: renamed from: k */
        public ProviderInfo mo4070k(@lvui ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C0834q.toq
        @lvui
        public List<ResolveInfo> zy(@lvui PackageManager packageManager, @lvui Intent intent, int i2) {
            return packageManager.queryIntentContentProviders(intent, i2);
        }
    }

    private C0834q() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static ld6 m4064k(@lvui Context context) {
        return (ld6) new k(null).zy(context);
    }
}
