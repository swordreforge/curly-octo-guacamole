package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.core.content.pm.AbstractC0489h;
import androidx.core.content.pm.kja0;
import androidx.core.graphics.drawable.IconCompat;
import com.android.thememanager.clockmessage.model.C1873k;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: renamed from: androidx.core.content.pm.i */
/* JADX INFO: compiled from: ShortcutManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0490i {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f50358f7l8 = 96;

    /* JADX INFO: renamed from: g */
    @yz
    static final String f3450g = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: k */
    public static final int f3451k = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static volatile List<AbstractC0497y> f50359ld6 = null;

    /* JADX INFO: renamed from: n */
    @yz
    static final String f3452n = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: p */
    private static volatile AbstractC0489h<?> f3453p = null;

    /* JADX INFO: renamed from: q */
    public static final int f3454q = 8;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f50360qrj = "androidx.core.content.pm.shortcut_listener_impl";

    /* JADX INFO: renamed from: s */
    public static final String f3455s = "android.intent.extra.shortcut.ID";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50361toq = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f50362x2 = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* JADX INFO: renamed from: y */
    private static final int f3456y = 48;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50363zy = 4;

    /* JADX INFO: renamed from: androidx.core.content.pm.i$k */
    /* JADX INFO: compiled from: ShortcutManagerCompat.java */
    class k extends BroadcastReceiver {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IntentSender f3457k;

        k(IntentSender intentSender) {
            this.f3457k = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f3457k.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.pm.i$toq */
    /* JADX INFO: compiled from: ShortcutManagerCompat.java */
    @hyr(25)
    private static class toq {
        private toq() {
        }

        /* JADX INFO: renamed from: k */
        static String m2211k(@lvui List<ShortcutInfo> list) {
            int rank = -1;
            String id = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.pm.i$zy */
    /* JADX INFO: compiled from: ShortcutManagerCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zy {
    }

    private C0490i() {
    }

    public static boolean cdj(@lvui Context context) {
        androidx.core.util.n7h.x2(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    @lvui
    public static List<kja0> f7l8(@lvui Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new kja0.C0492k(context, it.next()).zy());
        }
        return arrayList;
    }

    public static void fn3e(@lvui Context context, @lvui List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        kja0(context).mo2197q(list);
        Iterator<AbstractC0497y> it = n7h(context).iterator();
        while (it.hasNext()) {
            it.next().zy(list);
        }
    }

    public static void fu4(@lvui Context context, @lvui String str) {
        androidx.core.util.n7h.x2(context);
        androidx.core.util.n7h.x2(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<AbstractC0497y> it = n7h(context).iterator();
        while (it.hasNext()) {
            it.next().m2249n(Collections.singletonList(str));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2200g(@lvui Context context, @lvui List<kja0> list) {
        List<kja0> listNi7 = ni7(list, 1);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<kja0> it = listNi7.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f50382toq);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        kja0(context).mo2196k(listNi7);
        Iterator<AbstractC0497y> it2 = n7h(context).iterator();
        while (it2.hasNext()) {
            it2.next().toq(list);
        }
    }

    @lvui
    /* JADX INFO: renamed from: h */
    public static List<kja0> m2201h(@lvui Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return kja0.zy(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i2));
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i2 & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i2 & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i2 & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return kja0.zy(context, arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static void m2202i(@lvui Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        kja0(context).zy();
        Iterator<AbstractC0497y> it = n7h(context).iterator();
        while (it.hasNext()) {
            it.next().m2248k();
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2203k(@lvui Context context, @lvui List<kja0> list) {
        List<kja0> listNi7 = ni7(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            zy(context, listNi7);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<kja0> it = listNi7.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().gvn7());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
            return false;
        }
        kja0(context).mo2196k(listNi7);
        Iterator<AbstractC0497y> it2 = n7h(context).iterator();
        while (it2.hasNext()) {
            it2.next().toq(list);
        }
        return true;
    }

    public static boolean ki(@lvui Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    private static AbstractC0489h<?> kja0(Context context) {
        if (f3453p == null) {
            try {
                f3453p = (AbstractC0489h) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C0490i.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f3453p == null) {
                f3453p = new AbstractC0489h.k();
            }
        }
        return f3453p;
    }

    public static int ld6(@lvui Context context) {
        androidx.core.util.n7h.x2(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    public static boolean mcp(@lvui Context context, @lvui List<kja0> list) {
        List<kja0> listNi7 = ni7(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            zy(context, listNi7);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<kja0> it = listNi7.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().gvn7());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
            return false;
        }
        kja0(context).mo2196k(listNi7);
        Iterator<AbstractC0497y> it2 = n7h(context).iterator();
        while (it2.hasNext()) {
            it2.next().m2250q(list);
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static void m2204n(@lvui Context context, @lvui List<String> list, @dd CharSequence charSequence) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        kja0(context).mo2197q(list);
        Iterator<AbstractC0497y> it = n7h(context).iterator();
        while (it.hasNext()) {
            it.next().zy(list);
        }
    }

    private static List<AbstractC0497y> n7h(Context context) {
        Bundle bundle;
        String string;
        if (f50359ld6 == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(f50362x2);
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(f50360qrj)) != null) {
                    try {
                        arrayList.add((AbstractC0497y) Class.forName(string, false, C0490i.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f50359ld6 == null) {
                f50359ld6 = arrayList;
            }
        }
        return f50359ld6;
    }

    @lvui
    private static List<kja0> ni7(@lvui List<kja0> list, int i2) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 31) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (kja0 kja0Var : list) {
            if (kja0Var.a9(i2)) {
                arrayList.remove(kja0Var);
            }
        }
        return arrayList;
    }

    public static boolean o1t(@lvui Context context, @lvui List<kja0> list) {
        androidx.core.util.n7h.x2(context);
        androidx.core.util.n7h.x2(list);
        List<kja0> listNi7 = ni7(list, 1);
        ArrayList arrayList = new ArrayList(listNi7.size());
        Iterator<kja0> it = listNi7.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().gvn7());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        kja0(context).zy();
        kja0(context).mo2196k(listNi7);
        for (AbstractC0497y abstractC0497y : n7h(context)) {
            abstractC0497y.m2248k();
            abstractC0497y.toq(list);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static int m2205p(@lvui Context context) {
        androidx.core.util.n7h.x2(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static Intent m2206q(@lvui Context context, @lvui kja0 kja0Var) {
        Intent intentCreateShortcutResultIntent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(kja0Var.gvn7());
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        return kja0Var.m2216k(intentCreateShortcutResultIntent);
    }

    private static String qrj(@lvui List<kja0> list) {
        int iZurt = -1;
        String strLd6 = null;
        for (kja0 kja0Var : list) {
            if (kja0Var.zurt() > iZurt) {
                strLd6 = kja0Var.ld6();
                iZurt = kja0Var.zurt();
            }
        }
        return strLd6;
    }

    /* JADX INFO: renamed from: s */
    public static int m2207s(@lvui Context context) {
        androidx.core.util.n7h.x2(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    @yz
    /* JADX INFO: renamed from: t */
    static void m2208t(AbstractC0489h<Void> abstractC0489h) {
        f3453p = abstractC0489h;
    }

    public static boolean t8r(@lvui Context context, @lvui kja0 kja0Var) {
        androidx.core.util.n7h.x2(context);
        androidx.core.util.n7h.x2(kja0Var);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 31 && kja0Var.a9(1)) {
            Iterator<AbstractC0497y> it = n7h(context).iterator();
            while (it.hasNext()) {
                it.next().toq(Collections.singletonList(kja0Var));
            }
            return true;
        }
        int iLd6 = ld6(context);
        if (iLd6 == 0) {
            return false;
        }
        if (i2 <= 29) {
            toq(context, kja0Var);
        }
        if (i2 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(kja0Var.gvn7());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iLd6) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(toq.m2211k(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(kja0Var.gvn7()));
        }
        AbstractC0489h<?> abstractC0489hKja0 = kja0(context);
        try {
            List<kja0> qVar = abstractC0489hKja0.toq();
            if (qVar.size() >= iLd6) {
                abstractC0489hKja0.mo2197q(Arrays.asList(qrj(qVar)));
            }
            abstractC0489hKja0.mo2196k(Arrays.asList(kja0Var));
            Iterator<AbstractC0497y> it2 = n7h(context).iterator();
            while (it2.hasNext()) {
                it2.next().toq(Collections.singletonList(kja0Var));
            }
            fu4(context, kja0Var.ld6());
            return true;
        } catch (Exception unused) {
            Iterator<AbstractC0497y> it3 = n7h(context).iterator();
            while (it3.hasNext()) {
                it3.next().toq(Collections.singletonList(kja0Var));
            }
            fu4(context, kja0Var.ld6());
            return false;
        } catch (Throwable th) {
            Iterator<AbstractC0497y> it4 = n7h(context).iterator();
            while (it4.hasNext()) {
                it4.next().toq(Collections.singletonList(kja0Var));
            }
            fu4(context, kja0Var.ld6());
            throw th;
        }
    }

    @yz
    static boolean toq(@lvui Context context, @lvui kja0 kja0Var) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = kja0Var.f3466s;
        if (iconCompat == null) {
            return false;
        }
        int i2 = iconCompat.f3533k;
        if (i2 != 6 && i2 != 4) {
            return true;
        }
        InputStream inputStreamJk = iconCompat.jk(context);
        if (inputStreamJk == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamJk)) == null) {
            return false;
        }
        kja0Var.f3466s = i2 == 6 ? IconCompat.kja0(bitmapDecodeStream) : IconCompat.ki(bitmapDecodeStream);
        return true;
    }

    @yz
    static void wvg(List<AbstractC0497y> list) {
        f50359ld6 = list;
    }

    @yz
    static List<AbstractC0497y> x2() {
        return f50359ld6;
    }

    /* JADX INFO: renamed from: y */
    private static int m2209y(@lvui Context context, boolean z2) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C1873k.f10652g);
        int iMax = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (iMax * ((z2 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m2210z(@lvui Context context, @lvui kja0 kja0Var, @dd IntentSender intentSender) {
        if (Build.VERSION.SDK_INT > 31 || !kja0Var.a9(1)) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(kja0Var.gvn7(), intentSender);
        }
        return false;
    }

    public static void zurt(@lvui Context context, @lvui List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            fn3e(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        kja0(context).mo2197q(list);
        Iterator<AbstractC0497y> it = n7h(context).iterator();
        while (it.hasNext()) {
            it.next().zy(list);
        }
    }

    @yz
    static void zy(@lvui Context context, @lvui List<kja0> list) {
        for (kja0 kja0Var : new ArrayList(list)) {
            if (!toq(context, kja0Var)) {
                list.remove(kja0Var);
            }
        }
    }
}
