package com.android.thememanager.mine.remote.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import bf2.toq;
import com.android.thememanager.R;
import com.android.thememanager.mine.remote.view.fragment.C2186g;
import com.android.thememanager.mine.remote.view.fragment.f7l8;
import com.android.thememanager.mine.remote.view.fragment.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.mine.remote.widget.k */
/* JADX INFO: compiled from: PurchasedImmersionAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2197k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60473f7l8 = "favorite";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f60474ld6 = "my_purchased_page_manual_hide_";

    /* JADX INFO: renamed from: p */
    private static final String f12942p = "my_purchased_page_hide_free_";

    /* JADX INFO: renamed from: s */
    public static final String f12943s = "purchased";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f60475x2 = "my_purchased_page_hide_incompatible_";

    /* JADX INFO: renamed from: y */
    public static final String f12944y = "like";

    /* JADX INFO: renamed from: g */
    private String f12945g;

    /* JADX INFO: renamed from: k */
    private final SharedPreferences.Editor f12946k;

    /* JADX INFO: renamed from: n */
    private final String f12947n;

    /* JADX INFO: renamed from: q */
    protected zy f12948q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final SharedPreferences f60476toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<k> f60477zy;

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.widget.k$k */
    /* JADX INFO: compiled from: PurchasedImmersionAdapter.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        private final Pair<String, String> f12949k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f60478toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f60479zy;

        public k(String checkStr, String unCheckStr, String prefKey, boolean check) {
            this.f12949k = new Pair<>(checkStr, unCheckStr);
            this.f60478toq = prefKey;
            this.f60479zy = check;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public String m8294n() {
            return (String) (m8295g() ? this.f12949k.second : this.f12949k.first);
        }

        public void f7l8(boolean check) {
            this.f60479zy = check;
        }

        /* JADX INFO: renamed from: g */
        public boolean m8295g() {
            return this.f60479zy;
        }

        /* JADX INFO: renamed from: q */
        public String m8296q() {
            return this.f60478toq;
        }
    }

    public C2197k(zy fragment) {
        this.f12945g = "favorite";
        this.f12948q = fragment;
        if (fragment instanceof f7l8) {
            this.f12945g = f12943s;
        } else if (fragment instanceof C2186g) {
            this.f12945g = "like";
        } else {
            this.f12945g = "favorite";
        }
        Context qVar = toq.toq();
        this.f12947n = fragment.wt();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(qVar);
        this.f60476toq = defaultSharedPreferences;
        this.f12946k = defaultSharedPreferences.edit();
        this.f60477zy = m8289k();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8288g(Context context, String fragmenType, String resourceCode) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(f60474ld6 + fragmenType + "_" + resourceCode, false);
    }

    /* JADX INFO: renamed from: k */
    private List<k> m8289k() {
        String str = f12942p + this.f12945g + "_" + this.f12947n;
        String str2 = f60474ld6 + this.f12945g + "_" + this.f12947n;
        String str3 = f60475x2 + this.f12945g + "_" + this.f12947n;
        boolean z2 = this.f60476toq.getBoolean(str, false);
        boolean z3 = this.f60476toq.getBoolean(str2, false);
        boolean z5 = this.f60476toq.getBoolean(str3, false);
        String qVar = toq(false);
        String qVar2 = toq(true);
        String strM8290n = m8290n(false);
        String strM8290n2 = m8290n(true);
        String lowerCase = this.f12948q.g0ad().toLowerCase();
        String string = this.f12948q.getString(R.string.hide_incompatible, lowerCase);
        String string2 = this.f12948q.getString(R.string.show_incompatible, lowerCase);
        ArrayList arrayList = new ArrayList();
        if ("theme".equals(this.f12947n)) {
            arrayList.add(new k(string, string2, str3, z5));
        }
        if (this.f12945g.equals(f12943s)) {
            if (!"aod".equals(this.f12947n) && !"icons".equals(this.f12947n) && !"largeicons".equals(this.f12947n)) {
                arrayList.add(new k(qVar, qVar2, str, z2));
            }
            arrayList.add(new k(strM8290n, strM8290n2, str2, z3));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    private String m8290n(boolean isShow) {
        if ("theme".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_mamual_hide_theme : R.string.hide_mamual_hide_theme);
        }
        if ("fonts".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_mamual_hide_font : R.string.hide_mamual_hide_font);
        }
        if ("aod".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_mamual_hide_aod : R.string.hide_mamual_hide_aod);
        }
        if ("miwallpaper".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_mamual_hide_miwallpaper : R.string.hide_mamual_hide_miwallpaper);
        }
        if ("icons".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_mamual_hide_icons : R.string.hide_mamual_hide_icons);
        }
        if ("largeicons".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_mamual_hide_large_icons : R.string.hide_mamual_hide_large_icons);
        }
        return this.f12948q.getResources().getString(isShow ? R.string.show_mamual_hide_wallpaper : R.string.hide_mamual_hide_wallpaper);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m8291q(Context context, String fragmenType, String resourceCode) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(f60475x2 + fragmenType + "_" + resourceCode, false);
    }

    private String toq(boolean isShow) {
        if ("theme".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_free_theme : R.string.hide_free_theme);
        }
        if ("fonts".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_free_font : R.string.hide_free_font);
        }
        if ("aod".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_free_aod : R.string.hide_free_aod);
        }
        if ("miwallpaper".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_free_miwallpaper : R.string.hide_free_miwallpaper);
        }
        if ("icons".equals(this.f12947n)) {
            return this.f12948q.getResources().getString(isShow ? R.string.show_free_icons : R.string.hide_free_icons);
        }
        return this.f12948q.getResources().getString(isShow ? R.string.show_free_wallpaper : R.string.hide_free_wallpaper);
    }

    public static boolean zy(Context context, String fragmenType, String resourceCode) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(f12942p + fragmenType + "_" + resourceCode, false);
    }

    public boolean f7l8(@lvui MenuItem item) {
        k next;
        Iterator<k> it = this.f60477zy.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (item.getItemId() == next.hashCode()) {
                break;
            }
        }
        if (next == null) {
            return false;
        }
        boolean z2 = !next.m8295g();
        next.f7l8(z2);
        item.setTitle(next.m8294n());
        this.f12946k.putBoolean(next.m8296q(), z2);
        this.f12946k.apply();
        this.f12948q.qh4d();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void m8292y(@lvui Menu menu) {
        menu.clear();
        for (int i2 = 0; i2 < this.f60477zy.size(); i2++) {
            k kVar = this.f60477zy.get(i2);
            int iHashCode = kVar.hashCode();
            boolean z2 = kVar.f60479zy;
            Pair pair = kVar.f12949k;
            menu.add(R.id.miuix_action_end_menu_group, iHashCode, i2, (CharSequence) (!z2 ? pair.first : pair.second));
        }
    }
}
